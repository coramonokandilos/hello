package com.ponta027.pdf.sample.srs;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ponta027.pdf.sample.PdfParser;

public class SrsParser {

	public void doParse(String path) throws IOException {
		File file = new File(path);
		if (!isValidDirectory(file)) {
			throw new RuntimeException("パスが不正");
		}

		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				if (name.lastIndexOf("pdf") == (name.length() - "pdf".length())) {
					return true;
				}
				return false;
			}
		};
		File[] listFiles = file.listFiles(filter);
		for (File file2 : listFiles) {
			String absolutePath = file2.getAbsolutePath();
			PdfParser pdfParser = new PdfParser();
			String parseText = pdfParser.parseText(absolutePath);
			// 生成ロジックを分離
			ParseStrategy strategy = createParseStrategy(file2);

			List<Map<String, String>> parseText2 = parseText(parseText,
					strategy);

			ISrsResultFileWriter srsResultFileWriter = new SrsResultExcelWriter();

			srsResultFileWriter.outputFile(file2, parseText2);

		}
	}

	private ParseStrategy createParseStrategy(File file2) {
		ParseStrategy strategy = new ParseStrategy();
		if (file2.getName().contains("ECU_Configuration")) {
			strategy.setMatchingRule("([[\\d]+[\\.]+[\\d]+]+[\\s]+\\[ECUC\\d+\\])");
		} else {
			strategy.setMatchingRule("([[\\d]+[\\.]+[\\d]+]+[\\s]+\\[BSW\\d+\\])");
		}
		return strategy;
	}

	private List<Map<String, String>> parseText(String parseText,
			ParseStrategy strategy) {
		parseText = parseText.replaceAll("\n", "");
		List<String> parseSrsItems = parseSrsItems(parseText, strategy);
		List<Map<String, String>> data = new ArrayList<Map<String, String>>();
		for (String srsBody : parseSrsItems) {
			Map<String, String> constructSrsData = constructSrsData(srsBody);
			if (constructSrsData.size() == 0)
				continue;
			data.add(constructSrsData);
		}
		// System.out.println(data);
		return data;
	}

	private Map<String, String> constructSrsData(String srsBody) {
		String parseKeyWord[] = { "Initiator:", "Date:", "Short Description:",
				"Type:", "Importance:", "Description:", "Rationale:",
				"Use Case:", "Dependencies:", "Conflicts:",
				"Supporting Material:" };

		// String targetWord = srsBody;
		// TODO:macのエスケープを
		StringBuilder targetWord = new StringBuilder(srsBody);

		Map<String, String> map = new LinkedHashMap<String, String>();
		for (String keyWord : parseKeyWord) {
			int indexOf = targetWord.indexOf(keyWord);
			if (indexOf > 0) {
				String substring = targetWord.substring(0, indexOf);
				if (keyWord.equals("Initiator:")) {
					map.put("SRS", substring);
				} else {
					map.put(substring.substring(0, substring.indexOf(":")),
							substring.substring(substring.indexOf(":"),
									substring.length()));
				}
				targetWord.delete(0, indexOf);
			} else {
				if (keyWord.equals("Initiator:")) {
					break;
				}
				System.out.println(keyWord + " failed");
			}
		}
		if (map.size() > 1) {
			map.put(targetWord.substring(0, targetWord.indexOf(":")),
					targetWord.substring(targetWord.indexOf(":"),
							targetWord.length()));
		}
		return map;
	}

	/**
	 * SRS毎の文章をリストで取得
	 * 
	 * @param parseText
	 * @param strategy
	 * @return
	 */
	private List<String> parseSrsItems(String parseText, ParseStrategy strategy) {
		String matchingRule = strategy.getMatchingRule();
		Pattern pattern = Pattern.compile(matchingRule);
		Matcher matcher = pattern.matcher(parseText);
		List<String> itemList = new ArrayList<String>();
		int start = 0;
		while (matcher.find()) {
			itemList.add(parseText.substring(start, matcher.start(0)));
			start = matcher.start(0);
		}
		itemList.add(parseText.substring(start, parseText.length()));
		return itemList;
	}

	/**
	 * 
	 * @param file
	 * @return
	 */
	private boolean isValidDirectory(File file) {
		if (file.exists() && file.isDirectory()) {
			return true;
		} else {

			return false;
		}
	}
}

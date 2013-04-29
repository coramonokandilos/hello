package com.ponta027.pdf.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GlossaryBuilder {
	private List<String> splitText(String parseText) {

		List<String> partList = new ArrayList<String>();
		Pattern pattern = Pattern
				.compile("(3.[\\d]+\\s[a-zA-Z0-9\\(\\)\\s]+\nDefinition)");
		Matcher matcher = pattern.matcher(parseText);
		int beforeStart = 0;
		matcher.find();
		matcher.find();
		while (matcher.find()) {
			int groupCount = matcher.groupCount();
			for (int i = 0; i < groupCount; i++) {
				int start = matcher.start(0);
				String substring = parseText.substring(beforeStart, start);
				partList.add(substring);
				beforeStart = start;
			}
		}
		return partList;
	}

	private List<GlossaryData> convertGlossaryData(List<String> splitText) {
		List<GlossaryData> dataList = new ArrayList<GlossaryData>();
		for (String string : splitText) {
			GlossaryData data = parseGlossaryData(string);
			dataList.add(data);
		}
		return dataList;
	}

	private GlossaryData parseGlossaryData(String string) {
		GlossaryData data = new GlossaryData();
		int indexOf = string.indexOf(" ");
		int indexOf2 = string.indexOf("\n");
		data.setId(string.substring(0, indexOf));
		data.setName(string.substring(indexOf, indexOf2));
		data.setDescription(string.substring(indexOf2));
		return data;
	}

	public List<GlossaryData> build(String parseText) {
		List<String> splitText = splitText(parseText);
		List<GlossaryData> convertGlossaryData = convertGlossaryData(splitText);
		return convertGlossaryData;
	}

}

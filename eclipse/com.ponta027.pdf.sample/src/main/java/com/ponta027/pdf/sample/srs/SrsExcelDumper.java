package com.ponta027.pdf.sample.srs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class SrsExcelDumper {

	private Workbook wb;
	private final String OutputFilePath;

	public SrsExcelDumper(String filePath) {
		setup();
		OutputFilePath = filePath;
	}

	private void write() {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(OutputFilePath);
			wb.write(out);
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
	}

	private void setup() {
		wb = new HSSFWorkbook();
	}

	/**
	 * 
	 * @param parseText2
	 */
	public void writeExcel(List<Map<String, String>> parseText2) {
		Sheet sheet1 = wb.createSheet();
		int row = 0;
		for (Map<String, String> map : parseText2) {

			for (String key : map.keySet()) {
				Row createRow = sheet1.createRow(row);
				Cell keyCell = createRow.createCell(0);
				keyCell.setCellValue(key);

				String value = map.get(key);
				Cell cellValue = createRow.createCell(1);
				if (value.length() > 1000) {
					cellValue.setCellValue(value.substring(0, 1000));
				} else {
					cellValue.setCellValue(value);
				}
				row++;
			}
			row++;
		}

		write();
	}

}

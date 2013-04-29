package com.ponta027.pdf.sample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelDumper {

	private Workbook wb;
	private final String OutputFilePath;

	public ExcelDumper(String filePath) {
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

	public void writeExcel(String[] columnData, List<? extends Object> dataList) {
		//
		Sheet sheet1 = wb.createSheet();

		int row = 0;
		for (Object object : dataList) {
			Row createRow = sheet1.createRow(row);
			writeOneData(columnData, object, createRow);
			row++;
		}
		//
		write();
	}

	private void writeOneData(String[] columnData, Object object, Row createRow) {
		int column = 0;
		for (String methodName : columnData) {
			String executeMethod = executeMethod(methodName, object);
			Cell cell = createRow.createCell(column);
			writeData(cell, executeMethod);
			column++;
		}
	}

	private void writeData(Cell cell, String executeMethod) {
		cell.setCellValue(executeMethod);
	}

	public String executeMethod(String methodName, Object object) {
		return ReflectionUtil.getProperty(object, methodName);
	}
}

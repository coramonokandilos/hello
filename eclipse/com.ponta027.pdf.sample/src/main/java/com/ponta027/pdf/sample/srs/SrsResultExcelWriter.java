package com.ponta027.pdf.sample.srs;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class SrsResultExcelWriter implements ISrsResultFileWriter {

	public void outputFile(File file2, List<Map<String, String>> parseText2)
			throws IOException {

		String excelFilePath = FileUitl.replaceSuffix(file2.getAbsolutePath(),
				".xls");
		SrsExcelDumper srsExcelDumper = new SrsExcelDumper(excelFilePath);
		srsExcelDumper.writeExcel(parseText2);
		// ExcelDumper

	}
}

package com.ponta027.pdf.sample;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class PdfParserTest {

	@Test
	public void testParse() throws IOException {
		String readFile = "src/main/resources/AUTOSAR_TR_Glossary.pdf";
		String filePath = "sample.xls";
		String[] columnData = new String[] { "id", "name", "description" };
		PdfParser pdfParser = new PdfParser();
		String parseText = pdfParser.parseText(readFile);

		GlossaryBuilder glossaryBuilder = new GlossaryBuilder();
		List<GlossaryData> dataList = glossaryBuilder.build(parseText);
		dataList.remove(0);
		ExcelDumper excelDumper = new ExcelDumper(filePath);
		excelDumper.writeExcel(columnData, dataList);
	}

}

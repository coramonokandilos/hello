package com.ponta027.pdf.sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class PdfParser {

	public PDDocument getPdfDocument(String filePath) throws IOException {
		FileInputStream pdfStream = null;
		pdfStream = new FileInputStream(filePath);
		PDFParser pdfParser = null;
		pdfParser = new PDFParser(pdfStream);
		pdfParser.parse(); // ??????
		PDDocument pdf = pdfParser.getPDDocument();
		return pdf;
	}

	/**
	 * http://www.bouncycastle.org/latest_releases.html
	 * 
	 * @param filePath
	 * @throws IOException
	 */
	public String parseText(String filePath) throws IOException {
		PDDocument pdfDocument = getPdfDocument(filePath);
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		StringWriter writer = new StringWriter();
		pdfTextStripper.writeText(pdfDocument, writer);
		String string = writer.toString();
		writer.close();
		return string;
	}
}

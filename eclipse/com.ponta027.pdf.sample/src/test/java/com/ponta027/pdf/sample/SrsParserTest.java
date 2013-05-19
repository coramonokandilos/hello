package com.ponta027.pdf.sample;

import java.io.IOException;

import org.junit.Test;

import com.ponta027.pdf.sample.srs.SrsParser;

public class SrsParserTest {

	@Test
	public void testParse() throws IOException {
		SrsParser srsParser = new SrsParser();
		srsParser.doParse("src/main/resources/srs");
	}

}

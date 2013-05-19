package com.ponta027.pdf.sample.srs;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ISrsResultFileWriter {

	void outputFile(File file2, List<Map<String, String>> parseText2)
			throws IOException;

}
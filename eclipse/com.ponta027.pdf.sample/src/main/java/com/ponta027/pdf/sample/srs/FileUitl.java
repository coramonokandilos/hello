package com.ponta027.pdf.sample.srs;

public final class FileUitl {
	public static String replaceSuffix(String fileName, String suffix) {
		int lastIndexOf = fileName.lastIndexOf(".");
		if (lastIndexOf < 0) {
			return fileName + "." + suffix;
		}
		StringBuilder fileString = new StringBuilder();
		fileString.append(fileName, 0, lastIndexOf);
		fileString.append(suffix);
		return fileString.toString();
	}
}

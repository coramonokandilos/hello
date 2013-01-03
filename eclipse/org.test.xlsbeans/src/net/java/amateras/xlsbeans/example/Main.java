package net.java.amateras.xlsbeans.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import net.java.amateras.xlsbeans.XLSBeans;
import net.java.amateras.xlsbeans.XLSBeansException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException,
			XLSBeansException {
		Main main = new Main();
		SheetObject doXmlSample = main.doXmlSample();
		main.printTargetObject(doXmlSample);
	}

	public SheetObject doSample() throws FileNotFoundException,
			XLSBeansException {
		// streamからStocksクラスを作成
		// ここでアノテーションからJavaBeansのマッピングがされ、
		// インスタンスまで生成される
		SheetObject sheet = new XLSBeans().load(new FileInputStream(
				"xls/example.xls"), SheetObjectWithAnnotation.class);
		return sheet;
	}

	public void printTargetObject(SheetObject sheet) {
		System.out.println(sheet.getTitle());
		System.out.println(sheet.getLastupdate());
		System.out.println(sheet.getRecords());

	}

	/**
	 * XMLサンプル
	 * 
	 * @throws FileNotFoundException
	 * @throws XLSBeansException
	 */
	public SheetObject doXmlSample() throws FileNotFoundException,
			XLSBeansException {
		SheetObject sheet = new XLSBeans().load(new FileInputStream(
				"xls/example.xls"), new FileInputStream("xml/example.xml"),
				SheetObject.class);
		return sheet;
	}

	public static void printLine(Object object) {
		if (object instanceof String) {
			System.out.println(object);
		} else if (object instanceof List) {
			int i = 0;
			for (Object obj : (List) object) {
				System.out.println(String.format("Index:%d %s", i, obj));
				i++;
			}
		}
	}
}

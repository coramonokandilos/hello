package net.java.amateras.xlsbeans.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import net.java.amateras.xlsbeans.XLSBeans;
import net.java.amateras.xlsbeans.XLSBeansException;
import net.java.amateras.xlsbeans.example.annotation.CustomAnnotation;
import net.java.amateras.xlsbeans.example.fieldprocessor.CustomFieldProcess;
import net.java.amateras.xlsbeans.processor.FieldProcessor;
import net.java.amateras.xlsbeans.processor.FieldProcessorFactory;

/**
 * xlsbeans sample program
 * 
 * @author kazuhiro
 * 
 */
public class Main {
	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 * @throws XLSBeansException
	 */
	public static void main(String[] args) throws FileNotFoundException,
			XLSBeansException {
		Main main = new Main();

		// SheetObject doXmlSample = main.doSample();
		SheetObject doXmlSample = main.doXmlSample();
		main.printTargetObject(doXmlSample);
	}

	/**
	 * regist annotation & field processor<br/>
	 * 
	 * if you don't allocate xlsbeans.proeprties , you will use this method for
	 * registing annotation & field processor
	 * 
	 * allocation src folder <br/>
	 * -src/xlsbeans.proeprties
	 * 
	 */
	@SuppressWarnings("unused")
	private void registCustom() {
		FieldProcessor processor = new CustomFieldProcess();
		FieldProcessorFactory.registerProcessor(CustomAnnotation.class,
				processor);

	}

	/**
	 * create SheetObject from XLSBeans<br/>
	 * 
	 * <ul>
	 * <li>instantiate XLSBeans</li>
	 * <li>call load method</li>
	 * </ul>
	 * 
	 * @return SheetObject
	 * @throws FileNotFoundException
	 * @throws XLSBeansException
	 */
	public SheetObject doSample() throws FileNotFoundException,
			XLSBeansException {
		SheetObject sheet = new XLSBeans().load(new FileInputStream(
				"xls/example.xls"), SheetObjectWithAnnotation.class);
		return sheet;
	}

	public void printTargetObject(SheetObject sheet) {
		System.out.println(sheet.getTitle());
		System.out.println(sheet.getTitlePosition());
		System.out.println(sheet.getLastupdate());
		System.out.println(sheet.getLastupdatePosition());
		System.out.println(sheet.getRecords());

	}

	/**
	 * XMLƒTƒ“ƒvƒ‹
	 * 
	 * @throws FileNotFoundException
	 * @throws XLSBeansException
	 */
	public SheetObject doXmlSample() throws FileNotFoundException,
			XLSBeansException {

		InputStream xlsIn = new FileInputStream("xls/example.xls");
		InputStream xmlIn = new FileInputStream("xml/example.xml");
		Class<?>[] classes = { SheetObject.class };

		// loadMultiple method
		Object[] loadMultiple = (new XLSBeans()).loadMultiple(xlsIn, xmlIn,
				new Class[] { SheetObject.class });

		for (Object object : loadMultiple) {
			if (object instanceof SheetObject) {
				SheetObject sheet = (SheetObject) object;
				return sheet;
			}
		}
		// SheetObject sheet = new XLSBeans().load(new FileInputStream(
		// "xls/example.xls"), new FileInputStream("xml/example.xml"),
		// SheetObject.class);
		return null;
	}

	public static void printLine(Object object) {
		if (object instanceof String) {
			System.out.println(object);
		} else if (object instanceof List) {
			// for minimumize influence of supperss annotation , create getList
			// method
			List<? extends Object> objectList = getList(object);
			int i = 0;
			for (Object obj : objectList) {
				System.out.println(String.format("Index:%d %s", i, obj));
				i++;
			}
		}
	}

	/**
	 * @param object
	 * @return
	 */
	private static List<? extends Object> getList(Object object) {
		@SuppressWarnings("unchecked")
		List<? extends Object> objectList = (List<? extends Object>) object;
		return objectList;
	}
}

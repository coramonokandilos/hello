package net.java.amateras.xlsbeans.example.fieldprocessor;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import net.java.amateras.xlsbeans.NeedPostProcess;
import net.java.amateras.xlsbeans.processor.FieldProcessor;
import net.java.amateras.xlsbeans.xml.AnnotationReader;
import net.java.amateras.xlsbeans.xssfconverter.WSheet;

public class CustomFieldProcess implements FieldProcessor {

	@Override
	public void doProcess(WSheet wSheet, Object obj, Method setter,
			Annotation ann, AnnotationReader reader,
			List<NeedPostProcess> needPostProcess) throws Exception {

		System.out.println("=======CustomFieldProcess==========");
		System.out.println("SheetName:" + wSheet.getName());
		System.out.println("columns:" + wSheet.getColumns());
		System.out.println("rows:" + wSheet.getRows());
		System.out.println("column[0][0]:"
				+ wSheet.getColumn(0)[0].getContents());
		System.out.println("object:" + obj);
		System.out.println("setter:" + setter.getName());
		System.out.println("annotation:" + ann);
		System.out.println("reader:" + reader);
		System.out.println("needPostProcess:" + needPostProcess);
		System.out.println("=================");

	}

	@Override
	public void doProcess(WSheet wSheet, Object obj, Field field,
			Annotation ann, AnnotationReader reader,
			List<NeedPostProcess> needPostProcess) throws Exception {
		System.out.println("do Process FUGA");

	}

}

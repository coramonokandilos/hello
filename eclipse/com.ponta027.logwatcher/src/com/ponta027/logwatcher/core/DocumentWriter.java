package com.ponta027.logwatcher.core;

import org.eclipse.jface.viewers.ISelection;

/**
 * DocumentWriter�����N���X
 * 
 * @author kazuhiro
 * 
 */
public class DocumentWriter implements IDocumentWriter {


	@Override
	public void write(String line) {
		System.out.println("HOGE");
		if(line.equals("TEST_HOGEHGE")){
			
		}
	}

}

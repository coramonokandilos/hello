/*
* generated by Xtext
*/
package org.xtext.example.qdsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class QDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.example.qdsl.ui.internal.QDslActivator.getInstance().getInjector("org.xtext.example.qdsl.QDsl");
	}
	
}

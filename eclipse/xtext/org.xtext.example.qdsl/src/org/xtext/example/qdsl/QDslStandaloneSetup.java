
package org.xtext.example.qdsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class QDslStandaloneSetup extends QDslStandaloneSetupGenerated{

	public static void doSetup() {
		new QDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


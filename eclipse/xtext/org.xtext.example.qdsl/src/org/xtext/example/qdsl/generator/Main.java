/*
 * generated by Xtext
 */
package org.xtext.example.qdsl.generator;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class Main {

	public static void main(String[] args) {
		String arg = "model/sample.qdsl";
		// if (args.length == 0) {
		// System.err.println("Aborting: no path to EMF resource provided!");
		// return;
		// }
		Injector injector = new org.xtext.example.qdsl.QDslStandaloneSetupGenerated()
				.createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);
		main.runGenerator(arg);
		// main.runGenerator(args[0]);

	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private IGenerator generator;

	@Inject
	private JavaIoFileSystemAccess fileAccess;

	protected void runGenerator(String string) {
		// load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createURI(string), true);

		//xtextからemfのxmiに変換する方法
		String filePath="model/sample.xmi";
		Resource xmiResource = new XMIResourceFactoryImpl().createResource(URI.createURI(filePath));
		xmiResource.getContents().add(resource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		
		// validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL,
				CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.err.println(issue);
			}
			return;
		}

		// configure and start the generator
		fileAccess.setOutputPath("src-gen/");
		generator.doGenerate(resource, fileAccess);

		System.out.println("Code generation finished.");
	}
}

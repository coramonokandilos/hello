package org.xtext.example.qdsl.generator;

import static com.google.common.collect.Lists.newArrayList;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

public class XmiExporter implements IWorkflowComponent {

	private final List<String> slotNames = newArrayList();

	public void addSlot(String slot) {
		this.slotNames.add(slot);
	}

	@Override
	public void invoke(IWorkflowContext ctx) {
		for (String slot : slotNames) {
			System.out.println(slot);
			Object object = ctx.get(slot);
			if (object == null) {
				throw new IllegalStateException("Slot '" + slot
						+ "' was empty!");
			}
			if (object instanceof Iterable) {
				Iterable<?> iterable = (Iterable<?>) object;
				for (Object object2 : iterable) {
					if (!(object2 instanceof Resource)) {
						throw new IllegalStateException(
								"Slot contents was not a Resource but a '"
										+ object.getClass().getSimpleName()
										+ "'!");
					}
					//
					saveXmi((Resource) object2);

				}
			} else if (object instanceof Resource) {
				//
				saveXmi((Resource) object);
			} else {
				throw new IllegalStateException(
						"Slot contents was not a Resource but a '"
								+ object.getClass().getSimpleName() + "'!");
			}
		}
	}

	private void saveXmi(Resource resource) {
		String filePath = "model/sample.xmi";
		Resource xmiResource = new XMIResourceFactoryImpl().createResource(URI
				.createURI(filePath));
		xmiResource.getContents().add(resource.getContents().get(0));
		try {

			xmiResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void postInvoke() {
		// TODO Auto-generated method stub

	}

	@Override
	public void preInvoke() {
		// TODO Auto-generated method stub

	}

}

package org.xtext.example.qdsl.generator;

import static com.google.common.collect.Lists.newArrayList;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

/**
 * 
 * @author kazuhiro
 * 
 */
public class XmiExporter implements IWorkflowComponent {

	/** */
	private final List<String> slotNames = newArrayList();
	/** */
	private String xmiPath;

	/**
	 * 
	 * @param xmiPath
	 */
	public void setXmiPath(String xmiPath) {
		this.xmiPath = xmiPath;
	}

	/**
	 * 
	 * @param slot
	 */
	public void addSlot(String slot) {
		this.slotNames.add(slot);
	}

	/**
	 * 
	 * @param ctx
	 * @return
	 */
	private Resource getResourceFromSlot(IWorkflowContext ctx) {
		for (String slot : slotNames) {
			Object object = ctx.get(slot);
			if (object == null) {
				throw new IllegalArgumentException("");
			}
			if (object instanceof Iterable) {
				Iterable<?> objects = (Iterable<?>) object;
				for (Object object2 : objects) {
					if (object2 instanceof Resource) {
						return (Resource) object2;
					}
				}
			} else if (object instanceof Resource) {
				return (Resource) object;
			}
		}
		return null;
	}

	@Override
	public void invoke(IWorkflowContext ctx) {
		Resource resource = getResourceFromSlot(ctx);
		if (resource == null) {
			throw new IllegalArgumentException("");
		}
		saveXmi(resource);
	}

	/**
	 * 
	 * @param resource
	 */
	private void saveXmi(Resource resource) {
		System.out.println(resource);
		Resource xmiResource = new XMIResourceFactoryImpl().createResource(URI
				.createURI(xmiPath));
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

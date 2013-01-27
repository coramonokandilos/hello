package com.ponta027.rcp.sample.ui.actions;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;

public class DragSourceAdapterImpl implements DragSourceListener {
	private final TableViewer tableViewer;

	public DragSourceAdapterImpl(TableViewer tableViewer) {

		this.tableViewer = tableViewer;

	}

	@Override
	public void dragStart(DragSourceEvent event) {
		System.out.println(event.getSource().toString());

	}

	@Override
	public void dragSetData(DragSourceEvent event) {
		// TODO Auto-generated method stub
		Object source = event.getSource();
		System.out.println(source.toString());
		System.out.println(tableViewer.getSelection());
	}

	@Override
	public void dragFinished(DragSourceEvent event) {
		// TODO Auto-generated method stub
		System.out.println("HOGE");
	}

}

package com.ponta027.rcp.sample.ui.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class SampleDialogTable implements SampleContents, IDragData {

	List<SampleDialogData> fdataList = new ArrayList<SampleDialogData>();
	ITableLabelProvider flabelprovider = new SampleDialogLabelProvider();
	private TableViewer tableViewer;

	public SampleDialogTable(List<SampleDialogData> dataList2) {
		fdataList = dataList2;
	}

	@Override
	public void create(Composite composite) {
		Table table = new Table(composite, SWT.FULL_SELECTION | SWT.MULTI
				| SWT.BORDER);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		tableViewer = new TableViewer(table);

		// TableColumn tableColumn = new TableColumn(table, SWT.RIGHT);
		// tableColumn.setText("HOGE");
		TableColumn tableColumn = new TableColumn(table, SWT.RIGHT);
		tableColumn.setText("AAAAAAAA");
		tableColumn.setWidth(150);

		tableViewer.setLabelProvider(flabelprovider);
		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		tableViewer.setInput(fdataList);

		DragSourceListener listener = new DragSourceAdapterImpl(tableViewer);
		int operations = DND.DROP_TARGET_MOVE | DND.DROP_MOVE;
		Transfer[] transferTypes = new Transfer[] { TextTransfer.getInstance() };

		tableViewer.addDragSupport(operations, transferTypes, listener);

	}

	@Override
	public StructuredViewer getSelection() {
		// TODO Auto-generated method stub
		return tableViewer;
	}

}

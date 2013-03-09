package com.ponta027.rapmail.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.rap.rwt.widgets.FileUpload;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

/**
 * This view shows a &quot;mail message&quot;. This class is contributed through
 * the plugin.xml.
 */
public class View extends ViewPart {

	public static final String ID = "com.ponta027.rapmail.view";

	@Override
	public void createPartControl(Composite parent) {
		Composite top = new Composite(parent, SWT.BORDER);
		GridLayout layout = new GridLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		top.setLayout(layout);
		// top banner
		Composite banner = new Composite(top, SWT.BORDER);
		banner.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL,
				GridData.VERTICAL_ALIGN_BEGINNING, true, false));
		layout = new GridLayout();
		layout.marginHeight = 5;
		layout.marginWidth = 10;
		layout.numColumns = 2;
		banner.setLayout(layout);

		// setup bold font
		Font boldFont = JFaceResources.getFontRegistry().getBold(
				JFaceResources.DEFAULT_FONT);

		Label l = new Label(banner, SWT.WRAP);
		l.setText("Subject:");
		l.setFont(boldFont);
		l = new Label(banner, SWT.WRAP);
		l.setText("This is a message about the cool Eclipse RCP!");

		l = new Label(banner, SWT.WRAP);
		l.setText("From:");
		l.setFont(boldFont);

		final Link link = new Link(banner, SWT.NONE);
		link.setText("<a>nicole@mail.org</a>");
		link.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageDialog
						.openInformation(getSite().getShell(),
								"Not Implemented",
								"Imagine the address book or a new message being created now.");
			}
		});

		l = new Label(banner, SWT.WRAP);
		l.setText("Date:");
		l.setFont(boldFont);
		l = new Label(banner, SWT.WRAP);
		l.setText("10:34 am");
		// message contents
		Text text = new Text(top, SWT.MULTI | SWT.WRAP);
		text.setText("This RAP Application was generated from the PDE Plug-in Project wizard. This sample shows how to:\n"
				+ "- add a top-level menu and toolbar with actions\n"
				+ "- create views that can't be closed and\n"
				+ "  multiple instances of the same view\n"
				+ "- perspectives with placeholders for new views\n"
				+ "- use the default about dialog\n");
		text.setLayoutData(new GridData(GridData.FILL_BOTH));

		//
		Composite composite = new Composite(top, SWT.BORDER);
		composite.setLayout(new GridLayout());
		createComposite(composite);
	}

	private void createComposite(Composite parent) {
		createFileUpLoader(parent);
		createTable(parent);
	}

	private void createTable(Composite parent) {
		final TableViewer tv = new TableViewer(parent, SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		Table table = tv.getTable();
		table.setVisible(true);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		tv.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				ISelection selection = event.getSelection();
				if (selection instanceof IStructuredSelection) {
					List<String> list = ((IStructuredSelection) selection)
							.toList();
					System.out.println(list);

				}

			}
		});

		TableColumn column = new TableColumn(table, SWT.LEFT);
		column.setText("No.");
		column.setWidth(100);
		tv.setContentProvider(ArrayContentProvider.getInstance());
		tv.setInput(createDummyData());
		tv.setLabelProvider(new ITableLabelProvider() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void removeListener(ILabelProviderListener listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean isLabelProperty(Object element, String property) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub

			}

			@Override
			public void addListener(ILabelProviderListener listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public String getColumnText(Object element, int columnIndex) {
				System.out.println(element);
				return element.toString();
			}

			@Override
			public Image getColumnImage(Object element, int columnIndex) {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}

	private void createFileUpLoader(Composite parent) {
		final FileUpload fileup = new FileUpload(parent, SWT.NONE);
		fileup.setText("sample");

	}

	private List<String> createDummyData() {
		List<String> dataArray = new ArrayList<>();
		dataArray.add("a");
		dataArray.add("a");
		dataArray.add("a");
		dataArray.add("a");
		return dataArray;
	}

	@Override
	public void setFocus() {
	}
}

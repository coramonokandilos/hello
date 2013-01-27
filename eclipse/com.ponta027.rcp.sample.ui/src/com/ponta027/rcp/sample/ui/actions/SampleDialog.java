package com.ponta027.rcp.sample.ui.actions;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class SampleDialog extends TitleAreaDialog {

	private final SampleDialogView sampleDialogView = new SampleDialogView();

	public SampleDialog(Shell parentShell) {
		super(parentShell);

	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite parentComposite = (Composite) super.createDialogArea(parent);

		Composite contents = new Composite(parentComposite, SWT.NONE);
		contents.setLayout(new GridLayout());
		contents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		createLayout(contents);

		return contents;
	}

	protected void createLayout(Composite parent) {
		Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		createLeftComposite(composite);
		createRightComposite(composite);
	}

	private void createRightComposite(Composite composite) {
		Composite childComposite = new Composite(composite, SWT.NONE);

		childComposite.setLayout(new GridLayout());

		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.heightHint = 400;
		childComposite.setLayoutData(gridData);

		sampleDialogView.create(childComposite);

	}

	private void createLeftComposite(Composite composite) {
		Composite childComposite = new Composite(composite, SWT.BORDER);
		childComposite.setLayout(new GridLayout());
		childComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		SampleDialogTable sampleDialogTable = new SampleDialogTable(
				new SampleDialogCore().create());

		sampleDialogTable.create(childComposite);

		sampleDialogView.add(sampleDialogTable.getSelection());
	}
}

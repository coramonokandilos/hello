package com.ponta027.rapmail.action;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;

import com.ponta027.rapmail.ICommandIds;

public class SampleAction extends Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String text;
	private final IWorkbenchWindow window;

	public SampleAction(String text, IWorkbenchWindow window) {
		super(text);
		this.text = text;
		this.window = window;
		setId(ICommandIds.CMD_SAMPLE);
		setActionDefinitionId(ICommandIds.CMD_SAMPLE);

	}

	@Override
	public void run() {
		MessageDialog.openInformation(window.getShell(), "Open",
				"Open Message Dialog!");

		super.run();
	}

}

package com.ponta027.rapmail.action;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.ponta027.rapmail.ICommandIds;

/**
 * When run, this action will show a message dialog.
 */
public class MessagePopupAction extends Action {

	private final IWorkbenchWindow window;

	public MessagePopupAction(String text, IWorkbenchWindow window) {
		super(text);
		this.window = window;
		// The id is used to refer to the action in a menu or toolbar
		setId(ICommandIds.CMD_OPEN_MESSAGE);
		// Associate the action with a pre-defined command, to allow key
		// bindings.
		setActionDefinitionId(ICommandIds.CMD_OPEN_MESSAGE);
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
				"com.ponta027.rapmail", "/icons/sample3.gif"));
	}

	@Override
	public void run() {
		MessageDialog.openInformation(window.getShell(), "Open",
				"Open Message Dialog!");
	}
}

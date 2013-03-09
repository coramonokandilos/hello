package com.ponta027.rapmail;

/**
 * Interface defining the application's command IDs. Key bindings can be defined
 * for specific commands. To associate an action with a command, use
 * IAction.setActionDefinitionId(commandId).
 * 
 * @see org.eclipse.jface.action.IAction#setActionDefinitionId(String)
 */
public interface ICommandIds {

	public static final String CMD_OPEN = "com.ponta027.rapmail.open";
	public static final String CMD_OPEN_MESSAGE = "com.ponta027.rapmail.openMessage";
	public static final String CMD_SAMPLE = "com.ponta027.rapmail.samplecommand";

}

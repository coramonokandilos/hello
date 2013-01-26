package com.ponta027.logwatcher.action;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.ponta027.logwatcher.core.IErrorCheckStrategy;

public class ErrorCheckStrategy implements IErrorCheckStrategy {

	private Shell shell;

	public ErrorCheckStrategy(Shell shell) {
		this.shell = shell;
	}

	@Override
	public IStatus check(String line) {
		if(line.equals("HOGE")){
			
		}
		// TODO Auto-generated method stub
		return new Status(IStatus.ERROR, "02", "HOGE‚ªŠÜ‚Ü‚ê‚Ä‚¢‚Ü‚·");
	}

	@Override
	public void report(final IStatus status) {
		if(status.isMultiStatus()){
			if(shell==null){
				return;
			}
			
			shell.getDisplay().asyncExec(new Runnable() {
				
				@Override
				public void run() {
					ErrorDialog.openError(shell
							, "ERROR", "ERROR", status);
					
				}
			});

		}
		
	}

}

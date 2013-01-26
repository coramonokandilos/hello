package com.ponta027.logwatcher.action;

import java.io.File;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;

import com.ponta027.logwatcher.Activator;
import com.ponta027.logwatcher.core.DocumentWriter;
import com.ponta027.logwatcher.core.LogTailer;
import com.ponta027.logwatcher.preferences.PreferenceConstants;

public class LogWatchStart implements IWorkbenchWindowActionDelegate {
	LogTailer logtailer = new LogTailer(new DocumentWriter());
	Thread thread = new Thread(logtailer);
	private ISelection selection;

	/**
	 * 
	 * @return
	 */
	private String getWatchFilePath() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		return store.getDefaultString(PreferenceConstants.P_WATCH_FILE);

	}

	@Override
	public void run(IAction action) {

		Shell[] shells = PlatformUI.getWorkbench().getDisplay().getShells();
		System.out.println(selection);

		System.out.println(action);

		String tmp = getWatchFilePath();
		System.out.println(tmp);
		File file = new File(tmp);
		// File file = new File("/Users/kazuhiro/hoge.log");
		logtailer.setLogFile(file.getAbsolutePath());
		logtailer.setStrategy(new ErrorCheckStrategy(shells[0]));
		// TODO Auto-generated method stub
		if (action.isChecked()) {
			if (!thread.isAlive()) {
				thread.start();
			} else {
				logtailer.setStop(false);
			}
		} else {
			logtailer.setStop(true);
			// try {
			// thread.interrupt();
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
		}

		System.out.println(thread.isAlive());

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub

	}

}

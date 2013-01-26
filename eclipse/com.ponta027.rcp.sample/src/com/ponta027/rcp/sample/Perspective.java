package com.ponta027.rcp.sample;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	/**
	 * The ID of the perspective as specified in the extension.
	 */
	public static final String ID = Perspective.ID;

	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();

		IFolderLayout left = layout.createFolder(
				"left", IPageLayout.LEFT, 0.2f, editorArea); //$NON-NLS-1$
		left.addView(IPageLayout.ID_PROJECT_EXPLORER);
		// , IPageLayout.LEFT, 0.25f, editorArea);

		// left.addView(JavaUI.ID_PACKAGES);
		// layout.addView(IPageLayout.ID_PROP_SHEET,
		// IPageLayout.BOTTOM, 0.5f, "left");
		IFolderLayout bottom = layout.createFolder(
				"bottom", IPageLayout.BOTTOM, 0.75f, editorArea); //$NON-NLS-1$
		// bottom.addView(IPageLayout.ID_BOOKMARKS);

		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
		layout.getViewLayout(IPageLayout.ID_PROBLEM_VIEW).setCloseable(false);
		bottom.addView(IPageLayout.ID_PROP_SHEET);
		layout.getViewLayout(IPageLayout.ID_PROP_SHEET).setCloseable(false);
	}
}

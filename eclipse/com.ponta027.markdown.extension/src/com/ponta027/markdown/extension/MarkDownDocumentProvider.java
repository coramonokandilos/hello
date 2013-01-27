package com.ponta027.markdown.extension;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.FileDocumentProvider;

import winterwell.markdown.views.MarkdownPreview;

/**
 * MarkDownEditorのDocumentProvider<br>
 * 
 * ドキュメント保存時にMarkdownPreViewのupdateメソッドをじっこう 保存時に一旦Previewにフォーカスを当てる仕組み。
 * 
 * 
 * @author kazuhiro
 * 
 */
public class MarkDownDocumentProvider extends FileDocumentProvider {

	public MarkDownDocumentProvider() {
		// Do Nothing
	}

	@Override
	protected void doSaveDocument(IProgressMonitor monitor, Object element,
			IDocument document, boolean overwrite) throws CoreException {
		setForcusChange();
		super.doSaveDocument(monitor, element, document, overwrite);
	}

	/**
	 * フォーカスをビューに変更して、エディタに変更する。
	 */
	private void setForcusChange() {
		searchView();
		// searchEditor();

	}

	/**
	 * MarkDownPreviewを取得するメソッド
	 * 
	 * @return
	 */
	private MarkdownPreview getMarkDownView() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchPage workbenchPage = workbench.getActiveWorkbenchWindow()
				.getActivePage();

		IViewReference[] viewReferences = workbenchPage.getViewReferences();
		MarkdownPreview preview = null;
		for (IViewReference iViewReference : viewReferences) {
			if (iViewReference.getView(true) instanceof MarkdownPreview) {
				preview = ((MarkdownPreview) iViewReference.getView(true));
			}
		}
		return preview;
	}

	/**
	 * ビューにフォーカスを当てる。
	 */
	private void searchView() {
		MarkdownPreview markDownView = getMarkDownView();

		if (markDownView == null) {
			markDownView = getNewMarkdownView();
			searchEditor();
		}
		markDownView.update();
	}

	/**
	 * 
	 * @return
	 */
	private MarkdownPreview getNewMarkdownView() {
		String VIEW_ID = "winterwell.markdown.views.MarkdownPreview";
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchPage workbenchPage = workbench.getActiveWorkbenchWindow()
				.getActivePage();
		MarkdownPreview view = null;
		try {
			view = (MarkdownPreview) workbenchPage.showView(VIEW_ID);
		} catch (PartInitException e) {
		}
		return view;
	}

	/**
	 * エディタにフォーカスを当てる。
	 */
	private void searchEditor() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchPage workbenchPage = workbench.getActiveWorkbenchWindow()
				.getActivePage();
		workbenchPage.getActiveEditor().setFocus();
	}

}

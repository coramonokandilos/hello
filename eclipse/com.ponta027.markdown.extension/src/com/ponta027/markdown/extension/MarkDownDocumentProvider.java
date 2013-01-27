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
 * MarkDownEditor��DocumentProvider<br>
 * 
 * �h�L�������g�ۑ�����MarkdownPreView��update���\�b�h���������� �ۑ����Ɉ�UPreview�Ƀt�H�[�J�X�𓖂Ă�d�g�݁B
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
	 * �t�H�[�J�X���r���[�ɕύX���āA�G�f�B�^�ɕύX����B
	 */
	private void setForcusChange() {
		searchView();
		// searchEditor();

	}

	/**
	 * MarkDownPreview���擾���郁�\�b�h
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
	 * �r���[�Ƀt�H�[�J�X�𓖂Ă�B
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
	 * �G�f�B�^�Ƀt�H�[�J�X�𓖂Ă�B
	 */
	private void searchEditor() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchPage workbenchPage = workbench.getActiveWorkbenchWindow()
				.getActivePage();
		workbenchPage.getActiveEditor().setFocus();
	}

}

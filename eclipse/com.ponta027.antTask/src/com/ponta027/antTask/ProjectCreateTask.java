package com.ponta027.antTask;

import java.util.HashSet;
import java.util.Set;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;

/**
 * 
 * Javaプロジェクト作成タスク <br />
 * 
 * 
 * <ul>
 * <li>
 * <a href=
 * "http://www.masatom.in/pukiwiki/Eclipse/%A5%D7%A5%E9%A5%B0%A5%A4%A5%F3%B3%AB%C8%AF%A4%CETIPS%BD%B8/Java%A5%D7%A5%ED%A5%B8%A5%A7%A5%AF%A5%C8%A4%F2%C1%E0%BA%EE%A4%B9%A4%EB/"
 * >参考ページ</a></li>
 * <li><a
 * href="http://shinoblogbyshiva.blogspot.jp/2008/04/java.html">参考ページ2</a></li>
 * </ul>
 * 
 * @author kazuhiro
 * 
 */
public class ProjectCreateTask extends Task {

	// private final String JAVA_NATURE = "org.eclipse.jdt.core.javanature";
	private String projectName;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public void execute() throws BuildException {
		validateAttribute();
		log("execute MyTask:" + projectName);
		createJavaProject(projectName);
		log("create:" + projectName);
		super.execute();
	}

	/**
	 * Javaプロジェクトを作成するメソッド<br />
	 * 
	 * <ul>
	 * <li>プロジェクト作成</li>
	 * <li>Natureの設定</li>
	 * <li>Javaプロジェクトの設定</li>
	 * <li>srcフォルダの作成,Packageの作成</li>
	 * 
	 * </ul>
	 * 
	 * 
	 * @param projectName
	 */
	private void createJavaProject(String projectName) {
		try {
			IProject project = ProjectCreateUtil.createProject(projectName,
					JavaCore.NATURE_ID);

			IJavaProject javaProject = setJavaProjectProperty(project);

			// フォルダとパッケージ作成
			IResource resource = project.getFolder("src");
			IPackageFragmentRoot packageFragmentRoot = javaProject
					.getPackageFragmentRoot(resource);
			packageFragmentRoot.open(null);
			packageFragmentRoot.createPackageFragment("com.ponta027.sample",
					true, new NullProgressMonitor());

		} catch (CoreException e) {
			e.printStackTrace();
			throw new BuildException(e);
		}
		return;
	}

	private IJavaProject setJavaProjectProperty(IProject project)
			throws CoreException {

		//
		IJavaProject javaProject = JavaCore.create(project);

		// src,binフォルダの作成
		ProjectCreateUtil.createFolder(project);

		// create IClasspathEntry
		Set<IClasspathEntry> entries = createClassPathEntries(javaProject);
		//
		ProjectCreateUtil.setBuildPath(javaProject, project, entries);

		ProjectCreateUtil.setBinaryFolder(project, javaProject);

		IPackageFragment[] packageFragments = javaProject.getPackageFragments();
		for (IPackageFragment iPackageFragment : packageFragments) {
			System.out.println(iPackageFragment.getElementName());
		}

		return javaProject;
	}

	private Set<IClasspathEntry> createClassPathEntries(IJavaProject javaProject) {
		Set<IClasspathEntry> entries = new HashSet<IClasspathEntry>();
		entries.add(JavaRuntime.getDefaultJREContainerEntry());
		IPath path = javaProject.getPath().append("src");
		entries.add(JavaCore.newSourceEntry(path));
		return entries;
	}

	private void validateAttribute() {
		if (projectName == null) {
			throw new BuildException("projectName is null");
		}

	}
}

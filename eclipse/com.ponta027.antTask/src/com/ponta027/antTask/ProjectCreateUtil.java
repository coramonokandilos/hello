package com.ponta027.antTask;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;

public final class ProjectCreateUtil {
	public static IWorkspaceRoot getWorkspace() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		return root;
	}

	public static IProject createProject(String name, String... nature)
			throws CoreException {
		IProject project = getWorkspace().getProject(name);
		if (project.exists()) {

			try {
				project.delete(true, new NullProgressMonitor());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// throw new BuildException("既に作成されています。");
		}

		project.create(null);
		project.open(null);
		setProjectNature(project, nature);// JavaCore.NATURE_ID);
		return project;
	}

	/**
	 * 
	 * @param project
	 * @param nature
	 * @throws CoreException
	 */
	private static void setProjectNature(IProject project, String... nature)
			throws CoreException {
		IProjectDescription description = project.getDescription();
		description.setName(project.getName());
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + nature.length];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		System.arraycopy(nature, 0, newNatures, natures.length, nature.length);

		// newNatures[natures.length] = nature;
		description.setNatureIds(newNatures);
		project.setDescription(description, null);
	}

	/**
	 * src,binフォルダの作成
	 * 
	 * @param project
	 * @throws CoreException
	 */
	public static void createFolder(IProject project) throws CoreException {
		String srcFolderName = "src";
		createFolder(project, srcFolderName);
		String binFolderName = "bin";
		createFolder(project, binFolderName);
	}

	public static void createFolder(IProject project, String folder)
			throws CoreException {
		IFolder dir = project.getFolder(new Path(folder));
		if (!dir.exists()) {
			dir.create(false, true, null);
		}

	}

	/**
	 * BuildPath関連を設定する。
	 * 
	 * @param javaProject
	 * @param project
	 * @throws JavaModelException
	 */
	public static void setBuildPath(IJavaProject javaProject, IProject project,
			Set<IClasspathEntry> inputEntries) throws JavaModelException {
		// setLibrary Path
		Set<IClasspathEntry> entries = new HashSet<IClasspathEntry>();
		entries.addAll(Arrays.asList(javaProject.getRawClasspath()));
		// IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
		// LibraryLocation[] locations = JavaRuntime
		// .getLibraryLocations(vmInstall);
		// for (LibraryLocation element : locations) {
		// entries.add(JavaCore.newLibraryEntry(
		// element.getSystemLibraryPath(), null, null));
		// }

		IClasspathEntry tmp = null;
		for (IClasspathEntry iClasspathEntry : entries) {
			switch (iClasspathEntry.getEntryKind()) {
			case IClasspathEntry.CPE_SOURCE:
				tmp = iClasspathEntry;
				break;
			}
		}
		if (tmp != null)
			entries.remove(tmp);

		//

		// entries.add(JavaCore.newSourceEntry(path, excludePath));

		// kind = con ,path=xxx
		entries.addAll(inputEntries);
		// entries.add(JavaRuntime.getDefaultJREContainerEntry());
		javaProject.setRawClasspath(
				entries.toArray(new IClasspathEntry[entries.size()]), null);

		//
	}

	public static void setBinaryFolder(IProject project,
			IJavaProject javaProject) throws JavaModelException {
		IFolder binDir = project.getFolder("bin");
		IPath binPath = binDir.getFullPath();
		javaProject.setOutputLocation(binPath, null);

	}

}

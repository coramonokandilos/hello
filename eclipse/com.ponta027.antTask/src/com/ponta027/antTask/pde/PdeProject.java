package com.ponta027.antTask.pde;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.natures.PDE;

import com.ponta027.antTask.ProjectCreateUtil;

public class PdeProject extends Task {

	private String projectName;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	// public void test() {
	// final IProject fMainPage = ProjectCreateUtil.getWorkspace().getProject(
	// projectName);
	// IFieldData fPluginData = new PluginFieldData();
	// IProjectProvider fProjectProvider = new IProjectProvider() {
	// @Override
	// public String getProjectName() {
	// return fMainPage.getName();
	// }
	//
	// @Override
	// public IProject getProject() {
	// return fMainPage;
	// }
	//
	// @Override
	// public IPath getLocationPath() {
	// return fMainPage.getLocation();
	// }
	// };
	//
	// IPluginContentWizard contentWizard = null;
	// NewProjectCreationOperation newProjectCreationOperation = new
	// NewProjectCreationOperation(
	// fPluginData, fProjectProvider, contentWizard);
	// IRunnableWithProgress iRunnableWithProgress = new IRunnableWithProgress()
	// {
	//
	// @Override
	// public void run(IProgressMonitor monitor)
	// throws InvocationTargetException, InterruptedException {
	// // TODO Auto-generated method stub
	//
	// }
	// };
	//
	// }

	@Override
	public void execute() throws BuildException {
		createProject(projectName);
	}

	public void createProject(String name) {

		try {
			IProject project = ProjectCreateUtil.createProject(name,
					PDE.PLUGIN_NATURE, JavaCore.NATURE_ID);

			IJavaProject javaProject = JavaCore.create(project);

			// src,binÉtÉHÉãÉ_ÇÃçÏê¨
			ProjectCreateUtil.createFolder(project);

			// create IClasspathEntry
			Set<IClasspathEntry> entries = createClassPathEntries(javaProject);
			//
			ProjectCreateUtil.setBuildPath(javaProject, project, entries);

			ProjectCreateUtil.setBinaryFolder(project, javaProject);

			//
			ProjectCreateUtil.createFolder(project, "META-INF");
			String outputFile = outputFile();
			IFile file = project.getFile("META-INF/MANIFEST.MF");
			InputStream source = new ByteArrayInputStream(outputFile.getBytes());
			file.create(source, true, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String outputFile() {
		String filename = "template/Manifest.vm";
		StringWriter sw = null;

		try {
			Velocity.setProperty("file.resource.loader.path",
					getBaseDirectory());
			Velocity.init();
			VelocityContext context = new VelocityContext();
			context.put("bundleName", "a1");
			context.put("bundleSymbolicName", "a1");

			File file = new File(filename);
			System.out.println(file.getAbsoluteFile());
			System.out.println(file.exists());
			Template template = Velocity.getTemplate(filename, "SJIS");
			sw = new StringWriter();
			template.merge(context, sw);
			System.out.println(sw.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sw.toString();
	}

	private String getBaseDirectory() {
		return ProjectCreateUtil.getWorkspace()
				.getProject("com.ponta027.antTask").getLocation().toFile()
				.getAbsolutePath()
				+ "/";

	}

	private Set<IClasspathEntry> createClassPathEntries(IJavaProject javaProject) {
		Set<IClasspathEntry> entries = new HashSet<IClasspathEntry>();
		entries.add(JavaRuntime.getDefaultJREContainerEntry());
		IPath path = javaProject.getPath().append("src");
		entries.add(JavaCore.newSourceEntry(path));

		entries.add(JavaCore
				.newContainerEntry(PDECore.REQUIRED_PLUGINS_CONTAINER_PATH));
		return entries;
	}

}

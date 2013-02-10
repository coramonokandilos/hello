/*
 * generated by Xtext
 */
package org.xtext.example.qdsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.example.qdsl.qDsl.Model
import com.google.inject.Inject
import org.xtext.example.qdsl.qDsl.Question

class QDslGenerator implements IGenerator {

	@Inject extension ModelGenerator m
	@Inject extension ControlGenerator c
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		//TODO implement me
		
		val sourcePath="org/xtext/example/gae/questionnaire/"
		
		
		for(content :resource.contents){		
			if(content instanceof Model){
				var m = content as Model
				fsa.generateFile(sourcePath+"Answer.java",m.genAnswer)				
				for(Question q: m.questions){
					if(q.answerTypes.atype=='radio_button'||q.answerTypes.atype=='check_box'){
						fsa.generateFile(sourcePath+q.name.toFirstUpper+"Kind.java",q.genEnumeration)
						
						
					}
				}
				//
				fsa.generateFile(sourcePath+m.name.toFirstUpper+"Servlet.java", m.genControl)
				//
				fsa.generateFile("../war/"+m.name.toFirstLower+".html",m.genHtml) // generate View:resultJsp
//
				
//       fsa.generateFile("../war/result.jsp", m.genJsp)
//// generate other:webXml
//       fsa.generateFile("../war/WEB-INF/web.xml", s.genWebxml(m))
//// generate other:staticFiles
//       fsa.generateFile(sourcePath+"PMF.java", s.genPFM)
//       fsa.generateFile("../war/WEB-INF/appengine-web.xml",s.genAppEngineWebxml)
//       fsa.generateFile("../war/WEB-INF/logging.properties",s.genLogginProperties)
//       fsa.generateFile("../war/style.css", s.genStyleCss)
//       fsa.generateFile("META-INF/jdoconfig.xml", s.genJdoConfig)
//       fsa.generateFile("log4j.properties", s.genLog4j)
								
			}			
		}
	}
}

package org.xtext.example.qdsl.generator

import org.xtext.example.qdsl.qDsl.Model
import com.google.inject.Inject

class ControlGenerator {
	
	@Inject extension GeneratorExtensions gext
	def genControl(Model m)'''
package org.xtext.example.gae.questionnaire; 

import java.io.IOException;
import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class «m.name.toFirstUpper()+"Servlet"» extends HttpServlet {
        public void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws IOException {
«FOR e:m.questions»
		«IF e.answerTypes.atype=="check_box"»
			String[] «e.name.toFirstLower+"s"» = req.getParameterValues("«e.name»");
		«ENDIF»
«ENDFOR»        	
        }
}
	'''
	
	
	def genHtml(Model m) '''
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"	
"DTD/xhtml1-transitional.dtd">
<html>
        <head>
                <meta http-equiv="content-type" content="text/html;
charset=utf-8"/>
                <link rel="stylesheet" type="text/css" href="style.css" />
                <title>«m.name»</title>
        </head>
        <body>
                <div class='body'>
                <form action='/post'>
«var cnt=0»
«FOR Q : m.questions»
«cnt=cnt+1»
«IF Q.answerTypes.atype=='free_text'»
￼￼￼<div class='question'>
<p>Q[«cnt»]. «Q.name» - «Q.contens.qcontent» </p>
￼￼￼￼￼￼￼￼￼￼￼￼                       <textarea name='«Q.name»' ></textarea>
«ELSE»
«var first=true»
«FOR QCF: Q.chooseFroms.choise» <p><label><input name='«Q.name»'
value='«QCF.getEnumValueName»' type='«IF (Q.answerTypes.atype=="radio_button")»radio«ELSEIF (Q.answerTypes.atype=="check_box")»checkbox«ELSE»textarea«ENDIF»'«IF Q.answerTypes.atype=='radio_button'&&first» checked«ENDIF»/>«QCF»</label></p>
«first=false» 
«ENDFOR»
«ENDIF»
«ENDFOR»
</div>
<br/>
        <input type='submit'/>
</form>
￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼                </div>
        </body>
</html>	
	'''
}
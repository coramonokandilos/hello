package org.xtext.example.qdsl.generator

import com.google.inject.Inject
import org.xtext.example.qdsl.qDsl.Model
import org.xtext.example.qdsl.qDsl.Question
import org.xtext.example.qdsl.generator.GeneratorExtensions

class ModelGenerator {
	@Inject extension GeneratorExtensions gext
	def genProperties(Question q)'''
	«q.type» «q.name.toFirstLower»;
	
	'''
	
//	@Inject extension GeneratorExtensions gext
	def genAnswer(Model m) '''
package org.xtext.example.gae.questionnaire;
import java.util.HashSet;
import java.util.Set;

public class Answer{
	private Long id;
	«FOR q:m.questions»
		«genProperties(q)»
	«ENDFOR»
	/**
	*/
	public Answer(){
		
	}	
	//
	
}

	'''	
	
	def genEnumeration(Question q)'''
package org.xtext.example.gae.questionnaire;
public enum «q.name.toFirstUpper+"Kind"» {
	«FOR s:q.chooseFroms.choise»«s.enumValueName»,«ENDFOR»
}	
	'''
}
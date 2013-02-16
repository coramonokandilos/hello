/*
* generated by Xtext
*/
package org.xtext.example.qdsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.qdsl.services.QDslGrammarAccess;

public class QDslParser extends AbstractContentAssistParser {
	
	@Inject
	private QDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.qdsl.ui.contentassist.antlr.internal.InternalQDslParser createParser() {
		org.xtext.example.qdsl.ui.contentassist.antlr.internal.InternalQDslParser result = new org.xtext.example.qdsl.ui.contentassist.antlr.internal.InternalQDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAnswerTypeAccess().getAtypeAlternatives_1_0(), "rule__AnswerType__AtypeAlternatives_1_0");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getQuestionAccess().getGroup(), "rule__Question__Group__0");
					put(grammarAccess.getQuestionContentAccess().getGroup(), "rule__QuestionContent__Group__0");
					put(grammarAccess.getAnswerTypeAccess().getGroup(), "rule__AnswerType__Group__0");
					put(grammarAccess.getChooseFromAccess().getGroup(), "rule__ChooseFrom__Group__0");
					put(grammarAccess.getGreetingAccess().getGroup(), "rule__Greeting__Group__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getQuestionsAssignment_3(), "rule__Model__QuestionsAssignment_3");
					put(grammarAccess.getQuestionAccess().getNameAssignment_1(), "rule__Question__NameAssignment_1");
					put(grammarAccess.getQuestionAccess().getContensAssignment_3(), "rule__Question__ContensAssignment_3");
					put(grammarAccess.getQuestionAccess().getAnswerTypesAssignment_4(), "rule__Question__AnswerTypesAssignment_4");
					put(grammarAccess.getQuestionAccess().getChooseFromsAssignment_5(), "rule__Question__ChooseFromsAssignment_5");
					put(grammarAccess.getQuestionContentAccess().getQcontentAssignment_1(), "rule__QuestionContent__QcontentAssignment_1");
					put(grammarAccess.getAnswerTypeAccess().getAtypeAssignment_1(), "rule__AnswerType__AtypeAssignment_1");
					put(grammarAccess.getChooseFromAccess().getChoiseAssignment_2(), "rule__ChooseFrom__ChoiseAssignment_2");
					put(grammarAccess.getGreetingAccess().getNameAssignment_1(), "rule__Greeting__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.qdsl.ui.contentassist.antlr.internal.InternalQDslParser typedParser = (org.xtext.example.qdsl.ui.contentassist.antlr.internal.InternalQDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public QDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(QDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

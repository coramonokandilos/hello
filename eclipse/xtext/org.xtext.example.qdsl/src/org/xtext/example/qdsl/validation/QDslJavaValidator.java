package org.xtext.example.qdsl.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.qdsl.qDsl.QDslPackage;
import org.xtext.example.qdsl.qDsl.Question;

public class QDslJavaValidator extends AbstractQDslJavaValidator {

	@Check
	public void checkAnswerTypeCorrespondence(Question question) {
		if (question.getAnswerTypes().getAtype().contains("check_box")) {
			if (!question.eContents().contains(question.getChooseFroms())) {
				error("AnswerType Check requires ChooseFrom Options",
						QDslPackage.Literals.QUESTION__ANSWER_TYPES);
			}
		}
	}
	// @Check
	// public void checkGreetingStartsWithCapital(Greeting greeting) {
	// if (!Character.isUpperCase(greeting.getName().charAt(0))) {
	// warning("Name should start with a capital",
	// MyDslPackage.Literals.GREETING__NAME);
	// }
	// }

}

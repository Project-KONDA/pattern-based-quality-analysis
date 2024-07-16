package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;

import qualitypatternmodel.evaluationquality.EvalContains;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.XmlPatternUtility;

public class XmlEvalContains {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getContainsAbstract());

		XmlPatternUtility.getQueries(completePatterns);
//		Test00.test(completePatterns);
	}

	public static CompletePattern getContainsAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalContains.getContainsGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
}

package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.evaluation.EvalContains;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalContains {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getContainsAbstract());

		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);
	}
	
	public static CompletePattern getContainsAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalContains.getContainsGeneric();
		completePattern.createXmlAdaption();
		return completePattern;		
	}
}

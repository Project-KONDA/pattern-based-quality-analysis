package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.evaluation.EvalExDup;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class RdfEvalExDup {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getExactDuplicatesRdfAbstract());
		completePatterns.add(getExactDuplicatesRdfWiki());
		RdfTest00.test(completePatterns);
	}
	
	public static CompletePattern getExactDuplicatesRdfAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalExDup.getExDupGeneric();	
		completePattern.createRdfAdaption();
		System.out.println(completePattern.myToString());
		return completePattern;		
	}
	
	public static CompletePattern getExactDuplicatesRdfWiki() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getExactDuplicatesRdfAbstract();
		
		return completePattern;
	}
}

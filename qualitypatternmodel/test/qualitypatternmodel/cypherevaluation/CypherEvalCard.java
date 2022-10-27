package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.evaluation.EvalCard;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class CypherEvalCard {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getNeo4JCardAbstract());
		completePatterns.add(getCardPlaseOfIssuePlace());
		completePatterns.add(getCardPlaseOfIssueIndexPlace());
		
		RdfTest00.test(completePatterns);
	}

	public static CompletePattern getNeo4JCardAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalCard.getCard2Generic();	
		completePattern.createRdfAdaption();
		return completePattern;		
	}

	public static CompletePattern getCardPlaseOfIssuePlace() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getNeo4JCardAbstract();		
//		List<Parameter> params = completePattern.getParameterList().getParameters();
				
		return completePattern;
	}	
	
	private static CompletePattern getCardPlaseOfIssueIndexPlace() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getNeo4JCardAbstract();		
//		List<Parameter> params = completePattern.getParameterList().getParameters();
				
		return completePattern;
	}
}

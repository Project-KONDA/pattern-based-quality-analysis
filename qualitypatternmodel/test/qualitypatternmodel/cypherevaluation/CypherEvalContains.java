package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.evaluation.EvalContains;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class CypherEvalContains {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getContainNeo4JAbstract());
		completePatterns.add(getContainMissspelling());
		completePatterns.add(getContainTag());
		
		try {
			CypherQueryPrinter.queryPrinterSys(completePatterns);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static CompletePattern getContainNeo4JAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalContains.getContainsGeneric();	
		completePattern.createRdfAdaption();
		return completePattern;		
	}

	public static CompletePattern getContainMissspelling() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getContainNeo4JAbstract();		
//		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		
		return completePattern;
	}
	
	private static CompletePattern getContainTag() {
		// TODO Auto-generated method stub
		return null;
	}
}

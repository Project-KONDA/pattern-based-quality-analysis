package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;

import qualitypatternmodel.evaluation.EvalExNEx;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

//has to be checked if necessary since it is to similar to the MANDSTRUC
public class CypherEvalExNEx {
	// also called MANDSTRUC2
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getExNexNeo4JAbstract());
		completePatterns.add(getRegestaWithOutPlace());
		
		try {
			CypherQueryPrinter.queryPrinterSys(completePatterns);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static CompletePattern getExNexNeo4JAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalExNEx.getExNExGeneric();
		completePattern.createNeo4jAdaption();
		//Maybe add the BEGINNING for the Condition
		return completePattern;		
	}
	
	static CompletePattern getRegestaWithOutPlace() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getExNexNeo4JAbstract();
//		EList<Parameter> params = completePattern.getParameterList().getParameters();
		
		return completePattern;
	}	
}

package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.evaluation.EvalAppDup;

public class Neo4JEvalAppDup {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getAppDup2Abstract());
		completePatterns.add(getAppDup2Concrete());
		completePatterns.add(getAppDup3Abstract());
		completePatterns.add(getAppDup3Concrete());
		Neo4JQueryPrinter.queryPrinterSys(completePatterns);
	}

	public static CompletePattern getAppDup2Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalAppDup.getAppDup2Generic();	
		completePattern.createNeo4jAdaption();
		//Set the beginning in the QuantifiedCond
		return completePattern;		
	}
	
	public static CompletePattern getAppDup2Concrete() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAppDup2Abstract();
		
		List<Parameter> params = completePattern.getParameterList().getParameters();

		//Insert the concrete version
		
		return completePattern;
	}
	
	public static CompletePattern getAppDup3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalAppDup.getAppDup3Generic();
		completePattern.createNeo4jAdaption();
		//Set the beginning in the QuantifiedCond
		return completePattern;
	}
	
	public static CompletePattern getAppDup3Concrete() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAppDup3Abstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		//Insert the concrete version
		
		return completePattern;
	}
}

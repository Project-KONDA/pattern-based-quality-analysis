package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.impl.IriParamImpl;
import qualitypatternmodel.evaluation.EvalExNEx;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

//has to be checked if necessary since it is to similar to the MANDSTRUC
public class Neo4JEvalExNEx {
	// also called MANDSTRUC2
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getExNexNeo4JAbstract());
		completePatterns.add(getRegestaWithOutPlace());
		Neo4JQueryPrinter.queryPrinterSys(completePatterns);
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

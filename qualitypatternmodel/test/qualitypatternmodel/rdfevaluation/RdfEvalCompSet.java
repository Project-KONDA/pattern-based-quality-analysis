package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.evaluationquality.EvalCompSet;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class RdfEvalCompSet {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompSetConcrete());

//		RdfTest00.test(completePatterns);
		RdfTest00.getQueries(completePatterns);
	}

	public static CompletePattern getCompSetAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalCompSet.getCompSetGeneric();
		completePattern.createRdfAdaption();
		return completePattern;
	}

	public static CompletePattern getCompSetConcrete() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCompSetAbstract();

		List<Parameter> params = completePattern.getParameterList().getParameters();
		System.out.println(params);
		return completePattern;
	}
}

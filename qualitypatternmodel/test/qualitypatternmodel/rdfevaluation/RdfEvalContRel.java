package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.evaluationquality.EvalContrel;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class RdfEvalContRel {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getContRelConcrete());

//		RdfTest00.test(completePatterns);
		RdfTest00.getQueries(completePatterns);
	}

	public static CompletePattern getContRelAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalContrel.getContrelGeneric();
		completePattern.createRdfAdaption();
		return completePattern;
	}

	public static CompletePattern getContRelConcrete() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getContRelAbstract();

		List<Parameter> params = completePattern.getParameterList().getParameters();
		System.out.println(params);
		return completePattern;
	}
}

package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.evaluationquality.EvalUnique;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class RdfEvalUnique {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getUniqueConcrete());

//		RdfTest00.test(completePatterns);
		RdfTest00.getQueries(completePatterns);
	}

	public static CompletePattern getUniqueAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalUnique.getUniqueGeneric();
		completePattern.createRdfAdaption();
		return completePattern;
	}

	public static CompletePattern getUniqueConcrete() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getUniqueAbstract();

		List<Parameter> params = completePattern.getParameterList().getParameters();
		System.out.println(params);
		return completePattern;
	}
}

package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.evaluationquality.EvalMandAtt;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class RdfEvalMandAtt {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandAttConcrete());
		completePatterns.add(getMandAtt3Concrete());

//		RdfTest00.test(completePatterns);
		RdfTest00.getQueries(completePatterns);
	}

	public static CompletePattern getMandAttAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandAtt.getMandattGeneric();
		completePattern.createRdfAdaption();
		return completePattern;
	}

	public static CompletePattern getMandAttConcrete() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMandAttAbstract();

		List<Parameter> params = completePattern.getParameterList().getParameters();
		System.out.println(params);
		return completePattern;
	}

	public static CompletePattern getMandAtt3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandAtt.getMandatt3Generic();
		completePattern.createRdfAdaption();
		return completePattern;
	}

	public static CompletePattern getMandAtt3Concrete() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMandAttAbstract();

		List<Parameter> params = completePattern.getParameterList().getParameters();
		System.out.println(params);
		return completePattern;
	}
}

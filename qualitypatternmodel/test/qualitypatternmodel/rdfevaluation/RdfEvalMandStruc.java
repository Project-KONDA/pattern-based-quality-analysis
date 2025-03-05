package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.evaluationquality.EvalMandStruc;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class RdfEvalMandStruc {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandStrucConcrete());
		completePatterns.add(getMandStruc3Concrete());

//		RdfTest00.test(completePatterns);
		RdfTest00.getQueries(completePatterns);
	}

	public static CompletePattern getMandStrucAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandStruc.getMandstrucGeneric();
		completePattern.createRdfAdaption();
		return completePattern;
	}

	public static CompletePattern getMandStrucConcrete() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMandStrucAbstract();

		List<Parameter> params = completePattern.getParameterList().getParameters();
		System.out.println(params);
		return completePattern;
	}

	public static CompletePattern getMandStruc3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandStruc.getMandstruc3Generic();
		completePattern.createRdfAdaption();
		return completePattern;
	}

	public static CompletePattern getMandStruc3Concrete() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMandStrucAbstract();

		List<Parameter> params = completePattern.getParameterList().getParameters();
		System.out.println(params);
		return completePattern;
	}
}

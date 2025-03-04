package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionrdf.IriListParam;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.impl.IriParamImpl;
import qualitypatternmodel.adaptionrdf.impl.RdfPathPartImpl;
import qualitypatternmodel.evaluationquality.EvalExNEx;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class RdfEvalExNEx {
	// also called MANDSTRUC2

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getExNexAbstract());
		completePatterns.add(getExNexFather());
		completePatterns.add(getExNexGender());

//		RdfTest00.test(completePatterns);
		RdfTest00.getQueries(completePatterns);
	}

	private static CompletePattern getExNexAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalExNEx.getExNExGeneric();
		completePattern.createRdfAdaption();
		return completePattern;
	}

	static CompletePattern getExNexFather() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getExNexAbstract();
		EList<Parameter> params = completePattern.getParameterList().getParameters();

		IriListParam p0 = ((IriListParam) params.get(0));
		RdfPathParam p1 = ((RdfPathParam) params.get(1));
//		IriListParam p2 = ((IriListParam) params.get(2));

		p0.getIriParams().add(new IriParamImpl("wd:Q5"));
		p1.getRdfPathParts().add(new RdfPathPartImpl("wdt:P22"));

		return completePattern;
	}

	static CompletePattern getExNexGender() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getExNexAbstract();
		EList<Parameter> params = completePattern.getParameterList().getParameters();

		IriListParam p0 = ((IriListParam) params.get(0));
		RdfPathParam p1 = ((RdfPathParam) params.get(1));
//		IriListParam p2 = ((IriListParam) params.get(2));

		p0.getIriParams().add(new IriParamImpl("wd:Q5"));
		p1.getRdfPathParts().add(new RdfPathPartImpl("wdt:P21"));
		return completePattern;
	}

}

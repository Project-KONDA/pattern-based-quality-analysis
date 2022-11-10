package qualitypatternmodel.rdfevaluation;

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

public class RdfEvalExNEx {
	// also called MANDSTRUC2
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getExNexAbstract());
		completePatterns.add(getExNexFather());
//		completePatterns.add(getExNexGender());
		RdfTest00.test(completePatterns);
	}

	private static CompletePattern getExNexAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalExNEx.getExNExGeneric();
		completePattern.createRdfAdaption();
		return completePattern;		
	}
	
	static CompletePattern getExNexFather() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getExNexAbstract();
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		RdfPathParam p3 = ((RdfPathParam) params.get(3));
		RdfPathParam p4 = ((RdfPathParam) params.get(4));
		
		p0.replace(new IriParamImpl("wd:Q5")); 
		
		((RdfSinglePredicate) p3.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P31"));
		((RdfSinglePredicate) p4.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P22"));
		
		return completePattern;
	}
	
	static CompletePattern getExNexGender() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getExNexFather();
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		RdfPathParam p4 = ((RdfPathParam) params.get(4));
		((RdfSinglePredicate) p4.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P21"));
		return completePattern;
	}
	
}

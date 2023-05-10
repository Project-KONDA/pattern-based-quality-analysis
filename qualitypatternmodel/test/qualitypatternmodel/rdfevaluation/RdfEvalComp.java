package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.impl.IriParamImpl;
import qualitypatternmodel.adaptionrdf.impl.RdfPathParamImpl;
import qualitypatternmodel.evaluationquality.EvalComp;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class RdfEvalComp {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompRdfAbstract());
		completePatterns.add(getCompWiki());
		
//		RdfTest00.test(completePatterns);
		RdfTest00.getQueries(completePatterns);
	}
	
	public static CompletePattern getCompRdfAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalComp.getCompGeneric();	
		completePattern.createRdfAdaption();
		return completePattern;		
	}
	
	public static CompletePattern getCompWiki() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCompRdfAbstract();
		
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		
		ComparisonOptionParamImpl p0 = ((ComparisonOptionParamImpl) params.get(0));
		TypeOptionParamImpl p1 = ((TypeOptionParamImpl) params.get(1));
//		IriListParamImpl p2 = ((IriListParamImpl) params.get(2));
		RdfPathParamImpl p3 = ((RdfPathParamImpl) params.get(3));
		RdfPathParamImpl p4 = ((RdfPathParamImpl) params.get(4));
		
		p0.setValue(ComparisonOperator.GREATER);
		p1.setValue(ReturnType.DATE);

		((RdfSinglePredicate) p3.getRdfPathParts().get(0).getRdfPath()).setIriParam(new IriParamImpl("wdt:P569"));
		
		((RdfSinglePredicate) p4.getRdfPathParts().get(0).getRdfPath()).setIriParam(new IriParamImpl("wdt:P570"));
		
		return completePattern;
	}
}

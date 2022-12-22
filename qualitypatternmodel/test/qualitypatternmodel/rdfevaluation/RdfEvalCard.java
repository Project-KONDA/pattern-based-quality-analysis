package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.impl.IriParamImpl;
import qualitypatternmodel.evaluation.EvalCard;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class RdfEvalCard {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getCardRdfAbstract());
		completePatterns.add(getCardWikiFather());
		completePatterns.add(getCardWikiMother());
		
//		RdfTest00.test(completePatterns);
		RdfTest00.getQueries(completePatterns);
	}
	
	public static CompletePattern getCardRdfAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalCard.getCardGeneric();	
		completePattern.createRdfAdaption();
		return completePattern;		
	}

	public static CompletePattern getCardWikiFather() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCardRdfAbstract();
				
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
		NumberParam p1 = ((NumberParam) params.get(1));
//		IriListParam p2 = ((IriListParam) params.get(2));
		RdfPathParam p3 = ((RdfPathParam) params.get(3));
//		IriListParam p4 = ((IriListParam) params.get(4));
				
		p0.setValue(ComparisonOperator.GREATER);
		p1.setValue(1.);

		((RdfSinglePredicate) p3.getRdfPathParts().get(0).getRdfPath()).setIriParam(new IriParamImpl("wdt:P22"));
		
		return completePattern;
	}
	
	public static CompletePattern getCardWikiMother() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCardRdfAbstract();
				
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
		NumberParam p1 = ((NumberParam) params.get(1));
//		IriListParam p2 = ((IriListParam) params.get(2));
		RdfPathParam p3 = ((RdfPathParam) params.get(3));
//		IriListParam p4 = ((IriListParam) params.get(4));
		
		
		p0.setValue(ComparisonOperator.GREATER);
		p1.setValue(1.);

		((RdfSinglePredicate) p3.getRdfPathParts().get(0).getRdfPath()).setIriParam(new IriParamImpl("wdt:P25"));
		
		return completePattern;
	}
}

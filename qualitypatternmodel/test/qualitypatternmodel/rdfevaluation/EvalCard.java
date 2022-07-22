package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.impl.IriParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class EvalCard {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCardRdfAbstract());
		completePatterns.add(getCardWikiFather());
		completePatterns.add(getCardWikiMother());
		RdfTest00.test(completePatterns);
		
	}
	
	public static CompletePattern getCardGeneric() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		
		// Context graph of pattern:
		Node element0 = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		element0.setName("Element0");
//		element0.addOutgoing().getTarget().addPrimitiveComparison();
		
		// First-order logic condition of pattern:
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		completePattern.setCondition(countCondition);
		
		// Graph of quantified condition:
		countCondition.createCountPattern();
		Node element0Copy = countCondition.getCountPattern().getGraph().getReturnNodes().get(0);
		
		Node element1 = element0Copy.addOutgoing().getTarget().makePrimitive();
		element1.setName("Element1");
		
		NumberElementImpl ne = new NumberElementImpl();
		countCondition.setArgument2(ne);
		ne.createParameters();
		
		return completePattern;	
	}
	
	public static CompletePattern getCardRdfAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCardGeneric();	
		completePattern.createRdfAdaption();
		return completePattern;		
	}

	public static CompletePattern getCardWikiFather() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCardRdfAbstract();
				
		List<Parameter> params = completePattern.getParameterList().getParameters();
				
		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
		NumberParam p1 = ((NumberParam) params.get(1));
		RdfPathParam p2 = ((RdfPathParam) params.get(2));
		
		p0.setValue(ComparisonOperator.GREATER);
		p1.setValue(1.);

		((RdfSinglePredicate) p2.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P22"));
		
		return completePattern;
	}
	
	public static CompletePattern getCardWikiMother() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCardWikiFather();

		((RdfSinglePredicate)((RdfPathParam) completePattern.getParameterList().getParameters().get(2)).getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P25"));
		
		return completePattern;
	}
}

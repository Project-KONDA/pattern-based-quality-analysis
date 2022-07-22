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
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class EvalMatch {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMatchRdfAbstract());
		completePatterns.add(getMatchWiki());
		RdfTest00.test(completePatterns);
		
	}
	
	public static CompletePattern getMatchGeneric() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		
		// Context graph of pattern:
		Node element0 = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		element0.setName("Element0");
//		element0.addOutgoing().getTarget().addPrimitiveComparison();
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		Node element0Copy = quantifiedCondition.getGraph().getReturnNodes().get(0);
		
		Node element1 = element0Copy.addOutgoing().getTarget().makePrimitive();
		element1.setName("Element1");
		element1.addPrimitiveMatch();
		
		
		return completePattern;	
	}
	
	public static CompletePattern getMatchRdfAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMatchGeneric();	
		completePattern.createRdfAdaption();
		return completePattern;		
	}

	public static CompletePattern getMatchWiki() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMatchRdfAbstract();
				
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		BooleanParam p0 = ((BooleanParam) params.get(0));
		TextLiteralParam p1 = ((TextLiteralParam) params.get(1));
		RdfPathParam p2 = ((RdfPathParam) params.get(2));
		
		p0.setValue(false);
		p1.setValue("\"^(<http:\\\\/\\\\/www\\\\.wikidata\\\\.org\\\\/entity\\\\/Q[0-9]+> )?Point\\\\((-)?[0-9]+(\\\\.[0-9]+)? (-)?[0-9]+(\\\\.[0-9]+)?\\\\)$\"");
//		p1.setValue("\\?");
		((RdfSinglePredicate) p2.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P625"));
		
		return completePattern;
	}
	
}

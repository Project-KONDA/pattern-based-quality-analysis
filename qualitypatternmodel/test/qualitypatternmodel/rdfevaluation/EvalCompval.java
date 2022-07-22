package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.graphstructure.Node;
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
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class EvalCompval {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompvalRdfAbstract());
		completePatterns.add(getCompvalWiki());
		RdfTest00.test(completePatterns);
		
	}
	
	public static CompletePattern getCompvalGeneric() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setName("comparison_generic");
		completePattern.setAbstractName("comparison_generic");
		completePattern.setDescription("Allows detecting illegal values, i.e. allows detecting elements with a specific property which are related to other elements with two specific properties");
		
		// Context graph of pattern:
		Node element0 = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		element0.setName("Element0");
//		element0.addOutgoing().getTarget().addPrimitiveComparison();
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		// Graph of quantified condition:		
		Node element0Copy = quantifiedCondition.getGraph().getReturnNodes().get(0);
		
		Node element1 = element0Copy.addOutgoing().getTarget().makePrimitive();
		element1.setName("Element1");
		element1.setGraph(quantifiedCondition.getGraph());
		
		element1.addPrimitiveComparison();
//		element1.addOutgoing().getTarget().addPrimitiveComparison();
				
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATER);
		comp2.getOption().getOptions().add(ComparisonOperator.LESS);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATEROREQUAL);
		comp2.getOption().getOptions().add(ComparisonOperator.LESSOREQUAL);
		
		return completePattern;	
	}
	
	public static CompletePattern getCompvalRdfAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCompvalGeneric();	
		completePattern.createRdfAdaption();
		return completePattern;		
	}
	
	public static CompletePattern getCompvalWiki() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCompvalRdfAbstract();
				
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		RdfPathParam p3 = ((RdfPathParam) params.get(3));

		DateParam dateValue = ParametersFactory.eINSTANCE.createDateParam();
		dateValue.setValue("2022-12-31");
		p0.replace(dateValue);
		p1.setValue(ComparisonOperator.GREATER);
		
		IriParam p4iri = new IriParamImpl();
		p4iri.setPrefix("wdt");
		p4iri.setSuffix("P569");
		((RdfSinglePredicate) p3.getRdfPathPart()).setIriParam(p4iri);
								
		return completePattern;
	}
}

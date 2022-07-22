package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
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
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class EvalComp {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompRdfAbstract());
		completePatterns.add(getCompWiki());
		RdfTest00.test(completePatterns);
		
	}
	
	public static CompletePattern getCompGeneric() throws InvalidityException {
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

		Node element2 = element0Copy.addOutgoing().getTarget().makePrimitive();
		element2.setName("Element2");
		element2.setGraph(quantifiedCondition.getGraph());
		
		element1.addComparison(element2);
//		element1.addOutgoing().getTarget().addPrimitiveComparison();
				
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATER);
		comp2.getOption().getOptions().add(ComparisonOperator.LESS);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATEROREQUAL);
		comp2.getOption().getOptions().add(ComparisonOperator.LESSOREQUAL);
		
		return completePattern;	
	}
	
	public static CompletePattern getCompRdfAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCompGeneric();	
		completePattern.createRdfAdaption();
		return completePattern;		
	}
	
	public static CompletePattern getCompWiki() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCompRdfAbstract();
				
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		int i=0;
		for (Parameter p: completePattern.getParameterList().getParameters()){
			System.out.println(p.getClass().getSimpleName() + " p" + i + " = ((" + p.getClass().getSimpleName() + ") params.get(" + i + "));");
			i++;
		}
		
		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		RdfPathParam p2 = ((RdfPathParam) params.get(2));
		RdfPathParam p3 = ((RdfPathParam) params.get(3));

//		DateParam dateValue = ParametersFactory.eINSTANCE.createDateParam();
//		dateValue.setValue("2022-12-31");
//		p0.replace(dateValue);
		p0.setValue(ComparisonOperator.GREATER);
		p1.setValue(ReturnType.DATE);

		IriParam p2iri = new IriParamImpl();
		p2iri.setPrefix("wdt");
		p2iri.setSuffix("P569");
		((RdfSinglePredicate) p2.getRdfPathPart()).setIriParam(p2iri);
		
		IriParam p3iri = new IriParamImpl();
		p3iri.setPrefix("wdt");
		p3iri.setSuffix("P570");
		((RdfSinglePredicate) p3.getRdfPathPart()).setIriParam(p3iri);
		
		return completePattern;
	}
}

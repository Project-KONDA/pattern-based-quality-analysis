package qualitypatternmodel.evaluation;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class EvalComp {
	
	public static CompletePattern getCompGeneric() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setName("comparison_generic");
		completePattern.setAbstractName("comparison_generic");
		completePattern.setDescription("Allows detecting illegal values, i.e. allows detecting elements with a specific property which are related to other elements with two specific properties");
		
		// Context graph of pattern:
		Node element0 = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		element0.setName("Element0");
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		// Graph of quantified condition:		
		Node element0Copy = quantifiedCondition.getGraph().getReturnNodes().get(0);
		
		Node element1 = element0Copy.addOutgoing().getTarget().makePrimitive();
		element1.setGraph(quantifiedCondition.getGraph());

		Node element2 = element0Copy.addOutgoing().getTarget().makePrimitive();
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
	
	public static CompletePattern getCompGenericCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;

		CompletePattern completePattern = Test00.getBasePattern();
		
		Graph g1 = completePattern.getGraph();

		Node g1n1 = g1.getReturnNodes().get(0).makeComplex();
		Node g1n2 = g1n1.addOutgoing().getTarget().makePrimitive();
		g1n2.addPrimitiveComparison();
		
		QuantifiedCondition q1 = patternStructureFactory.createQuantifiedCondition();
		completePattern.setCondition(q1);	
		Graph g2 = q1.getGraph();
		Node g2n1 = g2.getReturnNodes().get(0);
		Node g2n3 = g2n1.addOutgoing().getTarget().makeComplex();
		Node g2n4 = g2n3.addOutgoing().getTarget().makePrimitive();
		g2n4.addPrimitiveComparison();

		QuantifiedCondition q2 = patternStructureFactory.createQuantifiedCondition();
		q1.setCondition(q2);	
		Graph g3 = q2.getGraph();
		Node g3n1 = g3.getReturnNodes().get(0);
		Node g3n5 = g3n1.addOutgoing().getTarget().makeComplex();
		Node g3n3 = g3.getNodes().get(2);
		Node g3n4 = g3n3.addOutgoing().getTarget().makePrimitive();
		Node g3n6 = g3n5.addOutgoing().getTarget().makePrimitive();
		Node g3n7 = g3n5.addOutgoing().getTarget().makePrimitive();
		g3n6.addPrimitiveComparison();
		Comparison c = g3n7.addComparison(g3n4);
		c.getTypeOption().setValue(ReturnType.STRING);
		
		return completePattern;
	}
}

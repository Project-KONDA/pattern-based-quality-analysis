package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalUnique {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getUniqueCondGeneric());
		completePatterns.add(getUniqueCondComplexGeneric());
		
		for (CompletePattern cp: completePatterns)
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
	}

	public static CompletePattern getUniqueCondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();	
		
		QuantifiedCondition quantifiedCondition = factory.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		CountCondition countCondition = factory.createCountCondition();
		quantifiedCondition.setCondition(countCondition);
		CountPattern countPattern = factory.createCountPattern();
		countCondition.setCountPattern(countPattern);

		NumberElement numberElement = factory.createNumberElement();
		countCondition.setArgument2(numberElement);
		
		NumberParam numberParam = numberElement.getNumberParam();
		
		numberParam.setValue(1.0);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);	
		
		QuantifiedCondition quantifiedCondition2 = factory.createQuantifiedCondition();
		countPattern.setCondition(quantifiedCondition2);
		
		Graph g0 = completePattern.getGraph();
		Graph g1 = quantifiedCondition.getGraph();
		Graph g2 = countPattern.getGraph();
		Graph g3 = quantifiedCondition2.getGraph();
		
		Node g0return = g0.getReturnNodes().get(0).makeComplex();
		g0return.addOutgoing().getTarget().addPrimitiveComparison();
		
		Node g1return = g1.getReturnNodes().get(0);
		Node g1e1 = g1return.addOutgoing().getTarget().makeComplex();
		g1e1.addOutgoing().getTarget().addPrimitiveComparison();
		
		g2.getReturnNodes().get(0).setReturnNode(false);
		
		Node g2return = graphFactory.createComplexNode();
		g2return.setGraph(g2);
		g2return.setReturnNode(true);
		g2return.addOutgoing().getTarget().addPrimitiveComparison();
		Node g2e1 = g1e1.getOutgoingMappings().get(0).getTarget();
		
		Node g3return = g3.getReturnNodes().get(0);
		Node g3e2 = g3return.addOutgoing().getTarget().makeComplex();
		g3e2.addOutgoing().getTarget().addPrimitiveComparison();
		Node g3e1 = g2e1.getOutgoingMappings().get(0).getTarget();
		
		PrimitiveNode g3e1p = g3e1.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode g3e2p = g3e2.addOutgoing().getTarget().makePrimitive();
		Comparison c = g3e1p.addComparison(g3e2p);
		c.getTypeOption().setValue(ReturnType.STRING);
		
		return completePattern;
	}
	
	public static CompletePattern getUniqueCondComplexGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();	
		
		QuantifiedCondition quantifiedCondition = factory.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		CountCondition countCondition = factory.createCountCondition();
		quantifiedCondition.setCondition(countCondition);
		CountPattern countPattern = factory.createCountPattern();
		countCondition.setCountPattern(countPattern);

		NumberElement numberElement = factory.createNumberElement();
		countCondition.setArgument2(numberElement);
		
		NumberParam numberParam = numberElement.getNumberParam();
		
		numberParam.setValue(1.0);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);	
		
		QuantifiedCondition quantifiedCondition2 = factory.createQuantifiedCondition();
		countPattern.setCondition(quantifiedCondition2);
		
		Graph g0 = completePattern.getGraph();
		Graph g1 = quantifiedCondition.getGraph();
		Graph g2 = countPattern.getGraph();
		Graph g3 = quantifiedCondition2.getGraph();
		
		Node g0return = g0.getReturnNodes().get(0).makeComplex();
		g0return.addOutgoing().getTarget().addPrimitiveComparison();
		
		Node g1return = g1.getReturnNodes().get(0);
		Node g1e1 = g1return.addOutgoing().getTarget().makeComplex();
		g1e1.addOutgoing().getTarget().addPrimitiveComparison();
		
		g2.getReturnNodes().get(0).setReturnNode(false);
		
		Node g2return = graphFactory.createComplexNode();
		g2return.setGraph(g2);
		g2return.setReturnNode(true);
		g2return.addOutgoing().getTarget().addPrimitiveComparison();
		Node g2e1 = g1e1.getOutgoingMappings().get(0).getTarget();
		
		Node g3return = g3.getReturnNodes().get(0);
		Node g3e2 = g3return.addOutgoing().getTarget().makeComplex();
		g3e2.addOutgoing().getTarget().addPrimitiveComparison();
		Node g3e1 = g2e1.getOutgoingMappings().get(0).getTarget();
		
		PrimitiveNode g3e1p = g3e1.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode g3e2p = g3e2.addOutgoing().getTarget().makePrimitive();
		Comparison c = g3e1p.addComparison(g3e2p);
		c.getTypeOption().setValue(ReturnType.STRING);
		
		return completePattern;
	}
	
	//Added this new to the GENERIC ones
	public static CompletePattern getUniqueCondExistsGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		QuantifiedCondition quantifiedCondition = factory.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		quantifiedCondition.getGraph().addComplexNode();
		quantifiedCondition.setQuantifier(Quantifier.EXISTS);
		
		PrimitiveNode primitiveNode1 = quantifiedCondition.getGraph().addPrimitiveNode();
		ComplexNode complexNode1 = (ComplexNode) quantifiedCondition.getGraph().getNodes().get(0).makeComplex();
		quantifiedCondition.getGraph().addRelation(complexNode1, primitiveNode1);
		
		PrimitiveNode primitiveNode2 = quantifiedCondition.getGraph().addPrimitiveNode();
		ComplexNode complexNode2 = (ComplexNode) quantifiedCondition.getGraph().getNodes().get(0);
		quantifiedCondition.getGraph().addRelation(complexNode2, primitiveNode2);
		
		ComparisonOptionParam comparisonOptionParam1 = new ComparisonOptionParamImpl();
		comparisonOptionParam1.setValue(ComparisonOperator.NOTEQUAL);
		Comparison comparison1 = complexNode1.addComparison(complexNode2);
		comparison1.setOption(comparisonOptionParam1);
		
		Comparison comparison2 = primitiveNode1.addComparison(primitiveNode2);
		
		return completePattern;
	}
}
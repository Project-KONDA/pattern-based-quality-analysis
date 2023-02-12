package qualitypatternmodel.evaluationtranslation;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class EvalParamterOperators {
	//For the first example - Generic Load Duplicated Tree
	public static CompletePattern genericNotValidEntries() throws InvalidityException {
		GraphstructurePackage.eINSTANCE.eClass();
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		ComplexNode complexNode = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		completePattern.getGraph().getReturnNodes().get(0).setName("InitNode");
		
		complexNode = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		PrimitiveNode primitiveNode1 = completePattern.getGraph().addPrimitiveNode();
		primitiveNode1.addPrimitiveComparison();
		completePattern.getGraph().addRelation(complexNode, primitiveNode1);
		PrimitiveNode primitiveNode2 = completePattern.getGraph().addPrimitiveNode();
		primitiveNode2.addPrimitiveNullCheck();
		completePattern.getGraph().addRelation(complexNode, primitiveNode2);
		PrimitiveNode primitiveNode3 = completePattern.getGraph().addPrimitiveNode();
		primitiveNode3.addPrimitiveMatch();
		completePattern.getGraph().addRelation(complexNode, primitiveNode3);
		
		PrimitiveNode primitiveNode4 = completePattern.getGraph().addPrimitiveNode();
		primitiveNode4.addPrimitiveContains();
		completePattern.getGraph().addRelation(complexNode, primitiveNode4);
		
		return completePattern;
	}
		
	//For the first example - Neo4J-Abstrakt DuplicatedNeighbour
	public static CompletePattern abstractNotValidEntries() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return (CompletePattern) genericNotValidEntries().createNeo4jAdaption();
	}
	
	public static CompletePattern genericAppDup() throws InvalidityException {
		GraphstructurePackage.eINSTANCE.eClass();
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		ComplexNode complexNode = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		completePattern.getGraph().getReturnNodes().get(0).setName("InitNode");
		
		complexNode = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		PrimitiveNode primitiveNode1 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode, primitiveNode1);
		PrimitiveNode primitiveNode2 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode, primitiveNode2);
		
		ComplexNode complexNode2 = (ComplexNode) completePattern.getGraph().addComplexNode();
		PrimitiveNode primitiveNode3 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode2, primitiveNode3);
		PrimitiveNode primitiveNode4 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode2, primitiveNode4);
		
		Comparison comp = complexNode.addComparison(complexNode2);
		
		primitiveNode1.addComparison(primitiveNode3);
		primitiveNode2.addComparison(primitiveNode4);
		
		return completePattern;
	}
	
	public static CompletePattern abstractAppDup() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return (CompletePattern) genericAppDup().createNeo4jAdaption();
	}
}

package qualitypatternmodel.evaluationtranslation;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

//Missing Count Beispiel
public class EvalConditions {
	//For the first example - Generic DuplicatedNeighbour
	public static CompletePattern genericDuplicatedNeighbour() throws InvalidityException {
		GraphstructurePackage.eINSTANCE.eClass();
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		completePattern.getGraph().getReturnNodes().get(0).setName("InitNode");
		
		NotCondition not = factory.createNotCondition();
		completePattern.setCondition(not);
		
		Formula formula = factory.createFormula();
		not.setCondition(formula);
					
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		formula.setCondition1(qc1);
		ComplexNode innerComplexNode = qc1.getGraph().addComplexNode();
		qc1.getGraph().addRelation((ComplexNode) qc1.getGraph().getNodes().get(0), innerComplexNode);
		
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		formula.setCondition2(qc2);
		innerComplexNode = qc2.getGraph().addComplexNode();
		qc2.getGraph().addRelation((ComplexNode) qc2.getGraph().getNodes().get(0), innerComplexNode);
		
		return completePattern;
	}
		
	//For the first example - Neo4J-Abstrakt DuplicatedNeighbour
	public static CompletePattern abstractDuplicatedNeighbour() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return (CompletePattern) genericDuplicatedNeighbour().createNeo4jAdaption();
	}
	
	public static CompletePattern genericMandetoryFields() throws InvalidityException {
		GraphstructurePackage.eINSTANCE.eClass();
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		completePattern.getGraph().getReturnNodes().get(0).setName("InitNode");
		
		NotCondition not = factory.createNotCondition();
		completePattern.setCondition(not);
		
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		not.setCondition(qc1);
		ComplexNode innerComplexNode = (ComplexNode) qc1.getGraph().getNodes().get(0);
		PrimitiveNode primitiveNode1 = qc1.getGraph().addPrimitiveNode();
		qc1.getGraph().addRelation(innerComplexNode, primitiveNode1);
		PrimitiveNode primitiveNode2 = qc1.getGraph().addPrimitiveNode();
		qc1.getGraph().addRelation(innerComplexNode, primitiveNode2);
		PrimitiveNode primitiveNode3 = qc1.getGraph().addPrimitiveNode();
		qc1.getGraph().addRelation(innerComplexNode, primitiveNode3);
		
		return completePattern;
	}
		
	//For the first example - Neo4J-Abstrakt DuplicatedNeighbour
	public static CompletePattern abstractMandetoryFields() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return (CompletePattern) genericMandetoryFields().createNeo4jAdaption();
	}
	
	//Find Nb
		public static CompletePattern genericMyNbCount() throws InvalidityException {
			PatternstructurePackage.eINSTANCE.eClass();
			PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
			
			CompletePattern completePattern = factory.createCompletePattern();
			ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
			completePattern.setName("MyNbCount");
			ComplexNode complexNode2 = completePattern.getGraph().addComplexNode();
			completePattern.getGraph().addRelation(complexNode1, complexNode2);
			
			CountCondition countCond = PatternstructureFactory.eINSTANCE.createCountCondition();
			countCond.setPattern(completePattern);
			
			NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
			countCond.setArgument2(numberElement);
			numberElement.getNumberParam().setValue(1.);
			
			CountPattern countPattern = (CountPattern) countCond.getCountPattern();
			countPattern.getGraph().getNodes().get(0).setReturnNode(false);
			countPattern.getGraph().getNodes().get(1).setReturnNode(true);
			
			ParameterList paramters = completePattern.getParameterList();
			ComparisonOptionParam comparisonOptionParam = (ComparisonOptionParam) paramters.getParameters().get(0);
			comparisonOptionParam.setValue(ComparisonOperator.GREATER);
			
			return completePattern;
		}
		
		public static CompletePattern abstractMyNbCount() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			return (CompletePattern) genericMyNbCount().createNeo4jAdaption();
		}
}

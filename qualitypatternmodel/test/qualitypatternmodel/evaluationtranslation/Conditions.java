package qualitypatternmodel.evaluationtranslation;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class Conditions {
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
}

package javaoperatortests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.cyphertranslationtests_new.Test00;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;


public class OneArgTestPatterns {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> result = getXmlTestPatterns();
		for (CompletePattern pattern: result) {
			System.out.println(pattern.myToString());
			System.out.println();			
			try{
				System.out.println(pattern.generateXQuery());
			} catch (InvalidityException e) {}
			
			try{
				System.out.println(pattern.generateQueryFilter());
			} catch (InvalidityException e) {}
			
			System.out.println("-----------------------------------------\n");
		}
			
	}
	
	public static List<CompletePattern> getXmlTestPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<CompletePattern> patterns = getTestPatterns();
		List<CompletePattern> result = new ArrayList<CompletePattern>();
		for (CompletePattern pattern: patterns) {
			try {
				pattern.createXmlAdaption();
				pattern = Test00.replace(pattern);
				result.add(pattern);
			} catch (Exception e) {}
		}
		return result;
	}

	public static List<CompletePattern> getRdfTestPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<CompletePattern> result = getTestPatterns();
		for (CompletePattern pattern: result)
			pattern.createRdfAdaption();
		return result;
	}

	public static List<CompletePattern> getNeoTestPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<CompletePattern> result = getTestPatterns();
		for (CompletePattern pattern: result)
			pattern.createNeo4jAdaption();
		return result;
	}
	
	public static List<CompletePattern> getTestPatterns() throws InvalidityException{
		List<CompletePattern> result = new ArrayList<CompletePattern>();
		result.add(getTestPattern1());
		result.add(getTestPattern2());
		result.add(getTestPattern3());
		result.add(getTestPattern4());
		result.add(getTestPattern5());
//		result.add(getTestPattern5b());
		result.add(getTestPattern6());
//		result.add(getTestPattern6b());
		result.add(getTestPattern7());
		result.add(getTestPattern8());
		result.add(getTestPattern9());
		result.add(getTestPattern10());
		return result;
	}
	
	public static CompletePattern getTestPattern1() throws InvalidityException {
		// return graph
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph pgraph = completePattern.getGraph();
		ComplexNode retnode = pgraph.getNodes().get(0).makeComplex();
		
		// condition
		QuantifiedCondition qcon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(qcon);
		Graph qcongraph = qcon.getGraph();
		
		// node
		PrimitiveNode conditionNode = retnode.addOutgoing(qcongraph).getTarget().makePrimitive();
		conditionNode.addPrimitiveValidateLink();
		
		return completePattern;
	}
	
	public static CompletePattern getTestPattern2() throws InvalidityException {
		// return Graph
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph pgraph = completePattern.getGraph();
		ComplexNode retnode = pgraph.getNodes().get(0).makeComplex();
		
		// condition
		QuantifiedCondition qcon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(qcon);
		Graph qcongraph = qcon.getGraph();
		
		PrimitiveNode conditionNode = retnode.addOutgoing(qcongraph).getTarget().makePrimitive();

		// node
		conditionNode.addPrimitiveValidateLink();
		conditionNode.addPrimitiveMatch(".*a.*");
		
		return completePattern;
	}

	public static CompletePattern getTestPattern3() throws InvalidityException {
		return getTestPatternSimpleFormula(LogicalOperator.AND, true, true);
	}

	public static CompletePattern getTestPattern4() throws InvalidityException {
		return getTestPatternSimpleFormula(LogicalOperator.OR, true, true);
	}

	public static CompletePattern getTestPattern5() throws InvalidityException {
		return getTestPatternSimpleFormula(LogicalOperator.AND, false, true);
	}

	public static CompletePattern getTestPattern6() throws InvalidityException {
		return getTestPatternSimpleFormula(LogicalOperator.OR, false, true);
	}

	public static CompletePattern getTestPattern5b() throws InvalidityException {
		return getTestPatternSimpleFormula(LogicalOperator.AND, true, false);
	}

	public static CompletePattern getTestPattern6b() throws InvalidityException {
		return getTestPatternSimpleFormula(LogicalOperator.OR, true, false);
	}
	
	public static CompletePattern getTestPatternSimpleFormula(LogicalOperator op, Boolean firstJavaOperator, Boolean secondJavaOperator) throws InvalidityException {
		// return Graph
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph pgraph = completePattern.getGraph();
		ComplexNode retnode = pgraph.getNodes().get(0).makeComplex();
		
		// Condition Structure
		Formula f = PatternstructureFactory.eINSTANCE.createFormula();
		completePattern.setCondition(f);
		f.setOperator(op);
		QuantifiedCondition qcon1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		f.setCondition1(qcon1);
		Graph qcon1graph = qcon1.getGraph();
		QuantifiedCondition qcon2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		f.setCondition2(qcon2);
		Graph qcon2graph = qcon2.getGraph();
		
		// Nodes
		PrimitiveNode conditionNode1 = retnode.addOutgoing(qcon1graph).getTarget().makePrimitive();
		PrimitiveNode conditionNode2 = retnode.addOutgoing(qcon2graph).getTarget().makePrimitive();
		
		// Operators
		if (firstJavaOperator) conditionNode1.addPrimitiveValidateLink();
			else conditionNode1.addPrimitiveMatch();
		if (secondJavaOperator) conditionNode2.addPrimitiveValidateLink();
			else conditionNode2.addPrimitiveMatch();
		
		return completePattern;
	}
	
	public static CompletePattern getTestPattern7() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph pgraph = completePattern.getGraph();
		ComplexNode retnode = pgraph.getNodes().get(0).makeComplex();

		// Condition Structure
		QuantifiedCondition qcon1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(qcon1);
		qcon1.setQuantifier(Quantifier.FORALL);
		Graph qcon1graph = qcon1.getGraph();
		QuantifiedCondition qcon2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		qcon1.setCondition(qcon2);
		Graph qcon2graph = qcon2.getGraph();

		// Nodes
		ComplexNode midNode = retnode.addOutgoing(qcon1graph).getTarget().makeComplex();
		PrimitiveNode conditionNode = midNode.addOutgoing(qcon2graph).getTarget().makePrimitive();
		
		// Operators
		conditionNode.addPrimitiveValidateLink();
		
		return completePattern;
	}
	
	public static CompletePattern getTestPattern8() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph pgraph = completePattern.getGraph();
		ComplexNode retnode = pgraph.getNodes().get(0).makeComplex();

		// Condition Structure
		QuantifiedCondition qcon1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		qcon1.setQuantifier(Quantifier.EXISTS);
		completePattern.setCondition(qcon1);
		Graph qcon1graph = qcon1.getGraph();
		QuantifiedCondition qcon2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		qcon2.setQuantifier(Quantifier.FORALL);
		qcon1.setCondition(qcon2);
		Graph qcon2graph = qcon2.getGraph();
		QuantifiedCondition qcon3 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		qcon3.setQuantifier(Quantifier.EXISTS);
		qcon2.setCondition(qcon3);
		Graph qcon3graph = qcon3.getGraph();

		// Nodes
		ComplexNode midNode1 = retnode.addOutgoing(qcon1graph).getTarget().makeComplex();
		ComplexNode midNode2 = midNode1.addOutgoing(qcon2graph).getTarget().makeComplex();
		PrimitiveNode conditionNode = midNode2.addOutgoing(qcon3graph).getTarget().makePrimitive();
		
		// Operators
		conditionNode.addPrimitiveValidateLink();
		
		return completePattern;
	}
	
	public static CompletePattern getTestPattern9() throws InvalidityException {
		return getTestPatternTwoNodes(true, false);
	}
	
	public static CompletePattern getTestPattern10() throws InvalidityException {
		return getTestPatternTwoNodes(true, true);
	}
	
	public static CompletePattern getTestPatternTwoNodes(Boolean firstJavaOperator, Boolean secondJavaOperator) throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph pgraph = completePattern.getGraph();
		ComplexNode retnode = pgraph.getNodes().get(0).makeComplex();
		
		QuantifiedCondition qcon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(qcon);
		
		Graph qcongraph = qcon.getGraph();

		PrimitiveNode conditionNode1 = retnode.addOutgoing(qcongraph).getTarget().makePrimitive();
		PrimitiveNode conditionNode2 = retnode.addOutgoing(qcongraph).getTarget().makePrimitive();

		if (firstJavaOperator) conditionNode1.addPrimitiveValidateLink();
			else conditionNode1.addPrimitiveMatch();
		if (secondJavaOperator) conditionNode2.addPrimitiveValidateLink();
			else conditionNode2.addPrimitiveMatch();
		
		return completePattern;
	}
	

}

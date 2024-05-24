package qualitypatternmodel.evaluationquality;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest11CountCondition;

public class EvalCard {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getCardGeneric());
//		completePatterns.add(getCardPlusGeneric());
		
		for (CompletePattern cp: completePatterns) {
			Test00.printGenericPatternExampleXQuery(cp);			
		}
	}
	
	public static CompletePattern getCardGeneric() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		
		// Context graph of pattern:
		Node returnNode = completePattern.getGraph().getNodes().get(0).makeComplex();
		
		// First-order logic condition of pattern:
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		completePattern.setCondition(countCondition);
		countCondition.createCountPattern();
		NumberElementImpl ne = new NumberElementImpl();
		countCondition.setArgument2(ne);
		ne.createParameters();
		ne.getNumberParam().setValue(1.);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);
		
		Node countReturn = returnNode.addOutgoing(countCondition.getCountPattern().getGraph()).getTarget();
		countReturn.setReturnNode(true);
		
		return completePattern;	
	}
	
	public static CompletePattern getCardPlusGeneric() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		
		Node returnNode = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
//		e0.addOutgoing().getTarget().addPrimitiveComparison();
		
		CountCondition countCondition = patternStructureFactory.createCountCondition();
		completePattern.setCondition(countCondition);
		CountPattern countPattern = patternStructureFactory.createCountPattern();
		countCondition.setCountPattern(countPattern);

		NumberElement numberElement = patternStructureFactory.createNumberElement();
		countCondition.setArgument2(numberElement);
//		NumberParam numberParam = parametersFactory.createNumberParam();
		numberElement.getNumberParam().setValue(1.0);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);		
		
		Graph graph2 = countPattern.getGraph();
		
		Node e2g2 = returnNode.addOutgoing(graph2).getTarget().makeComplex();
		e2g2.setReturnNode(true);
		
		QuantifiedCondition quantifiedCondition2 = patternStructureFactory.createQuantifiedCondition();
		countPattern.setCondition(quantifiedCondition2);
		Graph graph3 = quantifiedCondition2.getGraph();
		e2g2.addOutgoing(graph3);
				
		return completePattern;
	}
	
	public static CompletePattern getCARD1() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		completePattern.setPatternId("CARD1");
		completePattern.getGraph().getReturnNodes().get(0).setName("Return");
		
		ComplexNode complexNode = completePattern.getGraph().addComplexNode();
		complexNode.setName("Nb");
		completePattern.getGraph().addRelation((ComplexNode) completePattern.getGraph().getNodes().get(0), (Node) complexNode);

		CountCondition countCond = PatternstructureFactory.eINSTANCE.createCountCondition();
		countCond.setPattern(completePattern);
		countCond.getCountPattern().getGraph().getNodes().get(0).setReturnNode(false);
		countCond.getCountPattern().getGraph().getNodes().get(1).setReturnNode(true);
		
		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		countCond.setArgument2(numberElement);
		numberElement.getNumberParam().setValue(1.);
		
		ComparisonOptionParam comparisonOperator = countCond.getOption();
		comparisonOperator.setValue(ComparisonOperator.GREATER);
		
		return completePattern;
	}
}

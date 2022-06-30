package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class RdfTest08Count {
	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCountInPatternPattern());	
		completePatterns.add(getCountInQuantifierPattern(Quantifier.EXISTS));	
		completePatterns.add(getCountInQuantifierPattern(Quantifier.FORALL));

		RdfTest00.test(completePatterns);
	}

	private static CompletePattern getCountInPatternPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest00.getBasePattern();
		CountCondition countCond = PatternstructureFactory.eINSTANCE.createCountCondition();
		countCond.setPattern(completePattern);
		
		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		countCond.setArgument2(numberElement);
		
		ComplexNode complexNode1 = countCond.getCountPattern().getGraph().getNodes().get(1).makeComplex();
		complexNode1.setReturnNode(true);
		Node node2 = countCond.getCountPattern().getGraph().addNode();
		countCond.getCountPattern().getGraph().addRelation(complexNode1, node2);
		
		completePattern.createRdfAdaption();
		return completePattern;
	}
	
	private static CompletePattern getCountInQuantifierPattern(Quantifier q) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest00.getBasePattern();
		QuantifiedCondition quantifiedCond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCond);
		quantifiedCond.setQuantifier(q);
		
		ComplexNode complexNode1 = quantifiedCond.getGraph().getNodes().get(0).makeComplex();
		Node node2 = quantifiedCond.getGraph().addNode();
		quantifiedCond.getGraph().addRelation(complexNode1, node2);
		
		CountCondition countCond = PatternstructureFactory.eINSTANCE.createCountCondition();
		countCond.setQuantifiedCondition(quantifiedCond);
		
		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		countCond.setArgument2(numberElement);
		
		ComplexNode complexNode2 = countCond.getCountPattern().getGraph().getNodes().get(1).makeComplex();
		complexNode2.setReturnNode(true);
		Node node3 = countCond.getCountPattern().getGraph().addNode();
		countCond.getCountPattern().getGraph().addRelation(complexNode2, node3);
		
		completePattern.createRdfAdaption();
		return completePattern;
	}
}

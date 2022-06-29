package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class RdfTest04NotElement {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getNotExistsPattern());
		completePatterns.add(getNotForallPattern());
//		completePatterns.add(getPatternExistsNotExists()); // TODO
//		completePatterns.add(getPatternForallNotForall()); // TODO
		RdfTest00.test(completePatterns);
	}

	private static CompletePattern getNotExistsPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = RdfTest00.getBasePattern();
		NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
		completePattern.setCondition(notCond);
		
		QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		notCond.setCondition(quantifiedCond2);
		
		ComplexNode complexNode2 = quantifiedCond2.getGraph().getNodes().get(1).makeComplex();
		Node node3 = quantifiedCond2.getGraph().addNode();
		quantifiedCond2.getGraph().addRelation(complexNode2, node3);		
		
		completePattern.createRdfAdaption();
		return completePattern;
		
	}
	
	private static CompletePattern getNotForallPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = RdfTest00.getBasePattern();
		NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
		completePattern.setCondition(notCond);
		
		QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		notCond.setCondition(quantifiedCond2);
		quantifiedCond2.setQuantifier(Quantifier.FORALL);
		
		ComplexNode complexNode2 = quantifiedCond2.getGraph().getNodes().get(1).makeComplex();
		Node node3 = quantifiedCond2.getGraph().addNode();
		quantifiedCond2.getGraph().addRelation(complexNode2, node3);		
		
		completePattern.createRdfAdaption();
		return completePattern;
		
	}
}

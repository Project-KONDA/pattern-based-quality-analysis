package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class RdfTest03Quantor {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getQuantifierQuantifierPattern(Quantifier.EXISTS, Quantifier.EXISTS));
		completePatterns.add(getQuantifierQuantifierPattern(Quantifier.EXISTS, Quantifier.FORALL));
		completePatterns.add(getQuantifierQuantifierPattern(Quantifier.FORALL, Quantifier.EXISTS));
		completePatterns.add(getQuantifierQuantifierPattern(Quantifier.FORALL, Quantifier.FORALL));
		RdfTest00.test(completePatterns);
	}

	private static CompletePattern getQuantifierQuantifierPattern(Quantifier q, Quantifier q2) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest00.getBasePattern();
		QuantifiedCondition quantifiedCond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCond);
		quantifiedCond.setQuantifier(q);
		
		ComplexNode complexNode1 = quantifiedCond.getGraph().getNodes().get(1).makeComplex();
		Node node2 = quantifiedCond.getGraph().addNode();
		quantifiedCond.getGraph().addRelation(complexNode1, node2);
		
		QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		quantifiedCond.setCondition(quantifiedCond2);
		quantifiedCond2.setQuantifier(q2);
		
		ComplexNode complexNode2 = quantifiedCond2.getGraph().getNodes().get(2).makeComplex();
		Node node3 = quantifiedCond2.getGraph().addNode();
		quantifiedCond2.getGraph().addRelation(complexNode2, node3);
		
		completePattern.createRdfAdaption();
		return completePattern;
	}

	
}

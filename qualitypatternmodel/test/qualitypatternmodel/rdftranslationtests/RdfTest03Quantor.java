package qualitypatternmodel.rdftranslationtests;

//import static org.junit.Assert.assertThrows;
//import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class RdfTest03Quantor {
	
	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		assertThrows(InvalidityException.class, () -> getQuantifierQuantifierPattern(Quantifier.FORALL).generateSparql());
//		assertThrows(InvalidityException.class, () -> getQuantifierQuantifierPattern(Quantifier.EXISTS, Quantifier.FORALL).generateSparql());
//		assertThrows(InvalidityException.class, () -> getQuantifierQuantifierPattern(Quantifier.FORALL, Quantifier.FORALL).generateSparql());
		
		completePatterns.add(getQuantifierQuantifierPattern(Quantifier.EXISTS));
		completePatterns.add(getQuantifierQuantifierPattern(Quantifier.EXISTS, Quantifier.EXISTS));
		completePatterns.add(getQuantifierQuantifierPattern(Quantifier.FORALL, Quantifier.EXISTS));

//		completePatterns.add(getQuantifierQuantifierPattern(Quantifier.FORALL));
//		completePatterns.add(getQuantifierQuantifierPattern(Quantifier.EXISTS, Quantifier.FORALL));
//		completePatterns.add(getQuantifierQuantifierPattern(Quantifier.FORALL, Quantifier.FORALL));
		
		return completePatterns;
	}

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		RdfTest00.test(getPatterns());
	}

	private static CompletePattern getQuantifierQuantifierPattern(Quantifier q) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest00.getBasePattern();
		QuantifiedCondition quantifiedCond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCond);
		quantifiedCond.setQuantifier(q);
		
		ComplexNode complexNode1 = quantifiedCond.getGraph().getNodes().get(1).makeComplex();
		Node node2 = quantifiedCond.getGraph().addNode();
		quantifiedCond.getGraph().addRelation(complexNode1, node2);
		
		completePattern.createRdfAdaption();
		return completePattern;
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

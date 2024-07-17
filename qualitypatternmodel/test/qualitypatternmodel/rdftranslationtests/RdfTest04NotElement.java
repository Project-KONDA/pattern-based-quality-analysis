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

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getNotQuantifierPattern(Quantifier.EXISTS));
//		completePatterns.add(getNotQuantifierPattern(Quantifier.FORALL));
		completePatterns.add(getQuantifierNotQuantifierPattern(Quantifier.EXISTS, Quantifier.EXISTS));
//		completePatterns.add(getQuantifierNotQuantifierPattern(Quantifier.FORALL, Quantifier.FORALL));
		completePatterns.add(getNotNotPattern());
		completePatterns.add(getNotNotNotPattern());
		completePatterns.add(getNotNotNotNotPattern());
		completePatterns.add(getNotNotNotNotNotPattern());
		return completePatterns;
	}

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		RdfTest00.test(getPatterns());
	}

	private static CompletePattern getNotQuantifierPattern(Quantifier q) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = RdfTest00.getBasePattern();
		NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
		completePattern.setCondition(notCond);

		QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		notCond.setCondition(quantifiedCond2);
		quantifiedCond2.setQuantifier(q);

		ComplexNode complexNode2 = completePattern.getGraph().getNodes().get(1).makeComplex();
		complexNode2.addOutgoing(quantifiedCond2.getGraph());

		completePattern.createRdfAdaption();
		return completePattern;

	}

	private static CompletePattern getQuantifierNotQuantifierPattern(Quantifier q, Quantifier q2) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = RdfTest00.getBasePattern();

		QuantifiedCondition quantifiedCond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCond);
		quantifiedCond.setQuantifier(q);

		ComplexNode complexNode = completePattern.getGraph().getNodes().get(1).makeComplex();
		Node node2 = complexNode.addOutgoing(quantifiedCond.getGraph()).getTarget().makeComplex();

		NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
		quantifiedCond.setCondition(notCond);

		QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		notCond.setCondition(quantifiedCond2);
		quantifiedCond2.setQuantifier(q2);

		node2.addOutgoing(quantifiedCond2.getGraph());

		completePattern.createRdfAdaption();
		return completePattern;

	}

	private static CompletePattern getNotNotPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = RdfTest00.getBasePattern();
		NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
		completePattern.setCondition(notCond);
		NotCondition notCond2 = PatternstructureFactory.eINSTANCE.createNotCondition();
		notCond.setCondition(notCond2);

		QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		notCond2.setCondition(quantifiedCond2);

		ComplexNode complexNode2 = completePattern.getGraph().getNodes().get(1).makeComplex();

		complexNode2.addOutgoing(quantifiedCond2.getGraph());

		completePattern.createRdfAdaption();
		return completePattern;

	}

	private static CompletePattern getNotNotNotPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = RdfTest00.getBasePattern();
		NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
		completePattern.setCondition(notCond);
		NotCondition notCond2 = PatternstructureFactory.eINSTANCE.createNotCondition();
		notCond.setCondition(notCond2);
		NotCondition notCond3 = PatternstructureFactory.eINSTANCE.createNotCondition();
		notCond2.setCondition(notCond3);

		QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		notCond3.setCondition(quantifiedCond2);

		ComplexNode complexNode2 = completePattern.getGraph().getNodes().get(1).makeComplex();
		complexNode2.addOutgoing(quantifiedCond2.getGraph());

		completePattern.createRdfAdaption();
		return completePattern;

	}

	private static CompletePattern getNotNotNotNotPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = RdfTest00.getBasePattern();
		NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
		completePattern.setCondition(notCond);
		NotCondition notCond2 = PatternstructureFactory.eINSTANCE.createNotCondition();
		notCond.setCondition(notCond2);
		NotCondition notCond3 = PatternstructureFactory.eINSTANCE.createNotCondition();
		notCond2.setCondition(notCond3);
		NotCondition notCond4 = PatternstructureFactory.eINSTANCE.createNotCondition();
		notCond3.setCondition(notCond4);

		QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		notCond4.setCondition(quantifiedCond2);

		ComplexNode complexNode2 = completePattern.getGraph().getNodes().get(1).makeComplex();
		complexNode2.addOutgoing(quantifiedCond2.getGraph());

		completePattern.createRdfAdaption();
		return completePattern;

	}

	private static CompletePattern getNotNotNotNotNotPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = RdfTest00.getBasePattern();
		NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
		completePattern.setCondition(notCond);
		NotCondition notCond2 = PatternstructureFactory.eINSTANCE.createNotCondition();
		notCond.setCondition(notCond2);
		NotCondition notCond3 = PatternstructureFactory.eINSTANCE.createNotCondition();
		notCond2.setCondition(notCond3);
		NotCondition notCond4 = PatternstructureFactory.eINSTANCE.createNotCondition();
		notCond3.setCondition(notCond4);
		NotCondition notCond5 = PatternstructureFactory.eINSTANCE.createNotCondition();
		notCond4.setCondition(notCond5);

		QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		notCond5.setCondition(quantifiedCond2);

		ComplexNode complexNode2 = completePattern.getGraph().getNodes().get(1).makeComplex();
		complexNode2.addOutgoing(quantifiedCond2.getGraph());

		completePattern.createRdfAdaption();
		return completePattern;

	}


}
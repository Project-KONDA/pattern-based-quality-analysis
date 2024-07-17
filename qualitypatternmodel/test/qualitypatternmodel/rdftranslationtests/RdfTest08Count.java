package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class RdfTest08Count {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCountInPatternPattern());
		completePatterns.add(getCountInQuantifierPattern(Quantifier.EXISTS));
		completePatterns.add(getCountInQuantifierPattern(Quantifier.FORALL));
		return completePatterns;
	}

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		RdfTest00.test(getPatterns());
	}

	private static CompletePattern getCountInPatternPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest00.getBasePattern();
		CountCondition countCond = PatternstructureFactory.eINSTANCE.createCountCondition();
		countCond.setPattern(completePattern);

		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		countCond.setArgument2(numberElement);
		numberElement.getNumberParam().setValue(1.);

		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(1).makeComplex();


		Node node2 = complexNode1.addOutgoing(countCond.getCountPattern().getGraph()).getTarget();
		node2.setReturnNode(true);

		completePattern.createRdfAdaption();
		return completePattern;
	}

	private static CompletePattern getCountInQuantifierPattern(Quantifier q) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest00.getBasePattern();
		QuantifiedCondition quantifiedCond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCond);
		quantifiedCond.setQuantifier(q);

		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();

		Node node2 = complexNode1.addOutgoing(quantifiedCond.getGraph().addNode()).getTarget();

		CountCondition countCond = PatternstructureFactory.eINSTANCE.createCountCondition();
		countCond.setQuantifiedCondition(quantifiedCond);

		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		countCond.setArgument2(numberElement);
		numberElement.getNumberParam().setValue(1.);

		Node node3 = node2.addOutgoing(countCond.getCountPattern().getGraph()).getTarget();
		node3.setReturnNode(true);

		completePattern.createRdfAdaption();
		return completePattern;
	}
}

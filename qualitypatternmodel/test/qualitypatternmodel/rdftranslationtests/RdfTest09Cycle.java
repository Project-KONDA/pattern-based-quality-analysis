package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;

public class RdfTest09Cycle {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCyclePattern());
		return completePatterns;
	}

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		RdfTest00.test(getPatterns());
	}

	private static CompletePattern getCyclePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest00.getBasePattern();
		Node newNode = completePattern.getGraph().addNode();
		ComplexNode newComplex = newNode.makeComplex();

		completePattern.getGraph().addRelation(completePattern.getGraph().getNodes().get(1).makeComplex(), newComplex);
		completePattern.getGraph().addRelation(newComplex, completePattern.getGraph().getNodes().get(0));

		completePattern.createRdfAdaption();
		return completePattern;
	}
}

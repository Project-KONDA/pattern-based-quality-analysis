package qualitypatternmodel.cyphertranslationtests_new;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test01Reference {
	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getBaseReferenceAbstract());
		completePatterns.add(getBaseReferenceExistsAbstract());
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		Test00.test(getPatterns());
	}

	public static CompletePattern getBaseReference() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		Graph g = completePattern.getGraph();

		Node n1 = g.getNodes().get(0);
		Node n2 = g.addComplexNode();
		n1.addOutgoing(n2);

		return completePattern;
	}

	public static CompletePattern getBaseReferenceAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBaseReference();
//		Graph graph = completePattern.getGraph();
		completePattern.createNeo4jAdaption();
		return completePattern;
	}

	public static CompletePattern getBaseReferenceExistsAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBaseReference();

		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();

		completePattern.setCondition(qc);
//		Graph g = qc.getGraph();

		completePattern.createNeo4jAdaption();
		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		return testPairs;
	}

}

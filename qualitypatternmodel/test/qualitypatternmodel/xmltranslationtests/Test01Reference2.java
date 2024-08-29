package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test01Reference2 {


	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getBaseReference());
		return completePatterns;
	}
	
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getBaseReference() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		Graph g = completePattern.getGraph();
		
		Node n1 = g.getNodes().get(0);
		Node n2 = g.addComplexNode();
		n1.addOutgoing(n2);
		completePattern.createXmlAdaption();
		System.out.println(completePattern.myToString());
		System.out.println("FROM " + g.getRelations().get(0).myToString());
		g.getRelations().get(0).adaptAsXmlReference();
		System.out.println(completePattern.myToString());
		PatternUtility.fillParameter(completePattern);
		
		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		return testPairs;
	}

}

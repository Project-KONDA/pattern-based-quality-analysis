package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.exceptions.*;

public class Test01Reference {
	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getBaseReferenceAbstract());
		completePatterns.add(getBaseReferenceExistsAbstract());
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
		
		return completePattern;
	}

	public static CompletePattern getBaseReferenceAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern = getBaseReference();
		Graph graph = completePattern.getGraph();
		completePattern.createXmlAdaption();
		graph.getRelations().get(0).adaptAsXmlReference();
		return completePattern;
	}
	
	public static CompletePattern getBaseReferenceExistsAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBaseReference();
		
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		
		completePattern.setCondition(qc);
		completePattern.getGraph().getNodes().get(0).addOutgoing(qc.getGraph());
//		Graph g = qc.getGraph();
//		System.out.println(completePattern.myToString());
		
		completePattern.createXmlAdaption();
//		System.out.println(completePattern.myToString());
		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("01r", "base-reference", getBaseReference(), null));
		testPairs.add(new PatternTestPair("01r", "base-reference_abstract", getBaseReferenceAbstract(), null));
		testPairs.add(new PatternTestPair("01r", "base-reference_exist", getBaseReferenceExistsAbstract(), null));
		return testPairs;
	}

}

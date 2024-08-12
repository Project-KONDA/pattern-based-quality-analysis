package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test13Cycle {
	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternCycle());
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	private static CompletePattern getPatternCycle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		QuantifiedCondition cond = (QuantifiedCondition) completePattern.getCondition();
		Graph graph1 = completePattern.getGraph();
		Graph graph2 = cond.getGraph();

		Node ret = graph1.getNodes().get(0);
		Node n1 = graph2.getNodes().get(0);

		n1.addOutgoing(ret);

		completePattern.createXmlAdaption();

		List<Parameter> params = completePattern.getParameterList().getParameters();
		((XmlPathParam) params.get(1)).setValueFromString("//*");
		((XmlPathParam) params.get(2)).setValueFromString("/demo:address/demo:city");
		((XmlPathParam) params.get(0)).setValueFromString("/ancestor::*");
		
		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("13", "PatternCycle", getPatternCycle(), "declare namespace demo = \"demo\"; //*[./demo:address/demo:city]"));
		return testPairs;
	}
}
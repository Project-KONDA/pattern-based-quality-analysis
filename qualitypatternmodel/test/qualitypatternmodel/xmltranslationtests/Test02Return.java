package qualitypatternmodel.xmltranslationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test02Return {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternMultipleReturnNavigation());
		completePatterns.add(getPatternMultipleReturnReference());
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getPatternMultipleReturnNavigation() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

//		Graph graph = completePattern.getGraph();
		Node element1 = completePattern.getGraph().getNodes().get(0);
		Node element2 = element1.addOutgoing(completePattern.getGraph()).getTarget();
		element2.setReturnNode(true);

		completePattern.createXmlAdaption();
		
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("/demo:creator");
		params.get(1).setValueFromString("/demo:data/demo:painting");

		return completePattern;
	}

	public static CompletePattern getPatternMultipleReturnReference() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		Graph graph = completePattern.getGraph();
		Node element1 = graph.getNodes().get(0);
		Node element2 = element1.addOutgoing(graph).getTarget();
		element2.setReturnNode(true);

		completePattern.createXmlAdaption();
		((ComplexNode) completePattern.getGraph().getNodes().get(1)).getOutgoing().get(0).adaptAsXmlReference();

		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("/demo:data/demo:painting");
		params.get(1).setValueFromString("/demo:data/demo:artist");
		params.get(2).setValueFromString("/demo:creator/text()"); // Property
		params.get(3).setValueFromString("/@demo:id"); // Property

		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("02", "MultipleReturnNavigation", getPatternMultipleReturnNavigation(), 
				"declare namespace demo = \"demo\"; for $x1 in /demo:data/demo:painting for $x2 in $x1/demo:creator return ($x2, $x1)"));
		testPairs.add(new PatternTestPair("02", "MultipleReturnReference", getPatternMultipleReturnReference(), 
				"declare namespace demo = \"demo\"; for $x1 in /demo:data/demo:painting for $x2 in /demo:data/demo:artist[./@demo:id = $x1/demo:creator/text()] return ($x2, $x1)"));
		return testPairs;
	}

}

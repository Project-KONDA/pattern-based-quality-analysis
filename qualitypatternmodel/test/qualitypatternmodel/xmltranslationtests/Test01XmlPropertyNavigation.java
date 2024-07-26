package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test01XmlPropertyNavigation {
	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getProperty());             // 1.1 property
		completePatterns.add(getPropertyNextGraph());    // 1.2 property next graph
		completePatterns.add(getMultipleProperties());    // 1.3 multiple properties
		completePatterns.add(getValue());                // 2.1 value
		completePatterns.add(getValueNextGraph());       // 2.2 value next graph
		completePatterns.add(getComparison());           // 3.1 comparison
		completePatterns.add(getComparisonCrossGraph()); // 3.2 comparison between graphs
		completePatterns.add(getComparisonNextGraph());	 // 3.3 comparison next graph

		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.getGraph().getNodes().get(0).addOutgoing().getTarget().makePrimitive();
		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("/text()");
		params.get(1).setValueFromString("//*");
		return completePattern;
	}

	public static CompletePattern getPropertyReturn() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.getGraph().getNodes().get(0).makePrimitive();
		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("//*/text()");
		return completePattern;
	}

	public static CompletePattern getValue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getProperty();
		completePattern.getGraph().getNodes().get(1).addPrimitiveComparison();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(1).setValueFromString("//*");
		params.get(0).setValueFromString("/text()");
		params.get(2).setValueFromString("unknown");
		return completePattern;
	}

	public static CompletePattern getPropertyNextGraph() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();
		completePattern.getGraph().getNodes().get(0).addOutgoing(g).getTarget().makePrimitive();
		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("//*");
		params.get(1).setValueFromString("/text()");
		return completePattern;
	}

	public static CompletePattern getMultipleProperties() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();
		completePattern.getGraph().getNodes().get(0).addOutgoing().getTarget().makePrimitive();
		completePattern.getGraph().getNodes().get(0).addOutgoing(g).getTarget().makePrimitive();
		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("/demo:startwork/text()");
		params.get(1).setValueFromString("//*");
		params.get(2).setValueFromString("/demo:endwork/text()");
		return completePattern;
	}

	public static CompletePattern getValueNextGraph() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPropertyNextGraph();
		((QuantifiedCondition)completePattern.getCondition()).getGraph().getNodes().get(0).addPrimitiveComparison();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("//*");
		params.get(1).setValueFromString("/text()");
		params.get(2).setValueFromString("unknown");
		return completePattern;
	}


	public static CompletePattern getComparison() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph graph = completePattern.getGraph();
		Node ret = graph.getNodes().get(0);
		Node retnext = ret.addOutgoing().getTarget().makePrimitive();

		Node n2 = graph.addComplexNode();
		Node n2next = n2.addOutgoing().getTarget().makePrimitive();
		retnext.addComparison(n2next);
		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();                                                                                                                                      
		params.get(2).setValueFromString("/demo:creator/text()");
		params.get(3).setValueFromString("/@demo:id");
		params.get(4).setValueFromString("/demo:data/demo:painting");
		params.get(5).setValueFromString("/demo:data/demo:artist");
		return completePattern;
	}


	public static CompletePattern getComparisonCrossGraph() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph graph = completePattern.getGraph();
		Node ret = graph.getNodes().get(0);
		Node retnext = ret.addOutgoing().getTarget().makePrimitive();

		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();

		Node n2 = g.addComplexNode();
		Node n2next = n2.addOutgoing().getTarget().makePrimitive();
		retnext.addComparison(n2next);
		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();   
		params.get(2).setValueFromString("/demo:creator/text()"); // Property
		params.get(3).setValueFromString("/demo:data/demo:painting");
		params.get(4).setValueFromString("/@demo:id"); // Property
		params.get(5).setValueFromString("/demo:data/demo:artist");
		return completePattern;
	}


	public static CompletePattern getComparisonNextGraph() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph graph = completePattern.getGraph();
		Node ret = graph.getNodes().get(0);

		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();

		Node retnext = ret.addOutgoing(g).getTarget().makePrimitive();

		Node n2 = g.addComplexNode();
		Node n2next = n2.addOutgoing().getTarget().makePrimitive();
		retnext.addComparison(n2next);
		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();   
		params.get(2).setValueFromString("/demo:data/demo:painting");
		params.get(3).setValueFromString("/demo:creator/text()"); // Property
		params.get(4).setValueFromString("/@demo:id"); // Property
		params.get(5).setValueFromString("/demo:data/demo:artist");
		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("01p", "PropertyReturn", getPropertyReturn(), "//*/text()"));
		testPairs.add(new PatternTestPair("01p", "Property", getProperty(), "//*[text()]"));
		testPairs.add(new PatternTestPair("01p", "Value", getValue(), "//*[text()=\"unknown\"]"));
		testPairs.add(new PatternTestPair("01p", "PropertyNext", getPropertyNextGraph(), "//*[text()]"));
		testPairs.add(new PatternTestPair("01p", "MultipleProperties", getMultipleProperties(), "declare namespace demo = \"demo\"; //*[./demo:startwork/text()][./demo:endwork/text()]"));
		testPairs.add(new PatternTestPair("01p", "ValueNextGraph", getValueNextGraph(), "//*[text()=\"unknown\"]"));
		String x = "declare namespace demo = \"demo\"; /demo:data/demo:painting [./demo:creator/text() = /demo:data/demo:artist/@demo:id]";
		testPairs.add(new PatternTestPair("01p", "Comparison", getComparison(), x));
		testPairs.add(new PatternTestPair("01p", "ComparisonCrossGraph", getComparisonCrossGraph(), x));
		testPairs.add(new PatternTestPair("01p", "ComparisonNextGraph", getComparisonNextGraph(), x));
		return testPairs;
	}
}

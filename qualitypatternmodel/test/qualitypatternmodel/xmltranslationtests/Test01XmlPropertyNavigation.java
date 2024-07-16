package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.XmlPatternUtility;

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
//		Test00.test(getPatterns());
    	XmlPatternUtility.getQueries(getPatterns());
	}

	public static CompletePattern getProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.getGraph().getNodes().get(0).addOutgoing().getTarget().makePrimitive();
		completePattern.createXmlAdaption();
		return completePattern;
	}

	public static CompletePattern getValue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getProperty();
		completePattern.getGraph().getNodes().get(1).addPrimitiveComparison();
		return completePattern;
	}

	public static CompletePattern getPropertyNextGraph() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();
		completePattern.getGraph().getNodes().get(0).addOutgoing(g).getTarget().makePrimitive();
		completePattern.createXmlAdaption();
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
		return completePattern;
	}

	public static CompletePattern getValueNextGraph() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPropertyNextGraph();
		((QuantifiedCondition)completePattern.getCondition()).getGraph().getNodes().get(0).addPrimitiveComparison();
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
		return completePattern;
	}
}

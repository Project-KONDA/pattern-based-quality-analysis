package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
//import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.PatternUtility;

public class TestPrimitiveTranslationModificationProblems {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getPrimitiveTranslationTestPattern());
		completePatterns.add(getReferenceTranslationTestPattern());

		PatternUtility.testPatterns(completePatterns);
	}

	public static CompletePattern getPrimitiveTranslationTestPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = factory.createCompletePattern();

		QuantifiedCondition q = factory.createQuantifiedCondition();
		completePattern.setCondition(q);

		Graph g = q.getGraph();

		Node nodeA = completePattern.getGraph().getReturnNodes().get(0);
		nodeA.addOutgoing(g).getTarget().addPrimitiveComparison("test");

		completePattern.createXmlAdaption();

		return completePattern;
	}

	public static CompletePattern getReferenceTranslationTestPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = factory.createCompletePattern();
		Graph g = completePattern.getGraph();

		Node nodeA = g.getReturnNodes().get(0);
		nodeA.setGraph(g);
		Node nodeB = graphFactory.createNode();
		nodeB.setGraph(g);
//		Relation r =
		nodeA.addOutgoing(nodeB);

		completePattern.createXmlAdaption();

		((ComplexNode) g.getReturnNodes().get(0)).getOutgoing().get(0).adaptAsXmlReference();

		return completePattern;
	}

}

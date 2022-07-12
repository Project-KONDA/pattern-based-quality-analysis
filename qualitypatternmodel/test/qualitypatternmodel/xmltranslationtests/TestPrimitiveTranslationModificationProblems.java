package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.xmltestutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.exceptions.*;

public class TestPrimitiveTranslationModificationProblems {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getPrimitiveTranslationTestPattern());
		completePatterns.add(getReferenceTranslationTestPattern());
				
		Test00.test(completePatterns);
	}

	public static CompletePattern getPrimitiveTranslationTestPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		QuantifiedCondition q = factory.createQuantifiedCondition();
		completePattern.setCondition(q);
		
		Graph g = q.getGraph();
		
		Node nodeA = g.getReturnNodes().get(0);
		nodeA.addOutgoing().getTarget().addPrimitiveComparison();
		
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
		Relation r = nodeA.addOutgoing(nodeB);
		
		completePattern.createXmlAdaption();
		
		((ComplexNode) g.getReturnNodes().get(0)).getOutgoing().get(0).adaptAsXmlReference();
		
		return completePattern;
	}

}

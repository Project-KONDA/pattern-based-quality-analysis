package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutility.PatternTestPair;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.*;

public class Test02Return {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternMultipleReturnNavigation());
		completePatterns.add(getPatternMultipleReturnReference());

		Test00.test(completePatterns);
	}

	public static CompletePattern getPatternMultipleReturnNavigation() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
			
		CompletePattern completePattern = Test00.getBasePattern();
		
		Graph graph = completePattern.getGraph();
		Element element1 = completePattern.getGraph().getElements().get(0);
		Element element2 = graphFactory.createElement();		
		element2.setGraph(graph);
		element2.setResultOf(graph);
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph);
		relation.setSource(element1);
		relation.setTarget(element2);		
		
		completePattern.createXMLAdaption();
		completePattern.getGraph().getElements().get(1).getIncoming().get(0).adaptAsXMLNavigation();		
		completePattern.finalizeXMLAdaption();
				
		return completePattern;
	}

	public static CompletePattern getPatternMultipleReturnReference() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
			
		CompletePattern completePattern = Test00.getBasePattern();
		
		Graph graph = completePattern.getGraph();
		Element element1 = completePattern.getGraph().getElements().get(0);
		Element element2 = graphFactory.createElement();		
		element2.setGraph(graph);
		element2.setResultOf(graph);
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph);
		relation.setSource(element1);
		relation.setTarget(element2);		
		
		completePattern.createXMLAdaption();
		XmlReference reference = completePattern.getGraph().getElements().get(1).getIncoming().get(0).adaptAsXMLReference();	
		reference.setType(ReturnType.STRING);
		completePattern.finalizeXMLAdaption();
				
		return completePattern;
	}
	
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("MUL_RET_NAV", getPatternMultipleReturnNavigation(), "for $x1 in /* for $x2 in $x1/* return ($x1, $x2)"));
		testPairs.add(new PatternTestPair("MUL_RET_REF", getPatternMultipleReturnReference(), "for $x1 in /* for $x2 in /*[data()=$x1/data()] return ($x1, $x2)"));
		return testPairs;		
	}
	
}

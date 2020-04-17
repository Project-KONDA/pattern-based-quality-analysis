package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.adaptionxml.XMLNavigation;
import qualitypatternmodel.adaptionxml.XMLReference;
import qualitypatternmodel.graphstructure.*;

public class Test02Return {

	public static void main(String[] args) {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternMultipleReturnNavigation());
		completePatterns.add(getPatternMultipleReturnNestedReference());
//		completePatterns.add(getPatternLateReturn());

		Test00.test(completePatterns);
	}

	public static CompletePattern getPatternMultipleReturnNavigation() {
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
		completePattern.getGraph().getElements().get(2).getIncoming().get(0).adaptAsXMLNavigation();		
		completePattern.finalizeXMLAdaption();
				
		return completePattern;
	}

	public static CompletePattern getPatternMultipleReturnNestedReference() {
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
		XMLReference reference = completePattern.getGraph().getElements().get(2).getIncoming().get(0).adaptAsXMLReference();	
		reference.setType(ReturnType.STRING);
		completePattern.finalizeXMLAdaption();
				
		return completePattern;
	}

//	public static CompletePattern getPatternLateReturn() {
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
//			
//		CompletePattern completePattern = Test00.getBasePattern();
//		Graph return_graph = completePattern.getGraph();
//		
//		Element return2 = graphFactory.createElement();
//		EList<Element> return_elements = return_graph.getReturnElements();
//		return_elements.get(0).getNextElements().add(return2);
//		return_elements.remove(0);
//		return_elements.add(return2);
//		
//		return completePattern;
//	}
	
	public static List<PatternTestPair> getTestPairs(){
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("MULRETNAV", 	getPatternMultipleReturnNavigation(), 		""));
		testPairs.add(new PatternTestPair("MULRETREF", getPatternMultipleReturnNestedReference(), 	""));
//		testPairs.add(new PatternTestPair("LATERET", 	getPatternLateReturn(), 			""));
		// ...
		return testPairs;		
	}
	
}

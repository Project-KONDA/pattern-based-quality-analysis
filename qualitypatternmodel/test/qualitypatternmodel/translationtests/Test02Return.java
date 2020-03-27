package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;

public class Test02Return {

	public static void main(String[] args) {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternMultipleReturn());
		completePatterns.add(getPatternMultipleReturnNested());
		completePatterns.add(getPatternLateReturn());

		Test00.test(completePatterns);
	}

	public static CompletePattern getPatternMultipleReturn() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
			
		CompletePattern completePattern = Test00.getBasePattern();
		Graph return_graph = completePattern.getGraph();
		
		Element root = completePattern.getGraph().getRootElement();
		Element return2 = graphFactory.createElement();
		root.getNextElements().add(return2);
		return_graph.getReturnElements().add(return2);
				
		return completePattern;
	}

	public static CompletePattern getPatternMultipleReturnNested() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		
		Element return2 = graphFactory.createElement();
		completePattern.getGraph().getReturnElements().get(0).getNextElements().add(return2);
		completePattern.getGraph().getReturnElements().add(return2);
		
		return completePattern;
	}

	public static CompletePattern getPatternLateReturn() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
			
		CompletePattern completePattern = Test00.getBasePattern();
		Graph return_graph = completePattern.getGraph();
		
		Element return2 = graphFactory.createElement();
		EList<Element> return_elements = return_graph.getReturnElements();
		return_elements.get(0).getNextElements().add(return2);
		return_elements.remove(0);
		return_elements.add(return2);
		
		return completePattern;
	}
	
	public static List<PatternTestPair> getTestPairs(){
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("MULRET", 	getPatternMultipleReturn(), 		""));
		testPairs.add(new PatternTestPair("MULRETNEST", getPatternMultipleReturnNested(), 	""));
		testPairs.add(new PatternTestPair("LATERET", 	getPatternLateReturn(), 			""));
		// ...
		return testPairs;		
	}
	
}

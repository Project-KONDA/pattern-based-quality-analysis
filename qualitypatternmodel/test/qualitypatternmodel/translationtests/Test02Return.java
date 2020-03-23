package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;

public class Test02Return {

	public static void main(String[] args) {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getPatternMultipleReturn());
		patterns.add(getPatternMultipleReturnNested());
		patterns.add(getPatternLateReturn());

		Test00.test(patterns);
	}

	public static Pattern getPatternMultipleReturn() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
			
		Pattern pattern = Test00.getBasePattern();
		Graph return_graph = pattern.getGraph();
		
		Element root = pattern.getGraph().getRootElement();
		Element return2 = graphFactory.createElement();
		root.getNextElements().add(return2);
		return_graph.getReturnElements().add(return2);
				
		return pattern;
	}

	public static Pattern getPatternMultipleReturnNested() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		Pattern pattern = Test00.getBasePattern();
		
		Element return2 = graphFactory.createElement();
		pattern.getGraph().getReturnElements().get(0).getNextElements().add(return2);
		pattern.getGraph().getReturnElements().add(return2);
		
		return pattern;
	}

	public static Pattern getPatternLateReturn() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
			
		Pattern pattern = Test00.getBasePattern();
		Graph return_graph = pattern.getGraph();
		
		Element return2 = graphFactory.createElement();
		EList<Element> return_elements = return_graph.getReturnElements();
		return_elements.get(0).getNextElements().add(return2);
		return_elements.remove(0);
		return_elements.add(return2);
		
		return pattern;
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

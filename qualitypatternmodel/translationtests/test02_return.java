import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.graphstructure.*;

public class test02_return {

	public static void main(String[] args) {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getPatternMultipleReturn());
		patterns.add(getPatternMultipleReturnNested());
		patterns.add(getPatternLateReturn());

		test00.test(patterns);
	}

	public static Pattern getPatternMultipleReturn() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
			
		Pattern pattern = test00.getBasePattern();
		Graph return_graph = pattern.getReturnGraph();
		
		SingleElement root = pattern.getReturnGraph().getRootElement();
		SingleElement return2 = graphFactory.createSingleElement();
		root.getNextSingle().add(return2);
		return_graph.getReturnElements().add(return2);
				
		return pattern;
	}

	public static Pattern getPatternMultipleReturnNested() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		Pattern pattern = test00.getBasePattern();
		
		SingleElement return2 = graphFactory.createSingleElement();
		pattern.getReturnGraph().getReturnElements().get(0).getNextSingle().add(return2);
		pattern.getReturnGraph().getReturnElements().add(return2);
		
		return pattern;
	}

	public static Pattern getPatternLateReturn() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
			
		Pattern pattern = test00.getBasePattern();
		Graph return_graph = pattern.getReturnGraph();
		
		SingleElement return2 = graphFactory.createSingleElement();
		EList<SingleElement> return_elements = return_graph.getReturnElements();
		return_elements.get(0).getNextSingle().add(return2);
		return_elements.remove(0);
		return_elements.add(return2);
		
		return pattern;
	}
	
}

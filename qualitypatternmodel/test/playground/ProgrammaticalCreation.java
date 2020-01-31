package playground;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class ProgrammaticalCreation {
	
	public static void main(String[] args) {
		PatternstructurePackage.eINSTANCE.eClass();		
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		Pattern pattern = factory.createPattern();
		QuantifiedCondition condition = factory.createQuantifiedCondition();
		Graph graph = graphFactory.createGraph();
		SingleElement singleElement = graphFactory.createSingleElement();
		singleElement.getNextElements().add(singleElement);
		System.out.println(singleElement.getPrevious());
		
//		System.out.println(pattern.getId() + " " + condition.getId() + " "+ graph.getId() + " " + singleElement.getId());
	}

}

package playground;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.patternstructure.Mapping;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.MorphismImpl;

public class ProgrammaticalCreation {
	
	public static void main(String[] args) {
		PatternstructurePackage.eINSTANCE.eClass();		
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		Pattern pattern = factory.createPattern();
		QuantifiedCondition condition = factory.createQuantifiedCondition();
//		Graph graph = graphFactory.createGraph();
		condition.setPattern(pattern);
		System.out.println("morphism oben: " + condition.getMorphism());
//		for(Mapping mapping : pattern.getReturnGraph().getRootElements().getMappingTo()) {
//			System.out.println("mapping in return graph root oben: " + mapping);
//		}
//		System.out.println("mapping in condition graph root unten: " + condition.getGraph().getRootElements().getMappingFrom());
		System.out.println("mappings oben: ");
		for(Mapping mapping : condition.getMorphism().getMappings()) {
			System.out.println(mapping);
		}
		condition.setMorphism(new MorphismImpl());
		System.out.println("morphism unten: " + condition.getMorphism());
		System.out.println("mappings unten: ");
		for(Mapping mapping : condition.getMorphism().getMappings()) {
			System.out.println(mapping);
		}
//		for(Mapping mapping : pattern.getReturnGraph().getRootElements().getMappingTo()) {
//			System.out.println("mapping in return graph root unten: " + mapping);
//		}
//		System.out.println("mapping in condition graph root unten: " + condition.getGraph().getRootElements().getMappingFrom());
		

		
//		SingleElement singleElement = graphFactory.createSingleElement();
//		singleElement.getNextElements().add(singleElement);
//		System.out.println(singleElement.getPrevious());
		
//		System.out.println(pattern.getId() + " " + condition.getId() + " "+ graph.getId() + " " + singleElement.getId());
	}

}

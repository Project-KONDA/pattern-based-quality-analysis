package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.functions.FunctionsFactory;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test06NotElement;

public class Eval03Refint {
	public static void main(String[] args) {
		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getRefintAbstract());
		Test00.test(patterns);
		
	}
	public static Pattern getRefintAbstract() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;		
		
		Pattern pattern = Test06NotElement.getPatternExistsNotExists();
		SingleElement returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);		
		
		returnElementInReturnGraph.addPrimitiveComparison();		
		
		Graph graph1 = ((QuantifiedCondition) pattern.getCondition()).getGraph();
		SingleElement returnElementInGraph1 = graph1.getReturnElements().get(0);				
		SingleElement nextToReturnElementInGraph1 = returnElementInGraph1.getNextSingle().get(0);					
		nextToReturnElementInGraph1.addPrimitiveComparison(); 	
		
		Graph graph2 = ((QuantifiedCondition) ((QuantifiedCondition) pattern.getCondition()).getCondition()).getGraph();
		SingleElement rootElementInGraph2 = graph2.getRootElement();

		SingleElement returnElementInGraph2 = graph2.getReturnElements().get(0);
		SingleElement nextToReturnElementInGraph2 = returnElementInGraph2.getNextSingle().get(0);	
		Property propertyNextToReturnElementInGraph2 = graphFactory.createProperty();
		propertyNextToReturnElementInGraph2.setElement(nextToReturnElementInGraph2);
		
		SingleElement otherRecordInGraph2 = graphFactory.createSingleElement();
		rootElementInGraph2.getNextSingle().add(otherRecordInGraph2);
		otherRecordInGraph2.addPrimitiveComparison();
		
		SingleElement nextToOtherRecordInGraph2 = graphFactory.createSingleElement();
		otherRecordInGraph2.getNextSingle().add(nextToOtherRecordInGraph2);
		nextToOtherRecordInGraph2.addPrimitiveComparison();
		Property propertyNextToOtherRecordInGraph2 = graphFactory.createProperty();
		propertyNextToOtherRecordInGraph2.setElement(nextToOtherRecordInGraph2);
		
		Comparison comparison = functionsFactory.createComparison();
		comparison.setArgument1(propertyNextToReturnElementInGraph2);
		comparison.setArgument2(propertyNextToOtherRecordInGraph2);
		graph2.getOperatorList().add(comparison);
		
		return pattern;
	}
}

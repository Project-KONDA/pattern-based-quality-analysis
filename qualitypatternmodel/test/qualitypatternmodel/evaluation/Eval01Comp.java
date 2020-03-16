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
import qualitypatternmodel.translationtests.Test03Quantor;

public class Eval01Comp {
	public static void main(String[] args) {
		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getCompAbstract());
		Test00.test(patterns);
		
	}
	public static Pattern getCompAbstract() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;		
		
		Pattern pattern = Test03Quantor.getPatternExists();
		SingleElement returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);			
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		Graph graph1 = ((QuantifiedCondition) pattern.getCondition()).getGraph();
		SingleElement returnElementInGraph1 = graph1.getReturnElements().get(0);	
		
		SingleElement next1 = returnElementInGraph1.getNextSingle().get(0);	
		next1.addPrimitiveComparison();
		Property property1 = graphFactory.createProperty();
		property1.setElement(next1);
		
		SingleElement next2 = graphFactory.createSingleElement();
		returnElementInGraph1.getNextSingle().add(next2);
		next2.addPrimitiveComparison();
		Property property2 = graphFactory.createProperty();
		property2.setElement(next2);
		
		Comparison comparison = functionsFactory.createComparison();
		comparison.setArgument1(property1);
		comparison.setArgument2(property2);
		graph1.getOperatorList().add(comparison);		
		
		return pattern;		
	}
}

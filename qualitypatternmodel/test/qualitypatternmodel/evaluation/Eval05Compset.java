package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.functions.FunctionsFactory;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.patternstructure.NotElement;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test06NotElement;

public class Eval05Compset {
	public static void main(String[] args) {
		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getCompsetAbstract());
		Test00.test(patterns);
		
	}
	public static Pattern getCompsetAbstract() {	
		
		Pattern pattern = Test06NotElement.getPatternExistsNotExists();
		SingleElement returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);		
		
		returnElementInReturnGraph.addPrimitiveComparison();		
		
		Graph graph1 = ((QuantifiedCondition) pattern.getCondition()).getGraph();
		SingleElement returnElementInGraph1 = graph1.getReturnElements().get(0);				
		SingleElement nextToReturnElementInGraph1 = returnElementInGraph1.getNextSingle().get(0);					
		nextToReturnElementInGraph1.addPrimitiveComparison(); 	
		
		Graph graph2 = ((QuantifiedCondition) ((NotElement) ((QuantifiedCondition) pattern.getCondition()).getCondition()).getCondition()).getGraph();

		SingleElement returnElementInGraph2 = graph2.getReturnElements().get(0);
		SingleElement nextToReturnElementInGraph2 = returnElementInGraph2.getNextSingle().get(0);	
		nextToReturnElementInGraph2.addPrimitiveComparison();	
		
		return pattern;
		
	}
}

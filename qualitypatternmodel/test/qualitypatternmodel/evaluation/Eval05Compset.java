package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.operators.FunctionsFactory;
import qualitypatternmodel.operators.FunctionsPackage;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test06NotElement;

public class Eval05Compset {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompsetAbstract());
		Test00.test(completePatterns);
		
	}
	public static CompletePattern getCompsetAbstract() {	
		
		CompletePattern completePattern = Test06NotElement.getPatternExistsNotExists();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);		
		
		returnElementInReturnGraph.addPrimitiveComparison();		
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Element returnElementInGraph1 = graph1.getReturnElements().get(0);				
		Element nextToReturnElementInGraph1 = returnElementInGraph1.getNextElements().get(0);					
		nextToReturnElementInGraph1.addPrimitiveComparison(); 	
		
		Graph graph2 = ((QuantifiedCondition) ((NotCondition) ((QuantifiedCondition) completePattern.getCondition()).getCondition()).getCondition()).getGraph();

		Element returnElementInGraph2 = graph2.getReturnElements().get(0);
		Element nextToReturnElementInGraph2 = returnElementInGraph2.getNextElements().get(0);	
		nextToReturnElementInGraph2.addPrimitiveComparison();	
		
		return completePattern;
		
	}
}

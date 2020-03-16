package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.inputfields.InputfieldsFactory;
import qualitypatternmodel.inputfields.TextLiteral;
import qualitypatternmodel.inputfields.UnknownInputValue;
import qualitypatternmodel.inputfields.impl.TextLiteralImpl;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class Eval00Match {
	public static void main(String[] args) {
		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getMatchMidas());
		Test00.test(patterns);
		
	}
	public static Pattern getMatchAbstract() {
		GraphstructurePackage.eINSTANCE.eClass();
		
		Pattern pattern = Test03Quantor.getPatternExists();
		SingleElement returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);		
		
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		SingleElement returnElementInGraph1 = ((QuantifiedCondition) pattern.getCondition()).getGraph().getReturnElements().get(0);				
		SingleElement se2 = returnElementInGraph1.getNextSingle().get(0);	
		
		se2.addPrimitiveComparison(); 		
		se2.addPrimitiveMatch();
		
		return pattern;
	}
	
	public static Pattern getMatchMidas() {
		Pattern pattern = getMatchAbstract();
		SingleElement returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);		
		((UnknownInputValue) returnElementInReturnGraph.getPredicates().get(0).getArguments().get(1)).concretize(new TextLiteralImpl("kue"));
		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		SingleElement returnElementInGraph1 = ((QuantifiedCondition) pattern.getCondition()).getGraph().getReturnElements().get(0);				
		SingleElement se2 = returnElementInGraph1.getNextSingle().get(0);
		((UnknownInputValue) se2.getPredicates().get(0).getArguments().get(1)).concretize(new TextLiteralImpl("3162"));
		se2.getProperties().get(0).getAttributeName().setValue("Type");
		se2.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		((TextLiteral) se2.getPredicates().get(1).getArguments().get(1)).setValue(".*\\?.*");
		se2.getProperties().get(1).getAttributeName().setValue("Value");
		se2.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		return pattern;		
	}
}

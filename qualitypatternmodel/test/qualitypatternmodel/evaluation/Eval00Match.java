package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.inputfields.InputfieldsFactory;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.TextLiteral;
import qualitypatternmodel.inputfields.UnknownInputValue;
import qualitypatternmodel.inputfields.impl.TextLiteralImpl;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
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
		SingleElement element2 = returnElementInGraph1.getNextSingle().get(0);	
		
		element2.addPrimitiveComparison(); 		
		element2.addPrimitiveMatch();
		
		return pattern;
	}
	
	public static Pattern getMatchMidas() {
		
		InputfieldsPackage.eINSTANCE.eClass();
		InputfieldsFactory inputfieldsFactory = InputfieldsFactory.eINSTANCE;
		
		Pattern pattern = getMatchAbstract();
		SingleElement returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);		
		BooleanOperator comparisonReturnElementInReturnGraph = returnElementInReturnGraph.getPredicates().get(0);
		TextLiteral concreteInputValue = inputfieldsFactory.createTextLiteral();
		concreteInputValue.setValue("kue");
		((UnknownInputValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		SingleElement returnElementInGraph1 = ((QuantifiedCondition) pattern.getCondition()).getGraph().getReturnElements().get(0);				
		SingleElement element2 = returnElementInGraph1.getNextSingle().get(0);
		BooleanOperator comparisonElement2 = element2.getPredicates().get(0);
		TextLiteral concreteInputValue2 = inputfieldsFactory.createTextLiteral();
		concreteInputValue2.setValue("3162");
		((UnknownInputValue) comparisonElement2.getArguments().get(1)).concretize(concreteInputValue2);
		element2.getProperties().get(0).getAttributeName().setValue("Type");
		element2.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		BooleanOperator matchElement2 = element2.getPredicates().get(1);
		TextLiteral regularExpression = (TextLiteral) matchElement2.getArguments().get(1);
		regularExpression.setValue(".*\\?.*");
		element2.getProperties().get(1).getAttributeName().setValue("Value");
		element2.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		return pattern;		
	}
}

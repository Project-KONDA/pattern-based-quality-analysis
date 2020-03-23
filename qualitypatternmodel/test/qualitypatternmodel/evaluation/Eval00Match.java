package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
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
		Element returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);		
		
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		Element returnElementInGraph1 = ((QuantifiedCondition) pattern.getCondition()).getGraph().getReturnElements().get(0);				
		Element element2 = returnElementInGraph1.getNextElements().get(0);	
		
		element2.addPrimitiveComparison(); 		
		element2.addPrimitiveMatch();
		
		return pattern;
	}
	
	public static Pattern getMatchMidas() {
		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		Pattern pattern = getMatchAbstract();
		Element returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);		
		BooleanOperator comparisonReturnElementInReturnGraph = returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("kue");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Element returnElementInGraph1 = ((QuantifiedCondition) pattern.getCondition()).getGraph().getReturnElements().get(0);				
		Element element2 = returnElementInGraph1.getNextElements().get(0);
		BooleanOperator comparisonElement2 = element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("3162");
		((UnknownParameterValue) comparisonElement2.getArguments().get(1)).concretize(concreteInputValue2);
		element2.getProperties().get(0).getAttributeName().setValue("Type");
		element2.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		BooleanOperator matchElement2 = element2.getPredicates().get(1);
		TextLiteralParam regularExpression = (TextLiteralParam) matchElement2.getArguments().get(1);
		regularExpression.setValue(".*\\?.*");
		element2.getProperties().get(1).getAttributeName().setValue("Value");
		element2.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		return pattern;		
	}
}

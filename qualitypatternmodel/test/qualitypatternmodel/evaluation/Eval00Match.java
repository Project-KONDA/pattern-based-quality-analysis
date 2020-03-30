package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class Eval00Match {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMatchMidas());
		Test00.test(completePatterns);
		
	}
	public static CompletePattern getMatchAbstract() {
		GraphstructurePackage.eINSTANCE.eClass();
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);		
		
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		Element returnElementInGraph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph().getReturnElements().get(0);				
		Element element2 = returnElementInGraph1.getNextElements().get(0);	
		
		element2.addPrimitiveComparison(); 		
		element2.addPrimitiveMatch();
		
		return completePattern;
	}
	
	public static CompletePattern getMatchMidas() {
		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getMatchAbstract();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);		
		BooleanOperator comparisonReturnElementInReturnGraph = returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("kue");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Element returnElementInGraph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph().getReturnElements().get(0);				
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
		
		return completePattern;		
	}
}

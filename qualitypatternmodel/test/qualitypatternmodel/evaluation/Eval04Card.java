package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.functions.ComparisonOperator;
import qualitypatternmodel.functions.Count;
import qualitypatternmodel.functions.FunctionsFactory;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.SetElement;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class Eval04Card {
	public static void main(String[] args) {
		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getCardMIDAS());
		Test00.test(patterns);		
	}
	
	public static Pattern getCardAbstract() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;	
		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		Pattern pattern = Test03Quantor.getPatternExists();
		SingleElement returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);		

		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		Graph graph1 = ((QuantifiedCondition) pattern.getCondition()).getGraph();
		SingleElement returnElementInGraph1 = graph1.getReturnElements().get(0);	
		SingleElement nextToReturnElementInGraph1 = returnElementInGraph1.getNextSingle().get(0);	
		nextToReturnElementInGraph1.addPrimitiveComparison(); 	
		
		SetElement setElement1InGraph1 = graphFactory.createSetElement();
		nextToReturnElementInGraph1.getNextSet().add(setElement1InGraph1);
		setElement1InGraph1.addPrimitiveComparison();
		setElement1InGraph1.addPrimitiveComparison();
		
		SetElement setElement2InGraph1 = graphFactory.createSetElement();
		setElement1InGraph1.getNext().add(setElement2InGraph1);
		setElement2InGraph1.addPrimitiveComparison();
		
		Comparison comparison = functionsFactory.createComparison();
		graph1.getOperatorList().add(comparison);
		
		UnknownParameterValue unknownParameterValue = parametersFactory.createUnknownParameterValue();
		pattern.getParameterList().add(unknownParameterValue);
		
		comparison.setArgument1(unknownParameterValue);
		
		Count count = functionsFactory.createCount();
		graph1.getOperatorList().add(count);
		comparison.setArgument2(count);
		
		count.setArgument(setElement1InGraph1);
		
		comparison.getElements().add(nextToReturnElementInGraph1);
		
		return pattern;
	}
	
	public static Pattern getCardMIDAS() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		Pattern pattern = getCardAbstract();
		
		SingleElement returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);			
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		pattern.getParameterList().add(concreteInputValue);
		concreteInputValue.setValue("obj");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Graph graph1 = ((QuantifiedCondition) pattern.getCondition()).getGraph();
		SingleElement returnElementInGraph1 = graph1.getReturnElements().get(0);
		SingleElement nextToReturnElementInGraph1 = returnElementInGraph1.getNextSingle().get(0);	
		nextToReturnElementInGraph1.getRelationFromPrevious().getOption().setValue(Axis.DESCENDANT_OR_SELF);
		Comparison comparisonNextToReturnElementInGraph1 = (Comparison) nextToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		pattern.getParameterList().add(concreteInputValue2);
		concreteInputValue2.setValue("h1:Block");
		((UnknownParameterValue) comparisonNextToReturnElementInGraph1.getArguments().get(1)).concretize(concreteInputValue2);
		nextToReturnElementInGraph1.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		
		Comparison comparisonCount = (Comparison) nextToReturnElementInGraph1.getPredicates().get(1);
		comparisonCount.getOption().getOptions().add(ComparisonOperator.GREATER);
		comparisonCount.getOption().setValue(ComparisonOperator.GREATER);
		NumberParam concreteInputValue3 = parametersFactory.createNumberParam();
		pattern.getParameterList().add(concreteInputValue3);
		concreteInputValue3.setValue(1.0);
		((UnknownParameterValue) comparisonCount.getArguments().get(0)).concretize(concreteInputValue3);	
		
		SetElement setElement1InGraph1 = nextToReturnElementInGraph1.getNextSet().get(0);			
		Comparison comparison1Set1 = (Comparison) setElement1InGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		pattern.getParameterList().add(concreteInputValue4);
		concreteInputValue4.setValue("ob30");
		((UnknownParameterValue) comparison1Set1.getArguments().get(1)).concretize(concreteInputValue4);
		setElement1InGraph1.getProperties().get(0).getAttributeName().setValue("Type");
		setElement1InGraph1.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
				
		Comparison comparison2Set1 = (Comparison) setElement1InGraph1.getPredicates().get(1);
		TextLiteralParam concreteInputValue5 = parametersFactory.createTextLiteralParam();
		pattern.getParameterList().add(concreteInputValue5);
		concreteInputValue5.setValue("Herstellung");
		((UnknownParameterValue) comparison2Set1.getArguments().get(1)).concretize(concreteInputValue5);
		setElement1InGraph1.getProperties().get(1).getAttributeName().setValue("Value");
		setElement1InGraph1.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		SetElement setElement2InGraph1 = setElement1InGraph1.getNext().get(0);	
		Comparison comparison1Set2 = (Comparison) setElement2InGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue6 = parametersFactory.createTextLiteralParam();
		pattern.getParameterList().add(concreteInputValue6);
		concreteInputValue6.setValue("ob30rl");
		((UnknownParameterValue) comparison1Set2.getArguments().get(1)).concretize(concreteInputValue6);
		setElement2InGraph1.getProperties().get(0).getAttributeName().setValue("Type");
		setElement2InGraph1.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		return pattern;		
	}
}

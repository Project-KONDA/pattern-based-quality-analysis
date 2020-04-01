package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.FunctionsFactory;
import qualitypatternmodel.operators.FunctionsPackage;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;
import qualitypatternmodel.translationtests.Test12Count;

public class Eval04Card {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCardMidas());
		Test00.test(completePatterns);		
	}
	
	public static CompletePattern getCardAbstract() {	
		
		CompletePattern pattern = Test12Count.getPatternCountInPattern();		
		
		return pattern;
	}
	
	public static CompletePattern getCardAbstractMidas() {	
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern pattern = Test12Count.getPatternCountInPattern();	
		pattern.getGraph().getReturnElements().get(0).getRelationFromPrevious().getOption().setValue(Axis.DESCENDANT);
		CountCondition condition = (CountCondition) pattern.getCondition();
		CountPattern countPattern = (CountPattern) condition.getArgument1();
		Element element2InC = countPattern.getGraph()
				.getReturnElements()
				.get(0);				
		Element element3InC = graphstructureFactory.createElement();
		element3InC.setPreviousElement(element2InC);
		element3InC.addPrimitiveComparison();
		element3InC.addPrimitiveComparison();
		Element element4InC = graphstructureFactory.createElement();
		element4InC.setPreviousElement(element3InC);
		element4InC.addPrimitiveComparison();
		
		countPattern.getGraph().getReturnElements().clear();
		countPattern.getGraph().getReturnElements().add(element3InC);
		
		return pattern;
	}
	
	public static CompletePattern getCardMidas() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern pattern = getCardAbstractMidas();
		
		Element returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);			
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("obj");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		CountCondition countCondition = (CountCondition) pattern.getCondition();
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);
		NumberElement numberElement = (NumberElement) countCondition.getArgument2();		
		numberElement.getNumberParam().setValue(1.0);
		CountPattern countPattern = (CountPattern) countCondition.getArgument1();
		Graph graph1 = countPattern.getGraph();
		
		Element returnElementInGraph1 = graph1.getRootElement().getNextElements().get(0);
		Element nextToReturnElementInGraph1 = returnElementInGraph1.getNextElements().get(0);	
		nextToReturnElementInGraph1.getRelationFromPrevious().getOption().setValue(Axis.DESCENDANT_OR_SELF);
		Comparison comparisonNextToReturnElementInGraph1 = (Comparison) nextToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("h1:Block");
		((UnknownParameterValue) comparisonNextToReturnElementInGraph1.getArguments().get(1)).concretize(concreteInputValue2);
		nextToReturnElementInGraph1.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		
//		Comparison comparisonCount = (Comparison) nextToReturnElementInGraph1.getPredicates().get(1);
//		comparisonCount.getOption().getOptions().add(ComparisonOperator.GREATER);
//		comparisonCount.getOption().setValue(ComparisonOperator.GREATER);
//		NumberParam concreteInputValue3 = parametersFactory.createNumberParam();
//		concreteInputValue3.setValue(1.0);
//		((UnknownParameterValue) comparisonCount.getArguments().get(0)).concretize(concreteInputValue3);	
		System.out.println(nextToReturnElementInGraph1.getPredicates().size());
		Element setElement1InGraph1 = nextToReturnElementInGraph1.getNextElements().get(0);			
		Comparison comparison1Set1 = (Comparison) setElement1InGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("ob30");
		((UnknownParameterValue) comparison1Set1.getArguments().get(1)).concretize(concreteInputValue4);
		setElement1InGraph1.getProperties().get(0).getAttributeName().setValue("Type");
		setElement1InGraph1.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
				
		Comparison comparison2Set1 = (Comparison) setElement1InGraph1.getPredicates().get(1);
		TextLiteralParam concreteInputValue5 = parametersFactory.createTextLiteralParam();
		concreteInputValue5.setValue("Herstellung");
		((UnknownParameterValue) comparison2Set1.getArguments().get(1)).concretize(concreteInputValue5);
		setElement1InGraph1.getProperties().get(1).getAttributeName().setValue("Value");
		setElement1InGraph1.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Element setElement2InGraph1 = setElement1InGraph1.getNextElements().get(0);	
		Comparison comparison1Set2 = (Comparison) setElement2InGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue6 = parametersFactory.createTextLiteralParam();
		concreteInputValue6.setValue("ob30rl");
		((UnknownParameterValue) comparison1Set2.getArguments().get(1)).concretize(concreteInputValue6);
		setElement2InGraph1.getProperties().get(0).getAttributeName().setValue("Type");
		setElement2InGraph1.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		return pattern;		
	}
}

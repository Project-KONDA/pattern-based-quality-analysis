package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.FunctionsFactory;
import qualitypatternmodel.operators.FunctionsPackage;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test06NotElement;

public class Eval03Refint {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getRefintMidas());
		Test00.test(completePatterns);
		
	}
	public static CompletePattern getRefintAbstract() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;		
		
		CompletePattern completePattern = Test06NotElement.getPatternExistsNotExists();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);		
		
		returnElementInReturnGraph.addPrimitiveComparison();		
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Element returnElementInGraph1 = graph1.getReturnElements().get(0);				
		Element nextToReturnElementInGraph1 = returnElementInGraph1.getNextElements().get(0);					
		nextToReturnElementInGraph1.addPrimitiveComparison(); 	
		
		Graph graph2 = ((QuantifiedCondition) ((NotCondition) ((QuantifiedCondition) completePattern.getCondition()).getCondition()).getCondition()).getGraph();
		Element rootElementInGraph2 = graph2.getRootElement();

		Element returnElementInGraph2 = graph2.getReturnElements().get(0);
		Element nextToReturnElementInGraph2 = returnElementInGraph2.getNextElements().get(0);	
		Property propertyNextToReturnElementInGraph2 = graphFactory.createProperty();
		propertyNextToReturnElementInGraph2.setElement(nextToReturnElementInGraph2);
		propertyNextToReturnElementInGraph2.createParameters();
		
		nextToReturnElementInGraph2.getNextElements().clear();
		
		Element otherRecordInGraph2 = graphFactory.createElement();
		rootElementInGraph2.getNextElements().add(otherRecordInGraph2);
		otherRecordInGraph2.addPrimitiveComparison();
		
		Element nextToOtherRecordInGraph2 = graphFactory.createElement();
		otherRecordInGraph2.getNextElements().add(nextToOtherRecordInGraph2);
		nextToOtherRecordInGraph2.addPrimitiveComparison();
		Property propertyNextToOtherRecordInGraph2 = graphFactory.createProperty();
		propertyNextToOtherRecordInGraph2.setElement(nextToOtherRecordInGraph2);
		propertyNextToOtherRecordInGraph2.createParameters();
		
		Comparison comparison = functionsFactory.createComparison();
		graph2.getOperatorList().add(comparison);
		comparison.createParameters();
		comparison.setArgument1(propertyNextToReturnElementInGraph2);
		comparison.setArgument2(propertyNextToOtherRecordInGraph2);
		
		return completePattern;
	}
	
	public static CompletePattern getRefintMidas() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getRefintAbstract();
		
		Element returnInReturnGraph = completePattern.getGraph().getRootElement().getNextElements().get(0);
		returnInReturnGraph.getRelationFromPrevious().getOption().setValue(Axis.DESCENDANT);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("obj");
		((UnknownParameterValue) ((Comparison) returnInReturnGraph.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue);
		returnInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Element element1 = graph1.getRootElement().getNextElements().get(0).getNextElements().get(0);
		element1.getRelationFromPrevious().getOption().setValue(Axis.DESCENDANT);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("3600");
		((UnknownParameterValue) ((Comparison) element1.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue2);
		element1.getProperties().get(0).getAttributeName().setValue("Type");
		element1.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Graph graph2 = ((QuantifiedCondition) ((NotCondition) ((QuantifiedCondition) completePattern.getCondition()).getCondition()).getCondition()).getGraph();
		Element element1InGraph2 = graph2.getRootElement().getNextElements().get(0).getNextElements().get(0);
		Element element2 = graph2.getRootElement().getNextElements().get(1);
		element2.getRelationFromPrevious().getOption().setValue(Axis.DESCENDANT);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("wer");
		((UnknownParameterValue) ((Comparison) element2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue3);
		element2.getProperties().get(0).getAttributeName().setValue("Type");
		element2.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Element element3 = element2.getNextElements().get(0);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("3600");
		((UnknownParameterValue) ((Comparison) element3.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue4);
		element3.getProperties().get(0).getAttributeName().setValue("Type");
		element3.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);		
		
		element1InGraph2.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		element1InGraph2.getProperties().get(0).getAttributeName().setValue("Value");
		
		element3.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		element3.getProperties().get(1).getAttributeName().setValue("Value");
		
		((Comparison) element3.getPredicates().get(1)).setType(ReturnType.STRING);
		
		return completePattern;		
	}
	
	public static CompletePattern getRefintAbstractRunningExample() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;		
		
		CompletePattern completePattern = Test06NotElement.getPatternExistsNotExists();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);		
		
		returnElementInReturnGraph.addPrimitiveComparison();		
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Element returnElementInGraph1 = graph1.getReturnElements().get(0);				
		Element nextToReturnElementInGraph1 = returnElementInGraph1.getNextElements().get(0);					
		nextToReturnElementInGraph1.addPrimitiveComparison(); 	
		
		Graph graph2 = ((QuantifiedCondition) ((NotCondition) ((QuantifiedCondition) completePattern.getCondition()).getCondition()).getCondition()).getGraph();
		Element rootElementInGraph2 = graph2.getRootElement();

		Element returnElementInGraph2 = graph2.getReturnElements().get(0);
		Element nextToReturnElementInGraph2 = returnElementInGraph2.getNextElements().get(0);
		nextToReturnElementInGraph2.getNextElements().clear();
		Property propertyNextToReturnElementInGraph2 = graphFactory.createProperty();
		propertyNextToReturnElementInGraph2.setElement(nextToReturnElementInGraph2);
		propertyNextToReturnElementInGraph2.createParameters();
		
		Element otherRecordInGraph2 = graphFactory.createElement();
		rootElementInGraph2.getNextElements().add(otherRecordInGraph2);
		otherRecordInGraph2.addPrimitiveComparison();		
		
		Property propertyNextToOtherRecordInGraph2 = graphFactory.createProperty();
		propertyNextToOtherRecordInGraph2.setElement(otherRecordInGraph2);
		propertyNextToOtherRecordInGraph2.createParameters();
		
		Comparison comparison = functionsFactory.createComparison();
		graph2.getOperatorList().add(comparison);
		comparison.createParameters();
		comparison.setArgument1(propertyNextToReturnElementInGraph2);
		comparison.setArgument2(propertyNextToOtherRecordInGraph2);
		
		return completePattern;
	}
	
	public static CompletePattern getRefintRunningExample() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getRefintAbstractRunningExample();
		
		Element returnInReturnGraph = completePattern.getGraph().getRootElement().getNextElements().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("building");
		((UnknownParameterValue) ((Comparison) returnInReturnGraph.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue);
		returnInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Element element1 = graph1.getRootElement().getNextElements().get(0).getNextElements().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("creator");
		((UnknownParameterValue) ((Comparison) element1.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue2);
		element1.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		
		Graph graph2 = ((QuantifiedCondition) ((NotCondition) ((QuantifiedCondition) completePattern.getCondition()).getCondition()).getCondition()).getGraph();
		Element element1InGraph2 = graph2.getRootElement().getNextElements().get(0).getNextElements().get(0);
		Element element2 = graph2.getRootElement().getNextElements().get(1);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("artist");
		((UnknownParameterValue) ((Comparison) element2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue3);
		element2.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		
		element2.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		element2.getProperties().get(1).getAttributeName().setValue("id");
		
		element1InGraph2.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		element1InGraph2.getProperties().get(0).getAttributeName().setValue("ref");
		
		((Comparison) element2.getPredicates().get(1)).setType(ReturnType.STRING);
		
		return completePattern;		
	}
}

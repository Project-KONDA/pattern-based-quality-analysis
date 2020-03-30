package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.impl.PropertyImpl;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.FunctionsFactory;
import qualitypatternmodel.operators.FunctionsPackage;
import qualitypatternmodel.operators.impl.ComparisonImpl;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.graphstructure.impl.ElementImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class Eval06Func {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getFuncRunningExample());
		Test00.test(completePatterns);
		
	}
	
	private static CompletePattern getFuncAbstract() {
		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);		
		
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Element returnElementInGraph1 = graph1.getReturnElements().get(0);				
		Element fieldAReturn = returnElementInGraph1.getNextElements().get(0);	
		Element fieldBReturn = graphFactory.createElement();
		returnElementInGraph1.getNextElements().add(fieldBReturn);
		Element otherRecord = graphFactory.createElement();
		graph1.getRootElement().getNextElements().add(otherRecord);
		Element fieldAOtherRecord = graphFactory.createElement();
		otherRecord.getNextElements().add(fieldAOtherRecord);
		Element fieldBOtherRecord = graphFactory.createElement();
		otherRecord.getNextElements().add(fieldBOtherRecord);
		
		fieldAReturn.addPrimitiveComparison(); 	
		fieldBReturn.addPrimitiveComparison(); 
		otherRecord.addPrimitiveComparison(); 
		fieldAOtherRecord.addPrimitiveComparison(); 
		fieldBOtherRecord.addPrimitiveComparison(); 
		
		Comparison comparisonA = functionsFactory.createComparison();
		graph1.getOperatorList().add(comparisonA);
		comparisonA.createParameters();
		Property propertyAReturn = graphFactory.createProperty();
		propertyAReturn.setElement(fieldAReturn);
		propertyAReturn.createParameters();
		comparisonA.setArgument1(propertyAReturn);
		Property propertyAOtherRecord = propertyAReturn.copy();
		propertyAOtherRecord.setElement(fieldAOtherRecord);
//		propertyAOtherRecord.createParameters();
		comparisonA.setArgument2(propertyAOtherRecord);		
		
		Comparison comparisonB = functionsFactory.createComparison(); 
		graph1.getOperatorList().add(comparisonB);
		comparisonB.createParameters();
		Property propertyBReturn = graphFactory.createProperty();
		propertyBReturn.setElement(fieldBReturn);
		propertyBReturn.createParameters();
		comparisonB.setArgument1(propertyBReturn);
		Property propertyBOtherRecord = propertyBReturn.copy();
		propertyBOtherRecord.setElement(fieldBOtherRecord);
//		propertyBOtherRecord.createParameters();
		comparisonB.setArgument2(propertyBOtherRecord);		
		
		return completePattern;
	}
	
	private static CompletePattern getFuncRunningExample() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getFuncAbstract();
		Element returnInReturnGraph = completePattern.getGraph().getRootElement().getNextElements().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("building");
		((UnknownParameterValue) ((Comparison) returnInReturnGraph.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue);
		returnInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
				
		Graph graph2 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Element returnInGraph2 = graph2.getRootElement().getNextElements().get(0);				
		
		Element elementA1 = returnInGraph2.getNextElements().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("city");
		((UnknownParameterValue) ((Comparison) elementA1.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue2);
		elementA1.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		
		Element elementB1 = returnInGraph2.getNextElements().get(1);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("country");
		((UnknownParameterValue) ((Comparison) elementB1.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue3);
		elementB1.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		
		Element element1 = graph2.getRootElement().getNextElements().get(1);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("building");
		((UnknownParameterValue) ((Comparison) element1.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue4);
		element1.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		
		Element elementA2 = element1.getNextElements().get(0);		
		TextLiteralParam concreteInputValue5 = parametersFactory.createTextLiteralParam();
		concreteInputValue5.setValue("city");
		((UnknownParameterValue) ((Comparison) elementA2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue5);
		elementA2.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		
		Element elementB2 = element1.getNextElements().get(1);		
		TextLiteralParam concreteInputValue6 = parametersFactory.createTextLiteralParam();
		concreteInputValue6.setValue("country");
		((UnknownParameterValue) ((Comparison) elementB2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue6);
		elementB2.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		
		((Comparison) elementB1.getPredicates().get(1)).getOption().setValue(ComparisonOperator.NOTEQUAL);
		
		((Comparison) elementA1.getPredicates().get(1)).setType(ReturnType.STRING);
		((Comparison) elementB1.getPredicates().get(1)).setType(ReturnType.STRING);
		
		return completePattern;
	}

}

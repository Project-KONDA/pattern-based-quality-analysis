package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.impl.PropertyImpl;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.OperatorsPackage;
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
		
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;
		
		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);			
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		Graph graph1 = quantifiedCondition.getGraph();
		Element returnElementInGraph1 = graph1.getElements().get(0);
		
		Element fieldAReturn = graph1.getElements().get(1);	
		
		Element fieldBReturn = graphFactory.createElement();
		fieldBReturn.setGraph(graph1);
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph1);
		relation.setSource(returnElementInGraph1);
		relation.setTarget(fieldBReturn);
		
		Element otherRecord = graphFactory.createElement();
		otherRecord.setGraph(graph1);
		
		Element fieldAOtherRecord = graphFactory.createElement();
		fieldAOtherRecord.setGraph(graph1);
		Relation relation2 = graphFactory.createRelation();
		relation2.setGraph(graph1);
		relation2.setSource(otherRecord);
		relation2.setTarget(fieldAOtherRecord);
		
		Element fieldBOtherRecord = graphFactory.createElement();
		fieldBOtherRecord.setGraph(graph1);
		Relation relation3 = graphFactory.createRelation();
		relation3.setGraph(graph1);
		relation3.setSource(otherRecord);
		relation3.setTarget(fieldBOtherRecord);
		
		fieldAReturn.addPrimitiveComparison(); 	
		fieldBReturn.addPrimitiveComparison(); 
		otherRecord.addPrimitiveComparison(); 
		fieldAOtherRecord.addPrimitiveComparison(); 
		fieldBOtherRecord.addPrimitiveComparison(); 
		
		Comparison comparisonA = operatorsFactory.createComparison();
		graph1.getOperatorList().add(comparisonA);
		comparisonA.createParameters();
		Property propertyAReturn = graphFactory.createProperty();
		propertyAReturn.setElement(fieldAReturn);
		propertyAReturn.createParameters();
		comparisonA.setArgument1(propertyAReturn);
		Property propertyAOtherRecord = propertyAReturn.copy();
		propertyAOtherRecord.setElement(fieldAOtherRecord);
		comparisonA.setArgument2(propertyAOtherRecord);		
		
		Comparison comparisonB = operatorsFactory.createComparison(); 
		graph1.getOperatorList().add(comparisonB);
		comparisonB.createParameters();
		Property propertyBReturn = graphFactory.createProperty();
		propertyBReturn.setElement(fieldBReturn);
		propertyBReturn.createParameters();
		comparisonB.setArgument1(propertyBReturn);
		Property propertyBOtherRecord = propertyBReturn.copy();
		propertyBOtherRecord.setElement(fieldBOtherRecord);
		comparisonB.setArgument2(propertyBOtherRecord);		
		
		completePattern.createXMLAdaption();
		graph1.getRelations().get(0).adaptAsXMLNavigation();
		relation.adaptAsXMLNavigation();
		relation2.adaptAsXMLNavigation();
		relation3.adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}
	
	private static CompletePattern getFuncAbstractLido() {

		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;
		
		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);				
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Element below = graph1.getElements().get(1);	
		below.addPrimitiveComparison();
		
		Element fieldAReturn = graphFactory.createElement();
		fieldAReturn.setGraph(graph1);
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph1);
		relation.setSource(below);
		relation.setTarget(fieldAReturn);
		
		Element fieldBReturn = graphFactory.createElement();
		fieldBReturn.setGraph(graph1);
		Relation relation2 = graphFactory.createRelation();
		relation2.setGraph(graph1);
		relation2.setSource(below);
		relation2.setTarget(fieldBReturn);
		
		Element otherRecord = graphFactory.createElement();
		otherRecord.setGraph(graph1);
		otherRecord.addPrimitiveComparison();
		
		Element fieldAOtherRecord = graphFactory.createElement();
		fieldAOtherRecord.setGraph(graph1);
		Relation relation3 = graphFactory.createRelation();
		relation3.setGraph(graph1);
		relation3.setSource(otherRecord);
		relation3.setTarget(fieldAOtherRecord);
		
		Element fieldBOtherRecord = graphFactory.createElement();
		fieldBOtherRecord.setGraph(graph1);
		Relation relation4 = graphFactory.createRelation();
		relation4.setGraph(graph1);
		relation4.setSource(otherRecord);
		relation4.setTarget(fieldBOtherRecord);
		
		fieldAReturn.addPrimitiveComparison(); 	
		fieldBReturn.addPrimitiveComparison(); 
		fieldAOtherRecord.addPrimitiveComparison(); 
		fieldBOtherRecord.addPrimitiveComparison(); 
		
		Comparison comparisonA = operatorsFactory.createComparison();
		comparisonA.setType(ReturnType.STRING);
		graph1.getOperatorList().add(comparisonA);
		comparisonA.createParameters();
		Property propertyAReturn = graphFactory.createProperty();
		propertyAReturn.setElement(fieldAReturn);
		propertyAReturn.createParameters();
		comparisonA.setArgument1(propertyAReturn);
		Property propertyAOtherRecord = propertyAReturn.copy();
		propertyAOtherRecord.setElement(fieldAOtherRecord);
		comparisonA.setArgument2(propertyAOtherRecord);		
		
		Comparison comparisonB = operatorsFactory.createComparison(); 
		comparisonB.setType(ReturnType.STRING);
		graph1.getOperatorList().add(comparisonB);
		comparisonB.createParameters();
		Property propertyBReturn = graphFactory.createProperty();
		propertyBReturn.setElement(fieldBReturn);
		propertyBReturn.createParameters();
		comparisonB.setArgument1(propertyBReturn);
		Property propertyBOtherRecord = propertyBReturn.copy();
		propertyBOtherRecord.setElement(fieldBOtherRecord);
		comparisonB.setArgument2(propertyBOtherRecord);		
		
		completePattern.createXMLAdaption();
		graph1.getRelations().get(0).adaptAsXMLNavigation();
		relation.adaptAsXMLNavigation();
		relation2.adaptAsXMLNavigation();
		relation3.adaptAsXMLNavigation();
		relation4.adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}
	
	private static CompletePattern getFuncMidas() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getFuncAbstract();
		Element returnInReturnGraph = completePattern.getGraph().getElements().get(0);
		XmlNavigation relation = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		relation.getOption().setValue(RelationKind.DESCENDANT);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("wer");
		((UnknownParameterValue) ((Comparison) returnInReturnGraph.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue);
		((XmlProperty) returnInReturnGraph.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) returnInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
				
		Graph graph2 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		
		Element elementA1 = graph2.getElements().get(1);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("3600");
		((UnknownParameterValue) ((Comparison) elementA1.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue2);
		((XmlProperty) elementA1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) elementA1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		((XmlProperty) elementA1.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) elementA1.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Element elementB1 = graph2.getElements().get(2);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("3680");
		((UnknownParameterValue) ((Comparison) elementB1.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue3);
		((XmlProperty) elementB1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) elementB1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		((XmlProperty) elementB1.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) elementB1.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Element element1 = graph2.getElements().get(3);
		XmlNavigation relation2 = (XmlNavigation) graph2.getRelations().get(5);
		relation2.getOption().setValue(RelationKind.DESCENDANT);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("wer");
		((UnknownParameterValue) ((Comparison) element1.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue4);
		((XmlProperty) element1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) element1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Element elementA2 = graph2.getElements().get(4);		
		TextLiteralParam concreteInputValue5 = parametersFactory.createTextLiteralParam();
		concreteInputValue5.setValue("3600");
		((UnknownParameterValue) ((Comparison) elementA2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue5);
		((XmlProperty) elementA2.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) elementA2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		((XmlProperty) elementA2.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) elementA2.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Element elementB2 = graph2.getElements().get(5);		
		TextLiteralParam concreteInputValue6 = parametersFactory.createTextLiteralParam();
		concreteInputValue6.setValue("3680");
		((UnknownParameterValue) ((Comparison) elementB2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue6);
		((XmlProperty) elementB2.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) elementB2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		((XmlProperty) elementB2.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) elementB2.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		((Comparison) elementB1.getPredicates().get(1)).getOption().setValue(ComparisonOperator.NOTEQUAL);
		
		((Comparison) elementA1.getPredicates().get(1)).setType(ReturnType.STRING);
		((Comparison) elementB1.getPredicates().get(1)).setType(ReturnType.STRING);
		
		return completePattern;
	}
	
	private static CompletePattern getFuncLido() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getFuncAbstractLido();
		Element returnInReturnGraph = completePattern.getGraph().getElements().get(0);
		XmlNavigation relation = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		relation.getOption().setValue(RelationKind.DESCENDANT);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("lido:lido");
		((UnknownParameterValue) ((Comparison) returnInReturnGraph.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue);
		((XmlProperty) returnInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
				
		Graph graph2 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Element below = graph2.getElements().get(1);
		XmlNavigation relation2 = (XmlNavigation) graph2.getRelations().get(6);
		relation2.getOption().setValue(RelationKind.DESCENDANT);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("lido:termMaterialsTech");
		((UnknownParameterValue) ((Comparison) below.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue1);
		((XmlProperty) below.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Element elementA1 = graph2.getElements().get(2);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("lido:conceptID");
		((UnknownParameterValue) ((Comparison) elementA1.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue2);
		((XmlProperty) elementA1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) elementA1.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
		
		Element elementB1 = graph2.getElements().get(3);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("lido:term");
		((UnknownParameterValue) ((Comparison) elementB1.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue3);
		((XmlProperty) elementB1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) elementB1.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
		
		Element element1 = graph2.getElements().get(4);
		XmlNavigation relation3 = (XmlNavigation) graph2.getRelations().get(5);
		relation3.getOption().setValue(RelationKind.DESCENDANT);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("lido:termMaterialsTech");
		((UnknownParameterValue) ((Comparison) element1.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue4);
		((XmlProperty) element1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Element elementA2 = graph2.getElements().get(5);		
		TextLiteralParam concreteInputValue5 = parametersFactory.createTextLiteralParam();
		concreteInputValue5.setValue("lido:conceptID");
		((UnknownParameterValue) ((Comparison) elementA2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue5);
		((XmlProperty) elementA2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) elementA2.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
		
		Element elementB2 = graph2.getElements().get(6);		
		TextLiteralParam concreteInputValue6 = parametersFactory.createTextLiteralParam();
		concreteInputValue6.setValue("lido:term");
		((UnknownParameterValue) ((Comparison) elementB2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue6);
		((XmlProperty) elementB2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) elementB2.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
		
		((Comparison) elementB1.getPredicates().get(1)).getOption().setValue(ComparisonOperator.NOTEQUAL);
		
		((Comparison) elementA1.getPredicates().get(1)).setType(ReturnType.STRING);
		((Comparison) elementB1.getPredicates().get(1)).setType(ReturnType.STRING);
		
		return completePattern;
	}
	
	private static CompletePattern getFuncRunningExample() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getFuncAbstract();
		Element returnInReturnGraph = completePattern.getGraph().getElements().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("building");
		((UnknownParameterValue) ((Comparison) returnInReturnGraph.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue);
		((XmlProperty) returnInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
				
		Graph graph2 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		
		Element elementA1 = graph2.getElements().get(1);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("city");
		((UnknownParameterValue) ((Comparison) elementA1.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue2);
		((XmlProperty) elementA1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Element elementB1 = graph2.getElements().get(2);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("country");
		((UnknownParameterValue) ((Comparison) elementB1.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue3);
		((XmlProperty) elementB1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Element element1 = graph2.getElements().get(3);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("building");
		((UnknownParameterValue) ((Comparison) element1.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue4);
		((XmlProperty) element1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Element elementA2 = graph2.getElements().get(4);		
		TextLiteralParam concreteInputValue5 = parametersFactory.createTextLiteralParam();
		concreteInputValue5.setValue("city");
		((UnknownParameterValue) ((Comparison) elementA2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue5);
		((XmlProperty) elementA2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Element elementB2 = graph2.getElements().get(5);		
		TextLiteralParam concreteInputValue6 = parametersFactory.createTextLiteralParam();
		concreteInputValue6.setValue("country");
		((UnknownParameterValue) ((Comparison) elementB2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue6);
		((XmlProperty) elementB2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((Comparison) elementB1.getPredicates().get(1)).getOption().setValue(ComparisonOperator.NOTEQUAL);
		
		((Comparison) elementA1.getPredicates().get(1)).setType(ReturnType.STRING);
		((Comparison) elementB1.getPredicates().get(1)).setType(ReturnType.STRING);
		
		return completePattern;
	}

}

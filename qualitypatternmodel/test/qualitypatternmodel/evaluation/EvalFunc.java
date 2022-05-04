package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.impl.ComparisonImpl;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.graphstructure.impl.NodeImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class EvalFunc {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getFuncRunningExample());
		completePatterns.add(getFuncMidas());
		completePatterns.add(getFuncLido());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);	
	}
	
	private static CompletePattern getFuncAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;
		
		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);			
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		Graph graph1 = quantifiedCondition.getGraph();
		Node returnElementInGraph1 = graph1.getNodes().get(0);
		
		Node fieldAReturn = graph1.getNodes().get(1);	
		
		Node fieldBReturn = graphFactory.createNode();
		fieldBReturn.setGraph(graph1);
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph1);
		relation.setSource(returnElementInGraph1);
		relation.setTarget(fieldBReturn);
		
		Node otherRecord = graphFactory.createNode();
		otherRecord.setGraph(graph1);
		
		Node fieldAOtherRecord = graphFactory.createNode();
		fieldAOtherRecord.setGraph(graph1);
		Relation relation2 = graphFactory.createRelation();
		relation2.setGraph(graph1);
		relation2.setSource(otherRecord);
		relation2.setTarget(fieldAOtherRecord);
		
		Node fieldBOtherRecord = graphFactory.createNode();
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
//		comparisonA.createParameters();
		PrimitiveNode propertyAReturn = graphFactory.createPrimitiveNode();
		propertyAReturn.setElement(fieldAReturn);
//		propertyAReturn.createParameters();
		comparisonA.setArgument1(propertyAReturn);
		PrimitiveNode propertyAOtherRecord = propertyAReturn.copy();
		propertyAOtherRecord.setElement(fieldAOtherRecord);
		comparisonA.setArgument2(propertyAOtherRecord);		
		
		Comparison comparisonB = operatorsFactory.createComparison(); 
		graph1.getOperatorList().add(comparisonB);
//		comparisonB.createParameters();
		PrimitiveNode propertyBReturn = graphFactory.createPrimitiveNode();
		propertyBReturn.setElement(fieldBReturn);
//		propertyBReturn.createParameters();
		comparisonB.setArgument1(propertyBReturn);
		PrimitiveNode propertyBOtherRecord = propertyBReturn.copy();
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
	
	private static CompletePattern getFuncAbstractLido() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;
		
		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		
		Node returnElementInReturnGraph = completePattern.getGraph().getReturnNodes().get(0);				
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Node below = graph1.getNodes().get(1);	
		below.addPrimitiveComparison();
		
		Node fieldAReturn = graphFactory.createNode();
		fieldAReturn.setGraph(graph1);
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph1);
		relation.setSource(below);
		relation.setTarget(fieldAReturn);
		
		Node fieldBReturn = graphFactory.createNode();
		fieldBReturn.setGraph(graph1);
		Relation relation2 = graphFactory.createRelation();
		relation2.setGraph(graph1);
		relation2.setSource(below);
		relation2.setTarget(fieldBReturn);
		
		Node otherRecord = graphFactory.createNode();
		otherRecord.setGraph(graph1);
		otherRecord.addPrimitiveComparison();
		
		Node fieldAOtherRecord = graphFactory.createNode();
		fieldAOtherRecord.setGraph(graph1);
		Relation relation3 = graphFactory.createRelation();
		relation3.setGraph(graph1);
		relation3.setSource(otherRecord);
		relation3.setTarget(fieldAOtherRecord);
		
		Node fieldBOtherRecord = graphFactory.createNode();
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
		graph1.getOperatorList().add(comparisonA);
//		comparisonA.createParameters();
		comparisonA.getTypeOption().setValue(ReturnType.STRING);
		PrimitiveNode propertyAReturn = graphFactory.createPrimitiveNode();
		propertyAReturn.setElement(fieldAReturn);
//		propertyAReturn.createParameters();
		comparisonA.setArgument1(propertyAReturn);
		PrimitiveNode propertyAOtherRecord = propertyAReturn.copy();
		propertyAOtherRecord.setElement(fieldAOtherRecord);
		comparisonA.setArgument2(propertyAOtherRecord);		
		
		Comparison comparisonB = operatorsFactory.createComparison(); 		
		graph1.getOperatorList().add(comparisonB);
//		comparisonB.createParameters();
		comparisonB.getTypeOption().setValue(ReturnType.STRING);
		PrimitiveNode propertyBReturn = graphFactory.createPrimitiveNode();
		propertyBReturn.setElement(fieldBReturn);
//		propertyBReturn.createParameters();
		comparisonB.setArgument1(propertyBReturn);
		PrimitiveNode propertyBOtherRecord = propertyBReturn.copy();
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
	
	static CompletePattern getFuncMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getFuncAbstract();
		Node returnInReturnGraph = completePattern.getGraph().getNodes().get(0);
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(AxisKind.THREECHILD);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("wer");
		((UntypedParameterValue) ((Comparison) returnInReturnGraph.getPredicates().get(0)).getArgument2()).replace(concreteInputValue);
		((XmlProperty) returnInReturnGraph.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) returnInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
				
		Graph graph2 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		
		Node elementA1 = graph2.getNodes().get(1);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("3600");
		((UntypedParameterValue) ((Comparison) elementA1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue2);
		((XmlProperty) elementA1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) elementA1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		((XmlProperty) elementA1.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) elementA1.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Node elementB1 = graph2.getNodes().get(2);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("3680");
		((UntypedParameterValue) ((Comparison) elementB1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue3);
		((XmlProperty) elementB1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) elementB1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		((XmlProperty) elementB1.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) elementB1.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Node element1 = graph2.getNodes().get(3);
		((XmlNavigation) graph2.getRelations().get(5)).getOption().setValue(AxisKind.THREECHILD);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("wer");
		((UntypedParameterValue) ((Comparison) element1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue4);
		((XmlProperty) element1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) element1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Node elementA2 = graph2.getNodes().get(4);		
		TextLiteralParam concreteInputValue5 = parametersFactory.createTextLiteralParam();
		concreteInputValue5.setValue("3600");
		((UntypedParameterValue) ((Comparison) elementA2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue5);
		((XmlProperty) elementA2.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) elementA2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		((XmlProperty) elementA2.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) elementA2.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Node elementB2 = graph2.getNodes().get(5);		
		TextLiteralParam concreteInputValue6 = parametersFactory.createTextLiteralParam();
		concreteInputValue6.setValue("3680");
		((UntypedParameterValue) ((Comparison) elementB2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue6);
		((XmlProperty) elementB2.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) elementB2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		((XmlProperty) elementB2.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) elementB2.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		((Comparison) elementB1.getPredicates().get(1)).getOption().setValue(ComparisonOperator.NOTEQUAL);
		
		((Comparison) elementA1.getPredicates().get(1)).getTypeOption().setValue(ReturnType.STRING);
		((Comparison) elementB1.getPredicates().get(1)).getTypeOption().setValue(ReturnType.STRING);
		
		return completePattern;
	}
	
	static CompletePattern getFuncLido() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getFuncAbstractLido();
		Node returnInReturnGraph = completePattern.getGraph().getNodes().get(0);
		XmlNavigation relation = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		relation.getOption().setValue(AxisKind.TWOCHILD);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("lido:lido");
		((UntypedParameterValue) ((Comparison) returnInReturnGraph.getPredicates().get(0)).getArgument2()).replace(concreteInputValue);
		((XmlProperty) returnInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
				
		Graph graph2 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Node below = graph2.getNodes().get(1);
		XmlNavigation relation2 = (XmlNavigation) graph2.getRelations().get(0);
		relation2.getOption().setValue(AxisKind.SEVENCHILD);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("lido:termMaterialsTech");
		((UntypedParameterValue) ((Comparison) below.getPredicates().get(0)).getArgument2()).replace(concreteInputValue1);
		((XmlProperty) below.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Node elementA1 = graph2.getNodes().get(2);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("lido:conceptID");
		((UntypedParameterValue) ((Comparison) elementA1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue2);
		((XmlProperty) elementA1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) elementA1.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
		
		Node elementB1 = graph2.getNodes().get(3);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("lido:term");
		((UntypedParameterValue) ((Comparison) elementB1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue3);
		((XmlProperty) elementB1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) elementB1.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
		
		Node element1 = graph2.getNodes().get(4);
		// HERE
		XmlNavigation relation3 = (XmlNavigation) graph2.getRelations().get(6);
		relation3.getOption().setValue(AxisKind.NINECHILD);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("lido:termMaterialsTech");
		((UntypedParameterValue) ((Comparison) element1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue4);
		((XmlProperty) element1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Node elementA2 = graph2.getNodes().get(5);		
		TextLiteralParam concreteInputValue5 = parametersFactory.createTextLiteralParam();
		concreteInputValue5.setValue("lido:conceptID");
		((UntypedParameterValue) ((Comparison) elementA2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue5);
		((XmlProperty) elementA2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) elementA2.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
		
		Node elementB2 = graph2.getNodes().get(6);		
		TextLiteralParam concreteInputValue6 = parametersFactory.createTextLiteralParam();
		concreteInputValue6.setValue("lido:term");
		((UntypedParameterValue) ((Comparison) elementB2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue6);
		((XmlProperty) elementB2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) elementB2.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
		
		((Comparison) elementB1.getPredicates().get(1)).getOption().setValue(ComparisonOperator.NOTEQUAL);
		
		((Comparison) elementA1.getPredicates().get(1)).getTypeOption().setValue(ReturnType.STRING);
		((Comparison) elementB1.getPredicates().get(1)).getTypeOption().setValue(ReturnType.STRING);
		
		return completePattern;
	}
	
	private static CompletePattern getFuncRunningExample() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getFuncAbstract();
		Node returnInReturnGraph = completePattern.getGraph().getNodes().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("building");
		((UntypedParameterValue) ((Comparison) returnInReturnGraph.getPredicates().get(0)).getArgument2()).replace(concreteInputValue);
		((XmlProperty) returnInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
				
		Graph graph2 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		
		Node elementA1 = graph2.getNodes().get(1);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("city");
		((UntypedParameterValue) ((Comparison) elementA1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue2);
		((XmlProperty) elementA1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Node elementB1 = graph2.getNodes().get(2);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("country");
		((UntypedParameterValue) ((Comparison) elementB1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue3);
		((XmlProperty) elementB1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Node element1 = graph2.getNodes().get(3);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("building");
		((UntypedParameterValue) ((Comparison) element1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue4);
		((XmlProperty) element1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Node elementA2 = graph2.getNodes().get(4);		
		TextLiteralParam concreteInputValue5 = parametersFactory.createTextLiteralParam();
		concreteInputValue5.setValue("city");
		((UntypedParameterValue) ((Comparison) elementA2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue5);
		((XmlProperty) elementA2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Node elementB2 = graph2.getNodes().get(5);		
		TextLiteralParam concreteInputValue6 = parametersFactory.createTextLiteralParam();
		concreteInputValue6.setValue("country");
		((UntypedParameterValue) ((Comparison) elementB2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue6);
		((XmlProperty) elementB2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((Comparison) elementB1.getPredicates().get(1)).getOption().setValue(ComparisonOperator.NOTEQUAL);
		
		((Comparison) elementA1.getPredicates().get(1)).getTypeOption().setValue(ReturnType.STRING);
		((Comparison) elementB1.getPredicates().get(1)).getTypeOption().setValue(ReturnType.STRING);
		
		return completePattern;
	}

}

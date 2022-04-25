package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.translationtests.Test00;

public class EvalContrel {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getContrelMidas());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);	
	}
	
	public static CompletePattern getContrelAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;		
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getReturnNodes().get(0).addPrimitiveComparison();
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		pattern.setCondition(qc);
		TrueElement trueElement = factory.createTrueElement();
		qc.setCondition(trueElement);
		
		Graph graph = qc.getGraph();		
		
		Node returnInG = graph.getNodes().get(0);
		Node id1 = graphFactory.createNode();
		id1.setGraph(graph);
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph);
		relation.setSource(returnInG);
		relation.setTarget(id1);
		id1.addPrimitiveComparison();
		PrimitiveNode id1Prop = graphFactory.createProperty();
		id1Prop.setElement(id1);
		id1Prop.createParameters();
		
		Node ref1 = graphFactory.createNode();
		ref1.setGraph(graph);
		Relation relation2 = graphFactory.createRelation();
		relation2.setGraph(graph);
		relation2.setSource(returnInG);
		relation2.setTarget(ref1);
		ref1.addPrimitiveComparison();
		PrimitiveNode ref1Prop = graphFactory.createProperty();
		ref1Prop.setElement(ref1);
		ref1Prop.createParameters();
		
		Node val1 = graphFactory.createNode();
		val1.setGraph(graph);
		Relation relation3 = graphFactory.createRelation();
		relation3.setGraph(graph);
		relation3.setSource(ref1);
		relation3.setTarget(val1);
		val1.addPrimitiveComparison();
		PrimitiveNode val1Prop = graphFactory.createProperty();
		val1Prop.setElement(val1);
		val1Prop.createParameters();
		
		Node element2 = graphFactory.createNode();
		element2.setGraph(graph);
		element2.addPrimitiveComparison();
		
		Node id2 = graphFactory.createNode();
		id2.setGraph(graph);
		Relation relation4 = graphFactory.createRelation();
		relation4.setGraph(graph);
		relation4.setSource(element2);
		relation4.setTarget(id2);
		id2.addPrimitiveComparison();
		PrimitiveNode id2Prop = graphFactory.createProperty();
		id2Prop.setElement(id2);
		id2Prop.createParameters();
		
		Node ref2 = graphFactory.createNode();
		ref2.setGraph(graph);
		Relation relation5 = graphFactory.createRelation();
		relation5.setGraph(graph);
		relation5.setSource(element2);
		relation5.setTarget(ref2);
		ref2.addPrimitiveComparison();
		PrimitiveNode ref2Prop = graphFactory.createProperty();
		ref2Prop.setElement(ref2);
		ref2Prop.createParameters();
		
		Node val2 = graphFactory.createNode();
		val2.setGraph(graph);
		Relation relation6 = graphFactory.createRelation();
		relation6.setGraph(graph);
		relation6.setSource(ref2);
		relation6.setTarget(val2);
		val2.addPrimitiveComparison();
		PrimitiveNode val2Prop = graphFactory.createProperty();
		val2Prop.setElement(val2);
		val2Prop.createParameters();
				
		Comparison compId1Val2 = operatorsFactory.createComparison();
		graph.getOperatorList().add(compId1Val2);		
		compId1Val2.createParameters();
		compId1Val2.setArgument1(id1Prop);
		compId1Val2.setArgument2(val2Prop);
		compId1Val2.getTypeOption().setValue(ReturnType.STRING);
		
		Comparison compId2Val1 = operatorsFactory.createComparison();
		graph.getOperatorList().add(compId2Val1);
		compId2Val1.createParameters();
		compId2Val1.setArgument1(id2Prop);
		compId2Val1.setArgument2(val1Prop);
		compId2Val1.getTypeOption().setValue(ReturnType.STRING);
		
		Comparison compRefValue = operatorsFactory.createComparison();
		graph.getOperatorList().add(compRefValue);
		compRefValue.createParameters();
		compRefValue.setArgument1(ref1Prop);
		compRefValue.setArgument2(ref2Prop);
		compRefValue.getTypeOption().setValue(ReturnType.STRING);	
		compRefValue.getOption().setValue(ComparisonOperator.NOTEQUAL);		
		
		pattern.createXMLAdaption();
		relation.adaptAsXMLNavigation();
		relation2.adaptAsXMLNavigation();
		relation3.adaptAsXMLNavigation();
		relation4.adaptAsXMLNavigation();
		relation5.adaptAsXMLNavigation();
		relation6.adaptAsXMLNavigation();
		pattern.finalizeXMLAdaption();
		
		return pattern;
	}
	
	public static CompletePattern getContrelMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getContrelAbstract();
		Node returnElementInReturnGraph = completePattern.getGraph().getReturnNodes().get(0);	
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(RelationKind.THREECHILD);
		
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("kue");
		((UntypedParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).replace(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
//		Element root = graph1.getRootElement();
//		Element returnElementInGraph1 = graph1.getElements().get(0);
		
		Node id1 = graph1.getNodes().get(1);
		Comparison id1Comp1 = (Comparison) id1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("3100");
		((UntypedParameterValue) id1Comp1.getArguments().get(1)).replace(concreteInputValue1);
		((XmlProperty) id1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) id1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		((XmlProperty) id1.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) id1.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Node ref1 = graph1.getNodes().get(2);
		Comparison ref1Comp1 = (Comparison) ref1.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("ku35");
		((UntypedParameterValue) ref1Comp1.getArguments().get(1)).replace(concreteInputValue2);
		((XmlProperty) ref1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) ref1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		((XmlProperty) ref1.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) ref1.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Node val1 = graph1.getNodes().get(3);	
		Comparison val1Comp1 = (Comparison) val1.getPredicates().get(0);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("3600");
		((UntypedParameterValue) val1Comp1.getArguments().get(1)).replace(concreteInputValue3);
		((XmlProperty) val1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) val1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		((XmlProperty) val1.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) val1.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Node element2 = graph1.getNodes().get(4);
		((XmlNavigation) graph1.getRelations().get(7)).getOption().setValue(RelationKind.THREECHILD);
		Comparison element2Comp1 = (Comparison) element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("wer");
		((UntypedParameterValue) element2Comp1.getArguments().get(1)).replace(concreteInputValue4);
		((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Node id2 = graph1.getNodes().get(5);	
		Comparison id2Comp1 = (Comparison) id2.getPredicates().get(0);
		TextLiteralParam concreteInputValue5 = parametersFactory.createTextLiteralParam();
		concreteInputValue5.setValue("3600");
		((UntypedParameterValue) id2Comp1.getArguments().get(1)).replace(concreteInputValue5);
		((XmlProperty) id2.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) id2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		((XmlProperty) id2.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) id2.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);		
		
		Node ref2 = graph1.getNodes().get(6);
		Comparison ref2Comp1 = (Comparison) ref2.getPredicates().get(0);
		TextLiteralParam concreteInputValue6 = parametersFactory.createTextLiteralParam();
		concreteInputValue6.setValue("we30");
		((UntypedParameterValue) ref2Comp1.getArguments().get(1)).replace(concreteInputValue6);
		((XmlProperty) ref2.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) ref2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		((XmlProperty) ref2.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) ref2.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);		
		
		Node val2 = graph1.getNodes().get(7);	
		Comparison val2Comp1 = (Comparison) val2.getPredicates().get(0);
		TextLiteralParam concreteInputValue7 = parametersFactory.createTextLiteralParam();
		concreteInputValue7.setValue("3100");
		((UntypedParameterValue) val2Comp1.getArguments().get(1)).replace(concreteInputValue7);
		((XmlProperty) val2.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) val2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		((XmlProperty) val2.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) val2.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Comparison comparison1 = (Comparison) id1.getPredicates().get(1);
		comparison1.getTypeOption().setValue(ReturnType.STRING);
		
		Comparison comparison2 = (Comparison) val1.getPredicates().get(1);
		comparison2.getTypeOption().setValue(ReturnType.STRING);
		
		Comparison comparison3 = (Comparison) ref1.getPredicates().get(1);
		comparison3.getTypeOption().setValue(ReturnType.STRING);
				
		return completePattern;
	}
}

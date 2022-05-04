package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.AxisKind;
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
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.translationtests.Test00;

public class EvalUnique {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getUniqueAbstract());
		completePatterns.add(getUniqueMidas());
		completePatterns.add(getUniqueLidoLidoRecId());
		completePatterns.add(getUniqueLidoObjectPublishedId());
		completePatterns.add(getUniqueComplexLidoNameActorSet());
//		completePatterns.add(getUniqueLidoEfficientConcrete());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);	
		
	}
	
//	private static CompletePattern getUniqueAbstract() { // not needed anymore
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
//		
//		OperatorsPackage.eINSTANCE.eClass();
//		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;
//		
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;		
//
//		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
//		
//		CompletePattern completePattern = Test00.getBasePattern();
//		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
//		returnElementInReturnGraph.addPrimitiveComparison();
//		
//		CountCondition countCondition = patternStructureFactory.createCountCondition();
//		completePattern.setCondition(countCondition);		
//		
//		CountPattern countPattern = patternStructureFactory.createCountPattern();
//
//		NumberParam numberParam = parametersFactory.createNumberParam();
//		numberParam.setValue(1.0);
//		NumberElement numberElement = patternStructureFactory.createNumberElement();
//		numberElement.setNumberParam(numberParam);
//		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
//		countCondition.getOption().setValue(ComparisonOperator.GREATER);
//		countCondition.setCountPattern(countPattern);
//		countCondition.setArgument2(numberElement);
//		
//		Element returnInCPattern = countPattern.getGraph().getReturnElements().get(0);
//		Element rootInCPattern = countPattern.getGraph().getRootElement();
//		Element nextToRootInCPattern = graphFactory.createNode();
//		nextToRootInCPattern.setPreviousElement(rootInCPattern);
//		countPattern.getGraph().getReturnElements().clear();
//		countPattern.getGraph().getReturnElements().add(nextToRootInCPattern);
//		nextToRootInCPattern.addPrimitiveComparison();
//		
//		Property propertyReturn = graphFactory.createProperty();
//		propertyReturn.setElement(returnInCPattern);
//		propertyReturn.createParameters();
//		
//		Property propertyNextToRoot = propertyReturn.copy();
//		propertyNextToRoot.setElement(nextToRootInCPattern);
//			
//		Comparison comparison = operatorsFactory.createComparison();
//		countPattern.getGraph().getOperatorList().add(comparison);		
//		comparison.createParameters();
//		comparison.setArgument1(propertyReturn);
//		comparison.setArgument2(propertyNextToRoot);	
//		comparison.getOption().setValue(ComparisonOperator.EQUAL);
//		
//		Condition truecondition = patternStructureFactory.createTrueElement();
//		countPattern.setCondition(truecondition);		
//		
//		return completePattern;
//	}
	private static CompletePattern getUniqueComplexAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;
		
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;		

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);	
		returnElementInReturnGraph.addPrimitiveComparison();
		
		
		QuantifiedCondition quantifiedCondition = patternStructureFactory.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);	
		
		Graph graph1 = quantifiedCondition.getGraph();
		
		Node returnG1 = graph1.getNodes().get(0);
		
		Node e1G1 = graphFactory.createNode();
		e1G1.setGraph(graph1);
		e1G1.addPrimitiveComparison();
		Relation r1G1 = graphFactory.createRelation();
		r1G1.setGraph(graph1);
		r1G1.setSource(returnG1);
		r1G1.setTarget(e1G1);
		
		Node e2G1 = graphFactory.createNode();
		e2G1.setGraph(graph1);
		e2G1.addPrimitiveComparison();
		Relation r2G1 = graphFactory.createRelation();
		r2G1.setGraph(graph1);
		r2G1.setSource(e1G1);
		r2G1.setTarget(e2G1);
		
		Node e3G1 = graphFactory.createNode();
		e3G1.setGraph(graph1);
		e3G1.addPrimitiveComparison();
		Relation r3G1 = graphFactory.createRelation();
		r3G1.setGraph(graph1);
		r3G1.setSource(e2G1);
		r3G1.setTarget(e3G1);
		
		CountCondition countCondition = patternStructureFactory.createCountCondition();
		quantifiedCondition.setCondition(countCondition);
		
		CountPattern countPattern = patternStructureFactory.createCountPattern();
		countCondition.setCountPattern(countPattern);
		
		NumberParam numberParam = parametersFactory.createNumberParam();
		numberParam.setValue(1.0);
		NumberElement numberElement = patternStructureFactory.createNumberElement();
		numberElement.setNumberParam(numberParam);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);		
		countCondition.setArgument2(numberElement);
		
		Graph graph2 = countPattern.getGraph();
		
		Node returnInCPattern = countPattern.getGraph().getNodes().get(0);
		Node e1G2 = countPattern.getGraph().getNodes().get(1);
		Node e2G2 = countPattern.getGraph().getNodes().get(2);
		Node e3G2 = countPattern.getGraph().getNodes().get(3);		
		
		Node e4G2 = graphFactory.createNode();
		e4G2.setGraph(graph2);
		Relation r4G2 = graphFactory.createRelation();
		r4G2.setGraph(graph2);
		r4G2.setSource(e1G2);
		r4G2.setTarget(e4G2);		
		e4G2.addPrimitiveComparison();
		
		Node e5G2 = graphFactory.createNode();
		e5G2.setGraph(graph2);
		Relation r5G2 = graphFactory.createRelation();
		r5G2.setGraph(graph2);
		r5G2.setSource(e4G2);
		r5G2.setTarget(e5G2);
		countPattern.getGraph().getReturnNodes().clear();
		countPattern.getGraph().getReturnNodes().add(e5G2);
		e5G2.addPrimitiveComparison();
		
		PrimitiveNode previous = graphFactory.createPrimitiveNode();
		previous.addIncomming(e3G2);
		
		PrimitiveNode other = graphFactory.createPrimitiveNode();
		other.addIncomming(e5G2);
			
		Comparison comparison = operatorsFactory.createComparison();		
		countPattern.getGraph().getOperatorList().add(comparison);		
//		comparison.createParameters();
		comparison.getTypeOption().setValue(ReturnType.STRING);
		comparison.setArgument1(previous);
		comparison.setArgument2(other);	
		comparison.getOption().setValue(ComparisonOperator.EQUAL);
		
		Condition truecondition = patternStructureFactory.createTrueElement();
		countPattern.setCondition(truecondition);		
		
		completePattern.createXMLAdaption();
		r1G1.adaptAsXMLNavigation();
		r2G1.adaptAsXMLNavigation();
		r3G1.adaptAsXMLNavigation();
		r4G2.adaptAsXMLNavigation();		
		r5G2.adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}
	
	private static CompletePattern getUniqueAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;
		
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;		

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);	
		returnElementInReturnGraph.addPrimitiveComparison();
		
		QuantifiedCondition qCond = patternStructureFactory.createQuantifiedCondition();
		completePattern.setCondition(qCond);
		Graph gQCon = qCond.getGraph();
		
		CountCondition countCondition = patternStructureFactory.createCountCondition();
		qCond.setCondition(countCondition); 
		
		CountPattern countPattern = patternStructureFactory.createCountPattern();
		
//		CountPattern countPattern = countCondition.getCountPattern();
		
		
		NumberParam numberParam = parametersFactory.createNumberParam();
		numberParam.setValue(1.0);
		NumberElement numberElement = patternStructureFactory.createNumberElement();
		numberElement.setNumberParam(numberParam);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);
		countCondition.setCountPattern(countPattern);
		countCondition.setArgument2(numberElement);
		
		Node returnInQCond = qCond.getGraph().getNodes().get(0);
		Node returnInCPattern = countPattern.getGraph().getNodes().get(0);
		Node element2 = graphFactory.createNode();
		element2.setGraph(countPattern.getGraph());
		element2.setName("Element2");
		countPattern.getGraph().getReturnNodes().clear();
		countPattern.getGraph().getReturnNodes().add(element2);
		element2.addPrimitiveComparison();
		
		Node nextToReturn = graphFactory.createNode();
		nextToReturn.setGraph(qCond.getGraph());
		nextToReturn.setName("Field1");
		Relation relation = graphFactory.createRelation();
		relation.setGraph(qCond.getGraph());
		relation.setSource(returnInQCond);
		relation.setTarget(nextToReturn);
		nextToReturn.addPrimitiveComparison();
		
		QuantifiedCondition countQCond= patternStructureFactory.createQuantifiedCondition();
		countPattern.setCondition(countQCond);
		
		TrueElement trueElement = patternStructureFactory.createTrueElement();
		countQCond.setCondition(trueElement);
		
		Node nextToElement2 = graphFactory.createNode();
		nextToElement2.setGraph(countQCond.getGraph());
		Relation relation2 = graphFactory.createRelation();
		relation2.setGraph(countQCond.getGraph());
		relation2.setSource(element2.getOutgoingMappings().get(0).getTarget());
		relation2.setTarget(nextToElement2);
		nextToElement2.addPrimitiveComparison();
		
		PrimitiveNode propertyNextToReturn = graphFactory.createPrimitiveNode();
		propertyNextToReturn.addIncomming(nextToReturn.getOutgoingMappings().get(0).getTarget().getOutgoingMappings().get(0).getTarget());
		
		PrimitiveNode propertyNextToElement2 = graphFactory.createPrimitiveNode();
		propertyNextToElement2.addIncomming(nextToElement2);
			
		Comparison comparison = operatorsFactory.createComparison();		
		countQCond.getGraph().getOperatorList().add(comparison);		
//		comparison.createParameters();
		comparison.getTypeOption().setValue(ReturnType.STRING);
		comparison.setArgument1(propertyNextToReturn);
		comparison.setArgument2(propertyNextToElement2);	
		comparison.getOption().setValue(ComparisonOperator.EQUAL);
	
		completePattern.createXMLAdaption();
		relation.adaptAsXMLNavigation();
		relation2.adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}
	
//	private static CompletePattern getUniqueLidoEfficientAbstract() {
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
//		
//		OperatorsPackage.eINSTANCE.eClass();
//		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;
//		
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;		
//
//		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
//		
//		CompletePattern completePattern = Test00.getBasePattern();
//		Element e0InReturnGraph = completePattern.getGraph().getElements().get(0);	
////		e0InReturnGraph.addPrimitiveComparison();
//		
//		Element ret = graphFactory.createNode();
//		ret.setGraph(completePattern.getGraph());
//		ret.addPrimitiveComparison();	
//		Relation relation0 = graphFactory.createRelation();
//		relation0.setGraph(completePattern.getGraph());
//		relation0.setSource(e0InReturnGraph);
//		relation0.setTarget(ret);
//		completePattern.getGraph().getReturnElements().clear();
//		completePattern.getGraph().getReturnElements().add(ret);
//		
//		QuantifiedCondition quantifiedCondition = patternStructureFactory.createQuantifiedCondition();
//		completePattern.setCondition(quantifiedCondition);	
//		
//		Element retInQC = quantifiedCondition.getGraph().getElements().get(1);
//		Element child = graphFactory.createNode();
//		child.setGraph(quantifiedCondition.getGraph());
//		child.addPrimitiveComparison();	
//		Relation relation = graphFactory.createRelation();
//		relation.setGraph(quantifiedCondition.getGraph());
//		relation.setSource(retInQC);
//		relation.setTarget(child);
//		
//		CountCondition countCondition = patternStructureFactory.createCountCondition();
//		quantifiedCondition.setCondition(countCondition);	
//		
//		CountPattern countPattern = patternStructureFactory.createCountPattern();
//
//		NumberParam numberParam = parametersFactory.createNumberParam();
//		numberParam.setValue(1.0);
//		NumberElement numberElement = patternStructureFactory.createNumberElement();
//		numberElement.setNumberParam(numberParam);
//		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
//		countCondition.getOption().setValue(ComparisonOperator.GREATER);
//		countCondition.setCountPattern(countPattern);
//		countCondition.setArgument2(numberElement);
//		
//		Element childInCPattern = countPattern.getGraph().getElements().get(2);
//		Element element2 = graphFactory.createNode();
//		element2.setGraph(countPattern.getGraph());
//		
//		Element element3 = graphFactory.createNode();
//		element3.setGraph(countPattern.getGraph());
//		Relation relation1 = graphFactory.createRelation();
//		relation1.setGraph(countPattern.getGraph());
//		relation1.setSource(element2);
//		relation1.setTarget(element3);
//		
//		countPattern.getGraph().getReturnElements().clear();
//		countPattern.getGraph().getReturnElements().add(element3);
//		element3.addPrimitiveComparison();
//		
//		QuantifiedCondition quantifiedConditionCount = patternStructureFactory.createQuantifiedCondition();
//		countPattern.setCondition(quantifiedConditionCount);		
//		
//		Element e4InQcC = quantifiedConditionCount.getGraph().getElements().get(4);
//		
//		Element e2InQcC = quantifiedConditionCount.getGraph().getElements().get(2);
//		
//		Element nextToReturn = graphFactory.createNode();
//		nextToReturn.setGraph(quantifiedConditionCount.getGraph());
//		Relation relation2 = graphFactory.createRelation();
//		relation2.setGraph(quantifiedConditionCount.getGraph());
//		relation2.setSource(e4InQcC);
//		relation2.setTarget(nextToReturn);
//		nextToReturn.addPrimitiveComparison();
//		
////		Element nextToElement2 = graphFactory.createNode();
////		nextToElement2.setGraph(countPattern.getGraph());
////		Relation relation2 = graphFactory.createRelation();
////		relation2.setGraph(countPattern.getGraph());
////		relation2.setSource(element3);
////		relation2.setTarget(nextToElement2);
////		nextToElement2.addPrimitiveComparison();
//		
//		Property propertyNextToReturn = graphFactory.createProperty();
//		propertyNextToReturn.setElement(nextToReturn);
//		
//		Property propertyNextToElement2 = graphFactory.createProperty();
//		propertyNextToElement2.setElement(e2InQcC);
//			
//		Comparison comparison = operatorsFactory.createComparison();
//		comparison.setType(ReturnType.STRING);
//		quantifiedConditionCount.getGraph().getOperatorList().add(comparison);		
//		comparison.createParameters();
//		comparison.setArgument1(propertyNextToReturn);
//		comparison.setArgument2(propertyNextToElement2);	
//		comparison.getOption().setValue(ComparisonOperator.EQUAL);
//		
//		Condition truecondition = patternStructureFactory.createTrueElement();
//		quantifiedConditionCount.setCondition(truecondition);		
//		
//		completePattern.createXMLAdaption();
//		relation0.adaptAsXMLNavigation();
//		relation.adaptAsXMLNavigation();
//		relation1.adaptAsXMLNavigation();
//		relation2.adaptAsXMLNavigation();
//		completePattern.finalizeXMLAdaption();
//		
//		return completePattern;
//	}
	
	static CompletePattern getUniqueMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getUniqueAbstract();
		
		
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);	
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().setValue(AxisKind.THREECHILD);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("wer");
		((UntypedParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).replace(concreteInputValue);
		
		
		QuantifiedCondition qCond = (QuantifiedCondition) completePattern.getCondition();
		Graph graphQCond = qCond.getGraph();
		
		CountCondition countCondition = (CountCondition) qCond.getCondition();		
		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
		Graph graphCountPattern = countPattern.getGraph();
		
		QuantifiedCondition countQCond = (QuantifiedCondition) countPattern.getCondition();
		Graph graphCountQCond = countQCond.getGraph();
			
		Node element2 = graphCountPattern.getNodes().get(1);	
		((XmlNavigation) countPattern.getGraph().getRelations().get(2)).getPathParam().setValue(AxisKind.THREECHILD);
		((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("wer");
		((UntypedParameterValue) ((Comparison) element2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue2);
		
		Node nextToReturn = graphQCond.getNodes().get(1);
		XmlProperty propNextToReturn = (XmlProperty) nextToReturn.getProperties().get(0);
		propNextToReturn.getAttributeName().setValue("Type");
		propNextToReturn.getOption().setValue(PropertyKind.ATTRIBUTE);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("3600");
		((UntypedParameterValue) ((Comparison) nextToReturn.getPredicates().get(0)).getArgument2()).replace(concreteInputValue3);
		
		Node nextToElement2 = graphCountQCond.getNodes().get(3);
		((XmlProperty) nextToElement2.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) nextToElement2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("3600");
		((UntypedParameterValue) ((Comparison) nextToElement2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue4);
		
		
		Node nextToReturn2 = nextToReturn.getOutgoingMappings().get(0).getTarget().getOutgoingMappings().get(0).getTarget();
		XmlProperty prop2NextToReturn = (XmlProperty) nextToReturn2.getProperties().get(0);
		prop2NextToReturn.getOption().setValue(PropertyKind.ATTRIBUTE);
		prop2NextToReturn.getAttributeName().setValue("Value");
		
		XmlProperty propNextToElement2 = ((XmlProperty) nextToElement2.getProperties().get(1));
		propNextToElement2.getOption().setValue(PropertyKind.ATTRIBUTE);
		propNextToElement2.getAttributeName().setValue("Value");
		
		((Comparison) nextToElement2.getPredicates().get(1)).getTypeOption().setValue(ReturnType.STRING);
		
		return completePattern;
	}
	
	private static CompletePattern getUniqueComplexLidoConcrete(AxisKind returnRel, String returnElementName, AxisKind retToE1Rel, String e1Name, String e2Name, String e3Name) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getUniqueComplexAbstract();
		Node returnElementInReturnGraph = completePattern.getGraph().getReturnNodes().get(0);	
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().setValue(returnRel);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementName);
		((UntypedParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).replace(concreteInputValue);
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();	
		Graph graph1 = quantifiedCondition.getGraph();
		
		Node e1G1 = graph1.getNodes().get(1);	
		((XmlNavigation) graph1.getRelations().get(0)).getPathParam().setValue(retToE1Rel);
		((XmlProperty) e1G1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue1G1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1G1.setValue(e1Name);
		((UntypedParameterValue) ((Comparison) e1G1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue1G1);
		
		Node e2G1 = graph1.getNodes().get(2);	
		((XmlNavigation) graph1.getRelations().get(1)).getPathParam().setValue(AxisKind.CHILD);
		((XmlProperty) e2G1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue2G1 = parametersFactory.createTextLiteralParam();
		concreteInputValue2G1.setValue(e2Name);
		((UntypedParameterValue) ((Comparison) e2G1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue2G1);
		
		Node e3G1 = graph1.getNodes().get(3);	
		((XmlNavigation) graph1.getRelations().get(2)).getPathParam().setValue(AxisKind.CHILD);
		((XmlProperty) e3G1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue3G1 = parametersFactory.createTextLiteralParam();
		concreteInputValue3G1.setValue(e3Name);
		((UntypedParameterValue) ((Comparison) e3G1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue3G1);
		
		
		CountCondition countCondition = (CountCondition) quantifiedCondition.getCondition();		
		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
		Graph graph2 = countPattern.getGraph();
		
		Node e3G2 = graph2.getNodes().get(3);	
		
		Node e4G2 = graph2.getNodes().get(4);	
		((XmlNavigation) graph2.getRelations().get(3)).getPathParam().setValue(AxisKind.CHILD);
		((XmlProperty) e4G2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue4G2 = parametersFactory.createTextLiteralParam();
		concreteInputValue4G2.setValue(e2Name);
		((UntypedParameterValue) ((Comparison) e4G2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue4G2);
		
		Node e5G2 = graph2.getNodes().get(5);
		((XmlNavigation) graph2.getRelations().get(4)).getPathParam().setValue(AxisKind.CHILD);
		((XmlProperty) e5G2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue5G2 = parametersFactory.createTextLiteralParam();
		concreteInputValue5G2.setValue(e3Name);
		((UntypedParameterValue) ((Comparison) e5G2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue5G2);
		
//		Element nextToElement2 = graph2.getElements().get(3);
//		((XmlProperty) nextToElement2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
//		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
//		concreteInputValue4.setValue(elementName);
//		((UnknownParameterValue) ((Comparison) nextToElement2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue4);
		
		((XmlProperty) e5G2.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
		
		((XmlProperty) e3G2.getProperties().get(0)).getOption().setValue(PropertyKind.DATA);
		
		((Comparison) e5G2.getPredicates().get(1)).getTypeOption().setValue(ReturnType.STRING);
		
		return completePattern;
	}
	
	private static CompletePattern getUniqueLidoConcrete(AxisKind returnRel, String returnElementName, String elementName) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getUniqueAbstract();
		Node returnElementInReturnGraph = completePattern.getGraph().getReturnNodes().get(0);	
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().setValue(returnRel);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementName);
		((UntypedParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).replace(concreteInputValue);
		
		QuantifiedCondition qCond = (QuantifiedCondition) completePattern.getCondition();	
		CountCondition countCondition = (CountCondition) qCond.getCondition();		
		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
		QuantifiedCondition countQCon = (QuantifiedCondition) countPattern.getCondition();
		
		Node element2 = countPattern.getGraph().getNodes().get(1);	
		((XmlNavigation) countPattern.getGraph().getRelations().get(2)).getPathParam().setValue(returnRel);
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(returnElementName);
		((UntypedParameterValue) ((Comparison) element2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue2);
		
		Node nextToReturn = qCond.getGraph().getNodes().get(1);
		((XmlProperty) nextToReturn.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue(elementName);
		((UntypedParameterValue) ((Comparison) nextToReturn.getPredicates().get(0)).getArgument2()).replace(concreteInputValue3);
		
		Node nextToElement2 = countQCon.getGraph().getNodes().get(3);
		((XmlProperty) nextToElement2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue(elementName);
		((UntypedParameterValue) ((Comparison) nextToElement2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue4);
		
		Node nextToReturn2 = countQCon.getGraph().getNodes().get(2);
		((XmlProperty) nextToReturn2.getProperties().get(0)).getOption().setValue(PropertyKind.DATA);
		
		((XmlProperty) nextToElement2.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
		
		((Comparison) nextToElement2.getPredicates().get(1)).getTypeOption().setValue(ReturnType.STRING);
		
		return completePattern;
	}
	
	
	
	static CompletePattern getUniqueLidoLidoRecId() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		// not used for evaluation anymore
		return getUniqueLidoConcrete(AxisKind.TWOCHILD, "lido:lido", "lido:lidoRecID");
	}
	
	static CompletePattern getUniqueLidoObjectPublishedId() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		return getUniqueLidoConcrete(AxisKind.TWOCHILD, "lido:lido", "lido:objectPublishedID");
	}
	
	static CompletePattern getUniqueComplexLidoNameActorSet() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		return getUniqueComplexLidoConcrete(AxisKind.TWOCHILD, "lido:lido", AxisKind.SEVENCHILD, "lido:actor", "lido:nameActorSet", "lido:appellationValue");
	}
	
//	private static CompletePattern getUniqueLidoEfficientConcrete() {		
//		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
//		
//		CompletePattern completePattern = getUniqueLidoEfficientAbstract();
//		
//		Element e0InReturnGraph = completePattern.getGraph().getElements().get(0);	
//		((XmlNavigation) completePattern.getGraph().getRelations().get(1)).getOption().setValue(RelationKind.CHILD);
//		
//		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(1);	
//		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(RelationKind.CHILD);
//		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
//		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
//		concreteInputValue.setValue("lido:lido");
//		((UnknownParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).replace(concreteInputValue);
//		
//		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
//		Element childInQC = quantifiedCondition.getGraph().getElements().get(2);	
//		((XmlNavigation) quantifiedCondition.getGraph().getRelations().get(1)).getOption().setValue(RelationKind.CHILD);
//		((XmlProperty) childInQC.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
//		TextLiteralParam concreteInputValueQC = parametersFactory.createTextLiteralParam();
//		concreteInputValueQC.setValue("lido:lidoRecID");
//		((UnknownParameterValue) ((Comparison) childInQC.getPredicates().get(0)).getArgument2()).replace(concreteInputValueQC);
//		
//		CountCondition countCondition = (CountCondition) quantifiedCondition.getCondition();		
//		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
//		
//		Element element2 = countPattern.getGraph().getElements().get(3);	
//		((XmlNavigation) countPattern.getGraph().getRelations().get(4)).getOption().setValue(RelationKind.CHILD);
////		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
////		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
////		concreteInputValue2.setValue(returnElementName);
////		((UnknownParameterValue) ((Comparison) element2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue2);
//		
//		Element nextToReturn = countPattern.getGraph().getElements().get(4);
//		((XmlNavigation) countPattern.getGraph().getRelations().get(2)).getOption().setValue(RelationKind.CHILD);
//		((XmlProperty) nextToReturn.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
//		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
//		concreteInputValue3.setValue("lido:lido");
//		((UnknownParameterValue) ((Comparison) nextToReturn.getPredicates().get(0)).getArgument2()).replace(concreteInputValue3);
////		
//		QuantifiedCondition quantifiedCondition2 = (QuantifiedCondition) countPattern.getCondition();
//		
//		Element e2 = quantifiedCondition2.getGraph().getElements().get(2);
////		((XmlProperty) e2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
////		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
//////		concreteInputValue4.setValue("");
////		((UnknownParameterValue) ((Comparison) e2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue4);
//		
//		Element e5 = quantifiedCondition2.getGraph().getElements().get(5);
//		((XmlNavigation) quantifiedCondition2.getGraph().getRelations().get(3)).getOption().setValue(RelationKind.CHILD);
//		((XmlProperty) e5.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
//		TextLiteralParam concreteInputValueQC2 = parametersFactory.createTextLiteralParam();
//		concreteInputValueQC2.setValue("lido:lidoRecID");
//		((UnknownParameterValue) ((Comparison) e5.getPredicates().get(0)).getArgument2()).replace(concreteInputValueQC2);
//		
//
//		
//		((XmlProperty) e5.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
//		
//		((XmlProperty) e2.getProperties().get(0)).getOption().setValue(PropertyKind.DATA);
//		
//		((Comparison) e2.getPredicates().get(0)).setType(ReturnType.STRING);
//		
//		return completePattern;
//	}
	
//	private static CompletePattern getUniqueRunningExample() { // replaced by CARD
//		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
//		
//		CompletePattern completePattern = getUniqueAbstract();
//		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
//		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyKind.TAG);
//		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
//		concreteInputValue.setValue("artist");
//		((UnknownParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).replace(concreteInputValue);
//		
//		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
//		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
//		
//		Element returnInCPattern = countPattern.getGraph().getRootElement().getNextElements().get(0);
//		Element rootInCPattern = countPattern.getGraph().getRootElement();
//		Element nextToRootInCPattern = rootInCPattern.getNextElements().get(1);	
//		nextToRootInCPattern.getProperties().get(0).getOption().setValue(PropertyKind.TAG);
//		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
//		concreteInputValue2.setValue("artist");
//		((UnknownParameterValue) ((Comparison) nextToRootInCPattern.getPredicates().get(0)).getArgument2()).replace(concreteInputValue2);
//		
//		returnInCPattern.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
//		returnInCPattern.getProperties().get(0).getAttributeName().setValue("id");
//		
//		nextToRootInCPattern.getProperties().get(1).getOption().setValue(PropertyKind.ATTRIBUTE);
//		nextToRootInCPattern.getProperties().get(1).getAttributeName().setValue("id");
//		
//		((Comparison) nextToRootInCPattern.getPredicates().get(1)).setType(ReturnType.STRING);
//		
//		return completePattern;
//	}
}

package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
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
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.translationtests.Test00;

public class Eval07Unique {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getUniqueLidoObjectPublishedId());
		Test00.test(completePatterns);
		
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
//		Element nextToRootInCPattern = graphFactory.createElement();
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
	
	private static CompletePattern getUniqueAbstractMidas() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;
		
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;		

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);	
		returnElementInReturnGraph.addPrimitiveComparison();
		
		CountCondition countCondition = patternStructureFactory.createCountCondition();
		completePattern.setCondition(countCondition);		
		
		CountPattern countPattern = patternStructureFactory.createCountPattern();

		NumberParam numberParam = parametersFactory.createNumberParam();
		numberParam.setValue(1.0);
		NumberElement numberElement = patternStructureFactory.createNumberElement();
		numberElement.setNumberParam(numberParam);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);
		countCondition.setCountPattern(countPattern);
		countCondition.setArgument2(numberElement);
		
		Element returnInCPattern = countPattern.getGraph().getElements().get(0);
		Element element2 = graphFactory.createElement();
		element2.setGraph(countPattern.getGraph());
		countPattern.getGraph().getReturnElements().clear();
		countPattern.getGraph().getReturnElements().add(element2);
		element2.addPrimitiveComparison();
		
		Element nextToReturn = graphFactory.createElement();
		nextToReturn.setGraph(countPattern.getGraph());
		Relation relation = graphFactory.createRelation();
		relation.setGraph(countPattern.getGraph());
		relation.setSource(returnInCPattern);
		relation.setTarget(nextToReturn);
		nextToReturn.addPrimitiveComparison();
		
		Element nextToElement2 = graphFactory.createElement();
		nextToElement2.setGraph(countPattern.getGraph());
		Relation relation2 = graphFactory.createRelation();
		relation2.setGraph(countPattern.getGraph());
		relation2.setSource(element2);
		relation2.setTarget(nextToElement2);
		nextToElement2.addPrimitiveComparison();
		
		Property propertyNextToReturn = graphFactory.createProperty();
		propertyNextToReturn.setElement(nextToReturn);
		
		Property propertyNextToElement2 = graphFactory.createProperty();
		propertyNextToElement2.setElement(nextToElement2);
			
		Comparison comparison = operatorsFactory.createComparison();
		comparison.setType(ReturnType.STRING);
		countPattern.getGraph().getOperatorList().add(comparison);		
		comparison.createParameters();
		comparison.setArgument1(propertyNextToReturn);
		comparison.setArgument2(propertyNextToElement2);	
		comparison.getOption().setValue(ComparisonOperator.EQUAL);
		
		Condition truecondition = patternStructureFactory.createTrueElement();
		countPattern.setCondition(truecondition);		
		
		completePattern.createXMLAdaption();
		relation.adaptAsXMLNavigation();
		relation2.adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}
	
	private static CompletePattern getUniqueMidas() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getUniqueAbstractMidas();
		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);	
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(RelationKind.DESCENDANT);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("wer");
		((UnknownParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue);
		
		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
		
		Element element2 = countPattern.getGraph().getElements().get(1);	
		((XmlNavigation) countPattern.getGraph().getRelations().get(3)).getOption().setValue(RelationKind.DESCENDANT);
		((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("wer");
		((UnknownParameterValue) ((Comparison) element2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue2);
		
		Element nextToReturn = countPattern.getGraph().getElements().get(2);
		((XmlProperty) nextToReturn.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) nextToReturn.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("3600");
		((UnknownParameterValue) ((Comparison) nextToReturn.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue3);
		
		Element nextToElement2 = countPattern.getGraph().getElements().get(3);
		((XmlProperty) nextToElement2.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) nextToElement2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("3600");
		((UnknownParameterValue) ((Comparison) nextToElement2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue4);
		
		((XmlProperty) nextToReturn.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		((XmlProperty) nextToReturn.getProperties().get(1)).getAttributeName().setValue("Value");
		
		((XmlProperty) nextToElement2.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		((XmlProperty) nextToElement2.getProperties().get(1)).getAttributeName().setValue("Value");
		
		((Comparison) nextToElement2.getPredicates().get(1)).setType(ReturnType.STRING);
		
		return completePattern;
	}
	
	private static CompletePattern getUniqueLidoConcrete(String returnElementName, String elementName) {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getUniqueAbstractMidas();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(RelationKind.DESCENDANT);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementName);
		((UnknownParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue);
		
		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
		
		Element element2 = countPattern.getGraph().getElements().get(1);	
		((XmlNavigation) countPattern.getGraph().getRelations().get(3)).getOption().setValue(RelationKind.DESCENDANT);
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(returnElementName);
		((UnknownParameterValue) ((Comparison) element2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue2);
		
		Element nextToReturn = countPattern.getGraph().getElements().get(2);
		((XmlProperty) nextToReturn.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue(elementName);
		((UnknownParameterValue) ((Comparison) nextToReturn.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue3);
		
		Element nextToElement2 = countPattern.getGraph().getElements().get(3);
		((XmlProperty) nextToElement2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue(elementName);
		((UnknownParameterValue) ((Comparison) nextToElement2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue4);
		
		((XmlProperty) nextToReturn.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
		
		((XmlProperty) nextToElement2.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
		
		((Comparison) nextToElement2.getPredicates().get(1)).setType(ReturnType.STRING);
		
		return completePattern;
	}
	
	private static CompletePattern getUniqueLidoLidoRecId() {		
		return getUniqueLidoConcrete("lido:lido", "lido:lidoRecID");
	}
	
	private static CompletePattern getUniqueLidoObjectPublishedId() {		
		return getUniqueLidoConcrete("lido:lido", "lido:objectPublishedID");
	}
	
//	private static CompletePattern getUniqueRunningExample() { // replaced by CARD
//		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
//		
//		CompletePattern completePattern = getUniqueAbstract();
//		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
//		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyKind.TAG);
//		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
//		concreteInputValue.setValue("artist");
//		((UnknownParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue);
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
//		((UnknownParameterValue) ((Comparison) nextToRootInCPattern.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue2);
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

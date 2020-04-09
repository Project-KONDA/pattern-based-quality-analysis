package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.FunctionsFactory;
import qualitypatternmodel.operators.FunctionsPackage;
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
import qualitypatternmodel.translationtests.Test03Quantor;

public class Eval07Unique {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getUniqueLidoObjectPublishedId());
		Test00.test(completePatterns);
		
	}
	
	private static CompletePattern getUniqueAbstract() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;
		
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;		

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
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
		
		Element returnInCPattern = countPattern.getGraph().getReturnElements().get(0);
		Element rootInCPattern = countPattern.getGraph().getRootElement();
		Element nextToRootInCPattern = graphFactory.createElement();
		nextToRootInCPattern.setPreviousElement(rootInCPattern);
		countPattern.getGraph().getReturnElements().clear();
		countPattern.getGraph().getReturnElements().add(nextToRootInCPattern);
		nextToRootInCPattern.addPrimitiveComparison();
		
		Property propertyReturn = graphFactory.createProperty();
		propertyReturn.setElement(returnInCPattern);
		propertyReturn.createParameters();
		
		Property propertyNextToRoot = propertyReturn.copy();
		propertyNextToRoot.setElement(nextToRootInCPattern);
			
		Comparison comparison = functionsFactory.createComparison();
		countPattern.getGraph().getOperatorList().add(comparison);		
		comparison.createParameters();
		comparison.setArgument1(propertyReturn);
		comparison.setArgument2(propertyNextToRoot);	
		comparison.getOption().setValue(ComparisonOperator.EQUAL);
		
		Condition truecondition = patternStructureFactory.createTrueElement();
		countPattern.setCondition(truecondition);		
		
		return completePattern;
	}
	
	private static CompletePattern getUniqueAbstractMidas() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;
		
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;		

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
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
		
		Element returnInCPattern = countPattern.getGraph().getReturnElements().get(0);
		Element rootInCPattern = countPattern.getGraph().getRootElement();
		Element element2 = graphFactory.createElement();
		element2.setPreviousElement(rootInCPattern);
		countPattern.getGraph().getReturnElements().clear();
		countPattern.getGraph().getReturnElements().add(element2);
		element2.addPrimitiveComparison();
		
		Element nextToReturn = graphFactory.createElement();
		nextToReturn.setPreviousElement(returnInCPattern);
		nextToReturn.addPrimitiveComparison();
		
		Element nextToElement2 = graphFactory.createElement();
		nextToElement2.setPreviousElement(element2);
		nextToElement2.addPrimitiveComparison();
		
		Property propertyNextToReturn = graphFactory.createProperty();
		propertyNextToReturn.setElement(nextToReturn);
		propertyNextToReturn.createParameters();
		
		Property propertyNextToElement2 = graphFactory.createProperty();
		propertyNextToElement2.setElement(nextToElement2);
		propertyNextToElement2.createParameters();
			
		Comparison comparison = functionsFactory.createComparison();
		countPattern.getGraph().getOperatorList().add(comparison);		
		comparison.createParameters();
		comparison.setArgument1(propertyNextToReturn);
		comparison.setArgument2(propertyNextToElement2);	
		comparison.getOption().setValue(ComparisonOperator.EQUAL);
		
		Condition truecondition = patternStructureFactory.createTrueElement();
		countPattern.setCondition(truecondition);		
		
		return completePattern;
	}
	
	private static CompletePattern getUniqueMidas() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getUniqueAbstractMidas();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
		returnElementInReturnGraph.getRelationFromPrevious().getOption().setValue(Axis.DESCENDANT);
		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("wer");
		((UnknownParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue);
		
		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
		
		Element returnInCPattern = countPattern.getGraph().getRootElement().getNextElements().get(0);
		Element rootInCPattern = countPattern.getGraph().getRootElement();
		Element element2 = rootInCPattern.getNextElements().get(1);	
		element2.getRelationFromPrevious().getOption().setValue(Axis.DESCENDANT);
		element2.getProperties().get(0).getAttributeName().setValue("Type");
		element2.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("wer");
		((UnknownParameterValue) ((Comparison) element2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue2);
		
		Element nextToReturn = returnInCPattern.getNextElements().get(0);
		nextToReturn.getProperties().get(0).getAttributeName().setValue("Type");
		nextToReturn.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("3600");
		((UnknownParameterValue) ((Comparison) nextToReturn.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue3);
		
		Element nextToElement2 = element2.getNextElements().get(0);
		nextToElement2.getProperties().get(0).getAttributeName().setValue("Type");
		nextToElement2.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("3600");
		((UnknownParameterValue) ((Comparison) nextToElement2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue4);
		
		nextToReturn.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		nextToReturn.getProperties().get(1).getAttributeName().setValue("Value");
		
		nextToElement2.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		nextToElement2.getProperties().get(1).getAttributeName().setValue("Value");
		
		((Comparison) nextToElement2.getPredicates().get(1)).setType(ReturnType.STRING);
		
		return completePattern;
	}
	
	private static CompletePattern getUniqueLido() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getUniqueAbstractMidas();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
		returnElementInReturnGraph.getRelationFromPrevious().getOption().setValue(Axis.DESCENDANT);
//		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("lido:lido");
		((UnknownParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue);
		
		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
		
		Element returnInCPattern = countPattern.getGraph().getRootElement().getNextElements().get(0);
		Element rootInCPattern = countPattern.getGraph().getRootElement();
		Element element2 = rootInCPattern.getNextElements().get(1);	
		element2.getRelationFromPrevious().getOption().setValue(Axis.DESCENDANT);
//		element2.getProperties().get(0).getAttributeName().setValue("Type");
		element2.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("lido:lido");
		((UnknownParameterValue) ((Comparison) element2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue2);
		
		Element nextToReturn = returnInCPattern.getNextElements().get(0);
//		nextToReturn.getProperties().get(0).getAttributeName().setValue("Type");
		nextToReturn.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("lido:lidoRecID");
		((UnknownParameterValue) ((Comparison) nextToReturn.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue3);
		
		Element nextToElement2 = element2.getNextElements().get(0);
//		nextToElement2.getProperties().get(0).getAttributeName().setValue("Type");
		nextToElement2.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("lido:lidoRecID");
		((UnknownParameterValue) ((Comparison) nextToElement2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue4);
		
		nextToReturn.getProperties().get(1).getOption().setValue(PropertyLocation.DATA);
//		nextToReturn.getProperties().get(1).getAttributeName().setValue("Value");
		
		nextToElement2.getProperties().get(1).getOption().setValue(PropertyLocation.DATA);
//		nextToElement2.getProperties().get(1).getAttributeName().setValue("Value");
		
		((Comparison) nextToElement2.getPredicates().get(1)).setType(ReturnType.STRING);
		
		return completePattern;
	}
	
	private static CompletePattern getUniqueLidoObjectPublishedId() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getUniqueAbstractMidas();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
		returnElementInReturnGraph.getRelationFromPrevious().getOption().setValue(Axis.DESCENDANT);
//		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("lido:lido");
		((UnknownParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue);
		
		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
		
		Element returnInCPattern = countPattern.getGraph().getRootElement().getNextElements().get(0);
		Element rootInCPattern = countPattern.getGraph().getRootElement();
		Element element2 = rootInCPattern.getNextElements().get(1);	
		element2.getRelationFromPrevious().getOption().setValue(Axis.DESCENDANT);
//		element2.getProperties().get(0).getAttributeName().setValue("Type");
		element2.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("lido:lido");
		((UnknownParameterValue) ((Comparison) element2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue2);
		
		Element nextToReturn = returnInCPattern.getNextElements().get(0);
//		nextToReturn.getProperties().get(0).getAttributeName().setValue("Type");
		nextToReturn.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("lido:objectPublishedID");
		((UnknownParameterValue) ((Comparison) nextToReturn.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue3);
		
		Element nextToElement2 = element2.getNextElements().get(0);
//		nextToElement2.getProperties().get(0).getAttributeName().setValue("Type");
		nextToElement2.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("lido:objectPublishedID");
		((UnknownParameterValue) ((Comparison) nextToElement2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue4);
		
		nextToReturn.getProperties().get(1).getOption().setValue(PropertyLocation.DATA);
//		nextToReturn.getProperties().get(1).getAttributeName().setValue("Value");
		
		nextToElement2.getProperties().get(1).getOption().setValue(PropertyLocation.DATA);
//		nextToElement2.getProperties().get(1).getAttributeName().setValue("Value");
		
		((Comparison) nextToElement2.getPredicates().get(1)).setType(ReturnType.STRING);
		
		return completePattern;
	}
	
	private static CompletePattern getUniqueRunningExample() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getUniqueAbstract();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("artist");
		((UnknownParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue);
		
		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
		
		Element returnInCPattern = countPattern.getGraph().getRootElement().getNextElements().get(0);
		Element rootInCPattern = countPattern.getGraph().getRootElement();
		Element nextToRootInCPattern = rootInCPattern.getNextElements().get(1);	
		nextToRootInCPattern.getProperties().get(0).getOption().setValue(PropertyLocation.TAG);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("artist");
		((UnknownParameterValue) ((Comparison) nextToRootInCPattern.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue2);
		
		returnInCPattern.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		returnInCPattern.getProperties().get(0).getAttributeName().setValue("id");
		
		nextToRootInCPattern.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		nextToRootInCPattern.getProperties().get(1).getAttributeName().setValue("id");
		
		((Comparison) nextToRootInCPattern.getPredicates().get(1)).setType(ReturnType.STRING);
		
		return completePattern;
	}
}

package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class EvalMatch {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMatchLidoNameActorSetAbbreviation());
		completePatterns.add(getMatchMidas5064());
		completePatterns.add(getMatchMidas5360());
		completePatterns.add(getMatchMidas3270());
		completePatterns.add(getMatchMidas3270Imprecise());
		completePatterns.add(getMatchMidas3100Abbreviation());
		completePatterns.add(getMatchMidas5060());
		completePatterns.add(getMatchMidasOb30Child());
		completePatterns.add(getMatchLidoMeasurementValue());
		completePatterns.add(getMatchLidoMeasurementUnit());
		completePatterns.add(getMatchLidoEarliestDate());
		completePatterns.add(getMatchLidoNamePlaceSet());
		completePatterns.add(getMatchLidoAppellationValue());
		completePatterns.add(getMatchLidoNameActorSetAbbreviation());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);
	}

	public static CompletePattern getMatchAbstract() {
		GraphstructurePackage.eINSTANCE.eClass();

		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelationFinal();
		XmlElement returnElementInReturnGraph = (XmlElement) completePattern.getGraph().getElements().get(0);
		returnElementInReturnGraph.addPrimitiveComparison();

		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		XmlElement element2 = (XmlElement) quantifiedCondition.getGraph().getElements().get(1);

		element2.addPrimitiveComparison();
		element2.addPrimitiveMatch();

		return completePattern;
	}

	public static CompletePattern getMatchAbstractThreeElements() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);
		returnElementInReturnGraph.addPrimitiveComparison();

		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();

		Element element2 = quantifiedCondition.getGraph().getElements().get(1);
		element2.addPrimitiveComparison();

		Element element3 = graphFactory.createElement();
		element3.setGraph(quantifiedCondition.getGraph());
//		element3.addPrimitiveComparison(); 		
		element3.addPrimitiveMatch();

		Relation relation = graphFactory.createRelation();
		relation.setGraph(quantifiedCondition.getGraph());
		relation.setSource(element2);
		relation.setTarget(element3);

		completePattern.createXMLAdaption();
		quantifiedCondition.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		relation.adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();

		return completePattern;
	}
	
	public static CompletePattern getMatchAbstractThreeElementsTwoConditions() {
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = getMatchAbstractThreeElements();
		

		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();

		Element element3 = quantifiedCondition.getGraph().getElements().get(2);
		element3.addPrimitiveComparison();	

		return completePattern;
	}

//	public static CompletePattern getMatchMidas() {
//		
//		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
//		
//		CompletePattern completePattern = getMatchAbstract();
//		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
//		returnElementInReturnGraph.getRelationFromPrevious().getOption().setValue(RelationKind.DESCENDANT);
//		BooleanOperator comparisonReturnElementInReturnGraph = returnElementInReturnGraph.getPredicates().get(0);
//		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
//		concreteInputValue.setValue("kue");
//		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
//		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
//		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
//		
//		Element returnElementInGraph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph().getReturnElements().get(0);				
//		Element element2 = returnElementInGraph1.getNextElements().get(0);
//		BooleanOperator comparisonElement2 = element2.getPredicates().get(0);
//		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
//		concreteInputValue2.setValue("3162");
//		((UnknownParameterValue) comparisonElement2.getArguments().get(1)).concretize(concreteInputValue2);
//		element2.getProperties().get(0).getAttributeName().setValue("Type");
//		element2.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
//		
//		BooleanOperator matchElement2 = element2.getPredicates().get(1);
//		TextLiteralParam regularExpression = (TextLiteralParam) matchElement2.getArguments().get(1);
//		regularExpression.setValue(".*\\?.*");
//		element2.getProperties().get(1).getAttributeName().setValue("Value");
//		element2.getProperties().get(1).getOption().setValue(PropertyKind.ATTRIBUTE);
//		
//		return completePattern;		
//	}

	public static CompletePattern getMatchThreeElementsConcrete(String returnElementType,
			RelationKind returnElementAxis, String attribute1Name, PropertyKind attribute1Kind, 
			String element2Type, RelationKind element2Axis, String attribute2Name, PropertyKind attribute2Kind, 
			RelationKind element3Axis, 
			String attributeMatchName, PropertyKind attributeMatchKind, String regex) {

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = getMatchAbstractThreeElements();
		XmlElement returnElementInReturnGraph = (XmlElement) completePattern.getGraph().getElements().get(0);
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(returnElementAxis);
		BooleanOperator comparisonReturnElementInReturnGraph = returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1))
				.concretize(concreteInputValue);
		if (attribute1Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue(attribute1Name);
		}
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);

		QuantifiedCondition qc = (QuantifiedCondition) completePattern.getCondition();
		XmlElement element2 = (XmlElement) qc.getGraph().getElements().get(1);
		((XmlNavigation) qc.getGraph().getRelations().get(0)).getOption().setValue(element2Axis);
		BooleanOperator comparisonElement2 = element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(element2Type);
		((UnknownParameterValue) comparisonElement2.getArguments().get(1)).concretize(concreteInputValue2);
		if (attribute2Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		}
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(attribute2Kind);

		XmlElement element3 = (XmlElement) qc.getGraph().getElements().get(2);
		((XmlNavigation) qc.getGraph().getRelations().get(1)).getOption().setValue(element3Axis);
		
		BooleanOperator matchElement2 = element3.getPredicates().get(0);
		TextLiteralParam regularExpression = (TextLiteralParam) matchElement2.getArguments().get(1);
		regularExpression.setValue(regex);
		if (attributeMatchKind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element3.getProperties().get(0)).getAttributeName().setValue(attributeMatchName);
		}
		((XmlProperty) element3.getProperties().get(0)).getOption().setValue(attributeMatchKind);

		return completePattern;
	}
	
	public static CompletePattern getMatchThreeElementsTwoConditionsConcrete(String returnElementType,
			RelationKind returnElementAxis, String attribute1Name, PropertyKind attribute1Kind, 
			String element2Type, RelationKind element2Axis, String attribute2Name, PropertyKind attribute2Kind, 
			String element3Type, RelationKind element3Axis, String attribute3Name, PropertyKind attribute3Kind, 			
			String attributeMatchName, PropertyKind attributeMatchKind, String regex) {

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = getMatchAbstractThreeElementsTwoConditions();
		XmlElement returnElementInReturnGraph = (XmlElement) completePattern.getGraph().getElements().get(0);
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(returnElementAxis);
		BooleanOperator comparisonReturnElementInReturnGraph = returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1))
				.concretize(concreteInputValue);
		if (attribute1Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue(attribute1Name);
		}
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);

		QuantifiedCondition qc = (QuantifiedCondition) completePattern.getCondition();
		XmlElement element2 = (XmlElement) qc.getGraph().getElements().get(1);
		((XmlNavigation) qc.getGraph().getRelations().get(0)).getOption().setValue(element2Axis);
		BooleanOperator comparisonElement2 = element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(element2Type);
		((UnknownParameterValue) comparisonElement2.getArguments().get(1)).concretize(concreteInputValue2);
		if (attribute2Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		}
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(attribute2Kind);

		XmlElement element3 = (XmlElement) qc.getGraph().getElements().get(2);
		((XmlNavigation) qc.getGraph().getRelations().get(1)).getOption().setValue(element3Axis);
		
		BooleanOperator comparisonElement3 = element3.getPredicates().get(1);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue(element3Type);
		((UnknownParameterValue) comparisonElement3.getArguments().get(1)).concretize(concreteInputValue3);
		if (attribute3Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element3.getProperties().get(1)).getAttributeName().setValue(attribute3Name);
		}
		((XmlProperty) element3.getProperties().get(1)).getOption().setValue(attribute2Kind);

		BooleanOperator matchElement2 = element3.getPredicates().get(0);
		TextLiteralParam regularExpression = (TextLiteralParam) matchElement2.getArguments().get(1);
		regularExpression.setValue(regex);
		if (attributeMatchKind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element3.getProperties().get(0)).getAttributeName().setValue(attributeMatchName);
		}
		((XmlProperty) element3.getProperties().get(0)).getOption().setValue(attributeMatchKind);

		return completePattern;
	}

	public static CompletePattern getMatchConcrete(String returnElementType, RelationKind returnElementAxis,
			String attribute1Name, PropertyKind attribute1Kind, String element2Type, RelationKind element2Axis,
			String attribute2Name, PropertyKind attribute2Kind, String attribute3Name, PropertyKind attribute3Kind,
			String regex) {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = getMatchAbstract();
		XmlElement returnElementInReturnGraph = (XmlElement) completePattern.getGraph().getElements().get(0);
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(returnElementAxis);
		BooleanOperator comparisonReturnElementInReturnGraph = returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1))
				.concretize(concreteInputValue);
		if (attribute1Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName()
					.setValue(attribute1Name);
		}
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);

		QuantifiedCondition qc = (QuantifiedCondition) completePattern.getCondition();
		XmlElement element2 = (XmlElement) qc.getGraph().getElements().get(1);
		((XmlNavigation) qc.getGraph().getRelations().get(0)).getOption().setValue(element2Axis);
		BooleanOperator comparisonElement2 = element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(element2Type);
		((UnknownParameterValue) comparisonElement2.getArguments().get(1)).concretize(concreteInputValue2);
		if (attribute2Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		}
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(attribute2Kind);

		BooleanOperator matchElement2 = element2.getPredicates().get(1);
		TextLiteralParam regularExpression = (TextLiteralParam) matchElement2.getArguments().get(1);
		regularExpression.setValue(regex);
		if (attribute3Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element2.getProperties().get(1)).getAttributeName().setValue(attribute3Name);
		}
		((XmlProperty) element2.getProperties().get(1)).getOption().setValue(attribute3Kind);

		return completePattern;
	}

	public static CompletePattern getMatchMidas5064() {
		return getMatchConcrete("obj", RelationKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "5064",
				RelationKind.TWOCHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE,
				".*[a-zA-Z ]{10}.*");
	}

	public static CompletePattern getMatchMidas5360() {
		return getMatchConcrete("obj", RelationKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "5360",
				RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE,
				"^[0-9]+(,[0-9]+)?( x [0-9]+(,[0-9]+)?)? (m|mm)( \\([a-zA-Z‰¸ˆƒ‹÷ ]+\\))?$");
	}

	public static CompletePattern getMatchMidas3270() {
		return getMatchConcrete("kue", RelationKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "3270",
				RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, "\\?$");
	}

	public static CompletePattern getMatchMidas3270Imprecise() {
		return getMatchConcrete("kue", RelationKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "3270",
				RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, "[0-9]/[0-9]");
	}

	public static CompletePattern getMatchMidas3100Abbreviation() {
		return getMatchConcrete("kue", RelationKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "3100",
				RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, "\\.");
	}

	public static CompletePattern getMatchMidas5060() {
		return getMatchConcrete("obj", RelationKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "5060",
				RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, "^[0-9/]+$");
	}

	public static CompletePattern getMatchMidasOb30Child() {
		return getMatchThreeElementsConcrete("obj", RelationKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE,
				"ob30", RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, RelationKind.CHILD, "Type",
				PropertyKind.ATTRIBUTE, "^[12456789]");
	}

	public static CompletePattern getMatchLidoMeasurementValue() {
		return getMatchConcrete("lido:lido", RelationKind.TWOCHILD, null, PropertyKind.TAG, "lido:measurementValue",
				RelationKind.SEVENCHILD, null, PropertyKind.TAG, null, PropertyKind.DATA, "[a-zA-Z¸ˆ‰‹÷ƒ]");
	}

	public static CompletePattern getMatchLidoMeasurementUnit() {
		return getMatchConcrete("lido:lido", RelationKind.TWOCHILD, null, PropertyKind.TAG, "lido:measurementUnit",
				RelationKind.SEVENCHILD, null, PropertyKind.TAG, null, PropertyKind.DATA, "[0-9]");
	}

	public static CompletePattern getMatchLidoEarliestDate() {
		return getMatchConcrete("lido:lido", RelationKind.TWOCHILD, null, PropertyKind.TAG, "lido:earliestDate",
				RelationKind.SEVENCHILD, null, PropertyKind.TAG, null, PropertyKind.DATA, "^[0-9]{4}$");
	}

	public static CompletePattern getMatchLidoNamePlaceSet() {
		return getMatchConcrete("lido:lido", RelationKind.TWOCHILD, null, PropertyKind.TAG, "lido:namePlaceSet",
				RelationKind.SEVENCHILD, null, PropertyKind.TAG, null, PropertyKind.DATA, ",");
	}

	public static CompletePattern getMatchLidoAppellationValue() {
		return getMatchConcrete("lido:lido", RelationKind.TWOCHILD, null, PropertyKind.TAG, "lido:appellationValue",
				RelationKind.DESCENDANT, null, PropertyKind.TAG, null, PropertyKind.DATA, "\\?$");
	}
	
	public static CompletePattern getMatchLidoNameActorSetAbbreviation() {
		return getMatchThreeElementsTwoConditionsConcrete("lido:lido", RelationKind.TWOCHILD, null, PropertyKind.TAG, 
				"lido:nameActorSet", RelationKind.EIGHTCHILD, null, PropertyKind.TAG, 
				"lido:appellationValue", RelationKind.CHILD, null, PropertyKind.TAG, 
				null, PropertyKind.DATA, "\\.");
	}

}

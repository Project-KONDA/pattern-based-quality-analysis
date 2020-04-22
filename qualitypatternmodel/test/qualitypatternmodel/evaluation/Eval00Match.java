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
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class Eval00Match {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMatchLidoMeasurementValue());
		Test00.test(completePatterns);
		
	}
	public static CompletePattern getMatchAbstract() {
		GraphstructurePackage.eINSTANCE.eClass();
		
		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		XmlElement returnElementInReturnGraph = (XmlElement) completePattern.getGraph().getElements().get(0);		
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		XmlElement element2 = (XmlElement) quantifiedCondition.getGraph().getElements().get(1);	
		
		element2.addPrimitiveComparison(); 		
		element2.addPrimitiveMatch();
		
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
	
	public static CompletePattern getMatchMidasConcrete(String returnElementType, RelationKind returnElementAxis, String attribute1Name, PropertyKind attribute1Kind,
			String element2Type, RelationKind element2Axis, String attribute2Name, PropertyKind attribute2Kind, String attribute3Name, PropertyKind attribute3Kind, String regex) {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getMatchAbstract();
		XmlElement returnElementInReturnGraph = (XmlElement) completePattern.getGraph().getElements().get(0);		
//		returnElementInReturnGraph.getRelationFromPrevious().getOption().setValue(RelationKind.DESCENDANT);
		XmlNavigation relation1 = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		relation1.getOption().setValue(returnElementAxis);
		BooleanOperator comparisonReturnElementInReturnGraph = returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue(attribute1Name);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);
		
		QuantifiedCondition qc = (QuantifiedCondition) completePattern.getCondition();
//		Element returnElementInGraph1 = qc.getGraph().getReturnElements().get(0);				
//		Element element2 = returnElementInGraph1.getNextElements().get(0);
		XmlElement element2 = (XmlElement) qc.getGraph().getElements().get(1); // ?
//		element2.getRelationFromPrevious().getOption().setValue(RelationKind.DESCENDANT);
		XmlNavigation relation2 = (XmlNavigation) qc.getGraph().getRelations().get(0); // ?
		relation2.getOption().setValue(element2Axis);
		BooleanOperator comparisonElement2 = element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(element2Type);
		((UnknownParameterValue) comparisonElement2.getArguments().get(1)).concretize(concreteInputValue2);
		((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(attribute2Kind);
		
		BooleanOperator matchElement2 = element2.getPredicates().get(1);
		TextLiteralParam regularExpression = (TextLiteralParam) matchElement2.getArguments().get(1);
		regularExpression.setValue(regex);
		((XmlProperty) element2.getProperties().get(1)).getAttributeName().setValue(attribute3Name);
		((XmlProperty) element2.getProperties().get(1)).getOption().setValue(attribute3Kind);
		
		return completePattern;		
	}
	
	public static CompletePattern getMatchMidas5064() {		
		return getMatchMidasConcrete("obj", RelationKind.DESCENDANT, "Type", PropertyKind.ATTRIBUTE, "5064", RelationKind.DESCENDANT, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, ".*[a-zA-Z ]{10}.*");		
	}
	
	public static CompletePattern getMatchMidas5360() {		
		return getMatchMidasConcrete("obj", RelationKind.DESCENDANT, "Type", PropertyKind.ATTRIBUTE, "5360", RelationKind.DESCENDANT, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, "^[0-9]+(,[0-9]+)?( x [0-9]+(,[0-9]+)?)? (m|mm)( \\([a-zA-Z‰¸ˆƒ‹÷ ]+\\))?$");		
	}
	
	public static CompletePattern getMatchLidoConcrete(String returnElementName, String element2Name, String regex) {
		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getMatchAbstract();
		XmlElement returnElementInReturnGraph = (XmlElement) completePattern.getGraph().getElements().get(0);		
		XmlNavigation relation1 = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		relation1.getOption().setValue(RelationKind.DESCENDANT);
		BooleanOperator comparisonReturnElementInReturnGraph = returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementName);
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		QuantifiedCondition qc = (QuantifiedCondition) completePattern.getCondition();
		XmlElement element2 = (XmlElement) qc.getGraph().getElements().get(1);
		XmlNavigation relation2 = (XmlNavigation) qc.getGraph().getRelations().get(0); // ?
		relation2.getOption().setValue(RelationKind.DESCENDANT);
		BooleanOperator comparisonElement2 = element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(element2Name);
		((UnknownParameterValue) comparisonElement2.getArguments().get(1)).concretize(concreteInputValue2);
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		BooleanOperator matchElement2 = element2.getPredicates().get(1);
		TextLiteralParam regularExpression = (TextLiteralParam) matchElement2.getArguments().get(1);
		regularExpression.setValue(regex);
		((XmlProperty) element2.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
		
		return completePattern;		
	}
	
	public static CompletePattern getMatchLidoMeasurementValue() {		
		return getMatchLidoConcrete("lido:lido", "lido:measurementValue", "[a-zA-Z¸ˆ‰‹÷ƒ]");		
	}
	
	public static CompletePattern getMatchLidoMeasurementUnit() {		
		return getMatchLidoConcrete("lido:lido", "lido:measurementUnit", "[0-9]");		
	}
	
	public static CompletePattern getMatchLidoEarliestDate() {		
		return getMatchLidoConcrete("lido:lido", "lido:earliestDate", "^[0-9]{4}$");		
	}
	
	public static CompletePattern getMatchLidoNamePlaceSet() {		
		return getMatchLidoConcrete("lido:lido", "lido:namePlaceSet", ",");
	}
	

}

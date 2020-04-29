package qualitypatternmodel.evaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class Eval09Compval {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompvalMidas5230Objekt());
		completePatterns.add(getCompvalMidas5230Schloss());
		completePatterns.add(getCompvalMidas5230Print());
		completePatterns.add(getCompvalSetMidas3270());
		completePatterns.add(getCompvalLidoEventPlace());
		completePatterns.add(getCompvalLidoObjectWorkTypeObjekt());
		completePatterns.add(getCompvalLidoObjectWorkTypeSchloss());
		completePatterns.add(getCompvalLidoObjectWorkTypePrint());
		completePatterns.add(getCompvalSetLidoAppellationValue());
//		Test00.test(completePatterns);
		Test00.getQueries(completePatterns);

	}

	public static CompletePattern getCompvalAbstract() {

		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);
		returnElementInReturnGraph.addPrimitiveComparison();

		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Element next1 = graph1.getElements().get(1);
		next1.addPrimitiveComparison();
		next1.addPrimitiveComparison();

		completePattern.createXMLAdaption();
		graph1.getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();

		return completePattern;
	}

	public static CompletePattern getCompvalThreeElementsAbstract() {

		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);
		returnElementInReturnGraph.addPrimitiveComparison();

		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Element element1 = graph1.getElements().get(1);
		element1.addPrimitiveComparison();
		

		Element element2 = graphFactory.createElement();
		element2.setGraph(graph1);
		element2.addPrimitiveComparison();
		element2.addPrimitiveComparison();

		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph1);
		relation.setSource(element1);
		relation.setTarget(element2);

		completePattern.createXMLAdaption();
		graph1.getRelations().get(0).adaptAsXMLNavigation();
		relation.adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();

		return completePattern;
	}

	public static CompletePattern getCompvalThreeElementsConcrete(String returnElementType,
			RelationKind returnElementAxis, String attribute1Name, PropertyKind attribute1Kind, String element2Type,
			RelationKind element2Axis, String attribute2Name, PropertyKind attribute2Kind, String element3Type,
			RelationKind element3Axis, String attribute3Name, PropertyKind attribute3Kind, String attribute4Name,
			PropertyKind attribute4Kind, String value) {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = getCompvalThreeElementsAbstract();

		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(returnElementAxis);

		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates()
				.get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1))
				.concretize(concreteInputValue);
		if (attribute1Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName()
					.setValue(attribute1Name);
		}
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);

		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Element element2 = graph1.getElements().get(1);
		((XmlNavigation) graph1.getRelations().get(0)).getOption().setValue(element2Axis);

		Comparison comp1 = (Comparison) element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(element2Type);
		((UnknownParameterValue) comp1.getArguments().get(1)).concretize(concreteInputValue2);
		if (attribute2Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		}
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(attribute2Kind);

		Element element3 = graph1.getElements().get(2);
		((XmlNavigation) graph1.getRelations().get(1)).getOption().setValue(element3Axis);

		Comparison comp2 = (Comparison) element3.getPredicates().get(0);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue(element3Type);
		((UnknownParameterValue) comp2.getArguments().get(1)).concretize(concreteInputValue3);
		if (attribute3Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element3.getProperties().get(0)).getAttributeName().setValue(attribute3Name);
		}
		((XmlProperty) element3.getProperties().get(0)).getOption().setValue(attribute3Kind);

		Comparison comp3 = (Comparison) element3.getPredicates().get(1);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue(value);
		((UnknownParameterValue) comp3.getArguments().get(1)).concretize(concreteInputValue4);
		if (attribute3Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element3.getProperties().get(1)).getAttributeName().setValue(attribute4Name);
		}
		((XmlProperty) element3.getProperties().get(1)).getOption().setValue(attribute4Kind);

		return completePattern;
	}

	public static CompletePattern getCompvalConcrete(String returnElementType, RelationKind returnElementAxis,
			String attribute1Name, PropertyKind attribute1Kind, String element2Type, RelationKind element2Axis,
			String attribute2Name, PropertyKind attribute2Kind, String attribute3Name, PropertyKind attribute3Kind,
			String value) {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = getCompvalAbstract();

		Element element2 = concretize(returnElementType, returnElementAxis, attribute1Name, attribute1Kind,
				element2Type, element2Axis, attribute2Name, attribute2Kind, attribute3Name, attribute3Kind, parametersFactory,
				completePattern);

		Comparison comp2 = (Comparison) element2.getPredicates().get(1);

		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue(value);
		((UnknownParameterValue) comp2.getArguments().get(1)).concretize(concreteInputValue3);

		return completePattern;
	}

	public static CompletePattern getCompvalSetConcrete(String returnElementType, RelationKind returnElementAxis,
			String attribute1Name, PropertyKind attribute1Kind, String element2Type, RelationKind element2Axis,
			String attribute2Name, PropertyKind attribute2Kind, String attribute3Name, PropertyKind attribute3Kind,
			List<String> values) {

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = getCompvalAbstract();

		Element element2 = concretize(returnElementType, returnElementAxis, attribute1Name, attribute1Kind,
				element2Type, element2Axis, attribute2Name, attribute2Kind, attribute3Name, attribute3Kind, parametersFactory,
				completePattern);

		Comparison comp2 = (Comparison) element2.getPredicates().get(1);

		TextListParam concreteInputValue3 = parametersFactory.createTextListParam();
		for (String str : values) {
			concreteInputValue3.getValues().add(str);
		}
		((UnknownParameterValue) comp2.getArguments().get(1)).concretize(concreteInputValue3);

		return completePattern;
	}

	private static Element concretize(String returnElementType, RelationKind returnElementAxis, String attribute1Name,
			PropertyKind attribute1Kind, String element2Type, RelationKind element2Axis, String attribute2Name, PropertyKind attribute2Kind,
			String attribute3Name, PropertyKind attribute3Kind, ParametersFactory parametersFactory,
			CompletePattern completePattern) {

		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(returnElementAxis);

		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates()
				.get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1))
				.concretize(concreteInputValue);
		if (attribute1Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName()
					.setValue(attribute1Name);
		}
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);

		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Element element2 = graph1.getElements().get(1);
		((XmlNavigation) graph1.getRelations().get(0)).getOption().setValue(element2Axis);

		Comparison comp1 = (Comparison) element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(element2Type);
		((UnknownParameterValue) comp1.getArguments().get(1)).concretize(concreteInputValue2);
		if (attribute2Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		}
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(attribute2Kind);

		if (attribute3Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element2.getProperties().get(1)).getAttributeName().setValue(attribute3Name);
		}
		((XmlProperty) element2.getProperties().get(1)).getOption().setValue(attribute3Kind);
		return element2;
	}

	public static CompletePattern getCompvalMidas5230Objekt() {
		return getCompvalConcrete("obj", RelationKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "5230",
				RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, "Objekt");
	}

	public static CompletePattern getCompvalMidas5230Schloss() {
		return getCompvalConcrete("obj", RelationKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "5230",
				RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, "Schloss");
	}

	public static CompletePattern getCompvalMidas5230Print() {
		return getCompvalConcrete("obj", RelationKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "5230",
				RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, "Print");
	}

	public static CompletePattern getCompvalSetMidas3270() {
		List<String> values = Arrays.asList("unbekannt", "x", "y", "?");
		return getCompvalSetConcrete("kue", RelationKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "3270",
				RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, values);
	}

	public static CompletePattern getCompvalLidoEventPlace() {
		return getCompvalConcrete("lido:lido", RelationKind.TWOCHILD, null, PropertyKind.TAG, "lido:eventPlace",
				RelationKind.FIVECHILD, null, PropertyKind.TAG, "lido:type", PropertyKind.ATTRIBUTE, "alternative");
	}

	public static CompletePattern getCompvalLidoObjectWorkTypeObjekt() {
		return getCompvalThreeElementsConcrete("lido:lido", RelationKind.TWOCHILD, null, PropertyKind.TAG,
				"lido:objectWorkType", RelationKind.FOURCHILD, null, PropertyKind.TAG,
				"lido:term", RelationKind.CHILD, null, PropertyKind.TAG, 
				null, PropertyKind.DATA, "Objekt");
	}
	
	public static CompletePattern getCompvalLidoObjectWorkTypeSchloss() {
		return getCompvalThreeElementsConcrete("lido:lido", RelationKind.TWOCHILD, null, PropertyKind.TAG,
				"lido:objectWorkType", RelationKind.FOURCHILD, null, PropertyKind.TAG,
				"lido:term", RelationKind.CHILD, null, PropertyKind.TAG, 
				null, PropertyKind.DATA, "Schloss");
	}
	
	public static CompletePattern getCompvalLidoObjectWorkTypePrint() {
		return getCompvalThreeElementsConcrete("lido:lido", RelationKind.TWOCHILD, null, PropertyKind.TAG,
				"lido:objectWorkType", RelationKind.FOURCHILD, null, PropertyKind.TAG,
				"lido:term", RelationKind.CHILD, null, PropertyKind.TAG, 
				null, PropertyKind.DATA, "Print");
	}
	
	public static CompletePattern getCompvalSetLidoAppellationValue() {
		List<String> values = Arrays.asList("unbekannt", "x", "unknown", "?");
		return getCompvalSetConcrete("lido:lido", RelationKind.TWOCHILD, null, PropertyKind.TAG, 
				"lido:appellationValue", RelationKind.FIVECHILD, null, PropertyKind.TAG, null, PropertyKind.DATA, values);
	}
}

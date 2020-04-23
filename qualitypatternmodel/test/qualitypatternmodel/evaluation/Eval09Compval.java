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
		completePatterns.add(getCompvalSetMidas3270());
		Test00.test(completePatterns);
		
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
	
	public static CompletePattern getCompvalMidasConcrete(String returnElementType, RelationKind returnElementAxis, String attribute1Name, PropertyKind attribute1Kind,
			String element2Type, RelationKind element2Axis, String attribute2Name, PropertyKind attribute2Kind, String attribute3Name, PropertyKind attribute3Kind, String value) {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCompvalAbstract();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(returnElementAxis);
		
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue(attribute1Name);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();		
		
		Element element2 = graph1.getElements().get(1);
		
		Comparison comp1 = (Comparison) element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(element2Type);
		((UnknownParameterValue) comp1.getArguments().get(1)).concretize(concreteInputValue2);
		((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(attribute2Kind);
		
		Comparison comp2 = (Comparison) element2.getPredicates().get(1);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue(value);
		((UnknownParameterValue) comp2.getArguments().get(1)).concretize(concreteInputValue3);
		((XmlProperty) element2.getProperties().get(1)).getAttributeName().setValue(attribute3Name);
		((XmlProperty) element2.getProperties().get(1)).getOption().setValue(attribute3Kind);
		
		return completePattern;		
	}
	
	public static CompletePattern getCompvalSetMidasConcrete(String returnElementType, RelationKind returnElementAxis, String attribute1Name, PropertyKind attribute1Kind,
			String element2Type, RelationKind element2Axis, String attribute2Name, PropertyKind attribute2Kind, String attribute3Name, PropertyKind attribute3Kind, List<String> values) {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCompvalAbstract();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(returnElementAxis);
		
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue(attribute1Name);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();		
		
		Element element2 = graph1.getElements().get(1);
		
		Comparison comp1 = (Comparison) element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(element2Type);
		((UnknownParameterValue) comp1.getArguments().get(1)).concretize(concreteInputValue2);
		((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(attribute2Kind);
		
		Comparison comp2 = (Comparison) element2.getPredicates().get(1);
//		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
//		concreteInputValue3.setValue(value);
//		((UnknownParameterValue) comp2.getArguments().get(1)).concretize(concreteInputValue3);
		TextListParam concreteInputValue3 = parametersFactory.createTextListParam();
		for(String str : values) {
			concreteInputValue3.getValues().add(str);
		}
//		concreteInputValue2.getValues().add("m");	
//		concreteInputValue2.getValues().add("f");
//		concreteInputValue2.getValues().add("unbekannt");
//		concreteInputValue2.getValues().add("m?");
//		concreteInputValue2.getValues().add("f?");
//		concreteInputValue2.getValues().add("?");
		((UnknownParameterValue) comp2.getArguments().get(1)).concretize(concreteInputValue3);
		((XmlProperty) element2.getProperties().get(1)).getAttributeName().setValue(attribute3Name);
		((XmlProperty) element2.getProperties().get(1)).getOption().setValue(attribute3Kind);
		
		return completePattern;		
	}
	
	public static CompletePattern getCompvalMidas5230Objekt() {
		return getCompvalMidasConcrete("obj", RelationKind.DESCENDANT, "Type", PropertyKind.ATTRIBUTE, "5230", RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, "Objekt");
	}
	
	public static CompletePattern getCompvalMidas5230Schloss() {
		return getCompvalMidasConcrete("obj", RelationKind.DESCENDANT, "Type", PropertyKind.ATTRIBUTE, "5230", RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, "Schloss");
	}
	
	public static CompletePattern getCompvalMidas5230Print() {
		return getCompvalMidasConcrete("obj", RelationKind.DESCENDANT, "Type", PropertyKind.ATTRIBUTE, "5230", RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, "Print");
	}
	
	public static CompletePattern getCompvalSetMidas3270() {
		List<String> values = Arrays.asList("unbekannt","x","y","?");	
		return getCompvalSetMidasConcrete("kue", RelationKind.DESCENDANT, "Type", PropertyKind.ATTRIBUTE, "3270", RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, values);
	}
}

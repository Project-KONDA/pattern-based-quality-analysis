package qualitypatternmodel.evaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.patternstructure.validation.NotElementValidator;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;
import qualitypatternmodel.translationtests.Test06NotElement;

public class Eval05Compset {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompsetMIDAS3140());
		Test00.test(completePatterns);
		
	}
	
	public static CompletePattern getCompsetAbstract() {	
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;		
				
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		TrueElement t = (TrueElement) ((QuantifiedCondition) completePattern.getCondition()).getCondition();
		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition(); 
		NotCondition n = factory.createNotCondition();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
				
		qc1.setCondition(n);
		n.setCondition(qc2);
		qc2.setCondition(t);
		
		Element e1g0 = completePattern.getGraph().getElements().get(0);
		e1g0.addPrimitiveComparison();
		
		Element e1g1 = qc1.getGraph().getElements().get(0);	
		
		Element e2g1 = qc1.getGraph().getElements().get(1);	
		e2g1.addPrimitiveComparison();
		
		Relation relation = graphFactory.createRelation();
		relation.setGraph(qc1.getGraph());
		relation.setSource(e1g1);
		relation.setTarget(e2g1);
		
		Element e2g2 = qc2.getGraph().getElements().get(1);
		e2g2.addPrimitiveComparison();
		
		completePattern.createXMLAdaption();
		relation.adaptAsXMLNavigation();	
		completePattern.finalizeXMLAdaption();	
		
		return completePattern; 
	}
	
	public static CompletePattern getCompsetMIDASConcrete(String returnElementType, RelationKind returnElementAxis, String attribute1Name, PropertyKind attribute1Kind,
			String element2Type, RelationKind element2Axis, String attribute2Name, PropertyKind attribute2Kind, String attribute3Name, PropertyKind attribute3Kind, List<String> values) {	
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCompsetAbstract();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);	
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(returnElementAxis);
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue(attribute1Name);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);
		
		QuantifiedCondition condition = (QuantifiedCondition) completePattern.getCondition();
		Graph graph1 = condition.getGraph();
		Element nextToReturnElementInGraph1 =  graph1.getElements().get(1);
		
		Comparison comparison1 = (Comparison) nextToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue(element2Type);
		((UnknownParameterValue) comparison1.getArguments().get(1)).concretize(concreteInputValue1);
		((XmlProperty) nextToReturnElementInGraph1.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		((XmlProperty) nextToReturnElementInGraph1.getProperties().get(0)).getOption().setValue(attribute2Kind);
	
		NotCondition notCondition = (NotCondition) condition.getCondition();
		QuantifiedCondition condition2 = (QuantifiedCondition) notCondition.getCondition();
		Graph graph2 = condition2.getGraph();
		Element nextToReturnElementInGraph2 = graph2.getElements().get(1);
		
		Comparison comparison2 = (Comparison) nextToReturnElementInGraph2.getPredicates().get(0);
		TextListParam concreteInputValue2 = parametersFactory.createTextListParam();
		for(String str : values) {
			concreteInputValue2.getValues().add(str);
		}
//		concreteInputValue2.getValues().add("m");	
//		concreteInputValue2.getValues().add("f");
//		concreteInputValue2.getValues().add("unbekannt");
//		concreteInputValue2.getValues().add("m?");
//		concreteInputValue2.getValues().add("f?");
//		concreteInputValue2.getValues().add("?");
		((UnknownParameterValue) comparison2.getArguments().get(1)).concretize(concreteInputValue2);
		((XmlProperty) nextToReturnElementInGraph2.getProperties().get(0)).getAttributeName().setValue(attribute3Name);
		((XmlProperty) nextToReturnElementInGraph2.getProperties().get(0)).getOption().setValue(attribute3Kind);		
		
		return completePattern;
	}
	
	public static CompletePattern getCompsetMIDAS3140() {			
		List<String> values = Arrays.asList("m","f","unbekannt","m?","f?","?");		
		return getCompsetMIDASConcrete("kue", RelationKind.DESCENDANT, "Type", PropertyKind.ATTRIBUTE, "3140", RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, values);
	}
	
	public static CompletePattern getCompsetLido() {	
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCompsetAbstract();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);	
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(RelationKind.DESCENDANT);
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("lido:lido");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		QuantifiedCondition condition = (QuantifiedCondition) completePattern.getCondition();
		Graph graph1 = condition.getGraph();
		Element nextToReturnElementInGraph1 = graph1.getElements().get(1);	
		((XmlNavigation) graph1.getRelations().get(0)).getOption().setValue(RelationKind.DESCENDANT);
		
		Comparison comparison1 = (Comparison) nextToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("lido:genderActor");
		((UnknownParameterValue) comparison1.getArguments().get(1)).concretize(concreteInputValue1);
		((XmlProperty) nextToReturnElementInGraph1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
	
		NotCondition notCondition = (NotCondition) condition.getCondition();
		QuantifiedCondition condition2 = (QuantifiedCondition) notCondition.getCondition();
		Graph graph2 = condition2.getGraph();
		Element nextToReturnElementInGraph2 = graph2.getElements().get(1);
		
		Comparison comparison2 = (Comparison) nextToReturnElementInGraph2.getPredicates().get(0);
		TextListParam concreteInputValue2 = parametersFactory.createTextListParam();
		concreteInputValue2.getValues().add("male");	
		concreteInputValue2.getValues().add("männlich");
		concreteInputValue2.getValues().add("weiblich");
		concreteInputValue2.getValues().add("female");
		concreteInputValue2.getValues().add("unknown");
		concreteInputValue2.getValues().add("not applicable");
		((UnknownParameterValue) comparison2.getArguments().get(1)).concretize(concreteInputValue2);
		((XmlProperty) nextToReturnElementInGraph2.getProperties().get(0)).getOption().setValue(PropertyKind.DATA);		
		
		return completePattern;
	}
}

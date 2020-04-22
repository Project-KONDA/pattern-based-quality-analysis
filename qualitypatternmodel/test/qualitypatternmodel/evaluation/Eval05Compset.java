package qualitypatternmodel.evaluation;

import java.util.ArrayList;

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
		completePatterns.add(getCompsetLido());
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
	
	public static CompletePattern getCompsetMIDAS() {	
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCompsetAbstract();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);	
		XmlNavigation relation = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		relation.getOption().setValue(RelationKind.DESCENDANT);
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("kue");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		QuantifiedCondition condition = (QuantifiedCondition) completePattern.getCondition();
		Graph graph1 = condition.getGraph();
		Element nextToReturnElementInGraph1 =  graph1.getElements().get(1);
		
		Comparison comparison1 = (Comparison) nextToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("3140");
		((UnknownParameterValue) comparison1.getArguments().get(1)).concretize(concreteInputValue1);
		((XmlProperty) nextToReturnElementInGraph1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) nextToReturnElementInGraph1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
	
		NotCondition notCondition = (NotCondition) condition.getCondition();
		QuantifiedCondition condition2 = (QuantifiedCondition) notCondition.getCondition();
		Graph graph2 = condition2.getGraph();
		Element nextToReturnElementInGraph2 = graph2.getElements().get(1);
		
		Comparison comparison2 = (Comparison) nextToReturnElementInGraph2.getPredicates().get(0);
		TextListParam concreteInputValue2 = parametersFactory.createTextListParam();
		concreteInputValue2.getValues().add("m");	
		concreteInputValue2.getValues().add("f");
		concreteInputValue2.getValues().add("unbekannt");
		concreteInputValue2.getValues().add("m?");
		concreteInputValue2.getValues().add("f?");
		concreteInputValue2.getValues().add("?");
		((UnknownParameterValue) comparison2.getArguments().get(1)).concretize(concreteInputValue2);
		((XmlProperty) nextToReturnElementInGraph2.getProperties().get(0)).getAttributeName().setValue("Value");
		((XmlProperty) nextToReturnElementInGraph2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);		
		
		return completePattern;
	}
	
	public static CompletePattern getCompsetLido() {	
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCompsetAbstract();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);	
		XmlNavigation relation = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		relation.getOption().setValue(RelationKind.DESCENDANT);
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("lido:lido");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		QuantifiedCondition condition = (QuantifiedCondition) completePattern.getCondition();
		Graph graph1 = condition.getGraph();
		Element nextToReturnElementInGraph1 = graph1.getElements().get(1);	
		XmlNavigation relation1 = (XmlNavigation) graph1.getRelations().get(0);
		relation1.getOption().setValue(RelationKind.DESCENDANT);
		
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

package qualitypatternmodel.evaluation;

import java.util.ArrayList;

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
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.translationtests.Test00;

public class Eval08Mandatt {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandattMidas());
		completePatterns.add(getMandattLido());
		completePatterns.add(getMandattThreeElementsLido());
		Test00.test(completePatterns);
		
	}
	
	private static CompletePattern getMandattAbstract() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getElements().get(0).addPrimitiveComparison();
		Formula form = factory.createFormula();
		completePattern.setCondition(form);
		form.setOperator(LogicalOperator.OR);
		
		NotCondition notC = factory.createNotCondition();
		QuantifiedCondition qcN = factory.createQuantifiedCondition();
		TrueElement te1 = factory.createTrueElement();
		form.setCondition1(notC);
		notC.setCondition(qcN);
		qcN.setCondition(te1);		
		
		Graph graph1 = qcN.getGraph();
		Element returnInGraph1 = graph1.getElements().get(0);
		Element element2 = graphFactory.createElement();
		element2.setGraph(graph1);
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph1);
		relation.setSource(returnInGraph1);
		relation.setTarget(element2);
		element2.addPrimitiveComparison();
		
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		TrueElement te2 = factory.createTrueElement();
		form.setCondition2(qc1);
		qc1.setCondition(te2);
		
		Graph graph2 = qc1.getGraph();
		Element returnInGraph2 = graph2.getElements().get(0);
		Element element3 = graphFactory.createElement();
		element3.setGraph(graph2);
		Relation relation2 = graphFactory.createRelation();
		relation2.setGraph(graph2);
		relation2.setSource(returnInGraph2);
		relation2.setTarget(element3);
		element3.addPrimitiveComparison();
		element3.addPrimitiveComparison();	
		
		completePattern.createXMLAdaption();
		relation.adaptAsXMLNavigation();
		relation2.adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		return completePattern;		
	}
	
	private static CompletePattern getMandattAbstractThreeElements() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getElements().get(0).addPrimitiveComparison();		
		
		QuantifiedCondition qc0 = factory.createQuantifiedCondition();
		completePattern.setCondition(qc0);		
		
		Graph graph0 = qc0.getGraph();
		Element returnInGraph0 = graph0.getElements().get(0);
		Element element0 = graphFactory.createElement();
		element0.setGraph(graph0);
		Relation relation0 = graphFactory.createRelation();
		relation0.setGraph(graph0);
		relation0.setSource(returnInGraph0);
		relation0.setTarget(element0);
		element0.addPrimitiveComparison();		
		
		Formula form = factory.createFormula();
		qc0.setCondition(form);
		form.setOperator(LogicalOperator.OR);		
		
		NotCondition notC = factory.createNotCondition();		
		QuantifiedCondition qcN = factory.createQuantifiedCondition();
		TrueElement te1 = factory.createTrueElement();
		form.setCondition1(notC);
		notC.setCondition(qcN);
		qcN.setCondition(te1);			
	
		Graph graph1 = qcN.getGraph();
		
		Element returnInGraph1 = graph1.getElements().get(0);
		Element e0InGraph1 = graph1.getElements().get(1);
		Element element2 = graphFactory.createElement();
		element2.setGraph(graph1);
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph1);
		relation.setSource(e0InGraph1);
		relation.setTarget(element2);
		element2.addPrimitiveComparison();
		
		Element element5 = graphFactory.createElement();
		element5.setGraph(graph1);
		Relation relation4 = graphFactory.createRelation();
		relation4.setGraph(graph1);
		relation4.setSource(element2);
		relation4.setTarget(element5);
		element5.addPrimitiveComparison();
		
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		TrueElement te2 = factory.createTrueElement();
		form.setCondition2(qc1);
		qc1.setCondition(te2);
				
		Graph graph2 = qc1.getGraph();
		Element returnInGraph2 = graph2.getElements().get(0);
		Element e0InGraph2 = graph2.getElements().get(1);
		Element element3 = graphFactory.createElement();
		element3.setGraph(graph2);
		Relation relation2 = graphFactory.createRelation();
		relation2.setGraph(graph2);
		relation2.setSource(e0InGraph2);
		relation2.setTarget(element3);
//		element3.addPrimitiveComparison();
		element3.addPrimitiveComparison();	
		
		Element element4 = graphFactory.createElement();
		element4.setGraph(graph2);
		Relation relation3 = graphFactory.createRelation();
		relation3.setGraph(graph2);
		relation3.setSource(element3);
		relation3.setTarget(element4);
		element4.addPrimitiveComparison();
		element4.addPrimitiveComparison();	
		
		completePattern.createXMLAdaption();
		relation0.adaptAsXMLNavigation();
		relation.adaptAsXMLNavigation();
		relation2.adaptAsXMLNavigation();
		relation3.adaptAsXMLNavigation();
		relation4.adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		return completePattern;		
	}
	
	
	private static CompletePattern getMandattMidas() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getMandattAbstract();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);	
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(RelationKind.DESCENDANT);
		
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("kue");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Formula formula = (Formula) completePattern.getCondition();
		NotCondition not = (NotCondition) formula.getCondition1();
		QuantifiedCondition qc1 = (QuantifiedCondition) not.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) formula.getCondition2();
		
		Graph graph1 = qc1.getGraph();
		Element next1ToReturnElementInGraph1 = graph1.getElements().get(1);
		Comparison comparison1 = (Comparison) next1ToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("3162");
		((UnknownParameterValue) comparison1.getArguments().get(1)).concretize(concreteInputValue1);
		((XmlProperty) next1ToReturnElementInGraph1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) next1ToReturnElementInGraph1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Graph graph2 = qc2.getGraph();
		Element next1ToReturnElementInGraph2 = graph2.getElements().get(1);
		
		Comparison comparison2 = (Comparison) next1ToReturnElementInGraph2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("3162");
		((UnknownParameterValue) comparison2.getArguments().get(1)).concretize(concreteInputValue2);
		((XmlProperty) next1ToReturnElementInGraph2.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) next1ToReturnElementInGraph2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Comparison comparison3 = (Comparison) next1ToReturnElementInGraph2.getPredicates().get(1);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("");
		((UnknownParameterValue) comparison3.getArguments().get(1)).concretize(concreteInputValue3);
		((XmlProperty) next1ToReturnElementInGraph2.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) next1ToReturnElementInGraph2.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		return completePattern;
	}
	
	private static CompletePattern getMandattLido() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getMandattAbstract();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);	
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(RelationKind.DESCENDANT);
				
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("lido:lido");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Formula formula = (Formula) completePattern.getCondition();
		NotCondition not = (NotCondition) formula.getCondition1();
		QuantifiedCondition qc1 = (QuantifiedCondition) not.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) formula.getCondition2();
		
		Graph graph1 = qc1.getGraph();
		Element next1ToReturnElementInGraph1 = graph1.getElements().get(1);
		((XmlNavigation) graph1.getRelations().get(0)).getOption().setValue(RelationKind.DESCENDANT);
		Comparison comparison1 = (Comparison) next1ToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("lido:appellationValue");
		((UnknownParameterValue) comparison1.getArguments().get(1)).concretize(concreteInputValue1);
		((XmlProperty) next1ToReturnElementInGraph1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Graph graph2 = qc2.getGraph();
		Element next1ToReturnElementInGraph2 = graph2.getElements().get(1);
		((XmlNavigation) graph2.getRelations().get(0)).getOption().setValue(RelationKind.DESCENDANT);
		
		Comparison comparison2 = (Comparison) next1ToReturnElementInGraph2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("lido:appellationValue");
		((UnknownParameterValue) comparison2.getArguments().get(1)).concretize(concreteInputValue2);
		((XmlProperty) next1ToReturnElementInGraph2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Comparison comparison3 = (Comparison) next1ToReturnElementInGraph2.getPredicates().get(1);
		TextListParam concreteInputValue3 = parametersFactory.createTextListParam();
		concreteInputValue3.getValues().add("unbekannt");
		concreteInputValue3.getValues().add("");
		concreteInputValue3.getValues().add("?");
		concreteInputValue3.getValues().add("x");
		concreteInputValue3.getValues().add("unknown");
		((UnknownParameterValue) comparison3.getArguments().get(1)).concretize(concreteInputValue3);
		((XmlProperty) next1ToReturnElementInGraph2.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
		
		return completePattern;
	}
	
	private static CompletePattern getMandattThreeElementsLido() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getMandattAbstractThreeElements();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);	
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(RelationKind.DESCENDANT);
				
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("lido:lido");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		QuantifiedCondition qc0 = (QuantifiedCondition) completePattern.getCondition();
		
		
		Formula formula = (Formula) qc0.getCondition();
		NotCondition not = (NotCondition) formula.getCondition1();
		QuantifiedCondition qc1 = (QuantifiedCondition) not.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) formula.getCondition2();
		
		Graph graph0 = qc0.getGraph();
		Element element1InG0 = graph0.getElements().get(1);
		((XmlNavigation) graph0.getRelations().get(0)).getOption().setValue(RelationKind.DESCENDANT);
		Comparison comparison = (Comparison) element1InG0.getPredicates().get(0);
		TextLiteralParam concreteInputValue0 = parametersFactory.createTextLiteralParam();
		concreteInputValue0.setValue("lido:actor");
		((UnknownParameterValue) comparison.getArguments().get(1)).concretize(concreteInputValue0);
		((XmlProperty) element1InG0.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Graph graph1 = qc1.getGraph();
		
		Element element2InG1 = graph1.getElements().get(2);
		((XmlNavigation) graph1.getRelations().get(1)).getOption().setValue(RelationKind.DESCENDANT);
		Comparison comparison1 = (Comparison) element2InG1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("lido:nameActorSet");
		((UnknownParameterValue) comparison1.getArguments().get(1)).concretize(concreteInputValue1);
		((XmlProperty) element2InG1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Element next1ToReturnElementInGraph1 = graph1.getElements().get(3);
		((XmlNavigation) graph1.getRelations().get(1)).getOption().setValue(RelationKind.DESCENDANT);
		Comparison comparison2G1 = (Comparison) next1ToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue2G1 = parametersFactory.createTextLiteralParam();
		concreteInputValue2G1.setValue("lido:appellationValue");
		((UnknownParameterValue) comparison2G1.getArguments().get(1)).concretize(concreteInputValue2G1);
		((XmlProperty) next1ToReturnElementInGraph1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Graph graph2 = qc2.getGraph();
		
		Element element2 = graph2.getElements().get(2);
		((XmlNavigation) graph2.getRelations().get(1)).getOption().setValue(RelationKind.DESCENDANT);
		
		Comparison comparison2 = (Comparison) element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("lido:nameActorSet");
		((UnknownParameterValue) comparison2.getArguments().get(1)).concretize(concreteInputValue2);
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Element element3 = graph2.getElements().get(3);
		((XmlNavigation) graph2.getRelations().get(2)).getOption().setValue(RelationKind.DESCENDANT);
		
		Comparison comparison3 = (Comparison) element3.getPredicates().get(0);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("lido:appellationValue");
		((UnknownParameterValue) comparison3.getArguments().get(1)).concretize(concreteInputValue3);
		((XmlProperty) element3.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Comparison comparison4 = (Comparison) element3.getPredicates().get(1);
		TextListParam concreteInputValue4 = parametersFactory.createTextListParam();
//		concreteInputValue4.getValues().add("unbekannt");
		concreteInputValue4.getValues().add("");
//		concreteInputValue4.getValues().add("?");
//		concreteInputValue4.getValues().add("x");
//		concreteInputValue4.getValues().add("unknown");
		((UnknownParameterValue) comparison4.getArguments().get(1)).concretize(concreteInputValue4);
		((XmlProperty) element3.getProperties().get(1)).getOption().setValue(PropertyKind.DATA);
		
		return completePattern;
	}
	
}

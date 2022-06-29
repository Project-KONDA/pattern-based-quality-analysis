package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalMandatt {
	
	// also called MAND
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandattMidas());
		completePatterns.add(getMandattLido());
		completePatterns.add(getMandattThreeElementsLido());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);		
	}
	
	private static CompletePattern getMandattAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getNodes().get(0).addPrimitiveComparison();
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
		Node returnInGraph1 = graph1.getNodes().get(0);
		Node element2 = graphFactory.createNode();
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
		Node returnInGraph2 = graph2.getNodes().get(0);
		Node element3 = graphFactory.createNode();
		element3.setGraph(graph2);
		Relation relation2 = graphFactory.createRelation();
		relation2.setGraph(graph2);
		relation2.setSource(returnInGraph2);
		relation2.setTarget(element3);
		element3.addPrimitiveComparison();
		element3.addPrimitiveComparison();	
		
		completePattern.createXmlAdaption();
		relation.adaptAsXmlElementNavigation();
		relation2.adaptAsXmlElementNavigation();
		completePattern.finalizeXMLAdaption();
		
		return completePattern;		
	}
	
	private static CompletePattern getMandattAbstractThreeElements() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getNodes().get(0).addPrimitiveComparison();		
		
		QuantifiedCondition qc0 = factory.createQuantifiedCondition();
		completePattern.setCondition(qc0);		
		
		Graph graph0 = qc0.getGraph();
		Node returnInGraph0 = graph0.getNodes().get(0);
		Node element0 = graphFactory.createNode();
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
		
		Node returnInGraph1 = graph1.getNodes().get(0);
		Node e0InGraph1 = graph1.getNodes().get(1);
		Node element2 = graphFactory.createNode();
		element2.setGraph(graph1);
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph1);
		relation.setSource(e0InGraph1);
		relation.setTarget(element2);
		element2.addPrimitiveComparison();
		
		Node element5 = graphFactory.createNode();
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
		Node returnInGraph2 = graph2.getNodes().get(0);
		Node e0InGraph2 = graph2.getNodes().get(1);
		Node element3 = graphFactory.createNode();
		element3.setGraph(graph2);
		Relation relation2 = graphFactory.createRelation();
		relation2.setGraph(graph2);
		relation2.setSource(e0InGraph2);
		relation2.setTarget(element3);
//		element3.addPrimitiveComparison();
		element3.addPrimitiveComparison();	
		
		Node element4 = graphFactory.createNode();
		element4.setGraph(graph2);
		Relation relation3 = graphFactory.createRelation();
		relation3.setGraph(graph2);
		relation3.setSource(element3);
		relation3.setTarget(element4);
		element4.addPrimitiveComparison();
		element4.addPrimitiveComparison();	
		
		completePattern.createXmlAdaption();
		relation0.adaptAsXmlElementNavigation();
		relation.adaptAsXmlElementNavigation();
		relation2.adaptAsXmlElementNavigation();
		relation3.adaptAsXmlElementNavigation();
		relation4.adaptAsXmlElementNavigation();
		completePattern.finalizeXMLAdaption();
		
		return completePattern;		
	}
	
	
	static CompletePattern getMandattMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getMandattAbstract();
		
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);	
		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setValue(XmlAxisKind.THREECHILD);
		
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("kue");
		((UntypedParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).replace(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(XmlPropertyKind.ATTRIBUTE);
		
		Formula formula = (Formula) completePattern.getCondition();
		NotCondition not = (NotCondition) formula.getCondition1();
		QuantifiedCondition qc1 = (QuantifiedCondition) not.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) formula.getCondition2();
		
		Graph graph1 = qc1.getGraph();
		Node next1ToReturnElementInGraph1 = graph1.getNodes().get(1);
		Comparison comparison1 = (Comparison) next1ToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("3162");
		((UntypedParameterValue) comparison1.getArguments().get(1)).replace(concreteInputValue1);
		((XmlProperty) next1ToReturnElementInGraph1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) next1ToReturnElementInGraph1.getProperties().get(0)).getOption().setValue(XmlPropertyKind.ATTRIBUTE);
		
		Graph graph2 = qc2.getGraph();
		Node next1ToReturnElementInGraph2 = graph2.getNodes().get(1);
		
		Comparison comparison2 = (Comparison) next1ToReturnElementInGraph2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("3162");
		((UntypedParameterValue) comparison2.getArguments().get(1)).replace(concreteInputValue2);
		((XmlProperty) next1ToReturnElementInGraph2.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) next1ToReturnElementInGraph2.getProperties().get(0)).getOption().setValue(XmlPropertyKind.ATTRIBUTE);
		
		Comparison comparison3 = (Comparison) next1ToReturnElementInGraph2.getPredicates().get(1);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("");
		((UntypedParameterValue) comparison3.getArguments().get(1)).replace(concreteInputValue3);
		((XmlProperty) next1ToReturnElementInGraph2.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) next1ToReturnElementInGraph2.getProperties().get(1)).getOption().setValue(XmlPropertyKind.ATTRIBUTE);
		
		return completePattern;
	}
	
	private static CompletePattern getMandattLido() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getMandattAbstract();
		
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);	
		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setValue(XmlAxisKind.TWOCHILD);
				
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("lido:lido");
		((UntypedParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).replace(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(XmlPropertyKind.TAG);
		
		Formula formula = (Formula) completePattern.getCondition();
		NotCondition not = (NotCondition) formula.getCondition1();
		QuantifiedCondition qc1 = (QuantifiedCondition) not.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) formula.getCondition2();
		
		Graph graph1 = qc1.getGraph();
		Node next1ToReturnElementInGraph1 = graph1.getNodes().get(1);
		((XmlElementNavigation) graph1.getRelations().get(0)).getXmlPathParam().setValue(XmlAxisKind.FIVECHILD);
		Comparison comparison1 = (Comparison) next1ToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("lido:appellationValue");
		((UntypedParameterValue) comparison1.getArguments().get(1)).replace(concreteInputValue1);
		((XmlProperty) next1ToReturnElementInGraph1.getProperties().get(0)).getOption().setValue(XmlPropertyKind.TAG);
		
		Graph graph2 = qc2.getGraph();
		Node next1ToReturnElementInGraph2 = graph2.getNodes().get(1);
		((XmlElementNavigation) graph2.getRelations().get(0)).getXmlPathParam().setValue(XmlAxisKind.FIVECHILD);
		
		Comparison comparison2 = (Comparison) next1ToReturnElementInGraph2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("lido:appellationValue");
		((UntypedParameterValue) comparison2.getArguments().get(1)).replace(concreteInputValue2);
		((XmlProperty) next1ToReturnElementInGraph2.getProperties().get(0)).getOption().setValue(XmlPropertyKind.TAG);
		
		Comparison comparison3 = (Comparison) next1ToReturnElementInGraph2.getPredicates().get(1);
		TextListParam concreteInputValue3 = parametersFactory.createTextListParam();
		concreteInputValue3.getValues().add("unbekannt");
		concreteInputValue3.getValues().add("");
		concreteInputValue3.getValues().add("?");
		concreteInputValue3.getValues().add("x");
		concreteInputValue3.getValues().add("unknown");
		((UntypedParameterValue) comparison3.getArguments().get(1)).replace(concreteInputValue3);
		((XmlProperty) next1ToReturnElementInGraph2.getProperties().get(1)).getOption().setValue(XmlPropertyKind.DATA);
		
		return completePattern;
	}
	
	static CompletePattern getMandattThreeElementsLido() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getMandattAbstractThreeElements();
		
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);	
		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setValue(XmlAxisKind.TWOCHILD);
				
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("lido:lido");
		((UntypedParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).replace(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(XmlPropertyKind.TAG);
		
		QuantifiedCondition qc0 = (QuantifiedCondition) completePattern.getCondition();
		
		
		Formula formula = (Formula) qc0.getCondition();
		NotCondition not = (NotCondition) formula.getCondition1();
		QuantifiedCondition qc1 = (QuantifiedCondition) not.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) formula.getCondition2();
		
		Graph graph0 = qc0.getGraph();
		Node element1InG0 = graph0.getNodes().get(1);
		((XmlElementNavigation) graph0.getRelations().get(0)).getXmlPathParam().setValue(XmlAxisKind.SEVENCHILD);
		Comparison comparison = (Comparison) element1InG0.getPredicates().get(0);
		TextLiteralParam concreteInputValue0 = parametersFactory.createTextLiteralParam();
		concreteInputValue0.setValue("lido:actor");
		((UntypedParameterValue) comparison.getArguments().get(1)).replace(concreteInputValue0);
		((XmlProperty) element1InG0.getProperties().get(0)).getOption().setValue(XmlPropertyKind.TAG);
		
		Graph graph1 = qc1.getGraph();
		
		Node element2InG1 = graph1.getNodes().get(2);
		((XmlElementNavigation) graph1.getRelations().get(1)).getXmlPathParam().setXmlAxis(XmlAxisKind.CHILD, "");
		Comparison comparison1 = (Comparison) element2InG1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("lido:nameActorSet");
		((UntypedParameterValue) comparison1.getArguments().get(1)).replace(concreteInputValue1);
		((XmlProperty) element2InG1.getProperties().get(0)).getOption().setValue(XmlPropertyKind.TAG);
		
		Node next1ToReturnElementInGraph1 = graph1.getNodes().get(3);
		((XmlElementNavigation) graph1.getRelations().get(1)).getXmlPathParam().setXmlAxis(XmlAxisKind.CHILD, "");
		Comparison comparison2G1 = (Comparison) next1ToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue2G1 = parametersFactory.createTextLiteralParam();
		concreteInputValue2G1.setValue("lido:appellationValue");
		((UntypedParameterValue) comparison2G1.getArguments().get(1)).replace(concreteInputValue2G1);
		((XmlProperty) next1ToReturnElementInGraph1.getProperties().get(0)).getOption().setValue(XmlPropertyKind.TAG);
		
		Graph graph2 = qc2.getGraph();
		
		Node element2 = graph2.getNodes().get(2);
		((XmlElementNavigation) graph2.getRelations().get(1)).getXmlPathParam().setXmlAxis(XmlAxisKind.CHILD, "");
		
		Comparison comparison2 = (Comparison) element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("lido:nameActorSet");
		((UntypedParameterValue) comparison2.getArguments().get(1)).replace(concreteInputValue2);
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(XmlPropertyKind.TAG);
		
		Node element3 = graph2.getNodes().get(3);
		((XmlElementNavigation) graph2.getRelations().get(2)).getXmlPathParam().setXmlAxis(XmlAxisKind.CHILD, "");
		
		Comparison comparison3 = (Comparison) element3.getPredicates().get(0);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("lido:appellationValue");
		((UntypedParameterValue) comparison3.getArguments().get(1)).replace(concreteInputValue3);
		((XmlProperty) element3.getProperties().get(0)).getOption().setValue(XmlPropertyKind.TAG);
		
		Comparison comparison4 = (Comparison) element3.getPredicates().get(1);
		TextListParam concreteInputValue4 = parametersFactory.createTextListParam();
//		concreteInputValue4.getValues().add("unbekannt");
		concreteInputValue4.getValues().add("");
//		concreteInputValue4.getValues().add("?");
//		concreteInputValue4.getValues().add("x");
//		concreteInputValue4.getValues().add("unknown");
		((UntypedParameterValue) comparison4.getArguments().get(1)).replace(concreteInputValue4);
		((XmlProperty) element3.getProperties().get(1)).getOption().setValue(XmlPropertyKind.DATA);
		
		return completePattern;
	}
	
}
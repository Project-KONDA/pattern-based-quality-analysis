package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;
import qualitypatternmodel.translationtests.Test06NotElement;

public class EvalRefint {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getRefintAbstractMidas());
		completePatterns.add(getRefintMidasWer());
//		completePatterns.add(getRefintAbstractRunningExample());
		completePatterns.add(getRefintRunningExample());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);	
	}
	
	public static CompletePattern getRefintAbstractMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
		
		Node e1g0 = completePattern.getGraph().getNodes().get(0);
		e1g0.addPrimitiveComparison();
		
		Node e1g1 = qc1.getGraph().getNodes().get(0);	
		
		Node e2g1 = qc1.getGraph().getNodes().get(1);	
		e2g1.addPrimitiveComparison();
		
		Relation relation = graphFactory.createRelation();
		relation.setGraph(qc1.getGraph());
		relation.setSource(e1g1);
		relation.setTarget(e2g1);
		
		Node e2g2 = qc2.getGraph().getNodes().get(1);
		
		Node e3g2 = graphFactory.createNode();
		e3g2.setGraph(qc2.getGraph());
		e3g2.addPrimitiveComparison();
		
		Node e4g2 = graphFactory.createNode();
		e4g2.setGraph(qc2.getGraph());
		e4g2.addPrimitiveComparison();
		
		Relation relationg2 = graphFactory.createRelation();
		relationg2.setGraph(qc2.getGraph());
		relationg2.setSource(e3g2);
		relationg2.setTarget(e4g2);
		
		Relation referenceg2 = graphFactory.createRelation();
		referenceg2.setGraph(qc2.getGraph());
		referenceg2.setSource(e2g2);
		referenceg2.setTarget(e4g2);
		
		completePattern.createXMLAdaption();
		relation.adaptAsXMLNavigation();
		relationg2.adaptAsXMLNavigation();
		XmlReference xmlReference = referenceg2.adaptAsXMLReference();
		xmlReference.setType(ReturnType.STRING);
		completePattern.finalizeXMLAdaption();	
		
		return completePattern; 
	}
	
	public static CompletePattern getRefintMidasWer() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getRefintAbstractMidas();
		
		Node returnInReturnGraph = completePattern.getGraph().getNodes().get(0);
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().setValue(AxisKind.THREECHILD);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("obj");
		((UntypedParameterValue) ((Comparison) returnInReturnGraph.getPredicates().get(0)).getArgument2()).replace(concreteInputValue);
		((XmlProperty) returnInReturnGraph.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) returnInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Node element1 = graph1.getNodes().get(1);
		((XmlNavigation) graph1.getRelations().get(0)).getPathParam().setValue(AxisKind.TWOCHILD);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("3600");
		((UntypedParameterValue) ((Comparison) element1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue2);
		((XmlProperty) element1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) element1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Graph graph2 = ((QuantifiedCondition) ((NotCondition) ((QuantifiedCondition) completePattern.getCondition()).getCondition()).getCondition()).getGraph();
		Node element1InGraph2 = graph2.getNodes().get(1);
		Node element2 = graph2.getNodes().get(2);		
		((XmlNavigation) graph2.getRelations().get(4)).getPathParam().setValue(AxisKind.THREECHILD);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("wer");
		((UntypedParameterValue) ((Comparison) element2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue3);
		((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Node element3 = graph2.getNodes().get(3);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("3600");
		((UntypedParameterValue) ((Comparison) element3.getPredicates().get(0)).getArgument2()).replace(concreteInputValue4);
		((XmlProperty) element3.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) element3.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);		
		
		((XmlProperty) element1InGraph2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		((XmlProperty) element1InGraph2.getProperties().get(0)).getAttributeName().setValue("Value");
		
		((XmlProperty) element3.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		((XmlProperty) element3.getProperties().get(1)).getAttributeName().setValue("Value");
				
		return completePattern;		
	}
	
	public static CompletePattern getRefintAbstractRunningExample() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
		
		Node e1g0 = completePattern.getGraph().getNodes().get(0);
		e1g0.addPrimitiveComparison();
		
		Node e1g1 = qc1.getGraph().getNodes().get(0);	
		
		Node e2g1 = qc1.getGraph().getNodes().get(1);	
		e2g1.addPrimitiveComparison();
		
		Relation relation = graphFactory.createRelation();
		relation.setGraph(qc1.getGraph());
		relation.setSource(e1g1);
		relation.setTarget(e2g1);
		
		Node e2g2 = qc2.getGraph().getNodes().get(1);
		
		Node e3g2 = graphFactory.createNode();
		e3g2.setGraph(qc2.getGraph());
		e3g2.addPrimitiveComparison();		
		
		Relation referenceg2 = graphFactory.createRelation();
		referenceg2.setGraph(qc2.getGraph());
		referenceg2.setSource(e2g2);
		referenceg2.setTarget(e3g2);
		
		completePattern.createXMLAdaption();
		relation.adaptAsXMLNavigation();
		XmlReference xmlReference = referenceg2.adaptAsXMLReference();
		xmlReference.setType(ReturnType.STRING);
		completePattern.finalizeXMLAdaption();	
		
		return completePattern; 
	}
	
	public static CompletePattern getRefintRunningExample() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getRefintAbstractRunningExample();
		
		XmlElement returnInReturnGraph = (XmlElement) completePattern.getGraph().getNodes().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("building");
		((UntypedParameterValue) ((Comparison) returnInReturnGraph.getPredicates().get(0)).getArgument2()).replace(concreteInputValue);
		((XmlProperty) returnInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Node element1 = graph1.getNodes().get(1);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("creator");
		((UntypedParameterValue) ((Comparison) element1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue2);
		((XmlProperty) element1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Graph graph2 = ((QuantifiedCondition) ((NotCondition) ((QuantifiedCondition) completePattern.getCondition()).getCondition()).getCondition()).getGraph();
		Node element1InGraph2 = graph2.getNodes().get(1);
		Node element2 = graph2.getNodes().get(2);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("artist");
		((UntypedParameterValue) ((Comparison) element2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue3);
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) element2.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		((XmlProperty) element2.getProperties().get(1)).getAttributeName().setValue("id");
		
		((XmlProperty) element1InGraph2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		((XmlProperty) element1InGraph2.getProperties().get(0)).getAttributeName().setValue("ref");
				
		return completePattern;		
	}
}

package playground;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;
import qualitypatternmodel.translationtests.Test06NotElement;

public class RelationSwitchTest {
	public static void main(String[] args) {
		try {
			System.out.println(getRefintRunningExample().generateQuery());
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static CompletePattern getRefintAbstractRunningExample() {
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
		
		Element e3g2 = graphFactory.createElement();
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
		
		Relation nav = xmlReference.adaptAsXMLNavigation();
		nav.adaptAsXMLReference();
		
		completePattern.finalizeXMLAdaption();	
		
		return completePattern; 
	}
	
	public static CompletePattern getRefintRunningExample() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getRefintAbstractRunningExample();
		
		XmlElement returnInReturnGraph = (XmlElement) completePattern.getGraph().getElements().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("building");
		((UnknownParameterValue) ((Comparison) returnInReturnGraph.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue);
		((XmlProperty) returnInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Element element1 = graph1.getElements().get(1);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("creator");
		((UnknownParameterValue) ((Comparison) element1.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue2);
		((XmlProperty) element1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		Graph graph2 = ((QuantifiedCondition) ((NotCondition) ((QuantifiedCondition) completePattern.getCondition()).getCondition()).getCondition()).getGraph();
		Element element1InGraph2 = graph2.getElements().get(1);
		Element element2 = graph2.getElements().get(2);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("artist");
		((UnknownParameterValue) ((Comparison) element2.getPredicates().get(0)).getArgument2()).concretize(concreteInputValue3);
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) element2.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		((XmlProperty) element2.getProperties().get(1)).getAttributeName().setValue("id");
		
		((XmlProperty) element1InGraph2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		((XmlProperty) element1InGraph2.getProperties().get(0)).getAttributeName().setValue("ref");
				
		return completePattern;		
	}
}

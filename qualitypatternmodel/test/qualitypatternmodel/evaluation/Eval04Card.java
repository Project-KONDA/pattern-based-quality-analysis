package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test12Count;

public class Eval04Card {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCardMidasOb30());
		Test00.test(completePatterns);		
	}
	
	public static CompletePattern getCardAbstract() {	
		
		CompletePattern pattern = Test12Count.getPatternCountInPattern();		
		
		return pattern;
	}
	
	public static CompletePattern getCardAbstractMidas() {	
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test12Count.getPatternCountInPattern();	
		CountCondition condition = (CountCondition) completePattern.getCondition();
		CountPattern countPattern = (CountPattern) condition.getCountPattern();
		
		Element element2InC = countPattern.getGraph().getElements().get(1);	
		
		Element element3InC = graphstructureFactory.createElement();
		element3InC.setGraph(countPattern.getGraph());
		element3InC.addPrimitiveComparison();		
		element3InC.addPrimitiveComparison();

		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(countPattern.getGraph());
		relation.setSource(element2InC);
		relation.setTarget(element3InC);
		
		Element element4InC = graphstructureFactory.createElement();
		element4InC.setGraph(countPattern.getGraph());
		element4InC.addPrimitiveComparison();
		
		Relation relation2 = graphstructureFactory.createRelation();
		relation2.setGraph(countPattern.getGraph());
		relation2.setSource(element3InC);
		relation2.setTarget(element4InC);		
		
		countPattern.getGraph().getReturnElements().clear();
		countPattern.getGraph().getReturnElements().add(element3InC);
		
		completePattern.createXMLAdaption();
		countPattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		relation.adaptAsXMLNavigation();
		relation2.adaptAsXMLNavigation();		
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}
	
	public static CompletePattern getCardMidasOb30() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern pattern = getCardAbstractMidas();
		
		XmlElement returnElementInReturnGraph = (XmlElement) pattern.getGraph().getReturnElements().get(0);	
		XmlNavigation relation = (XmlNavigation) pattern.getGraph().getRelations().get(0);
		relation.getOption().setValue(RelationKind.DESCENDANT);
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("obj");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		CountCondition countCondition = (CountCondition) pattern.getCondition();
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);
		NumberElement numberElement = (NumberElement) countCondition.getArgument2();		
		numberElement.getNumberParam().setValue(1.0);
		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
		Graph graph1 = countPattern.getGraph();
		
		XmlElement nextToReturnElementInGraph1 = (XmlElement) graph1.getElements().get(1);	
		XmlNavigation relation2 = (XmlNavigation) graph1.getRelations().get(0);
		relation2.getOption().setValue(RelationKind.DESCENDANT_OR_SELF);
		Comparison comparisonNextToReturnElementInGraph1 = (Comparison) nextToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("h1:Block");
		((UnknownParameterValue) comparisonNextToReturnElementInGraph1.getArguments().get(1)).concretize(concreteInputValue2);
		((XmlProperty) nextToReturnElementInGraph1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);

		XmlElement setElement1InGraph1 = (XmlElement) graph1.getElements().get(2);			
		Comparison comparison1Set1 = (Comparison) setElement1InGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("ob30");
		((UnknownParameterValue) comparison1Set1.getArguments().get(1)).concretize(concreteInputValue4);
		((XmlProperty) setElement1InGraph1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) setElement1InGraph1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
				
		Comparison comparison2Set1 = (Comparison) setElement1InGraph1.getPredicates().get(1);
		TextLiteralParam concreteInputValue5 = parametersFactory.createTextLiteralParam();
		concreteInputValue5.setValue("Herstellung");
		((UnknownParameterValue) comparison2Set1.getArguments().get(1)).concretize(concreteInputValue5);
		((XmlProperty) setElement1InGraph1.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) setElement1InGraph1.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Element setElement2InGraph1 = graph1.getElements().get(3);	
		Comparison comparison1Set2 = (Comparison) setElement2InGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue6 = parametersFactory.createTextLiteralParam();
		concreteInputValue6.setValue("ob30rl");
		((UnknownParameterValue) comparison1Set2.getArguments().get(1)).concretize(concreteInputValue6);
		((XmlProperty) setElement2InGraph1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) setElement2InGraph1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		return pattern;		
	}
}

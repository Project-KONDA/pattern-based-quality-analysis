package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test12Count;

public class EvalCard {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getCardAbstractThreeElements());
//		completePatterns.add(getCardAbstractMidas());
		completePatterns.add(getCardMidasOb30());
		completePatterns.add(getCardLidoActorName());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);		
	}
	
	public static CompletePattern getCardAbstractThreeElements() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;
		
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;		

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);	
		returnElementInReturnGraph.addPrimitiveComparison();
		
		
		QuantifiedCondition quantifiedCondition = patternStructureFactory.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);	
		
		Graph graph1 = quantifiedCondition.getGraph();
		
		Element returnG1 = graph1.getElements().get(0);
		
		Element e1G1 = graphFactory.createElement();
		e1G1.setGraph(graph1);
		e1G1.addPrimitiveComparison();
		Relation r1G1 = graphFactory.createRelation();
		r1G1.setGraph(graph1);
		r1G1.setSource(returnG1);
		r1G1.setTarget(e1G1);
		
		CountCondition countCondition = patternStructureFactory.createCountCondition();
		quantifiedCondition.setCondition(countCondition);
		
		CountPattern countPattern = patternStructureFactory.createCountPattern();
		countCondition.setCountPattern(countPattern);
		
		NumberParam numberParam = parametersFactory.createNumberParam();
		numberParam.setValue(1.0);
		NumberElement numberElement = patternStructureFactory.createNumberElement();
		numberElement.setNumberParam(numberParam);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);		
		countCondition.setArgument2(numberElement);
		
		Graph graph2 = countPattern.getGraph();
		
		Element e1G2 = countPattern.getGraph().getElements().get(1);
			
		Element e2G2 = graphFactory.createElement();
		e2G2.setGraph(graph2);
		e2G2.setName("e2G2");
		Relation r2G2 = graphFactory.createRelation();
		r2G2.setGraph(graph2);
		r2G2.setSource(e1G2);
		r2G2.setTarget(e2G2);		
		countPattern.getGraph().getReturnElements().clear();
		countPattern.getGraph().getReturnElements().add(e2G2);
		e2G2.addPrimitiveComparison();

		Condition truecondition = patternStructureFactory.createTrueElement();
		countPattern.setCondition(truecondition);	
				
		completePattern.createXMLAdaption();
		r1G1.adaptAsXMLNavigation();
		r2G2.adaptAsXMLNavigation();		
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}
	
	private static CompletePattern getCardThreeElementsLidoConcrete(RelationKind returnRelation, String returnElementName, 
			RelationKind returnToE1Rel, String e1Name, RelationKind e1ToE2Rel, String e2Name) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCardAbstractThreeElements();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(returnRelation);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementName);
		((UntypedParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).replace(concreteInputValue);
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();	
		Graph graph1 = quantifiedCondition.getGraph();
		
		Element e1G1 = graph1.getElements().get(1);	
		((XmlNavigation) graph1.getRelations().get(0)).getOption().setValue(returnToE1Rel);
		((XmlProperty) e1G1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue1G1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1G1.setValue(e1Name);
		((UntypedParameterValue) ((Comparison) e1G1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue1G1);
				
		CountCondition countCondition = (CountCondition) quantifiedCondition.getCondition();		
		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
		Graph graph2 = countPattern.getGraph();
				
		Element e4G2 = graph2.getElements().get(2);	
		((XmlNavigation) graph2.getRelations().get(1)).getOption().setValue(e1ToE2Rel);
		((XmlProperty) e4G2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		TextLiteralParam concreteInputValue4G2 = parametersFactory.createTextLiteralParam();
		concreteInputValue4G2.setValue(e2Name);
		((UntypedParameterValue) ((Comparison) e4G2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue4G2);
		
		return completePattern;
	}
	
	public static CompletePattern getCardAbstractMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test12Count.getPatternCountInPattern();	
		CountCondition condition = (CountCondition) completePattern.getCondition();
		CountPattern countPattern = (CountPattern) condition.getCountPattern();
		
		
		Element element2InC = countPattern.getGraph().getElements().get(1);	
		element2InC.setName("Element2");
		
		Element element3InC = graphstructureFactory.createElement();
		element3InC.setGraph(countPattern.getGraph());
		element3InC.setName("Element3");
		element3InC.addPrimitiveComparison();		
		element3InC.addPrimitiveComparison();

		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(countPattern.getGraph());
		relation.setSource(element2InC);
		relation.setTarget(element3InC);

		
		QuantifiedCondition countQCon = patternStructureFactory.createQuantifiedCondition();
		countPattern.setCondition(countQCon);
		Graph graphCQCon = countQCon.getGraph();
		
		TrueElement trueElement = patternStructureFactory.createTrueElement();
		countQCon.setCondition(trueElement);
		
		Element element4InC = graphstructureFactory.createElement();
		element4InC.setGraph(graphCQCon);
		element4InC.setName("Element4");
		element4InC.addPrimitiveComparison();
		
		Relation relation2 = graphstructureFactory.createRelation();
		relation2.setGraph(graphCQCon);
		Element element3InCQC =element3InC.getOutgoingMappings().get(0).getTarget();
		relation2.setSource(element3InCQC);
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
	
	public static CompletePattern getCardMidasOb30() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern pattern = getCardAbstractMidas();
		
		XmlElement returnElementInReturnGraph = (XmlElement) pattern.getGraph().getReturnElements().get(0);	
		((XmlNavigation) pattern.getGraph().getRelations().get(0)).getOption().setValue(RelationKind.THREECHILD);
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("obj");
		((UntypedParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).replace(concreteInputValue);
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
		((XmlNavigation) graph1.getRelations().get(0)).getOption().setValue(RelationKind.DESCENDANT_OR_SELF);
		Comparison comparisonNextToReturnElementInGraph1 = (Comparison) nextToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("h1:Block");
		((UntypedParameterValue) comparisonNextToReturnElementInGraph1.getArguments().get(1)).replace(concreteInputValue2);
		((XmlProperty) nextToReturnElementInGraph1.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);

		XmlElement setElement1InGraph1 = (XmlElement) graph1.getElements().get(2);			
		Comparison comparison1Set1 = (Comparison) setElement1InGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("ob30");
		((UntypedParameterValue) comparison1Set1.getArguments().get(1)).replace(concreteInputValue4);
		((XmlProperty) setElement1InGraph1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) setElement1InGraph1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
				
		Comparison comparison2Set1 = (Comparison) setElement1InGraph1.getPredicates().get(1);
		TextLiteralParam concreteInputValue5 = parametersFactory.createTextLiteralParam();
		concreteInputValue5.setValue("Herstellung");
		((UntypedParameterValue) comparison2Set1.getArguments().get(1)).replace(concreteInputValue5);
		((XmlProperty) setElement1InGraph1.getProperties().get(1)).getAttributeName().setValue("Value");
		((XmlProperty) setElement1InGraph1.getProperties().get(1)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		
		Graph graph2 = ((QuantifiedCondition)countPattern.getCondition()).getGraph();
		
		Element setElement2InGraph1 = graph2.getElements().get(3);	
		Comparison comparison1Set2 = (Comparison) setElement2InGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue6 = parametersFactory.createTextLiteralParam();
		concreteInputValue6.setValue("ob30rl");
		((UntypedParameterValue) comparison1Set2.getArguments().get(1)).replace(concreteInputValue6);
		((XmlProperty) setElement2InGraph1.getProperties().get(0)).getAttributeName().setValue("Type");
		((XmlProperty) setElement2InGraph1.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		return pattern;		
	}
	
	public static CompletePattern getCardLidoActorName() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		return getCardThreeElementsLidoConcrete(RelationKind.TWOCHILD, "lido:lido", RelationKind.EIGHTCHILD, "lido:nameActorSet", RelationKind.CHILD, "lido:appellationValue");
	}
}

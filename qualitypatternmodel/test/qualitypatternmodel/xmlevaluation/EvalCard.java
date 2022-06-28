package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.graphstructure.Node;
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
import qualitypatternmodel.patternstructure.impl.CompletePatternImpl;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.xmltranslationtests.Test12Count;

public class EvalCard {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCardAbstractThreeElements());
		completePatterns.add(getCardAbstractMidas());
//		completePatterns.add(getCardMidasOb30());
//		completePatterns.add(getCardLidoActorName());
		
//		Test00.getQueries(completePatterns);
		Test00.test(completePatterns);		
	}
	
	public static CompletePattern getCardGenericThreeElements() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		// base pattern
		CompletePattern completePattern = Test00.getBasePattern();
		
		// add primitive condition to return
		Node returnElementInReturnGraph = completePattern.getGraph().getReturnNodes().get(0);
		returnElementInReturnGraph.addOutgoing().getTarget().addPrimitiveComparison();
				
		// add quantified condition
		QuantifiedCondition quantifiedCondition = patternStructureFactory.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);	
		Graph graph1 = quantifiedCondition.getGraph();
		
		// add complex node with primitive condition
		Node returnG1 = graph1.getReturnNodes().get(0).makeComplex();
		Node e1G1 = returnG1.addOutgoing().getTarget().makeComplex();
		Node e2G1 = e1G1.addOutgoing().getTarget().makePrimitive();
		e2G1.addPrimitiveComparison();
		
		// initialize count pattern
		CountCondition countCondition = patternStructureFactory.createCountCondition();
		quantifiedCondition.setCondition(countCondition);
		CountPattern countPattern = patternStructureFactory.createCountPattern();
		countCondition.setCountPattern(countPattern);

		// intitialize count contition
		NumberElement numberElement = patternStructureFactory.createNumberElement();
		NumberParam numberParam = parametersFactory.createNumberParam();
		numberParam.setValue(1.0);
		numberElement.setNumberParam(numberParam);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);		
		countCondition.setArgument2(numberElement);
		
		
		Graph graph2 = countPattern.getGraph();
		Node e1G2 = countPattern.getGraph().getReturnNodes().get(0).makeComplex();
		Node e2G2 = e1G2.addOutgoing().getTarget();
		countPattern.getGraph().getReturnNodes().get(0).setReturnNode(false);
		e2G2.setReturnNode(true);
		Node e3G2 = e2G2.addOutgoing().getTarget();
		e3G2.addPrimitiveComparison();
				
		return completePattern;
	}

	public static CompletePattern getCardAbstractThreeElements() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCardGenericThreeElements();
		completePattern.createXmlAdaption();		
		return completePattern;
	}

	
	
	private static CompletePattern getCardThreeElementsLidoConcrete(XmlAxisKind returnRelation, String returnElementName, 
			XmlAxisKind returnToE1Rel, String e1Name, XmlAxisKind e1ToE2Rel, String e2Name) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCardAbstractThreeElements();
		Node returnElementInReturnGraph = completePattern.getGraph().getReturnNodes().get(0);	
		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(returnRelation, "");
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementName);
		((UntypedParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).replace(concreteInputValue);
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();	
		Graph graph1 = quantifiedCondition.getGraph();
		
		Node e1G1 = graph1.getNodes().get(1);	
		((XmlElementNavigation) graph1.getRelations().get(0)).getXmlPathParam().setXmlAxis(returnToE1Rel, "");
		TextLiteralParam concreteInputValue1G1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1G1.setValue(e1Name);
		((UntypedParameterValue) ((Comparison) e1G1.getPredicates().get(0)).getArgument2()).replace(concreteInputValue1G1);
				
		CountCondition countCondition = (CountCondition) quantifiedCondition.getCondition();		
		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
		Graph graph2 = countPattern.getGraph();
				
		Node e4G2 = graph2.getNodes().get(2);	
		((XmlElementNavigation) graph2.getRelations().get(1)).getXmlPathParam().setXmlAxis(e1ToE2Rel, "");
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
		
		Node element2InC = countPattern.getGraph().getNodes().get(2).makeComplex();	
		element2InC.setName("Element2");
		element2InC.addOutgoing().getTarget().addPrimitiveComparison();
		
		Node element3InC = element2InC.addOutgoing().getTarget().makeComplex();
		element3InC.setName("Element3");
		element3InC.addOutgoing().getTarget().addPrimitiveComparison();
		element3InC.addOutgoing().getTarget().addPrimitiveComparison();
		
		QuantifiedCondition countQCon = patternStructureFactory.createQuantifiedCondition();
		countPattern.setCondition(countQCon);
		Graph graphCQCon = countQCon.getGraph();
		
		TrueElement trueElement = patternStructureFactory.createTrueElement();
		countQCon.setCondition(trueElement);

		Node element3InCQC = element3InC.getOutgoingMappings().get(0).getTarget();
		
		Node element4InC = element3InCQC.addOutgoing().getTarget();
		element4InC.setName("Element4");
		Node element5InC = element4InC.addOutgoing().getTarget();
		element5InC.addPrimitiveComparison();		
		
		countPattern.getGraph().getReturnNodes().get(0).setReturnNode(false);;
		element3InC.setReturnNode(true);
		
		completePattern.createXmlAdaption();
		
		return completePattern;
	}
	
	public static CompletePattern getCardMidasOb30() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern pattern = getCardAbstractMidas();
		
		XmlElement returnElementInReturnGraph = (XmlElement) pattern.getGraph().getReturnNodes().get(0);	
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("obj");
		((UntypedParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).replace(concreteInputValue);
		
		CountCondition countCondition = (CountCondition) pattern.getCondition();
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);
		NumberElement numberElement = (NumberElement) countCondition.getArgument2();		
		numberElement.getNumberParam().setValue(1.0);
		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
		Graph graph1 = countPattern.getGraph();
		
		XmlElement nextToReturnElementInGraph1 = (XmlElement) graph1.getNodes().get(1);	
		((XmlElementNavigation) graph1.getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT_OR_SELF, "");
		Comparison comparisonNextToReturnElementInGraph1 = (Comparison) nextToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("h1:Block");
		((UntypedParameterValue) comparisonNextToReturnElementInGraph1.getArguments().get(1)).replace(concreteInputValue2);
		
		XmlElement setElement1InGraph1 = (XmlElement) graph1.getNodes().get(2);			
		Comparison comparison1Set1 = (Comparison) setElement1InGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("ob30");
		((UntypedParameterValue) comparison1Set1.getArguments().get(1)).replace(concreteInputValue4);
				
		Comparison comparison2Set1 = (Comparison) setElement1InGraph1.getPredicates().get(1);
		TextLiteralParam concreteInputValue5 = parametersFactory.createTextLiteralParam();
		concreteInputValue5.setValue("Herstellung");
		((UntypedParameterValue) comparison2Set1.getArguments().get(1)).replace(concreteInputValue5);
				
		Graph graph2 = ((QuantifiedCondition)countPattern.getCondition()).getGraph();
		
		Node setElement2InGraph1 = graph2.getNodes().get(3);	
		Comparison comparison1Set2 = (Comparison) setElement2InGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue6 = parametersFactory.createTextLiteralParam();
		concreteInputValue6.setValue("ob30rl");
		((UntypedParameterValue) comparison1Set2.getArguments().get(1)).replace(concreteInputValue6);
		
		return pattern;		
	}
	
	public static CompletePattern getCardLidoActorName() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		return null;
		//getCardThreeElementsLidoConcrete(XmlAxisKind.TWOCHILD, "lido:lido", XmlAxisKind.EIGHTCHILD, "lido:nameActorSet", XmlAxisKind.CHILD, "lido:appellationValue");
	}
}

package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.xmltranslationtests.Test12Count;

public class EvalCard {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getCardAbstractThreeElements());
//		completePatterns.add(getCardAbstractMidas());
//		completePatterns.add(getCardMidasOb30());
		completePatterns.add(getCardLidoActorName());
		
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

	
	
	private static CompletePattern getCardThreeElementsLidoConcrete(XmlAxisKind[] returnRelation, String returnElementName, 
			XmlAxisKind[] returnToE1Rel, String e1Name, XmlAxisKind[] e1ToE2Rel, String e2Name) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCardAbstractThreeElements();
		EList<Parameter> params = completePattern.getParameterList().getParameters();

		((UntypedParameterValueImpl)params.get(0)).replace(new TextLiteralParamImpl(returnElementName));
		((UntypedParameterValueImpl)params.get(3)).replace(new TextLiteralParamImpl(e1Name));
		((UntypedParameterValueImpl)params.get(8)).replace(new TextLiteralParamImpl(e2Name));
		((XmlPathParamImpl)params.get(12)).setXmlAxis(returnRelation);
		((XmlPathParamImpl)params.get(13)).setXmlAxis(returnToE1Rel);
		((XmlPathParamImpl)params.get(15)).setXmlAxis(e1ToE2Rel);
		
		
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
		
		List<Parameter> params = pattern.getParameterList().getParameters();
		
		UntypedParameterValueImpl p0 = ((UntypedParameterValueImpl) params.get(0));
		ComparisonOptionParamImpl p1 = ((ComparisonOptionParamImpl) params.get(1));
		TypeOptionParamImpl p2 = ((TypeOptionParamImpl) params.get(2));
		ComparisonOptionParamImpl p3 = ((ComparisonOptionParamImpl) params.get(3));
		NumberParamImpl p4 = ((NumberParamImpl) params.get(4));
		UntypedParameterValueImpl p5 = ((UntypedParameterValueImpl) params.get(5));
		ComparisonOptionParamImpl p6 = ((ComparisonOptionParamImpl) params.get(6));
		TypeOptionParamImpl p7 = ((TypeOptionParamImpl) params.get(7));
		UntypedParameterValueImpl p8 = ((UntypedParameterValueImpl) params.get(8));
		ComparisonOptionParamImpl p9 = ((ComparisonOptionParamImpl) params.get(9));
		TypeOptionParamImpl p10 = ((TypeOptionParamImpl) params.get(10));
		UntypedParameterValueImpl p11 = ((UntypedParameterValueImpl) params.get(11));
		ComparisonOptionParamImpl p12 = ((ComparisonOptionParamImpl) params.get(12));
		TypeOptionParamImpl p13 = ((TypeOptionParamImpl) params.get(13));
		UntypedParameterValueImpl p14 = ((UntypedParameterValueImpl) params.get(14));
		ComparisonOptionParamImpl p15 = ((ComparisonOptionParamImpl) params.get(15));
		TypeOptionParamImpl p16 = ((TypeOptionParamImpl) params.get(16));
		XmlPathParamImpl p17 = ((XmlPathParamImpl) params.get(17));
		XmlPathParamImpl p18 = ((XmlPathParamImpl) params.get(18));
		XmlPathParamImpl p19 = ((XmlPathParamImpl) params.get(19));
		XmlPathParamImpl p20 = ((XmlPathParamImpl) params.get(20));
		XmlPathParamImpl p21 = ((XmlPathParamImpl) params.get(21));
		XmlPathParamImpl p22 = ((XmlPathParamImpl) params.get(22));
		XmlPathParamImpl p23 = ((XmlPathParamImpl) params.get(23));
		XmlPathParamImpl p24 = ((XmlPathParamImpl) params.get(24));
		XmlPathParamImpl p25 = ((XmlPathParamImpl) params.get(25));

		p0.replace(new TextLiteralParamImpl("obj"));
		p5.replace(new TextLiteralParamImpl("h1:Block"));
		p8.replace(new TextLiteralParamImpl("ob30"));
		p11.replace(new TextLiteralParamImpl("Herstellung"));
		p14.replace(new TextLiteralParamImpl("ob30rl"));
		
		p18.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p19.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.DESCENDANT_OR_SELF});
		p21.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p24.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		
		XmlPathParamImpl[] paths = new XmlPathParamImpl[] {p17, p20, p22, p25};
		for (XmlPathParamImpl p : paths) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Type");			
		}

		XmlPathParamImpl[] paths2 = new XmlPathParamImpl[] {p23};
		for (XmlPathParamImpl p : paths2) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Value");			
		}
		
//		XmlElement returnElementInReturnGraph = (XmlElement) pattern.getGraph().getReturnNodes().get(0);	
//		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
//		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
//		concreteInputValue.setValue("obj");
//		((UntypedParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).replace(concreteInputValue);
//		
//		CountCondition countCondition = (CountCondition) pattern.getCondition();
//		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
//		countCondition.getOption().setValue(ComparisonOperator.GREATER);
//		NumberElement numberElement = (NumberElement) countCondition.getArgument2();		
//		numberElement.getNumberParam().setValue(1.0);
//		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
//		Graph graph1 = countPattern.getGraph();
//		
//		XmlElement nextToReturnElementInGraph1 = (XmlElement) graph1.getNodes().get(1);	
//		((XmlElementNavigation) graph1.getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT_OR_SELF, "");
//		Comparison comparisonNextToReturnElementInGraph1 = (Comparison) nextToReturnElementInGraph1.getPredicates().get(0);
//		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
//		concreteInputValue2.setValue("h1:Block");
//		((UntypedParameterValue) comparisonNextToReturnElementInGraph1.getArguments().get(1)).replace(concreteInputValue2);
//		
//		XmlElement setElement1InGraph1 = (XmlElement) graph1.getNodes().get(2);			
//		Comparison comparison1Set1 = (Comparison) setElement1InGraph1.getPredicates().get(0);
//		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
//		concreteInputValue4.setValue("ob30");
//		((UntypedParameterValue) comparison1Set1.getArguments().get(1)).replace(concreteInputValue4);
//				
//		Comparison comparison2Set1 = (Comparison) setElement1InGraph1.getPredicates().get(1);
//		TextLiteralParam concreteInputValue5 = parametersFactory.createTextLiteralParam();
//		concreteInputValue5.setValue("Herstellung");
//		((UntypedParameterValue) comparison2Set1.getArguments().get(1)).replace(concreteInputValue5);
//				
//		Graph graph2 = ((QuantifiedCondition)countPattern.getCondition()).getGraph();
//		
//		Node setElement2InGraph1 = graph2.getNodes().get(3);	
//		Comparison comparison1Set2 = (Comparison) setElement2InGraph1.getPredicates().get(0);
//		TextLiteralParam concreteInputValue6 = parametersFactory.createTextLiteralParam();
//		concreteInputValue6.setValue("ob30rl");
//		((UntypedParameterValue) comparison1Set2.getArguments().get(1)).replace(concreteInputValue6);
		
		return pattern;		
	}
	
	public static CompletePattern getCardLidoActorName() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		return getCardThreeElementsLidoConcrete(
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				"lido:lido", 
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				"lido:nameActorSet", 
				new XmlAxisKind[] {XmlAxisKind.CHILD}, 
				"lido:appellationValue");
	}
}

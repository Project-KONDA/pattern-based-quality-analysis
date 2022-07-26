package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalUnique {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getUniqueAbstract());
		completePatterns.add(getUniqueMidas());
		completePatterns.add(getUniqueLidoLidoRecId());
		completePatterns.add(getUniqueLidoObjectPublishedId());
		completePatterns.add(getUniqueComplexAbstract());
		completePatterns.add(getUniqueComplexLidoNameActorSet());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);
	}

	private static CompletePattern getUniqueAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();	
		
		QuantifiedCondition quantifiedCondition = factory.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		CountCondition countCondition = factory.createCountCondition();
		quantifiedCondition.setCondition(countCondition);
		CountPattern countPattern = factory.createCountPattern();
		countCondition.setCountPattern(countPattern);

		NumberElement numberElement = factory.createNumberElement();
		countCondition.setArgument2(numberElement);
		
		NumberParam numberParam = numberElement.getNumberParam();
		
		numberParam.setValue(1.0);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);	
		
		QuantifiedCondition quantifiedCondition2 = factory.createQuantifiedCondition();
		countPattern.setCondition(quantifiedCondition2);
		
		Graph g0 = completePattern.getGraph();
		Graph g1 = quantifiedCondition.getGraph();
		Graph g2 = countPattern.getGraph();
		Graph g3 = quantifiedCondition2.getGraph();
		
		Node g0return = g0.getReturnNodes().get(0).makeComplex();
		g0return.addOutgoing().getTarget().addPrimitiveComparison();
		
		Node g1return = g1.getReturnNodes().get(0);
		Node g1e1 = g1return.addOutgoing().getTarget().makeComplex();
		g1e1.addOutgoing().getTarget().addPrimitiveComparison();
		
		g2.getReturnNodes().get(0).setReturnNode(false);
		
		Node g2return = graphFactory.createComplexNode();
		g2return.setGraph(g2);
		g2return.setReturnNode(true);
		g2return.addOutgoing().getTarget().addPrimitiveComparison();
		Node g2e1 = g1e1.getOutgoingMappings().get(0).getTarget();
		
		Node g3return = g3.getReturnNodes().get(0);
		Node g3e2 = g3return.addOutgoing().getTarget().makeComplex();
		g3e2.addOutgoing().getTarget().addPrimitiveComparison();
		Node g3e1 = g2e1.getOutgoingMappings().get(0).getTarget();
		
		PrimitiveNode g3e1p = g3e1.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode g3e2p = g3e2.addOutgoing().getTarget().makePrimitive();
		Comparison c = g3e1p.addComparison(g3e2p);
		c.getTypeOption().setValue(ReturnType.STRING);

		completePattern.createXmlAdaption();
		
		return completePattern;
	}
	
	private static CompletePattern concretizeUniqueAbstract(
			String elementname, XmlAxisKind[] elementaxis, 
			String elementfield, XmlAxisKind[] elementfieldaxis,
			XmlPropertyKind fieldtype, String fieldtypename,
			XmlPropertyKind fieldvalue, String fieldvaluename
			) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = getUniqueAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		NumberParam p1 = ((NumberParam) params.get(1));
		UntypedParameterValue p2 = ((UntypedParameterValue) params.get(2));
//		ComparisonOptionParam p3 = ((ComparisonOptionParam) params.get(3));
//		TypeOptionParam p4 = ((TypeOptionParam) params.get(4));
		UntypedParameterValue p5 = ((UntypedParameterValue) params.get(5));
//		ComparisonOptionParam p6 = ((ComparisonOptionParam) params.get(6));
//		TypeOptionParam p7 = ((TypeOptionParam) params.get(7));
		UntypedParameterValue p8 = ((UntypedParameterValue) params.get(8));
//		ComparisonOptionParam p9 = ((ComparisonOptionParam) params.get(9));
//		TypeOptionParam p10 = ((TypeOptionParam) params.get(10));
		UntypedParameterValue p11 = ((UntypedParameterValue) params.get(11));
//		ComparisonOptionParam p12 = ((ComparisonOptionParam) params.get(12));
//		TypeOptionParam p13 = ((TypeOptionParam) params.get(13));
//		ComparisonOptionParam p14 = ((ComparisonOptionParam) params.get(14));
//		TypeOptionParam p15 = ((TypeOptionParam) params.get(15));
		XmlPathParam p16 = ((XmlPathParam) params.get(16));
		XmlPathParam p17 = ((XmlPathParam) params.get(17));
		XmlPathParam p18 = ((XmlPathParam) params.get(18));
		XmlPathParam p19 = ((XmlPathParam) params.get(19));
		XmlPathParam p20 = ((XmlPathParam) params.get(20));
		XmlPathParam p21 = ((XmlPathParam) params.get(21));
		XmlPathParam p22 = ((XmlPathParam) params.get(22));
		XmlPathParam p23 = ((XmlPathParam) params.get(23));
		XmlPathParam p24 = ((XmlPathParam) params.get(24));
		XmlPathParam p25 = ((XmlPathParam) params.get(25));
		
		p2.setValue(elementname);
		p5.setValue(elementfield);
		p8.setValue(elementname);
		p11.setValue(elementfield);
		
		p16.getXmlPropertyOptionParam().setValue(fieldtype);
		p19.getXmlPropertyOptionParam().setValue(fieldtype);
		p20.getXmlPropertyOptionParam().setValue(fieldtype);
		p23.getXmlPropertyOptionParam().setValue(fieldtype);
		if (fieldtype == XmlPropertyKind.ATTRIBUTE) {
			p16.getXmlPropertyOptionParam().getAttributeName().setValue(fieldtypename);
			p19.getXmlPropertyOptionParam().getAttributeName().setValue(fieldtypename);
			p20.getXmlPropertyOptionParam().getAttributeName().setValue(fieldtypename);
			p23.getXmlPropertyOptionParam().getAttributeName().setValue(fieldtypename);
		}
		p24.getXmlPropertyOptionParam().setValue(fieldvalue);
		p25.getXmlPropertyOptionParam().setValue(fieldvalue);
		if (fieldvalue == XmlPropertyKind.ATTRIBUTE) {
		p24.getXmlPropertyOptionParam().getAttributeName().setValue(fieldvaluename);
		p25.getXmlPropertyOptionParam().getAttributeName().setValue(fieldvaluename);
		}
		
		p17.setXmlAxis(elementaxis);
		p18.setXmlAxis(elementfieldaxis);
		p21.setXmlAxis(elementaxis);
		p22.setXmlAxis(elementfieldaxis);
		
		return completePattern;
	}
	
	private static CompletePattern getUniqueComplexAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();	
		
		QuantifiedCondition quantifiedCondition = factory.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		CountCondition countCondition = factory.createCountCondition();
		quantifiedCondition.setCondition(countCondition);
		CountPattern countPattern = factory.createCountPattern();
		countCondition.setCountPattern(countPattern);

		NumberElement numberElement = factory.createNumberElement();
		countCondition.setArgument2(numberElement);
		
		NumberParam numberParam = numberElement.getNumberParam();
		
		numberParam.setValue(1.0);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);	
		
		QuantifiedCondition quantifiedCondition2 = factory.createQuantifiedCondition();
		countPattern.setCondition(quantifiedCondition2);
		
		Graph g0 = completePattern.getGraph();
		Graph g1 = quantifiedCondition.getGraph();
		Graph g2 = countPattern.getGraph();
//		Graph g3 = quantifiedCondition2.getGraph();
		
		Node g0e0 = g0.getReturnNodes().get(0).makeComplex();
		g0e0.addOutgoing().getTarget().addPrimitiveComparison();
		
		Node g1e0 = g1.getReturnNodes().get(0);
		Node g1e2 = g1e0.addOutgoing().getTarget().makeComplex();
		Node g1e4 = g1e2.addOutgoing().getTarget().makeComplex();
		Node g1e6 = g1e4.addOutgoing().getTarget().makeComplex();
		g1e2.addOutgoing().getTarget().addPrimitiveComparison();
		g1e4.addOutgoing().getTarget().addPrimitiveComparison();
		g1e6.addOutgoing().getTarget().addPrimitiveComparison();
		
		g2.getReturnNodes().get(0).setReturnNode(false);
		Node g2e1 = graphFactory.createComplexNode();
		g2e1.setGraph(g2);
		g2e1.setReturnNode(true);
		g2e1.addOutgoing().getTarget().addPrimitiveComparison();
		Node g2e6 = g1e6.getOutgoingMappings().get(0).getTarget();
		
		Node g3e1 = g2e1.getOutgoingMappings().get(0).getTarget();
		Node g3e3 = g3e1.addOutgoing().getTarget().makeComplex();
		Node g3e5 = g3e3.addOutgoing().getTarget().makeComplex();
		Node g3e7 = g3e5.addOutgoing().getTarget().makeComplex();
		g3e3.addOutgoing().getTarget().addPrimitiveComparison();
		g3e5.addOutgoing().getTarget().addPrimitiveComparison();
		g3e7.addOutgoing().getTarget().addPrimitiveComparison();
		
		Node g3e6 = g2e6.getOutgoingMappings().get(0).getTarget();
		
		PrimitiveNode g3e6p = g3e6.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode g3e7p = g3e7.addOutgoing().getTarget().makePrimitive();
		
		Comparison c = g3e6p.addComparison(g3e7p);
		c.getTypeOption().setValue(ReturnType.STRING);

		completePattern.createXmlAdaption();
		
		return completePattern;
	}
	
	static CompletePattern getUniqueMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return concretizeUniqueAbstract("wer", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				"3600", new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", XmlPropertyKind.ATTRIBUTE, "Value");
	}
	
	private static CompletePattern getUniqueComplexLidoConcrete(XmlAxisKind[] e0rel, String e0Name, XmlAxisKind[] e0e1rel, String e1Name, XmlAxisKind[] e1e2rel, String e2Name, XmlAxisKind[] e2e3rel, String e3Name, XmlPropertyKind fieldtype, String fieldtypename,
			XmlPropertyKind fieldvalue, String fieldvaluename) 
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern completePattern = getUniqueComplexAbstract();
		
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		NumberParam p1 = ((NumberParam) params.get(1));
		UntypedParameterValue p2 = ((UntypedParameterValue) params.get(2));
//		ComparisonOptionParam p3 = ((ComparisonOptionParam) params.get(3));
//		TypeOptionParam p4 = ((TypeOptionParam) params.get(4));
		UntypedParameterValue p5 = ((UntypedParameterValue) params.get(5));
//		ComparisonOptionParam p6 = ((ComparisonOptionParam) params.get(6));
//		TypeOptionParam p7 = ((TypeOptionParam) params.get(7));
		UntypedParameterValue p8 = ((UntypedParameterValue) params.get(8));
//		ComparisonOptionParam p9 = ((ComparisonOptionParam) params.get(9));
//		TypeOptionParam p10 = ((TypeOptionParam) params.get(10));
		UntypedParameterValue p11 = ((UntypedParameterValue) params.get(11));
//		ComparisonOptionParam p12 = ((ComparisonOptionParam) params.get(12));
//		TypeOptionParam p13 = ((TypeOptionParam) params.get(13));
		UntypedParameterValue p14 = ((UntypedParameterValue) params.get(14));
//		ComparisonOptionParam p15 = ((ComparisonOptionParam) params.get(15));
//		TypeOptionParam p16 = ((TypeOptionParam) params.get(16));
		UntypedParameterValue p17 = ((UntypedParameterValue) params.get(17));
//		ComparisonOptionParam p18 = ((ComparisonOptionParam) params.get(18));
//		TypeOptionParam p19 = ((TypeOptionParam) params.get(19));
		UntypedParameterValue p20 = ((UntypedParameterValue) params.get(20));
//		ComparisonOptionParam p21 = ((ComparisonOptionParam) params.get(21));
//		TypeOptionParam p22 = ((TypeOptionParam) params.get(22));
		UntypedParameterValue p23 = ((UntypedParameterValue) params.get(23));
//		ComparisonOptionParam p24 = ((ComparisonOptionParam) params.get(24));
//		TypeOptionParam p25 = ((TypeOptionParam) params.get(25));
//		ComparisonOptionParam p26 = ((ComparisonOptionParam) params.get(26));
//		TypeOptionParam p27 = ((TypeOptionParam) params.get(27));
		XmlPathParam p28 = ((XmlPathParam) params.get(28));
		XmlPathParam p29 = ((XmlPathParam) params.get(29));
		XmlPathParam p30 = ((XmlPathParam) params.get(30));
		XmlPathParam p31 = ((XmlPathParam) params.get(31));
		XmlPathParam p32 = ((XmlPathParam) params.get(32));
		XmlPathParam p33 = ((XmlPathParam) params.get(33));
		XmlPathParam p34 = ((XmlPathParam) params.get(34));
		XmlPathParam p35 = ((XmlPathParam) params.get(35));
		XmlPathParam p36 = ((XmlPathParam) params.get(36));
		XmlPathParam p37 = ((XmlPathParam) params.get(37));
		XmlPathParam p38 = ((XmlPathParam) params.get(38));
		XmlPathParam p39 = ((XmlPathParam) params.get(39));
		XmlPathParam p40 = ((XmlPathParam) params.get(40));
		XmlPathParam p41 = ((XmlPathParam) params.get(41));
		XmlPathParam p42 = ((XmlPathParam) params.get(42));
		XmlPathParam p43 = ((XmlPathParam) params.get(43));
		XmlPathParam p44 = ((XmlPathParam) params.get(44));
		XmlPathParam p45 = ((XmlPathParam) params.get(45));
		
		p2.setValue(e0Name);
		p5.setValue(e1Name);
		p8.setValue(e2Name);
		p11.setValue(e3Name);
		p14.setValue(e0Name);
		p17.setValue(e1Name);
		p20.setValue(e2Name);
		p23.setValue(e3Name);
		
		p28.getXmlPropertyOptionParam().setValue(fieldtype);
		p33.getXmlPropertyOptionParam().setValue(fieldtype);
		p34.getXmlPropertyOptionParam().setValue(fieldtype);
		p35.getXmlPropertyOptionParam().setValue(fieldtype);
		p36.getXmlPropertyOptionParam().setValue(fieldtype);
		p41.getXmlPropertyOptionParam().setValue(fieldtype);
		p42.getXmlPropertyOptionParam().setValue(fieldtype);
		p43.getXmlPropertyOptionParam().setValue(fieldtype);
		if (fieldtype == XmlPropertyKind.ATTRIBUTE) {
			p28.getXmlPropertyOptionParam().getAttributeName().setValue(fieldtypename);
			p33.getXmlPropertyOptionParam().getAttributeName().setValue(fieldtypename);
			p34.getXmlPropertyOptionParam().getAttributeName().setValue(fieldtypename);
			p35.getXmlPropertyOptionParam().getAttributeName().setValue(fieldtypename);
			p36.getXmlPropertyOptionParam().getAttributeName().setValue(fieldtypename);
			p41.getXmlPropertyOptionParam().getAttributeName().setValue(fieldtypename);
			p42.getXmlPropertyOptionParam().getAttributeName().setValue(fieldtypename);
			p43.getXmlPropertyOptionParam().getAttributeName().setValue(fieldtypename);
		}
		p44.getXmlPropertyOptionParam().setValue(fieldvalue);
		p45.getXmlPropertyOptionParam().setValue(fieldvalue);
		if (fieldvalue == XmlPropertyKind.ATTRIBUTE) {
			p44.getXmlPropertyOptionParam().getAttributeName().setValue(fieldvaluename);
			p45.getXmlPropertyOptionParam().getAttributeName().setValue(fieldvaluename);
		}

		p29.setXmlAxis(e0rel);
		p30.setXmlAxis(e0e1rel);
		p31.setXmlAxis(e1e2rel);
		p32.setXmlAxis(e2e3rel);
		p37.setXmlAxis(e0rel);
		p38.setXmlAxis(e0e1rel);
		p39.setXmlAxis(e1e2rel);
		p40.setXmlAxis(e2e3rel);
		
		return completePattern;
	}
	
	private static CompletePattern getUniqueLidoConcrete(XmlAxisKind[] returnRel, String returnElementName, String elementName) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return concretizeUniqueAbstract(returnElementName, returnRel,
				elementName, new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, null);
	}
	
	static CompletePattern getUniqueLidoLidoRecId() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		// not used for evaluation anymore
		return getUniqueLidoConcrete(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "lido:lido", "lido:lidoRecID");
	}
	
	static CompletePattern getUniqueLidoObjectPublishedId() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		return getUniqueLidoConcrete(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "lido:lido", "lido:objectPublishedID");
	}
	
	static CompletePattern getUniqueComplexLidoNameActorSet() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		return getUniqueComplexLidoConcrete(
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "lido:lido",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "lido:actor", 
				new XmlAxisKind[] {XmlAxisKind.CHILD}, "lido:nameActorSet", 
				new XmlAxisKind[] {XmlAxisKind.CHILD}, "lido:appellationValue", 
				XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, null);
	}
	
//	private static CompletePattern getUniqueRunningExample() { // replaced by CARD
//		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
//		
//		CompletePattern completePattern = getUniqueAbstract();
//		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
//		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyKind.TAG);
//		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
//		concreteInputValue.setValue("artist");
//		((UnknownParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).replace(concreteInputValue);
//		
//		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
//		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
//		
//		Element returnInCPattern = countPattern.getGraph().getRootElement().getNextElements().get(0);
//		Element rootInCPattern = countPattern.getGraph().getRootElement();
//		Element nextToRootInCPattern = rootInCPattern.getNextElements().get(1);	
//		nextToRootInCPattern.getProperties().get(0).getOption().setValue(PropertyKind.TAG);
//		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
//		concreteInputValue2.setValue("artist");
//		((UnknownParameterValue) ((Comparison) nextToRootInCPattern.getPredicates().get(0)).getArgument2()).replace(concreteInputValue2);
//		
//		returnInCPattern.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
//		returnInCPattern.getProperties().get(0).getAttributeName().setValue("id");
//		
//		nextToRootInCPattern.getProperties().get(1).getOption().setValue(PropertyKind.ATTRIBUTE);
//		nextToRootInCPattern.getProperties().get(1).getAttributeName().setValue("id");
//		
//		((Comparison) nextToRootInCPattern.getPredicates().get(1)).setType(ReturnType.STRING);
//		
//		return completePattern;
//	}
}

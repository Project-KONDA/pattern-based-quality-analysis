package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
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
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
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
//		completePatterns.add(getMandattAbstract());
		completePatterns.add(getMandattMidas());
		completePatterns.add(getMandattLido());
//		completePatterns.add(getMandattAbstractThreeElements());
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
		completePattern.getGraph().getReturnNodes().get(0).addOutgoing().getTarget().addPrimitiveComparison();
		
		Formula form = factory.createFormula();
		completePattern.setCondition(form);
		form.setOperator(LogicalOperator.OR);
		
		NotCondition notC = factory.createNotCondition();
		QuantifiedCondition qcN = factory.createQuantifiedCondition();
		form.setCondition1(notC);
		notC.setCondition(qcN);	
		
		Graph graph1 = qcN.getGraph();
		Node returnInGraph1 = graph1.getReturnNodes().get(0);
		Node element2 = returnInGraph1.addOutgoing().getTarget().makeComplex();
		element2.addOutgoing().getTarget().addPrimitiveComparison();
		
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		form.setCondition2(qc1);
		
		Graph graph2 = qc1.getGraph();
		Node returnInGraph2 = graph2.getReturnNodes().get(0);
		
		Node element3 = returnInGraph2.addOutgoing().getTarget().makeComplex();
		element3.addOutgoing().getTarget().addPrimitiveComparison();
		element3.addOutgoing().getTarget().addPrimitiveComparison();	
		
		completePattern.createXmlAdaption();
		
		return completePattern;		
	}
	
	private static CompletePattern getMandattAbstractThreeElements() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnNodes().get(0).addOutgoing().getTarget().addPrimitiveComparison();		
		
		QuantifiedCondition qc0 = factory.createQuantifiedCondition();
		completePattern.setCondition(qc0);
		
		Graph graph0 = qc0.getGraph();
		Node returnInGraph0 = graph0.getReturnNodes().get(0);
		Node element0 = returnInGraph0.addOutgoing().getTarget().makeComplex();
		element0.addOutgoing().getTarget().addPrimitiveComparison();		
		
		Formula form = factory.createFormula();
		qc0.setCondition(form);
		form.setOperator(LogicalOperator.OR);		
		
		NotCondition notC = factory.createNotCondition();		
		QuantifiedCondition qcN = factory.createQuantifiedCondition();
		form.setCondition1(notC);
		notC.setCondition(qcN);			
	
		Graph graph1 = qcN.getGraph();
		
		Node returnInGraph1 = graph1.getReturnNodes().get(0);
		Node e0InGraph1 = graph1.getNodes().get(2);
		Node element2 = e0InGraph1.addOutgoing().getTarget().makeComplex();
		element2.addOutgoing().getTarget().addPrimitiveComparison();
		
		Node element5 = element2.addOutgoing().getTarget().makeComplex();
		element5.addOutgoing().getTarget().addPrimitiveComparison();
		
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		form.setCondition2(qc1);
				
		Graph graph2 = qc1.getGraph();
		Node returnInGraph2 = graph2.getReturnNodes().get(0);
		Node e0InGraph2 = graph2.getNodes().get(2);
		Node element3 = e0InGraph2.addOutgoing().getTarget().makeComplex();
		element3.addOutgoing().getTarget().addPrimitiveComparison();	
		
		Node element4 = element3.addOutgoing().getTarget().makeComplex();
		element4.addOutgoing().getTarget().addPrimitiveComparison();
		element4.addOutgoing().getTarget().addPrimitiveComparison();	
		
		completePattern.createXmlAdaption();
		
		return completePattern;		
	}
	
	
	static CompletePattern getMandattMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getMandattAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		UntypedParameterValue p3 = ((UntypedParameterValue) params.get(3));
		ComparisonOptionParam p4 = ((ComparisonOptionParam) params.get(4));
		TypeOptionParam p5 = ((TypeOptionParam) params.get(5));
		UntypedParameterValue p6 = ((UntypedParameterValue) params.get(6));
		ComparisonOptionParam p7 = ((ComparisonOptionParam) params.get(7));
		TypeOptionParam p8 = ((TypeOptionParam) params.get(8));
		UntypedParameterValue p9 = ((UntypedParameterValue) params.get(9));
		ComparisonOptionParam p10 = ((ComparisonOptionParam) params.get(10));
		TypeOptionParam p11 = ((TypeOptionParam) params.get(11));
		XmlPathParamImpl p12 = ((XmlPathParamImpl) params.get(12));
		XmlPathParamImpl p13 = ((XmlPathParamImpl) params.get(13));
		XmlPathParamImpl p14 = ((XmlPathParamImpl) params.get(14));
		XmlPathParamImpl p15 = ((XmlPathParamImpl) params.get(15));
		XmlPathParamImpl p16 = ((XmlPathParamImpl) params.get(16));
		XmlPathParamImpl p17 = ((XmlPathParamImpl) params.get(17));
		XmlPathParamImpl p18 = ((XmlPathParamImpl) params.get(18));

		p0.setValue("kue");
		p3.setValue("3162");
		p6.setValue("3162");
		p9.setValue("");

		p12.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p12.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p15.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p15.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p17.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p17.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p18.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p18.getXmlPropertyOptionParam().getAttributeName().setValue("Value");

		p13.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p14.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p16.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		
		return completePattern;
	}
	
	private static CompletePattern getMandattLido() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getMandattAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		UntypedParameterValue p3 = ((UntypedParameterValue) params.get(3));
		ComparisonOptionParam p4 = ((ComparisonOptionParam) params.get(4));
		TypeOptionParam p5 = ((TypeOptionParam) params.get(5));
		UntypedParameterValue p6 = ((UntypedParameterValue) params.get(6));
		ComparisonOptionParam p7 = ((ComparisonOptionParam) params.get(7));
		TypeOptionParam p8 = ((TypeOptionParam) params.get(8));
		UntypedParameterValue p9 = ((UntypedParameterValue) params.get(9));
		ComparisonOptionParam p10 = ((ComparisonOptionParam) params.get(10));
		TypeOptionParam p11 = ((TypeOptionParam) params.get(11));
		XmlPathParamImpl p12 = ((XmlPathParamImpl) params.get(12));
		XmlPathParamImpl p13 = ((XmlPathParamImpl) params.get(13));
		XmlPathParamImpl p14 = ((XmlPathParamImpl) params.get(14));
		XmlPathParamImpl p15 = ((XmlPathParamImpl) params.get(15));
		XmlPathParamImpl p16 = ((XmlPathParamImpl) params.get(16));
		XmlPathParamImpl p17 = ((XmlPathParamImpl) params.get(17));
		XmlPathParamImpl p18 = ((XmlPathParamImpl) params.get(18));

		p0.setValue("lido:lido");
		p3.setValue("lido:appellationValue");
		p6.setValue("lido:appellationValue");
		TextListParam tlp = new TextListParamImpl();
		tlp.getValues().add("unbekannt");
		tlp.getValues().add("");
		tlp.getValues().add("?");
		tlp.getValues().add("x");
		tlp.getValues().add("unknown");
		p9.replace(tlp);

		p12.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p15.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p17.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p18.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);

		p13.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p14.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p16.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		
		return completePattern;
	}
	
	static CompletePattern getMandattThreeElementsLido() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern completePattern = getMandattAbstractThreeElements();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		UntypedParameterValue p3 = ((UntypedParameterValue) params.get(3));
		ComparisonOptionParam p4 = ((ComparisonOptionParam) params.get(4));
		TypeOptionParam p5 = ((TypeOptionParam) params.get(5));
		UntypedParameterValue p6 = ((UntypedParameterValue) params.get(6));
		ComparisonOptionParam p7 = ((ComparisonOptionParam) params.get(7));
		TypeOptionParam p8 = ((TypeOptionParam) params.get(8));
		UntypedParameterValue p9 = ((UntypedParameterValue) params.get(9));
		ComparisonOptionParam p10 = ((ComparisonOptionParam) params.get(10));
		TypeOptionParam p11 = ((TypeOptionParam) params.get(11));
		UntypedParameterValue p12 = ((UntypedParameterValue) params.get(12));
		ComparisonOptionParam p13 = ((ComparisonOptionParam) params.get(13));
		TypeOptionParam p14 = ((TypeOptionParam) params.get(14));
		UntypedParameterValue p15 = ((UntypedParameterValue) params.get(15));
		ComparisonOptionParam p16 = ((ComparisonOptionParam) params.get(16));
		TypeOptionParam p17 = ((TypeOptionParam) params.get(17));
		UntypedParameterValue p18 = ((UntypedParameterValue) params.get(18));
		ComparisonOptionParam p19 = ((ComparisonOptionParam) params.get(19));
		TypeOptionParam p20 = ((TypeOptionParam) params.get(20));
		XmlPathParamImpl p21 = ((XmlPathParamImpl) params.get(21));
		XmlPathParamImpl p22 = ((XmlPathParamImpl) params.get(22));
		XmlPathParamImpl p23 = ((XmlPathParamImpl) params.get(23));
		XmlPathParamImpl p24 = ((XmlPathParamImpl) params.get(24));
		XmlPathParamImpl p25 = ((XmlPathParamImpl) params.get(25));
		XmlPathParamImpl p26 = ((XmlPathParamImpl) params.get(26));
		XmlPathParamImpl p27 = ((XmlPathParamImpl) params.get(27));
		XmlPathParamImpl p28 = ((XmlPathParamImpl) params.get(28));
		XmlPathParamImpl p29 = ((XmlPathParamImpl) params.get(29));
		XmlPathParamImpl p30 = ((XmlPathParamImpl) params.get(30));
		XmlPathParamImpl p31 = ((XmlPathParamImpl) params.get(31));
		XmlPathParamImpl p32 = ((XmlPathParamImpl) params.get(32));
		XmlPathParamImpl p33 = ((XmlPathParamImpl) params.get(33));
		
		p0.setValue("lido:lido");
		p3.setValue("lido:actor");
		p6.setValue("lido:nameActorSet");
		p9.setValue("lido:appellationValue");
		p12.setValue("lido:nameActorSet");
		p15.setValue("lido:appellationValue");

		TextListParam tlp = new TextListParamImpl();
		tlp.getValues().add("");
		p18.replace(tlp);
		
		p22.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p23.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p25.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p27.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p29.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p31.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});

		p21.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p24.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p26.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p28.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p30.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p32.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p33.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		
		return completePattern;
	}
	
}

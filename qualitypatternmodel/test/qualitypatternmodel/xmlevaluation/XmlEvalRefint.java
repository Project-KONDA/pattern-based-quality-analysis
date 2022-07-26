package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.evaluation.EvalRefint;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalRefint {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getRefintCondAbstract());
		completePatterns.add(getRefintMidasWer());
		completePatterns.add(getRefintAbstractRunningExample());
		completePatterns.add(getRefintRunningExample());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);	
	}
	
	public static CompletePattern getRefintCondAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalRefint.getRefintCondGeneric();
		completePattern.createXmlAdaption();		
		return completePattern; 
	}
	
	public static CompletePattern getRefintMidasWer() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getRefintCondAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		UntypedParameterValue p3 = ((UntypedParameterValue) params.get(3));
//		ComparisonOptionParam p4 = ((ComparisonOptionParam) params.get(4));
//		TypeOptionParam p5 = ((TypeOptionParam) params.get(5));
		UntypedParameterValue p6 = ((UntypedParameterValue) params.get(6));
//		ComparisonOptionParam p7 = ((ComparisonOptionParam) params.get(7));
//		TypeOptionParam p8 = ((TypeOptionParam) params.get(8));
		UntypedParameterValue p9 = ((UntypedParameterValue) params.get(9));
//		ComparisonOptionParam p10 = ((ComparisonOptionParam) params.get(10));
//		TypeOptionParam p11 = ((TypeOptionParam) params.get(11));
//		ComparisonOptionParam p12 = ((ComparisonOptionParam) params.get(12));
//		TypeOptionParam p13 = ((TypeOptionParam) params.get(13));
		XmlPathParamImpl p14 = ((XmlPathParamImpl) params.get(14));
		XmlPathParamImpl p15 = ((XmlPathParamImpl) params.get(15));
		XmlPathParamImpl p16 = ((XmlPathParamImpl) params.get(16));
		XmlPathParamImpl p17 = ((XmlPathParamImpl) params.get(17));
		XmlPathParamImpl p18 = ((XmlPathParamImpl) params.get(18));
		XmlPathParamImpl p19 = ((XmlPathParamImpl) params.get(19));
		XmlPathParamImpl p20 = ((XmlPathParamImpl) params.get(20));
		XmlPathParamImpl p21 = ((XmlPathParamImpl) params.get(21));
		XmlPathParamImpl p22 = ((XmlPathParamImpl) params.get(22));
		XmlPathParamImpl p23 = ((XmlPathParamImpl) params.get(23));

		p0.setValue("obj");
		p3.setValue("3600");
		p6.setValue("wer");
		p9.setValue("3600");
		
		p15.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p16.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p20.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p23.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});

		p14.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p14.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p17.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p17.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p18.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p18.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p19.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p19.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p21.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p21.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p22.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p22.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		
		return completePattern;		
	}
	
	public static CompletePattern getRefintAbstractRunningExample() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
				
		CompletePattern completePattern = factory.createCompletePattern();
		QuantifiedCondition qc1 = factory.createQuantifiedCondition(); 
		NotCondition notc = factory.createNotCondition();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		
		completePattern.setCondition(qc1);
		qc1.setCondition(notc);
		notc.setCondition(qc2);
		
		Graph g0 = completePattern.getGraph();
		Graph g1 = qc1.getGraph();
		Graph g2 = qc2.getGraph();
		
		Node e0g0 = g0.getReturnNodes().get(0);
		Node e1g0 = e0g0.addOutgoing().getTarget().makePrimitive();
		e1g0.addPrimitiveComparison();
		
		Node e0g1 = g1.getReturnNodes().get(0);
		Node e2g1 = e0g1.addOutgoing().getTarget().makeComplex();
		Node e3g1 = e2g1.addOutgoing().getTarget().makePrimitive();
		e3g1.addPrimitiveComparison();
		
		Node e2g2 = g2.getNodes().get(2);
		PrimitiveNode e4g2 = e2g2.addOutgoing().getTarget().makePrimitive();
		
		ComplexNode e5g2 = graphFactory.createComplexNode();
		e5g2.setGraph(g2);
		
		PrimitiveNode e8g2 = e5g2.addOutgoing().getTarget().makePrimitive();
		e8g2.addPrimitiveComparison();

		PrimitiveNode e9g2 = e5g2.addOutgoing().getTarget().makePrimitive();
		
		Comparison c = e4g2.addComparison(e9g2);
		
		c.getOption().setValue(ComparisonOperator.EQUAL);
		c.getTypeOption().setValue(ReturnType.STRING);
		
		completePattern.createXmlAdaption();
		
		return completePattern; 
	}
	
	public static CompletePattern getRefintRunningExample() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getRefintAbstractRunningExample();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		UntypedParameterValue p3 = ((UntypedParameterValue) params.get(3));
//		ComparisonOptionParam p4 = ((ComparisonOptionParam) params.get(4));
//		TypeOptionParam p5 = ((TypeOptionParam) params.get(5));
		UntypedParameterValue p6 = ((UntypedParameterValue) params.get(6));
//		ComparisonOptionParam p7 = ((ComparisonOptionParam) params.get(7));
//		TypeOptionParam p8 = ((TypeOptionParam) params.get(8));
//		ComparisonOptionParam p9 = ((ComparisonOptionParam) params.get(9));
//		TypeOptionParam p10 = ((TypeOptionParam) params.get(10));
		XmlPathParamImpl p11 = ((XmlPathParamImpl) params.get(11));
		XmlPathParamImpl p12 = ((XmlPathParamImpl) params.get(12));
		XmlPathParamImpl p13 = ((XmlPathParamImpl) params.get(13));
		XmlPathParamImpl p14 = ((XmlPathParamImpl) params.get(14));
		XmlPathParamImpl p15 = ((XmlPathParamImpl) params.get(15));
		XmlPathParamImpl p16 = ((XmlPathParamImpl) params.get(16));
		XmlPathParamImpl p17 = ((XmlPathParamImpl) params.get(17));
		XmlPathParamImpl p18 = ((XmlPathParamImpl) params.get(18));
		
		p0.setValue("building");
		p3.setValue("creator");
		p6.setValue("artist");

		p12.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p13.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p18.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});

		p11.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p14.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p15.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p15.getXmlPropertyOptionParam().getAttributeName().setValue("ref");
		p16.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p17.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p17.getXmlPropertyOptionParam().getAttributeName().setValue("id");
		
		return completePattern;		
	}
}

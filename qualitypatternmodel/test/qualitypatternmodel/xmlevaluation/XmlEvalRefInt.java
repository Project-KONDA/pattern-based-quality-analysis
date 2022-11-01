package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.evaluation.EvalRefInt;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalRefInt {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getRefintCondAbstract());
		completePatterns.add(getRefintMidasWer());
		completePatterns.add(getRefintRunningExampleAbstract());
		completePatterns.add(getRefintRunningExample());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);	
	}
	
	public static CompletePattern getRefintCondAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalRefInt.getRefintCondGeneric();
		completePattern.createXmlAdaption();		
		return completePattern; 
	}
	
	public static CompletePattern getRefintRunningExampleAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalRefInt.getRefintRunningExampleGeneric();
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
		XmlPathParam p14 = ((XmlPathParam) params.get(14));
		XmlPathParam p15 = ((XmlPathParam) params.get(15));
		XmlPathParam p16 = ((XmlPathParam) params.get(16));
		XmlPathParam p17 = ((XmlPathParam) params.get(17));
		XmlPathParam p18 = ((XmlPathParam) params.get(18));
		XmlPathParam p19 = ((XmlPathParam) params.get(19));
		XmlPathParam p20 = ((XmlPathParam) params.get(20));
		XmlPathParam p21 = ((XmlPathParam) params.get(21));
		XmlPathParam p22 = ((XmlPathParam) params.get(22));
		XmlPathParam p23 = ((XmlPathParam) params.get(23));

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
	
	public static CompletePattern getRefintRunningExample() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getRefintRunningExampleAbstract();
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
		XmlPathParam p11 = ((XmlPathParam) params.get(11));
		XmlPathParam p12 = ((XmlPathParam) params.get(12));
		XmlPathParam p13 = ((XmlPathParam) params.get(13));
		XmlPathParam p14 = ((XmlPathParam) params.get(14));
		XmlPathParam p15 = ((XmlPathParam) params.get(15));
		XmlPathParam p16 = ((XmlPathParam) params.get(16));
		XmlPathParam p17 = ((XmlPathParam) params.get(17));
		XmlPathParam p18 = ((XmlPathParam) params.get(18));
		
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

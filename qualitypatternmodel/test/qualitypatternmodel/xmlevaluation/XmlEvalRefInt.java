package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.evaluationquality.EvalRefInt;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalRefInt {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getRefintAbstract());
//		completePatterns.add(getRefintCondAbstract());
		completePatterns.add(getRefintMidasWer());
		completePatterns.add(getRefintMidasWerAps());
		completePatterns.add(getRefintRunningExampleAbstract());
		completePatterns.add(getRefintRunningExample());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);	
	}
	
	public static CompletePattern getRefintAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalRefInt.getRefintGeneric();
		completePattern.createXmlAdaption();		
		return completePattern; 
	}
	
	public static CompletePattern getRefintRunningExampleAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalRefInt.getRefintRunningExampleGeneric();
		completePattern.createXmlAdaption();
		return completePattern; 
	}
	
	public static CompletePattern getRefintMidasWer() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getRefintAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();

//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
		XmlPathParam p6 = ((XmlPathParam) params.get(6));
		XmlPathParam p7 = ((XmlPathParam) params.get(7));

		p2.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "obj");
		p3.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "3600");
		p4.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p4.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p5.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "3600");
		p6.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p6.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p7.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "wer");
		
		return completePattern;		
	}
	
	public static CompletePattern getRefintMidasWerAps() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getRefintAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();

//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
		XmlPathParam p6 = ((XmlPathParam) params.get(6));
		XmlPathParam p7 = ((XmlPathParam) params.get(7));

		p2.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "obj");
		p3.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "a3600");
		p4.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p5.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "a3600");
		p6.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p7.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "wer");
		
		return completePattern;		
	}
	
	public static CompletePattern getRefintRunningExample() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getRefintRunningExampleAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();

//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
		XmlPathParam p6 = ((XmlPathParam) params.get(6));

		p2.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "building");
		p3.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "creator");
		p4.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p4.getXmlPropertyOptionParam().getAttributeName().setValue("ref");
		p5.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p5.getXmlPropertyOptionParam().getAttributeName().setValue("id");
		p6.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "artist");
				
		return completePattern;		
	}
}

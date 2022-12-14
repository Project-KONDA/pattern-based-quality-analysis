package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.evaluation.EvalFunc;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalFunc {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getFuncMidas());
		completePatterns.add(getFuncLido());
		completePatterns.add(getFuncRunningExample());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);	
	}
	
	public static CompletePattern getFuncAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalFunc.getFuncGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getFunc2Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalFunc.getFunc2Generic();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getFuncLidoAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalFunc.getFuncLidoGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	static CompletePattern getFuncMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getFuncAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
//		ComparisonOptionParam p2 = ((ComparisonOptionParam) params.get(2));
//		TypeOptionParam p3 = ((TypeOptionParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
		XmlPathParam p6 = ((XmlPathParam) params.get(6));
		XmlPathParam p7 = ((XmlPathParam) params.get(7));
		XmlPathParam p8 = ((XmlPathParam) params.get(8));
		XmlPathParam p9 = ((XmlPathParam) params.get(9));
		

		p4.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "wer");
		p5.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "3600");
		p5.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p5.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p6.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "3680");
		p6.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p6.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p7.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "3600");
		p7.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p7.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p8.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "3680");
		p8.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p8.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p9.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "wer");
		
		return completePattern;
	}
	
	static CompletePattern getFuncLido() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getFunc2Abstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
//		ComparisonOptionParam p2 = ((ComparisonOptionParam) params.get(2));
//		TypeOptionParam p3 = ((TypeOptionParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
		XmlPathParam p6 = ((XmlPathParam) params.get(6));
		XmlPathParam p7 = ((XmlPathParam) params.get(7));
		XmlPathParam p8 = ((XmlPathParam) params.get(8));
		XmlPathParam p9 = ((XmlPathParam) params.get(9));
		XmlPathParam p10 = ((XmlPathParam) params.get(10));
		
		p4.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "lido:lido");
		p5.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "lido:termMaterialsTech");
		p6.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "lido:conceptID");
		p6.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p7.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "lido:term");
		p7.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p8.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "lido:conceptID");
		p8.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p9.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "lido:term");
		p9.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p10.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "lido:termMaterialsTech");
		
		return completePattern;
	}
		
	private static CompletePattern getFuncRunningExample() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getFuncAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();

//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
//		ComparisonOptionParam p2 = ((ComparisonOptionParam) params.get(2));
//		TypeOptionParam p3 = ((TypeOptionParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
		XmlPathParam p6 = ((XmlPathParam) params.get(6));
		XmlPathParam p7 = ((XmlPathParam) params.get(7));
		XmlPathParam p8 = ((XmlPathParam) params.get(8));
		XmlPathParam p9 = ((XmlPathParam) params.get(9));
		

		p4.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "building");
		p5.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "city");
		p6.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "country");
		p7.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "city");
		p8.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "country");
		p9.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "building");
		
		return completePattern;
	}

}

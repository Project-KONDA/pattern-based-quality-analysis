package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.evaluation.EvalFunc;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalFunc {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getFuncRunningExample());
		completePatterns.add(getFuncMidas());
		completePatterns.add(getFuncLido());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);	
	}
	
	public static CompletePattern getFuncAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalFunc.getFuncGenericComp();
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
		
		UntypedParameterValueImpl p0 = ((UntypedParameterValueImpl) params.get(0));
//		ComparisonOptionParamImpl p1 = ((ComparisonOptionParamImpl) params.get(1));
//		TypeOptionParamImpl p2 = ((TypeOptionParamImpl) params.get(2));
		UntypedParameterValueImpl p3 = ((UntypedParameterValueImpl) params.get(3));
//		ComparisonOptionParamImpl p4 = ((ComparisonOptionParamImpl) params.get(4));
//		TypeOptionParamImpl p5 = ((TypeOptionParamImpl) params.get(5));
		UntypedParameterValueImpl p6 = ((UntypedParameterValueImpl) params.get(6));
//		ComparisonOptionParamImpl p7 = ((ComparisonOptionParamImpl) params.get(7));
//		TypeOptionParamImpl p8 = ((TypeOptionParamImpl) params.get(8));
		UntypedParameterValueImpl p9 = ((UntypedParameterValueImpl) params.get(9));
//		ComparisonOptionParamImpl p10 = ((ComparisonOptionParamImpl) params.get(10));
//		TypeOptionParamImpl p11 = ((TypeOptionParamImpl) params.get(11));
		UntypedParameterValueImpl p12 = ((UntypedParameterValueImpl) params.get(12));
//		ComparisonOptionParamImpl p13 = ((ComparisonOptionParamImpl) params.get(13));
//		TypeOptionParamImpl p14 = ((TypeOptionParamImpl) params.get(14));
		UntypedParameterValueImpl p15 = ((UntypedParameterValueImpl) params.get(15));
//		ComparisonOptionParamImpl p16 = ((ComparisonOptionParamImpl) params.get(16));
//		TypeOptionParamImpl p17 = ((TypeOptionParamImpl) params.get(17));
//		ComparisonOptionParamImpl p18 = ((ComparisonOptionParamImpl) params.get(18));
//		TypeOptionParamImpl p19 = ((TypeOptionParamImpl) params.get(19));
//		ComparisonOptionParamImpl p20 = ((ComparisonOptionParamImpl) params.get(20));
//		TypeOptionParamImpl p21 = ((TypeOptionParamImpl) params.get(21));
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
		XmlPathParamImpl p34 = ((XmlPathParamImpl) params.get(34));
		XmlPathParamImpl p35 = ((XmlPathParamImpl) params.get(35));
		XmlPathParamImpl p36 = ((XmlPathParamImpl) params.get(36));
		XmlPathParamImpl p37 = ((XmlPathParamImpl) params.get(37));

		p0.setValue("wer");
		p3.setValue("3600");
		p6.setValue("3680");
		p9.setValue("wer");
		p12.setValue("3600");
		p15.setValue("3680");

		p22.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p22.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p28.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p28.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p29.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p29.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p30.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p30.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p31.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p31.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p32.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p32.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p33.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p33.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p34.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p34.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p35.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p35.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p36.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p36.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		
		p23.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p24.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.DESCENDANT});
		p25.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p26.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p27.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p37.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		
		return completePattern;
	}
	
	static CompletePattern getFuncLido() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getFuncLidoAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValueImpl p0 = ((UntypedParameterValueImpl) params.get(0));
//		ComparisonOptionParamImpl p1 = ((ComparisonOptionParamImpl) params.get(1));
//		TypeOptionParamImpl p2 = ((TypeOptionParamImpl) params.get(2));
		UntypedParameterValueImpl p3 = ((UntypedParameterValueImpl) params.get(3));
//		ComparisonOptionParamImpl p4 = ((ComparisonOptionParamImpl) params.get(4));
//		TypeOptionParamImpl p5 = ((TypeOptionParamImpl) params.get(5));
		UntypedParameterValueImpl p6 = ((UntypedParameterValueImpl) params.get(6));
//		ComparisonOptionParamImpl p7 = ((ComparisonOptionParamImpl) params.get(7));
//		TypeOptionParamImpl p8 = ((TypeOptionParamImpl) params.get(8));
		UntypedParameterValueImpl p9 = ((UntypedParameterValueImpl) params.get(9));
//		ComparisonOptionParamImpl p10 = ((ComparisonOptionParamImpl) params.get(10));
//		TypeOptionParamImpl p11 = ((TypeOptionParamImpl) params.get(11));
		UntypedParameterValueImpl p12 = ((UntypedParameterValueImpl) params.get(12));
//		ComparisonOptionParamImpl p13 = ((ComparisonOptionParamImpl) params.get(13));
//		TypeOptionParamImpl p14 = ((TypeOptionParamImpl) params.get(14));
		UntypedParameterValueImpl p15 = ((UntypedParameterValueImpl) params.get(15));
//		ComparisonOptionParamImpl p16 = ((ComparisonOptionParamImpl) params.get(16));
//		TypeOptionParamImpl p17 = ((TypeOptionParamImpl) params.get(17));
		UntypedParameterValueImpl p18 = ((UntypedParameterValueImpl) params.get(18));
//		ComparisonOptionParamImpl p19 = ((ComparisonOptionParamImpl) params.get(19));
//		TypeOptionParamImpl p20 = ((TypeOptionParamImpl) params.get(20));
//		ComparisonOptionParamImpl p21 = ((ComparisonOptionParamImpl) params.get(21));
//		TypeOptionParamImpl p22 = ((TypeOptionParamImpl) params.get(22));
//		ComparisonOptionParamImpl p23 = ((ComparisonOptionParamImpl) params.get(23));
//		TypeOptionParamImpl p24 = ((TypeOptionParamImpl) params.get(24));
		XmlPathParamImpl p25 = ((XmlPathParamImpl) params.get(25));
//		XmlPathParamImpl p26 = ((XmlPathParamImpl) params.get(26));
		XmlPathParamImpl p27 = ((XmlPathParamImpl) params.get(27));
		XmlPathParamImpl p28 = ((XmlPathParamImpl) params.get(28));
		XmlPathParamImpl p29 = ((XmlPathParamImpl) params.get(29));
		XmlPathParamImpl p30 = ((XmlPathParamImpl) params.get(30));
		XmlPathParamImpl p31 = ((XmlPathParamImpl) params.get(31));
		XmlPathParamImpl p32 = ((XmlPathParamImpl) params.get(32));
		XmlPathParamImpl p33 = ((XmlPathParamImpl) params.get(33));
		XmlPathParamImpl p34 = ((XmlPathParamImpl) params.get(34));
		XmlPathParamImpl p35 = ((XmlPathParamImpl) params.get(35));
		XmlPathParamImpl p36 = ((XmlPathParamImpl) params.get(36));
		XmlPathParamImpl p37 = ((XmlPathParamImpl) params.get(37));
		XmlPathParamImpl p38 = ((XmlPathParamImpl) params.get(38));
		XmlPathParamImpl p39 = ((XmlPathParamImpl) params.get(39));
		XmlPathParamImpl p40 = ((XmlPathParamImpl) params.get(40));
		XmlPathParamImpl p41 = ((XmlPathParamImpl) params.get(41));
		XmlPathParamImpl p42 = ((XmlPathParamImpl) params.get(42));
		
		p0.setValue("lido:lido");
		p3.setValue("lido:termMaterialsTech");
		p6.setValue("lido:termMaterialsTech");
		p9.setValue("lido:conceptID");
		p12.setValue("lido:term");
		p15.setValue("lido:conceptID");
		p18.setValue("lido:term");
//		p23.setValue(ComparisonOperator.NOTEQUAL);
		p25.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p28.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p31.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p34.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p35.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p36.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p37.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p38.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p39.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p40.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p41.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);

		p27.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p29.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p30.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p32.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p33.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p42.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		
		return completePattern;
	}
	
	private static CompletePattern getFuncRunningExample() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getFuncAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValueImpl p0 = ((UntypedParameterValueImpl) params.get(0));
//		ComparisonOptionParamImpl p1 = ((ComparisonOptionParamImpl) params.get(1));
//		TypeOptionParamImpl p2 = ((TypeOptionParamImpl) params.get(2));
		UntypedParameterValueImpl p3 = ((UntypedParameterValueImpl) params.get(3));
//		ComparisonOptionParamImpl p4 = ((ComparisonOptionParamImpl) params.get(4));
//		TypeOptionParamImpl p5 = ((TypeOptionParamImpl) params.get(5));
		UntypedParameterValueImpl p6 = ((UntypedParameterValueImpl) params.get(6));
//		ComparisonOptionParamImpl p7 = ((ComparisonOptionParamImpl) params.get(7));
//		TypeOptionParamImpl p8 = ((TypeOptionParamImpl) params.get(8));
		UntypedParameterValueImpl p9 = ((UntypedParameterValueImpl) params.get(9));
//		ComparisonOptionParamImpl p10 = ((ComparisonOptionParamImpl) params.get(10));
//		TypeOptionParamImpl p11 = ((TypeOptionParamImpl) params.get(11));
		UntypedParameterValueImpl p12 = ((UntypedParameterValueImpl) params.get(12));
//		ComparisonOptionParamImpl p13 = ((ComparisonOptionParamImpl) params.get(13));
//		TypeOptionParamImpl p14 = ((TypeOptionParamImpl) params.get(14));
		UntypedParameterValueImpl p15 = ((UntypedParameterValueImpl) params.get(15));
//		ComparisonOptionParamImpl p16 = ((ComparisonOptionParamImpl) params.get(16));
//		TypeOptionParamImpl p17 = ((TypeOptionParamImpl) params.get(17));
//		ComparisonOptionParamImpl p18 = ((ComparisonOptionParamImpl) params.get(18));
//		TypeOptionParamImpl p19 = ((TypeOptionParamImpl) params.get(19));
//		ComparisonOptionParamImpl p20 = ((ComparisonOptionParamImpl) params.get(20));
//		TypeOptionParamImpl p21 = ((TypeOptionParamImpl) params.get(21));
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
		XmlPathParamImpl p34 = ((XmlPathParamImpl) params.get(34));
		XmlPathParamImpl p35 = ((XmlPathParamImpl) params.get(35));
		XmlPathParamImpl p36 = ((XmlPathParamImpl) params.get(36));
		XmlPathParamImpl p37 = ((XmlPathParamImpl) params.get(37));
		
		p0.setValue("building");
		p3.setValue("city");
		p6.setValue("country");
		p9.setValue("building");
		p12.setValue("city");
		p15.setValue("country");
		
		p22.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p28.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p29.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p30.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p31.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p32.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p33.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p34.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p35.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p36.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		
		p23.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p24.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p23.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p24.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p25.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p26.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p27.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p37.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		
		return completePattern;
	}

}

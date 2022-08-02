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
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalFunc {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getFuncMidas());
		completePatterns.add(getFuncLido());
		completePatterns.add(getFuncSimpleLido());
		completePatterns.add(getFuncRunningExample());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);	
	}
	
	public static CompletePattern getFuncAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalFunc.getFuncGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getFuncCondAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalFunc.getFuncCondGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getFuncLidoAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalFunc.getFuncLidoGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	static CompletePattern getFuncMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getFuncCondAbstract();
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
		UntypedParameterValue p12 = ((UntypedParameterValue) params.get(12));
//		ComparisonOptionParam p13 = ((ComparisonOptionParam) params.get(13));
//		TypeOptionParam p14 = ((TypeOptionParam) params.get(14));
		UntypedParameterValue p15 = ((UntypedParameterValue) params.get(15));
//		ComparisonOptionParam p16 = ((ComparisonOptionParam) params.get(16));
//		TypeOptionParam p17 = ((TypeOptionParam) params.get(17));
//		ComparisonOptionParam p18 = ((ComparisonOptionParam) params.get(18));
//		TypeOptionParam p19 = ((TypeOptionParam) params.get(19));
//		ComparisonOptionParam p20 = ((ComparisonOptionParam) params.get(20));
//		TypeOptionParam p21 = ((TypeOptionParam) params.get(21));
		XmlPathParam p22 = ((XmlPathParam) params.get(22));
		XmlPathParam p23 = ((XmlPathParam) params.get(23));
		XmlPathParam p24 = ((XmlPathParam) params.get(24));
		XmlPathParam p25 = ((XmlPathParam) params.get(25));
		XmlPathParam p26 = ((XmlPathParam) params.get(26));
		XmlPathParam p27 = ((XmlPathParam) params.get(27));
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
		UntypedParameterValue p12 = ((UntypedParameterValue) params.get(12));
//		ComparisonOptionParam p13 = ((ComparisonOptionParam) params.get(13));
//		TypeOptionParam p14 = ((TypeOptionParam) params.get(14));
		UntypedParameterValue p15 = ((UntypedParameterValue) params.get(15));
//		ComparisonOptionParam p16 = ((ComparisonOptionParam) params.get(16));
//		TypeOptionParam p17 = ((TypeOptionParam) params.get(17));
		UntypedParameterValue p18 = ((UntypedParameterValue) params.get(18));
//		ComparisonOptionParam p19 = ((ComparisonOptionParam) params.get(19));
//		TypeOptionParam p20 = ((TypeOptionParam) params.get(20));
//		ComparisonOptionParam p21 = ((ComparisonOptionParam) params.get(21));
//		TypeOptionParam p22 = ((TypeOptionParam) params.get(22));
//		ComparisonOptionParam p23 = ((ComparisonOptionParam) params.get(23));
//		TypeOptionParam p24 = ((TypeOptionParam) params.get(24));
		XmlPathParam p25 = ((XmlPathParam) params.get(25));
		XmlPathParam p26 = ((XmlPathParam) params.get(26));
		XmlPathParam p27 = ((XmlPathParam) params.get(27));
		XmlPathParam p28 = ((XmlPathParam) params.get(28));
		XmlPathParam p29 = ((XmlPathParam) params.get(29));
//		XmlPathParam p30 = ((XmlPathParam) params.get(30));
//		XmlPathParam p31 = ((XmlPathParam) params.get(31));
//		XmlPathParam p32 = ((XmlPathParam) params.get(32));
//		XmlPathParam p33 = ((XmlPathParam) params.get(33));
		XmlPathParam p34 = ((XmlPathParam) params.get(34));
		XmlPathParam p35 = ((XmlPathParam) params.get(35));
		XmlPathParam p36 = ((XmlPathParam) params.get(36));
		XmlPathParam p37 = ((XmlPathParam) params.get(37));
		XmlPathParam p38 = ((XmlPathParam) params.get(38));
		XmlPathParam p39 = ((XmlPathParam) params.get(39));
		XmlPathParam p40 = ((XmlPathParam) params.get(40));
		XmlPathParam p41 = ((XmlPathParam) params.get(41));
		XmlPathParam p42 = ((XmlPathParam) params.get(42));
		
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
		p29.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p34.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p35.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p36.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p37.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p38.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p39.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p40.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p41.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);

		p26.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p27.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p42.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		
		return completePattern;
	}
	
	static CompletePattern getFuncSimpleLido() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
		XmlPathParam p10 = ((XmlPathParam) params.get(10));
		
		p4.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "lido:lido");
		p5.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "lido:termMaterialsTech");
		p6.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "lido:conceptID");
		p7.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "lido:term");
		p8.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "lido:conceptID");
		p9.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "lido:term");
		p10.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "lido:termMaterialsTech");
		
		return completePattern;
	}
	
	private static CompletePattern getFuncRunningExample() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getFuncCondAbstract();
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
		UntypedParameterValue p12 = ((UntypedParameterValue) params.get(12));
//		ComparisonOptionParam p13 = ((ComparisonOptionParam) params.get(13));
//		TypeOptionParam p14 = ((TypeOptionParam) params.get(14));
		UntypedParameterValue p15 = ((UntypedParameterValue) params.get(15));
//		ComparisonOptionParam p16 = ((ComparisonOptionParam) params.get(16));
//		TypeOptionParam p17 = ((TypeOptionParam) params.get(17));
//		ComparisonOptionParam p18 = ((ComparisonOptionParam) params.get(18));
//		TypeOptionParam p19 = ((TypeOptionParam) params.get(19));
//		ComparisonOptionParam p20 = ((ComparisonOptionParam) params.get(20));
//		TypeOptionParam p21 = ((TypeOptionParam) params.get(21));
		XmlPathParam p22 = ((XmlPathParam) params.get(22));
		XmlPathParam p23 = ((XmlPathParam) params.get(23));
		XmlPathParam p24 = ((XmlPathParam) params.get(24));
		XmlPathParam p25 = ((XmlPathParam) params.get(25));
		XmlPathParam p26 = ((XmlPathParam) params.get(26));
		XmlPathParam p27 = ((XmlPathParam) params.get(27));
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

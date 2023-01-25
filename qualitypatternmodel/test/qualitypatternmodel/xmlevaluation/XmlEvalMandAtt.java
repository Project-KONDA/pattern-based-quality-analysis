package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.evaluationquality.EvalMandAtt;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalMandAtt {
	
	// also called MAND
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getMandattAbstract());
		completePatterns.add(getMandattMidasAps());
		completePatterns.add(getMandattLido());
//		completePatterns.add(getMandattCondAbstract());
		completePatterns.add(getMandattMidasHida());
		completePatterns.add(getMandattCondLido());
//		completePatterns.add(getMandatt3Abstract());
		completePatterns.add(getMandatt3Lido());
//		completePatterns.add(getMandatt3CondAbstract());
		completePatterns.add(getMandatt3CondLido());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);		
	}
	
	public static CompletePattern getMandattAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandAtt.getMandattGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getMandatt3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern = EvalMandAtt.getMandatt3Generic();
		completePattern.createXmlAdaption();
		return completePattern;		
	}
		
	public static CompletePattern getMandattCondAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandAtt.getMandattCondGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}

	public static CompletePattern getMandatt3CondAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern = EvalMandAtt.getMandatt3CondGeneric();
		completePattern.createXmlAdaption();
		return completePattern;		
	}
	
	static CompletePattern getMandattMidasAps() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMandattAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
//		XmlPathParam p6 = ((XmlPathParam) params.get(6));

		p0.setValue("");

		p3.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "kue");
		p4.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "a3162");
		p5.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "a3162");
		
		return completePattern;
	}
	
	static CompletePattern getMandattMidasHida() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMandattCondAbstract();
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
		XmlPathParam p12 = ((XmlPathParam) params.get(12));
		XmlPathParam p13 = ((XmlPathParam) params.get(13));
		XmlPathParam p14 = ((XmlPathParam) params.get(14));
		XmlPathParam p15 = ((XmlPathParam) params.get(15));
		XmlPathParam p16 = ((XmlPathParam) params.get(16));
		XmlPathParam p17 = ((XmlPathParam) params.get(17));
		XmlPathParam p18 = ((XmlPathParam) params.get(18));

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
		CompletePattern completePattern = getMandattAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();

		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
//		XmlPathParam p6 = ((XmlPathParam) params.get(6));

		TextListParam tlp = new TextListParamImpl();
		tlp.getValues().add("unbekannt");
		tlp.getValues().add("");
		tlp.getValues().add("?");
		tlp.getValues().add("x");
		tlp.getValues().add("unknown");
		p0.replace(tlp);

		p3.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "lido:lido");
		p4.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "lido:appellationValue");
		p5.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "lido:appellationValue");
		
		return completePattern;
	}
	
	private static CompletePattern getMandattCondLido() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMandattCondAbstract();
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
		XmlPathParam p12 = ((XmlPathParam) params.get(12));
		XmlPathParam p13 = ((XmlPathParam) params.get(13));
		XmlPathParam p14 = ((XmlPathParam) params.get(14));
		XmlPathParam p15 = ((XmlPathParam) params.get(15));
		XmlPathParam p16 = ((XmlPathParam) params.get(16));
		XmlPathParam p17 = ((XmlPathParam) params.get(17));
		XmlPathParam p18 = ((XmlPathParam) params.get(18));

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
	
	static CompletePattern getMandatt3Lido() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern completePattern = getMandatt3Abstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
		XmlPathParam p6 = ((XmlPathParam) params.get(6));
		XmlPathParam p7 = ((XmlPathParam) params.get(7));
		XmlPathParam p8 = ((XmlPathParam) params.get(8));
//		XmlPathParam p9 = ((XmlPathParam) params.get(9));
		
//		p0.setValue("lido:lido");
//		p3.setValue("lido:actor");
//		p6.setValue("lido:nameActorSet");
//		p9.setValue("lido:appellationValue");
//		p12.setValue("lido:nameActorSet");
//		p15.setValue("lido:appellationValue");

		TextListParam tlp = new TextListParamImpl();
		tlp.getValues().add("");
		p0.replace(tlp);
		
		p3.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "lido:lido");
		p4.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "lido:actor");
		p5.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "lido:nameActorSet");
		p6.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "lido:appellationValue");
		p7.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "lido:nameActorSet");
		p8.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "lido:appellationValue");
		
		return completePattern;
	}
	
	static CompletePattern getMandatt3CondLido() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern completePattern = getMandatt3CondAbstract();
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
		XmlPathParam p21 = ((XmlPathParam) params.get(21));
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

package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.evaluation.EvalContrel;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalContrel {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getContrelAbstract());
		completePatterns.add(getContrelMidas());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);	
	}
	
	public static CompletePattern getContrelAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern = EvalContrel.getContrelCondGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getContrelMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		CompletePattern completePattern = getContrelAbstract();
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
		UntypedParameterValue p21 = ((UntypedParameterValue) params.get(21));
//		ComparisonOptionParam p22 = ((ComparisonOptionParam) params.get(22));
//		TypeOptionParam p23 = ((TypeOptionParam) params.get(23));
//		ComparisonOptionParam p24 = ((ComparisonOptionParam) params.get(24));
//		TypeOptionParam p25 = ((TypeOptionParam) params.get(25));
//		ComparisonOptionParam p26 = ((ComparisonOptionParam) params.get(26));
//		TypeOptionParam p27 = ((TypeOptionParam) params.get(27));
//		ComparisonOptionParam p28 = ((ComparisonOptionParam) params.get(28));
//		TypeOptionParam p29 = ((TypeOptionParam) params.get(29));
		XmlPathParam p30 = ((XmlPathParam) params.get(30));
//		XmlPathParam p31 = ((XmlPathParam) params.get(31));
		XmlPathParam p32 = ((XmlPathParam) params.get(32));
//		XmlPathParam p33 = ((XmlPathParam) params.get(33));
		XmlPathParam p34 = ((XmlPathParam) params.get(34));
//		XmlPathParam p35 = ((XmlPathParam) params.get(35));
		XmlPathParam p36 = ((XmlPathParam) params.get(36));
//		XmlPathParam p37 = ((XmlPathParam) params.get(37));
		XmlPathParam p38 = ((XmlPathParam) params.get(38));
//		XmlPathParam p39 = ((XmlPathParam) params.get(39));
		XmlPathParam p40 = ((XmlPathParam) params.get(40));
//		XmlPathParam p41 = ((XmlPathParam) params.get(41));
		XmlPathParam p42 = ((XmlPathParam) params.get(42));
//		XmlPathParam p43 = ((XmlPathParam) params.get(43));
		XmlPathParam p44 = ((XmlPathParam) params.get(44));
		XmlPathParam p45 = ((XmlPathParam) params.get(45));
		XmlPathParam p46 = ((XmlPathParam) params.get(46));
		XmlPathParam p47 = ((XmlPathParam) params.get(47));
		XmlPathParam p48 = ((XmlPathParam) params.get(48));
		XmlPathParam p49 = ((XmlPathParam) params.get(49));
		XmlPathParam p50 = ((XmlPathParam) params.get(50));
//		XmlPathParam p51 = ((XmlPathParam) params.get(51));

		p0.setValue("kue");
		p3.setValue("wer");
		p6.setValue("3100");
		p9.setValue("3600");
		p12.setValue("ku35");
		p15.setValue("we30");
		p18.setValue("3600");
		p21.setValue("3100");
		
		
		p30.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p30.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p32.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p32.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p34.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p34.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p36.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p36.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p38.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p38.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p40.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p40.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p42.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p42.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p44.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p44.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p45.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p45.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p46.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p46.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p47.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p47.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p48.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p48.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p49.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p49.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p50.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p50.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
						
		return completePattern;
	}
}

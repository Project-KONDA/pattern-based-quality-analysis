package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.evaluation.EvalAppDup;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalAppDup {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getAppdup3Midas());
		completePatterns.add(getAppdup3MidasAPS());
		
		Test00.test(completePatterns);
	}
	
	public static CompletePattern getAppdup2CondAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalAppDup.getAppDup2CondGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getAppdup3CondAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalAppDup.getAppDup3CondGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getAppdup2Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalAppDup.getAppDup2Generic();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getAppdup3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalAppDup.getAppDup3Generic();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	static CompletePattern getAppdup3Midas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAppdup3CondAbstract();
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		NumberParam p1 = ((NumberParam) params.get(1));
		TextLiteralParam p2 = ((TextLiteralParam) params.get(2));
//		ComparisonOptionParam p3 = ((ComparisonOptionParam) params.get(3));
		TypeOptionParam p4 = ((TypeOptionParam) params.get(4));
		TextLiteralParam p5 = ((TextLiteralParam) params.get(5));
//		ComparisonOptionParam p6 = ((ComparisonOptionParam) params.get(6));
		TypeOptionParam p7 = ((TypeOptionParam) params.get(7));
		TextLiteralParam p8 = ((TextLiteralParam) params.get(8));
//		ComparisonOptionParam p9 = ((ComparisonOptionParam) params.get(9));
		TypeOptionParam p10 = ((TypeOptionParam) params.get(10));
//		ComparisonOptionParam p11 = ((ComparisonOptionParam) params.get(11));
		TypeOptionParam p12 = ((TypeOptionParam) params.get(12));
//		ComparisonOptionParam p13 = ((ComparisonOptionParam) params.get(13));
		TypeOptionParam p14 = ((TypeOptionParam) params.get(14));
		TextLiteralParam p15 = ((TextLiteralParam) params.get(15));
//		ComparisonOptionParam p16 = ((ComparisonOptionParam) params.get(16));
		TypeOptionParam p17 = ((TypeOptionParam) params.get(17));
//		ComparisonOptionParam p18 = ((ComparisonOptionParam) params.get(18));
		TypeOptionParam p19 = ((TypeOptionParam) params.get(19));
//		ComparisonOptionParam p20 = ((ComparisonOptionParam) params.get(20));
		TypeOptionParam p21 = ((TypeOptionParam) params.get(21));
		TextLiteralParam p22 = ((TextLiteralParam) params.get(22));
//		ComparisonOptionParam p23 = ((ComparisonOptionParam) params.get(23));
		TypeOptionParam p24 = ((TypeOptionParam) params.get(24));
//		ComparisonOptionParam p25 = ((ComparisonOptionParam) params.get(25));
		TypeOptionParam p26 = ((TypeOptionParam) params.get(26));
//		ComparisonOptionParam p27 = ((ComparisonOptionParam) params.get(27));
		TypeOptionParam p28 = ((TypeOptionParam) params.get(28));
		XmlPathParam p29 = ((XmlPathParam) params.get(29));
		XmlPathParam p30 = ((XmlPathParam) params.get(30));
		XmlPathParam p31 = ((XmlPathParam) params.get(31));
		XmlPathParam p32 = ((XmlPathParam) params.get(32));
//		XmlPathParam p33 = ((XmlPathParam) params.get(33));
//		XmlPathParam p34 = ((XmlPathParam) params.get(34));
		XmlPathParam p35 = ((XmlPathParam) params.get(35));
		XmlPathParam p36 = ((XmlPathParam) params.get(36));
		XmlPathParam p37 = ((XmlPathParam) params.get(37));
		XmlPathParam p38 = ((XmlPathParam) params.get(38));
//		XmlPathParam p39 = ((XmlPathParam) params.get(39));
//		XmlPathParam p40 = ((XmlPathParam) params.get(40));
		XmlPathParam p41 = ((XmlPathParam) params.get(41));
		XmlPathParam p42 = ((XmlPathParam) params.get(42));
		XmlPathParam p43 = ((XmlPathParam) params.get(43));
		XmlPathParam p44 = ((XmlPathParam) params.get(44));
//		XmlPathParam p45 = ((XmlPathParam) params.get(45));
//		XmlPathParam p46 = ((XmlPathParam) params.get(46));
		XmlPathParam p47 = ((XmlPathParam) params.get(47));
		XmlPathParam p48 = ((XmlPathParam) params.get(48));
		XmlPathParam p49 = ((XmlPathParam) params.get(49));
		XmlPathParam p50 = ((XmlPathParam) params.get(50));
		
//		p1.setValue(1.);
		p2.setValue("wer");
		p4.setValue(ReturnType.STRING);
		p5.setValue("wer");
		p7.setValue(ReturnType.STRING);
		p8.setValue("3560");
		p10.setValue(ReturnType.STRING);
		p12.setValue(ReturnType.STRING);
		p14.setValue(ReturnType.STRING);
		p15.setValue("3580");
		p17.setValue(ReturnType.STRING);
		p19.setValue(ReturnType.STRING);
		p21.setValue(ReturnType.STRING);
		p22.setValue("3680");
		p24.setValue(ReturnType.STRING);
		p26.setValue(ReturnType.STRING);
		p28.setValue(ReturnType.STRING);
		
		p30.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p32.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
			
		XmlPathParam[] paths = new XmlPathParam[] {p29, p31, p35, p36, p41, p42, p47, p48};
		for (XmlPathParam p : paths) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Type");			
		}
		
		XmlPathParam[] paths2 = new XmlPathParam[] {p37, p38, p43, p44, p49, p50};
		for (XmlPathParam p : paths2) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Value");			
		}
		
		return completePattern;
	}

	static CompletePattern getAppdup3MidasAPS() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAppdup3Abstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();

//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
		XmlPathParam p6 = ((XmlPathParam) params.get(6));
		XmlPathParam p7 = ((XmlPathParam) params.get(7));
		XmlPathParam p8 = ((XmlPathParam) params.get(8));
		XmlPathParam p9 = ((XmlPathParam) params.get(9));
		p2.setXmlAxis(XmlAxisKind.DESCENDANT, "wer");
		p3.setXmlAxis(XmlAxisKind.DESCENDANT, "wer");
		p4.setXmlAxis(XmlAxisKind.CHILD, "3560");
		p5.setXmlAxis(XmlAxisKind.CHILD, "3560");
		p6.setXmlAxis(XmlAxisKind.CHILD, "3580");
		p7.setXmlAxis(XmlAxisKind.CHILD, "3580");
		p8.setXmlAxis(XmlAxisKind.CHILD, "3680");
		p9.setXmlAxis(XmlAxisKind.CHILD, "3680");
		
		return completePattern;
	}
}

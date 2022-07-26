package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.evaluation.EvalAppdup;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalAppdupl {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getAppdup3Midas());
		Test00.test(completePatterns);
	}
	
	static CompletePattern getAppdup3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalAppdup.getAppDup3GenericComps();
		completePattern.createXmlAdaption();
		return completePattern;		
	}
	
	static CompletePattern getAppdup3Midas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAppdup3Abstract();
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		
//		ComparisonOptionParamImpl p0 = ((ComparisonOptionParamImpl) params.get(0));
		NumberParamImpl p1 = ((NumberParamImpl) params.get(1));
		TextLiteralParamImpl p2 = ((TextLiteralParamImpl) params.get(2));
//		ComparisonOptionParamImpl p3 = ((ComparisonOptionParamImpl) params.get(3));
		TypeOptionParamImpl p4 = ((TypeOptionParamImpl) params.get(4));
		TextLiteralParamImpl p5 = ((TextLiteralParamImpl) params.get(5));
//		ComparisonOptionParamImpl p6 = ((ComparisonOptionParamImpl) params.get(6));
		TypeOptionParamImpl p7 = ((TypeOptionParamImpl) params.get(7));
		TextLiteralParamImpl p8 = ((TextLiteralParamImpl) params.get(8));
//		ComparisonOptionParamImpl p9 = ((ComparisonOptionParamImpl) params.get(9));
		TypeOptionParamImpl p10 = ((TypeOptionParamImpl) params.get(10));
//		ComparisonOptionParamImpl p11 = ((ComparisonOptionParamImpl) params.get(11));
		TypeOptionParamImpl p12 = ((TypeOptionParamImpl) params.get(12));
//		ComparisonOptionParamImpl p13 = ((ComparisonOptionParamImpl) params.get(13));
		TypeOptionParamImpl p14 = ((TypeOptionParamImpl) params.get(14));
		TextLiteralParamImpl p15 = ((TextLiteralParamImpl) params.get(15));
//		ComparisonOptionParamImpl p16 = ((ComparisonOptionParamImpl) params.get(16));
		TypeOptionParamImpl p17 = ((TypeOptionParamImpl) params.get(17));
//		ComparisonOptionParamImpl p18 = ((ComparisonOptionParamImpl) params.get(18));
		TypeOptionParamImpl p19 = ((TypeOptionParamImpl) params.get(19));
//		ComparisonOptionParamImpl p20 = ((ComparisonOptionParamImpl) params.get(20));
		TypeOptionParamImpl p21 = ((TypeOptionParamImpl) params.get(21));
		TextLiteralParamImpl p22 = ((TextLiteralParamImpl) params.get(22));
//		ComparisonOptionParamImpl p23 = ((ComparisonOptionParamImpl) params.get(23));
		TypeOptionParamImpl p24 = ((TypeOptionParamImpl) params.get(24));
//		ComparisonOptionParamImpl p25 = ((ComparisonOptionParamImpl) params.get(25));
		TypeOptionParamImpl p26 = ((TypeOptionParamImpl) params.get(26));
//		ComparisonOptionParamImpl p27 = ((ComparisonOptionParamImpl) params.get(27));
		TypeOptionParamImpl p28 = ((TypeOptionParamImpl) params.get(28));
		XmlPathParamImpl p29 = ((XmlPathParamImpl) params.get(29));
		XmlPathParamImpl p30 = ((XmlPathParamImpl) params.get(30));
		XmlPathParamImpl p31 = ((XmlPathParamImpl) params.get(31));
		XmlPathParamImpl p32 = ((XmlPathParamImpl) params.get(32));
//		XmlPathParamImpl p33 = ((XmlPathParamImpl) params.get(33));
//		XmlPathParamImpl p34 = ((XmlPathParamImpl) params.get(34));
		XmlPathParamImpl p35 = ((XmlPathParamImpl) params.get(35));
		XmlPathParamImpl p36 = ((XmlPathParamImpl) params.get(36));
		XmlPathParamImpl p37 = ((XmlPathParamImpl) params.get(37));
		XmlPathParamImpl p38 = ((XmlPathParamImpl) params.get(38));
//		XmlPathParamImpl p39 = ((XmlPathParamImpl) params.get(39));
//		XmlPathParamImpl p40 = ((XmlPathParamImpl) params.get(40));
		XmlPathParamImpl p41 = ((XmlPathParamImpl) params.get(41));
		XmlPathParamImpl p42 = ((XmlPathParamImpl) params.get(42));
		XmlPathParamImpl p43 = ((XmlPathParamImpl) params.get(43));
		XmlPathParamImpl p44 = ((XmlPathParamImpl) params.get(44));
//		XmlPathParamImpl p45 = ((XmlPathParamImpl) params.get(45));
//		XmlPathParamImpl p46 = ((XmlPathParamImpl) params.get(46));
		XmlPathParamImpl p47 = ((XmlPathParamImpl) params.get(47));
		XmlPathParamImpl p48 = ((XmlPathParamImpl) params.get(48));
		XmlPathParamImpl p49 = ((XmlPathParamImpl) params.get(49));
		XmlPathParamImpl p50 = ((XmlPathParamImpl) params.get(50));
		
		p1.setValue(1.);
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
			
		XmlPathParamImpl[] paths = new XmlPathParamImpl[] {p29, p31, p35, p36, p41, p42, p47, p48};
		for (XmlPathParamImpl p : paths) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Type");			
		}
		
		XmlPathParamImpl[] paths2 = new XmlPathParamImpl[] {p37, p38, p43, p44, p49, p50};
		for (XmlPathParamImpl p : paths2) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Value");			
		}
		
		return completePattern;
	}
	
}

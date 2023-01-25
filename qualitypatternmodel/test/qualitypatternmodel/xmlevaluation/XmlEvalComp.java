package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.evaluationquality.EvalComp;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalComp {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompAbstract());
		completePatterns.add(getCompCondAbstract());
		completePatterns.add(getCompMidas());
		completePatterns.add(getCompApsMidas());
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);
	}
		
	public static CompletePattern getCompCondAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalComp.getCompCondGeneric();
		completePattern.createXmlAdaption();
		return completePattern;		
	}
	
	public static CompletePattern getCompAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalComp.getCompGeneric();
		completePattern.createXmlAdaption();
		return completePattern;		
	}
	
	public static CompletePattern getCompMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCompCondAbstract();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		
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

		p0.replace(new TextLiteralParamImpl("kue"));
		p3.replace(new TextLiteralParamImpl("3100"));
		p6.replace(new TextLiteralParamImpl("3105"));
		
		p12.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p13.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD,});
		p15.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD,});

		XmlPathParam[] paths = new XmlPathParam[] {p11, p14, p17};
		for (XmlPathParam p : paths) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Type");	
		}
		
		XmlPathParam[] paths2 = new XmlPathParam[] {p16, p18};
		for (XmlPathParam p : paths2) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Value");	
		}
		
		return completePattern;
	}
	
	public static CompletePattern getCompApsMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCompAbstract();
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));

		p1.setValue(ReturnType.STRING);
		p2.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "kue");
		p3.setXmlAxis(XmlAxisKind.CHILD, "a3100");
		p4.setXmlAxis(XmlAxisKind.CHILD, "a3105");
		
		return completePattern;
	}
}

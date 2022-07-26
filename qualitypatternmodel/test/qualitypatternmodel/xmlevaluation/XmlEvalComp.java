package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.evaluation.EvalComp;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalComp {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompAbstract());
		completePatterns.add(getCompMidas());
//		Test00.getQueries(completePatterns);
		Test00.test(completePatterns);
	}
		
	public static CompletePattern getCompAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalComp.getCompCondGeneric();
		completePattern.createXmlAdaption();
		return completePattern;		
	}
	
	public static CompletePattern getCompMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCompAbstract();
		
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
		XmlPathParamImpl p11 = ((XmlPathParamImpl) params.get(11));
		XmlPathParamImpl p12 = ((XmlPathParamImpl) params.get(12));
		XmlPathParamImpl p13 = ((XmlPathParamImpl) params.get(13));
		XmlPathParamImpl p14 = ((XmlPathParamImpl) params.get(14));
		XmlPathParamImpl p15 = ((XmlPathParamImpl) params.get(15));
		XmlPathParamImpl p16 = ((XmlPathParamImpl) params.get(16));
		XmlPathParamImpl p17 = ((XmlPathParamImpl) params.get(17));
		XmlPathParamImpl p18 = ((XmlPathParamImpl) params.get(18));

		p0.replace(new TextLiteralParamImpl("kue"));
		p3.replace(new TextLiteralParamImpl("3100"));
		p6.replace(new TextLiteralParamImpl("3105"));
		
		p12.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p13.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD,});
		p15.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD,});

		XmlPathParamImpl[] paths = new XmlPathParamImpl[] {p11, p14, p17};
		for (XmlPathParamImpl p : paths) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Type");	
		}
		
		XmlPathParamImpl[] paths2 = new XmlPathParamImpl[] {p16, p18};
		for (XmlPathParamImpl p : paths2) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Value");	
		}
		
		return completePattern;
	}
}

package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.evaluation.EvalMandstruc;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalMandstruc {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandstruc3Abstract());
		completePatterns.add(getMandstruc3Midas());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);		
	}
	
	public static CompletePattern getMandstruc3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandstruc.getMandstruc3CondGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getMandstruc3Midas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMandstruc3Abstract();
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
		XmlPathParam p9 = ((XmlPathParam) params.get(9));
		XmlPathParam p10 = ((XmlPathParam) params.get(10));
		XmlPathParam p11 = ((XmlPathParam) params.get(11));
		XmlPathParam p12 = ((XmlPathParam) params.get(12));
		XmlPathParam p13 = ((XmlPathParam) params.get(13));
		XmlPathParam p14 = ((XmlPathParam) params.get(14));
		
		p0.setValue("obj");
		p3.setValue("ob30");
		p6.setValue("3100");
		
		p9.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p9.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p12.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p12.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p14.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p14.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		
		p10.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p11.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p13.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});

		return completePattern;
	}
}

package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.evaluation.EvalExDup;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalExdupl {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getExactDuplicatesMidasWer());
		completePatterns.add(getExactDuplicatesLido());
//		completePatterns.add(getExactDuplicatesTwoElementLido());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);	
	}
	
	public static CompletePattern getExactDuplicatesAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalExDup.getExactDuplicatesGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getExactDuplicatesMidasWer() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		
		CompletePattern completePattern = getExactDuplicatesAbstract();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
//		ComparisonOptionParam p3 = ((ComparisonOptionParam) params.get(3));
		NumberParam p4 = ((NumberParam) params.get(4));
		UntypedParameterValue p5 = ((UntypedParameterValue) params.get(5));
//		ComparisonOptionParam p6 = ((ComparisonOptionParam) params.get(6));
//		TypeOptionParam p7 = ((TypeOptionParam) params.get(7));
//		ComparisonOptionParam p8 = ((ComparisonOptionParam) params.get(8));
//		TypeOptionParam p9 = ((TypeOptionParam) params.get(9));
		XmlPathParam p10 = ((XmlPathParam) params.get(10));
		XmlPathParam p11 = ((XmlPathParam) params.get(11));
		XmlPathParam p12 = ((XmlPathParam) params.get(12));
		XmlPathParam p13 = ((XmlPathParam) params.get(13));
		
		p0.setValue("wer");
		p4.setValue(1.0);
		p5.setValue("wer");
		p10.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p10.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p11.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p12.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p12.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p13.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		
		return completePattern;
	}
	
	public static CompletePattern getExactDuplicatesLido() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		// not used for evaluation anymore
		
		CompletePattern completePattern = getExactDuplicatesAbstract();

		EList<Parameter> params = completePattern.getParameterList().getParameters();
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
//		ComparisonOptionParam p3 = ((ComparisonOptionParam) params.get(3));
		NumberParam p4 = ((NumberParam) params.get(4));
		UntypedParameterValue p5 = ((UntypedParameterValue) params.get(5));
//		ComparisonOptionParam p6 = ((ComparisonOptionParam) params.get(6));
//		TypeOptionParam p7 = ((TypeOptionParam) params.get(7));
//		ComparisonOptionParam p8 = ((ComparisonOptionParam) params.get(8));
//		TypeOptionParam p9 = ((TypeOptionParam) params.get(9));
		XmlPathParam p10 = ((XmlPathParam) params.get(10));
		XmlPathParam p11 = ((XmlPathParam) params.get(11));
		XmlPathParam p12 = ((XmlPathParam) params.get(12));
		XmlPathParam p13 = ((XmlPathParam) params.get(13));

		p0.setValue("lido:lido");
		p4.setValue(1.0);
		p5.setValue("lido:lido");
		p10.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p11.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p12.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p13.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD});
				
		return completePattern;
	}

}

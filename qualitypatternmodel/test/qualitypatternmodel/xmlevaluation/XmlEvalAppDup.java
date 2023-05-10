package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
//import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.evaluation.EvalAppDup;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
//import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.Parameter;
//import qualitypatternmodel.parameters.TextLiteralParam;
//import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalAppDup {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getAppdup3Midas());
		completePatterns.add(getAppdup3MidasAPS());

//		Test00.test(completePatterns);
		Test00.getQueries(completePatterns);
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
		CompletePattern completePattern = getAppdup3Abstract();
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		
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

		p2.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "wer");
		p3.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "wer");
		p4.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Value", "3560");
		p5.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Value", "3560");
		p6.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Value", "3580");
		p7.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Value", "3580");
		p8.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Value", "3680");
		p9.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Value", "3680");
		
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

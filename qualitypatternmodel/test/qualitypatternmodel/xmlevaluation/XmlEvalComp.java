package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

//import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.evaluationquality.EvalComp;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.utility.PatternUtility;

public class XmlEvalComp {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getCompAbstract());
		completePatterns.add(getCompHidaMidas());
		completePatterns.add(getCompApsMidas());

		PatternUtility.getQueries(completePatterns, Language.XML);
//		Test00.test(completePatterns);
	}


	public static CompletePattern getCompAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalComp.getCompGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}

	public static CompletePattern getCompHidaMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCompAbstract();

		EList<Parameter> params = completePattern.getParameterList().getParameters();

//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));

		p1.setValue(ReturnType.STRING);
		p2.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "kue");
		p3.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "3100");
		p3.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p3.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p4.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "3105");
		p4.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p4.getXmlPropertyOptionParam().getAttributeName().setValue("Value");

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

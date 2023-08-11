package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.evaluationquality.EvalMandStruc;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalMandStruc {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandstrucAbstract());
		completePatterns.add(getMandstrucMidasAps());
		completePatterns.add(getMandstruc3Abstract());
		completePatterns.add(getMandstruc3MidasAps());
		completePatterns.add(getMandstruc3MidasHida());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);
	}
	
	public static CompletePattern getMandstrucAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandStruc.getMandstrucGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getMandstruc3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandStruc.getMandstruc3Generic();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getMandstrucMidasAps() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMandstrucAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		XmlPathParam p0 = ((XmlPathParam) params.get(0));
		XmlPathParam p1 = ((XmlPathParam) params.get(1));
		
//		p0.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "obj");
//		p1.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "aob30");
//		p1.addXmlAxis(XmlAxisKind.CHILD, "a3100");
		p0.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "obj");
		p0.addXmlAxis(XmlAxisKind.CHILD, "ob30");
		p1.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "a3100");

		return completePattern;
	}
	
	public static CompletePattern getMandstruc3MidasAps() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMandstruc3Abstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		XmlPathParam p0 = ((XmlPathParam) params.get(0));
		XmlPathParam p1 = ((XmlPathParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		
		p0.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "obj");
		p1.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "aob30");
		p2.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, "a3100");

		return completePattern;
	}
	
	public static CompletePattern getMandstruc3MidasHida() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMandstruc3Abstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();

		XmlPathParam p0 = ((XmlPathParam) params.get(0));
		XmlPathParam p1 = ((XmlPathParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));

		p0.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "obj");
		p1.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "ob30");
		p2.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "3100");

		return completePattern;
	}
}

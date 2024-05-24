package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.evaluationquality.EvalExNEx;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.XmlPatternUtility;

public class XmlEvalExNEx {
	// also called MANDSTRUC2
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getExNExMidas());
		completePatterns.add(getExNExMidasAps());
		completePatterns.add(getExNExLidoWorkTypeWithoutConcept());

		XmlPatternUtility.getQueries(completePatterns);
//		Test00.test(completePatterns);	
	}
	
	public static CompletePattern getExNExAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalExNEx.getExNExGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getExNEx2Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalExNEx.getExNEx2Generic();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	static CompletePattern getExNExMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getExNEx2Abstract();
		EList<Parameter> params = completePattern.getParameterList().getParameters();
				
		XmlPathParam p0 = ((XmlPathParam) params.get(0));
		XmlPathParam p1 = ((XmlPathParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		
		p0.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "obj");
		p1.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "ob30");
		p2.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, null, null, null);		
		
		return completePattern;
	}
	
	static CompletePattern getExNExMidasAps() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getExNEx2Abstract();
		EList<Parameter> params = completePattern.getParameterList().getParameters();
				
		XmlPathParam p0 = ((XmlPathParam) params.get(0));
		XmlPathParam p1 = ((XmlPathParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		
		p0.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "obj");
		p1.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "ob30");
		p2.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, null, null, null);		
		
		return completePattern;
	}
	
	static CompletePattern getExNExLidoWorkTypeWithoutConcept() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getExNEx2Abstract();
		EList<Parameter> params = completePattern.getParameterList().getParameters();
				
		XmlPathParam p0 = ((XmlPathParam) params.get(0));
		XmlPathParam p1 = ((XmlPathParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));

		p0.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "lido:lido");
		p1.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "lido:objectWorkType");
		p2.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "lido:conceptID");	
		
		return completePattern;
	}
}

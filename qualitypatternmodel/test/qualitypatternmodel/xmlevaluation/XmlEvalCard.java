package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
//import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.evaluation.EvalCard;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
//import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalCard {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCardMidasApsOb30());
		completePatterns.add(getCardMidasHidaOb30());
		completePatterns.add(getCardLidoActorName());

//		Test00.test(completePatterns);
		Test00.getQueries(completePatterns);
	}
	
	public static CompletePattern getCardAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalCard.getCardGeneric();
		completePattern.createXmlAdaption();		
		return completePattern;
	}

	public static CompletePattern getCardPlusAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalCard.getCardPlusGeneric();
		completePattern.createXmlAdaption();		
		return completePattern;
	}
	
	
	static CompletePattern getCardLidoActorName() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCardPlusAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		NumberParam p1 = ((NumberParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		
//		p1.setValue(1.0);
		
		for (int i = 0; i<5; i++)
			p2.addXmlAxis(XmlAxisKind.CHILD, null);
		p2.addXmlAxis(XmlAxisKind.CHILD, "lido:nameActorSet");
		
		p3.setXmlAxis(XmlAxisKind.CHILD, null);
		p3.addXmlAxis(XmlAxisKind.CHILD, "lido:lido");
		
		p4.setXmlAxis(XmlAxisKind.CHILD, "lido:appellationValue");
		
		return completePattern;
	}
	
	private static CompletePattern getCardMidasApsOb30() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCardPlusAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
		NumberParam p1 = ((NumberParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		
		p1.setValue(1.0);
		p2.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "obj");
		p3.setXmlAxis(XmlAxisKind.CHILD, "aob30");
		p4.setXmlAxis(XmlAxisKind.CHILD, "aob30rl");
		
		return completePattern;
	}
	
	public static CompletePattern getCardMidasHidaOb30() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCardPlusAbstract();
		
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		NumberParam p1 = ((NumberParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		
		p2.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "obj");
		p3.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "ob30");
		p4.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "ob30rl");
		
		return completePattern;		
	}
}

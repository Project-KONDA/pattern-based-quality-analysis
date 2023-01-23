package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.cyphertranslationtests.EvalCard;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalCard {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getCard3Abstract());
		completePatterns.add(getCardAbstractMidas());
		completePatterns.add(getCardMidasApsOb30());
		completePatterns.add(getCardMidasOb30());
		completePatterns.add(getCardLidoActorName());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);		
	}

	public static CompletePattern getCard2PlusAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalCard.getCard2PlusGeneric();
		completePattern.createXmlAdaption();		
		return completePattern;
	}
	
	public static CompletePattern getCardAbstractMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern =  EvalCard.getCard2CondPlusGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getCard2CondPlusAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern =  EvalCard.getCard2CondPlusGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
		
	static CompletePattern getCardLidoActorName() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCard2PlusAbstract();
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
		CompletePattern completePattern = getCard2PlusAbstract();
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
	
	public static CompletePattern getCardMidasOb30() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCard2CondPlusAbstract();
		
		List<Parameter> params = completePattern.getParameterList().getParameters();

		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
//		ComparisonOptionParam p3 = ((ComparisonOptionParam) params.get(3));
		NumberParam p4 = ((NumberParam) params.get(4));
		UntypedParameterValue p5 = ((UntypedParameterValue) params.get(5));
//		ComparisonOptionParam p6 = ((ComparisonOptionParam) params.get(6));
//		TypeOptionParam p7 = ((TypeOptionParam) params.get(7));
		UntypedParameterValue p8 = ((UntypedParameterValue) params.get(8));
//		ComparisonOptionParam p9 = ((ComparisonOptionParam) params.get(9));
//		TypeOptionParam p10 = ((TypeOptionParam) params.get(10));
		XmlPathParam p11 = ((XmlPathParam) params.get(11));
		XmlPathParam p12 = ((XmlPathParam) params.get(12));
		XmlPathParam p13 = ((XmlPathParam) params.get(13));
		XmlPathParam p14 = ((XmlPathParam) params.get(14));
		XmlPathParam p15 = ((XmlPathParam) params.get(15));

		p0.setValue("obj");
		p4.setValue(1.);
		p5.setValue("ob30");
		p8.setValue("ob30rl");
		
		p12.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p13.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p15.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		
		XmlPathParam[] paths = new XmlPathParam[] {p11, p14, p15};
		for (XmlPathParam p : paths) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Type");			
		}

		return completePattern;		
	}
	
}

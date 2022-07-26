package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.evaluation.EvalCard;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalCard {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCardAbstractThreeElements());
		completePatterns.add(getCardAbstractMidas());
		completePatterns.add(getCardMidasOb30());
		completePatterns.add(getCardLidoActorName());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);		
	}
	
	public static CompletePattern getCardAbstractThreeElements() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalCard.getCard3Generic();
		completePattern.createXmlAdaption();		
		return completePattern;
	}

	private static CompletePattern getCardThreeElementsLidoConcrete(XmlAxisKind[] returnRelation, String returnElementName, 
			XmlAxisKind[] returnToE1Rel, String e1Name, XmlAxisKind[] e1ToE2Rel, String e2Name) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCardAbstractThreeElements();
		EList<Parameter> params = completePattern.getParameterList().getParameters();

		((UntypedParameterValue)params.get(0)).setValue(returnElementName);
		((UntypedParameterValue)params.get(3)).setValue(e1Name);
		((UntypedParameterValue)params.get(8)).setValue(e2Name);
		((XmlPathParam)params.get(12)).setXmlAxis(returnRelation);
		((XmlPathParam)params.get(13)).setXmlAxis(returnToE1Rel);
		((XmlPathParam)params.get(15)).setXmlAxis(e1ToE2Rel);
		
		((XmlPathParam)params.get(11)).getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		((XmlPathParam)params.get(14)).getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		((XmlPathParam)params.get(16)).getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		
		
		return completePattern;
	}
		
	public static CompletePattern getCardAbstractMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern =  EvalCard.getCardGenericMidas();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getCardMidasOb30() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = getCardAbstractMidas();
		
		List<Parameter> params = pattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
//		ComparisonOptionParam p3 = ((ComparisonOptionParam) params.get(3));
//		NumberParam p4 = ((NumberParam) params.get(4));
		UntypedParameterValue p5 = ((UntypedParameterValue) params.get(5));
//		ComparisonOptionParam p6 = ((ComparisonOptionParam) params.get(6));
//		TypeOptionParam p7 = ((TypeOptionParam) params.get(7));
		UntypedParameterValue p8 = ((UntypedParameterValue) params.get(8));
//		ComparisonOptionParam p9 = ((ComparisonOptionParam) params.get(9));
//		TypeOptionParam p10 = ((TypeOptionParam) params.get(10));
		UntypedParameterValue p11 = ((UntypedParameterValue) params.get(11));
//		ComparisonOptionParam p12 = ((ComparisonOptionParam) params.get(12));
//		TypeOptionParam p13 = ((TypeOptionParam) params.get(13));
		UntypedParameterValue p14 = ((UntypedParameterValue) params.get(14));
//		ComparisonOptionParam p15 = ((ComparisonOptionParam) params.get(15));
//		TypeOptionParam p16 = ((TypeOptionParam) params.get(16));
		XmlPathParam p17 = ((XmlPathParam) params.get(17));
		XmlPathParam p18 = ((XmlPathParam) params.get(18));
		XmlPathParam p19 = ((XmlPathParam) params.get(19));
		XmlPathParam p20 = ((XmlPathParam) params.get(20));
		XmlPathParam p21 = ((XmlPathParam) params.get(21));
		XmlPathParam p22 = ((XmlPathParam) params.get(22));
		XmlPathParam p23 = ((XmlPathParam) params.get(23));
		XmlPathParam p24 = ((XmlPathParam) params.get(24));
		XmlPathParam p25 = ((XmlPathParam) params.get(25));

		p0.setValue("obj");
		p5.setValue("h1:Block");
		p8.setValue("ob30");
		p11.setValue("Herstellung");
		p14.setValue("ob30rl");
		
		p18.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p19.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.DESCENDANT_OR_SELF});
		p21.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p24.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		
		XmlPathParam[] paths = new XmlPathParam[] {p17, p20, p22, p25};
		for (XmlPathParam p : paths) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Type");			
		}

		XmlPathParam[] paths2 = new XmlPathParam[] {p23};
		for (XmlPathParam p : paths2) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Value");			
		}
		return pattern;		
	}
	
	public static CompletePattern getCardLidoActorName() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		return getCardThreeElementsLidoConcrete(
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				"lido:lido", 
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				"lido:nameActorSet", 
				new XmlAxisKind[] {XmlAxisKind.CHILD}, 
				"lido:appellationValue");
	}
}

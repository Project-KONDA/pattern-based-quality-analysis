package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.evaluation.EvalCard;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
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
		CompletePattern completePattern = EvalCard.getCardGenericThreeElements();
		completePattern.createXmlAdaption();		
		return completePattern;
	}

	private static CompletePattern getCardThreeElementsLidoConcrete(XmlAxisKind[] returnRelation, String returnElementName, 
			XmlAxisKind[] returnToE1Rel, String e1Name, XmlAxisKind[] e1ToE2Rel, String e2Name) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCardAbstractThreeElements();
		EList<Parameter> params = completePattern.getParameterList().getParameters();

		((UntypedParameterValueImpl)params.get(0)).replace(new TextLiteralParamImpl(returnElementName));
		((UntypedParameterValueImpl)params.get(3)).replace(new TextLiteralParamImpl(e1Name));
		((UntypedParameterValueImpl)params.get(8)).replace(new TextLiteralParamImpl(e2Name));
		((XmlPathParamImpl)params.get(12)).setXmlAxis(returnRelation);
		((XmlPathParamImpl)params.get(13)).setXmlAxis(returnToE1Rel);
		((XmlPathParamImpl)params.get(15)).setXmlAxis(e1ToE2Rel);
		
		((XmlPathParamImpl)params.get(11)).getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		((XmlPathParamImpl)params.get(14)).getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		((XmlPathParamImpl)params.get(16)).getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		
		
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
		
		UntypedParameterValueImpl p0 = ((UntypedParameterValueImpl) params.get(0));
//		ComparisonOptionParamImpl p1 = ((ComparisonOptionParamImpl) params.get(1));
//		TypeOptionParamImpl p2 = ((TypeOptionParamImpl) params.get(2));
//		ComparisonOptionParamImpl p3 = ((ComparisonOptionParamImpl) params.get(3));
//		NumberParamImpl p4 = ((NumberParamImpl) params.get(4));
		UntypedParameterValueImpl p5 = ((UntypedParameterValueImpl) params.get(5));
//		ComparisonOptionParamImpl p6 = ((ComparisonOptionParamImpl) params.get(6));
//		TypeOptionParamImpl p7 = ((TypeOptionParamImpl) params.get(7));
		UntypedParameterValueImpl p8 = ((UntypedParameterValueImpl) params.get(8));
//		ComparisonOptionParamImpl p9 = ((ComparisonOptionParamImpl) params.get(9));
//		TypeOptionParamImpl p10 = ((TypeOptionParamImpl) params.get(10));
		UntypedParameterValueImpl p11 = ((UntypedParameterValueImpl) params.get(11));
//		ComparisonOptionParamImpl p12 = ((ComparisonOptionParamImpl) params.get(12));
//		TypeOptionParamImpl p13 = ((TypeOptionParamImpl) params.get(13));
		UntypedParameterValueImpl p14 = ((UntypedParameterValueImpl) params.get(14));
//		ComparisonOptionParamImpl p15 = ((ComparisonOptionParamImpl) params.get(15));
//		TypeOptionParamImpl p16 = ((TypeOptionParamImpl) params.get(16));
		XmlPathParamImpl p17 = ((XmlPathParamImpl) params.get(17));
		XmlPathParamImpl p18 = ((XmlPathParamImpl) params.get(18));
		XmlPathParamImpl p19 = ((XmlPathParamImpl) params.get(19));
		XmlPathParamImpl p20 = ((XmlPathParamImpl) params.get(20));
		XmlPathParamImpl p21 = ((XmlPathParamImpl) params.get(21));
		XmlPathParamImpl p22 = ((XmlPathParamImpl) params.get(22));
		XmlPathParamImpl p23 = ((XmlPathParamImpl) params.get(23));
		XmlPathParamImpl p24 = ((XmlPathParamImpl) params.get(24));
		XmlPathParamImpl p25 = ((XmlPathParamImpl) params.get(25));

		p0.replace(new TextLiteralParamImpl("obj"));
		p5.replace(new TextLiteralParamImpl("h1:Block"));
		p8.replace(new TextLiteralParamImpl("ob30"));
		p11.replace(new TextLiteralParamImpl("Herstellung"));
		p14.replace(new TextLiteralParamImpl("ob30rl"));
		
		p18.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p19.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.DESCENDANT_OR_SELF});
		p21.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p24.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		
		XmlPathParamImpl[] paths = new XmlPathParamImpl[] {p17, p20, p22, p25};
		for (XmlPathParamImpl p : paths) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Type");			
		}

		XmlPathParamImpl[] paths2 = new XmlPathParamImpl[] {p23};
		for (XmlPathParamImpl p : paths2) {
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

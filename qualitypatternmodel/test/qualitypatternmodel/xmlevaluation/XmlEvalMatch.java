package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.cyphertranslationtests.EvalMatch;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalMatch {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMatchCondAbstract());
		completePatterns.add(getMatchMidas5360());
		completePatterns.add(getMatchMidas5064());
		completePatterns.add(getMatchMidas3270());
		completePatterns.add(getMatchMidas3270Imprecise());
		completePatterns.add(getMatchMidas3100Abbreviation());
		completePatterns.add(getMatchMidas5060());
		
		completePatterns.add(getMatchLidoMeasurementValue());
		completePatterns.add(getMatchLidoMeasurementUnit());
		completePatterns.add(getMatchLidoEarliestDate());
		completePatterns.add(getMatchLidoNamePlaceSet());
		completePatterns.add(getMatchLidoAppellationValue());
//		
		completePatterns.add(getMatchMidasOb30Child());
				
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);
	}

	public static CompletePattern getMatchAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMatch.getMatchGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}

	public static CompletePattern getMatchCondAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMatch.getMatchCondGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}

	public static CompletePattern getMatch3CondAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMatch.getMatch3CondGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}

	public static CompletePattern getMatchConcrete(String returnElementType, XmlAxisKind[] returnElementAxis, String element2Type, XmlAxisKind[] element2Axis, String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMatchAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
//		BooleanParam p0 = ((BooleanParam) params.get(0));
		TextLiteralParam p1 = ((TextLiteralParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		
		p1.setValue(regex);
		p2.setXmlAxis(returnElementAxis, returnElementType);
		p3.setXmlAxis(element2Axis, element2Type);
		
		return completePattern;
	}
	
	public static CompletePattern getMatchCondConcrete(String returnElementType, XmlAxisKind[] returnElementAxis,
			String attribute1Name, XmlPropertyKind attribute1Kind, String element2Type, XmlAxisKind[] element2Axis,
			String attribute2Name, XmlPropertyKind attribute2Kind, String attribute3Name, XmlPropertyKind attribute3Kind,
			String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMatchCondAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		UntypedParameterValue p3 = ((UntypedParameterValue) params.get(3));
//		ComparisonOptionParam p4 = ((ComparisonOptionParam) params.get(4));
//		TypeOptionParam p5 = ((TypeOptionParam) params.get(5));
		BooleanParam p6 = ((BooleanParam) params.get(6));
		TextLiteralParam p7 = ((TextLiteralParam) params.get(7));
		XmlPathParam p8 = ((XmlPathParam) params.get(8));
		XmlPathParam p9 = ((XmlPathParam) params.get(9));
		XmlPathParam p10 = ((XmlPathParam) params.get(10));
		XmlPathParam p11 = ((XmlPathParam) params.get(11));
		XmlPathParam p12 = ((XmlPathParam) params.get(12));

		p0.setValue(returnElementType);
		p3.setValue(element2Type);
		p6.setValue(true);
		p7.setValue(regex);
		
		p9.setXmlAxis(returnElementAxis);
		p10.setXmlAxis(element2Axis);
		
		p8.getXmlPropertyOptionParam().setValue(attribute1Kind);
		if (attribute1Kind == XmlPropertyKind.ATTRIBUTE)
			p8.getXmlPropertyOptionParam().getAttributeName().setValue(attribute1Name);
		p11.getXmlPropertyOptionParam().setValue(attribute2Kind);
		if (attribute2Kind == XmlPropertyKind.ATTRIBUTE)
			p11.getXmlPropertyOptionParam().getAttributeName().setValue(attribute2Name);
		p12.getXmlPropertyOptionParam().setValue(attribute3Kind);
		if (attribute3Kind == XmlPropertyKind.ATTRIBUTE)
			p12.getXmlPropertyOptionParam().getAttributeName().setValue(attribute3Name);
		
		return completePattern;
	}
	
	public static CompletePattern getMatch3Concrete(String returnElementType,
			XmlAxisKind[] returnElementAxis, String attribute1Name, XmlPropertyKind attribute1Kind, 
			String element2Type, XmlAxisKind[] element2Axis, String attribute2Name, XmlPropertyKind attribute2Kind, 
			XmlAxisKind[] element3Axis, String attributeMatchName, XmlPropertyKind attributeMatchKind, String regex) 
					throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = getMatch3CondAbstract();
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
		BooleanParam p9 = ((BooleanParam) params.get(9));
		TextLiteralParam p10 = ((TextLiteralParam) params.get(10));
		XmlPathParam p11 = ((XmlPathParam) params.get(11));
		XmlPathParam p12 = ((XmlPathParam) params.get(12));
		XmlPathParam p13 = ((XmlPathParam) params.get(13));
		XmlPathParam p14 = ((XmlPathParam) params.get(14));
		XmlPathParam p15 = ((XmlPathParam) params.get(15));
		XmlPathParam p16 = ((XmlPathParam) params.get(16));
		XmlPathParam p17 = ((XmlPathParam) params.get(17));
		
		p0.setValue(returnElementType);
		p3.setValue(element2Type);
		p6.setValue(element2Type);
		p9.setValue(true);
		p10.setValue(regex);

		p11.getXmlPropertyOptionParam().setValue(attribute1Kind);
		if (attribute1Kind == XmlPropertyKind.ATTRIBUTE)
			p11.getXmlPropertyOptionParam().getAttributeName().setValue(attribute1Name);
		p14.getXmlPropertyOptionParam().setValue(attribute2Kind);
		if (attribute2Kind == XmlPropertyKind.ATTRIBUTE)
			p14.getXmlPropertyOptionParam().getAttributeName().setValue(attribute2Name);
		p16.getXmlPropertyOptionParam().setValue(attributeMatchKind);
		if (attributeMatchKind == XmlPropertyKind.ATTRIBUTE)
			p16.getXmlPropertyOptionParam().getAttributeName().setValue(attributeMatchName);		
		p17.getXmlPropertyOptionParam().setValue(attributeMatchKind);
		if (attributeMatchKind == XmlPropertyKind.ATTRIBUTE)
			p17.getXmlPropertyOptionParam().getAttributeName().setValue(attributeMatchName);

		p12.setXmlAxis(returnElementAxis);
		p13.setXmlAxis(element2Axis);
		p15.setXmlAxis(element3Axis);
		
		return completePattern;
	}
	
	public static CompletePattern getMatchMidas5064() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchCondConcrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "5064",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE,
				".*[a-zA-Z ]{10}.*");
	}

	public static CompletePattern getMatchMidas5360() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchCondConcrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "5360",
				new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE,
				"^[0-9]+(,[0-9]+)?( x [0-9]+(,[0-9]+)?)? (m|mm)( \\([a-zA-Z‰¸ˆƒ‹÷ ]+\\))?$");
	}

	public static CompletePattern getMatchMidas3270() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchCondConcrete("kue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "3270",
				new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, "\\?$");
	}

	public static CompletePattern getMatchMidas3270Imprecise() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchCondConcrete("kue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "3270",
				new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, "[0-9]/[0-9]");
	}

	public static CompletePattern getMatchMidas3100Abbreviation() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchCondConcrete("kue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "3100",
				new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, "\\.");
	}

	public static CompletePattern getMatchMidas5060() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchCondConcrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "5060",
				new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, "^[0-9/]+$");
	}

	public static CompletePattern getMatchMidasOb30Child() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatch3Concrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE,
				"ob30", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type",
				XmlPropertyKind.ATTRIBUTE, "^[12456789]");
	}

	public static CompletePattern getMatchLidoMeasurementValue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				"lido:measurementValue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				"[a-zA-Z¸ˆ‰‹÷ƒ]");
	}

	public static CompletePattern getMatchLidoMeasurementUnit() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				"lido:measurementUnit", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				"[0-9]");
	}

	public static CompletePattern getMatchLidoEarliestDate() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				"lido:earliestDate", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				"^[0-9]{4}$");
	}

	public static CompletePattern getMatchLidoNamePlaceSet() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete(
				"lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				"lido:namePlaceSet", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				",");
	}

	public static CompletePattern getMatchLidoAppellationValue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				"lido:appellationValue", new XmlAxisKind[] {XmlAxisKind.DESCENDANT}, "\\?$");
	}

}

package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.evaluationquality.EvalMatch;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalMatch {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
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
		completePatterns.add(getMatch3MidasOb30Child());
				
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);
	}

	public static CompletePattern getMatchAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMatch.getMatchGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}

	public static CompletePattern getMatch3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMatch.getMatch3Generic();
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
		
		CompletePattern completePattern = getMatchAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();

//		BooleanParam p0 = ((BooleanParam) params.get(0));
		TextLiteralParam p1 = ((TextLiteralParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		
		p1.setValue(regex);
		p2.specifyAxis(returnElementAxis, attribute1Kind, attribute1Name, returnElementType);
		p3.specifyAxis(element2Axis, attribute2Kind, attribute2Name, element2Type);
		p3.getXmlPropertyOptionParam().setValue(attribute3Kind);
		if (attribute3Kind == XmlPropertyKind.ATTRIBUTE)
			p3.getXmlPropertyOptionParam().getAttributeName().setValue(attribute3Name);
		
		return completePattern;
	}
	
	public static CompletePattern getMatch3Concrete(String returnElementType,
			XmlAxisKind[] returnElementAxis, String attribute1Name, XmlPropertyKind attribute1Kind, 
			String element2Type, XmlAxisKind[] element2Axis, String attribute2Name, XmlPropertyKind attribute2Kind, 
			XmlAxisKind[] element3Axis, String attributeMatchName, XmlPropertyKind attributeMatchKind, String regex) 
					throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = getMatch3Abstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
//		BooleanParam p0 = ((BooleanParam) params.get(0));
		TextLiteralParam p1 = ((TextLiteralParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));

		p1.setValue(regex);
		p2.specifyAxis(returnElementAxis, attribute1Kind, attribute1Name, returnElementType);
		p3.specifyAxis(element2Axis, attribute2Kind, attribute2Name, element2Type);
		p4.specifyAxis(element3Axis, null, null, null);
		p5.getXmlPropertyOptionParam().setValue(attributeMatchKind);
		if (attributeMatchKind == XmlPropertyKind.ATTRIBUTE)
			p5.getXmlPropertyOptionParam().getAttributeName().setValue(attributeMatchName);
				
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
				"^[0-9]+(,[0-9]+)?( x [0-9]+(,[0-9]+)?)? (m|mm)( \\([a-zA-Z������ ]+\\))?$");
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

	public static CompletePattern getMatch3MidasOb30Child() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatch3Concrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE,
				"ob30", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type",
				XmlPropertyKind.ATTRIBUTE, "^[12456789]");
	}

	public static CompletePattern getMatchLidoMeasurementValue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				"lido:measurementValue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				"[a-zA-Z������]");
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

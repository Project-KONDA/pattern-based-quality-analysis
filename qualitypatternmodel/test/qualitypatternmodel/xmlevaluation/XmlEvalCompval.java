package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.evaluation.EvalCompval;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalCompval {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompvalCondAbstract());
		completePatterns.add(getCompvalMidas5230Objekt());
		completePatterns.add(getCompvalMidas5230Objekt());
		completePatterns.add(getCompvalMidas5230Schloss());
		completePatterns.add(getCompvalMidas5230Print());
		completePatterns.add(getCompvalLidoEventPlace());
		
		completePatterns.add(getCompvalSetMidas3270());
		completePatterns.add(getCompsetMIDAS3140());
		completePatterns.add(getCompsetLidoGenderActor());
		
		completePatterns.add(getCompval3Abstract()); 
		completePatterns.add(getCompvalLidoObjectWorkTypeObjekt());
		completePatterns.add(getCompvalLidoObjectWorkTypeSchloss());
		completePatterns.add(getCompvalLidoObjectWorkTypePrint());
		completePatterns.add(getCompvalSetLidoAppellationValue());

//		Test00.getQueries(completePatterns);
		Test00.test(completePatterns);		
	}
		
	public static CompletePattern getCompvalCondAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalCompval.getCompvalCondGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}

	public static CompletePattern getCompval3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalCompval.getCompval3CondGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getCompvalThreeElementsConcrete(
			XmlAxisKind[] element1Axis,
			XmlPropertyKind attribute1Kind, String attribute1Name, String attribute1Value,
			XmlAxisKind[] element2Axis,
			XmlPropertyKind attribute2Kind, String attribute2Name, String attribute2Value,
			XmlAxisKind[] element3Axis,
			XmlPropertyKind attribute3Kind, String attribute3Name, String attribute3Value,
			XmlPropertyKind attribute4Kind, String attribute4Name, String attribute4Value
			) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCompval3Abstract();

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
		UntypedParameterValue p9 = ((UntypedParameterValue) params.get(9));
//		ComparisonOptionParam p10 = ((ComparisonOptionParam) params.get(10));
//		TypeOptionParam p11 = ((TypeOptionParam) params.get(11));
		
		XmlPathParam p12 = ((XmlPathParam) params.get(12));
		XmlPathParam p13 = ((XmlPathParam) params.get(13));
		XmlPathParam p14 = ((XmlPathParam) params.get(14));
		XmlPathParam p15 = ((XmlPathParam) params.get(15));
		XmlPathParam p16 = ((XmlPathParam) params.get(16));
		XmlPathParam p17 = ((XmlPathParam) params.get(17));
		XmlPathParam p18 = ((XmlPathParam) params.get(18));
				
		p0.setValue(attribute1Value);
		p3.setValue(attribute2Value);
		p6.setValue(attribute3Value);
		p9.setValue(attribute4Value);
		
		p13.setXmlAxis(element1Axis);
		p14.setXmlAxis(element2Axis);
		p16.setXmlAxis(element3Axis);
		
		XmlPropertyOptionParam pop12 = p12.getXmlPropertyOptionParam();
		pop12.setValue(attribute1Kind);
		if (attribute1Kind == XmlPropertyKind.ATTRIBUTE)
			pop12.getAttributeName().setValue(attribute1Name);

		XmlPropertyOptionParam pop15 = p15.getXmlPropertyOptionParam();
		pop15.setValue(attribute2Kind);
		if (attribute2Kind == XmlPropertyKind.ATTRIBUTE)
			pop15.getAttributeName().setValue(attribute2Name);	
		
		XmlPropertyOptionParam pop17 = p17.getXmlPropertyOptionParam();
		pop17.setValue(attribute3Kind);
		if (attribute3Kind == XmlPropertyKind.ATTRIBUTE)
			pop17.getAttributeName().setValue(attribute3Name);	
		
		XmlPropertyOptionParam pop18 = p18.getXmlPropertyOptionParam();
		pop18.setValue(attribute4Kind);
		if (attribute4Kind == XmlPropertyKind.ATTRIBUTE)
			pop18.getAttributeName().setValue(attribute4Name);	
		
		System.out.println(completePattern.myToString());
		return completePattern;
	}

	public static CompletePattern getCompvalConcrete(String returnElementType, XmlAxisKind[] returnElementAxis,
			String attribute1Name, XmlPropertyKind attribute1Kind, String element2Type, XmlAxisKind[] element2Axis,
			String attribute2Name, XmlPropertyKind attribute2Kind, String attribute3Name, XmlPropertyKind attribute3Kind,
			String value) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = getCompvalCondAbstract();
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
		XmlPathParam p9 = ((XmlPathParam) params.get(9));
//		XmlPathParam p10 = ((XmlPathParam) params.get(10));
//		XmlPathParam p11 = ((XmlPathParam) params.get(11));
		XmlPathParam p12 = ((XmlPathParam) params.get(12));
		XmlPathParam p13 = ((XmlPathParam) params.get(13));

		p0.setValue(returnElementType);
		p3.setValue(element2Type);
		p6.setValue(value);
		
		XmlPropertyOptionParam pop9 = p9.getXmlPropertyOptionParam();
		pop9.setValue(attribute1Kind);
		if (attribute1Kind == XmlPropertyKind.ATTRIBUTE)
			pop9.getAttributeName().setValue(attribute1Name);
		
		XmlPropertyOptionParam pop12 = p12.getXmlPropertyOptionParam();
		pop12.setValue(attribute2Kind);
		if (attribute2Kind == XmlPropertyKind.ATTRIBUTE)
			pop12.getAttributeName().setValue(attribute2Name);

		XmlPropertyOptionParam pop13 = p13.getXmlPropertyOptionParam();
		pop13.setValue(attribute3Kind);
		if (attribute3Kind == XmlPropertyKind.ATTRIBUTE)
			pop13.getAttributeName().setValue(attribute3Name);

		return completePattern;
	}
	
	public static CompletePattern getCompvalSetConcrete(String returnElementType, XmlAxisKind[] returnElementAxis,
			String attribute1Name, XmlPropertyKind attribute1Kind, String element2Type, XmlAxisKind[] element2Axis,
			String attribute2Name, XmlPropertyKind attribute2Kind, String attribute3Name, XmlPropertyKind attribute3Kind,
			List<String> values) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCompvalConcrete(returnElementType, returnElementAxis, attribute1Name, attribute1Kind, 
				element2Type, element2Axis, attribute2Name, attribute2Kind, attribute3Name, attribute3Kind, "" );
		List<Parameter> params = completePattern.getParameterList().getParameters();

		TextListParam testlist = parametersFactory.createTextListParam();
		for (String str : values) {
			testlist.getValues().add(str);
		}
		((ParameterValue) params.get(6)).replace(testlist);
		
		return completePattern;
	}

	public static CompletePattern getCompvalMidas5230Objekt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalConcrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, 
				"5230", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type",  XmlPropertyKind.ATTRIBUTE,  
				"Value", XmlPropertyKind.ATTRIBUTE,  "Objekt");
	}

	public static CompletePattern getCompvalMidas5230Schloss() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalConcrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, 
				"5230", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, 
				"Value", XmlPropertyKind.ATTRIBUTE, "Schloss");
	}

	public static CompletePattern getCompvalMidas5230Print() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalConcrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, 
				"5230", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, 
				"Value", XmlPropertyKind.ATTRIBUTE, "Print");
	}

	public static CompletePattern getCompvalSetMidas3270() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<String> values = Arrays.asList("unbekannt", "x", "y", "?");
		return getCompvalSetConcrete("kue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, 
				"3270", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, 
				"Value", XmlPropertyKind.ATTRIBUTE, values);
	}

	public static CompletePattern getCompvalLidoEventPlace() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, "lido:eventPlace",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				null, XmlPropertyKind.TAG, "lido:type", XmlPropertyKind.ATTRIBUTE, "alternative");
	}

	public static CompletePattern getCompvalLidoObjectWorkTypeObjekt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalThreeElementsConcrete(
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:lido",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:objectWorkType",
				new XmlAxisKind[] {XmlAxisKind.CHILD},  
				XmlPropertyKind.TAG, null, "lido:term", 
				XmlPropertyKind.DATA, null, "Objekt");
	}
	
	public static CompletePattern getCompvalLidoObjectWorkTypeSchloss() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalThreeElementsConcrete(
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:lido",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:objectWorkType",
				new XmlAxisKind[] {XmlAxisKind.CHILD},  
				XmlPropertyKind.TAG, null, "lido:term", 
				XmlPropertyKind.DATA, null, "Schloss");
	}
	
	public static CompletePattern getCompvalLidoObjectWorkTypePrint() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalThreeElementsConcrete(
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:lido",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:objectWorkType",
				new XmlAxisKind[] {XmlAxisKind.CHILD},  
				XmlPropertyKind.TAG, null, "lido:term", 
				XmlPropertyKind.DATA, null, "Print");
	}
	
	public static CompletePattern getCompvalSetLidoAppellationValue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<String> values = Arrays.asList("unbekannt", "x", "unknown", "?");
		return getCompvalSetConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, 
				"lido:appellationValue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, values);
	}
		
	public static CompletePattern getCompsetMIDAS3140() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {			
		List<String> values = Arrays.asList("m","f","unbekannt","m?","f?","?");		
		return getCompvalSetConcrete("kue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, 
				"3140", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, values);
	}
	
	public static CompletePattern getCompsetLidoGenderActor() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {			
		List<String> values = Arrays.asList("male","männlich","weiblich","female","unknown","not applicable");		
		return getCompvalSetConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, "lido:genderActor", 
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				null, XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, values);
	}

}

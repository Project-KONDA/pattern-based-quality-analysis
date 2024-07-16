package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.XmlPatternUtility;

public class XmlEvalCompset {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getCompsetMidas3270());
		completePatterns.add(getCompsetMidas3270Aps());
		completePatterns.add(getCompsetMIDAS3140());
		completePatterns.add(getCompsetMIDAS3140Aps());
		completePatterns.add(getCompsetLidoGenderActor());

		completePatterns.add(getCompsetLidoAppellationValue());

		XmlPatternUtility.getQueries(completePatterns);
//		Test00.test(completePatterns);
	}

	public static CompletePattern getCompset2Concrete(String returnElementType, XmlAxisKind[] returnElementAxis,
			String element2Type, XmlAxisKind[] element2Axis,
			List<String> values) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = XmlEvalCompval.getCompval2Concrete(returnElementType, returnElementAxis,
				element2Type, element2Axis, "" );
		List<Parameter> params = completePattern.getParameterList().getParameters();

		TextListParam testlist = parametersFactory.createTextListParam();
		for (String str : values) {
			testlist.getValues().add(str);
		}
		((ParameterValue) params.get(0)).replace(testlist);

		return completePattern;
	}

	public static CompletePattern getCompset2CondConcrete(String returnElementType, XmlAxisKind[] returnElementAxis,
			String attribute1Name, XmlPropertyKind attribute1Kind, String element2Type, XmlAxisKind[] element2Axis,
			String attribute2Name, XmlPropertyKind attribute2Kind, String attribute3Name, XmlPropertyKind attribute3Kind,
			List<String> values) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = XmlEvalCompval.getCompval2Concrete(returnElementType, returnElementAxis, attribute1Name, attribute1Kind,
				element2Type, element2Axis, attribute2Name, attribute2Kind, attribute3Name, attribute3Kind, "" );
		List<Parameter> params = completePattern.getParameterList().getParameters();

		TextListParam testlist = parametersFactory.createTextListParam();
		for (String str : values) {
			testlist.getValues().add(str);
		}
		((ParameterValue) params.get(0)).replace(testlist);

		return completePattern;
	}

	public static CompletePattern getCompsetMidas3270() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<String> values = Arrays.asList("unbekannt", "x", "y", "?");
		return getCompset2CondConcrete("kue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE,
				"3270", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE,
				"Value", XmlPropertyKind.ATTRIBUTE, values);
	}

	public static CompletePattern getCompsetMidas3270Aps() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<String> values = Arrays.asList("unbekannt", "x", "y", "?");
		return getCompset2Concrete("kue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "a3270", new XmlAxisKind[] {XmlAxisKind.CHILD}, values);
	}

	public static CompletePattern getCompsetMIDAS3140() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<String> values = Arrays.asList("m","f","unbekannt","m?","f?","?");
		return getCompset2CondConcrete("kue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE,
				"3140", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, values);
	}

	public static CompletePattern getCompsetMIDAS3140Aps() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<String> values = Arrays.asList("m","f","unbekannt","m?","f?","?");
		return getCompset2Concrete("kue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "a3140", new XmlAxisKind[] {XmlAxisKind.CHILD}, values);
	}

	public static CompletePattern getCompsetLidoAppellationValue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<String> values = Arrays.asList("unbekannt", "x", "unknown", "?");
		return getCompset2CondConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG,
				"lido:appellationValue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, values);
	}

	public static CompletePattern getCompsetLidoGenderActor() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<String> values = Arrays.asList("male","m�nnlich","weiblich","female","unknown","not applicable");
		return getCompset2CondConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, "lido:genderActor",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				null, XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, values);
	}

}

package qualitypatternmodel.utility;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlAxisPart;
import qualitypatternmodel.adaptionxml.XmlAxisPartCondition;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.impl.XmlAxisOptionParamImpl;
import qualitypatternmodel.adaptionxml.impl.XmlAxisPartConditionImpl;
import qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;

public class XmlPatternUtility {

	public static void testPatterns(List<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			XmlPatternUtility.fillParameterXml(completePattern);
			try {
				completePattern.isValid(AbstractionLevel.CONCRETE);
				String result = completePattern.myToString();
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(result);
				System.out.print("\n___TRANSLATION___");
				System.out.println(completePattern.generateXQuery());
			} catch (Exception e) {
				System.out.print("\n####### PATTERN INVALID #######");
				try {
				  System.out.println(completePattern.myToString());
					e.printStackTrace();
				} catch (Exception e2) {
					System.out.print("\n####### PATTERN PRINTING FAILED #######");
					e2.printStackTrace();
					e.printStackTrace();
				}
			}
		}
	}

	public static void getQueries(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			XmlPatternUtility.fillParameterXml(completePattern);
	
			try {
				completePattern.isValid(AbstractionLevel.CONCRETE);
				String result = completePattern.generateXQuery();
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(result);
			} catch (Exception e) {
				System.out.println("\n\n___PATTERN_(InVALID)___");
				e.printStackTrace();
				System.out.println(completePattern.myToString());
			}
		}
	}

	public static CompletePattern fillParameterXml(CompletePattern pattern) {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		EList<Parameter> params = pattern.getParameterList().getParameters();
		for (int i = params.size()-1; i > -1; i--) {
			Parameter param = pattern.getParameterList().getParameters().get(i);
			if (param instanceof UntypedParameterValue) {
				TextLiteralParam text = parametersFactory.createTextLiteralParam();
				text.setValue("unknown");
				try {
					((UntypedParameterValue) param).replace(text);
				} catch (InvalidityException e) {
					e.printStackTrace();
				}
			}
			if (param instanceof TextLiteralParam) {
				TextLiteralParam text = (TextLiteralParam) param;
				if(text.getValue() == null) {
					text.setValue("something");
				}
			}
			if (param instanceof ComparisonOptionParam) {
				ComparisonOptionParam comp = (ComparisonOptionParam) param;
				if(comp.getValue() == null) {
					comp.setValue(ComparisonOperator.EQUAL);
				}
			}
			if (param instanceof BooleanParam) {
				BooleanParam bool = (BooleanParam) param;
				if(bool.getValue() == null) {
					bool.setValue(true);
				}
			}
			if (param instanceof NumberParam) {
				NumberParam number = (NumberParam) param;
				if(number.getValue() == null) {
					number.setValue(0.0);
				}
			}
			if (param instanceof XmlPathParam) {
				XmlPathParam xmlPathParam = (XmlPathParam) param;
				if (xmlPathParam.getXmlAxisParts().isEmpty())
					xmlPathParam.getXmlAxisParts().add(new XmlAxisPartImpl());
				for (XmlAxisPart pair : xmlPathParam.getXmlAxisParts()) {
					if (pair.getXmlAxisPartConditions().isEmpty())
						pair.getXmlAxisPartConditions().add(new XmlAxisPartConditionImpl());
					if (pair.getXmlAxisOptionParam() == null)
						pair.setXmlAxisOptionParam(new XmlAxisOptionParamImpl());
					if (pair.getXmlAxisOptionParam().getValue() == null)
						pair.getXmlAxisOptionParam().setValue(XmlAxisKind.CHILD);
					for (XmlAxisPartCondition cond : pair.getXmlAxisPartConditions()) {
						if (cond.getXmlPropertyOption() == null)
							cond.setXmlPropertyOption(new XmlPropertyOptionParamImpl());
						if (cond.getXmlPropertyOption().getValue() == null)
							cond.getXmlPropertyOption().setValue(XmlPropertyKind.DATA);	
						if(cond.getTextLiteralParam() == null)
							cond.setTextLiteralParam(new TextLiteralParamImpl());
						if(cond.getTextLiteralParam().getValue() == null)
							cond.getTextLiteralParam().setValue("");
					}
				}
				if (xmlPathParam.getXmlNavigation() instanceof XmlPropertyNavigation) {
					if (xmlPathParam.getXmlPropertyOptionParam() == null)
						xmlPathParam.setXmlPropertyOptionParam(new XmlPropertyOptionParamImpl());
					if (xmlPathParam.getXmlPropertyOptionParam().getValue() == null)
						xmlPathParam.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
				}
			}
			if (param instanceof TypeOptionParam) {
				TypeOptionParam typeOptionParam = (TypeOptionParam) param;
				if(typeOptionParam.getValue() == null || typeOptionParam.getValue() == ReturnType.UNSPECIFIED) {
					typeOptionParam.setValue(ReturnType.STRING);
				}
			}
		}
		return pattern;
	}

}

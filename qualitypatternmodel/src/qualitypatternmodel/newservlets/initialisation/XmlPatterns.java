package qualitypatternmodel.newservlets.initialisation;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.eclipse.emf.common.util.BasicEList;
import de.gwdg.metadataqa.api.configuration.ConfigurationReader;
import de.gwdg.metadataqa.api.schema.BaseSchema;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.constrainttranslation.ConstraintTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.impl.PatternTextImpl;
import qualitypatternmodel.utility.XmlPatternUtility;

public class XmlPatterns {
	
	static Boolean AXIS = true;
	static Boolean DEFAULT_VARIANTS = true;
	static Boolean OLD_VARIANTS = false;
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		
		for (CompletePattern pattern: getAllXmlPattern()) {
//			System.out.println(pattern.myToString());
			try {
				System.out.println("___" + pattern.getName() + "___");
				pattern.isValid(AbstractionLevel.ABSTRACT);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				XmlPatternUtility.fillParameterXml(pattern);
				pattern.getText().get(0).instantiate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				pattern.generateXQuery();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				BaseSchema schema = ConstraintTranslation.translateToConstraintSchema(pattern);
				ConfigurationReader.toJson(schema);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static List<CompletePattern> getAllXmlPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		// READY
		patterns.add(getXmlCard());
		patterns.add(getXmlMandAtt());
		patterns.add(getXmlMatch());
		patterns.add(getXmlContains());
		patterns.add(getXmlStringLength());
		patterns.add(getXmlCompSet());
		patterns.add(getXmlInvalidLink());
		patterns.add(getXmlUnique());
		
		// NOT READY
//		patterns.add(getXmlComp());
//		patterns.add(getXmlFunc());
//		patterns.add(getXmlAppdup3());
//		patterns.add(getXmlDupVal());
//		patterns.add(getXmlCompVal());

		// BASE IMPLEMENTED
//		patterns.add(getXmlLocalUnique());
//		patterns.add(getXmlCardImpliesMandAtt());
//		patterns.add(getXmlCompValAny());
		
		// NOT IMPLEMENTED
//		patterns.add(getXmlCheckFormat());
//		patterns.add(getXmlCompDatabase());
		
		return patterns;
	}
	
	public static CompletePattern getXmlCard() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericCard();
		pattern.createXmlAdaption();
		pattern.setPatternId("Card_xml");
		pattern.setAbstractId("Card_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
//		ComparisonOptionParam comp = (ComparisonOptionParam) params.get(0);
//		NumberParam numb = (NumberParam) params.get(1);
		XmlPathParam path1 = (XmlPathParam) params.get(2);
		XmlPathParam path2 = (XmlPathParam) params.get(3);
		if (AXIS) {
			path1.setValueFromString("//*");
			path2.setValueFromString("/*");
		}
		
		if (DEFAULT_VARIANTS) {
			try {
				new PatternTextImpl(pattern, new JSONObject(XmlPatternVariants.CARD_XML_DEFAULT));
			} catch(JSONException e) {
				e.printStackTrace();
			}
		}
		
		if (OLD_VARIANTS) {
			String[] variants = {XmlPatternVariants.CARD_XML_DEFAULT_OLD, XmlPatternVariants.CARD_XML_QUESTION, XmlPatternVariants.CARD_XML_QUESTION_SIMPLE};
			for (String var: variants) {
				try {
					new PatternTextImpl(pattern, new JSONObject(var));
				} catch(JSONException e) {
					e.printStackTrace();
				}
			}
		}
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlMatch() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericMatch();
		pattern.createXmlAdaption();
		pattern.setPatternId("Match_xml");
		pattern.setAbstractId("Match_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();

//		BooleanParam p0 = ((BooleanParam) params.get(0));
//		TextLiteralParam p1 = ((TextLiteralParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		if (AXIS) {
			p2.setValueFromString("//*");
			p3.setValueFromString("/*/text()");
		}
		
		if (DEFAULT_VARIANTS) {
			try {
				new PatternTextImpl(pattern, new JSONObject(XmlPatternVariants.MATCH_XML_DEFAULT));
			} catch(JSONException e) {
				e.printStackTrace();
			}
		}
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlContains() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericContains();
		pattern.createXmlAdaption();
		pattern.setPatternId("Contains_xml");
		pattern.setAbstractId("Contains_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
//		BooleanParam p0 = ((BooleanParam) params.get(0));
//		TextLiteralParam p1 = ((TextLiteralParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		if (AXIS) {
			p2.setValueFromString("//*");
			p3.setValueFromString("/*/text()");
		}
		
		if (DEFAULT_VARIANTS) {
			try {
				new PatternTextImpl(pattern, new JSONObject(XmlPatternVariants.CONTAINS_XML_DEFAULT));
			} catch(JSONException e) {
				e.printStackTrace();
			}
		}
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlInvalidLink() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericInvalidLink();
		pattern.createXmlAdaption();
		pattern.setPatternId("InvalidLink_xml");
		pattern.setAbstractId("InvalidLink_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
		
//		BooleanParam bool = ((BooleanParam) params.get(0)); // negate
		XmlPathParam path1 = ((XmlPathParam) params.get(1)); // path to record
		XmlPathParam path2 = ((XmlPathParam) params.get(2)); // path to link value
		if (AXIS) {
			path1.setValueFromString("//*");
			path2.setValueFromString("/*/text()");
		}
		
		if (DEFAULT_VARIANTS) {
			try {
				new PatternTextImpl(pattern, new JSONObject(XmlPatternVariants.INVALIDLINK_XML_DEFAULT));
			} catch(JSONException e) {
				e.printStackTrace();
			}
		}
		
		if (OLD_VARIANTS) {
			try {
				new PatternTextImpl(pattern, new JSONObject(XmlPatternVariants.INVALIDLINK_XML_QUESTION));
			} catch(JSONException e) {
				e.printStackTrace();
			}
		}
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlMandAtt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericMandAtt();
		pattern.createXmlAdaption();
		pattern.setPatternId("MandAtt_xml");
		pattern.setAbstractId("MandAtt_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
		XmlPathParam p0 = ((XmlPathParam) params.get(0));
		XmlPathParam p1 = ((XmlPathParam) params.get(1));
		if (AXIS) {
			p0.setValueFromString("//*");
			p1.setValueFromString("/*/text()");
		}

		if (DEFAULT_VARIANTS) {
			try {
				new PatternTextImpl(pattern, new JSONObject(XmlPatternVariants.MANDATT_XML_DEFAULT));
			} catch(JSONException e) {
				e.printStackTrace();
			}
		}
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlStringLength() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericStringLength();
		pattern.createXmlAdaption();
		pattern.setPatternId("StringLength_xml");
		pattern.setAbstractId("StringLength_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		NumberParam p1 = ((NumberParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		if (AXIS) {
			p2.setValueFromString("//*");
			p3.setValueFromString("/*/text()");
		}

		if (DEFAULT_VARIANTS) {
			try {
				new PatternTextImpl(pattern, new JSONObject(XmlPatternVariants.STRINGLENGTH_XML_DEFAULT));
			} catch(JSONException e) {
				e.printStackTrace();
			}
		}

		if (OLD_VARIANTS) {
			try {
				new PatternTextImpl(pattern, new JSONObject(XmlPatternVariants.STRINGLENGTH_XML_DEFAULT_OLD));
			} catch(JSONException e) {
				e.printStackTrace();
			}
		}
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericUnique();
		pattern.createXmlAdaption();
		pattern.setPatternId("Unique_xml");
		pattern.setAbstractId("Unique_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
		if (AXIS) {
			p2.setValueFromString("//*");
			p3.setValueFromString("/*/text()");
			p4.setValueFromString("/*/text()");
			p5.setValueFromString("//*");
		}

		if (DEFAULT_VARIANTS) {
			try {
				new PatternTextImpl(pattern, new JSONObject(XmlPatternVariants.UNIQUE_XML_DEFAULT));
			} catch(JSONException e) {
				e.printStackTrace();
			}
		}
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlCompSet() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericCompSet();
		pattern.createXmlAdaption();
		pattern.setPatternId("CompSet_xml");
		pattern.setAbstractId("CompSet_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
//		TextListParam p0 = ((TextListParam) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		if (AXIS) {
			p3.setValueFromString("//*");
			p4.setValueFromString("/*/text()");
		}

		if (DEFAULT_VARIANTS) {
			try {
				new PatternTextImpl(pattern, new JSONObject(XmlPatternVariants.COMPSET_XML_DEFAULT));
			} catch(JSONException e) {
				e.printStackTrace();
			}
		}

		if (OLD_VARIANTS) {
			try {
				new PatternTextImpl(pattern, new JSONObject(XmlPatternVariants.COMPSET_XML_DEFAULT_OLD));
			} catch(JSONException e) {
				e.printStackTrace();
			}
		}
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlAppdup2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericAppdup2();
		pattern.createXmlAdaption();
		pattern.setPatternId("Appdup2_xml");
		pattern.setAbstractId("Appdup2_xml");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlAppdup3() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericAppdup3();
		pattern.createXmlAdaption();
		pattern.setPatternId("Appdup3_xml");
		pattern.setAbstractId("Appdup3_xml");
		// TODO
//		List<Parameter> params = pattern.getParameterList().getParameters();
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
//		XmlPathParam p2 = ((XmlPathParam) params.get(2));
//		XmlPathParam p3 = ((XmlPathParam) params.get(3));
//		XmlPathParam p4 = ((XmlPathParam) params.get(4));
//		XmlPathParam p5 = ((XmlPathParam) params.get(5));
//		XmlPathParam p6 = ((XmlPathParam) params.get(6));
//		XmlPathParam p7 = ((XmlPathParam) params.get(7));
//		XmlPathParam p8 = ((XmlPathParam) params.get(8));
//		XmlPathParam p9 = ((XmlPathParam) params.get(9));
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlDupVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericDupVal();
		pattern.createXmlAdaption();
		pattern.setPatternId("DupVal_xml");
		pattern.setAbstractId("DupVal_xml");
		// TODO
//		List<Parameter> params = pattern.getParameterList().getParameters();
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		NumberParam p1 = ((NumberParam) params.get(1));
//		ComparisonOptionParam p2 = ((ComparisonOptionParam) params.get(2));
//		TypeOptionParam p3 = ((TypeOptionParam) params.get(3));
//		XmlPathParam p4 = ((XmlPathParam) params.get(4));
//		XmlPathParam p5 = ((XmlPathParam) params.get(5));
//		XmlPathParam p6 = ((XmlPathParam) params.get(6));
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericComp();
		pattern.createXmlAdaption();
		pattern.setPatternId("Comp_xml");
		pattern.setAbstractId("Comp_xml");
//		List<Parameter> params = pattern.getParameterList().getParameters();
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
//		XmlPathParam p2 = ((XmlPathParam) params.get(2));
//		XmlPathParam p3 = ((XmlPathParam) params.get(3));
//		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		// TODO
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlFunc() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericFunc();
		pattern.createXmlAdaption();
		pattern.setPatternId("Func_xml");
		pattern.setAbstractId("Func_xml");
		// TODO
//		List<Parameter> params = pattern.getParameterList().getParameters();
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
//		ComparisonOptionParam p2 = ((ComparisonOptionParam) params.get(2));
//		TypeOptionParam p3 = ((TypeOptionParam) params.get(3));
//		XmlPathParam p4 = ((XmlPathParam) params.get(4));
//		XmlPathParam p5 = ((XmlPathParam) params.get(5));
//		XmlPathParam p6 = ((XmlPathParam) params.get(6));
//		XmlPathParam p7 = ((XmlPathParam) params.get(7));
//		XmlPathParam p8 = ((XmlPathParam) params.get(8));
//		XmlPathParam p9 = ((XmlPathParam) params.get(9));
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlLocalUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericLocalUnique();
		pattern.createXmlAdaption();
		pattern.setPatternId("LocalUnique_xml");
		pattern.setAbstractId("LocalUnique_xml");
		// TODO
//		int i=0;
//		for (Parameter p: pattern.getParameterList().getParameters()){
//			System.out.println(p.getClass().getSimpleName().replace("Impl", "") + " p" + i + " = ((" + p.getClass().getSimpleName().replace("Impl", "") + ") params.get(" + i + "));");
//			i++;
//		}
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlCompVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericCompVal();
		pattern.createXmlAdaption();
		pattern.setPatternId("CompVal_xml");
		pattern.setAbstractId("CompVal_xml");
		// TODO
//		List<Parameter> params = pattern.getParameterList().getParameters();
//		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
//		XmlPathParam p3 = ((XmlPathParam) params.get(3));
//		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlCardImpliesMandAtt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericCardImpliesMandAtt();
		pattern.createXmlAdaption();
		pattern.setPatternId("CardImpliesMandAtt_xml");
		pattern.setAbstractId("CardImpliesMandAtt_xml");
		// TODO
//		List<Parameter> params = pattern.getParameterList().getParameters();
		int i=0;
		for (Parameter p: pattern.getParameterList().getParameters()){
			System.out.println(p.getClass().getSimpleName().replace("Impl", "") + " p" + i + " = ((" + p.getClass().getSimpleName().replace("Impl", "") + ") params.get(" + i + "));");
			i++;
		}
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlCompValAny() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericCompValAny();
		pattern.createXmlAdaption();
		pattern.setPatternId("CompValAny_xml");
		pattern.setAbstractId("CompValAny_xml");
		// TODO
		int i=0;
		for (Parameter p: pattern.getParameterList().getParameters()){
			System.out.println(p.getClass().getSimpleName().replace("Impl", "") + " p" + i + " = ((" + p.getClass().getSimpleName().replace("Impl", "") + ") params.get(" + i + "));");
			i++;
		}
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
//	public static CompletePattern getXmlCheckFormat() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCheckFormat();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CheckFormat_xml");
//		pattern.setAbstractId("CheckFormat_xml");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
//	
//	public static CompletePattern getXmlCompDatabase() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCompDatabase();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CompDatabase_xml");
//		pattern.setAbstractId("CompDatabase_xml");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
}

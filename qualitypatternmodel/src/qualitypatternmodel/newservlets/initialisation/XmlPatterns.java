package qualitypatternmodel.newservlets.initialisation;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.eclipse.emf.common.util.BasicEList;
import de.gwdg.metadataqa.api.configuration.ConfigurationReader;
import de.gwdg.metadataqa.api.schema.BaseSchema;
import qualitypatternmodel.constrainttranslation.ConstraintTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.textrepresentation.impl.PatternTextImpl;
import qualitypatternmodel.utility.XmlPatternUtility;

public class XmlPatterns {
	
	static Boolean AXIS = false;
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
		try {
			patterns.add(getXmlConcrete(GenericPatterns.getGenericCard(), Language.XML,
					Map.of(2, "//*", 3, "/*"), 
					XmlPatternVariants.CARD_XML_VARIANTS, 
					XmlPatternVariants.CARD_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(getXmlConcrete(GenericPatterns.getGenericMandAtt(), Language.XML,
					Map.of(0, "//*", 1, "/*/text()"), 
					XmlPatternVariants.MANDATT_XML_VARIANTS, 
					XmlPatternVariants.MANDATT_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(getXmlConcrete(GenericPatterns.getGenericMatch(), Language.XML,
					Map.of(2, "//*", 3, "/*/text()"), 
					XmlPatternVariants.MATCH_XML_VARIANTS, 
					XmlPatternVariants.MATCH_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(getXmlConcrete(GenericPatterns.getGenericContains(), Language.XML,
					Map.of(2, "//*", 3, "/*/text()"), 
					XmlPatternVariants.CONTAINS_XML_VARIANTS, 
					XmlPatternVariants.CONTAINS_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(getXmlConcrete(GenericPatterns.getGenericStringLength(), Language.XML,
					Map.of(2, "//*", 3, "/*/text()"), 
					XmlPatternVariants.STRINGLENGTH_XML_VARIANTS, 
					XmlPatternVariants.STRINGLENGTH_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(getXmlConcrete(GenericPatterns.getGenericCompSet(), Language.XML,
					Map.of(3, "//*", 4, "/*/text()"), 
					XmlPatternVariants.COMPSET_XML_VARIANTS, 
					XmlPatternVariants.COMPSET_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(getXmlConcrete(GenericPatterns.getGenericInvalidLink(), Language.XML,
					Map.of(1, "//*", 2, "/*/text()"),
					XmlPatternVariants.INVALIDLINK_XML_VARIANTS, 
					XmlPatternVariants.INVALIDLINK_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(getXmlConcrete(GenericPatterns.getGenericUnique(), Language.XML,
					Map.of(2, "//*", 3, "/*/text()", 4, "/*/text()", 5, "//*"), 
					XmlPatternVariants.UNIQUE_XML_VARIANTS, 
					XmlPatternVariants.UNIQUE_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// NOT READY
//		try {
//			patterns.add(getXmlConcrete(GenericPatterns.getGenericComp(), Language.XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			patterns.add(getXmlConcrete(GenericPatterns.getGenericFunc(), Language.XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			patterns.add(getXmlConcrete(GenericPatterns.getGenericAppdup3(), Language.XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			patterns.add(getXmlConcrete(GenericPatterns.getGenericDupVal(), Language.XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			patterns.add(getXmlConcrete(GenericPatterns.getGenericCompVal(), Language.XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// BASE IMPLEMENTED
//		try {
//			patterns.add(getXmlConcrete(GenericPatterns.getGenericLocalUnique(), Language.XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			patterns.add(getXmlConcrete(GenericPatterns.getGenericCardImpliesMandAtt(), Language.XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			patterns.add(getXmlConcrete(GenericPatterns.getGenericCompValAny(), Language.XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		// NOT IMPLEMENTED
//		try {
//			patterns.add(getXmlConcrete(GenericPatterns.getGenericCheckFormat(), Language.XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			patterns.add(getXmlConcrete(GenericPatterns.getGenericCompDatabase(), Language.XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		return patterns;
	}
	
	public static CompletePattern getXmlConcrete(CompletePattern pattern, Language lan, Map<Integer, String> values, String[] variants, String[] oldvariants) 
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		switch(lan) {
		case XML: 
			pattern.createXmlAdaption();
			break;
		case RDF: 
			pattern.createRdfAdaption();
			break;
		case NEO4J:
			pattern.createRdfAdaption();
			break;
		default:
			throw new InvalidityException("Invalid Language");
		}
		
		String name = pattern.getName();
		pattern.setPatternId(name + "_xml");
		pattern.setAbstractId(name + "xml");
		List<Parameter> params = pattern.getParameterList().getParameters();
		
		if (AXIS && values != null)
			for (Integer index: values.keySet())
				params.get(index).setValueFromString(values.get(index));
		
		if (DEFAULT_VARIANTS && variants != null)
			for (String json: variants)
				try {
					new PatternTextImpl(pattern, new JSONObject(json));
				} catch(JSONException e) {
					e.printStackTrace();
				}
		
		if (OLD_VARIANTS && oldvariants != null)
			for (String json: oldvariants)
				try {
					new PatternTextImpl(pattern, new JSONObject(json));
				} catch(JSONException e) {
					e.printStackTrace();
				}

		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
}

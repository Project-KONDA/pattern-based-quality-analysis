package qualitypatternmodel.newservlets.initialisation;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;

import de.gwdg.metadataqa.api.configuration.ConfigurationReader;
import de.gwdg.metadataqa.api.schema.BaseSchema;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.mqaftranslation.MqafTranslation;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.utility.PatternUtility;

public class XmlPatterns {

	static String XPath1 = "/*";
	static String XPath2 = "//*";
	static String Property = "/*/text()";

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
				PatternUtility.fillParameter(pattern);
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
				BaseSchema schema = MqafTranslation.translateToConstraintSchema(pattern);
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
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericCard(), Language.XML,
					GenericPatternInformation.CARD_ID_XML,
					Map.of(2, XPath2, 3, XPath1),
					XmlPatternVariants.CARD_XML_VARIANTS,
					XmlPatternVariants.CARD_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericMandAtt(), Language.XML,
					GenericPatternInformation.MANDATT_ID_XML,
					Map.of(0, XPath2, 1, XPath1),
					XmlPatternVariants.MANDATT_XML_VARIANTS,
					XmlPatternVariants.MANDATT_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericMatch(), Language.XML,
					GenericPatternInformation.MATCH_ID_XML,
					Map.of(2, XPath2, 3, Property),
					XmlPatternVariants.MATCH_XML_VARIANTS,
					XmlPatternVariants.MATCH_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericContains(), Language.XML,
					GenericPatternInformation.CONTAINS_ID_XML,
					Map.of(2, XPath2, 3, Property),
					XmlPatternVariants.CONTAINS_XML_VARIANTS,
					XmlPatternVariants.CONTAINS_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericStringLength(), Language.XML,
					GenericPatternInformation.STRINGLENGTH_ID_XML,
					Map.of(2, XPath2, 3, Property),
					XmlPatternVariants.STRINGLENGTH_XML_VARIANTS,
					XmlPatternVariants.STRINGLENGTH_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericCompSet(), Language.XML,
					GenericPatternInformation.COMPSET_ID_XML,
					Map.of(3, XPath2, 4, Property),
					XmlPatternVariants.COMPSET_XML_VARIANTS,
					XmlPatternVariants.COMPSET_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericInvalidLink(), Language.XML,
					GenericPatternInformation.INVALIDLINK_ID_XML,
					Map.of(1, XPath2, 2, Property),
					XmlPatternVariants.INVALIDLINK_XML_VARIANTS,
					XmlPatternVariants.INVALIDLINK_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericUnique(), Language.XML,
					GenericPatternInformation.UNIQUE_ID_XML,
					Map.of(2, XPath2, 3, Property, 4, Property, 5, XPath2),
					XmlPatternVariants.UNIQUE_XML_VARIANTS,
					XmlPatternVariants.UNIQUE_XML_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// NOT READY
//		try {
//			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericComp(), Language.XML, GenericPatternInformation.COMP_ID_XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericFunc(), Language.XML, GenericPatternInformation.FUNC_ID_XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericAppdup3(), Language.XML, GenericPatternInformation.APPDUP3_ID_XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericDupVal(), Language.XML, GenericPatternInformation.DUPVAL_ID_XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericCompVal(), Language.XML, GenericPatternInformation.COMPVAL_ID_XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// BASE IMPLEMENTED
//		try {
//			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericLocalUnique(), Language.XML, GenericPatternInformation.LOCALUNIQUE_ID_XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericCardImpliesMandAtt(), Language.XML, GenericPatternInformation.CARDIMPLIESMANDATT_ID_XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericCompValAny(), Language.XML, GenericPatternInformation.COMPVALANY_ID_XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// NOT IMPLEMENTED
//		try {
//			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericCheckFormat(), Language.XML, GenericPatternInformation.CHECKFORMAT_ID_XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericCompDatabase(), Language.XML, GenericPatternInformation.COMPDATABASE_ID_XML, Map.of(), null, null));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		return patterns;
	}
}

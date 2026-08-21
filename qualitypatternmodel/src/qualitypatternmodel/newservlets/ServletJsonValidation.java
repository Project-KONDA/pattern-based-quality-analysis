package qualitypatternmodel.newservlets;

import java.util.Set;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.Util;

public class ServletJsonValidation {

	// ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER + "/" + ServletConstants.PATTERNJSONFOLDER + "/" + constraintId + ".json";
	
	static Set<String> constraintJsonKeys = Set.of(
			ConstantsJSON.CONSTRAINT_ID,
//			ConstantsJSON.DATAMODEL,
			ConstantsJSON.DESCRIPTION,
			ConstantsJSON.LANGUAGE,
//			ConstantsJSON.TECHNOLOGY,
			ConstantsJSON.VARIANTS,
			ConstantsJSON.EXECUTABLE,
			ConstantsJSON.EXECUTABLE_QUERY,
			ConstantsJSON.EXECUTABLE_FILTER,
			ConstantsJSON.EXECUTABLE_MQAF,
			ConstantsJSON.NAME //,
//			ConstantsJSON.NAMESPACES,
//			ConstantsJSON.TAG,
//			ConstantsJSON.LASTSAVED
		);

	public static boolean validateConstraintJson(ObjectNode constraintJson) {

		if (!Util.jsonKeySet(constraintJson).containsAll(constraintJsonKeys))
			return false;
		
		ArrayNode variants = (ArrayNode) constraintJson.get(ConstantsJSON.VARIANTS);
		for (int i = 0; i<variants.size(); i++)
			validateConstraintJsonVariant((ObjectNode) variants.get(i));
		return true;
	}

	static Set<String> constraintJsonVariantKeys = Set.of(
			ConstantsJSON.NAME,
//			ConstantsJSON.CUSTOM,
			ConstantsJSON.FRAGMENTS,
			ConstantsJSON.PARAMETER,
			ConstantsJSON.TYPE_CONSTRAINT
		);
	private static boolean validateConstraintJsonVariant(ObjectNode variant) {
		if (!Util.jsonKeySet(variant).containsAll(constraintJsonVariantKeys))
			return false;
		ArrayNode fragments = (ArrayNode) variant.get(ConstantsJSON.FRAGMENTS);
		for (int j = 0; j<fragments.size(); j++)
			validateConstraintJsonVariantFragment((ObjectNode) fragments.get(j));
		return true;
	}
	

	static Set<String> constraintJsonVariantfragmentJsonKeys1 = Set.of(ConstantsJSON.TEXT);
	static Set<String> constraintJsonVariantfragmentJsonKeys2 = Set.of(
			ConstantsJSON.ROLE,
			ConstantsJSON.NAME,
			ConstantsJSON.ID,
			ConstantsJSON.TYPE //,
//			ConstantsJSON.VALUE,
//			ConstantsJSON.EXAMPLEVALUE,
//			ConstantsJSON.USERVALUE,
//			ConstantsJSON.PLURAL,
//			ConstantsJSON.STARTPOINT
		);
	private static boolean validateConstraintJsonVariantFragment(ObjectNode fragment) {
		Set<String> keySet = Util.jsonKeySet(fragment);
		return keySet.containsAll(constraintJsonVariantfragmentJsonKeys1) || keySet.containsAll(constraintJsonVariantfragmentJsonKeys2);
	}
	
	// ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER + "/" + ServletConstants.QUERYJSONFOLDER + "/" + constraintId + ".json";
	static Set<String> queryJsonKeys =  Set.of(
			ConstantsJSON.NAME,
			ConstantsJSON.CONSTRAINT_ID,
			ConstantsJSON.TECHNOLOGY,
			ConstantsJSON.TEMPLATE_ID,
			ConstantsJSON.RELATIVEQUERIES,
			ConstantsJSON.VARIANT_ID,
			ConstantsJSON.QUERY,
			ConstantsJSON.QUERY_LINE,
			ConstantsJSON.LANGUAGE
		);
	static Set<String> queryXmlJsonKeys =  Set.of(
			ConstantsJSON.QUERY_PARTIAL,
			ConstantsJSON.QUERY_PARTIAL_LINE
		);
	public static boolean validateQueryJson(ObjectNode queryjson) {
		Set<String> keySet = Util.jsonKeySet(queryjson); 
		if (!keySet.containsAll(queryJsonKeys))
			return false;
		if (queryjson.optString(ConstantsJSON.TECHNOLOGY).equals(Constants.XML))
			return keySet.containsAll(queryXmlJsonKeys);
		return true;
	}

	// ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TEMPLATEFOLDER + "/" + ServletConstants.PATTERNJSONFOLDER + "/" + templateId + ".json";
	public static boolean validateTemplateJson(ObjectNode templateJson) {
		return validateConstraintJson(templateJson);
	}

	// ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TEMPLATEFOLDER + "/" + ServletConstants.VARIANTJSONFOLDER + "/" + templateId + ".json";
	static Set<String> templateVariantsKeys =  Set.of(
			ConstantsJSON.VARIANTS,
			ConstantsJSON.PARAMETER
		);
	public static boolean validateTemplateVariantJson(ObjectNode variantJson) {
		if (!Util.jsonKeySet(variantJson).containsAll(templateVariantsKeys))
			return false;
		ArrayNode variants = (ArrayNode) variantJson.get(ConstantsJSON.VARIANTS);
		for (int i = 0; i<variants.size(); i++)
			if (!validateTemplateVariantJsonVariant((ObjectNode) variants.get(i)))
				return false;
		ObjectNode params = (ObjectNode) variantJson.get(ConstantsJSON.PARAMETER);
		for (String key: Util.jsonKeySet(variantJson))
			if (!validateTemplateVariantJsonParam((ObjectNode) params.get(key)))
				return false;
		return true;
	}

	static Set<String> templateVariantsVariantKeys =  Set.of(
			ConstantsJSON.TEMPLATE,
//			ConstantsJSON.CUSTOM,
			ConstantsJSON.NAME,
			ConstantsJSON.FRAGMENTS,
			ConstantsJSON.TECHNOLOGY
		);
	private static boolean validateTemplateVariantJsonVariant(ObjectNode variant) {
		if (!Util.jsonKeySet(variant).containsAll(templateVariantsVariantKeys))
			return false;
		ArrayNode fragments = (ArrayNode) variant.get(ConstantsJSON.FRAGMENTS);
		for (int i = 0; i<fragments.size(); i++)
			if(!validateTemplateVariantJsonFragment((ObjectNode) fragments.get(i)))
				return false;
		return true;
	}
	

	static Set<String> templateVariantJsonFragmentKeys1 = Set.of(ConstantsJSON.TEXT);
	static Set<String> templateVariantJsonFragmentKeys2 = Set.of(
			ConstantsJSON.NEWID,
			ConstantsJSON.NAME,
			ConstantsJSON.PARAMETER
		);
	private static boolean validateTemplateVariantJsonFragment(ObjectNode fragment) {
		Set<String> keySet = Util.jsonKeySet(fragment); 
		return keySet.containsAll(templateVariantJsonFragmentKeys1) || keySet.containsAll(templateVariantJsonFragmentKeys2);
	}

	static Set<String> templateVariantsParamKeys =  Set.of(
			ConstantsJSON.ROLE,
			ConstantsJSON.ID,
			ConstantsJSON.TYPE
		);
	private static boolean validateTemplateVariantJsonParam(ObjectNode params) {
			return Util.jsonKeySet(params).containsAll(templateVariantsParamKeys);
	}
}

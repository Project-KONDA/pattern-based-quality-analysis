package qualitypatternmodel.newservlets;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsJSON;

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

	public static boolean validateConstraintJson(JSONObject constraintJson) {

		if (!constraintJson.keySet().containsAll(constraintJsonKeys))
			return false;
		
		JSONArray variants = constraintJson.getJSONArray(ConstantsJSON.VARIANTS);
		for (int i = 0; i<variants.length(); i++)
			validateConstraintJsonVariant(variants.getJSONObject(i));
		return true;
	}

	static Set<String> constraintJsonVariantKeys = Set.of(
			ConstantsJSON.NAME,
//			ConstantsJSON.CUSTOM,
			ConstantsJSON.FRAGMENTS,
			ConstantsJSON.PARAMETER,
			ConstantsJSON.TYPE_CONSTRAINT
		);
	private static boolean validateConstraintJsonVariant(JSONObject variant) {
		if (!variant.keySet().containsAll(constraintJsonVariantKeys))
			return false;
		JSONArray fragments = variant.getJSONArray(ConstantsJSON.FRAGMENTS);
		for (int j = 0; j<fragments.length(); j++)
			validateConstraintJsonVariantFragment(fragments.getJSONObject(j));
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
	private static boolean validateConstraintJsonVariantFragment(JSONObject fragment) {
		return fragment.keySet().containsAll(constraintJsonVariantfragmentJsonKeys1) || fragment.keySet().containsAll(constraintJsonVariantfragmentJsonKeys2);
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
	public static boolean validateQueryJson(JSONObject queryjson) {
		Set<String> keySet = queryjson.keySet(); 
		if (!keySet.containsAll(queryJsonKeys))
			return false;
		if (queryjson.optString(ConstantsJSON.TECHNOLOGY).equals(Constants.XML))
			return keySet.containsAll(queryXmlJsonKeys);
		return true;
	}

	// ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TEMPLATEFOLDER + "/" + ServletConstants.PATTERNJSONFOLDER + "/" + templateId + ".json";
	public static boolean validateTemplateJson(JSONObject templateJson) {
		return validateConstraintJson(templateJson);
	}

	// ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TEMPLATEFOLDER + "/" + ServletConstants.VARIANTJSONFOLDER + "/" + templateId + ".json";
	static Set<String> templateVariantsKeys =  Set.of(
			ConstantsJSON.VARIANTS,
			ConstantsJSON.PARAMETER
		);
	public static boolean validateTemplateVariantJson(JSONObject variantJson) {
		if (!variantJson.keySet().containsAll(templateVariantsKeys))
			return false;
		JSONArray variants = variantJson.getJSONArray(ConstantsJSON.VARIANTS);
		for (int i = 0; i<variants.length(); i++)
			if (!validateTemplateVariantJsonVariant(variants.getJSONObject(i)))
				return false;
		JSONObject params = variantJson.getJSONObject(ConstantsJSON.PARAMETER);
		for (String key: params.keySet())
			if (!validateTemplateVariantJsonParam(params.getJSONObject(key)))
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
	private static boolean validateTemplateVariantJsonVariant(JSONObject variant) {
		if (!variant.keySet().containsAll(templateVariantsVariantKeys))
			return false;
		JSONArray fragments = variant.getJSONArray(ConstantsJSON.FRAGMENTS);
		for (int i = 0; i<fragments.length(); i++)
			if(!validateTemplateVariantJsonFragment(fragments.getJSONObject(i)))
				return false;
		return true;
	}
	

	static Set<String> templateVariantJsonFragmentKeys1 = Set.of(ConstantsJSON.TEXT);
	static Set<String> templateVariantJsonFragmentKeys2 = Set.of(
			ConstantsJSON.NEWID,
			ConstantsJSON.NAME,
			ConstantsJSON.PARAMETER
		);
	private static boolean validateTemplateVariantJsonFragment(JSONObject fragment) {
		return fragment.keySet().containsAll(templateVariantJsonFragmentKeys1) || fragment.keySet().containsAll(templateVariantJsonFragmentKeys2);
	}

	static Set<String> templateVariantsParamKeys =  Set.of(
			ConstantsJSON.ROLE,
			ConstantsJSON.ID,
			ConstantsJSON.TYPE
		);
	private static boolean validateTemplateVariantJsonParam(JSONObject params) {
		return params.keySet().containsAll(templateVariantsParamKeys);
	}
}

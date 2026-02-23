package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.json.JSONArray;
import org.json.JSONObject;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.utility.ConstantsJSON;

@SuppressWarnings("serial")
public class VariantsServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int callId = ServletUtilities.logCall("GET", this.getClass().getName(), path, params);
		try {
			JSONObject result = applyGet(path, params);
			ServletUtilities.putResponse(response, callId, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	public static JSONObject applyGet (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 2 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for requesting the variants: "
					+ "GET /variants/{technology}"
					+ "(not /variants" + path + ")");
		}
		String technology = pathparts[1];
		JSONObject result = new JSONObject();
		JSONArray variants = getVariantJSONs(technology);
		
		// filter_by
		if (parameterMap.containsKey(ConstantsJSON.API_FILTER_BY)) {
			String[] filter_by_raw = parameterMap.get(ConstantsJSON.API_FILTER_BY);
			JSONObject filter_by = new JSONObject(filter_by_raw[0]);
			result.put(ConstantsJSON.API_FILTER_BY, filter_by);
			
			JSONArray filtered = new JSONArray();
			for (int i = 0; i < variants.length(); i++) {
				JSONObject variant = variants.getJSONObject(i);
				if (filterJSONObject(variant, filter_by)) {
					filtered.put(variant);
				}
			}
			variants = filtered;
		}
		result.put(ConstantsJSON.SIZE, variants.length());

		// group_by
		if (!parameterMap.containsKey(ConstantsJSON.API_GROUP_BY)) {
			return result.put(ConstantsJSON.VARIANTS, variants);
		} else {
			String[] group_by_raw = parameterMap.get(ConstantsJSON.API_GROUP_BY);
			result.put(ConstantsJSON.API_GROUP_BY, new JSONArray(group_by_raw[0]));
			JSONArray group_by = new JSONArray(group_by_raw[0]);
			JSONObject grouped = groupVariantsBy(variants, group_by);
			return result.put(ConstantsJSON.VARIANTS, grouped);
		}
	}

	private static JSONArray getVariantJSONs(String technology) {
		List<JSONObject> templates = ServletUtilities.getTemplateJSONs(technology);
		JSONArray variants = new JSONArray();
		for (JSONObject template: templates) {
			List<JSONObject> templatevariants = templateJSONToVariantJSONs(template);
			variants.putAll(templatevariants);
		}
		return variants;
	}

	private static List<JSONObject> templateJSONToVariantJSONs(JSONObject template) {
		List<JSONObject> variants = new BasicEList<JSONObject>();
		JSONArray variantsArray = template.getJSONArray(ConstantsJSON.VARIANTS);
		for (int i = 0; i<variantsArray.length(); i++) {
			JSONObject variant = variantsArray.getJSONObject(i);
			
			variant.put(ConstantsJSON.CONSTRAINT_ID, template.optString(ConstantsJSON.CONSTRAINT_ID));
			variant.put(ConstantsJSON.TEMPLATE, template.optString(ConstantsJSON.NAME));
			variant.put(ConstantsJSON.NAMESPACES, template.optJSONObject(ConstantsJSON.NAMESPACES));
			variant.put(ConstantsJSON.DESCRIPTION, template.optJSONObject(ConstantsJSON.DESCRIPTION));
			variant.put(ConstantsJSON.TECHNOLOGY, template.optString(ConstantsJSON.LANGUAGE));
			variant.put(ConstantsJSON.LANGUAGE, template.optString(ConstantsJSON.LANGUAGE));
			variant.put(ConstantsJSON.EXECUTABLE_QUERY, template.optString(ConstantsJSON.EXECUTABLE_QUERY));
			variant.put(ConstantsJSON.EXECUTABLE_FILTER, template.optString(ConstantsJSON.EXECUTABLE_FILTER));
			variant.put(ConstantsJSON.EXECUTABLE_MQAF, template.optString(ConstantsJSON.EXECUTABLE_MQAF));
			variant.put(ConstantsJSON.EXECUTABLE, template.optString(ConstantsJSON.EXECUTABLE));
			
			variants.add(variant);
		}
		return variants;
	}

	private static boolean filterJSONObject(JSONObject object, JSONObject filter_by) {
		for (String key : filter_by.keySet()) {
			if (!filterJSONObject(object, key, filter_by.optString(key)))
				return false;
		}
		return true;
	}

	private static boolean filterJSONObject(JSONObject object, String key, String value) {
		JSONArray values = getValueArray(object, key);
		if (values != null)
			for (int i = 0; i<values.length(); i++) {
				if (values.optString(i).equals(value))
					return true;
			}
		return false;
	}

	private static JSONArray getValueArray(JSONObject object, String key) {
		return getValueArray(object, key.split("\\."));
	}

	private static JSONArray getValueArray(JSONObject object, String[] keys) {
		if (keys.length < 1 )
			return null;
		if (object.has(keys[0])) {
			Object subobject = object.opt(keys[0]);
			if (keys.length == 1) {
				if (subobject instanceof JSONArray)
					return (JSONArray) subobject;
				if (subobject instanceof String)
					return new JSONArray().put((String) subobject);
			}
			if (keys.length > 1) {
				if (subobject instanceof JSONObject) {
					return getValueArray((JSONObject) subobject, Arrays.copyOfRange(keys, 1, keys.length));
				}
			}
		}
		return null;
	}

	private static JSONObject groupVariantsBy(JSONArray variants, JSONArray group_by) {
		if (group_by.isEmpty() || variants.isEmpty())
			return null;
		JSONObject result = new JSONObject();
		for (int i = 0; i<variants.length(); i++) {
			JSONObject variant = variants.optJSONObject(i);
			JSONArray values = getValueArray(variant, group_by.getString(0));
			if (values == null || values.isEmpty()) {
				if (result.has(ConstantsJSON.NOGROUP)) {
					result.getJSONArray(ConstantsJSON.NOGROUP).put(variant);
				} else {
					result.put(ConstantsJSON.NOGROUP, new JSONArray().put(variant));
				}
			} else {
				for (int j = 0; j<values.length(); j++) {
					String valj = values.getString(j);
					if (result.has(valj)) {
						result.getJSONArray(valj).put(variant);
					} else {
						result.put(valj, new JSONArray().put(variant));
					}
				}
			}
		}
		group_by.remove(0);
		if (group_by.length() > 0) {
			JSONObject temp = new JSONObject();
			for (String key: result.keySet()) {
				JSONArray variantgroup = result.optJSONArray(key);
				JSONObject variantgrouped = groupVariantsBy(variantgroup, group_by);
				temp.put(key, variantgrouped);
			}
			result = temp;
		}
		return result;
	}
}

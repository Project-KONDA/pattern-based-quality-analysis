package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
import qualitypatternmodel.utility.Util;

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

		// order_by
		if (parameterMap.containsKey(ConstantsJSON.API_ORDER_BY)) {
			orderVariants(variants, parameterMap.get(ConstantsJSON.API_ORDER_BY)[0]);
		}

		// group_by
		if (!parameterMap.containsKey(ConstantsJSON.API_GROUP_BY)) {
			result.put(ConstantsJSON.VARIANTS, variants);
			result.put(ConstantsJSON.SIZE, variants.length());
			result.put(ConstantsJSON.TOTAL, getVariantsTotal(variants));
		} else {
			String[] group_by_raw = parameterMap.get(ConstantsJSON.API_GROUP_BY);
			JSONArray group_by = new JSONArray(group_by_raw[0]);
			JSONObject grouped = groupVariantsBy(variants, group_by);
			result.put(ConstantsJSON.API_GROUP_BY, new JSONArray(group_by_raw[0]));
			result.put(ConstantsJSON.VARIANTS, grouped);
			result.put(ConstantsJSON.SIZE, variants.length());
			result.put(ConstantsJSON.TOTAL, getVariantsTotal(grouped));
		}
		return result;
	}

	private static JSONObject orderJson = null;
	private static int getCount(JSONObject item, String order) {
		String templateId = item.optString(ConstantsJSON.TEMPLATE_ID);
		String variantId = item.optString(ConstantsJSON.NAME);
		if (templateId == null || variantId == null)
			return 0;
		String name = templateId + "_" + variantId;
		if (orderJson == null)
			return 0;
		JSONObject created, deleted, executed;
		switch (order) {
		case "created":
			created = orderJson.optJSONObject(ConstantsJSON.COUNTER_CREATE);
			if (created == null)
				return 0;
			return created.optInt(name, 0);
		case "deleted":
			deleted = orderJson.optJSONObject(ConstantsJSON.COUNTER_DELETE);
			if (deleted == null)
				return 0;
			return deleted.optInt(name, 0);
		case "executed":
			executed = orderJson.optJSONObject(ConstantsJSON.COUNTER_EXECUTE);
			if (executed == null)
				return 0;
			return executed.optInt(name, 0);
		case "existing":
			created = orderJson.optJSONObject(ConstantsJSON.COUNTER_CREATE);
			deleted = orderJson.optJSONObject(ConstantsJSON.COUNTER_DELETE);
			if (created == null)
				return 0;
			if (deleted == null)
				return created.optInt(name, 0);
			return Math.max(created.optInt(name, 0) - deleted.optInt(name, 0), 0);
		}
		return 0;
	}
	
	private static void orderVariants(JSONArray variants, String order) {
		try {
			orderJson = Util.loadJson(ServletConstants.COUNTFILE);
		} catch (IOException e) {
			ServletUtilities.logError(e);
		}

	    List<JSONObject> list = new ArrayList<JSONObject>();
	    for (int i = 0; i < variants.length(); i++) {
	        list.add(variants.getJSONObject(i));
	    }
	    list.sort(Comparator.comparingInt(obj -> - getCount(obj, order)));
	    for (int i = 0; i < list.size(); i++) {
	    	variants.put(i, list.get(i));
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
		JSONObject templateInfo = new JSONObject();

		templateInfo.put(ConstantsJSON.CONSTRAINT_ID, template.optString(ConstantsJSON.CONSTRAINT_ID));
		templateInfo.put(ConstantsJSON.NAME, template.optString(ConstantsJSON.NAME));
		templateInfo.put(ConstantsJSON.DESCRIPTION, template.optString(ConstantsJSON.DESCRIPTION));
		templateInfo.put(ConstantsJSON.NAMESPACES, template.optJSONObject(ConstantsJSON.NAMESPACES));
		templateInfo.put(ConstantsJSON.TECHNOLOGY, template.optString(ConstantsJSON.LANGUAGE));
		templateInfo.put(ConstantsJSON.LANGUAGE, template.optString(ConstantsJSON.LANGUAGE));
		templateInfo.put(ConstantsJSON.EXECUTABLE_QUERY, template.optString(ConstantsJSON.EXECUTABLE_QUERY));
		templateInfo.put(ConstantsJSON.EXECUTABLE_FILTER, template.optString(ConstantsJSON.EXECUTABLE_FILTER));
		templateInfo.put(ConstantsJSON.EXECUTABLE_MQAF, template.optString(ConstantsJSON.EXECUTABLE_MQAF));
		templateInfo.put(ConstantsJSON.EXECUTABLE, template.optString(ConstantsJSON.EXECUTABLE));

		for (int i = 0; i<variantsArray.length(); i++) {
			JSONObject variant = variantsArray.getJSONObject(i);
			variant.put(ConstantsJSON.TEMPLATE_ID, template.optString(ConstantsJSON.CONSTRAINT_ID));
			variant.put(ConstantsJSON.TEMPLATE, templateInfo);
			variants.add(variant);
		}
		return variants;
	}

	private static int getVariantsTotal(Object json) {
		if (json instanceof JSONArray)
			return ((JSONArray) json).length();
		else {
			JSONObject obj = (JSONObject) json;
			int sum = 0;
			for (String key: obj.keySet()) {
				sum += getVariantsTotal(obj.get(key));
			}
			return sum;
		}
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
			return new JSONObject().put(ConstantsJSON.NOGROUP, variants);
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
		if (group_by.length() > 1) {
			JSONObject temp = new JSONObject();
			group_by.remove(0);
			
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

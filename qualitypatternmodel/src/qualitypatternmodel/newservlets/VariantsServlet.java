package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

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
			ObjectNode result = applyGet(path, params);
			ServletUtilities.putResponse(response, callId, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	public static ObjectNode applyGet (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException {
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
			result.set(ConstantsJSON.VARIANTS, variants);
			result.put(ConstantsJSON.SIZE, variants.size());
			result.put(ConstantsJSON.TOTAL, getVariantsTotal(variants));
		} else {
			String[] group_by_raw = parameterMap.get(ConstantsJSON.API_GROUP_BY);
			JSONArray group_by = new JSONArray(group_by_raw[0]);
			ObjectNode grouped = groupVariantsBy(variants, group_by);
			result.set(ConstantsJSON.API_GROUP_BY, group_by);
			result.set(ConstantsJSON.VARIANTS, grouped);
			result.put(ConstantsJSON.SIZE, variants.size());
			result.put(ConstantsJSON.TOTAL, getVariantsTotal(grouped));
		}
		return result;
	}

	private static ObjectNode orderJson = null;
	private static int getCount(ObjectNode item, String order) {
		String templateId = item.path(ConstantsJSON.TEMPLATE_ID).asText(null);
		String variantId = item.path(ConstantsJSON.NAME).asText(null);
		if (templateId == null || variantId == null)
			return 0;
		String name = templateId + "_" + variantId;
		if (orderJson == null)
			return 0;
		ObjectNode created, deleted, executed;
		switch (order) {
		case "created":
			created = (ObjectNode) orderJson.get(ConstantsJSON.COUNTER_CREATE);
			if (created == null)
				return 0;
			return created.path(name).asInt(0);
		case "deleted":
			deleted = (ObjectNode) orderJson.get(ConstantsJSON.COUNTER_DELETE);
			if (deleted == null)
				return 0;
			return deleted.path(name).asInt(0);
		case "executed":
			executed = (ObjectNode) orderJson.get(ConstantsJSON.COUNTER_EXECUTE);
			if (executed == null)
				return 0;
			return executed.path(name).asInt(0);
		case "existing":
			created = (ObjectNode) orderJson.get(ConstantsJSON.COUNTER_CREATE);
			deleted = (ObjectNode) orderJson.get(ConstantsJSON.COUNTER_DELETE);
			if (created == null)
				return 0;
			if (deleted == null)
				return created.path(name).asInt(0);
			return Math.max(created.path(name).asInt(0) - deleted.path(name).asInt(0), 0);
		}
		return 0;
	}
	
	private static void orderVariants(ArrayNode variants, String order) {
		try {
			orderJson = Util.loadJson(ServletConstants.COUNTFILE);
		} catch (IOException e) {
			ServletUtilities.logError(e);
		}

	    List<ObjectNode> list = new ArrayList<ObjectNode>();
	    for (int i = 0; i < variants.size(); i++) {
	        list.add((ObjectNode) variants.get(i));
	    }
	    list.sort(Comparator.comparingInt(obj -> - getCount(obj, order)));
	    for (int i = 0; i < list.size(); i++) {
	    	variants.set(i, list.get(i));
	    }
	}



	private static JSONArray getVariantJSONs(String technology) {
		List<JSONObject> templates = ServletUtilities.getTemplateJSONs(technology);
		JSONArray variants = new JSONArray();
		for (ObjectNode template: templates) {
			List<ObjectNode> templatevariants = templateJSONToVariantJSONs(template);
			for (ObjectNode variant : templatevariants) variants.add(variant);
		}
		return variants;
	}

	private static List<JSONObject> templateJSONToVariantJSONs(JSONObject template) {
		List<JSONObject> variants = new BasicEList<JSONObject>();
		JSONArray variantsArray = template.getJSONArray(ConstantsJSON.VARIANTS);
		JSONObject templateInfo = new JSONObject();

		templateInfo.put(ConstantsJSON.CONSTRAINT_ID, template.path(ConstantsJSON.CONSTRAINT_ID).asText());
		templateInfo.put(ConstantsJSON.NAME, template.path(ConstantsJSON.NAME).asText());
		templateInfo.put(ConstantsJSON.DESCRIPTION, template.path(ConstantsJSON.DESCRIPTION).asText());
		templateInfo.set(ConstantsJSON.NAMESPACES, template.get(ConstantsJSON.NAMESPACES));
		templateInfo.put(ConstantsJSON.TECHNOLOGY, template.path(ConstantsJSON.LANGUAGE).asText());
		templateInfo.put(ConstantsJSON.LANGUAGE, template.path(ConstantsJSON.LANGUAGE).asText());
		templateInfo.set(ConstantsJSON.EXECUTABLE_QUERY, template.get(ConstantsJSON.EXECUTABLE_QUERY));
		templateInfo.set(ConstantsJSON.EXECUTABLE_FILTER, template.get(ConstantsJSON.EXECUTABLE_FILTER));
		templateInfo.set(ConstantsJSON.EXECUTABLE_MQAF, template.get(ConstantsJSON.EXECUTABLE_MQAF));
		templateInfo.set(ConstantsJSON.EXECUTABLE, template.get(ConstantsJSON.EXECUTABLE));

		for (int i = 0; i<variantsArray.size(); i++) {
			ObjectNode variant = (ObjectNode) variantsArray.get(i);
			variant.put(ConstantsJSON.TEMPLATE_ID, template.path(ConstantsJSON.CONSTRAINT_ID).asText());
			variant.set(ConstantsJSON.TEMPLATE, templateInfo);
			variants.add(variant);
		}
		return variants;
	}

	private static int getVariantsTotal(Object json) {
		if (json instanceof ArrayNode)
			return ((ArrayNode) json).size();
		else {
			ObjectNode obj = (ObjectNode) json;
			int sum = 0;
			for (String key: obj.keySet()) {
				sum += getVariantsTotal(obj.get(key));
			}
			return sum;
		}
	}

	private static boolean filterJSONObject(JSONObject object, JSONObject filter_by) {
		for (String key : filter_by.keySet()) {
			if (!filterObjectNode(object, key, filter_by.path(key).asText()))
				return false;
		}
		return true;
	}

	private static boolean filterObjectNode(ObjectNode object, String key, String value) {
		ArrayNode values = getValueArray(object, key);
		if (values != null)
			for (int i = 0; i<values.size(); i++) {
				if (values.get(i).asText().equals(value))
					return true;
			}
		return false;
	}

	private static ArrayNode getValueArray(ObjectNode object, String key) {
		return getValueArray(object, key.split("\\."));
	}

	private static ArrayNode getValueArray(ObjectNode object, String[] keys) {
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
				if (subobject instanceof ObjectNode) {
					return getValueArray((ObjectNode) subobject, Arrays.copyOfRange(keys, 1, keys.length));
				}
			}
		}
		return null;
	}

	private static ObjectNode groupVariantsBy(ArrayNode variants, ArrayNode group_by) {
		if (group_by.isEmpty() || variants.isEmpty())
			return new JSONObject().put(ConstantsJSON.NOGROUP, variants);
		JSONObject result = new JSONObject();
		for (int i = 0; i<variants.size(); i++) {
			ObjectNode variant = (ObjectNode) variants.get(i);
			ArrayNode values = getValueArray(variant, group_by.get(0).asText());
			if (values == null || values.isEmpty()) {
				if (result.has(ConstantsJSON.NOGROUP)) {
					((ArrayNode) result.get(ConstantsJSON.NOGROUP)).add(variant);
				} else {
					ArrayNode group = new com.fasterxml.jackson.databind.ObjectMapper().createArrayNode();
					group.add(variant);
					result.set(ConstantsJSON.NOGROUP, group);
				}
			} else {
				for (int j = 0; j<values.size(); j++) {
					String valj = values.get(j).asText();
					if (result.has(valj)) {
						((ArrayNode) result.get(valj)).add(variant);
					} else {
						ArrayNode group = new com.fasterxml.jackson.databind.ObjectMapper().createArrayNode();
						group.add(variant);
						result.set(valj, group);
					}
				}
			}
		}
		if (group_by.size() > 1) {
			ObjectNode temp = new com.fasterxml.jackson.databind.ObjectMapper().createObjectNode();
			group_by.remove(0);
			
			java.util.Iterator<String> keys = result.fieldNames();
			while (keys.hasNext()) {
				String key = keys.next();
				ArrayNode variantgroup = (ArrayNode) result.get(key);
				ObjectNode variantgrouped = groupVariantsBy(variantgroup, group_by);
				temp.set(key, variantgrouped);
			}
			result = temp;
		}
		return result;
	}
}

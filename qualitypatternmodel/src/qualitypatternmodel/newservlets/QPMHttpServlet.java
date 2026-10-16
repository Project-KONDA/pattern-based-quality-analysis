package qualitypatternmodel.newservlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;

@SuppressWarnings("serial")
public abstract class QPMHttpServlet extends HttpServlet {

	protected String getAllowedRole() {
		return null;
	}

    protected boolean isEnabled() {
    	String allowed = getAllowedRole();
    	return allowed == null || ServletConstants.ROLE_ALL.equals(allowed) || ServletConstants.ROLE.equals(allowed);
    }

    protected boolean isDisabled() {
    	return !isEnabled();
    }

	public static void putResponse(HttpServletResponse response, int id, String text) throws IOException {
		putResponse(response, id, text, HttpServletResponse.SC_OK);
	}

	public static void putResponse(HttpServletResponse response, int id, JSONArray jsonArray) throws IOException {
		putResponse(response, id, jsonArray, HttpServletResponse.SC_OK);
	}

	public static void putResponse(HttpServletResponse response, int id, JSONObject jsonObject) throws IOException {
		putResponse(response, id, jsonObject, HttpServletResponse.SC_OK);
	}

	public static void putResponseError(HttpServletResponse response, int id, Exception error, int responseCode) throws IOException {
		ServletUtilities.logError(error);
		JSONObject object = new JSONObject();
		try {
			object.put("error", error.getMessage());
		} catch (JSONException e) {
			ServletUtilities.logError(e);
		}
		putResponse(response, id, object, responseCode);
	}

	public static void putResponseError(HttpServletResponse response, int id, Exception error) throws IOException {
		int responseCode = HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
		if (error.getClass().equals(InvalidServletCallException.class)) {
			responseCode = HttpServletResponse.SC_BAD_REQUEST;
		}
		if (error.getClass().equals(FailedServletCallException.class)) {
			responseCode = HttpServletResponse.SC_NOT_FOUND;
		}
		QPMHttpServlet.putResponseError(response, id, error, responseCode);
	}

	public static void putResponse(HttpServletResponse response, int id, File file, int responseCode, String contentType) throws IOException {

		if (file == null || !file.exists()) {
		    response.sendError(HttpServletResponse.SC_NOT_FOUND, "File not found");
		    return;
		}

	    response.setStatus(responseCode);
	    response.setContentType(contentType);
	    response.setHeader("Content-Disposition", "attachment; filename=\"" + file.getName() + "\"");
	    response.setContentLengthLong(file.length());

	    try (InputStream in = new FileInputStream(file);
	            OutputStream out = response.getOutputStream()) {
	    	byte[] buffer = new byte[8192];
	        int bytesRead;
	        while ((bytesRead = in.read(buffer)) != -1) {
	        	out.write(buffer, 0, bytesRead);
	        }
	        out.flush();
	    }
	}

	public static void putResponseUnlogged(HttpServletResponse response, Object object, int responseCode) throws IOException {
		response.setStatus(responseCode);
		if (object instanceof JSONArray || object instanceof JSONObject) {
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(object.toString());
			return;
		}
		if (object instanceof String) {
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			response.setStatus(responseCode);
		}
	}

	public static void putResponse(HttpServletResponse response, int id, Object object, int responseCode) throws IOException {
		logOutput(object, id);
		QPMHttpServlet.putResponseUnlogged(response, object, responseCode);
	}

	private static void logOutput(Object object, int id) {
		String value;
		if (object instanceof String) {
			value = (String) object;
		} else {
			value = object.toString();
		}
		ServletUtilities.log("OUTPUT " + id + " : " + value);
	}

	public void log(String text) {
		ServletUtilities.log(text);
	}

	public static Map<String, String[]>  jsonToMap(JSONObject map) {
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		for (String key: map.keySet()) {
			if (map.get(key) instanceof JSONArray) {
				JSONArray array = map.getJSONArray(key);
				String[] values = new String[array.length()];
				for (int i = 0; i<array.length(); i++) {
					values[i] = array.get(i).toString();
				}
				parameterMap.put(key, values);
			} else {
				parameterMap.put(key, new String[]{map.get(key).toString()});
			}
		}
		return parameterMap;
	}

	public static JSONObject mapToJSON(Map<String, String[]> map) {
		JSONObject job = new JSONObject();
		for (String key : map.keySet()) {
			try {
				String[] vals = map.get(key);
				if (vals.length == 1) {
					job.put(key, vals[0]);
				} else {
					JSONArray jarr = new JSONArray(vals);
					job.put(key, jarr);
				}
			} catch (JSONException e) {
				ServletUtilities.logError(e);
			}
		}
		return job;
	}

	public static int logCall(String method, String clazz, String path, Map<String, String[]> params) {
		return logCall(method, clazz, path, QPMHttpServlet.mapToJSON(params));
	}

	public static int logCall(String method, String clazz, String path, JSONObject params) {
		int callId = ServletUtilities.getNewCallID();
		ServletUtilities.log("CALL " + callId + ": " + method + " "+ clazz + "(" + path + ") " + params);
		return callId;
	}

}

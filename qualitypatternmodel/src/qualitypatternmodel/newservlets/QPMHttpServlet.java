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
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.ConflictServletCallException;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.ForbiddenServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InternalServletCallException;
import qualitypatternmodel.utility.ConstantsError;

@SuppressWarnings("serial")
public abstract class QPMHttpServlet extends HttpServlet {
	
	@FunctionalInterface
	public interface ServletCall {
	    Object apply(String path, Map<String, String[]> params) throws InvalidServletCallException, FailedServletCallException, ForbiddenServletCallException, ConflictServletCallException, InternalServletCallException, IOException;
	}

	public void handleRequest(HttpServletRequest request, HttpServletResponse response, String method, ServletCall handler) throws IOException {
		if (isDisabled()) {
			putResponseUnlogged(response, ConstantsError.SERVLET_CALL_DISABLED, HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return;
		}
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int  callId = logCall(method, this.getClass().getName(), path, params);
		try {
			Object result = handler.apply(path, params);
			putResponse(response, callId, result);
		}
		catch (Exception e) {
			putResponseError(response, callId, e);
		}
	}
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	    handleRequest(request, response, "GET", this::applyGet);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	    handleRequest(request, response, "POST", this::applyPost);
	}
	
	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
	    handleRequest(request, response, "PUT", this::applyPut);
	}
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
	    handleRequest(request, response, "DELETE", this::applyDelete);
	}

	
	public Object applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, ForbiddenServletCallException, ConflictServletCallException, InternalServletCallException, IOException {
		throw new ForbiddenServletCallException(ConstantsError.SERVLET_CALL_UNSUPPORTED);
	}
	
	public Object applyPost(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, ForbiddenServletCallException, ConflictServletCallException, InternalServletCallException, IOException {
		throw new ForbiddenServletCallException(ConstantsError.SERVLET_CALL_UNSUPPORTED);
	}
	
	public Object applyPut(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, ForbiddenServletCallException, ConflictServletCallException, InternalServletCallException, IOException {
		throw new ForbiddenServletCallException(ConstantsError.SERVLET_CALL_UNSUPPORTED);
	}
	
	public Object applyDelete(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, ForbiddenServletCallException, ConflictServletCallException, InternalServletCallException, IOException {
		throw new ForbiddenServletCallException(ConstantsError.SERVLET_CALL_UNSUPPORTED);
	}

	abstract protected String getAllowedRole();

    protected boolean isEnabled() {
    	String allowed = getAllowedRole();
    	return allowed == null || ServletConstants.ROLE_ALL.equals(allowed) || ServletConstants.ROLE.equals(allowed);
    }

    protected boolean isDisabled() {
    	return !isEnabled();
    }

    // RESPONSE HANDLING

	public static void putResponse(HttpServletResponse response, int id, Object obj) throws IOException {
		putResponse(response, id, obj, HttpServletResponse.SC_OK);
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
		else if (error.getClass().equals(FailedServletCallException.class)) {
			responseCode = HttpServletResponse.SC_NOT_FOUND;
		}
		else if (error.getClass().equals(ForbiddenServletCallException.class)) {
			responseCode = HttpServletResponse.SC_METHOD_NOT_ALLOWED;
		}
		else if (error.getClass().equals(ConflictServletCallException.class)) {
			responseCode = HttpServletResponse.SC_CONFLICT;
		}
		else if (error.getClass().equals(InternalServletCallException.class)) {
			responseCode = HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
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

// JSON

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

// LOGGING

	public static int logCall(String method, String clazz, String path, Map<String, String[]> params) {
		return logCall(method, clazz, path, QPMHttpServlet.mapToJSON(params));
	}

	public static int logCall(String method, String clazz, String path, JSONObject params) {
		int callId = ServletUtilities.getNewCallID();
		ServletUtilities.log("CALL " + callId + ": " + method + " "+ clazz + "(" + path + ") " + params);
		return callId;
	}

}

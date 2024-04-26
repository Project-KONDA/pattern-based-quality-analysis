package qualitypatternmodel.newservlets;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaquery.impl.JavaFilterImpl;

@SuppressWarnings("serial")
public class TemplateExecuteServlet extends HttpServlet {
	
	// .. /template/execute {"files": filename-string , "constraints": <constraint-json>}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			String result = applyGet(path, params);
			ServletUtilities.logOutput(result);
			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_OK);
		}
		catch (InvalidServletCallException e) {
			ServletUtilities.logError(e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
			ServletUtilities.logError(e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (Exception e) {
			ServletUtilities.logError(e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateQueryServlet.doGet(" + path + ")\"}");
	}

	public static String applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		
		// get parameters
		String[] filepaths = parameterMap.get("files");
		String[] constraintstrings = parameterMap.get("constraints");
		
		// setup
		ArrayList<JSONObject> constraints = new ArrayList<JSONObject>();
		ArrayList<String> failedconstraints = new ArrayList<String>();
		ArrayList<String> files = new ArrayList<String>();
		ArrayList<String> filesnotfound = new ArrayList<String>();
		JSONArray results = new JSONArray();

		// transform constraint parameters
		for (String constraint: constraintstrings) {
			try {
				JSONObject object = new JSONObject(constraint);
				if (!object.has("query") || !object.has("technology") || !object.has("language") || !object.get("technology").equals("XQuery")) 
					failedconstraints.add(constraint);
				else 
					constraints.add(object);
			} catch (JSONException e) {
				failedconstraints.add(constraint);
			}
		}

		// verify file existence
		for (String filepath: filepaths) {
			File file = getFileFromFilename(filepath);
			if (file.exists())
				files.add(filepath);
			else
				filesnotfound.add(filepath);
		}
		
		// query
		for (String file: files) {
			for (JSONObject constraint: constraints) {
				try {
					results.put(queryFileToJSONArray(file, constraint));
				} catch (JSONException e) {
					throw new FailedServletCallException();
				}
			}
		}
		return results.toString();
	}
	
	private static File getFileFromFilename(String filename) {
		String sharedVolume = System.getenv("SHARED_VOLUME");
		File file = new File(sharedVolume + "/" + filename);
		return file;
	}
	
	private static JSONObject queryFileToJSONArray (String filepath, JSONObject constraint) throws JSONException, FailedServletCallException {
		JSONObject object = new JSONObject();
		
		object.put("file", filepath);
		object.put("constraintID", constraint.getString("id"));
		object.put("constraintName", constraint.getString("name"));
		
		String query = constraint.getString("query");
		
		List<String> rawResults;
		try {
			rawResults = query(filepath, query);
		} catch (InvalidityException e) {
			throw new FailedServletCallException();
		}
		List<String> result = null;
		
		if (constraint.has("filter")) {
			String filterstring = constraint.getString("filter");
			JavaFilter filter;
			try {
				filter = JavaFilterImpl.fromJson(filterstring);
				filter.createInterimResultContainerXQuery(rawResults);
				result = filter.filterQueryResults();
			} catch (InvalidityException e) {
				if (constraint.has("id"))
					throw new FailedServletCallException("Invalid filter in " + constraint.getString("id"));
				else 
					throw new FailedServletCallException("Invalid filter in " + constraint.getString("id"));
			}
		}
		else {
			result = new ArrayList<String>();
			for (Object o: rawResults)
				result.add(o.toString());
		}
		
		if (result == null)
			throw new FailedServletCallException();
		
		object.put("result", result);
		return object;
	}
	
	private static List<String> query(String filepath, String query) throws InvalidityException {
		List<String> results = JavaFilterImpl.executeXQueryJava(query, "tempdb", filepath);
		return results;
	}
}

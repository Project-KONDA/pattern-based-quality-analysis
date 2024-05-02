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
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;

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
			ServletUtilities.logError(e.getMessage(), e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
			ServletUtilities.logError(e.getMessage(), e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (Exception e) {
			ServletUtilities.logError(e.getMessage(), e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateQueryServlet.doGet(" + path + ")\"}");
	}

	public static String applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length < 2  || pathparts.length > 2  || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for requesting the database of a constraint: '.. /template/getlist/<technology>/<level>' (not " + path + ")");

		String technology = pathparts[1];
		
		if (technology.equals("xml"))
			return applyGetXml(path, technology, parameterMap);
		else 
			throw new FailedServletCallException("Technology '" + technology + "' currently not supported");
	}

	public static String applyGetXml(String path, String technology, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		// get parameters
		String[] filepaths = parameterMap.get("files");
		String[] constraintsCompiled = parameterMap.get("constraints");
		String[] constraintIDs = parameterMap.get("constraintIDs");
		
		// setup
		ArrayList<JSONObject> constraints = new ArrayList<JSONObject>();
		ArrayList<String> failedconstraints = new ArrayList<String>();
		ArrayList<File> files = new ArrayList<File>();
		ArrayList<String> filesnotfound = new ArrayList<String>();
		JSONArray results = new JSONArray();
		
		// compile constraintIDs
		if (constraintIDs != null) {
			for (String constraintId: constraintIDs) {
				CompletePattern pattern;
				try {
					pattern = ServletUtilities.loadConstraint(technology, constraintId);
					pattern.isValid(AbstractionLevel.CONCRETE);
				// 2 generate query
					JSONObject queryJson = TemplateQueryServlet.generateQueryJson(pattern, technology);
					constraints.add(queryJson);
				} catch (Exception e) {
					failedconstraints.add(constraintId);
					System.err.println(constraintId);
					e.printStackTrace();
				}
			}
		}
		
		// transform constraint parameters
		if (constraintsCompiled != null) {
			for (String constraint: constraintsCompiled) {
				try {
					JSONObject object = new JSONObject(constraint);
					if (!object.has("query") || !object.has("technology") || !object.has("language") || !object.get("language").equals("XQuery") || !object.get("technology").equals("xml"))
						failedconstraints.add(constraint);
					else
						constraints.add(object);
				} catch (JSONException e) {
					failedconstraints.add(constraint);
				}
			}
		}
		
		if (constraints.isEmpty())
			throw new InvalidServletCallException("no valid constraints specified");

		// verify file existence
		if (filepaths != null) {
			for (String filepath: filepaths) {
				File file = new File(ServletUtilities.FILEFOLDER + "/" + filepath);
				if (file.exists()) {
					files.add(file);
					ServletUtilities.log(ServletUtilities.FILEFOLDER + "/" + filepath + " found");
				}				
				else {
					filesnotfound.add(filepath);
					ServletUtilities.log(ServletUtilities.FILEFOLDER + "/" + filepath + " not found");
				}
			}
		}

		if (files.isEmpty())
			throw new InvalidServletCallException("no valid files specified");

		ServletUtilities.log("files found: " + files.size());
		ServletUtilities.log("constraint found: " + constraints.size());
		
		// query
		for (File file: files) {
			for (JSONObject constraint: constraints) {
				try {
					ServletUtilities.log("querying: " + file + " " + constraint);
					JSONObject res = queryFileToJSONObject(file, constraint);
					results.put(res);
					ServletUtilities.log("querying successfull: " + res.length());
				} catch (JSONException e) {
					throw new FailedServletCallException();
				}
			}
		}
		return results.toString();
	}
	
	private static JSONObject queryFileToJSONObject (File file, JSONObject constraint) throws JSONException, FailedServletCallException {
		ServletUtilities.log( "query file [" + file.getAbsolutePath()  + "] with constraint [" + constraint + "]");
		JSONObject object = new JSONObject();
		String query = constraint.getString("query");
		String language = constraint.getString("language");
		String technology = constraint.getString("technology");
		
		object.put("file", file.getName());
		object.put("constraintID", constraint.getString("id"));
		object.put("constraintName", constraint.getString("name"));
		object.put("query", query);
		object.put("language", language);
		object.put("technology", technology);
		
		List<String> rawResults;
		try {
			rawResults = executeXQuery(file, query);
		} catch (InvalidityException e) {
			e.printStackTrace();
			throw new FailedServletCallException("Querying failed", e);
		}
		List<String> result = null;
		
		if (constraint.has("filter")) {
			String filterstring = constraint.getString("filter");
			object.put("filter", filterstring);
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
		object.put("amount", result.size());
		return object;
	}
	
	private static List<String> executeXQuery(File file, String query) throws InvalidityException {
		ServletUtilities.log( "query file [" + file  + "] with query [" + query + "]");
		List<String> results = JavaFilterImpl.executeXQueryJava(query, "tempdb", file.getAbsolutePath());
		return results;
	}
}

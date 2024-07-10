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
import qualitypatternmodel.utility.Constants;

@SuppressWarnings("serial")
public class ConstraintExecuteServlet extends HttpServlet {
	
	// GET .. /constraint/execute    /<technology>    {"files": filename-string , "constraints": <constraint-json>, "constraintIDs": <constraint-ids>}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			JSONArray result = applyGet(path, params);
			ServletUtilities.putResponse(response, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, e);
		}
	}

	public static JSONArray applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length < 2  || pathparts.length > 2  || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for requesting the database of a constraint: '.. /template/getlist/<technology>/<level>' (not " + path + ")");

		String technology = pathparts[1];
		
		if (technology.equals(Constants.XML))
			return applyGetXml(path, technology, parameterMap);
		else 
			throw new FailedServletCallException("Technology '" + technology + "' currently not supported");
	}

	public static JSONArray applyGetXml(String path, String technology, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		// get parameters
		String[] filepaths = parameterMap.get(Constants.JSON_FILES);
		String[] constraintsCompiled = parameterMap.get(Constants.JSON_CONSTRAINTS);
		String[] constraintIDs = parameterMap.get(Constants.JSON_CONSTRAINT_IDS);
		
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
					JSONObject queryJson = ConstraintQueryServlet.generateQueryJson(pattern, technology);
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
					if (!object.has(Constants.JSON_QUERY) || !object.has(Constants.JSON_TECHNOLOGY) || !object.has(Constants.JSON_LANGUAGE) || !object.get(Constants.JSON_LANGUAGE).equals(Constants.XQUERY) || !object.get(Constants.JSON_TECHNOLOGY).equals(Constants.XML))
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
		
		JSONObject object = new JSONObject();
		try {
			object.put(Constants.JSON_RESULT, results);
			if (!failedconstraints.isEmpty())
				object.put(Constants.JSON_FAILEDCONSTRAINTS, failedconstraints);
			if (!filesnotfound.isEmpty())
				object.put(Constants.JSON_FAILEDFILES, filesnotfound);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return results;
	}
	
	private static JSONObject queryFileToJSONObject (File file, JSONObject constraint) throws JSONException, FailedServletCallException {
		ServletUtilities.log( "query file [" + file.getAbsolutePath()  + "] with constraint [" + constraint + "]");
		JSONObject object = new JSONObject();
		String query = constraint.getString(Constants.JSON_QUERY);
		String language = constraint.getString(Constants.JSON_LANGUAGE);
		String technology = constraint.getString(Constants.JSON_TECHNOLOGY);
		
		object.put(Constants.JSON_FILE, file.getName());
		object.put(Constants.JSON_CONSTRAINT_ID, constraint.getString(Constants.JSON_ID));
		object.put(Constants.JSON_CONSTRAINT_NAME, constraint.getString(Constants.JSON_NAME));
		object.put(Constants.JSON_QUERY, query);
		object.put(Constants.JSON_LANGUAGE, language);
		object.put(Constants.JSON_TECHNOLOGY, technology);
		
		List<String> rawResults;
		try {
			rawResults = executeXQuery(file, query);
		} catch (InvalidityException e) {
			e.printStackTrace();
			throw new FailedServletCallException("Querying failed", e);
		}
		List<String> result = null;
		
		if (constraint.has(Constants.JSON_FILTER)) {
			String filterstring = constraint.getString(Constants.JSON_FILTER);
			object.put(Constants.JSON_FILTER, filterstring);
			JavaFilter filter;
			try {
				filter = JavaFilterImpl.fromJson(filterstring);
				filter.createInterimResultContainerXQuery(rawResults);
				result = filter.filterQueryResults();
			} catch (InvalidityException e) {
				if (constraint.has(Constants.JSON_ID))
					throw new FailedServletCallException("Invalid filter in " + constraint.getString(Constants.JSON_ID));
				else 
					throw new FailedServletCallException("Invalid filter in " + constraint.toString());
			}
		}
		else {
			result = new ArrayList<String>();
			for (String res: rawResults)
				result.add(res);
		}
		
		if (result == null)
			throw new FailedServletCallException();
		
		object.put(Constants.JSON_RESULT, result);
		object.put(Constants.JSON_SIZE, result.size());
		return object;
	}
	
	private static List<String> executeXQuery(File file, String query) throws InvalidityException {
		ServletUtilities.log( "query file [" + file  + "] with query [" + query + "]");
		List<String> results = JavaFilterImpl.executeXQueryJava(query, "tempdb", file.getAbsolutePath());
		return results;
	}
}

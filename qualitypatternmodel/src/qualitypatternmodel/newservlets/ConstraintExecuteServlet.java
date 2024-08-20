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
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsJSON;

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
		if (pathparts.length < 2  || pathparts.length > 2  || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for executing constraints: "
					+ "GET '/constraint/execute/{technology}' "
					+ "(not /constraint/execute/{" + path + ")");
		}

		String technology = pathparts[1];

		if (technology.equals(Constants.XML)) {
			return applyGetXml(path, technology, parameterMap);
		} else {
			throw new FailedServletCallException("Technology '" + technology + "' currently not supported");
		}
	}

	public static JSONArray applyGetXml(String path, String technology, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		// get parameters
		String[] filepaths = parameterMap.get(ConstantsJSON.FILES);
		String[] constraintsCompiled = parameterMap.get(ConstantsJSON.CONSTRAINTS);
		String[] constraintIDs = parameterMap.get(ConstantsJSON.CONSTRAINT_IDS);

		// setup
		ArrayList<JSONObject> constraints = new ArrayList<JSONObject>();
		ArrayList<File> files = new ArrayList<File>();
		ArrayList<JSONObject> failed = new ArrayList<JSONObject>();
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
					JSONObject jobject = new JSONObject();
					try {
						jobject.put(constraintId, e.getMessage());
					} catch (JSONException f) {}
					failed.add(jobject);
				}
			}
		}

		// transform constraint parameters
		if (constraintsCompiled != null) {
			for (String constraint: constraintsCompiled) {
				try {
					JSONObject object = new JSONObject(constraint);
					if (!object.has(ConstantsJSON.QUERY)) {
						JSONObject jobject = new JSONObject();
						jobject.put(constraint, ConstantsError.NO_QUERY);
						failed.add(jobject);
					}
					else if (!object.has(ConstantsJSON.TECHNOLOGY) || !object.get(ConstantsJSON.TECHNOLOGY).equals(Constants.XML)) {
						JSONObject jobject = new JSONObject();
						jobject.put(constraint, ConstantsError.INVALID_TECHNOLOGY);
						failed.add(jobject);
					}
					else if (!object.has(ConstantsJSON.LANGUAGE) || !object.get(ConstantsJSON.LANGUAGE).equals(Constants.XQUERY)) {
						JSONObject jobject = new JSONObject();
						jobject.put(constraint, ConstantsError.INVALID_LANGUAGE);
						failed.add(jobject);
					} else {
						constraints.add(object);
					}
				} catch (JSONException e) {
					JSONObject jobject = new JSONObject();
					try {
						jobject.put(constraint, e.getMessage());
					} catch (JSONException f) {}
					failed.add(jobject);
				}
			}
		}

		if (constraints.isEmpty()) {
			throw new InvalidServletCallException(ConstantsError.INVALID_CONSTRAINTS);
		}

		// verify file existence
		if (filepaths != null) {
			for (String filepath: filepaths) {
				File file = new File(ServletConstants.FILE_VOLUME + "/" + filepath);
				if (file.exists()) {
					files.add(file);
					ServletUtilities.log(ServletConstants.FILE_VOLUME + "/" + filepath + " found");
				}
				else {
					ServletUtilities.log(ServletConstants.FILE_VOLUME + "/" + filepath + " not found");
					JSONObject jobject = new JSONObject();
					try {
						jobject.put(filepath, ConstantsError.NOT_FOUND_FILEPATH);
					} catch (JSONException f) {}
					failed.add(jobject);
				}
			}
		}

		if (files.isEmpty()) {
			throw new InvalidServletCallException(ConstantsError.INVALID_FILES);
		}

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
					throw new FailedServletCallException("JSON Error: " + e.getMessage(), e);
				}
			}
		}

		JSONObject object = new JSONObject();
		try {
			object.put(ConstantsJSON.RESULT, results);
			if (!failed.isEmpty()) {
				object.put(ConstantsJSON.FAILED, failed);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return results;
	}

	private static JSONObject queryFileToJSONObject (File file, JSONObject constraint) throws JSONException, FailedServletCallException {
		ServletUtilities.log( "query file [" + file.getAbsolutePath()  + "] with constraint [" + constraint + "]");
		JSONObject object = new JSONObject();
		String query = constraint.getString(ConstantsJSON.QUERY);
		String language = constraint.getString(ConstantsJSON.LANGUAGE);
		String technology = constraint.getString(ConstantsJSON.TECHNOLOGY);

		object.put(ConstantsJSON.FILE, file.getName());
		object.put(ConstantsJSON.CONSTRAINT_ID, constraint.getString(ConstantsJSON.CONSTRAINT_ID));
		object.put(ConstantsJSON.CONSTRAINT_NAME, constraint.getString(ConstantsJSON.NAME));
		object.put(ConstantsJSON.QUERY, query);
		object.put(ConstantsJSON.LANGUAGE, language);
		object.put(ConstantsJSON.TECHNOLOGY, technology);

		List<String> rawResults;
		try {
			rawResults = executeXQuery(file, query);
		} catch (InvalidityException e) {
			e.printStackTrace();
			throw new FailedServletCallException(ConstantsError.QUERY_FAILED, e);
		}
		List<String> result = null;

		if (constraint.has(ConstantsJSON.FILTER)) {
			String filterstring = constraint.getString(ConstantsJSON.FILTER);
			object.put(ConstantsJSON.FILTER, filterstring);
			JavaFilter filter;
			try {
				filter = JavaFilterImpl.fromJson(filterstring);
				filter.createInterimResultContainerXQuery(rawResults);
				result = filter.filterQueryResults();
			} catch (InvalidityException e) {
				if (constraint.has(ConstantsJSON.CONSTRAINT_ID)) {
					throw new FailedServletCallException("Invalid filter in " + constraint.getString(ConstantsJSON.CONSTRAINT_ID));
				} else {
					throw new FailedServletCallException("Invalid filter in " + constraint.toString());
				}
			}
		}
		else {
			result = new ArrayList<String>();
			for (String res: rawResults) {
				result.add(res);
			}
		}

		if (result == null) {
			throw new FailedServletCallException();
		}

		object.put(ConstantsJSON.RESULT, result);
		object.put(ConstantsJSON.SIZE, result.size());
		return object;
	}

	private static List<String> executeXQuery(File file, String query) throws InvalidityException {
		ServletUtilities.log( "query file [" + file  + "] with query [" + query + "]");
		List<String> results = JavaFilterImpl.executeXQueryJava(query, "tempdb", file.getAbsolutePath());
		return results;
	}
}

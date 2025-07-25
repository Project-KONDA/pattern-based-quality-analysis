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
		int  callId = ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			JSONObject result = applyGet(path, params);
			ServletUtilities.putResponse(response, callId, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	public static JSONObject applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
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

	public static JSONObject applyGetXml(String path, String technology, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		// get parameters
		String[] filepaths = parameterMap.get(ConstantsJSON.FILES);
		String[] constraintsCompiled = parameterMap.get(ConstantsJSON.CONSTRAINTS);
		String[] constraintIDs = parameterMap.get(ConstantsJSON.CONSTRAINT_IDS);

		// setup
		ArrayList<JSONObject> constraints = new ArrayList<JSONObject>();
		ArrayList<File> files = new ArrayList<File>();
		JSONObject failedConstraints = new JSONObject();
		JSONObject failedFiles = new JSONObject();
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
					try {
						failedConstraints.put(constraintId, ConstantsError.INVALID_CONSTRAINT);
					} catch (JSONException f) {}
					ServletUtilities.log("Constraint " + constraintId + " not valid: " + e.getMessage());
				}
			}
		}

		// transform constraint parameters
		if (constraintsCompiled != null) {
			for (String constraint: constraintsCompiled) {
				try {
					String constraintID;
					JSONObject object = new JSONObject(constraint);
					if (!object.has(ConstantsJSON.CONSTRAINT_ID)) {
						failedConstraints.put(constraint, ConstantsError.INVALID_FILEFORMAT);
						ServletUtilities.log("Constraint not valid: " + ConstantsError.INVALID_FILEFORMAT);
						break;
					} else {
						constraintID = object.getString(ConstantsJSON.CONSTRAINT_ID);
					}

					if (!object.has(ConstantsJSON.QUERY)) {
						failedConstraints.put(constraintID, ConstantsError.NO_QUERY);
						ServletUtilities.log("Constraint " + constraintID + " not valid: " + ConstantsError.NO_QUERY);
					}
					else if (!object.has(ConstantsJSON.TECHNOLOGY) || !object.get(ConstantsJSON.TECHNOLOGY).equals(Constants.XML)) {
						failedConstraints.put(constraintID, ConstantsError.INVALID_TECHNOLOGY);
						ServletUtilities.log("Constraint " + constraintID + " not valid: " + ConstantsError.INVALID_TECHNOLOGY);
					}
					else if (!object.has(ConstantsJSON.LANGUAGE) || !object.get(ConstantsJSON.LANGUAGE).equals(Constants.XQUERY)) {
						failedConstraints.put(constraintID, ConstantsError.INVALID_LANGUAGE);
						ServletUtilities.log("Constraint " + constraintID + " not valid: " + ConstantsError.INVALID_LANGUAGE);
					} else {
						constraints.add(object);
					}
				} catch (JSONException e) {
					try {
						failedConstraints.put("invalid", e.getMessage());
						ServletUtilities.log("Constraint not valid: " + e.getMessage());
					} catch (JSONException f) {}
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
					try {
						failedFiles.put(filepath, ConstantsError.NOT_FOUND_FILEPATH);
					} catch (JSONException f) {}
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
			if (!failedFiles.isEmpty()) {
				object.put(ConstantsJSON.FAILEDFILES, failedFiles);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		try {
			if (!failedConstraints.isEmpty()) {
				object.put(ConstantsJSON.FAILEDCONSTRAINTS, failedConstraints);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return object;
	}

	private static JSONObject queryFileToJSONObject (File file, JSONObject constraint) throws JSONException, FailedServletCallException {
		ServletUtilities.log( "query file [" + file.getAbsolutePath()  + "] with constraint [" + constraint + "]");
		
		JSONObject object = new JSONObject();
		object.put(ConstantsJSON.FILE, file.getName());
		object.put(ConstantsJSON.CONSTRAINT_ID, constraint.getString(ConstantsJSON.CONSTRAINT_ID));
		object.put(ConstantsJSON.CONSTRAINT_NAME, constraint.getString(ConstantsJSON.NAME));

		String query = constraint.getString(ConstantsJSON.QUERY);
		String query_partial = constraint.getString(ConstantsJSON.QUERY_PARTIAL);
//		String technology = constraint.getString(ConstantsJSON.TECHNOLOGY);
//		String language = constraint.getString(ConstantsJSON.LANGUAGE);
//		object.put(ConstantsJSON.QUERY, query);
//		object.put(ConstantsJSON.QUERY_PARTIAL, query_partial);
//		object.put(ConstantsJSON.LANGUAGE, language);
//		object.put(ConstantsJSON.TECHNOLOGY, technology);

		int total;
		try {
			List<String> totalResults;
//			rawResults = executeXQuery(file, query);
			totalResults = executeXQuery(file, query_partial);
			total = totalResults.size();
		} catch (InvalidityException e) {
			e.printStackTrace();
			throw new FailedServletCallException(ConstantsError.QUERY_FAILED, e);
		}
		List<String> result = null;

		if (!constraint.has(ConstantsJSON.FILTER)) {
			try {
				result = executeXQuery(file, query);
			} catch (InvalidityException e) {
				throw new FailedServletCallException ("Failed to execute constraint", e);
			}
		} else {
			try {
				JSONObject filterjson = constraint.getJSONObject(ConstantsJSON.FILTER);
				JavaFilter filter = JavaFilterImpl.fromJson(filterjson);
				result =  filter.execute(file.getCanonicalPath());
			} catch (JSONException | InvalidityException | IOException e) {
				throw new FailedServletCallException ("Failed to execute constraint", e);
			}
		}

		if (result == null) {
			throw new FailedServletCallException("result is null");
		}

		object.put(ConstantsJSON.INCIDENTS, result);
		object.put(ConstantsJSON.TOTAL_FINDINGS, total);
		object.put(ConstantsJSON.TOTAL_INCIDENCES, result.size());
		object.put(ConstantsJSON.TOTAL_COMPLIANCES, total - result.size());
		return object;
	}

	private static List<String> executeXQuery(File file, String query) throws InvalidityException {
		ServletUtilities.log( "query file [" + file  + "] with query [" + query + "]");
		List<String> results = JavaFilterImpl.executeXQueryJava(query, file.getAbsolutePath());
		return results;
	}
}

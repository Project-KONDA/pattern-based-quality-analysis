package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.ConstantsXml;
import qualitypatternmodel.utility.Util;
import qualitypatternmodel.utility.xmlprocessors.XQueryProcessorBaseX;
import qualitypatternmodel.utility.xmlprocessors.XQueryProcessorSaxon;

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
		List<String> filepaths = Arrays.asList(parameterMap.get(ConstantsJSON.FILES));
		String[] constraintsCompiled = parameterMap.get(ConstantsJSON.CONSTRAINTS);
		String[] constraintIDs = parameterMap.get(ConstantsJSON.CONSTRAINT_IDS);

		// setup
		ArrayList<JSONObject> constraints = new ArrayList<JSONObject>();
		JSONObject failedConstraints = new JSONObject();

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
				String constraintID = "<invalid>";
				try {
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
						failedConstraints.put(constraintID, e.getMessage());
						ServletUtilities.log("Constraint not valid: " + e.getMessage());
					} catch (JSONException f) {}
				}
			}
		}

		if (constraints.isEmpty()) {
			throw new InvalidServletCallException(ConstantsError.INVALID_CONSTRAINTS);
		}
		
		JSONObject result;
		switch (Util.EXECUTION_PROCESSOR) {
		case ConstantsXml.PROCESSOR_BASEX:
			result = XQueryProcessorBaseX.queryConstraints(constraints, filepaths);
			break;
		case ConstantsXml.PROCESSOR_SAXON:
			result = XQueryProcessorSaxon.saxonExecuteXQueries(constraints, filepaths);
			break;
		default:
			throw new FailedServletCallException(Util.EXECUTION_PROCESSOR + " is not a valid XQuery Processor Option");
		}

		for (String failedid: failedConstraints.keySet()) {
			result.getJSONObject(ConstantsJSON.FAILEDCONSTRAINTS).put(failedid, failedConstraints.get(failedid));
		}
		return result;
	}
}

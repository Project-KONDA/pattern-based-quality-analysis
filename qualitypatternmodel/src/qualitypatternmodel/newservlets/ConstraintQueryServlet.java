package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsJSON;

@SuppressWarnings("serial")
public class ConstraintQueryServlet extends QPMHttpServlet {

	@Override
	protected String getAllowedRole() {
		return ServletConstants.ROLE_MANAGEMENT;
	}

	// GET .. /constraint/query    /<technology>/<constraintId>
	// GET .. /constraint/query    /<technology>    {"constraints":<constraint-ids>}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int  callId = logCall("GET", this.getClass().getName(), path, params);
		try {
			JSONObject result = applyGet(path, params);
			putResponse(response, callId, result);
		}
		catch (Exception e) {
			putResponseError(response, callId, e);
		}
	}

	@Override
	public JSONObject applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (!(pathparts.length == 2 && parameterMap.containsKey(ConstantsJSON.CONSTRAINT_IDS)) && pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for requesting the mqaf constraint for a constraint:"
					+ " GET '/constraint/query/{technology}/{constraintID}' or '/constraint/query/{technology}' [" + ConstantsJSON.CONSTRAINT_IDS + "]"
					+ "(not /constraint/query" + path + ")");
		}
		String technology = pathparts[1];
		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}
		
		if (pathparts.length == 3) {
			String constraintId = pathparts[2];
			return calculateGet(technology, new String[] { constraintId });
			
		} else {
			String[] constraintIds = parameterMap.get(ConstantsJSON.CONSTRAINT_IDS) != null? parameterMap.get(ConstantsJSON.CONSTRAINT_IDS) : new String[0];
			return calculateGet(technology, constraintIds);
		}
	}

	public static JSONObject calculateGet(String technology, String[] constraintIds) throws InvalidServletCallException, FailedServletCallException {

		JSONObject result = new JSONObject();
		JSONArray failed = new JSONArray();

		for (String constraintId: constraintIds) {
			// 1 load constraint
//			CompletePattern pattern;
			try {
//				pattern = ServletUtilities.loadConstraint(technology, constraintId);
//				pattern.isValid(AbstractionLevel.CONCRETE);
//			// 2 generate query
//				JSONObject queryJson = generateQueryJson(pattern, technology);
				JSONObject queryJson = ServletUtilities.loadConstraintQueryJson(technology, constraintId);
				result.append(ConstantsJSON.CONSTRAINTS, queryJson);
			} catch (Exception e) {
				ServletUtilities.logError(e);
				JSONObject object = new JSONObject();
				try {
					object.put(constraintId, e.getMessage());
				} catch (JSONException f) {}
				failed.put(object);
			}
		}
		try {
			result.put(ConstantsJSON.FAILED, failed);
		} catch (JSONException e) {}
		return result;
	}
}

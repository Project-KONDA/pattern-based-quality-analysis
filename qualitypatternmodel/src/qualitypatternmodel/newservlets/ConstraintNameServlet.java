package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsJSON;

@SuppressWarnings("serial")
public class ConstraintNameServlet extends HttpServlet {

	// POST .. /constraint/name    /<technology>/<constraintID>    {"name":<name>}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try{
			JSONObject result = applyPost(path, params);
			ServletUtilities.putResponse(response, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, e);
		}
	}

	public static JSONObject applyPost (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong url for setting a database in a constraint: '.. /template/setparameter/<technology>/<name>/' (not " + path + ")");
		}

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		String[] newNameArray = parameterMap.get(ConstantsJSON.NAME);
		if (newNameArray == null || newNameArray.length != 1 || newNameArray[0].equals("")) {
			throw new InvalidServletCallException(ConstantsError.INVALID_VALUE);
		}
		String newName = newNameArray[0];

		// 1. load Pattern
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(technology, constraintId);
		} catch (IOException e) {
			throw new FailedServletCallException("404 Requested pattern '" + constraintId + "' does not exist");
		}

		// 2. change name
		String oldName = pattern.getName();
		pattern.setName(newName);

		// 3. save constraint
		String timestamp = null;
		try {
			timestamp = ServletUtilities.saveConstraint(technology, constraintId, pattern);
		} catch (IOException e) {
			throw new FailedServletCallException(ConstantsError.SAVING_FAILED);
		}

		JSONObject result = new JSONObject();
		try {
			result.put(ConstantsJSON.CONSTRAINT_ID, pattern.getPatternId());
			result.put(ConstantsJSON.OLD_NAME, oldName);
			result.put(ConstantsJSON.NAME, newName);
			result.put(ConstantsJSON.LASTSAVED, timestamp);
		} catch (JSONException e) {}

		return result;
//		return "Name of constraint updated successfully from '" + oldName + "' to '" + newName + "'.";
	}
}

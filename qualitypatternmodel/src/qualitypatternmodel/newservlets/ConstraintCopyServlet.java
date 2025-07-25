package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

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
public class ConstraintCopyServlet extends HttpServlet {

	// PUT .. /constraint/copy    /<technology>/<constraintID>

	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int callId = ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			JSONObject result = applyPut(path, params);
			ServletUtilities.putResponse(response, callId, result);
		}
		catch (FailedServletCallException e) {
	        if (e.getMessage().startsWith("404")) {
				ServletUtilities.putResponseError(response, callId, new FailedServletCallException(e.getMessage().substring(4)), HttpServletResponse.SC_NOT_FOUND);
			} else if (e.getMessage().startsWith("409")) {
				ServletUtilities.putResponseError(response, callId, new FailedServletCallException(e.getMessage().substring(4)), HttpServletResponse.SC_CONFLICT);
			} else {
				ServletUtilities.putResponseError(response, callId, e, HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			}
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	public static JSONObject applyPut (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for copying a constraint: "
					+ "PUT /constraint/copy/{technology}/{constraintID} "
					+ "(not /constraint/copy/" + path + ")");
		}

		String technology = pathparts[1];
		String oldID = pathparts[2];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		// 1 load constraint with old name
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(technology, oldID);
		}
		catch (Exception e) {
			throw new FailedServletCallException("404 Requested pattern '" + oldID + "' does not exist - " + e.getMessage());
		}

		// Optional: set name
		if (parameterMap != null) {
			String[] names = parameterMap.get(ConstantsJSON.NAME);
			if (names != null && names[0] != null) {
				pattern.setName(names[0]);
			}
			String[] datamodel = parameterMap.get(ConstantsJSON.DATAMODEL);
			if (datamodel != null && datamodel[0] != null) {
				pattern.setDataModelName(datamodel[0]);
			}
			String[] database = parameterMap.get(ConstantsJSON.DATABASE);
			if (database != null && database[0] != null) {
				pattern.setDatabaseName(database[0]);
			}
		}

		// 2 create new patternID
		String newID = ServletUtilities.generateNewId(technology, pattern.getAbstractId(), pattern.getText().get(0).getName());

		// 3 change constraint name
		pattern.setPatternId(newID);

		// 4 save constraint
		ServletUtilities.saveConstraint(technology, newID, pattern);

		if (ServletUtilities.loadConstraint(technology, newID) == null) {
			throw new FailedServletCallException(ConstantsError.SAVING_FAILED);
		}

		return ServletUtilities.getPatternJSON(pattern);
	}
}

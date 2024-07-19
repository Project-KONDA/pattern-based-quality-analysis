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

@SuppressWarnings("serial")
public class ConstraintTagServlet extends HttpServlet {

	// POST .. /template/tag    /<technology>/<name>    {"tag": <value>}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			JSONObject result = applyPost(path, params);
			ServletUtilities.logOutput(result);
			ServletUtilities.putResponse(response, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, e);
		}
	}

	// DELETE .. /template/tag    /<technology>/<name>    {"tag": <value>}

	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try{
			JSONObject result = applyDelete(path, params);
			ServletUtilities.logOutput(result);
			ServletUtilities.putResponse(response, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, e);
		}
	}

	public static JSONObject applyPost (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong url for posting tags in a constraint: '.. /constraint/tag/<technology>/<name>/' (not " + path + ")");
		}

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		String[] newTags = parameterMap.get(Constants.JSON_TAG);

		// 1. load constraint
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(technology, constraintId);
		} catch (IOException e) {
			throw new FailedServletCallException("404 Requested pattern '" + constraintId + "' does not exist");
		}

		// 2. add tags to constraint
		JSONObject json = new JSONObject();
		try {
			for (String tag: newTags) {
				JSONObject object = new JSONObject();
				if(pattern.getKeywords().contains(tag)) {
					object.put(tag, Constants.ERROR_DUPLICATE_TAG);
					json.append(Constants.JSON_FAILED, object);
				} else {
					if (pattern.getKeywords().add(tag)) {
						json.append(Constants.JSON_SUCCESS, tag);
					} else {
						object.put(tag, Constants.ERROR_INVALID_TAG);
						json.append(Constants.JSON_FAILED, object);
					}
				}
			}
		} catch (JSONException e) {}

		// 3. save constraint
		String timestamp = null;
		try {
			timestamp = ServletUtilities.saveConstraint(technology, constraintId, pattern);
		} catch (IOException e) {
			throw new FailedServletCallException(Constants.ERROR_SAVING_FAILED);
		}
		try {
			json.put(Constants.JSON_LASTSAVED, timestamp);
		} catch (JSONException e) {}

		return json;
	}

	public static JSONObject applyDelete (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong url for deleting tags in a constraint: '.. /constraint/tag/<technology>/<name>/' (not " + path + ")");
		}

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		String[] deleteTags = parameterMap.get(Constants.JSON_TAG);

		// 1. load constraint
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(technology, constraintId);
		} catch (IOException e) {
			throw new FailedServletCallException("404 Requested pattern '" + constraintId + "' does not exist");
		}

		// 2. remove tags from constraint
		JSONObject json = new JSONObject();
		for (String tag: deleteTags) {
			JSONObject object = new JSONObject();
			try {
				if (!pattern.getKeywords().contains(tag)) {
					object.put(tag, Constants.ERROR_NOT_FOUND_TAG);
					json.append("failed", object);
				} else {
					if (pattern.getKeywords().remove(tag)) {
						json.append("success", tag);
					} else {
						object.put(tag, Constants.ERROR_TAG_DELETION_FAILED);
						json.append("failed", object);
					}
				}
			} catch (JSONException e) {}
		}

		// 3. save constraint
		String timestamp = null;
		try {
			timestamp = ServletUtilities.saveConstraint(technology, constraintId, pattern);
		} catch (IOException e) {
			throw new FailedServletCallException(Constants.ERROR_SAVING_FAILED);
		}
		try {
			json.put(Constants.JSON_LASTSAVED, timestamp);
		} catch (JSONException e) {}

		return json;
	}
}

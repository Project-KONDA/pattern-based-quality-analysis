package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.utility.Constants;

@SuppressWarnings("serial")
public class PatternListServlet extends HttpServlet {

	// GET .. /pattern/list    /<technology>/<level>

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int  callId = ServletUtilities.logCall("GET", this.getClass().getName(), path, params);
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
		if (pathparts.length < 3  || pathparts.length > 4  || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for requesting a list of a constraints or templates: "
					+ "GET '/pattern/list/{technology}/{abstraction}' "
					+ "OR '/pattern/list/{technology}/{abstraction}/{datamodel}'"
					+ "(not /pattern/list" + path + ")");
		}

		String technology = pathparts[1];
		String level = pathparts[2];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}
		if (!Constants.LEVELS.contains(level)) {
			throw new InvalidServletCallException("'" + level + "' is an invalid abstraction level. The levels are: " + Constants.LEVELS);
		}
		
		return getPatternJsons(technology, level);

//		List<CompletePattern> patterns = getPatterns(technology, level);
//
//		if (pathparts.length == 4) {
//			String datamodel = pathparts[3];
//			List<CompletePattern> clone = new ArrayList<CompletePattern>(patterns);
//			for (CompletePattern pattern: clone) {
//				if (pattern.getDataModelName() == null || !pattern.getDataModelName().equals(datamodel)) {
//					patterns.remove(pattern);
//				}
//			}
//		}
//		if (patterns == null) {
//			throw new FailedServletCallException("No " + ((level == Constants.LVLTEMPLATE)? ConstantsJSON.TEMPLATE: ConstantsJSON.CONSTRAINT) + " found for the technology " + technology + " on level " + level + ".");
//		}
//
//		return ServletUtilities.getPatternListJSON(patterns);
	}

//	private static List<CompletePattern> getPatterns(String technology, String level)
//			throws InvalidServletCallException {
//		List<CompletePattern> patterns = null;
//		switch (level) {
//		case Constants.LVLALL:
//			patterns = ServletUtilities.getAllPattern(technology);
//			break;
//		case Constants.LVLTEMPLATE:
//			patterns = ServletUtilities.getTemplates(technology);
//			break;
//		case Constants.LVLCONSTRAINT:
//			patterns = ServletUtilities.getConstraints(technology);
//			break;
//		case Constants.LVLREADY:
//			patterns = ServletUtilities.getReadyConstraints(technology);
//			break;
//		}
//		return patterns;
//	}

	private static JSONObject getPatternJsons(String technology, String level)
			throws InvalidServletCallException {
		List<JSONObject> patterns = null;
		switch (level) {
		case Constants.LVLALL:
			patterns = ServletUtilities.getAllPatternJsons(technology);
			break;
		case Constants.LVLTEMPLATE:
			patterns = ServletUtilities.getTemplateJSONs(technology);
			break;
		case Constants.LVLCONSTRAINT:
			patterns = ServletUtilities.getConstraintJSONs(technology);
			break;
		case Constants.LVLREADY:
			patterns = ServletUtilities.getReadyConstraintJSONs(technology);
			break;
		}
		return ServletUtilities.combinePatternJSONs(patterns);
	}
}

package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.Constants;

@SuppressWarnings("serial")
public class PatternListServlet extends HttpServlet {

	// GET .. /pattern/list    /<technology>/<level>

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			JSONObject result = applyGet(path, params);
			ServletUtilities.logOutput(result);
			ServletUtilities.putResponse(response, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, e);
		}
	}

	public static JSONObject applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length < 3  || pathparts.length > 4  || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong url for requesting the database of a constraint: '.. /template/getlist/<technology>/<level>' (not " + path + ")");
		}

		String technology = pathparts[1];
		String level = pathparts[2];


		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}
		if (!Constants.LEVELS.contains(level)) {
			throw new InvalidServletCallException("'" + level + "' is an invalid abstraction level. The levels are: " + Constants.LEVELS);
		}

		List<CompletePattern> patterns = getPatterns(technology, level);

		if (pathparts.length == 4) {
			String datamodel = pathparts[3];
			List<CompletePattern> clone = new ArrayList<CompletePattern>(patterns);
			for (CompletePattern pattern: clone) {
				if (pattern.getDataModelName() == null || !pattern.getDataModelName().equals(datamodel)) {
					patterns.remove(pattern);
				}
			}
		}
		if (patterns == null) {
			throw new FailedServletCallException("No " + ((level == Constants.LVLTEMPLATE)? Constants.JSON_TEMPLATE: Constants.JSON_CONSTRAINT) + " found for the technology " + technology + " on level " + level + ".");
		}

		return ServletUtilities.getPatternListJSON(patterns);
	}

	private static List<CompletePattern> getPatterns(String technology, String level)
			throws InvalidServletCallException {
		List<CompletePattern> patterns = null;
		switch (level) {
		case Constants.LVLALL:
			patterns = ServletUtilities.getAllPattern(technology);
			break;
		case Constants.LVLTEMPLATE:
			patterns = ServletUtilities.getTemplates(technology);
			break;
		case Constants.LVLCONSTRAINT:
			patterns = ServletUtilities.getConstraints(technology);
			break;
		case Constants.LVLREADY:
			patterns = ServletUtilities.getReadyConstraints(technology);
			break;
		}
		return patterns;
	}
}

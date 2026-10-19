package qualitypatternmodel.newservlets;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsJSON;

@SuppressWarnings("serial")
public class PatternListServlet extends QPMHttpServlet {

	@Override
	protected String getAllowedRole() {
		return ServletConstants.ROLE_MANAGEMENT;
	}

	// GET .. /pattern/list    /<technology>/<level>

	@Override
	public JSONObject applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
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
		
		if (pathparts.length == 3)	
			return getPatternJsons(technology, level);
		else {
			String datamodel = pathparts[3];
			return getPatternJsons(technology, level, datamodel);
			
		}
	}

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

	private static JSONObject getPatternJsons(String technology, String level, String datamodel)
			throws InvalidServletCallException {
		

		List<JSONObject> allTemplates = null;
		switch (level) {
		case Constants.LVLALL:
		case Constants.LVLTEMPLATE:
			throw new InvalidServletCallException("Templates do not have datamodels. Thus they cannot be filtered by datamodel.");
		case Constants.LVLCONSTRAINT:
			allTemplates = ServletUtilities.getConstraintJSONs(technology);
			break;
		case Constants.LVLREADY:
			allTemplates = ServletUtilities.getReadyConstraintJSONs(technology);
			break;
		}

		List<JSONObject> selectedTemplates = new BasicEList<JSONObject>();
		
		for (JSONObject template: allTemplates) {
			if (template.has(ConstantsJSON.DATAMODEL) && datamodel.equals(template.getString(ConstantsJSON.DATAMODEL)))
					selectedTemplates.add(template);
		}
		return ServletUtilities.combinePatternJSONs(selectedTemplates);
	}
}

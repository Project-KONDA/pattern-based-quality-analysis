package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.json.JSONObject;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsJSON;

@SuppressWarnings("serial")
public class TemplateInstantiateServlet extends HttpServlet {

	// PUT .. /template/instantiate    /<technology>/<templateID>/<variantID>

	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int  callId = ServletUtilities.logCall(this.getClass().getName(), path, params);
		try{
			JSONObject result = applyPut(path, params);
			ServletUtilities.putResponse(response, callId, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	public static JSONObject applyPut (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 4 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for instantiate in a constraint: "
					+ "PUT '/template/instantiate/{technology}/{templateID}/{variantID}' "
					+ "(not /template/instantiate" + path + ")");
		}

		// 1 get parameters
		String technology = pathparts[1];
		String templateId = pathparts[2];
		String textid = pathparts[3];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		// 2 load constraint with old name
		CompletePattern pattern = ServletUtilities.loadTemplate(technology, templateId);
		if (pattern == null) {
			throw new FailedServletCallException("404 Requested template '" + templateId + "' does not exist");
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

		// 3 remove unused variants
		boolean instantiated = false;
		for (PatternText t: pattern.getText()) {
			if (t.getName().equals(textid)) {
				try {
					t.instantiate();
					instantiated=true;
					break;
				} catch (InvalidityException e) {
					ServletUtilities.logError(e);
					throw new FailedServletCallException(ConstantsError.VARIANT_INITIALIZATION_FAILED + textid, e);
				}
			}
		}

		if (!instantiated) {
			ArrayList<String> textNames = new ArrayList<String>();
			for (PatternText t: pattern.getText()) {
				textNames.add(t.getName());
			}
			throw new InvalidServletCallException("Variant ID invalid: '" + textid + "' does not exist in " + templateId + ". Available are: " + textNames);
		}

		// 4 create new constraint id
		String constraintId = ServletUtilities.generateNewId(technology, templateId, pattern.getText().get(0).getName());
		pattern.setPatternId(constraintId);

		// 5 save constraint
		try {
			ServletUtilities.saveConstraint(technology, constraintId, pattern);
		} catch (IOException e) {
			throw new FailedServletCallException(ConstantsError.SAVING_FAILED);
		}

		return ServletUtilities.getPatternJSON(pattern);
	}
}
package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import org.json.JSONObject;

import qualitypatternmodel.exceptions.ConflictServletCallException;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.ForbiddenServletCallException;
import qualitypatternmodel.exceptions.InternalServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsJSON;

@SuppressWarnings("serial")
public class ConstraintCopyServlet extends QPMHttpServlet {

	@Override
	protected String getAllowedRole() {
		return ServletConstants.ROLE_MANAGEMENT;
	}

	@Override
	public JSONObject applyPut(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, ForbiddenServletCallException, ConflictServletCallException, InternalServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for copying a constraint: "
					+ "PUT /constraint/copy/{technology}/{constraintID} "
					+ "(not /constraint/copy" + path + ")");
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
			throw new FailedServletCallException("Requested pattern '" + oldID + "' does not exist - " + e.getMessage());
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
		String templateId = pattern.getPatternId();
		String newID = ServletUtilities.generateNewId(technology, templateId, pattern.getText().get(0).getName(), ServletConstants.constraintFolderPath(technology));

		// 3 change constraint name
		pattern.setPatternId(newID);

		// 4 save constraint
		ServletUtilities.saveConstraint(technology, newID, pattern);

		if (ServletUtilities.loadConstraint(technology, newID) == null) {
			throw new ConflictServletCallException(ConstantsError.SAVING_FAILED);
		}

		return ServletUtilities.getPatternJSON(pattern);
	}
}

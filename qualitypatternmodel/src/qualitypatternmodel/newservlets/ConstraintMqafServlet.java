package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import de.gwdg.metadataqa.api.configuration.ConfigurationReader;
import de.gwdg.metadataqa.api.schema.BaseSchema;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.mqaftranslation.MqafTranslation;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsJSON;

@SuppressWarnings("serial")
public class ConstraintMqafServlet extends HttpServlet {

	// GET .. /constraint/mqaf    /<technology>/<constraintId>
	// GET .. /constraint/mqaf    /<technology>    {"constraints":<constraint-ids>}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			int i = path.split("/").length;
			JSONObject result;
			if (i == 2) {
				result = applyGet2(path, params);
			} else if (i == 3) {
				result = applyGet3(path, params);
			} else {
				throw new InvalidServletCallException("Wrong URL for requesting the mqaf constraint:"
						+ " GET '/constraint/mqaf/{technology}' OR '/constraint/mqaf/{technology}/{constraintID}' "
						+ "(not /constraint/mqaf/" + path + ")");
			}
			ServletUtilities.logOutput(result);
			ServletUtilities.putResponse(response, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, e);
		}
	}

	public static JSONObject applyGet3(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for requesting the mqaf constraint for a constraint:"
					+ " GET '/constraint/mqaf/{technology}/{constraintID}' "
					+ "(not /constraint/mqaf/" + path + ")");
		}

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		return getJsonStringSchemaFromConstraintIds(new String[] { constraintId }, technology);
	}


	public static JSONObject applyGet2(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 2 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for requesting the mqaf constraint for multiple constraints:"
					+ " GET '/constraint/mqaf/{technology}' "
					+ "(not /constraint/mqaf/" + path + ")");
		}

		String technology = pathparts[1];
		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		String[] constraintIDs1 = parameterMap.get(ConstantsJSON.CONSTRAINTS);
		if (constraintIDs1 == null)
			constraintIDs1 = new String[0];
		String[] constraintIDs2 = parameterMap.get(ConstantsJSON.CONSTRAINT_IDS);
		if (constraintIDs2 == null)
			constraintIDs2 = new String[0];
		String[] constraintIds = new String[constraintIDs1.length + constraintIDs2.length];
		System.arraycopy(constraintIDs1, 0, constraintIds, 0, constraintIDs1.length);
		System.arraycopy(constraintIDs2, 0, constraintIds, constraintIDs1.length, constraintIDs2.length);

		return getJsonStringSchemaFromConstraintIds(constraintIds, technology);
	}

	private static JSONObject getJsonStringSchemaFromConstraintIds(String[] constraintIds, String technology) throws FailedServletCallException {
		ArrayList<BaseSchema> schemas = new ArrayList<BaseSchema>();
		JSONArray failed = new JSONArray();

		if (constraintIds == null)
			throw new FailedServletCallException ("No valid constraint IDs given!");
		for (String constraintId: constraintIds) {
			// 1 load constraint
			CompletePattern pattern;
			try {
				pattern = ServletUtilities.loadConstraint(technology, constraintId);
				pattern.isValid(AbstractionLevel.CONCRETE);

				// 2 generate mqaf constraint
				BaseSchema schema = MqafTranslation.translateToConstraintSchema(pattern);
				schemas.add(schema);
			} catch (Exception e) {
				JSONObject object = new JSONObject();
				try {
					object.put(constraintId, e.getMessage());
				} catch (JSONException f) {}
				failed.put(object);
			}
		}

		// 3  merge schemas
		BaseSchema mergedSchema = null;
		if (!schemas.isEmpty()) {
			mergedSchema = schemas.get(0);
			for (int i = 1; i < schemas.size(); i++) {
				mergedSchema.merge(schemas.get(i), false);
			}
		}

		// 4 return merged schema as JSON
		JSONObject jobj = new JSONObject();
		try {
			jobj.put(ConstantsJSON.FAILED, failed);
			if (mergedSchema != null) {
				JSONObject constraint = new JSONObject(ConfigurationReader.toJson(mergedSchema));
				jobj.put(ConstantsJSON.CONSTRAINT, constraint);
			}	
		} catch (JSONException e) {}
		return jobj;
	}
}

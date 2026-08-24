package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

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
import qualitypatternmodel.utility.Util;

@SuppressWarnings("serial")
public class ConstraintMqafServlet extends HttpServlet {

	// GET .. /constraint/mqaf    /<technology>/<constraintId>
	// GET .. /constraint/mqaf    /<technology>    {"constraints":<constraint-ids>}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int callId = ServletUtilities.logCall("GET", this.getClass().getName(), path, params);
		try {
			int i = path.split("/").length;
			ObjectNode result;
			if (i == 2) {
				result = applyGet2(path, params);
			} else if (i == 3) {
				result = applyGet3(path, params);
			} else {
				throw new InvalidServletCallException("Wrong URL for requesting the mqaf constraint:"
						+ " GET '/constraint/mqaf/{technology}' OR '/constraint/mqaf/{technology}/{constraintID}' "
						+ "(not /constraint/mqaf" + path + ")");
			}
			ServletUtilities.putResponse(response, callId, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	public static ObjectNode applyGet3(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for requesting the mqaf constraint for a constraint:"
					+ " GET '/constraint/mqaf/{technology}/{constraintID}' "
					+ "(not /constraint/mqaf" + path + ")");
		}

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		return getJsonStringSchemaFromConstraintIds(new String[] { constraintId }, technology);
	}


	public static ObjectNode applyGet2(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 2 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for requesting the mqaf constraint for multiple constraints:"
					+ " GET '/constraint/mqaf/{technology}' "
					+ "(not /constraint/mqaf" + path + ")");
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

	private static ObjectNode getJsonStringSchemaFromConstraintIds(String[] constraintIds, String technology) throws FailedServletCallException {
		ArrayList<BaseSchema> schemas = new ArrayList<BaseSchema>();
		ArrayNode failed = Util.jsonCreateArray();

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
				ObjectNode object = Util.jsonCreateObject();
				try {
					object.put(constraintId, e.getMessage());
				} catch (RuntimeException f) {}
				failed.add(object);
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
		ObjectNode jobj = Util.jsonCreateObject();
		try {
			jobj.set(ConstantsJSON.FAILED, failed);
			if (mergedSchema != null) {
				ObjectNode constraint = Util.jsonCreateObject(ConfigurationReader.toJson(mergedSchema));
				jobj.set(ConstantsJSON.CONSTRAINT, constraint);
			}	
		} catch (RuntimeException | JsonProcessingException e) {}
		return jobj;
	}
}

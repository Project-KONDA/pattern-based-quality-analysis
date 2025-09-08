package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsJSON;

@SuppressWarnings("serial")
public class ConstraintQueryServlet extends HttpServlet {

	// GET .. /constraint/query    /<technology>/<constraintId>
	// GET .. /constraint/query    /<technology>    {"constraints":<constraint-ids>}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int  callId = ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			int i = path.split("/").length;
			JSONObject result = null; // = applyGet(path, params);
			if (i == 2) {
				result = applyGet2(path, params);
			} else if (i == 3) {
				result = applyGet3(path, params);
			} else {
				throw new InvalidServletCallException("Wrong URL for requesting the query of a constraint: "
						+ "' GET '/constraint/query/{technology}/{constraintID}' "
						+ "(not /constraint/query" + path + ")");
			}
			ServletUtilities.putResponse(response, callId, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	public static JSONObject applyGet3(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for requesting the query of a constraint: "
					+ "GET '/constraint/query/{technology}/{constraintID}' "
					+ "OR '/constraint/query/{technology}' "
					+ "(not /constraint/query" + path + ")");
		}

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		String[] constraintIds = new String[] {constraintId};
		return applyGet(technology, constraintIds);
	}

	public static JSONObject applyGet2(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 2 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for requesting the query of multiple constraints: "
					+ "' GET '/constraint/query/{technology}' "
					+ "(not /constraint/query" + path + ")");
		}

		String technology = pathparts[1];
		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		String[] constraintIds = parameterMap.get(ConstantsJSON.CONSTRAINTS);

		Set<String> constraintIdSet = constraintIds == null
		        ? Collections.emptySet() 
		        : new LinkedHashSet<>(Arrays.asList(constraintIds));
		constraintIds = constraintIdSet.toArray(new String[0]);
		return applyGet(technology, constraintIds);
	}

	public static JSONObject applyGet(String technology, String[] constraintIds) throws InvalidServletCallException, FailedServletCallException {

		JSONObject result = new JSONObject();
		JSONArray failed = new JSONArray();

		for (String constraintId: constraintIds) {
			// 1 load constraint
			CompletePattern pattern;
			try {
				pattern = ServletUtilities.loadConstraint(technology, constraintId);
				pattern.isValid(AbstractionLevel.CONCRETE);
			// 2 generate query
				JSONObject queryJson = generateQueryJson(pattern, technology);
				result.append(ConstantsJSON.CONSTRAINTS, queryJson);
			} catch (Exception e) {
				ServletUtilities.logError(e);
				JSONObject object = new JSONObject();
				try {
					object.put(constraintId, e.getMessage());
				} catch (JSONException f) {}
				failed.put(object);
			}
		}
		try {
			result.put(ConstantsJSON.FAILED, failed);
		} catch (JSONException e) {}
		return result;
	}


	static JSONObject generateQueryJson(CompletePattern pattern, String technology) throws JSONException, InvalidServletCallException, FailedServletCallException {
		JSONObject json = new JSONObject();

		json.put(ConstantsJSON.NAME, pattern.getName());
		json.put(ConstantsJSON.CONSTRAINT_ID, pattern.getPatternId());

		// 1 technology
		json.put(ConstantsJSON.TECHNOLOGY, pattern.getLanguage().getLiteral());

		// 2 query
		try {
			if (technology.equals(Constants.XML)) {
				String xquery;
				if (pattern.containsJavaOperator()) {
					JavaFilter filter = pattern.generateQueryFilter();
					JSONObject serializedFilter = filter.toJson();
					json.put(ConstantsJSON.FILTER, serializedFilter);
					xquery = pattern.generateXQueryJava();
				}
				else 
					xquery = pattern.generateXQuery();
				json.put(ConstantsJSON.QUERY, xquery);
				json.put(ConstantsJSON.QUERY_LINE, ServletUtilities.makeQueryOneLine(xquery));
				String xquerypartial = pattern.getPartialXmlQuery();
				json.put(ConstantsJSON.QUERY_PARTIAL, xquerypartial);
				json.put(ConstantsJSON.QUERY_PARTIAL_LINE, ServletUtilities.makeQueryOneLine(xquerypartial));
				json.put(ConstantsJSON.LANGUAGE, Constants.XQUERY);

			} else if (technology.equals(Constants.RDF)) {
				if (pattern.containsJavaOperator()) {
					throw new InvalidServletCallException(ConstantsError.NOT_IMPLEMENTED_RDF);
				}
				json.put(ConstantsJSON.LANGUAGE, Constants.SPARQL);
				String sparql = pattern.generateSparql();
				json.put(ConstantsJSON.QUERY, sparql);
				json.put(ConstantsJSON.QUERY_LINE, ServletUtilities.makeQueryOneLine(sparql));

			} else if (technology.equals(Constants.NEO4J)) {
				if (pattern.containsJavaOperator()) {
					throw new InvalidServletCallException(ConstantsError.NOT_IMPLEMENTED_NEO);
				}
				json.put(ConstantsJSON.LANGUAGE, Constants.CYPHER);
				String cypher = pattern.generateCypher();
				json.put(ConstantsJSON.QUERY, cypher);
				json.put(ConstantsJSON.QUERY_LINE, ServletUtilities.makeQueryOneLine(cypher));

			} else {
				throw new InvalidServletCallException();
			}

		} catch (InvalidityException e) {
			throw new FailedServletCallException("", e);
		}

		// 3 return json
		return json;
	}
}

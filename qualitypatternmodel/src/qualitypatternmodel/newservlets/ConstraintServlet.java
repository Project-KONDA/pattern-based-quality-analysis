package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.Fragment;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.ValueMap;
import qualitypatternmodel.textrepresentation.impl.ValueMapImpl;
import qualitypatternmodel.utility.Constants;

@SuppressWarnings("serial")
public class ConstraintServlet extends HttpServlet {

	// GET .. /constraint    /<technology>/<name>/

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

	// DELETE .. /constraint    /<technology>/<name>/

	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			String result = applyDelete(path, params);
			ServletUtilities.logOutput(result);
			ServletUtilities.putResponse(response, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, e);
		}
	}

	// POST .. /constraint    /<technology>/<name>/

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try{
			JSONObject result = applyPost(path, params);
			ServletUtilities.logOutput(result);
			ServletUtilities.putResponse(response, result);
		}
		catch (FailedServletCallException e) {
	        if (e.getMessage().startsWith("404")) {
				ServletUtilities.putResponseError(response, new FailedServletCallException(e.getMessage().substring(4)), HttpServletResponse.SC_NOT_FOUND);
			} else {
				ServletUtilities.putResponseError(response, e, HttpServletResponse.SC_NOT_MODIFIED);
			}
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, e);
		}
	}

	public static JSONObject applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong url for requesting the database of a constraint: '.. /template/getdatabase/<technology>/<name>' (not " + path + ")");
		}

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!ServletUtilities.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);
		}

		// 1 load constraint
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(technology, constraintId);
//			System.out.println(pattern.myToString());
			pattern.isValid(AbstractionLevel.ABSTRACT);
		} catch (IOException e) {
			throw new FailedServletCallException("constraint '" + constraintId + "'not found", e);
		}
		catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			throw new FailedServletCallException("constraint faulty", e);
		}

		// 2 return json
		return ServletUtilities.getPatternJSON(pattern);
	}

	public static String applyDelete(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong url for deleting a constraint: '.. /template/delete/<technology>/<name>' (not " + path + ")");
		}

		String technology = pathparts[1];
		String patternname = pathparts[2];

		if (!ServletUtilities.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);
		}

		// 1 check if constraint exists
		try {
			if (ServletUtilities.loadConstraint(technology, patternname) == null) {
				throw new FailedServletCallException("Requested pattern '" + patternname + "' does not exist.");
			}
		} catch (Exception e) {
			throw new FailedServletCallException("Requested pattern '" + patternname + "' does not exist.");
		}

		// 2 delete constraint
		try {
			ServletUtilities.deleteConstraint(technology, patternname);
		} catch (IOException e) {
			throw new FailedServletCallException("Deleting constraint '" + patternname + "' failed.");
		}

		return "Constraint deleted successfully.";
	}

	public static JSONObject applyPost (String path, Map<String, String[]> parameter) throws InvalidServletCallException, FailedServletCallException {
		Map<String, String[]> parameterMap = new HashMap<String, String[]>(parameter);
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong url for setting a database in a constraint: '.. /template/setparameter/<technology>/<name>/' (not " + path + ")");
		}

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!ServletUtilities.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);
		}

		// 1. load Pattern
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(technology, constraintId);
		} catch (IOException e) {
			throw new FailedServletCallException("404 Requested pattern '" + constraintId + "' does not exist", e);
		}

		// 2. change patterns
		Boolean name = false, database = false, datamodel = false, namespaces = false;

		// name?
		String[] nameArray = parameterMap.get(Constants.JSON_NAME);
		if (nameArray != null && nameArray.length == 1 && !nameArray[0].equals("")) {
			String newName = nameArray[0];
			pattern.setName(newName);
			name = true;
			parameterMap.remove(Constants.JSON_NAME);
		}
		// database?
		String[] databaseArray = parameterMap.get(Constants.JSON_DATABASE);
		if (databaseArray != null && databaseArray.length == 1 && !databaseArray[0].equals("")) {
			String newDatabase = databaseArray[0];
			pattern.setDatabaseName(newDatabase);
			database = true;
			parameterMap.remove(Constants.JSON_DATABASE);
		}
		// datamodel?
		String[] datamodelArray = parameterMap.get(Constants.JSON_DATAMODEL);
		if (datamodelArray != null && datamodelArray.length == 1 && !datamodelArray[0].equals("")) {
			String newDatamodel = datamodelArray[0];
			pattern.setDataModelName(newDatamodel);
			datamodel = true;
			parameterMap.remove(Constants.JSON_DATAMODEL);
		}
		// namespaces?
		String[] namespacesArray = parameterMap.get(Constants.JSON_NAMESPACES);
		if (namespacesArray != null && namespacesArray.length == 1 && !namespacesArray[0].equals("")) {
			try {
				JSONObject object = new JSONObject(namespacesArray[0]);
				// [{prefix: "", uri:""}]
				if (pattern.getNamespaces() == null) {
					pattern.setNamespaces(new ValueMapImpl());
				}
				ValueMap vm = pattern.getNamespaces();
				vm.clear();
				vm.setValuesFromJSONObject(object);
		        namespaces = true;
				parameterMap.remove(Constants.JSON_NAMESPACES);
			} catch (JSONException e) {
			}
		}

		JSONObject output = changeParameters(pattern, parameterMap);
		try {
			if (name) {
				output.getJSONArray("success").put(Constants.JSON_NAME);
			}
			if (database) {
				output.getJSONArray("success").put(Constants.JSON_DATABASE);
			}
			if (datamodel) {
				output.getJSONArray("success").put(Constants.JSON_DATAMODEL);
			}
			if (namespaces) {
				output.getJSONArray("success").put(Constants.JSON_NAMESPACES);
			}
		} catch (JSONException e) {
		}

		// 3. save constraint
		String timestamp = null;
		try {
			timestamp = ServletUtilities.saveConstraint(technology, constraintId, pattern);
		} catch (IOException e) {
			throw new FailedServletCallException("Failed to save new constraint");
		}
		try {
			output.put(Constants.JSON_LASTSAVED, timestamp);
		} catch (JSONException e) {}

		return output;
	}

	private static JSONObject changeParameters(CompletePattern pattern, Map<String, String[]> parameterMap) {
		//setup
		Set<String> keys = parameterMap.keySet();
		List<Fragment> fragments = pattern.getText().get(0).getFragmentsOrdered();
		List<ParameterFragment> paramfragments = new ArrayList<>();

		for (Fragment frag: fragments) {
			if (frag instanceof ParameterFragment) {
				paramfragments.add((ParameterFragment)frag);
			}
		}

		JSONArray success = new JSONArray();
		JSONArray failed = new JSONArray();
		JSONArray notfound = new JSONArray();
		// change parameters
		for (String key: keys) {
			boolean found = false;
			for (ParameterFragment frag: paramfragments) {
				if (!found && frag.getId().equals(key)) {
					found = true;
					try {
						if (changeParameterFragment(frag, parameterMap.get(key))) {
							success.put(key);
						} else {
							failed.put(key);
						}
					} catch (InvalidityException e) {
						ServletUtilities.logError(e);
						failed.put(key);
					}
				}
			}
			if (!found) {
				notfound.put(key);
			}
		}

		// output
		JSONObject json = new JSONObject();
		try {
			if(success.length() > 0 || keys.size() == 0) {
				json.put("success", success);
			}
			if(failed.length() > 0) {
				json.put("failed", failed);
			}
			if(notfound.length() > 0) {
				json.put("notfound", notfound);
			}
			if(failed.length() > 0 || notfound.length() > 0) {
				JSONArray available = new JSONArray();
				for (ParameterFragment frag: paramfragments) {
					available.put(frag.getId());
				}
				json.put("available", available);
			}

		} catch (JSONException e) {}
		return json;
	}

	private static boolean changeParameterFragment(ParameterFragment frag, String[] call_values) throws InvalidityException {
		if (call_values.length != 1) {
			throw new InvalidityException("multiple values for a single parameter");
		}

		// Old Values
		String oldValue = null;
		try {
			oldValue = frag.getAttributeValue(Constants.JSON_VALUE);
		} catch (InvalidityException e) {}

		// input
		String input = call_values[0];
		JSONObject ob = null;
		try {
			ob = new JSONObject(input);
		} catch (JSONException e) {}

		// case: value is not a json object
		if (ob == null) {
			try {
				frag.setValue(input);
				return true;
			} catch (InvalidityException e) {
				frag.setValue(oldValue);
				e.printStackTrace();
				return false;
			}
		}

		// case: value is a json object

		HashMap<String, String> jsonMap = convertJSONObjectToHashMap(ob);
		for (String key: jsonMap.keySet()) {
			if (key != Constants.JSON_VALUE && key != Constants.JSON_USERVALUE) {
				frag.setAttributeValue(key, jsonMap.get(key));
			}
		}

		if(jsonMap.containsKey(Constants.JSON_CLEAR)) {
			frag.clearValue();
		} else if(jsonMap.containsKey(Constants.JSON_VALUE)) {
			try {
				frag.setValue(jsonMap.get(Constants.JSON_VALUE));
				if (jsonMap.containsKey(Constants.JSON_USERVALUE)) {
					frag.setUserValue(jsonMap.get(Constants.JSON_USERVALUE));
				}
			} catch (InvalidityException e) {
				frag.setValue(oldValue);
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

    public static HashMap<String, String> convertJSONObjectToHashMap(JSONObject jsonObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        @SuppressWarnings("unchecked")
		Iterator<String> keys = jsonObject.keys();

        try {
            while (keys.hasNext()) {
                String key = keys.next();
                String value = jsonObject.get(key).toString();
                hashMap.put(key, value);
            }            return hashMap;
        } catch (JSONException e) {
        	return null;
        }
    }
}

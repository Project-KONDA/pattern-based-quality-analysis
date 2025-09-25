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
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.ValueMap;
import qualitypatternmodel.textrepresentation.impl.ValueMapImpl;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.ConstantsXml;

@SuppressWarnings("serial")
public class ConstraintServlet extends HttpServlet {

	// GET .. /constraint    /<technology>/<name>/

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int  callId = ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			JSONObject result = applyGet(path, params);
			ServletUtilities.putResponse(response, callId, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	// DELETE .. /constraint    /<technology>/<name>/

	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int  callId = ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			String result = applyDelete(path, params);
			ServletUtilities.putResponse(response, callId, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	// POST .. /constraint    /<technology>/<name>/

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int  callId = ServletUtilities.logCall(this.getClass().getName(), path, params);
		try{
			JSONObject result = applyPost(path, params);
			ServletUtilities.putResponse(response, callId, result);
		}
		catch (FailedServletCallException e) {
	        if (e.getMessage().startsWith("404")) {
				ServletUtilities.putResponseError(response, callId, new FailedServletCallException(e.getMessage().substring(4)), HttpServletResponse.SC_NOT_FOUND);
			} else {
				ServletUtilities.putResponseError(response, callId, e, HttpServletResponse.SC_NOT_MODIFIED);
			}
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	public static JSONObject applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for requesting a constraint: "
					+ "GET '/constraint/{technology}/{constraintID}' "
					+ "(not /constraint" + path + ")");
		}

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		// 1 load constraint
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(technology, constraintId);
//			System.out.println(pattern.myToString());
			pattern.isValid(AbstractionLevel.ABSTRACT);
		} catch (IOException e) {
			throw new FailedServletCallException("constraint '" + constraintId + "' not found", e);
		}
		catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			throw new FailedServletCallException(ConstantsError.INVALID_CONSTRAINT, e);
		}

		// 2 return json
		return ServletUtilities.getPatternJSON(pattern);
	}

	public static String applyDelete(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for deleting a constraint: "
					+ "DELETE '/constraint/{technology}/{constraintID}' "
					+ "(not /constraint" + path + ")");
		}

		String technology = pathparts[1];
		String patternname = pathparts[2];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
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
			throw new InvalidServletCallException("Wrong URL for setting parameters in a constraint: "
					+ "POST '/constraint/{technology}/{constraintID}' "
					+ "(not " + path + ")");
		}

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		// 1. load Pattern
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(technology, constraintId);
		} catch (IOException e) {
			throw new FailedServletCallException("404 Requested pattern '" + constraintId + "' does not exist", e);
		}

		// 2. change patterns
		Boolean name = false, database = false, datamodel = false, namespaces = false, namespacevalid = true, custom = false;

		// name?
		String[] nameArray = parameterMap.get(ConstantsJSON.NAME);
		if (nameArray != null && nameArray.length == 1 && !nameArray[0].equals("")) {
			String newName = nameArray[0];
			pattern.setName(newName);
			name = true;
			parameterMap.remove(ConstantsJSON.NAME);
		}
		// database?
		String[] databaseArray = parameterMap.get(ConstantsJSON.DATABASE);
		if (databaseArray != null && databaseArray.length == 1 && !databaseArray[0].equals("")) {
			String newDatabase = databaseArray[0];
			pattern.setDatabaseName(newDatabase);
			database = true;
			parameterMap.remove(ConstantsJSON.DATABASE);
		}
		// datamodel?
		String[] datamodelArray = parameterMap.get(ConstantsJSON.DATAMODEL);
		if (datamodelArray != null && datamodelArray.length == 1 && !datamodelArray[0].equals("")) {
			String newDatamodel = datamodelArray[0];
			pattern.setDataModelName(newDatamodel);
			datamodel = true;
			parameterMap.remove(ConstantsJSON.DATAMODEL);
		}
		// namespaces?
		String[] namespacesArray = parameterMap.get(ConstantsJSON.NAMESPACES);
		if (namespacesArray != null && namespacesArray.length == 1 && !namespacesArray[0].equals("")) {
			try {
				JSONObject object = new JSONObject(namespacesArray[0]);
				// [{prefix: "", uri:""}]
				if (pattern.getNamespaces() == null) {
					pattern.setNamespaces(new ValueMapImpl());
				}
				ValueMap vm = pattern.getNamespaces();
				vm.clear();
				
				Iterator<String> keys = object.keys();
				while (keys.hasNext()) {
					String key = keys.next().toString();
					if (!key.equals("") && !key.matches(ConstantsXml.REGEX_PREFIX)) {
						namespacevalid = false;
						break;
					}
				}
				if (namespacevalid) {
					vm.setValuesFromJSONObject(object);
			        namespaces = true;
				}
				parameterMap.remove(ConstantsJSON.NAMESPACES);
			} catch (JSONException e) {
				ServletUtilities.logError(e);
			}
		}
		// custom?
		String[] customArray = parameterMap.get(ConstantsJSON.CUSTOM);
		if (customArray != null && customArray.length == 1 && !customArray[0].equals("")) {
			String customAddition = nameArray[0];
			try {
				JSONObject addition = new JSONObject(customAddition);
				PatternText text = pattern.getText().get(0);
				text.addToCustom(addition);
				custom = true;
				parameterMap.remove(ConstantsJSON.CUSTOM);
			} catch (Exception e) {
				ServletUtilities.logError(e);
			}
		}

		JSONObject output = changeParameters(pattern, parameterMap);
		try {
			if (name) {
				output.getJSONArray(ConstantsJSON.SUCCESS).put(ConstantsJSON.NAME);
			}
			if (database) {
				output.getJSONArray(ConstantsJSON.SUCCESS).put(ConstantsJSON.DATABASE);
			}
			if (datamodel) {
				output.getJSONArray(ConstantsJSON.SUCCESS).put(ConstantsJSON.DATAMODEL);
			}
			if (namespaces) {
				output.getJSONArray(ConstantsJSON.SUCCESS).put(ConstantsJSON.NAMESPACES);
			}
			if (!namespacevalid) {
				if (output.has(ConstantsJSON.FAILED))
					output.getJSONObject(ConstantsJSON.FAILED).put(ConstantsJSON.NAMESPACES, ConstantsError.INVALID_NAMESPACE_PREFIX);
				else {
					JSONObject failed = new JSONObject();
					failed.put(ConstantsJSON.NAMESPACES, ConstantsError.INVALID_NAMESPACE_PREFIX);
					output.put(ConstantsJSON.FAILED, failed);
				}
			}
			if (custom) {
				output.getJSONArray(ConstantsJSON.SUCCESS).put(ConstantsJSON.CUSTOM);
			}
		} catch (JSONException e) {
			ServletUtilities.logError(e);
		}

		// 3. save constraint
		String timestamp = null;
		try {
			timestamp = ServletUtilities.saveConstraint(technology, constraintId, pattern);
		} catch (IOException e) {
			throw new FailedServletCallException(ConstantsError.SAVING_FAILED);
		}
		try {
			output.put(ConstantsJSON.LASTSAVED, timestamp);
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
		boolean notfound = false;

		// change parameters
		for (String key: keys) {
			boolean found = false;
			for (ParameterFragment frag: paramfragments) {
				if (!found && frag.getId().equals(key)) {
					found = true;
					try {
						changeParameterFragment(frag, parameterMap.get(key));
						success.put(key);
					} catch (InvalidityException e) {
						JSONObject object = new JSONObject();
						try {
							object.put(key, e.getMessage());
						} catch (JSONException f) {}
						failed.put(object);
					}
				}
			}
			if (!found) {
				JSONObject object = new JSONObject();
				try {
					object.put(key, ConstantsError.NOT_FOUND_PARAMETER);
				} catch (JSONException f) {}
				failed.put(object);
				notfound = true;
			}
		}

		// output
		JSONObject json = new JSONObject();
		try {
			if (success.length() > 0 || keys.size() == 0) {
				json.put(ConstantsJSON.SUCCESS, success);
			}
			if (failed.length() > 0) {
				json.put(ConstantsJSON.FAILED, failed);
			}
			if (failed.length() > 0 || notfound) {
				json.put(ConstantsJSON.AVAILABLE, ServletUtilities.getAvailableParams(paramfragments));
			}

		} catch (JSONException e) {}
		return json;
	}
	
	private static void changeParameterFragment(ParameterFragment frag, String[] call_values) throws InvalidityException {
		if (call_values.length != 1) {
			throw new InvalidityException(ConstantsError.TOO_MUCH_VALUES);
		}

		// Old Values
		String oldValue = null;
		try {
			oldValue = frag.getAttributeValue(ConstantsJSON.VALUE);
		} catch (InvalidityException e) {}

		// input
		String input = call_values[0];
		JSONObject ob = null;
		try {
			ob = new JSONObject(input);
		} catch (JSONException e) {}

		// case: value is not a json object
		if (ob == null) {
			frag.setValue(input);
			return;
		}

		// case: value is a json object
		HashMap<String, String> jsonMap = convertJSONObjectToHashMap(ob);
		if (jsonMap == null)
			throw new InvalidityException("Converting JSONObject to HashMap failed: " + ob);
		for (String key: jsonMap.keySet()) {
			if (key != ConstantsJSON.VALUE && key != ConstantsJSON.USERVALUE) {
				frag.setAttributeValue(key, jsonMap.get(key));
			}
		}

		if(jsonMap.containsKey(ConstantsJSON.CLEAR)) {
			frag.clearValue();
		} else if(jsonMap.containsKey(ConstantsJSON.VALUE)) {
			try {
				frag.setValue(jsonMap.get(ConstantsJSON.VALUE));
				if (jsonMap.containsKey(ConstantsJSON.USERVALUE)) {
					frag.setUserValue(jsonMap.get(ConstantsJSON.USERVALUE));
				}
			} catch (InvalidityException e) {
				frag.setValue(oldValue);
				throw e;
			}
		}
	}

    public static HashMap<String, String> convertJSONObjectToHashMap(JSONObject jsonObject) {
    	if (jsonObject == null)
    	  return null;
        HashMap<String, String> hashMap = new HashMap<>();
		Iterator<String> keys = jsonObject.keys();

        try {
            while (keys.hasNext()) {
                String key = keys.next();
                String value = jsonObject.get(key).toString();
                hashMap.put(key, value);
            }
            return hashMap;
        } catch (JSONException e) {
        	return null;
        }
    }
}

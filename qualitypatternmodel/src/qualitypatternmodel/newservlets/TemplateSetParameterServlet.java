package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.Fragment;
import qualitypatternmodel.textrepresentation.ParameterFragment;

@SuppressWarnings("serial")
public class TemplateSetParameterServlet extends HttpServlet {
	
	// .. /template/setparameter   /<technology>/<name>/
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try{
			String result = applyPost(path, params);
			ServletUtilities.logOutput(result);
			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_OK);
		}
		catch (InvalidServletCallException e) {
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (Exception e) {
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
			e.printStackTrace();
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateSetParameterServlet.doPost(" + path + ")\"}");
	}
	
	public static String applyPost (String path, Map<String, String[]> parameter) throws InvalidServletCallException, FailedServletCallException {
		Map<String, String[]> parameterMap = new HashMap<>(parameter);
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for setting a database in a constraint: '.. /template/setparameter/<technology>/<name>/' (not " + path + ")");

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);
		
		// 1. load Pattern
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(technology, constraintId);
		} catch (IOException e) {
			throw new FailedServletCallException("404 Requested pattern '" + constraintId + "' does not exist");
		}
		
		// 2. change patterns
		Boolean name = false, database = false, datamodel = false;
		
		// name?
		String[] nameArray = parameterMap.get("name");
		if (nameArray != null && nameArray.length == 1 && !nameArray[0].equals("")) {
			String newName = nameArray[0];
			pattern.setName(newName);
			name = true;
			parameterMap.remove("name");
		}
		// database?
		String[] databaseArray = parameterMap.get("database");
		if (databaseArray != null && databaseArray.length == 1 && !databaseArray[0].equals("")) {
			String newDatabase = databaseArray[0];
			pattern.setDatabaseName(newDatabase);
			database = true;
			parameterMap.remove("database");
		}
		// datamodel?
		String[] datamodelArray = parameterMap.get("datamodel");
		if (datamodelArray != null && datamodelArray.length == 1 && !datamodelArray[0].equals("")) {
			String newDatamodel = datamodelArray[0];
			pattern.setDataModelName(newDatamodel);
			datamodel = true;
			parameterMap.remove("datamodel");
		}
				
		JSONObject output = changeParameters(pattern, parameterMap);
		try {
			if (name)
				output.getJSONArray("success").put("name");
			if (database)
				output.getJSONArray("success").put("database");
			if (datamodel)
				output.getJSONArray("success").put("datamodel");
		} catch (JSONException e) {
		}
		
		// 3. save constraint
		try {
			ServletUtilities.saveConstraint(technology, constraintId, pattern);
		} catch (IOException e) {
			throw new FailedServletCallException("Failed to save new constraint");
		}
		
//		return "Parametes of constraint '" + constraintId + "' successfully updated.";
		return output.toString();
	}
	
	private static JSONObject changeParameters(CompletePattern pattern, Map<String, String[]> parameterMap) {
		//setup
		Set<String> keys = parameterMap.keySet();
		List<Fragment> fragments = pattern.getText().get(0).getFragmentsOrdered();
		List<ParameterFragment> paramfragments = new ArrayList<ParameterFragment>();
		
		for (Fragment frag: fragments)
			if (frag instanceof ParameterFragment)
				paramfragments.add((ParameterFragment)frag);
		
		JSONArray success = new JSONArray();
		JSONArray failed = new JSONArray();
		
		// change parameters
		for (String key: keys)
			for (ParameterFragment frag: paramfragments)
				if (frag.getId().equals(key))
					if (changeParameterFragment(frag, parameterMap.get(key)))
						success.put(key);
					else
						failed.put(key);
		
		// output
		JSONObject json = new JSONObject();
		try {
			json.put("success", success);
			json.put("failed", failed);
		} catch (JSONException e) {
		}
		return json;
	}
	
	private static boolean changeParameterFragment(ParameterFragment frag, String[] fragvals) {
		boolean result = true;
		for (String val: fragvals) {
			try {
				JSONObject ob = new JSONObject(val);
				try {
					Object value = ob.get("value");
					frag.setValue((String) value);
					ServletUtilities.log(frag.getId() + " value set to '" + value + "'");
				} catch (JSONException e) { // if value not found
				} catch (Exception e1) {
					ServletUtilities.logError(e1);
					result = false;
				}
				try {
					Object userValue = ob.get("userValue");
					frag.setUserValue((String) userValue);
					ServletUtilities.log(frag.getId() + " userValue set to '" + userValue + "'");
				} catch (JSONException e) { // if userValue not found
					
				} catch (Exception e1) {
					ServletUtilities.logError(e1);
					result = false;
				}
			} catch (JSONException e) {
				try {
					frag.setValue(val);
					ServletUtilities.log(frag.getId() + " value set to '" + val + "'");
				} catch (InvalidityException e1) {
					ServletUtilities.logError(e1);
					result = false;
				}
			}
		}
		return result;	
	}
}

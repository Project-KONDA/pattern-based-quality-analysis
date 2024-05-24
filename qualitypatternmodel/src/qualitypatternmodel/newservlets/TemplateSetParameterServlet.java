package qualitypatternmodel.newservlets;

import java.io.IOException;
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
		System.out.println("TemplateSetParameterServlet.doPost(" + path + ")");
		try{
			String result = applyPost(path, params);
			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_OK);
		}
		catch (InvalidServletCallException e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (Exception e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
			e.printStackTrace();
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateSetParameterServlet.doPost(" + path + ")\"}");
	}
	
	public String applyPost (String path, Map<String, String[]> parameter) throws InvalidServletCallException, FailedServletCallException {
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
			pattern = ServletUtilities.loadConstraint(getServletContext(), technology, constraintId);
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
			ServletUtilities.saveConstraint(getServletContext(), technology, constraintId, pattern);
		} catch (IOException e) {
			throw new FailedServletCallException("Failed to save new constraint");
		}
		
//		return "Parametes of constraint '" + constraintId + "' successfully updated.";
		return output.toString();
	}
	
	private JSONObject changeParameters(CompletePattern pattern, Map<String, String[]> parameterMap) {
		Set<String> keys = parameterMap.keySet();
		List<Fragment> fragments = pattern.getText().get(0).getFragmentsOrdered();

		JSONArray success = new JSONArray();
		JSONArray failed = new JSONArray();
		for (String key: keys)
			for (Fragment fragment: fragments)
				if (fragment instanceof ParameterFragment) {
					ParameterFragment frag = (ParameterFragment) fragment;
					if (frag.getName().equals(key)) {
						try {
							String value = parameterMap.get(key)[0];
							frag.setValue(value);
							success.put(key);
						}
						catch (IndexOutOfBoundsException e) {} 
						catch (InvalidityException e) {
							failed.put(key);
						}
					}
				}
		JSONObject json = new JSONObject();
		try {
			json.put("success", success);
			json.put("failed", failed);
		} catch (JSONException e) {
		}
		return json;
	}
}

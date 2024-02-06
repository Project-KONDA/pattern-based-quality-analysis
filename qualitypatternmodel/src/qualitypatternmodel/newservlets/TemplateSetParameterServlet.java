package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

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
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateSetParameterServlet.doPost(" + path + ")\"}");
	}
	
	public String applyPost (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for setting a database in a constraint: '.. /template/setparameter/<technology>/<name>/' (not " + path + ")");

		String technology = pathparts[1];
		String constraintname = pathparts[2];
		
		String constraintpath = "serverpatterns/" + technology + "/concrete-patterns/" + constraintname + ".pattern";
		
		// 1. load Pattern
		CompletePattern pattern;
		try {
			pattern = EMFModelLoad.loadCompletePattern(constraintpath);
		}
		catch (Exception e) {
			throw new FailedServletCallException("404 Requested pattern '" + constraintname + "' does not exist - " + e.getMessage());
		}
		// 2. change patterns

		
		// name?
		String[] nameArray = parameterMap.get("name");
		if (nameArray == null || nameArray.length != 1 || nameArray[0].equals("")) {
			String newName = nameArray[0];
			pattern.setName(newName);
		}
		// database?
		String[] databaseArray = parameterMap.get("database");
		if (databaseArray == null || databaseArray.length != 1 || databaseArray[0].equals("")) {
			String database = databaseArray[0];
			pattern.setName(database);
		}
		
		Set<String> keys = parameterMap.keySet();
		keys.remove("name");
		keys.remove("database");
		
		for (String key: keys) {
			String[] value = parameterMap.get(key);
			if (value.length > 0) {
				
			}
		}
		
		
		
		// 3. save constraint
		try {
			EMFModelSave.exportToFile(pattern, constraintpath, ServletUtilities.EXTENSION);
		} catch (IOException e) {
			throw new FailedServletCallException("Unable to update constraint.");
		}
		
		return "Parametes of constraint '" + pattern.getName() + "' successfully updated.";
	}
	
//	private String identifyConcretePatternPath(HttpServletRequest request) {
//		// TODO
//		return "";
//	}
//	
//	private Map<String, String> identifyParameter(HttpServletRequest request) {
//		// TODO
//		return null;
//	}
//	
//	private void setParameter(CompletePattern pattern, String key, String string) {
//		// TODO
//	}
}

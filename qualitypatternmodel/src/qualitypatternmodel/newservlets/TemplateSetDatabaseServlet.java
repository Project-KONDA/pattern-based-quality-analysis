package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

@SuppressWarnings("serial")
public class TemplateSetDatabaseServlet extends HttpServlet {
	
	// .. /template/setdatabase   /<technology>/<name>/<database-name>
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateSetDatabaseServlet.doPost()");
		String result;
		try{
			result = applyPost(path, params);
//			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_NOT_IMPLEMENTED);
			response.getWriter().write("{ \"error\": \"databases not implemented \"}");
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
//		response.getOutputStream().println("{ \"call\": \"TemplateSetDatabaseServlet.doPost()\"}");
	}
	
	public String applyPost (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 4 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong parameters for setting a database in a constraint: '.. /template/setdatabase   /<technology>/<constraint-name>/<database-name>' (not " + path + ")");

		String technology = pathparts[1];
		String constraintname = pathparts[2];
		String dbname = pathparts[3];
		
		String constraintpath = "serverpatterns/" + technology + "/concrete-patterns/" + constraintname + ".pattern";

		// TODO:
		// 1 check if db exists
		Database db = ServletUtilities.loadDatabase(technology, dbname);
		if ( db == null)
			throw new FailedServletCallException("Database does not exist.");
		// 2 load constraint
		CompletePattern pattern;
		try {
			pattern = EMFModelLoad.loadCompletePattern(constraintpath);
		}
		catch (Exception e) {
			throw new FailedServletCallException("404 Requested pattern '" + constraintname + "' does not exist - " + e.getMessage());
		}
		// 3 change db
//		String olddbname = pattern.getDatabaseName(); 
//		pattern.setDatabaseName(db.getName());
		// 4 save constraint
		try {
			EMFModelSave.exportToFile(pattern, constraintpath, ServletUtilities.EXTENSION);
		} catch (IOException e) {
			throw new FailedServletCallException("Unable to update constraint.");
		}

//		return "Database of constraint updated successfully from '" + olddbname + "' to '" + dbname + "'.";
		return "";
	}
}

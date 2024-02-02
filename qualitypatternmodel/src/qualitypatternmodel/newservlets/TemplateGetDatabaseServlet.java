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

@SuppressWarnings("serial")
public class TemplateGetDatabaseServlet extends HttpServlet {
	
	// .. /template/getdatabase   /<technology>/<name>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateGetDatabaseServlet.doGet(" + path + ")");
		try {
			String result = applyGet(path, params);
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
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (Exception e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateGetDatabaseServlet.doGet(" + path + ")\"}");
	}
	
	public String applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for requesting the database of a constraint: '.. /template/getdatabase/<technology>/<name>' (not " + path + ")");

		String technology = pathparts[1];
		String patternname = pathparts[2];
		String patternpath = "serverpatterns/" + technology + "/concrete-patterns/" + patternname + ".pattern";

		// 1 load constraint
		CompletePattern pattern = ServletUtilities.loadCompletePattern(patternpath);

		// 2 constraint.database
//		String dbname = pattern.getDatabaseName();
//		if (dbname == null || dbname.equals(""))
//			  throw new FailedServletCallException("Template '" + patternname + "' does not have an accociated database");
//		Database database = loadDatabase(technology, dbname);
//		
//		// 3 database exists?
//		if (database == null)
//		  throw new FailedServletCallException("Database '" + database + "' of template '" + patternname + "' could not be found");
//		
//		// 4 return database details
//		return database.toJson();
		return "database JSON not implemented";
	}
	
}

package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.FailedServletCallException;

@SuppressWarnings("serial")
public class DatabaseAddServlet extends HttpServlet {
	
	// .. /database/add   /<technology>

	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getContextPath();
		Map<String, String[]> json = request.getParameterMap();
		System.out.println("DatabaseAddServlet.doPut(" + path + ")");
		String result;
		try{
			result = applyPut(path, json);
			response.getOutputStream().println(result);
		}
		catch (FailedServletCallException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"" + e.getMessage() + ".\"}");
		}
		catch (InvalidServletCallException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"" + e.getMessage() + ".\"}");
		}
		catch (IOException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Adding Database failed.\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"DatabaseAddServlet.doPut(" + path + ")\"}");
	}
	
	public String applyPut (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		
		if (path.length() != 1)
			throw new InvalidServletCallException("wrong parameters for adding a database: '.. /database/add/<technology>'");
		
		String technology = pathparts[0];
		String dbname = pathparts[1];
		String URL = parameterMap.get("url")[0];
		String user = parameterMap.get("user")[0];
		String password = parameterMap.get("password")[0];
		
		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("invalid technology");
		
		// database exists
		if (ServletUtilities.loadDatabase(technology, dbname) != null)
			throw new InvalidServletCallException("database already exists");
		
		ServletUtilities.saveDatabase(technology, dbname, URL, user, password);
		
		if (ServletUtilities.loadDatabase(technology, dbname) == null)
			throw new FailedServletCallException("Adding database failed.");
		return "Database added successfully.";
	}

}

package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.execution.Database;

@SuppressWarnings("serial")
public class DatabaseGetListServlet extends HttpServlet {

	// get List of databases of a format
	// .. /databases/getlist   /<technology>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("DatabaseGetListServlet.doGet(" + path + ")");
		String result;
		try {
			result = applyGet(path, params);
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
//		response.getOutputStream().println("{ \"call\": \"DatabaseGetListServlet.doGet(" + path + ")\"}");
	}
	
	public String applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 2 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong parameters for requesting database list: '.. /databases/getlist/<technology>' (not " + path + ")");
		
		String technology = pathparts[1];
		
		List<Database> databases = ServletUtilities.loadDatabases(technology);
		
		if (databases.isEmpty())
			throw new FailedServletCallException("No databases found for " + technology + ".");
		
		String output = "{\"databases\":[";
		
		for (Database database: databases) {
			String json = "{";
			
			// add all database details
//			json += "\"name\":\"" + database.getName() + "\",";
//			json += "\"url\":\"" + database.getUrl() + "\"";
			json += "},";
			output += json;
		}
		output += "]}";
		
		return output;
	}
}

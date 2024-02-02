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
	
	// .. /database/add   /<technology>/<database-name>
	// {"name":"?", "url":"?", "user":"?", "password":"?"}

	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
//		System.out.println("path-info: " + request.getPathInfo());
//		System.out.println("query-str: " + request.getQueryString());
//		System.out.println("requesturl:" + request.getRequestURI());
//		System.out.println("s-path:    " + request.getServletPath());
//		for (String key: request.getParameterMap().keySet()) 
//			System.out.println("par-map:   " + key + "/ " + request.getParameterMap().get(key)[0]);
		
		Map<String, String[]> json = request.getParameterMap();
		System.out.println("DatabaseAddServlet.doPut(" + path + ")");
		try {
			String result = applyPut(path, json);
			response.getOutputStream().println(result);
		}
		catch (FailedServletCallException e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (InvalidServletCallException e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (Exception e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"DatabaseAddServlet.doPut(" + path + ")\"}");
	}
	
	public String applyPut (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");

		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong parameters for adding a database: '../database/add/<technology>' instead of '.." + path + "'. ");
		}
		if (!path.startsWith("/")) {
			throw new InvalidServletCallException("Invalid call. Required: '../database/add/<technology>', recieved '../database/add" + path + "'");
		}
		
		String technology = pathparts[1];
		String dbname = pathparts[2];
//		String dbname = parameterMap.get("name")[0];
		String URL = parameterMap.get("url")[0];
		String user = parameterMap.get("user")[0];
		String password = parameterMap.get("password")[0];
		
		System.out.println("tech:" + technology + ", dbname: " + dbname + ", url: " + URL + ", user: " + user + ", password: " + password);

		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("invalid technology: '" + technology + "' is not in " + ServletUtilities.TECHS);
		
		// database exists
		if (ServletUtilities.loadDatabase(technology, dbname) != null)
			throw new InvalidServletCallException("database already exists");
		
		ServletUtilities.saveDatabase(technology, dbname, URL, user, password);
		
		if (ServletUtilities.loadDatabase(technology, dbname) == null)
			throw new FailedServletCallException("Adding database failed.");
		return "Database added successfully.";
	}

}

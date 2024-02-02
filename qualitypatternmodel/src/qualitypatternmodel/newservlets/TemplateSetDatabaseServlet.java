package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;

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
			response.getOutputStream().println(result);
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
		String templatename = pathparts[2];
		String dbname = pathparts[3];
		
		// TODO:
		// 1 check if db exists
		// 2 load constraint
		// 3 change db
		// 4 save constraint
		
		
		return "";
	}
}

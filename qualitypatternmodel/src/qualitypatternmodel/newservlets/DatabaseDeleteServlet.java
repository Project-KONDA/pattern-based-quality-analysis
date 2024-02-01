package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.InvalidServletCallException;

@SuppressWarnings("serial")
public class DatabaseDeleteServlet extends HttpServlet {

	// delete database of a format
	// .. /database/delete   /<technology>/<databasename>
	
	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getContextPath();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("DatabaseDeleteServlet.doDelete(" + path + ")");
		String result;
		try{
			result = applyDelete(path, params);
			response.getOutputStream().println(result);
		}
		catch (InvalidServletCallException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"" + e.getMessage() + ".\"}");
		}
		catch (Exception e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Deleting Database failed.\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"DatabaseDeleteServlet.doDelete(" + path + ")\"}");
	}
	
	public String applyDelete(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException {
		String[] pathparts = path.split("/");
		if (path.length() != 2)
			throw new InvalidServletCallException("wrong parameters for deleting a database: '.. /database/delete/<technology>/<database-name>'");

		String technology = pathparts[0];
		String dbname = pathparts[1];

		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("invalid technology");
		if (path.length() != 2)
			throw new InvalidServletCallException("wrong parameters for database deletion");
		
		// check if any constraint uses that database
		// -> Failed 'Database in Use by x constrains: [..]
		
		
		ServletUtilities.deleteDatabase(technology, dbname);
		return "";
	}

}

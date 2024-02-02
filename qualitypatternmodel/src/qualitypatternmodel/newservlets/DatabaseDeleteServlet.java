package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;

@SuppressWarnings("serial")
public class DatabaseDeleteServlet extends HttpServlet {

	// delete database of a format
	// .. /database/delete   /<technology>/<databasename>
	
	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("DatabaseDeleteServlet.doDelete(" + path + ")");
		try {
			String result = applyDelete(path, params);
			System.out.println("Result: " + result);
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
//		response.getOutputStream().println("{ \"call\": \"DatabaseDeleteServlet.doDelete(" + path + ")\"}");
	}
	
	public String applyDelete(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong parameters for deleting a database: '.. /database/delete/<technology>/<database-name>' (not " + path + ")");

		String technology = pathparts[1];
		String dbname = pathparts[2];

		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("invalid technology");
		
		if (ServletUtilities.loadDatabase(technology, dbname) == null)
			throw new FailedServletCallException("Database does not exist.");
		
//		TODO: database.getName()
//		try {
//			List<CompletePattern> patterns = ServletUtilities.getAllSemiConcretePattern(technology);
			List<String> patternnames = new ArrayList<String>();
			
//			for (CompletePattern pattern: patterns) {
//				if (pattern.getDatabase().getName().equals(dbname)) {
//					patternnames.add(pattern.getName());
//				}
//			}
			if (!patternnames.isEmpty()) {
				throw new FailedServletCallException("Database is in use within the following constraints: " + patternnames);
			}
//		} catch (IOException e) {}
		
		ServletUtilities.deleteDatabase(technology, dbname);

		if (ServletUtilities.loadDatabase(technology, dbname) != null)
			throw new FailedServletCallException("Deleting database failed.");
		
		return "Database '" + dbname + "' deleted successfully";
	}

}

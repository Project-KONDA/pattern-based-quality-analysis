package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.CompletePattern;

@SuppressWarnings("serial")
public class TemplateSetNameServlet extends HttpServlet {
	
	// .. /template/setdatabase   /<technology>/<name>/<database-name>
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.log(getServletContext(), this.getClass().getName(), path, params);
		try{
			String result = applyPost(getServletContext(), path, params);
			ServletUtilities.logOutput(getServletContext(), result);
			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_OK);
//			response.setStatus(HttpServletResponse.SC_NOT_IMPLEMENTED);
//			response.getWriter().write("{ \"error\": \"databases not implemented \"}");
		}
		catch (InvalidServletCallException e) {
			ServletUtilities.log(getServletContext(), e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
			ServletUtilities.log(getServletContext(), e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (Exception e) {
			ServletUtilities.log(getServletContext(), e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateSetDatabaseServlet.doPost()\"}");
	}
	
	public static String applyPost (ServletContext servletContext, String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for setting a database in a constraint: '.. /template/setparameter/<technology>/<name>/' (not " + path + ")");

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);

		String[] newNameArray = parameterMap.get("name");
		if (newNameArray == null || newNameArray.length != 1 || newNameArray[0].equals(""))
			throw new InvalidServletCallException("Invalid parameter for setting name.");
		String newName = newNameArray[0];
		
		// 1. load Pattern
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(servletContext, technology, constraintId);
		} catch (IOException e) {
			throw new FailedServletCallException("404 Requested pattern '" + constraintId + "' does not exist");
		}
		
		// 2. change name
		String oldName = pattern.getName();
		pattern.setName(newName);
		
		// 3. save constraint
		try {
			ServletUtilities.saveConstraint(servletContext, technology, constraintId, pattern);
		} catch (IOException e) {
			throw new FailedServletCallException("Failed to save new constraint");
		}
		
		return "Name of constraint updated successfully from '" + oldName + "' to '" + newName + "'.";
	}
}

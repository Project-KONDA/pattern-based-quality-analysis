package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;

@SuppressWarnings("serial")
public class TemplateDeleteServlet extends HttpServlet {
	
	// .. /template/delete   /<technology>/<name>
	
	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateDeleteServlet.doDelete(" + path + ")");
		try {
			String result = applyDelete(path, params);
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
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (Exception e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateDeleteServlet.doDelete(" + path + ")\"}");
	}

	public String applyDelete(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for deleting a constraint: '.. /template/delete/<technology>/<name>' (not " + path + ")");

		String technology = pathparts[1];
		String patternname = pathparts[2];

		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("invalid technology");

		String patternpath = "serverpatterns/" + technology + "/concrete-patterns/" + patternname + ".pattern";
		
		// 1 check if constraint exists
		if (ServletUtilities.loadCompletePattern(patternpath) == null)
			throw new FailedServletCallException("Requested pattern '" + patternname + "' does not exist.");

		// 2 delete constraint
		ServletUtilities.deleteConstraint(technology, patternname);
		
		// 3 check if constraint is deleted
		if (ServletUtilities.loadCompletePattern(patternpath) != null)
			throw new FailedServletCallException("Deleting constraint '" + patternname + "' failed.");
		
		return "Constraint deleted successfully.";
	}
}

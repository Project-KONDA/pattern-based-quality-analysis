package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.CompletePattern;

@SuppressWarnings("serial")
public class TemplateCopyServlet extends HttpServlet {
	
	// .. /template/copy   /<technology>/<oldname>/<newname>
	
	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			String result = applyPut(path, params);
			ServletUtilities.logOutput(result);
			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_OK);
		}
		catch (InvalidServletCallException e) {
			ServletUtilities.logError(e.getMessage(), e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
			ServletUtilities.logError(e.getMessage(), e.getStackTrace());
	        response.setContentType("application/json");
	        if (e.getMessage().startsWith("404")) {
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);
				response.getWriter().write("{ \"error\": \"" + e.getMessage().substring(4) + "\"}");
	        }
	        else if (e.getMessage().startsWith("409")) {
				response.setStatus(HttpServletResponse.SC_CONFLICT);
				response.getWriter().write("{ \"error\": \"" + e.getMessage().substring(4) + "\"}");
	        	
	        } else {
				response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
	        }
		}
		catch (Exception e) {
			ServletUtilities.logError(e.getMessage(), e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateCopyServlet.doPut()\"}");
	}
	
	public static String applyPut (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for setting a database in a constraint: '.. /template/copy/<technology>/<concretetemplate>' (not " + path + ")");

		String technology = pathparts[1];
		String oldID = pathparts[2];

		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);
		
		// 1 load constraint with old name
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(technology, oldID);
		}
		catch (Exception e) {
			throw new FailedServletCallException("404 Requested pattern '" + oldID + "' does not exist - " + e.getMessage());
		}

		// Optional: set name
		String[] names = parameterMap.get("name");
		if (names != null && names[0] != null) {
			pattern.setName(names[0]);
		}
		
		// 2 create new patternID
		String newID = ServletUtilities.generateNewId(technology, pattern.getAbstractId(), pattern.getText().get(0).getName()); 
		
		// 3 change constraint name
		pattern.setPatternId(newID);
		
		// 4 save constraint
		ServletUtilities.saveConstraint(technology, newID, pattern);
		
		if (ServletUtilities.loadConstraint(technology, newID) == null)
			throw new FailedServletCallException("saving new constraint failed");
		
		return ServletUtilities.getPatternJSON(pattern).toString(); 
	}
}

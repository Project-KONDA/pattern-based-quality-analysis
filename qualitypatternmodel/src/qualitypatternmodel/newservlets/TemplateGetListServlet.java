package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.CompletePattern;

@SuppressWarnings("serial")
public class TemplateGetListServlet extends HttpServlet {
	
	// .. /template/getlist   /<technology>/<level>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateGetListServlet.doGet(" + path + ")");
		String result;
		try {
			result = applyGet(path, params);
			response.getOutputStream().println(result);
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
//		response.getOutputStream().println("{ \"call\": \"TemplateGetListServlet.doGet(" + path + ")\"}");
	}
	
	public String applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for requesting the database of a constraint: '.. /template/getlist/<technology>/<level>' (not " + path + ")");

		String technology = pathparts[1];
		String level = pathparts[2];
		
		if (ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);
		if (ServletUtilities.LEVELS.contains(level))
			throw new InvalidServletCallException("'" + level + "' is an invalid abstraction level. The levels are: " + ServletUtilities.LEVELS);
		

		List<CompletePattern> patterns = getPatterns(technology, level);
		
		if (patterns == null)
			throw new FailedServletCallException("No " + ((level == "abstract")? "template":"constraint") + "found for the technology " + technology + " on level " + level + ".");
		
		return ServletUtilities.getPatternJSON(patterns);
	}

	private static List<CompletePattern> getPatterns(String technology, String level)
			throws InvalidServletCallException, FailedServletCallException {
		List<CompletePattern> patterns = null;
		try {
			switch (level) {
			case "all":
				patterns = ServletUtilities.getAllPattern(technology);
				break;
			case "template":
				patterns = ServletUtilities.getAllAbstractPattern(technology);
				break;
			case "constraint":
				patterns = ServletUtilities.getAllSemiConcretePattern(technology);
				break;
			case "ready":
				patterns = ServletUtilities.getAllConcretePattern(technology);
				break;
			}
			return patterns;
		} catch (IOException e) {
			throw new FailedServletCallException(e.getMessage());
		}
	}
}

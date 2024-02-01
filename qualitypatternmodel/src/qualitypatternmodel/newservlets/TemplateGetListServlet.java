package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.CompletePattern;

@SuppressWarnings("serial")
public class TemplateGetListServlet extends HttpServlet {
	
	// .. /template/getlist   /<technology>/<level>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getContextPath();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateGetListServlet.doGet(" + path + ")");
		String result;
		try {
			result = applyGet(path, params);
			response.getOutputStream().println(result);
		}
		catch (InvalidServletCallException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (NoSuchFileException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Template not found.\"}");
		}
		catch (IOException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Template not found.\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateGetListServlet.doGet(" + path + ")\"}");
	}
	
	public String applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (path.length() != 2)
			throw new InvalidServletCallException("Wrong url for requesting the database of a constraint: '.. /template/getlist/<technology>/<level>'");

		String technology = pathparts[0];
		String level = pathparts[1];
		
		if (ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);
		if (ServletUtilities.LEVELS.contains(level))
			throw new InvalidServletCallException("'" + level + "' is an invalid abstraction level. The levels are: " + ServletUtilities.LEVELS);
		

		List<CompletePattern> patterns = getPatterns(technology, level);
		
		if (patterns == null)
			throw new NoSuchFileException("No " + ((level == "abstract")? "template":"constraint") + "found for the technology " + technology + " on level " + level + ".");
		
		return ServletUtilities.getPatternJSON(patterns);
	}

	private static List<CompletePattern> getPatterns(String technology, String level) throws IOException {
		List<CompletePattern> patterns = null;
		switch(level) {
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
	}
}

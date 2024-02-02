package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;

@SuppressWarnings("serial")
public class TemplateExecuteServlet extends HttpServlet {
	
	// .. /template/execute   /<technology>

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateExecuteServlet.doGet(" + path + ")");
		String result;
		try {
			result = applyGet(path, params);
//			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_NOT_IMPLEMENTED);
			response.getWriter().write("{ \"error\": \"execution not implemented \"}");
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
//		response.getOutputStream().println("{ \"call\": \"TemplateExecuteServlet.doGet(" + path + ")\"}");
	}
	
	public String applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 2 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for requesting the database of a constraint: '.. /template/getlist/<technology>/<level>' (not " + path + ")");

		String technology = pathparts[1];
		
		if (ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);
		
		String[] patternnames = parameterMap.get("patterns");
		Map<String, String[]> resultMap = new HashMap<String, String[]> ();
		
		for (String patternname: patternnames) {
			String patternpath = "serverpatterns/" + technology + "/concrete-patterns/" + patternname + ".pattern";
			
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(patternpath);
			if (pattern == null)
				throw new FailedServletCallException("Requested pattern '" + patternname + "' does not exist.");
			
			try {
				String[] result = ServletUtilities.executePattern(pattern);
				resultMap.put(patternname, result);
			} catch (Exception e) {
				throw new FailedServletCallException("Execution failed for constraint '" + patternname + "': " + e.getMessage());
			}
		}
		
		return mapToJson(resultMap);
	}

    private static String mapToJson(Map<String, String[]> map) {
        StringJoiner joiner = new StringJoiner(",", "{", "}");
        for (Map.Entry<String, String[]> entry : map.entrySet())
            joiner.add("\"" + entry.getKey() + "\":" + arrayToJson(entry.getValue()));
        return joiner.toString();
    }

    private static String arrayToJson(String[] array) {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        for (String element : array)
            joiner.add("\"" + element + "\"");
        return joiner.toString();
    }
}

package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.CompletePattern;

@SuppressWarnings("serial")
public class TemplateGetDataModelServlet extends HttpServlet {
	
	// .. /template/getdatamodel   /<technology>/<name>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateGetDataModelServlet.doGet(" + path + ")");
		try {
			String result = applyGet(path, params);
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
//		response.getOutputStream().println("{ \"call\": \"TemplateGetDataModelServlet.doGet(" + path + ")\"}");
	}
	
	public String applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for requesting the datamodel of a constraint: '.. /template/getdatamodel/<technology>/<name>' (not " + path + ")");

		String technology = pathparts[1];
		String patternname = pathparts[2];
		String patternpath = "serverpatterns/" + technology + "/concrete-patterns/" + patternname + ".pattern";

		// 1 load constraint
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadCompletePattern(patternpath);
		} catch (Exception e) {
			throw new FailedServletCallException("constraint not found: " + e.getMessage());
		}
		if (pattern == null) {
			throw new FailedServletCallException("constraint not found");
		}

		// 2 return datamodel name
		try {
			return new JSONObject().put("datamodel", pattern.getDataModelName() ).toString();
		} catch (JSONException e) {
			return "{\"datamodel\":\"" + pattern.getDataModelName() + "\"}"; 
		}
	}
	
}

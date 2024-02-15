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
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;

@SuppressWarnings("serial")
public class TemplateQueryServlet extends HttpServlet {
	
	// .. /template/query   /<technology>/<constraintId>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateQueryServlet.doGet(" + path + ")");
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
//		response.getOutputStream().println("{ \"call\": \"TemplateQueryServlet.doGet(" + path + ")\"}");
	}

	public String applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for requesting the database of a constraint: '.. /template/getdatabase/<technology>/<name>' (not " + path + ")");

		String technology = pathparts[1];
		String constraintId = pathparts[2];
		
		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);

		// 1 load constraint
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(getServletContext(), technology, constraintId);
		} catch (IOException e) {
			throw new FailedServletCallException("constraint not found");
		}
		
		try {
			pattern.isValid(AbstractionLevel.CONCRETE);
		} catch (Exception e) {
			throw new FailedServletCallException(e.getClass().getName() + ": " + e.getMessage());
		}

		// 2 generate query
		JSONObject json = null;
		try {
			json = generateQueryJson(pattern, technology);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		// 3 return result
		return json.toString();
	}

	private JSONObject generateQueryJson(CompletePattern pattern, String technology) throws JSONException, InvalidServletCallException, FailedServletCallException {
		JSONObject json = new JSONObject();
		
		// 1 technology
		json.put("technology", pattern.getLanguage().getLiteral());
		json.put("technology", technology);
//		pattern.getLanguage().getLiteral();
		
		// 2 query
		String query;
		try {
			switch(technology) {
			case "xml":
				query = pattern.generateXQuery();
				break;
			case "sql":
				query = pattern.generateSparql();
				break;
			case "neo4j":
				query = pattern.generateCypher();
				break;
			default:
				throw new InvalidServletCallException();
			}
		} catch (InvalidityException e) {
			throw new FailedServletCallException();
		}
		json.put("query", query);
		// 3 filter?
		
		
		
		// 4 return json
		return json;
		
	}
}

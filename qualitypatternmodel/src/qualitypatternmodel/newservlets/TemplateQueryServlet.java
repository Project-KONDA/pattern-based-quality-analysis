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
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelSave;

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
			e.printStackTrace();
		}
		catch (FailedServletCallException e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
			e.printStackTrace();
		}
		catch (Exception e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
			e.printStackTrace();
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
			if (pattern.containsJavaOperator())
				json = generateQueryJsonJava(pattern, technology);
			else 
				json = generateQueryJson(pattern, technology);
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (InvalidityException e) {
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
		try {
			if (technology.equals(ServletUtilities.XML)) {
				json.put("language", "XQuery");
				String xquery = pattern.generateXQuery();
				json.put("query", xquery);
				json.put("query_line", makeQueryOneLine(xquery));
				
			} else if (technology.equals(ServletUtilities.RDF)) {
				json.put("language", "Sparql");
				String sparql = pattern.generateSparql();
				json.put("query", sparql);
				json.put("query_line", makeQueryOneLine(sparql));
				
			} else if (technology.equals(ServletUtilities.NEO4J)) {
				json.put("language", "Cypher");
				String cypher = pattern.generateCypher();
				json.put("query", cypher);
				json.put("query_line", makeQueryOneLine(cypher));

			} else {
				throw new InvalidServletCallException();
			}
		
		} catch (InvalidityException e) {
			throw new FailedServletCallException();
		}
		
		// 3 return json
		return json;
	}
	
	private String makeQueryOneLine(String query) {
		String shortQuery = query.replace("\r\n", " ");
		shortQuery = shortQuery.replace("\n", " ");
		int len = shortQuery.length() + 1;
		while (shortQuery.length()< len) {
			len = shortQuery.length();
			shortQuery = shortQuery.replace("  ", " ");
		}
		return shortQuery;
	}

	private JSONObject generateQueryJsonJava(CompletePattern pattern, String technology) throws JSONException, InvalidServletCallException, FailedServletCallException {
		JSONObject json = new JSONObject();
		
		// 1 technology
		if (!technology.equals(pattern.getLanguage().getLiteral()))
			throw new InvalidServletCallException();
		json.put("technology", technology);
//		pattern.getLanguage().getLiteral();
		
		// 2 query and filter
		try {
			if (technology.equals(ServletUtilities.XML)) {
				json.put("language", "XQuery");
				String query = pattern.generateXQuery();
				json.put("query", query);
				json.put("query_line", makeQueryOneLine(query));
				JavaFilter filter = pattern.generateQueryFilter();
				String serializedFilter = EMFModelSave.exportToString(filter);
				json.put("filter", serializedFilter);
				
			} else if (technology.equals(ServletUtilities.RDF)) {
				throw new InvalidServletCallException("Not implemented for RDF.");
				
			} else if (technology.equals(ServletUtilities.NEO4J)) {
				throw new InvalidServletCallException("Not implemented for Neo4j.");

			} else {
				throw new InvalidServletCallException();
			}
		} catch (InvalidityException e) {
			throw new FailedServletCallException();
		}
		
		// 4 return json
		return json;
	}
}

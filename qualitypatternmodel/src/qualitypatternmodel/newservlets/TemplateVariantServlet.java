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
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.impl.PatternTextImpl;

@SuppressWarnings("serial")
public class TemplateVariantServlet extends HttpServlet {
	
	// .. /template/instantiate   /<technology>/<abstracttemplate>
	
	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try{
			String result = applyPut(path, params);
			ServletUtilities.logOutput(result);
			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_OK);
		}
		catch (InvalidServletCallException e) {
			e.printStackTrace();
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"1 " + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
			e.printStackTrace();
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
	        if (e.getMessage().startsWith("404")) {
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);
				response.getWriter().write("{ \"error\": \"2 " + e.getMessage().substring(4) + "\"}");
	        }
	        else if (e.getMessage().startsWith("409")) {
				response.setStatus(HttpServletResponse.SC_CONFLICT);
				response.getWriter().write("{ \"error\": \"3 " + e.getMessage().substring(4) + "\"}");
	        	
	        } else {
				response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				response.getWriter().write("{ \"error\": \"internal " + e.getMessage() + "\"}");
	        }
		}
		catch (Exception e) {
			e.printStackTrace();
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"4 " + e.getClass().getSimpleName() + " " + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateInstantiateServlet.doPost()\"}");
	}
	
	public static String applyPut (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for instantiate in a constraint: '.. /template/instantiate/<technology>/<constraintId>/<variantId>' (not " + path + ")");

		// 1 get parameters
		String technology = pathparts[1];
		String templateId = pathparts[2];
		
		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);

		// 2 load json
		String[] variants = parameterMap.get("variants");
		if (variants == null)
			throw new FailedServletCallException("Parameter 'variants' missing");
		
		// 3 load template
		CompletePattern pattern = ServletUtilities.loadTemplate(technology, templateId);
		if (pattern == null)
			throw new FailedServletCallException("404 Requested template '" + templateId + "' does not exist");
		
		// 4 add variant
		for (String variant: variants) {
			try {
				JSONObject json = new JSONObject(variant);
				String name = json.getString("name");
				for (PatternText text: pattern.getText()) {
					if (text.getName().equals(name))
						throw new InvalidityException("Pattern '" + pattern.getPatternId() + "' already contains a variant of name '" + name + "'.");
				}
				new PatternTextImpl(pattern, json);
			} catch (JSONException e) {
				e.printStackTrace();
				throw new FailedServletCallException("Invalid JSON: invalid format.", e);
			} catch (InvalidityException e) {
				e.printStackTrace();
				throw new FailedServletCallException("Invalid JSON: " + e.getMessage(), e);
			} catch (Exception e) {
				e.printStackTrace();
				throw new FailedServletCallException("error: " + e.getMessage(), e);
			}
		}
				
		// 5 save template
		try {
			ServletUtilities.saveTemplate(technology, templateId, pattern);
		} catch (IOException e) {
			throw new FailedServletCallException("Failed to update template.");
		}
		
		CompletePattern pattern2 = ServletUtilities.loadTemplate(technology, templateId);
		for (PatternText text: pattern2.getText())
			try {
				text.isValid(AbstractionLevel.ABSTRACT);
			} catch (InvalidityException e) {
				throw new FailedServletCallException("", e);
			}
		 
		
		return "New variant(s) added successfully to '" + templateId + "'.";
	}
}
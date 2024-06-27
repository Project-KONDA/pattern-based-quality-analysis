package qualitypatternmodel.newservlets;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.impl.PatternTextImpl;
import qualitypatternmodel.utility.Constants;

@SuppressWarnings("serial")
public class TemplateVariantServlet extends HttpServlet {
	
	// .. /template/instantiate   /<technology>/<abstracttemplate>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try{
			String result = applyGet(path, params);
			ServletUtilities.logOutput(result);
			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_OK);
		}
		catch (InvalidServletCallException e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (FileNotFoundException e) {
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			response.getWriter().write("{ \"error\": \"unable to find specified constraint\"}");
		}
		catch (Exception e) {
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
	}
	
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
	}
	
	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try{
			String result = applyDelete(path, params);
			ServletUtilities.logOutput(result);
			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_OK);
		}
		catch (InvalidServletCallException e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (FileNotFoundException e) {
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			response.getWriter().write("{ \"error\": \"unable to find specified constraint\"}");
		}
		catch (Exception e) {
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
	}
	
	public static String applyGet (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for instantiate in a constraint: '.. /template/variant/<technology>/<constraintId>/<variantId>' (not " + path + ")");

		// 1 get parameters
		String technology = pathparts[1];
		String templateId = pathparts[2];
		
		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);
		
		// 2 load template
		CompletePattern pattern = ServletUtilities.loadTemplate(technology, templateId);
		if (pattern == null)
			throw new FailedServletCallException("Requested template '" + templateId + "' does not exist");
		
		JSONArray array = new JSONArray();
		
		for (PatternText text: pattern.getText())
			array.put(text.generateVariantJSONObject());
		
		return array.toString();
	}
	
	public static String applyPut (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for instantiate in a constraint: '.. /template/variant/<technology>/<constraintId>/<variantId>' (not " + path + ")");

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
		CompletePattern patternSave = ServletUtilities.loadTemplate(technology, templateId);
		if (pattern == null)
			throw new FailedServletCallException("404 Requested template '" + templateId + "' does not exist");
		
		// 4 check for possibly duplicate variant names:
		ArrayList<String> patternTextNames = new ArrayList<String>();
		ArrayList<String> variantNames = new ArrayList<String>();
		
		
		for (String variant: variants) {
			try {
				JSONObject json = new JSONObject(variant);
				variantNames.add(json.getString("name"));
			} catch (Exception e) {
				throw new FailedServletCallException("Invalid JSON format.", e);
			}
		}
		
		for (PatternText text: pattern.getText())
			patternTextNames.add(text.getName());
		
		for (String variantName: variantNames) {
			if (patternTextNames.contains(variantName))
				throw new FailedServletCallException("Variant with name '" + variantName + "' already exists.");
		}
		if (new HashSet<String>(variantNames).size() != variantNames.size())
			throw new FailedServletCallException("The call contains variants with the same name.");

		// 5 add variant
		for (String variant: variants) {
			try {
				JSONObject json = new JSONObject(variant);
				new PatternTextImpl(pattern, json);
			} catch (JSONException e) {
				e.printStackTrace();
				throw new FailedServletCallException("Invalid JSON format.", e);
			} catch (InvalidityException e) {
				e.printStackTrace();
				throw new FailedServletCallException("Invalid JSON: " + e.getMessage(), e);
			} catch (Exception e) {
				e.printStackTrace();
				throw new FailedServletCallException("error: " + e.getMessage(), e);
			}
		}
		try {
			pattern.isValid(AbstractionLevel.ABSTRACT);
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			throw new FailedServletCallException("Invalid variant(s).", e); 
		}
				
		// 6 save template
		try {
			ServletUtilities.saveTemplate(technology, templateId, pattern);
		} catch (IOException e) {
			ServletUtilities.saveTemplate(technology, templateId, patternSave);
			throw new FailedServletCallException("Failed to update template.", e);
		}
		
		CompletePattern pattern2 = ServletUtilities.loadTemplate(technology, templateId);
		try {
			pattern2.isValid(AbstractionLevel.ABSTRACT);
			for (PatternText text: pattern2.getText())
				text.isValid(AbstractionLevel.ABSTRACT);
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			ServletUtilities.saveTemplate(technology, templateId, patternSave);
			throw new FailedServletCallException("", e);
		}
		
		return "New variant(s) added successfully to '" + templateId + "'.";
	}
	
	public static String applyDelete (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for instantiate in a constraint: '.. /template/variant/<technology>/<constraintId>/<variantId>' (not " + path + ")");

		// 1 get parameters
		String technology = pathparts[1];
		String templateId = pathparts[2];
		
		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);

		// 2 load variant list
		String[] variants = parameterMap.get("variants");
		if (variants == null)
			throw new FailedServletCallException("Parameter 'variants' missing");
		
		// 3 load template
		CompletePattern pattern = ServletUtilities.loadTemplate(technology, templateId);
		CompletePattern patternSave = ServletUtilities.loadTemplate(technology, templateId);
		if (pattern == null)
			throw new FailedServletCallException("Requested template '" + templateId + "' does not exist");

		// 4 delete variants
		JSONArray success = new JSONArray();
		JSONArray failed = new JSONArray();
	
		for (String variantName: variants) {
			for (PatternText text: pattern.getText()) {
				if (variantName.equals(text.getName())) {
					text.delete();
					success.put(text.getName());
					break;
				}
			}
			failed.put(variantName);
		}
				
		// 5 save template
		try {
			ServletUtilities.saveTemplate(technology, templateId, pattern);
		} catch (IOException e) {
			ServletUtilities.saveTemplate(technology, templateId, patternSave);
			throw new FailedServletCallException("Failed to update template.", e);
		}
		
		// 6 return results
		JSONObject object = new JSONObject();
		try {
			object.put(Constants.JSON_SUCCESS, success);
			object.put(Constants.JSON_FAILED, failed);
		} catch (Exception e) {}
		return object.toString();
	}
}
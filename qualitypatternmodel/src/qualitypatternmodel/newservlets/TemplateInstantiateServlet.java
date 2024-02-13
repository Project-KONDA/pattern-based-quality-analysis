package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;

@SuppressWarnings("serial")
public class TemplateInstantiateServlet extends HttpServlet {
	
	// .. /template/instantiate   /<technology>/<abstracttemplate>
	
	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateInstantiateServlet.doPost()");
		try{
			String result = applyPut(path, params);
			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_OK);
		}
		catch (InvalidServletCallException e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"1 " + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
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
				response.getWriter().write("{ \"error\": \"internal" + e.getMessage() + "\"}");
	        }
		}
		catch (Exception e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"4 " + e.getClass().getSimpleName() + " " + e.getMessage() + "\"}");
			e.printStackTrace();
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateInstantiateServlet.doPost()\"}");
	}
	
	public String applyPut (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 4 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for setting a database in a constraint: '.. /template/copy/<technology>/<constraintId>/<variantId>' (not " + path + ")");

		// 1 get parameters
		String technology = pathparts[1];
		String templateId = pathparts[2];
		String textid = pathparts[3];
		
		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);

		// 2 load constraint with old name
		CompletePattern pattern = ServletUtilities.loadTemplate(getServletContext(), technology, templateId);
		if (pattern == null)
			throw new FailedServletCallException("404 Requested template '" + templateId + "' does not exist");
		
		// 3 remove unused variants
		ArrayList<String> textNames = new ArrayList<String>();
		
		Iterator<PatternText> iterator = pattern.getText().iterator();
        while (iterator.hasNext()) {
        	PatternText text = iterator.next();
        	String name = text.getName(); 
        	textNames.add(name);
        	if(!name.equals(textid)) {
//        		for (Fragment frag: text.getFragments()) {
//        			
//        		}
//
//        		text.getFragments().clear();
        		pattern.getText().remove(text);
        		text.delete();
        	}
        }
        
		if (pattern.getText().size() < 1) {
			throw new InvalidServletCallException("Variant ID invalid: '" + textid + "' does not exist. Available are: " + textNames);
		}
        
		if (pattern.getText().size() > 1) {
			throw new InvalidServletCallException("Variant ID '" + textid + "' exists " + pattern.getText().size() + " times. Fix setup. " + textNames);
		}

		// 4 create new constraint id
		String constraintId = ServletUtilities.generateNewId(getServletContext(), technology, templateId, pattern.getText().get(0).getName());
		pattern.setPatternId(constraintId);
		
		
		// 5 save constraint
		try {
			ServletUtilities.saveConstraint(getServletContext(), technology, constraintId, pattern);
		} catch (IOException e) {
			throw new FailedServletCallException("Failed to create new constraint.");
		}
		
		
		return ServletUtilities.getPatternJSON(pattern).toString();
//		return "Template '" + templateId + "' instantiated successfully to '" + constraintId + "'.";
	}
}
package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

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
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
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
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateInstantiateServlet.doPost()\"}");
	}
	
	public String applyPut (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for setting a database in a constraint: '.. /template/copy/<technology>/<concretetemplate>' (not " + path + ")");

		
		// 1 get parameters
		String technology = pathparts[1];
		String templateId = pathparts[2];
		
		Integer textid;
		try {
			textid = Integer.parseInt(pathparts[3]);
		} catch (Exception e) {
			throw new InvalidServletCallException("Variant ID is not an integer value: " + pathparts[3]);
		}

		// 2 load constraint with old name
		String templatepath = "serverpatterns/" + technology + "/abstract-patterns/" + templateId + ".pattern";
		CompletePattern pattern;
		try {
			pattern = EMFModelLoad.loadCompletePattern(templatepath);
		}
		catch (Exception e) {
			throw new FailedServletCallException("404 Requested template '" + templateId + "' does not exist - " + e.getMessage());
		}
		
		// 3 remove unused variants
		if (pattern.getText().size() <= textid) {
			throw new InvalidServletCallException("Variant ID invalid: " + pattern.getText().size() + " variants exist, but you selected " + textid);
		}
		
		PatternText choice = pattern.getText().get(textid);
		pattern.getText().clear();
		pattern.getText().add(choice);


		// 4 create new constraint id
		String constraintId = ServletUtilities.generateNewId(technology, templateId, pattern.getText().get(0).getName());
		String constraintpath = "serverpatterns/" + technology + "/concrete-patterns/" + constraintId + ".pattern";
		pattern.setPatternId(constraintId);
		// not necessary: ID generation shall guarantee uniqueness
//		try {
//			EMFModelLoad.loadCompletePattern(constraintpath);
//			throw new FailedServletCallException("409 Constraint with name '" + constraintId + "'does already exist.");
//		}
//		catch (Exception e) {}
		
		
		// 5 save constraint
		try {
			EMFModelSave.exportToFile(pattern, constraintpath, ServletUtilities.EXTENSION);
		} catch (Exception e) {
			throw new FailedServletCallException("Failed to create new constraint");
		}
		
		return ServletUtilities.getPatternJSON(pattern);
//		return "Template '" + templateId + "' instantiated successfully to '" + constraintId + "'.";
	}
}
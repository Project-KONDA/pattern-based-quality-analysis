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
public class ConstraintTagServlet extends HttpServlet {
	// POST or DELETE
	// .. /template/tag   /<technology>/<name>/ {"tag": <value>}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			String result = applyPost(path, params);
			ServletUtilities.logOutput(result);
			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_OK);
		}
		catch (InvalidServletCallException e) {
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (Exception e) {
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
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
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (Exception e) {
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
	}
	
	public static String applyPost (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for posting tags in a constraint: '.. /constraint/tag/<technology>/<name>/' (not " + path + ")");

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);
		
		String[] newTags = parameterMap.get("tag");
		
		// 1. load constraint
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(technology, constraintId);
		} catch (IOException e) {
			throw new FailedServletCallException("404 Requested pattern '" + constraintId + "' does not exist");
		}
		
		// 2. add tags to constraint
		JSONObject json = new JSONObject();
		try {
			for (String tag: newTags) {
				if (pattern.getKeywords().add(tag))
					json.append("success", tag);
				else 
					json.append("failed", tag);
			
			}
		} catch (JSONException e) {
		}
		
		// 3. save constraint
		try {
			ServletUtilities.saveConstraint(technology, constraintId, pattern);
		} catch (IOException e) {
			throw new FailedServletCallException("Failed to modify Constraint");
		}
		
		return json.toString();
	}
	
	public static String applyDelete (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for deleting tags in a constraint: '.. /constraint/tag/<technology>/<name>/' (not " + path + ")");

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);

		String[] deleteTags = parameterMap.get("tag");
		
		// 1. load constraint
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(technology, constraintId);
		} catch (IOException e) {
			throw new FailedServletCallException("404 Requested pattern '" + constraintId + "' does not exist");
		}
				
		// 2. remove tags from constraint
		JSONObject json = new JSONObject();
		for (String tag: deleteTags) {
			boolean success = pattern.getKeywords().remove(tag);
			try {
				json.append(success? "success": "failed", tag);
			} catch (JSONException e) {}
		}
		
		// 3. save constraint
		try {
			ServletUtilities.saveConstraint(technology, constraintId, pattern);
		} catch (IOException e) {
			throw new FailedServletCallException("Failed to save new constraint");
		}
		
		return json.toString();
	}
}

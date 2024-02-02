package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

@SuppressWarnings("serial")
public class TemplateCopyServlet extends HttpServlet {
	
	// .. /template/copy   /<technology>/<oldname>/<newname>
	
	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateCopyServlet.doPut()");
		String result;
		try {
			result = applyPut(path, params);
			response.getOutputStream().println(result);
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
			e.printStackTrace();
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateCopyServlet.doPut()\"}");
	}
	
	public String applyPut (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 4 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for setting a database in a constraint: '.. /template/copy/<technology>/<concretetemplate>' (not " + path + ")");

		String technology = pathparts[1];
		String oldname = pathparts[2];
		String newname = pathparts[2];
		
		String oldpatternpath = "serverpatterns/" + technology + "/concrete-patterns/" + oldname + ".pattern";
		String newpatternpath = "serverpatterns/" + technology + "/concrete-patterns/" + newname + ".pattern";

		// 1 load constraint with old name
		CompletePattern pattern;
		try {
			pattern = EMFModelLoad.loadCompletePattern(oldpatternpath);
		}
		catch (Exception e) {
			throw new FailedServletCallException("404 Requested pattern '" + oldname + "' does not exist - " + e.getMessage());
		}
		
		// 2 check if constraint with new name exists already
		try {
			EMFModelLoad.loadCompletePattern(newpatternpath);
			throw new FailedServletCallException("409 Pattern with name '" + newname + "'does already exist.");
		}
		catch (Exception e) {}
		
		// 3 change constraint name
		pattern.setName(newname);
		
		// 4 save constraint
		EMFModelSave.exportToFile(pattern, newpatternpath, ServletUtilities.EXTENSION);
		
		return "Constraint '" + oldname + "' copied successfully to '" + newname + "'.";
	}
}

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
		try {
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
			e.printStackTrace();
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateCopyServlet.doPut()\"}");
	}
	
	public String applyPut (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for setting a database in a constraint: '.. /template/copy/<technology>/<concretetemplate>' (not " + path + ")");

		String technology = pathparts[1];
		String oldID = pathparts[2];
		
		String oldpatternpath = "serverpatterns/" + technology + "/concrete-patterns/" + oldID + ".pattern";

		// 1 load constraint with old name
		CompletePattern pattern;
		try {
			pattern = EMFModelLoad.loadCompletePattern(oldpatternpath);
		}
		catch (Exception e) {
			throw new FailedServletCallException("404 Requested pattern '" + oldID + "' does not exist - " + e.getMessage());
		}
		
		// 2 create new patternID
		String newID = ServeletUtility.generateNewName(technology, pattern.getAbstractName(), pattern.getText().get(0).getName()); 
		String newpatternpath = "serverpatterns/" + technology + "/concrete-patterns/" + newID + ".pattern";
		
		// 3 change constraint name
		pattern.setId(newID);
		
		// 4 save constraint
		EMFModelSave.exportToFile(pattern, newpatternpath, ServletUtilities.EXTENSION);
		
		try {
			EMFModelLoad.loadCompletePattern(newpatternpath);
		}
		catch (Exception e) {}
		
		return "Constraint '" + oldID + "' copied successfully to '" + newID + "'.";
	}
}

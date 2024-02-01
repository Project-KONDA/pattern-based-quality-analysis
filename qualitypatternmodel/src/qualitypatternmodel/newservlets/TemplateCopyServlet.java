package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.InvalidServletCallException;

@SuppressWarnings("serial")
public class TemplateCopyServlet extends HttpServlet {
	
	// .. /template/copy   /<technology>/<concretetemplate>
	
	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getContextPath();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateCopyServlet.doPut()");
		String result;
		try{
			result = applyPut(path, params);
			response.getOutputStream().println(result);
		}
		catch (Exception e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Copying template failed.\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateCopyServlet.doPut()\"}");
	}
	
	public String applyPut (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException {
		String[] pathparts = path.split("/");
		if (path.length() != 2)
			throw new InvalidServletCallException("Wrong url for setting a database in a constraint: '.. /template/copy/<technology>/<concretetemplate>'");

		String technology = pathparts[0];
		String templatename = pathparts[1];
		
		// TODO:
		// 1 check if constraint with new name exists already
		// 2 load constraint with old name
		// -> Failed
		// 3 change constraint name
		// 4 save constraint
		
		return "";
	}
}

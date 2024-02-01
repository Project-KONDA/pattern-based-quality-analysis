package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.InvalidServletCallException;

@SuppressWarnings("serial")
public class TemplateDeleteServlet extends HttpServlet {
	
	// .. /template/delete   /<technology>/<name>
	
	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getContextPath();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateDeleteServlet.doDelete(" + path + ")");
		String result;
		try{
			result = applyDelete(path, params);
			response.getOutputStream().println(result);
		}
		catch (Exception e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Deleting Database failed.\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateDeleteServlet.doDelete(" + path + ")\"}");
	}

	public String applyDelete(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException {
		String[] pathparts = path.split("/");
		if (path.length() != 2)
			throw new InvalidServletCallException("Wrong url for deleting a constraint: '.. /template/delete/<technology>/<name>'");

		String technology = pathparts[0];
		String templatename = pathparts[1];
		
		// 1 check if constraint exists
		// 2 delete constraint
		
		return "";
	}
}

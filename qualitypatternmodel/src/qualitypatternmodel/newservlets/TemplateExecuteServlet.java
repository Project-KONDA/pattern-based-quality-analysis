package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;

@SuppressWarnings("serial")
public class TemplateExecuteServlet extends HttpServlet {
	
	// .. /template/execute   /<technology>

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateExecuteServlet.doGet(" + path + ")");
		String result;
		try {
			result = applyGet(path, params);
			response.getOutputStream().println(result);
		}
		catch (InvalidServletCallException e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (Exception e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateExecuteServlet.doGet(" + path + ")\"}");
	}
	
	public String applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		
		return "";
	}
}

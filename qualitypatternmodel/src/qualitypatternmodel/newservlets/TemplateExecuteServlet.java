package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;

@SuppressWarnings("serial")
public class TemplateExecuteServlet extends HttpServlet {
	
	// .. /template/query   /<technology>/<constraintId>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(getServletContext(), this.getClass().getName(), path, params);
		try {
			String result = applyGet(getServletContext(), path, params);
			ServletUtilities.logOutput(getServletContext(), result);
			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_OK);
		}
		catch (InvalidServletCallException e) {
			ServletUtilities.logError(getServletContext(), e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
			ServletUtilities.logError(getServletContext(), e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (Exception e) {
			ServletUtilities.logError(getServletContext(), e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateQueryServlet.doGet(" + path + ")\"}");
	}

	public static String applyGet(ServletContext servletContext, String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
//		String[] dbpaths = parameterMap.get("dbpath");
//		String[] querys = parameterMap.get("query");
//		String[] filters = parameterMap.get("filter");
//		
//		String dir = "fail";
//		try {
//			dir = System.getenv("UPLOAD_FOLDER"); 
//		} 
//		catch (NullPointerException | SecurityException e) {
//			throw new InvalidServletCallException( "Cannot execute queries, as no file directory can be found.");
//		}
//		ArrayList<String> filepaths = new ArrayList<String>();
//		for (String dbpath: dbpaths)
//			filepaths.add(dir + dbpath);
				
		return "";
	}
}

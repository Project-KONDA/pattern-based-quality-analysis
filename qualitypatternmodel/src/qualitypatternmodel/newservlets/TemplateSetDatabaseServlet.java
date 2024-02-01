package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.InvalidServletCallException;

@SuppressWarnings("serial")
public class TemplateSetDatabaseServlet extends HttpServlet {
	
	// .. /template/setdatabase   /<technology>/<name>/<database-name>
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getContextPath();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateSetDatabaseServlet.doPost()");
		String result;
		try{
			result = applyPost(path, params);
			response.getOutputStream().println(result);
		}
		catch (Exception e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Creating template failed.\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateSetDatabaseServlet.doPost()\"}");
	}
	
	public String applyPost (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException {
		String[] pathparts = path.split("/");
		if (path.length() != 3)
			throw new InvalidServletCallException("Wrong parameters for setting a database in a constraint: '.. /template/setdatabase   /<technology>/<constraint-name>/<database-name>'");

		String technology = pathparts[0];
		String templatename = pathparts[1];
		String dbname = pathparts[2];
		
		// TODO:
		// 1 check if db exists
		// 2 load constraint
		// 3 change db
		// 4 save constraint
		
		
		return "";
	}
}

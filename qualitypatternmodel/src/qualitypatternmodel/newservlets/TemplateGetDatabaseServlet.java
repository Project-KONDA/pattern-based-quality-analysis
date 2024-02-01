package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.InvalidServletCallException;

@SuppressWarnings("serial")
public class TemplateGetDatabaseServlet extends HttpServlet {
	
	// .. /template/getdatabase   /<technology>/<name>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getContextPath();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateGetDatabaseServlet.doGet(" + path + ")");
		String result;
		try {
			result = applyGet(path, params);
			response.getOutputStream().println(result);
		}
		catch (InvalidServletCallException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NoSuchFileException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Template not found.\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateGetDatabaseServlet.doGet(" + path + ")\"}");
	}
	
	public String applyGet(String path, Map<String, String[]> parameterMap) throws NoSuchFileException, InvalidServletCallException {
		String[] pathparts = path.split("/");
		if (path.length() != 2)
			throw new InvalidServletCallException("Wrong url for requesting the database of a constraint: '.. /template/getdatabase/<technology>/<name>'");

		String technology = pathparts[0];
		String templatename = pathparts[1];
		
		// 1 load constraint
		// 2 constraint.database
		// 3 database exists?
		// -> Failed
		// 4 return database details
		
		return "";
	}
	
}

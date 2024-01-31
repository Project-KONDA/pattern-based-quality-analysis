package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class TemplateGetDatabaseServlet extends HttpServlet {
	
	// .. /template/getdatabase   /<technology>/<name>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getContextPath();
		System.out.println("TemplateGetDatabaseServlet.doGet(" + path + ")");
		String result;
		try {
			result = applyGet(path);
			response.getOutputStream().println(result);
		}
		catch (NoSuchFileException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Template not found.\"}");
		}
		catch (NullPointerException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"No Database.\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateGetDatabaseServlet.doGet(" + path + ")\"}");
	}
	
	private String applyGet(String path) throws NoSuchFileException, NullPointerException{
		return "";
	}
	
}

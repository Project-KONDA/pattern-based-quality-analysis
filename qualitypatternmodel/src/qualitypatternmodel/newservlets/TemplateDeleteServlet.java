package qualitypatternmodel.newservlets;

import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class TemplateDeleteServlet extends HttpServlet {
	
	// .. /template/delete   /<technology>/<name>
	
	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getContextPath();
		System.out.println("TemplateDeleteServlet.doDelete(" + path + ")");
		String result;
		try{
			result = applyDelete(path);
			response.getOutputStream().println(result);
		}
		catch (Exception e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Deleting Database failed.\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateDeleteServlet.doDelete(" + path + ")\"}");
	}

private String applyDelete(String path) {
	return "";
}
}

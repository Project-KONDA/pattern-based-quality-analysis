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
		System.out.println("TemplateDeleteServlet.doDelete()");
		response.getOutputStream().println("{ \"call\": \"TemplateDeleteServlet.doDelete()\"}");
	}
}

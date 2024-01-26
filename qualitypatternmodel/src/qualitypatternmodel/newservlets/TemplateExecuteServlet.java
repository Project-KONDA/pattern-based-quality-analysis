package qualitypatternmodel.newservlets;

import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class TemplateExecuteServlet extends HttpServlet {
	
	// .. /template/execute   /<technology>

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("TemplateExecuteServlet.doGet()");
		response.getOutputStream().println("{ \"call\": \"TemplateExecuteServlet.doGet()\"}");
	}
}

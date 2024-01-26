package qualitypatternmodel.newservlets;

import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class TemplateSetDatabaseServlet extends HttpServlet {
	
	// .. /template/setdatabase   /<technology>/<name>
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("TemplateSetDatabaseServlet.doPost()");
		response.getOutputStream().println("{ \"call\": \"TemplateSetDatabaseServlet.doPost()\"}");
	}
}

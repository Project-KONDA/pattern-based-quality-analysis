package qualitypatternmodel.newservlets;

import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class TemplateCopyServlet extends HttpServlet {
	
	// .. /template/copy   /<technology>/<concretetemplate>
	
	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("TemplateCopyServlet.doPost()");
		response.getOutputStream().println("{ \"call\": \"TemplateCopyServlet.doPost()\"}");
	}
}

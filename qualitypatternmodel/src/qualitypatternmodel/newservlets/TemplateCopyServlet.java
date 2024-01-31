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
		String path = request.getContextPath();
		System.out.println("TemplateCopyServlet.doPut()");
		String result;
		try{
			result = applyPut(path);
			response.getOutputStream().println(result);
		}
		catch (Exception e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Copying template failed.\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateCopyServlet.doPut()\"}");
	}
	
	private String applyPut (String path) {
		return "";
	}
}

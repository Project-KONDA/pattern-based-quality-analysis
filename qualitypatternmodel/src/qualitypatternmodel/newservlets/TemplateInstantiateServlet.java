package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class TemplateInstantiateServlet extends HttpServlet {
	
	// .. /template/instantiate   /<technology>/<abstracttemplate>
	
	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getContextPath();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateInstantiateServlet.doPost()");
		String result;
		try{
			result = applyPut(path, params);
			response.getOutputStream().println(result);
		}
		catch (Exception e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Creating template failed.\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateInstantiateServlet.doPost()\"}");
	}
	
	public String applyPut (String path, Map<String, String[]> parameterMap) {
		return "";
	}
}

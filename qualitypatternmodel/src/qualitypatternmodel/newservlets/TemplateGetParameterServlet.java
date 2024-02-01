package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class TemplateGetParameterServlet extends HttpServlet {
	
	// .. /template/getparameter   /<technology>/<level>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getContextPath();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateGetParameterServlet.doGet(" + path + ")");
		String result;
		try {
			result = applyGet(path, params);
			response.getOutputStream().println(result);
		}
		catch (NoSuchFileException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Template not found.\"}");
		}
	//	response.getOutputStream().println("{ \"call\": \"TemplateGetParameterServlet.doGet(" + path + ")\"}");
	}
	
	public String applyGet(String path, Map<String, String[]> parameterMap) throws NoSuchFileException {
		return "";
	}
}

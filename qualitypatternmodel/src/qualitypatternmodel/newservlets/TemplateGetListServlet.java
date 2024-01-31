package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.patternstructure.CompletePattern;

@SuppressWarnings("serial")
public class TemplateGetListServlet extends HttpServlet {
	
	// .. /template/getlist   /<technology>/<level>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getContextPath();
		System.out.println("TemplateGetListServlet.doGet(" + path + ")");
		String result;
		try {
			result = applyGet(path);
			response.getOutputStream().println(result);
		}
		catch (NoSuchFileException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Template not found.\"}");
		}
		catch (IOException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Template not found.\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateGetListServlet.doGet(" + path + ")\"}");
	}
	
	private String applyGet(String path) throws NoSuchFileException,  IOException {
		List<CompletePattern> patterns = getSpecificPattern(null);
		String json = ServeletUtilities.getPatternJSON(patterns);
		return json;
	}

	private static List<CompletePattern> getSpecificPattern(HttpServletRequest request) throws IOException {
//        String pathInfo = request.getPathInfo();
		String format = "xml";
		String level = "concrete";
        
		return getPatterns(format, level);
	}
	
	private static List<CompletePattern> getPatterns(String format, String level) throws IOException {
		switch(level) {
			case "abstract":
				return ServeletUtilities.getAllAbstractPattern(format);
			case "semi":
				return ServeletUtilities.getAllSemiConcretePattern(format);
			case "concrete":
				return ServeletUtilities.getAllConcretePattern(format);
			case "all":
				return ServeletUtilities.getAllPattern(format);
		}
		return null;
	}
}

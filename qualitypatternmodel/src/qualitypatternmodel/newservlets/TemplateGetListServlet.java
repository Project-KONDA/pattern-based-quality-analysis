package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.patternstructure.CompletePattern;

@SuppressWarnings("serial")
public class TemplateGetListServlet extends HttpServlet {

	protected static List<CompletePattern> getSpecificPattern(HttpServletRequest request) throws IOException {
		
//        String pathInfo = request.getPathInfo();
		String format = "xml";
		String level = "concrete";
        
		return getPatterns(format, level);
	}
	
	protected static List<CompletePattern> getPatterns(String format, String level) throws IOException {
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
	
	// .. /template/getlist   /<technology>/<level>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("TemplateGetListServlet.doGet()");
		response.getOutputStream().println("{ \"call\": \"TemplateGetListServlet.doGet()\"}");
//		try {
//			List<CompletePattern> patterns = getSpecificPattern(request);
//			String json = ServeletUtilities.getPatternJSON(patterns);
//			response.getOutputStream().println(json);
//		} catch (NoSuchFileException e) {
//			response.sendError(404);
//			response.getOutputStream().println("{ \"error\": \"" + e.getMessage() + "\"}");
//		} catch (IOException e) {
//			response.sendError(404);
//			response.getOutputStream().println("{ \"error\": \"" + e.getMessage() + "\"}");
//	    }
	}
	
	// .. /template/getlist   /<technology>/<level>
}

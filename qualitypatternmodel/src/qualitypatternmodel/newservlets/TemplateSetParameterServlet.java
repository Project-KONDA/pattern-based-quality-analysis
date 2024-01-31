package qualitypatternmodel.newservlets;

import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class TemplateSetParameterServlet extends HttpServlet {
	
	// .. /template/setparameter   /<technology>/<name>/
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getContextPath();
		System.out.println("TemplateSetParameterServlet.doPost(" + path + ")");
		String result;
		try{
			result = applyPost(path);
			response.getOutputStream().println(result);
		}
		catch (Exception e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Creating template failed.\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateSetParameterServlet.doPost(" + path + ")\"}");
	}
	
	private String applyPost (String path) {
//		String path; 
//		String extension = "pattern";
//		Map<String, String> parameter;
//		
//		try {
//			path = identifyConcretePatternPath(request);
//			parameter = identifyParameter(request);
//		} catch (Exception e) {
//			response.sendError(404);
//			response.getOutputStream().println("{ \"error\": \"Path not well formed\"}");
//			return;
//		}
//		
//		CompletePattern pattern;
//		try {
//			pattern = EMFModelLoad.loadCompletePattern(path);
//		} catch (Exception e) {
//			response.sendError(404);
//			response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
//			return;
//		}
//		
//		try {
//			for (String key : parameter.keySet()) {
//				setParameter(pattern, key, parameter.get(key));
//			}
//		} catch (Exception e) {
//			response.sendError(404);
//			response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
//			return;
//		}
//		
//		try {
//			EMFModelSave.exportToFile(pattern, path, extension);
//		} catch (Exception e) {
//			response.sendError(404);
//			response.getOutputStream().println("{ \"error\": \"Changes could not be saved\"}");
//			return;
//		}
//		
//		response.getOutputStream().println("Successfully set parameter");
		return "";
	}
	
//	private String identifyConcretePatternPath(HttpServletRequest request) {
//		// TODO
//		return "";
//	}
//	
//	private Map<String, String> identifyParameter(HttpServletRequest request) {
//		// TODO
//		return null;
//	}
//	
//	private void setParameter(CompletePattern pattern, String key, String string) {
//		// TODO
//	}
}

package qualitypatternmodel.newservelets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.patternstructure.CompletePattern;

@SuppressWarnings("serial")
abstract public class PatternRequestServelet extends HttpServlet {

	protected static List<CompletePattern> getSpecificPattern(HttpServletRequest request){
		String format = "xml";
		String level = "concrete";
		

//        String pathInfo = request.getPathInfo();
        
		
		return getPatterns(format, level);
	}
	
	protected static List<CompletePattern> getPatterns(String format, String level){
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
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			List<CompletePattern> patterns = getSpecificPattern(request);
			String json = ServeletUtilities.getPatternJSON(patterns);
			response.getOutputStream().println(json);
		} catch (Exception e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading abstract pattern folder failed.\"}");
		}
	}

	@Override
	public void doHead(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			List<CompletePattern> patterns = getSpecificPattern(request);
			String json = ServeletUtilities.getPatternJSONHeads(patterns);
			response.getOutputStream().println(json);
		} catch (Exception e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading abstract pattern folder failed.\"}");
		}
	}
}

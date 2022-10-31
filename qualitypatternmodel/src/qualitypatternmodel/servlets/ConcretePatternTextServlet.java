package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.EMFModelLoad;

public class ConcretePatternTextServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String patternName = requestUrl.substring(Util.CONCRETE_PATTERN_TEXT_ENDPOINT.length());
		
		
		String path = Util.CONCRETE_PATTERNS_PATH + patternName + ".patternstructure";		
		URL url = getClass().getClassLoader().getResource(path);		

		if(url != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(url.toString());
			if(pattern != null) {
				PatternText chosenPatternText = pattern.getText().get(0);						
				
				if(chosenPatternText != null) {
					String json = chosenPatternText.generateJSON();
					response.getOutputStream().println(json);	
				} else {
					response.sendError(404);
					response.getOutputStream().println("{ \"error\": \"Pattern text not found\"}");
				}
			} else {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
			}
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
		}
	}
	
}

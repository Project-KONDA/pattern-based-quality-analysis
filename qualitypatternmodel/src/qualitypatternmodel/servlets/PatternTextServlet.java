package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.EMFModelLoad;

public class PatternTextServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String patternNameAndTextName = requestUrl.substring("/qualitypatternmodel/concrete-patterns/text/".length());
		String[] patternNameAndTextNameSplit = patternNameAndTextName.split("/");
		String patternName = patternNameAndTextNameSplit[0];
		
		String path = "../../concrete-patterns/" + patternName + ".patternstructure";		
		URL url = getClass().getClassLoader().getResource(path);		

		if(url != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(url.toString());
			PatternText chosenPatternText = null;			
			
			if(patternNameAndTextNameSplit.length > 1) {				
				String textName = patternNameAndTextNameSplit[1];
				for(PatternText patternText : pattern.getText()) {
					if(patternText.getName().equals(textName)) {
						chosenPatternText = patternText;
					}
				}				
			} else {
				chosenPatternText = pattern.getText().get(0);
			}			
			
			if(chosenPatternText != null) {
				String json = chosenPatternText.generateJSON();
				response.getOutputStream().println(json);	
			} else {
				response.sendError(404);
				response.getOutputStream().println("Requested pattern text not found.");
			}
		} else {
			response.sendError(404);
			response.getOutputStream().println("Loading pattern failed.");
		}
	}
	
}

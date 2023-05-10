package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

@SuppressWarnings("serial")
public class AbstractPatternInstantiationServlet extends HttpServlet {

	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String patternNameAndTextName = requestUrl.substring(Util.INSTANTIATION_ENDPOINT.length());
		
		String[] patternNameAndTextNameSplit = patternNameAndTextName.split("/");
		String abstractPatternName = patternNameAndTextNameSplit[0];
		String textName = patternNameAndTextNameSplit[1];
		String concretePatternName = request.getParameter("name");

		String abstractPatternPath = Util.ABSTRACT_PATTERNS_PATH + abstractPatternName + ".patternstructure";		
		URL abstractPatternUrl = getClass().getClassLoader().getResource(abstractPatternPath);	
		if(abstractPatternUrl != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(abstractPatternUrl.toString());		
			if(pattern != null) {
				try {
					pattern.setName(concretePatternName);
					
					PatternText chosenPatternText = null;
					for(PatternText patternText : pattern.getText()) {
						if(patternText.getName().equals(textName)) {
							chosenPatternText = patternText;
						}
					}
					if(chosenPatternText != null) {
						chosenPatternText.instantiate();						
						String concretePatternPath = Util.CONCRETE_PATTERNS_PATH + concretePatternName + ".patternstructure";		
						URL concretePatternURL = getClass().getClassLoader().getResource(concretePatternPath);		
						if(concretePatternURL == null) {
							URL concretePatternFolderUrl = getClass().getClassLoader().getResource(Util.CONCRETE_PATTERNS_PATH);
							EMFModelSave.exportToFile(pattern, concretePatternFolderUrl.toString() + concretePatternName, "patternstructure");
							response.getOutputStream().println("Successfully created concrete pattern with name '" + concretePatternName + "' from abstract pattern '" + abstractPatternName + "'.");
						} else {
							response.sendError(409);
							response.getOutputStream().println("{ \"error\": \"Pattern name already used\"}");						
						}		
					}				
								
				} catch (IOException e) {
					response.sendError(500);
					response.getOutputStream().println("{ \"error\": \"Saving concrete pattern failed\"}");
				} catch (InvalidityException e) {
					response.sendError(500);
					response.getOutputStream().println("{ \"error\": \"Pattern text is invalid\"}");
				}
			} else {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Abstract pattern not found\"}");
			}
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Abstract pattern not found\"}");
		}
		
	}


}

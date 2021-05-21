package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class ConcretePatternCreationServlet extends HttpServlet {

	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String abstractPatternName = requestUrl.substring("/qualitypatternmodel/abstract-patterns/".length());
		String concretePatternName = request.getParameter("name");
		String abstractPatternPath = "../../abstract-patterns/" + abstractPatternName + ".patternstructure";		
		URL abstractPatternUrl = getClass().getClassLoader().getResource(abstractPatternPath);	
		if(abstractPatternUrl != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(abstractPatternUrl.toString());		
			if(pattern != null) {
				try {
					pattern.setName(concretePatternName);
					String concretePatternFolderPath = "../../concrete-patterns/";
					String concretePatternPath = concretePatternFolderPath + concretePatternName + ".patternstructure";		
					URL concretePatternURL = getClass().getClassLoader().getResource(concretePatternPath);		
					if(concretePatternURL == null) {
						URL concretePatternFolderUrl = getClass().getClassLoader().getResource(concretePatternFolderPath);
						EMFModelSave.exportToFile(pattern, concretePatternFolderUrl.toString() + concretePatternName, "patternstructure");
						response.getOutputStream().println("Successfully created concrete pattern with name '" + concretePatternName + "' from abstract pattern '" + abstractPatternName + "'.");
					} else {
						response.sendError(400);
						response.getOutputStream().println("{ \"error\": \"Pattern name already used\"}");						
					}					
				} catch (IOException e) {
					response.sendError(500);
					response.getOutputStream().println("{ \"error\": \"Saving concrete pattern failed\"}");
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

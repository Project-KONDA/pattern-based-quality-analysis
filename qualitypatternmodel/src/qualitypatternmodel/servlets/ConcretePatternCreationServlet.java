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
		String path = "../../abstract-patterns/" + abstractPatternName + ".patternstructure";		
		URL abstractPatternUrl = getClass().getClassLoader().getResource(path);		
		CompletePattern pattern = EMFModelLoad.loadCompletePattern(abstractPatternUrl.toString());		
		if(pattern != null) {
			try {
				pattern.setName(concretePatternName);
				URL concretePatternFolderUrl = getClass().getClassLoader().getResource("../../concrete-patterns/");
				// TODO: check if file exists
				EMFModelSave.exportToFile(pattern, concretePatternFolderUrl.toString() + concretePatternName, "patternstructure");
				response.getOutputStream().println("Successfully createed concrete pattern with name '" + concretePatternName + "' from abstract pattern '" + abstractPatternName + "'.");
			} catch (IOException e) {
				response.sendError(500);
				response.getOutputStream().println("Saving concrete pattern failed.");
			}
		} else {
			response.sendError(404);
			response.getOutputStream().println("Loading abstract pattern failed.");
		}
		
	}


}

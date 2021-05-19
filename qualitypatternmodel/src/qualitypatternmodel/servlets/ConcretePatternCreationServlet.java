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
		URL url = getClass().getClassLoader().getResource(path);		
		CompletePattern pattern = EMFModelLoad.loadCompletePattern(url.toString());
		if(pattern != null) {
			try {
				EMFModelSave.exportToFile(pattern, "../../concrete-patterns/" + concretePatternName, "patternstructure");
				response.getOutputStream().println("Successfully createed concrete pattern with name '" + concretePatternName + "' from abstract pattern '" + abstractPatternName + "'.");
			} catch (IOException e) {
				response.getOutputStream().println("Saving concrete pattern failed.");
			}
		} else {
			response.getOutputStream().println("Loading abstract pattern failed.");
		}
		
	}


}

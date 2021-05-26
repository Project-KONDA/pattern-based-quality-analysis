package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class ConcretisationFinalizationServlet extends HttpServlet {
	
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String name = requestUrl.substring(Util.CONCRETISATION_FINALIZATION_ENDPOINT.length());
		
		String filePath = Util.CONCRETE_PATTERNS_PATH + name + ".patternstructure";	
		URL folderURL = getClass().getClassLoader().getResource(Util.CONCRETE_PATTERNS_PATH);
		URL fileURL = getClass().getClassLoader().getResource(filePath);	
		
		if(fileURL != null && folderURL != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(fileURL.toString());
			try {
				pattern.isValid(AbstractionLevel.CONCRETE);
				pattern.generateQuery();
				EMFModelSave.exportToFile(pattern, folderURL.toString() + name, "patternstructure");
				response.getOutputStream().println("Successfully finalized concrete pattern '" + name + "'.");
			} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
				response.sendError(409);
				response.getOutputStream().println("{ \"error\": \"Concrete pattern not valid\"}");
			}			
			
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
		}
		
	}


}

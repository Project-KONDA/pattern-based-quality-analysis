package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

@SuppressWarnings("serial")
public class ConcretePatternDescriptionServlet extends HttpServlet {


	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String name = requestUrl.substring(Util.DESCRIPTION_ENDPOINT.length());
		String description = request.getParameter("description");


		String filePath = Util.CONCRETE_PATTERNS_PATH + name + ".patternstructure";
		URL folderURL = getClass().getClassLoader().getResource(Util.CONCRETE_PATTERNS_PATH);
		URL fileURL = getClass().getClassLoader().getResource(filePath);

		if(fileURL != null && folderURL != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(fileURL.toString());
			pattern.setDescription(description);
			EMFModelSave.exportToFile(pattern, folderURL.toString() + name, "patternstructure");
			response.getOutputStream().println("Successfully set description of concrete pattern '" + name + "'.");
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
		}
	}


}

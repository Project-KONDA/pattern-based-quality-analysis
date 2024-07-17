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
import qualitypatternmodel.utility.EMFModelSave;

@SuppressWarnings("serial")
public class AbstractPatternTextDeletionServlet extends HttpServlet {

	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestUrl = request.getRequestURI();
		String patternNameAndTextName = requestUrl.substring(Util.ABSTRACT_PATTERN_TEXT_DELETION_ENDPOINT.length());
		String[] patternNameAndTextNameSplit = patternNameAndTextName.split("/");
		String patternName = patternNameAndTextNameSplit[0];

		String path = Util.ABSTRACT_PATTERNS_PATH + patternName + ".patternstructure";
		URL url = getClass().getClassLoader().getResource(path);
		URL folderURL = getClass().getClassLoader().getResource(Util.ABSTRACT_PATTERNS_PATH);

		if(url != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(url.toString());
			if(pattern != null) {
				PatternText chosenPatternText = null;
				if(patternNameAndTextNameSplit.length > 1) {
					String textName = patternNameAndTextNameSplit[1];
					for(PatternText patternText : pattern.getText()) {
						if(patternText.getName().equals(textName)) {
							chosenPatternText = patternText;
						}
					}

					if(chosenPatternText != null) {
						chosenPatternText.delete();
						EMFModelSave.exportToFile(pattern, folderURL.toString() + patternName, "patternstructure");
						response.getOutputStream().println("Successfully deleted pattern text '" + textName + "' from abstract pattern '" + patternName + "'");
					} else {
						response.sendError(404);
						response.getOutputStream().println("{ \"error\": \"Pattern text not found\"}");
					}
				} else {
					response.sendError(400);
					response.getOutputStream().println("{ \"error\": \"Pattern text name not specified\"}");
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

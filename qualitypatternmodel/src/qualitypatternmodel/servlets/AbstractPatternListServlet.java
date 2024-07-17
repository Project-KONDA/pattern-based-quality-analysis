package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.EMFModelLoad;

@SuppressWarnings("serial")
public class AbstractPatternListServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		try {
			List<String> fileNames = Util.getListOfFileNamesInFolder(Util.ABSTRACT_PATTERNS_PATH, getClass());

			if(fileNames == null) {
				response.sendError(404, "{ \"error\": \"Loading abstract pattern folder failed.\"}");
			} else if(fileNames.isEmpty()) {
				response.sendError(404, "{ \"error\": \"No abstract patterns found.\"}");
			} else {
				String result = "[";
				for (String name: fileNames) {
					result += "{\"name\":";
					result += "\"" + name + "\", ";
					result += "\"description\":";

					String filePath = Util.ABSTRACT_PATTERNS_PATH + name + ".patternstructure";
					URL folderURL = getClass().getClassLoader().getResource(Util.ABSTRACT_PATTERNS_PATH);
					URL fileURL = getClass().getClassLoader().getResource(filePath);

					if(fileURL != null && folderURL != null) {
						CompletePattern pattern = EMFModelLoad.loadCompletePattern(fileURL.toString());
						if(pattern.getDescription() != null) {
							result += "\"" + pattern.getDescription() + "\", ";
						} else {
							result += "\"\", ";
						}
						if(pattern.getText().size() > 0) {
							result += "\"exampleText\":";
							PatternText text = pattern.getText().get(0);
							String json = text.generateJSON();
							result += json;
						}
					} else {
						result += "\"\", ";
					}
					result += "}, ";
				}
				result += "]";
				result = result.replace(", ]", "]");
				result = result.replace(", }", "}");
				response.getOutputStream().println(result);
			}
		} catch (URISyntaxException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading abstract pattern folder failed.\"}");
		}
	}
}

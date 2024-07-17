package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.EList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.EMFModelLoad;

@SuppressWarnings("serial")
public class AbstractPatternTextListServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String patternName = requestUrl.substring(Util.ABSTRACT_PATTERN_TEXT_LIST_ENDPOINT.length());

		String filePath = Util.ABSTRACT_PATTERNS_PATH + patternName + ".patternstructure";

		URL fileURL = getClass().getClassLoader().getResource(filePath);

		if(fileURL != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(fileURL.toString());
			EList<PatternText> texts = pattern.getText();
			if (texts.isEmpty()) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"No pattern texts found\"}");
			} else {
				String result = "[";
				for (PatternText text: texts) {
					String json = text.generateJSON();
					result += json + ", ";
				}
				result += "]";
				result = result.replace(", ]", "]");
				result = result.replace(", }", "}");
				response.getOutputStream().println(result);
			}

		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
		}
	}

}

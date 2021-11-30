package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.EMFModelLoad;

public class AbstractPatternListServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		try {
			List<String> fileNames = Util.getListOfFileNamesInFolder(Util.ABSTRACT_PATTERNS_PATH, getClass());			
			
			if(fileNames == null) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Loading abstract pattern folder failed.\"}");
			} else if(fileNames.isEmpty()) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"No abstract patterns found.\"}");
			} else {
				String result = "[";
				for (String name: fileNames) {
					result += "\n{\"Name\":";
					result += "\"" + name + "\", ";
					result += "\"Description\":";
					
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
							result += "\n\"ExampleText\":";							
							PatternText text = pattern.getText().get(0);
							String json = text.generateJSON();
							result += json.replace("\n", "\n  ");
						}
					} else {
						result += "\"\", ";
					}
					result += "\n}, ";
				} 					
				result += "\n]";
				response.getOutputStream().println(result);
			}
		} catch (URISyntaxException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading abstract pattern folder failed.\"}");
		}			
	}
}

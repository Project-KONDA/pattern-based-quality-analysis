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
import qualitypatternmodel.utility.EMFModelLoad;

public class ConcretePatternListServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		try {
			List<String> fileNames = Util.getListOfFileNamesInFolder(Util.CONCRETE_PATTERNS_PATH, getClass());			

			if(fileNames == null) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Loading concrete pattern folder failed\"}");
			} else if(fileNames.isEmpty()) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"No concrete patterns found\"}");
			} else {					
				String result = "[";
				for (String name: fileNames) {
					result += "{\"Name\":";
					result += "\"" + name + "\", ";
					result += "\"Description\":";
					
					String filePath = Util.CONCRETE_PATTERNS_PATH + name + ".patternstructure";	
					URL folderURL = getClass().getClassLoader().getResource(Util.CONCRETE_PATTERNS_PATH);
					URL fileURL = getClass().getClassLoader().getResource(filePath);		
					
					if(fileURL != null && folderURL != null) {
						CompletePattern pattern = EMFModelLoad.loadCompletePattern(fileURL.toString());
						if(pattern.getDescription() != null) {
							result += "\"" + pattern.getDescription() + "\", ";
						} else {
							result += "\"" + "\", ";
						}
					} else {
						result += "\"" + "\", ";
					}
					
					result += "}, ";
				} 					
				result += "]";
				result = result.replace(", ]", "]");
				response.getOutputStream().println(result);
				
			}
		} catch (URISyntaxException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading concrete pattern folder failed\"");
		}	
		
	}
	
}

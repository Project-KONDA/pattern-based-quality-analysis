package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

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

public class ConcretePatternListServlet extends HttpServlet {

	
	String STATUS1 =  "ready";
	String STATUS2 =  "not finalized";
	String STATUS3 =  "invalid";
	String STATUS4 =  "not assigned";
	String STATUS5 =  "incomplete";
	String STATUS6 =  "not a pattern";
	
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
				String result = "[\n";
				for (String name: fileNames) {
					String filePath = Util.CONCRETE_PATTERNS_PATH + name + ".patternstructure";	
					URL folderURL = getClass().getClassLoader().getResource(Util.CONCRETE_PATTERNS_PATH);
					URL fileURL = getClass().getClassLoader().getResource(filePath);	
					CompletePattern pattern = null;
					String description = "";
					String status = STATUS6;
					
					try {
						pattern = EMFModelLoad.loadCompletePattern(fileURL.toString());
						if(pattern.getDescription() != null) {
							description =  pattern.getDescription();
						}						
						try {
							pattern.isValid(AbstractionLevel.CONCRETE);							
							if (pattern.getDatabase() != null) {
								if (pattern.validateAgainstSchema().isEmpty()) {
									if (pattern.getQuery() != null & !"".equals(pattern.getQuery())) 
										status = STATUS1;
									else status = STATUS2;
								} else status = STATUS3;
							} else status = STATUS4;
						} catch (Exception e) {
							status = STATUS5;
						}
					} catch (Exception e) {}

					result += "{\"Name\":\"" + name + "\", ";
					result += "\"Description\":\"" + description + "\", ";	
					result += "\"Status\":\"" + status + "\"},\n";
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

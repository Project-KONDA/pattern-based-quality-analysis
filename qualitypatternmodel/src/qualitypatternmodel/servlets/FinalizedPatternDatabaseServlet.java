package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;

public class FinalizedPatternDatabaseServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String requestUrl = request.getRequestURI();
		String databaseName = requestUrl.substring(Util.FINALIZED_PATTERN_DATABASE_ENDPOINT.length());	
		
		try {
			List<String> fileNames = Util.getListOfFileNamesInFolder(Util.CONCRETE_PATTERNS_PATH, getClass());
			if(fileNames == null) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Loading concrete pattern folder failed\"}");
			} else if(fileNames.isEmpty()) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"No concrete patterns found\"}");
			} else {
				String json = "[";
				for(String fileName : fileNames) {
					String path = Util.CONCRETE_PATTERNS_PATH + fileName + ".patternstructure";		
					URL url = getClass().getClassLoader().getResource(path);					
					if(url != null) {
						CompletePattern pattern = EMFModelLoad.loadCompletePattern(url.toString());
						String query = pattern.getQuery();
						if(query != null && !query.equals("") ) {
							Database patternDatabase = pattern.getDatabase();
							if ( patternDatabase != null) {
								String serverDBName = ((ServerXmlDataDatabase) pattern.getDatabase()).getLocalName();
								if (databaseName.equals(serverDBName)) {
									json += "{\"Name\":";
									json += "\"" + fileName + "\", ";
									json += "\"Description\":";
									
									if(pattern.getDescription() != null) {
										json += "\"" + pattern.getDescription() + "\", ";
									} else {
										json += "\"" + "\", ";
									}
									json += "}, ";
									}
								}
							}					
					} else {
						response.sendError(404);
						response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
					}
				}
				json += "]";
				json = json.replace(", }", "}");
				json = json.replace(", ]", "]");
				response.getOutputStream().println(json);
			}
		} catch (URISyntaxException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading concrete pattern folder failed\"");
		}	

	}

}
package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.impl.DatabasesImpl;
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
						String filePathDb = Util.DATABASES_PATH + Util.DATABASES_NAME + ".execution";	
						URL fileURLDb = getClass().getClassLoader().getResource(filePathDb);						
						DatabasesImpl.getInstance().clear();
						CompletePattern pattern = EMFModelLoad.loadCompletePatternAndDatabase(url.toString(), fileURLDb.toString());				
						Database database = pattern.getDatabase();
						
						String query = pattern.getXmlQuery();
						if(query != null && !query.equals("") ) {							
							if ( database != null) {
								String serverDBName = ((ServerXmlDataDatabase) database).getLocalName();
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
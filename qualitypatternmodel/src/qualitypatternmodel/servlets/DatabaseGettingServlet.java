package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.impl.DatabasesImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;

public class DatabaseGettingServlet extends HttpServlet {
	

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String requestUrl = request.getRequestURI();
		String patternName = requestUrl.substring(Util.DATABASE_GETTING_ENDPOINT.length());			
			
		String filePathPattern = Util.CONCRETE_PATTERNS_PATH + patternName + ".patternstructure";	
		URL folderURLPattern = getClass().getClassLoader().getResource(Util.CONCRETE_PATTERNS_PATH);
		URL fileURLPattern = getClass().getClassLoader().getResource(filePathPattern);	
		
		if(fileURLPattern != null && folderURLPattern != null) {			
			
			String filePathDb = Util.DATABASES_PATH + Util.DATABASES_NAME + ".execution";	
			URL folderURLDb = getClass().getClassLoader().getResource(Util.DATABASES_PATH);
			URL fileURLDb = getClass().getClassLoader().getResource(filePathDb);		
							
			if(fileURLDb != null && folderURLDb != null) {			
				DatabasesImpl.getInstance().clear();
				CompletePattern pattern = EMFModelLoad.loadCompletePatternAndDatabase(fileURLPattern.toString(), fileURLDb.toString());				
				Database database = pattern.getDatabase();				
				
				if(database instanceof ServerXmlDataDatabase) {			
					ServerXmlDataDatabase serverDatabase = (ServerXmlDataDatabase) database;
					String result = "";
					result += "{\"LocalName\":";
					result += "\"" + serverDatabase.getLocalName() + "\", ";
					result += "\"Host\":";
					result += "\"" + serverDatabase.getBaseXClient().getHost() + "\", ";
					result += "\"Port\":";		
					result += "\"" + Integer.toString(serverDatabase.getBaseXClient().getPort()) + "\", ";
					result += "\"Name\":";		
					result += "\"" + serverDatabase.getName() + "\"";							
					result += "}";
				
					response.getOutputStream().println(result);
				} else {
					response.sendError(404);
					response.getOutputStream().println("{ \"error\": \"Getting database failed\"}");
				}
			}
	
			
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading concrete pattern folder failed\"}");
		}
					
	
	}	
}
	

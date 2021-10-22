package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;

public class DatabasesListServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		try {
			List<String> fileNames = Util.getListOfFileNamesInFolder(Util.DATABASES_PATH, getClass());	
			
			
			if(fileNames == null) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Loading database folder failed.\"}");
			} else if(fileNames.isEmpty()) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"No databases found.\"}");
			} else if(fileNames.size() > 1) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Too many database containers found.\"}");
			} else {
				String fileName = fileNames.get(0);
				String result = "[";
				
				String filePath = Util.DATABASES_PATH + fileName + ".execution";	
				URL folderURL = getClass().getClassLoader().getResource(Util.DATABASES_PATH);
				URL fileURL = getClass().getClassLoader().getResource(filePath);		
								
				if(fileURL != null && folderURL != null) {
					Databases databasesContainer = EMFModelLoad.loadDatabases(fileURL.toString());
				
					for (XmlDataDatabase db: databasesContainer.getXmlDatabases()) {
						if(db instanceof ServerXmlDataDatabase) {
							ServerXmlDataDatabase serverDatabase = (ServerXmlDataDatabase) db;
							result += "{\"LocalName\":";
							result += "\"" + serverDatabase.getLocalName() + "\", ";
							result += "\"Host\":";
							result += "\"" + serverDatabase.getBaseXClient().getHost() + "\", ";
							result += "\"Port\":";		
							result += "\"" + Integer.toString(serverDatabase.getBaseXClient().getPort()) + "\", ";
							result += "\"Name\":";		
							result += "\"" + serverDatabase.getName() + "\", ";							
							result += "}, ";
						}						
					}					
				} else {
					response.sendError(404);
					response.getOutputStream().println("{ \"error\": \"Loading databases folder failed.\"}");
				}
				result += "]";
				result = result.replace(", ]", "]");
				response.getOutputStream().println(result);
			}
		} catch (URISyntaxException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading databases folder failed.\"}");
		}			
	}
}

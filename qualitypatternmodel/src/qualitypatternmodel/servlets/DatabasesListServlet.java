package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.impl.DatabasesImpl;
import qualitypatternmodel.utility.EMFModelLoad;

@SuppressWarnings("serial")
public class DatabasesListServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String filePath = Util.DATABASES_PATH + Util.DATABASES_NAME + ".execution";	
		URL folderURL = getClass().getClassLoader().getResource(Util.DATABASES_PATH);
		URL fileURL = getClass().getClassLoader().getResource(filePath);		
						
		if(fileURL != null && folderURL != null) {					
			
			DatabasesImpl.getInstance().clear();					
			Databases databasesContainer = EMFModelLoad.loadDatabases(fileURL.toString());		
			
			String result = "[";
		
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
			
			result += "]";
			result = result.replace(", ]", "]");
			response.getOutputStream().println(result);
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading databases folder failed\"}");
		}			
	}
}

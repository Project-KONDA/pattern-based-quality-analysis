package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.impl.DatabasesImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class DatabaseDeletionServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String requestUrl = request.getRequestURI();
		String localName = requestUrl.substring(Util.DATABASE_DELETION_ENDPOINT.length());
				
		String filePath = Util.DATABASES_PATH + Util.DATABASES_NAME + ".execution";	
		URL folderURL = getClass().getClassLoader().getResource(Util.DATABASES_PATH);
		URL fileURL = getClass().getClassLoader().getResource(filePath);		
						
		if(fileURL != null && folderURL != null) {
			Databases databasesContainer = EMFModelLoad.loadDatabases(fileURL.toString());
			boolean found = false;
			EList<XmlDataDatabase> copy = new BasicEList<XmlDataDatabase>();
			copy.addAll(databasesContainer.getXmlDatabases());
		
			for (XmlDataDatabase db: copy) {
				if(db instanceof ServerXmlDataDatabase) {
					ServerXmlDataDatabase serverDatabase = (ServerXmlDataDatabase) db;
					if(serverDatabase.getLocalName().equals(localName)) {
						serverDatabase.delete();
						found = true;
					}
				}						
			}		
			if(found) {
				// TODO: save patterns?
				EMFModelSave.exportToFile(databasesContainer, folderURL.toString() + Util.DATABASES_NAME, "execution");
				response.getOutputStream().println("Successfully deleted local database '" + localName + "'.");	
			} else {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Could not find data base with local name '" + localName + "'.\"}");
			}
			
			
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading databases folder failed.\"}");
		}
					
	}
}

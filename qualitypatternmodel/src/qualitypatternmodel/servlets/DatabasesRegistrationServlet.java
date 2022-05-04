package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.basex.query.QueryException;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.impl.DatabasesImpl;
import qualitypatternmodel.execution.impl.ServerXmlDataDatabaseImpl;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class DatabasesRegistrationServlet extends HttpServlet {
	

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String requestUrl = request.getRequestURI();
		String localName = requestUrl.substring(Util.DATABASE_REGISTRATION_ENDPOINT.length());			
		
		String host = request.getParameter("host");
		String portString = request.getParameter("port");
		int port = Integer.parseInt(portString);		
		String name = request.getParameter("name");
		String user = request.getParameter("user");
		String password = request.getParameter("password");	
				
		String filePath = Util.DATABASES_PATH + Util.DATABASES_NAME + ".execution";	
		URL folderURL = getClass().getClassLoader().getResource(Util.DATABASES_PATH);
		URL fileURL = getClass().getClassLoader().getResource(filePath);		
		
		if(fileURL != null && folderURL != null) {
			DatabasesImpl.getInstance().clear();
			Databases databasesContainer = EMFModelLoad.loadDatabases(fileURL.toString());
			ServerXmlDataDatabase db = null;
			try {
				db = new ServerXmlDataDatabaseImpl(localName, host, port, name, user, password);
				try {
					db.createSchemaDatabaseFromReferencedSchema();
					
					EMFModelSave.exportToFile(databasesContainer, folderURL.toString() + Util.DATABASES_NAME, "execution");
					response.getOutputStream().println("Successfully registered database '" + localName + "'.");
				} catch (InvalidityException | QueryException e) {
					response.sendError(409);
					response.getOutputStream().println("{ \"error\": \"Analysing XML schema failed\"}");
				}
			} catch (InvalidityException e) {
				response.sendError(409);
				response.getOutputStream().println("{ \"error\": \"Local database name already used\"}");	
			}
			
			
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading databases folder failed\"}");
		}
	
	}	
}
	

package qualitypatternmodel.servlets;

import static qualitypatternmodel.testutility.DatabaseConstants.DEMO_NAMESPACE;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.basex.query.QueryException;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.LocalXmlSchemaDatabase;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.impl.ServerXmlDataDatabaseImpl;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.DateTimeParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TimeParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.ParameterValueImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
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
				
				String filePath = Util.DATABASES_PATH + fileName + ".execution";	
				URL folderURL = getClass().getClassLoader().getResource(Util.DATABASES_PATH);
				URL fileURL = getClass().getClassLoader().getResource(filePath);		
				
				if(fileURL != null && folderURL != null) {
					Databases databasesContainer = EMFModelLoad.loadDatabases(fileURL.toString());
					ServerXmlDataDatabase db = null;
					try {
						db = new ServerXmlDataDatabaseImpl(localName, host, port, name, user, password);
						try {
							db.createSchemaDatabaseFromReferencedSchema();
							
							EMFModelSave.exportToFile(databasesContainer, folderURL.toString() + fileName, "execution");
							response.getOutputStream().println("Successfully registered database '" + localName + "'.");
						} catch (InvalidityException e) {
							response.sendError(404);
							response.getOutputStream().println("{ \"error\": \"Analysing XML schema failed.\"}");
						}
					} catch (InvalidityException e) {
						response.sendError(409);
						response.getOutputStream().println("{ \"error\": \"Local database name already used.\"}");	
					}
					
					
				} else {
					response.sendError(404);
					response.getOutputStream().println("{ \"error\": \"Loading databases folder failed.\"}");
				}
			}			
			
			
		} catch (URISyntaxException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading databases folder failed.\"}");
		
		} catch (QueryException e) {
//			e.printStackTrace();
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Analysing XML schema failed.\"}");
		} 		
		
		

		
	
	}	
}
	

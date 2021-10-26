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
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.XmlDatabase;
import qualitypatternmodel.execution.impl.DatabasesImpl;
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

public class DatabaseSettingServlet extends HttpServlet {
	

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String requestUrl = request.getRequestURI();
		String args = requestUrl.substring(Util.DATABASE_SETTING_ENDPOINT.length());	
		String[] split = args.split("/");
		String databaseName = split[0];
		String patternName = split[1];		
		
				
		String filePath = Util.DATABASES_PATH + Util.DATABASES_NAME + ".execution";	
		URL folderURL = getClass().getClassLoader().getResource(Util.DATABASES_PATH);
		URL fileURL = getClass().getClassLoader().getResource(filePath);		
		
		if(fileURL != null && folderURL != null) {
			DatabasesImpl.getInstance().clear();
			Databases databasesContainer = EMFModelLoad.loadDatabases(fileURL.toString());
			ServerXmlDataDatabase database = null;
			for(XmlDataDatabase db : databasesContainer.getXmlDatabases()) {
				if(db instanceof ServerXmlDataDatabase) {
					ServerXmlDataDatabase serverDb = (ServerXmlDataDatabase) db;
					if(serverDb.getLocalName().equals(databaseName)) {
						database = serverDb;
					}
				}
			}
			
			if(database == null) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Could not find database with local name '" + databaseName + "'.\"}");
			}
			
			
			String filePathPattern = Util.CONCRETE_PATTERNS_PATH + patternName + ".patternstructure";	
			URL folderURLPattern = getClass().getClassLoader().getResource(Util.CONCRETE_PATTERNS_PATH);
			URL fileURLPattern = getClass().getClassLoader().getResource(filePathPattern);	
			
			if(fileURLPattern != null && folderURLPattern != null) {
				CompletePattern pattern = EMFModelLoad.loadCompletePattern(fileURLPattern.toString());
				
				pattern.setDatabase(database);
				
				EMFModelSave.exportToFile(pattern, folderURLPattern.toString() + patternName, "patternstructure");
				EMFModelSave.exportToFile(databasesContainer, folderURL.toString() + Util.DATABASES_NAME, "execution");
				response.getOutputStream().println("Successfully set database of pattern '" + patternName + "'.");
				
			} else {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Loading concrete pattern folder failed\"}");
			}
			
			
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading databases folder failed\"}");
		}


		
	
	}	
}
	

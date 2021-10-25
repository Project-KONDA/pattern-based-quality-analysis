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
import qualitypatternmodel.execution.Database;
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
					result += "\"" + serverDatabase.getName() + "\", ";							
					result += "}";
				
					response.getOutputStream().println(result);
				} else {
					response.sendError(404);
					response.getOutputStream().println("{ \"error\": \"Getting database failed.\"}");
				}
			}
	
			
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading concrete pattern folder failed.\"}");
		}
					
	
	}	
}
	

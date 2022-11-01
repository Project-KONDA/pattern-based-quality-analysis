package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;

@SuppressWarnings("serial")
public class SchemaValidationServlet extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String name = requestUrl.substring(Util.SCHEMA_VALIDATION_ENDPOINT.length());
		
		String filePath = Util.CONCRETE_PATTERNS_PATH + name + ".patternstructure";	
		URL folderURL = getClass().getClassLoader().getResource(Util.CONCRETE_PATTERNS_PATH);
		URL fileURL = getClass().getClassLoader().getResource(filePath);	
		
		String filePathDb = Util.DATABASES_PATH + Util.DATABASES_NAME + ".execution";	
		URL folderURLDb = getClass().getClassLoader().getResource(Util.DATABASES_PATH);
		URL fileURLDb = getClass().getClassLoader().getResource(filePathDb);
		
		if(fileURL != null && folderURL != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePatternAndDatabase(fileURL.toString(), fileURLDb.toString());		
			
			EList<Parameter> problematicParams;
			try {
				problematicParams = pattern.validateAgainstSchema();
				if(problematicParams.isEmpty()) {
					response.getOutputStream().println("Successfully validated concrete pattern '" + name + "' against its XML schema.");
				} else {
					String result = "[";
					for(Parameter p : problematicParams) {					
						int parameterID = p.getParameterList().getParameters().indexOf(p);
						String url = "/concrete-patterns/parameter/" + name + "/" + Integer.toString(parameterID);					
						result += "{\"URL\":";
						result += "\"" + url + "\"}, ";					
					}
					result += "]";
					result = result.replace(", ]", "]");
					response.getOutputStream().println(result);
				}				
			} catch (InvalidityException e) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Concrete pattern has no database assigned\"}");				
			}						
			
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
		}
	}
}

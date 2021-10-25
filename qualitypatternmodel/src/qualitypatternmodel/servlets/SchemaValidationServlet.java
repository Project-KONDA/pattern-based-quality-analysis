package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class SchemaValidationServlet extends HttpServlet {
	
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String name = requestUrl.substring(Util.SCHEMA_VALIDATION_ENDPOINT.length());
		
		String filePath = Util.CONCRETE_PATTERNS_PATH + name + ".patternstructure";	
		URL folderURL = getClass().getClassLoader().getResource(Util.CONCRETE_PATTERNS_PATH);
		URL fileURL = getClass().getClassLoader().getResource(filePath);	
		
		if(fileURL != null && folderURL != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(fileURL.toString());			
				
			EList<Parameter> problematicParams = pattern.validateAgainstSchema();
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
			
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
		}
		
	}


}

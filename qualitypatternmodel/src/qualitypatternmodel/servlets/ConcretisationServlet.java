package qualitypatternmodel.servlets;

import static qualitypatternmodel.testutility.DatabaseConstants.DEMO_NAMESPACE;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qualitypatternmodel.exceptions.InvalidityException;
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

public class ConcretisationServlet extends HttpServlet {
	

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String patternNameAndParamID = requestUrl.substring(Util.CONCRETISATION_ENDPOINT.length());
		String[] patternNameAndParamIDSplit = patternNameAndParamID.split("/");
		String name = patternNameAndParamIDSplit[0];
		String parameterID = patternNameAndParamIDSplit[1];
		int parameterIDInt = Integer.parseInt(parameterID);
		
		String[] values = request.getParameterValues("value");
		String type = request.getParameter("type"); // only needed in case of UntypedParameterValue

		
		String filePath = Util.CONCRETE_PATTERNS_PATH + name + ".patternstructure";	
		URL folderURL = getClass().getClassLoader().getResource(Util.CONCRETE_PATTERNS_PATH);
		URL fileURL = getClass().getClassLoader().getResource(filePath);		
		
		if(fileURL != null && folderURL != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(fileURL.toString());			
			
			if(parameterIDInt < pattern.getParameterList().getParameters().size()) {
				Parameter parameter = pattern.getParameterList().getParameters().get(parameterIDInt);			

				if(parameter instanceof ParameterValueImpl && ((ParameterValue) parameter).isTypeModifiable()){					
					try {
						((ParameterValue) parameter).replaceViaValue(values, type);						
						EMFModelSave.exportToFile(pattern, folderURL.toString() + name, "patternstructure");
						response.getOutputStream().println("Successfully set parameter '" + parameterID + "' of concrete pattern with name '" + name + "' to value '" + values[0] + "' and type '" + type + "'.");

					} catch (InvalidityException e) {
						response.sendError(400);
						response.getOutputStream().println("{ \"error\": \"Untyped parameter value invalid\"}");
					}					
				} else if(parameter instanceof TextListParamImpl){									
					TextListParam textListParam = (TextListParam) parameter;
					textListParam.getValues().clear();
					textListParam.getValues().addAll(Arrays.asList(values));						
					EMFModelSave.exportToFile(pattern, folderURL.toString() + name, "patternstructure");
					response.getOutputStream().println("Successfully set parameter '" + parameterID + "' of concrete pattern with name '" + name + "' to value '" + values[0] + "' .");
				} else if(values.length == 1) {
					try {
						parameter.setValueFromString(values[0]);
						EMFModelSave.exportToFile(pattern, folderURL.toString() + name, "patternstructure");
						response.getOutputStream().println("Successfully set parameter '" + parameterID + "' of concrete pattern with name '" + name + "' to value '" + values[0] + "' .");
					} catch (InvalidityException e) {
						response.sendError(400);
						response.getOutputStream().println("{ \"error\": \"Parameter value invalid\"}");
					}
				} else {
					response.sendError(400);
					response.getOutputStream().println("{ \"error\": \"Too many values passed\"}");
				}
			} else {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Parameter not found\"}");
			}
														
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
		}		
	}	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String patternNameAndParamID = requestUrl.substring("/qualitypatternmodel/concrete-patterns/parameter/".length());
		String[] patternNameAndParamIDSplit = patternNameAndParamID.split("/");
		String name = patternNameAndParamIDSplit[0];
		String parameterID = patternNameAndParamIDSplit[1];
		int parameterIDInt = Integer.parseInt(parameterID);

		
		String path = "../../concrete-patterns/" + name + ".patternstructure";		
		URL url = getClass().getClassLoader().getResource(path);		
		
		if(url != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(url.toString());
			if(parameterIDInt < pattern.getParameterList().getParameters().size()) {
				Parameter parameter = pattern.getParameterList().getParameters().get(Integer.parseInt(parameterID));				
				response.getOutputStream().println(parameter.getValueAsString());
			} else {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Parameter not found\"}");
			}
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
		}
	}

}

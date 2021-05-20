package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class ConcretisationServlet extends HttpServlet {
	

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String patternNameAndParamID = requestUrl.substring("/qualitypatternmodel/concrete-patterns/parameter/".length());
		String[] patternNameAndParamIDSplit = patternNameAndParamID.split("/");
		String name = patternNameAndParamIDSplit[0];
		String parameterID = patternNameAndParamIDSplit[1];
		
		String[] values = request.getParameterValues("value");
		
		String folderPath = "../../concrete-patterns/";
		String filePath = folderPath + name + ".patternstructure";	
		URL folderURL = getClass().getClassLoader().getResource(folderPath);
		URL fileURL = getClass().getClassLoader().getResource(filePath);		
		
		if(fileURL != null && folderURL != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(fileURL.toString());
			Parameter parameter = pattern.getParameterList().getParameters().get(Integer.parseInt(parameterID));
			
			if(values.length > 1) {
				if(parameter instanceof TextListParamImpl) {
					TextListParam textListParam = (TextListParam) parameter;
					textListParam.getValues().clear();
					textListParam.getValues().addAll(Arrays.asList(values));
				} else if(parameter instanceof UntypedParameterValueImpl) {
					// TODO: replace by TextListParam instance and set values					
				}
				
			} else {
				try {
					parameter.setValueFromString(values[0]);
					EMFModelSave.exportToFile(pattern, folderURL.toString() + name, "patternstructure");
					response.getOutputStream().println("Successfully set parameter '" + parameterID + "' of concrete pattern with name '" + name + "' to value '" + values[0] + "' .");
				} catch (InvalidityException e) {
					// TODO
					e.printStackTrace();
				}
			}
						
		} else {
			response.getOutputStream().println("Loading pattern failed.");
		}		
	}	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String patternNameAndParamID = requestUrl.substring("/qualitypatternmodel/concrete-patterns/parameter/".length());
		String[] patternNameAndParamIDSplit = patternNameAndParamID.split("/");
		String name = patternNameAndParamIDSplit[0];
		String parameterID = patternNameAndParamIDSplit[1];
		
		String path = "../../concrete-patterns/" + name + ".patternstructure";		
		URL url = getClass().getClassLoader().getResource(path);		
		
		if(url != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(url.toString());
			Parameter parameter = pattern.getParameterList().getParameters().get(Integer.parseInt(parameterID));
			response.getOutputStream().println(parameter.getValueAsString());
		}
	}

}

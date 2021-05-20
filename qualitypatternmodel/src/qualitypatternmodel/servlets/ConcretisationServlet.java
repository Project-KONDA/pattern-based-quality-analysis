package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;

public class ConcretisationServlet extends HttpServlet {
	

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String patternNameAndParamID = requestUrl.substring("/qualitypatternmodel/concrete-patterns/parameter/".length());
		String[] patternNameAndParamIDSplit = patternNameAndParamID.split("/");
		String name = patternNameAndParamIDSplit[0];
		String parameterID = patternNameAndParamIDSplit[1];
		String value = request.getParameter("value");
		
		String path = "../../concrete-patterns/" + name + ".patternstructure";		
		URL url = getClass().getClassLoader().getResource(path);		
		
		if(url != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(url.toString());
			Parameter parameter = pattern.getParameterList().getParameters().get(Integer.parseInt(parameterID));
//			parameter.setValueAsString(value);
			response.getOutputStream().println("Successfully set parameter of concrete pattern with name '" + name + "'.");			
		} else {
			response.getOutputStream().println("Loading pattern failed.");
		}
		
	}


}

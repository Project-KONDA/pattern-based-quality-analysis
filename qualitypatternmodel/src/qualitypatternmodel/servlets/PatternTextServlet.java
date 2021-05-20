package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.EMFModelLoad;

public class PatternTextServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("do get");
		String requestUrl = request.getRequestURI();
		String name = requestUrl.substring("/qualitypatternmodel/concrete-patterns/text/".length());
		String path = "../../concrete-patterns/" + name + ".patternstructure";		
		URL url = getClass().getClassLoader().getResource(path);		
		System.out.println(url);
		if(url != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(url.toString());
			PatternText patternText = pattern.getText().get(0); // TODO: support selection		
			String json = patternText.generateJSON();
			response.getOutputStream().println(json);	
		} else {
			response.getOutputStream().println("Loading pattern failed.");
		}
	}
	
}

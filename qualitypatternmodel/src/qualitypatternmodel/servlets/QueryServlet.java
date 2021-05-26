package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;

public class QueryServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String name = requestUrl.substring(Util.QUERY_ENDPOINT.length());
		
		String path = Util.CONCRETE_PATTERNS_PATH + name + ".patternstructure";		
		URL url = getClass().getClassLoader().getResource(path);		
		
		if(url != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(url.toString());
			String query = pattern.getQuery();
			if(query != null && !query.equals("")) {
//				String json = "{\"Query\": \"" + query + "\"}";			
				response.getOutputStream().println(query);
			} else {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Query not found\"}");
			}
			
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
		}
	}

}

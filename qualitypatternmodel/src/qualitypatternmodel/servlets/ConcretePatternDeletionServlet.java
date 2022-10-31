package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ConcretePatternDeletionServlet extends HttpServlet {
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestUrl = request.getRequestURI();
		String name = requestUrl.substring(Util.CONCRETE_PATTERN_DELETION_ENDPOINT.length());
		
		String filePath = Util.CONCRETE_PATTERNS_PATH + name + ".patternstructure";	
		URL fileURL = getClass().getClassLoader().getResource(filePath);	
		
		if (fileURL == null) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
		} else {
			try {
				Files.deleteIfExists(Paths.get(fileURL.toURI()));
				response.getOutputStream().println("Successfully deleted concrete pattern '" + name + "'.");
			} catch (Exception e) {
				e.printStackTrace();
				
				response.sendError(500);
				response.getOutputStream().println("{ \"error\": \"Deleting concrete pattern failed\"}");
			}
		}
		
	}
	

}

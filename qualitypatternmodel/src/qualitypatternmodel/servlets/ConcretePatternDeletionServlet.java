package qualitypatternmodel.servlets;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConcretePatternDeletionServlet extends HttpServlet {
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestUrl = request.getRequestURI();
		String name = requestUrl.substring("/qualitypatternmodel/concrete-patterns/deletion/".length());
		
		String folderPath = "../../concrete-patterns/";
		String filePath = folderPath + name + ".patternstructure";	
		URL fileURL = getClass().getClassLoader().getResource(filePath);	

		try {
			Files.deleteIfExists(Paths.get(fileURL.toURI()));
			response.getOutputStream().println("Successfully deleted concrete pattern '" + name + "'.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}

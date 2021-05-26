package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URISyntaxException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConcretePatternListServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		try {
			String fileNames = Util.getFileNamesInFolder(Util.CONCRETE_PATTERNS_PATH, getClass());
			if(fileNames == null) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Loading concrete pattern folder failed\"}");
			} else if(fileNames.equals("")) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"No concrete patterns found\"}");
			} else {
				response.getOutputStream().println(fileNames);
			}
		} catch (URISyntaxException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading concrete pattern folder failed\"");
		}	
		
	}
	
}

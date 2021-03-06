package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URISyntaxException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AbstractPatternListServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		try {
			String fileNames = Util.getFileNamesInFolder(Util.ABSTRACT_PATTERNS_PATH, getClass());
			if(fileNames == null) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Loading abstract pattern folder failed.\"}");
			} else if(fileNames.equals("")) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"No abstract patterns found.\"}");
			} else {
				response.getOutputStream().println(fileNames);
			}
		} catch (URISyntaxException e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading abstract pattern folder failed.\"}");
		}			
	}
}

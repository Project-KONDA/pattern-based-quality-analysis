package qualitypatternmodel.newservlets;

import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DatabaseAddServlet extends HttpServlet {
	
	// .. /database/add   /<technology>

	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getContextPath();
		System.out.println("DatabaseAddServlet.doPut(" + path + ")");
		String result;
		try{
			result = applyPut(path);
			response.getOutputStream().println(result);
		}
		catch (Exception e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Adding Database failed.\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"DatabaseAddServlet.doPut(" + path + ")\"}");
	}
	
	private String applyPut (String path) {
		return "";
	}

}

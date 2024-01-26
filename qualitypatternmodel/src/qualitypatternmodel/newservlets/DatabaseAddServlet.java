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
		System.out.println("DatabaseAddServlet.doPut()");
		response.getOutputStream().println("{ \"call\": \"DatabaseAddServlet.doPut()\"}");
	}

}

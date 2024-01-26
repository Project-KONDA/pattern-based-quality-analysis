package qualitypatternmodel.newservlets;

import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DatabaseDeleteServlet extends HttpServlet {

	// delete database of a format
	// .. /database/delete   /<technology>/<databasename>
	
	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("DatabaseDeleteServlet.doDelete()");
		response.getOutputStream().println("{ \"call\": \"DatabaseDeleteServlet.doDelete()\"}");
	}

}

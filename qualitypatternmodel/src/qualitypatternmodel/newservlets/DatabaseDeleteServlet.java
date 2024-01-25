package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.utility.EMFModelLoad;

@SuppressWarnings("serial")
public class DatabaseDeleteServlet extends HttpServlet {

	// delete database of a format
	// .. /database/delete   /<technology>
	
	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	}

}

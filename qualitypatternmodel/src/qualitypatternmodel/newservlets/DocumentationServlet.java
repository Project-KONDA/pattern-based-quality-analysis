package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.nio.file.Files;
import java.nio.file.Paths;

@SuppressWarnings("serial")
public class DocumentationServlet extends QPMHttpServlet {

	@Override
	protected String getAllowedRole() {
		return ServletConstants.ROLE_ALL;
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
//		int  callId = ServletUtilities.logCall("GET", this.getClass().getName(), path, params);

		try {
			String result = applyGet(path, params);
			
	        response.setContentType("application/x-yaml");
	        response.setCharacterEncoding("UTF-8");
	    	response.getWriter().write(result);
	    	response.getWriter().flush();
		} catch (Exception e) {
//			ServletUtilities.putResponseError(response, callId, e);
			putResponseError(response, -1, e);
		}
	}

	static Map<String, String> map = Map.of(
			null, "openapi.yaml",
			ServletConstants.ROLE_ALL, "openapi.yaml",
			ServletConstants.ROLE_MANAGEMENT, "openapi_management.yaml",
			ServletConstants.ROLE_EXECUTION, "openapi_execution.yaml"
		);
	
	@Override
	public String applyGet (String path, Map<String, String[]> parameterMap) throws UnsupportedEncodingException, IOException {
        String yamlFilePath = map.getOrDefault(ServletConstants.ROLE, map.get(null));
        return new String(Files.readAllBytes(Paths.get(yamlFilePath)), "UTF-8");
	}
}

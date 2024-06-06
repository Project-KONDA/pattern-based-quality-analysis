package newservelettest;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.newservlets.ConstraintServlet;
import qualitypatternmodel.newservlets.InitialisationServlet;
import qualitypatternmodel.newservlets.TemplateInstantiateServlet;

public class RdfInstantiationTest {

	public static void main(String[] args) throws ServletException, InvalidServletCallException, FailedServletCallException, IOException, JSONException {
		ServletContext context = mock(ServletContext.class);
        doAnswer(invocation -> {
            String argument = invocation.getArgument(0);
            if (argument.startsWith("/"))
            	return new java.io.File(".").getCanonicalPath().replace('\\', '/') + "/temp" + argument;
            else 
            	return new java.io.File(".").getCanonicalPath().replace('\\', '/') + "/temp/" + argument;
        }).when(context).getRealPath(anyString());
        
		HashMap<String, String[]> parameterMap = new HashMap<String, String[]>();
        
		String inst = "/rdf/Card_rdf/default";
		
		InitialisationServlet.initialisation(context);
		String get = "";
		try {
			System.out.println("INSTANTIATE");
			JSONObject json = new JSONObject(TemplateInstantiateServlet.applyPut(inst, parameterMap));
			get = "/" + json.getString("language") + "/" + json.getString("patternID");
			System.out.println("GET");
			System.out.println(ConstraintServlet.applyGet(get, parameterMap));
			System.out.println("DELETE");
			ConstraintServlet.applyDelete(get, parameterMap);
		} catch (Exception e) {
			System.err.println("'" + inst + "' failed");
			e.printStackTrace();
		}
		
		
		
	}

}

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
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.TemplateDeleteServlet;
import qualitypatternmodel.newservlets.TemplateInitialisationServlet;
import qualitypatternmodel.newservlets.TemplateInstantiateServlet;
import qualitypatternmodel.newservlets.TemplateMqafConstraintServlet;
import qualitypatternmodel.newservlets.TemplateSetParameterServlet;

public class MandAttMqafTest {

	public static void main(String[] args) throws ServletException, InvalidServletCallException, FailedServletCallException, IOException, JSONException, InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		ServletContext context = mock(ServletContext.class);
        doAnswer(invocation -> {
            String argument = invocation.getArgument(0);
            if (argument.startsWith("/"))
            	return new java.io.File(".").getCanonicalPath().replace('\\', '/') + "/temp" + argument;
            else 
            	return new java.io.File(".").getCanonicalPath().replace('\\', '/') + "/temp/" + argument;
        }).when(context).getRealPath(anyString());
        
        
		// initialisation
		TemplateInitialisationServlet.initialisation(context);
		
		// instantiate
		String path = "/xml/MandAtt_xml/default";
		JSONObject json = new JSONObject(TemplateInstantiateServlet.applyPut(path, new HashMap<String, String[]>()));
		String patternID = json.getString("patternID");
		System.out.println(json);

		// setParameter
		HashMap<String, String[]> setParams = new HashMap<String, String[]>();
		setParams.put("XmlPath_0", new String[]{"//*"});
		setParams.put("XmlPath_1", new String[]{"/*/text()"});
		System.out.println(TemplateSetParameterServlet.applyPost("/xml/" + patternID, setParams));
		
		// mqaf single
		System.out.println("  " + TemplateMqafConstraintServlet.applyGet3("/xml/" + patternID, new HashMap<String, String[]>()));
		
		// mqaf multiple
		HashMap<String, String[]> parameterMap2 = new HashMap<String, String[]>();
		parameterMap2.put("constraints", new String[]{patternID});
		System.out.println("  " + TemplateMqafConstraintServlet.applyGet3("/xml/" + patternID, parameterMap2));
		
		System.out.println(TemplateDeleteServlet.applyDelete("/xml/" + patternID, new HashMap<String, String[]>()));
	}
}

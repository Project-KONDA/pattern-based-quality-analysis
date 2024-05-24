package newservelettest;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.newservlets.TemplateDeleteServlet;
import qualitypatternmodel.newservlets.TemplateGetServlet;
import qualitypatternmodel.newservlets.TemplateInitialisationServlet;
import qualitypatternmodel.newservlets.TemplateInstantiateServlet;
import qualitypatternmodel.newservlets.TemplateMqafConstraintServlet;
import qualitypatternmodel.newservlets.TemplateQueryServlet;

public class InstantiationTest {

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
        
        List<String> listInstantiate = List.of(
        		"/xml/StringLength_xml/default",
        		"/xml/Card_xml/flexible_search",
        		"/xml/Card_xml/simple_question",
        		"/xml/Card_xml/flexible_question",
        		"/xml/Contains_xml/simple",
        		"/xml/Match_xml/simple",
        		"/xml/MandAtt_xml/default",
        		"/xml/CompSet_xml/default",
        		"/xml/InvalidLink_xml/default",
        		"/xml/InvalidLink_xml/default_question");
        ArrayList<String> patternIDs = new ArrayList<String>();
		TemplateInitialisationServlet.initialisation(context);

		for (String inst: listInstantiate){
			JSONObject json = new JSONObject(TemplateInstantiateServlet.applyPut(inst, parameterMap));
			Object a = json.get("patternID");
			String st = (String) a;
			patternIDs.add(st);
		}
		
		System.out.println();
		for (String get: patternIDs){
			System.out.println(TemplateGetServlet.applyGet("/xml/" + get, parameterMap));
//			JSONObject json = new JSONObject(TemplateGetServlet.applyGet(context, get, parameterMap));
		}
		
		System.out.println();
		for (String get: patternIDs){
			System.out.println(TemplateQueryServlet.applyGet3("/xml/" + get, parameterMap));
//			JSONObject json = new JSONObject(TemplateGetServlet.applyGet(context, get, parameterMap));
		}
		
		System.out.println();
		for (String get: patternIDs){
			System.out.println(get);
			System.out.println("  " + TemplateMqafConstraintServlet.applyGet3("/xml/" + get, parameterMap));
//			JSONObject json = new JSONObject(TemplateGetServlet.applyGet(context, get, parameterMap));
		}
		
		System.out.println();
		List<String> delete = new ArrayList<String>(patternIDs);
		for (String del: delete) {
			TemplateDeleteServlet.applyDelete("/xml/" + del, parameterMap);
			patternIDs.remove(del);
		}
		
	}

}

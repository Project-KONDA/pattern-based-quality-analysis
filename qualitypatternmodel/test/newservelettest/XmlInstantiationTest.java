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
import qualitypatternmodel.newservlets.ConstraintServlet;
import qualitypatternmodel.newservlets.InitialisationServlet;
import qualitypatternmodel.newservlets.TemplateInstantiateServlet;
import qualitypatternmodel.newservlets.ConstraintMqafServlet;
import qualitypatternmodel.newservlets.ConstraintQueryServlet;

public class XmlInstantiationTest {

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
        		"/xml/Card_xml/default",
        		"/xml/Card_xml/default_constraint",
//        		"/xml/Card_xml/question",
//        		"/xml/Card_xml/question_simple",
        		"/xml/Match_xml/default",
        		"/xml/Match_xml/default_constraint",
        		"/xml/Contains_xml/default",
        		"/xml/Contains_xml/default_constraint",
        		"/xml/StringLength_xml/default",
        		"/xml/StringLength_xml/default_constraint",
        		"/xml/CompSet_xml/default",
        		"/xml/CompSet_xml/default_constraint",
        		"/xml/Unique_xml/default",
        		"/xml/Unique_xml/default_constraint",
        		"/xml/MandAtt_xml/default",
        		"/xml/MandAtt_xml/default_constraint",
        		"/xml/InvalidLink_xml/default",
//        		"/xml/InvalidLink_xml/question",
        		"/xml/InvalidLink_xml/default_constraint"
        		);
        ArrayList<String> patternIDs = new ArrayList<String>();
		InitialisationServlet.initialisation(context);

		for (String inst: listInstantiate){
			try {
				System.out.println("INSTANTIATE");
				JSONObject json = new JSONObject(TemplateInstantiateServlet.applyPut(inst, parameterMap));
				String st = "/" + json.getString("language") + "/" + json.getString("patternID");
				patternIDs.add(st);
			} catch (Exception e) {
				System.err.println("'" + inst + "' failed");
				e.printStackTrace();
			}
		}
		
		System.out.println();
		System.out.println("GET");
		for (String get: patternIDs){
			System.out.println(ConstraintServlet.applyGet(get, parameterMap));
//			JSONObject json = new JSONObject(TemplateGetServlet.applyGet(context, get, parameterMap));
		}
		
		System.out.println();
		System.out.println("QUERY");
		for (String get: patternIDs){
			System.out.println(ConstraintQueryServlet.applyGet3(get, parameterMap));
//			JSONObject json = new JSONObject(TemplateGetServlet.applyGet(context, get, parameterMap));
		}
		
		System.out.println();
		System.out.println("MQAF");
		for (String get: patternIDs){
			System.out.println(get);
			System.out.println("  " + ConstraintMqafServlet.applyGet3(get, parameterMap));
//			JSONObject json = new JSONObject(TemplateGetServlet.applyGet(context, get, parameterMap));
		}
		
		System.out.println();
		System.out.println("DELETE");
		List<String> delete = new ArrayList<String>(patternIDs);
		for (String del: delete) {
			ConstraintServlet.applyDelete(del, parameterMap);
			patternIDs.remove(del);
		}
		
	}

}

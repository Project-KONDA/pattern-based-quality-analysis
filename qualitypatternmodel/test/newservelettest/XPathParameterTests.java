package newservelettest;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.newservlets.ConstraintServlet;
import qualitypatternmodel.newservlets.InitialisationServlet;
import qualitypatternmodel.newservlets.TemplateInstantiateServlet;

public class XPathParameterTests {

	public static void main(String[] args) throws ServletException, JSONException, InvalidServletCallException, FailedServletCallException, IOException {
		ServletContext context = mock(ServletContext.class);
        doAnswer(invocation -> {
            String argument = invocation.getArgument(0);
            if (argument.startsWith("/"))
            	return new java.io.File(".").getCanonicalPath().replace('\\', '/') + "/temp" + argument;
            else 
            	return new java.io.File(".").getCanonicalPath().replace('\\', '/') + "/temp/" + argument;
        }).when(context).getRealPath(anyString());
		InitialisationServlet.initialisation(context);


        List<String> xPaths = List.of(
        		"/a",
        		"/a[]",
        		"/a[name()]",
        		"/a[name()=\"abc\"]",
        		"/a [ name() = \"abc\"]",
        		"/a");
        
        List<String> xPathAttributes = List.of(
        		"/text()",
        		"/data()",
        		"/name()",
        		"/@val",
        		"/@a315");
		
    	for (String att: xPathAttributes) {
    		testAtt(att);
    	}
    	
        for (String part: xPaths) {
        	test(part);
        	String path = "/x" + part + "/x";
        	test(path);
        	for (String att: xPathAttributes) {
        		testAtt(part + att);
        		testAtt(path + att);
        	}
        }
	}
	
	private static void test(String arg) throws JSONException, InvalidServletCallException, FailedServletCallException, IOException {
		JSONObject json = new JSONObject(TemplateInstantiateServlet.applyPut("/xml/Match_xml/default", new HashMap<String, String[]>()));
		String id = (String) json.get("patternID");
		
		try {
			HashMap<String, String[]> param = new HashMap<String, String[]>();
			String[] val = {arg};
			param.put("xmlpath_rootToReturn", val);
			if (ConstraintServlet.applyPost("/xml/" + id, param).startsWith("{\"success\":[],"))
				System.out.println(arg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConstraintServlet.applyDelete("/xml/" + id, new HashMap<String, String[]>());
	}
	
	
	private static void testAtt(String arg) throws JSONException, InvalidServletCallException, FailedServletCallException, IOException {
		JSONObject json = new JSONObject(TemplateInstantiateServlet.applyPut("/xml/Match_xml/default", null));
		String id = "/xml/" + (String) json.get("patternID");
		
		try {
			HashMap<String, String[]> param = new HashMap<String, String[]>();
			String[] val = {arg};
			param.put("xmlpath_returnToCondition", val);
			String output = ConstraintServlet.applyPost(id, param); 
			if (output.startsWith("{\"success\":[],"))
				System.out.println("failed: " + arg);
			checkParameterValue(id, "xmlpath_returnToCondition", arg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConstraintServlet.applyDelete(id, new HashMap<String, String[]>());
	}
	
	private static void checkParameterValue(String id, String parameter_id, String expected) throws InvalidServletCallException, FailedServletCallException, JSONException {
		String get = ConstraintServlet.applyGet(id, null);
		String value = getParameterValue(get, parameter_id);
		expected = replaceExpected(expected);
		if (value == null)
			System.out.println("value null on :" + expected);
		else if (!value.equals(expected)) {
			System.out.println("result value: '" + value + "'");
			System.out.println("   unequal to '" + expected + "'");
		}
			
	}
	

    private static String getParameterValue(String jsonString, String parameter_id) throws JSONException {
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray variants = jsonObject.getJSONArray("variants");
        JSONObject variant = variants.getJSONObject(0);
        JSONArray fragmentArray = variant.getJSONArray("fragments");

        // Loop through each object in the 'var2' array
        for (int j = 0; j < fragmentArray.length(); j++) {
            JSONObject fragment = fragmentArray.getJSONObject(j);
            try {
            	String id = fragment.getString("id");
                if (parameter_id.equals(id)) {
                    String value = fragment.getString("value");
                    return value;
                }
            } catch (JSONException e) {}
        }
        return null;
    }
    
    private static String replaceExpected(String expected) {
    	expected = expected.replaceAll(" ", "");
    	expected = expected.replaceAll("/x", "/child::*[name()=\"x\"]");
    	expected = expected.replace("/a", "/child::*[name()=\"a\"]");
    	expected = expected.replace("[]", "");
    	expected = expected.replace("data()", "text()");
    	return expected;
    }
}

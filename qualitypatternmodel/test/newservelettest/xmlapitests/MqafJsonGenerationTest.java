package newservelettest.xmlapitests;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.ServletContext;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.newservlets.ConstraintMqafServlet;
import qualitypatternmodel.newservlets.ConstraintServlet;
import qualitypatternmodel.newservlets.TemplateInstantiateServlet;

public class MqafJsonGenerationTest {

	public static void main(String[] args) {

		ServletContext context = mock(ServletContext.class);
	    doAnswer(invocation -> {
	        String argument = invocation.getArgument(0);
	        if (argument.startsWith("/")) {
				return new java.io.File(".").getCanonicalPath().replace('\\', '/') + "/temp" + argument;
			} else {
				return new java.io.File(".").getCanonicalPath().replace('\\', '/') + "/temp/" + argument;
			}
	    }).when(context).getRealPath(anyString());

        String cardid = createCardConstraint();
        String lengthid = createLengthConstraint();
        String uniqueid = createUniqueConstraint();

        System.out.println(getMqafJson(new String[] {cardid}));
        System.out.println(getMqafJson(new String[] {lengthid}));
        System.out.println(getMqafJson(new String[] {uniqueid}));
        System.out.println(getMqafJson(new String[] {cardid, lengthid, uniqueid}));

        deleteConstraint(cardid);
        deleteConstraint(lengthid);
        deleteConstraint(uniqueid);
	}

	private static String createCardConstraint() {
		JSONObject json;
		String id = null;
		try {
			json = TemplateInstantiateServlet.applyPut("/xml/Card_xml/default-constraint", new HashMap<String, String[]>());
			id = json.getString("patternID");
			HashMap<String, String[]> params = new HashMap<>();
			params.put("name", new String[] {"Card Test for MQAF"});
			params.put("datamodel", new String[] {"LIDO 1.1"});
			params.put("database", new String[] {"lidofile.xml"});
			params.put("namespace", new String[] {"{\"lido\": \"http://www.lido-schema.org\", \"demo\": \"demo\"}"});
			params.put("XmlPath_Element_0", new String[] {"/lido:lido"});
			params.put("ComparisonOption_1", new String[] {"at least"});
			params.put("Number_2", new String[] {"1"});
			params.put("XmlPath_Element_3", new String[] {"/*"});
			ConstraintServlet.applyPost("/xml/" + id, params);
		} catch (InvalidServletCallException | FailedServletCallException | IOException | JSONException e) {
			e.printStackTrace();
		}
		return id;
	}

	private static String createLengthConstraint() {
		JSONObject json;
		String id = null;
		try {
			json = TemplateInstantiateServlet.applyPut("/xml/StringLength_xml/default-constraint", new HashMap<String, String[]>());
			id = json.getString("patternID");
			HashMap<String, String[]> params = new HashMap<>();
			params.put("name", new String[] {"Card Test for MQAF"});
			params.put("datamodel", new String[] {"LIDO 1.1"});
			params.put("database", new String[] {"lidofile.xml"});
			params.put("namespace", new String[] {"{\"lido\": \"http://www.lido-schema.org\", \"demo\": \"demo\"}"});
			params.put("XmlPath_Element_0", new String[] {"/lido:lidoWrap/lido:lido"});
			params.put("XmlPath_Property_1", new String[] {"/lido:lidoRecID/text()"});
			params.put("ComparisonOption_2", new String[] {"at most"});
			params.put("Number_3", new String[] {"20"});
			ConstraintServlet.applyPost("/xml/" + id, params);
		} catch (InvalidServletCallException | FailedServletCallException | IOException | JSONException e) {
			e.printStackTrace();
		}
		return id;
	}

	private static String createUniqueConstraint() {
		JSONObject json;
		String id = null;
		try {
			json = TemplateInstantiateServlet.applyPut("/xml/Unique_xml/default-constraint", new HashMap<String, String[]>());
			id = json.getString("patternID");
			HashMap<String, String[]> params = new HashMap<>();
			params.put("name", new String[] {"Card Test for MQAF"});
			params.put("datamodel", new String[] {"LIDO 1.1"});
			params.put("database", new String[] {"lidofile.xml"});
			params.put("namespace", new String[] {"{\"lido\": \"http://www.lido-schema.org\", \"demo\": \"demo\"}"});
			params.put("XmlPath_Element_0", new String[] {"/lido:lidoWrap/lido:lido"});
			params.put("XmlPath_Property_1", new String[] {"/lido:lidoRecID/text()"});
			ConstraintServlet.applyPost("/xml/" + id, params);
		} catch (InvalidServletCallException | FailedServletCallException | IOException | JSONException e) {
			e.printStackTrace();
		}
		return id;
	}

	private static JSONObject getMqafJson(String[] patternIDs) {
		HashMap<String, String[]> constraints = new HashMap<>();
		constraints.put("constraints", patternIDs);
		JSONObject json = null;
		try {
			JSONObject output = ConstraintMqafServlet.applyGet2("/xml", constraints);
			json = output.getJSONObject("constraint");
		} catch (InvalidServletCallException | FailedServletCallException | JSONException e) {
			e.printStackTrace();
		}
		return json;
	}

	private static void deleteConstraint(String patternID) {
		if (patternID == null)
			return;
		try {
			ConstraintServlet.applyDelete("/xml/" + patternID, new HashMap<>());
		} catch (InvalidServletCallException | FailedServletCallException e) {
			e.printStackTrace();
		}
	}
}

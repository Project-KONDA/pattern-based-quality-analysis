package newservelettest.neo4japitests;

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

public class Neo4jInstantiationTest {

	public static void main(String[] args) throws ServletException, InvalidServletCallException, FailedServletCallException, IOException, JSONException {
		ServletContext context = mock(ServletContext.class);
        doAnswer(invocation -> {
            String argument = invocation.getArgument(0);
            if (argument.startsWith("/")) {
				return new java.io.File(".").getCanonicalPath().replace('\\', '/') + "/temp" + argument;
			} else {
				return new java.io.File(".").getCanonicalPath().replace('\\', '/') + "/temp/" + argument;
			}
        }).when(context).getRealPath(anyString());

		HashMap<String, String[]> emptyParameter = new HashMap<String, String[]>();

		String inst = "/neo4j/Card_neo4j/default";
		String get = null;
		try {
			InitialisationServlet.initialisation(context);
			System.out.println("INSTANTIATE");
			JSONObject json = new JSONObject(TemplateInstantiateServlet.applyPut(inst, emptyParameter));
			get = "/" + json.getString("language") + "/" + json.getString("patternID");

			System.out.println("GET");
			System.out.println(ConstraintServlet.applyGet(get, emptyParameter));

			System.out.println("SET PARAMETER");
			HashMap<String, String[]> parameter = new HashMap<String, String[]>();
//			parameter.put("IriList_0", new String[]{new JSONArray().put("wdt:iri").toString()});
//			parameter.put("IriList_1", new String[]{"wdt:iri"});
//			parameter.put("RdfPath_2", new String[]{"wdt:iri"});
			parameter.put("ComparisonOption_3", new String[]{"less than"});
			parameter.put("Number_4", new String[]{"99"});
			parameter.put("database", new String[]{"dbname"});
			System.out.println(ConstraintServlet.applyPost(get, parameter));
			System.out.println(ConstraintServlet.applyGet(get, emptyParameter));

			System.out.println("DELETE");
			System.out.println(ConstraintServlet.applyDelete(get, emptyParameter));

		} catch (Exception e) {

			try {
				System.out.println("DELETE");
				System.out.println(ConstraintServlet.applyDelete(get, emptyParameter));
			} catch (Exception x) {}

			System.err.println("'" + inst + "' failed");
			e.printStackTrace();
		}
	}
}

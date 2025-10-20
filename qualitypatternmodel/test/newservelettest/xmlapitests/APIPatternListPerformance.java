package newservelettest.xmlapitests;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.newservlets.ConstraintServlet;
import qualitypatternmodel.newservlets.InitialisationServlet;
import qualitypatternmodel.newservlets.PatternListServlet;
import qualitypatternmodel.newservlets.TemplateInstantiateServlet;
import qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl;
import qualitypatternmodel.utility.ConstantsJSON;

public class APIPatternListPerformance {
	private static String FOLDER;
	private static Boolean default_allow_ignore_map;
	private static int NUM_CONSTRAINTS = 200;
	private static int NUM_READYCONSTRAINTS = 100;

	public static void main(String[] args)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		new APIPatternListPerformance().testfunction(args);
	}

	public void testfunction(String[] args)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {

		initialize();
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
	}

	// __________ SETUP FUNCTIONS __________

	@BeforeAll
	public static void initialize()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		default_allow_ignore_map = ParameterFragmentImpl.ALLOW_IGNORE_MAP;
		FOLDER = new File(".").getCanonicalPath().replace('\\', '/') + "/temp_" + UUID.randomUUID();
		System.out.println("Create: " + FOLDER);
		

		File lido_original = new File("lido.xml");
		File lido_copy = new File(FOLDER + "/files/lido.xml");

		File variants_original = new File("./src/qualitypatternmodel/newservlets/jsons");
		File variants_copy = new File(FOLDER + "/templates/variants");

		try {
			FileUtils.copyFile(lido_original, lido_copy);
			FileUtils.copyDirectory(variants_original, variants_copy);
			System.out.println("Files copied successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ServletContext context = mock(ServletContext.class);
		doAnswer(invocation -> {
			String argument = invocation.getArgument(0);
			if (argument.startsWith("/")) {
				return FOLDER + argument;
			} else {
				return FOLDER + argument;
			}
		}).when(context).getRealPath(anyString());
		System.out.println("Mock initialized successfully");
		
		InitialisationServlet.initialisation(context);

		for (int i = 0; i < NUM_CONSTRAINTS; i++) {
			String id = newConstraint();
			if (i < NUM_READYCONSTRAINTS)
				setAllConstraintParameter(id);
		}	
	}

	@AfterAll
	public static void close() throws IOException {
		System.out.println("Delete: " + FOLDER);
		FileUtils.deleteDirectory(new File(FOLDER));
	}

	// __________ BASE FUNCTIONS __________

	static Map<String, String[]> getEmptyParams() {
		return new HashMap<String, String[]>();
	}

	static String newConstraint()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		return newConstraint("Match_xml", "default-constraint");
	}

	static String newConstraint(String pattern, String variant)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		JSONObject ob = TemplateInstantiateServlet.applyPut("/xml/" + pattern + "/" + variant,
				getEmptyParams());
		try {
			return ob.getString(ConstantsJSON.CONSTRAINT_ID);
		} catch (JSONException e) {
			return null;
		}
	}

	static JSONObject getConstraint(String id)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		return ConstraintServlet.applyGet("/xml/" + id, getEmptyParams());
	}

	static void deleteConstraint(String id)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ConstraintServlet.applyDelete("/xml/" + id, getEmptyParams());
	}

	// __________ HELPEr FUNCTIONS __________

	private static void setAllConstraintParameter(String constraintId) throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		List<String> params = getAllConstraintParameter(constraintId);
		if (params != null)
		for (String param: params)
			setDefaultParameter(constraintId, param);
	}
	
	private static List<String> getAllConstraintParameter(String connstraintId) throws InvalidServletCallException, FailedServletCallException, ServletException, IOException{
		JSONObject json = getConstraint(connstraintId);
		JSONObject variant = (JSONObject) json.getJSONArray(ConstantsJSON.VARIANTS).get(0);
		JSONArray params = variant.getJSONArray(ConstantsJSON.PARAMETER);
		List<String> paramstrings = params.toList().stream()
			    .map(obj -> (String) obj)
			    .collect(Collectors.toList()); 
		return paramstrings;
	}
	
	private static void setDefaultParameter(String constraintId, String param) {
		JSONObject obj = new JSONObject("{'XmlPath_Element': '//*', 'XmlPath_Property': '/*/text()', 'ComparisonOption': 'EQUAL', 'Number': '1', 'TextList':'[\"a\",\"b\"]', 'Boolean':'true', 'Text':'a'}");

		if (Set.of("name", "namespace", "datamodel", "database").contains(param))
			return;

		for (String key: obj.keySet())
			if (param.startsWith(key)) {
				ParameterFragmentImpl.ALLOW_IGNORE_MAP = true;
				setConstraintParameter(constraintId, param, obj.getString(key));
				ParameterFragmentImpl.ALLOW_IGNORE_MAP = default_allow_ignore_map;
				return;
			}
		throw new RuntimeException("No default value defined for:" + param);
	}

	private static void setConstraintParameter(String constraintId, String parameterId, String value) {
		Map<String, String[]> params1 = APICallTests.getEmptyParams();
		params1.put(parameterId, new String[] { value });
		JSONObject result = null;
		try {
			result = ConstraintServlet.applyPost("/xml/" + constraintId, params1);
		} catch (InvalidServletCallException | FailedServletCallException e) {
			e.printStackTrace();
		}
		if (result.has(ConstantsJSON.FAILED))
			System.out.println(result);
		assert (!result.has(ConstantsJSON.FAILED));
		assert (result.has(ConstantsJSON.SUCCESS));
	}

	// __________ API CALL TESTS __________

	@Test
	public void testPatternListServletGetAll()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		PatternListServlet.applyGet("/xml" + "/all", getEmptyParams());	
	}

	@Test
	public void testPatternListServletGetTemplate()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		PatternListServlet.applyGet("/xml" + "/template", getEmptyParams());
	}

	@Test
	public void testPatternListServletGetConcrete()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		PatternListServlet.applyGet("/xml" + "/concrete", getEmptyParams());
	}

	@Test
	public void testPatternListServletGetReady()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		PatternListServlet.applyGet("/xml" + "/ready", getEmptyParams());
	}
}

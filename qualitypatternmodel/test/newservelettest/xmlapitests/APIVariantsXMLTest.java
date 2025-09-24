package newservelettest.xmlapitests;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.newservlets.ConstraintExecuteServlet;
import qualitypatternmodel.newservlets.ConstraintQueryServlet;
import qualitypatternmodel.newservlets.ConstraintServlet;
import qualitypatternmodel.newservlets.InitialisationServlet;
import qualitypatternmodel.newservlets.PatternListServlet;
import qualitypatternmodel.newservlets.TemplateVariantServlet;
import qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl;
import qualitypatternmodel.utility.ConstantsJSON;

public class APIVariantsXMLTest {
	private static final boolean DELETE = true;
	private static final boolean PRINTPARAMS = false;
	private static final boolean PRINTCONSTRAINT = false;
	private static final boolean PRINTQUERY = false;
	
	// __________ STATIC VARIABLES __________
	private static String folder;
	private static JSONObject store;
	private static Boolean default_allow_ignore_map;
	private static final List<String[]> pairs = getTemplateVariantPairs();
	// __________ SETUP FUNCTIONS __________

	@BeforeAll
	public static void initialize()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		default_allow_ignore_map = ParameterFragmentImpl.ALLOW_IGNORE_MAP;
		folder = new File(".").getCanonicalPath().replace('\\', '/') + "/temp_" + UUID.randomUUID();
		System.out.println("Create: " + folder);

		File variants_original = new File("./src/qualitypatternmodel/newservlets/jsons/xml");
		File variants_copy = new File(folder + "/templates/variants/xml");

		File lido_original = new File("lido.xml");
		File lido_copy = new File(folder + "/files/lido.xml");
		
		File database_original = new File("./demo.data/demo_database.xml");
		File database_copy = new File(folder + "/files/demo_database.xml");

		try {
			FileUtils.copyDirectory(variants_original, variants_copy);
			FileUtils.copyFile(lido_original, lido_copy);
			FileUtils.copyFile(database_original, database_copy);
			System.out.println("Files copied successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ServletContext context = mock(ServletContext.class);
		doAnswer(invocation -> {
			String argument = invocation.getArgument(0);
			if (argument.startsWith("/")) {
				return folder + argument;
			} else {
				return folder + argument;
			}
		}).when(context).getRealPath(anyString());
		System.out.println("Mock initialized successfully");
		
		InitialisationServlet.initialisation(context);
		
		store = new JSONObject();
		for (Object template: PatternListServlet.applyGet("/xml" + "/template", new HashMap<String, String[]>()).getJSONArray("templates")) {
			JSONObject obj = (JSONObject) template;
			JSONArray variants = obj.getJSONArray(ConstantsJSON.VARIANTS);
			JSONArray variantIDs = new JSONArray();
			
			for (Object variant: variants)
				variantIDs.put(((JSONObject) variant).getString(ConstantsJSON.NAME));
			
			JSONObject object = new JSONObject();
			object.put("IDs", variantIDs);
			object.put("size", obj.getJSONArray(ConstantsJSON.VARIANTS).length());
			store.put(obj.getString(ConstantsJSON.CONSTRAINT_ID), object);
		}
		System.out.println("STORE: " + store);
	}

	private static List<String[]> getTemplateVariantPairs() {
		File jsondir = new File("./src/qualitypatternmodel/newservlets/jsons/xml");
		ArrayList<File> files = InitialisationServlet.getAllJSONFilesInFolder(jsondir);

		List<String[]> pairs = new ArrayList<String[]>();
		for (File file: files) {
			try {
				JSONObject object = InitialisationServlet.readJsonFromFile(file);

				String template = object.getString(ConstantsJSON.TEMPLATE);
				String variant = object.getString(ConstantsJSON.NAME);
				pairs.add(new String[] {template, variant});

			} catch (IOException e) {
				new RuntimeException("invalid variant definition in: " + file).printStackTrace();
			}
			
		}
		return pairs;
	}
	
    static Stream<Arguments> stringPairsProvider() {
        return pairs.stream()
                .map(pair -> Arguments.of(pair[0], pair[1]));
    }

	@AfterAll
	public static void close() throws IOException {
		System.out.println("Delete: " + folder);
		if (DELETE)
			FileUtils.deleteDirectory(new File(folder));
	}

	// __________ BASE FUNCTIONS __________

	static Map<String, String[]> getEmptyParams() {
		return new HashMap<String, String[]>();
	}

	static JSONObject getConstraint(String id)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		return ConstraintServlet.applyGet("/xml/" + id, getEmptyParams());
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
		JSONObject obj = new JSONObject("{'XmlPath_Element': '//*', 'XmlPath_Property': '/*/text()', 'ComparisonOption': 'EQUAL', 'Number': '1', 'TextList':'[\"a\"]', 'Boolean':'true', 'Text':'a'}");

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

	private void testConcretePattern(String constraintID)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		Map<String, String[]> params1 = APICallTests.getEmptyParams();
		params1.put("constraints", new String[] { constraintID });
		JSONObject query1 = ConstraintQueryServlet.applyGet2("/xml", params1);
		APICallTests.assertQueryObject(query1);
		JSONObject query2 = ConstraintQueryServlet.applyGet3("/xml/" + constraintID, APICallTests.getEmptyParams());
		APICallTests.assertQueryObject(query2);
		APICallTests.assertSimilarJSONObjects(query1, query2);

		Map<String, String[]> params2 = APICallTests.getEmptyParams();
		params2.put("constraintIDs", new String[] { constraintID });
		params2.put("files", new String[] { "lido.xml", "demo_database.xml"});
		JSONObject result = ConstraintExecuteServlet.applyGet("/xml", params2);
		APICallTests.assertExecuteResultObject(result, false);
	}

	// __________ CONCRETE PATTERN TESTS __________

	@ParameterizedTest
    @MethodSource("stringPairsProvider")
	public void testVariant(String constraint, String variant)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {

		if(PRINTPARAMS) {
			Map<String, String[]> params = getEmptyParams();
			params.put(ConstantsJSON.VARIANTS, new String[]{"false"});
			JSONObject myparams = TemplateVariantServlet.applyGet("/xml/" + constraint, params);
			System.out.println(constraint + "\t" + variant+ "\t" + myparams);
		}
		String constraintID = APICallTests.newConstraint(constraint, variant);
		
		if(PRINTCONSTRAINT) {
			Map<String, String[]> params = getEmptyParams();
			JSONObject myconstraint = getConstraint(constraintID);
			System.out.println(constraint + "\t" + variant+ "\t" + constraintID + "\t" + myconstraint);
			testConstraintParameter(myconstraint);
		}
		
		setAllConstraintParameter(constraintID);

		if (PRINTQUERY)
			System.out.println(ConstraintQueryServlet.applyGet("xml", new String[] {constraintID}));

		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);
	}

	private void testConstraintParameter(JSONObject myconstraint) {
		JSONArray variants = myconstraint.getJSONArray(ConstantsJSON.VARIANTS);
		JSONObject variant = variants.getJSONObject(0);
		JSONArray fragments = variant.getJSONArray(ConstantsJSON.FRAGMENTS);
		
		ArrayList<String> ids = new ArrayList<String>();
		for (int i = 0; i<fragments.length(); i++) {
			JSONObject fragment = fragments.getJSONObject(i);
			if (fragment.has(ConstantsJSON.STARTPOINT)) {
				JSONArray startpoints = fragment.getJSONArray(ConstantsJSON.STARTPOINT);
				for (int j = 0; j<startpoints.length(); j++) {
					assert(ids.contains(startpoints.getString(j)));
				}
			}
			if (fragment.has(ConstantsJSON.ID))
				ids.add(fragment.getString(ConstantsJSON.ID));
		}
	}
}

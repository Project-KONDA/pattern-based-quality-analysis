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
import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.newservlets.ConstraintExecuteServlet;
import qualitypatternmodel.newservlets.ConstraintQueryServlet;
import qualitypatternmodel.newservlets.ConstraintServlet;
import qualitypatternmodel.newservlets.InitialisationServlet;
import qualitypatternmodel.newservlets.PatternListServlet;
import qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.Util;

public class APIVariantsStoreResults {
	private static final boolean DELETE = true;
	// __________ STATIC VARIABLES __________
	private static String folder;
	private static ObjectNode store;
	private static Boolean default_allow_ignore_map;
	private static final List<String[]> pairs = getTemplateVariantArrays();
//	private static String jsonfile = "/jsonresult.json";
	private static String jsonfile = "/jsonresult_" + Util.EXECUTION_PROCESSOR + ".json";
	
	// __________ SETUP FUNCTIONS __________
	
	
	public static void main(String[] args) throws IOException, InvalidServletCallException, FailedServletCallException, ServletException {
		Util.exportJson(Util.jsonCreateObject(), jsonfile);
//		initialize();
		APIVariantsStoreResults test = new APIVariantsStoreResults();
		test.initialize();
		ObjectNode success = Util.jsonCreateObject();
		ObjectNode failed = Util.jsonCreateObject();
		ObjectNode result = Util.jsonCreateObject();
		result.set("failed", failed);
		result.set("success", success);
		
		for (String[] array: pairs) {
			try {
				test.testVariant(array[0], array[1]);
			} catch (Exception e) {
				failed.put(array[0], array[1]);
			}
			success.put(array[0], array[1]);
		}
		System.out.println(Util.jsonPretty(result));
		close();
	}

	public void initialize()
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
		
		store = Util.jsonCreateObject();
		ArrayNode templates = (ArrayNode) PatternListServlet.applyGet("/xml" + "/template", new HashMap<String, String[]>()).get("templates");
		for (Object template: templates) {
			ObjectNode obj = (ObjectNode) template;
			ArrayNode variants = (ArrayNode) obj.get(ConstantsJSON.VARIANTS);
			ArrayNode variantIDs = Util.jsonCreateArray();
			
			for (Object variant: variants)
				variantIDs.add(((ObjectNode) variant).get(ConstantsJSON.NAME).asText());
			
			ObjectNode object = Util.jsonCreateObject();
			object.set("IDs", variantIDs);
			object.put("size", obj.get(ConstantsJSON.VARIANTS).size());
			store.set(obj.get(ConstantsJSON.CONSTRAINT_ID).asText(), object);
		}
		System.out.println("STORE: " + store);
	}

	private static List<String[]> getTemplateVariantArrays() {
		File jsondir = new File("./src/qualitypatternmodel/newservlets/jsons/xml");
		ArrayList<File> files = InitialisationServlet.getAllJSONFilesInFolder(jsondir);

		List<String[]> pairs = new ArrayList<String[]>();
		for (File file: files) {
			try {
				ObjectNode object = InitialisationServlet.readJsonFromFile(file);

				String template = object.get(ConstantsJSON.TEMPLATE).asText();
				String variant = object.get(ConstantsJSON.NAME).asText();
				String hasCustom = "" + object.has(ConstantsJSON.CUSTOM);
				pairs.add(new String[] {template, variant, hasCustom});

			} catch (IOException e) {
				new RuntimeException("invalid variant definition in: " + file).printStackTrace();
			}
			
		}
		return pairs;
	}

	public static void close() throws IOException {
		System.out.println("Delete: " + folder);
		if (DELETE)
			FileUtils.deleteDirectory(new File(folder));
	}

	// __________ BASE FUNCTIONS __________

	static Map<String, String[]> getEmptyParams() {
		return new HashMap<String, String[]>();
	}

	static ObjectNode getConstraint(String id)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		return ConstraintServlet.applyGet("/xml/" + id, getEmptyParams());
	}

	// __________ HELPER FUNCTIONS __________

	private static void setAllConstraintParameter(String constraintId) throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		List<String> params = getAllConstraintParameter(constraintId);
		if (params != null)
		for (String param: params)
			setDefaultParameter(constraintId, param);
	}
	
	private static List<String> getAllConstraintParameter(String connstraintId) throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ObjectNode json = getConstraint(connstraintId);
		ObjectNode variant = (ObjectNode) ((ArrayNode) json.get(ConstantsJSON.VARIANTS)).get(0);
		ArrayNode params = (ArrayNode) variant.get(ConstantsJSON.PARAMETER);
		List<String> paramstrings = new ArrayList<>();
		for (JsonNode param : params) {
		    paramstrings.add(param.asText());
		} 
		return paramstrings;
	}
	
	private static void setDefaultParameter(String constraintId, String param) throws JsonMappingException, JsonProcessingException {
		ObjectNode obj = Util.jsonCreateObject("{'XmlPath_Element': '//*', 'XmlPath_Property': '/*/text()', 'ComparisonOption': 'EQUAL', 'Number': '1', 'TextList':'[\"a\",\"b\"]', 'Boolean':'true', 'Text':'a'}");

		if (Set.of("name", "namespace", "datamodel", "database").contains(param))
			return;

		for (String key: Util.jsonKeySet(obj))
			if (param.startsWith(key)) {
				ParameterFragmentImpl.ALLOW_IGNORE_MAP = true;
				setConstraintParameter(constraintId, param, obj.get(key).asText());
				ParameterFragmentImpl.ALLOW_IGNORE_MAP = default_allow_ignore_map;
				return;
			}
		throw new RuntimeException("No default value defined for:" + param);
	}

	private static void setConstraintParameter(String constraintId, String parameterId, String value) {
		Map<String, String[]> params1 = APICallTests.getEmptyParams();
		params1.put(parameterId, new String[] { value });
		ObjectNode result = null;
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

	// __________ CONCRETE PATTERN TESTS __________

	public void testVariant(String constraint, String variant)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = APICallTests.newConstraint(constraint, variant);
		setAllConstraintParameter(constraintID);
		Map<String, String[]> params1 = APICallTests.getEmptyParams();
		params1.put("constraints", new String[] { constraintID });
		ObjectNode query = ConstraintQueryServlet.applyGet2("/xml", params1);

		Map<String, String[]> params2 = APICallTests.getEmptyParams();
		params2.put("constraintIDs", new String[] { constraintID });
		params2.put("files", new String[] { "lido.xml", "demo_database.xml"});
		ObjectNode result = ConstraintExecuteServlet.applyGet("/xml", params2);

		ObjectNode constraintinfo = Util.jsonCreateObject();
		constraintinfo.put("constraint", constraint);
		constraintinfo.put("variant", variant);
		constraintinfo.put("constraintID", constraintID);
		constraintinfo.set("query", query);
		constraintinfo.set("result", result);

		ObjectNode storage = Util.loadJson(jsonfile);
		storage.set(constraint + "_" + variant, constraintinfo);
		Util.exportJson(storage, jsonfile);
		
	}
}

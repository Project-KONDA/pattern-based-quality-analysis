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
import java.util.UUID;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
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
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.Util;

public class APIVariantsXMLTest {
	private static final boolean DELETE = true;
	private static final boolean PRINTPARAMS = false;
	private static final boolean PRINTCONSTRAINT = false;
	private static final boolean PRINTQUERY = false;
	
	// __________ STATIC VARIABLES __________
	private static String folder;
	private static ObjectNode store;
	private static Boolean default_allow_ignore_map;
	private static final List<String[]> pairs = getTemplateVariantArrays();
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

		File template_info_original = new File("./src/qualitypatternmodel/newservlets/template_info.json");
		File template_info_copy = new File(folder + "/templates/template_info.json");

		File template_maps_original = new File("./src/qualitypatternmodel/newservlets/template_maps.json");
		File template_maps_copy = new File(folder + "/templates/template_maps.json");

		try {
			FileUtils.copyDirectory(variants_original, variants_copy);
			FileUtils.copyFile(lido_original, lido_copy);
			FileUtils.copyFile(database_original, database_copy);
			FileUtils.copyFile(template_info_original, template_info_copy);
			FileUtils.copyFile(template_maps_original, template_maps_copy);
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
			
			for (com.fasterxml.jackson.databind.JsonNode variant: variants)
				variantIDs.add(variant.get(ConstantsJSON.NAME).asText());
			
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

			} catch (RuntimeException | IOException e) {
				new RuntimeException("invalid variant definition in: " + file, e).printStackTrace();
			}
		}
		return pairs;
	}
	
    static Stream<Arguments> stringPairsProvider() {
        return pairs.stream()
                .map(array -> Arguments.of(array[0], array[1], array[2].equals("true")));
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

	static ObjectNode getConstraint(String id)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		return ConstraintServlet.applyGet("/xml/" + id, getEmptyParams());
	}

	// __________ HELPEr FUNCTIONS __________

	private static void setAllConstraintParameter(String constraintId) throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		List<ObjectNode> params = getAllConstraintParameter(constraintId);
		if (params != null)
		for (ObjectNode param: params)
			setDefaultParameter(constraintId, param);
	}
	
	private static List<ObjectNode> getAllConstraintParameter(String connstraintId) throws InvalidServletCallException, FailedServletCallException, ServletException, IOException{
		ObjectNode json = getConstraint(connstraintId);
		ObjectNode variant = (ObjectNode) json.get(ConstantsJSON.VARIANTS).get(0);
		ArrayNode fragments = (ArrayNode) variant.get(ConstantsJSON.FRAGMENTS);
		List<ObjectNode> fragmentslist = new ArrayList<ObjectNode>();
		for (int i = 0; i<fragments.size(); i++) {
			ObjectNode fragment = (ObjectNode) fragments.get(i);
			if (fragment.has(ConstantsJSON.NAME))
				fragmentslist.add(fragment);
		}
		return fragmentslist;
	}
	
	private static void setDefaultParameter(String constraintId, ObjectNode param) throws JsonMappingException, JsonProcessingException {
		String paramid = param.path(ConstantsJSON.ID).asText();
		String paramtype = param.path(ConstantsJSON.TYPE).asText();
		String paramrole = param.path(ConstantsJSON.ROLE).asText();

		ObjectNode obj = Util.jsonCreateObject("{'XmlPath_Element': '//*', 'XmlPath_Property': '/*/text()', 'ComparisonOption': 'EQUAL', 'Number': '1', 'Text':'a', 'TextList':'[\"c\",\"d\"]', 'Boolean':'true', 'TypeOption':'STRING'}");
		
		if (paramtype.equals(Constants.PARAMETER_TYPE_ENUMERATION)) {
			String value = param.get(ConstantsJSON.OPTIONS).get(0).asText();
			setConstraintParameter(constraintId, paramid, value);
			return;
		}
		
		try {
			ParameterFragmentImpl.ALLOW_IGNORE_MAP = true;
			setConstraintParameter(constraintId, paramid, obj.get(paramrole).asText());
			ParameterFragmentImpl.ALLOW_IGNORE_MAP = default_allow_ignore_map;
			return;
		} catch (Exception e) {
			throw new RuntimeException("No default value defined for:" + paramid + "(" + paramrole + ")", e);
		}
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
			System.out.println("FAILED: " + result);
		assert (!result.has(ConstantsJSON.FAILED));
		assert (result.has(ConstantsJSON.SUCCESS));
	}

	private void testConcretePattern(String constraintID, boolean hasCustom)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		Map<String, String[]> params1 = APICallTests.getEmptyParams();
		params1.put("constraints", new String[] { constraintID });
		ObjectNode query1 = ConstraintQueryServlet.applyGet2("/xml", params1);
		APICallTests.assertQueryObject(query1);
		assert(hasCustom == query1.get(ConstantsJSON.CONSTRAINTS).get(0).has(ConstantsJSON.CUSTOM));
		ObjectNode query2 = ConstraintQueryServlet.applyGet3("/xml/" + constraintID, APICallTests.getEmptyParams());
		APICallTests.assertQueryObject(query2);
		assert(hasCustom == query1.get(ConstantsJSON.CONSTRAINTS).get(0).has(ConstantsJSON.CUSTOM));
		APICallTests.assertSimilarJSONObjects(query1, query2);

		Map<String, String[]> params2 = APICallTests.getEmptyParams();
		params2.put("constraintIDs", new String[] { constraintID });
		params2.put("files", new String[] { "lido.xml", "demo_database.xml"});
		ObjectNode result = ConstraintExecuteServlet.applyGet("/xml", params2);
		APICallTests.assertExecuteResultObject(result, false);
		assert(hasCustom == result.get(ConstantsJSON.RESULT).get(0).has(ConstantsJSON.CUSTOM));
	}

	// __________ CONCRETE PATTERN TESTS __________

	@ParameterizedTest
    @MethodSource("stringPairsProvider")
	public void testVariant(String constraint, String variant, boolean hasCustom)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {

		if(PRINTPARAMS) {
			Map<String, String[]> params = getEmptyParams();
			params.put(ConstantsJSON.VARIANTS, new String[]{"false"});
			ObjectNode myparams = TemplateVariantServlet.applyGet("/xml/" + constraint, params);
			System.out.println(constraint + "\t" + variant+ "\t" + myparams);
		}
		String constraintID = APICallTests.newConstraint(constraint, variant);
		
		if(PRINTCONSTRAINT) {
			ObjectNode myconstraint = getConstraint(constraintID);
			System.out.println(constraint + "\t" + variant+ "\t" + constraintID + "\t" + myconstraint);
			testConstraintParameter(myconstraint);
		}
		
		setAllConstraintParameter(constraintID);

		if (PRINTQUERY)
			System.out.println(ConstraintQueryServlet.applyGet("xml", new String[] {constraintID}));

		testConcretePattern(constraintID, hasCustom);
		if (DELETE)
			APICallTests.deleteConstraint(constraintID);
	}
	
	@Test
	public void testIsil() throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraint = "MatchExists_xml";
		String variant = "predefined-formats";
		String constraintID = APICallTests.newConstraint(constraint, variant);
		setAllConstraintParameter(constraintID);
		System.out.println(getAllConstraintParameter(constraintID));
		
		String paramjson = "{\"role\":\"Text\",\"options\":[\"ISIL (ISO 15511, DE only)\"],\"id\":\"Text_2\",\"type\":\"Enumeration\"}";
		
		setDefaultParameter(constraintID, Util.jsonCreateObject(paramjson));
		
		ObjectNode res = ConstraintQueryServlet.applyGet("xml", new String[] {constraintID});
		System.out.println(res);
		System.out.println(res.get("constraints").get(0).get("query"));
		APICallTests.deleteConstraint(constraintID);

	}

	private void testConstraintParameter(ObjectNode myconstraint) {
		ArrayNode variants = (ArrayNode) myconstraint.get(ConstantsJSON.VARIANTS);
		ObjectNode variant = (ObjectNode) variants.get(0);
		ArrayNode fragments = (ArrayNode) variant.get(ConstantsJSON.FRAGMENTS);
		
		ArrayList<String> ids = new ArrayList<String>();
		for (int i = 0; i<fragments.size(); i++) {
			ObjectNode fragment = (ObjectNode) fragments.get(i);
			if (fragment.has(ConstantsJSON.STARTPOINT)) {
				ArrayNode startpoints = (ArrayNode) fragment.get(ConstantsJSON.STARTPOINT);
				for (int j = 0; j<startpoints.size(); j++) {
					assert(ids.contains(startpoints.get(j).asText()));
				}
			}
			if (fragment.has(ConstantsJSON.ID))
				ids.add(fragment.get(ConstantsJSON.ID).asText());
		}
	}
}

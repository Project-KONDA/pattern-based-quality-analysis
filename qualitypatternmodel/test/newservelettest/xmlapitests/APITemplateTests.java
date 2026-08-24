package newservelettest.xmlapitests;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.newservlets.ConstraintExecuteServlet;
import qualitypatternmodel.newservlets.ConstraintQueryServlet;
import qualitypatternmodel.newservlets.ConstraintServlet;
import qualitypatternmodel.newservlets.InitialisationServlet;
import qualitypatternmodel.newservlets.PatternListServlet;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.Util;

public class APITemplateTests {
	private static final boolean DELETE = true;
	private static String folder;
	private static ObjectNode store;

	public static void main(String[] args)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		new APITemplateTests().testfunction(args);
	}

	public void testfunction(String[] args)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {

		initialize();
		try {
			testTemplateCard();
			testTemplateContains();
			testTemplateMatch();
			testTemplateCompSet();
			testTemplateMandAtt();
			testTemplateStringLength();
			testTemplateUniqueness();
			testTemplateValidLink();
			testTemplateMandContent();

		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
	}

	// __________ SETUP FUNCTIONS __________

	@BeforeAll
	public static void initialize()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
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
			FileUtils.copyFile(lido_original, lido_copy);
			FileUtils.copyDirectory(variants_original, variants_copy);
			FileUtils.copyFile(template_info_original, template_info_copy);
			FileUtils.copyFile(template_maps_original, template_maps_copy);
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
		ArrayNode templates = (ArrayNode) PatternListServlet.applyGet("/xml" + "/template", new HashMap<String, String[]>()).get(ConstantsJSON.TEMPLATES);
		for (Object template: templates) {
			ObjectNode obj = (ObjectNode) template;
			ArrayNode variants = (ArrayNode) obj.get(ConstantsJSON.VARIANTS);
			ArrayNode variantIDs = Util.jsonCreateArray();
			
			for (Object variant: variants)
				variantIDs.add(((ObjectNode) variant).get(ConstantsJSON.NAME).asText());
			
			ObjectNode object = Util.jsonCreateObject();
			object.set("IDs", variantIDs);
			object.put("size", ((ArrayNode) obj.get(ConstantsJSON.VARIANTS)).size());
			store.set(obj.get(ConstantsJSON.CONSTRAINT_ID).asText(), object);
		}
//		System.out.println(store);
	}

	@AfterAll
	public static void close() throws IOException {
		System.out.println("Delete: " + folder);
		if (DELETE)
			FileUtils.deleteDirectory(new File(folder));
	}

	// __________ BASE FUNCTIONS __________

	private static ObjectNode setConstraintParameter(String constraintId, String parameterId, String value) {
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
		return result;
	}

	private void testConcretePattern(String constraintID)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		Map<String, String[]> params1 = APICallTests.getEmptyParams();
		params1.put("constraints", new String[] { constraintID });
		ObjectNode query1 = ConstraintQueryServlet.applyGet2("/xml", params1);
		APICallTests.assertQueryObject(query1);
		ObjectNode query2 = ConstraintQueryServlet.applyGet3("/xml/" + constraintID, APICallTests.getEmptyParams());
		APICallTests.assertQueryObject(query2);
		APICallTests.assertSimilarJSONObjects(query1, query2);

		Map<String, String[]> params2 = APICallTests.getEmptyParams();
		params2.put("constraintIDs", new String[] { constraintID });
		params2.put("files", new String[] { "lido.xml", "demo_database.xml"});
		ObjectNode result = ConstraintExecuteServlet.applyGet("/xml", params2);
		APICallTests.assertExecuteResultObject(result, true);
	}

//	private CompletePattern getConstraintPattern(String constraintID) {
//		try {
//			return EMFModelLoad.loadCompletePattern(FOLDER + "/templates/xml/concrete-patterns/" + constraintID + ".patternstructure");
//		} catch (IOException e) {
//			return null;
//		}
//	}

	// __________ CONCRETE PATTERN TESTS __________

	@Test
	public void testTemplateCard()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.get("Card_xml").get("size").asInt() >= 1);
		testConstraint("Card_xml", "default", 
				Map.of(
						"XmlPath_Element_0", "//*", 
						"ComparisonOption_1", "exactly", 
						"Number_2", "2", 
						"XmlPath_Element_3", "/*"));
	}


	@Test
	public void testTemplateContains()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.get("Contains_xml").get("size").asInt() >= 1);
		
		testConstraint("Contains_xml", "default", 
				Map.of(
						"XmlPath_Element_0", "//*", 
						"XmlPath_Property_1", "/text()", 
						"Boolean_2", "do", 
						"Text_3", "a"));
	}

	@Test
	public void testTemplateMatch()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.get("Match_xml").get("size").asInt() >= 4);

		testConstraint("Match_xml", "default", 
				Map.of(
						"XmlPath_Element_0", "//*", 
						"XmlPath_Property_1", "/text()", 
						"Boolean_2", "do not", 
						"Text_3", ".*a.*"));
	}

	@Test
	public void testTemplateCompSet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.get("CompSet_xml").get("size").asInt() >= 1);

		testConstraint("CompSet_xml", "default",
				Map.of("XmlPath_Element_0", "//*",
						"XmlPath_Property_1", "/text()",
						"ComparisonOption_2", "are",
						"TextList_3", "{\"a\"}"));
	}

	@Test
	public void testTemplateMandAtt()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.get("MandAtt_xml").get("size").asInt() >= 1);

		testConstraint("MandAtt_xml", "default",
				Map.of(
						"XmlPath_Element_0", "//*",
						"XmlPath_Property_1", "/text()"));
	}

	@Test
	public void testTemplateStringLength()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.get("StringLength_xml").get("size").asInt() >= 2);

		testConstraint("StringLength_xml", "default",
				Map.of(
						"XmlPath_Element_0", "//*",
						"XmlPath_Property_1", "/text()",
						"ComparisonOption_2", "exactly",
						"Number_3", "10"));
	}

	@Test
	public void testTemplateUniqueness()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.get("Unique_xml").get("size").asInt() >= 1);

		testConstraint("Unique_xml", "default",
				Map.of("XmlPath_Element_0", "//*",
						"XmlPath_Property_1", "/text()"));
	}

	@Test
	public void testTemplateValidLink()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.get("ValidLink_xml").get("size").asInt() >= 1);

		testConstraint("ValidLink_xml", "default",
				Map.of(
						"XmlPath_Element_0", "//*",
//						"Boolean_2", "is",						
						"XmlPath_Property_1", "/*/text()"
						));
	}

	@Test
	public void testTemplateMandContent() throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.get("MandCont_xml").get("size").asInt() >= 3);

		testConstraint("MandCont_xml", "default",
				Map.of(
						"XmlPath_Element_0", "//*",
						"XmlPath_Element_1", "//*",
						"XmlPath_Property_2", "/text()",
						"XmlPath_Element_3", "//*"));

		testConstraint("MandCont_xml", "simplified",
				Map.of("XmlPath_Element_0", "//*", 
						"XmlPath_Element_1", "//*",
						"XmlPath_Element_2", "//*"));
	}
	
	private void testConstraint(String constraint, String variant, Map<String, String> params) throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {

		String constraintID = APICallTests.newConstraint(constraint, variant);
		for (String key: params.keySet())
			setConstraintParameter(constraintID, key, params.get(key));

		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);
	}
}

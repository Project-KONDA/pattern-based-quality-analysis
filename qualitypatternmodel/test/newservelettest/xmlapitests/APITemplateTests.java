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
import org.json.JSONArray;
import org.json.JSONObject;
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
//import qualitypatternmodel.patternstructure.CompletePattern;
//import qualitypatternmodel.utility.EMFModelLoad;

public class APITemplateTests {
	private static String FOLDER;
	private static JSONObject store;

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
			testTemplateInvalidLink();
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
		FOLDER = new File(".").getCanonicalPath().replace('\\', '/') + "/temp_" + UUID.randomUUID();
		System.out.println("Create: " + FOLDER);

		File variants_original = new File("./src/qualitypatternmodel/newservlets/patterns/jsons");
		File variants_copy = new File(FOLDER + "/templates/variants");

		File lido_original = new File("lido.xml");
		File lido_copy = new File(FOLDER + "/files/lido.xml");
		
		File database_original = new File("./demo.data/demo_database.xml");
		File database_copy = new File(FOLDER + "/files/demo_database.xml");

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
				return FOLDER + argument;
			} else {
				return FOLDER + argument;
			}
		}).when(context).getRealPath(anyString());
		System.out.println("Mock initialized successfully");
		
		InitialisationServlet.initialisation(context);
		
		store = new JSONObject();
		for (Object template: PatternListServlet.applyGet("/xml" + "/template", new HashMap<String, String[]>()).getJSONArray("templates")) {
			JSONObject obj = (JSONObject) template;
			JSONArray variants = obj.getJSONArray("variants");
			JSONArray variantIDs = new JSONArray();
			
			for (Object variant: variants)
				variantIDs.put(((JSONObject) variant).getString("name"));
			
			JSONObject object = new JSONObject();
			object.put("IDs", variantIDs);
			object.put("size", obj.getJSONArray("variants").length());
			store.put(obj.getString("constraintID"), object);
		}
		System.out.println(store);
	}

	@AfterAll
	public static void close() throws IOException {
		System.out.println("Delete: " + FOLDER);
		FileUtils.deleteDirectory(new File(FOLDER));
	}

	// __________ BASE FUNCTIONS __________

	private static JSONObject setConstraintParameter(String constraintId, String parameterId, String value) {
		Map<String, String[]> params1 = APICallTests.getEmptyParams();
		params1.put(parameterId, new String[] { value });
		JSONObject result = null;
		try {
			result = ConstraintServlet.applyPost("/xml/" + constraintId, params1);
		} catch (InvalidServletCallException | FailedServletCallException e) {
			e.printStackTrace();
		}
		if (result.has("failed"))
			System.out.println(result);
		assert (!result.has("failed"));
		assert (result.has("success"));
		return result;
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
		APICallTests.assertExecuteResultObject(result);
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
		assert(store.getJSONObject("Card_xml").getInt("size") == 3);

		String constraintID = APICallTests.newConstraint("Card_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "ComparisonOption_1", "exactly");
		setConstraintParameter(constraintID, "Number_2", "2");
		setConstraintParameter(constraintID, "XmlPath_Element_3", "/*");

		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);


		String constraintID2 = APICallTests.newConstraint("Card_xml", "question");
		setConstraintParameter(constraintID2, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID2, "ComparisonOption_1", "exactly not");
		setConstraintParameter(constraintID2, "Number_2", "2");
		setConstraintParameter(constraintID2, "XmlPath_Element_3", "/*");
		testConcretePattern(constraintID2);


		String constraintID3 = APICallTests.newConstraint("Card_xml", "question_simple");
		setConstraintParameter(constraintID3, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID3, "XmlPath_Element_1", "/*");
		testConcretePattern(constraintID3);

		APICallTests.deleteConstraint(constraintID3);
	}


	@Test
	public void testTemplateContains()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.getJSONObject("Contains_xml").getInt("size") == 1);

		String constraintID = APICallTests.newConstraint("Contains_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_1", "/text()");
		setConstraintParameter(constraintID, "Boolean_2", "does");
		setConstraintParameter(constraintID, "Text_3", "a");

		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateMatch()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.getJSONObject("Match_xml").getInt("size") == 2);

		String constraintID = APICallTests.newConstraint("Match_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_1", "/text()");
		setConstraintParameter(constraintID, "Boolean_2", "do not");
		setConstraintParameter(constraintID, "Text_3", ".*a.*");

		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateCompSet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.getJSONObject("CompSet_xml").getInt("size") == 1);

		String constraintID = APICallTests.newConstraint("CompSet_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_1", "/text()");
		setConstraintParameter(constraintID, "ComparisonOption_2", "is");
		setConstraintParameter(constraintID, "TextList_3", "{\"a\"}");

		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateMandAtt()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.getJSONObject("MandAtt_xml").getInt("size") == 1);

		String constraintID = APICallTests.newConstraint("MandAtt_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Element_1", "/*");

		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateStringLength()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.getJSONObject("StringLength_xml").getInt("size") == 1);

		String constraintID = APICallTests.newConstraint("StringLength_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_1", "/text()");
		setConstraintParameter(constraintID, "ComparisonOption_2", "exactly");
		setConstraintParameter(constraintID, "Number_3", "10");

		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateUniqueness()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.getJSONObject("Unique_xml").getInt("size") == 1);

		String constraintID = APICallTests.newConstraint("Unique_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_1", "/text()");

		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateInvalidLink()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.getJSONObject("InvalidLink_xml").getInt("size") == 2);

		String constraintID = APICallTests.newConstraint("InvalidLink_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_1", "/text()");
//		setConstraintParameter(constraintID, "Boolean_2", "is");

		System.out.println(ConstraintQueryServlet.applyGet("xml", new String[] {constraintID}));
		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);


		String constraintID2 = APICallTests.newConstraint("InvalidLink_xml", "question");
		setConstraintParameter(constraintID2, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID2, "XmlPath_Property_1", "/text()");
//		setConstraintParameter(constraintID2, "Boolean_2", "is");

		testConcretePattern(constraintID2);
		APICallTests.deleteConstraint(constraintID2);
	}

	@Test
	public void testTemplateMandContent() throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		assert(store.getJSONObject("MandCont_xml").getInt("size") == 4);

		String constraintID = APICallTests.newConstraint("MandCont_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Element_1", "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_2", "/text()");
		setConstraintParameter(constraintID, "XmlPath_Element_3", "//*");

		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);



		String constraintID2 = APICallTests.newConstraint("MandCont_xml", "constraint_2");
		setConstraintParameter(constraintID2, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID2, "XmlPath_Element_1", "//*");
		setConstraintParameter(constraintID2, "XmlPath_Element_2", "//*");

		testConcretePattern(constraintID2);
		APICallTests.deleteConstraint(constraintID2);



		String constraintID3 = APICallTests.newConstraint("MandCont_xml", "constraint_m");
		setConstraintParameter(constraintID3, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID3, "XmlPath_Property_1", "/text()");
		setConstraintParameter(constraintID3, "XmlPath_Element_2", "//*");

		testConcretePattern(constraintID3);
		APICallTests.deleteConstraint(constraintID3);



		String constraintID4 = APICallTests.newConstraint("MandCont_xml", "justnotempty");
		setConstraintParameter(constraintID4, "XmlPath_Element_0", "//*");

		testConcretePattern(constraintID4);
		APICallTests.deleteConstraint(constraintID4);
	}
}

package newservelettest.xmlapitests;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.newservlets.ConstraintExecuteServlet;
import qualitypatternmodel.newservlets.ConstraintQueryServlet;
import qualitypatternmodel.newservlets.ConstraintServlet;
import qualitypatternmodel.newservlets.InitialisationServlet;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;

public class APITemplateTests {
	private static String FOLDER;

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
		ServletContext context = mock(ServletContext.class);
		doAnswer(invocation -> {
			String argument = invocation.getArgument(0);
			if (argument.startsWith("/")) {
				return FOLDER + argument;
			} else {
				return FOLDER + argument;
			}
		}).when(context).getRealPath(anyString());
		InitialisationServlet.initialisation(context);

		File original = new File("lido.xml");
		File copy = new File(FOLDER + "/files/lido.xml");
		try {
			FileUtils.copyFile(original, copy);
		} catch (IOException e) {
			e.printStackTrace();
		}
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
		assert (result.has("success"));
		assert (!result.has("failed"));
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
		params2.put("files", new String[] { "lido.xml" });
		JSONObject result = ConstraintExecuteServlet.applyGet("/xml", params2);
		APICallTests.assertExecuteResultObject(result);
	}

	private CompletePattern getConstraintPattern(String constraintID) {
		try {
			return EMFModelLoad.loadCompletePattern(FOLDER + "/templates/xml/concrete-patterns/" + constraintID + ".patternstructure");
		} catch (IOException e) {
			return null;
		}
	}

	// __________ CONCRETE PATTERN TESTS __________

	@Test
	public void testTemplateCard()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = APICallTests.newConstraint("Card_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "ComparisonOption_1", "exactly");
		setConstraintParameter(constraintID, "Number_2", "2");
		setConstraintParameter(constraintID, "XmlPath_Element_3", "/*");

		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateContains()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
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
		String constraintID = APICallTests.newConstraint("MandAtt_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Element_1", "/*");

		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateStringLength()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
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
		String constraintID = APICallTests.newConstraint("Unique_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_1", "/text()");

		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateInvalidLink()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = APICallTests.newConstraint("InvalidLink_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_1", "/text()");
		setConstraintParameter(constraintID, "Boolean_2", "is");

		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateInvalidLink2()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = APICallTests.newConstraint("InvalidLink_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_1", "/text()");
		setConstraintParameter(constraintID, "Boolean_2", "is not");

		CompletePattern pattern = getConstraintPattern(constraintID);
		System.out.println(pattern.myToString());
		try {
			System.out.println(pattern.generateQueryFilter().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		testConcretePattern(constraintID);
		APICallTests.deleteConstraint(constraintID);
	}
}

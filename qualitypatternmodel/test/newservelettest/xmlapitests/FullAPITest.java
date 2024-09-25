package newservelettest.xmlapitests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

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
import qualitypatternmodel.newservlets.ConstraintCopyServlet;
import qualitypatternmodel.newservlets.ConstraintDataModelServlet;
import qualitypatternmodel.newservlets.ConstraintDatabaseServlet;
import qualitypatternmodel.newservlets.ConstraintExecuteServlet;
import qualitypatternmodel.newservlets.ConstraintMqafServlet;
import qualitypatternmodel.newservlets.ConstraintNameServlet;
import qualitypatternmodel.newservlets.ConstraintQueryServlet;
//import qualitypatternmodel.newservlets.ConstraintQueryServlet;
import qualitypatternmodel.newservlets.ConstraintServlet;
import qualitypatternmodel.newservlets.ConstraintTagServlet;
import qualitypatternmodel.newservlets.InitialisationServlet;
import qualitypatternmodel.newservlets.PatternListServlet;
import qualitypatternmodel.newservlets.TemplateInstantiateServlet;
import qualitypatternmodel.newservlets.TemplateVariantServlet;

public class FullAPITest {
	private static String FOLDER;

	public static void main(String[] args)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		new FullAPITest().testfunction(args);
	}

	public void testfunction(String[] args)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {

		initialize();
		try {

			testBasics();
			testConstraintCopyServlet();
			testConstraintDatabaseServlet();
			testConstraintDataModelServlet();
			testConstraintTagServlet();
			testConstraintNameServletPost();

			testConstraintServletPost();
			testPatternListServletGetAll();
			testPatternListServletGetTemplate();
			testPatternListServletGetConcreteEmpty();
			testPatternListServletGetReadyEmpty();
			testPatternListServletGetConcrete();

			testConstraintMqafServlet();
			testConstraintQueryServlet();

			testConstraintExecuteServletGet();

			testTemplateVariantServletGet();
			testTemplateVariantServletPutDelete();

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

	private static Map<String, String[]> getEmptyParams() {
		return new HashMap<String, String[]>();
	}

	private static String newConstraint()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		return newConstraint("Match_xml", "default-antipattern");
	}

	private static String newConstraint(String pattern, String variant)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		JSONObject ob = TemplateInstantiateServlet.applyPut("/xml/" + pattern + "/" + variant,
				getEmptyParams());
		try {
			return ob.getString("constraintID");
		} catch (JSONException e) {
			return null;
		}
	}

	private static JSONObject setConstraintParameter(String constraintId, String parameterId, String value) {
		Map<String, String[]> params1 = getEmptyParams();
		params1.put(parameterId, new String[] { value });
		JSONObject result = null;
		try {
			result = ConstraintServlet.applyPost("/xml/" + constraintId, params1);
		} catch (InvalidServletCallException | FailedServletCallException e) {
			e.printStackTrace();
		}
		return result;	
	}

	private static JSONObject getConstraint(String id)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		return ConstraintServlet.applyGet("/xml/" + id, getEmptyParams());
	}

	private static void deleteConstraint(String id)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ConstraintServlet.applyDelete("/xml/" + id, getEmptyParams());
	}

	private void testConcretePattern(String constraintID)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		Map<String, String[]> params1 = getEmptyParams();
		params1.put("constraints", new String[] {constraintID});
		JSONObject query1 = ConstraintQueryServlet.applyGet2("/xml", params1);
		assertQueryObject(query1);
		JSONObject query2 = ConstraintQueryServlet.applyGet3("/xml/" + constraintID, getEmptyParams());
		assertQueryObject(query2);
		assertSimilarJSONObjects(query1, query2);

		Map<String, String[]> params2 = getEmptyParams();
		params2.put("constraintIDs", new String[] {constraintID});
		params2.put("files", new String[] { "lido.xml" });
		JSONObject result = ConstraintExecuteServlet.applyGet("/xml", params2);
		assertExecuteResultObject(result);
	}

	// __________ ASSERTIONS __________

	private static void assertPatternJSONObjectArray(JSONArray object) {
		for (int i = 0; i < object.length(); i++)
			assertPatternJSONObject(object.getJSONObject(i));
	}

	private static void assertPatternJSONObject(JSONObject object) {
		assert (object.has("name"));
		assert (object.has("constraintID"));
		assert (object.has("variants"));
		assert (object.has("description"));
		assert (object.has("language") && object.get("language").toString().equals("xml"));
		assert (object.has("executable"));
		assert (object.has("mqafExecutable"));
		assert (object.has("queryExecutable"));
		assert (object.has("filterExecutable"));
	}

	private void assertSimilarJSONObjects(JSONObject jsonDefault, JSONObject jsonCopy) {
		Set<String> keys1 = jsonDefault.keySet();
		Set<String> keys2 = jsonCopy.keySet();

		for (String key : keys1)
			assert (keys2.contains(key));
		for (String key : keys2)
			assert (keys1.contains(key));

		jsonDefault.remove("lastSaved");
		jsonCopy.remove("lastSaved");

		for (String key : keys1) {
			assertEquals(jsonDefault.get(key).toString(), jsonCopy.get(key).toString());
		}
	}

	private void assertQueryObject(JSONObject queryObject) {
		assert(queryObject.has("failed"));
		assert(queryObject.getJSONArray("failed").isEmpty());
		assert(queryObject.has("constraints"));
		JSONArray constraints = queryObject.getJSONArray("constraints");
		assert(constraints.length()>0);
		for (int i = 0; i<constraints.length(); i++) {
			JSONObject constraint = constraints.getJSONObject(i);
			assert(constraint.has("name"));
			assert(constraint.has("constraintID"));
			assert(constraint.has("language"));
			assert(constraint.has("technology"));
			assert(constraint.has("query"));
		}
	}

	private void assertMQAFObject(JSONObject mqaf) {
		assert (mqaf.has("constraint"));
		assert (mqaf.has("failed") && mqaf.getJSONArray("failed").isEmpty());
	}

	private void assertExecuteResultObject(JSONObject resultObject) {
		assert(resultObject.has("result"));
		JSONArray result = resultObject.getJSONArray("result");
		assert(result.length() > 0);
		for (int i = 0; i < result.length(); i++) {
			JSONObject object = result.getJSONObject(i);
			assert(object.has("constraintID"));
			assert(object.has("constraintName"));
			assert(object.has("file"));
			assert(object.has("incidents"));
			assert(object.has("totalFindings"));
			assert(object.has("totalIncidents"));
			assert(object.has("totalCompliances"));
//			assert(object.has("technology"));
//			assert(object.has("language"));
			JSONArray incidents = object.getJSONArray("incidents");
			assert(incidents.length() > 0);
		}
		assert(!resultObject.has("failedFiles"));
		assert(!resultObject.has("failedConstraints"));
	}

	private void assertVariantObject(JSONObject variant) {
		assert(variant.has("params"));
		JSONObject params = variant.getJSONObject("params");
		for (int i = 0; i<params.length(); i++) {
			assert(params.has("" + i));
		}

		assert(variant.has("variants"));
		JSONArray variants = variant.getJSONArray("variants");
		
		for (int i = 0; i<variants.length(); i++) {
			JSONObject var = variants.getJSONObject(i);
			assert(var.has("template"));
			assert(var.has("name"));
			assert(var.has("language"));
			assert(var.has("fragments"));
			JSONArray fragments = var.getJSONArray("fragments");
			assert(fragments.length()>0);
			for (int j = 0; j<fragments.length(); j++) {
				JSONObject fragment = fragments.getJSONObject(i);
				Boolean isText = fragment.has("text") && fragment.length() == 1;
				Boolean isFragment =
					fragment.has("name") &&
					fragment.has("params") &&
					fragment.has("exampleValue") &&
					fragment.has("newId") &&
					fragment.has("name");
				Boolean isPredef = 
					fragment.length() == 2 &&
					fragment.has("params") &&
					fragment.has("value");
				assert(isText || isFragment || isPredef);
			}
		}
	}

	private void assertVariantObjectWith(JSONObject variant, String variantname) {
		assertVariantObject(variant);
		JSONArray variants = variant.getJSONArray("variants");
		Boolean with = false;
		for (int i = 0; i<variants.length(); i++) {
			with = with || variants.getJSONObject(i).getString("name").equals(variantname);
		}
		assert(with);
	}

	private void assertVariantObjectWithout(JSONObject variant, String variantname) {
		assertVariantObject(variant);
		JSONArray variants = variant.getJSONArray("variants");
		Boolean without = true;
		for (int i = 0; i<variants.length(); i++) {
			without &= !variants.getJSONObject(i).getString("name").equals(variantname);
		}
		assert(without);
		
	}

	// __________ API CALL TESTS __________

	@Test
	public void testBasics()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constriantID = newConstraint();
		assertNotNull(constriantID);

		JSONObject constraint = getConstraint(constriantID);
		assertPatternJSONObject(constraint);
		deleteConstraint(constriantID);
		assertThrows(FailedServletCallException.class, () -> {
			getConstraint(constriantID);
		});
		assertThrows(FailedServletCallException.class, () -> {
			deleteConstraint(constriantID);
		});
	}

	@Test
	public void testConstraintDatabaseServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		String dbname1 = "db";
		String dbname2 = "db2";

		JSONObject nodb = ConstraintDatabaseServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (!nodb.has("database"));

		Map<String, String[]> params1 = getEmptyParams();
		params1.put("database", new String[] { dbname1 });
		JSONObject db1 = ConstraintDatabaseServlet.applyPost("/xml/" + constraintID, params1);
		assert (db1.has("constraintID") && db1.getString("constraintID").equals(constraintID));
		assert (db1.has("database") && db1.getString("database").equals(dbname1));
		assert (!db1.has("oldDatabase"));
		assert (db1.has("lastSaved"));

		JSONObject db1get = ConstraintDatabaseServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (db1get.has("database") && db1get.getString("database").equals(dbname1));

		Map<String, String[]> params2 = getEmptyParams();
		params2.put("database", new String[] { dbname2 });
		JSONObject db2 = ConstraintDatabaseServlet.applyPost("/xml/" + constraintID, params2);
		assert (db2.has("constraintID") && db2.getString("constraintID").equals(constraintID));
		assert (db2.has("database") && db2.getString("database").equals(dbname2));
		assert (db2.has("oldDatabase") && db2.getString("oldDatabase").equals(dbname1));
		assert (db2.has("lastSaved"));

		JSONObject db2get = ConstraintDatabaseServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (db2get.has("database") && db2get.getString("database").equals(dbname2));

		deleteConstraint(constraintID);
	}

	@Test
	public void testConstraintDataModelServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		String dmname1 = "dm";
		String dmname2 = "dm2";

		JSONObject nodm = ConstraintDatabaseServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (!nodm.has("datamodel"));

		Map<String, String[]> params1 = getEmptyParams();
		params1.put("datamodel", new String[] { dmname1 });
		JSONObject dm1 = ConstraintDataModelServlet.applyPost("/xml/" + constraintID, params1);
		assert (dm1.has("constraintID") && dm1.getString("constraintID").equals(constraintID));
		assert (dm1.has("datamodel") && dm1.getString("datamodel").equals(dmname1));
		assert (!dm1.has("oldDatamodel"));
		assert (dm1.has("lastSaved"));

		JSONObject dm1get = ConstraintDataModelServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (dm1get.has("datamodel") && dm1get.getString("datamodel").equals(dmname1));

		Map<String, String[]> params2 = getEmptyParams();
		params2.put("datamodel", new String[] { dmname2 });
		JSONObject dm2 = ConstraintDataModelServlet.applyPost("/xml/" + constraintID, params2);
		assert (dm2.has("constraintID") && dm2.getString("constraintID").equals(constraintID));
		assert (dm2.has("datamodel") && dm2.getString("datamodel").equals(dmname2));
		assert (dm2.has("oldDatamodel") && dm2.getString("oldDatamodel").equals(dmname1));
		assert (dm2.has("lastSaved"));

		JSONObject db2get = ConstraintDataModelServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (db2get.has("datamodel") && db2get.getString("datamodel").equals(dmname2));

		deleteConstraint(constraintID);
	}

	@Test
	public void testConstraintTagServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		String[] lst = new String[] { UUID.randomUUID().toString(), UUID.randomUUID().toString(),
				UUID.randomUUID().toString(), UUID.randomUUID().toString() };
		String[] arr012 = new String[] { lst[0], lst[1], lst[2] };
		String[] arr0123 = new String[] { lst[0], lst[1], lst[2], lst[3] };
		String[] arr123 = new String[] { lst[1], lst[2], lst[3] };
		String[] arr12 = new String[] { lst[1], lst[2] };

		Map<String, String[]> params1 = getEmptyParams();
		params1.put("tag", new String[] { lst[0], lst[1], lst[2] });
		Map<String, String[]> params2 = getEmptyParams();
		params2.put("tag", new String[] { lst[1], lst[2], lst[3] });
		Map<String, String[]> params3 = getEmptyParams();
		params3.put("tag", lst);
		Map<String, String[]> params4 = getEmptyParams();
		params4.put("tag", lst);

		JSONObject tags1 = ConstraintTagServlet.applyPost("/xml/" + constraintID, params1);
		assert (tags1.has("success") && tags1.getJSONArray("success").similar(new JSONArray(arr012)));
		assert (!tags1.has("failed"));

		JSONObject tags2 = ConstraintTagServlet.applyDelete("/xml/" + constraintID, params2);
		assert (tags2.has("success") && tags2.getJSONArray("success").similar(new JSONArray(arr12)));
		assert (tags2.has("failed")
				&& tags2.getJSONArray("failed").toString().contains("{\"" + lst[3] + "\":\"tag not found\"}"));

		JSONObject tags3 = ConstraintTagServlet.applyPost("/xml/" + constraintID, params3);
		assert (tags3.has("success") && tags3.getJSONArray("success").similar(new JSONArray(arr123)));
		assert (tags3.has("failed")
				&& tags3.getJSONArray("failed").toString().contains("\"" + lst[0] + "\":\"tag already added\""));

		JSONObject tags4 = ConstraintTagServlet.applyDelete("/xml/" + constraintID, params4);
		assert (tags4.has("success") && tags4.getJSONArray("success").similar(new JSONArray(arr0123)));
		assert (!tags4.has("failed"));

		deleteConstraint(constraintID);
	}

	@Test
	public void testConstraintNameServletPost()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		String newName = UUID.randomUUID().toString();
		JSONObject json = getConstraint(constraintID);
		assert (json.has("name") && !json.getString("name").equals(newName));
		Map<String, String[]> param = getEmptyParams();
		param.put("name", new String[] { newName });
		ConstraintNameServlet.applyPost("/xml/" + constraintID, param);
		JSONObject jsonNamed = getConstraint(constraintID);
		assert (jsonNamed.has("name") && jsonNamed.getString("name").equals(newName));
		deleteConstraint(constraintID);
	}

	@Test
	public void testConstraintCopyServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		JSONObject jsonDefault = getConstraint(constraintID);

		JSONObject jsonCopy = ConstraintCopyServlet.applyPut("/xml/" + constraintID, getEmptyParams());
		String constraintIDCopy = null;
		try {
			constraintIDCopy = jsonCopy.getString("constraintID");
			jsonDefault.remove("constraintID");
			jsonDefault.put("constraintID", constraintIDCopy);
			assertSimilarJSONObjects(jsonDefault, jsonCopy);

			deleteConstraint(constraintID);
			deleteConstraint(constraintIDCopy);
		} catch (JSONException e) {
			assert (false);
		}
	}

	@Test
	public void testConstraintServletPost()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintId = newConstraint();

		Map<String, String[]> params1 = getEmptyParams();
		params1.put("database", new String[] { "value" });
		params1.put("datamodel", new String[] { "value" });
		params1.put("XmlPath_Element_0", new String[] { "//*" });
		String uuidstring = UUID.randomUUID().toString();
		params1.put(uuidstring, new String[] { "value" });
		JSONObject get1 = ConstraintServlet.applyPost("/xml/" + constraintId, params1);
		assert (get1.has("success") && get1.getJSONArray("success")
				.similar(new JSONArray(new String[] { "XmlPath_Element_0", "database", "datamodel" })));
		assert (get1.has("failed") && get1.getJSONArray("failed").getJSONObject(0).has(uuidstring));
		assert (get1.has("available") && get1.getJSONArray("available").toList()
				.containsAll(Arrays.asList("database", "datamodel", "namespace", "name", "XmlPath_Element_0")));
		assert (get1.has("lastSaved"));

		JSONObject get = getConstraint(constraintId);
		assert (get.has("database") && get.getString("database").equals("value"));
		assert (get.has("datamodel") && get.getString("datamodel").equals("value"));

		deleteConstraint(constraintId);
	}

	@Test
	public void testPatternListServletGetAll()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		JSONObject listTemplate = PatternListServlet.applyGet("/xml" + "/all", getEmptyParams());
		int templateNo = new File(FOLDER + "/templates/xml/abstract-patterns").listFiles().length;
		assert (templateNo > 0);
		assert (listTemplate.has("total") && listTemplate.getInt("total") == templateNo);
		assert (listTemplate.has("ids") && listTemplate.getJSONArray("ids").length() == templateNo);
		assert (listTemplate.has("templates") && listTemplate.getJSONArray("templates").length() == templateNo);
		if (listTemplate.has("templates"))
			assertPatternJSONObjectArray(listTemplate.getJSONArray("templates"));
	}

	@Test
	public void testPatternListServletGetTemplate()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		JSONObject listTemplate = PatternListServlet.applyGet("/xml" + "/template", getEmptyParams());
		int templateNo = new File(FOLDER + "/templates/xml/abstract-patterns").listFiles().length;
		assert (templateNo > 0);
		assert (listTemplate.has("total") && listTemplate.getInt("total") == templateNo);
		assert (listTemplate.has("ids") && listTemplate.getJSONArray("ids").length() == templateNo);
		assert (listTemplate.has("templates") && listTemplate.getJSONArray("templates").length() == templateNo);
		if (listTemplate.has("templates"))
			assertPatternJSONObjectArray(listTemplate.getJSONArray("templates"));
	}

	@Test
	public void testPatternListServletGetConcreteEmpty()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		JSONObject listConcreteEmpty = PatternListServlet.applyGet("/xml" + "/concrete", getEmptyParams());
		assert (listConcreteEmpty.getInt("total") == 0);
		assert (listConcreteEmpty.has("ids") && listConcreteEmpty.getJSONArray("ids").isEmpty());
		assert (listConcreteEmpty.has("templates") && listConcreteEmpty.getJSONArray("templates").isEmpty());
	}

	@Test
	public void testPatternListServletGetReadyEmpty()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		JSONObject listReadyEmpty = PatternListServlet.applyGet("/xml" + "/ready", getEmptyParams());
		assert (listReadyEmpty.getInt("total") == 0);
		assert (listReadyEmpty.has("ids") && listReadyEmpty.getJSONArray("ids").isEmpty());
		assert (listReadyEmpty.has("templates") && listReadyEmpty.getJSONArray("templates").isEmpty());
	}

	@Test
	public void testPatternListServletGetConcrete()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ArrayList<String> ids = new ArrayList<String>();
		int n = 10;
		for (int i = 0; i < n; i++)
			ids.add(newConstraint());

		JSONObject listConcrete = PatternListServlet.applyGet("/xml" + "/concrete", getEmptyParams());
		assert (listConcrete.getInt("total") == 10);
		assert (listConcrete.has("ids") && listConcrete.getJSONArray("ids").length() == 10);
		assert (listConcrete.has("templates") && listConcrete.getJSONArray("templates").length() == 10);

		JSONObject listReadyEmpty = PatternListServlet.applyGet("/xml" + "/ready", getEmptyParams());
		assert (listReadyEmpty.getInt("total") == 0);
		assert (listReadyEmpty.has("ids") && listReadyEmpty.getJSONArray("ids").isEmpty());
		assert (listReadyEmpty.has("templates") && listReadyEmpty.getJSONArray("templates").isEmpty());

		for (String str : ids)
			deleteConstraint(str);
	}

	@Test
	public void testConstraintMqafServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("Card_xml", "default-constraint");
		Map<String, String[]> params = getEmptyParams();
		params.put("XmlPath_Element_0", new String[] { "//lido:lido" });
		params.put("ComparisonOption_1", new String[] { "exactly" });
		params.put("Number_2", new String[] { "42" });
		params.put("XmlPath_Element_3", new String[] { "/*/*/*/*/*/*" });
		ConstraintServlet.applyPost("/xml/" + constraintID, params);

		JSONObject apply1 = ConstraintMqafServlet.applyGet3("/xml/" + constraintID, getEmptyParams());

		Map<String, String[]> params1 = getEmptyParams();
		params1.put("constraintIDs", new String[] { constraintID });
		JSONObject apply2 = ConstraintMqafServlet.applyGet2("/xml", params1);

		assertSimilarJSONObjects(apply1, apply2);
		assertMQAFObject(apply1);
		assertMQAFObject(apply2);
		deleteConstraint(constraintID);
	}

	@Test
	public void testConstraintQueryServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("Card_xml", "default-constraint");
		Map<String, String[]> params = getEmptyParams();
		params.put("XmlPath_Element_0", new String[] { "//lido:lido" });
		params.put("ComparisonOption_1", new String[] { "exactly" });
		params.put("Number_2", new String[] { "42" });
		params.put("XmlPath_Element_3", new String[] { "/*/*/*/*/*/*" });
		ConstraintServlet.applyPost("/xml/" + constraintID, params);

		JSONObject apply1 = ConstraintQueryServlet.applyGet3("/xml/" + constraintID, getEmptyParams());

		Map<String, String[]> params1 = getEmptyParams();
		params1.put("constraints", new String[] { constraintID });
		JSONObject apply2 = ConstraintQueryServlet.applyGet2("/xml", params1);

		assertSimilarJSONObjects(apply1, apply2);
		assertQueryObject(apply1);
		assertQueryObject(apply2);
		deleteConstraint(constraintID);
	}

//	@Test
	public void testConstraintExecuteServletGet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("Card_xml", "default-constraint");
		Map<String, String[]> params = getEmptyParams();
		params.put("XmlPath_Element_0", new String[] { "//lido:lido" });
		params.put("ComparisonOption_1", new String[] { "exactly" });
		params.put("Number_2", new String[] { "42" });
		params.put("XmlPath_Element_3", new String[] { "/*/*/*/*/*/*" });
		ConstraintServlet.applyPost("/xml/" + constraintID, params);

		Map<String, String[]> params2 = getEmptyParams();
		params2.put("constraintIDs", new String[] { constraintID });
		params2.put("files", new String[] { "lido.xml" });
		JSONObject result = ConstraintExecuteServlet.applyGet("/xml", params2);
		assertExecuteResultObject(result);
		deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateVariantServletGet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		JSONObject variant = TemplateVariantServlet.applyGet("/xml/Card_xml", getEmptyParams());
		assertVariantObject(variant);
		deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateVariantServletPutDelete()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String variantname = "testvariant";
		String variantjsonstring = "{\"template\":\"Card_xml\",\"language\":\"xml\",\"name\":\"" + variantname + "\",\"fragments\":[{\"text\":\"”Search for”\"},{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},{\"text\":\"where the number of\"},{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\"},{\"text\":\"is\"},{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"more than\",\"comparisonMap\":\"true\"},{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":1},{\"text\":\".\"}]}";

		JSONObject variant = TemplateVariantServlet.applyGet("/xml/Card_xml", getEmptyParams());
		assertVariantObjectWithout(variant, variantname);
		
		Map<String, String[]> params = getEmptyParams();
		params.put("variants", new String[] {variantjsonstring});
		TemplateVariantServlet.applyPut("/xml/Card_xml", params);
		variant = TemplateVariantServlet.applyGet("/xml/Card_xml", getEmptyParams());
		assertVariantObjectWith(variant, variantname);

		
		Map<String, String[]> params1 = getEmptyParams();
		params1.put("variants", new String[] {variantname});
		TemplateVariantServlet.applyDelete("/xml/Card_xml", params1);
		variant = TemplateVariantServlet.applyGet("/xml/Card_xml", getEmptyParams());
		assertVariantObjectWithout(variant, variantname);
	}

	// __________ CONCRETE PATTERN TESTS __________

	@Test
	public void testTemplateCard()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("Card_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "ComparisonOption_1", "exactly");
		setConstraintParameter(constraintID, "Number_2", "2");
		setConstraintParameter(constraintID, "XmlPath_Element_3", "/*");

		testConcretePattern(constraintID);
		deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateContains()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("Contains_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_1", "/text()");
		setConstraintParameter(constraintID, "Boolean_2", "does");
		setConstraintParameter(constraintID, "Text_3", "a");

		testConcretePattern(constraintID);
		deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateMatch()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("Match_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_1", "/text()");
		setConstraintParameter(constraintID, "Boolean_2", "do not");
		setConstraintParameter(constraintID, "Text_3", ".*a.*");

		testConcretePattern(constraintID);
		deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateCompSet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("CompSet_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_1", "/text()");
		setConstraintParameter(constraintID, "ComparisonOption_2", "is");
		setConstraintParameter(constraintID, "TextList_3", "{\"a\"}");

		testConcretePattern(constraintID);
		deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateMandAtt()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("MandAtt_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Element_1", "/*");

		testConcretePattern(constraintID);
		deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateStringLength()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("StringLength_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_1", "/text()");
		setConstraintParameter(constraintID, "ComparisonOption_2", "exactly");
		setConstraintParameter(constraintID, "Number_3", "10");

		testConcretePattern(constraintID);
		deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateUniqueness()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("Unique_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0" , "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_1" , "/text()");

		testConcretePattern(constraintID);
		deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateInvalidLink()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("Unique_xml", "default-constraint");
		setConstraintParameter(constraintID, "XmlPath_Element_0", "//*");
		setConstraintParameter(constraintID, "XmlPath_Property_1", "/text()");
		setConstraintParameter(constraintID, "Boolean_2", "is");
		
		testConcretePattern(constraintID);
		deleteConstraint(constraintID);
	}
}

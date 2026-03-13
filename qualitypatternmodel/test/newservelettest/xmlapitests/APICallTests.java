package newservelettest.xmlapitests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import qualitypatternmodel.newservlets.ConstraintDownloadServlet;
import qualitypatternmodel.newservlets.ConstraintExecuteServlet;
import qualitypatternmodel.newservlets.ConstraintMqafServlet;
import qualitypatternmodel.newservlets.ConstraintNameServlet;
import qualitypatternmodel.newservlets.ConstraintQueryServlet;
import qualitypatternmodel.newservlets.ConstraintServlet;
import qualitypatternmodel.newservlets.ConstraintTagServlet;
import qualitypatternmodel.newservlets.ConstraintUploadServlet;
import qualitypatternmodel.newservlets.DocumentationServlet;
import qualitypatternmodel.newservlets.InitialisationServlet;
import qualitypatternmodel.newservlets.PatternListServlet;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.newservlets.TemplateInstantiateServlet;
import qualitypatternmodel.newservlets.TemplateVariantServlet;
import qualitypatternmodel.newservlets.VariantsServlet;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.EMFModelLoad;

public class APICallTests {
	private static final boolean DELETE = true;
	private static String folder;

	public static void main(String[] args)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		new APICallTests().testfunction(args);
	}

	public void testfunction(String[] args)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {

		initialize();
		try {

			testBasics();
			testLogDeletion();
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

			testConstraintDownloadServletGet();
			testConstraintUploadServletPost();

			testVariantServletGet();

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
		

		File lido_original = new File("lido.xml");
		File lido_copy = new File(folder + "/files/lido.xml");

		File variants_original = new File("./src/qualitypatternmodel/newservlets/jsons");
		File variants_copy = new File(folder + "/templates/variants");

		File template_info_original = new File("./src/qualitypatternmodel/newservlets/template_info.json");
		File template_info_copy = new File(folder + "/templates/template_info.json");

		try {
			FileUtils.copyFile(lido_original, lido_copy);
			FileUtils.copyDirectory(variants_original, variants_copy);
			FileUtils.copyFile(template_info_original, template_info_copy);
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
	}

	@AfterAll
	public static void close() throws IOException {
		System.out.println("Delete: " + folder);
		if (DELETE)
			FileUtils.deleteDirectory(new File(folder));
	}

	// __________ BASE FUNCTIONS __________

	public static Map<String, String[]> getEmptyParams() {
		return new HashMap<String, String[]>();
	}

	static String newConstraint()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		return newConstraint("Match_xml", "default");
	}

	public static String newConstraint(String pattern, String variant)
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

	static JSONObject getConstraints(String[] ids)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		Map<String, String[]> params = getEmptyParams();
		params.put(ConstantsJSON.CONSTRAINT_IDS, ids);
		return ConstraintServlet.applyGet2("/xml", params);
	}

	static void deleteConstraint(String id)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ConstraintServlet.applyDelete("/xml/" + id, getEmptyParams());
	}

	// __________ ASSERTIONS __________

	static void assertPatternJSONObjectArray(JSONArray object) {
		for (int i = 0; i < object.length(); i++)
			assertPatternJSONObject(object.getJSONObject(i));
	}

	static void assertPatternJSONObject(JSONObject object) {
		assert (object.has(ConstantsJSON.NAME));
		assert (object.has(ConstantsJSON.CONSTRAINT_ID));
		assert (object.has(ConstantsJSON.VARIANTS));
		assert (object.has(ConstantsJSON.DESCRIPTION));
		assert (object.has(ConstantsJSON.LANGUAGE));
		assert (object.has(ConstantsJSON.EXECUTABLE));
		assert (object.has(ConstantsJSON.EXECUTABLE_MQAF));
		assert (object.has(ConstantsJSON.EXECUTABLE_QUERY));
		assert (object.has(ConstantsJSON.EXECUTABLE_FILTER));
		JSONArray variants = object.getJSONArray(ConstantsJSON.VARIANTS);
		assertVariantArray(variants);
	}

	static void assertSimilarJSONObjects(JSONObject jsonDefault, JSONObject jsonCopy) {
		Set<String> keys1 = jsonDefault.keySet();
		Set<String> keys2 = jsonCopy.keySet();

		for (String key : keys1)
			assert (keys2.contains(key));
		for (String key : keys2)
			assert (keys1.contains(key));

		jsonDefault.remove(ConstantsJSON.LASTSAVED);
		jsonCopy.remove(ConstantsJSON.LASTSAVED);

		for (String key : keys1) {
			assertEquals(jsonDefault.get(key).toString(), jsonCopy.get(key).toString());
		}
	}

	static void assertQueryObject(JSONObject queryObject) {
		assert(!queryObject.has(ConstantsJSON.FAILED) || queryObject.getJSONArray(ConstantsJSON.FAILED).isEmpty());
		assert(queryObject.has(ConstantsJSON.CONSTRAINTS));
		JSONArray constraints = queryObject.getJSONArray(ConstantsJSON.CONSTRAINTS);
		assert(constraints.length()>0);
		for (int i = 0; i<constraints.length(); i++) {
			JSONObject constraint = constraints.getJSONObject(i);
			assert(constraint.has(ConstantsJSON.NAME));
			assert(constraint.has(ConstantsJSON.CONSTRAINT_ID));
			assert(constraint.has(ConstantsJSON.LANGUAGE));
			assert(constraint.has(ConstantsJSON.TECHNOLOGY));
			assert(constraint.has(ConstantsJSON.QUERY));
		}
	}

	void assertMQAFObject(JSONObject mqaf) {
		assert (mqaf.has(ConstantsJSON.CONSTRAINT));
		assert (mqaf.has(ConstantsJSON.FAILED) && mqaf.getJSONArray(ConstantsJSON.FAILED).isEmpty());
	}

	static void assertExecuteResultObject(JSONObject resultObject, Boolean forceResult) {
		assert(resultObject.has(ConstantsJSON.RESULT));
		assert(resultObject.has(ConstantsJSON.TOTAL_FINDINGS));
		assert(resultObject.has(ConstantsJSON.TOTAL_INCIDENCES));
		assert(resultObject.has(ConstantsJSON.TOTAL_COMPLIANCES));
		assert(resultObject.has(ConstantsJSON.FILES));
		assert(resultObject.has(ConstantsJSON.FILESIZE));
		assert(resultObject.has(ConstantsJSON.CONSTRAINT_IDS));
		assert(resultObject.has(ConstantsJSON.CONSTRAINTSIZE));
		assert(resultObject.has(ConstantsJSON.DURATION));

		assert(!resultObject.has(ConstantsJSON.FAILEDFILES));
		assert(!resultObject.has(ConstantsJSON.FAILEDCONSTRAINTS));

		JSONArray result = resultObject.getJSONArray(ConstantsJSON.RESULT);
		assert(result.length() > 0);
		for (int i = 0; i < result.length(); i++) {
			JSONObject object = result.getJSONObject(i);
			assert(object.has(ConstantsJSON.CONSTRAINT_ID));
			assert(object.has(ConstantsJSON.CONSTRAINT_NAME));
			assert(object.has(ConstantsJSON.FILE));
			assert(object.has(ConstantsJSON.INCIDENTS));
			assert(object.has(ConstantsJSON.TOTAL_FINDINGS));
			assert(object.has(ConstantsJSON.TOTAL_INCIDENCES));
			assert(object.has(ConstantsJSON.TOTAL_COMPLIANCES));
//			assert(object.has(ConstantsJSON.TECHNOLOGY));
//			assert(object.has(ConstantsJSON.LANGUAGE));
			JSONArray incidents = object.getJSONArray(ConstantsJSON.INCIDENTS);
			assert(!forceResult || (incidents.length() > 0));
		}
	}

	static void assertVariantArrayGrouped(JSONObject variants) {
		assert(variants.has(ConstantsJSON.VARIANTS));
		assert(variants.has(ConstantsJSON.SIZE));
		assert(variants.has(ConstantsJSON.TOTAL));
		assert(variants.getInt(ConstantsJSON.TOTAL) >= variants.getInt(ConstantsJSON.SIZE));

		if (variants.has(ConstantsJSON.API_FILTER_BY))
			assert(variants.get(ConstantsJSON.API_FILTER_BY) instanceof JSONObject);
		if (variants.has(ConstantsJSON.API_GROUP_BY)) {
			assert(variants.get(ConstantsJSON.API_GROUP_BY) instanceof JSONArray);
			assertVariantsNested(variants.get(ConstantsJSON.VARIANTS), variants.getJSONArray(ConstantsJSON.API_GROUP_BY).length());
		} else {
			assertVariantsNested(variants.get(ConstantsJSON.VARIANTS), 0);
		}
	}
	
	static void assertVariantsNested(Object object, int depth) {
		if (depth <= 0) {
			assert(object instanceof JSONArray);
			JSONArray array = (JSONArray) object;
			assertVariantArray(array);
		}
		else {
			assert(object instanceof JSONObject);
			JSONObject jobject = (JSONObject) object;
			for (String key: jobject.keySet()) {
				Object subobject = jobject.get(key);
				assertVariantsNested(subobject, depth-1);
			}
		}
	}

	static void assertVariantArray(JSONArray variants) {
		for (int i = 0; i<variants.length(); i++)
			assertVariantObject(variants.getJSONObject(i));
	}

	static void assertVariantObject(JSONObject variant) {
//		assert(variant.has(ConstantsJSON.PARAMETER));
//		assert(variant.get(ConstantsJSON.PARAMETER) instanceof JSONArray);
//		assert(!variant.optJSONArray(ConstantsJSON.PARAMETER).isEmpty());
		assert(variant.has(ConstantsJSON.NAME));
		assert(variant.has(ConstantsJSON.FRAGMENTS));
		JSONArray fragments = variant.getJSONArray(ConstantsJSON.FRAGMENTS);
		assertFragmentsArray(fragments);
	}

	static void assertFragmentsArray(JSONArray fragments) {
		assert(!fragments.isEmpty());
		for (int j = 0; j<fragments.length(); j++) {
			JSONObject fragment = fragments.getJSONObject(j);
			Boolean isText = fragment.has(ConstantsJSON.TEXT) && fragment.length() == 1;
			Boolean isFragment =
				fragment.has(ConstantsJSON.NAME) &&
				fragment.has(ConstantsJSON.ROLE) &&
				fragment.has(ConstantsJSON.ID) &&
				fragment.has(ConstantsJSON.NAME);
			Boolean isFragment2 =
				fragment.has(ConstantsJSON.NAME) &&
				fragment.has(ConstantsJSON.PARAMETER) &&
				fragment.has(ConstantsJSON.EXAMPLEVALUE) &&
				fragment.has(ConstantsJSON.NEWID) &&
				fragment.has(ConstantsJSON.NAME); 
			Boolean isPredef = 
				fragment.length() == 2 &&
				fragment.has(ConstantsJSON.PARAMETER) &&
				fragment.has(ConstantsJSON.VALUE);
			assert(isText || isFragment || isFragment2 || isPredef);
		}
	}

	void assertVariantObjectWith(JSONObject variant, String variantname) {
		JSONArray variants = variant.getJSONArray(ConstantsJSON.VARIANTS);
		Boolean with = false;
		for (int i = 0; i<variants.length(); i++) {
			with = with || variants.getJSONObject(i).getString(ConstantsJSON.NAME).equals(variantname);
		}
		assert(with);
	}

	void assertVariantObjectWithout(JSONObject variant, String variantname) {
		JSONArray variants = variant.getJSONArray(ConstantsJSON.VARIANTS);
		Boolean without = true;
		for (int i = 0; i<variants.length(); i++) {
			without &= !variants.getJSONObject(i).getString(ConstantsJSON.NAME).equals(variantname);
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
		JSONObject constraint2 = getConstraints(new String[]{constriantID});
		assertPatternJSONObject(constraint2.getJSONObject(constriantID));
		deleteConstraint(constriantID);
		assertThrows(FailedServletCallException.class, () -> {
			getConstraint(constriantID);
		});
		assertThrows(FailedServletCallException.class, () -> {
			deleteConstraint(constriantID);
		});
	}

	@Test
	public void testLogDeletion() throws IOException {
		String logdirectory = ServletConstants.LOGFILE;
		logdirectory = logdirectory.substring(0, logdirectory.lastIndexOf('/'));

		File logdir = new File(logdirectory); 
		File savefile = new File(ServletConstants.SAVEFILE);

		if (!logdir.exists()) {
        	logdir.mkdirs();
		}
		
		String[] datesOld = new String[] {
			LocalDate.now().minusDays(ServletConstants.LOGDAYS + 1).format(DateTimeFormatter.ofPattern(ServletConstants.LOGDATEFORMAT)),
			LocalDate.now().minusDays(ServletConstants.LOGDAYS + 10).format(DateTimeFormatter.ofPattern(ServletConstants.LOGDATEFORMAT)),
			LocalDate.now().minusDays(ServletConstants.LOGDAYS + 20).format(DateTimeFormatter.ofPattern(ServletConstants.LOGDATEFORMAT)),
			LocalDate.now().minusDays(ServletConstants.LOGDAYS + 100).format(DateTimeFormatter.ofPattern(ServletConstants.LOGDATEFORMAT)),
			LocalDate.now().minusDays(ServletConstants.LOGDAYS + 1000).format(DateTimeFormatter.ofPattern(ServletConstants.LOGDATEFORMAT))
		};
		
		String[] datesNew = new String[] {
			LocalDate.now().minusDays(ServletConstants.LOGDAYS - 1).format(DateTimeFormatter.ofPattern(ServletConstants.LOGDATEFORMAT)),
			LocalDate.now().minusDays(ServletConstants.LOGDAYS - 5).format(DateTimeFormatter.ofPattern(ServletConstants.LOGDATEFORMAT))
		};
		
		for (String date: datesOld)
			Files.write(Paths.get(logdirectory + "/logfile-" + date + ".log"), new byte[0], StandardOpenOption.CREATE);
		for (String date: datesNew)
			Files.write(Paths.get(logdirectory + "/logfile-" + date + ".log"), new byte[0], StandardOpenOption.CREATE);

        ServletUtilities.deleteOldLogs();
        
        File[] array = Arrays.stream(logdir.listFiles())
                .filter(File::isFile)
                .filter(f -> f.getName().endsWith(".log"))
                .toArray(File[]::new);
        for (String date: datesNew)
        	System.out.println(date);
        for (File file: array)
        	System.out.println(file.getName());
        assertEquals(array.length, datesNew.length+1 + (savefile.exists()? 1 : 0));
	}

	@Test
	public void testDocs()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String result = DocumentationServlet.applyGet("", getEmptyParams());
		assert(result != null);
		assert(result.length() > 100);
		assert(result.startsWith("openapi:"));
	}

	@Test
	public void testHealth()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		JSONObject result = InitialisationServlet.applyGet("", getEmptyParams());
		assert(result.has("title"));
		assert(result.has("status"));
		assert(result.has("timestamp"));
		result = InitialisationServlet.applyGet("/health", getEmptyParams());
		assert(result.has("title"));
		assert(result.has("status"));
		assert(result.has("timestamp"));
		assert(result.has("version"));
		assertThrows(FailedServletCallException.class, () -> InitialisationServlet.applyGet("/anything", getEmptyParams()));
	}

	@Test
	public void testConstraintDatabaseServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		String dbname1 = "db";
		String dbname2 = "db2";

		JSONObject nodb = ConstraintDatabaseServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (!nodb.has(ConstantsJSON.DATABASE));

		Map<String, String[]> params1 = getEmptyParams();
		params1.put(ConstantsJSON.DATABASE, new String[] { dbname1 });
		JSONObject db1 = ConstraintDatabaseServlet.applyPost("/xml/" + constraintID, params1);
		assert (db1.has(ConstantsJSON.CONSTRAINT_ID) && db1.getString(ConstantsJSON.CONSTRAINT_ID).equals(constraintID));
		assert (db1.has(ConstantsJSON.DATABASE) && db1.getString(ConstantsJSON.DATABASE).equals(dbname1));
		assert (!db1.has(ConstantsJSON.OLD_DATABASE));
		assert (db1.has(ConstantsJSON.LASTSAVED));

		JSONObject db1get = ConstraintDatabaseServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (db1get.has(ConstantsJSON.DATABASE) && db1get.getString(ConstantsJSON.DATABASE).equals(dbname1));

		Map<String, String[]> params2 = getEmptyParams();
		params2.put(ConstantsJSON.DATABASE, new String[] { dbname2 });
		JSONObject db2 = ConstraintDatabaseServlet.applyPost("/xml/" + constraintID, params2);
		assert (db2.has(ConstantsJSON.CONSTRAINT_ID) && db2.getString(ConstantsJSON.CONSTRAINT_ID).equals(constraintID));
		assert (db2.has(ConstantsJSON.DATABASE) && db2.getString(ConstantsJSON.DATABASE).equals(dbname2));
		assert (db2.has(ConstantsJSON.OLD_DATABASE) && db2.getString(ConstantsJSON.OLD_DATABASE).equals(dbname1));
		assert (db2.has(ConstantsJSON.LASTSAVED));

		JSONObject db2get = ConstraintDatabaseServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (db2get.has(ConstantsJSON.DATABASE) && db2get.getString(ConstantsJSON.DATABASE).equals(dbname2));

		deleteConstraint(constraintID);
	}

	@Test
	public void testConstraintDataModelServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		String dmname1 = "dm";
		String dmname2 = "dm2";

		JSONObject nodm = ConstraintDatabaseServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (!nodm.has(ConstantsJSON.DATAMODEL));

		Map<String, String[]> params1 = getEmptyParams();
		params1.put(ConstantsJSON.DATAMODEL, new String[] { dmname1 });
		JSONObject dm1 = ConstraintDataModelServlet.applyPost("/xml/" + constraintID, params1);
		assert (dm1.has(ConstantsJSON.CONSTRAINT_ID) && dm1.getString(ConstantsJSON.CONSTRAINT_ID).equals(constraintID));
		assert (dm1.has(ConstantsJSON.DATAMODEL) && dm1.getString(ConstantsJSON.DATAMODEL).equals(dmname1));
		assert (!dm1.has(ConstantsJSON.OLD_DATABASE));
		assert (dm1.has(ConstantsJSON.LASTSAVED));

		JSONObject dm1get = ConstraintDataModelServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (dm1get.has(ConstantsJSON.DATAMODEL) && dm1get.getString(ConstantsJSON.DATAMODEL).equals(dmname1));

		Map<String, String[]> params2 = getEmptyParams();
		params2.put(ConstantsJSON.DATAMODEL, new String[] { dmname2 });
		JSONObject dm2 = ConstraintDataModelServlet.applyPost("/xml/" + constraintID, params2);
		assert (dm2.has(ConstantsJSON.CONSTRAINT_ID) && dm2.getString(ConstantsJSON.CONSTRAINT_ID).equals(constraintID));
		assert (dm2.has(ConstantsJSON.DATAMODEL) && dm2.getString(ConstantsJSON.DATAMODEL).equals(dmname2));
		assert (dm2.has(ConstantsJSON.OLD_DATAMODEL) && dm2.getString(ConstantsJSON.OLD_DATAMODEL).equals(dmname1));
		assert (dm2.has(ConstantsJSON.LASTSAVED));

		JSONObject db2get = ConstraintDataModelServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (db2get.has(ConstantsJSON.DATAMODEL) && db2get.getString(ConstantsJSON.DATAMODEL).equals(dmname2));

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
		assert (tags1.has(ConstantsJSON.SUCCESS) && tags1.getJSONArray(ConstantsJSON.SUCCESS).similar(new JSONArray(arr012)));
		assert (!tags1.has(ConstantsJSON.FAILED));

		JSONObject tags2 = ConstraintTagServlet.applyDelete("/xml/" + constraintID, params2);
		assert (tags2.has(ConstantsJSON.SUCCESS) && tags2.getJSONArray(ConstantsJSON.SUCCESS).similar(new JSONArray(arr12)));
		assert (tags2.has(ConstantsJSON.FAILED)
				&& tags2.getJSONArray(ConstantsJSON.FAILED).toString().contains("{\"" + lst[3] + "\":\"tag not found\"}"));

		JSONObject tags3 = ConstraintTagServlet.applyPost("/xml/" + constraintID, params3);
		assert (tags3.has(ConstantsJSON.SUCCESS) && tags3.getJSONArray(ConstantsJSON.SUCCESS).similar(new JSONArray(arr123)));
		assert (tags3.has(ConstantsJSON.FAILED)
				&& tags3.getJSONArray(ConstantsJSON.FAILED).toString().contains("\"" + lst[0] + "\":\"tag already added\""));

		JSONObject tags4 = ConstraintTagServlet.applyDelete("/xml/" + constraintID, params4);
		assert (tags4.has(ConstantsJSON.SUCCESS) && tags4.getJSONArray(ConstantsJSON.SUCCESS).similar(new JSONArray(arr0123)));
		assert (!tags4.has(ConstantsJSON.FAILED));

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
			constraintIDCopy = jsonCopy.getString(ConstantsJSON.CONSTRAINT_ID);
			jsonDefault.remove(ConstantsJSON.CONSTRAINT_ID);
			jsonDefault.put(ConstantsJSON.CONSTRAINT_ID, constraintIDCopy);
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
		params1.put(ConstantsJSON.DATABASE, new String[] { "value" });
		params1.put(ConstantsJSON.DATAMODEL, new String[] { "value" });
		params1.put("XmlPath_Element_0", new String[] { "//*" });
		String uuidstring = UUID.randomUUID().toString();
		params1.put(uuidstring, new String[] { "value" });
		JSONObject get1 = ConstraintServlet.applyPost("/xml/" + constraintId, params1);
		assert (get1.has(ConstantsJSON.SUCCESS) && get1.getJSONArray(ConstantsJSON.SUCCESS)
				.similar(new JSONArray(new String[] { "XmlPath_Element_0", ConstantsJSON.DATABASE, ConstantsJSON.DATAMODEL })));
		assert (get1.has(ConstantsJSON.FAILED) && get1.getJSONArray(ConstantsJSON.FAILED).getJSONObject(0).has(uuidstring));
		assert (get1.has("available") && get1.getJSONArray("available").toList()
				.containsAll(Arrays.asList(ConstantsJSON.DATABASE, ConstantsJSON.DATAMODEL, "namespace", "name", "XmlPath_Element_0")));
		assert (get1.has(ConstantsJSON.LASTSAVED));

		JSONObject get = getConstraint(constraintId);
		assert (get.has(ConstantsJSON.DATABASE) && get.getString(ConstantsJSON.DATABASE).equals("value"));
		assert (get.has(ConstantsJSON.DATAMODEL) && get.getString(ConstantsJSON.DATAMODEL).equals("value"));

		deleteConstraint(constraintId);
	}

	@Test
	public void testPatternListServletGetAll()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		JSONObject listTemplate = PatternListServlet.applyGet("/xml" + "/all", getEmptyParams());
		int templateNo = EMFModelLoad.getFilesInDirectory(folder + "/templates/xml/abstract-patterns", Constants.EXTENSION).size();
		templateNo += EMFModelLoad.getFilesInDirectory(folder + "/templates/xml/concrete-patterns", Constants.EXTENSION).size();
		assert (templateNo > 0);
		assert (listTemplate.has(ConstantsJSON.SIZE) && listTemplate.getInt(ConstantsJSON.SIZE) == templateNo);
		assert (listTemplate.has(ConstantsJSON.IDS) && listTemplate.getJSONArray(ConstantsJSON.IDS).length() == templateNo);
		assert (listTemplate.has(ConstantsJSON.TEMPLATES) && listTemplate.getJSONArray(ConstantsJSON.TEMPLATES).length() == templateNo);
		if (listTemplate.has(ConstantsJSON.TEMPLATES))
			assertPatternJSONObjectArray(listTemplate.getJSONArray(ConstantsJSON.TEMPLATES));
	}

	@Test
	public void testPatternListServletGetTemplate()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		JSONObject listTemplate = PatternListServlet.applyGet("/xml" + "/template", getEmptyParams());
		int templateNo = EMFModelLoad.getFilesInDirectory(folder + "/templates/xml/abstract-patterns", Constants.EXTENSION).size();
		assert (templateNo > 0);
		assert (listTemplate.has(ConstantsJSON.SIZE) && listTemplate.getInt(ConstantsJSON.SIZE) == templateNo);
		assert (listTemplate.has(ConstantsJSON.IDS) && listTemplate.getJSONArray(ConstantsJSON.IDS).length() == templateNo);
		assert (listTemplate.has(ConstantsJSON.TEMPLATES) && listTemplate.getJSONArray(ConstantsJSON.TEMPLATES).length() == templateNo);
		if (listTemplate.has(ConstantsJSON.TEMPLATES))
			assertPatternJSONObjectArray(listTemplate.getJSONArray(ConstantsJSON.TEMPLATES));
	}

	@Test
	public void testPatternListServletGetConcreteEmpty()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		JSONObject listConcreteEmpty = PatternListServlet.applyGet("/xml" + "/concrete", getEmptyParams());
		assert (listConcreteEmpty.getInt(ConstantsJSON.SIZE) == 0);
		assert (listConcreteEmpty.has(ConstantsJSON.IDS) && listConcreteEmpty.getJSONArray(ConstantsJSON.IDS).isEmpty());
		assert (listConcreteEmpty.has(ConstantsJSON.TEMPLATES) && listConcreteEmpty.getJSONArray(ConstantsJSON.TEMPLATES).isEmpty());
	}

	@Test
	public void testPatternListServletGetReadyEmpty()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		JSONObject listReadyEmpty = PatternListServlet.applyGet("/xml" + "/ready", getEmptyParams());
		assert (listReadyEmpty.getInt(ConstantsJSON.SIZE) == 0);
		assert (listReadyEmpty.has(ConstantsJSON.IDS) && listReadyEmpty.getJSONArray(ConstantsJSON.IDS).isEmpty());
		assert (listReadyEmpty.has(ConstantsJSON.TEMPLATES) && listReadyEmpty.getJSONArray(ConstantsJSON.TEMPLATES).isEmpty());
	}

	@Test
	public void testPatternListServletGetConcrete()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ArrayList<String> ids = new ArrayList<String>();
		int n = 10;
		for (int i = 0; i < n; i++)
			ids.add(newConstraint());

		JSONObject listConcrete = PatternListServlet.applyGet("/xml" + "/concrete", getEmptyParams());
		assert (listConcrete.getInt(ConstantsJSON.SIZE) == 10);
		assert (listConcrete.has(ConstantsJSON.IDS) && listConcrete.getJSONArray(ConstantsJSON.IDS).length() == 10);
		assert (listConcrete.has(ConstantsJSON.TEMPLATES) && listConcrete.getJSONArray(ConstantsJSON.TEMPLATES).length() == 10);

		JSONObject listReadyEmpty = PatternListServlet.applyGet("/xml" + "/ready", getEmptyParams());
		assert (listReadyEmpty.getInt(ConstantsJSON.SIZE) == 0);
		assert (listReadyEmpty.has(ConstantsJSON.IDS) && listReadyEmpty.getJSONArray(ConstantsJSON.IDS).isEmpty());
		assert (listReadyEmpty.has(ConstantsJSON.TEMPLATES) && listReadyEmpty.getJSONArray(ConstantsJSON.TEMPLATES).isEmpty());

		for (String str : ids)
			deleteConstraint(str);
	}

	@Test
	public void testConstraintMqafServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("Card_xml", "default");
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
		String constraintID = newConstraint("Card_xml", "default");
		Map<String, String[]> params = getEmptyParams();
		params.put("XmlPath_Element_0", new String[] { "//lido:lido" });
		params.put("ComparisonOption_1", new String[] { "exactly" });
		params.put("Number_2", new String[] { "42" });
		params.put("XmlPath_Element_3", new String[] { "/*/*/*/*/*/*" });
		ConstraintServlet.applyPost("/xml/" + constraintID, params);

		JSONObject apply1 = ConstraintQueryServlet.applyGet3("/xml/" + constraintID, getEmptyParams());

		Map<String, String[]> params1 = getEmptyParams();
		params1.put(ConstantsJSON.CONSTRAINTS, new String[] { constraintID });
		JSONObject apply2 = ConstraintQueryServlet.applyGet2("/xml", params1);

		assertSimilarJSONObjects(apply1, apply2);
		assertQueryObject(apply1);
		assertQueryObject(apply2);
		deleteConstraint(constraintID);
	}

	@Test
	public void testConstraintExecuteServletGet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("Card_xml", "default");
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
		assertExecuteResultObject(result, true);
		deleteConstraint(constraintID);
	}

	@Test
	public void testConstraintExecuteServletPost()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("Card_xml", "default");
		Map<String, String[]> params = getEmptyParams();
		params.put("XmlPath_Element_0", new String[] { "//lido:lido" });
		params.put("ComparisonOption_1", new String[] { "exactly" });
		params.put("Number_2", new String[] { "42" });
		params.put("XmlPath_Element_3", new String[] { "/*/*/*/*/*/*" });
		ConstraintServlet.applyPost("/xml/" + constraintID, params);

		JSONObject params2 = new JSONObject();
		params2.put("constraintIDs", constraintID);
		params2.put("files", "lido.xml");
		JSONObject result = ConstraintExecuteServlet.applyPost("/xml", params2);
		assertExecuteResultObject(result, true);
		deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateVariantServletGet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		JSONObject variant = TemplateVariantServlet.applyGet("/xml/Card_xml", getEmptyParams());
		assert(variant.has(ConstantsJSON.VARIANTS));
		assert(variant.has(ConstantsJSON.PARAMETER));
		
		Map<String, String[]> params2 = getEmptyParams();
		params2.put(ConstantsJSON.VARIANTS, new String[]{"false"});
		JSONObject variantEmpty = TemplateVariantServlet.applyGet("/xml/Card_xml", params2);
		assert(!variantEmpty.has(ConstantsJSON.VARIANTS));
		assert(variantEmpty.has(ConstantsJSON.PARAMETER));
	}

	@Test
	public void testTemplateVariantServletPutDelete()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String variantname = "testvariant";
		String variantjsonstring = "{\"template\":\"Card_xml\", \"language\":\"xml\", \"name\":\"" + variantname + "\", \"typeConstraint\":true, \"fragments\":[ {\"text\":\"Each\"}, {\"name\":\"element\", \"params\":[2], \"exampleValue\":\"Actors\", \"description\":\"anchor for analysis\"}, {\"text\":\"has\"}, {\"name\":\"a comparison with\", \"params\":[0], \"exampleValue\":\"at most\", \"defaultMap\":\"comparison_negated\"}, {\"name\":\"a specific number\", \"params\":[1], \"exampleValue\":\"1\"}, {\"name\":\"child elements\", \"params\":[3], \"exampleValue\":\"Birthdates\", \"description\":\"counted elements\", \"plural\":\"true\"}, {\"text\":\".\"} ]}";

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

	@Test
	public void testConstraintDownloadServletGet() 
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("Card_xml", "default");
		File file = ConstraintDownloadServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert(file != null);
		assert(file.isFile());
		assert(file.length() > 10);
		assert(file.getName().equals(constraintID + Constants.INSTANCE_FILE_ENDING));
		deleteConstraint(constraintID);
	}

	@Test
	public void testConstraintUploadServletPost() 
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint("Card_xml", "default");
		File file = ConstraintDownloadServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		JSONObject object = ConstraintUploadServlet.applyPost(null, getEmptyParams(), file);
		assertPatternJSONObject(object);
		String constraintIDnew = object.getString(ConstantsJSON.CONSTRAINT_ID);
		deleteConstraint(constraintID);
		deleteConstraint(constraintIDnew);
	}

	@Test
	public void testVariantServletGet() 
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {

		JSONObject variants = VariantsServlet.applyGet("/xml/", getEmptyParams());
		assertVariantArrayGrouped(variants);

		Map<String, String[]> paramsGroup = getEmptyParams();
		paramsGroup.put(ConstantsJSON.API_GROUP_BY, new String[]{"['custom.type']"});
		JSONObject variantsGrouped = VariantsServlet.applyGet("/xml/", paramsGroup);
		assertVariantArrayGrouped(variantsGrouped);

		Map<String, String[]> paramsGroup2 = getEmptyParams();
		paramsGroup2.put(ConstantsJSON.API_GROUP_BY, new String[]{"['custom.type', 'custom.scope']"});
		JSONObject variantsGrouped2 = VariantsServlet.applyGet("/xml/", paramsGroup2);
		assertVariantArrayGrouped(variantsGrouped2);

		Map<String, String[]> paramsFilter = getEmptyParams();
		paramsFilter.put(ConstantsJSON.API_FILTER_BY, new String[]{"{'custom.scope':'hierarchical'}"});
		JSONObject variantsFilter = VariantsServlet.applyGet("/xml/", paramsFilter);
		assertVariantArrayGrouped(variantsFilter);

		Map<String, String[]> paramsFilter2 = getEmptyParams();
		paramsFilter2.put(ConstantsJSON.API_FILTER_BY, new String[]{"{'custom.type': 'comp', 'custom.scope':'hierarchical'}"});
		JSONObject variantsFilter2 = VariantsServlet.applyGet("/xml/", paramsFilter2);
		assertVariantArrayGrouped(variantsFilter2);

		Map<String, String[]> paramsFilterGroup = getEmptyParams();
		paramsFilterGroup.put(ConstantsJSON.API_GROUP_BY, new String[]{"['custom.type']"});
		paramsFilterGroup.put(ConstantsJSON.API_FILTER_BY, new String[]{"{'scope':'hierarchical'}"});
		JSONObject variantsFilterGroup = VariantsServlet.applyGet("/xml/", paramsFilterGroup);
		assertVariantArrayGrouped(variantsFilterGroup);

		Map<String, String[]> paramsFilter2Group2 = getEmptyParams();
		paramsFilter2Group2.put(ConstantsJSON.API_GROUP_BY, new String[]{"['custom.type', 'custom.scope']"});
		paramsFilter2Group2.put(ConstantsJSON.API_FILTER_BY, new String[]{"{'custom.type': 'comp', 'custom.scope':'hierarchical'}"});
		JSONObject variantsFilter2Group2 = VariantsServlet.applyGet("/xml/", paramsFilter2Group2);
		assertVariantArrayGrouped(variantsFilter2Group2);
		
		if (true) { // are values updated from json?

//			System.out.println(variants.getInt(ConstantsJSON.SIZE));
//			System.out.println(variantsGrouped.getInt(ConstantsJSON.SIZE));
//			System.out.println(variantsGrouped2.getInt(ConstantsJSON.SIZE));
//			System.out.println(variantsFilter.getInt(ConstantsJSON.SIZE));
//			System.out.println(variantsFilter2.getInt(ConstantsJSON.SIZE));
//			System.out.println(variantsFilterGroup.getInt(ConstantsJSON.SIZE));
//			System.out.println(variantsFilter2Group2.getInt(ConstantsJSON.SIZE));
//			System.out.println(variants.getInt(ConstantsJSON.TOTAL));
//			System.out.println(variantsGrouped.getInt(ConstantsJSON.TOTAL));
//			System.out.println(variantsGrouped2.getInt(ConstantsJSON.TOTAL));
//			System.out.println(variantsFilter.getInt(ConstantsJSON.TOTAL));
//			System.out.println(variantsFilter2.getInt(ConstantsJSON.TOTAL));
//			System.out.println(variantsFilterGroup.getInt(ConstantsJSON.TOTAL));
//			System.out.println(variantsFilter2Group2.getInt(ConstantsJSON.TOTAL));

			assert(variants.getInt(ConstantsJSON.SIZE) >= 92);
			assert(variantsGrouped.getInt(ConstantsJSON.SIZE) >= 92);
			assert(variantsGrouped2.getInt(ConstantsJSON.SIZE) >= 92);
			assert(variantsFilter.getInt(ConstantsJSON.SIZE) >= 23);
			assert(variantsFilter2.getInt(ConstantsJSON.SIZE) >= 3);
			assert(variantsFilterGroup.getInt(ConstantsJSON.SIZE) == 0);
			assert(variantsFilter2Group2.getInt(ConstantsJSON.SIZE) >= 3);
			
			assert(variants.getInt(ConstantsJSON.TOTAL) >= 92);
			assert(variantsGrouped.getInt(ConstantsJSON.TOTAL) >= 106);
			assert(variantsGrouped2.getInt(ConstantsJSON.TOTAL) >= 106);
			assert(variantsFilter.getInt(ConstantsJSON.TOTAL) >= 23);
			assert(variantsFilter2.getInt(ConstantsJSON.TOTAL) >= 3);
			assert(variantsFilterGroup.getInt(ConstantsJSON.TOTAL) == 0);
			assert(variantsFilter2Group2.getInt(ConstantsJSON.TOTAL) == 3);
		}
		
	}
}

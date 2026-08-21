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
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
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
import qualitypatternmodel.utility.Util;

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

		File template_maps_original = new File("./src/qualitypatternmodel/newservlets/template_maps.json");
		File template_maps_copy = new File(folder + "/templates/template_maps.json");

		try {
			FileUtils.copyFile(lido_original, lido_copy);
			FileUtils.copyDirectory(variants_original, variants_copy);
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
		ObjectNode ob = TemplateInstantiateServlet.applyPut("/xml/" + pattern + "/" + variant,
				getEmptyParams());
		try {
			return ob.get(ConstantsJSON.CONSTRAINT_ID).asText();
		} catch (RuntimeException e) {
			return null;
		}
	}

	static ObjectNode getConstraint(String id)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		return ConstraintServlet.applyGet("/xml/" + id, getEmptyParams());
	}

	static ObjectNode getConstraints(String[] ids)
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

	static void assertPatternObjectArray(ArrayNode object) {
		for (int i = 0; i < object.size(); i++)
			assertPatternObject((ObjectNode) object.get(i));
	}

	static void assertPatternObject(ObjectNode object) {
		assert (object.has(ConstantsJSON.NAME));
		assert (object.has(ConstantsJSON.CONSTRAINT_ID));
		assert (object.has(ConstantsJSON.VARIANTS));
		assert (object.has(ConstantsJSON.DESCRIPTION));
		assert (object.has(ConstantsJSON.LANGUAGE));
		assert (object.has(ConstantsJSON.EXECUTABLE));
		assert (object.has(ConstantsJSON.EXECUTABLE_MQAF));
		assert (object.has(ConstantsJSON.EXECUTABLE_QUERY));
		assert (object.has(ConstantsJSON.EXECUTABLE_FILTER));
		ArrayNode variants = (ArrayNode) object.get(ConstantsJSON.VARIANTS);
		assertVariantArray(variants);
	}

	static void assertSimilarJSONObjects(ObjectNode jsonDefault, ObjectNode jsonCopy) {
		Set<String> keys1 = Util.jsonKeySet(jsonDefault);
		Set<String> keys2 = Util.jsonKeySet(jsonCopy);

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

	static void assertQueryObject(ObjectNode queryObject) {
		assert(!queryObject.has(ConstantsJSON.FAILED) || queryObject.get(ConstantsJSON.FAILED).isEmpty());
		assert(queryObject.has(ConstantsJSON.CONSTRAINTS));
		ArrayNode constraints = (ArrayNode) queryObject.get(ConstantsJSON.CONSTRAINTS);
		assert(constraints.size()>0);
		for (int i = 0; i<constraints.size(); i++) {
			ObjectNode constraint = (ObjectNode) constraints.get(i);
			assert(constraint.has(ConstantsJSON.NAME));
			assert(constraint.has(ConstantsJSON.CONSTRAINT_ID));
			assert(constraint.has(ConstantsJSON.LANGUAGE));
			assert(constraint.has(ConstantsJSON.TECHNOLOGY));
			assert(constraint.has(ConstantsJSON.QUERY));
			assert(constraint.has(ConstantsJSON.QUERY_PARTIAL));
			if (constraint.has(ConstantsJSON.FILTER)) {
				assertFilterObject((ObjectNode) constraint.get(ConstantsJSON.FILTER));
				assert(constraint.has(ConstantsJSON.RELATIVEQUERIES));
				assert(((ObjectNode) constraint.get(ConstantsJSON.RELATIVEQUERIES)).has(ConstantsJSON.QUERY_FILTER));
			}
		}
	}

	static void assertFilterObject(ObjectNode filter) {
		filter.has("filter");
		filter.has("structure");
		assertStructureObject((ObjectNode) filter.get(ConstantsJSON.STRUCTURE));
	}

	static void assertStructureObject(ObjectNode structure) {
		assert(structure.has("record"));
		assert(structure.has("class"));
		assert(structure.has("substructure"));
	}

	static void assertMQAFObject(ObjectNode mqaf) {
		assert (mqaf.has(ConstantsJSON.CONSTRAINT));
		assert (mqaf.has(ConstantsJSON.FAILED) && mqaf.get(ConstantsJSON.FAILED).isEmpty());
	}

	static void assertExecuteResultObject(ObjectNode resultObject, Boolean forceResult) {
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

		ArrayNode result = (ArrayNode) resultObject.get(ConstantsJSON.RESULT);
		assert(result.size() > 0);
		for (int i = 0; i < result.size(); i++) {
			ObjectNode object = (ObjectNode) result.get(i);
			assert(object.has(ConstantsJSON.CONSTRAINT_ID));
			assert(object.has(ConstantsJSON.CONSTRAINT_NAME));
			assert(object.has(ConstantsJSON.FILE));
			assert(object.has(ConstantsJSON.INCIDENTS));
			assert(object.has(ConstantsJSON.TOTAL_FINDINGS));
			assert(object.has(ConstantsJSON.TOTAL_INCIDENCES));
			assert(object.has(ConstantsJSON.TOTAL_COMPLIANCES));
//			assert(object.has(ConstantsJSON.TECHNOLOGY));
//			assert(object.has(ConstantsJSON.LANGUAGE));
			ArrayNode incidents = (ArrayNode) object.get(ConstantsJSON.INCIDENTS);
			assert(!forceResult || (incidents.size() > 0));
		}
	}

	static void assertVariantArrayGrouped(ObjectNode variants) {
		assert(variants.has(ConstantsJSON.VARIANTS));
		assert(variants.has(ConstantsJSON.SIZE));
		assert(variants.has(ConstantsJSON.TOTAL));
		assert(variants.get(ConstantsJSON.TOTAL).asInt() >= variants.get(ConstantsJSON.SIZE).asInt());

		if (variants.has(ConstantsJSON.API_FILTER_BY))
			assert(variants.get(ConstantsJSON.API_FILTER_BY).isObject());
		if (variants.has(ConstantsJSON.API_GROUP_BY)) {
			assert(variants.get(ConstantsJSON.API_GROUP_BY).isArray());
			assertVariantsNested(variants.get(ConstantsJSON.VARIANTS), variants.get(ConstantsJSON.API_GROUP_BY).size());
		} else {
			assertVariantsNested(variants.get(ConstantsJSON.VARIANTS), 0);
		}
	}
	
	static void assertVariantsNested(Object object, int depth) {
		if (depth <= 0) {
			assert(object instanceof ArrayNode);
			ArrayNode array = (ArrayNode) object;
			assertVariantArray(array);
		}
		else {
			assert(object instanceof ObjectNode);
			ObjectNode jobject = (ObjectNode) object;
			for (String key: Util.jsonKeySet(jobject)) {
				Object subobject = jobject.get(key);
				assertVariantsNested(subobject, depth-1);
			}
		}
	}

	static void assertVariantArray(ArrayNode variants) {
		for (int i = 0; i<variants.size(); i++)
			assertVariantObject((ObjectNode) variants.get(i));
	}

	static void assertVariantObject(ObjectNode variant) {
		assert(variant.has(ConstantsJSON.NAME));
		assert(variant.has(ConstantsJSON.FRAGMENTS));
		ArrayNode fragments = (ArrayNode) variant.get(ConstantsJSON.FRAGMENTS);
		assertFragmentsArray(fragments);
	}

	static void assertFragmentsArray(ArrayNode fragments) {
		assert(!fragments.isEmpty());
		for (int j = 0; j<fragments.size(); j++) {
			ObjectNode fragment = (ObjectNode) fragments.get(j);
			Boolean isText = fragment.has(ConstantsJSON.TEXT) && fragment.size() == 1;
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
				fragment.size() == 2 &&
				fragment.has(ConstantsJSON.PARAMETER) &&
				fragment.has(ConstantsJSON.VALUE);
			assert(isText || isFragment || isFragment2 || isPredef);
		}
	}

	void assertVariantObjectWith(ObjectNode variant, String variantname) {
		ArrayNode variants = (ArrayNode) variant.get(ConstantsJSON.VARIANTS);
		Boolean with = false;
		for (int i = 0; i<variants.size(); i++) {
			with = with || variants.get(i).get(ConstantsJSON.NAME).asText().equals(variantname);
		}
		assert(with);
	}

	void assertVariantObjectWithout(ObjectNode variant, String variantname) {
		ArrayNode variants = (ArrayNode) variant.get(ConstantsJSON.VARIANTS);
		Boolean without = true;
		for (int i = 0; i<variants.size(); i++) {
			without &= !variants.get(i).get(ConstantsJSON.NAME).asText().equals(variantname);
		}
		assert(without);
	}

	// __________ API CALL TESTS __________

	@Test
	public void testBasics()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constriantID = newConstraint();
		assertNotNull(constriantID);

		ObjectNode constraint = getConstraint(constriantID);
		assertPatternObject(constraint);
		ObjectNode constraint2 = getConstraints(new String[]{constriantID});
		assertPatternObject((ObjectNode) constraint2.get(constriantID));
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
        assertEquals(array.length, datesNew.length+1);
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
		ObjectNode result = InitialisationServlet.applyGet("", getEmptyParams());
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

		ObjectNode nodb = ConstraintDatabaseServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (!nodb.has(ConstantsJSON.DATABASE));

		Map<String, String[]> params1 = getEmptyParams();
		params1.put(ConstantsJSON.DATABASE, new String[] { dbname1 });
		ObjectNode db1 = ConstraintDatabaseServlet.applyPost("/xml/" + constraintID, params1);
		assert (db1.has(ConstantsJSON.CONSTRAINT_ID) && db1.get(ConstantsJSON.CONSTRAINT_ID).asText().equals(constraintID));
		assert (db1.has(ConstantsJSON.DATABASE) && db1.get(ConstantsJSON.DATABASE).asText().equals(dbname1));
		assert (!db1.has(ConstantsJSON.OLD_DATABASE));
		assert (db1.has(ConstantsJSON.LASTSAVED));

		ObjectNode db1get = ConstraintDatabaseServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (db1get.has(ConstantsJSON.DATABASE) && db1get.get(ConstantsJSON.DATABASE).asText().equals(dbname1));

		Map<String, String[]> params2 = getEmptyParams();
		params2.put(ConstantsJSON.DATABASE, new String[] { dbname2 });
		ObjectNode db2 = ConstraintDatabaseServlet.applyPost("/xml/" + constraintID, params2);
		assert (db2.has(ConstantsJSON.CONSTRAINT_ID) && db2.get(ConstantsJSON.CONSTRAINT_ID).asText().equals(constraintID));
		assert (db2.has(ConstantsJSON.DATABASE) && db2.get(ConstantsJSON.DATABASE).asText().equals(dbname2));
		assert (db2.has(ConstantsJSON.OLD_DATABASE) && db2.get(ConstantsJSON.OLD_DATABASE).asText().equals(dbname1));
		assert (db2.has(ConstantsJSON.LASTSAVED));

		ObjectNode db2get = ConstraintDatabaseServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (db2get.has(ConstantsJSON.DATABASE) && db2get.get(ConstantsJSON.DATABASE).asText().equals(dbname2));

		deleteConstraint(constraintID);
	}

	@Test
	public void testConstraintDataModelServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		String dmname1 = "dm";
		String dmname2 = "dm2";

		ObjectNode nodm = ConstraintDatabaseServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (!nodm.has(ConstantsJSON.DATAMODEL));

		Map<String, String[]> params1 = getEmptyParams();
		params1.put(ConstantsJSON.DATAMODEL, new String[] { dmname1 });
		ObjectNode dm1 = ConstraintDataModelServlet.applyPost("/xml/" + constraintID, params1);
		assert (dm1.has(ConstantsJSON.CONSTRAINT_ID) && dm1.get(ConstantsJSON.CONSTRAINT_ID).asText().equals(constraintID));
		assert (dm1.has(ConstantsJSON.DATAMODEL) && dm1.get(ConstantsJSON.DATAMODEL).asText().equals(dmname1));
		assert (!dm1.has(ConstantsJSON.OLD_DATABASE));
		assert (dm1.has(ConstantsJSON.LASTSAVED));

		ObjectNode dm1get = ConstraintDataModelServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (dm1get.has(ConstantsJSON.DATAMODEL) && dm1get.get(ConstantsJSON.DATAMODEL).asText().equals(dmname1));

		Map<String, String[]> params2 = getEmptyParams();
		params2.put(ConstantsJSON.DATAMODEL, new String[] { dmname2 });
		ObjectNode dm2 = ConstraintDataModelServlet.applyPost("/xml/" + constraintID, params2);
		assert (dm2.has(ConstantsJSON.CONSTRAINT_ID) && dm2.get(ConstantsJSON.CONSTRAINT_ID).asText().equals(constraintID));
		assert (dm2.has(ConstantsJSON.DATAMODEL) && dm2.get(ConstantsJSON.DATAMODEL).asText().equals(dmname2));
		assert (dm2.has(ConstantsJSON.OLD_DATAMODEL) && dm2.get(ConstantsJSON.OLD_DATAMODEL).asText().equals(dmname1));
		assert (dm2.has(ConstantsJSON.LASTSAVED));

		ObjectNode db2get = ConstraintDataModelServlet.applyGet("/xml/" + constraintID, getEmptyParams());
		assert (db2get.has(ConstantsJSON.DATAMODEL) && db2get.get(ConstantsJSON.DATAMODEL).asText().equals(dmname2));

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

		ObjectNode tags1 = ConstraintTagServlet.applyPost("/xml/" + constraintID, params1);
		assert (tags1.has(ConstantsJSON.SUCCESS) && tags1.get(ConstantsJSON.SUCCESS).equals((Util.jsonCreateArray(arr012)));
		assert (!tags1.has(ConstantsJSON.FAILED));

		ObjectNode tags2 = ConstraintTagServlet.applyDelete("/xml/" + constraintID, params2);
		assert (tags2.has(ConstantsJSON.SUCCESS) && tags2.get(ConstantsJSON.SUCCESS).equals(Util.jsonCreateArray(arr12)));
		assert (tags2.has(ConstantsJSON.FAILED)
				&& tags2.get(ConstantsJSON.FAILED).toString().contains("{\"" + lst[3] + "\":\"tag not found\"}"));

		ObjectNode tags3 = ConstraintTagServlet.applyPost("/xml/" + constraintID, params3);
		assert (tags3.has(ConstantsJSON.SUCCESS) && tags3.get(ConstantsJSON.SUCCESS).equals(Util.jsonCreateArray(arr123)));
		assert (tags3.has(ConstantsJSON.FAILED)
				&& tags3.get(ConstantsJSON.FAILED).toString().contains("\"" + lst[0] + "\":\"tag already added\""));

		ObjectNode tags4 = ConstraintTagServlet.applyDelete("/xml/" + constraintID, params4);
		assert (tags4.has(ConstantsJSON.SUCCESS) && tags4.get(ConstantsJSON.SUCCESS).equals(Util.jsonCreateArray(arr0123)));
		assert (!tags4.has(ConstantsJSON.FAILED));

		deleteConstraint(constraintID);
	}

	@Test
	public void testConstraintNameServletPost()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		String newName = UUID.randomUUID().toString();
		ObjectNode json = getConstraint(constraintID);
		assert (json.has("name") && !json.get("name").asText().equals(newName));
		Map<String, String[]> param = getEmptyParams();
		param.put("name", new String[] { newName });
		ConstraintNameServlet.applyPost("/xml/" + constraintID, param);
		ObjectNode jsonNamed = getConstraint(constraintID);
		assert (jsonNamed.has("name") && jsonNamed.get("name").asText().equals(newName));
		deleteConstraint(constraintID);
	}

	@Test
	public void testConstraintCopyServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		ObjectNode jsonDefault = getConstraint(constraintID);

		ObjectNode jsonCopy = ConstraintCopyServlet.applyPut("/xml/" + constraintID, getEmptyParams());
		String constraintIDCopy = null;
		try {
			constraintIDCopy = jsonCopy.get(ConstantsJSON.CONSTRAINT_ID).asText();
			jsonDefault.remove(ConstantsJSON.CONSTRAINT_ID);
			jsonDefault.put(ConstantsJSON.CONSTRAINT_ID, constraintIDCopy);
			assertSimilarNodes(jsonDefault, jsonCopy);

			deleteConstraint(constraintID);
			deleteConstraint(constraintIDCopy);
		} catch (RuntimeException e) {
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
		ObjectNode get1 = ConstraintServlet.applyPost("/xml/" + constraintId, params1);
		assert (get1.has(ConstantsJSON.SUCCESS) && get1.getJSONArray(ConstantsJSON.SUCCESS)
				.similar(new JSONArray(new String[] { "XmlPath_Element_0", ConstantsJSON.DATABASE, ConstantsJSON.DATAMODEL })));
		assert (get1.has(ConstantsJSON.FAILED) && get1.getJSONArray(ConstantsJSON.FAILED).getJSONObject(0).has(uuidstring));
		assert (get1.has("available") && get1.getJSONArray("available").toList()
				.containsAll(Arrays.asList(ConstantsJSON.DATABASE, ConstantsJSON.DATAMODEL, "namespace", "name", "XmlPath_Element_0")));
		assert (get1.has(ConstantsJSON.LASTSAVED));

		ObjectNode get = getConstraint(constraintId);
		assert (get.has(ConstantsJSON.DATABASE) && get.get(ConstantsJSON.DATABASE).asText().equals("value"));
		assert (get.has(ConstantsJSON.DATAMODEL) && get.get(ConstantsJSON.DATAMODEL).asText().equals("value"));

		deleteConstraint(constraintId);
	}

	@Test
	public void testPatternListServletGetAll()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ObjectNode listTemplate = PatternListServlet.applyGet("/xml" + "/all", getEmptyParams());
		int templateNo = EMFModelLoad.getFilesInDirectory(folder + "/templates/xml/abstract-patterns", Constants.EXTENSION).size();
		templateNo += EMFModelLoad.getFilesInDirectory(folder + "/templates/xml/concrete-patterns", Constants.EXTENSION).size();
		assert (templateNo > 0);
		assert (listTemplate.has(ConstantsJSON.SIZE) && listTemplate.get(ConstantsJSON.SIZE).asInt() == templateNo);
		assert (listTemplate.has(ConstantsJSON.IDS) && listTemplate.get(ConstantsJSON.IDS).size() == templateNo);
		assert (listTemplate.has(ConstantsJSON.TEMPLATES) && listTemplate.get(ConstantsJSON.TEMPLATES).size() == templateNo);
		if (listTemplate.has(ConstantsJSON.TEMPLATES))
			assertPatternJSONObjectArray(listTemplate.getJSONArray(ConstantsJSON.TEMPLATES));
	}

	@Test
	public void testPatternListServletGetTemplate()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ObjectNode listTemplate = PatternListServlet.applyGet("/xml" + "/template", getEmptyParams());
		int templateNo = EMFModelLoad.getFilesInDirectory(folder + "/templates/xml/abstract-patterns", Constants.EXTENSION).size();
		assert (templateNo > 0);
		assert (listTemplate.has(ConstantsJSON.SIZE) && listTemplate.get(ConstantsJSON.SIZE).asInt() == templateNo);
		assert (listTemplate.has(ConstantsJSON.IDS) && listTemplate.get(ConstantsJSON.IDS).size() == templateNo);
		assert (listTemplate.has(ConstantsJSON.TEMPLATES) && listTemplate.get(ConstantsJSON.TEMPLATES).size() == templateNo);
		if (listTemplate.has(ConstantsJSON.TEMPLATES))
			assertPatternObjectArray((ArrayNode) listTemplate.get(ConstantsJSON.TEMPLATES));
	}

	@Test
	public void testPatternListServletGetConcreteEmpty()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ObjectNode listConcreteEmpty = PatternListServlet.applyGet("/xml" + "/concrete", getEmptyParams());
		assert (listConcreteEmpty.get(ConstantsJSON.SIZE).asInt() == 0);
		assert (listConcreteEmpty.has(ConstantsJSON.IDS) && listConcreteEmpty.get(ConstantsJSON.IDS).isEmpty());
		assert (listConcreteEmpty.has(ConstantsJSON.TEMPLATES) && listConcreteEmpty.get(ConstantsJSON.TEMPLATES).isEmpty());
	}

	@Test
	public void testPatternListServletGetReadyEmpty()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ObjectNode listReadyEmpty = PatternListServlet.applyGet("/xml" + "/ready", getEmptyParams());
		assert (listReadyEmpty.get(ConstantsJSON.SIZE).asInt() == 0);
		assert (listReadyEmpty.has(ConstantsJSON.IDS) && listReadyEmpty.get(ConstantsJSON.IDS).isEmpty());
		assert (listReadyEmpty.has(ConstantsJSON.TEMPLATES) && listReadyEmpty.get(ConstantsJSON.TEMPLATES).isEmpty());
	}

	@Test
	public void testPatternListServletGetConcrete()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ArrayList<String> ids = new ArrayList<String>();
		int n = 10;
		for (int i = 0; i < n; i++)
			ids.add(newConstraint());

		ObjectNode listConcrete = PatternListServlet.applyGet("/xml" + "/concrete", getEmptyParams());
		assert (listConcrete.get(ConstantsJSON.SIZE).asInt() == 10);
		assert (listConcrete.has(ConstantsJSON.IDS) && listConcrete.get(ConstantsJSON.IDS).size() == 10);
		assert (listConcrete.has(ConstantsJSON.TEMPLATES) && listConcrete.get(ConstantsJSON.TEMPLATES).size() == 10);

		ObjectNode listReadyEmpty = PatternListServlet.applyGet("/xml" + "/ready", getEmptyParams());
		assert (listReadyEmpty.get(ConstantsJSON.SIZE).asInt() == 0);
		assert (listReadyEmpty.has(ConstantsJSON.IDS) && listReadyEmpty.get(ConstantsJSON.IDS).isEmpty());
		assert (listReadyEmpty.has(ConstantsJSON.TEMPLATES) && listReadyEmpty.get(ConstantsJSON.TEMPLATES).isEmpty());

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

		ObjectNode apply1 = ConstraintMqafServlet.applyGet3("/xml/" + constraintID, getEmptyParams());

		Map<String, String[]> params1 = getEmptyParams();
		params1.put("constraintIDs", new String[] { constraintID });
		ObjectNode apply2 = ConstraintMqafServlet.applyGet2("/xml", params1);

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

		ObjectNode apply1 = ConstraintQueryServlet.applyGet3("/xml/" + constraintID, getEmptyParams());

		Map<String, String[]> params1 = getEmptyParams();
		params1.put(ConstantsJSON.CONSTRAINTS, new String[] { constraintID });
		ObjectNode apply2 = ConstraintQueryServlet.applyGet2("/xml", params1);

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
		ObjectNode result = ConstraintExecuteServlet.applyGet("/xml", params2);
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

		ObjectNode params2 = Util.jsonCreateObject();
		params2.put("constraintIDs", constraintID);
		params2.put("files", "lido.xml");
		ObjectNode result = ConstraintExecuteServlet.applyPost("/xml", params2);
		assertExecuteResultObject(result, true);
		deleteConstraint(constraintID);
	}

	@Test
	public void testTemplateVariantServletGet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ObjectNode variant = TemplateVariantServlet.applyGet("/xml/Card_xml", getEmptyParams());
		assert(variant.has(ConstantsJSON.VARIANTS));
		assert(variant.has(ConstantsJSON.PARAMETER));
		
		Map<String, String[]> params2 = getEmptyParams();
		params2.put(ConstantsJSON.VARIANTS, new String[]{"false"});
		ObjectNode variantEmpty = TemplateVariantServlet.applyGet("/xml/Card_xml", params2);
		assert(!variantEmpty.has(ConstantsJSON.VARIANTS));
		assert(variantEmpty.has(ConstantsJSON.PARAMETER));
	}

	@Test
	public void testTemplateVariantServletPutDelete()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String variantname = "testvariant";
		String variantjsonstring = "{\"template\":\"Card_xml\", \"language\":\"xml\", \"name\":\"" + variantname + "\", \"typeConstraint\":true, \"fragments\":[ {\"text\":\"Each\"}, {\"name\":\"element\", \"params\":[2], \"exampleValue\":\"Actors\", \"description\":\"anchor for analysis\"}, {\"text\":\"has\"}, {\"name\":\"a comparison with\", \"params\":[0], \"exampleValue\":\"at most\", \"defaultMap\":\"comparison_negated\"}, {\"name\":\"a specific number\", \"params\":[1], \"exampleValue\":\"1\"}, {\"name\":\"child elements\", \"params\":[3], \"exampleValue\":\"Birthdates\", \"description\":\"counted elements\", \"plural\":\"true\"}, {\"text\":\".\"} ]}";

		ObjectNode variant = TemplateVariantServlet.applyGet("/xml/Card_xml", getEmptyParams());
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
		ObjectNode object = ConstraintUploadServlet.applyPost(null, getEmptyParams(), file);
		assertPatternObject(object);
		String constraintIDnew = object.get(ConstantsJSON.CONSTRAINT_ID).asText();
		deleteConstraint(constraintID);
		deleteConstraint(constraintIDnew);
	}

	@Test
	public void testVariantServletGet() 
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {

		ObjectNode variants = VariantsServlet.applyGet("/xml/", getEmptyParams());
		assertVariantArrayGrouped(variants);

		Map<String, String[]> paramsGroup = getEmptyParams();
		paramsGroup.put(ConstantsJSON.API_GROUP_BY, new String[]{"['custom.type']"});
		ObjectNode variantsGrouped = VariantsServlet.applyGet("/xml/", paramsGroup);
		assertVariantArrayGrouped(variantsGrouped);

		Map<String, String[]> paramsGroup2 = getEmptyParams();
		paramsGroup2.put(ConstantsJSON.API_GROUP_BY, new String[]{"['custom.type', 'custom.scope']"});
		ObjectNode variantsGrouped2 = VariantsServlet.applyGet("/xml/", paramsGroup2);
		assertVariantArrayGrouped(variantsGrouped2);

		Map<String, String[]> paramsFilter = getEmptyParams();
		paramsFilter.put(ConstantsJSON.API_FILTER_BY, new String[]{"{'custom.scope':'hierarchical'}"});
		ObjectNode variantsFilter = VariantsServlet.applyGet("/xml/", paramsFilter);
		assertVariantArrayGrouped(variantsFilter);

		Map<String, String[]> paramsFilter2 = getEmptyParams();
		paramsFilter2.put(ConstantsJSON.API_FILTER_BY, new String[]{"{'custom.type': 'comp', 'custom.scope':'hierarchical'}"});
		ObjectNode variantsFilter2 = VariantsServlet.applyGet("/xml/", paramsFilter2);
		assertVariantArrayGrouped(variantsFilter2);

		Map<String, String[]> paramsFilterGroup = getEmptyParams();
		paramsFilterGroup.put(ConstantsJSON.API_GROUP_BY, new String[]{"['custom.type']"});
		paramsFilterGroup.put(ConstantsJSON.API_FILTER_BY, new String[]{"{'scope':'hierarchical'}"});
		ObjectNode variantsFilterGroup = VariantsServlet.applyGet("/xml/", paramsFilterGroup);
		assertVariantArrayGrouped(variantsFilterGroup);

		Map<String, String[]> paramsFilter2Group2 = getEmptyParams();
		paramsFilter2Group2.put(ConstantsJSON.API_GROUP_BY, new String[]{"['custom.type', 'custom.scope']"});
		paramsFilter2Group2.put(ConstantsJSON.API_FILTER_BY, new String[]{"{'custom.type': 'comp', 'custom.scope':'hierarchical'}"});
		ObjectNode variantsFilter2Group2 = VariantsServlet.applyGet("/xml/", paramsFilter2Group2);
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

			// SIZE
			assert(variants.get(ConstantsJSON.SIZE).asInt() >= 91);
			assert(variantsGrouped.get(ConstantsJSON.SIZE).asInt() >= 50);
			assert(variantsGrouped2.get(ConstantsJSON.SIZE).asInt() >= 50);
			assert(variantsFilter.get(ConstantsJSON.SIZE).asInt() >= 20);
			assert(variantsFilter2.get(ConstantsJSON.SIZE).asInt() >= 1);
			assert(variantsFilterGroup.get(ConstantsJSON.SIZE).asInt() == 0);
			assert(variantsFilter2Group2.get(ConstantsJSON.SIZE).asInt() >= 1);

			// TOTAL
			assert(variants.get(ConstantsJSON.TOTAL).asInt() >= 50);
			assert(variantsGrouped.get(ConstantsJSON.TOTAL).asInt() >= 50);
			assert(variantsGrouped2.get(ConstantsJSON.TOTAL).asInt() >= 50);
			assert(variantsFilter.get(ConstantsJSON.TOTAL).asInt() >= 20);
			assert(variantsFilter2.get(ConstantsJSON.TOTAL).asInt() >= 1);
			assert(variantsFilterGroup.get(ConstantsJSON.TOTAL).asInt() == 0);
			assert(variantsFilter2Group2.get(ConstantsJSON.TOTAL).asInt() >= 1);
		}
	}

	@Test
	public void testVariantServletGetOrder() 
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {

		Map<String, String[]> paramsOrder = getEmptyParams();
		ObjectNode variants = VariantsServlet.applyGet("/xml/", paramsOrder);

		String id0 = getId(variants, 0);
		String id1 = getId(variants, 1);
		String id2 = getId(variants, 2);
		String id3 = getId(variants, 3);

		ServletUtilities.setNumber(ServletConstants.COUNTFILE, id0, 1050, ConstantsJSON.COUNTER_CREATE);
		ServletUtilities.setNumber(ServletConstants.COUNTFILE, id1, 1100, ConstantsJSON.COUNTER_CREATE);
		ServletUtilities.setNumber(ServletConstants.COUNTFILE, id2, 1150, ConstantsJSON.COUNTER_CREATE);
		ServletUtilities.setNumber(ServletConstants.COUNTFILE, id3, 1000, ConstantsJSON.COUNTER_CREATE);

		paramsOrder.put(ConstantsJSON.API_ORDER_BY, new String[]{"created"});
		ObjectNode variants_new = VariantsServlet.applyGet("/xml/", paramsOrder);

		System.out.println(getId(variants_new, 0) + ", " + getId(variants_new, 1) + ", " + getId(variants_new, 2) + ", " + getId(variants_new, 3));
		String id0_new = getId(variants_new, 0);
		String id1_new = getId(variants_new, 1);
		String id2_new = getId(variants_new, 2);
		String id3_new = getId(variants_new, 3);

		assertEquals(id0_new, id2);
		assertEquals(id1_new, id1);
		assertEquals(id2_new, id0);
		assertEquals(id3_new, id3);
	}
	
	private static String getId(ObjectNode variants, int num) {
		ArrayNode vars = (ArrayNode) variants.get(ConstantsJSON.VARIANTS);
		ObjectNode obj0 = (ObjectNode) vars.get(num);
		return obj0.path(ConstantsJSON.TEMPLATE_ID).asText() + "_" + obj0.path(ConstantsJSON.NAME).asText();
	}
	
}

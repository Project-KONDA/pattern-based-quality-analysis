package newservelettest.xmlapitests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Stream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import qualitypatternmodel.utility.Util;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CompareBaseXSaxonResults {

	static String pathBase = "/jsonresult_Saxon_develop.json";
	static String pathNew = "/jsonresult_Saxon.json";
//	static String path2 = "/jsonresult_Saxon.json";
	static JSONObject version_base;
	static JSONObject version_new;
	
	@BeforeAll
	public static void initialize() throws IOException {
		version_base = Util.loadJson(pathBase);
		version_new = Util.loadJson(pathNew);
	}

    static Stream<Arguments> baseKeys () {
    	Set<String> keys = version_new.keySet();
    	keys.remove("LinkMatchListExists_xml_default");
        return keys.stream()
                .map(item -> Arguments.of(item));
    }

    static Stream<Arguments> baseKeysOneTwo () {

    	Set<String> keysBase = version_base.keySet();
    	keysBase.remove("LinkMatchListExists_xml_default");
    	Set<String> keysNew = version_new.keySet();
    	keysNew.remove("LinkMatchListExists_xml_default");
    	
    	Stream<Arguments> stream1 = keysBase.stream().map(item -> Arguments.of(item, 0));
    	Stream<Arguments> stream2 = keysNew.stream().map(item -> Arguments.of(item, 1));
    	Stream<Arguments> joined = Stream.concat(stream1, stream2);
    	return joined.sorted(Comparator.comparing(a -> (String) a.get()[0]));
    }

    static Stream<Arguments> newKeys () {
        return version_new.keySet().stream()
                .map(item -> Arguments.of(item));
    }


    @Order(0)
	@Test
	public void compareConstraints_length () {
		assert(version_base.length() == version_new.length());
	}

    @Order(1)
	@ParameterizedTest
    @MethodSource("baseKeys")
	public void compareConstraints_baseInNew (String constraintId) {
		assert(version_new.has(constraintId));
	}

    @Order(2)
	@ParameterizedTest
    @MethodSource("newKeys")
	public void compareConstraints_newInBase (String constraintId) {
		assert(version_base.has(constraintId));
	}

    @Order(3)
	@ParameterizedTest
    @MethodSource("baseKeys")
	public void compare_metadata (String constraintId) {
		JSONObject c1 = version_base.getJSONObject(constraintId);
		JSONObject c2 = version_new.getJSONObject(constraintId);

		assertEquals(c1.get("constraint"), c2.get("constraint"));
		assertEquals(c1.get("variant"), c2.get("variant"));
		assertEquals(c1.get("constraintID"), c2.get("constraintID"));
		
	}

    @Order(4)
	@ParameterizedTest
    @MethodSource("baseKeys")
	public void compare_constraints (String constraintId) {
		JSONObject queryBase = version_base.getJSONObject(constraintId).getJSONObject("query");
		JSONObject queryNew = version_new.getJSONObject(constraintId).getJSONObject("query");

		assert(queryBase.getJSONArray("failed").isEmpty());
		assert(queryNew.getJSONArray("failed").isEmpty());

		JSONObject constraintqueryBase = queryBase.getJSONArray("constraints").getJSONObject(0);
		JSONObject constraintqueryNew = queryNew.getJSONArray("constraints").getJSONObject(0);

		assertEquals(constraintqueryBase.getString("constraintID"), constraintqueryNew.getString("constraintID"));
//		assertEquals(constraintqueryBase.getJSONObject("custom").toString(), constraintqueryNew.getJSONObject("custom").toString());
		assertEquals(constraintqueryBase.getString("name"), constraintqueryNew.getString("name"));
		assertEquals(constraintqueryBase.getString("language"), constraintqueryNew.getString("language"));
		assertEquals(constraintqueryBase.getString("technology"), constraintqueryNew.getString("technology"));
	}

    @Order(5)
	@ParameterizedTest
    @MethodSource("baseKeys")
	public void compare_queries(String constraintId) {
		JSONObject queryBase = version_base.getJSONObject(constraintId).getJSONObject("query");
		JSONObject queryNew = version_new.getJSONObject(constraintId).getJSONObject("query");
		JSONObject constraintqueryBase = queryBase.getJSONArray("constraints").getJSONObject(0);
		JSONObject constraintqueryNew = queryNew.getJSONArray("constraints").getJSONObject(0);

		assertQueryEquals(constraintqueryBase.getString("queryLine"), constraintqueryNew.getString("queryLine"));
		assertQueryEquals(constraintqueryBase.getString("query"), constraintqueryNew.getString("query"));
		assertEquals(constraintqueryBase.getString("queryPartialLine"), constraintqueryNew.getString("queryPartialLine"));
		assertEquals(constraintqueryBase.getString("queryPartial"), constraintqueryNew.getString("queryPartial"));
		assertEquals(constraintqueryBase.has("filter"), constraintqueryNew.has("filter"));
		if (constraintqueryBase.has("filter")) {
			assertFilterEquals(constraintqueryBase.getJSONObject("filter"), constraintqueryNew.getJSONObject("filter"));
		}
	}
    
    public void assertFilterEquals(JSONObject baseFilter, JSONObject newFilter) {
    	JSONObject baseFilterFilter = baseFilter.getJSONObject("filter");
    	JSONObject newFilterFilter = newFilter.getJSONObject("filter");
    	assertEquals(baseFilterFilter.toString(), newFilterFilter.toString());
    	
    	assertEquals(baseFilter.getString("patternName"), newFilter.getString("patternName"));
    	assertQueryEquals(baseFilter.getString("query"), newFilter.getString("query"));
    	assertEquals(baseFilter.getString("language"), newFilter.getString("language"));

    	JSONObject baseFilterStructure = baseFilter.getJSONObject("structure");
    	JSONObject newFilterStructure = newFilter.getJSONObject("structure");
    	assertEquals(baseFilterStructure.toString(), newFilterStructure.toString());    	
    }
    
    private void assertQueryEquals(String baseQuery, String newQuery) {
//    	assertEquals(baseQuery.split("return")[0], newQuery.split("return")[0]); 
    }

    @Order(6)
	@ParameterizedTest
    @MethodSource("baseKeysOneTwo")
	public void compareResults_metadata(String constraintId, int id) {
		JSONObject resultBase = version_base.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		JSONObject resultNew = version_new.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		assertEquals(resultBase.getString("constraintID"), resultNew.getString("constraintID"));
		assertEquals(resultBase.getString("file"), resultNew.getString("file"));
		assertEquals(resultBase.getString("constraintName"), resultNew.getString("constraintName"));
//		assertEquals(resultBase.getJSONObject("custom").toString(), resultNew.getJSONObject("custom").toString());
	}

    @Order(7)
	@ParameterizedTest
    @MethodSource("baseKeysOneTwo")
	public void compareResults_number_Findings(String constraintId, int id) {
		JSONObject resultBase = version_base.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		JSONObject resultNew = version_new.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		assertEquals(resultBase.getNumber("totalFindings"), resultNew.getNumber("totalFindings"));
	}

    @Order(8)
	@ParameterizedTest
    @MethodSource("baseKeysOneTwo")
	public void compareResults_incidents_total(String constraintId, int id) {
		JSONObject resultBase = version_base.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		if (version_new.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").length() < id)
			System.out.println(version_new.getJSONObject(constraintId).getJSONObject("result"));
			
		JSONObject resultNew = version_new.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		assertEquals(resultBase.getNumber("totalIncidents"), resultNew.getNumber("totalIncidents"));
	}

    @Order(9)
	@ParameterizedTest
    @MethodSource("baseKeysOneTwo")
	public void compareResults_incidents_jsonarrays(String constraintId, int id) {
		JSONObject resultBase = version_base.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		JSONObject resultNew = version_new.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		assertEquals(resultBase.getJSONArray("incidents").length(), resultNew.getJSONArray("incidents").length());
	}

    @Order(10)
	@ParameterizedTest
    @MethodSource("baseKeysOneTwo")
	public void compareResults_incidents_baseInNew (String constraintId, int id) {
		JSONArray incidentsBase = version_base.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		JSONArray incidentsNew = version_new.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		compareResults(incidentsBase, incidentsNew, constraintId, id);
    }

    @Order(11)
	@ParameterizedTest
    @MethodSource("baseKeysOneTwo")
	public void compareResults_incidents_newInBase (String constraintId, int id) {
		JSONArray incidentsBase = version_base.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		JSONArray incidentsNew = version_new.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		compareResults(incidentsNew, incidentsBase, constraintId, id);
    }

	public static void compareResults (JSONArray incidentsBase, JSONArray incidentsNew, String constraintId, int id) {
		incidentsBase = new JSONArray(incidentsBase.toString());
		incidentsNew = new JSONArray(incidentsNew.toString());
		
		int fail = 0;
		for (int i = 0; i<incidentsBase.length(); i++) {
			String incident = normalize(incidentsBase.getJSONObject(i).getString("snippet"));
			boolean found = false;
			for (int j = 0; j<incidentsNew.length(); j++) {
				String newIncident = normalize(incidentsNew.getJSONObject(j).getString("snippet"));
				if (incident.equals(newIncident)) {
					found = true;
					incidentsNew.remove(j);
					break;
				}
			}
			if (!found)
				fail+=1;
		}
		assertEquals(0, fail);
		assert (incidentsNew.isEmpty());
	}

	public static String normalize(String s) {
		s = s.replaceAll("(\\\\[rnt]|[\\r\\n\\t])", " ");

		int len = s.length();
		boolean cont = true;
		do {
			len = s.length();
			s = s.replace("  ", " ");
			cont = s.length() < len;
		} while (cont);
		
		s = s.replace("> <", "><");
		return s;
	}
}

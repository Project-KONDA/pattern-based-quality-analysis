package newservelettest.xmlapitests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Stream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.Util;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CompareBaseXSaxonResults {

	static String path_basex = "/jsonresult_basex.json";
//	static String path_basex = "/jsonresult_saxon_strip.json";
	static String path_saxon = "/jsonresult_saxon.json";
	static String resultpath = "/jsonresult_comparisondif2.json";
	static String resultfailingpath = resultpath.replace(".json", "_failing.json");
	static JSONObject basex;
	static JSONObject saxon;
	static JSONObject results;
	static JSONObject results_failing;
	
	@BeforeAll
	public static void initialize () throws IOException {
		basex = EMFModelLoad.loadJson(path_basex);
		saxon = EMFModelLoad.loadJson(path_saxon);
		results = new JSONObject();
		results_failing = new JSONObject();
		results.put("saxon", new JSONObject());
		results.put("basex", new JSONObject());
		results.put("saxon_success", new JSONObject());
		results.put("basex_success", new JSONObject());
	}
	
	@AfterAll
	public static void close() throws IOException {
		results.put("saxon_len", results.getJSONObject("saxon").length());
		results.put("basex_len", results.getJSONObject("basex").length());
		results.put("saxon_success_len", results.getJSONObject("saxon_success").length());
		results.put("basex_success_len", results.getJSONObject("basex_success").length());
		Util.exportJson(results, resultpath);
		Util.exportJson(results_failing, resultfailingpath);
	}

    static Stream<Arguments> baseXkeys () {
        return basex.keySet().stream()
                .map(item -> Arguments.of(item));
    }

    static Stream<Arguments> baseXkeysOneTwo () {
    	Stream<Arguments> stream1 = basex.keySet().stream().map(item -> Arguments.of(item, 0));
    	Stream<Arguments> stream2 = basex.keySet().stream().map(item -> Arguments.of(item, 1));
    	Stream<Arguments> joined = Stream.concat(stream1, stream2);
    	return joined.sorted(Comparator.comparing(a -> (String) a.get()[0]));
    }

    static Stream<Arguments> saxonkeys () {
        return saxon.keySet().stream()
                .map(item -> Arguments.of(item));
    }


    @Order(0)
	@Test
	public void compareConstraints_length () {
		assert(basex.length() == saxon.length());
	}

    @Order(1)
	@ParameterizedTest
    @MethodSource("baseXkeys")
	public void compareConstraints_baseXInSaxon (String constraintId) {
		assert(saxon.has(constraintId));
	}

    @Order(2)
	@ParameterizedTest
    @MethodSource("saxonkeys")
	public void compareConstraints_saxonInBaseX (String constraintId) {
		assert(basex.has(constraintId));
	}

    @Order(3)
	@ParameterizedTest
    @MethodSource("baseXkeys")
	public void compare_metadata (String constraintId) {
		JSONObject c1 = basex.getJSONObject(constraintId);
		JSONObject c2 = saxon.getJSONObject(constraintId);

		assertEquals(c1.get("constraint"), c2.get("constraint"));
		assertEquals(c1.get("variant"), c2.get("variant"));
		assertEquals(c1.get("constraintID"), c2.get("constraintID"));
	}

    @Order(4)
	@ParameterizedTest
    @MethodSource("baseXkeys")
	public void compare_constraints (String constraintId) {
		JSONObject queryBaseX = basex.getJSONObject(constraintId).getJSONObject("query");
		JSONObject querySaxon = saxon.getJSONObject(constraintId).getJSONObject("query");

		assert(queryBaseX.getJSONArray("failed").isEmpty());
		assert(querySaxon.getJSONArray("failed").isEmpty());

		JSONObject constraintqueryBaseX = queryBaseX.getJSONArray("constraints").getJSONObject(0);
		JSONObject constraintquerySaxon = querySaxon.getJSONArray("constraints").getJSONObject(0);

		assertEquals(constraintqueryBaseX.getString("constraintID"), constraintquerySaxon.getString("constraintID"));
//		assertEquals(constraintqueryBaseX.getJSONObject("custom").toString(), constraintquerySaxon.getJSONObject("custom").toString());
		assertEquals(constraintqueryBaseX.getString("name"), constraintquerySaxon.getString("name"));
		assertEquals(constraintqueryBaseX.getString("language"), constraintquerySaxon.getString("language"));
		assertEquals(constraintqueryBaseX.getString("technology"), constraintquerySaxon.getString("technology"));
	}

    @Order(5)
	@ParameterizedTest
    @MethodSource("baseXkeys")
	public void compare_queries(String constraintId) {
		JSONObject queryBaseX = basex.getJSONObject(constraintId).getJSONObject("query");
		JSONObject querySaxon = saxon.getJSONObject(constraintId).getJSONObject("query");
		JSONObject constraintqueryBaseX = queryBaseX.getJSONArray("constraints").getJSONObject(0);
		JSONObject constraintquerySaxon = querySaxon.getJSONArray("constraints").getJSONObject(0);

		assertEquals(constraintqueryBaseX.getString("queryLine"), constraintquerySaxon.getString("queryLine"));
		assertEquals(constraintqueryBaseX.getString("query"), constraintquerySaxon.getString("query"));
		assertEquals(constraintqueryBaseX.getString("queryPartialLine"), constraintquerySaxon.getString("queryPartialLine"));
		assertEquals(constraintqueryBaseX.getString("queryPartial"), constraintquerySaxon.getString("queryPartial"));
		assertEquals(constraintqueryBaseX.has("filter"), constraintquerySaxon.has("filter"));
		if (constraintqueryBaseX.has("filter")) {
			compare_filters(constraintqueryBaseX.getJSONObject("filter"), constraintquerySaxon.getJSONObject("filter"));
		}
	}
    
    public void compare_filters(JSONObject baseXfilter, JSONObject saxonFilter) {
    	JSONObject baseXFilterFilter = baseXfilter.getJSONObject("filter");
    	JSONObject saxonFilterFilter = saxonFilter.getJSONObject("filter");
    	assertEquals(baseXFilterFilter.toString(), saxonFilterFilter.toString());
    	
    	assertEquals(baseXfilter.getString("patternName"), saxonFilter.getString("patternName"));
    	assertEquals(baseXfilter.getString("query"), saxonFilter.getString("query"));
    	assertEquals(baseXfilter.getString("language"), saxonFilter.getString("language"));

    	JSONObject baseXFilterStructure = baseXfilter.getJSONObject("structure");
    	JSONObject saxonFilterStructure = saxonFilter.getJSONObject("structure");
    	assertEquals(baseXFilterStructure.toString(), saxonFilterStructure.toString());    	
    }

    @Order(6)
	@ParameterizedTest
    @MethodSource("baseXkeysOneTwo")
	public void compareResults_metadata(String constraintId, int id) {
		JSONObject resultBaseX = basex.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		JSONObject resultSaxon = saxon.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		assertEquals(resultBaseX.getString("constraintID"), resultSaxon.getString("constraintID"));
		assertEquals(resultBaseX.getString("file"), resultSaxon.getString("file"));
		assertEquals(resultBaseX.getString("constraintName"), resultSaxon.getString("constraintName"));
//		assertEquals(resultBaseX.getJSONObject("custom").toString(), resultSaxon.getJSONObject("custom").toString());
	}

    @Order(7)
	@ParameterizedTest
    @MethodSource("baseXkeysOneTwo")
	public void compareResults_number_Findings(String constraintId, int id) {
		JSONObject resultBaseX = basex.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		JSONObject resultSaxon = saxon.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		assertEquals(resultBaseX.getNumber("totalFindings"), resultSaxon.getNumber("totalFindings"));
	}

    @Order(8)
	@ParameterizedTest
    @MethodSource("baseXkeysOneTwo")
	public void compareResults_incidents_total(String constraintId, int id) {
		JSONObject resultBaseX = basex.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		JSONObject resultSaxon = saxon.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		assertEquals(resultBaseX.getNumber("totalIncidents"), resultSaxon.getNumber("totalIncidents"));
	}

    @Order(9)
	@ParameterizedTest
    @MethodSource("baseXkeysOneTwo")
	public void compareResults_incidents_jsonarrays(String constraintId, int id) {
		JSONObject resultBaseX = basex.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		JSONObject resultSaxon = saxon.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id);
		assertEquals(resultBaseX.getJSONArray("incidents").length(), resultSaxon.getJSONArray("incidents").length());
	}

    @Order(9)
	@ParameterizedTest
    @MethodSource("baseXkeysOneTwo")
	public void compareResults_incidents_jsonarrays2(String constraintId, int id) {
    	JSONArray incidentsBaseX = basex.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		JSONArray incidentsSaxon = saxon.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		assertEquals(incidentsBaseX.length(), incidentsSaxon.length());
	}

    @Order(10)
	@ParameterizedTest
    @MethodSource("baseXkeysOneTwo")
	public void compareResults_incidents_baseXInSaxon (String constraintId, int id) throws Exception {
    	JSONArray incidentsBaseX = basex.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		JSONArray incidentsSaxon = saxon.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		int saxlen = incidentsSaxon.length();
		JSONObject o = compareJSONArrays(incidentsSaxon, "saxon", incidentsBaseX, "basex");
		o.put("query", basex.getJSONObject(constraintId).getJSONObject("query").getJSONArray("constraints").getJSONObject(0).getString("query"));
		int failing = o.getInt("failing_len");
		if (failing > 0)
			results.getJSONObject("basex").put(constraintId + id, o);
		else 
			results.getJSONObject("basex_success").put(constraintId + id, saxlen);
		assertEquals(0, failing);
	}

    @Order(11)
	@ParameterizedTest
    @MethodSource("baseXkeysOneTwo")
	public void compareResults_incidents_saxonInBaseX (String constraintId, int id) throws Exception {
    	JSONArray incidentsBaseX = basex.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		JSONArray incidentsSaxon = saxon.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		int saxlen = incidentsSaxon.length();
		JSONObject o = compareJSONArrays(incidentsBaseX, "basex", incidentsSaxon, "saxon");
		o.put("query", basex.getJSONObject(constraintId).getJSONObject("query").getJSONArray("constraints").getJSONObject(0).getString("query"));
		int failing = o.getInt("failing_len");
		if (failing > 0)
			results.getJSONObject("saxon").put(constraintId + id, o);
		else 
			results.getJSONObject("saxon_success").put(constraintId + id, saxlen);
		assertEquals(0, failing);
	}

    @Order(12)
	@ParameterizedTest
    @MethodSource("baseXkeysOneTwo")
	public void compareResults_incidents_Failing (String constraintId, int id) throws Exception {
    	JSONArray incidentsBaseX = basex.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		JSONArray incidentsSaxon = saxon.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		JSONObject bToS = compareJSONArrays(incidentsBaseX, "basex", incidentsSaxon, "saxon");
		JSONObject sToB = compareJSONArrays(incidentsSaxon, "saxon", incidentsBaseX, "basex");
		
		JSONObject failing_dif = compareJSONArrays(bToS.getJSONArray("failing"), "bToS", sToB.getJSONArray("failing"), "sTob");
		failing_dif.put("query", basex.getJSONObject(constraintId).getJSONObject("query").getJSONArray("constraints").getJSONObject(0).getString("query"));
		int failing = failing_dif.getInt("failing_len");
		if (failing > 0)
			results_failing.put(constraintId + id + "0", failing_dif);

		JSONObject failing_dif2 = compareJSONArrays(sToB.getJSONArray("failing"), "sTob", bToS.getJSONArray("failing"), "bToS");
		failing_dif2.put("query", basex.getJSONObject(constraintId).getJSONObject("query").getJSONArray("constraints").getJSONObject(0).getString("query"));
		int failing2 = failing_dif2.getInt("failing_len");
		if (failing2 > 0)
			results_failing.put(constraintId + id + "1", failing_dif2);
		
		
	}
    
    
    private JSONObject compareJSONArrays (JSONArray array1, String name1, JSONArray array2, String name2) {
		int arr1len = array1.length();
		int arr2len = array2.length();
		JSONArray array2copy = new JSONArray(array2.toString());
		JSONObject o = new JSONObject();
		o.put(name1 + "_len", arr1len);
		o.put(name2 + "_len", arr2len);
		o.put(name1 + "_incidents", array1);
		o.put(name2 + "_incidents", array2);
		
		JSONArray failing = new JSONArray();
		
		for (int i = 0; i<arr1len; i++) {
			Object obj1 = array1.get(i);
			String incident1;
			if (obj1 instanceof JSONObject)
					incident1 = normalize(((JSONObject) obj1).getString("snippet"));
			else 
				incident1 = normalize((String) obj1);
			boolean found = false;
			for (int j = 0; j<array2copy.length(); j++) {
				Object obj2 = array2copy.get(j);
				String incident2;
				if (obj2 instanceof JSONObject)
					incident2 = normalize(((JSONObject) obj2).getString("snippet"));
				else 
					incident2 = normalize((String) obj2);
				if (incident1.equals(incident2)) {
					found = true;
					array2copy.remove(j);
					break;
				}
			}
			if (!found) {
				failing.put(incident1);
			}
		}
		
		o.put("failing", failing);
		o.put("failing_len", failing.length());
		o.put(name2 + "_lenafter", array2copy.length());
		return o;
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

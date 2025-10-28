package newservelettest.xmlapitests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.Comparator;
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

import qualitypatternmodel.utility.EMFModelLoad;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CompareBaseXSaxonResults {

	static String path1 = "/jsonresult_basex.json";
	static String path2 = "/jsonresult.json"; // 36 Findings
//	static String path2 = "/jsonresult_saxon_0.json"; // 108 Findings
//	static String path2 = "/jsonresult_saxon_1.json"; // 40 Findings
	static JSONObject basex;
	static JSONObject saxon;
	
	@BeforeAll
	public static void initialize () throws IOException {
		basex = EMFModelLoad.loadJson(path1);
		saxon = EMFModelLoad.loadJson(path2);
		
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

    @Order(10)
	@ParameterizedTest
    @MethodSource("baseXkeysOneTwo")
	public void compareResults_incidents_baseXInSaxon (String constraintId, int id) {
		JSONArray incidentsBaseX = basex.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		JSONArray incidentsSaxon = saxon.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		int fail = 0;

		for (int i = 0; i<incidentsBaseX.length(); i++) {
			String incident = normalize(incidentsBaseX.getJSONObject(i).getString("snippet"));
			boolean found = false;
			for (int j = 0; j<incidentsSaxon.length(); j++) {
				String saxonincident = normalize(incidentsSaxon.getJSONObject(j).getString("snippet"));
				if (incident.equals(saxonincident)) {
					found = true;
					incidentsSaxon.remove(j);
					continue;
				}
			}
			if (!found)
				fail+=1;
		}
//		if (fail > 0 || incidentsSaxon.length() > 0) {
//			System.out.println("basex, " + constraintId + ", " + id + ", " + fail + ", " + incidentsSaxon.length());
//		}
		assertEquals(0, fail);
		assert (incidentsSaxon.isEmpty());
	}

    @Order(11)
	@ParameterizedTest
    @MethodSource("baseXkeysOneTwo")
	public void compareResults_incidents_saxonInBaseX (String constraintId, int id) {
		JSONArray incidentsBaseX = basex.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		JSONArray incidentsSaxon = saxon.getJSONObject(constraintId).getJSONObject("result").getJSONArray("result").getJSONObject(id).getJSONArray("incidents");
		int lenBaseX = incidentsBaseX.length()+0;
		int lenSaxon = incidentsSaxon.length()+0;
		int fail = 0;

		for (int i = 0; i<incidentsSaxon.length(); i++) {
			String saxonincident = normalize(incidentsSaxon.getJSONObject(i).getString("snippet"));
			boolean found = false;
			for (int j = 0; j<incidentsBaseX.length(); j++) {
				String incident = normalize(incidentsBaseX.getString(i));
				if (incident.equals(saxonincident)) {
					found = true;
					incidentsBaseX.remove(j);
					continue;
				}
			}
			if (!found)
				fail+=1;
		}
		if ((fail > 0 || incidentsBaseX.length() > 0) &&  lenSaxon > 0) {
			System.out.println("saxon, " + constraintId + ", " + id + ", " + fail + ", " + incidentsBaseX.length() + ", " + lenBaseX + ", " + lenSaxon);
		}
		assertEquals(0, fail);
		assert (incidentsBaseX.isEmpty());
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

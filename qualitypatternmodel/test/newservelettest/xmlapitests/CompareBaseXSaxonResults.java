package newservelettest.xmlapitests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Stream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
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
	static ObjectNode version_base;
	static ObjectNode version_new;
	
	@BeforeAll
	public static void initialize() throws IOException {
		version_base = Util.loadJson(pathBase);
		version_new = Util.loadJson(pathNew);
	}

    static Stream<Arguments> baseKeys () {
    	Set<String> keys = Util.jsonKeySet(version_base);
    	keys.remove("LinkMatchListExists_xml_default");
        return keys.stream()
                .map(item -> Arguments.of(item));
    }

    static Stream<Arguments> baseKeysOneTwo () {

    	Set<String> keysBase = Util.jsonKeySet(version_base);
    	keysBase.remove("LinkMatchListExists_xml_default");
    	Set<String> keysNew = Util.jsonKeySet(version_new);
    	keysNew.remove("LinkMatchListExists_xml_default");
    	
    	Stream<Arguments> stream1 = keysBase.stream().map(item -> Arguments.of(item, 0));
    	Stream<Arguments> stream2 = keysNew.stream().map(item -> Arguments.of(item, 1));
    	Stream<Arguments> joined = Stream.concat(stream1, stream2);
    	return joined.sorted(Comparator.comparing(a -> (String) a.get()[0]));
    }

    static Stream<Arguments> newKeys() {
		return Util.jsonKeySet(version_new).stream()
                .map(item -> Arguments.of(item));
    }


    @Order(0)
	@Test
	public void compareConstraints_length () {
		assert(version_base.size() == version_new.size());
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
		ObjectNode c1 = (ObjectNode) version_base.get(constraintId);
		ObjectNode c2 = (ObjectNode) version_new.get(constraintId);

		assertEquals(c1.get("constraint"), c2.get("constraint"));
		assertEquals(c1.get("variant"), c2.get("variant"));
		assertEquals(c1.get("constraintID"), c2.get("constraintID"));
		
	}

    @Order(4)
	@ParameterizedTest
    @MethodSource("baseKeys")
	public void compare_constraints (String constraintId) {
		ObjectNode queryBase = (ObjectNode) version_base.get(constraintId).get("query");
		ObjectNode queryNew = (ObjectNode) version_new.get(constraintId).get("query");

		assert(((ArrayNode) queryBase.get("failed")).isEmpty());
		assert(((ArrayNode) queryNew.get("failed")).isEmpty());

		ObjectNode constraintqueryBase = (ObjectNode) queryBase.get("constraints").get(0);
		ObjectNode constraintqueryNew = (ObjectNode) queryNew.get("constraints").get(0);

		assertEquals(constraintqueryBase.get("constraintID").asText(), constraintqueryNew.get("constraintID").asText());
//		assertEquals(constraintqueryBase.getJSONObject("custom").toString(), constraintqueryNew.getJSONObject("custom").toString());
		assertEquals(constraintqueryBase.get("name").asText(), constraintqueryNew.get("name").asText());
		assertEquals(constraintqueryBase.get("language").asText(), constraintqueryNew.get("language").asText());
		assertEquals(constraintqueryBase.get("technology").asText(), constraintqueryNew.get("technology").asText());
	}

    @Order(5)
	@ParameterizedTest
    @MethodSource("baseKeys")
	public void compare_queries(String constraintId) {
		ObjectNode queryBase = (ObjectNode) version_base.get(constraintId).get("query");
		ObjectNode queryNew = (ObjectNode) version_new.get(constraintId).get("query");
		ObjectNode constraintqueryBase = (ObjectNode) queryBase.get("constraints").get(0);
		ObjectNode constraintqueryNew = (ObjectNode) queryNew.get("constraints").get(0);

		assertQueryEquals(constraintqueryBase.get("queryLine").asText(), constraintqueryNew.get("queryLine").asText());
		assertQueryEquals(constraintqueryBase.get("query").asText(), constraintqueryNew.get("query").asText());
		assertEquals(constraintqueryBase.get("queryPartialLine").asText(), constraintqueryNew.get("queryPartialLine").asText());
		assertEquals(constraintqueryBase.get("queryPartial").asText(), constraintqueryNew.get("queryPartial").asText());
		assertEquals(constraintqueryBase.has("filter"), constraintqueryNew.has("filter"));
		if (constraintqueryBase.has("filter")) {
			assertFilterEquals((ObjectNode) constraintqueryBase.get("filter"), (ObjectNode) constraintqueryNew.get("filter"));
		}
	}
    
	public void assertFilterEquals(ObjectNode baseFilter, ObjectNode newFilter) {
	    	ObjectNode baseFilterFilter = (ObjectNode) baseFilter.get("filter");
	    	ObjectNode newFilterFilter = (ObjectNode) newFilter.get("filter");
    	assertEquals(baseFilterFilter.toString(), newFilterFilter.toString());
    	
    	assertEquals(baseFilter.get("patternName").asText(), newFilter.get("patternName").asText());
    	assertQueryEquals(baseFilter.get("query").asText(), newFilter.get("query").asText());
    	assertEquals(baseFilter.get("language").asText(), newFilter.get("language").asText());

	    	ObjectNode baseFilterStructure = (ObjectNode) baseFilter.get("structure");
	    	ObjectNode newFilterStructure = (ObjectNode) newFilter.get("structure");
    	assertEquals(baseFilterStructure.toString(), newFilterStructure.toString());    	
    }
    
    private void assertQueryEquals(String baseQuery, String newQuery) {
//    	assertEquals(baseQuery.split("return")[0], newQuery.split("return")[0]); 
    }

    @Order(6)
	@ParameterizedTest
    @MethodSource("baseKeysOneTwo")
	public void compareResults_metadata(String constraintId, int id) {
		ObjectNode resultBase = (ObjectNode) version_base.get(constraintId).get("result").get("result").get(id);
		ObjectNode resultNew = (ObjectNode) version_new.get(constraintId).get("result").get("result").get(id);
		assertEquals(resultBase.get("constraintID").asText(), resultNew.get("constraintID").asText());
		assertEquals(resultBase.get("file").asText(), resultNew.get("file").asText());
		assertEquals(resultBase.get("constraintName").asText(), resultNew.get("constraintName").asText());
//		assertEquals(resultBase.get("custom").toString(), resultNew.get("custom").toString());
	}

    @Order(7)
	@ParameterizedTest
    @MethodSource("baseKeysOneTwo")
	public void compareResults_number_Findings(String constraintId, int id) {
		ObjectNode resultBase = (ObjectNode) version_base.get(constraintId).get("result").get("result").get(id);
		ObjectNode resultNew = (ObjectNode) version_new.get(constraintId).get("result").get("result").get(id);
		assertEquals(resultBase.get("totalFindings"), resultNew.get("totalFindings"));
	}

    @Order(8)
	@ParameterizedTest
    @MethodSource("baseKeysOneTwo")
	public void compareResults_incidents_total(String constraintId, int id) {
		ObjectNode resultBase = (ObjectNode) version_base.get(constraintId).get("result").get("result").get(id);
		if (version_new.get(constraintId).get("result").get("result").size() < id)
			System.out.println(version_new.get(constraintId).get("result"));
			
		ObjectNode resultNew = (ObjectNode) version_new.get(constraintId).get("result").get("result").get(id);
		assertEquals(resultBase.get("totalIncidents"), resultNew.get("totalIncidents"));
	}

    @Order(9)
	@ParameterizedTest
    @MethodSource("baseKeysOneTwo")
	public void compareResults_incidents_arrays(String constraintId, int id) {
		ObjectNode resultBase = (ObjectNode) version_base.get(constraintId).get("result").get("result").get(id);
		ObjectNode resultNew = (ObjectNode) version_new.get(constraintId).get("result").get("result").get(id);
		assertEquals(resultBase.get("incidents").size(), resultNew.get("incidents").size());
	}

    @Order(10)
	@ParameterizedTest
    @MethodSource("baseKeysOneTwo")
	public void compareResults_incidents_baseInNew (String constraintId, int id) throws JsonMappingException, JsonProcessingException {
		ArrayNode incidentsBase = (ArrayNode) version_base.get(constraintId).get("result").get("result").get(id).get("incidents");
		ArrayNode incidentsNew = (ArrayNode) version_new.get(constraintId).get("result").get("result").get(id).get("incidents");
		compareResults(incidentsBase, incidentsNew, constraintId, id);
    }

    @Order(11)
	@ParameterizedTest
    @MethodSource("baseKeysOneTwo")
	public void compareResults_incidents_newInBase (String constraintId, int id) throws JsonMappingException, JsonProcessingException {
		ArrayNode incidentsBase = (ArrayNode) version_base.get(constraintId).get("result").get("result").get(id).get("incidents");
		ArrayNode incidentsNew = (ArrayNode) version_new.get(constraintId).get("result").get("result").get(id).get("incidents");
		compareResults(incidentsNew, incidentsBase, constraintId, id);
    }

	public static void compareResults (ArrayNode incidentsBase, ArrayNode incidentsNew, String constraintId, int id) throws JsonMappingException, JsonProcessingException {
		ArrayNode incidentsBaseCopy = Util.jsonCreateArray(incidentsBase.toString());
		ArrayNode incidentsNewCopy = Util.jsonCreateArray(incidentsNew.toString());
		
		int fail = 0;
		for (int i = 0; i<incidentsBaseCopy.size(); i++) {
			String incident = normalize(incidentsBaseCopy.get(i).get("snippet").asText());
			boolean found = false;
			for (int j = 0; j<incidentsNewCopy.size(); j++) {
				String newIncident = normalize(incidentsNewCopy.get(j).get("snippet").asText());
				if (compareStringResultReturn(incident, newIncident)) {
					found = true;
					incidentsNewCopy.remove(j);
					break;
				}
			}
			if (!found)
				fail+=1;
		}
		assertEquals(0, fail);
		assert (incidentsNewCopy.isEmpty());
	}

	public static boolean compareStringResultReturn(String incident, String newIncident) {
		if (incident.equals(newIncident))
				return true;
		if (incident.contains("return")) {
			String cont = incident.replace("<return>", "").replace("</return>","").trim();
			return newIncident.contains(cont);
		}
		if (newIncident.contains("return")) {
			String cont = newIncident.replace("<return>", "").replace("</return>","").trim();
			return incident.contains(cont);
		}
		return false;
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
		return s.trim();
	}
}

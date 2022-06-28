package qualitypatternmodel.xmlservlettests;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.servlets.Util;
import qualitypatternmodel.xmlservlettests.ServletTestsUtil;

public class SchemaValidationServletTest {
	
	String localName = "test_db_1";
	String localName2 = "test_db_2";

	String patternName = "card_concrete_finalized";
	
	@Before
	public void before() throws IOException, InvalidityException, JSONException {
		ServletTestsUtil.registerDatabase(localName, "demo_database", "localhost", "1984", "admin", "admin");
		ServletTestsUtil.registerDatabase(localName2, "ddb_20190606", "localhost", "1984", "admin", "admin");
		
	}
	
	
	@Test
	public void doGetTestPositive() throws IOException {	
		ServletTestsUtil.setDatabase(localName, patternName);
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.SCHEMA_VALIDATION_ENDPOINT + patternName).openConnection();
		connection.setRequestMethod("GET");
		
		int responseCode = connection.getResponseCode();	
		assertTrue(responseCode >= 200 && responseCode < 300);
	
	}
	
	@Test
	public void doGetTestNegative() throws IOException, JSONException {	
		ServletTestsUtil.setDatabase(localName2, patternName);
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.SCHEMA_VALIDATION_ENDPOINT + patternName).openConnection();
		connection.setRequestMethod("GET");
		
		int responseCode = connection.getResponseCode();		
		assertTrue(responseCode >= 200 && responseCode < 300);
		
		String result = ServletTestsUtil.getResult(connection);		
		JSONArray array = new JSONArray(result);
		assertTrue(array.length() == 2);
		assertTrue(array.getJSONObject(0).get("URL").equals("/concrete-patterns/parameter/card_concrete_finalized/0")); 
		assertTrue(array.getJSONObject(1).get("URL").equals("/concrete-patterns/parameter/card_concrete_finalized/5")); 
			
	}
	
	@After
	public void after() throws IOException, JSONException {		
		ServletTestsUtil.deleteDatabase(localName);	
		ServletTestsUtil.deleteDatabase(localName2);		
	}
	
}

package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.servlets.Util;

public class DatabasesSettingServletTest {
	
	String localName = "test_db_1";
	String localName2 = "test_db_2";
	
	@Before
	public void before() throws IOException, InvalidityException, JSONException {
		ServletTestsUtil.registerDatabase(localName, "ddb_20190606", "localhost", "1984", "admin", "admin");
		ServletTestsUtil.registerDatabase(localName2, "ddb_20190606", "localhost", "1984", "admin", "admin");

	}

	@Test
	public void doPostTest() throws IOException, JSONException {
		String patternName1 = "card_concrete";
		String patternName2 = "comp_concrete";
		
		ServletTestsUtil.setDatabase(localName, patternName1);		
		ServletTestsUtil.setDatabase(localName2, patternName2);		
		
		ServletTestsUtil.deleteDatabase(localName);				
		
		HttpURLConnection connection2 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.DATABASE_GETTING_ENDPOINT + patternName1).openConnection();
		connection2.setRequestMethod("GET");		
		int responseCode2 = connection2.getResponseCode();		
		assertTrue(responseCode2 == 404);		
		
		
		HttpURLConnection connection4 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.DATABASE_GETTING_ENDPOINT + patternName2).openConnection();
		connection4.setRequestMethod("GET");
		int responseCode4 = connection4.getResponseCode();		
		String result4 = ServletTestsUtil.getResult(connection4);		
		ServletTestsUtil.printResult(connection4, responseCode4, result4);		
		assertTrue(responseCode4 >= 200 && responseCode4 < 300);		
		JSONObject obj4 = new JSONObject(result4);
		assertTrue(obj4.get("LocalName").equals(localName2)); 

	}

	@After
	public void after() throws IOException, JSONException {		
		ServletTestsUtil.deleteDatabase(localName2);		
	}
	
	
}

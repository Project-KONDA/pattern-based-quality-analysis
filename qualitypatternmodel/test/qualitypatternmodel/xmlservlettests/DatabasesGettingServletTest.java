package qualitypatternmodel.xmlservlettests;

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
import qualitypatternmodel.xmlservlettests.ServletTestsUtil;

public class DatabasesGettingServletTest {
	
	String localName = "test_db_1";
	
	@Before
	public void before() throws IOException, InvalidityException, JSONException {
		ServletTestsUtil.registerDatabase(localName, "ddb_20190606", "localhost", "1984", "admin", "admin");

	}

	@Test
	public void doPostTest() throws IOException, JSONException {
		String patternName1 = "card_concrete";
		
		ServletTestsUtil.setDatabase(localName, patternName1);				
		
		HttpURLConnection connection4 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.DATABASE_GETTING_ENDPOINT + patternName1).openConnection();
		connection4.setRequestMethod("GET");
		int responseCode4 = connection4.getResponseCode();		
		String result4 = ServletTestsUtil.getResult(connection4);		
		ServletTestsUtil.printResult(connection4, responseCode4, result4);		
		assertTrue(responseCode4 >= 200 && responseCode4 < 300);		
		JSONObject obj4 = new JSONObject(result4);
		assertTrue(obj4.get("LocalName").equals(localName)); 

	}

	@After
	public void after() throws IOException, JSONException {		
		ServletTestsUtil.deleteDatabase(localName);		
	}
	
	
}

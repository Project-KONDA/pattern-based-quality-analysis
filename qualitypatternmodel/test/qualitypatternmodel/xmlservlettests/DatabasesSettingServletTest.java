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
import qualitypatternmodel.utility.XmlServletUtility;

public class DatabasesSettingServletTest {
	
	String localName = "test_db_1";
	String localName2 = "test_db_2";
	
	@Before
	public void before() throws IOException, InvalidityException, JSONException {
		XmlServletUtility.registerDatabase(localName, "ddb_20190606", "localhost", "1984", "admin", "admin");
		XmlServletUtility.registerDatabase(localName2, "ddb_20190606", "localhost", "1984", "admin", "admin");

	}

	@Test
	public void doPostTest() throws IOException, JSONException {
		String patternName1 = "card_concrete";
		String patternName2 = "comp_concrete";
		
		XmlServletUtility.setDatabase(localName, patternName1);		
		XmlServletUtility.setDatabase(localName2, patternName2);		
		
		XmlServletUtility.deleteDatabase(localName);				
		
		HttpURLConnection connection2 = (HttpURLConnection) new URL(XmlServletUtility.PATH_PREFIX + Util.DATABASE_GETTING_ENDPOINT + patternName1).openConnection();
		connection2.setRequestMethod("GET");		
		int responseCode2 = connection2.getResponseCode();		
		assertTrue(responseCode2 == 404);		
		
		
		HttpURLConnection connection4 = (HttpURLConnection) new URL(XmlServletUtility.PATH_PREFIX + Util.DATABASE_GETTING_ENDPOINT + patternName2).openConnection();
		connection4.setRequestMethod("GET");
		int responseCode4 = connection4.getResponseCode();		
		String result4 = XmlServletUtility.getResult(connection4);		
		XmlServletUtility.printResult(connection4, responseCode4, result4);		
		assertTrue(responseCode4 >= 200 && responseCode4 < 300);		
		JSONObject obj4 = new JSONObject(result4);
		assertTrue(obj4.get("LocalName").equals(localName2)); 

	}

	@After
	public void after() throws IOException, JSONException {		
		XmlServletUtility.deleteDatabase(localName2);		
	}
	
	
}

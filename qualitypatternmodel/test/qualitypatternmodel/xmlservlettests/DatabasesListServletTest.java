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

public class DatabasesListServletTest {
	
	String localName = "test_db_1";
	
	@Before
	public void before() throws IOException, InvalidityException, JSONException {
		ServletTestsUtil.registerDatabase(localName, "ddb_20190606", "localhost", "1984", "admin", "admin");
	}

	@Test
	public void doGetTest() throws IOException, JSONException {
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.DATABASES_LIST_ENDPOINT).openConnection();
		connection.setRequestMethod("GET");
		
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);
		
		String result = ServletTestsUtil.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);		
		
		JSONArray array = new JSONArray(result);
		assertTrue(array.getJSONObject(0).get("Host").equals("localhost"));     	 	     

	}
	
	@After
	public void after() throws IOException, JSONException {		
		ServletTestsUtil.deleteDatabase(localName);		
	}
	
	
}

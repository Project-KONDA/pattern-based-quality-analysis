package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.impl.ServerXmlDataDatabaseImpl;
import qualitypatternmodel.servlets.Util;
import qualitypatternmodel.utility.Constants;

public class DatabasesSettingServletTest {
	
	String localName = "test_db_1";
	
	@Before
	public void before() throws IOException, InvalidityException {
		ServletTestsUtil.registerDatabase(localName, "ddb_20190606", "localhost", "1984", "admin", "admin");
	}

	@Test
	public void doPostTest() throws IOException, JSONException {
		String patternName = "card_concrete";
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.DATABASE_SETTING_ENDPOINT + localName + "/" + patternName).openConnection();
		connection.setRequestMethod("POST");
		
		int responseCode = connection.getResponseCode();
		System.out.println(responseCode);
		
		String result = ServletTestsUtil.getResult(connection);		
		ServletTestsUtil.printResult(connection, responseCode, result);
		
		assertTrue(responseCode >= 200 && responseCode < 300);
		
				
		
//		JSONArray array = new JSONArray(result);
//		assertTrue(array.getJSONObject(0).get("Host").equals("localhost"));     	 	     

	}
	
	@After
	public void after() throws IOException {		
		ServletTestsUtil.deleteDatabase(localName);		
	}
	
	
}

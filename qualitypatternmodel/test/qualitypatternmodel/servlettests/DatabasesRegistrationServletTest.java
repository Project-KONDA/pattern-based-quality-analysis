package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.impl.ServerXmlDataDatabaseImpl;
import qualitypatternmodel.servlets.Util;
import qualitypatternmodel.utility.Constants;

public class DatabasesRegistrationServletTest {
	String localName = "test_db";
	

	@Test
	public void doPostTest() throws IOException, JSONException {
		ServletTestsUtil.registerDatabase(localName, "ddb_20190606", "localhost", "1984", "admin", "admin");
		
		HttpURLConnection connection2 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.DATABASES_LIST_ENDPOINT).openConnection();
		connection2.setRequestMethod("GET");
		
		int responseCode2 = connection2.getResponseCode();
		assertTrue(responseCode2 >= 200 && responseCode2 < 300);
		
		String result2 = ServletTestsUtil.getResult(connection2);		
		ServletTestsUtil.printResult(connection2, responseCode2, result2);		
		
		JSONArray array = new JSONArray(result2);
		assertTrue(array.getJSONObject(0).get("Host").equals("localhost"));   
		assertTrue(array.length() == 1);

	}
	
	@After
	public void after() throws IOException {		
		ServletTestsUtil.deleteDatabase(localName);		
	}
	
	
}

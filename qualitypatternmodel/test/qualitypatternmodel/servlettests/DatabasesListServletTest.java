package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;

import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.impl.ServerXmlDataDatabaseImpl;
import qualitypatternmodel.servlets.Util;
import qualitypatternmodel.utility.Constants;

public class DatabasesListServletTest {
	
	ServerXmlDataDatabase db;
	
	@Before
	public void before() throws IOException {
		db = new ServerXmlDataDatabaseImpl("test_db_2", "localhost", 1984, "ddb_20190606", "admin", "admin");

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
	
	
}

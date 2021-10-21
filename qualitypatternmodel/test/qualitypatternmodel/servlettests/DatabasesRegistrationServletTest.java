package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;

import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.impl.ServerXmlDataDatabaseImpl;
import qualitypatternmodel.servlets.Util;
import qualitypatternmodel.utility.Constants;

public class DatabasesRegistrationServletTest {
	
	

	@Test
	public void doPostTest() throws IOException, JSONException {
		String name = "ddb_20190606";

		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.DATABASE_REGISTRATION_ENDPOINT + name).openConnection();
		connection.setRequestMethod("POST");
		
		String hostEncoded = URLEncoder.encode("localhost");
		String parameters = "host=" + hostEncoded;
		String portEncoded = URLEncoder.encode("1984");
		parameters += "&port=" + portEncoded;
		String userEncoded = URLEncoder.encode("admin");
		parameters += "&user=" + userEncoded;
		String passwordEncoded = URLEncoder.encode("admin");
		parameters += "&password=" + passwordEncoded;
		
		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
	    wr.write(parameters);
	    wr.flush();
		
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);	
		
		String result = ServletTestsUtil.getResult(connection);		
		ServletTestsUtil.printResult(connection, responseCode, result);	
		
		
		
		HttpURLConnection connection2 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.DATABASES_LIST_ENDPOINT).openConnection();
		connection2.setRequestMethod("GET");
		
		int responseCode2 = connection2.getResponseCode();
		assertTrue(responseCode2 >= 200 && responseCode2 < 300);
		
		String result2 = ServletTestsUtil.getResult(connection2);		
		ServletTestsUtil.printResult(connection2, responseCode2, result2);		
		
//		JSONArray array = new JSONArray(result);
//		assertTrue(array.getJSONObject(0).get("Host").equals("1984"));   

	}
	
	
}

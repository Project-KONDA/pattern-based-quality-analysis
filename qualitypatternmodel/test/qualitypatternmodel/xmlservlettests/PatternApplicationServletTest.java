package qualitypatternmodel.xmlservlettests;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.servlets.Util;
import qualitypatternmodel.utility.XmlServletUtility;

public class PatternApplicationServletTest {
	
	String localName = "test_db_1";
	String patternName = "card_concrete_finalized";
	
	@Before
	public void before() throws IOException, InvalidityException, JSONException {
		XmlServletUtility.registerDatabase(localName, "demo_database", "localhost", "1984", "admin", "admin");		
		XmlServletUtility.setDatabase(localName, patternName);
	}	
	
	@Test
	public void doGetTest() throws IOException, JSONException {
		HttpURLConnection connection = (HttpURLConnection) new URL(XmlServletUtility.PATH_PREFIX + Util.APPLICATION_ENDPOINT).openConnection();
		connection.setRequestMethod("POST");
		
		String patternNameEncoded = URLEncoder.encode(patternName, "UTF-8");
		String parameters = "pattern-names=" + patternNameEncoded;
		
		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
	    wr.write(parameters);
	    wr.flush();
		
		int responseCode = connection.getResponseCode();	
		assertTrue(responseCode >= 200 && responseCode < 300);

		String result = XmlServletUtility.getResult(connection);		
		XmlServletUtility.printResult(connection, responseCode, result);
		
		JSONArray array = new JSONArray(result);
		assertTrue(array.length() == 1);
		JSONObject first = array.getJSONObject(0);
		assertTrue(first.get("Pattern").equals(patternName));
		Object results = first.get("Results");
		assertTrue(results instanceof JSONArray);
		JSONArray resultsArray = (JSONArray) results;
		assertTrue(resultsArray.length() == 1);
		assertTrue(resultsArray.getString(0).contains("<demo:artist xmlns:demo=\"demo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" demo:id=\"402\">"));
		assertTrue(first.get("Count").equals("1"));
		assertTrue(first.has("Runtime"));
			
	}
	
	@After
	public void after() throws IOException, JSONException {		
		XmlServletUtility.deleteDatabase(localName);	
	}
	
	
	
}

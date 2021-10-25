package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.servlets.Util;

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
	public void doPostTestPositive() throws IOException {	
		ServletTestsUtil.setDatabase(localName, patternName);
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.SCHEMA_VALIDATION_ENDPOINT + patternName).openConnection();
		connection.setRequestMethod("POST");
		
		int responseCode = connection.getResponseCode();		
		assertTrue(responseCode >= 200 && responseCode < 300);
	
	}
	
	@Test
	public void doPostTestNegative() throws IOException {	
		ServletTestsUtil.setDatabase(localName2, patternName);
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.SCHEMA_VALIDATION_ENDPOINT + patternName).openConnection();
		connection.setRequestMethod("POST");
		
		int responseCode = connection.getResponseCode();		
		assertFalse(responseCode >= 200 && responseCode < 300);
	
	}
	
	@After
	public void after() throws IOException, JSONException {		
		ServletTestsUtil.deleteDatabase(localName);	
		ServletTestsUtil.deleteDatabase(localName2);		
	}
	
}

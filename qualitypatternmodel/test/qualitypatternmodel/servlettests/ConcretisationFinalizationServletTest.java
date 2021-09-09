package qualitypatternmodel.servlettests;

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
import org.junit.Test;

import qualitypatternmodel.servlets.Util;

public class ConcretisationFinalizationServletTest {
	
	private static final String CONCRETE_PATTERN_NAME = "finalization_test";
	
	@Test
	public void doPostTest() throws IOException {
		String patternName = "card_concrete";
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETISATION_FINALIZATION_ENDPOINT + patternName).openConnection();
		connection.setRequestMethod("POST");
		
		int responseCode = connection.getResponseCode();		
		assertTrue(responseCode >= 200 && responseCode < 300);

//		String result = ServletTestsUtil.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);
		
		HttpURLConnection connection2 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.QUERY_ENDPOINT + patternName).openConnection();
		connection2.setRequestMethod("GET");
		
		int responseCode2 = connection2.getResponseCode();
		assertTrue(responseCode2 >= 200 && responseCode2 < 300);	
	}
	
	
	@Test
	public void doPostTestWithPreviousInstantiationAndConcretisation() throws IOException, JSONException {
		ServletTestsUtil.createConcretePattern("card_abstract", "flexible", CONCRETE_PATTERN_NAME);			
		ServletTestsUtil.setParameter(CONCRETE_PATTERN_NAME, "0", "example0", "Text");  
		ServletTestsUtil.setParameter(CONCRETE_PATTERN_NAME, "5", "example5", "Text");
	    
		
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETISATION_FINALIZATION_ENDPOINT + CONCRETE_PATTERN_NAME).openConnection();
		connection.setRequestMethod("POST");
		
		int responseCode = connection.getResponseCode();		
//		System.out.println(responseCode);
		assertTrue(responseCode >= 200 && responseCode < 300);

		
		HttpURLConnection connection2 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.QUERY_ENDPOINT + CONCRETE_PATTERN_NAME).openConnection();
		connection2.setRequestMethod("GET");
		
		int responseCode2 = connection2.getResponseCode();
		assertTrue(responseCode2 >= 200 && responseCode2 < 300);
		
	}
}

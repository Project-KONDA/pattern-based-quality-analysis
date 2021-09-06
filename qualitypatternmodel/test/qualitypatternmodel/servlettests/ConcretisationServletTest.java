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

public class ConcretisationServletTest {
	
	private static final String CONCRETE_PATTERN_NAME = "test";

	@Test
	public void doPostTest() throws IOException {
		String patternAndParam = "card_concrete/8";
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETISATION_ENDPOINT + patternAndParam).openConnection();
		connection.setRequestMethod("POST");
		String value = URLEncoder.encode("TAG");
		String parameters = "value=" + value;
		
		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
	    wr.write(parameters);
	    wr.flush();
		
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);
		
//		String result = ServletTestsUtil.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);		
	
		HttpURLConnection connection2 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETISATION_ENDPOINT + patternAndParam).openConnection();
		connection2.setRequestMethod("GET");		
		
		int responseCode2 = connection2.getResponseCode();
		assertTrue(responseCode2 >= 200 && responseCode2 < 300);
		
		String result2 = ServletTestsUtil.getResult(connection2);			
		assertEquals(value, result2);

	}
	
	@Test
	public void doPostTestUntyped() throws IOException, JSONException {
		createConcretePattern();
		
		String patternAndParam = CONCRETE_PATTERN_NAME + "/5";
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETISATION_ENDPOINT + patternAndParam).openConnection();
		connection.setRequestMethod("POST");
		String value = URLEncoder.encode("example");
		String parameters = "value=" + value;
		String type = URLEncoder.encode("Text");
		parameters += "&type=" + type;
		
		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
	    wr.write(parameters);
	    wr.flush();
		
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		String result = ServletTestsUtil.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);		
	
		HttpURLConnection connection2 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETISATION_ENDPOINT + patternAndParam).openConnection();
		connection2.setRequestMethod("GET");		
		
		int responseCode2 = connection2.getResponseCode();
		assertTrue(responseCode2 >= 200 && responseCode2 < 300);
		
		String result2 = ServletTestsUtil.getResult(connection2);			
		assertEquals(value, result2);		
		
		HttpURLConnection connection3 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETE_PATTERN_TEXT_ENDPOINT + CONCRETE_PATTERN_NAME + "/flexible").openConnection();
		connection3.setRequestMethod("GET");
				
		int responseCode3 = connection3.getResponseCode();
		assertTrue(responseCode3 >= 200 && responseCode3 < 300);
		
		String result3 = ServletTestsUtil.getResult(connection3);
		System.out.println(result3);
		assertTrue(result3.contains("\"URL\": \"/concrete-patterns/parameter/" + patternAndParam + "\", \"Type\": \"" + type + "\", \"Value\": \"" + value + "\""));
		

	}

	private void createConcretePattern() throws IOException, MalformedURLException, ProtocolException, JSONException {
		String abstractPatternName = "card_abstract";
		String textName = "flexible";
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.INSTANTIATION_ENDPOINT + abstractPatternName + "/" + textName).openConnection();
		connection.setRequestMethod("POST");
		
		String parameters = "name=" + URLEncoder.encode(CONCRETE_PATTERN_NAME);
		
		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
	    wr.write(parameters);
	    wr.flush();
		
		int responseCode = connection.getResponseCode();
//		System.out.println(responseCode);
//		System.out.println(ServletTestsUtil.getResult(connection));
		assertTrue(responseCode >= 200 && responseCode < 300);
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HttpURLConnection connection2 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETE_PATTERN_LIST_ENDPOINT).openConnection();
		connection2.setRequestMethod("GET");
		
		int responseCode2 = connection2.getResponseCode();
		assertTrue(responseCode2 >= 200 && responseCode < 300);
		
		String result2 = ServletTestsUtil.getResult(connection2);		
		
		JSONArray array = new JSONArray(result2);
		List<String> list = ServletTestsUtil.JSONArrayToList(array);
		
		assertTrue(list.contains(CONCRETE_PATTERN_NAME));
	}
}

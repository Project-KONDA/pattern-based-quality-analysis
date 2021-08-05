package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;

import qualitypatternmodel.servlets.Util;

public class ConcretePatternDeletionServletTest {
	
	private static final String PATTERN_NAME = "deletion_test";
	
	@Before
	public void createPattern() throws IOException {
		String abstractPatternName = "card_abstract";
		String textName = "test_text";
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.INSTANTIATION_ENDPOINT +  abstractPatternName + "/" + textName).openConnection();
		connection.setRequestMethod("POST");
		
		String parameters = "name=" + URLEncoder.encode(PATTERN_NAME);
		
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
	}

	@Test
	public void doDeleteTest() throws IOException, JSONException {		
		
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETE_PATTERN_DELETION_ENDPOINT + PATTERN_NAME).openConnection();
		connection.setRequestMethod("DELETE");
		
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);
		
//		String result = ServletTestsUtil.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);
		
		HttpURLConnection connection2 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETE_PATTERN_LIST_ENDPOINT).openConnection();
		connection2.setRequestMethod("GET");
		
		int responseCode2 = connection2.getResponseCode();
		assertTrue(responseCode2 >= 200 && responseCode < 300);
		
		String result2 = ServletTestsUtil.getResult(connection2);		

		JSONArray array = new JSONArray(result2);
		List<String> list = ServletTestsUtil.JSONArrayToList(array);
		
		assertFalse(list.contains(PATTERN_NAME));
		

	}
}

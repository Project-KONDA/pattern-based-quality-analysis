package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Test;

import qualitypatternmodel.servlets.Util;

public class PatternTextListServletTest {
	
	@Test
	public void doGetTest() throws IOException, JSONException {
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.PATTERN_TEXT_LIST_ENDPOINT + "card_concrete").openConnection();
		connection.setRequestMethod("GET");
				
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);
		
		String result = ServletTestsUtil.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);		
			
		JSONArray array = new JSONArray(result);
		List<String> list = ServletTestsUtil.JSONArrayToList(array);
		
		assertTrue(list.contains("test_text"));

	}
	
}

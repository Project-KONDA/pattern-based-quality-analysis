package qualitypatternmodel.xmlservlettests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Test;

import qualitypatternmodel.servlets.Util;
import qualitypatternmodel.xmlservlettests.ServletTestsUtil;

public class ConcretePatternDeletionServletTest {

	@Test
	public void doDeleteTest() throws IOException, JSONException {		
		String concretePatternName = "deletion_test";
		ServletTestsUtil.createConcretePattern("card_abstract", "flexible", concretePatternName);
		
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETE_PATTERN_DELETION_ENDPOINT + concretePatternName).openConnection();
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
		
		assertFalse(list.contains(concretePatternName));
		

	}
}

package qualitypatternmodel.xmlservlettests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Test;

import qualitypatternmodel.servlets.Util;

public class ConcretePatternListServletTest {

	@Test
	public void doGetTest() throws IOException, JSONException {
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETE_PATTERN_LIST_ENDPOINT).openConnection();
		connection.setRequestMethod("GET");
		
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);
		
		String result = ServletTestsUtil.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);
		
		JSONArray array = new JSONArray(result);
		assertTrue(array.getJSONObject(0).get("Name").equals("card_concrete"));

	}
}
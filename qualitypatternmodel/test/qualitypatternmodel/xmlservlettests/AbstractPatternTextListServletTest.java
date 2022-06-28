package qualitypatternmodel.xmlservlettests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Test;

import qualitypatternmodel.servlets.Util;
import qualitypatternmodel.xmlservlettests.ServletTestsUtil;

public class AbstractPatternTextListServletTest {
	
	@Test
	public void doGetTest() throws IOException, JSONException {
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.ABSTRACT_PATTERN_TEXT_LIST_ENDPOINT + "card_abstract").openConnection();
		connection.setRequestMethod("GET");
				
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);
		
		String result = ServletTestsUtil.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);	
		
		JSONArray array = new JSONArray(result);		
		assertTrue(array.getJSONObject(0).get("PatternTextName").equals("flexible"));

	}
	
}

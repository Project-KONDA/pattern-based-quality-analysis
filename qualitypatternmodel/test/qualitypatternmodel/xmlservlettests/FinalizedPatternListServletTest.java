package qualitypatternmodel.xmlservlettests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
//import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Test;

import qualitypatternmodel.servlets.Util;
import qualitypatternmodel.utility.XmlServletUtility;

public class FinalizedPatternListServletTest {

	@Test
	public void doGetTest() throws IOException, JSONException {
		HttpURLConnection connection = (HttpURLConnection) new URL(XmlServletUtility.PATH_PREFIX + Util.FINALIZED_PATTERN_LIST_ENDPOINT).openConnection();
		connection.setRequestMethod("GET");
		
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);
		
		String result = XmlServletUtility.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);
		
		JSONArray array = new JSONArray(result);
//		List<String> list = ServletTestsUtil.JSONArrayToList(array); 
		
		assertTrue(array.getJSONObject(0).get("Name").equals("card_concrete_finalized"));		

	}
}

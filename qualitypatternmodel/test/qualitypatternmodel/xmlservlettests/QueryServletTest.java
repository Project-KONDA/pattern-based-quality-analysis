package qualitypatternmodel.xmlservlettests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.Test;

import qualitypatternmodel.servlets.Util;

public class QueryServletTest {
	
	@Test
	public void doGetTest() throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.QUERY_ENDPOINT + "card_concrete_finalized").openConnection();
		connection.setRequestMethod("GET");
		
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);
		
//		String result = ServletTestsUtil.getResult(connection);		
		ServletTestsUtil.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);
		

	}
}

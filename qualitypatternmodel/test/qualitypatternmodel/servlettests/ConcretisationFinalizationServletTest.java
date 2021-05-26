package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.junit.Test;

public class ConcretisationFinalizationServletTest {
	
	@Test
	public void doPostTest() throws IOException {
		String patternName = "card_concrete";
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + "/concrete-patterns/finalization/" + patternName).openConnection();
		connection.setRequestMethod("POST");
		
		int responseCode = connection.getResponseCode();		
		assertTrue(responseCode >= 200 && responseCode < 300);

//		String result = ServletTestsUtil.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);
		
		HttpURLConnection connection2 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + "/concrete-patterns/query/" + patternName).openConnection();
		connection2.setRequestMethod("GET");
		
		int responseCode2 = connection2.getResponseCode();
		assertTrue(responseCode2 >= 200 && responseCode2 < 300);	

	}
}

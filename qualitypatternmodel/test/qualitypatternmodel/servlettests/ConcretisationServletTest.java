package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.junit.Test;

public class ConcretisationServletTest {
	
	@Test
	public void doPostTest() throws IOException {
		String patternAndParam = "card_concrete/8";
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + "/concrete-patterns/parameter/" + patternAndParam).openConnection();
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
	
		HttpURLConnection connection2 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + "/concrete-patterns/parameter/" + patternAndParam).openConnection();
		connection2.setRequestMethod("GET");		
		
		int responseCode2 = connection2.getResponseCode();
		assertTrue(responseCode2 >= 200 && responseCode2 < 300);
		
		String result2 = ServletTestsUtil.getResult(connection2);			
		assertEquals(value, result2);

	}
}

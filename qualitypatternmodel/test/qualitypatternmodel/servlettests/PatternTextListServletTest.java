package qualitypatternmodel.servlettests;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class PatternTextListServletTest {
	
	public static void main(String[] args) throws IOException {
		doGetTest();
	}

	public static void doGetTest() throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8081/qualitypatternmodel/concrete-patterns/text-list/card_concrete").openConnection();
		connection.setRequestMethod("GET");
				
		int responseCode = connection.getResponseCode();
		
		String result = ServletTestsUtil.getResult(connection);		
		ServletTestsUtil.printResult(connection, responseCode, result);

	}
	
}

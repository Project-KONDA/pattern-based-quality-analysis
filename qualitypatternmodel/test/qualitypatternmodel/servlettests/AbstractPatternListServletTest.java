package qualitypatternmodel.servlettests;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class AbstractPatternListServletTest {
	public static void main(String[] args) throws IOException {
		doGetTest();
	}

	public static void doGetTest() throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8081/qualitypatternmodel/abstract-patterns").openConnection();
		connection.setRequestMethod("GET");
		
		int responseCode = connection.getResponseCode();
		
		ServletTestsUtil.printResult(connection, responseCode);

	}
}

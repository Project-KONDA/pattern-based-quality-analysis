package qualitypatternmodel.servlettests;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class ConcretisationFinalizationServletTest {
	public static void main(String[] args) throws IOException {
		doPostTest();
	}

	public static void doPostTest() throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8081/qualitypatternmodel/concrete-patterns/finalization/card_concrete").openConnection();
		connection.setRequestMethod("POST");
		
		int responseCode = connection.getResponseCode();
		
		String result = ServletTestsUtil.getResult(connection);		
		ServletTestsUtil.printResult(connection, responseCode, result);

	}
}

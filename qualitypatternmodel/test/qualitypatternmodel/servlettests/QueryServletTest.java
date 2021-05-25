package qualitypatternmodel.servlettests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class QueryServletTest {
	public static void main(String[] args) throws IOException {
		doGetTest();
	}

	public static void doGetTest() throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8081/qualitypatternmodel/concrete-patterns/query/card_concrete_finalized").openConnection();
		connection.setRequestMethod("GET");
		
		int responseCode = connection.getResponseCode();
		
		ServletTestsUtil.printResult(connection, responseCode);

	}
}

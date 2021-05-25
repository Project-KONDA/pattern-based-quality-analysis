package qualitypatternmodel.servlettests;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class ConcretisationServletTest {
	public static void main(String[] args) throws IOException {
		doPostTest();
	}

	public static void doPostTest() throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8081/qualitypatternmodel/concrete-patterns/parameter/card_concrete/8").openConnection();
		connection.setRequestMethod("POST");
		String parameters = "value=" + URLEncoder.encode("TAG");
		
		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
	    wr.write(parameters);
	    wr.flush();
		
		int responseCode = connection.getResponseCode();
		
		String result = ServletTestsUtil.getResult(connection);		
		ServletTestsUtil.printResult(connection, responseCode, result);
		
	}
	
	public static void doGetTest() throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8081/qualitypatternmodel/concrete-patterns/parameter/card_concrete/8").openConnection();
		connection.setRequestMethod("GET");		
		
		int responseCode = connection.getResponseCode();
		
		String result = ServletTestsUtil.getResult(connection);		
		ServletTestsUtil.printResult(connection, responseCode, result);

	}
}

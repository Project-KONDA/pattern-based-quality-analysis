package qualitypatternmodel.servlettests;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class AbstractPatternInstantiationServletTest {
	
	public static void main(String[] args) throws IOException {
		doPostTest();
	}

	public static void doPostTest() throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8081/qualitypatternmodel/abstract-patterns/instantiation/card_abstract").openConnection();
		connection.setRequestMethod("POST");
		
		String parameters = "name=" + URLEncoder.encode("test_card");
//		System.out.println(parameters);
		
		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
	    wr.write(parameters);
	    wr.flush();
		
		int responseCode = connection.getResponseCode();
		
		ServletTestsUtil.printResult(connection, responseCode);

	}
	
}

package qualitypatternmodel.servlettests;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class AbstractPatternInstantiationServletTest {
	
	public static void main(String[] args) throws IOException {
		String patternName = "test_card";
		doPostTest(patternName);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConcretePatternListServletTest.doGetTest();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConcretePatternDeletionServletTest.doDeleteTest(patternName);
	}

	public static void doPostTest(String concretePatternName) throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8081/qualitypatternmodel/abstract-patterns/instantiation/card_abstract").openConnection();
		connection.setRequestMethod("POST");
		
		String parameters = "name=" + URLEncoder.encode(concretePatternName);
//		System.out.println(parameters);
		
		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
	    wr.write(parameters);
	    wr.flush();
		
		int responseCode = connection.getResponseCode();
		
		ServletTestsUtil.printResult(connection, responseCode);	
		

	}
	
}

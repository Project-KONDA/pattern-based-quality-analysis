package qualitypatternmodel.servlettests;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class ConcretePatternDeletionServletTest {
	public static void main(String[] args) throws IOException {
		String patternName = "deletion_test";
		AbstractPatternInstantiationServletTest.doPostTest(patternName);
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
		doDeleteTest(patternName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConcretePatternListServletTest.doGetTest();
	}

	public static void doDeleteTest(String concretePatternName) throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8081/qualitypatternmodel/concrete-patterns/deletion/" + concretePatternName).openConnection();
		connection.setRequestMethod("DELETE");
		
		int responseCode = connection.getResponseCode();
		
		ServletTestsUtil.printResult(connection, responseCode);

	}
}

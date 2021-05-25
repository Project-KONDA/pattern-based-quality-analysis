package qualitypatternmodel.servlettests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Scanner;

public class ServletTestsUtil {

	static void printResult(HttpURLConnection connection, int responseCode) throws IOException {		
		System.out.println("Response code: " + responseCode);			
		System.out.println("Result: " + getResult(connection));		
	}

	private static String getResult(HttpURLConnection connection) throws IOException {
		String response = "";
		Scanner scanner = new Scanner(connection.getInputStream());
		while(scanner.hasNextLine()){
			response += scanner.nextLine();
			response += "\n";
		}
		scanner.close();
		return response;
	}

}

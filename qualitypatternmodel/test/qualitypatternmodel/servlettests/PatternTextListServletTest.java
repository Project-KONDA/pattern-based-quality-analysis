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
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8081/qualitypatternmodel/concrete-patterns/text-list/test_card").openConnection();
		connection.setRequestMethod("GET");
				
		int responseCode = connection.getResponseCode();
		
		if(responseCode == 200){
			System.out.println("GET was successful.");
			
			String response = "";
			Scanner scanner = new Scanner(connection.getInputStream());
			while(scanner.hasNextLine()){
				response += scanner.nextLine();
				response += "\n";
			}
			scanner.close();

			System.out.println("Result: " + response);
			
		} else if(responseCode == 401){
			System.out.println("Wrong password.");
		} else {
			System.out.println("Failed: " + responseCode);
			
			String response = "";
			Scanner scanner = new Scanner(connection.getInputStream());
			while(scanner.hasNextLine()){
				response += scanner.nextLine();
				response += "\n";
			}
			scanner.close();

			System.out.println("Result: " + response);
		}


	}
	
}

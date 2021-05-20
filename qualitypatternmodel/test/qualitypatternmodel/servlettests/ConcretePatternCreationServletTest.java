package qualitypatternmodel.servlettests;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class ConcretePatternCreationServletTest {
	
	public static void main(String[] args) throws IOException {
		doPostTest();
	}

	public static void doPostTest() throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8081/qualitypatternmodel/abstract-patterns/card_abstract").openConnection();
		connection.setRequestMethod("POST");
		String parameters = "name=" + URLEncoder.encode("test_card");
		System.out.println(parameters);
		
		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
	    wr.write(parameters);
	    wr.flush();
		
		int responseCode = connection.getResponseCode();
		
		if(responseCode == 200){
			System.out.println("POST was successful.");
			
			String response = "";
			Scanner scanner = new Scanner(connection.getInputStream());
			while(scanner.hasNextLine()){
				response += scanner.nextLine();
				response += "\n";
			}
			scanner.close();

			System.out.println("Result: " + response);
			
		}
		else if(responseCode == 401){
			System.out.println("Wrong password.");
		}


	}
	
}

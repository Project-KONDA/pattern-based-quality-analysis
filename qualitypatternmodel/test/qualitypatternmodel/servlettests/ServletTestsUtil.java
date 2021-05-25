package qualitypatternmodel.servlettests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;

public class ServletTestsUtil {

	static void printResult(HttpURLConnection connection, int responseCode, String result) throws IOException {		
		System.out.println("Response code: " + responseCode);			
		System.out.println("Result: " +result);		
	}

	static String getResult(HttpURLConnection connection) throws IOException {
		String response = "";
		Scanner scanner = new Scanner(connection.getInputStream());
		while(scanner.hasNextLine()){
			response += scanner.nextLine();
			response += "\n";
		}
		response = response.substring(0, response.length()-1);
		scanner.close();
		return response;
	}
	
	static ArrayList<String> JSONArrayToList(JSONArray jsonArray) {
		ArrayList<String> list = new ArrayList<String>();     
		if (jsonArray != null) { 
		   int len = jsonArray.size();
		   for (int i=0;i<len;i++){ 
		    list.add(jsonArray.get(i).toString());
		   } 
		}
		return list;
	}

}

package qualitypatternmodel.servlettests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;


public class ServletTestsUtil {
	static final String PATH_PREFIX = "http://localhost:8081";

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
	
	static ArrayList<String> JSONArrayToList(JSONArray jsonArray) throws JSONException {
		ArrayList<String> list = new ArrayList<String>();     
		if (jsonArray != null) { 
		   int len = jsonArray.length();
		   for (int i=0;i<len;i++){ 
		    list.add(jsonArray.get(i).toString());
		   } 
		}
		return list;
	}

}

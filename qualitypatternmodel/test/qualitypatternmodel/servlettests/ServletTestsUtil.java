package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;

import qualitypatternmodel.servlets.Util;


public class ServletTestsUtil {
	public static final String PATH_PREFIX = "http://localhost:8081";

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

	static void createConcretePattern(String abstractPatternName, String textName, String concretePatternName) throws IOException, MalformedURLException, ProtocolException, JSONException {
			
			HttpURLConnection connection = (HttpURLConnection) new URL(PATH_PREFIX + Util.INSTANTIATION_ENDPOINT + abstractPatternName + "/" + textName).openConnection();
			connection.setRequestMethod("POST");
			
			String parameters = "name=" + URLEncoder.encode(concretePatternName);
			
			connection.setDoOutput(true);
		    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
		    wr.write(parameters);
		    wr.flush();
			
			int responseCode = connection.getResponseCode();
	//		System.out.println(responseCode);
			assertTrue(responseCode >= 200 && responseCode < 300);
			
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			HttpURLConnection connection2 = (HttpURLConnection) new URL(PATH_PREFIX + Util.CONCRETE_PATTERN_LIST_ENDPOINT).openConnection();
			connection2.setRequestMethod("GET");
			
			int responseCode2 = connection2.getResponseCode();
			assertTrue(responseCode2 >= 200 && responseCode < 300);
			
			String result2 = getResult(connection2);		
			
			JSONArray array = new JSONArray(result2);
			List<String> list = JSONArrayToList(array);
			
			assertTrue(list.contains(concretePatternName));
		}

	public static void setParameter(String concretePatternName, String parameterId, String value, String type) throws IOException, MalformedURLException, ProtocolException {
		String patternAndParam = concretePatternName + "/" + parameterId;
		HttpURLConnection connection = (HttpURLConnection) new URL(PATH_PREFIX + Util.CONCRETISATION_ENDPOINT + patternAndParam).openConnection();
		connection.setRequestMethod("POST");
		String valueEncoded = URLEncoder.encode(value);
		String parameters = "value=" + valueEncoded;
		
		String typeEncoded = ".*";
		if(type != null) {
			typeEncoded = URLEncoder.encode(type);
			parameters += "&type=" + typeEncoded;
		}
		
		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
	    wr.write(parameters);
	    wr.flush();
	    
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		HttpURLConnection connection2 = (HttpURLConnection) new URL(PATH_PREFIX + Util.CONCRETISATION_ENDPOINT + patternAndParam).openConnection();
		connection2.setRequestMethod("GET");		
		
		int responseCode2 = connection2.getResponseCode();
		assertTrue(responseCode2 >= 200 && responseCode2 < 300);
		
		String result2 = getResult(connection2);			
		assertEquals(value, result2);		
		
		HttpURLConnection connection3 = (HttpURLConnection) new URL(PATH_PREFIX + Util.CONCRETE_PATTERN_TEXT_ENDPOINT + concretePatternName + "/flexible").openConnection();
		connection3.setRequestMethod("GET");
				
		int responseCode3 = connection3.getResponseCode();
		assertTrue(responseCode3 >= 200 && responseCode3 < 300);
		
		String result3 = getResult(connection3);
		
		if(type != null) {
			assertTrue(result3.contains("\"URL\": \"/concrete-patterns/parameter/" + patternAndParam + "\", \"Type\": \"" + type + "\", \"Value\": \"" + value + "\""));
		} else {
			String[] split = result3.split("\"URL\": \"/concrete-patterns/parameter/" + patternAndParam)[1].split("}");			
			assertTrue(split[0].contains("\"Value\": \"" + valueEncoded + "\""));
		}
	}

}

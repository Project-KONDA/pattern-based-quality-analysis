package qualitypatternmodel.utility;

import static org.junit.Assert.assertFalse;
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
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import qualitypatternmodel.servlets.Util;


public class XmlServletUtility {
	public static final String PATH_PREFIX = "http://localhost:8081";

	public static void printResult(HttpURLConnection connection, int responseCode, String result) throws IOException {		
		System.out.println("Response code: " + responseCode);			
		System.out.println("Result: " +result);		
	}

	public static String getResult(HttpURLConnection connection) throws IOException {
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
	
	public static ArrayList<String> JSONArrayToList(JSONArray jsonArray) throws JSONException {
		ArrayList<String> list = new ArrayList<String>();     
		if (jsonArray != null) { 
		   int len = jsonArray.length();
		   for (int i=0;i<len;i++){ 
		    list.add(jsonArray.get(i).toString());
		   } 
		}
		return list;
	}

	public static void createConcretePattern(String abstractPatternName, String textName, String concretePatternName) throws IOException, MalformedURLException, ProtocolException, JSONException {
			
			HttpURLConnection connection = (HttpURLConnection) new URL(PATH_PREFIX + Util.INSTANTIATION_ENDPOINT + abstractPatternName + "/" + textName).openConnection();
			connection.setRequestMethod("POST");
			
			String parameters = "name=" + URLEncoder.encode(concretePatternName, "UTF-8");
			
			connection.setDoOutput(true);
		    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
		    wr.write(parameters);
		    wr.flush();
			
			int responseCode = connection.getResponseCode();
//			System.out.println(responseCode);
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
			boolean contained = false;
			for(int i=0; i < array.length(); i++) {
				contained = contained || array.getJSONObject(i).get("Name").equals(concretePatternName);
			}						
			assertTrue(contained);
		}

	public static void setParameter(String concretePatternName, String parameterId, String value, String type, String role) throws IOException, MalformedURLException, ProtocolException {
		String patternAndParam = concretePatternName + "/" + parameterId;
		HttpURLConnection connection = (HttpURLConnection) new URL(PATH_PREFIX + Util.CONCRETISATION_ENDPOINT + patternAndParam).openConnection();
		connection.setRequestMethod("POST");
		String valueEncoded = URLEncoder.encode(value, "UTF-8");
		String parameters = "value=" + valueEncoded;
		
		String typeEncoded = ".*";
		if(type != null) {
			typeEncoded = URLEncoder.encode(type, "UTF-8");
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
		
		HttpURLConnection connection3 = (HttpURLConnection) new URL(PATH_PREFIX + Util.CONCRETE_PATTERN_TEXT_ENDPOINT + concretePatternName).openConnection();
		connection3.setRequestMethod("GET");
				
		int responseCode3 = connection3.getResponseCode();
		assertTrue(responseCode3 >= 200 && responseCode3 < 300);
		
		String result3 = getResult(connection3);
		System.out.println(result3);
		
		if(type != null) {
			assertTrue(result3.contains("\"URLs\": [\"/concrete-patterns/parameter/" + patternAndParam + "\"], \"Type\": \"" + type + "\", \"Role\": \"" + role + "\", \"Value\": \"" + value + "\""));
		} else {
			String[] split = result3.split("\"URLs\": \\[\"/concrete-patterns/parameter/" + patternAndParam)[1].split("}");			
			assertTrue(split[0].contains("\"Value\": \"" + valueEncoded + "\""));
		}
	}
	
	public static void registerDatabase(String localName, String name, String host, String port, String user, String password) throws IOException, MalformedURLException, ProtocolException, JSONException {
		registerDatabase(localName, name, host, port, user, password, -1);
	}

	public static void registerDatabase(String localName, String name, String host, String port, String user, String password, int size) throws IOException, MalformedURLException, ProtocolException, JSONException {
	
		HttpURLConnection connection = (HttpURLConnection) new URL(PATH_PREFIX + Util.DATABASE_REGISTRATION_ENDPOINT + localName).openConnection();
		connection.setRequestMethod("POST");
		
		String hostEncoded = URLEncoder.encode(host, "UTF-8");
		String parameters = "host=" + hostEncoded;
		String portEncoded = URLEncoder.encode(port, "UTF-8");
		parameters += "&port=" + portEncoded;
		String nameEncoded = URLEncoder.encode(name, "UTF-8");
		parameters += "&name=" + nameEncoded;
		String userEncoded = URLEncoder.encode(user, "UTF-8");
		parameters += "&user=" + userEncoded;
		String passwordEncoded = URLEncoder.encode(password, "UTF-8");
		parameters += "&password=" + passwordEncoded;
		
		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
	    wr.write(parameters);
	    wr.flush();
		
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);	
		
		String result = getResult(connection);		
		printResult(connection, responseCode, result);
		
		checkDatabaseListContains(localName, name, host, port, size); 
		
	}

	public static void checkDatabaseListContains(String localName, String name, String host, String port, int size)
			throws IOException, MalformedURLException, ProtocolException, JSONException {
		HttpURLConnection connection2 = (HttpURLConnection) new URL(XmlServletUtility.PATH_PREFIX + Util.DATABASES_LIST_ENDPOINT).openConnection();
		connection2.setRequestMethod("GET");
		
		int responseCode2 = connection2.getResponseCode();
		assertTrue(responseCode2 >= 200 && responseCode2 < 300);
		
		String result2 = XmlServletUtility.getResult(connection2);		
		XmlServletUtility.printResult(connection2, responseCode2, result2);		
		
		boolean found = false;
		JSONArray array = new JSONArray(result2);
		for(int i=0; i<array.length(); i++) {
			if(array.getJSONObject(i).get("LocalName").equals(localName)){
				found = true;
			}
		}
		assertTrue(found);
		
		if(size > -1) {
			assertTrue(array.length() == size);
		}
	}

	public static void deleteDatabase(String localName) throws IOException, JSONException {
		HttpURLConnection connection = (HttpURLConnection) new URL(XmlServletUtility.PATH_PREFIX + Util.DATABASE_DELETION_ENDPOINT + localName).openConnection();
		connection.setRequestMethod("DELETE");		
		int responseCode = connection.getResponseCode();
		System.out.println(responseCode);
		assertTrue(responseCode >= 200 && responseCode < 300);
		
		checkDatabaseListDoesNotContain(localName);
		
	}

	public static void checkDatabaseListDoesNotContain(String localName)
			throws IOException, MalformedURLException, ProtocolException, JSONException {
		HttpURLConnection connection2 = (HttpURLConnection) new URL(XmlServletUtility.PATH_PREFIX + Util.DATABASES_LIST_ENDPOINT).openConnection();
		connection2.setRequestMethod("GET");
		
		int responseCode2 = connection2.getResponseCode();
		assertTrue(responseCode2 >= 200 && responseCode2 < 300);
		
		String result2 = XmlServletUtility.getResult(connection2);		
		XmlServletUtility.printResult(connection2, responseCode2, result2);		
		
		JSONArray array = new JSONArray(result2);
		
		for(int i=0; i<array.length(); i++) {
			assertFalse(array.getJSONObject(i).get("LocalName").equals(localName));
		}
	}

	public static void setDatabase(String localDbName, String patternName1) throws IOException, MalformedURLException, ProtocolException {
		HttpURLConnection connection = (HttpURLConnection) new URL(PATH_PREFIX + Util.DATABASE_SETTING_ENDPOINT + localDbName + "/" + patternName1).openConnection();
		connection.setRequestMethod("POST");
		
		int responseCode = connection.getResponseCode();
		System.out.println(responseCode);
		
		String result = getResult(connection);		
		printResult(connection, responseCode, result);
		
		assertTrue(responseCode >= 200 && responseCode < 300);
	}

}

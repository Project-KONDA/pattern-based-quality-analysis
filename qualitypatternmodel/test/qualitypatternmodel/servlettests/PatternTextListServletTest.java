package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class PatternTextListServletTest {
	
	@Test
	public void doGetTest() throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8081/qualitypatternmodel/concrete-patterns/text-list/card_concrete").openConnection();
		connection.setRequestMethod("GET");
				
		int responseCode = connection.getResponseCode();
		
		String result = ServletTestsUtil.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);
		
		try {
			JSONParser parser = new JSONParser();			
			Object obj = parser.parse(result);
			JSONArray array = (JSONArray) obj;
			List<String> list = ServletTestsUtil.JSONArrayToList(array);
			
			assertTrue(list.contains("test_text"));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  	  

	}
	
}

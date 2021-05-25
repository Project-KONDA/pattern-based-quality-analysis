package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class AbstractPatternListServletTest {


	@Test
	public void doGetTest() throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8081/qualitypatternmodel/abstract-patterns").openConnection();
		connection.setRequestMethod("GET");
		
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);
		
		String result = ServletTestsUtil.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);		
		
		try {
			JSONParser parser = new JSONParser();			
			Object obj = parser.parse(result);			
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("Patterns");
			List<String> list = ServletTestsUtil.JSONArrayToList(array);
			
			assertTrue(list.contains("card_abstract"));
			assertTrue(list.contains("comp_abstract"));
			assertTrue(list.contains("func_abstract"));				
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  	     

	}
	
	
}

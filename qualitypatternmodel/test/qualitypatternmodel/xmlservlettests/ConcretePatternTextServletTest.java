package qualitypatternmodel.xmlservlettests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Test;

import qualitypatternmodel.servlets.Util;
import qualitypatternmodel.xmlservlettests.ServletTestsUtil;

public class ConcretePatternTextServletTest {
	
	@Test
	public void doGetTest() throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETE_PATTERN_TEXT_ENDPOINT + "card_concrete").openConnection();
		connection.setRequestMethod("GET");
				
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);
		
		String result = ServletTestsUtil.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);
		
		try {
			JSONObject jsonObject = new JSONObject(result);			
			File initialFile = new File("patterntext.schema.json");
		    InputStream inputStream = new FileInputStream(initialFile);
			org.json.JSONObject rawSchema = new org.json.JSONObject(new JSONTokener(inputStream));
			Schema schema = SchemaLoader.load(rawSchema);
			schema.validate(jsonObject);           	  
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  	  

	}
	
}

package qualitypatternmodel.servlettests;

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

public class PatternTextServletTest {
	
	@Test
	public void doGetTest() throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8081/qualitypatternmodel/concrete-patterns/text/card_concrete/test_text").openConnection();
		connection.setRequestMethod("GET");
				
		int responseCode = connection.getResponseCode();
		
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

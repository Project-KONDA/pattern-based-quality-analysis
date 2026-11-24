package utility;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import qualitypatternmodel.textrepresentation.ValueMap;
import qualitypatternmodel.textrepresentation.impl.ValueMapImpl;


public class ValueMapTests {

	@Test
	public void testMap() throws IOException, JSONException {
		String raw = "{\"\": \"http://www.lido-schema.org\",\"lido\": \"http://www.lido-schema.org\",\"gml\": \"http://www.opengis.net/gml\",\"tei\": \"http://www.tei-c.org/ns/1.0\",\"owl\": \"http://www.w3.org/2002/07/owl#\",\"skos\": \"http://www.w3.org/2004/02/skos/core#\"}";
		ValueMap map = new ValueMapImpl();
		assertDoesNotThrow(() -> map.setValuesFromJSONObject(new JSONObject(raw)));
		
		assertDoesNotThrow(() -> {
			JSONObject out = map.generateJSONObject();
			out.toString().equals(raw);
		});		

		assertDoesNotThrow(() -> {
			map.put("", "else");
			map.generateJSONObject();
		});
		assertDoesNotThrow(() -> {
			map.put("", "else2");
			System.out.println(map.generateJSONObject());
			System.out.println(map.getKeys().size());
		});

		String raw2 = "{\"\": \"http://www.lido-schema.org\",\"lido\": \"http://www.lido-schema.org\",\"gml\": \"http://www.opengis.net/gml\",\"tei\": \"http://www.tei-c.org/ns/1.0\",\"owl\": \"http://www.w3.org/2002/07/owl#\",\"skos\": \"http://www.w3.org/2004/02/skos/core#\"}";
		ValueMap map2 = new ValueMapImpl();
		assertDoesNotThrow(() -> map2.setValuesFromJSONObject(new JSONObject(raw2)));
		
		assertDoesNotThrow(() -> {
			JSONObject out = map2.generateJSONObject();
			out.toString().equals(raw2);
		});
	}

}
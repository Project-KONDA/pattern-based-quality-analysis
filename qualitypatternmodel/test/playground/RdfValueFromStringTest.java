package playground;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.exceptions.InvalidityException;

public class RdfValueFromStringTest {

	public static void main(String[] args) throws JSONException, InvalidityException {
		
//		privateTest();
		successTests();
//		failTests();
	}

	
	public static void privateTest() throws JSONException, InvalidityException {

		JSONArray ja2 = new JSONArray();
		ja2.put("wdt:iri");
		ja2.put("wdt:iri2");
		
		JSONObject xor = new JSONObject();
		xor.put("xor", ja2);

		JSONArray ja = new JSONArray();
		ja.put("wdt:iri");
		ja.put("wdt:iri2");
		ja.put(xor);
		
		JSONObject seq = new JSONObject();
		seq.put("sequence", ja);
		
		String res = seq.toString();
		System.out.println(res);
		
		JSONObject obj = new JSONObject(res);
		System.out.println(obj.toString());
		
		JSONArray arr = obj.getJSONArray("sequence");
		System.out.println(arr.toString());
		
		RdfPathParam param = AdaptionrdfFactory.eINSTANCE.createRdfPathParam();
		param.setValueFromString(res);

	}
	
	public static void successTests() {
		String[] teststrings = {
			// empty
			"",
			"{}",
			// SinglePred
			"<iri>",
			"^<iri>",
			"^<iri>+",
			"wdt:iri",
			"^wdt:iri",
			"^wdt:iri+",
			// SEQUENCE
			"{\"sequence\":[\"<iri>\", \"<iri>\"]}",
			"{\"sequence\":[\"wdt:iri\", \"wdt:iri\"]}",
			// XOR
			"{\"xor\":[\"<iri>\", \"<iri>\"]}",
			"{\"xor\":[\"wdt:iri\", \"wdt:iri\"]}",
			// NESTING
			"{\"sequence\":[\"wdt:iri\",\"wdt:iri2\",{\"sequence\":[\"wdt:iri\",\"wdt:iri2\"]}]}",
			"{\"xor\":[\"wdt:iri\",\"wdt:iri2\",{\"xor\":[\"wdt:iri\",\"wdt:iri2\"]}]}",
			"{\"sequence\":[\"wdt:iri\",\"wdt:iri2\",{\"xor\":[\"wdt:iri\",\"wdt:iri2\"]}]}",
			"{\"xor\":[\"wdt:iri\",\"wdt:iri2\",{\"sequence\":[\"wdt:iri\",\"wdt:iri2\"]}]}",
			"{\"xor\":[\"wdt:iri\",{\"sequence\":[\"wdt:iri\",\"wdt:iri2\"]},\"wdt:iri2\"]}",
			
//			// PARTS
			"{\"part\":[\"<iri>\", \"<iri>\"]}",
		};
		
		for (String test: teststrings) {
			System.out.println("\"" + test + "\"");
			RdfPathParam param = AdaptionrdfFactory.eINSTANCE.createRdfPathParam();
			try {
				param.setValueFromString(test);
				System.out.println(param.myToString());
				System.out.println(param.getValueAsString());
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println();
		}
	}
	
	public static void failTests() {

		String[] failstrings = {
			// SinglePred
			"iri",
			"^iri",
			"^iri+",
			// SEQUENCE
			"{\"sequence\":[]}",
			// XOR
			"{\"xor\":[]}",
			"{\"xor\":[\"<iri>\"]}",
			// NESTING
			// PARTS
				
		};
		
		for (String fail: failstrings) {
			try {
				System.out.println("\"" + fail + "\"");
				RdfPathParam param = AdaptionrdfFactory.eINSTANCE.createRdfPathParam();
				param.setValueFromString(fail);
				System.out.println("Test failed");
			} catch (Exception e) {
				System.out.println("Test succeeded");
			}
			System.out.println();
		}
	}

}

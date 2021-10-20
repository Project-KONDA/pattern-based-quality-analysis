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
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;

import qualitypatternmodel.servlets.Util;

public class ConcretisationServletTest {
	private static final String PATTERN_NAME = "test";	

	@Test
	public void doPostTest() throws IOException {
		String concretePatternName = "card_concrete";
		String parameterId = "10";
		String value = "DATA";
		String type = null;
		ServletTestsUtil.setParameter(concretePatternName, parameterId, value, type, "PropertyOption");		
	}
	
	@Test
	public void doPostTestUntypedWithPreviousInstantiation() throws IOException, JSONException {
		ServletTestsUtil.createConcretePattern("card_abstract", "flexible", PATTERN_NAME);	
		
		String parameterId = "5";
		String value = "example";
		String type = "Text";
		ServletTestsUtil.setParameter(PATTERN_NAME, parameterId, value, type, "Text");
		
		// delete pattern:
		HttpURLConnection connection3 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETE_PATTERN_DELETION_ENDPOINT + PATTERN_NAME).openConnection();
		connection3.setRequestMethod("DELETE");		
		int responseCode3 = connection3.getResponseCode();
		assertTrue(responseCode3 >= 200 && responseCode3 < 300);

	}

	
}

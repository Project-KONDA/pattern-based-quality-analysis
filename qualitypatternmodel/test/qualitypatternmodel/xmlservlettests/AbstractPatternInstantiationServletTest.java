package qualitypatternmodel.xmlservlettests;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.junit.After;
import org.junit.Test;

import qualitypatternmodel.demo.DemoPatternTexts;
import qualitypatternmodel.servlets.Util;
import qualitypatternmodel.utility.XmlServletUtility;

public class AbstractPatternInstantiationServletTest {
	
	private static final String PATTERN_NAME = "test_card";
	
	@After
	public void deletePattern() throws IOException {			
		HttpURLConnection connection = (HttpURLConnection) new URL(XmlServletUtility.PATH_PREFIX + Util.CONCRETE_PATTERN_DELETION_ENDPOINT + PATTERN_NAME).openConnection();
		connection.setRequestMethod("DELETE");		
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);
	}

	@Test
	public void doPostTest() throws IOException, JSONException {		
		XmlServletUtility.createConcretePattern("card_abstract", DemoPatternTexts.CARD_NAME, PATTERN_NAME);
	}
	
}

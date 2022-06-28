package qualitypatternmodel.xmlservlettests;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.junit.Test;
import qualitypatternmodel.demo.DemoPatternTexts;
import qualitypatternmodel.servlets.Util;

public class ConcretisationServletTest {
	private static final String PATTERN_NAME = "test";	

	@Test
	public void doPostTest() throws IOException {
		String concretePatternName = "card_concrete";
		String parameterId = "0";
		String value = "test_tag";
		String type = null;
		ServletTestsUtil.setParameter(concretePatternName, parameterId, value, type, "Text");		
	}
	
	@Test
	public void doPostTestUntypedWithPreviousInstantiation() throws IOException, JSONException {
		ServletTestsUtil.createConcretePattern("card_abstract", DemoPatternTexts.CARD_FLEXIBLE, PATTERN_NAME);	
		
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

package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Paths;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;

public class AbstractPatternInstantiationServletTest {
	
	private static final String PATTERN_NAME = "test_card";
	
	@After
	public void deletePattern() throws IOException {			
//		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETE_PATTERN_DELETION_ENDPOINT + PATTERN_NAME).openConnection();
//		connection.setRequestMethod("DELETE");		
//		int responseCode = connection.getResponseCode();
//		assertTrue(responseCode >= 200 && responseCode < 300);
	}

	@Test
	public void doPostTest() throws IOException, JSONException {		
		ServletTestsUtil.createConcretePattern("card_abstract", "flexible", PATTERN_NAME);
	}
	
}

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
import org.junit.Test;

public class ConcretisationServletTest {
	

	@Test
	public void doPostTest() throws IOException {
		String concretePatternName = "card_concrete";
		String parameterId = "8";
		String value = "TAG";
		String type = null;
		ServletTestsUtil.setParameter(concretePatternName, parameterId, value, type);		
	}
	
	@Test
	public void doPostTestUntypedWithPreviousInstantiation() throws IOException, JSONException {
		String concretePatternName = "test";
		ServletTestsUtil.createConcretePattern("card_abstract", "flexible", concretePatternName);	
		
		String parameterId = "5";
		String value = "example";
		String type = "Text";
		ServletTestsUtil.setParameter(concretePatternName, parameterId, value, type);

	}

	
}

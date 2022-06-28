package qualitypatternmodel.xmlservlettests;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import org.junit.Test;

import qualitypatternmodel.servlets.Util;

public class ConcretePatternDescriptionServletTest {
	

	@Test
	public void doPostTest() throws IOException {
		String pattern = "card_concrete";
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.DESCRIPTION_ENDPOINT + pattern).openConnection();
		connection.setRequestMethod("POST");
		String valueEncoded = URLEncoder.encode("This is a test description");
		String parameters = "description=" + valueEncoded;
		
		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
	    wr.write(parameters);
	    wr.flush();
	    
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);

	}

	
}

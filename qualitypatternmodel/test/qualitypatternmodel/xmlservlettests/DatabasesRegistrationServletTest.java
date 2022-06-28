package qualitypatternmodel.xmlservlettests;

import java.io.IOException;
import org.json.JSONException;
import org.junit.After;
import org.junit.Test;

public class DatabasesRegistrationServletTest {
	String localName = "test_db";
	

	@Test
	public void doPostTest() throws IOException, JSONException {
		ServletTestsUtil.registerDatabase(localName, "ddb_20190606", "localhost", "1984", "admin", "admin", 1);
	}
	
	@After
	public void after() throws IOException, JSONException {	
		ServletTestsUtil.deleteDatabase(localName);		
	}
	
	
}

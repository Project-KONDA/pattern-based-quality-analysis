package playground;

import static qualitypatternmodel.utility.XmlTestDatabaseConstants.DEMO_DATABASE_NAME;
import static qualitypatternmodel.utility.XmlTestDatabaseConstants.DEMO_DATA_PATH;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.XQuery;

public class SimpleBaseXQueryExecution {
	public static void main(String[] args) {

		try {
			Context context = new Context();					
			new CreateDB(DEMO_DATABASE_NAME, DEMO_DATA_PATH).execute(context);
			XQuery xquery = new XQuery("(//*)[1]");
			String result = xquery.execute(context);
			System.out.println(result);
		} 

		catch (BaseXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}

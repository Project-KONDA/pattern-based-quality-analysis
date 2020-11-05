package playground;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.XQuery;

public class SimpleBaseXQueryExecution {
	public static void main(String[] args) {

		try {
//			String query = "(//*[name()=\"lido:appellationValue\" and matches(./data(),\"\\?\")]/parent::*/parent::*/parent::*/parent::*/parent::*)[1]";
			Context context = new Context();					
			new CreateDB("DBExample", "D:\\Dokumente\\Lido\\ddb_20190220\\ddb_20190220\\ddb_20190220_1.xml").execute(context);
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

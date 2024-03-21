package playground;

import static qualitypatternmodel.utility.XmlTestDatabaseConstants.*;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.basex.query.QueryProcessor;
import org.basex.query.iter.Iter;
import org.basex.query.value.item.Item;

public class BaseXExecutionIterator {
	public static void main(String[] args) throws QueryIOException {

		try {
			Context context = new Context();					
			new CreateDB(DEMO_DATABASE_NAME, DEMO_DATA_PATH).execute(context);
			
			try(QueryProcessor proc = new QueryProcessor("//*", context)) {
		      Iter iter = proc.iter();
		      int i = 0;
		      for(Item item; (item = iter.next()) != null;) {
//			    	  queryResult.add(item.toJava().toString());
		    	  i++;
		    	  System.out.println(item.serialize().toString());
		    	  System.out.println("---------------------");
		      }
		      System.out.println(i);
		    } catch (QueryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		} 
		catch (BaseXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}

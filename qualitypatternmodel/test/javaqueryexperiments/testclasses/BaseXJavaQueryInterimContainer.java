package javaqueryexperiments.testclasses;

import java.util.ArrayList;

import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.query.QueryProcessor;
import org.basex.query.iter.Iter;
import org.basex.query.value.item.Item;

public class BaseXJavaQueryInterimContainer extends JavaQueryInterimContainer {
	
	public BaseXJavaQueryInterimContainer(String databasename, String datapath, String query) {
		results = new ArrayList<InterimContainer>();
		Context context = new Context();
		try {
			new CreateDB(databasename, datapath).execute(context);
	
			try (QueryProcessor proc = new QueryProcessor(query, context)) {
				Iter iter = proc.iter();
				for (Item item; (item = iter.next()) != null;) {
					streamNext(item.serialize().toString());
				}
			} 
			context.closeDB();
			context.close();
		} catch (Exception e) { // QueryIOException  QueryException BaseXException
			e.printStackTrace();
		}
		
	}
}

package qualitypatternmodel.javaquery;

import java.util.ArrayList;

import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.query.QueryProcessor;
import org.basex.query.iter.Iter;
import org.basex.query.value.item.Item;

public class BaseXJavaQueryInterimContainer extends JavaQueryInterimContainer {
	
	public BaseXJavaQueryInterimContainer(String databasename, String datapath, String query) {
		results = new ArrayList<InterimResultContainer>();

		Context context = new Context();
		try {
			new CreateDB(databasename, datapath).execute(context);
			JavaQueryInterimContainer container = new JavaQueryInterimContainer();
	
			try (QueryProcessor proc = new QueryProcessor(query, context)) {
				Iter iter = proc.iter();
				for (Item item; (item = iter.next()) != null;) {
					container.streamNext(item.serialize().toString());
				}
				System.out.println(container.toString());
	
			} 
		} catch (Exception e) { // QueryIOException  QueryException BaseXException
			e.printStackTrace();
		}
		
	}
}

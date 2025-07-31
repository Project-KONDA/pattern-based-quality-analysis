package qualitypatternmodel.utility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.DropDB;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.basex.query.QueryProcessor;
import org.basex.query.iter.Iter;
import org.basex.query.value.item.Item;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.newservlets.ServletUtilities;

public class XmlServletUtility {

	public static List<String> executeXQueryJava(String query, String datapath) throws InvalidityException {
		String databasename = "execution_" + UUID.randomUUID();
		if (query == null || query == "") {
			throw new InvalidityException("Empty Query");
		}
		query = ServletUtilities.makeQueryOneLine(query);
		if (databasename == null || databasename == "") {
			throw new InvalidityException("Invalid database name");
		}
		if (!new File(datapath).exists()) {
			throw new InvalidityException("File not found");
		}
		List<String> outcome = new ArrayList<String>();
		Context context = new Context();
		try {
			new CreateDB(databasename, datapath).execute(context);
			try (QueryProcessor proc = new QueryProcessor(query, context)) {
				Iter iter = proc.iter();
				for (Item item; (item = iter.next()) != null;) {
					outcome.add(item.serialize().toString());
				}
			} 
			new DropDB(databasename).execute(context);
		} catch(BaseXException e) {
			throw new InvalidityException("BaseXException on file " + datapath + " with query: " + query + " [" + e.getMessage() + "]");
		} catch(QueryException e) {
			throw new InvalidityException("QueryException on file " + datapath + " with query: " + query + " [" + e.getMessage() + "]");
		} catch (QueryIOException e) {
			throw new InvalidityException("QueryIOException on file " + datapath + " with query: " + query + " [" + e.getMessage() + "]");
		}
		context.closeDB();
		context.close();
	
		return outcome;
	}
	
}

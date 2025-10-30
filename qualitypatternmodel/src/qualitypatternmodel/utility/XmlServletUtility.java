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
	
	
	public static List<String> executeXQueryJava(String query) throws InvalidityException {
		return executeXQueryJava(query, null);
	}

	public static List<String> executeXQueryJava(String query, String datapath) throws InvalidityException {
		if (query == null || query == "") {
			throw new InvalidityException("Empty Query");
		}
		query = ServletUtilities.makeQueryOneLine(query);
		
		Context context = null;
		String databasename = null;
		List<String> outcome = new ArrayList<String>();
		try {
			context = new Context();
			if (datapath != null) {
				databasename = "execution_" + UUID.randomUUID();
				if (!new File(datapath).exists()) {
					throw new InvalidityException("File not found");
				}
				new CreateDB(databasename, datapath).execute(context);
			} else {
		        databasename = "dummydb_" + UUID.randomUUID();
		        String dummyXml = "<dummy/>";
		        new CreateDB(databasename, dummyXml).execute(context);
			}
			try (QueryProcessor proc = new QueryProcessor(query, context)) {
				Iter iter = proc.iter();
				for (Item item; (item = iter.next()) != null;) {
					outcome.add(item.serialize().toString());
				}
			}
		} catch(BaseXException e) {
			throw new InvalidityException("BaseXException on file " + datapath + " with query: " + query + " [" + e.getMessage() + "]", e);
		} catch(QueryException e) {
			throw new InvalidityException("QueryException on file " + datapath + " with query: " + query + " [" + e.getMessage() + "]", e);
		} catch (QueryIOException e) {
			throw new InvalidityException("QueryIOException on file " + datapath + " with query: " + query + " [" + e.getMessage() + "]", e);
		} finally {
			if (context != null) {
				if (databasename != null)
					try {
						new DropDB(databasename).execute(context);
					} catch (BaseXException e) {}
				context.closeDB();
				context.close();
			}
		}
		return outcome;
	}

    public static List<String> extractFromDoc(String xmlString, String xpath) {
        String query = "let $r := $doc" + xpath + " return if (exists($r/*)) then $r/* else $r/text()";
    	return queryFromDoc(xmlString, query);
    	
    }

    public static List<String> queryFromDoc(String xmlString, String query) {
        Context context = new Context();
		List<String> outcome = new ArrayList<String>();
        try {
            // XQuery: choose child element if exists, else text
            String wrappedQuery =
                    "declare variable $document external; " +
                    "let $doc := parse-xml($document) " + query
                    ;

            try (QueryProcessor proc = new QueryProcessor(wrappedQuery, context)) {
                proc.bind("document", xmlString);
				Iter iter = proc.iter();
				for (Item item; (item = iter.next()) != null;) {
					outcome.add(item.serialize().toString());
				}
			}
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            context.close();
        }
        return outcome;
    }
	
}

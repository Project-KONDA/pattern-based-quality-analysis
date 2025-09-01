package qualitypatternmodel.utility.xmlprocessors;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.DropDB;
import org.basex.io.serial.Serializer;
import org.basex.query.QueryException;
import org.basex.query.QueryProcessor;
import org.basex.query.iter.Iter;
import org.basex.query.value.item.Item;
import org.json.JSONArray;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.utility.Util;

public class XQueryProcessorBaseX {

	public static JSONArray baseXExecuteXQuery(String query, String datapath, String format) throws InvalidityException {
	    if (query == null || query.trim().isEmpty()) {
	        throw new InvalidityException("Empty Query");
	    }
	    query = ServletUtilities.makeQueryOneLine(query);
	
	    JSONArray outcome = new JSONArray();
	    Context context = new Context();
	    String databasename = null;
	
	    try {
	        // Validate input file size
	        if (datapath != null) {
	            File file = new File(datapath);
	            if (!file.exists()) {
	                throw new InvalidityException("File not found: " + datapath);
	            }
	            if (file.length() > Util.EXECUTE_MAX_FILE_SIZE_BYTES) {
	                throw new InvalidityException("File too large: " + datapath);
	            }
	
	            databasename = "execution_" + UUID.randomUUID();
	            new CreateDB(databasename, datapath).execute(context); // disk-based DB
	        }
	
	        // Run query safely
	        try (QueryProcessor proc = new QueryProcessor(query, context)) {
	
	            Iter iter = proc.iter();
	            for (Item item; (item = iter.next()) != null;) {
	                try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
	                     Serializer ser = Serializer.get(baos)) {
	                    item.serialize(ser);
	                    outcome.put(baos.toString(StandardCharsets.UTF_8));
	                }
	            }
	        }
	
	    } catch (BaseXException e) {
	        throw new InvalidityException("BaseXException on file " + datapath + " with query: " + query + " [" + e.getMessage() + "]");
	    } catch (QueryException e) {
	        throw new InvalidityException("QueryException on file " + datapath + " with query: " + query + " [" + e.getMessage() + "]");
	    } catch (IOException e) {
	        throw new InvalidityException("IO error on file " + datapath + " with query: " + query + " [" + e.getMessage() + "]");
	    } finally {
	        try {
	            if (databasename != null) {
	                new DropDB(databasename).execute(context);
	            }
	        } catch (BaseXException ignore) {}
	        context.close();
	    }
	
	    return outcome;
	}

//	public static List<String> baseXXQueryToStringOld(String query, String datapath) throws InvalidityException {
//		if (query == null || query == "") {
//			throw new InvalidityException("Empty Query");
//		}
//		query = ServletUtilities.makeQueryOneLine(query);
//		
//		Context context = null;
//		String databasename = null;
//		List<String> outcome = new ArrayList<String>();
//		try {
//			context = new Context();
//			if (datapath != null) {
//				databasename = "execution_" + UUID.randomUUID();
//				if (!new File(datapath).exists()) {
//					throw new InvalidityException("File not found");
//				}
//				new CreateDB(databasename, datapath).execute(context);
//			}
//			try (QueryProcessor proc = new QueryProcessor(query, context)) {
//				Iter iter = proc.iter();
//				for (Item item; (item = iter.next()) != null;) {
//					outcome.add(item.serialize().toString());
//				}
//			}
//		} catch(BaseXException e) {
//			throw new InvalidityException("BaseXException on file " + datapath + " with query: " + query + " [" + e.getMessage() + "]");
//		} catch(QueryException e) {
//			throw new InvalidityException("QueryException on file " + datapath + " with query: " + query + " [" + e.getMessage() + "]");
//		} catch (QueryIOException e) {
//			throw new InvalidityException("QueryIOException on file " + datapath + " with query: " + query + " [" + e.getMessage() + "]");
//		} finally {
//			if (context != null) {
//				if (databasename != null)
//					try {
//						new DropDB(databasename).execute(context);
//					} catch (BaseXException e) {}
//				context.closeDB();
//				context.close();
//			}
//		}
//		return outcome;
//	}

}

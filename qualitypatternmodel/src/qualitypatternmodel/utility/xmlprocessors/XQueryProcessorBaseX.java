package qualitypatternmodel.utility.xmlprocessors;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.DropDB;
import org.basex.io.serial.Serializer;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.basex.query.QueryProcessor;
import org.basex.query.iter.Iter;
import org.basex.query.value.item.Item;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaquery.impl.JavaFilterImpl;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.Util;

public class XQueryProcessorBaseX {

	public static JSONArray executeQueryFile(String query, String datapath) throws InvalidityException {
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
	        try (QueryProcessor proc = new QueryProcessor(query, context)) {
	            Iter iter = proc.iter();
	            for (Item item; (item = iter.next()) != null;) {
	                try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
	                     Serializer ser = Serializer.get(baos)) {
	                    item.serialize(ser);
	                    JSONObject snippet = new JSONObject();
	                    snippet.put(ConstantsJSON.RESULT_SNIPPET, baos.toString(StandardCharsets.UTF_8));
	                    outcome.put(snippet);
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

	public static JSONObject queryFileToJSONObject(File file, JSONObject constraint) throws JSONException, FailedServletCallException, InvalidityException {
			ServletUtilities.log( "query file [" + file.getAbsolutePath()  + "] with constraint [" + constraint + "]");

			JSONObject object = new JSONObject();
			object.put(ConstantsJSON.FILE, file.getName());
			object.put(ConstantsJSON.CONSTRAINT_ID, constraint.getString(ConstantsJSON.CONSTRAINT_ID));
			object.put(ConstantsJSON.CONSTRAINT_NAME, constraint.getString(ConstantsJSON.NAME));
			if (constraint.has(ConstantsJSON.CUSTOM))
				object.put(ConstantsJSON.CUSTOM, constraint.get(ConstantsJSON.CUSTOM));

			String query = constraint.getString(ConstantsJSON.QUERY);
			String query_partial = constraint.getString(ConstantsJSON.QUERY_PARTIAL);

			int total;
			try {
				JSONArray totalResults;
				ServletUtilities.log( "query file [" + file  + "] with query [" + ServletUtilities.makeQueryOneLine(query_partial) + "]");
				totalResults = executeQueryFile(query_partial, file.getAbsolutePath());
				total = totalResults.length();
			} catch (InvalidityException e) {
				e.printStackTrace();
				throw new FailedServletCallException(ConstantsError.QUERY_FAILED, e);
			}
			JSONArray result = null;
	
			if (!constraint.has(ConstantsJSON.FILTER)) {
				ServletUtilities.log( "query file [" + file  + "] with query [" + ServletUtilities.makeQueryOneLine(query) + "]");
				result = executeQueryFile(query, file.getAbsolutePath());
			} else {
				try {
					JSONObject filterjson = constraint.getJSONObject(ConstantsJSON.FILTER);
					JavaFilter filter = JavaFilterImpl.fromJson(filterjson);
					result =  filter.execute(file.getCanonicalPath());
				} catch (JSONException | InvalidityException | IOException e) {
					throw new FailedServletCallException ("Failed to execute constraint", e);
				}
			}
			if (result == null) {
				throw new FailedServletCallException("result is null");
			}

			object.put(ConstantsJSON.INCIDENTS, result);
			object.put(ConstantsJSON.TOTAL_FINDINGS, total);
			object.put(ConstantsJSON.TOTAL_INCIDENCES, result.length());
			object.put(ConstantsJSON.TOTAL_COMPLIANCES, total - result.length());
			return object;
		}

	public static JSONObject queryConstraintsFilePaths(List<JSONObject> constraints, List<String> filepaths) throws InvalidServletCallException, FailedServletCallException {
		JSONObject failedConstraints = new JSONObject();
		ArrayList<File> files = new ArrayList<File>();
		JSONObject failedFiles = new JSONObject();
		JSONArray results = new JSONArray();

		// verify file existence
		if (filepaths != null) {
			for (String filepath: filepaths) {
				File file = new File(ServletConstants.FILE_VOLUME + "/" + filepath);
				if (file.exists()) {
					files.add(file);
					ServletUtilities.log(ServletConstants.FILE_VOLUME + "/" + filepath + " found");
				}
				else {
					file = new File(filepath);
					if (file.exists()) {
						files.add(file);
						ServletUtilities.log(filepath + " found");
					}
					else {
						System.out.println(ServletConstants.FILE_VOLUME + "/" + filepath + " not found");
						ServletUtilities.log(ServletConstants.FILE_VOLUME + "/" + filepath + " not found");
						try {
							failedFiles.put(filepath, ConstantsError.NOT_FOUND_FILEPATH);
						} catch (JSONException f) {}
					}
				}
			}
		}
		if (files.isEmpty()) {
			throw new InvalidServletCallException(ConstantsError.INVALID_FILES);
		}
		ServletUtilities.log("files found: " + files.size());
		ServletUtilities.log("constraint found: " + constraints.size());

		// query
		for (JSONObject constraint: constraints) {
			try {
				for (File file: files) {
					try {
						ServletUtilities.log("querying: " + file + " " + constraint);
						JSONObject res = queryFileToJSONObject(file, constraint);
						results.put(res);
						ServletUtilities.log("querying successfull: " + res.length());
					} catch (JSONException e) {
						throw new FailedServletCallException("JSON Error: " + e.getMessage(), e);
					}
				}
			}
			catch (InvalidityException e) {
				failedConstraints.put(constraint.getString(ConstantsJSON.CONSTRAINT_ID), e.getMessage());
			}
		}

		JSONObject object = new JSONObject();
		try {
			object.put(ConstantsJSON.RESULT, results);
			if (!failedFiles.isEmpty()) {
				object.put(ConstantsJSON.FAILEDFILES, failedFiles);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		try {
			if (!failedConstraints.isEmpty()) {
				object.put(ConstantsJSON.FAILEDCONSTRAINTS, failedConstraints);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return object;
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

	public static void validateXQuery(String query) throws InvalidityException {
		Context ctx = new Context();
	    try (QueryProcessor qp = new QueryProcessor(query, ctx)) {
	        qp.compile();
	    } catch (Exception e) {
	    	throw new InvalidityException("Invalid Query", e);
	    } finally {
		    ctx.close();
	    }
	}
}

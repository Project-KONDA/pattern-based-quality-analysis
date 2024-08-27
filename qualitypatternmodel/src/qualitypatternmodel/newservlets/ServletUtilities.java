package qualitypatternmodel.newservlets;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.mqaftranslation.MqafTranslationValidation;
//import qualitypatternmodel.execution.Database;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;
//import qualitypatternmodel.utility.EMFModelSave;

public abstract class ServletUtilities {

	// for efficiency when requested once, the templates do not need to be reloaded that often
	private static List<CompletePattern> abstractPatternXml = null;
	private static List<CompletePattern> abstractPatternRdf = null;
	private static List<CompletePattern> abstractPatternNeo = null;
	private static Semaphore saveSemaphore = new Semaphore(1);

	// Pattern request
	public static List<CompletePattern> getAllPattern(String technology) {
		EList<CompletePattern> patterns = new BasicEList<CompletePattern>();
		List<CompletePattern> astr = getTemplates(technology);
		List<CompletePattern> conc = getReadyConstraints(technology);
		if (astr!=null) {
			patterns.addAll(astr);
		}
		if (conc!=null) {
			patterns.addAll(conc);
		}
		return patterns;
	}

	public static List<CompletePattern> getTemplates(String technology) {
		String path = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TEMPLATEFOLDER;
		try {
			abstractPatternXml = EMFModelLoad.loadCompletePatternFromFolder(path, Constants.EXTENSION);
			if (technology.equals(Constants.XML)) {
				if (abstractPatternXml == null) {
					abstractPatternXml = EMFModelLoad.loadCompletePatternFromFolder(path, Constants.EXTENSION);
				}
				return abstractPatternXml;
			} else if (technology.equals(Constants.RDF)) {
				if (abstractPatternRdf == null) {
					abstractPatternRdf = EMFModelLoad.loadCompletePatternFromFolder(path, Constants.EXTENSION);
				}
				return abstractPatternRdf;

			} else if (technology.equals(Constants.NEO4J)) {
				if (abstractPatternNeo == null) {
					abstractPatternNeo = EMFModelLoad.loadCompletePatternFromFolder(path, Constants.EXTENSION);
				}
				return abstractPatternNeo;
			} else {
				return null;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static List<CompletePattern> getConstraints(String technology) {

		if (Constants.TECHS.contains(technology)) {
			try {
				return EMFModelLoad.loadCompletePatternFromFolder(ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER, Constants.EXTENSION);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return new BasicEList<CompletePattern>();
	}

	public static List<CompletePattern> getReadyConstraints(String technology) {
		List<CompletePattern> concrete = new BasicEList<CompletePattern>();
		List<CompletePattern> semiconcrete = getConstraints(technology);
		if (semiconcrete != null) {
			for (CompletePattern semi: semiconcrete) {
				try {
					semi.isValid(AbstractionLevel.CONCRETE);
					concrete.add(semi);
				} catch (Exception e) {}
			}
		}
		return concrete;
	}


	// JSON

	public static JSONObject getPatternListJSON(List<CompletePattern> patterns) {
		JSONObject json = new JSONObject();
		JSONArray ids = new JSONArray();
		try {
			JSONArray templates = new JSONArray();
			for (CompletePattern pattern: patterns) {
				ids.put(pattern.getPatternId());
				templates.put(getPatternJSON(pattern));
			}
			json.put(ConstantsJSON.TEMPLATES, templates);
			json.put(ConstantsJSON.TOTAL, patterns.size());
			json.put(ConstantsJSON.IDS, ids);
		} catch (JSONException e) {}
		return json;
	}

	public static JSONObject getPatternJSON(CompletePattern pattern) {
		JSONObject json = new JSONObject();
		try {
			json.put(ConstantsJSON.CONSTRAINT_ID, pattern.getPatternId());
			json.put(ConstantsJSON.NAME, pattern.getName());
			json.put(ConstantsJSON.DESCRIPTION, pattern.getDescription());
			json.put(ConstantsJSON.LANGUAGE, pattern.getLanguage());
			if (pattern.getLastSaved() != null) {
				json.put(ConstantsJSON.LASTSAVED, new Timestamp(pattern.getLastSaved().getTime()).toString());
			}
			if (pattern.getNamespaces() != null) {
				json.put(ConstantsJSON.NAMESPACES, pattern.getNamespaces().generateJSONObject());
			}
			if (pattern.getDatabaseName() != null) {
				json.put(ConstantsJSON.DATABASE, pattern.getDatabaseName());
			}
			if (pattern.getDataModelName() != null) {
				json.put(ConstantsJSON.DATAMODEL, pattern.getDataModelName());
			}
			if (pattern.getKeywords() != null && !pattern.getKeywords().isEmpty()) {
				JSONArray tags = new JSONArray(pattern.getKeywords());
				json.put(ConstantsJSON.TAG, tags);
			}

			Boolean mqaf = false;
			Boolean query = false;
			Boolean filter = false;
			try {
				pattern.isValid(AbstractionLevel.CONCRETE);
				filter = pattern.getLanguage().equals(Language.XML);
				try {
					MqafTranslationValidation.checkPatternTranslatable(pattern);
					mqaf = true;
				}
				catch (InvalidityException e) {}
				try {
					query = !pattern.containsJavaOperator();
				}
				catch (InvalidityException e) {}
			}
			catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {}

			json.put(ConstantsJSON.EXECUTABLE , mqaf || query || filter);
			json.put(ConstantsJSON.EXECUTABLE_MQAF, mqaf);
			json.put(ConstantsJSON.EXECUTABLE_QUERY, query);
			json.put(ConstantsJSON.EXECUTABLE_FILTER, filter);


			JSONArray variants = new JSONArray();
			for (PatternText text: pattern.getText()) {
				variants.put(text.generateJSONObject());
			}
			json.put(ConstantsJSON.VARIANTS, variants);
		} catch (JSONException e) {}
		return json;
	}

	public static String getPatternJSONHeads(List<CompletePattern> patterns) {
		JSONArray jsonarray = new JSONArray();
		for (CompletePattern pattern: patterns) {
			jsonarray.put(getPatternJSONHead(pattern));
		}
		return jsonarray.toString();
	}

	public static JSONObject getPatternJSONHead(CompletePattern pattern) {
		JSONObject json = new JSONObject();
		try {
			json.put(ConstantsJSON.CONSTRAINT_ID, pattern.getPatternId());
			json.put(ConstantsJSON.NAME, pattern.getName());
			json.put(ConstantsJSON.DESCRIPTION, pattern.getDescription());
		} catch (JSONException e) {}
		return json;
	}


	// LOAD SAVE DELETE

	protected static CompletePattern loadConstraint(String technology, String name) throws IOException {
		String patternpath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER + "/" + name + "." + Constants.EXTENSION;
		return EMFModelLoad.loadCompletePattern(patternpath);
	}

	protected static CompletePattern loadTemplate(String technology, String templateId) throws IOException {
		String folderPath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TEMPLATEFOLDER;
		return EMFModelLoad.loadCompletePattern(folderPath, templateId, Constants.EXTENSION);
	}

	public static void saveTemplate(String technology, String templateId, CompletePattern pattern) throws IOException {
		try {
			saveSemaphore.acquire();
			String folderpath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TEMPLATEFOLDER;
			EMFModelSave.exportToFile2(pattern, folderpath, templateId, Constants.EXTENSION);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread was interrupted");
        } finally {
        	saveSemaphore.release();
        }
	}

	public static String saveConstraint(String technology, String constraintId, CompletePattern pattern) throws IOException {
		String folderpath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER;
		pattern.updateLastSaved();
		try {
			saveSemaphore.acquire();
			EMFModelSave.exportToFile2(pattern, folderpath, constraintId, Constants.EXTENSION);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread was interrupted");
        } finally {
        	saveSemaphore.release();
        }
		return new Timestamp(pattern.getLastSaved().getTime()).toString();
	}

	public static String generateNewId(String technology, String templateId, String variantname) throws IOException {
//		String name = technology + "_" + templateId + "_" + variantname;
		String name = templateId + "_" + variantname;
		String filepath = ServletConstants.PATTERN_VOLUME + "/" + ServletConstants.SAVEFILE;
		Integer number;
		try {
			number = getNextNumber(filepath, name);
		} catch (JSONException | IOException e) {
			number = 0;
		}
		return name + "_" + number;
	}

	public static Integer getNextNumber(String filepath, String variableName) throws JSONException, IOException {
        int currentValue = 0;
		try {
			saveSemaphore.acquire();

	        File file = new File(filepath);
	        if (!file.exists()) {
	            // If the file doesn't exist, create it and initialize with an empty JSON object
	            JSONObject jsonObject = new JSONObject();
//	            jsonObject.put(variableName, 0);
	            Files.write(Paths.get(filepath), jsonObject.toString().getBytes(), StandardOpenOption.CREATE);
	            System.out.println("File created successfully: " + filepath);
//	            return 0; // Return 0 as the initial value
	        }

	        // Read JSON file
	        String jsonString = new String(Files.readAllBytes(Paths.get(filepath)));
	        JSONObject jsonObject = new JSONObject(jsonString);

	        // Retrieve the value associated with the provided variable name
	        if (!jsonObject.has(variableName) || !(jsonObject.get(variableName) instanceof Integer)) {
	            jsonObject.put(variableName, currentValue);
	            Files.write(Paths.get(filepath), jsonObject.toString().getBytes());
	        } else {
	            currentValue = jsonObject.getInt(variableName);
	        }

	        // Update the JSON with the new value
	        jsonObject.put(variableName, currentValue + 1);
	        Files.write(Paths.get(filepath), jsonObject.toString().getBytes());
			
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread was interrupted");
        } finally {
        	saveSemaphore.release();
        }

        return currentValue;
	}

	public static void deleteConstraint(String technology, String constraintId) throws IOException {
		String patternpath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER + "/" + constraintId + "." + Constants.EXTENSION;
//		patternpath = servletContext.getRealPath(patternpath);

		CompletePattern constraint = EMFModelLoad.loadCompletePattern(patternpath);
		if (constraint instanceof CompletePattern) {
			Files.delete(Paths.get(patternpath));
		} else {
			throw new IOException(ConstantsError.INVALID_FILEFORMAT);
		}
	}


	// RESPONSE HANDLING

	public static void putResponse(HttpServletResponse response, JSONObject jsonObject, int responseCode) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.setStatus(responseCode);
        response.getWriter().write(jsonObject.toString());
	}

	public static void putResponse(HttpServletResponse response, JSONArray jsonArray, int responseCode) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.setStatus(responseCode);
        response.getWriter().write(jsonArray.toString());
	}

	public static void putResponse(HttpServletResponse response, String text, int responseCode) throws IOException {
	    response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        response.setStatus(responseCode);
        response.getWriter().write(text);
	}

	public static void putResponseError(HttpServletResponse response, Exception error, int responseCode) throws IOException {
		logError(error);
		JSONObject object = new JSONObject();
		try {
			object.put("error", error.getMessage());
		} catch (JSONException e) {}
		putResponse(response, object, responseCode);
	}

	public static void putResponseError(HttpServletResponse response, Exception error) throws IOException {
		int responseCode = HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
		if (error.getClass().equals(InvalidServletCallException.class)) {
			responseCode = HttpServletResponse.SC_BAD_REQUEST;
		}
		if (error.getClass().equals(FailedServletCallException.class)) {
			responseCode = HttpServletResponse.SC_NOT_FOUND;
		}
		putResponseError(response, error, responseCode);
	}

	public static void putResponse(HttpServletResponse response, JSONObject jsonObject) throws IOException {
        putResponse(response, jsonObject, HttpServletResponse.SC_OK);
	}
	public static void putResponse(HttpServletResponse response, JSONArray jsonArray) throws IOException {
        putResponse(response, jsonArray, HttpServletResponse.SC_OK);
	}
	public static void putResponse(HttpServletResponse response, String text) throws IOException {
        putResponse(response, text, HttpServletResponse.SC_OK);
	}


	// LOGGING

	public static void log(String text) {
		try {
			saveSemaphore.acquire();
			String filepath = "/" + ServletConstants.LOGFILE;
			if (ServletConstants.LOG_IN_FILE_VOLUME) {
				filepath = ServletConstants.FILE_VOLUME + filepath;
			} else {
				filepath = ServletConstants.PATTERN_VOLUME + filepath;
			}
			File file = new File(filepath);
		    file.getParentFile().mkdirs();
	        if (!file.exists()) {
	        	String dirPath = filepath.substring(0, filepath.lastIndexOf('/'));
	            File directory = new File(dirPath);
	            if (!directory.exists()) {
					directory.mkdirs();
				}
	            Files.write(Paths.get(filepath), new byte[0], StandardOpenOption.CREATE);
	            System.out.println("File created successfully: " + filepath);
	        }
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
	        String timestamp = LocalDateTime.now().format(formatter);

	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
				writer.newLine();
				writer.write("[" + timestamp + "] " + text);
			}
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread was interrupted");
        } finally {
            // Release the semaphore
        	saveSemaphore.release();
        }
	}

	public static void logOutput(JSONObject json) {
		log("OUTPUT: " + json);
	}

	public static void logOutput(String text) {
		log("OUTPUT: " + text);
	}

	public static void logError(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println(th.getClass().getSimpleName() + ": " + th.getMessage());
		for (StackTraceElement element : th.getStackTrace()) {
            printWriter.println("    " + element.toString());
        }
        log("ERROR: " + stringWriter.toString());
		if(th.getCause() != null) {
			log("CAUSED BY");
			logError(th.getCause());
		}
	}

	public static void logCall(String clazz, String path, Map<String, String[]> params) {
		log("CALL: " + clazz + "(" + path + ")" + mapToString(params));
	}

	static String mapToString(Map<String, String[]> map) {
		JSONObject job = new JSONObject();
		for (String key: map.keySet()) {
			try {
				String[] vals = map.get(key);
				if (vals.length > 1) {
					job.put(key, vals[0]);
				} else {
					JSONArray jarr = new JSONArray(vals);
					job.put(key, jarr);
				}
			} catch (JSONException e) {}
		}
		return job.toString();
	}


	// DEPRECATED METHODS

	public static String getFileNamesInFolder(String path, Class<?> clas) throws URISyntaxException {
		URL url = clas.getClassLoader().getResource(path);
		if(url != null) {
			File[] files = Paths.get(url.toURI()).toFile().listFiles();
			if(files.length == 0) {
				return "";
			}
//			String json = "{\"Patterns\": [";
			String json = "[";
			for(File f : files) {
				json += "\"" + f.getName().split("\\.")[0] + "\", ";
			}
			json = json.substring(0, json.length()-2);
			json += "]";
//			json += "]}";
			return json;

		} else {
			return null;
		}
	}

	public static ArrayList<String> getListOfFileNamesInFolder(String path, Class<?> clas) throws URISyntaxException {
		URL url = clas.getClassLoader().getResource(path);
		ArrayList<String> fileNames = new ArrayList<String>();
		if(url != null) {
			File[] files = Paths.get(url.toURI()).toFile().listFiles();
			if(files.length == 0) {
				return null;
			}
			for(File f : files) {
				fileNames.add(f.getName().split("\\.")[0]);
			}
			return fileNames;

		} else {
			return null;
		}
	}
}

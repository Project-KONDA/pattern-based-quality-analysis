package qualitypatternmodel.newservlets;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
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
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.textrepresentation.Fragment;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

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
			logError(e);
			return null;
		}
	}

	public static List<CompletePattern> getConstraints(String technology) {

		if (Constants.TECHS.contains(technology)) {
			try {
				return EMFModelLoad.loadCompletePatternFromFolder(ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER, Constants.EXTENSION);
			} catch (IOException e) {
				logError(e);
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
				} catch (InvalidityException e) {
					// In this cased, the pattern is not concrete
				} catch (Exception e) {
					logError(e);
				}
			}
		}
		return concrete;
	}


	// JSON

	public static JSONObject getPatternListJSON(List<CompletePattern> patterns) {
		JSONObject json = new JSONObject();
		JSONArray ids = new JSONArray();
        HashSet<String> uniqueTags = new HashSet<>();
		JSONArray tags = new JSONArray();
		try {
			JSONArray templates = new JSONArray();
			for (CompletePattern pattern: patterns) {
				ids.put(pattern.getPatternId());
				templates.put(getPatternJSON(pattern));
				if (pattern.getKeywords() != null)
					uniqueTags.addAll(pattern.getKeywords());
			}
			tags.putAll(uniqueTags);
			json.put(ConstantsJSON.TEMPLATES, templates);
			json.put(ConstantsJSON.TOTAL, patterns.size());
			json.put(ConstantsJSON.IDS, ids);
			if(!tags.isEmpty())
				json.put(ConstantsJSON.TAGS, tags);
		} catch (JSONException e) {
			logError(e);
		}
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
				json.put(ConstantsJSON.TECHNOLOGY, Language.XML);
				filter = pattern.getLanguage().equals(Language.XML);
				try {
					MqafTranslationValidation.checkPatternTranslatable(pattern);
					mqaf = true;
				}
				catch (InvalidityException e) {
					// not mqaf translateable
				}
				try {
					query = !pattern.containsJavaOperator();
				}
				catch (InvalidityException e) {
					// not query translateable
				}
			}
			catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
				// not translateable
			}

			json.put(ConstantsJSON.EXECUTABLE , mqaf || query || filter);
			json.put(ConstantsJSON.EXECUTABLE_MQAF, mqaf);
			json.put(ConstantsJSON.EXECUTABLE_QUERY, query);
			json.put(ConstantsJSON.EXECUTABLE_FILTER, filter);


			JSONArray variants = new JSONArray();
			for (PatternText text: pattern.getText()) {
				variants.put(text.generateJSONObject());
			}
			json.put(ConstantsJSON.VARIANTS, variants);
		} catch (JSONException e) {
			logError(e);
		}
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
		} catch (JSONException e) {
			logError(e);
		}
		return json;
	}


	// LOAD SAVE DELETE

	protected static CompletePattern loadConstraint(String technology, String constraintId) throws IOException {
		String patternpath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER + "/" + constraintId + "." + Constants.EXTENSION;
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
            log("Thread was interrupted");
			logError(e);
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
            log("Thread was interrupted");
			logError(e);
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
			logError(e);
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
            log("Thread was interrupted");
			logError(e);
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

	public static void putResponse(HttpServletResponse response, int id, JSONObject jsonObject, int responseCode) throws IOException {
		logOutput(jsonObject, id);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.setStatus(responseCode);
        response.getWriter().write(jsonObject.toString());
	}

	public static void putResponse(HttpServletResponse response, int id, JSONArray jsonArray, int responseCode) throws IOException {
		logOutput(jsonArray, id);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.setStatus(responseCode);
        response.getWriter().write(jsonArray.toString());
	}

	public static void putResponse(HttpServletResponse response, int id, String text, int responseCode) throws IOException {
		logOutput(text, id);
	    response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        response.setStatus(responseCode);
        response.getWriter().write(text);
	}
	
	public static void putResponse(HttpServletResponse response, int id, File file, int responseCode, String contentType) throws IOException {
		
		if (file == null || !file.exists()) {
		    response.sendError(HttpServletResponse.SC_NOT_FOUND, "File not found");
		    return;
		}
		
        response.setStatus(responseCode);
	    response.setContentType(contentType);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + file.getName() + "\"");
        response.setContentLengthLong(file.length());

        try (InputStream in = new FileInputStream(file);
                OutputStream out = response.getOutputStream()) {
        	byte[] buffer = new byte[8192];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
            	out.write(buffer, 0, bytesRead);
            }
            out.flush();
        }
	}

	public static void putResponseError(HttpServletResponse response, int id, Exception error, int responseCode) throws IOException {
		logError(error);
		JSONObject object = new JSONObject();
		try {
			object.put("error", error.getMessage());
		} catch (JSONException e) {
			logError(e);
		}
		putResponse(response, id, object, responseCode);
	}

	public static void putResponseError(HttpServletResponse response, int id, Exception error) throws IOException {
		int responseCode = HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
		if (error.getClass().equals(InvalidServletCallException.class)) {
			responseCode = HttpServletResponse.SC_BAD_REQUEST;
		}
		if (error.getClass().equals(FailedServletCallException.class)) {
			responseCode = HttpServletResponse.SC_NOT_FOUND;
		}
		putResponseError(response, id, error, responseCode);
	}

	public static void putResponse(HttpServletResponse response, int id, JSONObject jsonObject) throws IOException {
        putResponse(response, id, jsonObject, HttpServletResponse.SC_OK);
	}
	public static void putResponse(HttpServletResponse response, int id, JSONArray jsonArray) throws IOException {
        putResponse(response, id, jsonArray, HttpServletResponse.SC_OK);
	}
	public static void putResponse(HttpServletResponse response, int id, String text) throws IOException {
        putResponse(response, id, text, HttpServletResponse.SC_OK);
	}


	// LOGGING

	public static void log(String text) {
		boolean acquired = false;
		boolean deleteOldLogs = false;
		try {
			saveSemaphore.acquire();
			acquired = true;
			String filepath = getLogfileName();
			File file = new File(filepath);
		    file.getParentFile().mkdirs();
	        if (!file.exists()) {
	            File directory = new File(getLogfileDirectory());
	            if (!directory.exists()) {
					directory.mkdirs();
				}
	            Files.write(Paths.get(filepath), new byte[0], StandardOpenOption.CREATE);
	            System.out.println("File created successfully: " + filepath);
	            deleteOldLogs = true;
	        }
	        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));

	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
				writer.newLine();
				writer.write("[" + timestamp + "] " + text);
			}
        } catch (IOException e) {
        	if (acquired)
        		saveSemaphore.release();
        	acquired = false;
            logError(e);
        } catch (InterruptedException e) {
        	if (acquired)
        		saveSemaphore.release();
        	acquired = false;
            Thread.currentThread().interrupt();
            log("Thread was interrupted");
			logError(e);
        } finally {
            // Release the semaphore
        	if (acquired)
        		saveSemaphore.release();
        	if (deleteOldLogs)
            	deleteOldLogs();
        }
	}

	private static String getLogfileDirectory() {
		String filepath = "/" + ServletConstants.LOGFILE;

		if (ServletConstants.LOG_IN_FILE_VOLUME) {
			filepath = ServletConstants.FILE_VOLUME + filepath;
		} else {
			filepath = ServletConstants.PATTERN_VOLUME + filepath;
		}
		
		return filepath.substring(0, filepath.lastIndexOf('/'));
	}
	
	private static String getLogfileNameStart() {
		String filepath = "/" + ServletConstants.LOGFILE;
		filepath = filepath.substring(filepath.lastIndexOf('/'));
		filepath = filepath.substring(0,filepath.lastIndexOf('.'));
		return filepath + "-";
	}
	
	private static String getLogfileNameEnd() {
		return ServletConstants.LOGFILE.substring(ServletConstants.LOGFILE.lastIndexOf('.'));
	}
	
	private static String getLogfileName() {
		String filename = getLogfileDirectory();
		filename += getLogfileNameStart();
		filename += LocalDate.now().format(DateTimeFormatter.ofPattern(ServletConstants.LOGDATEFORMAT));
		filename += getLogfileNameEnd();
		return filename;
	}
	
	private static void deleteOldLogs() {
		log("deleting old logfiles");
		String logdir = getLogfileDirectory(), logstart = getLogfileNameStart(), logend = getLogfileNameEnd();

		File logdirectory = new File(logdir);
		File[] filearray = logdirectory.listFiles();

		for (File file: filearray) {
			String name = "/" + file.getName();
			if (name.startsWith(logstart) && name.endsWith(logend)) {
				String date = name.substring(logstart.length(), name.length() - logend.length());
				try {
					if (calculateAgeInDays(date) > ServletConstants.LOGDAYS) {
						file.delete();
						log("Old log deleted: " + name);
					}
				} catch (DateTimeParseException e) {}
			}
		}
	}
	

    public static long calculateAgeInDays(String dateString) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ServletConstants.LOGDATEFORMAT);
        LocalDate inputDate = LocalDate.parse(dateString, formatter);
        LocalDate currentDate = LocalDate.now();
        return ChronoUnit.DAYS.between(inputDate, currentDate);
    }

	public static void logOutput(JSONObject json, int id) {
		logOutput(json.toString(), id);
	}

	public static void logOutput(JSONArray json, int id) {
		logOutput(json.toString(), id);
	}

	public static void logOutput(String text, int id) {
		log("OUTPUT " + id + " : " + text);
	}

	public static void logError(Throwable th) {
		logError(th, -1);
	}

	public static void logError(Throwable th, int lines) {
		int counter = lines;
		boolean all = lines < 0;
		String error = th.getClass().getSimpleName() + ": " + th.getMessage();
		for (StackTraceElement element : th.getStackTrace()) {
			if (all || counter > 0) {
				error += "\r\n    " + element.toString();
				counter--;
			}
        }
        log("ERROR: " + error);
		if(th.getCause() != null) {
			log("CAUSED BY");
			logError(th.getCause(), lines);
		}
	}

	public static int logCall(String clazz, String path, Map<String, String[]> params) {
		int callId = -1;
		try {
			String filepath = ServletConstants.PATTERN_VOLUME + "/" + ServletConstants.SAVEFILE;
			callId = getNextNumber(filepath, "call");
		} catch (JSONException | IOException e) {
			logError(e);
		}
		log("CALL " + callId + ": " + clazz + "(" + path + ")" + mapToString(params));
		return callId;
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
			} catch (JSONException e) {
				logError(e);
			}
		}
		return job.toString();
	}

	public static JSONArray getAvailableParams(List<? extends Fragment> paramfragments) {
		JSONArray available = new JSONArray();
		available.put(ConstantsJSON.NAME);
		available.put(ConstantsJSON.DATABASE);
		available.put(ConstantsJSON.DATAMODEL);
		available.put(ConstantsJSON.NAMESPACES);
		for (Fragment frag: paramfragments) {
			if (frag instanceof ParameterFragment)
				available.put(((ParameterFragment)frag).getId());
		}
		return available;
	}

	public static String makeQueryOneLine(String query) {
		if (query == null)
			return null;
		String shortQuery = query.replace("\r\n", " ");
		shortQuery = shortQuery.replace("\n", " ");
		int len = shortQuery.length() + 1;
		while (shortQuery.length()< len) {
			len = shortQuery.length();
			shortQuery = shortQuery.replace("  ", " ");
		}
		shortQuery = shortQuery.trim();
		return shortQuery;
	}
}

package qualitypatternmodel.newservlets;

import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;
//import qualitypatternmodel.utility.EMFModelSave;

public abstract class ServletUtilities {

	public static String PATTERNFOLDER =  "/templates";
	public static String FILEFOLDER =  "/files";
	public static String SAVE_FILENAME = ((System.getenv("SAVE_FILENAME") != null)? System.getenv("SAVE_FILENAME"): "savefile.txt");
	public static String LOG_FILENAME = ((System.getenv("LOG_FILENAME") != null)? System.getenv("LOG_FILENAME"): "logfile.log");
//	public static String SAVE_FILEPATH = PATTERNFOLDER + "/" + SAVE_FILENAME;
//	public static String LOG_FILEPATH = PATTERNFOLDER + "/" + LOG_FILENAME;
	
	public static final String CONSTRAINTFOLDER = "concrete-patterns";
	public static final String TEMPLATEFOLDER = "abstract-patterns";
	public static final String EXTENSION = "patternstructure";
	public static final String XML = Language.XML.getLiteral();
	public static final String RDF = Language.RDF.getLiteral();
	public static final String NEO4J = Language.NEO4J.getLiteral();
	public static final List<String> TECHS = List.of(XML, RDF, NEO4J);
	public static final String LVLALL = "all";
	public static final String LVLTEMPLATE = "template";
	public static final String LVLCONSTRAINT = "concrete";
	public static final String LVLREADY = "ready";
	public static final List<String> LEVELS = List.of(LVLALL, LVLTEMPLATE, LVLCONSTRAINT, LVLREADY);
	
	// Pattern request
	
	public static List<CompletePattern> getAllPattern(String technology) {
		EList<CompletePattern> patterns = new BasicEList<CompletePattern>();
		List<CompletePattern> astr = getTemplates(technology);
		List<CompletePattern> conc = getReadyConstraints(technology);
		if (astr!=null)
			patterns.addAll(astr);
		if (conc!=null)
			patterns.addAll(conc);
		return patterns;
	}
	
	// for efficiency when requested once, the templates do not need to be reloaded that often
	private static List<CompletePattern> abstractPatternXml = null;
	private static List<CompletePattern> abstractPatternRdf = null;
	private static List<CompletePattern> abstractPatternNeo = null;
	
	public static List<CompletePattern> getTemplates(String technology) {
		String path = PATTERNFOLDER + "/" + technology + "/" + TEMPLATEFOLDER;
		try {
			abstractPatternXml = EMFModelLoad.loadCompletePatternFromFolder(path, EXTENSION);
			if (technology.equals(XML)) {
				if (abstractPatternXml == null)
					abstractPatternXml = EMFModelLoad.loadCompletePatternFromFolder(path, EXTENSION);
				return abstractPatternXml;
			} else if (technology.equals(RDF)) {
				if (abstractPatternRdf == null)
					abstractPatternRdf = EMFModelLoad.loadCompletePatternFromFolder(path, EXTENSION);
				return abstractPatternRdf;
				
			} else if (technology.equals(NEO4J)) {
				if (abstractPatternNeo == null)
					abstractPatternNeo = EMFModelLoad.loadCompletePatternFromFolder(path, EXTENSION);
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

		if (TECHS.contains(technology))
			try {
				return EMFModelLoad.loadCompletePatternFromFolder(PATTERNFOLDER + "/" + technology + "/" + CONSTRAINTFOLDER, EXTENSION);
			} catch (IOException e) {
				e.printStackTrace();
			}
		return new BasicEList<CompletePattern>();
	}
	
	public static List<CompletePattern> getReadyConstraints(String technology) {
		List<CompletePattern> concrete = new BasicEList<CompletePattern>();
		List<CompletePattern> semiconcrete = getConstraints(technology);
		if (semiconcrete != null)
			for (CompletePattern semi: semiconcrete) {
				try {
					semi.isValid(AbstractionLevel.CONCRETE);
					concrete.add(semi);
				} catch (Exception e) {}
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
			json.put(Constants.JSON_TEMPLATES, templates);
			json.put(Constants.JSON_SIZE, patterns.size());
			json.put(Constants.JSON_IDS, ids);
		} catch (JSONException e) {}
		return json;
		
//		String result = "{\"Templates\": [ ";
//		for (CompletePattern pattern: patterns) {
//			result += getPatternJSON(pattern);
//		}
//		return result += "]}"; // templatelist end
	}
	
	public static JSONObject getPatternJSON(CompletePattern pattern) {
		JSONObject json = new JSONObject();
		try {
			json.put(Constants.JSON_PATTERNID, pattern.getPatternId());
			json.put(Constants.JSON_NAME, pattern.getName());
			json.put(Constants.JSON_DESCRIPTION, pattern.getDescription());
			json.put(Constants.JSON_LANGUAGE, pattern.getLanguage());
			if (pattern.getLastSaved() != null)
				json.put(Constants.JSON_LASTSAVED, new Timestamp(pattern.getLastSaved().getTime()).toString());
			if (pattern.getNamespaces() != null)
				json.put(Constants.JSON_NAMESPACES, pattern.getNamespaces().getValuesAsJsonArray());
			if (pattern.getDatabaseName() != null)
				json.put(Constants.JSON_DATABASE, pattern.getDatabaseName());
			if (pattern.getDataModelName() != null)
				json.put(Constants.JSON_DATAMODEL, pattern.getDataModelName());
			if (pattern.getKeywords() != null && !pattern.getKeywords().isEmpty()) {
				JSONArray tags = new JSONArray(pattern.getKeywords());
				json.put(Constants.JSON_TAG, tags);
			}
			
			Boolean mqaf = false;
			Boolean query = false;
			Boolean filter = false;
			try {
				pattern.isValid(AbstractionLevel.CONCRETE);
				filter = pattern.getLanguage().equals(Language.XML);
				try {
					mqaf = MqafTranslationValidation.checkPatternTranslatable(pattern);
				}
				catch (InvalidityException e) {}
				try {
					query = !pattern.containsJavaOperator();
				}
				catch (InvalidityException e) {}
			}
			catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {}
			
			json.put(Constants.JSON_EXECUTABLE , mqaf || query || filter);
			json.put(Constants.JSON_EXECUTABLE_MQAF, mqaf);
			json.put(Constants.JSON_EXECUTABLE_QUERY, query);
			json.put(Constants.JSON_EXECUTABLE_FILTER, filter);

			
			JSONArray variants = new JSONArray();
			for (PatternText text: pattern.getText()) {
				variants.put(text.generateJSONObject());
			}
			json.put(Constants.JSON_VARIANTS, variants);
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
			json.put("patternID", pattern.getPatternId());
			json.put("name", pattern.getName());
			json.put("description", pattern.getDescription());
		} catch (JSONException e) {}
		return json;
	}
	
	// LOAD SAVE DELETE

	protected static CompletePattern loadConstraint(String technology, String name) throws IOException {
		String patternpath = PATTERNFOLDER + "/" + technology + "/" + CONSTRAINTFOLDER + "/" + name + "." + EXTENSION;
		return EMFModelLoad.loadCompletePattern(patternpath);
	};

	protected static CompletePattern loadTemplate(String technology, String templateId) throws IOException {
		String folderPath = PATTERNFOLDER + "/" + technology + "/" + TEMPLATEFOLDER;
		return EMFModelLoad.loadCompletePattern(folderPath, templateId, EXTENSION);
	};

	public static void saveTemplate(String technology, String templateId, CompletePattern pattern) throws IOException {
		String folderpath = PATTERNFOLDER + "/" + technology + "/" + TEMPLATEFOLDER;
		EMFModelSave.exportToFile2(pattern, folderpath, templateId, EXTENSION);
	}

	public static String saveConstraint(String technology, String constraintId, CompletePattern pattern) throws IOException {
		pattern.updateLastSaved();
		String folderpath = PATTERNFOLDER + "/" + technology + "/" + CONSTRAINTFOLDER;
		EMFModelSave.exportToFile2(pattern, folderpath, constraintId, EXTENSION);
		return new Timestamp(pattern.getLastSaved().getTime()).toString();
	}
	
	public static String generateNewId(String technology, String templateId, String variantname) throws IOException {
		String name = technology + "_" + templateId + "_" + variantname;
		String filepath = PATTERNFOLDER + "/" + SAVE_FILENAME;
		Integer number;
		try {
			number = getNextNumber(filepath, name);
		} catch (JSONException | IOException e) {
			number = 0;
		}
		return name + "_" + number;
	}
	
	public static Integer getNextNumber(String filepath, String variableName) throws JSONException, IOException {
        File file = new File(filepath);
        if (!file.exists()) {
            // If the file doesn't exist, create it and initialize with an empty JSON object
            JSONObject jsonObject = new JSONObject();
//            jsonObject.put(variableName, 0);
            Files.write(Paths.get(filepath), jsonObject.toString().getBytes(), StandardOpenOption.CREATE);
            System.out.println("File created successfully: " + filepath);
//            return 0; // Return 0 as the initial value
        }

        // Read JSON file
        String jsonString = new String(Files.readAllBytes(Paths.get(filepath)));
        JSONObject jsonObject = new JSONObject(jsonString);

        // Retrieve the value associated with the provided variable name
        int currentValue;
        if (!jsonObject.has(variableName) || !(jsonObject.get(variableName) instanceof Integer)) {
            // If variable doesn't exist or is not an integer, initialize it with a default value
            currentValue = 0;
            jsonObject.put(variableName, currentValue);
            Files.write(Paths.get(filepath), jsonObject.toString().getBytes());
        } else {
            currentValue = jsonObject.getInt(variableName);
        }

        // Update the JSON with the new value
        jsonObject.put(variableName, currentValue + 1);
        Files.write(Paths.get(filepath), jsonObject.toString().getBytes());

        return currentValue;
	}
	
	public static void deleteConstraint(String technology, String constraintId) throws IOException {
		String patternpath = PATTERNFOLDER + "/" + technology + "/" + CONSTRAINTFOLDER + "/" + constraintId + "." + EXTENSION;
//		patternpath = servletContext.getRealPath(patternpath);
		
		CompletePattern constraint = EMFModelLoad.loadCompletePattern(patternpath);
		if (constraint instanceof CompletePattern)
			Files.delete(Paths.get(patternpath));
		else {
			throw new IOException("Wrong file format");
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
		if (error.getClass().equals(InvalidServletCallException.class))
			responseCode = HttpServletResponse.SC_BAD_REQUEST;
		if (error.getClass().equals(FailedServletCallException.class))
			responseCode = HttpServletResponse.SC_NOT_FOUND;
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
			String filepath = PATTERNFOLDER + "/" + LOG_FILENAME;
			File file = new File(filepath);
		    file.getParentFile().mkdirs();
	        if (!file.exists()) {
	        	String dirPath = filepath.substring(0, filepath.lastIndexOf('/'));
	            File directory = new File(dirPath);
	            if (!directory.exists())
	            	directory.mkdirs();
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
        }
	}
	
	public static void logOutput(JSONObject json) {
		log("OUTPUT: " + json);
	}
	
	public static void logOutput(String text) {
	}
	
	public static void logError(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println(th.getMessage());
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
	
	private static String mapToString(Map<String, String[]> map) {
		JSONObject job = new JSONObject();
		for (String key: map.keySet()) {
			try {
				String[] vals = map.get(key);
				if (vals.length > 1)
					job.put(key, vals[0]);
				else {
					JSONArray jarr = new JSONArray(vals);
					job.put(key, jarr);
				}
			} catch (JSONException e) {}
		}
		return job.toString();
	}
}

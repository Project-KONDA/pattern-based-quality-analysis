package qualitypatternmodel.newservlets;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.constrainttranslation.ConstraintTranslationValidation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
//import qualitypatternmodel.execution.Database;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.textrepresentation.PatternText;
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
	// ---------------
	
	
	public static JSONObject getPatternJSON(List<CompletePattern> patterns) {
		JSONObject json = new JSONObject();
		try {
			JSONArray templates = new JSONArray();
			for (CompletePattern pattern: patterns) {
				templates.put(getPatternJSON(pattern));
			}
			json.put("templates", templates);
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
			json.put("patternID", pattern.getPatternId());
			json.put("name", pattern.getName());
			json.put("shortDescription", pattern.getShortDescription());
			json.put("description", pattern.getDescription());
			if (pattern.getDatabaseName() != null)
				json.put("database", pattern.getDatabaseName());
			if (pattern.getDataModelName() != null)
				json.put("datamodel", pattern.getDataModelName());
			if (pattern.getKeywords() != null && !pattern.getKeywords().isEmpty()) {
				JSONArray tags = new JSONArray(pattern.getKeywords());
				json.put("tag", tags);
			}
			
			Boolean concrete = false;
			Boolean mqaf = false;
			Boolean query = false;
			Boolean filter = false;
			try {
				pattern.isValid(AbstractionLevel.CONCRETE);
				concrete = true;
				filter = true;
			}
			catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {}
			try {
				mqaf = ConstraintTranslationValidation.checkPatternTranslatable(pattern);
			}
			catch (InvalidityException e) {}
			try {
				query = !pattern.containsJavaOperator();
			}
			catch (InvalidityException e) {}
			
			json.put("executable", concrete);
			json.put("mqafexecutable", mqaf);
			json.put("queryexecutable", query);
			json.put("filterexecutable", filter);
			
			JSONArray variants = new JSONArray();
			for (PatternText text: pattern.getText()) {
				variants.put(text.generateJSONObject());
			}
			json.put("variants", variants);
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
			json.put("shortDescription", pattern.getShortDescription());
			json.put("description", pattern.getDescription());
		} catch (JSONException e) {}
		return json;
		
	}

	protected static CompletePattern loadConstraint(String technology, String name) throws IOException {
		String patternpath = PATTERNFOLDER + "/" + technology + "/" + CONSTRAINTFOLDER + "/" + name + "." + EXTENSION;
		return EMFModelLoad.loadCompletePattern(patternpath);
	};

	protected static CompletePattern loadTemplate(String technology, String templateId) throws IOException {
		String folderPath = PATTERNFOLDER + "/" + technology + "/" + TEMPLATEFOLDER;
		return EMFModelLoad.loadCompletePattern(folderPath, templateId, EXTENSION);
	};

	public static void saveConstraint(String technology, String constraintId, CompletePattern pattern) throws IOException {
		String folderpath = PATTERNFOLDER + "/" + technology + "/" + CONSTRAINTFOLDER;
		EMFModelSave.exportToFile2(pattern, folderpath, constraintId, EXTENSION);
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
	
	public static void logOutput(String text) {
		log("OUTPUT: " + text);
	}
	
	public static void logError(String message, StackTraceElement[] stackTrace) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println(message);
        for (StackTraceElement element : stackTrace) {
            printWriter.println("    " + element.toString());
        }
        log("ERROR: " + stringWriter.toString());
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
}

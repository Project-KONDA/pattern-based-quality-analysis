package qualitypatternmodel.newservlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.mqaftranslation.MqafTranslationValidation;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.textrepresentation.Fragment;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;
import qualitypatternmodel.utility.Util;

public abstract class ServletUtilities {

	// for efficiency when requested once, the templates do not need to be reloaded that often
	private static List<CompletePattern> abstractPatternXml = null;
	private static List<CompletePattern> abstractPatternRdf = null;
	private static List<CompletePattern> abstractPatternNeo = null;
	private static List<JSONObject> abstractPatternJsonXml = null;
	private static List<JSONObject> abstractPatternJsonRdf = null;
	private static List<JSONObject> abstractPatternJsonNeo = null;
	private static Semaphore saveSemaphore = new Semaphore(1);
	
	public static void reset() {
		abstractPatternXml = null;
		abstractPatternRdf = null;
		abstractPatternNeo = null;
		abstractPatternJsonXml = null;
		abstractPatternJsonRdf = null;
		abstractPatternJsonNeo = null;
		
	}

	// Pattern request
	public static List<CompletePattern> getAllPattern(String technology) {
		EList<CompletePattern> patterns = new BasicEList<CompletePattern>();
		List<CompletePattern> astr = getTemplates(technology);
		List<CompletePattern> conc = getReadyConstraints(technology);
		if (astr != null) {
			patterns.addAll(astr);
		}
		if (conc != null) {
			patterns.addAll(conc);
		}
		return patterns;
	}

	// Pattern request
	public static List<JSONObject> getAllPatternJsons(String technology) {
		List<JSONObject> patterns = getTemplateJSONs(technology);
		patterns.addAll(getConstraintJSONs(technology));
		sortByKey(patterns, ConstantsJSON.CONSTRAINT_ID);
		return patterns;
	}

	public static List<CompletePattern> getTemplates(String technology) {
		String path = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TEMPLATEFOLDER;
		try {
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
		} catch (Exception e) {
			logError(e);
			return null;
		}
	}

	public static List<CompletePattern> getConstraints(String technology) {

		if (Constants.TECHS.contains(technology)) {
			try {
				String constraintfolder = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER;
				return EMFModelLoad.loadCompletePatternFromFolder(constraintfolder, Constants.EXTENSION);
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
			for (CompletePattern semi : semiconcrete) {
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

	public static List<JSONObject> getTemplateJSONs(String technology) {
		String patternfolder = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TEMPLATEFOLDER;
		String jsonfolder = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TEMPLATEFOLDER + "/" + ServletConstants.PATTERNJSONFOLDER;
		try {
			if (technology.equals(Constants.XML)) {
				if (abstractPatternJsonXml == null) {
					abstractPatternJsonXml = EMFModelLoad.loadPatternJSONsFromFolder(patternfolder, jsonfolder, Constants.EXTENSION);
					sortByKey(abstractPatternJsonXml, ConstantsJSON.CONSTRAINT_ID);
				}
				return abstractPatternJsonXml;
			} else if (technology.equals(Constants.RDF)) {
				if (abstractPatternJsonRdf == null) {
					abstractPatternJsonRdf = EMFModelLoad.loadPatternJSONsFromFolder(patternfolder, jsonfolder, Constants.EXTENSION);
					sortByKey(abstractPatternJsonRdf, ConstantsJSON.CONSTRAINT_ID);
				}
				return abstractPatternJsonRdf;

			} else if (technology.equals(Constants.NEO4J)) {
				if (abstractPatternJsonNeo == null) {
					abstractPatternJsonNeo = EMFModelLoad.loadPatternJSONsFromFolder(patternfolder, jsonfolder, Constants.EXTENSION);
					sortByKey(abstractPatternJsonNeo, ConstantsJSON.CONSTRAINT_ID);
				}
				return abstractPatternJsonNeo;
			} else {
				return null;
			}
		} catch (Exception e) {
			logError(e);
			return null;
		}
	}

	public static List<JSONObject> getConstraintJSONs(String technology) {
		String constraintfolderpath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER;
		String jsonfolderpath = constraintfolderpath + "/" + ServletConstants.PATTERNJSONFOLDER;

		if (Constants.TECHS.contains(technology)) {
			try {
				List<JSONObject> jsons = EMFModelLoad.loadPatternJSONsFromFolder(constraintfolderpath, jsonfolderpath, Constants.EXTENSION); 
				sortByKey(jsons, ConstantsJSON.CONSTRAINT_ID);
				return jsons;
			} catch (IOException e) {
				logError(e);
			}
		}
		return new BasicEList<JSONObject>();
	}

	public static List<JSONObject> getReadyConstraintJSONs(String technology) {
		List<JSONObject> constraintjsons = getConstraintJSONs(technology);
		List<JSONObject> readyconstraintjsons = new BasicEList<JSONObject>();
		for (JSONObject json : constraintjsons) {
			if (json.getBoolean(ConstantsJSON.EXECUTABLE)) {
				readyconstraintjsons.add(json);
			}
		}
		return readyconstraintjsons;
	}

	public static JSONObject getPatternListJSON(List<CompletePattern> patterns) {
		JSONObject json = new JSONObject();
		JSONArray ids = new JSONArray();
		HashSet<String> uniqueTags = new HashSet<>();
		JSONArray tags = new JSONArray();
		try {
			JSONArray templates = new JSONArray();
			for (CompletePattern pattern : patterns) {
				ids.put(pattern.getPatternId());
				templates.put(getPatternJSON(pattern));
				if (pattern.getKeywords() != null)
					uniqueTags.addAll(pattern.getKeywords());
			}
			tags.putAll(uniqueTags);
			json.put(ConstantsJSON.TEMPLATES, templates);
			json.put(ConstantsJSON.SIZE, patterns.size());
			json.put(ConstantsJSON.IDS, ids);
			if (!tags.isEmpty())
				json.put(ConstantsJSON.TAGS, tags);
		} catch (JSONException e) {
			logError(e);
		}
		return json;
	}

	public static void sortByKey(List<JSONObject> jsons, String key) {
	    jsons.sort(Comparator.comparing(o -> o.optString(key, "")));
	}

	public static JSONObject combinePatternJSONs(List<JSONObject> patternjsons) {
		JSONObject resultjson = new JSONObject();
		JSONArray ids = new JSONArray();
		HashSet<String> uniqueTags = new HashSet<>();
		try {
			JSONArray templates = new JSONArray();
			for (JSONObject patternjson : patternjsons) {
				ids.put(patternjson.getString(ConstantsJSON.CONSTRAINT_ID));
				templates.put(patternjson);
				if (patternjson.has(ConstantsJSON.TAG)) {
					JSONArray tags = patternjson.getJSONArray(ConstantsJSON.TAG);
					for (int i = 0; i < tags.length(); i++) {
						uniqueTags.add(tags.getString(i));
					}
				}
			}
			JSONArray tags = new JSONArray();
			tags.putAll(uniqueTags);
			resultjson.put(ConstantsJSON.TEMPLATES, templates);
			resultjson.put(ConstantsJSON.SIZE, patternjsons.size());
			resultjson.put(ConstantsJSON.IDS, ids);
			if (!tags.isEmpty())
				resultjson.put(ConstantsJSON.TAGS, tags);
		} catch (JSONException e) {
			e.printStackTrace();
			logError(e);
		}
		return resultjson;
	}

	public static JSONObject getPatternJSON(CompletePattern pattern) {
		JSONObject json = new JSONObject();
		try {
			json.put(ConstantsJSON.CONSTRAINT_ID, pattern.getPatternId());
			json.put(ConstantsJSON.NAME, pattern.getName());
			json.put(ConstantsJSON.DESCRIPTION, pattern.getDescription());
			json.put(ConstantsJSON.LANGUAGE, pattern.getLanguage().getLiteral());
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
				} catch (InvalidityException e) {
					// not mqaf translateable
				}
				try {
					query = !pattern.containsJavaOperator();
				} catch (InvalidityException e) {
					// not query translateable
				}
			} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
				// not translateable
			}

			json.put(ConstantsJSON.EXECUTABLE, mqaf || query || filter);
			json.put(ConstantsJSON.EXECUTABLE_MQAF, mqaf);
			json.put(ConstantsJSON.EXECUTABLE_QUERY, query);
			json.put(ConstantsJSON.EXECUTABLE_FILTER, filter);

			JSONArray variants = new JSONArray();
			for (PatternText text : pattern.getText()) {
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
		for (CompletePattern pattern : patterns) {
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

	public static void exportJsonSave(JSONObject jsonFile, String filepath) throws IOException {
		try {
			saveSemaphore.acquire();
			Util.exportJson(jsonFile, filepath);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			log("Thread was interrupted");
			logError(e);
		} finally {
			saveSemaphore.release();
		}
	}

	protected static CompletePattern loadConstraint(String technology, String constraintId) throws IOException {
		String patternpath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER + "/" + constraintId + "." + Constants.EXTENSION;
		return EMFModelLoad.loadCompletePattern(patternpath);
	}

	protected static JSONObject loadConstraintJson(String technology, String constraintId) throws IOException {
		String folderpath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER + "/";
		String patternpath = folderpath + constraintId + "." + Constants.EXTENSION;
		String jsonpath = folderpath + ServletConstants.PATTERNJSONFOLDER + "/" + constraintId + ".json";

		// if precompiled patternjson exists
		try {
			return Util.loadJson(jsonpath); 
		} catch (Exception e) {}

		// if precompiled patternjson does not exist
		CompletePattern pattern = EMFModelLoad.loadCompletePattern(patternpath);
		JSONObject json = ServletUtilities.getPatternJSON(pattern);

		exportJsonSave(json, jsonpath);
		return json;
	}

	protected static JSONObject loadConstraintQueryJson(String technology, String constraintId) throws IOException, JSONException, InvalidServletCallException, FailedServletCallException {
		String folderpath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER + "/";
		String patternpath = folderpath + constraintId + "." + Constants.EXTENSION;
		String queryjsonpath = folderpath + ServletConstants.QUERYJSONFOLDER + "/" + constraintId + ".json";
		String patternjsonpath = folderpath + ServletConstants.PATTERNJSONFOLDER + "/" + constraintId + ".json";

		// if precompiled queryjson exists
		try {
			return Util.loadJson(queryjsonpath); 
		} catch (Exception e) {}

		// if precompiled queryjson does not exist
		CompletePattern pattern = EMFModelLoad.loadCompletePattern(patternpath);
		JSONObject queryjson = ConstraintQueryServlet.generateQueryJson(pattern, technology);
		exportJsonSave(queryjson, queryjsonpath);

		if (!new File(patternjsonpath).exists()) {
			JSONObject json = ServletUtilities.getPatternJSON(pattern);
			exportJsonSave(json, patternjsonpath);
		}

		return queryjson;
	}

	public static CompletePattern loadTemplate(String technology, String templateId) throws IOException {
		String folderPath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TEMPLATEFOLDER;
		return EMFModelLoad.loadCompletePattern(folderPath, templateId, Constants.EXTENSION);
	}

	protected static JSONObject loadTemplateJSON(String technology, String templateId) throws IOException {
		String jsonfilepath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TEMPLATEFOLDER + "/" + ServletConstants.PATTERNJSONFOLDER + "/" + templateId + ".json";
		try {
			return Util.loadJson(jsonfilepath);
		} catch (Exception e) {}

		JSONObject json = ServletUtilities.getPatternJSON(loadTemplate(technology, templateId));
		exportJsonSave(json, jsonfilepath);
		return json;
	}

	protected static JSONObject loadTemplateVariantJSON(String technology, String templateId) throws IOException {
		String variantjsonfilepath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TEMPLATEFOLDER + "/" + ServletConstants.VARIANTJSONFOLDER + "/" + templateId + ".json";
		try {
			return Util.loadJson(variantjsonfilepath);
		} catch (Exception e) {}

		JSONObject variantjson = getVariantJSON(loadTemplate(technology, templateId), true);
		exportJsonSave(variantjson, variantjsonfilepath);
		return variantjson;
	}

	public static void saveGeneric(String patternId, CompletePattern pattern) throws IOException {
		String folderpath = ServletConstants.PATTERN_VOLUME + "/" + ServletConstants.GENERICFOLDER;
		try {
			saveSemaphore.acquire();
			EMFModelSave.exportToFile2(pattern, folderpath, patternId, Constants.EXTENSION);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			log("Thread was interrupted");
			logError(e);
		} finally {
			saveSemaphore.release();
		}
		
	}

	public static void saveTemplate(String technology, String templateId, CompletePattern pattern) throws IOException {
		String folderpath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TEMPLATEFOLDER;
		try {
			saveSemaphore.acquire();
			EMFModelSave.exportToFile2(pattern, folderpath, templateId, Constants.EXTENSION);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			log("Thread was interrupted");
			logError(e);
		} finally {
			saveSemaphore.release();
		}

		// patternjson
		JSONObject json = getPatternJSON(pattern);
		String filepath = folderpath + "/" + ServletConstants.PATTERNJSONFOLDER + "/" + templateId + ".json";
		exportJsonSave(json, filepath);

		// variantjson
		JSONObject variantjson = ServletUtilities.getVariantJSON(pattern, true);
		String variantfilepath = folderpath + "/" + ServletConstants.VARIANTJSONFOLDER + "/" + templateId + ".json";
		exportJsonSave(variantjson, variantfilepath);
	}

	public static String saveConstraint(String technology, String constraintId, CompletePattern pattern)
			throws IOException {
		String folderpath = ServletConstants.constraintFolderPath(technology);
		String patternjsonfilepath = ServletConstants.constraintPatternFolderPath(technology) + "/" + constraintId
				+ ".json";
		String queryjsonfilepath = ServletConstants.constraintQueryFolderPath(technology) + "/" + constraintId + ".json";
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

		// patternjson
		JSONObject json = getPatternJSON(pattern);
		exportJsonSave(json, patternjsonfilepath);

		// queryjson
		if (json.getBoolean(ConstantsJSON.EXECUTABLE)) {
			try {
				JSONObject queryjson = ConstraintQueryServlet.generateQueryJson(pattern, technology);
				exportJsonSave(queryjson, queryjsonfilepath);
			} catch (Exception e) {}
		} else {
			Path path = Paths.get(queryjsonfilepath);
			try {
			    Files.deleteIfExists(path); // throws exception if deletion fails
			} catch (IOException e) {
			    logError(e);
			}
		}
		return new Timestamp(pattern.getLastSaved().getTime()).toString();
	}

	public static boolean fileExistsWithAnyExtension(String folderPath, String filename) {
		if (folderPath == null)
			return false;
	    Path dir = Paths.get(folderPath);
	    if (!Files.isDirectory(dir)) {
	        return false;
	    }
	    try {
	        return Files.list(dir).anyMatch(path -> path.getFileName().toString().startsWith(filename));
	    } catch (IOException e) {
	        return false;
	    }
	}

	public static String generateNewId(String technology, String templateId, String variantname, String folder) throws IOException {
//		String name = technology + "_" + templateId + "_" + variantname;
		if (templateId.contains("generic"))
			logError(new RuntimeException("Id with generic (ServletUtilities 614)"));
		String name = templateId + "_" + variantname;
		String id = null;
		Integer number;
		boolean success = false;
		while (!success) {
			try {
				number = increaseNumber(ServletConstants.SAVEFILE, name, null);
			} catch (JSONException | IOException e) {
				logError(e);
				number = 0;
			}
			id = name + "_" + number;
			success = !fileExistsWithAnyExtension(folder, id);
		}
		return id;
	}

	public static void setNumber(String filepath, String variableName, int number, String category) throws JSONException, IOException {
		JSONObject jsonFile;
		try {
			jsonFile = Util.loadJson(filepath);
		} catch (IOException e) {
			jsonFile = new JSONObject();
		}
		JSONObject target = jsonFile;
		if (category == null) {
			target = jsonFile;
		}
		else {
			target = jsonFile.optJSONObject(category);
			if (target == null) {
			    target = new JSONObject();
			    jsonFile.put(category, target);
			}
		}
		target.put(variableName, number);
		exportJsonSave(jsonFile, filepath);
	}

	public static Integer getNumber(String filepath, String variableName, String category) throws JSONException, IOException {
		JSONObject jsonFile;
		try{
			jsonFile = Util.loadJson(filepath);
		} catch (IOException e) {
			jsonFile = new JSONObject();
		}
		JSONObject jsonObject = jsonFile;
		if (category != null) {
			jsonObject = jsonFile.optJSONObject(category);
			if (jsonObject == null) {
			    return 0;
			}
		}
		return jsonObject.optInt(variableName, 0);
	}

	public static Integer increaseNumber(String filepath, String variableName, String category) throws JSONException, IOException {
		JSONObject jsonFile;
		try {
			jsonFile = Util.loadJson(filepath);
		} catch (IOException e) {
			jsonFile = new JSONObject();
		}
		JSONObject target = jsonFile;
		if (category == null) {
			target = jsonFile;
		}
		else {
			target = jsonFile.optJSONObject(category);
			if (target == null) {
			    target = new JSONObject();
			    jsonFile.put(category, target);
			}
		}
		int next = target.optInt(variableName, 0) + 1;
		target.put(variableName, next);
		exportJsonSave(jsonFile, filepath);
		return next;
	}

	public static Integer decreaseNumber(String filepath, String variableName, String category) throws JSONException, IOException {
		JSONObject jsonFile;
		try {
			jsonFile = Util.loadJson(filepath);
		} catch (IOException e) {
			jsonFile = new JSONObject();
		}
		JSONObject target = jsonFile;
		if (category == null) {
			target = jsonFile;
		}
		else {
			target = jsonFile.optJSONObject(category);
			if (target == null) {
			    target = new JSONObject();
			    jsonFile.put(category, target);
			}
		}
		int current = target.optInt(variableName, -1);
		int next = current - 1;
		if (current == -1)
			return 0;
		if (current == 0 || current == 1) {
			target.remove(variableName);
		} else {
			target.put(variableName, next);
		}
		exportJsonSave(jsonFile, filepath);
		return next;
	}

	public static void deleteConstraint(String technology, String constraintId) throws IOException {
		String patternpath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER + "/" + constraintId + "." + Constants.EXTENSION;
		String trashbin = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TRASHBINFOLDER;
		String trashbinpath = trashbin + "/" + constraintId + "." + Constants.EXTENSION;
		String jsonpath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER + "/" + ServletConstants.PATTERNJSONFOLDER + "/" + constraintId + ".json";
		String queryjsonpath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER + "/" + ServletConstants.QUERYJSONFOLDER + "/" + constraintId + ".json";

		File trashbindir = new File(trashbin);
		if (!(trashbindir.exists())) {
			trashbindir.mkdirs();
		}

		CompletePattern constraint = EMFModelLoad.loadCompletePattern(patternpath);
		if (constraint instanceof CompletePattern) {
			increaseNumber(ServletConstants.SAVEFILECOUNT, constraint.getAbstractId(), ConstantsJSON.COUNTER_DELETE);
			try {
				Files.move(Paths.get(patternpath), Paths.get(trashbinpath));
			} catch (Exception e){
				logError(e);
				try {
					Files.delete(Paths.get(patternpath));
				} catch (Exception f) {}
			}
			try {
				Files.delete(Paths.get(jsonpath));
			} catch (Exception e) {}
			try {
				Files.delete(Paths.get(queryjsonpath));
			} catch (Exception e) {}
		} else {
			throw new IOException(ConstantsError.INVALID_FILEFORMAT);
		}
	}
	
	public static void clearTrashbin() {
		for (Language language: Language.VALUES) {
			String technology = language.getLiteral();
			String trashbinfolder = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.TRASHBINFOLDER;
		    Path dir = Paths.get(trashbinfolder);

		    if (!Files.exists(dir)) {
		        return; // nothing to do
		    }

		    if (!Files.isDirectory(dir)) {
		        throw new IllegalArgumentException("Path is not a directory: " + trashbinfolder);
		    }

		    try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
		        for (Path entry : stream) {
		            if (Files.isRegularFile(entry)) {
		                Files.delete(entry);
		            }
		        }
		    } catch (IOException e) {
				logError(e);
			}
		}
	}


	// RESPONSE HANDLING

	public static void putResponse(HttpServletResponse response, int id, Object object, int responseCode) throws IOException {
		logOutput(object, id);
		putResponseUnlogged(response, object, responseCode);
	}

	public static void putResponseUnlogged(HttpServletResponse response, Object object, int responseCode) throws IOException {
		response.setStatus(responseCode);
		if (object instanceof JSONArray || object instanceof JSONObject) {
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(object.toString());
			return;
		}
		if (object instanceof String) {
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			response.setStatus(responseCode);
		}
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

	public static void putResponse(HttpServletResponse response, int id, JSONObject jsonObject) throws IOException {
		putResponse(response, id, jsonObject, HttpServletResponse.SC_OK);
	}

	public static void putResponse(HttpServletResponse response, int id, JSONArray jsonArray) throws IOException {
		putResponse(response, id, jsonArray, HttpServletResponse.SC_OK);
	}

	public static void putResponse(HttpServletResponse response, int id, String text) throws IOException {
		putResponse(response, id, text, HttpServletResponse.SC_OK);
	}

	public static JSONObject getTemplateInfo(String classname) throws IOException {
		JSONObject obj = Util.loadJson(ServletConstants.TEMPLATE_INFO_FILE);
		return obj.getJSONObject(classname);
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
			if (file.getParentFile() != null) {
				file.getParentFile().mkdirs();
			}
				
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
		if (ServletConstants.LOGFILE.contains("/"))
			return ServletConstants.LOGFILE.substring(0, ServletConstants.LOGFILE.lastIndexOf('/'));
		else 
			return "/";
	}

	private static String getLogfileNameStart() {
		String filepath = ServletConstants.LOGFILE;
		if (filepath.contains("/"))
			filepath = filepath.substring(filepath.lastIndexOf('/'));
		if (filepath.contains("."))
			filepath = filepath.substring(0, filepath.lastIndexOf('.'));
		return filepath + "-";
	}

	private static String getLogfileNameEnd() {
		if (ServletConstants.LOGFILE.contains("."))
			return ServletConstants.LOGFILE.substring(ServletConstants.LOGFILE.lastIndexOf('.'));
		return ".log";
	}

	private static String getLogfileName() {
		String filename = getLogfileDirectory();
		filename += getLogfileNameStart();
		filename += LocalDate.now().format(DateTimeFormatter.ofPattern(ServletConstants.LOGDATEFORMAT));
		filename += getLogfileNameEnd();
		return filename;
	}

	public static void deleteOldLogs() {
		log("deleting old logfiles");
		String logdir = getLogfileDirectory(), logstart = getLogfileNameStart(), logend = getLogfileNameEnd();

		File logdirectory = new File(logdir);
		File[] filearray = logdirectory.listFiles();

		for (File file : filearray) {
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
		try {
			setNumber(ServletConstants.SAVEFILE, "call", 0, null);
			clearTrashbin();
		} catch (JSONException | IOException e) {
			logError(e);
		}
	}

	public static long calculateAgeInDays(String dateString) throws DateTimeParseException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ServletConstants.LOGDATEFORMAT);
		LocalDate inputDate = LocalDate.parse(dateString, formatter);
		LocalDate currentDate = LocalDate.now();
		return ChronoUnit.DAYS.between(inputDate, currentDate);
	}

	public static void logOutput(Object object, int id) {
		String value;
		if (object instanceof String) {
			value = (String) object;
		} else {
			value = object.toString();
		}
		log("OUTPUT " + id + " : " + value);
	}

	public static void logError(Throwable th) {
		logError(th, -1);
	}

	public static void logError(Throwable th, int lines) {
		int counter = lines;
		boolean all = lines < 0;
		boolean breaking = false;
		String error = th.getClass().getSimpleName() + ": " + th.getMessage();
		for (StackTraceElement element : th.getStackTrace()) {
			if (all || counter > 0) {
				String message = element.toString();
				if ((message.contains("qualitypatternmodel.") || message.contains("test") || message.contains("Test")))
					breaking = true;
				if (breaking && !(message.contains("qualitypatternmodel.") || message.contains("test") || message.contains("Test"))) {
					break;
				}
				error += "\r\n    " + message;
				counter--;
			}
		}
		log("ERROR: " + error);
		if (th.getCause() != null) {
			log("CAUSED BY");
			logError(th.getCause(), lines);
		}
	}

	public static int getNewCallID() {
		int callId = -1;
		try {
			callId = increaseNumber(ServletConstants.SAVEFILE, "call", null);
		} catch (JSONException | IOException e) {
			logError(e);
		}
		return callId;
	}

	public static int logCall(String method, String clazz, String path, JSONObject params) {
		int callId = getNewCallID();
		log("CALL " + callId + ": " + method + " "+ clazz + "(" + path + ") " + params);
		return callId;
	}

	public static int logCall(String method, String clazz, String path, Map<String, String[]> params) {
		return logCall(method, clazz, path, mapToJSON(params));
	}

	public static JSONObject mapToJSON(Map<String, String[]> map) {
		JSONObject job = new JSONObject();
		for (String key : map.keySet()) {
			try {
				String[] vals = map.get(key);
				if (vals.length == 1) {
					job.put(key, vals[0]);
				} else {
					JSONArray jarr = new JSONArray(vals);
					job.put(key, jarr);
				}
			} catch (JSONException e) {
				logError(e);
			}
		}
		return job;
	}

	public static Map<String, String[]>  jsonToMap(JSONObject map) {
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		for (String key: map.keySet()) {
			if (map.get(key) instanceof JSONArray) {
				JSONArray array = map.getJSONArray(key);
				String[] values = new String[array.length()];
				for (int i = 0; i<array.length(); i++) {
					values[i] = array.get(i).toString();
				}
				parameterMap.put(key, values);
			} else {
				parameterMap.put(key, new String[]{map.get(key).toString()});
			}
		}
		return parameterMap;
	}

	public static JSONArray getAvailableParams(List<? extends Fragment> paramfragments) {
		JSONArray available = new JSONArray();
		available.put(ConstantsJSON.NAME);
		available.put(ConstantsJSON.DATABASE);
		available.put(ConstantsJSON.DATAMODEL);
		available.put(ConstantsJSON.NAMESPACES);
		for (Fragment frag : paramfragments) {
			if (frag instanceof ParameterFragment)
				available.put(((ParameterFragment) frag).getId());
		}
		return available;
	}

	public static String makeQueryOneLine(String query) {
		if (query == null)
			return null;
		String shortQuery = query.replace("\r\n", " ");
		shortQuery = shortQuery.replace("\n", " ");
		int len = shortQuery.length() + 1;
		while (shortQuery.length() < len) {
			len = shortQuery.length();
			shortQuery = shortQuery.replace("  ", " ");
		}
		shortQuery = shortQuery.trim();
		return shortQuery;
	}

	static JSONObject getVariantJSON(CompletePattern pattern, Boolean putvariants) {

		JSONObject parameter = new JSONObject();
		int i = 0;
		for (Parameter param : pattern.getParameterList().getParameters()) {
			try {
				JSONObject paramobj = new JSONObject();
				paramobj.put(ConstantsJSON.TYPE, param.getClass().getSimpleName());
				paramobj.put(ConstantsJSON.ROLE, ParameterFragmentImpl.getRole(param));
				if (param.getValueAsString() != null)
					paramobj.put(ConstantsJSON.VALUE, param.getValueAsString());

				paramobj.put(ConstantsJSON.ID, param.getInternalId());
				if (param instanceof XmlPathParam) {
					HashSet<Integer> sourceParamIds = TemplateVariantServlet.getSourceParamIDs((XmlPathParam) param);
					if (!sourceParamIds.isEmpty()) {
						paramobj.put(ConstantsJSON.STARTPOINT, new JSONArray(sourceParamIds));
					}
				}
				parameter.put(Integer.toString(i), paramobj);
				// parameter.put(Integer.toString(i), ParameterFragmentImpl.getRole(param));
			} catch (JSONException e) {
			}
			i++;
		}

		JSONArray variants = new JSONArray();
		if (putvariants) {
			for (PatternText text : pattern.getText()) {
				variants.put(text.generateVariantJSONObject());
			}
		}

		JSONObject result = new JSONObject();
		try {
			if (putvariants)
				result.put(ConstantsJSON.VARIANTS, variants);
			result.put(ConstantsJSON.PARAMETER, parameter);
		} catch (JSONException e) {
		}

		return result;
	}

	public static JSONObject extractJSON(HttpServletRequest request) throws IOException, JSONException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = request.getReader()) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        }

        String body = sb.toString().trim();
        if (body.isEmpty()) {
            return new JSONObject(); // no content
        }
        return new JSONObject(body);
	}
}

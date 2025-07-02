package qualitypatternmodel.newservlets;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.GenericPatterns;
import qualitypatternmodel.newservlets.initialisation.Neo4jPatterns;
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.newservlets.initialisation.RdfPatterns;
import qualitypatternmodel.newservlets.initialisation.XmlPatterns;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.impl.PatternTextImpl;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

@SuppressWarnings("serial")
public class InitialisationServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		initialisation(getServletContext());
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			JSONObject result = applyGet(path, params);
			ServletUtilities.putResponse(response, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, e);
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doGet(request, response);
	}

	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doGet(request, response);
	}

	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doGet(request, response);
	}

	public static void initialisation(ServletContext scon) throws ServletException {
		
//		ENVIRONMENTAL VARIABLES

//	      SHARED_VOLUME: /shared
		String files = System.getenv().get(ServletConstants.ENV_FILE_VOLUME);
		if (files != null)
			ServletConstants.FILE_VOLUME = files;
		else 
			ServletConstants.FILE_VOLUME = scon.getRealPath(ServletConstants.FILE_VOLUME_DEFAULT);
//	      TEMPLATE_VOLUME: /templates
		String templates = System.getenv().get(ServletConstants.ENV_PATTERN_VOLUME);
		if (templates != null)
			ServletConstants.PATTERN_VOLUME = templates;
		else 
			ServletConstants.PATTERN_VOLUME = scon.getRealPath(ServletConstants.PATTERN_VOLUME_DEFAULT);
//	      UPLOAD_FOLDER: /shared/uploads
		String upload = System.getenv().get(ServletConstants.ENV_UPLOAD_FOLDER);
		if (upload != null)
			ServletConstants.UPLOAD_FOLDER = upload;
		else 
			ServletConstants.UPLOAD_FOLDER = scon.getRealPath(ServletConstants.UPLOAD_FOLDER_DEFAULT);
//	      VARIANTS_FOLDER: /templates/variants
		String variants = System.getenv().get(ServletConstants.ENV_VARIANTS_FOLDER);
		if (variants != null)
			ServletConstants.VARIANTS_FOLDER = variants;
		else 
			ServletConstants.VARIANTS_FOLDER = scon.getRealPath(ServletConstants.VARIANTS_FOLDER_DEFAULT);

//	      LOGFILE: qpm-logfile.log
		String logfile = System.getenv().get(ServletConstants.ENV_LOGFILE);
		if (logfile != null)
			ServletConstants.LOGFILE = logfile;
//	      SAVEFILE: savefile.txt
		String savefile = System.getenv().get(ServletConstants.ENV_SAVEFILE);
		if (savefile != null)
			ServletConstants.SAVEFILE = savefile;

//	      SAVE_LOG_IN_SHARED: true
		String log_in_files = System.getenv().get(ServletConstants.ENV_LOG_IN_FILE_VOLUME);
		if (log_in_files != null)
			ServletConstants.LOG_IN_FILE_VOLUME = log_in_files.equals("true");
//	      FILL_VALUES: false
		String values = System.getenv().get(ServletConstants.ENV_FILL_VALUES);
		if (values != null)
			ServletConstants.FILL_VALUES = values.equals("true");
//		 VARIANTS_TYPE_CONSTRAINT: true
		String constraint_variants = System.getenv().get(ServletConstants.ENV_VARIANTS_TYPE_CONSTRAINT);
		if (constraint_variants != null)
			ServletConstants.VARIANTS_TYPE_CONSTRAINT = constraint_variants.equals("true");
//		 VARIANTS_TYPE_ANTIPATTERN: false
		String antipattern_variants = System.getenv().get(ServletConstants.ENV_VARIANTS_TYPE_ANTIPATTERN);
		if (antipattern_variants != null)
			ServletConstants.VARIANTS_TYPE_ANTIPATTERN = antipattern_variants.equals("true");
//	      OLD_VARIANTS: false
		String old_variants = System.getenv().get(ServletConstants.ENV_OLD_VARIANTS);
		if (old_variants != null)
			ServletConstants.OLD_VARIANTS = old_variants.equals("true");
//	      OVERRIDE_VARIANTS: true
		String override = System.getenv().get(ServletConstants.ENV_OVERRIDE_VARIANTS);
		if (override != null)
			ServletConstants.OVERRIDE_VARIANTS = override.equals("true");
//	      GENERATE_GENERIC: false
		String generate_generic = System.getenv().get(ServletConstants.ENV_GENERATE_GENERIC);
		if (generate_generic != null)
			ServletConstants.GENERATE_GENERIC = generate_generic.equals("true");
//	      VALUE_AS_JSON: true
		String value_as_json = System.getenv().get(ServletConstants.ENV_VALUE_AS_JSON);
		if (value_as_json != null)
			ServletConstants.VALUE_AS_JSON = value_as_json.equals("true");

		System.out.println("Files can be found at " + ServletConstants.PATTERN_VOLUME);
		ServletUtilities.log("Initializing ...");
		ServletUtilities.log("Environmental Variable FILE_VOLUME:               " + files);
		ServletUtilities.log("Environmental Variable PATTERN_VOLUME:            " + templates);
		ServletUtilities.log("Environmental Variable UPLOAD_FOLDER:             " + upload);
		ServletUtilities.log("Environmental Variable VARIANTS_FOLDER:           " + variants);
		ServletUtilities.log("Environmental Variable LOGFILE:                   " + logfile);
		ServletUtilities.log("Environmental Variable SAVEFILE:                  " + savefile);
		ServletUtilities.log("Environmental Variable LOG_IN_FILE_VOLUME:        " + log_in_files);
		ServletUtilities.log("Environmental Variable FILL_VALUES:               " + values);
		ServletUtilities.log("Environmental Variable VARIANTS_TYPE_CONSTRAINT:  " + constraint_variants);
		ServletUtilities.log("Environmental Variable VARIANTS_TYPE_ANTIPATTERN: " + antipattern_variants);
		ServletUtilities.log("Environmental Variable OLD_VARIANTS:              " + old_variants);
		ServletUtilities.log("Environmental Variable OVERRIDE_VARIANTS:         " + override);
		ServletUtilities.log("Environmental Variable GENERATE_GENERIC:          " + generate_generic);
		ServletUtilities.log("Environmental Variable VALUE_AS_JSON:             " + value_as_json);
		
		// CHECK ACCESS TO VOLUMES
//		checkDirectoryAccess(files, ServletConstants.ENV_FILE_VOLUME);
//		checkDirectoryAccess(templates, ServletConstants.ENV_PATTERN_VOLUME);
//		checkDirectoryAccess(upload, ServletConstants.ENV_UPLOAD_FOLDER);
//		if (value_as_json.equals("true"))
//			checkDirectoryAccess(variants, ServletConstants.ENV_VARIANTS_FOLDER);

		try {
			InputStream stream = Thread.currentThread()
				    .getContextClassLoader()
				    .getResourceAsStream("model/MyModel.ecore");
	        if (stream == null) {
	        	ServletUtilities.log("⚠️ Could not find model/MyModel.ecore on classpath.");
	        } else {
	        	ServletUtilities.log("✅ Found model/MyModel.ecore.");
	        }
		} catch (Exception e) {
			ServletUtilities.logError(e);
		}
		
//		EMFInitializer.initialize();
		
//		TEMPLATE INITIALISATION
		try {
			if (ServletConstants.GENERATE_GENERIC) {
				String genericfolder = ServletConstants.PATTERN_VOLUME + "/" + ServletConstants.GENERICFOLDER;
				for (CompletePattern pattern: GenericPatterns.getAllGenericPattern()) {
					String id = pattern.getPatternId();
					if (ServletConstants.OVERRIDE_VARIANTS || !fileExists(genericfolder, id)) {
						pattern.isValid(AbstractionLevel.GENERIC);
						EMFModelSave.exportToFile2(pattern, genericfolder, id, Constants.EXTENSION);
					}
				}
				ServletUtilities.log("generic Patterns created: " + genericfolder);
			}
		} catch (IOException e) {
			ServletUtilities.logError(e);
			new ServletException("Unable to save files.");
		} catch (InvalidityException e) {
			ServletUtilities.logError(e);
			throw new ServletException("Invalid pattern: " + e.getMessage(), e);
		} catch (OperatorCycleException e) {
			ServletUtilities.logError(e);
			throw new ServletException("Invalid pattern (operator cycle): " + e.getMessage());
		} catch (MissingPatternContainerException e) {
			ServletUtilities.logError(e);
			throw new ServletException("Invalid pattern (missing container): " + e.getMessage());
		} catch (Exception e) {
			ServletUtilities.logError(e);
			throw new ServletException("Unexpected Error: " + e.getMessage(), e);
		}


		try {
			String xmlfolder = ServletConstants.PATTERN_VOLUME + "/" + Constants.XML + "/" + ServletConstants.TEMPLATEFOLDER;
			ServletUtilities.log("XML Patterns creation started to :     " + xmlfolder);
			for (PatternBundle patternbundle: XmlPatterns.getAllXmlPatternBundles()) {
				patternbundle.export(xmlfolder, ServletConstants.OVERRIDE_VARIANTS);
			}
			ServletUtilities.log("XML Patterns created:     " + xmlfolder);
		} catch (Exception e) {
			ServletUtilities.logError(e);
		}

		try {
			String rdffolder = ServletConstants.PATTERN_VOLUME + "/" + Constants.RDF + "/" + ServletConstants.TEMPLATEFOLDER;
			ServletUtilities.log("RDF Patterns creation started to :     " + rdffolder);
			for (PatternBundle patternbundle: RdfPatterns.getAllRdfPatternBundles()) {
				patternbundle.export(rdffolder, ServletConstants.OVERRIDE_VARIANTS);
			}
			ServletUtilities.log("RDF Patterns created:     " + rdffolder);
		} catch (Exception e) {
			ServletUtilities.logError(e);
		}

		try {
			String neofolder = ServletConstants.PATTERN_VOLUME + "/" + Constants.NEO4J + "/" + ServletConstants.TEMPLATEFOLDER;
			ServletUtilities.log("NEO4J Patterns creation started to :     " + neofolder);
			for (PatternBundle patternbundle: Neo4jPatterns.getAllNeoPatternBundles()) {
				patternbundle.export(neofolder, ServletConstants.OVERRIDE_VARIANTS);
			}
			ServletUtilities.log("NEO4J Patterns created:   " + neofolder);
		} catch (Exception e) {
			ServletUtilities.logError(e);
		}

		ServletUtilities.log("Checking for Variant initialization");
		ServletUtilities.log("Checking for Variant initialization " + ServletConstants.VALUE_AS_JSON);
		ServletUtilities.log("Checking for Variant initialization " + ServletConstants.VARIANTS_FOLDER);

//		VARIANT INITIALISATION
		if (ServletConstants.VALUE_AS_JSON && ServletConstants.VARIANTS_FOLDER != null && !ServletConstants.VARIANTS_FOLDER.equals("")){
			ServletUtilities.log("Initializing Variants in " + ServletConstants.VARIANTS_FOLDER);
			initializeVariants(ServletConstants.VARIANTS_FOLDER);
		}
        else {
          ServletUtilities.log("No Variants initialized, because VALUE_AS_JSON is false or VARIANTS_FOLDER is not set.");
        }
	}

	private static void initializeVariants(String variants) {
		ArrayList<File> jsonFiles = getAllJSONFilesInFolder(new File(variants));
		ServletUtilities.log("Found " + jsonFiles.size() + " JSON files to specify variants in: " + variants);
		for (File file: jsonFiles) {
			String path = file.getAbsolutePath();
			try {
				JSONObject json = readJsonFromFile(file);
				initializeVariant(json, path);
			} catch (IOException e) {
				ServletUtilities.logError(new InvalidityException("Invalid JSON File on " + path + ": " + e.getMessage()));
			} catch (JSONException e) {
				ServletUtilities.logError(new InvalidityException("Invalid JSON Format of File " + path + ": " + e.getMessage()));
			} catch (InvalidityException e) {
				ServletUtilities.logError(new InvalidityException("Specified Variant of File " + path + " is invalid: " + e.getMessage()), 0);
			}
		}
	}
	
	private static void initializeVariant(JSONObject json, String path) throws IOException, JSONException, InvalidityException {
		String templatefolder = ServletConstants.PATTERN_VOLUME + "/" + json.getString(ConstantsJSON.LANGUAGE) + "/" + ServletConstants.TEMPLATEFOLDER;
		String templateID = json.getString(ConstantsJSON.TEMPLATE);
		
		CompletePattern template = EMFModelLoad.loadCompletePattern(templatefolder, templateID, Constants.EXTENSION);
		new PatternTextImpl(template, json);
		EMFModelSave.exportToFile2(template, templatefolder, templateID, Constants.EXTENSION);
	}

	private static boolean fileExists(String folder, String id) {
		String filepath = folder + "/" + id + "." + Constants.EXTENSION;
		File file = new File(filepath);
	    return file.exists();
	}
	
//	private static void checkDirectoryAccess(String path, String name) throws ServletException {
//		File directory = new File (path);
//		if (!directory.exists() || !directory.isDirectory() || !directory.canRead() || !directory.canWrite()) {
//			ServletException exception = new ServletException("No Access to " + name + ": " + path);
//			ServletUtilities.logError(exception);
//			throw exception;
//		}
//	}
	
	private static ArrayList<File> getAllJSONFilesInFolder(File directory){
		ArrayList<File> files = new ArrayList<File>();
		File[] filearray = directory.listFiles();
		if (filearray != null)
			for (File file: filearray) {
				if (file.isDirectory())
					files.addAll(getAllJSONFilesInFolder(file));
				else {
					if (file.isFile() && file.getName().toLowerCase().endsWith(".json")) {					
						files.add(file);
					}
				}
			}
		return files;
	}
	
	private static JSONObject readJsonFromFile(File file) throws IOException {
        String content = new String(Files.readAllBytes(file.toPath()));
        return new JSONObject(content);
    }
	
	

	public static JSONObject applyGet(String path, Map<String, String[]> params) throws FailedServletCallException {
		if (path == null || path.equals("") || path.equals("/") || path.equals("/status") || path.equals("/health")) {
			JSONObject result = new JSONObject();
			result.put("title", "Quality Pattern Model API");
			result.put("status", "ok");
			result.put("repository", "https://github.com/Project-KONDA/pattern-based-quality-analysis");
			result.put("docs", "https://github.com/Project-KONDA/pattern-based-quality-analysis/blob/master/qualitypatternmodel/openapi.yaml");
			result.put("timestamp", new Timestamp(new Date().getTime()).toString());
			return result;
		}
		else {
			throw new FailedServletCallException("invalid URL");
		}
	}
}

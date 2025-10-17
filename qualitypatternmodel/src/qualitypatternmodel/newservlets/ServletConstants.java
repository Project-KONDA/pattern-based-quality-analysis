package qualitypatternmodel.newservlets;

public class ServletConstants {
	
	// logging
	public static final String LOGDATEFORMAT = "yyyy-MM-dd";
	public static final int LOGDAYS = 7;

	// path to shared volume
	public static String FILE_VOLUME_DEFAULT =  "/files";
	public static String FILE_VOLUME =  "/files";
	public static String ENV_FILE_VOLUME = "SHARED_VOLUME";

	// path to template volume 
	public static String PATTERN_VOLUME_DEFAULT =  "/templates";
	public static String PATTERN_VOLUME =  "/templates";
	public static String ENV_PATTERN_VOLUME = "TEMPLATE_VOLUME";
	
	// path to file upload folder
	public static String UPLOAD_FOLDER_DEFAULT =  "/files/uploads";
	public static String UPLOAD_FOLDER =  "/files/uploads";
	public static String ENV_UPLOAD_FOLDER = "UPLOAD_FOLDER";
	
	// path to file upload folder
	public static String CONSTRAINT_UPLOAD_FOLDER_DEFAULT =  "/templates/uploads";
	public static String CONSTRAINT_UPLOAD_FOLDER =  "/templates/uploads";
	public static String ENV_CONSTRAINT_UPLOAD_FOLDER = "UPLOAD_FOLDER";

	// path to template volume 
	public static String VARIANTS_FOLDER_DEFAULT =  "/templates/variants";
	public static String VARIANTS_FOLDER =  "/templates/variants";
	public static String ENV_VARIANTS_FOLDER = "VARIANTS_FOLDER";



	// name of logfile
	public static String LOGFILE = "logfile.log";
	public static String ENV_LOGFILE = "LOGFILE";

	// name of savefile
	public static String SAVEFILE = "savefile.txt";
	public static String ENV_SAVEFILE = "SAVEFILE";



	// save log in shared
	public static boolean LOG_IN_FILE_VOLUME = false;
	public static String ENV_LOG_IN_FILE_VOLUME = "SAVE_LOG_IN_SHARED";

	// shall there be values in the templates
	public static boolean FILL_VALUES = false;
	public static String ENV_FILL_VALUES = "FILL_VALUES";

	// use the constraint variants for templates
	public static boolean VARIANTS_TYPE_CONSTRAINT = false;
	public static String ENV_VARIANTS_TYPE_CONSTRAINT = "VARIANTS_TYPE_CONSTRAINT";

	// use the antipattern variants for templates
	public static boolean VARIANTS_TYPE_ANTIPATTERN = false;
	public static String ENV_VARIANTS_TYPE_ANTIPATTERN = "VARIANTS_TYPE_ANTIPATTERN";

	// add old variants to templates
	public static boolean OLD_VARIANTS = false;
	public static String ENV_OLD_VARIANTS = "OLD_VARIANTS";

	// shall existing templates be overwritten
	public static boolean OVERRIDE_VARIANTS = true;
	public static String ENV_OVERRIDE_VARIANTS = "OVERRIDE_VARIANTS";

	// also generate generic templates
	public static boolean GENERATE_GENERIC = false;
	public static String ENV_GENERATE_GENERIC = "GENERATE_GENERIC";

	// return values as JSONObject or JSONArray instead of Strings
	public static boolean VALUE_AS_JSON = true;
	public static String ENV_VALUE_AS_JSON = "VALUE_AS_JSON";


	// name of folder for generic templates (only required if GENERATE_GENERIC)
	public static final String GENERICFOLDER = "generic-patterns";
	// name of folder for templates
	public static final String TEMPLATEFOLDER = "abstract-patterns";
	// name of folder for constraints
	public static final String CONSTRAINTFOLDER = "concrete-patterns";
	// name of folder for precompiled patternjson files
	public static final String PATTERNJSONFOLDER = "patternjson";
	// name of folder for precompiled queryjson files
	public static final String QUERYJSONFOLDER = "queryjson";
	// name of folder for precompiled queryjson files
	public static final String VARIANTJSONFOLDER = "variantjson";
}

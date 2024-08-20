package qualitypatternmodel.newservlets;

public class ServletConstants {

	// name of folder
	public static String FILE_VOLUME =  "/files";
	public static String ENV_FILE_VOLUME = "SHARED_VOLUME";
	
	// name of upload folder
	public static String UPLOAD_FOLDER =  "/files/uploads";
	public static String ENV_UPLOAD_FOLDER = "UPLOAD_FOLDER";

	// name of folder 
	public static String PATTERN_VOLUME =  "/templates";
	public static String ENV_PATTERN_VOLUME = "TEMPLATE_VOLUME";

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

	// use the default variants for templates
	public static boolean DEFAULT_VARIANTS = true;
	public static String ENV_DEFAULT_VARIANTS = "DEFAULT_VARIANTS";

	// add old variants to templates
	public static boolean OLD_VARIANTS = false;
	public static String ENV_OLD_VARIANTS = "OLD_VARIANTS";

	// shall existing templates be overwritten
	static boolean OVERRIDE_VARIANTS = true;
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
}

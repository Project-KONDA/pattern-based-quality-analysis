package qualitypatternmodel.newservlets;

public class ServletConstants {

	// CONFIG
	// shall existing templates be overwritten
	static boolean OVERRIDE = true;
	public static String ENV_OVERRIDE = "OVERRIDE";

	// shall there be values in the templates
	public static boolean VALUES = true;
	public static String ENV_VALUES = "VALUES";

	// use the default variants for templates
	public static boolean DEFAULT_VARIANTS = true;
	public static String ENV_DEFAULT_VARIANTS = "DEFAULT_VARIANTS";

	// add old variants to templates
	public static boolean OLD_VARIANTS = false;
	public static String ENV_OLD_VARIANTS = "OLD_VARIANTS";

	// also generate generic templates
	public static boolean GENERATE_GENERIC = false;
	public static String ENV_GENERATE_GENERIC = "GENERATE_GENERIC";

	// return values as JSONObject or JSONArray instead of Strings
	public static boolean VALUE_AS_JSON = true;
	public static String ENV_VALUE_AS_JSON = "VALUE_AS_JSON";

	// name of folder 
	public static String PATTERNFOLDER =  "/templates";
	public static String ENV_TEMPLATE_VOLUME = "TEMPLATE_VOLUME";

	// name of folder
	public static String FILEFOLDER =  "/files";
	public static String ENV_SHARED_VOLUME = "SHARED_VOLUME";

	// name of logfile
	public static String LOG_FILENAME = "logfile.log";
	public static String ENV_LOGFILE = "LOG_FILENAME";

	// name of savefile
	public static String SAVE_FILENAME = "savefile.txt";
	public static String ENV_SAVEFILE = "SAVE_FILENAME";

	// FILE NAMES
	// name of folder for generic templates
	public static final String GENERICFOLDER = "generic-patterns";
	// name of folder for templates
	public static final String TEMPLATEFOLDER = "abstract-patterns";
	// name of folder for constraints
	public static final String CONSTRAINTFOLDER = "concrete-patterns";

}

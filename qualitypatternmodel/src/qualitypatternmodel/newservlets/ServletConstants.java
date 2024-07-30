package qualitypatternmodel.newservlets;

public class ServletConstants {

	// CONFIG
	// shall existing templates be overwritten
	static boolean OVERRIDE = true;
	// shall there be values in the templates
	public static boolean VALUES = true;
	// use the default variants for templates
	public static Boolean DEFAULT_VARIANTS = true;
	// add old variants to templates
	public static Boolean OLD_VARIANTS = false;
	// also generate generic templates
	public static final boolean GENERATE_GENERIC = false;
	// return values as JSONObject or JSONArray instead of Strings
	public static final boolean VALUE_JSON = true;

	// ENVIRONMENTAL VARIABLES
	// name of savefile from environmental variable
	public static String ENV_SAVEFILE = "SAVE_FILENAME";
	// name of logfile from environmental variable
	public static String ENV_LOGFILE = "LOG_FILENAME";
	// name of template volume from environmental variable
	public static String ENV_TEMPLATE_VOLUME = "TEMPLATE_VOLUME";
	// name of shared volume from environmental variable
	public static String ENV_SHARED_VOLUME = "SHARED_VOLUME";

	// FILE NAMES
	// name of folder 
	public static String PATTERNFOLDER =  "/templates";
	// name of folder
	public static String FILEFOLDER =  "/files";
	// name of logfile
	public static String LOG_FILENAME = "logfile.log";
	// name of savefile
	public static String SAVE_FILENAME = "savefile.txt";
	// name of folder for generic templates
	public static final String GENERICFOLDER = "generic-patterns";
	// name of folder for templates
	public static final String TEMPLATEFOLDER = "abstract-patterns";
	// name of folder for constraints
	public static final String CONSTRAINTFOLDER = "concrete-patterns";

}

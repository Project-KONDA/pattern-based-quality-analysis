package qualitypatternmodel.newservlets;

public class ServletConstants {

	// CONFIG
	static boolean OVERRIDE = true;
	public static boolean VALUES = true;
	public static Boolean DEFAULT_VARIANTS = true;
	public static Boolean OLD_VARIANTS = false;
	public static final boolean GENERATE_GENERIC = false;
	public static final boolean VALUE_JSON = true;

	public static String ENV_SAVEFILE = "SAVE_FILENAME";
	public static String ENV_LOGFILE = "LOG_FILENAME";
	public static String ENV_TEMPLATE_VOLUME = "TEMPLATE_VOLUME";
	public static String ENV_SHARED_VOLUME = "SHARED_VOLUME";

	// FILES
	public static String PATTERNFOLDER =  "/templates";
	public static String FILEFOLDER =  "/files";
	public static String LOG_FILENAME_DEFAULT = "logfile.log";
	public static String SAVE_FILENAME_DEFAULT = "savefile.txt";
	public static String SAVE_FILENAME = ((System.getenv(ENV_SAVEFILE) != null)? System.getenv(ENV_SAVEFILE): SAVE_FILENAME_DEFAULT);
	public static String LOG_FILENAME = ((System.getenv(ENV_LOGFILE) != null)? System.getenv(ENV_LOGFILE): LOG_FILENAME_DEFAULT);

	// Constants
	public static final String CONSTRAINTFOLDER = "concrete-patterns";
	public static final String TEMPLATEFOLDER = "abstract-patterns";
	public static final String GENERICFOLDER = "generic-patterns";

}

package qualitypatternmodel.utility;

public class Util {
    
	public static final long EXECUTE_MAX_FILE_SIZE_BYTES = 50 * 1024 * 1024; // 50 MB
//	public static final int EXECUTE_MAX_RESULTS = 100000;                    // max number of results
	public static final long EXECUTE_QUERY_TIMEOUT_MS = 60000L;               // Execution timeout 1 min
	public static final String EXECUTION_PROCESSOR = ConstantsXml.PROCESSOR_SAXON;
	
	static final String ABSTRACT_PATTERNS_PATH = "../../abstract-patterns/";
	static final String CONCRETE_PATTERNS_PATH = "../../concrete-patterns/";
	static final String DATABASES_PATH = "../../databases/";

	static final String DATABASES_NAME = "databases";

	public static final String PROJECT_PREFIX_ENDPOINT = "/qualitypatternmodel";

	public static final String PARAMETER_EXPLANATIONS_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/parameter-explanations";
	public static final String ABSTRACT_PATTERN_LIST_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/abstract-patterns";
	public static final String CONCRETE_PATTERN_LIST_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns";
	public static final String DATABASES_LIST_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/databases";

	public static final String ABSTRACT_PATTERN_TEXT_LIST_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/abstract-patterns/text-list/";
	public static final String INSTANTIATION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/abstract-patterns/instantiation/";
	public static final String CONCRETE_PATTERN_DELETION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns/deletion/";
	public static final String CONCRETE_PATTERN_TEXT_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns/text/";
	public static final String ABSTRACT_PATTERN_TEXT_DELETION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/abstract-patterns/text/deletion/";
	public static final String CONCRETISATION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns/parameter/";
	public static final String APPLICATION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/finalized-patterns/application";
	public static final String DESCRIPTION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns/description/";
	public static final String CONCRETISATION_FINALIZATION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns/finalization/";
	public static final String SCHEMA_VALIDATION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns/schema-validation/";
	public static final String QUERY_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns/query/";
	public static final String FINALIZED_PATTERN_LIST_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/finalized-patterns";
	public static final String FINALIZED_PATTERN_DATABASE_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/finalized-patterns/database/";

	public static final String DATABASE_REGISTRATION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/databases/registration/";
	public static final String DATABASE_SETTING_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/databases/set/";
	public static final String DATABASE_DELETION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/databases/deletion/";
	public static final String DATABASE_GETTING_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/databases/get/";
}

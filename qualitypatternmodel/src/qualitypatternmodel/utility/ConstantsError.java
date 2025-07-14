package qualitypatternmodel.utility;

public class ConstantsError {

	// Errors
	public static final String OPERATOR_NULL = "operator null";
	public static final String DUPLICATE_TAG = "tag already added";
	public static final String NO_QUERY = "query is missing";
	public static final String TAG_DELETION_FAILED = "tag could not be deleted";
	public static final String SAVING_FAILED = "saving constraint failed";
	public static final String QUERY_FAILED = "querying failed";
	public static final String TOO_MUCH_VALUES = "multiple values for a single parameter";
	public static final String VARIANT_INITIALIZATION_FAILED = "could not initialize Variant";
	public static final String DUPLICATE_VARIANT_NAMES = "there are variants with the same name";
	public static final String NOT_IMPLEMENTED_RDF = "not implemented for RDF";
	public static final String NOT_IMPLEMENTED_NEO = "not implemented for Neo4j";

	// Errors - not found
	public static final String NOT_FOUND_TEMPLATE =  "template not found";
	public static final String NOT_FOUND_CONSTRAINT = "constraint not found";
	public static final String NOT_FOUND_FILEPATH = "filepath not found";
	public static final String NOT_FOUND_PARAMETER = "parameter not found";
	public static final String NOT_FOUND_VARIANT = "variant(s) not found";
	public static final String NOT_FOUND_TAG = "tag not found";

	// Errors - invalid
	public static final String INVALID_CONSTRAINT = "invalid constraint";
	public static final String INVALID_CONSTRAINTS = "invalid constraints";
	public static final String INVALID_FILES = "invalid files";
	public static final String INVALID_FILEFORMAT = "invalid file format";
	public static final String INVALID_VALUE = "invalid value";
	public static final String INVALID_JSON = "invalid JSON format";
	public static final String INVALID_VARIANT = "invalid variant(s)";
	public static final String INVALID_LANGUAGE = "invalid language";
	public static final String INVALID_ARGUMENTS = "invalid arguments";
	public static final String INVALID_TECHNOLOGY = "invalid technology";
	public static final String INVALID_OPERATOR = "invalid operator";
	public static final String INVALID_OPTION = "invalid option";
	public static final String INVALID_TAG = "invalid tag";
	public static final String INVALID_NAMESPACE_PREFIX = "Invalid namespace prefix defined. prefixes must match [a-zA-Z]+. Special case is the default namespace, that is defined via an empty key value.";
	public static final String INVALID_VARIANT_ID = "Invalid variant ID defined. Variant IDs must " + Constants.ID_REGEX + ".";
}

package qualitypatternmodel.utility;

import qualitypatternmodel.patternstructure.Language;

public class ConstantsJSON {

	// JSON variables
	// Constraints
	public static final String LANGUAGE = "language";
	public static final String NAME = "name";
	public static final String DATABASE = "database";
	public static final String DATAMODEL = "datamodel";
	public static final String ID = "id";
	public static final String CONSTRAINT_ID = "constraintID";
	public static final String FRAGMENTS = "fragments";
	public static final String TEXT = "text";
	public static final String TYPE = "type";
	public static final String ROLE = "role";
	public static final String TAG = "tag";
	public static final String TAGS = "tags";
	public static final String NAMESPACES = "namespace";
	public static final String VARIANTS = "variants";
	public static final String TYPE_CONSTRAINT = "typeConstraint";

	// Constraint Info
	public static final String LASTSAVED = "lastSaved";
	public static final String TOTAL = "total";
	public static final String INCIDENTS = "incidents";
	public static final String TOTAL_FINDINGS = "totalFindings";
	public static final String TOTAL_COMPLIANCES = "totalCompliances";
	public static final String TOTAL_INCIDENCES = "totalIncidents";
	public static final String TEMPLATES = "templates";
	public static final String IDS = "ids";

	public static final String EXECUTABLE = "executable";
	public static final String EXECUTABLE_MQAF = "mqafExecutable";
	public static final String EXECUTABLE_QUERY = "queryExecutable";
	public static final String EXECUTABLE_FILTER = "filterExecutable";

	// Parameter Information
	public static final String PARAMETER = "params";
	public static final String EXAMPLEVALUE = "exampleValue";
	public static final String DESCRIPTION = "description";
	public static final String VALUE = "value";
	public static final String USERVALUE = "userValue";
	public static final String PLURAL = "plural";
	public static final String STARTPOINT = "startpoint";
	public static final String OPTIONS = "options";
	public static final String TYPEMODIFIABLE = "typeModifiable";
	public static final String DEPENDANT = "dependant";
	public static final String CUSTOM = "custom";

	// Parameter Modification
	public static final String OLD_NAME = "oldName";
	public static final String OLD_DATABASE = "oldDatabase";
	public static final String OLD_DATAMODEL = "oldDatamodel";
	public static final String CLEAR = "clear";
	public static final String SUCCESS = "success";
	public static final String FAILED = "failed";
	public static final String AVAILABLE = "available";
	public static final String FAILEDCONSTRAINTS = "failedConstraints";
	public static final String FAILEDFILES = "failedfiles";

//	// Untyped Parameter
//	public static final String ENABLE = "enable";
//	public static final String ENABLE_IF = "if";
//	public static final String ENABLE_PARAMETER = "parameter";

	// Variant Creation
	public static final String TEMPLATE = "template";
	public static final String NEWID = "newId";
	public static final String DEFAULTMAP = "defaultMap";
	public static final String MAP = "map";

	// Execution
	public static final String TECHNOLOGY = "technology";
	public static final String QUERY = "query";
	public static final String QUERY_LINE = "queryLine";
	public static final String QUERY_PARTIAL = "queryPartial";
	public static final String QUERY_PARTIAL_LINE = "queryPartialLine";
	public static final String FILTER = "filter";
	public static final String CONSTRAINT = "constraint";
	public static final String CONSTRAINTS = "constraints";
	public static final String CONSTRAINT_NAME = "constraintName";
	public static final String CONSTRAINT_IDS = "constraintIDs";
	public static final String FILE = "file";
	public static final String FILES = "files";
	public static final String RESULT = "result";
	public static final String RESULT_SNIPPET = "snippet";
	public static final String RESULT_STARTLINE = "startline";
	public static final String RESULT_ENDLINE = "endline";
	public static final String RESULT_LINESIZE = "linesize";

	// Filter
	public static final String NEGATE = "negate";
	public static final String ARGUMENT = "argument";
	public static final String ARGUMENT_FUNCTION = "functionclass";
	public static final String ARGUMENT_CLASS = "class";
	public static final String ARGUMENT_LIST = "list";
	public static final String ARGUMENT_NUMBER1 = "number1";
	public static final String ARGUMENT_NUMBER2 = "number2";

	// INFO
	public static final String INFO_ID = "id";
	public static final String INFO_NAME = "name";
	public static final String INFO_DESCRIPTION = "description";
	public static final String INFO_GENERIC = Language.GENERIC.getLiteral();
	public static final String INFO_XML = Language.XML.getLiteral();
	public static final String INFO_RDF = Language.RDF.getLiteral();
	public static final String INFO_NEO4J = Language.NEO4J.getLiteral();
}

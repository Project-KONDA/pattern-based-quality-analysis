package qualitypatternmodel.utility;

public class ConstantsRdf {

	public static final String RETURN_ELEMENT_S_MISSING = "return element(s) missing";
	public static final String PREFIX = "PREFIX ";
	public static final String SELECT = "\nSELECT";
	public static final String WHERE = "\nWHERE ";
	public static final String GROUP_BY = "\nGROUP BY ";
	public static final String COUNT_BY = " (COUNT(*) as ?count)";
	public static final String HAVING_COUNT = "\nHAVING (?count ";
	public static final String FILTER = "\nFILTER ";
	public static final String NOT = "NOT ";
	public static final String EXISTS = "EXISTS {";
	public static final String FILTER_NOT_EXISTS = "\n  FILTER NOT EXISTS {";
	public static final String VARIABLE = "?var";
	public static final String TEMPVAR = "?tempvar";
	public static final String WILDCARD = "(<>|!<>)";
	public static final String PREDICATE = "rdf:type";
	public static final String PREDICATE_WIKIDATA = "wdt:P31";
	
	// JSON
	public static final String JSON_RDF_PART = "rdfpart";
	public static final String JSON_RDF_PATH_XOR = "xor";
	public static final String JSON_RDF_PATH_SEQUENCE = "sequence";
	public static final String JSON_RDF_PATH = "rdfpath";
	public static final String JSON_RDF_NODE_TYPE = "nodetypes";
}

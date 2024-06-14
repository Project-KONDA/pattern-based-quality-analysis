package qualitypatternmodel.utility;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

public class Constants {

	public static final Object XML = "xml";
	public static final Object RDF = "rdf";
	public static final Object NEO4J= "neo4j";
	public static final Object XQUERY = "XQuery";
	public static final Object SPARQL = "Sparql";
	public static final Object CYPHER = "Cypher";
	
	public static final String INSTANCES_FOLDER = "instances";
	public static final String TRANSLATION_TESTS_FOLDER = INSTANCES_FOLDER + "/translationtests";
	public static final String VALIDITY_CHECKS_FOLDER = INSTANCES_FOLDER + "/validitychecks";
	public static final String PLAYGROUND_FOLDER = INSTANCES_FOLDER + "/playground";
	public static final String INSTANCE_FILE_ENDING = ".patternstructure";
	public static final String REGEX_TIME_HOURS_MINUTES = "(0[1-9]|1[0-9]|2[0-4]):([0-5][0-9])";
	public static final String REGEX_TIME_HOURS_MINUTES_SECONDS = REGEX_TIME_HOURS_MINUTES + ":([0-5][0-9])(.[0-9]*)?";
	public static final String REGEX_DATE = "[0-9][0-9][0-9][0-9]-(0[1-9]|1[0-2])-([0-2][0-9]|3[0-1])";
	public static final String REGEX_DATE_TIME = REGEX_DATE + "T" + REGEX_TIME_HOURS_MINUTES_SECONDS;
	public static final String REGEX_POSITIVE_NEGATIVE = "(\\+|-)";
	public static final String SCHEMA = "_schema";

	public static final String PARAMETER_TYPE_TEXT = "Text";
	public static final String PARAMETER_TYPE_TEXT_LIST = "TextList";
	public static final String PARAMETER_TYPE_NUMBER = "Number";
	public static final String PARAMETER_TYPE_BOOLEAN = "Boolean";
	public static final String PARAMETER_TYPE_DATE = "Date";
	public static final String PARAMETER_TYPE_TIME = "Time";
	public static final String PARAMETER_TYPE_DATE_TIME = "DateTime";
	public static final String PARAMETER_TYPE_ENUMERATION = "Enumeration";
	public static final String PARAMETER_TYPE_UNTYPED = "Untyped";
	public static final String PARAMETER_TYPE_RELATION = "XmlPath_Element";
	public static final String PARAMETER_TYPE_PROPERTY = "XmlPath_Value";
	public static final String PARAMETER_TYPE_COMPARISON = "ComparisonOption";
	public static final String PARAMETER_TYPE_TYPE = "TypeOption";
	public static final String PARAMETER_TYPE_XML_PATH = "XmlPath";
	public static final String PARAMETER_TYPE_REGEX = "RegEx";
	public static final String PARAMETER_TYPE_RDF_PATH = "RdfPath";
	public static final String PARAMETER_TYPE_IRI_LIST = "IriList";
	public static final String PARAMETER_TYPE_NEO_NODE_LABEL = "NeoNodeLabel";
	public static final String PARAMETER_TYPE_NEO_ELEMENT_PATH = "NeoElementPath";
	
	// JSON variables
	public static final String JSON_TEMPLATE = "template";
	public static final String JSON_LANGUAGE = "language";
	public static final String JSON_NAME = "name";
	public static final String JSON_ID = "id";
	public static final String JSON_PATTERNID = "patternID";
	public static final String JSON_FRAGMENTS = "fragments";
	public static final String JSON_TEXT = "text";
	public static final String JSON_TYPE = "type";
	public static final String JSON_ROLE = "role";
	public static final String JSON_PARAMETER = "params";
	public static final String JSON_EXAMPLEVALUE = "exampleValue";
	public static final String JSON_DESCRIPTION = "description";
	public static final String JSON_SHORTDESCRIPTION = "shortDescription";
	public static final String JSON_NEWID = "newId";
	public static final String JSON_MAP = "map";
	public static final String JSON_DEFAULTMAP = "defaultMap";
	public static final String JSON_VALUE = "value";
	public static final String JSON_VARIANTS = "variants";
	public static final String JSON_USERVALUE = "userValue";
	public static final String JSON_DATABASE = "database";
	public static final String JSON_DATAMODEL = "datamodel";
	public static final String JSON_PLURAL = "plural";
	public static final String JSON_TAG = "tag";
	public static final String JSON_STARTPOINT = "startpoint";
	public static final String JSON_EXECUTABLE = "executable";
	public static final String JSON_EXECUTABLE_MQAF = "mqafexecutable";
	public static final String JSON_EXECUTABLE_QUERY = "queryexecutable";
	public static final String JSON_EXECUTABLE_FILTER = "filterexecutable";
	public static final String JSON_OPTIONS = "options";
	public static final String JSON_ENABLE = "enable";
	public static final String JSON_ENABLE_IF = "if";
	public static final String JSON_ENABLE_PARAMETER = "parameter";
	public static final String JSON_TYPEMODIFIABLE = "typeModifiable";
	public static final String JSON_DEPENDANT = "dependant";
	public static final String JSON_QUERY = "query";
	public static final String JSON_QUERY_LINE = "query_line";
	public static final String JSON_FILTER = "filter";
	public static final String JSON_TECHNOLOGY = "technology";
	public static final String JSON_CONSTRAINTS = "constraints";
	public static final String JSON_CONSTRAINT = "constraint";
	public static final String JSON_SUCCESS = "success";
	public static final String JSON_FAILED = "failed";
	public static final String JSON_FILE = "file";
	public static final Object JSON_FILES = "files";
	public static final String JSON_FAILEDFILES = "failedfiles";
	public static final Object JSON_CONSTRAINT_IDS = "constraintIDs";
	public static final String JSON_CONSTRAINT_ID = "constraintID";
	public static final String JSON_CONSTRAINT_NAME = "constraintName";
	public static final String JSON_FAILEDCONSTRAINTS = "failedconstraints";
	public static final String JSON_RESULT = "result";
	public static final String JSON_SIZE = "size";
	public static final String JSON_TEMPLATES = "templates";
	public static final String JSON_IDS = "ids";
	
	public static final String JSON_RDF_PART = "rdfpart";
	public static final String JSON_RDF_PATH_XOR = "xor";
	public static final String JSON_RDF_PATH_SEQUENCE = "sequence";
	public static final String JSON_RDF_PATH = "rdfpath";
	public static final String JSON_RDF_NODE_TYPE = "nodetypes";
	

	//Global Exception Messages -- Introduced by Lukas Sebastian Hofmann. Existing code of the framework has not been touched.
	public static final String INVALID_OPTION = "invalid option";
	public static final String INVALID_ARGUMENTS = "invalid arguments";
	public static final String INVALID_VALUE = "invalid value";
	public static final String INVALID_OPERATOR = "invalid operator";
	public static final String OPERATOR_NULL = "operator null";
	
	/**
	 * Appends as many closing brackets to <code>str</code> as it contains opening brackets that are not yet closed.
	 * 
	 * @param str
	 * @return <code>str</code> with appended closing brackets
	 */
	public static String addMissingBrackets(String str) {
		int res = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				res++;
			} else if (str.charAt(i) == ')') {
				res--;
			}
		}
		for (int i = 0; i < res; i++) {
			str += ")";
		}
		for (int i = res; i<0; i++)
			str = "(" + str;
		return str;
	}
	
	/**
	 * Sorts <code>map</code> by value.
	 * 
	 * @param <K> key type
	 * @param <V> value type
	 * @param map the map to be sorted by value
	 * @return <code>map</code> sorted by value
	 */
	public static <K, V extends Comparable<? super V>> EMap<K, V> sortByValue(EMap<K, V> map) {
        EList<Entry<K, V>> list = new BasicEList<>();
        list.addAll(map.entrySet());
        list.sort(Entry.comparingByValue());

        EMap<K, V> result = new BasicEMap<>();
        for (Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

}

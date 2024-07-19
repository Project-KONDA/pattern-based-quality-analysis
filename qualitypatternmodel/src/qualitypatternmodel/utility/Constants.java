package qualitypatternmodel.utility;

import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import qualitypatternmodel.patternstructure.Language;

public class Constants {

	public static final String XML = Language.XML.getLiteral();
	public static final String RDF = Language.RDF.getLiteral();
	public static final String NEO4J = Language.NEO4J.getLiteral();
	public static final List<String> TECHS = List.of(XML, RDF, NEO4J);
	public static final String LVLALL = "all";
	public static final String LVLTEMPLATE = "template";
	public static final String LVLCONSTRAINT = "concrete";
	public static final String LVLREADY = "ready";
	public static final List<String> LEVELS = List.of(LVLALL, LVLTEMPLATE, LVLCONSTRAINT, LVLREADY);
	public static final String XQUERY = "XQuery";
	public static final String SPARQL = "Sparql";
	public static final String CYPHER = "Cypher";

	public static final String EXTENSION = "patternstructure";
	public static final String INSTANCE_FILE_ENDING = "." + EXTENSION;

	public static final String INSTANCES_FOLDER = "instances";
	public static final String TRANSLATION_TESTS_FOLDER = INSTANCES_FOLDER + "/translationtests";
	public static final String VALIDITY_CHECKS_FOLDER = INSTANCES_FOLDER + "/validitychecks";
	public static final String PLAYGROUND_FOLDER = INSTANCES_FOLDER + "/playground";
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
	public static final String PARAMETER_TYPE_PROPERTY = "XmlPath_Property";
	public static final String PARAMETER_TYPE_COMPARISON = "ComparisonOption";
	public static final String PARAMETER_TYPE_TYPE = "TypeOption";
	public static final String PARAMETER_TYPE_XML_PATH = "XmlPath";
	public static final String PARAMETER_TYPE_REGEX = "RegEx";
	public static final String PARAMETER_TYPE_RDF_PATH = "RdfPath";
	public static final String PARAMETER_TYPE_IRI_LIST = "IriList";
	public static final String PARAMETER_TYPE_NEO_NODE_LABEL = "NeoNodeLabel";
	public static final String PARAMETER_TYPE_NEO_ELEMENT_PATH = "NeoElementPath";
	public static final String PARAMETER_TYPE_NEO_PROPERTY_PATH = "NeoPropertyPath";

	// Errors
	public static final String ERROR_OPERATOR_NULL = "operator null";
	public static final String ERROR_DUPLICATE_TAG = "tag already added";
	public static final String ERROR_NO_QUERY = "query is missing";
	public static final String ERROR_TAG_DELETION_FAILED = "tag could not be deleted";
	public static final String ERROR_SAVING_FAILED = "saving constraint failed";
	public static final String ERROR_QUERY_FAILED = "querying failed";
	public static final String ERROR_TOO_MUCH_VALUES = "multiple values for a single parameter";
	public static final String ERROR_VARIANT_INITIALIZATION_FAILED = "could not initialize Variant";
	public static final String ERROR_DUPLICATE_VARIANT_NAMES = "there are variants with the same name";
	public static final String ERROR_NOT_IMPLEMENTED_RDF = "not implemented for RDF";
	public static final String ERROR_NOT_IMPLEMENTED_NEO = "not implemented for Neo4j";

	// Errors - not found
	public static final String ERROR_NOT_FOUND_TEMPLATE =  "template not found";
	public static final String ERROR_NOT_FOUND_CONSTRAINT = "constraint not found";
	public static final String ERROR_NOT_FOUND_FILEPATH = "filepath not found";
	public static final String ERROR_NOT_FOUND_PARAMETER = "parameter not found";
	public static final String ERROR_NOT_FOUND_VARIANT = "variant(s) not found";
	public static final String ERROR_NOT_FOUND_TAG = "tag not found";

	// Errors - invalid
	public static final String ERROR_INVALID_CONSTRAINT = "invalid constraint";
	public static final String ERROR_INVALID_OPTION = "invalid option";
	public static final String ERROR_INVALID_ARGUMENTS = "invalid arguments";
	public static final String ERROR_INVALID_VALUE = "invalid value";
	public static final String ERROR_INVALID_OPERATOR = "invalid operator";
	public static final String ERROR_INVALID_TAG = "invalid tag";
	public static final String ERROR_INVALID_TECHNOLOGY = "invalid technology";
	public static final String ERROR_INVALID_LANGUAGE = "invalid language";
	public static final String ERROR_INVALID_JSON = "invalid JSON format";
	public static final String ERROR_INVALID_VARIANT = "invalid variant(s)";
	public static final String ERROR_INVALID_CONSTRAINTS = "invalid constraints";
	public static final String ERROR_INVALID_FILES = "invalid files";
	public static final String ERROR_INVALID_FILEFORMAT = "invalid file format";

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
		for (int i = res; i<0; i++) {
			str = "(" + str;
		}
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
        EList<Entry<K, V>> list = new BasicEList<Entry<K, V>>();
        list.addAll(map.entrySet());
        list.sort(Entry.comparingByValue());

        EMap<K, V> result = new BasicEMap<K, V>();
        for (Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

}

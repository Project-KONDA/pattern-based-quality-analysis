package qualitypatternmodel.newservlets.initialisation;

public class XmlPatternVariants {

	static String CARD_XML_DEFAULT_CONSTRAINT = 
			"{\"template\":\"Card_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-constraint\","
			+ "\"fragments\":["
				+ "{\"text\":\"”Each”\"},"
				+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
				+ "{\"text\":\"has \"},"
				+ "{\"name\":\"a comparison with\",\"params\":[0],\"exampleValue\":\"at most\",\"defaultMap\":\"comparison_negated\"},"
				+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":\"1\"},"
				+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
				+ "{\"text\":\".\"}]}";
	
	static String CARD_XML_DEFAULT_ANTIPATTERN = 
			"{\"template\":\"Card_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\"where the number of\"},"
				+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
				+ "{\"text\":\"is\"},"
				+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"more than\",\"defaultMap\":\"comparison\"},"
				+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":1},"
				+ "{\"text\":\".\"}]}";

	static String CARD_XML_DEFAULT_OLD = 
			"{\"template\":\"Card_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default_old\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\"that do have\"},"
				+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"more than\",\"defaultMap\":\"comparison\"},"
				+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":1},"
				+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
				+ "{\"text\":\".\"}]}";

	static String CARD_XML_QUESTION_SIMPLE = 
			"{\"template\":\"Card_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"question_simple\","
			+ "\"fragments\":["
				+ "{\"text\":\"Is there a\"},"
				+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
				+ "{\"text\":\"with more than one\"},"
				+ "{\"params\":[0], \"value\":\"more than\"},"
				+ "{\"params\":[1], \"value\":\"1\"},"
				+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
				+ "{\"text\":\".\"}"
				+ "]}";

	static String CARD_XML_QUESTION = 
			"{\"template\":\"Card_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"question\","
			+ "\"fragments\":["
				+ "{\"text\":\"Is there a\"},"
				+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
				+ "{\"text\":\"that has\"},"
				+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"more than\",\"defaultMap\":\"comparison\"},"
				+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":1},"
				+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
				+ "{\"text\":\".\"}"
				+ "]}";
	
	public static String[] CARD_XML_VARIANTS = {CARD_XML_DEFAULT_CONSTRAINT, CARD_XML_DEFAULT_ANTIPATTERN};
	public static String[] CARD_XML_VARIANTS_OLD = {CARD_XML_DEFAULT_OLD, CARD_XML_QUESTION_SIMPLE, CARD_XML_QUESTION};
	
	static String MATCH_XML_DEFAULT_CONSTRAINT = 
			"{\"template\":\"Match_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-constraint\","
			+ "\"fragments\":["
				+ "{\"text\":\"For each\"},"
				+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
				+ "{\"text\":\"all\"},"
				+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Surname\",\"description\":\"value that gets analysed\", \"plural\": \"true\"},"
				+ "{\"name\":\"do / do not\",\"params\":[0],\"defaultMap\":\"do not\",\"exampleValue\":\"do\"},"
				+ "{\"text\":\"match\"},"
				+ "{\"name\":\"a specific pattern (RegEx)\",\"params\":[1],\"exampleValue\":\"[A-Z][a-z][a-z]+\"},"
				+ "{\"text\":\".\"}]}";
	
	static String MATCH_XML_DEFAULT_ANTIPATTERN = 
			"{\"template\":\"Match_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\"where a\"},"
				+ "{\"name\":\"property\",\"params\":[3],\"exampleValue\":\"Surname\",\"description\":\"value that gets analysed\"},"
				+ "{\"name\":\"does / does not\",\"params\":[0],\"defaultMap\":\"does\",\"exampleValue\":\"does\"},"
				+ "{\"text\":\"match\"},"
				+ "{\"name\":\"a specific pattern (RegEx)\",\"params\":[1],\"exampleValue\":\"[A-Z][a-z][a-z]+\"},"
				+ "{\"text\":\".\"}]}";
	
	static String[] MATCH_XML_VARIANTS = {MATCH_XML_DEFAULT_CONSTRAINT, MATCH_XML_DEFAULT_ANTIPATTERN};
	static String[] MATCH_XML_VARIANTS_OLD = {};
	
	static String CONTAINS_XML_DEFAULT_CONSTRAINT = 
			"{\"template\":\"Contains_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-constraint\","
			+ "\"fragments\":["
				+ "{\"text\":\"For\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\", each\"},"
				+ "{\"name\":\"property\",\"params\":[3],\"exampleValue\":\"Education\",\"description\":\"analysed property\"},"
				+ "{\"name\":\"does / does not\",\"params\":[0],\"defaultMap\":\"does not\",\"exampleValue\":\"does\"},"
				+ "{\"text\":\"contain\"},"
				+ "{\"name\":\"a specific term\",\"params\":[1],\"exampleValue\":\"Master of\"},"
				+ "{\"text\":\".\"}]}";
	
	static String CONTAINS_XML_DEFAULT_ANTIPATTERN = 
			"{\"template\":\"Contains_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\"where at least one\"},"
				+ "{\"name\":\"property\",\"params\":[3],\"exampleValue\":\"Education\",\"description\":\"analysed property\"},"
				+ "{\"name\":\"does / does not\",\"params\":[0],\"defaultMap\":\"does\",\"exampleValue\":\"does\"},"
				+ "{\"text\":\"contain\"},"
				+ "{\"name\":\"a specific term\",\"params\":[1],\"exampleValue\":\"Master of\"},"
				+ "{\"text\":\".\"}]}";
	
	static String[] CONTAINS_XML_VARIANTS = {CONTAINS_XML_DEFAULT_CONSTRAINT, CONTAINS_XML_DEFAULT_ANTIPATTERN};
	static String[] CONTAINS_XML_VARIANTS_OLD = {};
	
	static String STRINGLENGTH_XML_DEFAULT_CONSTRAINT = 
			"{\"template\":\"StringLength_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-constraint\","
			+ "\"fragments\":["
				+ "{\"text\":\"For\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\", each\"},"
				+ "{\"name\":\"property\",\"params\":[3],\"exampleValue\":\"LastName\",\"description\":\"value that gets analysed\"},"
				+ "{\"text\":\"is\"},"
				+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"less than\",\"defaultMap\":\"comparison_negated\"},"
				+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":“10”},"
				+ "{\"text\":\"characters in length.\"}]}";
	
	static String STRINGLENGTH_XML_DEFAULT_ANTIPATTERN = 
			"{\"template\":\"StringLength_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\"where at least one\"},"
				+ "{\"name\":\"property\",\"params\":[3],\"exampleValue\":\"LastName\",\"description\":\"value that gets analysed\"},"
				+ "{\"text\":\"is\"},"
				+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"less than\",\"defaultMap\":\"comparison\"},"
				+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":\"10\"},"
				+ "{\"text\":\"characters in length.\"}]}";
	
	static String STRINGLENGTH_XML_DEFAULT_OLD = 
			"{\"template\":\"StringLength_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default_old\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\"where the length of at least one value of\"},"
				+ "{\"name\":\"property\",\"params\":[3],\"exampleValue\":\"LastName\",\"description\":\"value that gets analysed\"},"
				+ "{\"text\":\"is\"},"
				+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"less than\",\"defaultMap\":\"comparison\"},"
				+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":\"10\"},"
				+ "{\"text\":\".\"}]}";
	
	static String[] STRINGLENGTH_XML_VARIANTS = {STRINGLENGTH_XML_DEFAULT_CONSTRAINT, STRINGLENGTH_XML_DEFAULT_ANTIPATTERN};
	static String[] STRINGLENGTH_XML_VARIANTS_OLD = {STRINGLENGTH_XML_DEFAULT_OLD};
	
	static String COMPSET_XML_DEFAULT_CONSTRAINT = 
			"{\"template\":\"CompSet_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-constraint\","
			+ "\"fragments\":["
				+ "{\"text\":\"For\"},"
				+ "{\"name\":\"elements\",\"params\":[3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\", each\"},"
				+ "{\"name\":\"property\",\"params\":[4],\"exampleValue\":\"Surname\",\"description\":\"value that gets analysed\"},"
				+ "{\"name\":\"is/is not\",\"params\":[1],\"exampleValue\":\"is\",”defaultMap”:”comparison_isnot”},"
				+ "{\"text\":\"in the list of\"},"
				+ "{\"name\":\"terms\",\"params\":[0],\"exampleValue\": \"Mueller, Meier\"},"
				+ "{\"text\":\".\"}]}";

	static String COMPSET_XML_DEFAULT_ANTIPATTERN = 
			"{\"template\":\"CompSet_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\"where at least one\"},"
				+ "{\"name\":\"property\",\"params\":[4],\"exampleValue\":\"Surname\",\"description\":\"value that gets analysed\"},"
				+ "{\"name\":\"is / is not\",\"params\":[1],\"exampleValue\":\"is\",\"defaultMap\":\"comparison_is\"},"
				+ "{\"text\":\"in the list of\"},"
				+ "{\"name\":\"terms\",\"params\":[0],\"exampleValue\": \"Mueller, Meier\"},"
				+ "{\"text\":\".\"}]}";
	
	static String COMPSET_XML_DEFAULT_OLD = 
			"{\"template\":\"CompSet_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default_old\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\"where at least one value in\"},"
				+ "{\"name\":\"property\",\"params\":[4],\"exampleValue\":\"Surname\",\"description\":\"value that gets analysed\"},"
				+ "{\"name\":\"is / is not\",\"params\":[1],\"exampleValue\":\"is\",\"defaultMap\":\"comparison_isnot\"},"
				+ "{\"text\":\"in the list:\"},"
				+ "{\"name\":\"terms\",\"params\":[0],\"exampleValue\": \"Mueller, Meier\"}]}";

	static String[] COMPSET_XML_VARIANTS = {COMPSET_XML_DEFAULT_CONSTRAINT, COMPSET_XML_DEFAULT_ANTIPATTERN};
	static String[] COMPSET_XML_VARIANTS_OLD = {COMPSET_XML_DEFAULT_OLD};
	
	static String UNIQUE_XML_DEFAULT_CONSTRAINT = 
			"{\"template\":\"Unique_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-constraint\","
			+ "\"fragments\":["
				+ "{\"text\":\"For\"},"
				+ "{\"name\":\"elements\",\"params\":[2,5],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\", the\"},"
				+ "{\"name\":\"property\",\"params\":[3,4],\"exampleValue\":\"Identifier (Value)\",\"description\":\"value that gets analysed\"},"
				+ "{\"text\":\"is unique.\"}]}";
	
	static String UNIQUE_XML_DEFAULT_ANTIPATTERN = 
			"{\"template\":\"Unique_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2,5],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\"where a\"},"
				+ "{\"name\":\"property\",\"params\":[3,4],\"exampleValue\":\"Identifier (Value)\",\"description\":\"value that gets analysed\"},"
				+ "{\"text\":\"is not unique within the data set.\"}]}";
	
	static String UNIQUE_XML_DEFAULT_OLD = 
			"{\"template\":\"Unique_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2,5],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\"where a value of\"},"
				+ "{\"name\":\"property\",\"params\":[3,4],\"exampleValue\":\"Identifier (Value)\",\"description\":\"value that gets analysed\"},"
				+ "{\"text\":\"is not unique within the data set.\"}]}";

	static String[] UNIQUE_XML_VARIANTS = {UNIQUE_XML_DEFAULT_CONSTRAINT, UNIQUE_XML_DEFAULT_ANTIPATTERN};
	static String[] UNIQUE_XML_VARIANTS_OLD = {UNIQUE_XML_DEFAULT_OLD};
	
	static String MANDATT_XML_DEFAULT_CONSTRAINT = 
			"{\"template\":\"MandAtt_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-constraint\","
			+ "\"fragments\":["
				+ "{\"text\":\"Each\"},"
				+ "{\"name\":\"element\",\"params\":[0],\"exampleValue\":\"Actor\",\"description\":\"anchor for analysis\"},"
				+ "{\"text\":\"has at least one \"},"
				+ "{\"name\":\"child element\",\"params\":[1],\"exampleValue\":\"Birthdate\",\"description\":\"value that gets analysed\"},"
				+ "{\"text\":\".\"}]}";
	
	static String MANDATT_XML_DEFAULT_ANTIPATTERN = 
			"{\"template\":\"MandAtt_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[0],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\"without a\"},"
				+ "{\"name\":\"child element\",\"params\":[1],\"exampleValue\":\"Birthdate\",\"description\":\"value that gets analysed\"},"
				+ "{\"text\":\".\"}]}";

	static String[] MANDATT_XML_VARIANTS = {MANDATT_XML_DEFAULT_CONSTRAINT, MANDATT_XML_DEFAULT_ANTIPATTERN};
	static String[] MANDATT_XML_VARIANTS_OLD = {};
	
	static String INVALIDLINK_XML_DEFAULT_CONSTRAINT = 
			"{\"template\":\"InvalidLink_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-constraint\","
			+ "\"fragments\":["
				+ "{\"text\":\"For\"},"
				+ "{\"name\":\"elements\",\"params\":[1],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\", each\"},"
				+ "{\"name\":\"property\",\"params\":[2],\"exampleValue\":\"Birth Certificate Source\",\"description\":\"property of interest,that should contain a valid link.\"},"
				+ "{\"name\":\"is/is not\",\"params\":[0],\"defaultMap\":\"is\",\"exampleValue\":\"is\"},"
				+ "{\"text\":\"a valid link.\"}]}";
	
	static String INVALIDLINK_XML_DEFAULT_ANTIPATTERN = 
			"{\"template\":\"InvalidLink_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[1],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\"where any\"},"
				+ "{\"name\":\"property\",\"params\":[2],\"exampleValue\":\"Birth Certificate Source\",\"description\":\"property of interest,that should contain a valid link.\"},"
				+ "{\"name\":\"does / does not\",\"params\":[0],\"defaultMap\":\"does\",\"exampleValue\":\"does\",\"description\":\"Do you search for elements that contain a valid link (‘does’) or invalid links (‘does not’)?\"},"
				+ "{\"text\":\"contain a valid link.\"}]}";

	static String INVALIDLINK_XML_QUESTION = 
			"{\"template\":\"InvalidLink_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"question\","
			+ "\"fragments\":["
				+ "{\"text\":\"Is there a\"},"
				+ "{\"name\":\"element\",\"params\":[1],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
				+ "{\"text\":\"where the link in the\"},"
				+ "{\"name\":\"property\",\"params\":[2],\"exampleValue\":\"Birth Certificate Source\",\"description\":\"property of interest,that should contain a valid link.\"},"
				+ "{\"name\":\"is / is not\",\"params\":[0],\"defaultMap\":\"is\",\"exampleValue\":\"is\",\"description\":\"Do you search for elements that contain a valid link (‘is’) or invalid links (‘is not’)?\"},"
				+ "{\"text\":\"valid?\"}]}";
	
	static String[] INVALIDLINK_XML_VARIANTS = {INVALIDLINK_XML_DEFAULT_CONSTRAINT, INVALIDLINK_XML_DEFAULT_ANTIPATTERN};
	static String[] INVALIDLINK_XML_VARIANTS_OLD = {INVALIDLINK_XML_QUESTION};
}

package qualitypatternmodel.newservlets.initialisation;

public class XmlPatternVariants {
	static String CARD_XML_DEFAULT = 
			"{\"template\":\"Card_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default\","
			+ "\"fragments\":["
				+ "{\"text\":\"”Search for”\"},"
				+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
				+ "{\"text\":\"where the number of\"},"
				+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\"},"
				+ "{\"text\":\"is\"},"
				+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"more than\",\"comparisonMap\":\"true\"},"
				+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":1},"
				+ "{\"text\":\".\"}]}";
	
	static String MATCH_XML_DEFAULT = 
			"{\"template\":\"Match_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
				+ "{\"text\":\"where a\"},"
				+ "{\"name\":\"property\",\"params\":[3],\"exampleValue\":\"Surname\",\"description\":\"value that gets analysed\"},"
				+ "{\"name\":\"does / does not\",\"params\":[0],\"exampleValue\":\"does\"},"
				+ "{\"text\":\"match\"},"
				+ "{\"name\":\"a specific pattern (RegEx)\",\"params\":[1],\"exampleValue\":\"[A-Z][a-z][a-z]+\"},"
				+ "{\"text\":\".\"}]}";
	
	static String CONTAINS_XML_DEFAULT = 
			"{\"template\":\"Contains_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
				+ "{\"text\":\"where at least one\"},"
				+ "{\"name\":\"property\",\"params\":[3],\"exampleValue\":\"Education\",\"description\":\"analysed property\"},"
				+ "{\"name\":\"does / does not\",\"params\":[0],\"exampleValue\":\"does\"},"
				+ "{\"text\":\"contain\"},"
				+ "{\"name\":\"a specific term\",\"params\":[1],\"exampleValue\":\"Master of\"},"
				+ "{\"text\":\".\"}]}";
	
	static String STRINGLENGTH_XML_DEFAULT = 
			"{\"template\":\"StringLength_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
				+ "{\"text\":\"where at least one\"},"
				+ "{\"name\":\"property\",\"params\":[3],\"exampleValue\":\"LastName\",\"description\":\"value that gets analysed\"},"
				+ "{\"text\":\"is\"},"
				+ "{\"name\":\"is / is not\",\"params\":[0],\"exampleValue\":\"is\",\"comparisonOperatorValueMap\":\"true\"},"
				+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":“10”},"
				+ "{\"text\":\"characters in length.\"}]}";
	
	static String COMPSET_XML_DEFAULT = 
			"{\"template\":\"CompSet_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"element\",\"params\":[3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
				+ "{\"text\":\"where at least one\"},"
				+ "{\"name\":\"property\",\"params\":[4],\"exampleValue\":\"Surname\",\"description\":\"value that gets analysed\"},"
				+ "{\"name\":\"is / is not\",\"params\":[1],\"exampleValue\":\"is\",\"map\":{\"EQUAL\":\"is\",\"NOTEQUAL\":\"is not\"}},"
				+ "{\"text\":\"in the list of\"},"
				+ "{\"name\":\"terms\",\"params\":[0],\"exampleValue\": \"Mueller, Meier\"},"
				+ "{\"text\":\".\"}]}";
	
	static String UNIQUE_XML_DEFAULT = 
			"{\"template\":\"Unique_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"element\",\"params\":[2,5],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
				+ "{\"text\":\"where a\"},"
				+ "{\"name\":\"property\",\"params\":[3,4],\"exampleValue\":\"Identifier (Value)\",\"description\":\"value that gets analysed\"},"
				+ "{\"text\":\"is not unique within the data set.\"}]}";
	
	static String MANDATT_XML_DEFAULT = 
			"{\"template\":\"MandAtt_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"element\",\"params\":[0],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
				+ "{\"text\":\"without a\"},"
				+ "{\"name\":\"child element\",\"params\":[1],\"exampleValue\":\"Birthdate\",\"description\":\"value that gets analysed\"},"
				+ "{\"text\":\".\"}]}";
	
	static String INVALIDLINK_XML_DEFAULT = 
			"{\"template\":\"InvalidLink_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"element\",\"params\":[1],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
				+ "{\"text\":\"where any\"},"
				+ "{\"name\":\"property\",\"params\":[2],\"exampleValue\":\"Birth Certificate Source\",\"description\":\"property of interest,that should contain a valid link.\"},"
				+ "{\"name\":\"does / does not\",\"params\":[0],\"map\":{\"true\":\"”does”\",\"false\":\"does not\"},\"exampleValue\":\"does\",\"description\":\"Do you search for elements,that contain a valid link (‘does’) or invalid links (‘does not’)?\"},"
				+ "{\"text\":\"contain a valid link.\"}]}";
}

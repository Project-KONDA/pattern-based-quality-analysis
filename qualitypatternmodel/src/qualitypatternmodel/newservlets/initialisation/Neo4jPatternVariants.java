package qualitypatternmodel.newservlets.initialisation;

public class Neo4jPatternVariants {
	
	public static String CARD_NEO_DEFAULT = 
			"{\"template\":\"Card_neo4j\","
			+ "\"language\":\"neo4j\","
			+ "\"name\":\"default\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\"where the number of\"},"
				+ "{\"name\":\"node\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
				+ "{\"text\":\"that are connected via \"},"
				+ "{\"name\":\"a dependancy\",\"params\":[4],\"description\":\"relationship between elements and nodes\"},"
				+ "{\"text\":\"is\"},"
				+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"more than\",\"comparisonMap\":\"true\"},"
				+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":1},"
				+ "{\"text\":\".\"}]}";
	
	
	public static String[] CARD_NEO_VARIANTS = {CARD_NEO_DEFAULT};
	public static String[] CARD_NEO_VARIANTS_OLD = {};
	
	static String[] MATCH_NEO_VARIANTS = {};
	static String[] MATCH_NEO_VARIANTS_OLD = {};
	
	static String[] CONTAINS_NEO_VARIANTS = {};
	static String[] CONTAINS_NEO_VARIANTS_OLD = {};
	
	static String[] STRINGLENGTH_NEO_VARIANTS = {};
	static String[] STRINGLENGTH_NEO_VARIANTS_OLD = {};

	static String[] COMPSET_NEO_VARIANTS = {};
	static String[] COMPSET_NEO_VARIANTS_OLD = {};

	static String[] UNIQUE_NEO_VARIANTS = {};
	static String[] UNIQUE_NEO_VARIANTS_OLD = {};

	static String[] MANDATT_NEO_VARIANTS = {};
	static String[] MANDATT_NEO_VARIANTS_OLD = {};
	
	static String[] INVALIDLINK_NEO_VARIANTS = {};
	static String[] INVALIDLINK_NEO_VARIANTS_OLD = {};

}

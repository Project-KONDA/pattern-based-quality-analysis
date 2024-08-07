package qualitypatternmodel.newservlets.initialisation;

public class Neo4jPatternVariants {

	public static String CARD_NEO_DEFAULT =
			"{\"template\":\"Card_neo4j\","
			+ "\"language\":\"neo4j\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\"where the number of\"},"
				+ "{\"name\":\"node\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
				+ "{\"text\":\"that are connected via \"},"
				+ "{\"name\":\"a dependancy\",\"params\":[4],\"description\":\"relationship between elements and nodes\"},"
				+ "{\"text\":\"is\"},"
				+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"more than\",\"defaultMap\":\"comparison\"},"
				+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":1},"
				+ "{\"text\":\".\"}]}";


	public static String[] CARD_NEO_VARIANTS = {CARD_NEO_DEFAULT};
	public static String[] CARD_NEO_VARIANTS_OLD = {};

	public static String MATCH_NEO_DEFAULT =
			"{\"template\":\"Match_neo4j\","
			+ "\"language\":\"neo4j\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
				+ "{\"text\":\"where a property reached by\"},"
				+ "{\"name\":\"an neo property path\",\"params\":[3],\"exampleValue\":\"has\"},"
				+ "{\"text\":\"is\"},"
				+ "{\"name\":\"does / does not\",\"params\":[0], \"exampleValue\":\"does\", \"defaultMap\":\"does\"},"
				+ "{\"text\":\"match\"},"
				+ "{\"name\":\"a specific pattern\",\"params\":[1]},"
				+ "{\"text\":\".\"}]}";

	static String[] MATCH_NEO_VARIANTS = {MATCH_NEO_DEFAULT};
	static String[] MATCH_NEO_VARIANTS_OLD = {};

	public static String CONTAINS_NEO_DEFAULT =
			"{\"template\":\"Contains_neo4j\","
			+ "\"language\":\"neo4j\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
				+ "{\"text\":\"where a property reached by\"},"
				+ "{\"name\":\"an neo property path\",\"params\":[3],\"exampleValue\":\"has\"},"
				+ "{\"name\":\"does / does not\",\"params\":[0], \"exampleValue\":\"does\", \"defaultMap\":\"does\"},"
				+ "{\"text\":\"contain\"},"
				+ "{\"name\":\"a specific term\",\"params\":[1]},"
				+ "{\"text\":\".\"}]}";

	static String[] CONTAINS_NEO_VARIANTS = {CONTAINS_NEO_DEFAULT};
	static String[] CONTAINS_NEO_VARIANTS_OLD = {};

	public static String STRINGLENGTH_NEO_DEFAULT =
			"{\"template\":\"StringLength_neo4j\","
			+ "\"language\":\"neo4j\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
				+ "{\"text\":\"where at least one property reached by\"},"
				+ "{\"name\":\"an neo property path\",\"params\":[3],\"exampleValue\":\"has\"},"
				+ "{\"text\":\"is\"},"
				+ "{\"name\":\"compared to\",\"params\":[0], \"exampleValue\":\"exactly\", \"defaultMap\":\"comparison\"},"
				+ "{\"name\":\"a specific number of\",\"params\":[1]},"
				+ "{\"text\":\"characters in length.\"}]}";

	static String[] STRINGLENGTH_NEO_VARIANTS = {STRINGLENGTH_NEO_DEFAULT};
	static String[] STRINGLENGTH_NEO_VARIANTS_OLD = {};

	public static String COMPSET_NEO_DEFAULT =
			"{\"template\":\"CompSet_neo4j\","
			+ "\"language\":\"neo4j\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
				+ "{\"text\":\"where at least one property reached by\"},"
				+ "{\"name\":\"an neo property path\",\"params\":[4],\"exampleValue\":\"has\"},"
				+ "{\"name\":\"is / is not\",\"params\":[1], \"exampleValue\":\"exactly\", \"defaultMap\":\"comparison_is\"},"
				+ "{\"text\":\"in the list of\"},"
				+ "{\"name\":\"terms\",\"params\":[0]},"
				+ "{\"text\":\".\"}]}";

	static String[] COMPSET_NEO_VARIANTS = {COMPSET_NEO_DEFAULT};
	static String[] COMPSET_NEO_VARIANTS_OLD = {};

	public static String UNIQUE_NEO_DEFAULT =
			"{\"template\":\"Unique_neo4j\","
			+ "\"language\":\"neo4j\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2,3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
				+ "{\"text\":\"where a property reached by\"},"
				+ "{\"name\":\"an neo property path\",\"params\":[4,5],\"exampleValue\":\"has\"},"
				+ "{\"text\":\"is not unique within the data set.\"}]}";

	static String[] UNIQUE_NEO_VARIANTS = {UNIQUE_NEO_DEFAULT};
	static String[] UNIQUE_NEO_VARIANTS_OLD = {};

	public static String MANDATT_NEO_DEFAULT =
			"{\"template\":\"MandAtt_neo4j\","
			+ "\"language\":\"neo4j\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[0],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
				+ "{\"text\":\"without a property of type\"},"
				+ "{\"name\":\"type\",\"params\":[1],\"exampleValue\":\"\"},"
				+ "{\"text\":\"reached by\"},"
				+ "{\"name\":\"an neo property path\",\"params\":[2],\"exampleValue\":\"has\"},"
				+ "{\"text\":\".\"}]}";

	static String[] MANDATT_NEO_VARIANTS = {MANDATT_NEO_DEFAULT};
	static String[] MANDATT_NEO_VARIANTS_OLD = {};

}

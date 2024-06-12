package qualitypatternmodel.newservlets.initialisation;

public class RdfPatternVariants {
	
	public static String CARD_RDF_DEFAULT = 
			"{\"template\":\"Card_rdf\","
			+ "\"language\":\"rdf\","
			+ "\"name\":\"default\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
				+ "{\"text\":\"where the number of\"},"
				+ "{\"name\":\"node\",\"params\":[4],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
				+ "{\"text\":\"that are connected via \"},"
				+ "{\"name\":\"a dependancy\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\"},"
				+ "{\"text\":\"is\"},"
				+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"more than\",\"defaultMap\":\"comparison\"},"
				+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":1},"
				+ "{\"text\":\".\"}]}";
	
	public static String[] CARD_RDF_VARIANTS = {CARD_RDF_DEFAULT};
	public static String[] CARD_RDF_VARIANTS_OLD = {};
	
	static String[] MATCH_RDF_VARIANTS = {};
	static String[] MATCH_RDF_VARIANTS_OLD = {};
	
	static String[] CONTAINS_RDF_VARIANTS = {};
	static String[] CONTAINS_RDF_VARIANTS_OLD = {};
	
	static String[] STRINGLENGTH_RDF_VARIANTS = {};
	static String[] STRINGLENGTH_RDF_VARIANTS_OLD = {};

	static String[] COMPSET_RDF_VARIANTS = {};
	static String[] COMPSET_RDF_VARIANTS_OLD = {};

	static String[] UNIQUE_RDF_VARIANTS = {};
	static String[] UNIQUE_RDF_VARIANTS_OLD = {};

	static String[] MANDATT_RDF_VARIANTS = {};
	static String[] MANDATT_RDF_VARIANTS_OLD = {};
}

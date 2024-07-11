package qualitypatternmodel.newservlets.initialisation;

public class RdfPatternVariants {
	
	public static String CARD_RDF_DEFAULT = 
			"{\"template\":\"Card_rdf\","
			+ "\"language\":\"rdf\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
				+ "{\"text\":\"where the number of\"},"
				+ "{\"name\":\"child elements\",\"params\":[4],\"exampleValue\":\"Birthdate\"},"
				+ "{\"text\":\"reached by\"},"
				+ "{\"name\":\"an rdf path\",\"params\":[3],\"exampleValue\":\"has\",\"defaultmap\":\"comparison\"},"
				+ "{\"text\":\"is\"},"
				+ "{\"name\":\"compared to\",\"params\":[0], \"exampleValue\":\"exactly\", \"defaultMap\":\"comparison\"},"
				+ "{\"name\":\"a specific number\",\"params\":[1]},"
				+ "{\"text\":\".\"}]}";
	
	public static String[] CARD_RDF_VARIANTS = {CARD_RDF_DEFAULT};
	public static String[] CARD_RDF_VARIANTS_OLD = {};
	
	public static String MATCH_RDF_DEFAULT = 
			"{\"template\":\"Match_rdf\","
			+ "\"language\":\"rdf\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
				+ "{\"text\":\"where a property reached by\"},"
				+ "{\"name\":\"an rdf property path\",\"params\":[3],\"exampleValue\":\"has\"},"
				+ "{\"text\":\"is\"},"
				+ "{\"name\":\"does / does not\",\"params\":[0], \"exampleValue\":\"does\", \"defaultMap\":\"does\"},"
				+ "{\"text\":\"match\"},"
				+ "{\"name\":\"a specific pattern\",\"params\":[1]},"
				+ "{\"text\":\".\"}]}";
	
	static String[] MATCH_RDF_VARIANTS = {MATCH_RDF_DEFAULT};
	static String[] MATCH_RDF_VARIANTS_OLD = {};
	
	public static String CONTAINS_RDF_DEFAULT = 
			"{\"template\":\"Contains_rdf\","
			+ "\"language\":\"rdf\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
				+ "{\"text\":\"where at least one property reached by\"},"
				+ "{\"name\":\"an rdf property path\",\"params\":[3],\"exampleValue\":\"has\"},{\"name\":\"does / does not\",\"params\":[0], \"exampleValue\":\"does\", \"defaultMap\":\"does\"},"
				+ "{\"text\":\"contain\"},"
				+ "{\"name\":\"a specific term\",\"params\":[1]},"
				+ "{\"text\":\".\"}]}";
	
	static String[] CONTAINS_RDF_VARIANTS = {CONTAINS_RDF_DEFAULT};
	static String[] CONTAINS_RDF_VARIANTS_OLD = {};
	
	public static String STRINGLENGTH_RDF_DEFAULT = 
			"{\"template\":\"StringLength_rdf\","
			+ "\"language\":\"rdf\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
				+ "{\"text\":\"where at least one property reached by\"},"
				+ "{\"name\":\"an rdf property path\",\"params\":[3],\"exampleValue\":\"has\"},"
				+ "{\"text\":\"is\"},"
				+ "{\"name\":\"compared to\",\"params\":[0], \"exampleValue\":\"exactly\", \"defaultMap\":\"comparison\"},"
				+ "{\"name\":\"a specific number of\",\"params\":[1]},"
				+ "{\"text\":\"characters in length.\"}]}";
	
	static String[] STRINGLENGTH_RDF_VARIANTS = {STRINGLENGTH_RDF_DEFAULT};
	static String[] STRINGLENGTH_RDF_VARIANTS_OLD = {};
	
	public static String COMPSET_RDF_DEFAULT = 
			"{\"template\":\"CompSet_rdf\","
			+ "\"language\":\"rdf\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
				+ "{\"text\":\"where at least one property reached by\"},"
				+ "{\"name\":\"an rdf property path\",\"params\":[4],\"exampleValue\":\"has\"},"
				+ "{\"name\":\"is / is not\",\"params\":[1], \"exampleValue\":\"exactly\", \"defaultMap\":\"comparison_is\"},"
				+ "{\"text\":\"in the list of\"},"
				+ "{\"name\":\"terms\",\"params\":[0]},"
				+ "{\"text\":\".\"}]}";

	static String[] COMPSET_RDF_VARIANTS = {COMPSET_RDF_DEFAULT};
	static String[] COMPSET_RDF_VARIANTS_OLD = {};
	
	public static String UNIQUE_RDF_DEFAULT = 
			"{\"template\":\"Unique_rdf\","
			+ "\"language\":\"rdf\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[2,3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
				+ "{\"text\":\"where a property reached by\"},"
				+ "{\"name\":\"an rdf property path\",\"params\":[4,5],\"exampleValue\":\"has\"},"
				+ "{\"text\":\"is not unique within the data set.\"}]}";

	static String[] UNIQUE_RDF_VARIANTS = {UNIQUE_RDF_DEFAULT};
	static String[] UNIQUE_RDF_VARIANTS_OLD = {};
	
	public static String MANDATT_RDF_DEFAULT = 
			"{\"template\":\"MandAtt_rdf\","
			+ "\"language\":\"rdf\","
			+ "\"name\":\"default-antipattern\","
			+ "\"fragments\":["
				+ "{\"text\":\"Search for\"},"
				+ "{\"name\":\"elements\",\"params\":[0],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
				+ "{\"text\":\"without a property of type\"},"
				+ "{\"name\":\"type\",\"params\":[2],\"exampleValue\":\"\"},"
				+ "{\"text\":\"reached by\"},"
				+ "{\"name\":\"an rdf property path\",\"params\":[1],\"exampleValue\":\"has\"},"
				+ "{\"text\":\".\"}]}";

	static String[] MANDATT_RDF_VARIANTS = {MANDATT_RDF_DEFAULT};
	static String[] MANDATT_RDF_VARIANTS_OLD = {};
}

package qualitypatternmodel.newservlets.patterns;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;

public class CardPattern {

	static String CARD_ID_GENERIC = "Card_generic";
	static String CARD_ID_XML = "Card_xml";
	static String CARD_ID_RDF = "Card_rdf";
	static String CARD_ID_NEO = "Card_neo4j";
	static String CARD_NAME = "Cardinality Constraint";
	static String CARD_DESCR = "Check, wether the occurence count of specific elements apply.";

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(CARD_ID_GENERIC);
		pattern.setAbstractId(CARD_ID_GENERIC);
		pattern.setName(CARD_NAME);
		pattern.setDescription(CARD_DESCR);

		// Context graph of pattern:
		Node returnNode = pattern.getGraph().getNodes().get(0).makeComplex();

		// First-order logic condition of pattern:
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		pattern.setCondition(countCondition);
		countCondition.createCountPattern();
		NumberElementImpl ne = new NumberElementImpl();
		countCondition.setArgument2(ne);
		ne.createParameters();
		if (ServletConstants.FILL_VALUES) {
			ne.getNumberParam().setValue(1.);
			countCondition.getOption().setValue(ComparisonOperator.GREATER);
		}

		Node countReturn = returnNode.addOutgoing(countCondition.getCountPattern().getGraph()).getTarget()
				.makeComplex(); // .makePrimitive();
		countReturn.setReturnNode(true);

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				CARD_ID_XML,
				Map.of(2, "//*", 3, "/*"),
				CARD_XML_VARIANTS,
				CARD_XML_VARIANTS_OLD);
	}

	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				CARD_ID_RDF,
				Map.of(),
				CARD_RDF_VARIANTS,
				CARD_RDF_VARIANTS_OLD);
	}

	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternBundle result = new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				CardPattern.CARD_ID_NEO,
				Map.of(),
				CARD_NEO_VARIANTS,
				CARD_NEO_VARIANTS_OLD);
		return result;
	}

	public static String CARD_XML_DEFAULT_CONSTRAINT = "{\"template\":\"Card_xml\"," + "\"language\":\"xml\","
			+ "\"name\":\"default-constraint\"," + "\"fragments\":[" + "{\"text\":\"Each\"},"
			+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
			+ "{\"text\":\"has \"},"
			+ "{\"name\":\"a comparison with\",\"params\":[0],\"exampleValue\":\"at most\",\"defaultMap\":\"comparison_negated\"},"
			+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":\"1\"},"
			+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
			+ "{\"text\":\".\"}]}";
	public static String CARD_XML_DEFAULT_ANTIPATTERN = "{\"template\":\"Card_xml\"," + "\"language\":\"xml\","
			+ "\"name\":\"default-antipattern\"," + "\"fragments\":[" + "{\"text\":\"Search for\"},"
			+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
			+ "{\"text\":\"where the number of\"},"
			+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
			+ "{\"text\":\"is\"},"
			+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"more than\",\"defaultMap\":\"comparison\"},"
			+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":1}," + "{\"text\":\".\"}]}";
	public static String CARD_XML_DEFAULT_OLD = "{\"template\":\"Card_xml\"," + "\"language\":\"xml\","
			+ "\"name\":\"default_old\"," + "\"fragments\":[" + "{\"text\":\"Search for\"},"
			+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
			+ "{\"text\":\"that do have\"},"
			+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"more than\",\"defaultMap\":\"comparison\"},"
			+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":1},"
			+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
			+ "{\"text\":\".\"}]}";
	public static String CARD_XML_QUESTION_SIMPLE = "{\"template\":\"Card_xml\"," + "\"language\":\"xml\","
			+ "\"name\":\"question_simple\"," + "\"fragments\":[" + "{\"text\":\"Is there a\"},"
			+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
			+ "{\"text\":\"with more than one\"}," + "{\"params\":[0], \"value\":\"more than\"},"
			+ "{\"params\":[1], \"value\":\"1\"},"
			+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
			+ "{\"text\":\".\"}" + "]}";
	public static String CARD_XML_QUESTION = "{\"template\":\"Card_xml\"," + "\"language\":\"xml\","
			+ "\"name\":\"question\"," + "\"fragments\":[" + "{\"text\":\"Is there a\"},"
			+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
			+ "{\"text\":\"that has\"},"
			+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"more than\",\"defaultMap\":\"comparison\"},"
			+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":1},"
			+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
			+ "{\"text\":\".\"}" + "]}";
	public static String[] CARD_XML_VARIANTS = { CARD_XML_DEFAULT_CONSTRAINT, CARD_XML_DEFAULT_ANTIPATTERN };
	public static String[] CARD_XML_VARIANTS_OLD = { CARD_XML_DEFAULT_OLD, CARD_XML_QUESTION_SIMPLE, CARD_XML_QUESTION };

	public static String CARD_RDF_DEFAULT = "{\"template\":\"Card_rdf\"," + "\"language\":\"rdf\","
			+ "\"name\":\"default-antipattern\"," + "\"fragments\":[" + "{\"text\":\"Search for\"},"
			+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
			+ "{\"text\":\"where the number of\"},"
			+ "{\"name\":\"child elements\",\"params\":[4],\"exampleValue\":\"Birthdate\"},"
			+ "{\"text\":\"reached by\"},"
			+ "{\"name\":\"an rdf path\",\"params\":[3],\"exampleValue\":\"has\",\"defaultmap\":\"comparison\"},"
			+ "{\"text\":\"is\"},"
			+ "{\"name\":\"compared to\",\"params\":[0], \"exampleValue\":\"exactly\", \"defaultMap\":\"comparison\"},"
			+ "{\"name\":\"a specific number\",\"params\":[1]}," + "{\"text\":\".\"}]}";
	public static String[] CARD_RDF_VARIANTS = { CARD_RDF_DEFAULT };
	public static String[] CARD_RDF_VARIANTS_OLD = {};

	public static String CARD_NEO_DEFAULT = "{\"template\":\"Card_neo4j\"," + "\"language\":\"neo4j\","
			+ "\"name\":\"default-antipattern\"," + "\"fragments\":[" + "{\"text\":\"Search for\"},"
			+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
			+ "{\"text\":\"where the number of\"},"
			+ "{\"name\":\"node\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
			+ "{\"text\":\"that are connected via \"},"
			+ "{\"name\":\"a dependancy\",\"params\":[4],\"description\":\"relationship between elements and nodes\"},"
			+ "{\"text\":\"is\"},"
			+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"more than\",\"defaultMap\":\"comparison\"},"
			+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":1}," + "{\"text\":\".\"}]}";
	public static String[] CARD_NEO_VARIANTS = { CARD_NEO_DEFAULT };
	public static String[] CARD_NEO_VARIANTS_OLD = {};

}

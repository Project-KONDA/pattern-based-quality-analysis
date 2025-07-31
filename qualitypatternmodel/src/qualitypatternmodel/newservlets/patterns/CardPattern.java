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

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(PatternConstants.CARD_ID_GENERIC);
		pattern.setAbstractId(PatternConstants.CARD_ID_GENERIC);
		pattern.setName(PatternConstants.CARD_NAME);
		pattern.setDescription(PatternConstants.CARD_DESCR);

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
				PatternConstants.CARD_ID_XML,
				Map.of(2, "//*", 3, "/*"),
				CARD_XML_VARIANTS,
				CARD_XML_VARIANTS_OLD);
	}

	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				PatternConstants.CARD_ID_RDF,
				Map.of(),
				CARD_RDF_VARIANTS,
				CARD_RDF_VARIANTS_OLD);
	}

	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternBundle result = new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				PatternConstants.CARD_ID_NEO,
				Map.of(),
				CARD_NEO_VARIANTS,
				CARD_NEO_VARIANTS_OLD);
		return result;
	}

	public static String CARD_XML_DEFAULT_CONSTRAINT =
			"{\"template\":\"Card_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-constraint\","
			+ "\"typeConstraint\":true,"
			+ "\"fragments\":[" + "{\"text\":\"Each\"},"
			+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
			+ "{\"text\":\"has \"},"
			+ "{\"name\":\"a comparison with\",\"params\":[0],\"exampleValue\":\"at most\",\"defaultMap\":\"comparison_negated\"},"
			+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":\"1\"},"
			+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
			+ "{\"text\":\".\"}]}";
	public static String CARD_XML_DEFAULT_ANTIPATTERN = 
			"{\"template\":\"Card_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-antipattern\","
			+ "\"typeConstraint\":false,"
			+ "\"fragments\":["
			+ "{\"text\":\"Search for\"},"
			+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
			+ "{\"text\":\"where the number of\"},"
			+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
			+ "{\"text\":\"is\"},"
			+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"more than\",\"defaultMap\":\"comparison\"},"
			+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":1}," + "{\"text\":\".\"}]}";
	public static String CARD_XML_DEFAULT_OLD =
			"{\"template\":\"Card_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default_old\","
			+ "\"typeConstraint\":false,"
			+ "\"fragments\":["
			+ "{\"text\":\"Search for\"},"
			+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
			+ "{\"text\":\"that do have\"},"
			+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"more than\",\"defaultMap\":\"comparison\"},"
			+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":1},"
			+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
			+ "{\"text\":\".\"}]}";
	public static String CARD_XML_QUESTION_SIMPLE =
			"{\"template\":\"Card_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"question_simple\","
			+ "\"typeConstraint\":false,"
			+ "\"fragments\":["
			+ "{\"text\":\"Is there a\"},"
			+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
			+ "{\"text\":\"with more than one\"},"
			+ "{\"params\":[0], \"value\":\"more than\"},"
			+ "{\"params\":[1], \"value\":\"1\"},"
			+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
			+ "{\"text\":\".\"}" + "]}";
	public static String CARD_XML_QUESTION = 
			"{\"template\":\"Card_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"question\","
			+ "\"typeConstraint\":false,"
			+ "\"fragments\":["
			+ "{\"text\":\"Is there a\"},"
			+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
			+ "{\"text\":\"that has\"},"
			+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"more than\",\"defaultMap\":\"comparison\"},"
			+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":1},"
			+ "{\"name\":\"child elements\",\"params\":[3],\"exampleValue\":\"Birthdates\",\"description\":\"counted elements\", \"plural\": \"true\"},"
			+ "{\"text\":\".\"}" + "]}";
	public static String[] CARD_XML_VARIANTS = { CARD_XML_DEFAULT_CONSTRAINT, CARD_XML_DEFAULT_ANTIPATTERN };
	public static String[] CARD_XML_VARIANTS_OLD = { CARD_XML_DEFAULT_OLD, CARD_XML_QUESTION_SIMPLE, CARD_XML_QUESTION };

	public static String CARD_RDF_DEFAULT =
			"{\"template\":\"Card_rdf\","
			+ "\"language\":\"rdf\","
			+ "\"name\":\"default-antipattern\","
			+ "\"typeConstraint\":false,"
			+ "\"fragments\":["
			+ "{\"text\":\"Search for\"},"
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

	public static String CARD_NEO_DEFAULT = 
			"{\"template\":\"Card_neo4j\"," 
			+ "\"language\":\"neo4j\","
			+ "\"name\":\"default-antipattern\","
			+ "\"typeConstraint\":false,"
			+ "\"fragments\":["
			+ "{\"text\":\"Search for\"},"
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

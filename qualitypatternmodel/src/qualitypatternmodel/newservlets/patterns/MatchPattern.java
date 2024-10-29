package qualitypatternmodel.newservlets.patterns;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class MatchPattern {

	static String MATCH_ID_GENERIC = "Match_generic";
	static String MATCH_ID_XML = "Match_xml";
	static String MATCH_ID_RDF = "Match_rdf";
	static String MATCH_ID_NEO = "Match_neo4j";
	static String MATCH_NAME = "Regular Expression Check";
	static String MATCH_DESCR = "Check, whether a value matches a specific regular expression.";

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(MATCH_ID_GENERIC);
		pattern.setAbstractId(MATCH_ID_GENERIC);
		pattern.setName(MATCH_NAME);
		pattern.setDescription(MATCH_DESCR);

		pattern.getGraph().getReturnNodes().get(0).makeComplex();

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		Node ret = pattern.getGraph().getReturnNodes().get(0);
		Node element1 = ret.addOutgoing(quantifiedCondition.getGraph()).getTarget().makePrimitive();

		TextLiteralParam tlp = element1.addPrimitiveMatch();
		if (ServletConstants.FILL_VALUES) {
			tlp.setValue("[a-zA-Z]*");
		}

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				MATCH_ID_NEO,
				Map.of(),
				MATCH_NEO_VARIANTS,
				MATCH_NEO_VARIANTS_OLD);
	}

	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				MATCH_ID_RDF,
				Map.of(),
				MATCH_RDF_VARIANTS,
				MATCH_RDF_VARIANTS_OLD);
	}

	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				MATCH_ID_XML,
				Map.of(2, "//*", 3, "/*/text()"),
				MATCH_XML_VARIANTS,
				MATCH_XML_VARIANTS_OLD);
	}

	public static String MATCH_XML_DEFAULT_CONSTRAINT =
		"{\"template\":\"Match_xml\","
		+ "\"language\":\"xml\","
		+ "\"name\":\"default-constraint\","
		+ "\"typeConstraint\":true,"
		+ "\"fragments\":["
		+ "{\"text\":\"For each\"},"
		+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
		+ "{\"text\":\"all\"},"
		+ "{\"name\":\"properties\",\"params\":[3],\"exampleValue\":\"Surname\",\"description\":\"value that gets analysed\", \"plural\": \"true\"},"
		+ "{\"name\":\"do / do not\",\"params\":[0],\"defaultMap\":\"do not\",\"exampleValue\":\"do\"},"
		+ "{\"text\":\"match\"},"
		+ "{\"name\":\"a specific pattern (RegEx)\",\"params\":[1],\"exampleValue\":\"[A-Z][a-z][a-z]+\"},"
		+ "{\"text\":\".\"}]}";
	public static String MATCH_XML_DEFAULT_ANTIPATTERN =
		"{\"template\":\"Match_xml\","
		+ "\"language\":\"xml\","
		+ "\"name\":\"default-antipattern\","
		+ "\"typeConstraint\":false,"
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
		+ "{\"text\":\"where a\"},"
		+ "{\"name\":\"property\",\"params\":[3],\"exampleValue\":\"Surname\",\"description\":\"value that gets analysed\"},"
		+ "{\"name\":\"does / does not\",\"params\":[0],\"defaultMap\":\"does\",\"exampleValue\":\"does\"},"
		+ "{\"text\":\"match\"},"
		+ "{\"name\":\"a specific pattern (RegEx)\",\"params\":[1],\"exampleValue\":\"[A-Z][a-z][a-z]+\"},"
		+ "{\"text\":\".\"}]}";
	public static String[] MATCH_XML_VARIANTS = {MATCH_XML_DEFAULT_CONSTRAINT, MATCH_XML_DEFAULT_ANTIPATTERN};
	public static String[] MATCH_XML_VARIANTS_OLD = {};

	public static String MATCH_RDF_DEFAULT =
		"{\"template\":\"Match_rdf\","
		+ "\"language\":\"rdf\","
		+ "\"name\":\"default-antipattern\","
		+ "\"typeConstraint\":false,"
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
	public static String[] MATCH_RDF_VARIANTS = {MATCH_RDF_DEFAULT};
	public static String[] MATCH_RDF_VARIANTS_OLD = {};

	public static String MATCH_NEO_DEFAULT =
		"{\"template\":\"Match_neo4j\","
		+ "\"language\":\"neo4j\","
		+ "\"name\":\"default-antipattern\","
		+ "\"typeConstraint\":false,"
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
	public static String[] MATCH_NEO_VARIANTS = {MATCH_NEO_DEFAULT};
	public static String[] MATCH_NEO_VARIANTS_OLD = {};

}

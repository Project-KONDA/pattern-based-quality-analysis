package qualitypatternmodel.newservlets.patterns;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class ContainsPattern {

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(PatternConstants.CONTAINS_ID_GENERIC);
		pattern.setAbstractId(PatternConstants.CONTAINS_ID_GENERIC);
		pattern.setName(PatternConstants.CONTAINS_NAME);
		pattern.setDescription(PatternConstants.CONTAINS_DESCR);

		// Context graph of pattern:
		pattern.getGraph().getReturnNodes().get(0).makeComplex();
		Graph g1 = pattern.getGraph();
		Node ret = g1.getReturnNodes().get(0);

		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);
		Graph g2 = quantifiedCondition.getGraph();

		Node element1 = ret.addOutgoing(g2).getTarget().makePrimitive();
		TextLiteralParam tlp = element1.addPrimitiveContains();
		if (ServletConstants.FILL_VALUES) {
			tlp.setValue("abc");
		}

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				PatternConstants.CONTAINS_ID_NEO,
				Map.of(),
				CONTAINS_NEO_VARIANTS,
				CONTAINS_NEO_VARIANTS_OLD);
	}

	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				PatternConstants.CONTAINS_ID_RDF,
				Map.of(),
				CONTAINS_RDF_VARIANTS,
				CONTAINS_RDF_VARIANTS_OLD);
	}

	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				PatternConstants.CONTAINS_ID_XML,
				Map.of(2, "//*", 3, "/*/text()"),
				CONTAINS_XML_VARIANTS,
				CONTAINS_XML_VARIANTS_OLD);
	}

	public static String CONTAINS_XML_DEFAULT_CONSTRAINT =
		"{\"template\":\"Contains_xml\","
		+ "\"language\":\"xml\","
		+ "\"name\":\"default-constraint\","
		+ "\"typeConstraint\":true,"
		+ "\"fragments\":["
		+ "{\"text\":\"For\"},"
		+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
		+ "{\"text\":\", each\"},"
		+ "{\"name\":\"property\",\"params\":[3],\"exampleValue\":\"Education\",\"description\":\"analysed property\"},"
		+ "{\"name\":\"does / does not\",\"params\":[0],\"defaultMap\":\"does not\",\"exampleValue\":\"does\"},"
		+ "{\"text\":\"contain\"},"
		+ "{\"name\":\"a specific term\",\"params\":[1],\"exampleValue\":\"Master of\"},"
		+ "{\"text\":\".\"}]}";
	public static String CONTAINS_XML_DEFAULT_ANTIPATTERN =
		"{\"template\":\"Contains_xml\","
		+ "\"language\":\"xml\","
		+ "\"name\":\"default-antipattern\","
		+ "\"typeConstraint\":false,"
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
		+ "{\"text\":\"where at least one\"},"
		+ "{\"name\":\"property\",\"params\":[3],\"exampleValue\":\"Education\",\"description\":\"analysed property\"},"
		+ "{\"name\":\"does / does not\",\"params\":[0],\"defaultMap\":\"does\",\"exampleValue\":\"does\"},"
		+ "{\"text\":\"contain\"},"
		+ "{\"name\":\"a specific term\",\"params\":[1],\"exampleValue\":\"Master of\"},"
		+ "{\"text\":\".\"}]}";
	public static String[] CONTAINS_XML_VARIANTS = {CONTAINS_XML_DEFAULT_CONSTRAINT, CONTAINS_XML_DEFAULT_ANTIPATTERN};
	public static String[] CONTAINS_XML_VARIANTS_OLD = {};

	public static String CONTAINS_RDF_DEFAULT =
		"{\"template\":\"Contains_rdf\","
		+ "\"language\":\"rdf\","
		+ "\"name\":\"default-antipattern\","
		+ "\"typeConstraint\":false,"
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
		+ "{\"text\":\"where at least one property reached by\"},"
		+ "{\"name\":\"an rdf property path\",\"params\":[3],\"exampleValue\":\"has\"},{\"name\":\"does / does not\",\"params\":[0], \"exampleValue\":\"does\", \"defaultMap\":\"does\"},"
		+ "{\"text\":\"contain\"},"
		+ "{\"name\":\"a specific term\",\"params\":[1]},"
		+ "{\"text\":\".\"}]}";
	public static String[] CONTAINS_RDF_VARIANTS = {CONTAINS_RDF_DEFAULT};
	public static String[] CONTAINS_RDF_VARIANTS_OLD = {};

	public static String CONTAINS_NEO_DEFAULT =
		"{\"template\":\"Contains_neo4j\","
		+ "\"language\":\"neo4j\","
		+ "\"name\":\"default-antipattern\","
		+ "\"typeConstraint\":false,"
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
		+ "{\"text\":\"where a property reached by\"},"
		+ "{\"name\":\"an neo property path\",\"params\":[3],\"exampleValue\":\"has\"},"
		+ "{\"name\":\"does / does not\",\"params\":[0], \"exampleValue\":\"does\", \"defaultMap\":\"does\"},"
		+ "{\"text\":\"contain\"},"
		+ "{\"name\":\"a specific term\",\"params\":[1]},"
		+ "{\"text\":\".\"}]}";
	public static String[] CONTAINS_NEO_VARIANTS = {CONTAINS_NEO_DEFAULT};
	public static String[] CONTAINS_NEO_VARIANTS_OLD = {};

}

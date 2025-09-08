package qualitypatternmodel.newservlets.patterns.string;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class ContainsPattern extends PatternClass {

	public ContainsPattern() {
		super(PatternConstants.CONTAINS_ID,
				PatternConstants.CONTAINS_NAME, 
				PatternConstants.CONTAINS_DESCR, 
				true, true, true, true);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

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

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

	@Override
	protected String[] xmlVariants() {
		return new String[] { CONTAINS_XML_DEFAULT_CONSTRAINT, CONTAINS_XML_DEFAULT_ANTIPATTERN };
	}

	@Override
	protected String[] rdfVariants() {
		return new String[] { CONTAINS_RDF_DEFAULT };
	}

	@Override
	protected String[] neoVariants() {
		return new String[] { CONTAINS_NEO_DEFAULT };
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

}

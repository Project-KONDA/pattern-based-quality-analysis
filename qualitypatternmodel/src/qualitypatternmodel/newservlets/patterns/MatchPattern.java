package qualitypatternmodel.newservlets.patterns;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class MatchPattern extends PatternClass {

	MatchPattern() {
		super(PatternConstants.MATCH_ID,
				PatternConstants.MATCH_NAME, 
				PatternConstants.MATCH_DESCR, 
				true, true, true, true);
	}

	@Override
	CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		pattern.getGraph().getReturnNodes().get(0).makeComplex();

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		Node ret = pattern.getGraph().getReturnNodes().get(0);
		Node element1 = ret.addOutgoing(quantifiedCondition.getGraph()).getTarget().makePrimitive();

		TextLiteralParam tlp = element1.addPrimitiveMatch();
		if (ServletConstants.FILL_VALUES) {
			tlp.setValue("[a-zA-Z]*");
		}

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

	protected String[] xmlVariants() {
		return new String[] { MATCH_XML_DEFAULT_CONSTRAINT, MATCH_XML_DEFAULT_ANTIPATTERN, MATCH_XML_CONSTRAINT_DATE };
	}

	protected String[] rdfVariants() {
		return new String[] { MATCH_RDF_DEFAULT };
	}

	protected String[] neoVariants() {
		return new String[] { MATCH_NEO_DEFAULT };
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
	static String DATE_REGEX = "^\\d{4}(-[01]\\d(-[0-3]\\d(T[01]\\d:[0-5]\\d(:[0-5]\\d(\\.\\d+)?)?(\\+[01]\\d:[03]0)?)?)?)?$";
	static String DATE_REGEX_ESCAPED = "^\\\\d{4}(-[01]\\\\d(-[0-3]\\\\d(T[01]\\\\d:[0-5]\\\\d(:[0-5]\\\\d(\\\\.\\\\d+)?)?(\\\\+[01]\\\\d:[03]0)?)?)?)?$";
	public static String MATCH_XML_CONSTRAINT_DATE =
		"{\"template\":\"Match_xml\","
		+ "\"language\":\"xml\","
		+ "\"name\":\"constraint_date\","
		+ "\"typeConstraint\":true,"
		+ "\"fragments\":["
		+ "{\"text\":\"For each\"},"
		+ "{\"name\":\"element\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
		+ "{\"text\":\"all\"},"
		+ "{\"name\":\"properties\",\"params\":[3],\"exampleValue\":\"Surname\",\"description\":\"value that gets analysed\",\"plural\":\"true\"},"
		+ "{\"text\":\"match the ISO 8601 format.\"},"
		+ "{\"params\":[0],\"value\": \"false\"},"
		+ "{\"params\":[1],\"value\":\"" + DATE_REGEX_ESCAPED + "\"}]}";

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
}

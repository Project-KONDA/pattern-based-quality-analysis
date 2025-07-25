package qualitypatternmodel.newservlets.patterns;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class ValidLinkPattern {

	static String VALIDLINK_ID_GENERIC = "ValidLink_generic";
	static String VALIDLINK_ID_XML = "ValidLink_xml";
	static String VALIDLINK_ID_RDF = "ValidLink_rdf";
	static String VALIDLINK_ID_NEO = "ValidLink_neo4j";
	static String VALIDLINK_NAME = "Valid Link";
	static String VALIDLINK_DESCR = "Check whether a record an invalid link in a field.";

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(VALIDLINK_ID_GENERIC);
		pattern.setAbstractId(VALIDLINK_ID_GENERIC);
		pattern.setName(VALIDLINK_NAME);
		pattern.setDescription(VALIDLINK_DESCR);

		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");

		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);

		PrimitiveNode field = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field.setName("field");

		field.addPrimitiveValidateLink();

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				VALIDLINK_ID_XML,
				Map.of(1, "//*", 2, "/*/text()"),
				INVALIDLINK_XML_VARIANTS,
				INVALIDLINK_XML_VARIANTS_OLD);
	}

	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				VALIDLINK_ID_RDF,
				Map.of(),
				null,
				null);
	}

	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				VALIDLINK_ID_NEO,
				Map.of(),
				null,
				null);
	}

	public static String INVALIDLINK_XML_DEFAULT_CONSTRAINT =
		"{\"template\":\"InvalidLink_xml\","
		+ "\"language\":\"xml\","
		+ "\"name\":\"default-constraint\","
		+ "\"typeConstraint\":true,"
		+ "\"fragments\":["
		+ "{\"text\":\"For\"},"
		+ "{\"name\":\"elements\",\"params\":[1],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
		+ "{\"text\":\", each\"},"
		+ "{\"name\":\"property\",\"params\":[2],\"exampleValue\":\"Birth Certificate Source\",\"description\":\"property of interest,that should contain a valid link.\"},"
		+ "{\"name\":\"is/is not\",\"params\":[0],\"defaultMap\":\"is\",\"exampleValue\":\"is\"},"
		+ "{\"text\":\"a valid link.\"}]}";
	public static String INVALIDLINK_XML_DEFAULT_ANTIPATTERN =
		"{\"template\":\"InvalidLink_xml\","
		+ "\"language\":\"xml\","
		+ "\"name\":\"default-antipattern\","
		+ "\"typeConstraint\":false,"
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[1],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
		+ "{\"text\":\"where any\"},"
		+ "{\"name\":\"property\",\"params\":[2],\"exampleValue\":\"Birth Certificate Source\",\"description\":\"property of interest,that should contain a valid link.\"},"
		+ "{\"name\":\"does / does not\",\"params\":[0],\"defaultMap\":\"does\",\"exampleValue\":\"does\",\"description\":\"Do you search for elements that contain a valid link (‘does’) or invalid links (‘does not’)?\"},"
		+ "{\"text\":\"contain a valid link.\"}]}";
	public static String INVALIDLINK_XML_QUESTION =
		"{\"template\":\"InvalidLink_xml\","
		+ "\"language\":\"xml\","
		+ "\"name\":\"question\","
		+ "\"typeConstraint\":false,"
		+ "\"fragments\":["
		+ "{\"text\":\"Is there a\"},"
		+ "{\"name\":\"element\",\"params\":[1],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
		+ "{\"text\":\"where the link in the\"},"
		+ "{\"name\":\"property\",\"params\":[2],\"exampleValue\":\"Birth Certificate Source\",\"description\":\"property of interest,that should contain a valid link.\"},"
		+ "{\"name\":\"is / is not\",\"params\":[0],\"defaultMap\":\"is\",\"exampleValue\":\"is\",\"description\":\"Do you search for elements that contain a valid link (‘is’) or invalid links (‘is not’)?\"},"
		+ "{\"text\":\"valid?\"}]}";
	public static String[] INVALIDLINK_XML_VARIANTS = {INVALIDLINK_XML_DEFAULT_CONSTRAINT, INVALIDLINK_XML_DEFAULT_ANTIPATTERN};
	public static String[] INVALIDLINK_XML_VARIANTS_OLD = {INVALIDLINK_XML_QUESTION};

}

package qualitypatternmodel.newservlets.patterns;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class ValidLinkPattern extends PatternClass {

	ValidLinkPattern() {
		super(PatternConstants.VALIDLINK_ID,
				PatternConstants.VALIDLINK_NAME, 
				PatternConstants.VALIDLINK_DESCR, 
				true, true, false, false);
	}

	@Override
	CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");

		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);

		PrimitiveNode field = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field.setName("field");

		field.addPrimitiveValidateLink();

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

	@Override
	protected Map<Integer, String> xmlMap() {
		return Map.of(1, "//*", 2, "/*/text()");
	}

	@Override
	protected String[] xmlVariants() {
		return new String[] { INVALIDLINK_XML_DEFAULT_CONSTRAINT, INVALIDLINK_XML_DEFAULT_ANTIPATTERN };
	}

	@Override
	protected String[] xmlVariantsOld() {
		return new String[] { INVALIDLINK_XML_QUESTION };
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
}

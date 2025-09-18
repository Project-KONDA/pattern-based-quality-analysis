package qualitypatternmodel.newservlets.patterns.mand;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class MandAttPattern extends PatternClass {

	public MandAttPattern() {
		super(PatternConstants.MANDATT_ID,
				PatternConstants.MANDATT_NAME, 
				PatternConstants.MANDATT_DESCR, 
				true, true, true, true);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("element");

		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		pattern.setCondition(not);

		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		not.setCondition(qc);

		PrimitiveNode field = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field.setName("property");

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

	@Override
	protected String[] xmlVariants() {
		return new String[] { MANDATT_XML_DEFAULT_CONSTRAINT, MANDATT_XML_DEFAULT_ANTIPATTERN };
	}

	protected String[] rdfVariants() {
		return new String[] { MANDATT_RDF_DEFAULT };
	}

	protected String[] neoVariants() {
		return new String[] { MANDATT_NEO_DEFAULT };
	}

	public static String MANDATT_XML_DEFAULT_CONSTRAINT =
			"{\"template\":\"MandAtt_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-constraint\","
			+ "\"typeConstraint\":true,"
			+ "\"fragments\":["
			+ "{\"text\":\"Each\"},"
			+ "{\"name\":\"element\",\"params\":[0],\"exampleValue\":\"Actor\",\"description\":\"anchor for analysis\"},"
			+ "{\"text\":\"has at least one \"},"
			+ "{\"name\":\"child element\",\"params\":[1],\"exampleValue\":\"Birthdate\",\"description\":\"value that gets analysed\"},"
			+ "{\"text\":\".\"}]}";
	public static String MANDATT_XML_DEFAULT_ANTIPATTERN =
			"{\"template\":\"MandAtt_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-antipattern\","
			+ "\"typeConstraint\":false,"
			+ "\"fragments\":["
			+ "{\"text\":\"Search for\"},"
			+ "{\"name\":\"elements\",\"params\":[0],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
			+ "{\"text\":\"without a\"},"
			+ "{\"name\":\"child element\",\"params\":[1],\"exampleValue\":\"Birthdate\",\"description\":\"value that gets analysed\"},"
			+ "{\"text\":\".\"}]}";

	public static String MANDATT_RDF_DEFAULT = "{\"template\":\"MandAtt_rdf\","
			+ "\"language\":\"rdf\","
			+ "\"name\":\"default-antipattern\","
			+ "\"typeConstraint\":false,"
			+ "\"fragments\":["
			+ "{\"text\":\"Search for\"},"
			+ "{\"name\":\"elements\",\"params\":[0],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
			+ "{\"text\":\"without a property of type\"},"
			+ "{\"name\":\"type\",\"params\":[2],\"exampleValue\":\"\"},"
			+ "{\"text\":\"reached by\"},"
			+ "{\"name\":\"an rdf property path\",\"params\":[1],\"exampleValue\":\"has\"},"
			+ "{\"text\":\".\"}]}";

	public static String MANDATT_NEO_DEFAULT = "{\"template\":\"MandAtt_neo4j\","
			+ "\"language\":\"neo4j\","
			+ "\"name\":\"default-antipattern\","
			+ "\"typeConstraint\":false,"
			+ "\"fragments\":["
			+ "{\"text\":\"Search for\"},"
			+ "{\"name\":\"elements\",\"params\":[0],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
			+ "{\"text\":\"without a property of type\"}," + "{\"name\":\"type\",\"params\":[1],\"exampleValue\":\"\"},"
			+ "{\"text\":\"reached by\"},"
			+ "{\"name\":\"an neo property path\",\"params\":[2],\"exampleValue\":\"has\"},"
			+ "{\"text\":\".\"}]}";
}

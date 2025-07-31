package qualitypatternmodel.newservlets.patterns;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class MandAttPattern {

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(PatternConstants.MANDATT_ID_GENERIC);
		pattern.setAbstractId(PatternConstants.MANDATT_ID_GENERIC);
		pattern.setName(PatternConstants.MANDATT_NAME);
		pattern.setDescription(PatternConstants.MANDATT_DESCR);

		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");

		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		pattern.setCondition(not);

		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		not.setCondition(qc);

		ComplexNode field = main.addOutgoing(qc.getGraph()).getTarget().makeComplex();
		field.setName("field");

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				PatternConstants.MANDATT_ID_XML,
				Map.of(0, "//*", 1, "/*"),
				MANDATT_XML_VARIANTS,
				MANDATT_XML_VARIANTS_OLD);
	}

	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				PatternConstants.MANDATT_ID_RDF,
				Map.of(),
				MANDATT_RDF_VARIANTS,
				MANDATT_RDF_VARIANTS_OLD);
	}

	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(), 
				Language.NEO4J,
				PatternConstants.MANDATT_ID_NEO,
				Map.of(),
				MANDATT_NEO_VARIANTS,
				MANDATT_NEO_VARIANTS_OLD);
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
	public static String[] MANDATT_XML_VARIANTS = { MANDATT_XML_DEFAULT_CONSTRAINT, MANDATT_XML_DEFAULT_ANTIPATTERN };
	public static String[] MANDATT_XML_VARIANTS_OLD = {};

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
	public static String[] MANDATT_RDF_VARIANTS = { MANDATT_RDF_DEFAULT };
	public static String[] MANDATT_RDF_VARIANTS_OLD = {};

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
	public static String[] MANDATT_NEO_VARIANTS = { MANDATT_NEO_DEFAULT };
	public static String[] MANDATT_NEO_VARIANTS_OLD = {};

}

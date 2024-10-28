package qualitypatternmodel.newservlets.patterns;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class UniquePattern {

	static String UNIQUE_ID_GENERIC = "Unique_generic";
	static String UNIQUE_ID_XML = "Unique_xml";
	static String UNIQUE_ID_RDF = "Unique_rdf";
	static String UNIQUE_ID_NEO = "Unique_neo4j";
	static String UNIQUE_NAME = "Uniqueness Constraint";
	static String UNIQUE_DESCR = "Check, whether a value is unique within the dataset.";

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(UNIQUE_ID_GENERIC);
		pattern.setAbstractId(UNIQUE_ID_GENERIC);
		pattern.setName(UNIQUE_NAME);
		pattern.setDescription(UNIQUE_DESCR);

		// NotCondition notCon = PatternstructureFactory.eINSTANCE.createNotCondition();
		// pattern.setCondition(notCon);

		QuantifiedCondition quaCon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		// notCon.setCondition(quaCon);
		pattern.setCondition(quaCon);

		ComplexNode r1 = pattern.getGraph().getNodes().get(0).makeComplex();
		r1.setName("Original");
		ComplexNode r2 = quaCon.getGraph().addComplexNode();
		r2.setName("Copy");

		Comparison c = r1.addComparison(r2);
		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
		c.getOption().setPredefined(true);

		PrimitiveNode n = r1.addOutgoing(quaCon.getGraph()).getTarget().makePrimitive();
		n.setName("Value");
		r2.addOutgoing(n);

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				UNIQUE_ID_NEO,
				Map.of(),
				UNIQUE_NEO_VARIANTS,
				UNIQUE_NEO_VARIANTS_OLD);
	}

	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				UNIQUE_ID_RDF,
				Map.of(),
				UNIQUE_RDF_VARIANTS,
				UNIQUE_RDF_VARIANTS_OLD);
	}

	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				UNIQUE_ID_XML,
				Map.of(2, "//*", 3, "/*/text()", 4, "/*/text()", 5, "//*"),
				UNIQUE_XML_VARIANTS,
				UNIQUE_XML_VARIANTS_OLD);
	}

	public static String UNIQUE_XML_DEFAULT_CONSTRAINT =
		"{\"template\":\"Unique_xml\","
		+ "\"language\":\"xml\","
		+ "\"name\":\"default-constraint\","
		+ "\"fragments\":["
		+ "{\"text\":\"For\"},"
		+ "{\"name\":\"elements\",\"params\":[2,5],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
		+ "{\"text\":\", the\"},"
		+ "{\"name\":\"property\",\"params\":[3,4],\"exampleValue\":\"Identifier (Value)\",\"description\":\"value that gets analysed\"},"
		+ "{\"text\":\"is unique.\"}]}";
	public static String UNIQUE_XML_DEFAULT_ANTIPATTERN =
		"{\"template\":\"Unique_xml\","
		+ "\"language\":\"xml\","
		+ "\"name\":\"default-antipattern\","
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[2,5],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
		+ "{\"text\":\"where a\"},"
		+ "{\"name\":\"property\",\"params\":[3,4],\"exampleValue\":\"Identifier (Value)\",\"description\":\"value that gets analysed\"},"
		+ "{\"text\":\"is not unique within the data set.\"}]}";
	public static String UNIQUE_XML_DEFAULT_OLD =
		"{\"template\":\"Unique_xml\","
		+ "\"language\":\"xml\","
		+ "\"name\":\"default-antipattern\","
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[2,5],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
		+ "{\"text\":\"where a value of\"},"
		+ "{\"name\":\"property\",\"params\":[3,4],\"exampleValue\":\"Identifier (Value)\",\"description\":\"value that gets analysed\"},"
		+ "{\"text\":\"is not unique within the data set.\"}]}";
	public static String[] UNIQUE_XML_VARIANTS = {UNIQUE_XML_DEFAULT_CONSTRAINT, UNIQUE_XML_DEFAULT_ANTIPATTERN};
	public static String[] UNIQUE_XML_VARIANTS_OLD = {UNIQUE_XML_DEFAULT_OLD};

	public static String UNIQUE_RDF_DEFAULT =
		"{\"template\":\"Unique_rdf\","
		+ "\"language\":\"rdf\","
		+ "\"name\":\"default-antipattern\","
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[2,3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
		+ "{\"text\":\"where a property reached by\"},"
		+ "{\"name\":\"an rdf property path\",\"params\":[4,5],\"exampleValue\":\"has\"},"
		+ "{\"text\":\"is not unique within the data set.\"}]}";
	public static String[] UNIQUE_RDF_VARIANTS = {UNIQUE_RDF_DEFAULT};
	public static String[] UNIQUE_RDF_VARIANTS_OLD = {};

	public static String UNIQUE_NEO_DEFAULT =
		"{\"template\":\"Unique_neo4j\","
		+ "\"language\":\"neo4j\","
		+ "\"name\":\"default-antipattern\","
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[2,3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
		+ "{\"text\":\"where a property reached by\"},"
		+ "{\"name\":\"an neo property path\",\"params\":[4,5],\"exampleValue\":\"has\"},"
		+ "{\"text\":\"is not unique within the data set.\"}]}";
	public static String[] UNIQUE_NEO_VARIANTS = {UNIQUE_NEO_DEFAULT};
	public static String[] UNIQUE_NEO_VARIANTS_OLD = {};

}

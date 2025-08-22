package qualitypatternmodel.newservlets.patterns;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class UniquePattern extends PatternClass {

	public UniquePattern() {
		super(PatternConstants.UNIQUE_ID,
				PatternConstants.UNIQUE_NAME, 
				PatternConstants.UNIQUE_DESCR, 
				true, true, true, true);
	}

	@Override
	CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

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

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

	@Override
	protected Map<Integer, String> xmlMap() {
		return Map.of(2, "//*", 3, "/*/text()", 4, "/*/text()", 5, "//*");
	}

	protected String[] xmlVariants() {
		return new String[] { UNIQUE_XML_DEFAULT_CONSTRAINT, UNIQUE_XML_DEFAULT_ANTIPATTERN };
	}

	protected String[] xmlVariantsOld() {
		return new String[] { UNIQUE_XML_DEFAULT_OLD };
	}

	protected String[] rdfVariants() {
		return new String[] { UNIQUE_RDF_DEFAULT };
	}

	protected String[] neoVariants() {
		return new String[] { UNIQUE_NEO_DEFAULT };
	}

	public static String UNIQUE_XML_DEFAULT_CONSTRAINT =
		"{\"template\":\"Unique_xml\","
		+ "\"language\":\"xml\","
		+ "\"name\":\"default-constraint\","
		+ "\"typeConstraint\":true,"
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
		+ "\"typeConstraint\":false,"
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
		+ "\"typeConstraint\":false,"
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[2,5],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
		+ "{\"text\":\"where a value of\"},"
		+ "{\"name\":\"property\",\"params\":[3,4],\"exampleValue\":\"Identifier (Value)\",\"description\":\"value that gets analysed\"},"
		+ "{\"text\":\"is not unique within the data set.\"}]}";

	public static String UNIQUE_RDF_DEFAULT =
		"{\"template\":\"Unique_rdf\","
		+ "\"language\":\"rdf\","
		+ "\"name\":\"default-antipattern\","
		+ "\"typeConstraint\":false,"
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[2,3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
		+ "{\"text\":\"where a property reached by\"},"
		+ "{\"name\":\"an rdf property path\",\"params\":[4,5],\"exampleValue\":\"has\"},"
		+ "{\"text\":\"is not unique within the data set.\"}]}";

	public static String UNIQUE_NEO_DEFAULT =
		"{\"template\":\"Unique_neo4j\","
		+ "\"language\":\"neo4j\","
		+ "\"name\":\"default-antipattern\","
		+ "\"typeConstraint\":false,"
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[2,3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
		+ "{\"text\":\"where a property reached by\"},"
		+ "{\"name\":\"an neo property path\",\"params\":[4,5],\"exampleValue\":\"has\"},"
		+ "{\"text\":\"is not unique within the data set.\"}]}";
}

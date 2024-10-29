package qualitypatternmodel.newservlets.patterns;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.operators.StringLength;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class StringLengthPattern {

	static String STRINGLENGTH_ID_GENERIC = "StringLength_generic";
	static String STRINGLENGTH_ID_XML = "StringLength_xml";
	static String STRINGLENGTH_ID_RDF = "StringLength_rdf";
	static String STRINGLENGTH_ID_NEO = "StringLength_neo4j";
	static String STRINGLENGTH_NAME = "String value length restriction";
	static String STRINGLENGTH_DESCR = "Check whether all field values comply to the length restriction.";

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(STRINGLENGTH_ID_GENERIC);
		pattern.setAbstractId(STRINGLENGTH_ID_GENERIC);
		pattern.setName(STRINGLENGTH_NAME);
		pattern.setDescription(STRINGLENGTH_DESCR);

		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");

		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);

		PrimitiveNode field = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field.setName("field");

		StringLength sl = field.addPrimitiveStringLength();

		if (ServletConstants.FILL_VALUES) {
			sl.getNumber().setValue(1.);
		}

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				STRINGLENGTH_ID_NEO,
				Map.of(),
				STRINGLENGTH_NEO_VARIANTS,
				STRINGLENGTH_NEO_VARIANTS_OLD);
	}

	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				STRINGLENGTH_ID_RDF,
				Map.of(),
				STRINGLENGTH_RDF_VARIANTS,
				STRINGLENGTH_RDF_VARIANTS_OLD);
	}

	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				STRINGLENGTH_ID_XML,
				Map.of(2, "//*", 3, "/*/text()"),
				STRINGLENGTH_XML_VARIANTS,
				STRINGLENGTH_XML_VARIANTS_OLD);
	}

	public static String STRINGLENGTH_XML_DEFAULT_CONSTRAINT =
	"{\"template\":\"StringLength_xml\","
	+ "\"language\":\"xml\","
	+ "\"name\":\"default-constraint\","
	+ "\"typeConstraint\":true,"
	+ "\"fragments\":["
		+ "{\"text\":\"For\"},"
		+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
		+ "{\"text\":\", each\"},"
		+ "{\"name\":\"property\",\"params\":[3],\"exampleValue\":\"LastName\",\"description\":\"value that gets analysed\"},"
		+ "{\"text\":\"is\"},"
		+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"less than\",\"defaultMap\":\"comparison_negated\"},"
		+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":\"10\"},"
		+ "{\"text\":\"characters in length.\"}]}";
	public static String STRINGLENGTH_XML_DEFAULT_ANTIPATTERN =
	"{\"template\":\"StringLength_xml\","
	+ "\"language\":\"xml\","
	+ "\"name\":\"default-antipattern\","
	+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
		+ "{\"text\":\"where at least one\"},"
		+ "{\"name\":\"property\",\"params\":[3],\"exampleValue\":\"LastName\",\"description\":\"value that gets analysed\"},"
		+ "{\"text\":\"is\"},"
		+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"less than\",\"defaultMap\":\"comparison\"},"
		+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":\"10\"},"
		+ "{\"text\":\"characters in length.\"}]}";
	public static String STRINGLENGTH_XML_DEFAULT_OLD =
	"{\"template\":\"StringLength_xml\","
	+ "\"language\":\"xml\","
	+ "\"name\":\"default_old\","
	+ "\"typeConstraint\":false,"
	+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
		+ "{\"text\":\"where the length of at least one value of\"},"
		+ "{\"name\":\"property\",\"params\":[3],\"exampleValue\":\"LastName\",\"description\":\"value that gets analysed\"},"
		+ "{\"text\":\"is\"},"
		+ "{\"name\":\"compared to\",\"params\":[0],\"exampleValue\":\"less than\",\"defaultMap\":\"comparison\"},"
		+ "{\"name\":\"a specific number\",\"params\":[1],\"exampleValue\":\"10\"},"
		+ "{\"text\":\".\"}]}";
	public static String[] STRINGLENGTH_XML_VARIANTS = {STRINGLENGTH_XML_DEFAULT_CONSTRAINT, STRINGLENGTH_XML_DEFAULT_ANTIPATTERN};
	public static String[] STRINGLENGTH_XML_VARIANTS_OLD = {STRINGLENGTH_XML_DEFAULT_OLD};

	public static String STRINGLENGTH_RDF_DEFAULT =
	"{\"template\":\"StringLength_rdf\","
	+ "\"language\":\"rdf\","
	+ "\"name\":\"default-antipattern\","
	+ "\"typeConstraint\":false,"
	+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
		+ "{\"text\":\"where at least one property reached by\"},"
		+ "{\"name\":\"an rdf property path\",\"params\":[3],\"exampleValue\":\"has\"},"
		+ "{\"text\":\"is\"},"
		+ "{\"name\":\"compared to\",\"params\":[0], \"exampleValue\":\"exactly\", \"defaultMap\":\"comparison\"},"
		+ "{\"name\":\"a specific number of\",\"params\":[1]},"
		+ "{\"text\":\"characters in length.\"}]}";
	public static String[] STRINGLENGTH_RDF_VARIANTS = {STRINGLENGTH_RDF_DEFAULT};
	public static String[] STRINGLENGTH_RDF_VARIANTS_OLD = {};

	public static String STRINGLENGTH_NEO_DEFAULT =
	"{\"template\":\"StringLength_neo4j\","
	+ "\"language\":\"neo4j\","
	+ "\"name\":\"default-antipattern\","
	+ "\"typeConstraint\":false,"
	+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[2],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
		+ "{\"text\":\"where at least one property reached by\"},"
		+ "{\"name\":\"an neo property path\",\"params\":[3],\"exampleValue\":\"has\"},"
		+ "{\"text\":\"is\"},"
		+ "{\"name\":\"compared to\",\"params\":[0], \"exampleValue\":\"exactly\", \"defaultMap\":\"comparison\"},"
		+ "{\"name\":\"a specific number of\",\"params\":[1]},"
		+ "{\"text\":\"characters in length.\"}]}";
	public static String[] STRINGLENGTH_NEO_VARIANTS = {STRINGLENGTH_NEO_DEFAULT};
	public static String[] STRINGLENGTH_NEO_VARIANTS_OLD = {};

}

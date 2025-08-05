package qualitypatternmodel.newservlets.patterns;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.operators.StringLength;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class StringLengthPattern extends PatternClass {
	
	@Override
	CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

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

		return pattern;
	}

	@Override
	public String id() {
		return PatternConstants.STRINGLENGTH_ID;
	}

	@Override
	String name() {
		return PatternConstants.STRINGLENGTH_NAME;
	}

	@Override
	String description() {
		return PatternConstants.STRINGLENGTH_DESCR;
	}

	@Override
	public Boolean genericValid() {
		return true;
	}

	@Override
	public Boolean xmlValid() {
		return true;
	}

	@Override
	public Boolean rdfValid() {
		return true;
	}

	@Override
	public Boolean neoValid() {
		return true;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

	@Override
	protected Map<Integer, String> xmlMap() {
		return Map.of(2, "//*", 3, "/*/text()");
	}

	@Override
	protected String[] xmlVariants() {
		return new String[] { STRINGLENGTH_XML_DEFAULT_CONSTRAINT, STRINGLENGTH_XML_DEFAULT_ANTIPATTERN };
	}

	@Override
	protected String[] xmlVariantsOld() {
		return new String[] { STRINGLENGTH_XML_DEFAULT_OLD };
	}

	@Override
	protected String[] rdfVariants() {
		return new String[] { STRINGLENGTH_RDF_DEFAULT };
	}

	@Override
	protected String[] neoVariants() {
		return new String[] { STRINGLENGTH_NEO_DEFAULT };
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
	+ "\"typeConstraint\":false,"
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

}

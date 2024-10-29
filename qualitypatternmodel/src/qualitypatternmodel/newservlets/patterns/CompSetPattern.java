package qualitypatternmodel.newservlets.patterns;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class CompSetPattern {

	static String COMPSET_ID_GENERIC = "CompSet_generic";
	static String COMPSET_ID_XML = "CompSet_xml";
	static String COMPSET_ID_RDF = "CompSet_rdf";
	static String COMPSET_ID_NEO = "CompSet_neo4j";
	static String COMPSET_NAME = "Comparison Pattern with Set";
	static String COMPSET_DESCR = "Check, wether the value of fields are within a list of allowed (/forbidden) terms.";

	public static CompletePattern getGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(COMPSET_ID_GENERIC);
		pattern.setAbstractId(COMPSET_ID_GENERIC);
		pattern.setName(COMPSET_NAME);
		pattern.setDescription(COMPSET_DESCR);

		Graph graph1 = pattern.getGraph();
		Node returnNode = graph1.getReturnNodes().get(0).makeComplex();

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);
		Graph graph2 = quantifiedCondition.getGraph();

		Node element1 = returnNode.addOutgoing(graph2).getTarget().makePrimitive();

		TextListParamImpl tlp = new TextListParamImpl();
		element1.addPrimitiveComparison(tlp);
		if (ServletConstants.FILL_VALUES) {
			tlp.addStringValue("abc");
			tlp.addStringValue("def");
			tlp.addStringValue("ghi");
		}

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				COMPSET_ID_NEO,
				Map.of(),
				COMPSET_NEO_VARIANTS,
				COMPSET_NEO_VARIANTS_OLD);
	}

	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				COMPSET_ID_RDF,
				Map.of(),
				COMPSET_RDF_VARIANTS,
				COMPSET_RDF_VARIANTS_OLD);
	}

	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				COMPSET_ID_XML,
				Map.of(3, "//*", 4, "/*/text()"),
				COMPSET_XML_VARIANTS,
				COMPSET_XML_VARIANTS_OLD);
	}

	public static String COMPSET_XML_DEFAULT_CONSTRAINT =
		"{\"template\":\"CompSet_xml\","
		+ "\"language\":\"xml\","
		+ "\"name\":\"default-constraint\","
		+ "\"typeConstraint\":true,"
		+ "\"fragments\":["
		+ "{\"text\":\"For\"},"
		+ "{\"name\":\"elements\",\"params\":[3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
		+ "{\"text\":\", each\"},"
		+ "{\"name\":\"property\",\"params\":[4],\"exampleValue\":\"Surname\",\"description\":\"value that gets analysed\"},"
		+ "{\"name\":\"is/is not\",\"params\":[1],\"exampleValue\":\"is\",\"defaultMap\":\"comparison_isnot\"},"
		+ "{\"text\":\"in the list of\"},"
		+ "{\"name\":\"terms\",\"params\":[0],\"exampleValue\": \"Mueller, Meier\"},"
		+ "{\"text\":\".\"}]}";
	public static String COMPSET_XML_DEFAULT_ANTIPATTERN =
		"{\"template\":\"CompSet_xml\","
		+ "\"language\":\"xml\","
		+ "\"name\":\"default-antipattern\","
		+ "\"typeConstraint\":false,"
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
		+ "{\"text\":\"where at least one\"},"
		+ "{\"name\":\"property\",\"params\":[4],\"exampleValue\":\"Surname\",\"description\":\"value that gets analysed\"},"
		+ "{\"name\":\"is / is not\",\"params\":[1],\"exampleValue\":\"is\",\"defaultMap\":\"comparison_is\"},"
		+ "{\"text\":\"in the list of\"},"
		+ "{\"name\":\"terms\",\"params\":[0],\"exampleValue\": \"Mueller, Meier\"},"
		+ "{\"text\":\".\"}]}";
	public static String COMPSET_XML_DEFAULT_OLD =
		"{\"template\":\"CompSet_xml\","
		+ "\"language\":\"xml\","
		+ "\"name\":\"default_old\","
		+ "\"typeConstraint\":false,"
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
		+ "{\"text\":\"where at least one value in\"},"
		+ "{\"name\":\"property\",\"params\":[4],\"exampleValue\":\"Surname\",\"description\":\"value that gets analysed\"},"
		+ "{\"name\":\"is / is not\",\"params\":[1],\"exampleValue\":\"is\",\"defaultMap\":\"comparison_isnot\"},"
		+ "{\"text\":\"in the list:\"},"
		+ "{\"name\":\"terms\",\"params\":[0],\"exampleValue\": \"Mueller, Meier\"}]}";
	public static String[] COMPSET_XML_VARIANTS = {COMPSET_XML_DEFAULT_CONSTRAINT, COMPSET_XML_DEFAULT_ANTIPATTERN};
	public static String[] COMPSET_XML_VARIANTS_OLD = {COMPSET_XML_DEFAULT_OLD};

	public static String COMPSET_RDF_DEFAULT =
		"{\"template\":\"CompSet_rdf\","
		+ "\"language\":\"rdf\","
		+ "\"name\":\"default-antipattern\","
		+ "\"typeConstraint\":false,"
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
		+ "{\"text\":\"where at least one property reached by\"},"
		+ "{\"name\":\"an rdf property path\",\"params\":[4],\"exampleValue\":\"has\"},"
		+ "{\"name\":\"is / is not\",\"params\":[1], \"exampleValue\":\"exactly\", \"defaultMap\":\"comparison_is\"},"
		+ "{\"text\":\"in the list of\"},"
		+ "{\"name\":\"terms\",\"params\":[0]},"
		+ "{\"text\":\".\"}]}";
	public static String[] COMPSET_RDF_VARIANTS = {COMPSET_RDF_DEFAULT};
	public static String[] COMPSET_RDF_VARIANTS_OLD = {};

	public static String COMPSET_NEO_DEFAULT =
		"{\"template\":\"CompSet_neo4j\","
		+ "\"language\":\"neo4j\","
		+ "\"name\":\"default-antipattern\","
		+ "\"typeConstraint\":false,"
		+ "\"fragments\":["
		+ "{\"text\":\"Search for\"},"
		+ "{\"name\":\"elements\",\"params\":[3],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\",\"plural\":\"true\"},"
		+ "{\"text\":\"where at least one property reached by\"},"
		+ "{\"name\":\"an neo property path\",\"params\":[4],\"exampleValue\":\"has\"},"
		+ "{\"name\":\"is / is not\",\"params\":[1], \"exampleValue\":\"exactly\", \"defaultMap\":\"comparison_is\"},"
		+ "{\"text\":\"in the list of\"},"
		+ "{\"name\":\"terms\",\"params\":[0]},"
		+ "{\"text\":\".\"}]}";
	public static String[] COMPSET_NEO_VARIANTS = {COMPSET_NEO_DEFAULT};
	public static String[] COMPSET_NEO_VARIANTS_OLD = {};

}

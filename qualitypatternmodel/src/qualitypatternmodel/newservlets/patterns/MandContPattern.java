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
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class MandContPattern {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = getGeneric();
		pattern.createXmlAdaption();
		
		pattern.printParameters(false);
		
	}

	static String MANDCONT_ID_GENERIC = "MandCont_generic";
	static String MANDCONT_ID_XML = "MandCont_xml";
	static String MANDCONT_ID_RDF = "MandCont_rdf";
	static String MANDCONT_ID_NEO = "MandCont_neo4j";
	static String MANDCONT_NAME = "Mandatory Content";
	static String MANDCONT_DESCR = "Check whether an element has mandatory content.";

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(MANDCONT_ID_GENERIC);
		pattern.setAbstractId(MANDCONT_ID_GENERIC);
		pattern.setName(MANDCONT_NAME);
		pattern.setDescription(MANDCONT_DESCR);

		// search for ...
		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");
		
		// where exists
		QuantifiedCondition check = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(check);
		ComplexNode element = main.addOutgoing(check.getGraph()).getTarget().makeComplex();
		element.setName("element");
		
		// that does not contain
		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		check.setCondition(not);
		
		// either
		Formula or = PatternstructureFactory.eINSTANCE.createFormula();
		or.setOperator(LogicalOperator.OR);
		not.setCondition(or);
		
		// an text
		QuantifiedCondition qctext = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		or.setCondition1(qctext);
		PrimitiveNode text = main.addOutgoing(qctext.getGraph()).getTarget().makePrimitive();
		text.setName("text");

		// or an element
		QuantifiedCondition qcelement = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		or.setCondition2(qcelement);
		ComplexNode contentelement = main.addOutgoing(qcelement.getGraph()).getTarget().makeComplex();
		contentelement.setName("content");

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				MANDCONT_ID_XML,
				Map.of(0, "//*", 1, "/*"),
				MANDCONT_XML_VARIANTS,
				MANDCONT_XML_VARIANTS_OLD);
	}

	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				MANDCONT_ID_RDF,
				Map.of(),
				null,
				null);
	}

	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(), 
				Language.NEO4J,
				MANDCONT_ID_NEO,
				Map.of(),
				null,
				null);
	}

	public static String MANDCONT_XML_DEFAULT_ANTIPATTERN =
			"{\"template\":\"MandCont_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-antipattern\","
			+ "\"typeConstraint\":false,"
			+ "\"fragments\":["
			+ "{\"text\":\"Search for\"},"
			+ "{\"name\":\"element\", \"params\":[0],\"exampleValue\":\"measurement\",\"description\":\"base element for analysis\"},"
			+ "{\"text\":\"that contain a\"},"
			+ "{\"name\":\"subelement\", \"params\":[1],\"exampleValue\":\"unit\",\"description\":\"element of analyis\"},"
			+ "{\"text\":\"that does not contain either a\"},"
			+ "{\"name\":\"property\", \"params\":[2],\"exampleValue\":\"text\",\"description\":\"property condition\"},"
			+ "{\"text\":\"or a\"},"
			+ "{\"name\":\"element\", \"params\":[3],\"exampleValue\":\"element\",\"description\":\"element condition\"},"
			+ "{\"text\":\".\"}"
			+ "]}";
	public static String MANDCONT_XML_DEFAULT_CONSTRAINT =
			"{\"template\":\"MandCont_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"default-constraint\","
			+ "\"typeConstraint\":true,"
			+ "\"fragments\":["
			+ "{\"text\":\"Within each\"},"
			+ "{\"name\":\"element\", \"params\":[0],\"exampleValue\":\"measurement\",\"description\":\"base element for analysis\"},"
			+ "{\"text\":\", every\"},"
			+ "{\"name\":\"subelement\", \"params\":[1],\"exampleValue\":\"unit\",\"description\":\"element of analyis\"},"
			+ "{\"text\":\"must contain either a\"},"
			+ "{\"name\":\"property\", \"params\":[2],\"exampleValue\":\"text\",\"description\":\"property condition\"},"
			+ "{\"text\":\"or a\"},"
			+ "{\"name\":\"element\", \"params\":[3],\"exampleValue\":\"element\",\"description\":\"element condition\"},"
			+ "{\"text\":\".\"}"
			+ "]}";

	public static String MANDCONT_XML_ANTIPATTERN_M =
			"{\"template\":\"MandCont_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"antipattern_m\","
			+ "\"typeConstraint\":false,"
			+ "\"fragments\":["
			+ "{\"text\":\"Search for\"},"
			+ "{\"name\":\"element\", \"params\":[0],\"exampleValue\":\"measurement\",\"description\":\"base element for analysis\"},"
			+ "{\"params\":[1],\"value\":\"/self::*\"},"
			+ "{\"text\":\"that does not contain either a\"},"
			+ "{\"name\":\"property\", \"params\":[2],\"exampleValue\":\"text\",\"description\":\"property condition\"},"
			+ "{\"text\":\"or a\"},"
			+ "{\"name\":\"element\", \"params\":[3],\"exampleValue\":\"element\",\"description\":\"element condition\"},"
			+ "{\"text\":\".\"}"
			+ "]}";
	public static String MANDCONT_XML_CONSTRAINT_M =
			"{\"template\":\"MandCont_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"constraint_m\","
			+ "\"typeConstraint\":true,"
			+ "\"fragments\":["
			+ "{\"text\":\"Every\"},"
			+ "{\"name\":\"element\", \"params\":[0],\"exampleValue\":\"measurement\",\"description\":\"base element for analysis\"},"
			+ "{\"params\":[1],\"value\":\"/self::*\"},"
			+ "{\"text\":\"must contain either a\"},"
			+ "{\"name\":\"property\", \"params\":[2],\"exampleValue\":\"text\",\"description\":\"property condition\"},"
			+ "{\"text\":\"or a\"},"
			+ "{\"name\":\"element\", \"params\":[3],\"exampleValue\":\"element\",\"description\":\"element condition\"},"
			+ "{\"text\":\".\"}"
			+ "]}";
	public static String MANDCONT_XML_CONSTRAINT_M2 =
			"{\"template\":\"MandCont_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"constraint_m2\","
			+ "\"typeConstraint\":true,"
			+ "\"fragments\":["
			+ "{\"text\":\"Every\"},"
			+ "{\"name\":\"element\", \"params\":[0],\"exampleValue\":\"measurement\",\"description\":\"base element for analysis\"},"
			+ "{\"params\":[1],\"value\":\"/self::*\"},"
			+ "{\"text\":\"must contain either a text value or a \"},"
			+ "{\"params\":[2],\"value\":\"/text()\"},"
			+ "{\"name\":\"element\", \"params\":[3],\"exampleValue\":\"element\",\"description\":\"element condition\"},"
			+ "{\"text\":\".\"}"
			+ "]}";
	public static String MANDCONT_XML_JUSTNOTEMPTY =
			"{\"template\":\"MandCont_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"justnotempty\","
			+ "\"typeConstraint\":true,"
			+ "\"fragments\":["
			+ "{\"text\":\"Each\"},\r\n"
			+ "{\"name\":\"element\", \"params\":[0],\"exampleValue\":\"measurement\",\"description\":\"base element for analysis\"},"
			+ "{\"text\":\"must contain something.\"},"
			+ "{\"params\":[1],\"value\":\"/self::*\"},"
			+ "{\"params\":[2],\"value\":\"/text()\"},"
			+ "{\"params\":[3],\"value\":\"/*\"}"
			+ "]}";
	public static String[] MANDCONT_XML_VARIANTS = { MANDCONT_XML_DEFAULT_CONSTRAINT, MANDCONT_XML_DEFAULT_ANTIPATTERN, MANDCONT_XML_CONSTRAINT_M, MANDCONT_XML_ANTIPATTERN_M, MANDCONT_XML_CONSTRAINT_M2, MANDCONT_XML_JUSTNOTEMPTY };
	public static String[] MANDCONT_XML_VARIANTS_OLD = {};

}

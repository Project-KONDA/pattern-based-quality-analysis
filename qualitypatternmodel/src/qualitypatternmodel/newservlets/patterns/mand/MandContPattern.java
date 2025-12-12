package qualitypatternmodel.newservlets.patterns.mand;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class MandContPattern extends PatternClass {

	public MandContPattern() {
		super(PatternConstants.MANDCONT_ID,
				PatternConstants.MANDCONT_NAME, 
				PatternConstants.MANDCONT_DESCR, 
				true, true, true, true);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		// search for ...
		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");
		
		// where exists
		QuantifiedCondition check = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(check);
		ComplexNode element = main.addOutgoing(check.getGraph()).getTarget().makeComplex();
		element.setName("element");

		// that does not contain
		Formula or = PatternstructureFactory.eINSTANCE.createFormula();
		or.setOperator(LogicalOperator.AND);
		check.setCondition(or);		

		NotCondition not1 = PatternstructureFactory.eINSTANCE.createNotCondition();
		NotCondition not2 = PatternstructureFactory.eINSTANCE.createNotCondition();

		or.setCondition1(not1);
		or.setCondition2(not2);

		// either an text
		QuantifiedCondition qctext = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		not1.setCondition(qctext);
		PrimitiveNode text = element.addOutgoing(qctext.getGraph()).getTarget().makePrimitive();
		text.setName("text");

		// or an element
		QuantifiedCondition qcelement = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		not2.setCondition(qcelement);
		ComplexNode contentelement = element.addOutgoing(qcelement.getGraph()).getTarget().makeComplex();
		contentelement.setName("content");

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

	protected String[] xmlVariants() {
		return new String[] { MANDCONT_XML_DEFAULT_CONSTRAINT, MANDCONT_XML_DEFAULT_ANTIPATTERN, MANDCONT_XML_CONSTRAINT_2, MANDCONT_XML_CONSTRAINT_M, MANDCONT_XML_ANTIPATTERN_M, MANDCONT_XML_CONSTRAINT_M2, MANDCONT_XML_JUSTNOTEMPTY };
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
	public static String MANDCONT_XML_CONSTRAINT_2 =
			"{\"template\":\"MandCont_xml\","
			+ "\"language\":\"xml\","
			+ "\"name\":\"constraint_2\","
			+ "\"typeConstraint\":true,"
			+ "\"fragments\":["
			+ "{\"text\":\"Within each\"},"
			+ "{\"name\":\"element\", \"params\":[0],\"exampleValue\":\"measurement\",\"description\":\"base element for analysis\"},"
			+ "{\"text\":\", every\"},"
			+ "{\"name\":\"subelement\", \"params\":[1],\"exampleValue\":\"unit\",\"description\":\"element of analyis\"},"
			+ "{\"text\":\"must contain either a\"},"
			+ "{\"params\":[2],\"value\":\"/text()\"},"
			+ "{\"name\":\"element\", \"params\":[3],\"exampleValue\":\"element\",\"description\":\"element condition\"},"
			+ "{\"text\":\"or a text.\"}"
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
}

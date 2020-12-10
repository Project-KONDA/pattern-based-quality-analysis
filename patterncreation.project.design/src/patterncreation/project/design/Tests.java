package patterncreation.project.design;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import javax.lang.model.util.Elements;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.DateTimeParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.PropertyOptionParam;
import qualitypatternmodel.parameters.RelationOptionParam;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TimeParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.TrueElement;

public class Tests {
	//EMFModelLoad loader = new EMFModelLoad();
	private static final String TEST_DIRECTORY_GENERIC = "Tests/GenericPatternTests/";
	private static final String TEST_DIRECTORY_GRAPHSTRUCTURE_CHANGE_NAME_ELEMENT = TEST_DIRECTORY_GENERIC + "graphstructure/tools/changeNameElement/";
	private static final String TEST_DIRECTORY_GRAPHSTRUCTURE_CHANGE_NAME_PROPERTY = TEST_DIRECTORY_GENERIC + "graphstructure/tools/changeNameProperty/";
	private static final String TEST_DIRECTORY_GRAPHSTRUCTURE_CHANGE_NAME_RELATION = TEST_DIRECTORY_GENERIC + "graphstructure/tools/changeNameRelation/";
	private static final String TEST_DIRECTORY_GRAPHSTRUCTURE_DELETE_GRAPH = TEST_DIRECTORY_GENERIC + "graphstructure/tools/deleteGraph/";
	private static final String TEST_DIRECTORY_GRAPHSTRUCTURE_ELEMENT = TEST_DIRECTORY_GENERIC + "graphstructure/tools/element/";
	private static final String TEST_DIRECTORY_GRAPHSTRUCTURE_MARK_AS_RETURN_ELEMENT = TEST_DIRECTORY_GENERIC + "graphstructure/tools/markAsReturnElement/";
	private static final String TEST_DIRECTORY_GRAPHSTRUCTURE_PROPERTY = TEST_DIRECTORY_GENERIC + "graphstructure/tools/property/";
	private static final String TEST_DIRECTORY_GRAPHSTRUCTURE_RELATION = TEST_DIRECTORY_GENERIC + "graphstructure/tools/relation/";
	private static final String TEST_DIRECTORY_OPERATORS_COMPARISON = TEST_DIRECTORY_GENERIC + "operators/tools/comparison/";
	private static final String TEST_DIRECTORY_OPERATORS_DISCARD_ARGUMENT = TEST_DIRECTORY_GENERIC + "operators/tools/discardArgument/";
	private static final String TEST_DIRECTORY_OPERATORS_MATCH = TEST_DIRECTORY_GENERIC + "operators/tools/match/";
	private static final String TEST_DIRECTORY_OPERATORS_SELECT_ELEMENT_AS_ARGUMENT = TEST_DIRECTORY_GENERIC + "operators/tools/selectElementAsArgument/";
	private static final String TEST_DIRECTORY_OPERATORS_SELECT_PARAMETERS_AS_ARGUMENT = TEST_DIRECTORY_GENERIC + "operators/tools/selectParameterAsArgument/";
	private static final String TEST_DIRECTORY_OPERATORS_SELECT_PROPERTY_AS_ARGUMENT = TEST_DIRECTORY_GENERIC + "operators/tools/selectPropertyAsArgument/";
	private static final String TEST_DIRECTORY_PARAMETERS_BOOLEAN = TEST_DIRECTORY_GENERIC + "parameters/tools/boolean/";
	private static final String TEST_DIRECTORY_PARAMETERS_DATE = TEST_DIRECTORY_GENERIC + "parameters/tools/date/";
	private static final String TEST_DIRECTORY_PARAMETERS_DATE_AND_TIME = TEST_DIRECTORY_GENERIC + "parameters/tools/dateAndTime/";
	private static final String TEST_DIRECTORY_PARAMETERS_NUMBER = TEST_DIRECTORY_GENERIC + "parameters/tools/number/";
	private static final String TEST_DIRECTORY_PARAMETERS_TEXTLIST = TEST_DIRECTORY_GENERIC + "parameters/tools/textList/";
	private static final String TEST_DIRECTORY_PARAMETERS_TEXTLITERAL = TEST_DIRECTORY_GENERIC + "parameters/tools/textLiteral/";
	private static final String TEST_DIRECTORY_PARAMETERS_TIME = TEST_DIRECTORY_GENERIC + "parameters/tools/time/";
	private static final String TEST_DIRECTORY_PARAMETERS_UNTYPEDVALUE = TEST_DIRECTORY_GENERIC + "parameters/tools/untypedValue/";
	private static final String TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_NAME_COMPLETEPATTERN = TEST_DIRECTORY_GENERIC + "patternstructure/tools/changeNameCompletePattern/";
	private static final String TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_OPERATOR = TEST_DIRECTORY_GENERIC + "patternstructure/tools/changeOperator/";
	private static final String TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_QUANTIFIER = TEST_DIRECTORY_GENERIC + "patternstructure/tools/changeQuantifier/";
	private static final String TEST_DIRECTORY_PATTERNSTRUCTURE_COUNTCONDITION = TEST_DIRECTORY_GENERIC + "patternstructure/tools/countCondition/";
	private static final String TEST_DIRECTORY_PATTERNSTRUCTURE_COUNTPATTERN = TEST_DIRECTORY_GENERIC + "patternstructure/tools/countPattern/";
	private static final String TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA = TEST_DIRECTORY_GENERIC + "patternstructure/tools/formula/";
	private static final String TEST_DIRECTORY_PATTERNSTRUCTURE_NOTCONDITION = TEST_DIRECTORY_GENERIC + "patternstructure/tools/notCondition/";
	private static final String TEST_DIRECTORY_PATTERNSTRUCTURE_NUMBERELEMENT = TEST_DIRECTORY_GENERIC + "patternstructure/tools/numberElement/";
	private static final String TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION = TEST_DIRECTORY_GENERIC + "patternstructure/tools/quantifiedCondition/";
	private static final String TEST_DIRECTORY_PATTERNSTRUCTURE_TRUEELEMENT = TEST_DIRECTORY_GENERIC + "patternstructure/tools/trueElement/";
	//abstract
	private static final String TEST_DIRECTORY_ABSTRACT = "Tests/AbstractPatternTests/";
	private static final String TEST_DIRECTORY_BEHAVIOR = TEST_DIRECTORY_ABSTRACT + "behavior/";
	private static final String TEST_DIRECTORY_TOOLS_RELATION_TO_XMLRELATION = TEST_DIRECTORY_ABSTRACT + "tools/relationToXmlRelation_changeXmlRelation/";
	private static final String TEST_DIRECTORY_TOOLS_FINALIZATION = TEST_DIRECTORY_ABSTRACT + "tools/finalization/";
	private static final String TEST_DIRECTORY_TOOLS_DELETE = TEST_DIRECTORY_ABSTRACT + "tools/delete/";
	//concrete
	private static final String TEST_DIRECTORY_CONCRETE = "Tests/ConcretePatternTests/";
	private static final String TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_BOOLEAN = TEST_DIRECTORY_CONCRETE + "formularview/tools/boolean/";
	private static final String TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_COMPARISONOPTION = TEST_DIRECTORY_CONCRETE + "formularview/tools/comparisonOption/";
	private static final String TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_DATE = TEST_DIRECTORY_CONCRETE + "formularview/tools/date/";
	private static final String TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_DATETIME = TEST_DIRECTORY_CONCRETE + "formularview/tools/dateTime/";
	private static final String TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_NUMBER = TEST_DIRECTORY_CONCRETE + "formularview/tools/number/";
	private static final String TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_PROPERTYOPTION = TEST_DIRECTORY_CONCRETE + "formularview/tools/propertyOption/";
	private static final String TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION = TEST_DIRECTORY_CONCRETE + "formularview/tools/relationOption/";
	private static final String TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TEXTLIST = TEST_DIRECTORY_CONCRETE + "formularview/tools/textList/";
	private static final String TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TEXTLITERAL = TEST_DIRECTORY_CONCRETE + "formularview/tools/textLiteral/";
	private static final String TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TIME = TEST_DIRECTORY_CONCRETE + "formularview/tools/time/";
	private static final String TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TYPEOPTION = TEST_DIRECTORY_CONCRETE + "formularview/tools/typeOption/";
	private static final String TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_UNTYPEDPARAMETERVALUE = TEST_DIRECTORY_CONCRETE + "formularview/tools/untypedParameterValue/";
	
	
	CompletePattern pattern = null;
	CountCondition countCondition = null;
	CountPattern countPattern = null;
	QuantifiedCondition quantifiedCondition = null;
	Formula formula = null;
	NotCondition notCondition = null;
	Graph graph = null;
	Relation relation = null;
	Comparison comparison = null;
	Match match = null;
	EList<Relation> relations = null;
	XmlNavigation xmlNavigation = null;
	XmlReference xmlReference = null;
	Element element = null;
	EList<Operator> operators = null;
	EList<Parameter> parameters = null;
	BooleanParam booleanParam = null;
	ComparisonOptionParam comparisonOption = null;
	DateParam dateParam = null;
	DateTimeParam dateTimeParam = null;
	NumberParam numberParam = null;
	PropertyOptionParam propertyOption = null;
	RelationOptionParam relationOption = null;
	TextListParam textListParam = null;
	TextLiteralParam textLiteralParam = null;
	TimeParam timeParam = null;
	TypeOptionParam typeOption = null;
	
	public static void main(String[] args) {
		//EMFModelLoad loader = new EMFModelLoad();
		//System.out.println(System.getProperty("user.dir"));
		//quantifiedConditionCompletePattern.patternstructure
		CompletePattern pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.loadPattern("Tests/GenericPatternTests/patternstructure/tools/quantifiedCondition/quantifiedConditionCompletePattern.patternstructure", "patternstructure");
		System.out.println(pattern);
		//test();
	}
		//konstanten methoden kommentare tag view


	//GenericPatternTests
	
	/**
	 * Checks if the tool change name works proper with elements
	 */
	@Test
	public void testGraphstructureChangeNameElement() {
		//graphstructure/tools/changeNameElement
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_GRAPHSTRUCTURE_CHANGE_NAME_ELEMENT + "changeNameElement.patternstructure", "patternstructure");
		graph = pattern.getGraph();
		assertTrue("attribute name of element must contain the String \"ElementNewName\"", graph.getElements().get(0).getName().equals("ElementNewName"));
	}
	
	/**
	 * Checks if the tool change name works proper with properties
	 */
	@Test
	public void testGraphstructureChangeNameProperty() {
		//graphstructure/tools/changeNameElement
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_GRAPHSTRUCTURE_CHANGE_NAME_PROPERTY + "changeNameProperty.patternstructure", "patternstructure");
		graph = pattern.getGraph();
		assertTrue("attribute name of property must contain the String \"PropertyNewName\"", graph.getElements().get(0).getProperties().get(0).getName().equals("PropertyNewName"));
	}
	
	/**
	 * Checks if the tool change name works proper with relations
	 */
	@Test
	public void testGraphstructureChangeNameRelation() {
		//graphstructure/tools/changeNameRelation
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_GRAPHSTRUCTURE_CHANGE_NAME_RELATION + "changeNameRelation.patternstructure", "patternstructure");
		graph = pattern.getGraph();
		assertTrue("attribute name of relation must contain the String \"RelationNewName\"", graph.getRelations().get(0).getName().equals("RelationNewName"));
	}
	
	/**
	 * Checks if the tool delete doesn't delete graphs
	 */
	@Test
	public void testGraphstructureDeleteGraph() {
		//graphstructure/tools/deleteGraph
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_GRAPHSTRUCTURE_DELETE_GRAPH + "deleteGraph.patternstructure", "patternstructure");
		graph = pattern.getGraph();
		assertTrue("graph of pattern must not be null", graph != null);
	}
	
	//tested, if there is one new element in the graph after using the tool element
	@Test
	public void testGraphstructureElement() {
		//graphstructure/tools/element
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_GRAPHSTRUCTURE_ELEMENT + "elementGraph.patternstructure", "patternstructure");
		graph = pattern.getGraph();
		assertTrue("graph must contain two elements", graph.getElements().size() == 2);
	}
	
	//tested, if the attribut ResultOf is set correctly by the tools markAsReturnElement and markAsNoReturnElement
	@Test
	public void testGraphstructureMarkAsReturnElement() {
		//graphstructure/tools/markAsReturnElement
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_GRAPHSTRUCTURE_MARK_AS_RETURN_ELEMENT + "markAsReturnElement.patternstructure", "patternstructure");
		graph = pattern.getGraph();
		assertTrue("graph must contain one returnelement", graph.getReturnElements().size() == 1);
		
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_GRAPHSTRUCTURE_MARK_AS_RETURN_ELEMENT + "markAsNoReturnElement.patternstructure", "patternstructure");
		graph = pattern.getGraph();
		assertTrue("graph must contain zero returnelement", graph.getReturnElements().size() == 0);
	}
	
	//tested, if there is one new property in the element after using the tool property
	@Test
	public void testGraphstructureProperty() {
		//graphstructure/tools/property
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_GRAPHSTRUCTURE_PROPERTY + "propertyElement.patternstructure", "patternstructure");
		graph = pattern.getGraph();
		assertTrue("element must contain one property", graph.getElements().get(0).getProperties().size() == 1);
	}
	
	//tested, if there is one new relation in the graph after using the tool relation and if the attributes source and target are set correct
	@Test
	public void testGraphstructureRelation() {
		//graphstructure/tools/relation
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_GRAPHSTRUCTURE_RELATION + "relationGraph.patternstructure", "patternstructure");
		graph = pattern.getGraph();
		relation = graph.getRelations().get(0);
		assertTrue("graph must contain one relation, the attribute source must be element1, the attribute target must be element2", graph.getRelations().size() == 1 && relation.getSource().getName().equals("Element 1") && relation.getTarget().getName().equals("Element 2"));
	}
	
	@Test
	public void testOperatorsComparison() {
		//operators/tools/comparison
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_OPERATORS_COMPARISON + "comparisonGraph.patternstructure", "patternstructure");
		graph = pattern.getGraph();
		assertTrue("operatorlist of graph must contain one comparison", graph.getOperatorList().getOperators().get(0) instanceof Comparison);
	}
	
	@Test
	public void testOperatorsDiscardArgument() {
		//operators/tools/discardArgument
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_OPERATORS_DISCARD_ARGUMENT + "discardArgument1Comparison.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("comparison must have an empty argument1", comparison.getArgument1() == null);
		
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_OPERATORS_DISCARD_ARGUMENT + "discardArgument2Comparison.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("comparison must have an empty argument2", comparison.getArgument2() == null);
		
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_OPERATORS_DISCARD_ARGUMENT + "discardArgument2Match.patternstructure", "patternstructure");
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("match must have an empty property", match.getProperty() == null);
		
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_OPERATORS_DISCARD_ARGUMENT + "discardArgumentComparison1.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("comparison must have an empty argument1", comparison.getArgument1() == null);
		
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_OPERATORS_DISCARD_ARGUMENT + "discardArgumentComparison2.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("comparison must have an empty argument2", comparison.getArgument2() == null);
		
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_OPERATORS_DISCARD_ARGUMENT + "discardArgumentMatch.patternstructure", "patternstructure");
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("match must have an empty property", match.getProperty() == null);
	}
	
	@Test
	public void testOperatorsMatch() {
		//operators/tools/match
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_OPERATORS_MATCH + "matchGraph.patternstructure", "patternstructure");
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("operatorlist of graph must contain one match", match instanceof Match);
	}
	
	@Test
	public void testOperatorsSelectElementAsArgument() {
		//operators/tools/selectElementAsArgument
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_OPERATORS_SELECT_ELEMENT_AS_ARGUMENT + "selectElementComparison1.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument1 of comparison must contain Element 1", ((Element) comparison.getArgument1()).getName().equals("Element 1"));
		
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_OPERATORS_SELECT_ELEMENT_AS_ARGUMENT + "selectElementComparison2.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument1 of comparison must contain Element 3", ((Element) comparison.getArgument2()).getName().equals("Element 3"));
	}
	
	@Test
	public void testOperatorsSelectParameterAsArgument() {
		//operators/tools/selectParameterAsArgument
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_OPERATORS_SELECT_PARAMETERS_AS_ARGUMENT + "selectParameterComparison.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(1);
		assertTrue("argument2 of comparison must contain Number 4", comparison.getInternalId() == 2 && comparison.getArgument2() instanceof NumberParam);
	}
	
	@Test
	public void testOperatorsSelectPropertyAsArgument() {
		//operators/tools/selectPropertyAsArgument
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_OPERATORS_SELECT_PROPERTY_AS_ARGUMENT + "selectPropertyComparison1.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument1 of comparison must contain one property", comparison.getArgument1() instanceof Property);
		
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_OPERATORS_SELECT_PROPERTY_AS_ARGUMENT + "selectPropertyComparison2.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one property", comparison.getArgument2() instanceof Property);
		
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_OPERATORS_SELECT_PROPERTY_AS_ARGUMENT + "selectPropertyMatch.patternstructure", "patternstructure");
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of match must contain one property", match.getProperty() instanceof Property);
	}
	
	@Test
	public void testParametersBoolean() {
		//parameters/tools/boolean
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PARAMETERS_BOOLEAN + "BooleanComparison.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one BooleanParam", comparison.getArgument2() instanceof BooleanParam);
	}
	
	@Test
	public void testParametersDate() {
		//parameters/tools/date
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PARAMETERS_DATE + "DateComparison.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one DateParam", comparison.getArgument2() instanceof DateParam);
	}
	
	@Test
	public void testParametersDateAndTime() {
		//parameters/tools/dateAndTime
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PARAMETERS_DATE_AND_TIME + "DateTimeComparison.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one DateTimeParam", comparison.getArgument2() instanceof DateTimeParam);
	}
	
	@Test
	public void testParametersNumber() {
		//parameters/tools/number
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PARAMETERS_NUMBER + "NumberComparison.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one NumberParam", comparison.getArgument2() instanceof NumberParam);
	}
	
	@Test
	public void testParametersTextList() {
		//parameters/tools/textList
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PARAMETERS_TEXTLIST + "TextListComparison.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one TextListParam", comparison.getArgument2() instanceof TextListParam);
	}
	
	@Test
	public void testParametersTextLiteral() {
		//parameters/tools/textLiteral
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PARAMETERS_TEXTLITERAL + "TextLiteralComparison.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one TextLiteralParam", comparison.getArgument2() instanceof TextLiteralParam);
	}
	
	@Test
	public void testParametersTime() {
		//parameters/tools/time
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PARAMETERS_TIME + "TimeComparison.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one TimeParam", comparison.getArgument2() instanceof TimeParam);
	}
	
	@Test
	public void testParametersUntypedValue() {
		//parameters/tools/untypedValue
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PARAMETERS_UNTYPEDVALUE + "UntypedValueComparison.patternstructure", "patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one UntypedParameterValue", comparison.getArgument2() instanceof UntypedParameterValue);
	}
	
	@Test
	public void testChangeNameCompletePattern() {
		//patternstructure/tools/changeNameCompletePattern
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_NAME_COMPLETEPATTERN + "changeNameCompletePattern.patternstructure", "patternstructure");
		assertTrue("attribute of completePattern must be equal to \"Muster\"", pattern.getName().equals("Muster"));
	}
	
	@Test
	public void testPatternstructureChangeOperator() {
		//patternstructure/tools/changeOperator
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_OPERATOR + "andToEqual.patternstructure", "patternstructure");
		formula = (Formula) pattern.getCondition();
        assertTrue("operator of formula must be equal", formula.getOperator() == LogicalOperator.EQUAL);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_OPERATOR + "andToImplies.patternstructure", "patternstructure");
		formula = (Formula) pattern.getCondition();
        assertTrue("operator of formula must be implies", formula.getOperator() == LogicalOperator.IMPLIES);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_OPERATOR + "andToOr.patternstructure", "patternstructure");
		formula = (Formula) pattern.getCondition();
        assertTrue("operator of formula must be or", formula.getOperator() == LogicalOperator.OR);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_OPERATOR + "andToXor.patternstructure", "patternstructure");
		formula = (Formula) pattern.getCondition();
        assertTrue("operator of formula must be xor", formula.getOperator() == LogicalOperator.XOR);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_OPERATOR + "orToAnd.patternstructure", "patternstructure");
		formula = (Formula) pattern.getCondition();
        assertTrue("operator of formula must be and", formula.getOperator() == LogicalOperator.AND);
	}
	
	@Test
	public void testPatternstructureChangeQuantifier() {
		//patternstructure/tools/changeQuantifier
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_QUANTIFIER + "existsToForall.patternstructure", "patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("quantifier of quantifiedCondition must be forall", quantifiedCondition.getQuantifier() == Quantifier.FORALL);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_QUANTIFIER + "forallToExists.patternstructure", "patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("quantifier of quantifiedCondition must be exists", quantifiedCondition.getQuantifier() == Quantifier.EXISTS);
	}
	
	@Test
	public void testPatternstructureCountCondition() {
		//patternstructure/tools/countCondition
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_COUNTCONDITION + "countConditionCompletePattern.patternstructure", "patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of countCondition", countCondition instanceof CountCondition);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_COUNTCONDITION + "countConditionCountPattern.patternstructure", "patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        countPattern = (CountPattern) countCondition.getCountPattern();
        assertTrue("condition of CountPattern must be instance of countCondition", countPattern.getCondition() instanceof CountCondition);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_COUNTCONDITION + "countConditionFormula.patternstructure", "patternstructure");
        formula = (Formula) pattern.getCondition();
        assertTrue("conditions of formula must be instance of countCondition", formula.getCondition1() instanceof CountCondition && formula.getCondition2() instanceof CountCondition);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_COUNTCONDITION + "countConditionNotCondition.patternstructure", "patternstructure");
        notCondition = (NotCondition) pattern.getCondition();
        assertTrue("condition of notCondition must be instance of countCondition", notCondition.getCondition() instanceof CountCondition);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_COUNTCONDITION + "countConditionQuantifiedCondition.patternstructure", "patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of quantifiedCondition must be instance of countCondition", quantifiedCondition.getCondition() instanceof CountCondition);
	}
	
	@Test
	public void testPatternstructureCountPattern() {
		//patternstructure/tools/countPattern
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_COUNTPATTERN + "countPatternCountCondition.patternstructure", "patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        countPattern = (CountPattern) countCondition.getArgument2();
        assertTrue("argument2 of countCondition must be instance of countPattern", countPattern instanceof CountPattern);
	}
	
	@Test
	public void testPatternstructureFormula() {
		//patternstructure/tools/formula
      	pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaAnd.patternstructure", "patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be and", formula.getOperator() == LogicalOperator.AND);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaAndDialog.patternstructure", "patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be and", formula.getOperator() == LogicalOperator.AND);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaCompletePattern.patternstructure", "patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula", formula instanceof Formula);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaCountPattern.patternstructure", "patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
      	countPattern = countCondition.getCountPattern();
        assertTrue("condition of countPattern must be instance of formula", countPattern.getCondition() instanceof Formula);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaEqual.patternstructure", "patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be equal", formula.getOperator() == LogicalOperator.EQUAL);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaEqualDialog.patternstructure", "patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be equal", formula.getOperator() == LogicalOperator.EQUAL);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaFormula.patternstructure", "patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("conditions of formula must be instance of formula", formula.getCondition1() instanceof Formula && formula.getCondition1() instanceof Formula);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaImplies.patternstructure", "patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be implies", formula.getOperator() == LogicalOperator.IMPLIES);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaImpliesDialog.patternstructure", "patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be implies", formula.getOperator() == LogicalOperator.IMPLIES);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaNotCondition.patternstructure", "patternstructure");
      	notCondition = (NotCondition) pattern.getCondition();
        assertTrue("conditions of notcondition must be instance of formula", notCondition.getCondition() instanceof Formula);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaOr.patternstructure", "patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be or", formula.getOperator() == LogicalOperator.OR);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaOrDialog.patternstructure", "patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be or", formula.getOperator() == LogicalOperator.OR);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaQuantifiedCondition.patternstructure", "patternstructure");
      	quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("conditions of quantifiedCondition must be instance of formula", quantifiedCondition.getCondition() instanceof Formula);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaXor.patternstructure", "patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be xor", formula.getOperator() == LogicalOperator.XOR);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaXorDialog.patternstructure", "patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be xor", formula.getOperator() == LogicalOperator.XOR);
	}
	
	@Test
	public void testPatternstructureNotCondition() {
		//patternstructure/tools/notCondition
      	pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_NOTCONDITION + "notConditionCompletePattern.patternstructure", "patternstructure");
        assertTrue("condition of CompletePattern must be instance of notCondition", pattern.getCondition() instanceof NotCondition);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_NOTCONDITION + "notConditionCountPattern.patternstructure", "patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        countPattern = countCondition.getCountPattern();
        assertTrue("condition of countPattern must be instance of notCondition", countPattern.getCondition() instanceof NotCondition);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_NOTCONDITION + "notConditionFormula.patternstructure", "patternstructure");
        formula = (Formula) pattern.getCondition();
        assertTrue("conditions of formula must be instance of notCondition", formula.getCondition1() instanceof NotCondition && formula.getCondition2() instanceof NotCondition);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_NOTCONDITION + "notConditionNotCondition.patternstructure", "patternstructure");
        notCondition = (NotCondition) pattern.getCondition();
        assertTrue("condition of notCondition must be instance of notCondition", notCondition.getCondition() instanceof NotCondition);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_NOTCONDITION + "notConditionQuantifiedCondition.patternstructure", "patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of quantifiedCondition must be instance of notCondition", quantifiedCondition.getCondition() instanceof NotCondition);
	}
	
	@Test
	public void testPatternstructureNumberElement() {
		//patternstructure/tools/numberElement
      	pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_NUMBERELEMENT + "numberElementCountCondition.patternstructure", "patternstructure");
      	countCondition = (CountCondition) pattern.getCondition();
        assertTrue("condition of countCondition must be instance of numberElement", countCondition.getArgument2() instanceof NumberElement);
	}
	
	@Test
	public void testPatternstructureQuantifiedCondition() {
		//patternstructure/tools/quantifiedCondition
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionCompletePattern.patternstructure", "patternstructure");
        assertTrue("condition of CompletePattern must be instance of quantifiedCondition", pattern.getCondition() instanceof QuantifiedCondition);

        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionCountPattern.patternstructure", "patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        countPattern = (CountPattern) countCondition.getArgument2();
        assertTrue("condition of CountPattern must be instance of quantifiedCondition", countPattern.getCondition() instanceof QuantifiedCondition);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionExists.patternstructure", "patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of quantifiedCondition and its quantifier must be exists", quantifiedCondition.getQuantifier() == Quantifier.EXISTS);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionForall.patternstructure", "patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of quantifiedCondition and its quantifier must be forall", quantifiedCondition.getQuantifier() == Quantifier.FORALL);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionExistsDialog.patternstructure", "patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of quantifiedCondition and its quantifier must be exists", quantifiedCondition.getQuantifier() == Quantifier.EXISTS);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionForallDialog.patternstructure", "patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of quantifiedCondition and its quantifier must be forall", quantifiedCondition.getQuantifier() == Quantifier.FORALL);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionFormula.patternstructure", "patternstructure");
        formula = (Formula) pattern.getCondition();
        assertTrue("condition of formula must be instance of quantifiedCondition", formula.getCondition1() instanceof QuantifiedCondition && formula.getCondition2() instanceof QuantifiedCondition);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionNotCondition.patternstructure", "patternstructure");
        notCondition = (NotCondition) pattern.getCondition();
        assertTrue("condition of notCondition must be instance of quantifiedCondition", notCondition.getCondition() instanceof QuantifiedCondition);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionQuantifiedCondition.patternstructure", "patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of quantifiedCondition must be instance of quantifiedCondition", quantifiedCondition.getCondition() instanceof QuantifiedCondition);
	}
	
	@Test
	public void testPatternstructureTrueElement() {
		//patternstructure/tools/trueElement
      	pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_TRUEELEMENT + "trueElementCompletePattern.patternstructure", "patternstructure");
        assertTrue("condition of CompletePattern must be instance of trueElement", pattern.getCondition() instanceof TrueElement);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_TRUEELEMENT + "trueElementCountPattern.patternstructure", "patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        countPattern = countCondition.getCountPattern();
        assertTrue("condition of countPattern must be instance of trueElement", countPattern.getCondition() instanceof TrueElement);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_TRUEELEMENT + "trueElementFormula.patternstructure", "patternstructure");
        formula = (Formula) pattern.getCondition();
        assertTrue("conditions of formula must be instance of trueElement", formula.getCondition1() instanceof TrueElement && formula.getCondition2() instanceof TrueElement);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_TRUEELEMENT + "trueElementNotCondition.patternstructure", "patternstructure");
        notCondition = (NotCondition) pattern.getCondition();
        assertTrue("condition of notCondition must be instance of trueElement", notCondition.getCondition() instanceof TrueElement);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_PATTERNSTRUCTURE_TRUEELEMENT + "trueElementQuantifiedCondition.patternstructure", "patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of quantifiedCondition must be instance of trueElement", quantifiedCondition.getCondition() instanceof TrueElement);
	}
	
	//AbstractPatternTests
	@Test
	public void testBehavior() {
		//behavior
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_BEHAVIOR + "openView.patternstructure", "patternstructure");
      	graph = pattern.getGraph();
      	ArrayList<XmlElement> xmlElements = new ArrayList<XmlElement>();
      	ArrayList<Property> xmlProperties = new ArrayList<Property>();
		for(Element e:graph.getElements()) {
			xmlProperties.addAll(e.getProperties());
			if(e instanceof XmlElement) {
				xmlElements.add((XmlElement) e);
			}
		}
		assertTrue("pattern must contain one xmlElement and one xmlProperty", xmlElements.size() == 1 && xmlProperties.size() == 1);	
	}
	
	@Test
	public void testDelete() {
		//tools/delete
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_TOOLS_DELETE + "deleteButton.patternstructure", "patternstructure");
      	graph = pattern.getGraph();
      	ArrayList<Element> elements = new ArrayList<Element>();
      	ArrayList<Property> properties = new ArrayList<Property>();
      	notCondition = (NotCondition) pattern.getCondition();
      	formula = (Formula) notCondition.getCondition();
      	countCondition = (CountCondition) formula.getCondition2();
      	quantifiedCondition = (QuantifiedCondition) formula.getCondition1();
      	Graph graphQuantifiedCondition = quantifiedCondition.getGraph();
      	TrueElement trueElementQuantifiedCondition = (TrueElement) quantifiedCondition.getCondition();
      	countPattern = countCondition.getCountPattern();
      	TrueElement trueElementCountPattern = (TrueElement) countPattern.getCondition();
      	NumberElement numberElement = (NumberElement) countCondition.getArgument2();
      	Graph graphCountPattern = countPattern.getGraph();
      	ArrayList<Relation> relations = new ArrayList<Relation>();
      	ArrayList<Operator> operators = new ArrayList<Operator>();
      	EList<Parameter> parameters = pattern.getParameterList().getParameters();
      	
      	elements.addAll(graph.getElements());
      	elements.addAll(graphQuantifiedCondition.getElements());
      	elements.addAll(graphCountPattern.getElements());
      	
      	for(Element e:elements) {
      		properties.addAll(e.getProperties());
      	}
      	
      	relations.addAll(graph.getRelations());
      	relations.addAll(graphQuantifiedCondition.getRelations());
      	relations.addAll(graphCountPattern.getRelations());
      	
      	operators.addAll(graph.getOperatorList().getOperators());
      	operators.addAll(graphQuantifiedCondition.getOperatorList().getOperators());
      	operators.addAll(graphCountPattern.getOperatorList().getOperators());
      	
      	assertTrue("number of objects in pattern must be 69", trueElementCountPattern != null && trueElementQuantifiedCondition != null && elements.size() + properties.size() + relations.size() + operators.size() + parameters.size() == 69);
      	
      	pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_TOOLS_DELETE + "deleteContextmenu.patternstructure", "patternstructure");
      	graph = pattern.getGraph();
      	elements = new ArrayList<Element>();
      	properties = new ArrayList<Property>();
      	notCondition = (NotCondition) pattern.getCondition();
      	formula = (Formula) notCondition.getCondition();
      	countCondition = (CountCondition) formula.getCondition2();
      	quantifiedCondition = (QuantifiedCondition) formula.getCondition1();
      	graphQuantifiedCondition = quantifiedCondition.getGraph();
      	trueElementQuantifiedCondition = (TrueElement) quantifiedCondition.getCondition();
      	countPattern = countCondition.getCountPattern();
      	trueElementCountPattern = (TrueElement) countPattern.getCondition();
      	numberElement = (NumberElement) countCondition.getArgument2();
      	graphCountPattern = countPattern.getGraph();
      	relations = new ArrayList<Relation>();
      	operators = new ArrayList<Operator>();
      	parameters = pattern.getParameterList().getParameters();
      	
      	elements.addAll(graph.getElements());
      	elements.addAll(graphQuantifiedCondition.getElements());
      	elements.addAll(graphCountPattern.getElements());
      	
      	for(Element e:elements) {
      		properties.addAll(e.getProperties());
      	}
      	
      	relations.addAll(graph.getRelations());
      	relations.addAll(graphQuantifiedCondition.getRelations());
      	relations.addAll(graphCountPattern.getRelations());
      	
      	operators.addAll(graph.getOperatorList().getOperators());
      	operators.addAll(graphQuantifiedCondition.getOperatorList().getOperators());
      	operators.addAll(graphCountPattern.getOperatorList().getOperators());
      	
      	assertTrue("number of objects in pattern must be 69", trueElementCountPattern != null && trueElementQuantifiedCondition != null && elements.size() + properties.size() + relations.size() + operators.size() + parameters.size() == 69);

	}
	
	@Test
	public void testFinalization() {
		//tools/finalization
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_TOOLS_FINALIZATION + "finalization.patternstructure", "patternstructure");
      	graph = pattern.getGraph();
      	for(Element e:graph.getElements()) {
      		if(e.getName().equals("Root")) {
      			element = e;
      		}
      	}
      	assertTrue("contextgraph must contain one xmlElement and its attribute name must be Root", element != null && element.getName().equals("Root"));
	}
	
	@Test
	public void testRelationToXmlRelation_changeXmlRelation() {
		//tools/relationToXmlRelation
      	pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_TOOLS_RELATION_TO_XMLRELATION + "relationToXmlNavigation.patternstructure", "patternstructure");
      	graph = pattern.getGraph();
      	relations = graph.getRelations();
      	xmlNavigation = (XmlNavigation) relations.get(0);
      	Element source = xmlNavigation.getSource();
      	Element target = xmlNavigation.getTarget();
        assertTrue("contextgraph must contain one xmlNavigation and its attribute source must be xmlElement 1 and attribute target must be xmlElement 8", source.getName().equals("XmlElement 1") && target.getName().equals("XmlElement 8"));
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_TOOLS_RELATION_TO_XMLRELATION + "relationToXmlReference.patternstructure", "patternstructure");
      	Graph graph = pattern.getGraph();
      	EList<Relation> relations = graph.getRelations();
      	XmlReference xmlReference = (XmlReference) relations.get(0);
      	source = xmlReference.getSource();
      	target = xmlReference.getTarget();
        assertTrue("contextgraph must contain one xmlReference and its attribute source must be xmlElement 1 and attribute target must be xmlElement 8", source.getName().equals("XmlElement 1") && target.getName().equals("XmlElement 8"));
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_TOOLS_RELATION_TO_XMLRELATION + "relationUnchanged.patternstructure", "patternstructure");
      	graph = pattern.getGraph();
      	relations = graph.getRelations();
      	relation = (Relation) relations.get(0);
      	source = relation.getSource();
      	target = relation.getTarget();
        assertTrue("contextgraph must contain one relation and its attribute source must be xmlElement 1 and attribute target must be xmlElement 8", source.getName().equals("XmlElement 1") && target.getName().equals("XmlElement 8"));

        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_TOOLS_RELATION_TO_XMLRELATION + "xmlNavigationToXmlReference.patternstructure", "patternstructure");
      	graph = pattern.getGraph();
      	relations = graph.getRelations();
      	xmlReference = (XmlReference) relations.get(0);
      	source = xmlReference.getSource();
      	target = xmlReference.getTarget();
        assertTrue("contextgraph must contain one xmlReference and its attribute source must be xmlElement 1 and attribute target must be xmlElement 8", source.getName().equals("XmlElement 1") && target.getName().equals("XmlElement 8"));

        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_TOOLS_RELATION_TO_XMLRELATION + "xmlNavigationUnchanged.patternstructure", "patternstructure");
      	graph = pattern.getGraph();
      	relations = graph.getRelations();
      	xmlNavigation = (XmlNavigation) relations.get(0);
      	source = xmlNavigation.getSource();
      	target = xmlNavigation.getTarget();
        assertTrue("contextgraph must contain one xmlNavigation and its attribute source must be xmlElement 1 and attribute target must be xmlElement 8", source.getName().equals("XmlElement 1") && target.getName().equals("XmlElement 8"));

        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_TOOLS_RELATION_TO_XMLRELATION + "xmlReferenceToXmlNavigation.patternstructure", "patternstructure");
      	graph = pattern.getGraph();
      	relations = graph.getRelations();
      	xmlNavigation = (XmlNavigation) relations.get(0);
      	source = xmlNavigation.getSource();
      	target = xmlNavigation.getTarget();
        assertTrue("contextgraph must contain one xmlNavigation and its attribute source must be xmlElement 1 and attribute target must be xmlElement 8", source.getName().equals("XmlElement 1") && target.getName().equals("XmlElement 8"));

        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_TOOLS_RELATION_TO_XMLRELATION + "xmlReferenceUnchanged.patternstructure", "patternstructure");
      	graph = pattern.getGraph();
      	relations = graph.getRelations();
      	xmlReference = (XmlReference) relations.get(0);
      	source = xmlReference.getSource();
      	target = xmlReference.getTarget();
        assertTrue("contextgraph must contain one xmlReference and its attribute source must be xmlElement 1 and attribute target must be xmlElement 8", source.getName().equals("XmlElement 1") && target.getName().equals("XmlElement 8"));
	}
	
	//ConcretePatternTests
	@Test
	public void testFormularviewBoolean() {
		//formularview/tools/boolean
      	pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_BOOLEAN + "booleanFalseToTrue.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof BooleanParam) {
      			booleanParam = (BooleanParam) p;
      		}
      	}
        assertTrue("value of booleanParam must be true", booleanParam.getValue());
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_BOOLEAN + "booleanTrueToFalse.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof BooleanParam) {
      			booleanParam = (BooleanParam) p;
      		}
      	}
        assertTrue("value of booleanParam must be true", !booleanParam.getValue());
	}
	
	@Test
	public void testFormularviewComparisonOption() {
		//formularview/tools/comparisonOption
      	pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_COMPARISONOPTION + "comparisonOptionEqual.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof ComparisonOptionParam) {
      			comparisonOption = (ComparisonOptionParam) p;
      		}
      	}
        assertTrue("value of comparisonOptionParam must be equal", comparisonOption.getValue() == ComparisonOperator.EQUAL);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_COMPARISONOPTION + "comparisonOptionGreater.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof ComparisonOptionParam) {
      			comparisonOption = (ComparisonOptionParam) p;
      		}
      	}
        assertTrue("value of comparisonOptionParam must be greater", comparisonOption.getValue() == ComparisonOperator.GREATER);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_COMPARISONOPTION + "comparisonOptionGreaterOrEqual.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof ComparisonOptionParam) {
      			comparisonOption = (ComparisonOptionParam) p;
      		}
      	}
        assertTrue("value of comparisonOptionParam must be equal", comparisonOption.getValue() == ComparisonOperator.GREATEROREQUAL);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_COMPARISONOPTION + "comparisonOptionLess.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof ComparisonOptionParam) {
      			comparisonOption = (ComparisonOptionParam) p;
      		}
      	}
        assertTrue("value of comparisonOptionParam must be equal", comparisonOption.getValue() == ComparisonOperator.LESS);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_COMPARISONOPTION + "comparisonOptionLessOrEqual.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof ComparisonOptionParam) {
      			comparisonOption = (ComparisonOptionParam) p;
      		}
      	}
        assertTrue("value of comparisonOptionParam must be equal", comparisonOption.getValue() == ComparisonOperator.LESSOREQUAL);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_COMPARISONOPTION + "comparisonOptionNotEqual.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof ComparisonOptionParam) {
      			comparisonOption = (ComparisonOptionParam) p;
      		}
      	}
        assertTrue("value of comparisonOptionParam must be equal", comparisonOption.getValue() == ComparisonOperator.NOTEQUAL);
	}
	
	@Test
	public void testFormularviewDate() {
		//formularview/tools/date
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_DATE + "dateSetValue.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof DateParam) {
      			dateParam = (DateParam) p;
      		}
      	}
        assertTrue("value of dateParam must be 2000-01-01", dateParam.getValue().equals("2000-01-01"));
	}
	
	@Test
	public void testFormularviewDateTime() {
		//formularview/tools/dateTime
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_DATETIME + "dateTimeSetValue.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof DateTimeParam) {
      			dateTimeParam = (DateTimeParam) p;
      		}
      	}
        assertTrue("value of dateTimeParam must be 2000-01-01T00:00:00", dateTimeParam.getValue().equals("2000-01-01T00:00:00"));
	}
	
	@Test
	public void testFormularviewNumber() {
		//formularview/tools/number
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_NUMBER + "numberSetValue.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof NumberParam) {
      			numberParam = (NumberParam) p;
      		}
      	}
        assertTrue("value of numberParam must be 1.0", numberParam.getValue() == 1.0);
	}
	
	@Test
	public void testFormularviewPropertyOption() {
		//formularview/tools/propertyOption
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_PROPERTYOPTION + "propertyOptionAttribute.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof PropertyOptionParam) {
      			propertyOption = (PropertyOptionParam) p;
      		}
      	}
        assertTrue("value of propertyOptionParam must be 1.0", propertyOption.getValue() == PropertyKind.ATTRIBUTE);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_PROPERTYOPTION + "propertyOptionData.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof PropertyOptionParam) {
      			propertyOption = (PropertyOptionParam) p;
      		}
      	}
        assertTrue("value of propertyOptionParam must be 1.0", propertyOption.getValue() == PropertyKind.DATA);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_PROPERTYOPTION + "propertyOptionTag.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof PropertyOptionParam) {
      			propertyOption = (PropertyOptionParam) p;
      		}
      	}
        assertTrue("value of propertyOptionParam must be 1.0", propertyOption.getValue() == PropertyKind.TAG);
	}
	
	@Test
	public void testFormularviewRelationOption() {
		//formularview/tools/relationOption
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionAncestor.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.ANCESTOR);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionAncestorOrSelf.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.ANCESTOR_OR_SELF);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionChild.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.CHILD);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionDescendant.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.DESCENDANT);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionDescendantOrSelf.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.DESCENDANT_OR_SELF);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionEightchild.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.EIGHTCHILD);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionFivechild.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.FIVECHILD);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionFollowing.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.FOLLOWING);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionFollowingSibling.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.FOLLOWING_SIBLING);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionFourchild.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.FOURCHILD);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionNinechild.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.NINECHILD);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionParent.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.PARENT);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionPreceding.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.PRECEDING);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionPrecedingSibling.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.PRECEDING_SIBLING);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionSelf.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.SELF);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionSevenchild.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.SEVENCHILD);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionSixchild.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.SIXCHILD);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionThreechild.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.THREECHILD);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_RELATIONOPTION + "relationOptionTwochild.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.TWOCHILD);
	}
	
	@Test
	public void testFormularviewTextList() {
		//formularview/tools/textList
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TEXTLIST + "textListAdd.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextListParam) {
      			textListParam = (TextListParam) p;
      		}
      	}
        assertTrue("value of textListParam must be hinzugefügt mit add", textListParam.getValues().get(0).equals("hinzugefügt mit add"));
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TEXTLIST + "textListDelete.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextListParam) {
      			textListParam = (TextListParam) p;
      		}
      	}
        assertTrue("value of textListParam must be empty", textListParam.getValues().isEmpty());
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TEXTLIST + "textListSave.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextListParam) {
      			textListParam = (TextListParam) p;
      		}
      	}
        assertTrue("value of textListParam must be gespeichert mit save", textListParam.getValues().get(0).equals("gespeichert mit save"));
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TEXTLIST + "textListCancel.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextListParam) {
      			textListParam = (TextListParam) p;
      		}
      	}
      	assertTrue("value of textListParam must be empty", textListParam.getValues().isEmpty());
      	
      	pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TEXTLIST + "textListOk.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextListParam) {
      			textListParam = (TextListParam) p;
      		}
      	}
        assertTrue("value of textListParam must be hinzugefügt mit add", textListParam.getValues().get(0).equals("hinzugefügt mit add"));
	}
	
	@Test
	public void testFormularviewTextLiteral() {
		//formularview/tools/textLiteral
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TEXTLITERAL + "textLiteralSetValue.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextLiteralParam && p.getInternalId() == 3) {
      			textLiteralParam = (TextLiteralParam) p;
      		}
      	}
        assertTrue("value of textLiteralParam must be Test", textLiteralParam.getValue().equals("Test"));
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TEXTLITERAL + "textLiteralSetValueSuggestion.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextLiteralParam && p.getInternalId() == 3) {
      			textLiteralParam = (TextLiteralParam) p;
      		}
      	}
        assertTrue("value of textLiteralParam must be Suggestion", textLiteralParam.getValue().equals("Suggestion"));
	}
	
	@Test
	public void testFormularviewTime() {
		//formularview/tools/time
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TIME + "timeSetValue.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TimeParam) {
      			timeParam = (TimeParam) p;
      		}
      	}
        assertTrue("value of timeParam must be 00:00:00", timeParam.getValue().equals("00:00:00"));
	}
	
	@Test
	public void testFormularviewTypeOption() {
		//formularview/tools/typeOption
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TYPEOPTION + "typeOptionBoolean.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TypeOptionParam) {
      			typeOption = (TypeOptionParam) p;
      		}
      	}
      	//System.out.println(typeOption);
        assertTrue("value of typeOptionParam must be boolean", typeOption.getValue() == ReturnType.BOOLEAN);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TYPEOPTION + "typeOptionDate.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TypeOptionParam) {
      			typeOption = (TypeOptionParam) p;
      		}
      	}
        assertTrue("value of typeOptionParam must be date", typeOption.getValue() == ReturnType.DATE);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TYPEOPTION + "typeOptionDateTime.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TypeOptionParam) {
      			typeOption = (TypeOptionParam) p;
      		}
      	}
        assertTrue("value of typeOptionParam must be dateTime", typeOption.getValue() == ReturnType.DATETIME);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TYPEOPTION + "typeOptionElement.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TypeOptionParam) {
      			typeOption = (TypeOptionParam) p;
      		}
      	}
        assertTrue("value of typeOptionParam must be element", typeOption.getValue() == ReturnType.ELEMENT);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TYPEOPTION + "typeOptionNumber.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TypeOptionParam) {
      			typeOption = (TypeOptionParam) p;
      		}
      	}
        assertTrue("value of typeOptionParam must be number", typeOption.getValue() == ReturnType.NUMBER);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TYPEOPTION + "typeOptionString.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TypeOptionParam) {
      			typeOption = (TypeOptionParam) p;
      		}
      	}
        assertTrue("value of typeOptionParam must be string", typeOption.getValue() == ReturnType.STRING);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_TYPEOPTION + "typeOptionTime.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TypeOptionParam) {
      			typeOption = (TypeOptionParam) p;
      		}
      	}
        assertTrue("value of typeOptionParam must be time", typeOption.getValue() == ReturnType.TIME);
	}
	
	@Test
	public void testFormularviewUntypedParameterValue() {
		//formularview/tools/untypedParameterValue
      	booleanParam = null;
      	dateParam = null;
      	dateTimeParam = null;
      	numberParam = null;
      	textListParam = null;
      	textLiteralParam = null;
      	timeParam = null;
		
		pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_UNTYPEDPARAMETERVALUE + "untypedParameterValueToBoolean.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof BooleanParam) {
      			booleanParam = (BooleanParam) p;
      		}
      	}
        assertTrue("parameterList must contain one booleanParam", booleanParam != null);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_UNTYPEDPARAMETERVALUE + "untypedParameterValueToDate.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof DateParam) {
      			dateParam = (DateParam) p;
      		}
      	}
        assertTrue("parameterList must contain one dateParam", dateParam != null);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_UNTYPEDPARAMETERVALUE + "untypedParameterValueToDateTime.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof DateTimeParam) {
      			dateTimeParam = (DateTimeParam) p;
      		}
      	}
        assertTrue("parameterList must contain one dateTimeParam", dateTimeParam != null);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_UNTYPEDPARAMETERVALUE + "untypedParameterValueToNumber.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof NumberParam) {
      			numberParam = (NumberParam) p;
      		}
      	}
        assertTrue("parameterList must contain one numberParam", numberParam != null);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_UNTYPEDPARAMETERVALUE + "untypedParameterValueToTextList.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextListParam) {
      			textListParam = (TextListParam) p;
      		}
      	}
        assertTrue("parameterList must contain one textListParam", textListParam != null);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_UNTYPEDPARAMETERVALUE + "untypedParameterValueToTextLiteral.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextLiteralParam) {
      			textLiteralParam = (TextLiteralParam) p;
      		}
      	}
        assertTrue("parameterList must contain one textLiteralParam", textLiteralParam != null);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_UNTYPEDPARAMETERVALUE + "untypedParameterValueToTime.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TimeParam) {
      			timeParam = (TimeParam) p;
      		}
      	}
        assertTrue("parameterList must contain one timeParam", timeParam != null);
        
        pattern = (CompletePattern) qualitypatternmodel.utility.EMFModelLoad.load(TEST_DIRECTORY_FORMULAR_VIEW_TOOLS_UNTYPEDPARAMETERVALUE + "timeToBoolean.patternstructure", "patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof BooleanParam) {
      			booleanParam = (BooleanParam) p;
      		}
      	}
        assertTrue("parameterList must contain one booleanParam", booleanParam != null);
	}
}

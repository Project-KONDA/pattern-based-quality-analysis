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
import qualitypatternmodel.testutility.EMFModelLoad;

public class Tests {
	EMFModelLoad loader = new EMFModelLoad();
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
	private static final String testDirectoryAbstract = "Tests/AbstractPatternTests/";
	private static final String testDirectoryBehavior = testDirectoryAbstract + "behavior/";
	private static final String testDirectoryToolsRelationToXmlRelation = testDirectoryAbstract + "tools/relationToXmlRelation_changeXmlRelation/";
	private static final String testDirectoryToolsFinalization = testDirectoryAbstract + "tools/finalization/";
	private static final String testDirectoryToolsDelete = testDirectoryAbstract + "tools/delete/";
	//concrete
	private static final String testDirectoryConcrete = "Tests/ConcretePatternTests/";
	private static final String testDirectoryFormularviewToolsBoolean = testDirectoryConcrete + "formularview/tools/boolean/";
	private static final String testDirectoryFormularviewToolsComparisonOption = testDirectoryConcrete + "formularview/tools/comparisonOption/";
	private static final String testDirectoryFormularviewToolsDate = testDirectoryConcrete + "formularview/tools/date/";
	private static final String testDirectoryFormularviewToolsDateTime = testDirectoryConcrete + "formularview/tools/dateTime/";
	private static final String testDirectoryFormularviewToolsNumber = testDirectoryConcrete + "formularview/tools/number/";
	private static final String testDirectoryFormularviewToolsPropertyOption = testDirectoryConcrete + "formularview/tools/propertyOption/";
	private static final String testDirectoryFormularviewToolsRelationOption = testDirectoryConcrete + "formularview/tools/relationOption/";
	private static final String testDirectoryFormularviewToolsTextList = testDirectoryConcrete + "formularview/tools/textList/";
	private static final String testDirectoryFormularviewToolsTextLiteral = testDirectoryConcrete + "formularview/tools/textLiteral/";
	private static final String testDirectoryFormularviewToolsTime = testDirectoryConcrete + "formularview/tools/time/";
	private static final String testDirectoryFormularviewToolsTypeOption = testDirectoryConcrete + "formularview/tools/typeOption/";
	private static final String testDirectoryFormularviewToolsUntypedParameterValue = testDirectoryConcrete + "formularview/tools/untypedParameterValue/";
	
	
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
		EMFModelLoad loader = new EMFModelLoad();
		//System.out.println(System.getProperty("user.dir"));
		//quantifiedConditionCompletePattern.patternstructure
		CompletePattern pattern = loader.load("Tests/GenericPatternTests/patternstructure/tools/quantifiedCondition/quantifiedConditionCompletePattern.patternstructure");
		System.out.println(pattern);
		//test();
	}
		//konstanten methoden kommentare tag view


	//GenericPatternTests
	@Test
	public void testGraphstructureChangeNameElement() {
		//graphstructure/tools/changeNameElement
		pattern = loader.load(TEST_DIRECTORY_GRAPHSTRUCTURE_CHANGE_NAME_ELEMENT + "changeNameElement.patternstructure");
		graph = pattern.getGraph();
		assertTrue("attribute name of element must contain the String \"ElementNewName\"", graph.getElements().get(0).getName().equals("ElementNewName"));
	}
	
	@Test
	public void testGraphstructureChangeNameProperty() {
		//graphstructure/tools/changeNameElement
		pattern = loader.load(TEST_DIRECTORY_GRAPHSTRUCTURE_CHANGE_NAME_PROPERTY + "changeNameProperty.patternstructure");
		graph = pattern.getGraph();
		assertTrue("attribute name of property must contain the String \"PropertyNewName\"", graph.getElements().get(0).getProperties().get(0).getName().equals("PropertyNewName"));
	}
	
	@Test
	public void testGraphstructureChangeNameRelation() {
		//graphstructure/tools/changeNameRelation
		pattern = loader.load(TEST_DIRECTORY_GRAPHSTRUCTURE_CHANGE_NAME_RELATION + "changeNameRelation.patternstructure");
		graph = pattern.getGraph();
		assertTrue("attribute name of relation must contain the String \"RelationNewName\"", graph.getRelations().get(0).getName().equals("RelationNewName"));
	}
	
	@Test
	public void testGraphstructureDeleteGraph() {
		//graphstructure/tools/changeNameRelation
		pattern = loader.load(TEST_DIRECTORY_GRAPHSTRUCTURE_DELETE_GRAPH + "deleteGraph.patternstructure");
		graph = pattern.getGraph();
		assertTrue("graph of pattern must not be null", graph != null);
	}
	
	//tested, if there is one new element in the graph after using the tool element
	@Test
	public void testGraphstructureElement() {
		//graphstructure/tools/element
		pattern = loader.load(TEST_DIRECTORY_GRAPHSTRUCTURE_ELEMENT + "elementGraph.patternstructure");
		graph = pattern.getGraph();
		assertTrue("graph must contain two elements", graph.getElements().size() == 2);
	}
	
	//tested, if the attribut ResultOf is set correctly by the tools markAsReturnElement and markAsNoReturnElement
	@Test
	public void testGraphstructureMarkAsReturnElement() {
		//graphstructure/tools/markAsReturnElement
		pattern = loader.load(TEST_DIRECTORY_GRAPHSTRUCTURE_MARK_AS_RETURN_ELEMENT + "markAsReturnElement.patternstructure");
		graph = pattern.getGraph();
		assertTrue("graph must contain one returnelement", graph.getReturnElements().size() == 1);
		
		pattern = loader.load(TEST_DIRECTORY_GRAPHSTRUCTURE_MARK_AS_RETURN_ELEMENT + "markAsNoReturnElement.patternstructure");
		graph = pattern.getGraph();
		assertTrue("graph must contain zero returnelement", graph.getReturnElements().size() == 0);
	}
	
	//tested, if there is one new property in the element after using the tool property
	@Test
	public void testGraphstructureProperty() {
		//graphstructure/tools/property
		pattern = loader.load(TEST_DIRECTORY_GRAPHSTRUCTURE_PROPERTY + "propertyElement.patternstructure");
		graph = pattern.getGraph();
		assertTrue("element must contain one property", graph.getElements().get(0).getProperties().size() == 1);
	}
	
	//tested, if there is one new relation in the graph after using the tool relation and if the attributes source and target are set correct
	@Test
	public void testGraphstructureRelation() {
		//graphstructure/tools/relation
		pattern = loader.load(TEST_DIRECTORY_GRAPHSTRUCTURE_RELATION + "relationGraph.patternstructure");
		graph = pattern.getGraph();
		relation = graph.getRelations().get(0);
		assertTrue("graph must contain one relation, the attribute source must be element1, the attribute target must be element2", graph.getRelations().size() == 1 && relation.getSource().getName().equals("Element 1") && relation.getTarget().getName().equals("Element 2"));
	}
	
	@Test
	public void testOperatorsComparison() {
		//operators/tools/comparison
		pattern = loader.load(TEST_DIRECTORY_OPERATORS_COMPARISON + "comparisonGraph.patternstructure");
		graph = pattern.getGraph();
		assertTrue("operatorlist of graph must contain one comparison", graph.getOperatorList().getOperators().get(0) instanceof Comparison);
	}
	
	@Test
	public void testOperatorsDiscardArgument() {
		//operators/tools/discardArgument
		pattern = loader.load(TEST_DIRECTORY_OPERATORS_DISCARD_ARGUMENT + "discardArgument1Comparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("comparison must have an empty argument1", comparison.getArgument1() == null);
		
		pattern = loader.load(TEST_DIRECTORY_OPERATORS_DISCARD_ARGUMENT + "discardArgument2Comparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("comparison must have an empty argument2", comparison.getArgument2() == null);
		
		pattern = loader.load(TEST_DIRECTORY_OPERATORS_DISCARD_ARGUMENT + "discardArgument2Match.patternstructure");
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("match must have an empty property", match.getProperty() == null);
		
		pattern = loader.load(TEST_DIRECTORY_OPERATORS_DISCARD_ARGUMENT + "discardArgumentComparison1.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("comparison must have an empty argument1", comparison.getArgument1() == null);
		
		pattern = loader.load(TEST_DIRECTORY_OPERATORS_DISCARD_ARGUMENT + "discardArgumentComparison2.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("comparison must have an empty argument2", comparison.getArgument2() == null);
		
		pattern = loader.load(TEST_DIRECTORY_OPERATORS_DISCARD_ARGUMENT + "discardArgumentMatch.patternstructure");
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("match must have an empty property", match.getProperty() == null);
	}
	
	@Test
	public void testOperatorsMatch() {
		//operators/tools/match
		pattern = loader.load(TEST_DIRECTORY_OPERATORS_MATCH + "matchGraph.patternstructure");
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("operatorlist of graph must contain one match", match instanceof Match);
	}
	
	@Test
	public void testOperatorsSelectElementAsArgument() {
		//operators/tools/selectElementAsArgument
		pattern = loader.load(TEST_DIRECTORY_OPERATORS_SELECT_ELEMENT_AS_ARGUMENT + "selectElementComparison1.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument1 of comparison must contain Element 1", ((Element) comparison.getArgument1()).getName().equals("Element 1"));
		
		pattern = loader.load(TEST_DIRECTORY_OPERATORS_SELECT_ELEMENT_AS_ARGUMENT + "selectElementComparison2.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument1 of comparison must contain Element 3", ((Element) comparison.getArgument2()).getName().equals("Element 3"));
	}
	
	@Test
	public void testOperatorsSelectParameterAsArgument() {
		//operators/tools/selectParameterAsArgument
		pattern = loader.load(TEST_DIRECTORY_OPERATORS_SELECT_PARAMETERS_AS_ARGUMENT + "selectParameterComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(1);
		assertTrue("argument2 of comparison must contain Number 4", comparison.getInternalId() == 2 && comparison.getArgument2() instanceof NumberParam);
	}
	
	@Test
	public void testOperatorsSelectPropertyAsArgument() {
		//operators/tools/selectPropertyAsArgument
		pattern = loader.load(TEST_DIRECTORY_OPERATORS_SELECT_PROPERTY_AS_ARGUMENT + "selectPropertyComparison1.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument1 of comparison must contain one property", comparison.getArgument1() instanceof Property);
		
		pattern = loader.load(TEST_DIRECTORY_OPERATORS_SELECT_PROPERTY_AS_ARGUMENT + "selectPropertyComparison2.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one property", comparison.getArgument2() instanceof Property);
		
		pattern = loader.load(TEST_DIRECTORY_OPERATORS_SELECT_PROPERTY_AS_ARGUMENT + "selectPropertyMatch.patternstructure");
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of match must contain one property", match.getProperty() instanceof Property);
	}
	
	@Test
	public void testParametersBoolean() {
		//parameters/tools/boolean
		pattern = loader.load(TEST_DIRECTORY_PARAMETERS_BOOLEAN + "BooleanComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one BooleanParam", comparison.getArgument2() instanceof BooleanParam);
	}
	
	@Test
	public void testParametersDate() {
		//parameters/tools/date
		pattern = loader.load(TEST_DIRECTORY_PARAMETERS_DATE + "DateComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one DateParam", comparison.getArgument2() instanceof DateParam);
	}
	
	@Test
	public void testParametersDateAndTime() {
		//parameters/tools/dateAndTime
		pattern = loader.load(TEST_DIRECTORY_PARAMETERS_DATE_AND_TIME + "DateTimeComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one DateTimeParam", comparison.getArgument2() instanceof DateTimeParam);
	}
	
	@Test
	public void testParametersNumber() {
		//parameters/tools/number
		pattern = loader.load(TEST_DIRECTORY_PARAMETERS_NUMBER + "NumberComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one NumberParam", comparison.getArgument2() instanceof NumberParam);
	}
	
	@Test
	public void testParametersTextList() {
		//parameters/tools/textList
		pattern = loader.load(TEST_DIRECTORY_PARAMETERS_TEXTLIST + "TextListComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one TextListParam", comparison.getArgument2() instanceof TextListParam);
	}
	
	@Test
	public void testParametersTextLiteral() {
		//parameters/tools/textLiteral
		pattern = loader.load(TEST_DIRECTORY_PARAMETERS_TEXTLITERAL + "TextLiteralComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one TextLiteralParam", comparison.getArgument2() instanceof TextLiteralParam);
	}
	
	@Test
	public void testParametersTime() {
		//parameters/tools/time
		pattern = loader.load(TEST_DIRECTORY_PARAMETERS_TIME + "TimeComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one TimeParam", comparison.getArgument2() instanceof TimeParam);
	}
	
	@Test
	public void testParametersUntypedValue() {
		//parameters/tools/untypedValue
		pattern = loader.load(TEST_DIRECTORY_PARAMETERS_UNTYPEDVALUE + "UntypedValueComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one UntypedParameterValue", comparison.getArgument2() instanceof UntypedParameterValue);
	}
	
	@Test
	public void testChangeNameCompletePattern() {
		//patternstructure/tools/changeNameCompletePattern
		pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_NAME_COMPLETEPATTERN + "changeNameCompletePattern.patternstructure");
		assertTrue("attribute of completePattern must be equal to \"Muster\"", pattern.getName().equals("Muster"));
	}
	
	@Test
	public void testPatternstructureChangeOperator() {
		//patternstructure/tools/changeOperator
		pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_OPERATOR + "andToEqual.patternstructure");
		formula = (Formula) pattern.getCondition();
        assertTrue("operator of formula must be equal", formula.getOperator() == LogicalOperator.EQUAL);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_OPERATOR + "andToImplies.patternstructure");
		formula = (Formula) pattern.getCondition();
        assertTrue("operator of formula must be implies", formula.getOperator() == LogicalOperator.IMPLIES);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_OPERATOR + "andToOr.patternstructure");
		formula = (Formula) pattern.getCondition();
        assertTrue("operator of formula must be or", formula.getOperator() == LogicalOperator.OR);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_OPERATOR + "andToXor.patternstructure");
		formula = (Formula) pattern.getCondition();
        assertTrue("operator of formula must be xor", formula.getOperator() == LogicalOperator.XOR);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_OPERATOR + "orToAnd.patternstructure");
		formula = (Formula) pattern.getCondition();
        assertTrue("operator of formula must be and", formula.getOperator() == LogicalOperator.AND);
	}
	
	@Test
	public void testPatternstructureChangeQuantifier() {
		//patternstructure/tools/changeQuantifier
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_QUANTIFIER + "existsToForall.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("quantifier of quantifiedCondition must be forall", quantifiedCondition.getQuantifier() == Quantifier.FORALL);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_CHANGE_QUANTIFIER + "forallToExists.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("quantifier of quantifiedCondition must be exists", quantifiedCondition.getQuantifier() == Quantifier.EXISTS);
	}
	
	@Test
	public void testPatternstructureCountCondition() {
		//patternstructure/tools/countCondition
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_COUNTCONDITION + "countConditionCompletePattern.patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of countCondition", countCondition instanceof CountCondition);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_COUNTCONDITION + "countConditionCountPattern.patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        countPattern = (CountPattern) countCondition.getCountPattern();
        assertTrue("condition of CountPattern must be instance of countCondition", countPattern.getCondition() instanceof CountCondition);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_COUNTCONDITION + "countConditionFormula.patternstructure");
        formula = (Formula) pattern.getCondition();
        assertTrue("conditions of formula must be instance of countCondition", formula.getCondition1() instanceof CountCondition && formula.getCondition2() instanceof CountCondition);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_COUNTCONDITION + "countConditionNotCondition.patternstructure");
        notCondition = (NotCondition) pattern.getCondition();
        assertTrue("condition of notCondition must be instance of countCondition", notCondition.getCondition() instanceof CountCondition);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_COUNTCONDITION + "countConditionQuantifiedCondition.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of quantifiedCondition must be instance of countCondition", quantifiedCondition.getCondition() instanceof CountCondition);
	}
	
	@Test
	public void testPatternstructureCountPattern() {
		//patternstructure/tools/countPattern
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_COUNTPATTERN + "countPatternCountCondition.patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        countPattern = (CountPattern) countCondition.getArgument2();
        assertTrue("argument2 of countCondition must be instance of countPattern", countPattern instanceof CountPattern);
	}
	
	@Test
	public void testPatternstructureFormula() {
		//patternstructure/tools/formula
      	pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaAnd.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be and", formula.getOperator() == LogicalOperator.AND);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaAndDialog.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be and", formula.getOperator() == LogicalOperator.AND);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaCompletePattern.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula", formula instanceof Formula);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaCountPattern.patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
      	countPattern = countCondition.getCountPattern();
        assertTrue("condition of countPattern must be instance of formula", countPattern.getCondition() instanceof Formula);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaEqual.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be equal", formula.getOperator() == LogicalOperator.EQUAL);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaEqualDialog.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be equal", formula.getOperator() == LogicalOperator.EQUAL);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaFormula.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("conditions of formula must be instance of formula", formula.getCondition1() instanceof Formula && formula.getCondition1() instanceof Formula);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaImplies.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be implies", formula.getOperator() == LogicalOperator.IMPLIES);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaImpliesDialog.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be implies", formula.getOperator() == LogicalOperator.IMPLIES);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaNotCondition.patternstructure");
      	notCondition = (NotCondition) pattern.getCondition();
        assertTrue("conditions of notcondition must be instance of formula", notCondition.getCondition() instanceof Formula);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaOr.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be or", formula.getOperator() == LogicalOperator.OR);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaOrDialog.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be or", formula.getOperator() == LogicalOperator.OR);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaQuantifiedCondition.patternstructure");
      	quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("conditions of quantifiedCondition must be instance of formula", quantifiedCondition.getCondition() instanceof Formula);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaXor.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be xor", formula.getOperator() == LogicalOperator.XOR);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_FORMULA + "formulaXorDialog.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be xor", formula.getOperator() == LogicalOperator.XOR);
	}
	
	@Test
	public void testPatternstructureNotCondition() {
		//patternstructure/tools/notCondition
      	pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_NOTCONDITION + "notConditionCompletePattern.patternstructure");
        assertTrue("condition of CompletePattern must be instance of notCondition", pattern.getCondition() instanceof NotCondition);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_NOTCONDITION + "notConditionCountPattern.patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        countPattern = countCondition.getCountPattern();
        assertTrue("condition of countPattern must be instance of notCondition", countPattern.getCondition() instanceof NotCondition);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_NOTCONDITION + "notConditionFormula.patternstructure");
        formula = (Formula) pattern.getCondition();
        assertTrue("conditions of formula must be instance of notCondition", formula.getCondition1() instanceof NotCondition && formula.getCondition2() instanceof NotCondition);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_NOTCONDITION + "notConditionNotCondition.patternstructure");
        notCondition = (NotCondition) pattern.getCondition();
        assertTrue("condition of notCondition must be instance of notCondition", notCondition.getCondition() instanceof NotCondition);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_NOTCONDITION + "notConditionQuantifiedCondition.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of quantifiedCondition must be instance of notCondition", quantifiedCondition.getCondition() instanceof NotCondition);
	}
	
	@Test
	public void testPatternstructureNumberElement() {
		//patternstructure/tools/numberElement
      	pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_NUMBERELEMENT + "numberElementCountCondition.patternstructure");
      	countCondition = (CountCondition) pattern.getCondition();
        assertTrue("condition of countCondition must be instance of numberElement", countCondition.getArgument2() instanceof NumberElement);
	}
	
	@Test
	public void testPatternstructureQuantifiedCondition() {
		//patternstructure/tools/quantifiedCondition
		pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionCompletePattern.patternstructure");
        assertTrue("condition of CompletePattern must be instance of quantifiedCondition", pattern.getCondition() instanceof QuantifiedCondition);

        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionCountPattern.patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        countPattern = (CountPattern) countCondition.getArgument2();
        assertTrue("condition of CountPattern must be instance of quantifiedCondition", countPattern.getCondition() instanceof QuantifiedCondition);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionExists.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of quantifiedCondition and its quantifier must be exists", quantifiedCondition.getQuantifier() == Quantifier.EXISTS);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionForall.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of quantifiedCondition and its quantifier must be forall", quantifiedCondition.getQuantifier() == Quantifier.FORALL);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionExistsDialog.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of quantifiedCondition and its quantifier must be exists", quantifiedCondition.getQuantifier() == Quantifier.EXISTS);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionForallDialog.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of quantifiedCondition and its quantifier must be forall", quantifiedCondition.getQuantifier() == Quantifier.FORALL);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionFormula.patternstructure");
        formula = (Formula) pattern.getCondition();
        assertTrue("condition of formula must be instance of quantifiedCondition", formula.getCondition1() instanceof QuantifiedCondition && formula.getCondition2() instanceof QuantifiedCondition);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionNotCondition.patternstructure");
        notCondition = (NotCondition) pattern.getCondition();
        assertTrue("condition of notCondition must be instance of quantifiedCondition", notCondition.getCondition() instanceof QuantifiedCondition);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_QUANTIFIEDCONDITION + "quantifiedConditionQuantifiedCondition.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of quantifiedCondition must be instance of quantifiedCondition", quantifiedCondition.getCondition() instanceof QuantifiedCondition);
	}
	
	@Test
	public void testPatternstructureTrueElement() {
		//patternstructure/tools/trueElement
      	pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_TRUEELEMENT + "trueElementCompletePattern.patternstructure");
        assertTrue("condition of CompletePattern must be instance of trueElement", pattern.getCondition() instanceof TrueElement);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_TRUEELEMENT + "trueElementCountPattern.patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        countPattern = countCondition.getCountPattern();
        assertTrue("condition of countPattern must be instance of trueElement", countPattern.getCondition() instanceof TrueElement);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_TRUEELEMENT + "trueElementFormula.patternstructure");
        formula = (Formula) pattern.getCondition();
        assertTrue("conditions of formula must be instance of trueElement", formula.getCondition1() instanceof TrueElement && formula.getCondition2() instanceof TrueElement);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_TRUEELEMENT + "trueElementNotCondition.patternstructure");
        notCondition = (NotCondition) pattern.getCondition();
        assertTrue("condition of notCondition must be instance of trueElement", notCondition.getCondition() instanceof TrueElement);
        
        pattern = loader.load(TEST_DIRECTORY_PATTERNSTRUCTURE_TRUEELEMENT + "trueElementQuantifiedCondition.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of quantifiedCondition must be instance of trueElement", quantifiedCondition.getCondition() instanceof TrueElement);
	}
	
	//AbstractPatternTests
	@Test
	public void testBehavior() {
		//behavior
		pattern = loader.load(testDirectoryBehavior + "openView.patternstructure");
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
		pattern = loader.load(testDirectoryToolsDelete + "deleteButton.patternstructure");
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
      	
      	pattern = loader.load(testDirectoryToolsDelete + "deleteContextmenu.patternstructure");
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
		pattern = loader.load(testDirectoryToolsFinalization + "finalization.patternstructure");
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
      	pattern = loader.load(testDirectoryToolsRelationToXmlRelation + "relationToXmlNavigation.patternstructure");
      	graph = pattern.getGraph();
      	relations = graph.getRelations();
      	xmlNavigation = (XmlNavigation) relations.get(0);
      	Element source = xmlNavigation.getSource();
      	Element target = xmlNavigation.getTarget();
        assertTrue("contextgraph must contain one xmlNavigation and its attribute source must be xmlElement 1 and attribute target must be xmlElement 8", source.getName().equals("XmlElement 1") && target.getName().equals("XmlElement 8"));
        
        pattern = loader.load(testDirectoryToolsRelationToXmlRelation + "relationToXmlReference.patternstructure");
      	Graph graph = pattern.getGraph();
      	EList<Relation> relations = graph.getRelations();
      	XmlReference xmlReference = (XmlReference) relations.get(0);
      	source = xmlReference.getSource();
      	target = xmlReference.getTarget();
        assertTrue("contextgraph must contain one xmlReference and its attribute source must be xmlElement 1 and attribute target must be xmlElement 8", source.getName().equals("XmlElement 1") && target.getName().equals("XmlElement 8"));
        
        pattern = loader.load(testDirectoryToolsRelationToXmlRelation + "relationUnchanged.patternstructure");
      	graph = pattern.getGraph();
      	relations = graph.getRelations();
      	relation = (Relation) relations.get(0);
      	source = relation.getSource();
      	target = relation.getTarget();
        assertTrue("contextgraph must contain one relation and its attribute source must be xmlElement 1 and attribute target must be xmlElement 8", source.getName().equals("XmlElement 1") && target.getName().equals("XmlElement 8"));

        pattern = loader.load(testDirectoryToolsRelationToXmlRelation + "xmlNavigationToXmlReference.patternstructure");
      	graph = pattern.getGraph();
      	relations = graph.getRelations();
      	xmlReference = (XmlReference) relations.get(0);
      	source = xmlReference.getSource();
      	target = xmlReference.getTarget();
        assertTrue("contextgraph must contain one xmlReference and its attribute source must be xmlElement 1 and attribute target must be xmlElement 8", source.getName().equals("XmlElement 1") && target.getName().equals("XmlElement 8"));

        pattern = loader.load(testDirectoryToolsRelationToXmlRelation + "xmlNavigationUnchanged.patternstructure");
      	graph = pattern.getGraph();
      	relations = graph.getRelations();
      	xmlNavigation = (XmlNavigation) relations.get(0);
      	source = xmlNavigation.getSource();
      	target = xmlNavigation.getTarget();
        assertTrue("contextgraph must contain one xmlNavigation and its attribute source must be xmlElement 1 and attribute target must be xmlElement 8", source.getName().equals("XmlElement 1") && target.getName().equals("XmlElement 8"));

        pattern = loader.load(testDirectoryToolsRelationToXmlRelation + "xmlReferenceToXmlNavigation.patternstructure");
      	graph = pattern.getGraph();
      	relations = graph.getRelations();
      	xmlNavigation = (XmlNavigation) relations.get(0);
      	source = xmlNavigation.getSource();
      	target = xmlNavigation.getTarget();
        assertTrue("contextgraph must contain one xmlNavigation and its attribute source must be xmlElement 1 and attribute target must be xmlElement 8", source.getName().equals("XmlElement 1") && target.getName().equals("XmlElement 8"));

        pattern = loader.load(testDirectoryToolsRelationToXmlRelation + "xmlReferenceUnchanged.patternstructure");
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
      	pattern = loader.load(testDirectoryFormularviewToolsBoolean + "booleanFalseToTrue.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof BooleanParam) {
      			booleanParam = (BooleanParam) p;
      		}
      	}
        assertTrue("value of booleanParam must be true", booleanParam.getValue());
        
        pattern = loader.load(testDirectoryFormularviewToolsBoolean + "booleanTrueToFalse.patternstructure");
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
      	pattern = loader.load(testDirectoryFormularviewToolsComparisonOption + "comparisonOptionEqual.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof ComparisonOptionParam) {
      			comparisonOption = (ComparisonOptionParam) p;
      		}
      	}
        assertTrue("value of comparisonOptionParam must be equal", comparisonOption.getValue() == ComparisonOperator.EQUAL);
        
        pattern = loader.load(testDirectoryFormularviewToolsComparisonOption + "comparisonOptionGreater.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof ComparisonOptionParam) {
      			comparisonOption = (ComparisonOptionParam) p;
      		}
      	}
        assertTrue("value of comparisonOptionParam must be greater", comparisonOption.getValue() == ComparisonOperator.GREATER);
        
        pattern = loader.load(testDirectoryFormularviewToolsComparisonOption + "comparisonOptionGreaterOrEqual.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof ComparisonOptionParam) {
      			comparisonOption = (ComparisonOptionParam) p;
      		}
      	}
        assertTrue("value of comparisonOptionParam must be equal", comparisonOption.getValue() == ComparisonOperator.GREATEROREQUAL);
        
        pattern = loader.load(testDirectoryFormularviewToolsComparisonOption + "comparisonOptionLess.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof ComparisonOptionParam) {
      			comparisonOption = (ComparisonOptionParam) p;
      		}
      	}
        assertTrue("value of comparisonOptionParam must be equal", comparisonOption.getValue() == ComparisonOperator.LESS);
        
        pattern = loader.load(testDirectoryFormularviewToolsComparisonOption + "comparisonOptionLessOrEqual.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof ComparisonOptionParam) {
      			comparisonOption = (ComparisonOptionParam) p;
      		}
      	}
        assertTrue("value of comparisonOptionParam must be equal", comparisonOption.getValue() == ComparisonOperator.LESSOREQUAL);
        
        pattern = loader.load(testDirectoryFormularviewToolsComparisonOption + "comparisonOptionNotEqual.patternstructure");
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
		pattern = loader.load(testDirectoryFormularviewToolsDate + "dateSetValue.patternstructure");
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
		pattern = loader.load(testDirectoryFormularviewToolsDateTime + "dateTimeSetValue.patternstructure");
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
		pattern = loader.load(testDirectoryFormularviewToolsNumber + "numberSetValue.patternstructure");
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
		pattern = loader.load(testDirectoryFormularviewToolsPropertyOption + "propertyOptionAttribute.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof PropertyOptionParam) {
      			propertyOption = (PropertyOptionParam) p;
      		}
      	}
        assertTrue("value of propertyOptionParam must be 1.0", propertyOption.getValue() == PropertyKind.ATTRIBUTE);
        
        pattern = loader.load(testDirectoryFormularviewToolsPropertyOption + "propertyOptionData.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof PropertyOptionParam) {
      			propertyOption = (PropertyOptionParam) p;
      		}
      	}
        assertTrue("value of propertyOptionParam must be 1.0", propertyOption.getValue() == PropertyKind.DATA);
        
        pattern = loader.load(testDirectoryFormularviewToolsPropertyOption + "propertyOptionTag.patternstructure");
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
		pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionAncestor.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.ANCESTOR);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionAncestorOrSelf.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.ANCESTOR_OR_SELF);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionChild.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.CHILD);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionDescendant.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.DESCENDANT);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionDescendantOrSelf.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.DESCENDANT_OR_SELF);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionEightchild.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.EIGHTCHILD);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionFivechild.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.FIVECHILD);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionFollowing.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.FOLLOWING);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionFollowingSibling.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.FOLLOWING_SIBLING);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionFourchild.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.FOURCHILD);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionNinechild.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.NINECHILD);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionParent.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.PARENT);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionPreceding.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.PRECEDING);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionPrecedingSibling.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.PRECEDING_SIBLING);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionSelf.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.SELF);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionSevenchild.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.SEVENCHILD);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionSixchild.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.SIXCHILD);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionThreechild.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof RelationOptionParam && p.getInternalId() == 1) {
      			relationOption = (RelationOptionParam) p;
      		}
      	}
        assertTrue("value of relationOptionParam must be ancestor", relationOption.getValue() == RelationKind.THREECHILD);
        
        pattern = loader.load(testDirectoryFormularviewToolsRelationOption + "relationOptionTwochild.patternstructure");
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
		pattern = loader.load(testDirectoryFormularviewToolsTextList + "textListAdd.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextListParam) {
      			textListParam = (TextListParam) p;
      		}
      	}
        assertTrue("value of textListParam must be hinzugefügt mit add", textListParam.getValues().get(0).equals("hinzugefügt mit add"));
        
        pattern = loader.load(testDirectoryFormularviewToolsTextList + "textListDelete.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextListParam) {
      			textListParam = (TextListParam) p;
      		}
      	}
        assertTrue("value of textListParam must be empty", textListParam.getValues().isEmpty());
        
        pattern = loader.load(testDirectoryFormularviewToolsTextList + "textListSave.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextListParam) {
      			textListParam = (TextListParam) p;
      		}
      	}
        assertTrue("value of textListParam must be gespeichert mit save", textListParam.getValues().get(0).equals("gespeichert mit save"));
        
        pattern = loader.load(testDirectoryFormularviewToolsTextList + "textListCancel.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextListParam) {
      			textListParam = (TextListParam) p;
      		}
      	}
      	assertTrue("value of textListParam must be empty", textListParam.getValues().isEmpty());
      	
      	pattern = loader.load(testDirectoryFormularviewToolsTextList + "textListOk.patternstructure");
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
		pattern = loader.load(testDirectoryFormularviewToolsTextLiteral + "textLiteralSetValue.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextLiteralParam && p.getInternalId() == 3) {
      			textLiteralParam = (TextLiteralParam) p;
      		}
      	}
        assertTrue("value of textLiteralParam must be Test", textLiteralParam.getValue().equals("Test"));
        
        pattern = loader.load(testDirectoryFormularviewToolsTextLiteral + "textLiteralSetValueSuggestion.patternstructure");
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
		pattern = loader.load(testDirectoryFormularviewToolsTime + "timeSetValue.patternstructure");
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
		pattern = loader.load(testDirectoryFormularviewToolsTypeOption + "typeOptionBoolean.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TypeOptionParam) {
      			typeOption = (TypeOptionParam) p;
      		}
      	}
      	//System.out.println(typeOption);
        assertTrue("value of typeOptionParam must be boolean", typeOption.getValue() == ReturnType.BOOLEAN);
        
        pattern = loader.load(testDirectoryFormularviewToolsTypeOption + "typeOptionDate.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TypeOptionParam) {
      			typeOption = (TypeOptionParam) p;
      		}
      	}
        assertTrue("value of typeOptionParam must be date", typeOption.getValue() == ReturnType.DATE);
        
        pattern = loader.load(testDirectoryFormularviewToolsTypeOption + "typeOptionDateTime.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TypeOptionParam) {
      			typeOption = (TypeOptionParam) p;
      		}
      	}
        assertTrue("value of typeOptionParam must be dateTime", typeOption.getValue() == ReturnType.DATETIME);
        
        pattern = loader.load(testDirectoryFormularviewToolsTypeOption + "typeOptionElement.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TypeOptionParam) {
      			typeOption = (TypeOptionParam) p;
      		}
      	}
        assertTrue("value of typeOptionParam must be element", typeOption.getValue() == ReturnType.ELEMENT);
        
        pattern = loader.load(testDirectoryFormularviewToolsTypeOption + "typeOptionNumber.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TypeOptionParam) {
      			typeOption = (TypeOptionParam) p;
      		}
      	}
        assertTrue("value of typeOptionParam must be number", typeOption.getValue() == ReturnType.NUMBER);
        
        pattern = loader.load(testDirectoryFormularviewToolsTypeOption + "typeOptionString.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TypeOptionParam) {
      			typeOption = (TypeOptionParam) p;
      		}
      	}
        assertTrue("value of typeOptionParam must be string", typeOption.getValue() == ReturnType.STRING);
        
        pattern = loader.load(testDirectoryFormularviewToolsTypeOption + "typeOptionTime.patternstructure");
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
		
		pattern = loader.load(testDirectoryFormularviewToolsUntypedParameterValue + "untypedParameterValueToBoolean.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof BooleanParam) {
      			booleanParam = (BooleanParam) p;
      		}
      	}
        assertTrue("parameterList must contain one booleanParam", booleanParam != null);
        
        pattern = loader.load(testDirectoryFormularviewToolsUntypedParameterValue + "untypedParameterValueToDate.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof DateParam) {
      			dateParam = (DateParam) p;
      		}
      	}
        assertTrue("parameterList must contain one dateParam", dateParam != null);
        
        pattern = loader.load(testDirectoryFormularviewToolsUntypedParameterValue + "untypedParameterValueToDateTime.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof DateTimeParam) {
      			dateTimeParam = (DateTimeParam) p;
      		}
      	}
        assertTrue("parameterList must contain one dateTimeParam", dateTimeParam != null);
        
        pattern = loader.load(testDirectoryFormularviewToolsUntypedParameterValue + "untypedParameterValueToNumber.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof NumberParam) {
      			numberParam = (NumberParam) p;
      		}
      	}
        assertTrue("parameterList must contain one numberParam", numberParam != null);
        
        pattern = loader.load(testDirectoryFormularviewToolsUntypedParameterValue + "untypedParameterValueToTextList.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextListParam) {
      			textListParam = (TextListParam) p;
      		}
      	}
        assertTrue("parameterList must contain one textListParam", textListParam != null);
        
        pattern = loader.load(testDirectoryFormularviewToolsUntypedParameterValue + "untypedParameterValueToTextLiteral.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TextLiteralParam) {
      			textLiteralParam = (TextLiteralParam) p;
      		}
      	}
        assertTrue("parameterList must contain one textLiteralParam", textLiteralParam != null);
        
        pattern = loader.load(testDirectoryFormularviewToolsUntypedParameterValue + "untypedParameterValueToTime.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof TimeParam) {
      			timeParam = (TimeParam) p;
      		}
      	}
        assertTrue("parameterList must contain one timeParam", timeParam != null);
        
        pattern = loader.load(testDirectoryFormularviewToolsUntypedParameterValue + "timeToBoolean.patternstructure");
      	parameters = pattern.getParameterList().getParameters();
      	for(Parameter p:parameters) {
      		if(p instanceof BooleanParam) {
      			booleanParam = (BooleanParam) p;
      		}
      	}
        assertTrue("parameterList must contain one booleanParam", booleanParam != null);
	}
}

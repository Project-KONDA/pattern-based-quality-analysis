package patterncreation.project.design;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.DateTimeParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TimeParam;
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
import qualitypatternmodel.testutilityclasses.EMFModelLoad;

public class Tests {
	EMFModelLoad loader = new EMFModelLoad();
	String testDirectory = "Tests/GenericPatternTests/";
	String testDirectoryGraphstructureChangeNameElement = testDirectory + "graphstructure/tools/changeNameElement/";
	String testDirectoryGraphstructureChangeNameProperty = testDirectory + "graphstructure/tools/changeNameProperty/";
	String testDirectoryGraphstructureChangeNameRelation = testDirectory + "graphstructure/tools/changeNameRelation/";
	String testDirectoryGraphstructureDeleteGraph = testDirectory + "graphstructure/tools/deleteGraph/";
	String testDirectoryGraphstructureElement = testDirectory + "graphstructure/tools/element/";
	String testDirectoryGraphstructureMarkAsReturnElement = testDirectory + "graphstructure/tools/markAsReturnElement/";
	String testDirectoryGraphstructureProperty = testDirectory + "graphstructure/tools/property/";
	String testDirectoryGraphstructureRelation = testDirectory + "graphstructure/tools/relation/";
	String testDirectoryOperatorsComparison = testDirectory + "operators/tools/comparison/";
	String testDirectoryOperatorsDiscardArgument = testDirectory + "operators/tools/discardArgument/";
	String testDirectoryOperatorsMatch = testDirectory + "operators/tools/match/";
	String testDirectoryOperatorsSelectElementAsArgument = testDirectory + "operators/tools/selectElementAsArgument/";
	String testDirectoryOperatorsSelectParameterAsArgument = testDirectory + "operators/tools/selectParameterAsArgument/";
	String testDirectoryOperatorsSelectPropertyAsArgument = testDirectory + "operators/tools/selectPropertyAsArgument/";
	String testDirectoryParametersBoolean = testDirectory + "parameters/tools/boolean/";
	String testDirectoryParametersDate = testDirectory + "parameters/tools/date/";
	String testDirectoryParametersDateAndTime = testDirectory + "parameters/tools/dateAndTime/";
	String testDirectoryParametersNumber = testDirectory + "parameters/tools/number/";
	String testDirectoryParametersTextList = testDirectory + "parameters/tools/textList/";
	String testDirectoryParametersTextLiteral = testDirectory + "parameters/tools/textLiteral/";
	String testDirectoryParametersTime = testDirectory + "parameters/tools/time/";
	String testDirectoryParametersUntypedValue = testDirectory + "parameters/tools/untypedValue/";
	String testDirectoryPatternstructureChangeNameCompletePattern = testDirectory + "patternstructure/tools/changeNameCompletePattern/";
	String testDirectoryPatternstructureChangeOperator = testDirectory + "patternstructure/tools/changeOperator/";
	String testDirectoryPatternstructureChangeQuantifier = testDirectory + "patternstructure/tools/changeQuantifier/";
	String testDirectoryPatternstructureCoutnCondition = testDirectory + "patternstructure/tools/countCondition/";
	String testDirectoryPatternstructureCountPattern = testDirectory + "patternstructure/tools/countPattern/";
	String testDirectoryPatternstructureFormula = testDirectory + "patternstructure/tools/formula/";
	String testDirectoryPatternstructureNotCondition = testDirectory + "patternstructure/tools/notCondition/";
	String testDirectoryPatternstructureNumberElement = testDirectory + "patternstructure/tools/numberElement/";
	String testDirectoryPatternstructureQuantifiedCondition = testDirectory + "patternstructure/tools/quantifiedCondition/";
	String testDirectoryPatternstructureTrueElement = testDirectory + "patternstructure/tools/trueElement/";
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
	
	public static void main(String[] args) {
		EMFModelLoad loader = new EMFModelLoad();
		//System.out.println(System.getProperty("user.dir"));
		//quantifiedConditionCompletePattern.patternstructure
		CompletePattern pattern = loader.load("Tests/GenericPatternTests/patternstructure/tools/quantifiedCondition/quantifiedConditionCompletePattern.patternstructure");
		System.out.println(pattern);
		//test();
	}
		//konstanten methoden kommentare tag view


	@Test
	public void testGraphstructureChangeNameElement() {
		//graphstructure/tools/changeNameElement
		pattern = loader.load(testDirectoryGraphstructureChangeNameElement + "changeNameElement.patternstructure");
		graph = pattern.getGraph();
		assertTrue("attribute name of element must contain the String \"ElementNewName\"", graph.getElements().get(0).getName().equals("ElementNewName"));
	}
	
	@Test
	public void testGraphstructureChangeNameProperty() {
		//graphstructure/tools/changeNameElement
		pattern = loader.load(testDirectoryGraphstructureChangeNameProperty + "changeNameProperty.patternstructure");
		graph = pattern.getGraph();
		assertTrue("attribute name of property must contain the String \"PropertyNewName\"", graph.getElements().get(0).getProperties().get(0).getName().equals("PropertyNewName"));
	}
	
	@Test
	public void testGraphstructureChangeNameRelation() {
		//graphstructure/tools/changeNameRelation
		pattern = loader.load(testDirectoryGraphstructureChangeNameRelation + "changeNameRelation.patternstructure");
		graph = pattern.getGraph();
		assertTrue("attribute name of relation must contain the String \"RelationNewName\"", graph.getRelations().get(0).getName().equals("RelationNewName"));
	}
	
	@Test
	public void testGraphstructureDeleteGraph() {
		//graphstructure/tools/changeNameRelation
		pattern = loader.load(testDirectoryGraphstructureDeleteGraph + "deleteGraph.patternstructure");
		graph = pattern.getGraph();
		assertTrue("graph of pattern must not be null", graph != null);
	}
	
	//tested, if there is one new element in the graph after using the tool element
	@Test
	public void testGraphstructureElement() {
		//graphstructure/tools/element
		pattern = loader.load(testDirectoryGraphstructureElement + "elementGraph.patternstructure");
		graph = pattern.getGraph();
		assertTrue("graph must contain two elements", graph.getElements().size() == 2);
	}
	
	//tested, if the attribut ResultOf is set correctly by the tools markAsReturnElement and markAsNoReturnElement
	@Test
	public void testGraphstructureMarkAsReturnElement() {
		//graphstructure/tools/markAsReturnElement
		pattern = loader.load(testDirectoryGraphstructureMarkAsReturnElement + "markAsReturnElement.patternstructure");
		graph = pattern.getGraph();
		assertTrue("graph must contain one returnelement", graph.getReturnElements().size() == 1);
		
		pattern = loader.load(testDirectoryGraphstructureMarkAsReturnElement + "markAsNoReturnElement.patternstructure");
		graph = pattern.getGraph();
		assertTrue("graph must contain zero returnelement", graph.getReturnElements().size() == 0);
	}
	
	//tested, if there is one new property in the element after using the tool property
	@Test
	public void testGraphstructureProperty() {
		//graphstructure/tools/property
		pattern = loader.load(testDirectoryGraphstructureProperty + "propertyElement.patternstructure");
		graph = pattern.getGraph();
		assertTrue("element must contain one property", graph.getElements().get(0).getProperties().size() == 1);
	}
	
	//tested, if there is one new relation in the graph after using the tool relation and if the attributes source and target are set correct
	@Test
	public void testGraphstructureRelation() {
		//graphstructure/tools/relation
		pattern = loader.load(testDirectoryGraphstructureRelation + "relationGraph.patternstructure");
		graph = pattern.getGraph();
		relation = graph.getRelations().get(0);
		assertTrue("graph must contain one relation, the attribute source must be element1, the attribute target must be element2", graph.getRelations().size() == 1 && relation.getSource().getName().equals("Element 1") && relation.getTarget().getName().equals("Element 2"));
	}
	
	@Test
	public void testOperatorsComparison() {
		//operators/tools/comparison
		pattern = loader.load(testDirectoryOperatorsComparison + "comparisonGraph.patternstructure");
		graph = pattern.getGraph();
		assertTrue("operatorlist of graph must contain one comparison", graph.getOperatorList().getOperators().get(0) instanceof Comparison);
	}
	
	@Test
	public void testOperatorsDiscardArgument() {
		//operators/tools/discardArgument
		pattern = loader.load(testDirectoryOperatorsDiscardArgument + "discardArgument1Comparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("comparison must have an empty argument1", comparison.getArgument1() == null);
		
		pattern = loader.load(testDirectoryOperatorsDiscardArgument + "discardArgument2Comparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("comparison must have an empty argument2", comparison.getArgument2() == null);
		
		pattern = loader.load(testDirectoryOperatorsDiscardArgument + "discardArgument2Match.patternstructure");
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("match must have an empty property", match.getProperty() == null);
		
		pattern = loader.load(testDirectoryOperatorsDiscardArgument + "discardArgumentComparison1.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("comparison must have an empty argument1", comparison.getArgument1() == null);
		
		pattern = loader.load(testDirectoryOperatorsDiscardArgument + "discardArgumentComparison2.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("comparison must have an empty argument2", comparison.getArgument2() == null);
		
		pattern = loader.load(testDirectoryOperatorsDiscardArgument + "discardArgumentMatch.patternstructure");
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("match must have an empty property", match.getProperty() == null);
	}
	
	@Test
	public void testOperatorsMatch() {
		//operators/tools/match
		pattern = loader.load(testDirectoryOperatorsMatch + "matchGraph.patternstructure");
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("operatorlist of graph must contain one match", match instanceof Match);
	}
	
	@Test
	public void testOperatorsSelectElementAsArgument() {
		//operators/tools/selectElementAsArgument
		pattern = loader.load(testDirectoryOperatorsSelectElementAsArgument + "selectElementComparison1.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument1 of comparison must contain Element 1", ((Element) comparison.getArgument1()).getName().equals("Element 1"));
		
		pattern = loader.load(testDirectoryOperatorsSelectElementAsArgument + "selectElementComparison2.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument1 of comparison must contain Element 3", ((Element) comparison.getArgument2()).getName().equals("Element 3"));
	}
	
	@Test
	public void testOperatorsSelectParameterAsArgument() {
		//operators/tools/selectParameterAsArgument
		pattern = loader.load(testDirectoryOperatorsSelectParameterAsArgument + "selectParameterComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(1);
		assertTrue("argument2 of comparison must contain Number 4", comparison.getInternalId() == 2 && comparison.getArgument2() instanceof NumberParam);
	}
	
	@Test
	public void testOperatorsSelectPropertyAsArgument() {
		//operators/tools/selectPropertyAsArgument
		pattern = loader.load(testDirectoryOperatorsSelectPropertyAsArgument + "selectPropertyComparison1.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument1 of comparison must contain one property", comparison.getArgument1() instanceof Property);
		
		pattern = loader.load(testDirectoryOperatorsSelectPropertyAsArgument + "selectPropertyComparison2.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one property", comparison.getArgument2() instanceof Property);
		
		pattern = loader.load(testDirectoryOperatorsSelectPropertyAsArgument + "selectPropertyMatch.patternstructure");
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of match must contain one property", match.getProperty() instanceof Property);
	}
	
	@Test
	public void testParametersBoolean() {
		//parameters/tools/boolean
		pattern = loader.load(testDirectoryParametersBoolean + "BooleanComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one BooleanParam", comparison.getArgument2() instanceof BooleanParam);
	}
	
	@Test
	public void testParametersDate() {
		//parameters/tools/date
		pattern = loader.load(testDirectoryParametersDate + "DateComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one DateParam", comparison.getArgument2() instanceof DateParam);
	}
	
	@Test
	public void testParametersDateAndTime() {
		//parameters/tools/dateAndTime
		pattern = loader.load(testDirectoryParametersDateAndTime + "DateTimeComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one DateTimeParam", comparison.getArgument2() instanceof DateTimeParam);
	}
	
	@Test
	public void testParametersNumber() {
		//parameters/tools/number
		pattern = loader.load(testDirectoryParametersNumber + "NumberComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one NumberParam", comparison.getArgument2() instanceof NumberParam);
	}
	
	@Test
	public void testParametersTextList() {
		//parameters/tools/textList
		pattern = loader.load(testDirectoryParametersTextList + "TextListComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one TextListParam", comparison.getArgument2() instanceof TextListParam);
	}
	
	@Test
	public void testParametersTextLiteral() {
		//parameters/tools/textLiteral
		pattern = loader.load(testDirectoryParametersTextLiteral + "TextLiteralComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one TextLiteralParam", comparison.getArgument2() instanceof TextLiteralParam);
	}
	
	@Test
	public void testParametersTime() {
		//parameters/tools/time
		pattern = loader.load(testDirectoryParametersTime + "TimeComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one TimeParam", comparison.getArgument2() instanceof TimeParam);
	}
	
	@Test
	public void testParametersUntypedValue() {
		//parameters/tools/untypedValue
		pattern = loader.load(testDirectoryParametersUntypedValue + "UntypedValueComparison.patternstructure");
		comparison = (Comparison) pattern.getGraph().getOperatorList().getOperators().get(0);
		assertTrue("argument2 of comparison must contain one UntypedParameterValue", comparison.getArgument2() instanceof UntypedParameterValue);
	}
	
	@Test
	public void testChangeNameCompletePattern() {
		//patternstructure/tools/changeNameCompletePattern
		pattern = loader.load(testDirectoryPatternstructureChangeNameCompletePattern + "changeNameCompletePattern.patternstructure");
		assertTrue("attribute of completePattern must be equal to \"Muster\"", pattern.getName().equals("Muster"));
	}
	
	@Test
	public void testPatternstructureChangeOperator() {
		//patternstructure/tools/changeOperator
		pattern = loader.load(testDirectoryPatternstructureChangeOperator + "andToEqual.patternstructure");
		formula = (Formula) pattern.getCondition();
        assertTrue("operator of formula must be equal", formula.getOperator() == LogicalOperator.EQUAL);
        
        pattern = loader.load(testDirectoryPatternstructureChangeOperator + "andToImplies.patternstructure");
		formula = (Formula) pattern.getCondition();
        assertTrue("operator of formula must be implies", formula.getOperator() == LogicalOperator.IMPLIES);
        
        pattern = loader.load(testDirectoryPatternstructureChangeOperator + "andToOr.patternstructure");
		formula = (Formula) pattern.getCondition();
        assertTrue("operator of formula must be or", formula.getOperator() == LogicalOperator.OR);
        
        pattern = loader.load(testDirectoryPatternstructureChangeOperator + "andToXor.patternstructure");
		formula = (Formula) pattern.getCondition();
        assertTrue("operator of formula must be xor", formula.getOperator() == LogicalOperator.XOR);
        
        pattern = loader.load(testDirectoryPatternstructureChangeOperator + "orToAnd.patternstructure");
		formula = (Formula) pattern.getCondition();
        assertTrue("operator of formula must be and", formula.getOperator() == LogicalOperator.AND);
	}
	
	@Test
	public void testPatternstructureChangeQuantifier() {
		//patternstructure/tools/changeQuantifier
        pattern = loader.load(testDirectoryPatternstructureChangeQuantifier + "existsToForall.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("quantifier of quantifiedCondition must be forall", quantifiedCondition.getQuantifier() == Quantifier.FORALL);
        
        pattern = loader.load(testDirectoryPatternstructureChangeQuantifier + "forallToExists.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("quantifier of quantifiedCondition must be exists", quantifiedCondition.getQuantifier() == Quantifier.EXISTS);
	}
	
	@Test
	public void testPatternstructureCountCondition() {
		//patternstructure/tools/countCondition
        pattern = loader.load(testDirectoryPatternstructureCoutnCondition + "countConditionCompletePattern.patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of countCondition", countCondition instanceof CountCondition);
        
        pattern = loader.load(testDirectoryPatternstructureCoutnCondition + "countConditionCountPattern.patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        countPattern = (CountPattern) countCondition.getCountPattern();
        assertTrue("condition of CountPattern must be instance of countCondition", countPattern.getCondition() instanceof CountCondition);
        
        pattern = loader.load(testDirectoryPatternstructureCoutnCondition + "countConditionFormula.patternstructure");
        formula = (Formula) pattern.getCondition();
        assertTrue("conditions of formula must be instance of countCondition", formula.getCondition1() instanceof CountCondition && formula.getCondition2() instanceof CountCondition);
        
        pattern = loader.load(testDirectoryPatternstructureCoutnCondition + "countConditionNotCondition.patternstructure");
        notCondition = (NotCondition) pattern.getCondition();
        assertTrue("condition of notCondition must be instance of countCondition", notCondition.getCondition() instanceof CountCondition);
        
        pattern = loader.load(testDirectoryPatternstructureCoutnCondition + "countConditionQuantifiedCondition.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of quantifiedCondition must be instance of countCondition", quantifiedCondition.getCondition() instanceof CountCondition);
	}
	
	@Test
	public void testPatternstructureCountPattern() {
		//patternstructure/tools/countPattern
        pattern = loader.load(testDirectoryPatternstructureCountPattern + "countPatternCountCondition.patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        countPattern = (CountPattern) countCondition.getArgument2();
        assertTrue("argument2 of countCondition must be instance of countPattern", countPattern instanceof CountPattern);
	}
	
	@Test
	public void testPatternstructureFormula() {
		//patternstructure/tools/formula
      	pattern = loader.load(testDirectoryPatternstructureFormula + "formulaAnd.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be and", formula.getOperator() == LogicalOperator.AND);
        
        pattern = loader.load(testDirectoryPatternstructureFormula + "formulaAndDialog.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be and", formula.getOperator() == LogicalOperator.AND);
        
        pattern = loader.load(testDirectoryPatternstructureFormula + "formulaCompletePattern.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula", formula instanceof Formula);
        
        pattern = loader.load(testDirectoryPatternstructureFormula + "formulaCountPattern.patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
      	countPattern = countCondition.getCountPattern();
        assertTrue("condition of countPattern must be instance of formula", countPattern.getCondition() instanceof Formula);
        
        pattern = loader.load(testDirectoryPatternstructureFormula + "formulaEqual.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be equal", formula.getOperator() == LogicalOperator.EQUAL);
        
        pattern = loader.load(testDirectoryPatternstructureFormula + "formulaEqualDialog.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be equal", formula.getOperator() == LogicalOperator.EQUAL);
        
        pattern = loader.load(testDirectoryPatternstructureFormula + "formulaFormula.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("conditions of formula must be instance of formula", formula.getCondition1() instanceof Formula && formula.getCondition1() instanceof Formula);
        
        pattern = loader.load(testDirectoryPatternstructureFormula + "formulaImplies.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be implies", formula.getOperator() == LogicalOperator.IMPLIES);
        
        pattern = loader.load(testDirectoryPatternstructureFormula + "formulaImpliesDialog.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be implies", formula.getOperator() == LogicalOperator.IMPLIES);
        
        pattern = loader.load(testDirectoryPatternstructureFormula + "formulaNotCondition.patternstructure");
      	notCondition = (NotCondition) pattern.getCondition();
        assertTrue("conditions of notcondition must be instance of formula", notCondition.getCondition() instanceof Formula);
        
        pattern = loader.load(testDirectoryPatternstructureFormula + "formulaOr.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be or", formula.getOperator() == LogicalOperator.OR);
        
        pattern = loader.load(testDirectoryPatternstructureFormula + "formulaOrDialog.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be or", formula.getOperator() == LogicalOperator.OR);
        
        pattern = loader.load(testDirectoryPatternstructureFormula + "formulaQuantifiedCondition.patternstructure");
      	quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("conditions of quantifiedCondition must be instance of formula", quantifiedCondition.getCondition() instanceof Formula);
        
        pattern = loader.load(testDirectoryPatternstructureFormula + "formulaXor.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be xor", formula.getOperator() == LogicalOperator.XOR);
        
        pattern = loader.load(testDirectoryPatternstructureFormula + "formulaXorDialog.patternstructure");
      	formula = (Formula) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of formula and its operator must be xor", formula.getOperator() == LogicalOperator.XOR);
	}
	
	@Test
	public void testPatternstructureNotCondition() {
		//patternstructure/tools/notCondition
      	pattern = loader.load(testDirectoryPatternstructureNotCondition + "notConditionCompletePattern.patternstructure");
        assertTrue("condition of CompletePattern must be instance of notCondition", pattern.getCondition() instanceof NotCondition);
        
        pattern = loader.load(testDirectoryPatternstructureNotCondition + "notConditionCountPattern.patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        countPattern = countCondition.getCountPattern();
        assertTrue("condition of countPattern must be instance of notCondition", countPattern.getCondition() instanceof NotCondition);
        
        pattern = loader.load(testDirectoryPatternstructureNotCondition + "notConditionFormula.patternstructure");
        formula = (Formula) pattern.getCondition();
        assertTrue("conditions of formula must be instance of notCondition", formula.getCondition1() instanceof NotCondition && formula.getCondition2() instanceof NotCondition);
        
        pattern = loader.load(testDirectoryPatternstructureNotCondition + "notConditionNotCondition.patternstructure");
        notCondition = (NotCondition) pattern.getCondition();
        assertTrue("condition of notCondition must be instance of notCondition", notCondition.getCondition() instanceof NotCondition);
        
        pattern = loader.load(testDirectoryPatternstructureNotCondition + "notConditionQuantifiedCondition.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of quantifiedCondition must be instance of notCondition", quantifiedCondition.getCondition() instanceof NotCondition);
	}
	
	@Test
	public void testPatternstructureNumberElement() {
		//patternstructure/tools/numberElement
      	pattern = loader.load(testDirectoryPatternstructureNumberElement + "numberElementCountCondition.patternstructure");
      	countCondition = (CountCondition) pattern.getCondition();
        assertTrue("condition of countCondition must be instance of numberElement", countCondition.getArgument2() instanceof NumberElement);
	}
	
	@Test
	public void testPatternstructureQuantifiedCondition() {
		//patternstructure/tools/quantifiedCondition
		pattern = loader.load(testDirectoryPatternstructureQuantifiedCondition + "quantifiedConditionCompletePattern.patternstructure");
        assertTrue("condition of CompletePattern must be instance of quantifiedCondition", pattern.getCondition() instanceof QuantifiedCondition);

        pattern = loader.load(testDirectoryPatternstructureQuantifiedCondition + "quantifiedConditionCountPattern.patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        countPattern = (CountPattern) countCondition.getArgument2();
        assertTrue("condition of CountPattern must be instance of quantifiedCondition", countPattern.getCondition() instanceof QuantifiedCondition);
        
        pattern = loader.load(testDirectoryPatternstructureQuantifiedCondition + "quantifiedConditionExists.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of quantifiedCondition and its quantifier must be exists", quantifiedCondition.getQuantifier() == Quantifier.EXISTS);
        
        pattern = loader.load(testDirectoryPatternstructureQuantifiedCondition + "quantifiedConditionForall.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of quantifiedCondition and its quantifier must be forall", quantifiedCondition.getQuantifier() == Quantifier.FORALL);
        
        pattern = loader.load(testDirectoryPatternstructureQuantifiedCondition + "quantifiedConditionExistsDialog.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of quantifiedCondition and its quantifier must be exists", quantifiedCondition.getQuantifier() == Quantifier.EXISTS);
        
        pattern = loader.load(testDirectoryPatternstructureQuantifiedCondition + "quantifiedConditionForallDialog.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of CompletePattern must be instance of quantifiedCondition and its quantifier must be forall", quantifiedCondition.getQuantifier() == Quantifier.FORALL);
        
        pattern = loader.load(testDirectoryPatternstructureQuantifiedCondition + "quantifiedConditionFormula.patternstructure");
        formula = (Formula) pattern.getCondition();
        assertTrue("condition of formula must be instance of quantifiedCondition", formula.getCondition1() instanceof QuantifiedCondition && formula.getCondition2() instanceof QuantifiedCondition);
        
        pattern = loader.load(testDirectoryPatternstructureQuantifiedCondition + "quantifiedConditionNotCondition.patternstructure");
        notCondition = (NotCondition) pattern.getCondition();
        assertTrue("condition of notCondition must be instance of quantifiedCondition", notCondition.getCondition() instanceof QuantifiedCondition);
        
        pattern = loader.load(testDirectoryPatternstructureQuantifiedCondition + "quantifiedConditionQuantifiedCondition.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of quantifiedCondition must be instance of quantifiedCondition", quantifiedCondition.getCondition() instanceof QuantifiedCondition);
	}
	
	@Test
	public void testPatternstructureTrueElement() {
		//patternstructure/tools/trueElement
      	pattern = loader.load(testDirectoryPatternstructureTrueElement + "trueElementCompletePattern.patternstructure");
        assertTrue("condition of CompletePattern must be instance of trueElement", pattern.getCondition() instanceof TrueElement);
        
        pattern = loader.load(testDirectoryPatternstructureTrueElement + "trueElementCountPattern.patternstructure");
        countCondition = (CountCondition) pattern.getCondition();
        countPattern = countCondition.getCountPattern();
        assertTrue("condition of countPattern must be instance of trueElement", countPattern.getCondition() instanceof TrueElement);
        
        pattern = loader.load(testDirectoryPatternstructureTrueElement + "trueElementFormula.patternstructure");
        formula = (Formula) pattern.getCondition();
        assertTrue("conditions of formula must be instance of trueElement", formula.getCondition1() instanceof TrueElement && formula.getCondition2() instanceof TrueElement);
        
        pattern = loader.load(testDirectoryPatternstructureTrueElement + "trueElementNotCondition.patternstructure");
        notCondition = (NotCondition) pattern.getCondition();
        assertTrue("condition of notCondition must be instance of trueElement", notCondition.getCondition() instanceof TrueElement);
        
        pattern = loader.load(testDirectoryPatternstructureTrueElement + "trueElementQuantifiedCondition.patternstructure");
        quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
        assertTrue("condition of quantifiedCondition must be instance of trueElement", quantifiedCondition.getCondition() instanceof TrueElement);
	}
}

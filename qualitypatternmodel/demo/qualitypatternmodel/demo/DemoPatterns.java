package qualitypatternmodel.demo;

import java.io.IOException;
import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlNode;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.LocalXmlDataDatabase;
import qualitypatternmodel.execution.LocalXmlSchemaDatabase;
import qualitypatternmodel.execution.Result;
import qualitypatternmodel.execution.impl.DatabasesImpl;
import qualitypatternmodel.execution.impl.LocalXmlDataDatabaseImpl;
import qualitypatternmodel.execution.impl.LocalXmlSchemaDatabaseImpl;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.DateTimeParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TimeParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;
import qualitypatternmodel.utility.EMFModelSave;

import static qualitypatternmodel.testutility.DatabaseConstants.*;

public class DemoPatterns {

	
	private static CompletePattern compConcrete;
	private static CompletePattern compTextConcrete;
	private static CompletePattern compTextLidoConcrete;
	private static CompletePattern cardConcrete;
	private static CompletePattern cardConcreteFinalized;
	private static CompletePattern cardConcreteLido;
	private static CompletePattern funcConcrete;
	private static CompletePattern funcConcreteLido;

	private static LocalXmlDataDatabase database;
	private static LocalXmlSchemaDatabase schema;
	private static Databases databases;
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException, QueryException {
		
		database = new LocalXmlDataDatabaseImpl(DEMO_DATABASE_NAME, DEMO_DATA_PATH);        
        schema = new LocalXmlSchemaDatabaseImpl(DEMO_SCHEMA_NAME, DEMO_SCHEMA_PATH);
        schema.setNamespace(DEMO_NAMESPACE);   
        database.setXmlSchema(schema);             
        database.init();
        
        databases = DatabasesImpl.getInstance();
        databases.getXmlDatabases().add(database);
        databases.getXmlSchemata().add(schema);
        
        compConcrete = getConcreteCompPattern(database);
        compTextLidoConcrete = getConcreteLidoCompPattern(database);
        cardConcrete = getConcreteCardPattern(database);
        cardConcreteFinalized = getConcreteFinalizedCardPattern(database);
        cardConcreteLido = getConcreteLidoCardPattern(database);
        funcConcrete = getConcreteFuncPattern(database);
        funcConcreteLido = getConcreteLidoFuncPattern(database);
        
		exportAllDemoPatterns();
		printAllDemoPatternQueries();
		executeAllDemoPatterns();
		
	}
	
	private static void executeAllDemoPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, QueryException, IOException {
		
		System.out.println("\n\n\n>>> Executing demo patterns:");		
		
		Result compResult = database.execute(compConcrete, "COMP demo execution", "Joe Cool");
		printExecutionResult(compConcrete, compResult);		
		
		Result cardResult = database.execute(cardConcrete, "CARD demo execution", "Joe Cool");
		printExecutionResult(cardConcrete, cardResult);		
		
		Result funcResult = database.execute(funcConcrete, "FUNC demo execution", "Joe Cool");
		printExecutionResult(funcConcrete, funcResult);
				
	}
	
	private static void printExecutionResult(CompletePattern pattern, Result result) {
		System.out.println("\n\n*** Result of applying the pattern "+pattern.getName()+" to the demo database ***");
		System.out.println("\n| Runtime: " + result.getRuntime() + " milliseconds");
		System.out.println("| Number of problems found: " + result.getProblemNumber());
		
		int i = 1;
		for(String item : result.getSplitResult()) {
			System.out.println("\n--- Item " + i + " ---");
			System.out.println(item);
			i++;
		}
	}	

	private static void exportAllDemoPatterns()
			throws IOException, InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		EMFModelSave.exportToFile(databases,"instances/demo/databases", "execution");
		
		CompletePattern compDateAbstract = getAbstractCompDatePattern();
		EMFModelSave.exportToFile(compDateAbstract,"instances/demo/comparison_date_abstract", "patternstructure");
		
		CompletePattern compBoolAbstract = getAbstractCompBoolPattern();
		EMFModelSave.exportToFile(compBoolAbstract,"instances/demo/comparison_bool_abstract", "patternstructure");	
		
		CompletePattern compGeneric = getGenericCompPattern();
		EMFModelSave.exportToFile(compGeneric,"instances/demo/comparison_generic", "patternstructure");
		CompletePattern compAbstract = getAbstractCompPattern();
		EMFModelSave.exportToFile(compAbstract,"instances/demo/comparison_abstract", "patternstructure");
		CompletePattern compConcrete = getConcreteCompPattern(database);			
		EMFModelSave.exportToFile(compConcrete,"instances/demo/comparison_concrete", "patternstructure");
		
		CompletePattern compTextGeneric = getGenericCompTextPattern();
		EMFModelSave.exportToFile(compTextGeneric,"instances/demo/comparison_text_generic", "patternstructure");
		CompletePattern compTextAbstract = getAbstractCompTextPattern();
		EMFModelSave.exportToFile(compTextAbstract,"instances/demo/comparison_text_abstract", "patternstructure");
		CompletePattern compTextConcrete = getConcreteCompTextPattern(database);			
		EMFModelSave.exportToFile(compTextConcrete,"instances/demo/comparison_text_concrete", "patternstructure");
		
		CompletePattern compTextLidoConcrete = getConcreteLidoCompPattern(database);			
		EMFModelSave.exportToFile(compTextLidoConcrete,"instances/demo/comparison_lido_concrete", "patternstructure");
		
		CompletePattern cardGeneric = getGenericCardPattern();
		EMFModelSave.exportToFile(cardGeneric,"instances/demo/cardinality_generic", "patternstructure");
		CompletePattern cardAbstract = getAbstractCardPattern();
		EMFModelSave.exportToFile(cardAbstract,"instances/demo/cardinality_abstract", "patternstructure");
		CompletePattern cardConcrete = getConcreteCardPattern(database);				
		EMFModelSave.exportToFile(cardConcrete,"instances/demo/cardinality_concrete", "patternstructure");
		CompletePattern cardConcreteFinalized = getConcreteFinalizedCardPattern(database);				
		EMFModelSave.exportToFile(cardConcreteFinalized,"instances/demo/cardinality_concrete_finalized", "patternstructure");
		
		CompletePattern cardConcreteLido = getConcreteLidoCardPattern(database);				
		EMFModelSave.exportToFile(cardConcreteLido,"instances/demo/cardinality_lido_concrete", "patternstructure");
		
		CompletePattern funcGeneric = getGenericFuncPattern();
		EMFModelSave.exportToFile(funcGeneric,"instances/demo/functional_dependency_generic", "patternstructure");
		CompletePattern funcAbstract = getAbstractFuncPattern();
		EMFModelSave.exportToFile(funcAbstract,"instances/demo/functional_dependency_abstract", "patternstructure");
		CompletePattern funcConcrete = getConcreteFuncPattern(database);				
		EMFModelSave.exportToFile(funcConcrete,"instances/demo/functional_dependency_concrete", "patternstructure");
		
		CompletePattern funcLidoConcrete = getConcreteLidoFuncPattern(database);				
		EMFModelSave.exportToFile(funcLidoConcrete,"instances/demo/functional_dependency_lido_concrete", "patternstructure");
		
		System.out.println(">>> Exported demo patterns to folder 'instances/demo/'");
	}

	private static void printAllDemoPatternQueries()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		System.out.println("\n\n\n>>> Printing queries of demo patterns:");
		
		printPatternQuery(compConcrete);
		printPatternQuery(compTextLidoConcrete);
		
		printPatternQuery(cardConcrete);
		printPatternQuery(cardConcreteLido);

		
		printPatternQuery(funcConcrete);
		printPatternQuery(funcConcreteLido);
	}
	
	private static void printPatternQuery(CompletePattern pattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		pattern.isValid(AbstractionLevel.CONCRETE);
		System.out.println("\n\n*** "+pattern.getName()+" query ***");
		System.out.println(pattern.generateQuery());
	}
	
	// ---------- COMP BOOLEAN pattern ----------
	
	public static CompletePattern getAbstractCompBoolPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getGenericCompPattern();
		completePattern.setName("comparison_bool_abstract");
		completePattern.setAbstractName("comparison_bool_abstract");
		completePattern.setDescription("Allows detecting elements with a specific property which are related to other elements with a specific property and a specific boolean property");
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();	
		
		ParameterValue value = (ParameterValue) completePattern.getParameterList().getParameters().get(6);
		
		BooleanParam bool = ParametersFactory.eINSTANCE.createBooleanParam();
		value.replace(bool);
		bool.setTypeModifiable(false);
		
		completePattern.createXMLAdaption();
		
		// Specify relation between Element 0 and Element 1:
		quantifiedCondition.getGraph().getRelations().get(0).adaptAsXMLElementNavigation();
		
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}
	
	
	// ---------- COMP DATE pattern ----------
	
	public static CompletePattern getAbstractCompDatePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getGenericCompPattern();
		completePattern.setName("comparison_date_abstract");
		completePattern.setAbstractName("comparison_date_abstract");
		completePattern.setDescription("Allows detecting elements with a specific date property which are related to other elements with specific time and dateTime properties");
		
		// <value date>
		ParameterValue value0 = (ParameterValue) completePattern.getParameterList().getParameters().get(0);
		
		DateParam date = ParametersFactory.eINSTANCE.createDateParam();
		value0.replace(date);
		date.setTypeModifiable(false);
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// <value time>
		ParameterValue value1 = (ParameterValue) completePattern.getParameterList().getParameters().get(3);
		
		TimeParam time = ParametersFactory.eINSTANCE.createTimeParam();
		value1.replace(time);
		time.setTypeModifiable(false);

		
		// <value dateTime>
		ParameterValue value2 = (ParameterValue) completePattern.getParameterList().getParameters().get(6);
		
		DateTimeParam dateTime = ParametersFactory.eINSTANCE.createDateTimeParam();
		value2.replace(dateTime);
		dateTime.setTypeModifiable(false);
		
		completePattern.createXMLAdaption();
		
		// Specify relation between Element 0 and Element 1:
		quantifiedCondition.getGraph().getRelations().get(0).adaptAsXMLElementNavigation();
		
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}
	
	// ---------- COMP pattern ----------
	
	public static CompletePattern getGenericCompPattern() {
		
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setName("comparison_generic");
		completePattern.setAbstractName("comparison_generic");
		completePattern.setDescription("Allows detecting illegal values, i.e. allows detecting elements with a specific property which are related to other elements with two specific properties");
		
		// Context graph of pattern:
		Node element0 = completePattern.getGraph().getNodes().get(0);
		element0.setName("Element0");
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		// Graph of quantified condition:		
		Node element0Copy = quantifiedCondition.getGraph().getNodes().get(0);
		
		Node element1 = GraphstructureFactory.eINSTANCE.createNode();
		element1.setName("Element1");
		element1.setGraph(quantifiedCondition.getGraph());		
		
		Relation relation = GraphstructureFactory.eINSTANCE.createRelation();
		relation.setGraph(quantifiedCondition.getGraph());		
		relation.setSource(element0Copy);
		relation.setTarget(element1);
		
		try {
			element1.addPrimitiveComparison();
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATER);
		comp2.getOption().getOptions().add(ComparisonOperator.LESS);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATEROREQUAL);
		comp2.getOption().getOptions().add(ComparisonOperator.LESSOREQUAL);
		
		// Condition of quantified condition:
		TrueElement trueElement = PatternstructureFactory.eINSTANCE.createTrueElement();
		quantifiedCondition.setCondition(trueElement);
		
		return completePattern;			
	}
	
	public static CompletePattern getAbstractCompPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getGenericCompPattern();
		completePattern.setName("comparison_abstract");
		completePattern.setAbstractName("comparison_abstract");
		
		completePattern.createXMLAdaption();
		
		return completePattern;
	}	
	
	public static CompletePattern getConcreteCompPattern(Database db) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractCompPattern();
		return getConcreteCompPatternFromAbstract(db, abstractPattern);
	}

	public static CompletePattern getConcreteCompPatternFromAbstract(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.setName("comparison_concrete");
		completePattern.setDescription("Detect architects born after 2020");
		completePattern.setDatabase(db);
		
		// Context graph of pattern:
		XmlNavigation nav0 = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		nav0.getPathParam().setAxis(AxisKind.DESCENDANT, DEMO_NAMESPACE + "architect");
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// Graph of quantified condition:
		XmlNavigation nav1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		nav1.getPathParam().setAxis(AxisKind.CHILD, DEMO_NAMESPACE + "birthyear");
		
		ParameterValue value2 = (ParameterValue) completePattern.getParameterList().getParameters().get(0);
		NumberParam numberValue = ParametersFactory.eINSTANCE.createNumberParam();
		numberValue.setValue(2020.0);
		value2.replace(numberValue);
		
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		comp2.getOption().setValue(ComparisonOperator.GREATER);	
								
		return completePattern;
	}
	
	public static CompletePattern getConcreteLidoCompPattern(Database db) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractCompPattern();
		return getConcreteLidoCompPatternFromAbstract(db, abstractPattern);
	}

	public static CompletePattern getConcreteLidoCompPatternFromAbstract(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.setName("comparison_lido_concrete");
		completePattern.setDescription("Allows detecting actors with appellation 'unbekannt'");
		completePattern.setDatabase(db);
		
		// Context graph of pattern:
		XmlNavigation nav0 = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		nav0.getPathParam().setAxis(AxisKind.DESCENDANT, LIDO_NAMESPACE + "actor");
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// Graph of quantified condition:
		XmlNavigation nav1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		nav1.getPathParam().setAxis(AxisKind.CHILD, LIDO_NAMESPACE + "genderActor");
		
		ParameterValue value2 = (ParameterValue) completePattern.getParameterList().getParameters().get(0);
		TextLiteralParam textValue = ParametersFactory.eINSTANCE.createTextLiteralParam();
		textValue.setValue("unbekannt");
		value2.replace(textValue);
		
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		comp2.getOption().setValue(ComparisonOperator.EQUAL);	
								
		return completePattern;
		
	}
	
	// ---------- CARD pattern ----------
	
	public static CompletePattern getGenericCardPattern() {
		
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setName("cardinality_generic");
		completePattern.setAbstractName("cardinality_generic");
		completePattern.setDescription("Allows detecting violated cardinality constraints, i.e. allows detecting elements with a specific property which are related to a specific number of elements with a specific property");
		
		// Context graph of pattern:
		Node element0 = completePattern.getGraph().getNodes().get(0);
		element0.setName("Element0");
		
		// First-order logic condition of pattern:
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		completePattern.setCondition(countCondition);
		
		countCondition.createCountPattern();
		CountPattern countPattern = countCondition.getCountPattern();
		TrueElement trueElement = PatternstructureFactory.eINSTANCE.createTrueElement();
		countPattern.setCondition(trueElement);		
		
		countCondition.createParameters();		
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().getOptions().add(ComparisonOperator.LESS);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATEROREQUAL);
		countCondition.getOption().getOptions().add(ComparisonOperator.LESSOREQUAL);
		
		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		countCondition.setArgument2(numberElement);
		
		NumberParam numberParam = ParametersFactory.eINSTANCE.createNumberParam();
		completePattern.getParameterList().add(numberParam);
		
		numberElement.setNumberParam(numberParam);		
		
		// Graph of inner pattern:
		Node element0Copy = countPattern.getGraph().getNodes().get(0);
		
		Node element1 = GraphstructureFactory.eINSTANCE.createNode();
		element1.setName("Element1");
		element1.setGraph(countPattern.getGraph());		
		
		Relation relation = GraphstructureFactory.eINSTANCE.createRelation();
		relation.setGraph(countPattern.getGraph());		
		relation.setSource(element0Copy);
		relation.setTarget(element1);
		
		return completePattern;
	}
	
	public static CompletePattern getAbstractCardPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getGenericCardPattern();
		completePattern.setName("cardinality_abstract");
		completePattern.setAbstractName("cardinality_abstract");
		
		completePattern.createXMLAdaption();
		
		return completePattern;
	}
	
	public static CompletePattern getConcreteCardPattern(Database db) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractCardPattern();
		return getConcreteCardPatternFromAbstract(db, abstractPattern);
		
	}	
	
	public static CompletePattern getConcreteCardPatternFromAbstract(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.setName("cardinality_concrete");
		completePattern.setDescription("Detect artists with multiple birth years");
		completePattern.setDatabase(db);
		
		// Context graph of pattern:
		XmlNavigation nav0 = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		nav0.getPathParam().setAxis(AxisKind.DESCENDANT, DEMO_NAMESPACE + "artist");
		
		// First-order logic condition of pattern:
		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
		
		countCondition.getOption().setValue(ComparisonOperator.GREATER);
		NumberElement numberElement = (NumberElement) countCondition.getArgument2();
		numberElement.getNumberParam().setValue(1.0);
		
		CountPattern countPattern = countCondition.getCountPattern();
		
		// Graph of inner pattern:
		XmlNavigation nav1 = (XmlNavigation) countPattern.getGraph().getRelations().get(0);
		nav1.getPathParam().setAxis(AxisKind.CHILD, DEMO_NAMESPACE + "birthyear");
		
		return completePattern;
	}
	
	public static CompletePattern getConcreteLidoCardPattern(Database db) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractCardPattern();
		return getConcreteLidoCardPatternFromAbstract(db, abstractPattern);
		
	}	
	
	public static CompletePattern getConcreteLidoCardPatternFromAbstract(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.setName("cardinality_lido_concrete");
		completePattern.setDescription("Allows detecting artists with more than one nameActorSet");
		completePattern.setDatabase(db);
		
		// Context graph of pattern:
		XmlNavigation nav0 = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		nav0.getPathParam().setAxis(AxisKind.DESCENDANT, LIDO_NAMESPACE + "actor");
		
		// First-order logic condition of pattern:
		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
		
		countCondition.getOption().setValue(ComparisonOperator.GREATER);
		NumberElement numberElement = (NumberElement) countCondition.getArgument2();
		numberElement.getNumberParam().setValue(1.0);
		
		CountPattern countPattern = countCondition.getCountPattern();
		
		// Graph of inner pattern:
		XmlNavigation nav1 = (XmlNavigation) countPattern.getGraph().getRelations().get(0);
		nav1.getPathParam().setAxis(AxisKind.CHILD, LIDO_NAMESPACE + "nameActorSet");
				
		return completePattern;
	}
	
	public static CompletePattern getConcreteFinalizedCardPattern(Database db) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern concretePattern = getConcreteCardPattern(db);
		return getConcreteFinalizedCardPatternFromConcrete(db, concretePattern);		
	}
	
	public static CompletePattern getConcreteFinalizedCardPatternFromConcrete(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.setName("cardinality_concrete_finalized");
		completePattern.isValid(AbstractionLevel.CONCRETE);
		completePattern.generateQuery();
		return completePattern;
	}
	
	
	// ---------- FUNC pattern ----------

	public static CompletePattern getGenericFuncPattern() throws InvalidityException {
		
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setName("functional_dependency_generic");
		completePattern.setAbstractName("functional_dependency_generic");
		completePattern.setDescription("Allows detecting a violated functional dependency, i.e. allows detecting two elements that are each related to two further elements where two of these have an equal property but the other two have a different property");
		
		// Context graph of pattern:
		Node element0 = completePattern.getGraph().getNodes().get(0);
		element0.setName("Element0");
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		// Graph of quantified condition:		
		Node element0Copy = quantifiedCondition.getGraph().getNodes().get(0);
		
		Node element0A = GraphstructureFactory.eINSTANCE.createPrimitiveNode();
		element0A.setName("Element0A");
		element0A.setGraph(quantifiedCondition.getGraph());	
//		PrimitiveNode property0A = GraphstructureFactory.eINSTANCE.createPrimitiveNode();
//		element0A.addOutgoing(property0A);
		
		Relation relation0A = GraphstructureFactory.eINSTANCE.createRelation();
		relation0A.setGraph(quantifiedCondition.getGraph());		
		relation0A.setSource(element0Copy);
		relation0A.setTarget(element0A);
		
		Node newElement0Copy = relation0A.getSource();
		
		Node element0B = GraphstructureFactory.eINSTANCE.createPrimitiveNode();
		element0B.setName("Element0B");
		element0B.setGraph(quantifiedCondition.getGraph());
//		PrimitiveNode property0B = GraphstructureFactory.eINSTANCE.createPrimitiveNode();
//		element0B.addOutgoing(property0B);
		
		Relation relation0B = GraphstructureFactory.eINSTANCE.createRelation();
		relation0B.setGraph(quantifiedCondition.getGraph());		
		relation0B.setSource(newElement0Copy);
		relation0B.setTarget(element0B);
		
		Node element1 = GraphstructureFactory.eINSTANCE.createNode();
		element1.setName("Element1");
		element1.setGraph(quantifiedCondition.getGraph());	
		
//		Node element1A = GraphstructureFactory.eINSTANCE.createNode();
//		element1A.setName("Element1A");
//		element1A.setGraph(quantifiedCondition.getGraph());	
//		PrimitiveNode property1A = GraphstructureFactory.eINSTANCE.createPrimitiveNode();
//		element1A.addOutgoing(property0B);
		
		Relation relation1A = GraphstructureFactory.eINSTANCE.createRelation();
		relation1A.setGraph(quantifiedCondition.getGraph());		
		relation1A.setSource(element1);
		relation1A.setTarget(element0A);
		
		Node newElement1 = relation1A.getSource();
		
		Node element1B = GraphstructureFactory.eINSTANCE.createPrimitiveNode();
		element1B.setName("Element1B");
		element1B.setGraph(quantifiedCondition.getGraph());	
//		PrimitiveNode property1B = GraphstructureFactory.eINSTANCE.createPrimitiveNode();
//		element1B.addOutgoing(property1B);
		
		Relation relation1B = GraphstructureFactory.eINSTANCE.createRelation();
		relation1B.setGraph(quantifiedCondition.getGraph());		
		relation1B.setSource(newElement1);
		relation1B.setTarget(element1B);
		
//		Comparison compA = OperatorsFactory.eINSTANCE.createComparison();
//		quantifiedCondition.getGraph().getOperatorList().getOperators().add(compA);
//		compA.setArgument1(property0A);
//		compA.setArgument2(property1A);
//		compA.getOption().setValue(ComparisonOperator.EQUAL);
//		compA.getOption().setPredefined(true);
		
		Comparison compB = OperatorsFactory.eINSTANCE.createComparison();
		quantifiedCondition.getGraph().getOperatorList().getOperators().add(compB);
		compB.setArgument1(element0B);
		compB.setArgument2(element1B);
		compB.getOption().setValue(ComparisonOperator.NOTEQUAL);
		compB.getOption().setPredefined(true);
		compB.getTypeOption().setValue(ReturnType.STRING);
		
		// Condition of quantified condition:
		TrueElement trueElement = PatternstructureFactory.eINSTANCE.createTrueElement();
		quantifiedCondition.setCondition(trueElement);
		
		return completePattern;			
	}
	
	public static CompletePattern getAbstractFuncPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getGenericFuncPattern();
		completePattern.setName("functional_dependency_abstract");
		completePattern.setAbstractName("functional_dependency_abstract");
		
		completePattern.createXMLAdaption();
	
		return completePattern;
	}

	public static CompletePattern getConcreteFuncPatternFromAbstract(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		completePattern.setName("functional_dependency_concrete");
		completePattern.setDescription("Detects buildings with the same city but different countries");
		completePattern.setDatabase(db);
		
		// Context graph of pattern:
		XmlNavigation nav0 = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		nav0.getPathParam().setAxis(AxisKind.DESCENDANT, DEMO_NAMESPACE + "building");
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// Graph of quantified condition:
		XmlNavigation nav0A = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		nav0A.getPathParam().setAxis(AxisKind.CHILD, DEMO_NAMESPACE + "city");
		
		XmlNavigation nav0B = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(2);
		nav0B.getPathParam().setAxis(AxisKind.CHILD, DEMO_NAMESPACE + "country");
		
		XmlNavigation nav1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(5);
		nav1.getPathParam().setAxis(AxisKind.DESCENDANT, DEMO_NAMESPACE + "building");
		
		XmlNavigation nav1A = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(3);
		nav1A.getPathParam().setAxis(AxisKind.CHILD, DEMO_NAMESPACE + "country");
		
		XmlNavigation nav1B = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(1);
		nav1B.getPathParam().setAxis(AxisKind.CHILD, DEMO_NAMESPACE + "city");
				
		return completePattern;
	
	}
	
	public static CompletePattern getConcreteFuncPattern(Database db) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAbstractFuncPattern();
		return getConcreteFuncPatternFromAbstract(db, completePattern);
	}
	
	public static CompletePattern getConcreteLidoFuncPattern(Database db) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAbstractFuncPattern();
		return getConcreteLidoFuncPatternFromAbstract(db, completePattern);
	}
	
	public static CompletePattern getConcreteLidoFuncPatternFromAbstract(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		completePattern.setName("functional_dependency_lido_concrete");
		completePattern.setDatabase(db);
		completePattern.setDescription("Allows detecting a violated functional dependency between a conceptID and term indicating the culture");
		
		// Context graph of pattern:
		XmlNavigation nav0 = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		nav0.getPathParam().setAxis(AxisKind.DESCENDANT, LIDO_NAMESPACE + "culture");
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// Graph of quantified condition:
		XmlNavigation nav0A = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		nav0A.getPathParam().setAxis(AxisKind.CHILD, LIDO_NAMESPACE + "conceptID");
		
		XmlNavigation nav0B = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(2);
		nav0B.getPathParam().setAxis(AxisKind.CHILD, LIDO_NAMESPACE + "term");
		
		XmlNavigation nav1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(5);
		nav1.getPathParam().setAxis(AxisKind.DESCENDANT, LIDO_NAMESPACE + "culture");
		
		XmlNavigation nav1A = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(3);
		nav1A.getPathParam().setAxis(AxisKind.CHILD, LIDO_NAMESPACE + "term");
		
		XmlNavigation nav1B = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(1);
		nav1B.getPathParam().setAxis(AxisKind.CHILD, LIDO_NAMESPACE + "conceptID");
				
		return completePattern;
	
	}
	
}

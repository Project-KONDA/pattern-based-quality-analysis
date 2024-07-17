package demo;

import static qualitypatternmodel.utility.XmlTestDatabaseConstants.DEMO_DATABASE_NAME;
import static qualitypatternmodel.utility.XmlTestDatabaseConstants.DEMO_DATA_PATH;
import static qualitypatternmodel.utility.XmlTestDatabaseConstants.DEMO_NAMESPACE;
import static qualitypatternmodel.utility.XmlTestDatabaseConstants.DEMO_SCHEMA_NAME;
import static qualitypatternmodel.utility.XmlTestDatabaseConstants.DEMO_SCHEMA_PATH;
import static qualitypatternmodel.utility.XmlTestDatabaseConstants.LIDO_NAMESPACE;

import java.io.IOException;
import java.util.List;

import org.basex.query.QueryException;

import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.impl.IriParamImpl;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
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
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersFactory;
//import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.utility.EMFModelSave;
import qualitypatternmodel.utility.PatternUtility;

public class DemoPatterns {


	private static CompletePattern compConcrete;
	@SuppressWarnings("unused")
	private static CompletePattern compTextConcrete;
	private static CompletePattern compLidoConcrete;
	private static CompletePattern cardConcrete;
	@SuppressWarnings("unused")
	private static CompletePattern cardConcreteFinalized;
	private static CompletePattern cardConcreteLido;
	private static CompletePattern funcConcrete;
	private static CompletePattern funcConcreteLido;
	private static CompletePattern compConcreteRdf;

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
        compLidoConcrete = getConcreteLidoCompPattern(database);
        cardConcrete = getConcreteCardPattern(database);
        cardConcreteFinalized = getConcreteFinalizedCardPattern(database);
        cardConcreteLido = getConcreteLidoCardPattern(database);
        funcConcrete = getConcreteFuncPattern(database);
        funcConcreteLido = getConcreteLidoFuncPattern(database);
//
        compConcreteRdf = getConcreteCompRdfPattern(database);
//
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
//
		Result funcResult = database.execute(funcConcrete, "FUNC demo execution", "Joe Cool");
		printExecutionResult(funcConcrete, funcResult);

	}

	private static void printExecutionResult(CompletePattern pattern, Result result) {
		System.out.println("\n\n*** Result of applying the pattern " + pattern.getPatternId() + " to the demo database ***");
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

		CompletePattern compLidoConcrete = getConcreteLidoCompPattern(database);
		EMFModelSave.exportToFile(compLidoConcrete,"instances/demo/comparison_lido_concrete", "patternstructure");

		CompletePattern compRdfConcrete = getConcreteCompRdfPattern(database);
		EMFModelSave.exportToFile(compRdfConcrete,"instances/demo/comparison_rdf_concrete", "patternstructure");

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
		printPatternQuery(compLidoConcrete);
		printPatternSparqlQuery(compConcreteRdf);

		printPatternQuery(cardConcrete);
		printPatternQuery(cardConcreteLido);

		printPatternQuery(funcConcrete);
		printPatternQuery(funcConcreteLido);
	}

	private static void printPatternQuery(CompletePattern pattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		pattern.isValid(AbstractionLevel.CONCRETE);
		System.out.println("\n\n*** " + pattern.getPatternId() + " query ***");
		System.out.println(pattern.generateXQuery());
	}

	private static void printPatternSparqlQuery(CompletePattern pattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		pattern.isValid(AbstractionLevel.CONCRETE); // TODO
		System.out.println("\n\n*** " + pattern.getPatternId() + " query ***");
		System.out.println(pattern.generateSparql());
	}

	// ---------- COMP BOOLEAN pattern ----------

	public static CompletePattern getAbstractCompBoolPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getGenericCompPattern();
		completePattern.setPatternId("comparison_bool_abstract");
		completePattern.setAbstractId("comparison_bool_abstract");
		completePattern.setDescription("Allows detecting elements with a specific property which are related to other elements with a specific property and a specific boolean property");

//		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();

		ParameterValue value = (ParameterValue) completePattern.getParameterList().getParameters().get(0);

		BooleanParam bool = ParametersFactory.eINSTANCE.createBooleanParam();
		value.replace(bool);
		bool.setTypeModifiable(false);

		completePattern.createXmlAdaption();

		return completePattern;
	}


	// ---------- COMP DATE pattern ----------

	public static CompletePattern getAbstractCompDatePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getGenericCompPattern();
		completePattern.setPatternId("comparison_date_abstract");
		completePattern.setAbstractId("comparison_date_abstract");
		completePattern.setDescription("Allows detecting elements with a specific date property which are related to other elements with specific time and dateTime properties");

		// <value date>
		ParameterValue value0 = (ParameterValue) completePattern.getParameterList().getParameters().get(0);

		DateParam date = ParametersFactory.eINSTANCE.createDateParam();
		value0.replace(date);
		date.setTypeModifiable(false);

		completePattern.createXmlAdaption();

		return completePattern;
	}

	// ---------- COMP pattern ----------

	public static CompletePattern getGenericCompPattern() throws InvalidityException {

		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setPatternId("comparison_generic");
		completePattern.setAbstractId("comparison_generic");
		completePattern.setDescription("Allows detecting illegal values, i.e. allows detecting elements with a specific property which are related to other elements with two specific properties");

		// Context graph of pattern:
		Node element0 = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		element0.setName("Element0");
//		element0.addOutgoing().getTarget().addPrimitiveComparison();

		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);

		// Graph of quantified condition:
		Node element0Copy = quantifiedCondition.getGraph().getReturnNodes().get(0);

		Node element1 = element0Copy.addOutgoing().getTarget().makePrimitive();
		element1.setName("Element1");
		element1.setGraph(quantifiedCondition.getGraph());

		element1.addPrimitiveComparison();
//		element1.addOutgoing().getTarget().addPrimitiveComparison();

		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATER);
		comp2.getOption().getOptions().add(ComparisonOperator.LESS);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATEROREQUAL);
		comp2.getOption().getOptions().add(ComparisonOperator.LESSOREQUAL);

		return completePattern;
	}

	public static CompletePattern getAbstractCompPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getGenericCompPattern();
		completePattern.setPatternId("comparison_abstract");
		completePattern.setAbstractId("comparison_abstract");

		completePattern.createXmlAdaption();

		return completePattern;
	}

	public static CompletePattern getConcreteCompPattern(Database db) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractCompPattern();
		return getConcreteCompPatternFromAbstract(db, abstractPattern);
	}

	public static CompletePattern getConcreteCompPatternFromAbstract(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.setPatternId("comparison_concrete");
		completePattern.setDescription("Detect architects born after 2020");
		completePattern.setDatabase(db);

		List<Parameter> params = completePattern.getParameterList().getParameters();

		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		XmlPathParamImpl p3 = ((XmlPathParamImpl) params.get(3));
		XmlPathParamImpl p4 = ((XmlPathParamImpl) params.get(4));

		NumberParam numberValue = ParametersFactory.eINSTANCE.createNumberParam();
		numberValue.setValue(2020.0);
		p0.replace(numberValue);
		p1.setValue(ComparisonOperator.GREATER);
		p3.setXmlAxis(XmlAxisKind.DESCENDANT, DEMO_NAMESPACE + "architect");
		p4.setXmlAxis(XmlAxisKind.CHILD, DEMO_NAMESPACE + "birthyear");

		return completePattern;
	}

	public static CompletePattern getConcreteLidoCompPattern(Database db) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractCompPattern();
		return getConcreteLidoCompPatternFromAbstract(db, abstractPattern);
	}

	public static CompletePattern getConcreteLidoCompPatternFromAbstract(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.setPatternId("comparison_lido_concrete");
		completePattern.setDescription("Allows detecting actors with appellation 'unbekannt'");
		completePattern.setDatabase(db);

		List<Parameter> params = completePattern.getParameterList().getParameters();

		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		XmlPathParamImpl p3 = ((XmlPathParamImpl) params.get(3));
		XmlPathParamImpl p4 = ((XmlPathParamImpl) params.get(4));

		p0.setValue("m / f");
		p1.setValue(ComparisonOperator.EQUAL);
		p3.setXmlAxis(XmlAxisKind.DESCENDANT, LIDO_NAMESPACE + "actor");
		p4.setXmlAxis(XmlAxisKind.CHILD, LIDO_NAMESPACE + "genderActor");

		return completePattern;

	}

	// ---------- COMP RDF pattern --------------

	public static CompletePattern getAbstractCompRdfPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getGenericCompPattern();
		completePattern.setPatternId("comparison_abstract_rdf");
		completePattern.setAbstractId("comparison_abstract_rdf");

		completePattern.createRdfAdaption();

		return completePattern;
	}

	public static CompletePattern getConcreteCompRdfPattern(Database db) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractCompRdfPattern();
		return getConcreteCompRdfPatternFromAbstract(db, abstractPattern);
	}

	public static CompletePattern getConcreteCompRdfPatternFromAbstract(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.setPatternId("comparison_concrete_rdf");
		completePattern.setDescription("Humans born in the future");
		completePattern.setDatabase(db);

		List<Parameter> params = completePattern.getParameterList().getParameters();

		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
//		IriListParam p3 = ((IriListParam) params.get(3));
		RdfPathParam p4 = ((RdfPathParam) params.get(4));

		DateParam dateValue = ParametersFactory.eINSTANCE.createDateParam();
		dateValue.setValue("2022-12-31");
		p0.replace(dateValue);
		p1.setValue(ComparisonOperator.GREATER);

		IriParam p4iri = new IriParamImpl();
		p4iri.setPrefix("wdt");
		p4iri.setSuffix("P569");
		((RdfSinglePredicate) p4.getRdfPathParts().get(0).getRdfPath()).setIriParam(p4iri);

		return completePattern;
	}

	// ---------- CARD pattern ----------

	public static CompletePattern getGenericCardPattern() throws InvalidityException {

		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setPatternId("cardinality_generic");
		completePattern.setAbstractId("cardinality_generic");
		completePattern.setDescription("Allows detecting violated cardinality constraints, i.e. allows detecting elements with a specific property which are related to a specific number of elements with a specific property");

		// Context graph of pattern:
		Node element0 = completePattern.getGraph().getReturnNodes().get(0);
		element0.setName("Element0");
//		element0.addOutgoing().getTarget().addPrimitiveComparison();

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

		Node element1 = element0Copy.addOutgoing().getTarget();
		element1.setName("Element1");
		element1.setGraph(countPattern.getGraph());

		return completePattern;
	}

	public static CompletePattern getAbstractCardPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getGenericCardPattern();
		completePattern.setPatternId("cardinality_abstract");
		completePattern.setAbstractId("cardinality_abstract");

		completePattern.createXmlAdaption();

		return completePattern;
	}

	public static CompletePattern getConcreteCardPattern(Database db) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractCardPattern();
		return getConcreteCardPatternFromAbstract(db, abstractPattern);

	}

	public static CompletePattern getConcreteCardPatternFromAbstract(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.setPatternId("cardinality_concrete");
		completePattern.setDescription("Detect artists with multiple birth years");
		completePattern.setDatabase(db);

		List<Parameter> params = completePattern.getParameterList().getParameters();

		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
		NumberParam p1 = ((NumberParam) params.get(1));
		XmlPathParamImpl p2 = ((XmlPathParamImpl) params.get(2));
		XmlPathParamImpl p3 = ((XmlPathParamImpl) params.get(3));

		p0.setValue(ComparisonOperator.GREATER);
		p1.setValue(1.0);
		p2.setXmlAxis(XmlAxisKind.DESCENDANT, DEMO_NAMESPACE + "artist");
		p3.setXmlAxis(XmlAxisKind.CHILD, DEMO_NAMESPACE + "birthyear");

		return completePattern;
	}

	public static CompletePattern getConcreteLidoCardPattern(Database db) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractCardPattern();
		return getConcreteLidoCardPatternFromAbstract(db, abstractPattern);

	}

	public static CompletePattern getConcreteLidoCardPatternFromAbstract(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.setPatternId("cardinality_lido_concrete");
		completePattern.setDescription("Allows detecting artists with more than one nameActorSet");
		completePattern.setDatabase(db);


		List<Parameter> params = completePattern.getParameterList().getParameters();

		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
		NumberParam p1 = ((NumberParam) params.get(1));
		XmlPathParamImpl p2 = ((XmlPathParamImpl) params.get(2));
		XmlPathParamImpl p3 = ((XmlPathParamImpl) params.get(3));

		p0.setValue(ComparisonOperator.GREATER);
		p1.setValue(1.0);
		p2.setXmlAxis(XmlAxisKind.DESCENDANT, LIDO_NAMESPACE + "actor");
		p3.setXmlAxis(XmlAxisKind.CHILD, LIDO_NAMESPACE + "nameActorSet");

		return completePattern;
	}

	public static CompletePattern getConcreteFinalizedCardPattern(Database db) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern concretePattern = getConcreteCardPattern(db);
		return getConcreteFinalizedCardPatternFromConcrete(db, concretePattern);
	}

	public static CompletePattern getConcreteFinalizedCardPatternFromConcrete(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern = PatternUtility.fillParameter(completePattern);
		completePattern.setPatternId("cardinality_concrete_finalized");
//		completePattern.isValid(AbstractionLevel.CONCRETE);
//		completePattern.generateXQuery();
		return completePattern;
	}


	// ---------- FUNC pattern ----------

	public static CompletePattern getGenericFuncPattern() throws InvalidityException {

		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setPatternId("functional_dependency_generic");
		completePattern.setAbstractId("functional_dependency_generic");
		completePattern.setDescription("Allows detecting a violated functional dependency, i.e. allows detecting two elements that are each related to two further elements where two of these have an equal property but the other two have a different property");

		// Context graph of pattern:
		Node element0 = completePattern.getGraph().getNodes().get(0).makeComplex();
		element0.setName("Element0");
//		element0.addOutgoing().getTarget().addPrimitiveComparison();

		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);

		// Graph of quantified condition:
		Node element0Copy = quantifiedCondition.getGraph().getNodes().get(0);

		Node element0A = element0Copy.addOutgoing().getTarget().makePrimitive();
		element0A.setName("Element0A");
//		element0A.addPrimitiveComparison();

		Node element0B = element0Copy.addOutgoing().getTarget().makePrimitive();
		element0B.setName("Element0B");
//		element0B.addPrimitiveComparison();

		Node element1 = GraphstructureFactory.eINSTANCE.createComplexNode();
		element1.setName("Element1");
		element1.setGraph(quantifiedCondition.getGraph());
//		element1.addOutgoing().getTarget().addPrimitiveComparison();

		element1.addOutgoing(element0A);

		Node element1B = element1.addOutgoing().getTarget().makePrimitive();
		element1B.setName("Element1B");
//		element1B.addPrimitiveComparison();

		Comparison compB = element0B.addComparison(element1B);
//		quantifiedCondition.getGraph().getOperatorList().getOperators().add(compB);
		compB.getOption().setValue(ComparisonOperator.NOTEQUAL);
		compB.getOption().setPredefined(true);
		compB.getTypeOption().setValue(ReturnType.STRING);

		return completePattern;
	}

	public static CompletePattern getAbstractFuncPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getGenericFuncPattern();
		completePattern.setPatternId("functional_dependency_abstract");
		completePattern.setAbstractId("functional_dependency_abstract");

		completePattern.createXmlAdaption();

		return completePattern;
	}

	public static CompletePattern getConcreteFuncPatternFromAbstract(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		completePattern.setPatternId("functional_dependency_concrete");
		completePattern.setDescription("Detects buildings with the same city but different countries");
		completePattern.setDatabase(db);

		List<Parameter> params = completePattern.getParameterList().getParameters();

//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		XmlPathParamImpl p2 = ((XmlPathParamImpl) params.get(2));
		XmlPathParamImpl p3 = ((XmlPathParamImpl) params.get(3));
		XmlPathParamImpl p4 = ((XmlPathParamImpl) params.get(4));
		XmlPathParamImpl p5 = ((XmlPathParamImpl) params.get(5));
		XmlPathParamImpl p6 = ((XmlPathParamImpl) params.get(6));
		XmlPathParamImpl p7 = ((XmlPathParamImpl) params.get(7));

		p2.setXmlAxis(XmlAxisKind.DESCENDANT, DEMO_NAMESPACE + "building");
		p3.setXmlAxis(XmlAxisKind.CHILD, DEMO_NAMESPACE + "city");
		p4.setXmlAxis(XmlAxisKind.CHILD, DEMO_NAMESPACE + "city");
		p5.setXmlAxis(XmlAxisKind.CHILD, DEMO_NAMESPACE + "country");
		p6.setXmlAxis(XmlAxisKind.CHILD, DEMO_NAMESPACE + "country");
		p7.setXmlAxis(XmlAxisKind.DESCENDANT, DEMO_NAMESPACE + "building");

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

		completePattern.setPatternId("functional_dependency_lido_concrete");
		completePattern.setDatabase(db);
		completePattern.setDescription("Allows detecting a violated functional dependency between a conceptID and term indicating the culture");

		List<Parameter> params = completePattern.getParameterList().getParameters();

//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		XmlPathParamImpl p2 = ((XmlPathParamImpl) params.get(2));
		XmlPathParamImpl p3 = ((XmlPathParamImpl) params.get(3));
		XmlPathParamImpl p4 = ((XmlPathParamImpl) params.get(4));
		XmlPathParamImpl p5 = ((XmlPathParamImpl) params.get(5));
		XmlPathParamImpl p6 = ((XmlPathParamImpl) params.get(6));
		XmlPathParamImpl p7 = ((XmlPathParamImpl) params.get(7));

		p2.setXmlAxis(XmlAxisKind.DESCENDANT, LIDO_NAMESPACE + "culture");
		p3.setXmlAxis(XmlAxisKind.CHILD, LIDO_NAMESPACE + "conceptID");
		p4.setXmlAxis(XmlAxisKind.CHILD, LIDO_NAMESPACE + "conceptID");
		p5.setXmlAxis(XmlAxisKind.CHILD, LIDO_NAMESPACE + "term");
		p6.setXmlAxis(XmlAxisKind.CHILD, LIDO_NAMESPACE + "term");
		p7.setXmlAxis(XmlAxisKind.DESCENDANT, LIDO_NAMESPACE + "culture");

		return completePattern;

	}

}

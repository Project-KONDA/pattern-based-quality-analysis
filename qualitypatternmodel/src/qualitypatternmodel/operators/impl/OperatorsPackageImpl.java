/**
 */
package qualitypatternmodel.operators.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl;
import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl;
import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.impl.JavaoperatorsPackageImpl;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.NullCheck;
import qualitypatternmodel.operators.NumberOperator;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.StringLength;
import qualitypatternmodel.operators.util.OperatorsValidator;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.ParametersPackageImpl;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;
import qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatorsPackageImpl extends EPackageImpl implements OperatorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operatorCycleExceptionWrapperEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see qualitypatternmodel.operators.OperatorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatorsPackageImpl() {
		super(eNS_URI, OperatorsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OperatorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OperatorsPackage init() {
		if (isInited) return (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOperatorsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OperatorsPackageImpl theOperatorsPackage = registeredOperatorsPackage instanceof OperatorsPackageImpl ? (OperatorsPackageImpl)registeredOperatorsPackage : new OperatorsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(registeredPackage instanceof ParametersPackageImpl ? registeredPackage : ParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GraphstructurePackage.eNS_URI);
		GraphstructurePackageImpl theGraphstructurePackage = (GraphstructurePackageImpl)(registeredPackage instanceof GraphstructurePackageImpl ? registeredPackage : GraphstructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);
		PatternstructurePackageImpl thePatternstructurePackage = (PatternstructurePackageImpl)(registeredPackage instanceof PatternstructurePackageImpl ? registeredPackage : PatternstructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdaptionxmlPackage.eNS_URI);
		AdaptionxmlPackageImpl theAdaptionxmlPackage = (AdaptionxmlPackageImpl)(registeredPackage instanceof AdaptionxmlPackageImpl ? registeredPackage : AdaptionxmlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TextrepresentationPackage.eNS_URI);
		TextrepresentationPackageImpl theTextrepresentationPackage = (TextrepresentationPackageImpl)(registeredPackage instanceof TextrepresentationPackageImpl ? registeredPackage : TextrepresentationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdaptionrdfPackage.eNS_URI);
		AdaptionrdfPackageImpl theAdaptionrdfPackage = (AdaptionrdfPackageImpl)(registeredPackage instanceof AdaptionrdfPackageImpl ? registeredPackage : AdaptionrdfPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Adaptionneo4jPackage.eNS_URI);
		Adaptionneo4jPackageImpl theAdaptionneo4jPackage = (Adaptionneo4jPackageImpl)(registeredPackage instanceof Adaptionneo4jPackageImpl ? registeredPackage : Adaptionneo4jPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaoperatorsPackage.eNS_URI);
		JavaoperatorsPackageImpl theJavaoperatorsPackage = (JavaoperatorsPackageImpl)(registeredPackage instanceof JavaoperatorsPackageImpl ? registeredPackage : JavaoperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaqueryPackage.eNS_URI);
		JavaqueryPackageImpl theJavaqueryPackage = (JavaqueryPackageImpl)(registeredPackage instanceof JavaqueryPackageImpl ? registeredPackage : JavaqueryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaqueryoutputPackage.eNS_URI);
		JavaqueryoutputPackageImpl theJavaqueryoutputPackage = (JavaqueryoutputPackageImpl)(registeredPackage instanceof JavaqueryoutputPackageImpl ? registeredPackage : JavaqueryoutputPackage.eINSTANCE);

		// Create package meta-data objects
		theOperatorsPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();
		theAdaptionxmlPackage.createPackageContents();
		theTextrepresentationPackage.createPackageContents();
		theAdaptionrdfPackage.createPackageContents();
		theAdaptionneo4jPackage.createPackageContents();
		theJavaoperatorsPackage.createPackageContents();
		theJavaqueryPackage.createPackageContents();
		theJavaqueryoutputPackage.createPackageContents();

		// Initialize created meta-data
		theOperatorsPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();
		theAdaptionxmlPackage.initializePackageContents();
		theTextrepresentationPackage.initializePackageContents();
		theAdaptionrdfPackage.initializePackageContents();
		theAdaptionneo4jPackage.initializePackageContents();
		theJavaoperatorsPackage.initializePackageContents();
		theJavaqueryPackage.initializePackageContents();
		theJavaqueryoutputPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOperatorsPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return OperatorsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOperatorsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OperatorsPackage.eNS_URI, theOperatorsPackage);
		return theOperatorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanOperator() {
		return booleanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanOperator_Nodes() {
		return (EReference)booleanOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBooleanOperator__AddElement__Node() {
		return booleanOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBooleanOperator__RemoveElement__Node() {
		return booleanOperatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBooleanOperator__GetElement() {
		return booleanOperatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBooleanOperator__GenerateXQueryIsolated() {
		return booleanOperatorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBooleanOperator__GenerateSparqlIsolated() {
		return booleanOperatorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBooleanOperator__GenerateCypherIsolated() {
		return booleanOperatorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBooleanOperator__CreateParameters() {
		return booleanOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperator_OperatorList() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetRootBooleanOperators() {
		return operatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__IsCycleFree__EList() {
		return operatorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__IsCycleFree() {
		return operatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetArguments() {
		return operatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__Validate__DiagnosticChain_Map() {
		return operatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberOperator() {
		return numberOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatch() {
		return matchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatch_PrimitiveNode() {
		return (EReference)matchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatch_Option() {
		return (EReference)matchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatch_RegularExpression() {
		return (EReference)matchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparison() {
		return comparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparison_Argument1() {
		return (EReference)comparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparison_Argument2() {
		return (EReference)comparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparison_Option() {
		return (EReference)comparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparison_TypeOption() {
		return (EReference)comparisonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparison__IsPrimitive() {
		return comparisonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparison__Copy() {
		return comparisonEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperatorList() {
		return operatorListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperatorList_Graph() {
		return (EReference)operatorListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperatorList_Operators() {
		return (EReference)operatorListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperatorList__Add__Operator() {
		return operatorListEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContains() {
		return containsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContains_PrimitiveNode() {
		return (EReference)containsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContains_Option() {
		return (EReference)containsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContains_Content() {
		return (EReference)containsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNullCheck() {
		return nullCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNullCheck_PrimitiveNode() {
		return (EReference)nullCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNullCheck_Option() {
		return (EReference)nullCheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringLength() {
		return stringLengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStringLength_PrimitiveNode() {
		return (EReference)stringLengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStringLength_Number() {
		return (EReference)stringLengthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStringLength_Option() {
		return (EReference)stringLengthEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComparisonOperator() {
		return comparisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOperatorCycleExceptionWrapper() {
		return operatorCycleExceptionWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatorsFactory getOperatorsFactory() {
		return (OperatorsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		booleanOperatorEClass = createEClass(BOOLEAN_OPERATOR);
		createEReference(booleanOperatorEClass, BOOLEAN_OPERATOR__NODES);
		createEOperation(booleanOperatorEClass, BOOLEAN_OPERATOR___CREATE_PARAMETERS);
		createEOperation(booleanOperatorEClass, BOOLEAN_OPERATOR___ADD_ELEMENT__NODE);
		createEOperation(booleanOperatorEClass, BOOLEAN_OPERATOR___REMOVE_ELEMENT__NODE);
		createEOperation(booleanOperatorEClass, BOOLEAN_OPERATOR___GET_ELEMENT);
		createEOperation(booleanOperatorEClass, BOOLEAN_OPERATOR___GENERATE_XQUERY_ISOLATED);
		createEOperation(booleanOperatorEClass, BOOLEAN_OPERATOR___GENERATE_SPARQL_ISOLATED);
		createEOperation(booleanOperatorEClass, BOOLEAN_OPERATOR___GENERATE_CYPHER_ISOLATED);

		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__OPERATOR_LIST);
		createEOperation(operatorEClass, OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(operatorEClass, OPERATOR___GET_ARGUMENTS);
		createEOperation(operatorEClass, OPERATOR___GET_ROOT_BOOLEAN_OPERATORS);
		createEOperation(operatorEClass, OPERATOR___IS_CYCLE_FREE);
		createEOperation(operatorEClass, OPERATOR___IS_CYCLE_FREE__ELIST);

		numberOperatorEClass = createEClass(NUMBER_OPERATOR);

		matchEClass = createEClass(MATCH);
		createEReference(matchEClass, MATCH__PRIMITIVE_NODE);
		createEReference(matchEClass, MATCH__OPTION);
		createEReference(matchEClass, MATCH__REGULAR_EXPRESSION);

		comparisonEClass = createEClass(COMPARISON);
		createEReference(comparisonEClass, COMPARISON__ARGUMENT1);
		createEReference(comparisonEClass, COMPARISON__ARGUMENT2);
		createEReference(comparisonEClass, COMPARISON__OPTION);
		createEReference(comparisonEClass, COMPARISON__TYPE_OPTION);
		createEOperation(comparisonEClass, COMPARISON___IS_PRIMITIVE);
		createEOperation(comparisonEClass, COMPARISON___COPY);

		operatorListEClass = createEClass(OPERATOR_LIST);
		createEReference(operatorListEClass, OPERATOR_LIST__GRAPH);
		createEReference(operatorListEClass, OPERATOR_LIST__OPERATORS);
		createEOperation(operatorListEClass, OPERATOR_LIST___ADD__OPERATOR);

		containsEClass = createEClass(CONTAINS);
		createEReference(containsEClass, CONTAINS__PRIMITIVE_NODE);
		createEReference(containsEClass, CONTAINS__OPTION);
		createEReference(containsEClass, CONTAINS__CONTENT);

		nullCheckEClass = createEClass(NULL_CHECK);
		createEReference(nullCheckEClass, NULL_CHECK__PRIMITIVE_NODE);
		createEReference(nullCheckEClass, NULL_CHECK__OPTION);

		stringLengthEClass = createEClass(STRING_LENGTH);
		createEReference(stringLengthEClass, STRING_LENGTH__PRIMITIVE_NODE);
		createEReference(stringLengthEClass, STRING_LENGTH__NUMBER);
		createEReference(stringLengthEClass, STRING_LENGTH__OPTION);

		// Create enums
		comparisonOperatorEEnum = createEEnum(COMPARISON_OPERATOR);

		// Create data types
		operatorCycleExceptionWrapperEDataType = createEDataType(OPERATOR_CYCLE_EXCEPTION_WRAPPER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GraphstructurePackage theGraphstructurePackage = (GraphstructurePackage)EPackage.Registry.INSTANCE.getEPackage(GraphstructurePackage.eNS_URI);
		PatternstructurePackage thePatternstructurePackage = (PatternstructurePackage)EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);
		ParametersPackage theParametersPackage = (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		booleanOperatorEClass.getESuperTypes().add(this.getOperator());
		operatorEClass.getESuperTypes().add(theGraphstructurePackage.getComparable());
		operatorEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		numberOperatorEClass.getESuperTypes().add(this.getOperator());
		matchEClass.getESuperTypes().add(this.getBooleanOperator());
		comparisonEClass.getESuperTypes().add(this.getBooleanOperator());
		operatorListEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		containsEClass.getESuperTypes().add(this.getBooleanOperator());
		nullCheckEClass.getESuperTypes().add(this.getBooleanOperator());
		stringLengthEClass.getESuperTypes().add(this.getBooleanOperator());

		// Initialize classes, features, and operations; add parameters
		initEClass(booleanOperatorEClass, BooleanOperator.class, "BooleanOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanOperator_Nodes(), theGraphstructurePackage.getNode(), theGraphstructurePackage.getNode_Predicates(), "nodes", null, 0, -1, BooleanOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBooleanOperator__CreateParameters(), null, "createParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getBooleanOperator__AddElement__Node(), null, "addElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphstructurePackage.getNode(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBooleanOperator__RemoveElement__Node(), null, "removeElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphstructurePackage.getNode(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBooleanOperator__GetElement(), theGraphstructurePackage.getNode(), "getElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBooleanOperator__GenerateXQueryIsolated(), ecorePackage.getEString(), "generateXQueryIsolated", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getBooleanOperator__GenerateSparqlIsolated(), ecorePackage.getEString(), "generateSparqlIsolated", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getBooleanOperator__GenerateCypherIsolated(), ecorePackage.getEString(), "generateCypherIsolated", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperator_OperatorList(), this.getOperatorList(), this.getOperatorList_Operators(), "operatorList", null, 1, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOperator__Validate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperator__GetArguments(), theGraphstructurePackage.getComparable(), "getArguments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperator__GetRootBooleanOperators(), this.getBooleanOperator(), "getRootBooleanOperators", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOperator__IsCycleFree(), null, "isCycleFree", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getOperatorCycleExceptionWrapper());

		op = initEOperation(getOperator__IsCycleFree__EList(), null, "isCycleFree", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperator(), "visitedOperators", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getOperatorCycleExceptionWrapper());

		initEClass(numberOperatorEClass, NumberOperator.class, "NumberOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(matchEClass, Match.class, "Match", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatch_PrimitiveNode(), theGraphstructurePackage.getPrimitiveNode(), theGraphstructurePackage.getPrimitiveNode_Match(), "primitiveNode", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Option(), theParametersPackage.getBooleanParam(), theParametersPackage.getBooleanParam_Matches(), "option", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_RegularExpression(), theParametersPackage.getTextParam(), theParametersPackage.getTextParam_Matches(), "regularExpression", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonEClass, Comparison.class, "Comparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparison_Argument1(), theGraphstructurePackage.getComparable(), theGraphstructurePackage.getComparable_Comparison1(), "argument1", null, 0, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparison_Argument2(), theGraphstructurePackage.getComparable(), theGraphstructurePackage.getComparable_Comparison2(), "argument2", null, 0, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparison_Option(), theParametersPackage.getComparisonOptionParam(), theParametersPackage.getComparisonOptionParam_Comparisons(), "option", null, 1, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparison_TypeOption(), theParametersPackage.getTypeOptionParam(), theParametersPackage.getTypeOptionParam_TypeComparisons(), "typeOption", null, 1, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComparison__IsPrimitive(), ecorePackage.getEBoolean(), "isPrimitive", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getComparison__Copy(), this.getComparison(), "copy", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(operatorListEClass, OperatorList.class, "OperatorList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperatorList_Graph(), theGraphstructurePackage.getGraph(), theGraphstructurePackage.getGraph_OperatorList(), "graph", null, 1, 1, OperatorList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatorList_Operators(), this.getOperator(), this.getOperator_OperatorList(), "operators", null, 0, -1, OperatorList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOperatorList__Add__Operator(), null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperator(), "Operator", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(containsEClass, Contains.class, "Contains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContains_PrimitiveNode(), theGraphstructurePackage.getPrimitiveNode(), theGraphstructurePackage.getPrimitiveNode_Contains(), "primitiveNode", null, 0, 1, Contains.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContains_Option(), theParametersPackage.getBooleanParam(), theParametersPackage.getBooleanParam_Contains(), "option", null, 1, 1, Contains.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContains_Content(), theParametersPackage.getTextParam(), theParametersPackage.getTextParam_Contains(), "content", null, 1, 1, Contains.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullCheckEClass, NullCheck.class, "NullCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNullCheck_PrimitiveNode(), theGraphstructurePackage.getPrimitiveNode(), theGraphstructurePackage.getPrimitiveNode_NullCheck(), "primitiveNode", null, 0, 1, NullCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNullCheck_Option(), theParametersPackage.getBooleanParam(), theParametersPackage.getBooleanParam_NullCheck(), "option", null, 0, 1, NullCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringLengthEClass, StringLength.class, "StringLength", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringLength_PrimitiveNode(), theGraphstructurePackage.getPrimitiveNode(), theGraphstructurePackage.getPrimitiveNode_StringLength(), "primitiveNode", null, 0, 1, StringLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringLength_Number(), theParametersPackage.getNumberParam(), theParametersPackage.getNumberParam_StringLength(), "number", null, 0, 1, StringLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringLength_Option(), theParametersPackage.getComparisonOptionParam(), theParametersPackage.getComparisonOptionParam_StringLength(), "option", null, 0, 1, StringLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparisonOperatorEEnum, ComparisonOperator.class, "ComparisonOperator");
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.EQUAL);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATEROREQUAL);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESSOREQUAL);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.NOTEQUAL);

		// Initialize data types
		initEDataType(operatorCycleExceptionWrapperEDataType, OperatorCycleException.class, "OperatorCycleExceptionWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OperatorsPackageImpl

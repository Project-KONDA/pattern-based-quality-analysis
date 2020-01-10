/**
 */
package qualitypatternmodel.functions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import qualitypatternmodel.graphstructure.GraphstructurePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.functions.FunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "functions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "functions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "functions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionsPackage eINSTANCE = qualitypatternmodel.functions.impl.FunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.functions.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.functions.impl.OperatorImpl
	 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__ID = GraphstructurePackage.GRAPH_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = GraphstructurePackage.GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___TO_XQUERY__LOCATION = GraphstructurePackage.GRAPH_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_ALL_VARIABLES = GraphstructurePackage.GRAPH_ELEMENT___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___IS_VALID__BOOLEAN_INT = GraphstructurePackage.GRAPH_ELEMENT___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_RETURN_TYPE = GraphstructurePackage.GRAPH_ELEMENT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_ALL_OPERATORS = GraphstructurePackage.GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = GraphstructurePackage.GRAPH_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.functions.impl.BooleanOperatorImpl <em>Boolean Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.functions.impl.BooleanOperatorImpl
	 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__ID = OPERATOR__ID;

	/**
	 * The number of structural features of the '<em>Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___TO_XQUERY__LOCATION = OPERATOR___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___GET_ALL_VARIABLES = OPERATOR___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___IS_VALID__BOOLEAN_INT = OPERATOR___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___GET_RETURN_TYPE = OPERATOR___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___GET_ALL_OPERATORS = OPERATOR___GET_ALL_OPERATORS;

	/**
	 * The number of operations of the '<em>Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.functions.impl.NumberOperatorsImpl <em>Number Operators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.functions.impl.NumberOperatorsImpl
	 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getNumberOperators()
	 * @generated
	 */
	int NUMBER_OPERATORS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATORS__ID = OPERATOR__ID;

	/**
	 * The number of structural features of the '<em>Number Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATORS_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATORS___TO_XQUERY__LOCATION = OPERATOR___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATORS___GET_ALL_VARIABLES = OPERATOR___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATORS___IS_VALID__BOOLEAN_INT = OPERATOR___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATORS___GET_RETURN_TYPE = OPERATOR___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATORS___GET_ALL_OPERATORS = OPERATOR___GET_ALL_OPERATORS;

	/**
	 * The number of operations of the '<em>Number Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATORS_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.functions.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.functions.impl.CountImpl
	 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ID = NUMBER_OPERATORS__ID;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ARGUMENT = NUMBER_OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = NUMBER_OPERATORS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT___TO_XQUERY__LOCATION = NUMBER_OPERATORS___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT___GET_ALL_VARIABLES = NUMBER_OPERATORS___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT___IS_VALID__BOOLEAN_INT = NUMBER_OPERATORS___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT___GET_RETURN_TYPE = NUMBER_OPERATORS___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT___GET_ALL_OPERATORS = NUMBER_OPERATORS___GET_ALL_OPERATORS;

	/**
	 * The number of operations of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OPERATION_COUNT = NUMBER_OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.functions.impl.OtherOperatorsImpl <em>Other Operators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.functions.impl.OtherOperatorsImpl
	 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getOtherOperators()
	 * @generated
	 */
	int OTHER_OPERATORS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATORS__ID = OPERATOR__ID;

	/**
	 * The number of structural features of the '<em>Other Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATORS_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATORS___TO_XQUERY__LOCATION = OPERATOR___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATORS___GET_ALL_VARIABLES = OPERATOR___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATORS___IS_VALID__BOOLEAN_INT = OPERATOR___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATORS___GET_RETURN_TYPE = OPERATOR___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATORS___GET_ALL_OPERATORS = OPERATOR___GET_ALL_OPERATORS;

	/**
	 * The number of operations of the '<em>Other Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATORS_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.functions.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.functions.impl.MatchImpl
	 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ID = BOOLEAN_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__PROPERTY = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regular Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__REGULAR_EXPRESSION = BOOLEAN_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__OPTION = BOOLEAN_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___TO_XQUERY__LOCATION = BOOLEAN_OPERATOR___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___GET_ALL_VARIABLES = BOOLEAN_OPERATOR___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___IS_VALID__BOOLEAN_INT = BOOLEAN_OPERATOR___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___GET_RETURN_TYPE = BOOLEAN_OPERATOR___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___GET_ALL_OPERATORS = BOOLEAN_OPERATOR___GET_ALL_OPERATORS;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.functions.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.functions.impl.ComparisonImpl
	 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__ID = BOOLEAN_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Argument1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__ARGUMENT1 = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__OPTION = BOOLEAN_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__ARGUMENT2 = BOOLEAN_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___TO_XQUERY__LOCATION = BOOLEAN_OPERATOR___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___GET_ALL_VARIABLES = BOOLEAN_OPERATOR___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___IS_VALID__BOOLEAN_INT = BOOLEAN_OPERATOR___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___GET_RETURN_TYPE = BOOLEAN_OPERATOR___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___GET_ALL_OPERATORS = BOOLEAN_OPERATOR___GET_ALL_OPERATORS;

	/**
	 * The number of operations of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.functions.impl.ToNumberImpl <em>To Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.functions.impl.ToNumberImpl
	 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getToNumber()
	 * @generated
	 */
	int TO_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER__ID = NUMBER_OPERATORS__ID;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER__PROPERTY = NUMBER_OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER_FEATURE_COUNT = NUMBER_OPERATORS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER___TO_XQUERY__LOCATION = NUMBER_OPERATORS___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER___GET_ALL_VARIABLES = NUMBER_OPERATORS___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER___IS_VALID__BOOLEAN_INT = NUMBER_OPERATORS___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER___GET_RETURN_TYPE = NUMBER_OPERATORS___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER___GET_ALL_OPERATORS = NUMBER_OPERATORS___GET_ALL_OPERATORS;

	/**
	 * The number of operations of the '<em>To Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER_OPERATION_COUNT = NUMBER_OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.functions.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.functions.ComparisonOperator
	 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 8;


	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.functions.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operator</em>'.
	 * @see qualitypatternmodel.functions.BooleanOperator
	 * @generated
	 */
	EClass getBooleanOperator();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.functions.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see qualitypatternmodel.functions.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.functions.Operator#getAllOperators() <em>Get All Operators</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Operators</em>' operation.
	 * @see qualitypatternmodel.functions.Operator#getAllOperators()
	 * @generated
	 */
	EOperation getOperator__GetAllOperators();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.functions.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see qualitypatternmodel.functions.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.functions.Count#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument</em>'.
	 * @see qualitypatternmodel.functions.Count#getArgument()
	 * @see #getCount()
	 * @generated
	 */
	EReference getCount_Argument();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.functions.OtherOperators <em>Other Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Operators</em>'.
	 * @see qualitypatternmodel.functions.OtherOperators
	 * @generated
	 */
	EClass getOtherOperators();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.functions.NumberOperators <em>Number Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Operators</em>'.
	 * @see qualitypatternmodel.functions.NumberOperators
	 * @generated
	 */
	EClass getNumberOperators();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.functions.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see qualitypatternmodel.functions.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.functions.Match#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see qualitypatternmodel.functions.Match#getProperty()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Property();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.functions.Match#getRegularExpression <em>Regular Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regular Expression</em>'.
	 * @see qualitypatternmodel.functions.Match#getRegularExpression()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_RegularExpression();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.functions.Match#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see qualitypatternmodel.functions.Match#getOption()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Option();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.functions.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see qualitypatternmodel.functions.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.functions.Comparison#getArgument1 <em>Argument1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument1</em>'.
	 * @see qualitypatternmodel.functions.Comparison#getArgument1()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_Argument1();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.functions.Comparison#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see qualitypatternmodel.functions.Comparison#getOption()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_Option();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.functions.Comparison#getArgument2 <em>Argument2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument2</em>'.
	 * @see qualitypatternmodel.functions.Comparison#getArgument2()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_Argument2();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.functions.ToNumber <em>To Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Number</em>'.
	 * @see qualitypatternmodel.functions.ToNumber
	 * @generated
	 */
	EClass getToNumber();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.functions.ToNumber#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see qualitypatternmodel.functions.ToNumber#getProperty()
	 * @see #getToNumber()
	 * @generated
	 */
	EReference getToNumber_Property();

	/**
	 * Returns the meta object for enum '{@link qualitypatternmodel.functions.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see qualitypatternmodel.functions.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionsFactory getFunctionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link qualitypatternmodel.functions.impl.BooleanOperatorImpl <em>Boolean Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.functions.impl.BooleanOperatorImpl
		 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EClass BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.functions.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.functions.impl.OperatorImpl
		 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Get All Operators</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR___GET_ALL_OPERATORS = eINSTANCE.getOperator__GetAllOperators();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.functions.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.functions.impl.CountImpl
		 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getCount()
		 * @generated
		 */
		EClass COUNT = eINSTANCE.getCount();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT__ARGUMENT = eINSTANCE.getCount_Argument();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.functions.impl.OtherOperatorsImpl <em>Other Operators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.functions.impl.OtherOperatorsImpl
		 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getOtherOperators()
		 * @generated
		 */
		EClass OTHER_OPERATORS = eINSTANCE.getOtherOperators();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.functions.impl.NumberOperatorsImpl <em>Number Operators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.functions.impl.NumberOperatorsImpl
		 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getNumberOperators()
		 * @generated
		 */
		EClass NUMBER_OPERATORS = eINSTANCE.getNumberOperators();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.functions.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.functions.impl.MatchImpl
		 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__PROPERTY = eINSTANCE.getMatch_Property();

		/**
		 * The meta object literal for the '<em><b>Regular Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__REGULAR_EXPRESSION = eINSTANCE.getMatch_RegularExpression();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__OPTION = eINSTANCE.getMatch_Option();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.functions.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.functions.impl.ComparisonImpl
		 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '<em><b>Argument1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__ARGUMENT1 = eINSTANCE.getComparison_Argument1();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__OPTION = eINSTANCE.getComparison_Option();

		/**
		 * The meta object literal for the '<em><b>Argument2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__ARGUMENT2 = eINSTANCE.getComparison_Argument2();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.functions.impl.ToNumberImpl <em>To Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.functions.impl.ToNumberImpl
		 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getToNumber()
		 * @generated
		 */
		EClass TO_NUMBER = eINSTANCE.getToNumber();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_NUMBER__PROPERTY = eINSTANCE.getToNumber_Property();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.functions.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.functions.ComparisonOperator
		 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

	}

} //FunctionsPackage

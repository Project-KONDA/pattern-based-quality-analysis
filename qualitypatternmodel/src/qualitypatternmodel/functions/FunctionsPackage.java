/**
 */
package qualitypatternmodel.functions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

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
	int OPERATOR__ID = GraphstructurePackage.COMPARABLE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__INTERNAL_ID = GraphstructurePackage.COMPARABLE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__COMPARISON1 = GraphstructurePackage.COMPARABLE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__COMPARISON2 = GraphstructurePackage.COMPARABLE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Operator List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OPERATOR_LIST = GraphstructurePackage.COMPARABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = GraphstructurePackage.COMPARABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___TO_XQUERY__LOCATION = GraphstructurePackage.COMPARABLE___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_ALL_INPUTS = GraphstructurePackage.COMPARABLE___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___PREPARE_TRANSLATION = GraphstructurePackage.COMPARABLE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___IS_VALID__BOOLEAN = GraphstructurePackage.COMPARABLE___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___IS_VALID_LOCAL__BOOLEAN = GraphstructurePackage.COMPARABLE___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_CONTAINER = GraphstructurePackage.COMPARABLE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_ANCESTOR__CLASS = GraphstructurePackage.COMPARABLE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___MY_TO_STRING = GraphstructurePackage.COMPARABLE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_RETURN_TYPE = GraphstructurePackage.COMPARABLE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___IS_TRANSLATABLE = GraphstructurePackage.COMPARABLE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_ALL_ARGUMENT_ELEMENTS = GraphstructurePackage.COMPARABLE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_ALL_OPERATORS = GraphstructurePackage.COMPARABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Root Boolean Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_ROOT_BOOLEAN_OPERATORS = GraphstructurePackage.COMPARABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___IS_CYCLE_FREE__ELIST = GraphstructurePackage.COMPARABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___IS_CYCLE_FREE = GraphstructurePackage.COMPARABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_ARGUMENTS = GraphstructurePackage.COMPARABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.COMPARABLE_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = GraphstructurePackage.COMPARABLE_OPERATION_COUNT + 6;

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
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__INTERNAL_ID = OPERATOR__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__COMPARISON1 = OPERATOR__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__COMPARISON2 = OPERATOR__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Operator List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__OPERATOR_LIST = OPERATOR__OPERATOR_LIST;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__ELEMENTS = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___TO_XQUERY__LOCATION = OPERATOR___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___GET_ALL_INPUTS = OPERATOR___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___PREPARE_TRANSLATION = OPERATOR___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___IS_VALID__BOOLEAN = OPERATOR___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___IS_VALID_LOCAL__BOOLEAN = OPERATOR___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___GET_CONTAINER = OPERATOR___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___GET_ANCESTOR__CLASS = OPERATOR___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___MY_TO_STRING = OPERATOR___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___GET_RETURN_TYPE = OPERATOR___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___IS_TRANSLATABLE = OPERATOR___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___GET_ALL_ARGUMENT_ELEMENTS = OPERATOR___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___GET_ALL_OPERATORS = OPERATOR___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Root Boolean Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___GET_ROOT_BOOLEAN_OPERATORS = OPERATOR___GET_ROOT_BOOLEAN_OPERATORS;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___IS_CYCLE_FREE__ELIST = OPERATOR___IS_CYCLE_FREE__ELIST;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___IS_CYCLE_FREE = OPERATOR___IS_CYCLE_FREE;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___GET_ARGUMENTS = OPERATOR___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___ADD_ELEMENT__ELEMENT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___REMOVE_ELEMENT__ELEMENT = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___CREATE_INPUTS = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Remove Inputs From Variable List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___REMOVE_INPUTS_FROM_VARIABLE_LIST = OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___RESET = OPERATOR_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.functions.impl.NumberOperatorImpl <em>Number Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.functions.impl.NumberOperatorImpl
	 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getNumberOperator()
	 * @generated
	 */
	int NUMBER_OPERATOR = 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.functions.impl.OtherOperatorImpl <em>Other Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.functions.impl.OtherOperatorImpl
	 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getOtherOperator()
	 * @generated
	 */
	int OTHER_OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR__ID = OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR__INTERNAL_ID = OPERATOR__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR__COMPARISON1 = OPERATOR__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR__COMPARISON2 = OPERATOR__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Operator List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR__OPERATOR_LIST = OPERATOR__OPERATOR_LIST;

	/**
	 * The number of structural features of the '<em>Other Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___TO_XQUERY__LOCATION = OPERATOR___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___GET_ALL_INPUTS = OPERATOR___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___PREPARE_TRANSLATION = OPERATOR___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___IS_VALID__BOOLEAN = OPERATOR___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___IS_VALID_LOCAL__BOOLEAN = OPERATOR___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___GET_CONTAINER = OPERATOR___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___GET_ANCESTOR__CLASS = OPERATOR___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___MY_TO_STRING = OPERATOR___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___GET_RETURN_TYPE = OPERATOR___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___IS_TRANSLATABLE = OPERATOR___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___GET_ALL_ARGUMENT_ELEMENTS = OPERATOR___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___GET_ALL_OPERATORS = OPERATOR___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Root Boolean Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___GET_ROOT_BOOLEAN_OPERATORS = OPERATOR___GET_ROOT_BOOLEAN_OPERATORS;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___IS_CYCLE_FREE__ELIST = OPERATOR___IS_CYCLE_FREE__ELIST;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___IS_CYCLE_FREE = OPERATOR___IS_CYCLE_FREE;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___GET_ARGUMENTS = OPERATOR___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Other Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR__ID = OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR__INTERNAL_ID = OPERATOR__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR__COMPARISON1 = OPERATOR__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR__COMPARISON2 = OPERATOR__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Operator List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR__OPERATOR_LIST = OPERATOR__OPERATOR_LIST;

	/**
	 * The number of structural features of the '<em>Number Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___TO_XQUERY__LOCATION = OPERATOR___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___GET_ALL_INPUTS = OPERATOR___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___PREPARE_TRANSLATION = OPERATOR___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___IS_VALID__BOOLEAN = OPERATOR___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___IS_VALID_LOCAL__BOOLEAN = OPERATOR___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___GET_CONTAINER = OPERATOR___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___GET_ANCESTOR__CLASS = OPERATOR___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___MY_TO_STRING = OPERATOR___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___GET_RETURN_TYPE = OPERATOR___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___IS_TRANSLATABLE = OPERATOR___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___GET_ALL_ARGUMENT_ELEMENTS = OPERATOR___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___GET_ALL_OPERATORS = OPERATOR___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Root Boolean Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___GET_ROOT_BOOLEAN_OPERATORS = OPERATOR___GET_ROOT_BOOLEAN_OPERATORS;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___IS_CYCLE_FREE__ELIST = OPERATOR___IS_CYCLE_FREE__ELIST;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___IS_CYCLE_FREE = OPERATOR___IS_CYCLE_FREE;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___GET_ARGUMENTS = OPERATOR___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Number Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.functions.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.functions.impl.MatchImpl
	 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ID = BOOLEAN_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__INTERNAL_ID = BOOLEAN_OPERATOR__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__COMPARISON1 = BOOLEAN_OPERATOR__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__COMPARISON2 = BOOLEAN_OPERATOR__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Operator List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__OPERATOR_LIST = BOOLEAN_OPERATOR__OPERATOR_LIST;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ELEMENTS = BOOLEAN_OPERATOR__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__PROPERTY = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__OPTION = BOOLEAN_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regular Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__REGULAR_EXPRESSION = BOOLEAN_OPERATOR_FEATURE_COUNT + 2;

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
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___GET_ALL_INPUTS = BOOLEAN_OPERATOR___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___PREPARE_TRANSLATION = BOOLEAN_OPERATOR___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___IS_VALID__BOOLEAN = BOOLEAN_OPERATOR___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___IS_VALID_LOCAL__BOOLEAN = BOOLEAN_OPERATOR___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___GET_CONTAINER = BOOLEAN_OPERATOR___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___GET_ANCESTOR__CLASS = BOOLEAN_OPERATOR___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___MY_TO_STRING = BOOLEAN_OPERATOR___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___GET_RETURN_TYPE = BOOLEAN_OPERATOR___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___IS_TRANSLATABLE = BOOLEAN_OPERATOR___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___GET_ALL_ARGUMENT_ELEMENTS = BOOLEAN_OPERATOR___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___GET_ALL_OPERATORS = BOOLEAN_OPERATOR___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Root Boolean Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___GET_ROOT_BOOLEAN_OPERATORS = BOOLEAN_OPERATOR___GET_ROOT_BOOLEAN_OPERATORS;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___IS_CYCLE_FREE__ELIST = BOOLEAN_OPERATOR___IS_CYCLE_FREE__ELIST;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___IS_CYCLE_FREE = BOOLEAN_OPERATOR___IS_CYCLE_FREE;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___GET_ARGUMENTS = BOOLEAN_OPERATOR___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___VALIDATE__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___ADD_ELEMENT__ELEMENT = BOOLEAN_OPERATOR___ADD_ELEMENT__ELEMENT;

	/**
	 * The operation id for the '<em>Remove Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___REMOVE_ELEMENT__ELEMENT = BOOLEAN_OPERATOR___REMOVE_ELEMENT__ELEMENT;

	/**
	 * The operation id for the '<em>Create Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___CREATE_INPUTS = BOOLEAN_OPERATOR___CREATE_INPUTS;

	/**
	 * The operation id for the '<em>Remove Inputs From Variable List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___REMOVE_INPUTS_FROM_VARIABLE_LIST = BOOLEAN_OPERATOR___REMOVE_INPUTS_FROM_VARIABLE_LIST;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___RESET = BOOLEAN_OPERATOR___RESET;

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
	int COMPARISON = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__ID = BOOLEAN_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__INTERNAL_ID = BOOLEAN_OPERATOR__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__COMPARISON1 = BOOLEAN_OPERATOR__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__COMPARISON2 = BOOLEAN_OPERATOR__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Operator List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__OPERATOR_LIST = BOOLEAN_OPERATOR__OPERATOR_LIST;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__ELEMENTS = BOOLEAN_OPERATOR__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Argument1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__ARGUMENT1 = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__ARGUMENT2 = BOOLEAN_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__TYPE = BOOLEAN_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__OPTION = BOOLEAN_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___TO_XQUERY__LOCATION = BOOLEAN_OPERATOR___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___GET_ALL_INPUTS = BOOLEAN_OPERATOR___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___PREPARE_TRANSLATION = BOOLEAN_OPERATOR___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___IS_VALID__BOOLEAN = BOOLEAN_OPERATOR___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___IS_VALID_LOCAL__BOOLEAN = BOOLEAN_OPERATOR___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___GET_CONTAINER = BOOLEAN_OPERATOR___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___GET_ANCESTOR__CLASS = BOOLEAN_OPERATOR___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___MY_TO_STRING = BOOLEAN_OPERATOR___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___GET_RETURN_TYPE = BOOLEAN_OPERATOR___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___IS_TRANSLATABLE = BOOLEAN_OPERATOR___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___GET_ALL_ARGUMENT_ELEMENTS = BOOLEAN_OPERATOR___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___GET_ALL_OPERATORS = BOOLEAN_OPERATOR___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Root Boolean Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___GET_ROOT_BOOLEAN_OPERATORS = BOOLEAN_OPERATOR___GET_ROOT_BOOLEAN_OPERATORS;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___IS_CYCLE_FREE__ELIST = BOOLEAN_OPERATOR___IS_CYCLE_FREE__ELIST;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___IS_CYCLE_FREE = BOOLEAN_OPERATOR___IS_CYCLE_FREE;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___GET_ARGUMENTS = BOOLEAN_OPERATOR___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___VALIDATE__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___ADD_ELEMENT__ELEMENT = BOOLEAN_OPERATOR___ADD_ELEMENT__ELEMENT;

	/**
	 * The operation id for the '<em>Remove Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___REMOVE_ELEMENT__ELEMENT = BOOLEAN_OPERATOR___REMOVE_ELEMENT__ELEMENT;

	/**
	 * The operation id for the '<em>Create Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___CREATE_INPUTS = BOOLEAN_OPERATOR___CREATE_INPUTS;

	/**
	 * The operation id for the '<em>Remove Inputs From Variable List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___REMOVE_INPUTS_FROM_VARIABLE_LIST = BOOLEAN_OPERATOR___REMOVE_INPUTS_FROM_VARIABLE_LIST;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___RESET = BOOLEAN_OPERATOR___RESET;

	/**
	 * The operation id for the '<em>Set Type According To Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___SET_TYPE_ACCORDING_TO_ARGUMENT__COMPARABLE_COMPARABLE = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.functions.impl.OperatorListImpl <em>Operator List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.functions.impl.OperatorListImpl
	 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getOperatorList()
	 * @generated
	 */
	int OPERATOR_LIST = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST__ID = PatternstructurePackage.PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST__INTERNAL_ID = PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST__GRAPH = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST__OPERATORS = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operator List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST___TO_XQUERY__LOCATION = PatternstructurePackage.PATTERN_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST___GET_ALL_INPUTS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST___IS_VALID__BOOLEAN = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST___IS_VALID_LOCAL__BOOLEAN = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST___GET_CONTAINER = PatternstructurePackage.PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST___GET_ANCESTOR__CLASS = PatternstructurePackage.PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST___MY_TO_STRING = PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST___ADD__OPERATOR = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operator List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.functions.impl.ReferenceOperatorImpl <em>Reference Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.functions.impl.ReferenceOperatorImpl
	 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getReferenceOperator()
	 * @generated
	 */
	int REFERENCE_OPERATOR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR__ID = BOOLEAN_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR__INTERNAL_ID = BOOLEAN_OPERATOR__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR__COMPARISON1 = BOOLEAN_OPERATOR__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR__COMPARISON2 = BOOLEAN_OPERATOR__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Operator List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR__OPERATOR_LIST = BOOLEAN_OPERATOR__OPERATOR_LIST;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR__ELEMENTS = BOOLEAN_OPERATOR__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Property2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR__PROPERTY2 = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR__PROPERTY = BOOLEAN_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR__TYPE = BOOLEAN_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reference Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___TO_XQUERY__LOCATION = BOOLEAN_OPERATOR___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___GET_ALL_INPUTS = BOOLEAN_OPERATOR___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___PREPARE_TRANSLATION = BOOLEAN_OPERATOR___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___IS_VALID__BOOLEAN = BOOLEAN_OPERATOR___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___IS_VALID_LOCAL__BOOLEAN = BOOLEAN_OPERATOR___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___GET_CONTAINER = BOOLEAN_OPERATOR___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___GET_ANCESTOR__CLASS = BOOLEAN_OPERATOR___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___MY_TO_STRING = BOOLEAN_OPERATOR___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___GET_RETURN_TYPE = BOOLEAN_OPERATOR___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___IS_TRANSLATABLE = BOOLEAN_OPERATOR___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___GET_ALL_ARGUMENT_ELEMENTS = BOOLEAN_OPERATOR___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___GET_ALL_OPERATORS = BOOLEAN_OPERATOR___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Root Boolean Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___GET_ROOT_BOOLEAN_OPERATORS = BOOLEAN_OPERATOR___GET_ROOT_BOOLEAN_OPERATORS;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___IS_CYCLE_FREE__ELIST = BOOLEAN_OPERATOR___IS_CYCLE_FREE__ELIST;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___IS_CYCLE_FREE = BOOLEAN_OPERATOR___IS_CYCLE_FREE;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___GET_ARGUMENTS = BOOLEAN_OPERATOR___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___ADD_ELEMENT__ELEMENT = BOOLEAN_OPERATOR___ADD_ELEMENT__ELEMENT;

	/**
	 * The operation id for the '<em>Remove Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___REMOVE_ELEMENT__ELEMENT = BOOLEAN_OPERATOR___REMOVE_ELEMENT__ELEMENT;

	/**
	 * The operation id for the '<em>Create Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___CREATE_INPUTS = BOOLEAN_OPERATOR___CREATE_INPUTS;

	/**
	 * The operation id for the '<em>Remove Inputs From Variable List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___REMOVE_INPUTS_FROM_VARIABLE_LIST = BOOLEAN_OPERATOR___REMOVE_INPUTS_FROM_VARIABLE_LIST;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR___RESET = BOOLEAN_OPERATOR___RESET;

	/**
	 * The number of operations of the '<em>Reference Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATOR_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

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
	 * The meta object id for the '<em>Operator Cycle Exception Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.exceptions.OperatorCycleException
	 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getOperatorCycleExceptionWrapper()
	 * @generated
	 */
	int OPERATOR_CYCLE_EXCEPTION_WRAPPER = 9;

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
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.functions.BooleanOperator#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see qualitypatternmodel.functions.BooleanOperator#getElements()
	 * @see #getBooleanOperator()
	 * @generated
	 */
	EReference getBooleanOperator_Elements();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.functions.BooleanOperator#addElement(qualitypatternmodel.graphstructure.Element) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see qualitypatternmodel.functions.BooleanOperator#addElement(qualitypatternmodel.graphstructure.Element)
	 * @generated
	 */
	EOperation getBooleanOperator__AddElement__Element();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.functions.BooleanOperator#removeElement(qualitypatternmodel.graphstructure.Element) <em>Remove Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Element</em>' operation.
	 * @see qualitypatternmodel.functions.BooleanOperator#removeElement(qualitypatternmodel.graphstructure.Element)
	 * @generated
	 */
	EOperation getBooleanOperator__RemoveElement__Element();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.functions.BooleanOperator#createInputs() <em>Create Inputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Inputs</em>' operation.
	 * @see qualitypatternmodel.functions.BooleanOperator#createInputs()
	 * @generated
	 */
	EOperation getBooleanOperator__CreateInputs();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.functions.BooleanOperator#removeInputsFromVariableList() <em>Remove Inputs From Variable List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Inputs From Variable List</em>' operation.
	 * @see qualitypatternmodel.functions.BooleanOperator#removeInputsFromVariableList()
	 * @generated
	 */
	EOperation getBooleanOperator__RemoveInputsFromVariableList();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.functions.BooleanOperator#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see qualitypatternmodel.functions.BooleanOperator#reset()
	 * @generated
	 */
	EOperation getBooleanOperator__Reset();

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
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.functions.Operator#getOperatorList <em>Operator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operator List</em>'.
	 * @see qualitypatternmodel.functions.Operator#getOperatorList()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_OperatorList();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.functions.Operator#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qualitypatternmodel.functions.Operator#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperator__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.functions.Operator#getRootBooleanOperators() <em>Get Root Boolean Operators</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Boolean Operators</em>' operation.
	 * @see qualitypatternmodel.functions.Operator#getRootBooleanOperators()
	 * @generated
	 */
	EOperation getOperator__GetRootBooleanOperators();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.functions.Operator#isCycleFree(org.eclipse.emf.common.util.EList) <em>Is Cycle Free</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Cycle Free</em>' operation.
	 * @see qualitypatternmodel.functions.Operator#isCycleFree(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getOperator__IsCycleFree__EList();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.functions.Operator#isCycleFree() <em>Is Cycle Free</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Cycle Free</em>' operation.
	 * @see qualitypatternmodel.functions.Operator#isCycleFree()
	 * @generated
	 */
	EOperation getOperator__IsCycleFree();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.functions.Operator#getArguments() <em>Get Arguments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arguments</em>' operation.
	 * @see qualitypatternmodel.functions.Operator#getArguments()
	 * @generated
	 */
	EOperation getOperator__GetArguments();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.functions.OtherOperator <em>Other Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Operator</em>'.
	 * @see qualitypatternmodel.functions.OtherOperator
	 * @generated
	 */
	EClass getOtherOperator();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.functions.NumberOperator <em>Number Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Operator</em>'.
	 * @see qualitypatternmodel.functions.NumberOperator
	 * @generated
	 */
	EClass getNumberOperator();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.functions.Comparison#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see qualitypatternmodel.functions.Comparison#getType()
	 * @see #getComparison()
	 * @generated
	 */
	EAttribute getComparison_Type();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.functions.Comparison#setTypeAccordingToArgument(qualitypatternmodel.graphstructure.Comparable, qualitypatternmodel.graphstructure.Comparable) <em>Set Type According To Argument</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Type According To Argument</em>' operation.
	 * @see qualitypatternmodel.functions.Comparison#setTypeAccordingToArgument(qualitypatternmodel.graphstructure.Comparable, qualitypatternmodel.graphstructure.Comparable)
	 * @generated
	 */
	EOperation getComparison__SetTypeAccordingToArgument__Comparable_Comparable();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.functions.OperatorList <em>Operator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator List</em>'.
	 * @see qualitypatternmodel.functions.OperatorList
	 * @generated
	 */
	EClass getOperatorList();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.functions.OperatorList#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operators</em>'.
	 * @see qualitypatternmodel.functions.OperatorList#getOperators()
	 * @see #getOperatorList()
	 * @generated
	 */
	EReference getOperatorList_Operators();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.functions.OperatorList#add(qualitypatternmodel.functions.Operator) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see qualitypatternmodel.functions.OperatorList#add(qualitypatternmodel.functions.Operator)
	 * @generated
	 */
	EOperation getOperatorList__Add__Operator();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.functions.ReferenceOperator <em>Reference Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Operator</em>'.
	 * @see qualitypatternmodel.functions.ReferenceOperator
	 * @generated
	 */
	EClass getReferenceOperator();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.functions.ReferenceOperator#getProperty2 <em>Property2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property2</em>'.
	 * @see qualitypatternmodel.functions.ReferenceOperator#getProperty2()
	 * @see #getReferenceOperator()
	 * @generated
	 */
	EReference getReferenceOperator_Property2();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.functions.ReferenceOperator#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see qualitypatternmodel.functions.ReferenceOperator#getProperty()
	 * @see #getReferenceOperator()
	 * @generated
	 */
	EReference getReferenceOperator_Property();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.functions.ReferenceOperator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see qualitypatternmodel.functions.ReferenceOperator#getType()
	 * @see #getReferenceOperator()
	 * @generated
	 */
	EAttribute getReferenceOperator_Type();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.functions.OperatorList#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see qualitypatternmodel.functions.OperatorList#getGraph()
	 * @see #getOperatorList()
	 * @generated
	 */
	EReference getOperatorList_Graph();

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
	 * Returns the meta object for data type '{@link qualitypatternmodel.exceptions.OperatorCycleException <em>Operator Cycle Exception Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operator Cycle Exception Wrapper</em>'.
	 * @see qualitypatternmodel.exceptions.OperatorCycleException
	 * @model instanceClass="qualitypatternmodel.exceptions.OperatorCycleException"
	 * @generated
	 */
	EDataType getOperatorCycleExceptionWrapper();

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
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_OPERATOR__ELEMENTS = eINSTANCE.getBooleanOperator_Elements();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_OPERATOR___ADD_ELEMENT__ELEMENT = eINSTANCE.getBooleanOperator__AddElement__Element();

		/**
		 * The meta object literal for the '<em><b>Remove Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_OPERATOR___REMOVE_ELEMENT__ELEMENT = eINSTANCE.getBooleanOperator__RemoveElement__Element();

		/**
		 * The meta object literal for the '<em><b>Create Inputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_OPERATOR___CREATE_INPUTS = eINSTANCE.getBooleanOperator__CreateInputs();

		/**
		 * The meta object literal for the '<em><b>Remove Inputs From Variable List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_OPERATOR___REMOVE_INPUTS_FROM_VARIABLE_LIST = eINSTANCE.getBooleanOperator__RemoveInputsFromVariableList();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_OPERATOR___RESET = eINSTANCE.getBooleanOperator__Reset();

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
		 * The meta object literal for the '<em><b>Operator List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__OPERATOR_LIST = eINSTANCE.getOperator_OperatorList();

		/**
		 * The meta object literal for the '<em><b>Get All Operators</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR___GET_ALL_OPERATORS = eINSTANCE.getOperator__GetAllOperators();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOperator__Validate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Get Root Boolean Operators</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR___GET_ROOT_BOOLEAN_OPERATORS = eINSTANCE.getOperator__GetRootBooleanOperators();

		/**
		 * The meta object literal for the '<em><b>Is Cycle Free</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR___IS_CYCLE_FREE__ELIST = eINSTANCE.getOperator__IsCycleFree__EList();

		/**
		 * The meta object literal for the '<em><b>Is Cycle Free</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR___IS_CYCLE_FREE = eINSTANCE.getOperator__IsCycleFree();

		/**
		 * The meta object literal for the '<em><b>Get Arguments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR___GET_ARGUMENTS = eINSTANCE.getOperator__GetArguments();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.functions.impl.OtherOperatorImpl <em>Other Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.functions.impl.OtherOperatorImpl
		 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getOtherOperator()
		 * @generated
		 */
		EClass OTHER_OPERATOR = eINSTANCE.getOtherOperator();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.functions.impl.NumberOperatorImpl <em>Number Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.functions.impl.NumberOperatorImpl
		 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getNumberOperator()
		 * @generated
		 */
		EClass NUMBER_OPERATOR = eINSTANCE.getNumberOperator();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__TYPE = eINSTANCE.getComparison_Type();

		/**
		 * The meta object literal for the '<em><b>Set Type According To Argument</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARISON___SET_TYPE_ACCORDING_TO_ARGUMENT__COMPARABLE_COMPARABLE = eINSTANCE.getComparison__SetTypeAccordingToArgument__Comparable_Comparable();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.functions.impl.OperatorListImpl <em>Operator List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.functions.impl.OperatorListImpl
		 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getOperatorList()
		 * @generated
		 */
		EClass OPERATOR_LIST = eINSTANCE.getOperatorList();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_LIST__OPERATORS = eINSTANCE.getOperatorList_Operators();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR_LIST___ADD__OPERATOR = eINSTANCE.getOperatorList__Add__Operator();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.functions.impl.ReferenceOperatorImpl <em>Reference Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.functions.impl.ReferenceOperatorImpl
		 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getReferenceOperator()
		 * @generated
		 */
		EClass REFERENCE_OPERATOR = eINSTANCE.getReferenceOperator();

		/**
		 * The meta object literal for the '<em><b>Property2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_OPERATOR__PROPERTY2 = eINSTANCE.getReferenceOperator_Property2();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_OPERATOR__PROPERTY = eINSTANCE.getReferenceOperator_Property();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_OPERATOR__TYPE = eINSTANCE.getReferenceOperator_Type();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_LIST__GRAPH = eINSTANCE.getOperatorList_Graph();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.functions.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.functions.ComparisonOperator
		 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '<em>Operator Cycle Exception Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.exceptions.OperatorCycleException
		 * @see qualitypatternmodel.functions.impl.FunctionsPackageImpl#getOperatorCycleExceptionWrapper()
		 * @generated
		 */
		EDataType OPERATOR_CYCLE_EXCEPTION_WRAPPER = eINSTANCE.getOperatorCycleExceptionWrapper();

	}

} //FunctionsPackage

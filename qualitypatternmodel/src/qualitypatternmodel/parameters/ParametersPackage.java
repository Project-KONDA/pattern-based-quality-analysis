/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
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
 * @see qualitypatternmodel.parameters.ParametersFactory
 * @model kind="package"
 * @generated
 */
public interface ParametersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "parameters";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "parameters";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "parameters";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParametersPackage eINSTANCE = qualitypatternmodel.parameters.impl.ParametersPackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.ParameterImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = PatternstructurePackage.PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INTERNAL_ID = PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_LIST = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_PREDEFINED = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Described</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIBED = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_QUERY__LOCATION = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_ALL_INPUTS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_VALID__BOOLEAN = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_VALID_LOCAL__BOOLEAN = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_CONTAINER = PatternstructurePackage.PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_ANCESTOR__CLASS = PatternstructurePackage.PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___MY_TO_STRING = PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST = PatternstructurePackage.PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_PARAMETER_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___UPDATE_OPERATORS__OPERATORLIST = PatternstructurePackage.PATTERN_ELEMENT___UPDATE_OPERATORS__OPERATORLIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_OPERATOR_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___CREATE_XML_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___FINALIZE_XML_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___INPUT_IS_VALID = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_DESCRIPTION = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl <em>Comparison Option Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getComparisonOptionParam()
	 * @generated
	 */
	int COMPARISON_OPTION_PARAM = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM__INTERNAL_ID = PARAMETER__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM__PARAMETER_LIST = PARAMETER__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM__IS_PREDEFINED = PARAMETER__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Described</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM__DESCRIBED = PARAMETER__DESCRIBED;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM__OPTIONS = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM__VALUE = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comparisons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM__COMPARISONS = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Count Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM__COUNT_CONDITION = PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Comparison Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GENERATE_QUERY__LOCATION = PARAMETER___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GET_ALL_INPUTS = PARAMETER___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___PREPARE_TRANSLATION = PARAMETER___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___IS_VALID__BOOLEAN = PARAMETER___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___IS_VALID_LOCAL__BOOLEAN = PARAMETER___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GET_CONTAINER = PARAMETER___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GET_ANCESTOR__CLASS = PARAMETER___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___MY_TO_STRING = PARAMETER___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GET_PARAMETER_LIST = PARAMETER___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___UPDATE_OPERATORS__OPERATORLIST = PARAMETER___UPDATE_OPERATORS__OPERATORLIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GET_OPERATOR_LIST = PARAMETER___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___CREATE_XML_ADAPTION = PARAMETER___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___FINALIZE_XML_ADAPTION = PARAMETER___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___INPUT_IS_VALID = PARAMETER___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GENERATE_DESCRIPTION = PARAMETER___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Comparison Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.PropertyOptionParamImpl <em>Property Option Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.PropertyOptionParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getPropertyOptionParam()
	 * @generated
	 */
	int PROPERTY_OPTION_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM__INTERNAL_ID = PARAMETER__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM__PARAMETER_LIST = PARAMETER__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM__IS_PREDEFINED = PARAMETER__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Described</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM__DESCRIBED = PARAMETER__DESCRIBED;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM__OPTIONS = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM__VALUE = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM__PROPERTIES = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___GENERATE_QUERY__LOCATION = PARAMETER___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___GET_ALL_INPUTS = PARAMETER___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___PREPARE_TRANSLATION = PARAMETER___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___IS_VALID__BOOLEAN = PARAMETER___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___IS_VALID_LOCAL__BOOLEAN = PARAMETER___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___GET_CONTAINER = PARAMETER___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___GET_ANCESTOR__CLASS = PARAMETER___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___MY_TO_STRING = PARAMETER___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___GET_PARAMETER_LIST = PARAMETER___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___UPDATE_OPERATORS__OPERATORLIST = PARAMETER___UPDATE_OPERATORS__OPERATORLIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___GET_OPERATOR_LIST = PARAMETER___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___CREATE_XML_ADAPTION = PARAMETER___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___FINALIZE_XML_ADAPTION = PARAMETER___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___INPUT_IS_VALID = PARAMETER___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___GENERATE_DESCRIPTION = PARAMETER___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Property Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPTION_PARAM_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.ParameterListImpl <em>Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.ParameterListImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getParameterList()
	 * @generated
	 */
	int PARAMETER_LIST = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__ID = PatternstructurePackage.PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__INTERNAL_ID = PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__PARAMETERS = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__PATTERN = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GENERATE_QUERY__LOCATION = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GET_ALL_INPUTS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___IS_VALID__BOOLEAN = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___IS_VALID_LOCAL__BOOLEAN = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GET_CONTAINER = PatternstructurePackage.PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GET_ANCESTOR__CLASS = PatternstructurePackage.PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___MY_TO_STRING = PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___UPDATE_PARAMETERS__PARAMETERLIST = PatternstructurePackage.PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GET_PARAMETER_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___UPDATE_OPERATORS__OPERATORLIST = PatternstructurePackage.PATTERN_ELEMENT___UPDATE_OPERATORS__OPERATORLIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GET_OPERATOR_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___CREATE_XML_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___FINALIZE_XML_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___ADD__PARAMETER = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.ParameterValueImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__INTERNAL_ID = PARAMETER__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__PARAMETER_LIST = PARAMETER__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__IS_PREDEFINED = PARAMETER__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Described</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__DESCRIBED = PARAMETER__DESCRIBED;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__COMPARISON1 = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__COMPARISON2 = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GENERATE_QUERY__LOCATION = PARAMETER___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_ALL_INPUTS = PARAMETER___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___PREPARE_TRANSLATION = PARAMETER___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___IS_VALID__BOOLEAN = PARAMETER___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___IS_VALID_LOCAL__BOOLEAN = PARAMETER___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_CONTAINER = PARAMETER___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_ANCESTOR__CLASS = PARAMETER___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___MY_TO_STRING = PARAMETER___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_PARAMETER_LIST = PARAMETER___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___UPDATE_OPERATORS__OPERATORLIST = PARAMETER___UPDATE_OPERATORS__OPERATORLIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_OPERATOR_LIST = PARAMETER___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___CREATE_XML_ADAPTION = PARAMETER___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___FINALIZE_XML_ADAPTION = PARAMETER___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___INPUT_IS_VALID = PARAMETER___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GENERATE_DESCRIPTION = PARAMETER___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_RETURN_TYPE = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___IS_TRANSLATABLE = PARAMETER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS = PARAMETER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.BooleanParamImpl <em>Boolean Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.BooleanParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getBooleanParam()
	 * @generated
	 */
	int BOOLEAN_PARAM = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__ID = PARAMETER_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__INTERNAL_ID = PARAMETER_VALUE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__PARAMETER_LIST = PARAMETER_VALUE__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__DESCRIPTION = PARAMETER_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__IS_PREDEFINED = PARAMETER_VALUE__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Described</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__DESCRIBED = PARAMETER_VALUE__DESCRIBED;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__COMPARISON1 = PARAMETER_VALUE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__COMPARISON2 = PARAMETER_VALUE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__MATCHES = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GENERATE_QUERY__LOCATION = PARAMETER_VALUE___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_ALL_INPUTS = PARAMETER_VALUE___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___PREPARE_TRANSLATION = PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___IS_VALID__BOOLEAN = PARAMETER_VALUE___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___IS_VALID_LOCAL__BOOLEAN = PARAMETER_VALUE___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_CONTAINER = PARAMETER_VALUE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_ANCESTOR__CLASS = PARAMETER_VALUE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___MY_TO_STRING = PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_PARAMETER_LIST = PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___UPDATE_OPERATORS__OPERATORLIST = PARAMETER_VALUE___UPDATE_OPERATORS__OPERATORLIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_OPERATOR_LIST = PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___CREATE_XML_ADAPTION = PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___FINALIZE_XML_ADAPTION = PARAMETER_VALUE___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___INPUT_IS_VALID = PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GENERATE_DESCRIPTION = PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_RETURN_TYPE = PARAMETER_VALUE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___IS_TRANSLATABLE = PARAMETER_VALUE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_ALL_ARGUMENT_ELEMENTS = PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Boolean Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.TextListParamImpl <em>Text List Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.TextListParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getTextListParam()
	 * @generated
	 */
	int TEXT_LIST_PARAM = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__ID = PARAMETER_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__INTERNAL_ID = PARAMETER_VALUE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__PARAMETER_LIST = PARAMETER_VALUE__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__DESCRIPTION = PARAMETER_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__IS_PREDEFINED = PARAMETER_VALUE__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Described</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__DESCRIBED = PARAMETER_VALUE__DESCRIBED;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__COMPARISON1 = PARAMETER_VALUE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__COMPARISON2 = PARAMETER_VALUE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__VALUES = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text List Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GENERATE_QUERY__LOCATION = PARAMETER_VALUE___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_ALL_INPUTS = PARAMETER_VALUE___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___PREPARE_TRANSLATION = PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___IS_VALID__BOOLEAN = PARAMETER_VALUE___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___IS_VALID_LOCAL__BOOLEAN = PARAMETER_VALUE___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_CONTAINER = PARAMETER_VALUE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_ANCESTOR__CLASS = PARAMETER_VALUE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___MY_TO_STRING = PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_PARAMETER_LIST = PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___UPDATE_OPERATORS__OPERATORLIST = PARAMETER_VALUE___UPDATE_OPERATORS__OPERATORLIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_OPERATOR_LIST = PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___CREATE_XML_ADAPTION = PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___FINALIZE_XML_ADAPTION = PARAMETER_VALUE___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___INPUT_IS_VALID = PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GENERATE_DESCRIPTION = PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_RETURN_TYPE = PARAMETER_VALUE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___IS_TRANSLATABLE = PARAMETER_VALUE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_ALL_ARGUMENT_ELEMENTS = PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get List Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_LIST_DECLARATION = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get List Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_LIST_VAR = PARAMETER_VALUE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text List Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl <em>Text Literal Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.TextLiteralParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getTextLiteralParam()
	 * @generated
	 */
	int TEXT_LITERAL_PARAM = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__ID = PARAMETER_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__INTERNAL_ID = PARAMETER_VALUE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__PARAMETER_LIST = PARAMETER_VALUE__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__DESCRIPTION = PARAMETER_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__IS_PREDEFINED = PARAMETER_VALUE__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Described</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__DESCRIBED = PARAMETER_VALUE__DESCRIBED;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__COMPARISON1 = PARAMETER_VALUE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__COMPARISON2 = PARAMETER_VALUE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__MATCHES = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__PROPERTIES = PARAMETER_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text Literal Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GENERATE_QUERY__LOCATION = PARAMETER_VALUE___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_ALL_INPUTS = PARAMETER_VALUE___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___PREPARE_TRANSLATION = PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___IS_VALID__BOOLEAN = PARAMETER_VALUE___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___IS_VALID_LOCAL__BOOLEAN = PARAMETER_VALUE___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_CONTAINER = PARAMETER_VALUE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_ANCESTOR__CLASS = PARAMETER_VALUE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___MY_TO_STRING = PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_PARAMETER_LIST = PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___UPDATE_OPERATORS__OPERATORLIST = PARAMETER_VALUE___UPDATE_OPERATORS__OPERATORLIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_OPERATOR_LIST = PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___CREATE_XML_ADAPTION = PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___FINALIZE_XML_ADAPTION = PARAMETER_VALUE___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___INPUT_IS_VALID = PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GENERATE_DESCRIPTION = PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_RETURN_TYPE = PARAMETER_VALUE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___IS_TRANSLATABLE = PARAMETER_VALUE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_ALL_ARGUMENT_ELEMENTS = PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Text Literal Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.NumberParamImpl <em>Number Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.NumberParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getNumberParam()
	 * @generated
	 */
	int NUMBER_PARAM = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM__ID = PARAMETER_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM__INTERNAL_ID = PARAMETER_VALUE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM__PARAMETER_LIST = PARAMETER_VALUE__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM__DESCRIPTION = PARAMETER_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM__IS_PREDEFINED = PARAMETER_VALUE__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Described</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM__DESCRIBED = PARAMETER_VALUE__DESCRIBED;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM__COMPARISON1 = PARAMETER_VALUE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM__COMPARISON2 = PARAMETER_VALUE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM__NUMBER_ARGUMENT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GENERATE_QUERY__LOCATION = PARAMETER_VALUE___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_ALL_INPUTS = PARAMETER_VALUE___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___PREPARE_TRANSLATION = PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___IS_VALID__BOOLEAN = PARAMETER_VALUE___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___IS_VALID_LOCAL__BOOLEAN = PARAMETER_VALUE___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_CONTAINER = PARAMETER_VALUE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_ANCESTOR__CLASS = PARAMETER_VALUE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___MY_TO_STRING = PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_PARAMETER_LIST = PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___UPDATE_OPERATORS__OPERATORLIST = PARAMETER_VALUE___UPDATE_OPERATORS__OPERATORLIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_OPERATOR_LIST = PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___CREATE_XML_ADAPTION = PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___FINALIZE_XML_ADAPTION = PARAMETER_VALUE___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___INPUT_IS_VALID = PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GENERATE_DESCRIPTION = PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_RETURN_TYPE = PARAMETER_VALUE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___IS_TRANSLATABLE = PARAMETER_VALUE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_ALL_ARGUMENT_ELEMENTS = PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Number Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.DateParamImpl <em>Date Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.DateParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getDateParam()
	 * @generated
	 */
	int DATE_PARAM = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM__ID = PARAMETER_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM__INTERNAL_ID = PARAMETER_VALUE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM__PARAMETER_LIST = PARAMETER_VALUE__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM__DESCRIPTION = PARAMETER_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM__IS_PREDEFINED = PARAMETER_VALUE__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Described</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM__DESCRIBED = PARAMETER_VALUE__DESCRIBED;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM__COMPARISON1 = PARAMETER_VALUE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM__COMPARISON2 = PARAMETER_VALUE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GENERATE_QUERY__LOCATION = PARAMETER_VALUE___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_ALL_INPUTS = PARAMETER_VALUE___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___PREPARE_TRANSLATION = PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___IS_VALID__BOOLEAN = PARAMETER_VALUE___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___IS_VALID_LOCAL__BOOLEAN = PARAMETER_VALUE___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_CONTAINER = PARAMETER_VALUE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_ANCESTOR__CLASS = PARAMETER_VALUE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___MY_TO_STRING = PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_PARAMETER_LIST = PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___UPDATE_OPERATORS__OPERATORLIST = PARAMETER_VALUE___UPDATE_OPERATORS__OPERATORLIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_OPERATOR_LIST = PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___CREATE_XML_ADAPTION = PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___FINALIZE_XML_ADAPTION = PARAMETER_VALUE___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___INPUT_IS_VALID = PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GENERATE_DESCRIPTION = PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_RETURN_TYPE = PARAMETER_VALUE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___IS_TRANSLATABLE = PARAMETER_VALUE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_ALL_ARGUMENT_ELEMENTS = PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Date Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.TimeParamImpl <em>Time Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.TimeParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getTimeParam()
	 * @generated
	 */
	int TIME_PARAM = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM__ID = PARAMETER_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM__INTERNAL_ID = PARAMETER_VALUE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM__PARAMETER_LIST = PARAMETER_VALUE__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM__DESCRIPTION = PARAMETER_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM__IS_PREDEFINED = PARAMETER_VALUE__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Described</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM__DESCRIBED = PARAMETER_VALUE__DESCRIBED;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM__COMPARISON1 = PARAMETER_VALUE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM__COMPARISON2 = PARAMETER_VALUE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GENERATE_QUERY__LOCATION = PARAMETER_VALUE___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_ALL_INPUTS = PARAMETER_VALUE___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___PREPARE_TRANSLATION = PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___IS_VALID__BOOLEAN = PARAMETER_VALUE___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___IS_VALID_LOCAL__BOOLEAN = PARAMETER_VALUE___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_CONTAINER = PARAMETER_VALUE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_ANCESTOR__CLASS = PARAMETER_VALUE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___MY_TO_STRING = PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_PARAMETER_LIST = PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___UPDATE_OPERATORS__OPERATORLIST = PARAMETER_VALUE___UPDATE_OPERATORS__OPERATORLIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_OPERATOR_LIST = PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___CREATE_XML_ADAPTION = PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___FINALIZE_XML_ADAPTION = PARAMETER_VALUE___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___INPUT_IS_VALID = PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GENERATE_DESCRIPTION = PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_RETURN_TYPE = PARAMETER_VALUE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___IS_TRANSLATABLE = PARAMETER_VALUE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_ALL_ARGUMENT_ELEMENTS = PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Time Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.UnknownParameterValueImpl <em>Unknown Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.UnknownParameterValueImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getUnknownParameterValue()
	 * @generated
	 */
	int UNKNOWN_PARAMETER_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE__INTERNAL_ID = PARAMETER__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE__PARAMETER_LIST = PARAMETER__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE__IS_PREDEFINED = PARAMETER__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Described</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE__DESCRIBED = PARAMETER__DESCRIBED;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE__COMPARISON1 = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE__COMPARISON2 = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unknown Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___GENERATE_QUERY__LOCATION = PARAMETER___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___GET_ALL_INPUTS = PARAMETER___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___PREPARE_TRANSLATION = PARAMETER___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___IS_VALID__BOOLEAN = PARAMETER___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___IS_VALID_LOCAL__BOOLEAN = PARAMETER___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___GET_CONTAINER = PARAMETER___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___GET_ANCESTOR__CLASS = PARAMETER___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___MY_TO_STRING = PARAMETER___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___GET_PARAMETER_LIST = PARAMETER___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___UPDATE_OPERATORS__OPERATORLIST = PARAMETER___UPDATE_OPERATORS__OPERATORLIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___GET_OPERATOR_LIST = PARAMETER___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___CREATE_XML_ADAPTION = PARAMETER___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___FINALIZE_XML_ADAPTION = PARAMETER___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___INPUT_IS_VALID = PARAMETER___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___GENERATE_DESCRIPTION = PARAMETER___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___GET_RETURN_TYPE = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___IS_TRANSLATABLE = PARAMETER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS = PARAMETER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Concretize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE___CONCRETIZE__PARAMETERVALUE = PARAMETER_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Unknown Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PARAMETER_VALUE_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.DateTimeParamImpl <em>Date Time Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.DateTimeParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getDateTimeParam()
	 * @generated
	 */
	int DATE_TIME_PARAM = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM__ID = PARAMETER_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM__INTERNAL_ID = PARAMETER_VALUE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM__PARAMETER_LIST = PARAMETER_VALUE__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM__DESCRIPTION = PARAMETER_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM__IS_PREDEFINED = PARAMETER_VALUE__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Described</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM__DESCRIBED = PARAMETER_VALUE__DESCRIBED;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM__COMPARISON1 = PARAMETER_VALUE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM__COMPARISON2 = PARAMETER_VALUE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Time Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GENERATE_QUERY__LOCATION = PARAMETER_VALUE___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_ALL_INPUTS = PARAMETER_VALUE___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___PREPARE_TRANSLATION = PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___IS_VALID__BOOLEAN = PARAMETER_VALUE___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___IS_VALID_LOCAL__BOOLEAN = PARAMETER_VALUE___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_CONTAINER = PARAMETER_VALUE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_ANCESTOR__CLASS = PARAMETER_VALUE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___MY_TO_STRING = PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_PARAMETER_LIST = PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___UPDATE_OPERATORS__OPERATORLIST = PARAMETER_VALUE___UPDATE_OPERATORS__OPERATORLIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_OPERATOR_LIST = PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___CREATE_XML_ADAPTION = PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___FINALIZE_XML_ADAPTION = PARAMETER_VALUE___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___INPUT_IS_VALID = PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GENERATE_DESCRIPTION = PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_RETURN_TYPE = PARAMETER_VALUE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___IS_TRANSLATABLE = PARAMETER_VALUE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_ALL_ARGUMENT_ELEMENTS = PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Date Time Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.RelationOptionParamImpl <em>Relation Option Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.RelationOptionParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getRelationOptionParam()
	 * @generated
	 */
	int RELATION_OPTION_PARAM = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM__INTERNAL_ID = PARAMETER__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM__PARAMETER_LIST = PARAMETER__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM__IS_PREDEFINED = PARAMETER__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Described</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM__DESCRIBED = PARAMETER__DESCRIBED;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM__OPTIONS = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM__VALUE = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM__RELATIONS = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___GENERATE_QUERY__LOCATION = PARAMETER___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___GET_ALL_INPUTS = PARAMETER___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___PREPARE_TRANSLATION = PARAMETER___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___IS_VALID__BOOLEAN = PARAMETER___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___IS_VALID_LOCAL__BOOLEAN = PARAMETER___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___GET_CONTAINER = PARAMETER___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___GET_ANCESTOR__CLASS = PARAMETER___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___MY_TO_STRING = PARAMETER___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___GET_PARAMETER_LIST = PARAMETER___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___UPDATE_OPERATORS__OPERATORLIST = PARAMETER___UPDATE_OPERATORS__OPERATORLIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___GET_OPERATOR_LIST = PARAMETER___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___CREATE_XML_ADAPTION = PARAMETER___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___FINALIZE_XML_ADAPTION = PARAMETER___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___INPUT_IS_VALID = PARAMETER___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___GENERATE_DESCRIPTION = PARAMETER___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Relation Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPTION_PARAM_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.OptionParamImpl <em>Option Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.OptionParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getOptionParam()
	 * @generated
	 */
	int OPTION_PARAM = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM__INTERNAL_ID = PARAMETER__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM__PARAMETER_LIST = PARAMETER__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM__IS_PREDEFINED = PARAMETER__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Described</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM__DESCRIBED = PARAMETER__DESCRIBED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM__VALUE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM__OPTIONS = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM__PROPERTY = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM__RELATION = PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM__COMPARISON = PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Count Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM__COUNT_CONDITION = PARAMETER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___GENERATE_QUERY__LOCATION = PARAMETER___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___GET_ALL_INPUTS = PARAMETER___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___PREPARE_TRANSLATION = PARAMETER___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___IS_VALID__BOOLEAN = PARAMETER___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___IS_VALID_LOCAL__BOOLEAN = PARAMETER___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___GET_CONTAINER = PARAMETER___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___GET_ANCESTOR__CLASS = PARAMETER___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___MY_TO_STRING = PARAMETER___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___GET_PARAMETER_LIST = PARAMETER___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___UPDATE_OPERATORS__OPERATORLIST = PARAMETER___UPDATE_OPERATORS__OPERATORLIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___GET_OPERATOR_LIST = PARAMETER___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___CREATE_XML_ADAPTION = PARAMETER___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___FINALIZE_XML_ADAPTION = PARAMETER___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___INPUT_IS_VALID = PARAMETER___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___GENERATE_DESCRIPTION = PARAMETER___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_PARAM_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see qualitypatternmodel.parameters.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.parameters.Parameter#getParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parameter List</em>'.
	 * @see qualitypatternmodel.parameters.Parameter#getParameterList()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParameterList();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see qualitypatternmodel.parameters.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.Parameter#isIsPredefined <em>Is Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Predefined</em>'.
	 * @see qualitypatternmodel.parameters.Parameter#isIsPredefined()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_IsPredefined();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.Parameter#isDescribed <em>Described</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Described</em>'.
	 * @see qualitypatternmodel.parameters.Parameter#isDescribed()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Described();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.Parameter#inputIsValid() <em>Input Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Is Valid</em>' operation.
	 * @see qualitypatternmodel.parameters.Parameter#inputIsValid()
	 * @generated
	 */
	EOperation getParameter__InputIsValid();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.Parameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qualitypatternmodel.parameters.Parameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.Parameter#generateDescription() <em>Generate Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Description</em>' operation.
	 * @see qualitypatternmodel.parameters.Parameter#generateDescription()
	 * @generated
	 */
	EOperation getParameter__GenerateDescription();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.ComparisonOptionParam <em>Comparison Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Option Param</em>'.
	 * @see qualitypatternmodel.parameters.ComparisonOptionParam
	 * @generated
	 */
	EClass getComparisonOptionParam();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.parameters.ComparisonOptionParam#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Options</em>'.
	 * @see qualitypatternmodel.parameters.ComparisonOptionParam#getOptions()
	 * @see #getComparisonOptionParam()
	 * @generated
	 */
	EAttribute getComparisonOptionParam_Options();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.ComparisonOptionParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.parameters.ComparisonOptionParam#getValue()
	 * @see #getComparisonOptionParam()
	 * @generated
	 */
	EAttribute getComparisonOptionParam_Value();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.ComparisonOptionParam#getComparisons <em>Comparisons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comparisons</em>'.
	 * @see qualitypatternmodel.parameters.ComparisonOptionParam#getComparisons()
	 * @see #getComparisonOptionParam()
	 * @generated
	 */
	EReference getComparisonOptionParam_Comparisons();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.ComparisonOptionParam#getCountCondition <em>Count Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Count Condition</em>'.
	 * @see qualitypatternmodel.parameters.ComparisonOptionParam#getCountCondition()
	 * @see #getComparisonOptionParam()
	 * @generated
	 */
	EReference getComparisonOptionParam_CountCondition();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.PropertyOptionParam <em>Property Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Option Param</em>'.
	 * @see qualitypatternmodel.parameters.PropertyOptionParam
	 * @generated
	 */
	EClass getPropertyOptionParam();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.parameters.PropertyOptionParam#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Options</em>'.
	 * @see qualitypatternmodel.parameters.PropertyOptionParam#getOptions()
	 * @see #getPropertyOptionParam()
	 * @generated
	 */
	EAttribute getPropertyOptionParam_Options();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.PropertyOptionParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.parameters.PropertyOptionParam#getValue()
	 * @see #getPropertyOptionParam()
	 * @generated
	 */
	EAttribute getPropertyOptionParam_Value();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.PropertyOptionParam#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see qualitypatternmodel.parameters.PropertyOptionParam#getProperties()
	 * @see #getPropertyOptionParam()
	 * @generated
	 */
	EReference getPropertyOptionParam_Properties();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.ParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter List</em>'.
	 * @see qualitypatternmodel.parameters.ParameterList
	 * @generated
	 */
	EClass getParameterList();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.parameters.ParameterList#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see qualitypatternmodel.parameters.ParameterList#getParameters()
	 * @see #getParameterList()
	 * @generated
	 */
	EReference getParameterList_Parameters();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.parameters.ParameterList#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see qualitypatternmodel.parameters.ParameterList#getPattern()
	 * @see #getParameterList()
	 * @generated
	 */
	EReference getParameterList_Pattern();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ParameterList#add(qualitypatternmodel.parameters.Parameter) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see qualitypatternmodel.parameters.ParameterList#add(qualitypatternmodel.parameters.Parameter)
	 * @generated
	 */
	EOperation getParameterList__Add__Parameter();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.BooleanParam <em>Boolean Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Param</em>'.
	 * @see qualitypatternmodel.parameters.BooleanParam
	 * @generated
	 */
	EClass getBooleanParam();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.BooleanParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.parameters.BooleanParam#getValue()
	 * @see #getBooleanParam()
	 * @generated
	 */
	EAttribute getBooleanParam_Value();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.BooleanParam#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Matches</em>'.
	 * @see qualitypatternmodel.parameters.BooleanParam#getMatches()
	 * @see #getBooleanParam()
	 * @generated
	 */
	EReference getBooleanParam_Matches();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.TextListParam <em>Text List Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text List Param</em>'.
	 * @see qualitypatternmodel.parameters.TextListParam
	 * @generated
	 */
	EClass getTextListParam();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.parameters.TextListParam#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see qualitypatternmodel.parameters.TextListParam#getValues()
	 * @see #getTextListParam()
	 * @generated
	 */
	EAttribute getTextListParam_Values();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.TextListParam#getListDeclaration() <em>Get List Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get List Declaration</em>' operation.
	 * @see qualitypatternmodel.parameters.TextListParam#getListDeclaration()
	 * @generated
	 */
	EOperation getTextListParam__GetListDeclaration();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.TextListParam#getListVar() <em>Get List Var</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get List Var</em>' operation.
	 * @see qualitypatternmodel.parameters.TextListParam#getListVar()
	 * @generated
	 */
	EOperation getTextListParam__GetListVar();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.TextLiteralParam <em>Text Literal Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Literal Param</em>'.
	 * @see qualitypatternmodel.parameters.TextLiteralParam
	 * @generated
	 */
	EClass getTextLiteralParam();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.TextLiteralParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getValue()
	 * @see #getTextLiteralParam()
	 * @generated
	 */
	EAttribute getTextLiteralParam_Value();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.TextLiteralParam#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Matches</em>'.
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getMatches()
	 * @see #getTextLiteralParam()
	 * @generated
	 */
	EReference getTextLiteralParam_Matches();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.TextLiteralParam#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getProperties()
	 * @see #getTextLiteralParam()
	 * @generated
	 */
	EReference getTextLiteralParam_Properties();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.NumberParam <em>Number Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Param</em>'.
	 * @see qualitypatternmodel.parameters.NumberParam
	 * @generated
	 */
	EClass getNumberParam();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.NumberParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.parameters.NumberParam#getValue()
	 * @see #getNumberParam()
	 * @generated
	 */
	EAttribute getNumberParam_Value();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.parameters.NumberParam#getNumberArgument <em>Number Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Number Argument</em>'.
	 * @see qualitypatternmodel.parameters.NumberParam#getNumberArgument()
	 * @see #getNumberParam()
	 * @generated
	 */
	EReference getNumberParam_NumberArgument();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see qualitypatternmodel.parameters.ParameterValue
	 * @generated
	 */
	EClass getParameterValue();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.DateParam <em>Date Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Param</em>'.
	 * @see qualitypatternmodel.parameters.DateParam
	 * @generated
	 */
	EClass getDateParam();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.DateParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.parameters.DateParam#getValue()
	 * @see #getDateParam()
	 * @generated
	 */
	EAttribute getDateParam_Value();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.TimeParam <em>Time Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Param</em>'.
	 * @see qualitypatternmodel.parameters.TimeParam
	 * @generated
	 */
	EClass getTimeParam();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.TimeParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.parameters.TimeParam#getValue()
	 * @see #getTimeParam()
	 * @generated
	 */
	EAttribute getTimeParam_Value();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.UnknownParameterValue <em>Unknown Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Parameter Value</em>'.
	 * @see qualitypatternmodel.parameters.UnknownParameterValue
	 * @generated
	 */
	EClass getUnknownParameterValue();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.UnknownParameterValue#concretize(qualitypatternmodel.parameters.ParameterValue) <em>Concretize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Concretize</em>' operation.
	 * @see qualitypatternmodel.parameters.UnknownParameterValue#concretize(qualitypatternmodel.parameters.ParameterValue)
	 * @generated
	 */
	EOperation getUnknownParameterValue__Concretize__ParameterValue();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.DateTimeParam <em>Date Time Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Param</em>'.
	 * @see qualitypatternmodel.parameters.DateTimeParam
	 * @generated
	 */
	EClass getDateTimeParam();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.DateTimeParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.parameters.DateTimeParam#getValue()
	 * @see #getDateTimeParam()
	 * @generated
	 */
	EAttribute getDateTimeParam_Value();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.RelationOptionParam <em>Relation Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Option Param</em>'.
	 * @see qualitypatternmodel.parameters.RelationOptionParam
	 * @generated
	 */
	EClass getRelationOptionParam();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.parameters.RelationOptionParam#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Options</em>'.
	 * @see qualitypatternmodel.parameters.RelationOptionParam#getOptions()
	 * @see #getRelationOptionParam()
	 * @generated
	 */
	EAttribute getRelationOptionParam_Options();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.RelationOptionParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.parameters.RelationOptionParam#getValue()
	 * @see #getRelationOptionParam()
	 * @generated
	 */
	EAttribute getRelationOptionParam_Value();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.RelationOptionParam#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relations</em>'.
	 * @see qualitypatternmodel.parameters.RelationOptionParam#getRelations()
	 * @see #getRelationOptionParam()
	 * @generated
	 */
	EReference getRelationOptionParam_Relations();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.OptionParam <em>Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Param</em>'.
	 * @see qualitypatternmodel.parameters.OptionParam
	 * @generated
	 */
	EClass getOptionParam();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.OptionParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.parameters.OptionParam#getValue()
	 * @see #getOptionParam()
	 * @generated
	 */
	EAttribute getOptionParam_Value();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.parameters.OptionParam#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Options</em>'.
	 * @see qualitypatternmodel.parameters.OptionParam#getOptions()
	 * @see #getOptionParam()
	 * @generated
	 */
	EAttribute getOptionParam_Options();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.parameters.OptionParam#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see qualitypatternmodel.parameters.OptionParam#getProperty()
	 * @see #getOptionParam()
	 * @generated
	 */
	EReference getOptionParam_Property();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.parameters.OptionParam#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see qualitypatternmodel.parameters.OptionParam#getRelation()
	 * @see #getOptionParam()
	 * @generated
	 */
	EReference getOptionParam_Relation();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.OptionParam#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comparison</em>'.
	 * @see qualitypatternmodel.parameters.OptionParam#getComparison()
	 * @see #getOptionParam()
	 * @generated
	 */
	EReference getOptionParam_Comparison();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.parameters.OptionParam#getCountCondition <em>Count Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Count Condition</em>'.
	 * @see qualitypatternmodel.parameters.OptionParam#getCountCondition()
	 * @see #getOptionParam()
	 * @generated
	 */
	EReference getOptionParam_CountCondition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParametersFactory getParametersFactory();

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
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.ParameterImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAMETER_LIST = eINSTANCE.getParameter_ParameterList();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Is Predefined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__IS_PREDEFINED = eINSTANCE.getParameter_IsPredefined();

		/**
		 * The meta object literal for the '<em><b>Described</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIBED = eINSTANCE.getParameter_Described();

		/**
		 * The meta object literal for the '<em><b>Input Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___INPUT_IS_VALID = eINSTANCE.getParameter__InputIsValid();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getParameter__Validate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Generate Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GENERATE_DESCRIPTION = eINSTANCE.getParameter__GenerateDescription();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl <em>Comparison Option Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getComparisonOptionParam()
		 * @generated
		 */
		EClass COMPARISON_OPTION_PARAM = eINSTANCE.getComparisonOptionParam();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_OPTION_PARAM__OPTIONS = eINSTANCE.getComparisonOptionParam_Options();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_OPTION_PARAM__VALUE = eINSTANCE.getComparisonOptionParam_Value();

		/**
		 * The meta object literal for the '<em><b>Comparisons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_OPTION_PARAM__COMPARISONS = eINSTANCE.getComparisonOptionParam_Comparisons();

		/**
		 * The meta object literal for the '<em><b>Count Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_OPTION_PARAM__COUNT_CONDITION = eINSTANCE.getComparisonOptionParam_CountCondition();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.PropertyOptionParamImpl <em>Property Option Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.PropertyOptionParamImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getPropertyOptionParam()
		 * @generated
		 */
		EClass PROPERTY_OPTION_PARAM = eINSTANCE.getPropertyOptionParam();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_OPTION_PARAM__OPTIONS = eINSTANCE.getPropertyOptionParam_Options();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_OPTION_PARAM__VALUE = eINSTANCE.getPropertyOptionParam_Value();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OPTION_PARAM__PROPERTIES = eINSTANCE.getPropertyOptionParam_Properties();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.ParameterListImpl <em>Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.ParameterListImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getParameterList()
		 * @generated
		 */
		EClass PARAMETER_LIST = eINSTANCE.getParameterList();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_LIST__PARAMETERS = eINSTANCE.getParameterList_Parameters();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_LIST__PATTERN = eINSTANCE.getParameterList_Pattern();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_LIST___ADD__PARAMETER = eINSTANCE.getParameterList__Add__Parameter();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.BooleanParamImpl <em>Boolean Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.BooleanParamImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getBooleanParam()
		 * @generated
		 */
		EClass BOOLEAN_PARAM = eINSTANCE.getBooleanParam();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_PARAM__VALUE = eINSTANCE.getBooleanParam_Value();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_PARAM__MATCHES = eINSTANCE.getBooleanParam_Matches();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.TextListParamImpl <em>Text List Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.TextListParamImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getTextListParam()
		 * @generated
		 */
		EClass TEXT_LIST_PARAM = eINSTANCE.getTextListParam();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_LIST_PARAM__VALUES = eINSTANCE.getTextListParam_Values();

		/**
		 * The meta object literal for the '<em><b>Get List Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_LIST_PARAM___GET_LIST_DECLARATION = eINSTANCE.getTextListParam__GetListDeclaration();

		/**
		 * The meta object literal for the '<em><b>Get List Var</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_LIST_PARAM___GET_LIST_VAR = eINSTANCE.getTextListParam__GetListVar();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl <em>Text Literal Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.TextLiteralParamImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getTextLiteralParam()
		 * @generated
		 */
		EClass TEXT_LITERAL_PARAM = eINSTANCE.getTextLiteralParam();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_LITERAL_PARAM__VALUE = eINSTANCE.getTextLiteralParam_Value();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_LITERAL_PARAM__MATCHES = eINSTANCE.getTextLiteralParam_Matches();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_LITERAL_PARAM__PROPERTIES = eINSTANCE.getTextLiteralParam_Properties();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.NumberParamImpl <em>Number Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.NumberParamImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getNumberParam()
		 * @generated
		 */
		EClass NUMBER_PARAM = eINSTANCE.getNumberParam();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_PARAM__VALUE = eINSTANCE.getNumberParam_Value();

		/**
		 * The meta object literal for the '<em><b>Number Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_PARAM__NUMBER_ARGUMENT = eINSTANCE.getNumberParam_NumberArgument();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.ParameterValueImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getParameterValue()
		 * @generated
		 */
		EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.DateParamImpl <em>Date Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.DateParamImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getDateParam()
		 * @generated
		 */
		EClass DATE_PARAM = eINSTANCE.getDateParam();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_PARAM__VALUE = eINSTANCE.getDateParam_Value();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.TimeParamImpl <em>Time Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.TimeParamImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getTimeParam()
		 * @generated
		 */
		EClass TIME_PARAM = eINSTANCE.getTimeParam();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PARAM__VALUE = eINSTANCE.getTimeParam_Value();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.UnknownParameterValueImpl <em>Unknown Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.UnknownParameterValueImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getUnknownParameterValue()
		 * @generated
		 */
		EClass UNKNOWN_PARAMETER_VALUE = eINSTANCE.getUnknownParameterValue();

		/**
		 * The meta object literal for the '<em><b>Concretize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNKNOWN_PARAMETER_VALUE___CONCRETIZE__PARAMETERVALUE = eINSTANCE.getUnknownParameterValue__Concretize__ParameterValue();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.DateTimeParamImpl <em>Date Time Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.DateTimeParamImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getDateTimeParam()
		 * @generated
		 */
		EClass DATE_TIME_PARAM = eINSTANCE.getDateTimeParam();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_PARAM__VALUE = eINSTANCE.getDateTimeParam_Value();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.RelationOptionParamImpl <em>Relation Option Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.RelationOptionParamImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getRelationOptionParam()
		 * @generated
		 */
		EClass RELATION_OPTION_PARAM = eINSTANCE.getRelationOptionParam();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_OPTION_PARAM__OPTIONS = eINSTANCE.getRelationOptionParam_Options();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_OPTION_PARAM__VALUE = eINSTANCE.getRelationOptionParam_Value();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_OPTION_PARAM__RELATIONS = eINSTANCE.getRelationOptionParam_Relations();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.OptionParamImpl <em>Option Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.OptionParamImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getOptionParam()
		 * @generated
		 */
		EClass OPTION_PARAM = eINSTANCE.getOptionParam();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_PARAM__VALUE = eINSTANCE.getOptionParam_Value();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_PARAM__OPTIONS = eINSTANCE.getOptionParam_Options();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_PARAM__PROPERTY = eINSTANCE.getOptionParam_Property();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_PARAM__RELATION = eINSTANCE.getOptionParam_Relation();

		/**
		 * The meta object literal for the '<em><b>Comparison</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_PARAM__COMPARISON = eINSTANCE.getOptionParam_Comparison();

		/**
		 * The meta object literal for the '<em><b>Count Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_PARAM__COUNT_CONDITION = eINSTANCE.getOptionParam_CountCondition();

	}

} //InputfieldsPackage

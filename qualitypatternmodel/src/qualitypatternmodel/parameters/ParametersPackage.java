/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PREDEFINED = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_REFERENCES = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_VALID__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___MY_TO_STRING = PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_CYPHER = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_XQUERY = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_SPARQL = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_SPARQL;

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
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___INITIALIZE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_OPERATOR_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_ALL_OPERATORS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_PARAMETER_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_ALL_PARAMETERS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___PREPARE_PARAMETER_UPDATES = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST = PatternstructurePackage.PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___RECORD_VALUES__XMLDATADATABASE = PatternstructurePackage.PATTERN_ELEMENT___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___RELATIONS_XML_ADAPTED = PatternstructurePackage.PATTERN_ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___CREATE_XML_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___CREATE_RDF_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___CREATE_NEO4J_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___CONTAINS_JAVA_OPERATOR = PatternstructurePackage.PATTERN_ELEMENT___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_QUERY_FILTER_PART = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_XQUERY_JAVA = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_XQUERY_JAVA_RETURN = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_XQUERY_JAVA_WHERE = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___VALIDATE_AGAINST_SCHEMA = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___INPUT_IS_VALID = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_USED = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___SET_VALUE_FROM_STRING__STRING = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_VALUE_AS_STRING = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___CHECK_COMPARISON_CONSISTENCY = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_OPTIONS_AS_STRING_LIST = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_DESCRIPTION = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 10;

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
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM__PREDEFINED = PARAMETER__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM__PARAMETER_REFERENCES = PARAMETER__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM__DESCRIPTION = PARAMETER__DESCRIPTION;

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
	 * The feature id for the '<em><b>Count Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM__COUNT_CONDITIONS = PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>String Length</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM__STRING_LENGTH = PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Comparison Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___IS_VALID__ABSTRACTIONLEVEL = PARAMETER___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PARAMETER___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___MY_TO_STRING = PARAMETER___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GENERATE_CYPHER = PARAMETER___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GENERATE_XQUERY = PARAMETER___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GENERATE_SPARQL = PARAMETER___GENERATE_SPARQL;

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
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___INITIALIZE_TRANSLATION = PARAMETER___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___PREPARE_TRANSLATION = PARAMETER___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GET_OPERATOR_LIST = PARAMETER___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GET_ALL_OPERATORS = PARAMETER___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GET_PARAMETER_LIST = PARAMETER___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GET_ALL_PARAMETERS = PARAMETER___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___PREPARE_PARAMETER_UPDATES = PARAMETER___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___RECORD_VALUES__XMLDATADATABASE = PARAMETER___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___RELATIONS_XML_ADAPTED = PARAMETER___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___CREATE_XML_ADAPTION = PARAMETER___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___CREATE_RDF_ADAPTION = PARAMETER___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___CREATE_NEO4J_ADAPTION = PARAMETER___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___CONTAINS_JAVA_OPERATOR = PARAMETER___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GENERATE_QUERY_FILTER_PART = PARAMETER___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GENERATE_XQUERY_JAVA = PARAMETER___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GENERATE_XQUERY_JAVA_RETURN = PARAMETER___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GENERATE_XQUERY_JAVA_WHERE = PARAMETER___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___VALIDATE_AGAINST_SCHEMA = PARAMETER___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___INPUT_IS_VALID = PARAMETER___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___IS_USED = PARAMETER___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___SET_VALUE_FROM_STRING__STRING = PARAMETER___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GET_VALUE_AS_STRING = PARAMETER___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___CHECK_COMPARISON_CONSISTENCY = PARAMETER___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GET_OPTIONS_AS_STRING_LIST = PARAMETER___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___GENERATE_DESCRIPTION = PARAMETER___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Set Value If Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM___SET_VALUE_IF_VALID__COMPARISONOPERATOR = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comparison Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPTION_PARAM_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.ParameterListImpl <em>Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.ParameterListImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getParameterList()
	 * @generated
	 */
	int PARAMETER_LIST = 2;

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
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___IS_VALID__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___MY_TO_STRING = PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GENERATE_CYPHER = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GENERATE_XQUERY = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GENERATE_SPARQL = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_SPARQL;

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
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___INITIALIZE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GET_OPERATOR_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GET_ALL_OPERATORS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GET_PARAMETER_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GET_ALL_PARAMETERS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___PREPARE_PARAMETER_UPDATES = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___UPDATE_PARAMETERS__PARAMETERLIST = PatternstructurePackage.PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___RECORD_VALUES__XMLDATADATABASE = PatternstructurePackage.PATTERN_ELEMENT___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___RELATIONS_XML_ADAPTED = PatternstructurePackage.PATTERN_ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___CREATE_XML_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___CREATE_RDF_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___CREATE_NEO4J_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___CONTAINS_JAVA_OPERATOR = PatternstructurePackage.PATTERN_ELEMENT___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GENERATE_QUERY_FILTER_PART = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GENERATE_XQUERY_JAVA = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GENERATE_XQUERY_JAVA_RETURN = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___GENERATE_XQUERY_JAVA_WHERE = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___VALIDATE_AGAINST_SCHEMA = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___ADD__PARAMETER = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST___REMOVE__PARAMETER = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.ParameterValueImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 7;

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
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__PREDEFINED = PARAMETER__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__PARAMETER_REFERENCES = PARAMETER__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__DESCRIPTION = PARAMETER__DESCRIPTION;

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
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__TYPE_MODIFIABLE = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___IS_VALID__ABSTRACTIONLEVEL = PARAMETER___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PARAMETER___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___MY_TO_STRING = PARAMETER___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GENERATE_CYPHER = PARAMETER___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GENERATE_XQUERY = PARAMETER___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GENERATE_SPARQL = PARAMETER___GENERATE_SPARQL;

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
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___INITIALIZE_TRANSLATION = PARAMETER___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___PREPARE_TRANSLATION = PARAMETER___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_OPERATOR_LIST = PARAMETER___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_ALL_OPERATORS = PARAMETER___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_PARAMETER_LIST = PARAMETER___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_ALL_PARAMETERS = PARAMETER___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___PREPARE_PARAMETER_UPDATES = PARAMETER___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___RECORD_VALUES__XMLDATADATABASE = PARAMETER___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___RELATIONS_XML_ADAPTED = PARAMETER___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___CREATE_XML_ADAPTION = PARAMETER___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___CREATE_RDF_ADAPTION = PARAMETER___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___CREATE_NEO4J_ADAPTION = PARAMETER___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___CONTAINS_JAVA_OPERATOR = PARAMETER___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GENERATE_QUERY_FILTER_PART = PARAMETER___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GENERATE_XQUERY_JAVA = PARAMETER___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GENERATE_XQUERY_JAVA_RETURN = PARAMETER___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GENERATE_XQUERY_JAVA_WHERE = PARAMETER___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___VALIDATE_AGAINST_SCHEMA = PARAMETER___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___VALIDATE_EXAMPLE_VALUE__STRING = PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___INPUT_IS_VALID = PARAMETER___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___IS_USED = PARAMETER___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___SET_VALUE_FROM_STRING__STRING = PARAMETER___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_VALUE_AS_STRING = PARAMETER___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___CHECK_COMPARISON_CONSISTENCY = PARAMETER___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_OPTIONS_AS_STRING_LIST = PARAMETER___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GENERATE_DESCRIPTION = PARAMETER___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_RETURN_TYPE = PARAMETER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___IS_TRANSLATABLE = PARAMETER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS = PARAMETER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___IS_OPERATOR_ARGUMENT = PARAMETER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___REPLACE__PARAMETERVALUE = PARAMETER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING = PARAMETER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_ELEMENT_TAGS = PARAMETER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_DATA_VALUES = PARAMETER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___IS_IN_DATA_COMPARISON = PARAMETER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___IS_IN_TAG_COMPARISON = PARAMETER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_ATTRIBUTE_NAMES = PARAMETER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_ATTRIBUTE_VALUES = PARAMETER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON = PARAMETER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___GET_SUGGESTIONS = PARAMETER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___INFER_SUGGESTIONS = PARAMETER_OPERATION_COUNT + 15;

	/**
	 * The number of operations of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 16;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.BooleanParamImpl <em>Boolean Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.BooleanParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getBooleanParam()
	 * @generated
	 */
	int BOOLEAN_PARAM = 3;

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
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__PREDEFINED = PARAMETER_VALUE__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__PARAMETER_REFERENCES = PARAMETER_VALUE__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__DESCRIPTION = PARAMETER_VALUE__DESCRIPTION;

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
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__TYPE_MODIFIABLE = PARAMETER_VALUE__TYPE_MODIFIABLE;

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
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__CONTAINS = PARAMETER_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Null Check</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__NULL_CHECK = PARAMETER_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>One Arg Java Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__ONE_ARG_JAVA_OPERATOR = PARAMETER_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Boolean Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___IS_VALID__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___MY_TO_STRING = PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GENERATE_CYPHER = PARAMETER_VALUE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GENERATE_XQUERY = PARAMETER_VALUE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GENERATE_SPARQL = PARAMETER_VALUE___GENERATE_SPARQL;

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
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___INITIALIZE_TRANSLATION = PARAMETER_VALUE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___PREPARE_TRANSLATION = PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_OPERATOR_LIST = PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_ALL_OPERATORS = PARAMETER_VALUE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_PARAMETER_LIST = PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_ALL_PARAMETERS = PARAMETER_VALUE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___PREPARE_PARAMETER_UPDATES = PARAMETER_VALUE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___RECORD_VALUES__XMLDATADATABASE = PARAMETER_VALUE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___RELATIONS_XML_ADAPTED = PARAMETER_VALUE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___CREATE_XML_ADAPTION = PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___CREATE_RDF_ADAPTION = PARAMETER_VALUE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___CREATE_NEO4J_ADAPTION = PARAMETER_VALUE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___CONTAINS_JAVA_OPERATOR = PARAMETER_VALUE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GENERATE_QUERY_FILTER_PART = PARAMETER_VALUE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GENERATE_XQUERY_JAVA = PARAMETER_VALUE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GENERATE_XQUERY_JAVA_RETURN = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GENERATE_XQUERY_JAVA_WHERE = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___VALIDATE_AGAINST_SCHEMA = PARAMETER_VALUE___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = PARAMETER_VALUE___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___INPUT_IS_VALID = PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___IS_USED = PARAMETER_VALUE___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___SET_VALUE_FROM_STRING__STRING = PARAMETER_VALUE___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_VALUE_AS_STRING = PARAMETER_VALUE___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___CHECK_COMPARISON_CONSISTENCY = PARAMETER_VALUE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_OPTIONS_AS_STRING_LIST = PARAMETER_VALUE___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GENERATE_DESCRIPTION = PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___IS_OPERATOR_ARGUMENT = PARAMETER_VALUE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___REPLACE__PARAMETERVALUE = PARAMETER_VALUE___REPLACE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___REPLACE_VIA_VALUE__STRING_STRING = PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_ELEMENT_TAGS = PARAMETER_VALUE___GET_ELEMENT_TAGS;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_DATA_VALUES = PARAMETER_VALUE___GET_DATA_VALUES;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___IS_IN_DATA_COMPARISON = PARAMETER_VALUE___IS_IN_DATA_COMPARISON;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___IS_IN_TAG_COMPARISON = PARAMETER_VALUE___IS_IN_TAG_COMPARISON;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_ATTRIBUTE_NAMES = PARAMETER_VALUE___GET_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_ATTRIBUTE_VALUES = PARAMETER_VALUE___GET_ATTRIBUTE_VALUES;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___IS_IN_ATTRIBUTE_COMPARISON = PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___GET_SUGGESTIONS = PARAMETER_VALUE___GET_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___INFER_SUGGESTIONS = PARAMETER_VALUE___INFER_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Set Value If Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM___SET_VALUE_IF_VALID__BOOLEAN = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.ListParamImpl <em>List Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.ListParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getListParam()
	 * @generated
	 */
	int LIST_PARAM = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM__ID = PARAMETER_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM__INTERNAL_ID = PARAMETER_VALUE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM__PARAMETER_LIST = PARAMETER_VALUE__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM__PREDEFINED = PARAMETER_VALUE__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM__PARAMETER_REFERENCES = PARAMETER_VALUE__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM__DESCRIPTION = PARAMETER_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM__COMPARISON1 = PARAMETER_VALUE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM__COMPARISON2 = PARAMETER_VALUE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM__TYPE_MODIFIABLE = PARAMETER_VALUE__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM__VALUES = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___IS_VALID__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___MY_TO_STRING = PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GENERATE_CYPHER = PARAMETER_VALUE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GENERATE_XQUERY = PARAMETER_VALUE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GENERATE_SPARQL = PARAMETER_VALUE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_CONTAINER = PARAMETER_VALUE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_ANCESTOR__CLASS = PARAMETER_VALUE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___INITIALIZE_TRANSLATION = PARAMETER_VALUE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___PREPARE_TRANSLATION = PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_OPERATOR_LIST = PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_ALL_OPERATORS = PARAMETER_VALUE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_PARAMETER_LIST = PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_ALL_PARAMETERS = PARAMETER_VALUE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___PREPARE_PARAMETER_UPDATES = PARAMETER_VALUE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___RECORD_VALUES__XMLDATADATABASE = PARAMETER_VALUE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___RELATIONS_XML_ADAPTED = PARAMETER_VALUE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___CREATE_XML_ADAPTION = PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___CREATE_RDF_ADAPTION = PARAMETER_VALUE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___CREATE_NEO4J_ADAPTION = PARAMETER_VALUE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___CONTAINS_JAVA_OPERATOR = PARAMETER_VALUE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GENERATE_QUERY_FILTER_PART = PARAMETER_VALUE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GENERATE_XQUERY_JAVA = PARAMETER_VALUE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GENERATE_XQUERY_JAVA_RETURN = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GENERATE_XQUERY_JAVA_WHERE = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___VALIDATE_AGAINST_SCHEMA = PARAMETER_VALUE___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = PARAMETER_VALUE___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___INPUT_IS_VALID = PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___IS_USED = PARAMETER_VALUE___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___SET_VALUE_FROM_STRING__STRING = PARAMETER_VALUE___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_VALUE_AS_STRING = PARAMETER_VALUE___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___CHECK_COMPARISON_CONSISTENCY = PARAMETER_VALUE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_OPTIONS_AS_STRING_LIST = PARAMETER_VALUE___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GENERATE_DESCRIPTION = PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_RETURN_TYPE = PARAMETER_VALUE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___IS_TRANSLATABLE = PARAMETER_VALUE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_ALL_ARGUMENT_ELEMENTS = PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___IS_OPERATOR_ARGUMENT = PARAMETER_VALUE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___REPLACE__PARAMETERVALUE = PARAMETER_VALUE___REPLACE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___REPLACE_VIA_VALUE__STRING_STRING = PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_ELEMENT_TAGS = PARAMETER_VALUE___GET_ELEMENT_TAGS;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_DATA_VALUES = PARAMETER_VALUE___GET_DATA_VALUES;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___IS_IN_DATA_COMPARISON = PARAMETER_VALUE___IS_IN_DATA_COMPARISON;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___IS_IN_TAG_COMPARISON = PARAMETER_VALUE___IS_IN_TAG_COMPARISON;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_ATTRIBUTE_NAMES = PARAMETER_VALUE___GET_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_ATTRIBUTE_VALUES = PARAMETER_VALUE___GET_ATTRIBUTE_VALUES;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___IS_IN_ATTRIBUTE_COMPARISON = PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_SUGGESTIONS = PARAMETER_VALUE___GET_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___INFER_SUGGESTIONS = PARAMETER_VALUE___INFER_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Set Value If Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___SET_VALUE_IF_VALID__ELIST = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get List Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_LIST_VAR = PARAMETER_VALUE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get List Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___GET_LIST_DECLARATION = PARAMETER_VALUE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM___ADD_STRING_VALUE__STRING = PARAMETER_VALUE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>List Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PARAM_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.TextListParamImpl <em>Text List Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.TextListParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getTextListParam()
	 * @generated
	 */
	int TEXT_LIST_PARAM = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__ID = LIST_PARAM__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__INTERNAL_ID = LIST_PARAM__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__PARAMETER_LIST = LIST_PARAM__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__PREDEFINED = LIST_PARAM__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__PARAMETER_REFERENCES = LIST_PARAM__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__DESCRIPTION = LIST_PARAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__COMPARISON1 = LIST_PARAM__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__COMPARISON2 = LIST_PARAM__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__TYPE_MODIFIABLE = LIST_PARAM__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM__VALUES = LIST_PARAM__VALUES;

	/**
	 * The number of structural features of the '<em>Text List Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM_FEATURE_COUNT = LIST_PARAM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___IS_VALID__ABSTRACTIONLEVEL = LIST_PARAM___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = LIST_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___MY_TO_STRING = LIST_PARAM___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GENERATE_CYPHER = LIST_PARAM___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GENERATE_XQUERY = LIST_PARAM___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GENERATE_SPARQL = LIST_PARAM___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_CONTAINER = LIST_PARAM___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_ANCESTOR__CLASS = LIST_PARAM___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___INITIALIZE_TRANSLATION = LIST_PARAM___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___PREPARE_TRANSLATION = LIST_PARAM___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_OPERATOR_LIST = LIST_PARAM___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_ALL_OPERATORS = LIST_PARAM___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_PARAMETER_LIST = LIST_PARAM___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_ALL_PARAMETERS = LIST_PARAM___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___PREPARE_PARAMETER_UPDATES = LIST_PARAM___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = LIST_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = LIST_PARAM___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = LIST_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___RECORD_VALUES__XMLDATADATABASE = LIST_PARAM___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___RELATIONS_XML_ADAPTED = LIST_PARAM___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___CREATE_XML_ADAPTION = LIST_PARAM___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___CREATE_RDF_ADAPTION = LIST_PARAM___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___CREATE_NEO4J_ADAPTION = LIST_PARAM___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___CONTAINS_JAVA_OPERATOR = LIST_PARAM___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GENERATE_QUERY_FILTER_PART = LIST_PARAM___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GENERATE_XQUERY_JAVA = LIST_PARAM___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GENERATE_XQUERY_JAVA_RETURN = LIST_PARAM___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GENERATE_XQUERY_JAVA_WHERE = LIST_PARAM___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___VALIDATE_AGAINST_SCHEMA = LIST_PARAM___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = LIST_PARAM___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___INPUT_IS_VALID = LIST_PARAM___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___IS_USED = LIST_PARAM___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___SET_VALUE_FROM_STRING__STRING = LIST_PARAM___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_VALUE_AS_STRING = LIST_PARAM___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___CHECK_COMPARISON_CONSISTENCY = LIST_PARAM___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_OPTIONS_AS_STRING_LIST = LIST_PARAM___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GENERATE_DESCRIPTION = LIST_PARAM___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = LIST_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_RETURN_TYPE = LIST_PARAM___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___IS_TRANSLATABLE = LIST_PARAM___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_ALL_ARGUMENT_ELEMENTS = LIST_PARAM___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___IS_OPERATOR_ARGUMENT = LIST_PARAM___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___REPLACE__PARAMETERVALUE = LIST_PARAM___REPLACE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___REPLACE_VIA_VALUE__STRING_STRING = LIST_PARAM___REPLACE_VIA_VALUE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_ELEMENT_TAGS = LIST_PARAM___GET_ELEMENT_TAGS;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_DATA_VALUES = LIST_PARAM___GET_DATA_VALUES;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___IS_IN_DATA_COMPARISON = LIST_PARAM___IS_IN_DATA_COMPARISON;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___IS_IN_TAG_COMPARISON = LIST_PARAM___IS_IN_TAG_COMPARISON;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_ATTRIBUTE_NAMES = LIST_PARAM___GET_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_ATTRIBUTE_VALUES = LIST_PARAM___GET_ATTRIBUTE_VALUES;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___IS_IN_ATTRIBUTE_COMPARISON = LIST_PARAM___IS_IN_ATTRIBUTE_COMPARISON;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_SUGGESTIONS = LIST_PARAM___GET_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___INFER_SUGGESTIONS = LIST_PARAM___INFER_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Set Value If Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___SET_VALUE_IF_VALID__ELIST = LIST_PARAM___SET_VALUE_IF_VALID__ELIST;

	/**
	 * The operation id for the '<em>Get List Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_LIST_VAR = LIST_PARAM___GET_LIST_VAR;

	/**
	 * The operation id for the '<em>Get List Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___GET_LIST_DECLARATION = LIST_PARAM___GET_LIST_DECLARATION;

	/**
	 * The operation id for the '<em>Add String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM___ADD_STRING_VALUE__STRING = LIST_PARAM___ADD_STRING_VALUE__STRING;

	/**
	 * The number of operations of the '<em>Text List Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIST_PARAM_OPERATION_COUNT = LIST_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl <em>Text Literal Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.TextLiteralParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getTextLiteralParam()
	 * @generated
	 */
	int TEXT_LITERAL_PARAM = 5;

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
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__PREDEFINED = PARAMETER_VALUE__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__PARAMETER_REFERENCES = PARAMETER_VALUE__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__DESCRIPTION = PARAMETER_VALUE__DESCRIPTION;

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
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__TYPE_MODIFIABLE = PARAMETER_VALUE__TYPE_MODIFIABLE;

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
	 * The feature id for the '<em><b>Xml Property Option Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM = PARAMETER_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Xml Axis Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__XML_AXIS_PART = PARAMETER_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM__CONTAINS = PARAMETER_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Text Literal Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___IS_VALID__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___MY_TO_STRING = PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GENERATE_CYPHER = PARAMETER_VALUE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GENERATE_XQUERY = PARAMETER_VALUE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GENERATE_SPARQL = PARAMETER_VALUE___GENERATE_SPARQL;

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
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___INITIALIZE_TRANSLATION = PARAMETER_VALUE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___PREPARE_TRANSLATION = PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_OPERATOR_LIST = PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_ALL_OPERATORS = PARAMETER_VALUE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_PARAMETER_LIST = PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_ALL_PARAMETERS = PARAMETER_VALUE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___PREPARE_PARAMETER_UPDATES = PARAMETER_VALUE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___RECORD_VALUES__XMLDATADATABASE = PARAMETER_VALUE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___RELATIONS_XML_ADAPTED = PARAMETER_VALUE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___CREATE_XML_ADAPTION = PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___CREATE_RDF_ADAPTION = PARAMETER_VALUE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___CREATE_NEO4J_ADAPTION = PARAMETER_VALUE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___CONTAINS_JAVA_OPERATOR = PARAMETER_VALUE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GENERATE_QUERY_FILTER_PART = PARAMETER_VALUE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GENERATE_XQUERY_JAVA = PARAMETER_VALUE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GENERATE_XQUERY_JAVA_RETURN = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GENERATE_XQUERY_JAVA_WHERE = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___VALIDATE_AGAINST_SCHEMA = PARAMETER_VALUE___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = PARAMETER_VALUE___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___INPUT_IS_VALID = PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___IS_USED = PARAMETER_VALUE___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___SET_VALUE_FROM_STRING__STRING = PARAMETER_VALUE___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_VALUE_AS_STRING = PARAMETER_VALUE___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___CHECK_COMPARISON_CONSISTENCY = PARAMETER_VALUE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_OPTIONS_AS_STRING_LIST = PARAMETER_VALUE___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GENERATE_DESCRIPTION = PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___IS_OPERATOR_ARGUMENT = PARAMETER_VALUE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___REPLACE__PARAMETERVALUE = PARAMETER_VALUE___REPLACE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___REPLACE_VIA_VALUE__STRING_STRING = PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_ELEMENT_TAGS = PARAMETER_VALUE___GET_ELEMENT_TAGS;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_DATA_VALUES = PARAMETER_VALUE___GET_DATA_VALUES;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___IS_IN_DATA_COMPARISON = PARAMETER_VALUE___IS_IN_DATA_COMPARISON;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___IS_IN_TAG_COMPARISON = PARAMETER_VALUE___IS_IN_TAG_COMPARISON;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_ATTRIBUTE_NAMES = PARAMETER_VALUE___GET_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_ATTRIBUTE_VALUES = PARAMETER_VALUE___GET_ATTRIBUTE_VALUES;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___IS_IN_ATTRIBUTE_COMPARISON = PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___GET_SUGGESTIONS = PARAMETER_VALUE___GET_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___INFER_SUGGESTIONS = PARAMETER_VALUE___INFER_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Set Value If Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM___SET_VALUE_IF_VALID__STRING = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Literal Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_PARAM_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.NumberParamImpl <em>Number Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.NumberParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getNumberParam()
	 * @generated
	 */
	int NUMBER_PARAM = 6;

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
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM__PREDEFINED = PARAMETER_VALUE__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM__PARAMETER_REFERENCES = PARAMETER_VALUE__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM__DESCRIPTION = PARAMETER_VALUE__DESCRIPTION;

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
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM__TYPE_MODIFIABLE = PARAMETER_VALUE__TYPE_MODIFIABLE;

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
	 * The feature id for the '<em><b>String Length</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM__STRING_LENGTH = PARAMETER_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___IS_VALID__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___MY_TO_STRING = PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GENERATE_CYPHER = PARAMETER_VALUE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GENERATE_XQUERY = PARAMETER_VALUE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GENERATE_SPARQL = PARAMETER_VALUE___GENERATE_SPARQL;

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
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___INITIALIZE_TRANSLATION = PARAMETER_VALUE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___PREPARE_TRANSLATION = PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_OPERATOR_LIST = PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_ALL_OPERATORS = PARAMETER_VALUE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_PARAMETER_LIST = PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_ALL_PARAMETERS = PARAMETER_VALUE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___PREPARE_PARAMETER_UPDATES = PARAMETER_VALUE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___RECORD_VALUES__XMLDATADATABASE = PARAMETER_VALUE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___RELATIONS_XML_ADAPTED = PARAMETER_VALUE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___CREATE_XML_ADAPTION = PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___CREATE_RDF_ADAPTION = PARAMETER_VALUE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___CREATE_NEO4J_ADAPTION = PARAMETER_VALUE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___CONTAINS_JAVA_OPERATOR = PARAMETER_VALUE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GENERATE_QUERY_FILTER_PART = PARAMETER_VALUE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GENERATE_XQUERY_JAVA = PARAMETER_VALUE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GENERATE_XQUERY_JAVA_RETURN = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GENERATE_XQUERY_JAVA_WHERE = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___VALIDATE_AGAINST_SCHEMA = PARAMETER_VALUE___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = PARAMETER_VALUE___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___INPUT_IS_VALID = PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___IS_USED = PARAMETER_VALUE___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___SET_VALUE_FROM_STRING__STRING = PARAMETER_VALUE___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_VALUE_AS_STRING = PARAMETER_VALUE___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___CHECK_COMPARISON_CONSISTENCY = PARAMETER_VALUE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_OPTIONS_AS_STRING_LIST = PARAMETER_VALUE___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GENERATE_DESCRIPTION = PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___IS_OPERATOR_ARGUMENT = PARAMETER_VALUE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___REPLACE__PARAMETERVALUE = PARAMETER_VALUE___REPLACE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___REPLACE_VIA_VALUE__STRING_STRING = PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_ELEMENT_TAGS = PARAMETER_VALUE___GET_ELEMENT_TAGS;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_DATA_VALUES = PARAMETER_VALUE___GET_DATA_VALUES;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___IS_IN_DATA_COMPARISON = PARAMETER_VALUE___IS_IN_DATA_COMPARISON;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___IS_IN_TAG_COMPARISON = PARAMETER_VALUE___IS_IN_TAG_COMPARISON;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_ATTRIBUTE_NAMES = PARAMETER_VALUE___GET_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_ATTRIBUTE_VALUES = PARAMETER_VALUE___GET_ATTRIBUTE_VALUES;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___IS_IN_ATTRIBUTE_COMPARISON = PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___GET_SUGGESTIONS = PARAMETER_VALUE___GET_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___INFER_SUGGESTIONS = PARAMETER_VALUE___INFER_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Set Value If Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM___SET_VALUE_IF_VALID__DOUBLE = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARAM_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.DateParamImpl <em>Date Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.DateParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getDateParam()
	 * @generated
	 */
	int DATE_PARAM = 8;

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
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM__PREDEFINED = PARAMETER_VALUE__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM__PARAMETER_REFERENCES = PARAMETER_VALUE__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM__DESCRIPTION = PARAMETER_VALUE__DESCRIPTION;

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
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM__TYPE_MODIFIABLE = PARAMETER_VALUE__TYPE_MODIFIABLE;

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
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___IS_VALID__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___MY_TO_STRING = PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GENERATE_CYPHER = PARAMETER_VALUE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GENERATE_XQUERY = PARAMETER_VALUE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GENERATE_SPARQL = PARAMETER_VALUE___GENERATE_SPARQL;

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
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___INITIALIZE_TRANSLATION = PARAMETER_VALUE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___PREPARE_TRANSLATION = PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_OPERATOR_LIST = PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_ALL_OPERATORS = PARAMETER_VALUE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_PARAMETER_LIST = PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_ALL_PARAMETERS = PARAMETER_VALUE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___PREPARE_PARAMETER_UPDATES = PARAMETER_VALUE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___RECORD_VALUES__XMLDATADATABASE = PARAMETER_VALUE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___RELATIONS_XML_ADAPTED = PARAMETER_VALUE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___CREATE_XML_ADAPTION = PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___CREATE_RDF_ADAPTION = PARAMETER_VALUE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___CREATE_NEO4J_ADAPTION = PARAMETER_VALUE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___CONTAINS_JAVA_OPERATOR = PARAMETER_VALUE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GENERATE_QUERY_FILTER_PART = PARAMETER_VALUE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GENERATE_XQUERY_JAVA = PARAMETER_VALUE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GENERATE_XQUERY_JAVA_RETURN = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GENERATE_XQUERY_JAVA_WHERE = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___VALIDATE_AGAINST_SCHEMA = PARAMETER_VALUE___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = PARAMETER_VALUE___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___INPUT_IS_VALID = PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___IS_USED = PARAMETER_VALUE___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___SET_VALUE_FROM_STRING__STRING = PARAMETER_VALUE___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_VALUE_AS_STRING = PARAMETER_VALUE___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___CHECK_COMPARISON_CONSISTENCY = PARAMETER_VALUE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_OPTIONS_AS_STRING_LIST = PARAMETER_VALUE___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GENERATE_DESCRIPTION = PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___IS_OPERATOR_ARGUMENT = PARAMETER_VALUE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___REPLACE__PARAMETERVALUE = PARAMETER_VALUE___REPLACE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___REPLACE_VIA_VALUE__STRING_STRING = PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_ELEMENT_TAGS = PARAMETER_VALUE___GET_ELEMENT_TAGS;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_DATA_VALUES = PARAMETER_VALUE___GET_DATA_VALUES;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___IS_IN_DATA_COMPARISON = PARAMETER_VALUE___IS_IN_DATA_COMPARISON;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___IS_IN_TAG_COMPARISON = PARAMETER_VALUE___IS_IN_TAG_COMPARISON;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_ATTRIBUTE_NAMES = PARAMETER_VALUE___GET_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_ATTRIBUTE_VALUES = PARAMETER_VALUE___GET_ATTRIBUTE_VALUES;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___IS_IN_ATTRIBUTE_COMPARISON = PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___GET_SUGGESTIONS = PARAMETER_VALUE___GET_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___INFER_SUGGESTIONS = PARAMETER_VALUE___INFER_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Set Value If Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM___SET_VALUE_IF_VALID__STRING = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAM_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.TimeParamImpl <em>Time Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.TimeParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getTimeParam()
	 * @generated
	 */
	int TIME_PARAM = 9;

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
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM__PREDEFINED = PARAMETER_VALUE__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM__PARAMETER_REFERENCES = PARAMETER_VALUE__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM__DESCRIPTION = PARAMETER_VALUE__DESCRIPTION;

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
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM__TYPE_MODIFIABLE = PARAMETER_VALUE__TYPE_MODIFIABLE;

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
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___IS_VALID__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___MY_TO_STRING = PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GENERATE_CYPHER = PARAMETER_VALUE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GENERATE_XQUERY = PARAMETER_VALUE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GENERATE_SPARQL = PARAMETER_VALUE___GENERATE_SPARQL;

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
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___INITIALIZE_TRANSLATION = PARAMETER_VALUE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___PREPARE_TRANSLATION = PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_OPERATOR_LIST = PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_ALL_OPERATORS = PARAMETER_VALUE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_PARAMETER_LIST = PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_ALL_PARAMETERS = PARAMETER_VALUE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___PREPARE_PARAMETER_UPDATES = PARAMETER_VALUE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___RECORD_VALUES__XMLDATADATABASE = PARAMETER_VALUE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___RELATIONS_XML_ADAPTED = PARAMETER_VALUE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___CREATE_XML_ADAPTION = PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___CREATE_RDF_ADAPTION = PARAMETER_VALUE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___CREATE_NEO4J_ADAPTION = PARAMETER_VALUE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___CONTAINS_JAVA_OPERATOR = PARAMETER_VALUE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GENERATE_QUERY_FILTER_PART = PARAMETER_VALUE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GENERATE_XQUERY_JAVA = PARAMETER_VALUE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GENERATE_XQUERY_JAVA_RETURN = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GENERATE_XQUERY_JAVA_WHERE = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___VALIDATE_AGAINST_SCHEMA = PARAMETER_VALUE___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = PARAMETER_VALUE___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___INPUT_IS_VALID = PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___IS_USED = PARAMETER_VALUE___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___SET_VALUE_FROM_STRING__STRING = PARAMETER_VALUE___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_VALUE_AS_STRING = PARAMETER_VALUE___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___CHECK_COMPARISON_CONSISTENCY = PARAMETER_VALUE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_OPTIONS_AS_STRING_LIST = PARAMETER_VALUE___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GENERATE_DESCRIPTION = PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___IS_OPERATOR_ARGUMENT = PARAMETER_VALUE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___REPLACE__PARAMETERVALUE = PARAMETER_VALUE___REPLACE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___REPLACE_VIA_VALUE__STRING_STRING = PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_ELEMENT_TAGS = PARAMETER_VALUE___GET_ELEMENT_TAGS;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_DATA_VALUES = PARAMETER_VALUE___GET_DATA_VALUES;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___IS_IN_DATA_COMPARISON = PARAMETER_VALUE___IS_IN_DATA_COMPARISON;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___IS_IN_TAG_COMPARISON = PARAMETER_VALUE___IS_IN_TAG_COMPARISON;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_ATTRIBUTE_NAMES = PARAMETER_VALUE___GET_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_ATTRIBUTE_VALUES = PARAMETER_VALUE___GET_ATTRIBUTE_VALUES;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___IS_IN_ATTRIBUTE_COMPARISON = PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___GET_SUGGESTIONS = PARAMETER_VALUE___GET_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___INFER_SUGGESTIONS = PARAMETER_VALUE___INFER_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Set Value If Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM___SET_VALUE_IF_VALID__STRING = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAM_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.UntypedParameterValueImpl <em>Untyped Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.UntypedParameterValueImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getUntypedParameterValue()
	 * @generated
	 */
	int UNTYPED_PARAMETER_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE__ID = PARAMETER_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE__INTERNAL_ID = PARAMETER_VALUE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE__PARAMETER_LIST = PARAMETER_VALUE__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE__PREDEFINED = PARAMETER_VALUE__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE__PARAMETER_REFERENCES = PARAMETER_VALUE__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE__DESCRIPTION = PARAMETER_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE__COMPARISON1 = PARAMETER_VALUE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE__COMPARISON2 = PARAMETER_VALUE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE__TYPE_MODIFIABLE = PARAMETER_VALUE__TYPE_MODIFIABLE;

	/**
	 * The number of structural features of the '<em>Untyped Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___IS_VALID__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___MY_TO_STRING = PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GENERATE_CYPHER = PARAMETER_VALUE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GENERATE_XQUERY = PARAMETER_VALUE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GENERATE_SPARQL = PARAMETER_VALUE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GET_CONTAINER = PARAMETER_VALUE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GET_ANCESTOR__CLASS = PARAMETER_VALUE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___INITIALIZE_TRANSLATION = PARAMETER_VALUE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___PREPARE_TRANSLATION = PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GET_OPERATOR_LIST = PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GET_ALL_OPERATORS = PARAMETER_VALUE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GET_PARAMETER_LIST = PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GET_ALL_PARAMETERS = PARAMETER_VALUE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___PREPARE_PARAMETER_UPDATES = PARAMETER_VALUE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___RECORD_VALUES__XMLDATADATABASE = PARAMETER_VALUE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___RELATIONS_XML_ADAPTED = PARAMETER_VALUE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___CREATE_XML_ADAPTION = PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___CREATE_RDF_ADAPTION = PARAMETER_VALUE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___CREATE_NEO4J_ADAPTION = PARAMETER_VALUE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___CONTAINS_JAVA_OPERATOR = PARAMETER_VALUE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GENERATE_QUERY_FILTER_PART = PARAMETER_VALUE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GENERATE_XQUERY_JAVA = PARAMETER_VALUE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GENERATE_XQUERY_JAVA_RETURN = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GENERATE_XQUERY_JAVA_WHERE = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___VALIDATE_AGAINST_SCHEMA = PARAMETER_VALUE___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___VALIDATE_EXAMPLE_VALUE__STRING = PARAMETER_VALUE___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___INPUT_IS_VALID = PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___IS_USED = PARAMETER_VALUE___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___SET_VALUE_FROM_STRING__STRING = PARAMETER_VALUE___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GET_VALUE_AS_STRING = PARAMETER_VALUE___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___CHECK_COMPARISON_CONSISTENCY = PARAMETER_VALUE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GET_OPTIONS_AS_STRING_LIST = PARAMETER_VALUE___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GENERATE_DESCRIPTION = PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GET_RETURN_TYPE = PARAMETER_VALUE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___IS_TRANSLATABLE = PARAMETER_VALUE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS = PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___IS_OPERATOR_ARGUMENT = PARAMETER_VALUE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___REPLACE__PARAMETERVALUE = PARAMETER_VALUE___REPLACE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING = PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GET_ELEMENT_TAGS = PARAMETER_VALUE___GET_ELEMENT_TAGS;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GET_DATA_VALUES = PARAMETER_VALUE___GET_DATA_VALUES;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___IS_IN_DATA_COMPARISON = PARAMETER_VALUE___IS_IN_DATA_COMPARISON;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___IS_IN_TAG_COMPARISON = PARAMETER_VALUE___IS_IN_TAG_COMPARISON;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GET_ATTRIBUTE_NAMES = PARAMETER_VALUE___GET_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GET_ATTRIBUTE_VALUES = PARAMETER_VALUE___GET_ATTRIBUTE_VALUES;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON = PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___GET_SUGGESTIONS = PARAMETER_VALUE___GET_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___INFER_SUGGESTIONS = PARAMETER_VALUE___INFER_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE___SET_VALUE__STRING = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Untyped Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTYPED_PARAMETER_VALUE_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.DateTimeParamImpl <em>Date Time Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.DateTimeParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getDateTimeParam()
	 * @generated
	 */
	int DATE_TIME_PARAM = 11;

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
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM__PREDEFINED = PARAMETER_VALUE__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM__PARAMETER_REFERENCES = PARAMETER_VALUE__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM__DESCRIPTION = PARAMETER_VALUE__DESCRIPTION;

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
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM__TYPE_MODIFIABLE = PARAMETER_VALUE__TYPE_MODIFIABLE;

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
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___IS_VALID__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PARAMETER_VALUE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___MY_TO_STRING = PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GENERATE_CYPHER = PARAMETER_VALUE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GENERATE_XQUERY = PARAMETER_VALUE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GENERATE_SPARQL = PARAMETER_VALUE___GENERATE_SPARQL;

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
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___INITIALIZE_TRANSLATION = PARAMETER_VALUE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___PREPARE_TRANSLATION = PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_OPERATOR_LIST = PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_ALL_OPERATORS = PARAMETER_VALUE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_PARAMETER_LIST = PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_ALL_PARAMETERS = PARAMETER_VALUE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___PREPARE_PARAMETER_UPDATES = PARAMETER_VALUE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___RECORD_VALUES__XMLDATADATABASE = PARAMETER_VALUE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___RELATIONS_XML_ADAPTED = PARAMETER_VALUE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___CREATE_XML_ADAPTION = PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___CREATE_RDF_ADAPTION = PARAMETER_VALUE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___CREATE_NEO4J_ADAPTION = PARAMETER_VALUE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___CONTAINS_JAVA_OPERATOR = PARAMETER_VALUE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GENERATE_QUERY_FILTER_PART = PARAMETER_VALUE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GENERATE_XQUERY_JAVA = PARAMETER_VALUE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GENERATE_XQUERY_JAVA_RETURN = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GENERATE_XQUERY_JAVA_WHERE = PARAMETER_VALUE___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___VALIDATE_AGAINST_SCHEMA = PARAMETER_VALUE___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = PARAMETER_VALUE___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___INPUT_IS_VALID = PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___IS_USED = PARAMETER_VALUE___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___SET_VALUE_FROM_STRING__STRING = PARAMETER_VALUE___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_VALUE_AS_STRING = PARAMETER_VALUE___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___CHECK_COMPARISON_CONSISTENCY = PARAMETER_VALUE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_OPTIONS_AS_STRING_LIST = PARAMETER_VALUE___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GENERATE_DESCRIPTION = PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___IS_OPERATOR_ARGUMENT = PARAMETER_VALUE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___REPLACE__PARAMETERVALUE = PARAMETER_VALUE___REPLACE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___REPLACE_VIA_VALUE__STRING_STRING = PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_ELEMENT_TAGS = PARAMETER_VALUE___GET_ELEMENT_TAGS;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_DATA_VALUES = PARAMETER_VALUE___GET_DATA_VALUES;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___IS_IN_DATA_COMPARISON = PARAMETER_VALUE___IS_IN_DATA_COMPARISON;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___IS_IN_TAG_COMPARISON = PARAMETER_VALUE___IS_IN_TAG_COMPARISON;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_ATTRIBUTE_NAMES = PARAMETER_VALUE___GET_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_ATTRIBUTE_VALUES = PARAMETER_VALUE___GET_ATTRIBUTE_VALUES;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___IS_IN_ATTRIBUTE_COMPARISON = PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___GET_SUGGESTIONS = PARAMETER_VALUE___GET_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___INFER_SUGGESTIONS = PARAMETER_VALUE___INFER_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Set Value If Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM___SET_VALUE_IF_VALID__STRING = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date Time Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAM_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.TypeOptionParamImpl <em>Type Option Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.TypeOptionParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getTypeOptionParam()
	 * @generated
	 */
	int TYPE_OPTION_PARAM = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM__INTERNAL_ID = PARAMETER__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM__PARAMETER_LIST = PARAMETER__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM__PREDEFINED = PARAMETER__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM__PARAMETER_REFERENCES = PARAMETER__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM__OPTIONS = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM__VALUE = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Comparisons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM__TYPE_COMPARISONS = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___IS_VALID__ABSTRACTIONLEVEL = PARAMETER___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PARAMETER___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___MY_TO_STRING = PARAMETER___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GENERATE_CYPHER = PARAMETER___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GENERATE_XQUERY = PARAMETER___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GENERATE_SPARQL = PARAMETER___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GET_CONTAINER = PARAMETER___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GET_ANCESTOR__CLASS = PARAMETER___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___INITIALIZE_TRANSLATION = PARAMETER___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___PREPARE_TRANSLATION = PARAMETER___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GET_OPERATOR_LIST = PARAMETER___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GET_ALL_OPERATORS = PARAMETER___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GET_PARAMETER_LIST = PARAMETER___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GET_ALL_PARAMETERS = PARAMETER___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___PREPARE_PARAMETER_UPDATES = PARAMETER___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___RECORD_VALUES__XMLDATADATABASE = PARAMETER___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___RELATIONS_XML_ADAPTED = PARAMETER___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___CREATE_XML_ADAPTION = PARAMETER___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___CREATE_RDF_ADAPTION = PARAMETER___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___CREATE_NEO4J_ADAPTION = PARAMETER___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___CONTAINS_JAVA_OPERATOR = PARAMETER___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GENERATE_QUERY_FILTER_PART = PARAMETER___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GENERATE_XQUERY_JAVA = PARAMETER___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GENERATE_XQUERY_JAVA_RETURN = PARAMETER___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GENERATE_XQUERY_JAVA_WHERE = PARAMETER___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___VALIDATE_AGAINST_SCHEMA = PARAMETER___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___INPUT_IS_VALID = PARAMETER___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___IS_USED = PARAMETER___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___SET_VALUE_FROM_STRING__STRING = PARAMETER___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GET_VALUE_AS_STRING = PARAMETER___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___CHECK_COMPARISON_CONSISTENCY = PARAMETER___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GET_OPTIONS_AS_STRING_LIST = PARAMETER___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM___GENERATE_DESCRIPTION = PARAMETER___GENERATE_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Type Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPTION_PARAM_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.KeyValueParamImpl <em>Key Value Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.KeyValueParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getKeyValueParam()
	 * @generated
	 */
	int KEY_VALUE_PARAM = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM__INTERNAL_ID = PARAMETER__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM__PARAMETER_LIST = PARAMETER__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM__PREDEFINED = PARAMETER__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM__PARAMETER_REFERENCES = PARAMETER__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Key Value Pair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM__KEY_VALUE_PAIR = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Key Value Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___IS_VALID__ABSTRACTIONLEVEL = PARAMETER___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PARAMETER___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___MY_TO_STRING = PARAMETER___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GENERATE_CYPHER = PARAMETER___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GENERATE_XQUERY = PARAMETER___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GENERATE_SPARQL = PARAMETER___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GET_CONTAINER = PARAMETER___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GET_ANCESTOR__CLASS = PARAMETER___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___INITIALIZE_TRANSLATION = PARAMETER___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___PREPARE_TRANSLATION = PARAMETER___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GET_OPERATOR_LIST = PARAMETER___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GET_ALL_OPERATORS = PARAMETER___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GET_PARAMETER_LIST = PARAMETER___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GET_ALL_PARAMETERS = PARAMETER___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___PREPARE_PARAMETER_UPDATES = PARAMETER___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___RECORD_VALUES__XMLDATADATABASE = PARAMETER___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___RELATIONS_XML_ADAPTED = PARAMETER___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___CREATE_XML_ADAPTION = PARAMETER___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___CREATE_RDF_ADAPTION = PARAMETER___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___CREATE_NEO4J_ADAPTION = PARAMETER___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___CONTAINS_JAVA_OPERATOR = PARAMETER___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GENERATE_QUERY_FILTER_PART = PARAMETER___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GENERATE_XQUERY_JAVA = PARAMETER___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GENERATE_XQUERY_JAVA_RETURN = PARAMETER___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GENERATE_XQUERY_JAVA_WHERE = PARAMETER___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___VALIDATE_AGAINST_SCHEMA = PARAMETER___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___INPUT_IS_VALID = PARAMETER___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___IS_USED = PARAMETER___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___SET_VALUE_FROM_STRING__STRING = PARAMETER___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GET_VALUE_AS_STRING = PARAMETER___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___CHECK_COMPARISON_CONSISTENCY = PARAMETER___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GET_OPTIONS_AS_STRING_LIST = PARAMETER___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___GENERATE_DESCRIPTION = PARAMETER___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Add Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___ADD_VALUE__STRING_STRING = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set New Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM___SET_NEW_MAP__MAP = PARAMETER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Key Value Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PARAM_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.parameters.impl.MultiListParamImpl <em>Multi List Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.MultiListParamImpl
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getMultiListParam()
	 * @generated
	 */
	int MULTI_LIST_PARAM = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM__ID = LIST_PARAM__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM__INTERNAL_ID = LIST_PARAM__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM__PARAMETER_LIST = LIST_PARAM__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM__PREDEFINED = LIST_PARAM__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM__PARAMETER_REFERENCES = LIST_PARAM__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM__DESCRIPTION = LIST_PARAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM__COMPARISON1 = LIST_PARAM__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM__COMPARISON2 = LIST_PARAM__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM__TYPE_MODIFIABLE = LIST_PARAM__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM__VALUES = LIST_PARAM__VALUES;

	/**
	 * The number of structural features of the '<em>Multi List Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM_FEATURE_COUNT = LIST_PARAM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___IS_VALID__ABSTRACTIONLEVEL = LIST_PARAM___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = LIST_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___MY_TO_STRING = LIST_PARAM___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GENERATE_CYPHER = LIST_PARAM___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GENERATE_XQUERY = LIST_PARAM___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GENERATE_SPARQL = LIST_PARAM___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_CONTAINER = LIST_PARAM___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_ANCESTOR__CLASS = LIST_PARAM___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___INITIALIZE_TRANSLATION = LIST_PARAM___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___PREPARE_TRANSLATION = LIST_PARAM___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_OPERATOR_LIST = LIST_PARAM___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_ALL_OPERATORS = LIST_PARAM___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_PARAMETER_LIST = LIST_PARAM___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_ALL_PARAMETERS = LIST_PARAM___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___PREPARE_PARAMETER_UPDATES = LIST_PARAM___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = LIST_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = LIST_PARAM___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = LIST_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___RECORD_VALUES__XMLDATADATABASE = LIST_PARAM___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___RELATIONS_XML_ADAPTED = LIST_PARAM___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___CREATE_XML_ADAPTION = LIST_PARAM___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___CREATE_RDF_ADAPTION = LIST_PARAM___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___CREATE_NEO4J_ADAPTION = LIST_PARAM___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___CONTAINS_JAVA_OPERATOR = LIST_PARAM___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GENERATE_QUERY_FILTER_PART = LIST_PARAM___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GENERATE_XQUERY_JAVA = LIST_PARAM___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GENERATE_XQUERY_JAVA_RETURN = LIST_PARAM___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GENERATE_XQUERY_JAVA_WHERE = LIST_PARAM___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___VALIDATE_AGAINST_SCHEMA = LIST_PARAM___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = LIST_PARAM___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___INPUT_IS_VALID = LIST_PARAM___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___IS_USED = LIST_PARAM___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___SET_VALUE_FROM_STRING__STRING = LIST_PARAM___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_VALUE_AS_STRING = LIST_PARAM___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___CHECK_COMPARISON_CONSISTENCY = LIST_PARAM___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_OPTIONS_AS_STRING_LIST = LIST_PARAM___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GENERATE_DESCRIPTION = LIST_PARAM___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = LIST_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_RETURN_TYPE = LIST_PARAM___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___IS_TRANSLATABLE = LIST_PARAM___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_ALL_ARGUMENT_ELEMENTS = LIST_PARAM___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___IS_OPERATOR_ARGUMENT = LIST_PARAM___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___REPLACE__PARAMETERVALUE = LIST_PARAM___REPLACE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___REPLACE_VIA_VALUE__STRING_STRING = LIST_PARAM___REPLACE_VIA_VALUE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_ELEMENT_TAGS = LIST_PARAM___GET_ELEMENT_TAGS;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_DATA_VALUES = LIST_PARAM___GET_DATA_VALUES;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___IS_IN_DATA_COMPARISON = LIST_PARAM___IS_IN_DATA_COMPARISON;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___IS_IN_TAG_COMPARISON = LIST_PARAM___IS_IN_TAG_COMPARISON;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_ATTRIBUTE_NAMES = LIST_PARAM___GET_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_ATTRIBUTE_VALUES = LIST_PARAM___GET_ATTRIBUTE_VALUES;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___IS_IN_ATTRIBUTE_COMPARISON = LIST_PARAM___IS_IN_ATTRIBUTE_COMPARISON;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_SUGGESTIONS = LIST_PARAM___GET_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___INFER_SUGGESTIONS = LIST_PARAM___INFER_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Set Value If Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___SET_VALUE_IF_VALID__ELIST = LIST_PARAM___SET_VALUE_IF_VALID__ELIST;

	/**
	 * The operation id for the '<em>Get List Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_LIST_VAR = LIST_PARAM___GET_LIST_VAR;

	/**
	 * The operation id for the '<em>Get List Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___GET_LIST_DECLARATION = LIST_PARAM___GET_LIST_DECLARATION;

	/**
	 * The operation id for the '<em>Add String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM___ADD_STRING_VALUE__STRING = LIST_PARAM___ADD_STRING_VALUE__STRING;

	/**
	 * The number of operations of the '<em>Multi List Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LIST_PARAM_OPERATION_COUNT = LIST_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>String To Int EMap</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.EMap
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getStringToIntEMap()
	 * @generated
	 */
	int STRING_TO_INT_EMAP = 16;

	/**
	 * The meta object id for the '<em>String Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getStringArray()
	 * @generated
	 */
	int STRING_ARRAY = 17;

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.Parameter#isPredefined <em>Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predefined</em>'.
	 * @see qualitypatternmodel.parameters.Parameter#isPredefined()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Predefined();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.Parameter#getParameterReferences <em>Parameter References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter References</em>'.
	 * @see qualitypatternmodel.parameters.Parameter#getParameterReferences()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParameterReferences();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.Parameter#isUsed() <em>Is Used</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Used</em>' operation.
	 * @see qualitypatternmodel.parameters.Parameter#isUsed()
	 * @generated
	 */
	EOperation getParameter__IsUsed();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.Parameter#getValueAsString() <em>Get Value As String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value As String</em>' operation.
	 * @see qualitypatternmodel.parameters.Parameter#getValueAsString()
	 * @generated
	 */
	EOperation getParameter__GetValueAsString();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.Parameter#setValueFromString(java.lang.String) <em>Set Value From String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value From String</em>' operation.
	 * @see qualitypatternmodel.parameters.Parameter#setValueFromString(java.lang.String)
	 * @generated
	 */
	EOperation getParameter__SetValueFromString__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.Parameter#getOptionsAsStringList() <em>Get Options As String List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Options As String List</em>' operation.
	 * @see qualitypatternmodel.parameters.Parameter#getOptionsAsStringList()
	 * @generated
	 */
	EOperation getParameter__GetOptionsAsStringList();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.Parameter#validateAgainstSchema() <em>Validate Against Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Against Schema</em>' operation.
	 * @see qualitypatternmodel.parameters.Parameter#validateAgainstSchema()
	 * @generated
	 */
	EOperation getParameter__ValidateAgainstSchema();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.Parameter#checkComparisonConsistency() <em>Check Comparison Consistency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Comparison Consistency</em>' operation.
	 * @see qualitypatternmodel.parameters.Parameter#checkComparisonConsistency()
	 * @generated
	 */
	EOperation getParameter__CheckComparisonConsistency();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.Parameter#validateExampleValue(java.lang.String) <em>Validate Example Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Example Value</em>' operation.
	 * @see qualitypatternmodel.parameters.Parameter#validateExampleValue(java.lang.String)
	 * @generated
	 */
	EOperation getParameter__ValidateExampleValue__String();

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
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.ComparisonOptionParam#getCountConditions <em>Count Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Count Conditions</em>'.
	 * @see qualitypatternmodel.parameters.ComparisonOptionParam#getCountConditions()
	 * @see #getComparisonOptionParam()
	 * @generated
	 */
	EReference getComparisonOptionParam_CountConditions();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.ComparisonOptionParam#getStringLength <em>String Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>String Length</em>'.
	 * @see qualitypatternmodel.parameters.ComparisonOptionParam#getStringLength()
	 * @see #getComparisonOptionParam()
	 * @generated
	 */
	EReference getComparisonOptionParam_StringLength();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ComparisonOptionParam#setValueIfValid(qualitypatternmodel.operators.ComparisonOperator) <em>Set Value If Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value If Valid</em>' operation.
	 * @see qualitypatternmodel.parameters.ComparisonOptionParam#setValueIfValid(qualitypatternmodel.operators.ComparisonOperator)
	 * @generated
	 */
	EOperation getComparisonOptionParam__SetValueIfValid__ComparisonOperator();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ParameterList#remove(qualitypatternmodel.parameters.Parameter) <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see qualitypatternmodel.parameters.ParameterList#remove(qualitypatternmodel.parameters.Parameter)
	 * @generated
	 */
	EOperation getParameterList__Remove__Parameter();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ParameterList#validateAgainstSchema() <em>Validate Against Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Against Schema</em>' operation.
	 * @see qualitypatternmodel.parameters.ParameterList#validateAgainstSchema()
	 * @generated
	 */
	EOperation getParameterList__ValidateAgainstSchema();

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
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.BooleanParam#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see qualitypatternmodel.parameters.BooleanParam#getContains()
	 * @see #getBooleanParam()
	 * @generated
	 */
	EReference getBooleanParam_Contains();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.BooleanParam#getNullCheck <em>Null Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Null Check</em>'.
	 * @see qualitypatternmodel.parameters.BooleanParam#getNullCheck()
	 * @see #getBooleanParam()
	 * @generated
	 */
	EReference getBooleanParam_NullCheck();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.BooleanParam#getOneArgJavaOperator <em>One Arg Java Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>One Arg Java Operator</em>'.
	 * @see qualitypatternmodel.parameters.BooleanParam#getOneArgJavaOperator()
	 * @see #getBooleanParam()
	 * @generated
	 */
	EReference getBooleanParam_OneArgJavaOperator();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.BooleanParam#setValueIfValid(java.lang.Boolean) <em>Set Value If Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value If Valid</em>' operation.
	 * @see qualitypatternmodel.parameters.BooleanParam#setValueIfValid(java.lang.Boolean)
	 * @generated
	 */
	EOperation getBooleanParam__SetValueIfValid__Boolean();

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
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.parameters.TextLiteralParam#getXmlPropertyOptionParam <em>Xml Property Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Xml Property Option Param</em>'.
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getXmlPropertyOptionParam()
	 * @see #getTextLiteralParam()
	 * @generated
	 */
	EReference getTextLiteralParam_XmlPropertyOptionParam();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.parameters.TextLiteralParam#getXmlAxisPart <em>Xml Axis Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Xml Axis Part</em>'.
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getXmlAxisPart()
	 * @see #getTextLiteralParam()
	 * @generated
	 */
	EReference getTextLiteralParam_XmlAxisPart();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.TextLiteralParam#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getContains()
	 * @see #getTextLiteralParam()
	 * @generated
	 */
	EReference getTextLiteralParam_Contains();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.TextLiteralParam#setValueIfValid(java.lang.String) <em>Set Value If Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value If Valid</em>' operation.
	 * @see qualitypatternmodel.parameters.TextLiteralParam#setValueIfValid(java.lang.String)
	 * @generated
	 */
	EOperation getTextLiteralParam__SetValueIfValid__String();

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
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.NumberParam#getStringLength <em>String Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>String Length</em>'.
	 * @see qualitypatternmodel.parameters.NumberParam#getStringLength()
	 * @see #getNumberParam()
	 * @generated
	 */
	EReference getNumberParam_StringLength();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.NumberParam#setValueIfValid(java.lang.Double) <em>Set Value If Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value If Valid</em>' operation.
	 * @see qualitypatternmodel.parameters.NumberParam#setValueIfValid(java.lang.Double)
	 * @generated
	 */
	EOperation getNumberParam__SetValueIfValid__Double();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.ParameterValue#isTypeModifiable <em>Type Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Modifiable</em>'.
	 * @see qualitypatternmodel.parameters.ParameterValue#isTypeModifiable()
	 * @see #getParameterValue()
	 * @generated
	 */
	EAttribute getParameterValue_TypeModifiable();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ParameterValue#isInTagComparison() <em>Is In Tag Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is In Tag Comparison</em>' operation.
	 * @see qualitypatternmodel.parameters.ParameterValue#isInTagComparison()
	 * @generated
	 */
	EOperation getParameterValue__IsInTagComparison();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ParameterValue#isInAttributeComparison() <em>Is In Attribute Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is In Attribute Comparison</em>' operation.
	 * @see qualitypatternmodel.parameters.ParameterValue#isInAttributeComparison()
	 * @generated
	 */
	EOperation getParameterValue__IsInAttributeComparison();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ParameterValue#isInDataComparison() <em>Is In Data Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is In Data Comparison</em>' operation.
	 * @see qualitypatternmodel.parameters.ParameterValue#isInDataComparison()
	 * @generated
	 */
	EOperation getParameterValue__IsInDataComparison();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ParameterValue#getElementTags() <em>Get Element Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Element Tags</em>' operation.
	 * @see qualitypatternmodel.parameters.ParameterValue#getElementTags()
	 * @generated
	 */
	EOperation getParameterValue__GetElementTags();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ParameterValue#getAttributeNames() <em>Get Attribute Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute Names</em>' operation.
	 * @see qualitypatternmodel.parameters.ParameterValue#getAttributeNames()
	 * @generated
	 */
	EOperation getParameterValue__GetAttributeNames();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ParameterValue#getDataValues() <em>Get Data Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Values</em>' operation.
	 * @see qualitypatternmodel.parameters.ParameterValue#getDataValues()
	 * @generated
	 */
	EOperation getParameterValue__GetDataValues();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ParameterValue#getAttributeValues() <em>Get Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute Values</em>' operation.
	 * @see qualitypatternmodel.parameters.ParameterValue#getAttributeValues()
	 * @generated
	 */
	EOperation getParameterValue__GetAttributeValues();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ParameterValue#getSuggestions() <em>Get Suggestions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Suggestions</em>' operation.
	 * @see qualitypatternmodel.parameters.ParameterValue#getSuggestions()
	 * @generated
	 */
	EOperation getParameterValue__GetSuggestions();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ParameterValue#inferSuggestions() <em>Infer Suggestions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Infer Suggestions</em>' operation.
	 * @see qualitypatternmodel.parameters.ParameterValue#inferSuggestions()
	 * @generated
	 */
	EOperation getParameterValue__InferSuggestions();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ParameterValue#replace(qualitypatternmodel.parameters.ParameterValue) <em>Replace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Replace</em>' operation.
	 * @see qualitypatternmodel.parameters.ParameterValue#replace(qualitypatternmodel.parameters.ParameterValue)
	 * @generated
	 */
	EOperation getParameterValue__Replace__ParameterValue();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ParameterValue#replaceViaValue(java.lang.String[], java.lang.String) <em>Replace Via Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Replace Via Value</em>' operation.
	 * @see qualitypatternmodel.parameters.ParameterValue#replaceViaValue(java.lang.String[], java.lang.String)
	 * @generated
	 */
	EOperation getParameterValue__ReplaceViaValue__String_String();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.DateParam#setValueIfValid(java.lang.String) <em>Set Value If Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value If Valid</em>' operation.
	 * @see qualitypatternmodel.parameters.DateParam#setValueIfValid(java.lang.String)
	 * @generated
	 */
	EOperation getDateParam__SetValueIfValid__String();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.TimeParam#setValueIfValid(java.lang.String) <em>Set Value If Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value If Valid</em>' operation.
	 * @see qualitypatternmodel.parameters.TimeParam#setValueIfValid(java.lang.String)
	 * @generated
	 */
	EOperation getTimeParam__SetValueIfValid__String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.UntypedParameterValue <em>Untyped Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Untyped Parameter Value</em>'.
	 * @see qualitypatternmodel.parameters.UntypedParameterValue
	 * @generated
	 */
	EClass getUntypedParameterValue();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.UntypedParameterValue#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see qualitypatternmodel.parameters.UntypedParameterValue#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getUntypedParameterValue__SetValue__String();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.DateTimeParam#setValueIfValid(java.lang.String) <em>Set Value If Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value If Valid</em>' operation.
	 * @see qualitypatternmodel.parameters.DateTimeParam#setValueIfValid(java.lang.String)
	 * @generated
	 */
	EOperation getDateTimeParam__SetValueIfValid__String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.TypeOptionParam <em>Type Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Option Param</em>'.
	 * @see qualitypatternmodel.parameters.TypeOptionParam
	 * @generated
	 */
	EClass getTypeOptionParam();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.parameters.TypeOptionParam#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Options</em>'.
	 * @see qualitypatternmodel.parameters.TypeOptionParam#getOptions()
	 * @see #getTypeOptionParam()
	 * @generated
	 */
	EAttribute getTypeOptionParam_Options();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.TypeOptionParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.parameters.TypeOptionParam#getValue()
	 * @see #getTypeOptionParam()
	 * @generated
	 */
	EAttribute getTypeOptionParam_Value();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.parameters.TypeOptionParam#getTypeComparisons <em>Type Comparisons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Comparisons</em>'.
	 * @see qualitypatternmodel.parameters.TypeOptionParam#getTypeComparisons()
	 * @see #getTypeOptionParam()
	 * @generated
	 */
	EReference getTypeOptionParam_TypeComparisons();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.KeyValueParam <em>Key Value Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Param</em>'.
	 * @see qualitypatternmodel.parameters.KeyValueParam
	 * @generated
	 */
	EClass getKeyValueParam();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.parameters.KeyValueParam#getKeyValuePair <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Value Pair</em>'.
	 * @see qualitypatternmodel.parameters.KeyValueParam#getKeyValuePair()
	 * @see #getKeyValueParam()
	 * @generated
	 */
	EAttribute getKeyValueParam_KeyValuePair();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.KeyValueParam#addValue(java.lang.String, java.lang.String) <em>Add Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Value</em>' operation.
	 * @see qualitypatternmodel.parameters.KeyValueParam#addValue(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getKeyValueParam__AddValue__String_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.KeyValueParam#setNewMap(java.util.Map) <em>Set New Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set New Map</em>' operation.
	 * @see qualitypatternmodel.parameters.KeyValueParam#setNewMap(java.util.Map)
	 * @generated
	 */
	EOperation getKeyValueParam__SetNewMap__Map();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.ListParam <em>List Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Param</em>'.
	 * @see qualitypatternmodel.parameters.ListParam
	 * @generated
	 */
	EClass getListParam();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.parameters.ListParam#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see qualitypatternmodel.parameters.ListParam#getValues()
	 * @see #getListParam()
	 * @generated
	 */
	EAttribute getListParam_Values();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ListParam#setValueIfValid(org.eclipse.emf.common.util.EList) <em>Set Value If Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value If Valid</em>' operation.
	 * @see qualitypatternmodel.parameters.ListParam#setValueIfValid(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getListParam__SetValueIfValid__EList();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ListParam#getListVar() <em>Get List Var</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get List Var</em>' operation.
	 * @see qualitypatternmodel.parameters.ListParam#getListVar()
	 * @generated
	 */
	EOperation getListParam__GetListVar();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ListParam#getListDeclaration() <em>Get List Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get List Declaration</em>' operation.
	 * @see qualitypatternmodel.parameters.ListParam#getListDeclaration()
	 * @generated
	 */
	EOperation getListParam__GetListDeclaration();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.parameters.ListParam#addStringValue(java.lang.String) <em>Add String Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add String Value</em>' operation.
	 * @see qualitypatternmodel.parameters.ListParam#addStringValue(java.lang.String)
	 * @generated
	 */
	EOperation getListParam__AddStringValue__String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.parameters.MultiListParam <em>Multi List Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi List Param</em>'.
	 * @see qualitypatternmodel.parameters.MultiListParam
	 * @generated
	 */
	EClass getMultiListParam();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.EMap <em>String To Int EMap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String To Int EMap</em>'.
	 * @see org.eclipse.emf.common.util.EMap
	 * @model instanceClass="org.eclipse.emf.common.util.EMap" typeParameters="K V"
	 * @generated
	 */
	EDataType getStringToIntEMap();

	/**
	 * Returns the meta object for data type '<em>String Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Array</em>'.
	 * @model instanceClass="java.lang.String[]"
	 * @generated
	 */
	EDataType getStringArray();

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
		 * The meta object literal for the '<em><b>Predefined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PREDEFINED = eINSTANCE.getParameter_Predefined();

		/**
		 * The meta object literal for the '<em><b>Parameter References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAMETER_REFERENCES = eINSTANCE.getParameter_ParameterReferences();

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
		 * The meta object literal for the '<em><b>Is Used</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___IS_USED = eINSTANCE.getParameter__IsUsed();

		/**
		 * The meta object literal for the '<em><b>Get Value As String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GET_VALUE_AS_STRING = eINSTANCE.getParameter__GetValueAsString();

		/**
		 * The meta object literal for the '<em><b>Set Value From String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___SET_VALUE_FROM_STRING__STRING = eINSTANCE.getParameter__SetValueFromString__String();

		/**
		 * The meta object literal for the '<em><b>Get Options As String List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GET_OPTIONS_AS_STRING_LIST = eINSTANCE.getParameter__GetOptionsAsStringList();

		/**
		 * The meta object literal for the '<em><b>Validate Against Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___VALIDATE_AGAINST_SCHEMA = eINSTANCE.getParameter__ValidateAgainstSchema();

		/**
		 * The meta object literal for the '<em><b>Check Comparison Consistency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___CHECK_COMPARISON_CONSISTENCY = eINSTANCE.getParameter__CheckComparisonConsistency();

		/**
		 * The meta object literal for the '<em><b>Validate Example Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING = eINSTANCE.getParameter__ValidateExampleValue__String();

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
		 * The meta object literal for the '<em><b>Count Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_OPTION_PARAM__COUNT_CONDITIONS = eINSTANCE.getComparisonOptionParam_CountConditions();

		/**
		 * The meta object literal for the '<em><b>String Length</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_OPTION_PARAM__STRING_LENGTH = eINSTANCE.getComparisonOptionParam_StringLength();

		/**
		 * The meta object literal for the '<em><b>Set Value If Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARISON_OPTION_PARAM___SET_VALUE_IF_VALID__COMPARISONOPERATOR = eINSTANCE.getComparisonOptionParam__SetValueIfValid__ComparisonOperator();

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
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_LIST___REMOVE__PARAMETER = eINSTANCE.getParameterList__Remove__Parameter();

		/**
		 * The meta object literal for the '<em><b>Validate Against Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_LIST___VALIDATE_AGAINST_SCHEMA = eINSTANCE.getParameterList__ValidateAgainstSchema();

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
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_PARAM__CONTAINS = eINSTANCE.getBooleanParam_Contains();

		/**
		 * The meta object literal for the '<em><b>Null Check</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_PARAM__NULL_CHECK = eINSTANCE.getBooleanParam_NullCheck();

		/**
		 * The meta object literal for the '<em><b>One Arg Java Operator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_PARAM__ONE_ARG_JAVA_OPERATOR = eINSTANCE.getBooleanParam_OneArgJavaOperator();

		/**
		 * The meta object literal for the '<em><b>Set Value If Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_PARAM___SET_VALUE_IF_VALID__BOOLEAN = eINSTANCE.getBooleanParam__SetValueIfValid__Boolean();

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
		 * The meta object literal for the '<em><b>Xml Property Option Param</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM = eINSTANCE.getTextLiteralParam_XmlPropertyOptionParam();

		/**
		 * The meta object literal for the '<em><b>Xml Axis Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_LITERAL_PARAM__XML_AXIS_PART = eINSTANCE.getTextLiteralParam_XmlAxisPart();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_LITERAL_PARAM__CONTAINS = eINSTANCE.getTextLiteralParam_Contains();

		/**
		 * The meta object literal for the '<em><b>Set Value If Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_LITERAL_PARAM___SET_VALUE_IF_VALID__STRING = eINSTANCE.getTextLiteralParam__SetValueIfValid__String();

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
		 * The meta object literal for the '<em><b>String Length</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_PARAM__STRING_LENGTH = eINSTANCE.getNumberParam_StringLength();

		/**
		 * The meta object literal for the '<em><b>Set Value If Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NUMBER_PARAM___SET_VALUE_IF_VALID__DOUBLE = eINSTANCE.getNumberParam__SetValueIfValid__Double();

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
		 * The meta object literal for the '<em><b>Type Modifiable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE__TYPE_MODIFIABLE = eINSTANCE.getParameterValue_TypeModifiable();

		/**
		 * The meta object literal for the '<em><b>Is In Tag Comparison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VALUE___IS_IN_TAG_COMPARISON = eINSTANCE.getParameterValue__IsInTagComparison();

		/**
		 * The meta object literal for the '<em><b>Is In Attribute Comparison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON = eINSTANCE.getParameterValue__IsInAttributeComparison();

		/**
		 * The meta object literal for the '<em><b>Is In Data Comparison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VALUE___IS_IN_DATA_COMPARISON = eINSTANCE.getParameterValue__IsInDataComparison();

		/**
		 * The meta object literal for the '<em><b>Get Element Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VALUE___GET_ELEMENT_TAGS = eINSTANCE.getParameterValue__GetElementTags();

		/**
		 * The meta object literal for the '<em><b>Get Attribute Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VALUE___GET_ATTRIBUTE_NAMES = eINSTANCE.getParameterValue__GetAttributeNames();

		/**
		 * The meta object literal for the '<em><b>Get Data Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VALUE___GET_DATA_VALUES = eINSTANCE.getParameterValue__GetDataValues();

		/**
		 * The meta object literal for the '<em><b>Get Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VALUE___GET_ATTRIBUTE_VALUES = eINSTANCE.getParameterValue__GetAttributeValues();

		/**
		 * The meta object literal for the '<em><b>Get Suggestions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VALUE___GET_SUGGESTIONS = eINSTANCE.getParameterValue__GetSuggestions();

		/**
		 * The meta object literal for the '<em><b>Infer Suggestions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VALUE___INFER_SUGGESTIONS = eINSTANCE.getParameterValue__InferSuggestions();

		/**
		 * The meta object literal for the '<em><b>Replace</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VALUE___REPLACE__PARAMETERVALUE = eINSTANCE.getParameterValue__Replace__ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Replace Via Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING = eINSTANCE.getParameterValue__ReplaceViaValue__String_String();

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
		 * The meta object literal for the '<em><b>Set Value If Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATE_PARAM___SET_VALUE_IF_VALID__STRING = eINSTANCE.getDateParam__SetValueIfValid__String();

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
		 * The meta object literal for the '<em><b>Set Value If Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_PARAM___SET_VALUE_IF_VALID__STRING = eINSTANCE.getTimeParam__SetValueIfValid__String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.UntypedParameterValueImpl <em>Untyped Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.UntypedParameterValueImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getUntypedParameterValue()
		 * @generated
		 */
		EClass UNTYPED_PARAMETER_VALUE = eINSTANCE.getUntypedParameterValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNTYPED_PARAMETER_VALUE___SET_VALUE__STRING = eINSTANCE.getUntypedParameterValue__SetValue__String();

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
		 * The meta object literal for the '<em><b>Set Value If Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATE_TIME_PARAM___SET_VALUE_IF_VALID__STRING = eINSTANCE.getDateTimeParam__SetValueIfValid__String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.TypeOptionParamImpl <em>Type Option Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.TypeOptionParamImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getTypeOptionParam()
		 * @generated
		 */
		EClass TYPE_OPTION_PARAM = eINSTANCE.getTypeOptionParam();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_OPTION_PARAM__OPTIONS = eINSTANCE.getTypeOptionParam_Options();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_OPTION_PARAM__VALUE = eINSTANCE.getTypeOptionParam_Value();

		/**
		 * The meta object literal for the '<em><b>Type Comparisons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_OPTION_PARAM__TYPE_COMPARISONS = eINSTANCE.getTypeOptionParam_TypeComparisons();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.KeyValueParamImpl <em>Key Value Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.KeyValueParamImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getKeyValueParam()
		 * @generated
		 */
		EClass KEY_VALUE_PARAM = eINSTANCE.getKeyValueParam();

		/**
		 * The meta object literal for the '<em><b>Key Value Pair</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PARAM__KEY_VALUE_PAIR = eINSTANCE.getKeyValueParam_KeyValuePair();

		/**
		 * The meta object literal for the '<em><b>Add Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEY_VALUE_PARAM___ADD_VALUE__STRING_STRING = eINSTANCE.getKeyValueParam__AddValue__String_String();

		/**
		 * The meta object literal for the '<em><b>Set New Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEY_VALUE_PARAM___SET_NEW_MAP__MAP = eINSTANCE.getKeyValueParam__SetNewMap__Map();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.ListParamImpl <em>List Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.ListParamImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getListParam()
		 * @generated
		 */
		EClass LIST_PARAM = eINSTANCE.getListParam();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_PARAM__VALUES = eINSTANCE.getListParam_Values();

		/**
		 * The meta object literal for the '<em><b>Set Value If Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST_PARAM___SET_VALUE_IF_VALID__ELIST = eINSTANCE.getListParam__SetValueIfValid__EList();

		/**
		 * The meta object literal for the '<em><b>Get List Var</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST_PARAM___GET_LIST_VAR = eINSTANCE.getListParam__GetListVar();

		/**
		 * The meta object literal for the '<em><b>Get List Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST_PARAM___GET_LIST_DECLARATION = eINSTANCE.getListParam__GetListDeclaration();

		/**
		 * The meta object literal for the '<em><b>Add String Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST_PARAM___ADD_STRING_VALUE__STRING = eINSTANCE.getListParam__AddStringValue__String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.parameters.impl.MultiListParamImpl <em>Multi List Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.MultiListParamImpl
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getMultiListParam()
		 * @generated
		 */
		EClass MULTI_LIST_PARAM = eINSTANCE.getMultiListParam();

		/**
		 * The meta object literal for the '<em>String To Int EMap</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.EMap
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getStringToIntEMap()
		 * @generated
		 */
		EDataType STRING_TO_INT_EMAP = eINSTANCE.getStringToIntEMap();

		/**
		 * The meta object literal for the '<em>String Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.parameters.impl.ParametersPackageImpl#getStringArray()
		 * @generated
		 */
		EDataType STRING_ARRAY = eINSTANCE.getStringArray();

	}

} //InputfieldsPackage

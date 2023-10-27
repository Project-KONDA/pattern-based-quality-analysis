/**
 */
package qualitypatternmodel.javaoperators;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import qualitypatternmodel.operators.OperatorsPackage;

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
 * @see qualitypatternmodel.javaoperators.JavaoperatorsFactory
 * @model kind="package"
 * @generated
 */
public interface JavaoperatorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "javaoperators";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "javaoperators";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "javaoperators";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaoperatorsPackage eINSTANCE = qualitypatternmodel.javaoperators.impl.JavaoperatorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaoperators.impl.JavaOperatorImpl <em>Java Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaoperators.impl.JavaOperatorImpl
	 * @see qualitypatternmodel.javaoperators.impl.JavaoperatorsPackageImpl#getJavaOperator()
	 * @generated
	 */
	int JAVA_OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR__ID = OperatorsPackage.BOOLEAN_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR__INTERNAL_ID = OperatorsPackage.BOOLEAN_OPERATOR__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR__COMPARISON1 = OperatorsPackage.BOOLEAN_OPERATOR__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR__COMPARISON2 = OperatorsPackage.BOOLEAN_OPERATOR__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Operator List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR__OPERATOR_LIST = OperatorsPackage.BOOLEAN_OPERATOR__OPERATOR_LIST;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR__NODES = OperatorsPackage.BOOLEAN_OPERATOR__NODES;

	/**
	 * The number of structural features of the '<em>Java Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR_FEATURE_COUNT = OperatorsPackage.BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___IS_VALID__ABSTRACTIONLEVEL = OperatorsPackage.BOOLEAN_OPERATOR___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___IS_VALID_LOCAL__ABSTRACTIONLEVEL = OperatorsPackage.BOOLEAN_OPERATOR___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___MY_TO_STRING = OperatorsPackage.BOOLEAN_OPERATOR___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___GENERATE_CYPHER = OperatorsPackage.BOOLEAN_OPERATOR___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___GENERATE_XQUERY = OperatorsPackage.BOOLEAN_OPERATOR___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___GENERATE_SPARQL = OperatorsPackage.BOOLEAN_OPERATOR___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___GET_CONTAINER = OperatorsPackage.BOOLEAN_OPERATOR___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___GET_ANCESTOR__CLASS = OperatorsPackage.BOOLEAN_OPERATOR___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___INITIALIZE_TRANSLATION = OperatorsPackage.BOOLEAN_OPERATOR___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___PREPARE_TRANSLATION = OperatorsPackage.BOOLEAN_OPERATOR___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___GET_OPERATOR_LIST = OperatorsPackage.BOOLEAN_OPERATOR___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___GET_ALL_OPERATORS = OperatorsPackage.BOOLEAN_OPERATOR___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___GET_PARAMETER_LIST = OperatorsPackage.BOOLEAN_OPERATOR___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___GET_ALL_PARAMETERS = OperatorsPackage.BOOLEAN_OPERATOR___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___PREPARE_PARAMETER_UPDATES = OperatorsPackage.BOOLEAN_OPERATOR___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = OperatorsPackage.BOOLEAN_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___UPDATE_PARAMETERS__PARAMETERLIST = OperatorsPackage.BOOLEAN_OPERATOR___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = OperatorsPackage.BOOLEAN_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___RECORD_VALUES__XMLDATADATABASE = OperatorsPackage.BOOLEAN_OPERATOR___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___RELATIONS_XML_ADAPTED = OperatorsPackage.BOOLEAN_OPERATOR___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___CREATE_XML_ADAPTION = OperatorsPackage.BOOLEAN_OPERATOR___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___CREATE_RDF_ADAPTION = OperatorsPackage.BOOLEAN_OPERATOR___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___CREATE_NEO4J_ADAPTION = OperatorsPackage.BOOLEAN_OPERATOR___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___GET_RETURN_TYPE = OperatorsPackage.BOOLEAN_OPERATOR___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___IS_TRANSLATABLE = OperatorsPackage.BOOLEAN_OPERATOR___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___GET_ALL_ARGUMENT_ELEMENTS = OperatorsPackage.BOOLEAN_OPERATOR___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___IS_OPERATOR_ARGUMENT = OperatorsPackage.BOOLEAN_OPERATOR___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = OperatorsPackage.BOOLEAN_OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___GET_ARGUMENTS = OperatorsPackage.BOOLEAN_OPERATOR___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Get Root Boolean Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___GET_ROOT_BOOLEAN_OPERATORS = OperatorsPackage.BOOLEAN_OPERATOR___GET_ROOT_BOOLEAN_OPERATORS;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___IS_CYCLE_FREE = OperatorsPackage.BOOLEAN_OPERATOR___IS_CYCLE_FREE;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___IS_CYCLE_FREE__ELIST = OperatorsPackage.BOOLEAN_OPERATOR___IS_CYCLE_FREE__ELIST;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___CREATE_PARAMETERS = OperatorsPackage.BOOLEAN_OPERATOR___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___ADD_ELEMENT__NODE = OperatorsPackage.BOOLEAN_OPERATOR___ADD_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Remove Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___REMOVE_ELEMENT__NODE = OperatorsPackage.BOOLEAN_OPERATOR___REMOVE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR___GET_ELEMENT = OperatorsPackage.BOOLEAN_OPERATOR___GET_ELEMENT;

	/**
	 * The number of operations of the '<em>Java Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATOR_OPERATION_COUNT = OperatorsPackage.BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaoperators.impl.OneArgJavaOperatorImpl <em>One Arg Java Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaoperators.impl.OneArgJavaOperatorImpl
	 * @see qualitypatternmodel.javaoperators.impl.JavaoperatorsPackageImpl#getOneArgJavaOperator()
	 * @generated
	 */
	int ONE_ARG_JAVA_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR__ID = JAVA_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR__INTERNAL_ID = JAVA_OPERATOR__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR__COMPARISON1 = JAVA_OPERATOR__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR__COMPARISON2 = JAVA_OPERATOR__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Operator List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR__OPERATOR_LIST = JAVA_OPERATOR__OPERATOR_LIST;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR__NODES = JAVA_OPERATOR__NODES;

	/**
	 * The feature id for the '<em><b>Primitive Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR__PRIMITIVE_NODE = JAVA_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR__OPTION = JAVA_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>One Arg Java Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR_FEATURE_COUNT = JAVA_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___IS_VALID__ABSTRACTIONLEVEL = JAVA_OPERATOR___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___IS_VALID_LOCAL__ABSTRACTIONLEVEL = JAVA_OPERATOR___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___MY_TO_STRING = JAVA_OPERATOR___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___GENERATE_CYPHER = JAVA_OPERATOR___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___GENERATE_XQUERY = JAVA_OPERATOR___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___GENERATE_SPARQL = JAVA_OPERATOR___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___GET_CONTAINER = JAVA_OPERATOR___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___GET_ANCESTOR__CLASS = JAVA_OPERATOR___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___INITIALIZE_TRANSLATION = JAVA_OPERATOR___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___PREPARE_TRANSLATION = JAVA_OPERATOR___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___GET_OPERATOR_LIST = JAVA_OPERATOR___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___GET_ALL_OPERATORS = JAVA_OPERATOR___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___GET_PARAMETER_LIST = JAVA_OPERATOR___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___GET_ALL_PARAMETERS = JAVA_OPERATOR___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___PREPARE_PARAMETER_UPDATES = JAVA_OPERATOR___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = JAVA_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___UPDATE_PARAMETERS__PARAMETERLIST = JAVA_OPERATOR___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = JAVA_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___RECORD_VALUES__XMLDATADATABASE = JAVA_OPERATOR___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___RELATIONS_XML_ADAPTED = JAVA_OPERATOR___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___CREATE_XML_ADAPTION = JAVA_OPERATOR___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___CREATE_RDF_ADAPTION = JAVA_OPERATOR___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___CREATE_NEO4J_ADAPTION = JAVA_OPERATOR___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___GET_RETURN_TYPE = JAVA_OPERATOR___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___IS_TRANSLATABLE = JAVA_OPERATOR___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___GET_ALL_ARGUMENT_ELEMENTS = JAVA_OPERATOR___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___IS_OPERATOR_ARGUMENT = JAVA_OPERATOR___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = JAVA_OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___GET_ARGUMENTS = JAVA_OPERATOR___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Get Root Boolean Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___GET_ROOT_BOOLEAN_OPERATORS = JAVA_OPERATOR___GET_ROOT_BOOLEAN_OPERATORS;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___IS_CYCLE_FREE = JAVA_OPERATOR___IS_CYCLE_FREE;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___IS_CYCLE_FREE__ELIST = JAVA_OPERATOR___IS_CYCLE_FREE__ELIST;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___CREATE_PARAMETERS = JAVA_OPERATOR___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___ADD_ELEMENT__NODE = JAVA_OPERATOR___ADD_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Remove Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___REMOVE_ELEMENT__NODE = JAVA_OPERATOR___REMOVE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___GET_ELEMENT = JAVA_OPERATOR___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR___APPLY__STRING = JAVA_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>One Arg Java Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_JAVA_OPERATOR_OPERATION_COUNT = JAVA_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaoperators.impl.TwoArgJavaOperatorImpl <em>Two Arg Java Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaoperators.impl.TwoArgJavaOperatorImpl
	 * @see qualitypatternmodel.javaoperators.impl.JavaoperatorsPackageImpl#getTwoArgJavaOperator()
	 * @generated
	 */
	int TWO_ARG_JAVA_OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR__ID = JAVA_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR__INTERNAL_ID = JAVA_OPERATOR__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR__COMPARISON1 = JAVA_OPERATOR__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR__COMPARISON2 = JAVA_OPERATOR__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Operator List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR__OPERATOR_LIST = JAVA_OPERATOR__OPERATOR_LIST;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR__NODES = JAVA_OPERATOR__NODES;

	/**
	 * The feature id for the '<em><b>Argument1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR__ARGUMENT1 = JAVA_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR__ARGUMENT2 = JAVA_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Two Arg Java Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR_FEATURE_COUNT = JAVA_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___IS_VALID__ABSTRACTIONLEVEL = JAVA_OPERATOR___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___IS_VALID_LOCAL__ABSTRACTIONLEVEL = JAVA_OPERATOR___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___MY_TO_STRING = JAVA_OPERATOR___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___GENERATE_CYPHER = JAVA_OPERATOR___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___GENERATE_XQUERY = JAVA_OPERATOR___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___GENERATE_SPARQL = JAVA_OPERATOR___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___GET_CONTAINER = JAVA_OPERATOR___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___GET_ANCESTOR__CLASS = JAVA_OPERATOR___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___INITIALIZE_TRANSLATION = JAVA_OPERATOR___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___PREPARE_TRANSLATION = JAVA_OPERATOR___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___GET_OPERATOR_LIST = JAVA_OPERATOR___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___GET_ALL_OPERATORS = JAVA_OPERATOR___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___GET_PARAMETER_LIST = JAVA_OPERATOR___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___GET_ALL_PARAMETERS = JAVA_OPERATOR___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___PREPARE_PARAMETER_UPDATES = JAVA_OPERATOR___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = JAVA_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___UPDATE_PARAMETERS__PARAMETERLIST = JAVA_OPERATOR___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = JAVA_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___RECORD_VALUES__XMLDATADATABASE = JAVA_OPERATOR___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___RELATIONS_XML_ADAPTED = JAVA_OPERATOR___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___CREATE_XML_ADAPTION = JAVA_OPERATOR___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___CREATE_RDF_ADAPTION = JAVA_OPERATOR___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___CREATE_NEO4J_ADAPTION = JAVA_OPERATOR___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___GET_RETURN_TYPE = JAVA_OPERATOR___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___IS_TRANSLATABLE = JAVA_OPERATOR___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___GET_ALL_ARGUMENT_ELEMENTS = JAVA_OPERATOR___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___IS_OPERATOR_ARGUMENT = JAVA_OPERATOR___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = JAVA_OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___GET_ARGUMENTS = JAVA_OPERATOR___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Get Root Boolean Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___GET_ROOT_BOOLEAN_OPERATORS = JAVA_OPERATOR___GET_ROOT_BOOLEAN_OPERATORS;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___IS_CYCLE_FREE = JAVA_OPERATOR___IS_CYCLE_FREE;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___IS_CYCLE_FREE__ELIST = JAVA_OPERATOR___IS_CYCLE_FREE__ELIST;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___CREATE_PARAMETERS = JAVA_OPERATOR___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___ADD_ELEMENT__NODE = JAVA_OPERATOR___ADD_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Remove Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___REMOVE_ELEMENT__NODE = JAVA_OPERATOR___REMOVE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___GET_ELEMENT = JAVA_OPERATOR___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR___APPLY__STRING_STRING = JAVA_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Two Arg Java Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_JAVA_OPERATOR_OPERATION_COUNT = JAVA_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaoperators.impl.ValidateLinkOperatorImpl <em>Validate Link Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaoperators.impl.ValidateLinkOperatorImpl
	 * @see qualitypatternmodel.javaoperators.impl.JavaoperatorsPackageImpl#getValidateLinkOperator()
	 * @generated
	 */
	int VALIDATE_LINK_OPERATOR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR__ID = ONE_ARG_JAVA_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR__INTERNAL_ID = ONE_ARG_JAVA_OPERATOR__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR__COMPARISON1 = ONE_ARG_JAVA_OPERATOR__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR__COMPARISON2 = ONE_ARG_JAVA_OPERATOR__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Operator List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR__OPERATOR_LIST = ONE_ARG_JAVA_OPERATOR__OPERATOR_LIST;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR__NODES = ONE_ARG_JAVA_OPERATOR__NODES;

	/**
	 * The feature id for the '<em><b>Primitive Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR__PRIMITIVE_NODE = ONE_ARG_JAVA_OPERATOR__PRIMITIVE_NODE;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR__OPTION = ONE_ARG_JAVA_OPERATOR__OPTION;

	/**
	 * The number of structural features of the '<em>Validate Link Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR_FEATURE_COUNT = ONE_ARG_JAVA_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___IS_VALID__ABSTRACTIONLEVEL = ONE_ARG_JAVA_OPERATOR___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___IS_VALID_LOCAL__ABSTRACTIONLEVEL = ONE_ARG_JAVA_OPERATOR___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___MY_TO_STRING = ONE_ARG_JAVA_OPERATOR___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___GENERATE_CYPHER = ONE_ARG_JAVA_OPERATOR___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___GENERATE_XQUERY = ONE_ARG_JAVA_OPERATOR___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___GENERATE_SPARQL = ONE_ARG_JAVA_OPERATOR___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___GET_CONTAINER = ONE_ARG_JAVA_OPERATOR___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___GET_ANCESTOR__CLASS = ONE_ARG_JAVA_OPERATOR___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___INITIALIZE_TRANSLATION = ONE_ARG_JAVA_OPERATOR___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___PREPARE_TRANSLATION = ONE_ARG_JAVA_OPERATOR___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___GET_OPERATOR_LIST = ONE_ARG_JAVA_OPERATOR___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___GET_ALL_OPERATORS = ONE_ARG_JAVA_OPERATOR___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___GET_PARAMETER_LIST = ONE_ARG_JAVA_OPERATOR___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___GET_ALL_PARAMETERS = ONE_ARG_JAVA_OPERATOR___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___PREPARE_PARAMETER_UPDATES = ONE_ARG_JAVA_OPERATOR___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = ONE_ARG_JAVA_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___UPDATE_PARAMETERS__PARAMETERLIST = ONE_ARG_JAVA_OPERATOR___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = ONE_ARG_JAVA_OPERATOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___RECORD_VALUES__XMLDATADATABASE = ONE_ARG_JAVA_OPERATOR___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___RELATIONS_XML_ADAPTED = ONE_ARG_JAVA_OPERATOR___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___CREATE_XML_ADAPTION = ONE_ARG_JAVA_OPERATOR___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___CREATE_RDF_ADAPTION = ONE_ARG_JAVA_OPERATOR___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___CREATE_NEO4J_ADAPTION = ONE_ARG_JAVA_OPERATOR___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___GET_RETURN_TYPE = ONE_ARG_JAVA_OPERATOR___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___IS_TRANSLATABLE = ONE_ARG_JAVA_OPERATOR___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___GET_ALL_ARGUMENT_ELEMENTS = ONE_ARG_JAVA_OPERATOR___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___IS_OPERATOR_ARGUMENT = ONE_ARG_JAVA_OPERATOR___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = ONE_ARG_JAVA_OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___GET_ARGUMENTS = ONE_ARG_JAVA_OPERATOR___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Get Root Boolean Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___GET_ROOT_BOOLEAN_OPERATORS = ONE_ARG_JAVA_OPERATOR___GET_ROOT_BOOLEAN_OPERATORS;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___IS_CYCLE_FREE = ONE_ARG_JAVA_OPERATOR___IS_CYCLE_FREE;

	/**
	 * The operation id for the '<em>Is Cycle Free</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___IS_CYCLE_FREE__ELIST = ONE_ARG_JAVA_OPERATOR___IS_CYCLE_FREE__ELIST;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___CREATE_PARAMETERS = ONE_ARG_JAVA_OPERATOR___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___ADD_ELEMENT__NODE = ONE_ARG_JAVA_OPERATOR___ADD_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Remove Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___REMOVE_ELEMENT__NODE = ONE_ARG_JAVA_OPERATOR___REMOVE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___GET_ELEMENT = ONE_ARG_JAVA_OPERATOR___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR___APPLY__STRING = ONE_ARG_JAVA_OPERATOR___APPLY__STRING;

	/**
	 * The number of operations of the '<em>Validate Link Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_LINK_OPERATOR_OPERATION_COUNT = ONE_ARG_JAVA_OPERATOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaoperators.JavaOperator <em>Java Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Operator</em>'.
	 * @see qualitypatternmodel.javaoperators.JavaOperator
	 * @generated
	 */
	EClass getJavaOperator();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaoperators.OneArgJavaOperator <em>One Arg Java Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Arg Java Operator</em>'.
	 * @see qualitypatternmodel.javaoperators.OneArgJavaOperator
	 * @generated
	 */
	EClass getOneArgJavaOperator();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaoperators.OneArgJavaOperator#getPrimitiveNode <em>Primitive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primitive Node</em>'.
	 * @see qualitypatternmodel.javaoperators.OneArgJavaOperator#getPrimitiveNode()
	 * @see #getOneArgJavaOperator()
	 * @generated
	 */
	EReference getOneArgJavaOperator_PrimitiveNode();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaoperators.OneArgJavaOperator#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see qualitypatternmodel.javaoperators.OneArgJavaOperator#getOption()
	 * @see #getOneArgJavaOperator()
	 * @generated
	 */
	EReference getOneArgJavaOperator_Option();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaoperators.OneArgJavaOperator#apply(java.lang.String) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see qualitypatternmodel.javaoperators.OneArgJavaOperator#apply(java.lang.String)
	 * @generated
	 */
	EOperation getOneArgJavaOperator__Apply__String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaoperators.TwoArgJavaOperator <em>Two Arg Java Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two Arg Java Operator</em>'.
	 * @see qualitypatternmodel.javaoperators.TwoArgJavaOperator
	 * @generated
	 */
	EClass getTwoArgJavaOperator();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaoperators.TwoArgJavaOperator#getArgument1 <em>Argument1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument1</em>'.
	 * @see qualitypatternmodel.javaoperators.TwoArgJavaOperator#getArgument1()
	 * @see #getTwoArgJavaOperator()
	 * @generated
	 */
	EReference getTwoArgJavaOperator_Argument1();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaoperators.TwoArgJavaOperator#getArgument2 <em>Argument2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument2</em>'.
	 * @see qualitypatternmodel.javaoperators.TwoArgJavaOperator#getArgument2()
	 * @see #getTwoArgJavaOperator()
	 * @generated
	 */
	EReference getTwoArgJavaOperator_Argument2();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaoperators.TwoArgJavaOperator#apply(java.lang.String, java.lang.String) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see qualitypatternmodel.javaoperators.TwoArgJavaOperator#apply(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getTwoArgJavaOperator__Apply__String_String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaoperators.ValidateLinkOperator <em>Validate Link Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate Link Operator</em>'.
	 * @see qualitypatternmodel.javaoperators.ValidateLinkOperator
	 * @generated
	 */
	EClass getValidateLinkOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaoperatorsFactory getJavaoperatorsFactory();

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
		 * The meta object literal for the '{@link qualitypatternmodel.javaoperators.impl.JavaOperatorImpl <em>Java Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaoperators.impl.JavaOperatorImpl
		 * @see qualitypatternmodel.javaoperators.impl.JavaoperatorsPackageImpl#getJavaOperator()
		 * @generated
		 */
		EClass JAVA_OPERATOR = eINSTANCE.getJavaOperator();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaoperators.impl.OneArgJavaOperatorImpl <em>One Arg Java Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaoperators.impl.OneArgJavaOperatorImpl
		 * @see qualitypatternmodel.javaoperators.impl.JavaoperatorsPackageImpl#getOneArgJavaOperator()
		 * @generated
		 */
		EClass ONE_ARG_JAVA_OPERATOR = eINSTANCE.getOneArgJavaOperator();

		/**
		 * The meta object literal for the '<em><b>Primitive Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_ARG_JAVA_OPERATOR__PRIMITIVE_NODE = eINSTANCE.getOneArgJavaOperator_PrimitiveNode();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_ARG_JAVA_OPERATOR__OPTION = eINSTANCE.getOneArgJavaOperator_Option();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONE_ARG_JAVA_OPERATOR___APPLY__STRING = eINSTANCE.getOneArgJavaOperator__Apply__String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaoperators.impl.TwoArgJavaOperatorImpl <em>Two Arg Java Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaoperators.impl.TwoArgJavaOperatorImpl
		 * @see qualitypatternmodel.javaoperators.impl.JavaoperatorsPackageImpl#getTwoArgJavaOperator()
		 * @generated
		 */
		EClass TWO_ARG_JAVA_OPERATOR = eINSTANCE.getTwoArgJavaOperator();

		/**
		 * The meta object literal for the '<em><b>Argument1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWO_ARG_JAVA_OPERATOR__ARGUMENT1 = eINSTANCE.getTwoArgJavaOperator_Argument1();

		/**
		 * The meta object literal for the '<em><b>Argument2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWO_ARG_JAVA_OPERATOR__ARGUMENT2 = eINSTANCE.getTwoArgJavaOperator_Argument2();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWO_ARG_JAVA_OPERATOR___APPLY__STRING_STRING = eINSTANCE.getTwoArgJavaOperator__Apply__String_String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaoperators.impl.ValidateLinkOperatorImpl <em>Validate Link Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaoperators.impl.ValidateLinkOperatorImpl
		 * @see qualitypatternmodel.javaoperators.impl.JavaoperatorsPackageImpl#getValidateLinkOperator()
		 * @generated
		 */
		EClass VALIDATE_LINK_OPERATOR = eINSTANCE.getValidateLinkOperator();

	}

} //JavaoperatorsPackage

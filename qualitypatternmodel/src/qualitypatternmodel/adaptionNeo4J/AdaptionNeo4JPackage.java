/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import qualitypatternmodel.graphstructure.GraphstructurePackage;

import qualitypatternmodel.parameters.ParametersPackage;

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
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory
 * @model kind="package"
 * @generated
 */
public interface AdaptionNeo4JPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adaptionNeo4J";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "adaptionNeo4J";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adaptionNeo4J";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptionNeo4JPackage eINSTANCE = qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractNode <em>Neo Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.NeoAbstractNode
	 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoAbstractNode()
	 * @generated
	 */
	int NEO_ABSTRACT_NODE = 0;

	/**
	 * The feature id for the '<em><b>Node Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_NODE__NODE_PLACE = 0;

	/**
	 * The feature id for the '<em><b>Is Variable Distinct In Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_NODE__IS_VARIABLE_DISTINCT_IN_USE = 1;

	/**
	 * The number of structural features of the '<em>Neo Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_NODE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Cypher Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_NODE___GET_CYPHER_VARIABLE = 0;

	/**
	 * The operation id for the '<em>Get Cypher Return Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_NODE___GET_CYPHER_RETURN_VARIABLE = 1;

	/**
	 * The number of operations of the '<em>Neo Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_NODE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl <em>Neo Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl
	 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoNode()
	 * @generated
	 */
	int NEO_NODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__ID = GraphstructurePackage.COMPLEX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__INTERNAL_ID = GraphstructurePackage.COMPLEX_NODE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__COMPARISON1 = GraphstructurePackage.COMPLEX_NODE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__COMPARISON2 = GraphstructurePackage.COMPLEX_NODE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Outgoing Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__OUTGOING_MAPPINGS = GraphstructurePackage.COMPLEX_NODE__OUTGOING_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Incoming Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__INCOMING_MAPPING = GraphstructurePackage.COMPLEX_NODE__INCOMING_MAPPING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__GRAPH = GraphstructurePackage.COMPLEX_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__NAME = GraphstructurePackage.COMPLEX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__PREDICATES = GraphstructurePackage.COMPLEX_NODE__PREDICATES;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__INCOMING = GraphstructurePackage.COMPLEX_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Return Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__RETURN_NODE = GraphstructurePackage.COMPLEX_NODE__RETURN_NODE;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__TYPE_MODIFIABLE = GraphstructurePackage.COMPLEX_NODE__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__TRANSLATED = GraphstructurePackage.COMPLEX_NODE__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__PREDICATES_ARE_BEING_TRANSLATED = GraphstructurePackage.COMPLEX_NODE__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__OUTGOING = GraphstructurePackage.COMPLEX_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Node Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__NODE_PLACE = GraphstructurePackage.COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Variable Distinct In Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__IS_VARIABLE_DISTINCT_IN_USE = GraphstructurePackage.COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Neo Node Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE__NEO_NODE_LABELS = GraphstructurePackage.COMPLEX_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Neo Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_FEATURE_COUNT = GraphstructurePackage.COMPLEX_NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.COMPLEX_NODE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.COMPLEX_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___MY_TO_STRING = GraphstructurePackage.COMPLEX_NODE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GENERATE_CYPHER = GraphstructurePackage.COMPLEX_NODE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GENERATE_XQUERY = GraphstructurePackage.COMPLEX_NODE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GENERATE_SPARQL = GraphstructurePackage.COMPLEX_NODE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_CONTAINER = GraphstructurePackage.COMPLEX_NODE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_ANCESTOR__CLASS = GraphstructurePackage.COMPLEX_NODE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___INITIALIZE_TRANSLATION = GraphstructurePackage.COMPLEX_NODE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___PREPARE_TRANSLATION = GraphstructurePackage.COMPLEX_NODE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_OPERATOR_LIST = GraphstructurePackage.COMPLEX_NODE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_PARAMETER_LIST = GraphstructurePackage.COMPLEX_NODE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_ALL_PARAMETERS = GraphstructurePackage.COMPLEX_NODE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.COMPLEX_NODE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.COMPLEX_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.COMPLEX_NODE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.COMPLEX_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___RECORD_VALUES__XMLDATADATABASE = GraphstructurePackage.COMPLEX_NODE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___RELATIONS_XML_ADAPTED = GraphstructurePackage.COMPLEX_NODE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___CREATE_XML_ADAPTION = GraphstructurePackage.COMPLEX_NODE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___CREATE_RDF_ADAPTION = GraphstructurePackage.COMPLEX_NODE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___CREATE_NEO4J_ADAPTION = GraphstructurePackage.COMPLEX_NODE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.COMPLEX_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_RETURN_TYPE = GraphstructurePackage.COMPLEX_NODE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___IS_TRANSLATABLE = GraphstructurePackage.COMPLEX_NODE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_ALL_ARGUMENT_ELEMENTS = GraphstructurePackage.COMPLEX_NODE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___IS_OPERATOR_ARGUMENT = GraphstructurePackage.COMPLEX_NODE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___CREATE_PARAMETERS = GraphstructurePackage.COMPLEX_NODE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.COMPLEX_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Original ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_ORIGINAL_ID = GraphstructurePackage.COMPLEX_NODE___GET_ORIGINAL_ID;

	/**
	 * The operation id for the '<em>Get Original Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_ORIGINAL_NODE = GraphstructurePackage.COMPLEX_NODE___GET_ORIGINAL_NODE;

	/**
	 * The operation id for the '<em>Get Equivalent Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_EQUIVALENT_NODES = GraphstructurePackage.COMPLEX_NODE___GET_EQUIVALENT_NODES;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.COMPLEX_NODE___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Get Relations To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_RELATIONS_TO__NODE = GraphstructurePackage.COMPLEX_NODE___GET_RELATIONS_TO__NODE;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_ALL_OPERATORS = GraphstructurePackage.COMPLEX_NODE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADD_OUTGOING = GraphstructurePackage.COMPLEX_NODE___ADD_OUTGOING;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADD_OUTGOING__NODE = GraphstructurePackage.COMPLEX_NODE___ADD_OUTGOING__NODE;

	/**
	 * The operation id for the '<em>Add Incomming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADD_INCOMMING__COMPLEXNODE = GraphstructurePackage.COMPLEX_NODE___ADD_INCOMMING__COMPLEXNODE;

	/**
	 * The operation id for the '<em>Add Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADD_COMPARISON__NODE = GraphstructurePackage.COMPLEX_NODE___ADD_COMPARISON__NODE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADD_PRIMITIVE_COMPARISON = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADD_PRIMITIVE_COMPARISON__STRING = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADD_PRIMITIVE_MATCH = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_MATCH;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADD_PRIMITIVE_MATCH__STRING = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_MATCH__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADD_PRIMITIVE_CONTAINS = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_CONTAINS;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADD_PRIMITIVE_CONTAINS__STRING = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_CONTAINS__STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___CHECK_COMPARISON_CONSISTENCY = GraphstructurePackage.COMPLEX_NODE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON = GraphstructurePackage.COMPLEX_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON;

	/**
	 * The operation id for the '<em>Check Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___CHECK_GENERIC = GraphstructurePackage.COMPLEX_NODE___CHECK_GENERIC;

	/**
	 * The operation id for the '<em>Make Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___MAKE_GENERIC = GraphstructurePackage.COMPLEX_NODE___MAKE_GENERIC;

	/**
	 * The operation id for the '<em>Make Generic Recursive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___MAKE_GENERIC_RECURSIVE = GraphstructurePackage.COMPLEX_NODE___MAKE_GENERIC_RECURSIVE;

	/**
	 * The operation id for the '<em>Check Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___CHECK_COMPLEX = GraphstructurePackage.COMPLEX_NODE___CHECK_COMPLEX;

	/**
	 * The operation id for the '<em>Make Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___MAKE_COMPLEX = GraphstructurePackage.COMPLEX_NODE___MAKE_COMPLEX;

	/**
	 * The operation id for the '<em>Make Complex Recursive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___MAKE_COMPLEX_RECURSIVE = GraphstructurePackage.COMPLEX_NODE___MAKE_COMPLEX_RECURSIVE;

	/**
	 * The operation id for the '<em>Check Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___CHECK_PRIMITIVE = GraphstructurePackage.COMPLEX_NODE___CHECK_PRIMITIVE;

	/**
	 * The operation id for the '<em>Make Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___MAKE_PRIMITIVE = GraphstructurePackage.COMPLEX_NODE___MAKE_PRIMITIVE;

	/**
	 * The operation id for the '<em>Make Primitive Recursive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___MAKE_PRIMITIVE_RECURSIVE = GraphstructurePackage.COMPLEX_NODE___MAKE_PRIMITIVE_RECURSIVE;

	/**
	 * The operation id for the '<em>Adapt As Xml Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADAPT_AS_XML_ELEMENT = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_XML_ELEMENT;

	/**
	 * The operation id for the '<em>Adapt As Xml Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADAPT_AS_XML_PROPERTY = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_XML_PROPERTY;

	/**
	 * The operation id for the '<em>Adapt As Rdf Iri Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADAPT_AS_RDF_IRI_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_RDF_IRI_NODE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Literal Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADAPT_AS_RDF_LITERAL_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_RDF_LITERAL_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADAPT_AS_NEO_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_NEO_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Property Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADAPT_AS_NEO_PROPERTY_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_NEO_PROPERTY_NODE;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADD_PRIMITIVE_NULL_CHECK = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_NULL_CHECK;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Cypher Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_CYPHER_VARIABLE = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Cypher Return Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_CYPHER_RETURN_VARIABLE = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add String Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___ADD_STRING_LABEL__STRING = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Neo Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_OPERATION_COUNT = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoEdgeImpl <em>Neo Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoEdgeImpl
	 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoEdge()
	 * @generated
	 */
	int NEO_EDGE = 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl <em>Neo Path Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl
	 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoPathPart()
	 * @generated
	 */
	int NEO_PATH_PART = 5;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoComplexEdgeImpl <em>Neo Complex Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoComplexEdgeImpl
	 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoComplexEdge()
	 * @generated
	 */
	int NEO_COMPLEX_EDGE = 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl <em>Neo Simple Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl
	 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoSimpleEdge()
	 * @generated
	 */
	int NEO_SIMPLE_EDGE = 4;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyNodeImpl <em>Neo Property Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyNodeImpl
	 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoPropertyNode()
	 * @generated
	 */
	int NEO_PROPERTY_NODE = 6;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathParamImpl <em>Neo Path Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoPathParamImpl
	 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoPathParam()
	 * @generated
	 */
	int NEO_PATH_PARAM = 7;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl <em>Neo Property Path Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl
	 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoPropertyPathParam()
	 * @generated
	 */
	int NEO_PROPERTY_PATH_PARAM = 8;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyEdgeImpl <em>Neo Property Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyEdgeImpl
	 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoPropertyEdge()
	 * @generated
	 */
	int NEO_PROPERTY_EDGE = 9;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoAbstractEdgeImpl <em>Neo Abstract Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoAbstractEdgeImpl
	 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoAbstractEdge()
	 * @generated
	 */
	int NEO_ABSTRACT_EDGE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE__ID = GraphstructurePackage.RELATION__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE__INTERNAL_ID = GraphstructurePackage.RELATION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Incoming Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE__INCOMING_MAPPING = GraphstructurePackage.RELATION__INCOMING_MAPPING;

	/**
	 * The feature id for the '<em><b>Outgoing Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE__OUTGOING_MAPPINGS = GraphstructurePackage.RELATION__OUTGOING_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE__GRAPH = GraphstructurePackage.RELATION__GRAPH;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE__SOURCE = GraphstructurePackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE__TARGET = GraphstructurePackage.RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE__NAME = GraphstructurePackage.RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE__TRANSLATED = GraphstructurePackage.RELATION__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE__PREDICATES_ARE_BEING_TRANSLATED = GraphstructurePackage.RELATION__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Return Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE__RETURN_ELEMENT = GraphstructurePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neo Abstract Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE_FEATURE_COUNT = GraphstructurePackage.RELATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.RELATION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.RELATION___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.RELATION___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___MY_TO_STRING = GraphstructurePackage.RELATION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___GENERATE_CYPHER = GraphstructurePackage.RELATION___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___GENERATE_XQUERY = GraphstructurePackage.RELATION___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___GENERATE_SPARQL = GraphstructurePackage.RELATION___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___GET_CONTAINER = GraphstructurePackage.RELATION___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___GET_ANCESTOR__CLASS = GraphstructurePackage.RELATION___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___INITIALIZE_TRANSLATION = GraphstructurePackage.RELATION___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___PREPARE_TRANSLATION = GraphstructurePackage.RELATION___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___GET_OPERATOR_LIST = GraphstructurePackage.RELATION___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___GET_PARAMETER_LIST = GraphstructurePackage.RELATION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___GET_ALL_PARAMETERS = GraphstructurePackage.RELATION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.RELATION___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.RELATION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___RECORD_VALUES__XMLDATADATABASE = GraphstructurePackage.RELATION___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___RELATIONS_XML_ADAPTED = GraphstructurePackage.RELATION___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___CREATE_XML_ADAPTION = GraphstructurePackage.RELATION___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___CREATE_RDF_ADAPTION = GraphstructurePackage.RELATION___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___CREATE_NEO4J_ADAPTION = GraphstructurePackage.RELATION___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___CREATE_PARAMETERS = GraphstructurePackage.RELATION___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.RELATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Original ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___GET_ORIGINAL_ID = GraphstructurePackage.RELATION___GET_ORIGINAL_ID;

	/**
	 * The operation id for the '<em>Get Original Relation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___GET_ORIGINAL_RELATION = GraphstructurePackage.RELATION___GET_ORIGINAL_RELATION;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.RELATION___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Remove Relation From Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS = GraphstructurePackage.RELATION___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS;

	/**
	 * The operation id for the '<em>Remove Mappings To Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___REMOVE_MAPPINGS_TO_NEXT = GraphstructurePackage.RELATION___REMOVE_MAPPINGS_TO_NEXT;

	/**
	 * The operation id for the '<em>Adapt As Xml Element Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___ADAPT_AS_XML_ELEMENT_NAVIGATION = GraphstructurePackage.RELATION___ADAPT_AS_XML_ELEMENT_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Property Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___ADAPT_AS_XML_PROPERTY_NAVIGATION = GraphstructurePackage.RELATION___ADAPT_AS_XML_PROPERTY_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___ADAPT_AS_XML_REFERENCE = GraphstructurePackage.RELATION___ADAPT_AS_XML_REFERENCE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Predicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___ADAPT_AS_RDF_PREDICATE = GraphstructurePackage.RELATION___ADAPT_AS_RDF_PREDICATE;

	/**
	 * The operation id for the '<em>Adapt As Neo Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___ADAPT_AS_NEO_EDGE = GraphstructurePackage.RELATION___ADAPT_AS_NEO_EDGE;

	/**
	 * The operation id for the '<em>Adapt As Property Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___ADAPT_AS_PROPERTY_EDGE = GraphstructurePackage.RELATION___ADAPT_AS_PROPERTY_EDGE;

	/**
	 * The operation id for the '<em>Set Is Return Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___SET_IS_RETURN_ELEMENT__BOOLEAN = GraphstructurePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Return Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___GET_RETURN_VARIABLE = GraphstructurePackage.RELATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Return Inner Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE___GET_RETURN_INNER_EDGES = GraphstructurePackage.RELATION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Neo Abstract Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_EDGE_OPERATION_COUNT = GraphstructurePackage.RELATION_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__ID = NEO_ABSTRACT_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__INTERNAL_ID = NEO_ABSTRACT_EDGE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Incoming Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__INCOMING_MAPPING = NEO_ABSTRACT_EDGE__INCOMING_MAPPING;

	/**
	 * The feature id for the '<em><b>Outgoing Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__OUTGOING_MAPPINGS = NEO_ABSTRACT_EDGE__OUTGOING_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__GRAPH = NEO_ABSTRACT_EDGE__GRAPH;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__SOURCE = NEO_ABSTRACT_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__TARGET = NEO_ABSTRACT_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__NAME = NEO_ABSTRACT_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__TRANSLATED = NEO_ABSTRACT_EDGE__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__PREDICATES_ARE_BEING_TRANSLATED = NEO_ABSTRACT_EDGE__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Return Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__RETURN_ELEMENT = NEO_ABSTRACT_EDGE__RETURN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Neo Path Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__NEO_PATH_PARAM = NEO_ABSTRACT_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neo Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_FEATURE_COUNT = NEO_ABSTRACT_EDGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___VALIDATE__DIAGNOSTICCHAIN_MAP = NEO_ABSTRACT_EDGE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___IS_VALID__ABSTRACTIONLEVEL = NEO_ABSTRACT_EDGE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = NEO_ABSTRACT_EDGE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___MY_TO_STRING = NEO_ABSTRACT_EDGE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GENERATE_CYPHER = NEO_ABSTRACT_EDGE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GENERATE_XQUERY = NEO_ABSTRACT_EDGE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GENERATE_SPARQL = NEO_ABSTRACT_EDGE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_CONTAINER = NEO_ABSTRACT_EDGE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_ANCESTOR__CLASS = NEO_ABSTRACT_EDGE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___INITIALIZE_TRANSLATION = NEO_ABSTRACT_EDGE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___PREPARE_TRANSLATION = NEO_ABSTRACT_EDGE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_OPERATOR_LIST = NEO_ABSTRACT_EDGE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_PARAMETER_LIST = NEO_ABSTRACT_EDGE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_ALL_PARAMETERS = NEO_ABSTRACT_EDGE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___PREPARE_PARAMETER_UPDATES = NEO_ABSTRACT_EDGE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = NEO_ABSTRACT_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___UPDATE_PARAMETERS__PARAMETERLIST = NEO_ABSTRACT_EDGE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = NEO_ABSTRACT_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___RECORD_VALUES__XMLDATADATABASE = NEO_ABSTRACT_EDGE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___RELATIONS_XML_ADAPTED = NEO_ABSTRACT_EDGE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___CREATE_XML_ADAPTION = NEO_ABSTRACT_EDGE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___CREATE_RDF_ADAPTION = NEO_ABSTRACT_EDGE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___CREATE_NEO4J_ADAPTION = NEO_ABSTRACT_EDGE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___CREATE_PARAMETERS = NEO_ABSTRACT_EDGE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = NEO_ABSTRACT_EDGE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Original ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_ORIGINAL_ID = NEO_ABSTRACT_EDGE___GET_ORIGINAL_ID;

	/**
	 * The operation id for the '<em>Get Original Relation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_ORIGINAL_RELATION = NEO_ABSTRACT_EDGE___GET_ORIGINAL_RELATION;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___SET_GRAPH_SIMPLE__GRAPH = NEO_ABSTRACT_EDGE___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Remove Relation From Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS = NEO_ABSTRACT_EDGE___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS;

	/**
	 * The operation id for the '<em>Remove Mappings To Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___REMOVE_MAPPINGS_TO_NEXT = NEO_ABSTRACT_EDGE___REMOVE_MAPPINGS_TO_NEXT;

	/**
	 * The operation id for the '<em>Adapt As Xml Element Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___ADAPT_AS_XML_ELEMENT_NAVIGATION = NEO_ABSTRACT_EDGE___ADAPT_AS_XML_ELEMENT_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Property Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___ADAPT_AS_XML_PROPERTY_NAVIGATION = NEO_ABSTRACT_EDGE___ADAPT_AS_XML_PROPERTY_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___ADAPT_AS_XML_REFERENCE = NEO_ABSTRACT_EDGE___ADAPT_AS_XML_REFERENCE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Predicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___ADAPT_AS_RDF_PREDICATE = NEO_ABSTRACT_EDGE___ADAPT_AS_RDF_PREDICATE;

	/**
	 * The operation id for the '<em>Adapt As Neo Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___ADAPT_AS_NEO_EDGE = NEO_ABSTRACT_EDGE___ADAPT_AS_NEO_EDGE;

	/**
	 * The operation id for the '<em>Adapt As Property Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___ADAPT_AS_PROPERTY_EDGE = NEO_ABSTRACT_EDGE___ADAPT_AS_PROPERTY_EDGE;

	/**
	 * The operation id for the '<em>Set Is Return Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___SET_IS_RETURN_ELEMENT__BOOLEAN = NEO_ABSTRACT_EDGE___SET_IS_RETURN_ELEMENT__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Return Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_RETURN_VARIABLE = NEO_ABSTRACT_EDGE___GET_RETURN_VARIABLE;

	/**
	 * The operation id for the '<em>Get Return Inner Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_RETURN_INNER_EDGES = NEO_ABSTRACT_EDGE___GET_RETURN_INNER_EDGES;

	/**
	 * The number of operations of the '<em>Neo Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_OPERATION_COUNT = NEO_ABSTRACT_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART__ID = PatternstructurePackage.PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART__INTERNAL_ID = PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART__TRANSLATED = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neo Path Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART__NEO_PATH_PARAM = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Neo Property Path Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Last Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART__IS_LAST_EDGE = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Neo Complex Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART__NEO_COMPLEX_EDGE = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Neo Path Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___IS_VALID__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___MY_TO_STRING = PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GENERATE_CYPHER = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GENERATE_XQUERY = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GENERATE_SPARQL = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GET_CONTAINER = PatternstructurePackage.PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GET_ANCESTOR__CLASS = PatternstructurePackage.PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___INITIALIZE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GET_OPERATOR_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GET_PARAMETER_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GET_ALL_PARAMETERS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___PREPARE_PARAMETER_UPDATES = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___UPDATE_PARAMETERS__PARAMETERLIST = PatternstructurePackage.PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___RECORD_VALUES__XMLDATADATABASE = PatternstructurePackage.PATTERN_ELEMENT___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___RELATIONS_XML_ADAPTED = PatternstructurePackage.PATTERN_ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___CREATE_XML_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___CREATE_RDF_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___CREATE_NEO4J_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Get Neo Path Part Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GET_NEO_PATH_PART_EDGES = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Cypher Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GET_CYPHER_VARIABLE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Cypher Without Labels</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GENERATE_CYPHER_WITHOUT_LABELS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Last Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___IS_LAST_EDGE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Cypher Inner Edge Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GET_CYPHER_INNER_EDGE_VARIABLE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Neo Path Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE__ID = NEO_PATH_PART__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE__INTERNAL_ID = NEO_PATH_PART__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE__TRANSLATED = NEO_PATH_PART__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Neo Path Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE__NEO_PATH_PARAM = NEO_PATH_PART__NEO_PATH_PARAM;

	/**
	 * The feature id for the '<em><b>Neo Property Path Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE__NEO_PROPERTY_PATH_PARAM = NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM;

	/**
	 * The feature id for the '<em><b>Is Last Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE__IS_LAST_EDGE = NEO_PATH_PART__IS_LAST_EDGE;

	/**
	 * The feature id for the '<em><b>Neo Complex Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE__NEO_COMPLEX_EDGE = NEO_PATH_PART__NEO_COMPLEX_EDGE;

	/**
	 * The feature id for the '<em><b>Neo Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE__NEO_PATH = NEO_PATH_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neo Complex Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE_FEATURE_COUNT = NEO_PATH_PART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___VALIDATE__DIAGNOSTICCHAIN_MAP = NEO_PATH_PART___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___IS_VALID__ABSTRACTIONLEVEL = NEO_PATH_PART___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = NEO_PATH_PART___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___MY_TO_STRING = NEO_PATH_PART___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GENERATE_CYPHER = NEO_PATH_PART___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GENERATE_XQUERY = NEO_PATH_PART___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GENERATE_SPARQL = NEO_PATH_PART___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GET_CONTAINER = NEO_PATH_PART___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GET_ANCESTOR__CLASS = NEO_PATH_PART___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___INITIALIZE_TRANSLATION = NEO_PATH_PART___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___PREPARE_TRANSLATION = NEO_PATH_PART___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GET_OPERATOR_LIST = NEO_PATH_PART___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GET_PARAMETER_LIST = NEO_PATH_PART___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GET_ALL_PARAMETERS = NEO_PATH_PART___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___PREPARE_PARAMETER_UPDATES = NEO_PATH_PART___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = NEO_PATH_PART___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___UPDATE_PARAMETERS__PARAMETERLIST = NEO_PATH_PART___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = NEO_PATH_PART___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___RECORD_VALUES__XMLDATADATABASE = NEO_PATH_PART___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___RELATIONS_XML_ADAPTED = NEO_PATH_PART___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___CREATE_XML_ADAPTION = NEO_PATH_PART___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___CREATE_RDF_ADAPTION = NEO_PATH_PART___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___CREATE_NEO4J_ADAPTION = NEO_PATH_PART___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Get Neo Path Part Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GET_NEO_PATH_PART_EDGES = NEO_PATH_PART___GET_NEO_PATH_PART_EDGES;

	/**
	 * The operation id for the '<em>Get Cypher Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GET_CYPHER_VARIABLE = NEO_PATH_PART___GET_CYPHER_VARIABLE;

	/**
	 * The operation id for the '<em>Generate Cypher Without Labels</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GENERATE_CYPHER_WITHOUT_LABELS = NEO_PATH_PART___GENERATE_CYPHER_WITHOUT_LABELS;

	/**
	 * The operation id for the '<em>Is Last Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___IS_LAST_EDGE = NEO_PATH_PART___IS_LAST_EDGE;

	/**
	 * The operation id for the '<em>Get Cypher Inner Edge Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GET_CYPHER_INNER_EDGE_VARIABLE = NEO_PATH_PART___GET_CYPHER_INNER_EDGE_VARIABLE;

	/**
	 * The operation id for the '<em>Validate Complex Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___VALIDATE_COMPLEX_EDGE = NEO_PATH_PART_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Neo Path Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___ADD_NEO_PATH_PART__NEOPATHPART = NEO_PATH_PART_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Neo Complex Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE_OPERATION_COUNT = NEO_PATH_PART_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE__ID = NEO_PATH_PART__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE__INTERNAL_ID = NEO_PATH_PART__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE__TRANSLATED = NEO_PATH_PART__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Neo Path Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE__NEO_PATH_PARAM = NEO_PATH_PART__NEO_PATH_PARAM;

	/**
	 * The feature id for the '<em><b>Neo Property Path Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE__NEO_PROPERTY_PATH_PARAM = NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM;

	/**
	 * The feature id for the '<em><b>Is Last Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE__IS_LAST_EDGE = NEO_PATH_PART__IS_LAST_EDGE;

	/**
	 * The feature id for the '<em><b>Neo Complex Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE__NEO_COMPLEX_EDGE = NEO_PATH_PART__NEO_COMPLEX_EDGE;

	/**
	 * The feature id for the '<em><b>Key Value Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE__KEY_VALUE_PARAM = NEO_PATH_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neo Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE__NEO_DIRECTION = NEO_PATH_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Neo Target Node Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS = NEO_PATH_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Neo Edge Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE__NEO_EDGE_LABEL = NEO_PATH_PART_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Edge Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE__EDGE_NUMBER = NEO_PATH_PART_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Neo Simple Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE_FEATURE_COUNT = NEO_PATH_PART_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___VALIDATE__DIAGNOSTICCHAIN_MAP = NEO_PATH_PART___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___IS_VALID__ABSTRACTIONLEVEL = NEO_PATH_PART___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = NEO_PATH_PART___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___MY_TO_STRING = NEO_PATH_PART___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GENERATE_CYPHER = NEO_PATH_PART___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GENERATE_XQUERY = NEO_PATH_PART___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GENERATE_SPARQL = NEO_PATH_PART___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GET_CONTAINER = NEO_PATH_PART___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GET_ANCESTOR__CLASS = NEO_PATH_PART___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___INITIALIZE_TRANSLATION = NEO_PATH_PART___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___PREPARE_TRANSLATION = NEO_PATH_PART___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GET_OPERATOR_LIST = NEO_PATH_PART___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GET_PARAMETER_LIST = NEO_PATH_PART___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GET_ALL_PARAMETERS = NEO_PATH_PART___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___PREPARE_PARAMETER_UPDATES = NEO_PATH_PART___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = NEO_PATH_PART___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___UPDATE_PARAMETERS__PARAMETERLIST = NEO_PATH_PART___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = NEO_PATH_PART___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___RECORD_VALUES__XMLDATADATABASE = NEO_PATH_PART___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___RELATIONS_XML_ADAPTED = NEO_PATH_PART___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___CREATE_XML_ADAPTION = NEO_PATH_PART___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___CREATE_RDF_ADAPTION = NEO_PATH_PART___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___CREATE_NEO4J_ADAPTION = NEO_PATH_PART___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Get Neo Path Part Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GET_NEO_PATH_PART_EDGES = NEO_PATH_PART___GET_NEO_PATH_PART_EDGES;

	/**
	 * The operation id for the '<em>Get Cypher Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GET_CYPHER_VARIABLE = NEO_PATH_PART___GET_CYPHER_VARIABLE;

	/**
	 * The operation id for the '<em>Generate Cypher Without Labels</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GENERATE_CYPHER_WITHOUT_LABELS = NEO_PATH_PART___GENERATE_CYPHER_WITHOUT_LABELS;

	/**
	 * The operation id for the '<em>Is Last Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___IS_LAST_EDGE = NEO_PATH_PART___IS_LAST_EDGE;

	/**
	 * The operation id for the '<em>Get Cypher Inner Edge Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GET_CYPHER_INNER_EDGE_VARIABLE = NEO_PATH_PART___GET_CYPHER_INNER_EDGE_VARIABLE;

	/**
	 * The operation id for the '<em>Set Neo Direction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___SET_NEO_DIRECTION__NEODIRECTION = NEO_PATH_PART_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add String Target Node Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___ADD_STRING_TARGET_NODE_LABEL__STRING = NEO_PATH_PART_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Neo Edge Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___ADD_NEO_EDGE_LABEL__STRING = NEO_PATH_PART_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Neo Simple Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE_OPERATION_COUNT = NEO_PATH_PART_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__ID = GraphstructurePackage.PRIMITIVE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__INTERNAL_ID = GraphstructurePackage.PRIMITIVE_NODE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__COMPARISON1 = GraphstructurePackage.PRIMITIVE_NODE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__COMPARISON2 = GraphstructurePackage.PRIMITIVE_NODE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Outgoing Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__OUTGOING_MAPPINGS = GraphstructurePackage.PRIMITIVE_NODE__OUTGOING_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Incoming Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__INCOMING_MAPPING = GraphstructurePackage.PRIMITIVE_NODE__INCOMING_MAPPING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__GRAPH = GraphstructurePackage.PRIMITIVE_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__NAME = GraphstructurePackage.PRIMITIVE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__PREDICATES = GraphstructurePackage.PRIMITIVE_NODE__PREDICATES;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__INCOMING = GraphstructurePackage.PRIMITIVE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Return Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__RETURN_NODE = GraphstructurePackage.PRIMITIVE_NODE__RETURN_NODE;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__TYPE_MODIFIABLE = GraphstructurePackage.PRIMITIVE_NODE__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__TRANSLATED = GraphstructurePackage.PRIMITIVE_NODE__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__PREDICATES_ARE_BEING_TRANSLATED = GraphstructurePackage.PRIMITIVE_NODE__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Match</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__MATCH = GraphstructurePackage.PRIMITIVE_NODE__MATCH;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__CONTAINS = GraphstructurePackage.PRIMITIVE_NODE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Null Check</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__NULL_CHECK = GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK;

	/**
	 * The feature id for the '<em><b>Node Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__NODE_PLACE = GraphstructurePackage.PRIMITIVE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Variable Distinct In Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__IS_VARIABLE_DISTINCT_IN_USE = GraphstructurePackage.PRIMITIVE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__RETURN_PROPERTY = GraphstructurePackage.PRIMITIVE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Neo Property Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE_FEATURE_COUNT = GraphstructurePackage.PRIMITIVE_NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.PRIMITIVE_NODE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.PRIMITIVE_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___MY_TO_STRING = GraphstructurePackage.PRIMITIVE_NODE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GENERATE_CYPHER = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GENERATE_XQUERY = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GENERATE_SPARQL = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_CONTAINER = GraphstructurePackage.PRIMITIVE_NODE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_ANCESTOR__CLASS = GraphstructurePackage.PRIMITIVE_NODE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___INITIALIZE_TRANSLATION = GraphstructurePackage.PRIMITIVE_NODE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___PREPARE_TRANSLATION = GraphstructurePackage.PRIMITIVE_NODE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_OPERATOR_LIST = GraphstructurePackage.PRIMITIVE_NODE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_PARAMETER_LIST = GraphstructurePackage.PRIMITIVE_NODE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_ALL_PARAMETERS = GraphstructurePackage.PRIMITIVE_NODE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.PRIMITIVE_NODE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.PRIMITIVE_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.PRIMITIVE_NODE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.PRIMITIVE_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___RECORD_VALUES__XMLDATADATABASE = GraphstructurePackage.PRIMITIVE_NODE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___RELATIONS_XML_ADAPTED = GraphstructurePackage.PRIMITIVE_NODE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___CREATE_XML_ADAPTION = GraphstructurePackage.PRIMITIVE_NODE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___CREATE_RDF_ADAPTION = GraphstructurePackage.PRIMITIVE_NODE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___CREATE_NEO4J_ADAPTION = GraphstructurePackage.PRIMITIVE_NODE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.PRIMITIVE_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_RETURN_TYPE = GraphstructurePackage.PRIMITIVE_NODE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___IS_TRANSLATABLE = GraphstructurePackage.PRIMITIVE_NODE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_ALL_ARGUMENT_ELEMENTS = GraphstructurePackage.PRIMITIVE_NODE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___IS_OPERATOR_ARGUMENT = GraphstructurePackage.PRIMITIVE_NODE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___CREATE_PARAMETERS = GraphstructurePackage.PRIMITIVE_NODE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.PRIMITIVE_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Original ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_ORIGINAL_ID = GraphstructurePackage.PRIMITIVE_NODE___GET_ORIGINAL_ID;

	/**
	 * The operation id for the '<em>Get Original Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_ORIGINAL_NODE = GraphstructurePackage.PRIMITIVE_NODE___GET_ORIGINAL_NODE;

	/**
	 * The operation id for the '<em>Get Equivalent Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_EQUIVALENT_NODES = GraphstructurePackage.PRIMITIVE_NODE___GET_EQUIVALENT_NODES;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.PRIMITIVE_NODE___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Get Relations To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_RELATIONS_TO__NODE = GraphstructurePackage.PRIMITIVE_NODE___GET_RELATIONS_TO__NODE;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_ALL_OPERATORS = GraphstructurePackage.PRIMITIVE_NODE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_OUTGOING = GraphstructurePackage.PRIMITIVE_NODE___ADD_OUTGOING;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_OUTGOING__NODE = GraphstructurePackage.PRIMITIVE_NODE___ADD_OUTGOING__NODE;

	/**
	 * The operation id for the '<em>Add Incomming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_INCOMMING__COMPLEXNODE = GraphstructurePackage.PRIMITIVE_NODE___ADD_INCOMMING__COMPLEXNODE;

	/**
	 * The operation id for the '<em>Add Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_COMPARISON__NODE = GraphstructurePackage.PRIMITIVE_NODE___ADD_COMPARISON__NODE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_PRIMITIVE_COMPARISON = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_PRIMITIVE_COMPARISON__STRING = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_PRIMITIVE_MATCH = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_MATCH;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_PRIMITIVE_MATCH__STRING = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_MATCH__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_PRIMITIVE_CONTAINS = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_CONTAINS;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_PRIMITIVE_CONTAINS__STRING = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_CONTAINS__STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___CHECK_COMPARISON_CONSISTENCY = GraphstructurePackage.PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON = GraphstructurePackage.PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON;

	/**
	 * The operation id for the '<em>Check Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___CHECK_GENERIC = GraphstructurePackage.PRIMITIVE_NODE___CHECK_GENERIC;

	/**
	 * The operation id for the '<em>Make Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___MAKE_GENERIC = GraphstructurePackage.PRIMITIVE_NODE___MAKE_GENERIC;

	/**
	 * The operation id for the '<em>Make Generic Recursive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___MAKE_GENERIC_RECURSIVE = GraphstructurePackage.PRIMITIVE_NODE___MAKE_GENERIC_RECURSIVE;

	/**
	 * The operation id for the '<em>Check Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___CHECK_COMPLEX = GraphstructurePackage.PRIMITIVE_NODE___CHECK_COMPLEX;

	/**
	 * The operation id for the '<em>Make Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___MAKE_COMPLEX = GraphstructurePackage.PRIMITIVE_NODE___MAKE_COMPLEX;

	/**
	 * The operation id for the '<em>Make Complex Recursive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___MAKE_COMPLEX_RECURSIVE = GraphstructurePackage.PRIMITIVE_NODE___MAKE_COMPLEX_RECURSIVE;

	/**
	 * The operation id for the '<em>Check Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___CHECK_PRIMITIVE = GraphstructurePackage.PRIMITIVE_NODE___CHECK_PRIMITIVE;

	/**
	 * The operation id for the '<em>Make Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___MAKE_PRIMITIVE = GraphstructurePackage.PRIMITIVE_NODE___MAKE_PRIMITIVE;

	/**
	 * The operation id for the '<em>Make Primitive Recursive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___MAKE_PRIMITIVE_RECURSIVE = GraphstructurePackage.PRIMITIVE_NODE___MAKE_PRIMITIVE_RECURSIVE;

	/**
	 * The operation id for the '<em>Adapt As Xml Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADAPT_AS_XML_ELEMENT = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_XML_ELEMENT;

	/**
	 * The operation id for the '<em>Adapt As Xml Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADAPT_AS_XML_PROPERTY = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_XML_PROPERTY;

	/**
	 * The operation id for the '<em>Adapt As Rdf Iri Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADAPT_AS_RDF_IRI_NODE = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_RDF_IRI_NODE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Literal Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADAPT_AS_RDF_LITERAL_NODE = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_RDF_LITERAL_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADAPT_AS_NEO_NODE = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_NEO_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Property Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADAPT_AS_NEO_PROPERTY_NODE = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_NEO_PROPERTY_NODE;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_PRIMITIVE_NULL_CHECK = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_NULL_CHECK;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___CHECK_COMPARISON_CONSISTENCY__PARAMETERVALUE = GraphstructurePackage.PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Get Cypher Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_CYPHER_VARIABLE = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Cypher Return Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_CYPHER_RETURN_VARIABLE = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Cypher Property Addressing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GENERATE_CYPHER_PROPERTY_ADDRESSING = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Cypher Match Node Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GENERATE_CYPHER_MATCH_NODE_VARIABLE = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Is Return Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___SET_IS_RETURN_PROPERTY__BOOLEAN = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Neo Property Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE_OPERATION_COUNT = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoAbstractPathParamImpl <em>Neo Abstract Path Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoAbstractPathParamImpl
	 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoAbstractPathParam()
	 * @generated
	 */
	int NEO_ABSTRACT_PATH_PARAM = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM__ID = ParametersPackage.PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM__INTERNAL_ID = ParametersPackage.PARAMETER__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM__PARAMETER_LIST = ParametersPackage.PARAMETER__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM__PREDEFINED = ParametersPackage.PARAMETER__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM__PARAMETER_REFERENCES = ParametersPackage.PARAMETER__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM__DESCRIPTION = ParametersPackage.PARAMETER__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Neo Abstract Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM_FEATURE_COUNT = ParametersPackage.PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___IS_VALID__ABSTRACTIONLEVEL = ParametersPackage.PARAMETER___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = ParametersPackage.PARAMETER___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___MY_TO_STRING = ParametersPackage.PARAMETER___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___GENERATE_CYPHER = ParametersPackage.PARAMETER___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___GENERATE_XQUERY = ParametersPackage.PARAMETER___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___GENERATE_SPARQL = ParametersPackage.PARAMETER___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___GET_CONTAINER = ParametersPackage.PARAMETER___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___GET_ANCESTOR__CLASS = ParametersPackage.PARAMETER___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___INITIALIZE_TRANSLATION = ParametersPackage.PARAMETER___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___PREPARE_TRANSLATION = ParametersPackage.PARAMETER___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___GET_OPERATOR_LIST = ParametersPackage.PARAMETER___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___GET_PARAMETER_LIST = ParametersPackage.PARAMETER___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___GET_ALL_PARAMETERS = ParametersPackage.PARAMETER___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___PREPARE_PARAMETER_UPDATES = ParametersPackage.PARAMETER___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = ParametersPackage.PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = ParametersPackage.PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = ParametersPackage.PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___RECORD_VALUES__XMLDATADATABASE = ParametersPackage.PARAMETER___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___RELATIONS_XML_ADAPTED = ParametersPackage.PARAMETER___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___CREATE_XML_ADAPTION = ParametersPackage.PARAMETER___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___CREATE_RDF_ADAPTION = ParametersPackage.PARAMETER___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___CREATE_NEO4J_ADAPTION = ParametersPackage.PARAMETER___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = ParametersPackage.PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___VALIDATE_AGAINST_SCHEMA = ParametersPackage.PARAMETER___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = ParametersPackage.PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___INPUT_IS_VALID = ParametersPackage.PARAMETER___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___IS_USED = ParametersPackage.PARAMETER___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___SET_VALUE_FROM_STRING__STRING = ParametersPackage.PARAMETER___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___GET_VALUE_AS_STRING = ParametersPackage.PARAMETER___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY = ParametersPackage.PARAMETER___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___GET_OPTIONS_AS_STRING_LIST = ParametersPackage.PARAMETER___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___GENERATE_DESCRIPTION = ParametersPackage.PARAMETER___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___CREATE_PARAMETERS = ParametersPackage.PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = ParametersPackage.PARAMETER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Neo Abstract Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ABSTRACT_PATH_PARAM_OPERATION_COUNT = ParametersPackage.PARAMETER_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM__ID = NEO_ABSTRACT_PATH_PARAM__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM__INTERNAL_ID = NEO_ABSTRACT_PATH_PARAM__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM__PARAMETER_LIST = NEO_ABSTRACT_PATH_PARAM__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM__PREDEFINED = NEO_ABSTRACT_PATH_PARAM__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM__PARAMETER_REFERENCES = NEO_ABSTRACT_PATH_PARAM__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM__DESCRIPTION = NEO_ABSTRACT_PATH_PARAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Neo Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM__NEO_EDGE = NEO_ABSTRACT_PATH_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neo Path Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM__NEO_PATH_PART = NEO_ABSTRACT_PATH_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Neo Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM_FEATURE_COUNT = NEO_ABSTRACT_PATH_PARAM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___IS_VALID__ABSTRACTIONLEVEL = NEO_ABSTRACT_PATH_PARAM___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = NEO_ABSTRACT_PATH_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___MY_TO_STRING = NEO_ABSTRACT_PATH_PARAM___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GENERATE_CYPHER = NEO_ABSTRACT_PATH_PARAM___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GENERATE_XQUERY = NEO_ABSTRACT_PATH_PARAM___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GENERATE_SPARQL = NEO_ABSTRACT_PATH_PARAM___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_CONTAINER = NEO_ABSTRACT_PATH_PARAM___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_ANCESTOR__CLASS = NEO_ABSTRACT_PATH_PARAM___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___INITIALIZE_TRANSLATION = NEO_ABSTRACT_PATH_PARAM___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___PREPARE_TRANSLATION = NEO_ABSTRACT_PATH_PARAM___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_OPERATOR_LIST = NEO_ABSTRACT_PATH_PARAM___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_PARAMETER_LIST = NEO_ABSTRACT_PATH_PARAM___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_ALL_PARAMETERS = NEO_ABSTRACT_PATH_PARAM___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___PREPARE_PARAMETER_UPDATES = NEO_ABSTRACT_PATH_PARAM___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = NEO_ABSTRACT_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = NEO_ABSTRACT_PATH_PARAM___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = NEO_ABSTRACT_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___RECORD_VALUES__XMLDATADATABASE = NEO_ABSTRACT_PATH_PARAM___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___RELATIONS_XML_ADAPTED = NEO_ABSTRACT_PATH_PARAM___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___CREATE_XML_ADAPTION = NEO_ABSTRACT_PATH_PARAM___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___CREATE_RDF_ADAPTION = NEO_ABSTRACT_PATH_PARAM___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___CREATE_NEO4J_ADAPTION = NEO_ABSTRACT_PATH_PARAM___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = NEO_ABSTRACT_PATH_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___VALIDATE_AGAINST_SCHEMA = NEO_ABSTRACT_PATH_PARAM___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = NEO_ABSTRACT_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___INPUT_IS_VALID = NEO_ABSTRACT_PATH_PARAM___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___IS_USED = NEO_ABSTRACT_PATH_PARAM___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___SET_VALUE_FROM_STRING__STRING = NEO_ABSTRACT_PATH_PARAM___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_VALUE_AS_STRING = NEO_ABSTRACT_PATH_PARAM___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY = NEO_ABSTRACT_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_OPTIONS_AS_STRING_LIST = NEO_ABSTRACT_PATH_PARAM___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GENERATE_DESCRIPTION = NEO_ABSTRACT_PATH_PARAM___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___CREATE_PARAMETERS = NEO_ABSTRACT_PATH_PARAM___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = NEO_ABSTRACT_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The number of operations of the '<em>Neo Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM_OPERATION_COUNT = NEO_ABSTRACT_PATH_PARAM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__ID = NEO_ABSTRACT_PATH_PARAM__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__INTERNAL_ID = NEO_ABSTRACT_PATH_PARAM__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__PARAMETER_LIST = NEO_ABSTRACT_PATH_PARAM__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__PREDEFINED = NEO_ABSTRACT_PATH_PARAM__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__PARAMETER_REFERENCES = NEO_ABSTRACT_PATH_PARAM__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__DESCRIPTION = NEO_ABSTRACT_PATH_PARAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Neo Property Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE = NEO_ABSTRACT_PATH_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neo Property Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME = NEO_ABSTRACT_PATH_PARAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Neo Path Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__NEO_PATH_PART = NEO_ABSTRACT_PATH_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Neo Property Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM_FEATURE_COUNT = NEO_ABSTRACT_PATH_PARAM_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___IS_VALID__ABSTRACTIONLEVEL = NEO_ABSTRACT_PATH_PARAM___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = NEO_ABSTRACT_PATH_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___MY_TO_STRING = NEO_ABSTRACT_PATH_PARAM___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GENERATE_CYPHER = NEO_ABSTRACT_PATH_PARAM___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GENERATE_XQUERY = NEO_ABSTRACT_PATH_PARAM___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GENERATE_SPARQL = NEO_ABSTRACT_PATH_PARAM___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_CONTAINER = NEO_ABSTRACT_PATH_PARAM___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_ANCESTOR__CLASS = NEO_ABSTRACT_PATH_PARAM___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___INITIALIZE_TRANSLATION = NEO_ABSTRACT_PATH_PARAM___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___PREPARE_TRANSLATION = NEO_ABSTRACT_PATH_PARAM___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_OPERATOR_LIST = NEO_ABSTRACT_PATH_PARAM___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_PARAMETER_LIST = NEO_ABSTRACT_PATH_PARAM___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_ALL_PARAMETERS = NEO_ABSTRACT_PATH_PARAM___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___PREPARE_PARAMETER_UPDATES = NEO_ABSTRACT_PATH_PARAM___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = NEO_ABSTRACT_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = NEO_ABSTRACT_PATH_PARAM___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = NEO_ABSTRACT_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___RECORD_VALUES__XMLDATADATABASE = NEO_ABSTRACT_PATH_PARAM___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___RELATIONS_XML_ADAPTED = NEO_ABSTRACT_PATH_PARAM___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___CREATE_XML_ADAPTION = NEO_ABSTRACT_PATH_PARAM___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___CREATE_RDF_ADAPTION = NEO_ABSTRACT_PATH_PARAM___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___CREATE_NEO4J_ADAPTION = NEO_ABSTRACT_PATH_PARAM___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = NEO_ABSTRACT_PATH_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___VALIDATE_AGAINST_SCHEMA = NEO_ABSTRACT_PATH_PARAM___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = NEO_ABSTRACT_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___INPUT_IS_VALID = NEO_ABSTRACT_PATH_PARAM___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___IS_USED = NEO_ABSTRACT_PATH_PARAM___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___SET_VALUE_FROM_STRING__STRING = NEO_ABSTRACT_PATH_PARAM___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_VALUE_AS_STRING = NEO_ABSTRACT_PATH_PARAM___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY = NEO_ABSTRACT_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_OPTIONS_AS_STRING_LIST = NEO_ABSTRACT_PATH_PARAM___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GENERATE_DESCRIPTION = NEO_ABSTRACT_PATH_PARAM___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___CREATE_PARAMETERS = NEO_ABSTRACT_PATH_PARAM___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = NEO_ABSTRACT_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Neo Property Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___SET_NEO_PROPERTY_NAME__STRING = NEO_ABSTRACT_PATH_PARAM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Neo Property Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM_OPERATION_COUNT = NEO_ABSTRACT_PATH_PARAM_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__ID = NEO_ABSTRACT_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__INTERNAL_ID = NEO_ABSTRACT_EDGE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Incoming Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__INCOMING_MAPPING = NEO_ABSTRACT_EDGE__INCOMING_MAPPING;

	/**
	 * The feature id for the '<em><b>Outgoing Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__OUTGOING_MAPPINGS = NEO_ABSTRACT_EDGE__OUTGOING_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__GRAPH = NEO_ABSTRACT_EDGE__GRAPH;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__SOURCE = NEO_ABSTRACT_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__TARGET = NEO_ABSTRACT_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__NAME = NEO_ABSTRACT_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__TRANSLATED = NEO_ABSTRACT_EDGE__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__PREDICATES_ARE_BEING_TRANSLATED = NEO_ABSTRACT_EDGE__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Return Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__RETURN_ELEMENT = NEO_ABSTRACT_EDGE__RETURN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Neo Property Path Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM = NEO_ABSTRACT_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neo Property Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE_FEATURE_COUNT = NEO_ABSTRACT_EDGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___VALIDATE__DIAGNOSTICCHAIN_MAP = NEO_ABSTRACT_EDGE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___IS_VALID__ABSTRACTIONLEVEL = NEO_ABSTRACT_EDGE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = NEO_ABSTRACT_EDGE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___MY_TO_STRING = NEO_ABSTRACT_EDGE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GENERATE_CYPHER = NEO_ABSTRACT_EDGE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GENERATE_XQUERY = NEO_ABSTRACT_EDGE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GENERATE_SPARQL = NEO_ABSTRACT_EDGE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_CONTAINER = NEO_ABSTRACT_EDGE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_ANCESTOR__CLASS = NEO_ABSTRACT_EDGE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___INITIALIZE_TRANSLATION = NEO_ABSTRACT_EDGE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___PREPARE_TRANSLATION = NEO_ABSTRACT_EDGE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_OPERATOR_LIST = NEO_ABSTRACT_EDGE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_PARAMETER_LIST = NEO_ABSTRACT_EDGE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_ALL_PARAMETERS = NEO_ABSTRACT_EDGE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___PREPARE_PARAMETER_UPDATES = NEO_ABSTRACT_EDGE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = NEO_ABSTRACT_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___UPDATE_PARAMETERS__PARAMETERLIST = NEO_ABSTRACT_EDGE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = NEO_ABSTRACT_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___RECORD_VALUES__XMLDATADATABASE = NEO_ABSTRACT_EDGE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___RELATIONS_XML_ADAPTED = NEO_ABSTRACT_EDGE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___CREATE_XML_ADAPTION = NEO_ABSTRACT_EDGE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___CREATE_RDF_ADAPTION = NEO_ABSTRACT_EDGE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___CREATE_NEO4J_ADAPTION = NEO_ABSTRACT_EDGE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___CREATE_PARAMETERS = NEO_ABSTRACT_EDGE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = NEO_ABSTRACT_EDGE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Original ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_ORIGINAL_ID = NEO_ABSTRACT_EDGE___GET_ORIGINAL_ID;

	/**
	 * The operation id for the '<em>Get Original Relation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_ORIGINAL_RELATION = NEO_ABSTRACT_EDGE___GET_ORIGINAL_RELATION;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___SET_GRAPH_SIMPLE__GRAPH = NEO_ABSTRACT_EDGE___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Remove Relation From Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS = NEO_ABSTRACT_EDGE___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS;

	/**
	 * The operation id for the '<em>Remove Mappings To Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___REMOVE_MAPPINGS_TO_NEXT = NEO_ABSTRACT_EDGE___REMOVE_MAPPINGS_TO_NEXT;

	/**
	 * The operation id for the '<em>Adapt As Xml Element Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___ADAPT_AS_XML_ELEMENT_NAVIGATION = NEO_ABSTRACT_EDGE___ADAPT_AS_XML_ELEMENT_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Property Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___ADAPT_AS_XML_PROPERTY_NAVIGATION = NEO_ABSTRACT_EDGE___ADAPT_AS_XML_PROPERTY_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___ADAPT_AS_XML_REFERENCE = NEO_ABSTRACT_EDGE___ADAPT_AS_XML_REFERENCE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Predicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___ADAPT_AS_RDF_PREDICATE = NEO_ABSTRACT_EDGE___ADAPT_AS_RDF_PREDICATE;

	/**
	 * The operation id for the '<em>Adapt As Neo Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___ADAPT_AS_NEO_EDGE = NEO_ABSTRACT_EDGE___ADAPT_AS_NEO_EDGE;

	/**
	 * The operation id for the '<em>Adapt As Property Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___ADAPT_AS_PROPERTY_EDGE = NEO_ABSTRACT_EDGE___ADAPT_AS_PROPERTY_EDGE;

	/**
	 * The operation id for the '<em>Set Is Return Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___SET_IS_RETURN_ELEMENT__BOOLEAN = NEO_ABSTRACT_EDGE___SET_IS_RETURN_ELEMENT__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Return Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_RETURN_VARIABLE = NEO_ABSTRACT_EDGE___GET_RETURN_VARIABLE;

	/**
	 * The operation id for the '<em>Get Return Inner Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_RETURN_INNER_EDGES = NEO_ABSTRACT_EDGE___GET_RETURN_INNER_EDGES;

	/**
	 * The operation id for the '<em>Generate Cypher Property Addressing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GENERATE_CYPHER_PROPERTY_ADDRESSING = NEO_ABSTRACT_EDGE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Cypher Match Node Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GENERATE_CYPHER_MATCH_NODE_VARIABLE = NEO_ABSTRACT_EDGE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Neo Property Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE_OPERATION_COUNT = NEO_ABSTRACT_EDGE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionNeo4J.NeoDirection <em>Neo Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.NeoDirection
	 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoDirection()
	 * @generated
	 */
	int NEO_DIRECTION = 12;


	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionNeo4J.NeoPlace <em>Neo Place</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPlace
	 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoPlace()
	 * @generated
	 */
	int NEO_PLACE = 13;


	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractNode <em>Neo Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Abstract Node</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoAbstractNode
	 * @generated
	 */
	EClass getNeoAbstractNode();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractNode#getNodePlace <em>Node Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Place</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoAbstractNode#getNodePlace()
	 * @see #getNeoAbstractNode()
	 * @generated
	 */
	EAttribute getNeoAbstractNode_NodePlace();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractNode#isIsVariableDistinctInUse <em>Is Variable Distinct In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Variable Distinct In Use</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoAbstractNode#isIsVariableDistinctInUse()
	 * @see #getNeoAbstractNode()
	 * @generated
	 */
	EAttribute getNeoAbstractNode_IsVariableDistinctInUse();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractNode#getCypherVariable() <em>Get Cypher Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cypher Variable</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoAbstractNode#getCypherVariable()
	 * @generated
	 */
	EOperation getNeoAbstractNode__GetCypherVariable();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractNode#getCypherReturnVariable() <em>Get Cypher Return Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cypher Return Variable</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoAbstractNode#getCypherReturnVariable()
	 * @generated
	 */
	EOperation getNeoAbstractNode__GetCypherReturnVariable();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionNeo4J.NeoNode <em>Neo Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Node</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoNode
	 * @generated
	 */
	EClass getNeoNode();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionNeo4J.NeoNode#getNeoNodeLabels <em>Neo Node Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neo Node Labels</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoNode#getNeoNodeLabels()
	 * @see #getNeoNode()
	 * @generated
	 */
	EReference getNeoNode_NeoNodeLabels();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoNode#addStringLabel(java.lang.String) <em>Add String Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add String Label</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoNode#addStringLabel(java.lang.String)
	 * @generated
	 */
	EOperation getNeoNode__AddStringLabel__String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionNeo4J.NeoEdge <em>Neo Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Edge</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoEdge
	 * @generated
	 */
	EClass getNeoEdge();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionNeo4J.NeoEdge#getNeoPathParam <em>Neo Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neo Path Param</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoEdge#getNeoPathParam()
	 * @see #getNeoEdge()
	 * @generated
	 */
	EReference getNeoEdge_NeoPathParam();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionNeo4J.NeoComplexEdge <em>Neo Complex Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Complex Edge</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoComplexEdge
	 * @generated
	 */
	EClass getNeoComplexEdge();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.adaptionNeo4J.NeoComplexEdge#getNeoPath <em>Neo Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Neo Path</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoComplexEdge#getNeoPath()
	 * @see #getNeoComplexEdge()
	 * @generated
	 */
	EReference getNeoComplexEdge_NeoPath();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoComplexEdge#validateComplexEdge() <em>Validate Complex Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Complex Edge</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoComplexEdge#validateComplexEdge()
	 * @generated
	 */
	EOperation getNeoComplexEdge__ValidateComplexEdge();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoComplexEdge#addNeoPathPart(qualitypatternmodel.adaptionNeo4J.NeoPathPart) <em>Add Neo Path Part</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Neo Path Part</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoComplexEdge#addNeoPathPart(qualitypatternmodel.adaptionNeo4J.NeoPathPart)
	 * @generated
	 */
	EOperation getNeoComplexEdge__AddNeoPathPart__NeoPathPart();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge <em>Neo Simple Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Simple Edge</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge
	 * @generated
	 */
	EClass getNeoSimpleEdge();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getKeyValueParam <em>Key Value Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key Value Param</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getKeyValueParam()
	 * @see #getNeoSimpleEdge()
	 * @generated
	 */
	EReference getNeoSimpleEdge_KeyValueParam();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getNeoDirection <em>Neo Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neo Direction</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getNeoDirection()
	 * @see #getNeoSimpleEdge()
	 * @generated
	 */
	EAttribute getNeoSimpleEdge_NeoDirection();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getNeoTargetNodeLabels <em>Neo Target Node Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neo Target Node Labels</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getNeoTargetNodeLabels()
	 * @see #getNeoSimpleEdge()
	 * @generated
	 */
	EReference getNeoSimpleEdge_NeoTargetNodeLabels();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getNeoEdgeLabel <em>Neo Edge Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neo Edge Label</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getNeoEdgeLabel()
	 * @see #getNeoSimpleEdge()
	 * @generated
	 */
	EReference getNeoSimpleEdge_NeoEdgeLabel();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getEdgeNumber <em>Edge Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Number</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getEdgeNumber()
	 * @see #getNeoSimpleEdge()
	 * @generated
	 */
	EAttribute getNeoSimpleEdge_EdgeNumber();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#setNeoDirection(qualitypatternmodel.adaptionNeo4J.NeoDirection) <em>Set Neo Direction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Neo Direction</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#setNeoDirection(qualitypatternmodel.adaptionNeo4J.NeoDirection)
	 * @generated
	 */
	EOperation getNeoSimpleEdge__SetNeoDirection__NeoDirection();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#addStringTargetNodeLabel(java.lang.String) <em>Add String Target Node Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add String Target Node Label</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#addStringTargetNodeLabel(java.lang.String)
	 * @generated
	 */
	EOperation getNeoSimpleEdge__AddStringTargetNodeLabel__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#addNeoEdgeLabel(java.lang.String) <em>Add Neo Edge Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Neo Edge Label</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#addNeoEdgeLabel(java.lang.String)
	 * @generated
	 */
	EOperation getNeoSimpleEdge__AddNeoEdgeLabel__String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart <em>Neo Path Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Path Part</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathPart
	 * @generated
	 */
	EClass getNeoPathPart();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#isTranslated <em>Translated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translated</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathPart#isTranslated()
	 * @see #getNeoPathPart()
	 * @generated
	 */
	EAttribute getNeoPathPart_Translated();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoPathParam <em>Neo Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Neo Path Param</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoPathParam()
	 * @see #getNeoPathPart()
	 * @generated
	 */
	EReference getNeoPathPart_NeoPathParam();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoPropertyPathParam <em>Neo Property Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Neo Property Path Param</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoPropertyPathParam()
	 * @see #getNeoPathPart()
	 * @generated
	 */
	EReference getNeoPathPart_NeoPropertyPathParam();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#isIsLastEdge <em>Is Last Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Last Edge</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathPart#isIsLastEdge()
	 * @see #getNeoPathPart()
	 * @generated
	 */
	EAttribute getNeoPathPart_IsLastEdge();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoComplexEdge <em>Neo Complex Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Neo Complex Edge</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoComplexEdge()
	 * @see #getNeoPathPart()
	 * @generated
	 */
	EReference getNeoPathPart_NeoComplexEdge();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoPathPartEdges() <em>Get Neo Path Part Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Neo Path Part Edges</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoPathPartEdges()
	 * @generated
	 */
	EOperation getNeoPathPart__GetNeoPathPartEdges();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#getCypherVariable() <em>Get Cypher Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cypher Variable</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathPart#getCypherVariable()
	 * @generated
	 */
	EOperation getNeoPathPart__GetCypherVariable();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#generateCypherWithoutLabels() <em>Generate Cypher Without Labels</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Cypher Without Labels</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathPart#generateCypherWithoutLabels()
	 * @generated
	 */
	EOperation getNeoPathPart__GenerateCypherWithoutLabels();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#isLastEdge() <em>Is Last Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Last Edge</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathPart#isLastEdge()
	 * @generated
	 */
	EOperation getNeoPathPart__IsLastEdge();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#getCypherInnerEdgeNodeVariable() <em>Get Cypher Inner Edge Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cypher Inner Edge Variable</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathPart#getCypherInnerEdgeNodeVariable()
	 * @generated
	 */
	EOperation getNeoPathPart__GetCypherInnerEdgeVariable();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyNode <em>Neo Property Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Property Node</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyNode
	 * @generated
	 */
	EClass getNeoPropertyNode();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyNode#isReturnProperty <em>Return Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Property</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyNode#isReturnProperty()
	 * @see #getNeoPropertyNode()
	 * @generated
	 */
	EAttribute getNeoPropertyNode_ReturnProperty();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyNode#generateCypherPropertyAddressing() <em>Generate Cypher Property Addressing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Cypher Property Addressing</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyNode#generateCypherPropertyAddressing()
	 * @generated
	 */
	EOperation getNeoPropertyNode__GenerateCypherPropertyAddressing();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyNode#generateCypherMatchNodeVariable() <em>Generate Cypher Match Node Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Cypher Match Node Variable</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyNode#generateCypherMatchNodeVariable()
	 * @generated
	 */
	EOperation getNeoPropertyNode__GenerateCypherMatchNodeVariable();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyNode#setIsReturnProperty(boolean) <em>Set Is Return Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Is Return Property</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyNode#setIsReturnProperty(boolean)
	 * @generated
	 */
	EOperation getNeoPropertyNode__SetIsReturnProperty__boolean();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionNeo4J.NeoPathParam <em>Neo Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Path Param</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathParam
	 * @generated
	 */
	EClass getNeoPathParam();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionNeo4J.NeoPathParam#getNeoEdge <em>Neo Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neo Edge</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathParam#getNeoEdge()
	 * @see #getNeoPathParam()
	 * @generated
	 */
	EReference getNeoPathParam_NeoEdge();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.adaptionNeo4J.NeoPathParam#getNeoPathPart <em>Neo Path Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Neo Path Part</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathParam#getNeoPathPart()
	 * @see #getNeoPathParam()
	 * @generated
	 */
	EReference getNeoPathParam_NeoPathPart();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam <em>Neo Property Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Property Path Param</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam
	 * @generated
	 */
	EClass getNeoPropertyPathParam();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPathPart <em>Neo Path Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Neo Path Part</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPathPart()
	 * @see #getNeoPropertyPathParam()
	 * @generated
	 */
	EReference getNeoPropertyPathParam_NeoPathPart();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPropertyEdge <em>Neo Property Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neo Property Edge</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPropertyEdge()
	 * @see #getNeoPropertyPathParam()
	 * @generated
	 */
	EReference getNeoPropertyPathParam_NeoPropertyEdge();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPropertyName <em>Neo Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neo Property Name</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPropertyName()
	 * @see #getNeoPropertyPathParam()
	 * @generated
	 */
	EReference getNeoPropertyPathParam_NeoPropertyName();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#setNeoPropertyName(java.lang.String) <em>Set Neo Property Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Neo Property Name</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#setNeoPropertyName(java.lang.String)
	 * @generated
	 */
	EOperation getNeoPropertyPathParam__SetNeoPropertyName__String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge <em>Neo Property Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Property Edge</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge
	 * @generated
	 */
	EClass getNeoPropertyEdge();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge#getNeoPropertyPathParam <em>Neo Property Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neo Property Path Param</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge#getNeoPropertyPathParam()
	 * @see #getNeoPropertyEdge()
	 * @generated
	 */
	EReference getNeoPropertyEdge_NeoPropertyPathParam();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge#generateCypherPropertyAddressing() <em>Generate Cypher Property Addressing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Cypher Property Addressing</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge#generateCypherPropertyAddressing()
	 * @generated
	 */
	EOperation getNeoPropertyEdge__GenerateCypherPropertyAddressing();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge#generateCypherMatchNodeVariable() <em>Generate Cypher Match Node Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Cypher Match Node Variable</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge#generateCypherMatchNodeVariable()
	 * @generated
	 */
	EOperation getNeoPropertyEdge__GenerateCypherMatchNodeVariable();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge <em>Neo Abstract Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Abstract Edge</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge
	 * @generated
	 */
	EClass getNeoAbstractEdge();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge#isReturnElement <em>Return Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Element</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge#isReturnElement()
	 * @see #getNeoAbstractEdge()
	 * @generated
	 */
	EAttribute getNeoAbstractEdge_ReturnElement();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge#setIsReturnElement(boolean) <em>Set Is Return Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Is Return Element</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge#setIsReturnElement(boolean)
	 * @generated
	 */
	EOperation getNeoAbstractEdge__SetIsReturnElement__boolean();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge#getReturnVariable() <em>Get Return Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Return Variable</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge#getReturnVariable()
	 * @generated
	 */
	EOperation getNeoAbstractEdge__GetReturnVariable();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge#getReturnInnerEdges() <em>Get Return Inner Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Return Inner Edges</em>' operation.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge#getReturnInnerEdges()
	 * @generated
	 */
	EOperation getNeoAbstractEdge__GetReturnInnerEdges();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam <em>Neo Abstract Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Abstract Path Param</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam
	 * @generated
	 */
	EClass getNeoAbstractPathParam();

	/**
	 * Returns the meta object for enum '{@link qualitypatternmodel.adaptionNeo4J.NeoDirection <em>Neo Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Neo Direction</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoDirection
	 * @generated
	 */
	EEnum getNeoDirection();

	/**
	 * Returns the meta object for enum '{@link qualitypatternmodel.adaptionNeo4J.NeoPlace <em>Neo Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Neo Place</em>'.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPlace
	 * @generated
	 */
	EEnum getNeoPlace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdaptionNeo4JFactory getAdaptionNeo4JFactory();

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
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractNode <em>Neo Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionNeo4J.NeoAbstractNode
		 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoAbstractNode()
		 * @generated
		 */
		EClass NEO_ABSTRACT_NODE = eINSTANCE.getNeoAbstractNode();

		/**
		 * The meta object literal for the '<em><b>Node Place</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEO_ABSTRACT_NODE__NODE_PLACE = eINSTANCE.getNeoAbstractNode_NodePlace();

		/**
		 * The meta object literal for the '<em><b>Is Variable Distinct In Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEO_ABSTRACT_NODE__IS_VARIABLE_DISTINCT_IN_USE = eINSTANCE.getNeoAbstractNode_IsVariableDistinctInUse();

		/**
		 * The meta object literal for the '<em><b>Get Cypher Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_ABSTRACT_NODE___GET_CYPHER_VARIABLE = eINSTANCE.getNeoAbstractNode__GetCypherVariable();

		/**
		 * The meta object literal for the '<em><b>Get Cypher Return Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_ABSTRACT_NODE___GET_CYPHER_RETURN_VARIABLE = eINSTANCE.getNeoAbstractNode__GetCypherReturnVariable();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl <em>Neo Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl
		 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoNode()
		 * @generated
		 */
		EClass NEO_NODE = eINSTANCE.getNeoNode();

		/**
		 * The meta object literal for the '<em><b>Neo Node Labels</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_NODE__NEO_NODE_LABELS = eINSTANCE.getNeoNode_NeoNodeLabels();

		/**
		 * The meta object literal for the '<em><b>Add String Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_NODE___ADD_STRING_LABEL__STRING = eINSTANCE.getNeoNode__AddStringLabel__String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoEdgeImpl <em>Neo Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoEdgeImpl
		 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoEdge()
		 * @generated
		 */
		EClass NEO_EDGE = eINSTANCE.getNeoEdge();

		/**
		 * The meta object literal for the '<em><b>Neo Path Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_EDGE__NEO_PATH_PARAM = eINSTANCE.getNeoEdge_NeoPathParam();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoComplexEdgeImpl <em>Neo Complex Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoComplexEdgeImpl
		 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoComplexEdge()
		 * @generated
		 */
		EClass NEO_COMPLEX_EDGE = eINSTANCE.getNeoComplexEdge();

		/**
		 * The meta object literal for the '<em><b>Neo Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_COMPLEX_EDGE__NEO_PATH = eINSTANCE.getNeoComplexEdge_NeoPath();

		/**
		 * The meta object literal for the '<em><b>Validate Complex Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_COMPLEX_EDGE___VALIDATE_COMPLEX_EDGE = eINSTANCE.getNeoComplexEdge__ValidateComplexEdge();

		/**
		 * The meta object literal for the '<em><b>Add Neo Path Part</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_COMPLEX_EDGE___ADD_NEO_PATH_PART__NEOPATHPART = eINSTANCE.getNeoComplexEdge__AddNeoPathPart__NeoPathPart();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl <em>Neo Simple Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl
		 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoSimpleEdge()
		 * @generated
		 */
		EClass NEO_SIMPLE_EDGE = eINSTANCE.getNeoSimpleEdge();

		/**
		 * The meta object literal for the '<em><b>Key Value Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_SIMPLE_EDGE__KEY_VALUE_PARAM = eINSTANCE.getNeoSimpleEdge_KeyValueParam();

		/**
		 * The meta object literal for the '<em><b>Neo Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEO_SIMPLE_EDGE__NEO_DIRECTION = eINSTANCE.getNeoSimpleEdge_NeoDirection();

		/**
		 * The meta object literal for the '<em><b>Neo Target Node Labels</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS = eINSTANCE.getNeoSimpleEdge_NeoTargetNodeLabels();

		/**
		 * The meta object literal for the '<em><b>Neo Edge Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_SIMPLE_EDGE__NEO_EDGE_LABEL = eINSTANCE.getNeoSimpleEdge_NeoEdgeLabel();

		/**
		 * The meta object literal for the '<em><b>Edge Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEO_SIMPLE_EDGE__EDGE_NUMBER = eINSTANCE.getNeoSimpleEdge_EdgeNumber();

		/**
		 * The meta object literal for the '<em><b>Set Neo Direction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_SIMPLE_EDGE___SET_NEO_DIRECTION__NEODIRECTION = eINSTANCE.getNeoSimpleEdge__SetNeoDirection__NeoDirection();

		/**
		 * The meta object literal for the '<em><b>Add String Target Node Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_SIMPLE_EDGE___ADD_STRING_TARGET_NODE_LABEL__STRING = eINSTANCE.getNeoSimpleEdge__AddStringTargetNodeLabel__String();

		/**
		 * The meta object literal for the '<em><b>Add Neo Edge Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_SIMPLE_EDGE___ADD_NEO_EDGE_LABEL__STRING = eINSTANCE.getNeoSimpleEdge__AddNeoEdgeLabel__String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl <em>Neo Path Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl
		 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoPathPart()
		 * @generated
		 */
		EClass NEO_PATH_PART = eINSTANCE.getNeoPathPart();

		/**
		 * The meta object literal for the '<em><b>Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEO_PATH_PART__TRANSLATED = eINSTANCE.getNeoPathPart_Translated();

		/**
		 * The meta object literal for the '<em><b>Neo Path Param</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_PATH_PART__NEO_PATH_PARAM = eINSTANCE.getNeoPathPart_NeoPathParam();

		/**
		 * The meta object literal for the '<em><b>Neo Property Path Param</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM = eINSTANCE.getNeoPathPart_NeoPropertyPathParam();

		/**
		 * The meta object literal for the '<em><b>Is Last Edge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEO_PATH_PART__IS_LAST_EDGE = eINSTANCE.getNeoPathPart_IsLastEdge();

		/**
		 * The meta object literal for the '<em><b>Neo Complex Edge</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_PATH_PART__NEO_COMPLEX_EDGE = eINSTANCE.getNeoPathPart_NeoComplexEdge();

		/**
		 * The meta object literal for the '<em><b>Get Neo Path Part Edges</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PATH_PART___GET_NEO_PATH_PART_EDGES = eINSTANCE.getNeoPathPart__GetNeoPathPartEdges();

		/**
		 * The meta object literal for the '<em><b>Get Cypher Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PATH_PART___GET_CYPHER_VARIABLE = eINSTANCE.getNeoPathPart__GetCypherVariable();

		/**
		 * The meta object literal for the '<em><b>Generate Cypher Without Labels</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PATH_PART___GENERATE_CYPHER_WITHOUT_LABELS = eINSTANCE.getNeoPathPart__GenerateCypherWithoutLabels();

		/**
		 * The meta object literal for the '<em><b>Is Last Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PATH_PART___IS_LAST_EDGE = eINSTANCE.getNeoPathPart__IsLastEdge();

		/**
		 * The meta object literal for the '<em><b>Get Cypher Inner Edge Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PATH_PART___GET_CYPHER_INNER_EDGE_VARIABLE = eINSTANCE.getNeoPathPart__GetCypherInnerEdgeVariable();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyNodeImpl <em>Neo Property Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyNodeImpl
		 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoPropertyNode()
		 * @generated
		 */
		EClass NEO_PROPERTY_NODE = eINSTANCE.getNeoPropertyNode();

		/**
		 * The meta object literal for the '<em><b>Return Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEO_PROPERTY_NODE__RETURN_PROPERTY = eINSTANCE.getNeoPropertyNode_ReturnProperty();

		/**
		 * The meta object literal for the '<em><b>Generate Cypher Property Addressing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PROPERTY_NODE___GENERATE_CYPHER_PROPERTY_ADDRESSING = eINSTANCE.getNeoPropertyNode__GenerateCypherPropertyAddressing();

		/**
		 * The meta object literal for the '<em><b>Generate Cypher Match Node Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PROPERTY_NODE___GENERATE_CYPHER_MATCH_NODE_VARIABLE = eINSTANCE.getNeoPropertyNode__GenerateCypherMatchNodeVariable();

		/**
		 * The meta object literal for the '<em><b>Set Is Return Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PROPERTY_NODE___SET_IS_RETURN_PROPERTY__BOOLEAN = eINSTANCE.getNeoPropertyNode__SetIsReturnProperty__boolean();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathParamImpl <em>Neo Path Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoPathParamImpl
		 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoPathParam()
		 * @generated
		 */
		EClass NEO_PATH_PARAM = eINSTANCE.getNeoPathParam();

		/**
		 * The meta object literal for the '<em><b>Neo Edge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_PATH_PARAM__NEO_EDGE = eINSTANCE.getNeoPathParam_NeoEdge();

		/**
		 * The meta object literal for the '<em><b>Neo Path Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_PATH_PARAM__NEO_PATH_PART = eINSTANCE.getNeoPathParam_NeoPathPart();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl <em>Neo Property Path Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl
		 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoPropertyPathParam()
		 * @generated
		 */
		EClass NEO_PROPERTY_PATH_PARAM = eINSTANCE.getNeoPropertyPathParam();

		/**
		 * The meta object literal for the '<em><b>Neo Path Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_PROPERTY_PATH_PARAM__NEO_PATH_PART = eINSTANCE.getNeoPropertyPathParam_NeoPathPart();

		/**
		 * The meta object literal for the '<em><b>Neo Property Edge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE = eINSTANCE.getNeoPropertyPathParam_NeoPropertyEdge();

		/**
		 * The meta object literal for the '<em><b>Neo Property Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME = eINSTANCE.getNeoPropertyPathParam_NeoPropertyName();

		/**
		 * The meta object literal for the '<em><b>Set Neo Property Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PROPERTY_PATH_PARAM___SET_NEO_PROPERTY_NAME__STRING = eINSTANCE.getNeoPropertyPathParam__SetNeoPropertyName__String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyEdgeImpl <em>Neo Property Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyEdgeImpl
		 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoPropertyEdge()
		 * @generated
		 */
		EClass NEO_PROPERTY_EDGE = eINSTANCE.getNeoPropertyEdge();

		/**
		 * The meta object literal for the '<em><b>Neo Property Path Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM = eINSTANCE.getNeoPropertyEdge_NeoPropertyPathParam();

		/**
		 * The meta object literal for the '<em><b>Generate Cypher Property Addressing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PROPERTY_EDGE___GENERATE_CYPHER_PROPERTY_ADDRESSING = eINSTANCE.getNeoPropertyEdge__GenerateCypherPropertyAddressing();

		/**
		 * The meta object literal for the '<em><b>Generate Cypher Match Node Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PROPERTY_EDGE___GENERATE_CYPHER_MATCH_NODE_VARIABLE = eINSTANCE.getNeoPropertyEdge__GenerateCypherMatchNodeVariable();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoAbstractEdgeImpl <em>Neo Abstract Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoAbstractEdgeImpl
		 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoAbstractEdge()
		 * @generated
		 */
		EClass NEO_ABSTRACT_EDGE = eINSTANCE.getNeoAbstractEdge();

		/**
		 * The meta object literal for the '<em><b>Return Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEO_ABSTRACT_EDGE__RETURN_ELEMENT = eINSTANCE.getNeoAbstractEdge_ReturnElement();

		/**
		 * The meta object literal for the '<em><b>Set Is Return Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_ABSTRACT_EDGE___SET_IS_RETURN_ELEMENT__BOOLEAN = eINSTANCE.getNeoAbstractEdge__SetIsReturnElement__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Return Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_ABSTRACT_EDGE___GET_RETURN_VARIABLE = eINSTANCE.getNeoAbstractEdge__GetReturnVariable();

		/**
		 * The meta object literal for the '<em><b>Get Return Inner Edges</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_ABSTRACT_EDGE___GET_RETURN_INNER_EDGES = eINSTANCE.getNeoAbstractEdge__GetReturnInnerEdges();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionNeo4J.impl.NeoAbstractPathParamImpl <em>Neo Abstract Path Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionNeo4J.impl.NeoAbstractPathParamImpl
		 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoAbstractPathParam()
		 * @generated
		 */
		EClass NEO_ABSTRACT_PATH_PARAM = eINSTANCE.getNeoAbstractPathParam();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionNeo4J.NeoDirection <em>Neo Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionNeo4J.NeoDirection
		 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoDirection()
		 * @generated
		 */
		EEnum NEO_DIRECTION = eINSTANCE.getNeoDirection();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionNeo4J.NeoPlace <em>Neo Place</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionNeo4J.NeoPlace
		 * @see qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl#getNeoPlace()
		 * @generated
		 */
		EEnum NEO_PLACE = eINSTANCE.getNeoPlace();

	}

} //AdaptionNeo4JPackage

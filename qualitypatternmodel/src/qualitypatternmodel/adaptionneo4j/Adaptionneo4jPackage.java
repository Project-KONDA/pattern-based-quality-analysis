/**
 */
package qualitypatternmodel.adaptionneo4j;

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
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jFactory
 * @model kind="package"
 * @generated
 */
public interface Adaptionneo4jPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adaptionneo4j";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "adaptionneo4j";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adaptionneo4j";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Adaptionneo4jPackage eINSTANCE = qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.NeoElement <em>Neo Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.NeoElement
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoElement()
	 * @generated
	 */
	int NEO_ELEMENT = 12;

	/**
	 * The number of structural features of the '<em>Neo Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Cypher Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT___GET_CYPHER_RETURN = 0;

	/**
	 * The number of operations of the '<em>Neo Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.NeoNode <em>Neo Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.NeoNode
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoNode()
	 * @generated
	 */
	int NEO_NODE = 0;

	/**
	 * The number of structural features of the '<em>Neo Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_FEATURE_COUNT = NEO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Cypher Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_CYPHER_RETURN = NEO_ELEMENT___GET_CYPHER_RETURN;

	/**
	 * The operation id for the '<em>Get Cypher Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE___GET_CYPHER_VARIABLE = NEO_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Neo Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_OPERATION_COUNT = NEO_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoElementNodeImpl <em>Neo Element Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.impl.NeoElementNodeImpl
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoElementNode()
	 * @generated
	 */
	int NEO_ELEMENT_NODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__ID = GraphstructurePackage.COMPLEX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__INTERNAL_ID = GraphstructurePackage.COMPLEX_NODE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__COMPARISON1 = GraphstructurePackage.COMPLEX_NODE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__COMPARISON2 = GraphstructurePackage.COMPLEX_NODE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__GRAPH = GraphstructurePackage.COMPLEX_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__NAME = GraphstructurePackage.COMPLEX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__PREDICATES = GraphstructurePackage.COMPLEX_NODE__PREDICATES;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__INCOMING = GraphstructurePackage.COMPLEX_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Return Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__RETURN_NODE = GraphstructurePackage.COMPLEX_NODE__RETURN_NODE;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__TYPE_MODIFIABLE = GraphstructurePackage.COMPLEX_NODE__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__TRANSLATED = GraphstructurePackage.COMPLEX_NODE__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__PREDICATES_ARE_BEING_TRANSLATED = GraphstructurePackage.COMPLEX_NODE__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__OUTGOING = GraphstructurePackage.COMPLEX_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Neo Node Labels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__NEO_NODE_LABELS = GraphstructurePackage.COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neo Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__NEO_PLACE = GraphstructurePackage.COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Variable Distinct In Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE__IS_VARIABLE_DISTINCT_IN_USE = GraphstructurePackage.COMPLEX_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Neo Element Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE_FEATURE_COUNT = GraphstructurePackage.COMPLEX_NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.COMPLEX_NODE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.COMPLEX_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___MY_TO_STRING = GraphstructurePackage.COMPLEX_NODE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GENERATE_CYPHER = GraphstructurePackage.COMPLEX_NODE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GENERATE_XQUERY = GraphstructurePackage.COMPLEX_NODE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GENERATE_SPARQL = GraphstructurePackage.COMPLEX_NODE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GET_CONTAINER = GraphstructurePackage.COMPLEX_NODE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GET_ANCESTOR__CLASS = GraphstructurePackage.COMPLEX_NODE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___INITIALIZE_TRANSLATION = GraphstructurePackage.COMPLEX_NODE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___PREPARE_TRANSLATION = GraphstructurePackage.COMPLEX_NODE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GET_OPERATOR_LIST = GraphstructurePackage.COMPLEX_NODE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GET_ALL_OPERATORS = GraphstructurePackage.COMPLEX_NODE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GET_PARAMETER_LIST = GraphstructurePackage.COMPLEX_NODE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GET_ALL_PARAMETERS = GraphstructurePackage.COMPLEX_NODE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.COMPLEX_NODE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.COMPLEX_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.COMPLEX_NODE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.COMPLEX_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___RECORD_VALUES__XMLDATADATABASE = GraphstructurePackage.COMPLEX_NODE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___RELATIONS_XML_ADAPTED = GraphstructurePackage.COMPLEX_NODE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___CREATE_XML_ADAPTION = GraphstructurePackage.COMPLEX_NODE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___CREATE_RDF_ADAPTION = GraphstructurePackage.COMPLEX_NODE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___CREATE_NEO4J_ADAPTION = GraphstructurePackage.COMPLEX_NODE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___CONTAINS_JAVA_OPERATOR = GraphstructurePackage.COMPLEX_NODE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GENERATE_QUERY_FILTER_PART = GraphstructurePackage.COMPLEX_NODE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GENERATE_XQUERY_JAVA = GraphstructurePackage.COMPLEX_NODE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GENERATE_XQUERY_JAVA_RETURN = GraphstructurePackage.COMPLEX_NODE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GENERATE_XQUERY_JAVA_WHERE = GraphstructurePackage.COMPLEX_NODE___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.COMPLEX_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GET_RETURN_TYPE = GraphstructurePackage.COMPLEX_NODE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___IS_TRANSLATABLE = GraphstructurePackage.COMPLEX_NODE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GET_ALL_ARGUMENT_ELEMENTS = GraphstructurePackage.COMPLEX_NODE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___IS_OPERATOR_ARGUMENT = GraphstructurePackage.COMPLEX_NODE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___CREATE_PARAMETERS = GraphstructurePackage.COMPLEX_NODE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.COMPLEX_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.COMPLEX_NODE___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Get Relations To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GET_RELATIONS_TO__NODE = GraphstructurePackage.COMPLEX_NODE___GET_RELATIONS_TO__NODE;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_OUTGOING = GraphstructurePackage.COMPLEX_NODE___ADD_OUTGOING;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_OUTGOING__GRAPH = GraphstructurePackage.COMPLEX_NODE___ADD_OUTGOING__GRAPH;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_OUTGOING__NODE = GraphstructurePackage.COMPLEX_NODE___ADD_OUTGOING__NODE;

	/**
	 * The operation id for the '<em>Add Incomming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_INCOMMING__COMPLEXNODE = GraphstructurePackage.COMPLEX_NODE___ADD_INCOMMING__COMPLEXNODE;

	/**
	 * The operation id for the '<em>Add Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_COMPARISON__NODE = GraphstructurePackage.COMPLEX_NODE___ADD_COMPARISON__NODE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_PRIMITIVE_COMPARISON = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_PRIMITIVE_COMPARISON__STRING = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_PRIMITIVE_MATCH = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_MATCH;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_PRIMITIVE_MATCH__STRING = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_MATCH__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_PRIMITIVE_CONTAINS = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_CONTAINS;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_PRIMITIVE_CONTAINS__STRING = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_CONTAINS__STRING;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_PRIMITIVE_STRING_LENGTH = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_STRING_LENGTH;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_PRIMITIVE_NULL_CHECK = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_NULL_CHECK;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN;

	/**
	 * The operation id for the '<em>Add Primitive Validate Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_PRIMITIVE_VALIDATE_LINK = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_VALIDATE_LINK;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___CHECK_COMPARISON_CONSISTENCY = GraphstructurePackage.COMPLEX_NODE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON = GraphstructurePackage.COMPLEX_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON;

	/**
	 * The operation id for the '<em>Check Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___CHECK_GENERIC = GraphstructurePackage.COMPLEX_NODE___CHECK_GENERIC;

	/**
	 * The operation id for the '<em>Make Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___MAKE_GENERIC = GraphstructurePackage.COMPLEX_NODE___MAKE_GENERIC;

	/**
	 * The operation id for the '<em>Check Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___CHECK_COMPLEX = GraphstructurePackage.COMPLEX_NODE___CHECK_COMPLEX;

	/**
	 * The operation id for the '<em>Make Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___MAKE_COMPLEX = GraphstructurePackage.COMPLEX_NODE___MAKE_COMPLEX;

	/**
	 * The operation id for the '<em>Check Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___CHECK_PRIMITIVE = GraphstructurePackage.COMPLEX_NODE___CHECK_PRIMITIVE;

	/**
	 * The operation id for the '<em>Make Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___MAKE_PRIMITIVE = GraphstructurePackage.COMPLEX_NODE___MAKE_PRIMITIVE;

	/**
	 * The operation id for the '<em>Adapt As Xml Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADAPT_AS_XML_ELEMENT = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_XML_ELEMENT;

	/**
	 * The operation id for the '<em>Adapt As Xml Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADAPT_AS_XML_PROPERTY = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_XML_PROPERTY;

	/**
	 * The operation id for the '<em>Adapt As Rdf Iri Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADAPT_AS_RDF_IRI_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_RDF_IRI_NODE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Literal Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADAPT_AS_RDF_LITERAL_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_RDF_LITERAL_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADAPT_AS_NEO_ELEMENT_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_NEO_ELEMENT_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Property Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADAPT_AS_NEO_PROPERTY_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_NEO_PROPERTY_NODE;

	/**
	 * The operation id for the '<em>In Java Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___IN_JAVA_RETURN_REQUIRED = GraphstructurePackage.COMPLEX_NODE___IN_JAVA_RETURN_REQUIRED;

	/**
	 * The operation id for the '<em>In Java Graph Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___IN_JAVA_GRAPH_RETURN_REQUIRED = GraphstructurePackage.COMPLEX_NODE___IN_JAVA_GRAPH_RETURN_REQUIRED;

	/**
	 * The operation id for the '<em>In Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___IN_JAVA_WHERE = GraphstructurePackage.COMPLEX_NODE___IN_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Get Cypher Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GET_CYPHER_RETURN = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Cypher Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___GET_CYPHER_VARIABLE = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Neo Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE___ADD_NEO_LABEL__STRING = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Neo Element Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_NODE_OPERATION_COUNT = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoEdgeImpl <em>Neo Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.impl.NeoEdgeImpl
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoEdge()
	 * @generated
	 */
	int NEO_EDGE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__ID = GraphstructurePackage.RELATION__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__INTERNAL_ID = GraphstructurePackage.RELATION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__GRAPH = GraphstructurePackage.RELATION__GRAPH;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__SOURCE = GraphstructurePackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__TARGET = GraphstructurePackage.RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__NAME = GraphstructurePackage.RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__TRANSLATED = GraphstructurePackage.RELATION__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__PREDICATES_ARE_BEING_TRANSLATED = GraphstructurePackage.RELATION__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Return Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE__RETURN_ELEMENT = GraphstructurePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neo Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_FEATURE_COUNT = GraphstructurePackage.RELATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.RELATION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.RELATION___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.RELATION___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___MY_TO_STRING = GraphstructurePackage.RELATION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GENERATE_CYPHER = GraphstructurePackage.RELATION___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GENERATE_XQUERY = GraphstructurePackage.RELATION___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GENERATE_SPARQL = GraphstructurePackage.RELATION___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_CONTAINER = GraphstructurePackage.RELATION___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_ANCESTOR__CLASS = GraphstructurePackage.RELATION___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___INITIALIZE_TRANSLATION = GraphstructurePackage.RELATION___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___PREPARE_TRANSLATION = GraphstructurePackage.RELATION___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_OPERATOR_LIST = GraphstructurePackage.RELATION___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_ALL_OPERATORS = GraphstructurePackage.RELATION___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_PARAMETER_LIST = GraphstructurePackage.RELATION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_ALL_PARAMETERS = GraphstructurePackage.RELATION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.RELATION___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.RELATION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___RECORD_VALUES__XMLDATADATABASE = GraphstructurePackage.RELATION___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___RELATIONS_XML_ADAPTED = GraphstructurePackage.RELATION___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___CREATE_XML_ADAPTION = GraphstructurePackage.RELATION___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___CREATE_RDF_ADAPTION = GraphstructurePackage.RELATION___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___CREATE_NEO4J_ADAPTION = GraphstructurePackage.RELATION___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___CONTAINS_JAVA_OPERATOR = GraphstructurePackage.RELATION___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GENERATE_QUERY_FILTER_PART = GraphstructurePackage.RELATION___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GENERATE_XQUERY_JAVA = GraphstructurePackage.RELATION___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GENERATE_XQUERY_JAVA_RETURN = GraphstructurePackage.RELATION___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GENERATE_XQUERY_JAVA_WHERE = GraphstructurePackage.RELATION___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___CREATE_PARAMETERS = GraphstructurePackage.RELATION___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.RELATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.RELATION___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Is Cross Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___IS_CROSS_GRAPH = GraphstructurePackage.RELATION___IS_CROSS_GRAPH;

	/**
	 * The operation id for the '<em>Adapt As Xml Element Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___ADAPT_AS_XML_ELEMENT_NAVIGATION = GraphstructurePackage.RELATION___ADAPT_AS_XML_ELEMENT_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Property Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___ADAPT_AS_XML_PROPERTY_NAVIGATION = GraphstructurePackage.RELATION___ADAPT_AS_XML_PROPERTY_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___ADAPT_AS_XML_REFERENCE = GraphstructurePackage.RELATION___ADAPT_AS_XML_REFERENCE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Predicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___ADAPT_AS_RDF_PREDICATE = GraphstructurePackage.RELATION___ADAPT_AS_RDF_PREDICATE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___ADAPT_AS_NEO_ELEMENT_EDGE = GraphstructurePackage.RELATION___ADAPT_AS_NEO_ELEMENT_EDGE;

	/**
	 * The operation id for the '<em>Adapt As Property Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___ADAPT_AS_PROPERTY_EDGE = GraphstructurePackage.RELATION___ADAPT_AS_PROPERTY_EDGE;

	/**
	 * The operation id for the '<em>In Java Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___IN_JAVA_RETURN_REQUIRED = GraphstructurePackage.RELATION___IN_JAVA_RETURN_REQUIRED;

	/**
	 * The operation id for the '<em>Get Cypher Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_CYPHER_RETURN = GraphstructurePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Is Return Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___SET_IS_RETURN_ELEMENT__BOOLEAN = GraphstructurePackage.RELATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Return Inner Edge Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE___GET_RETURN_INNER_EDGE_NODES = GraphstructurePackage.RELATION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Neo Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_OPERATION_COUNT = GraphstructurePackage.RELATION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoElementEdgeImpl <em>Neo Element Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.impl.NeoElementEdgeImpl
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoElementEdge()
	 * @generated
	 */
	int NEO_ELEMENT_EDGE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE__ID = NEO_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE__INTERNAL_ID = NEO_EDGE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE__GRAPH = NEO_EDGE__GRAPH;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE__SOURCE = NEO_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE__TARGET = NEO_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE__NAME = NEO_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE__TRANSLATED = NEO_EDGE__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE__PREDICATES_ARE_BEING_TRANSLATED = NEO_EDGE__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Return Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE__RETURN_ELEMENT = NEO_EDGE__RETURN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Neo Element Path Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE__NEO_ELEMENT_PATH_PARAM = NEO_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neo Element Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE_FEATURE_COUNT = NEO_EDGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___VALIDATE__DIAGNOSTICCHAIN_MAP = NEO_EDGE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___IS_VALID__ABSTRACTIONLEVEL = NEO_EDGE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = NEO_EDGE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___MY_TO_STRING = NEO_EDGE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___GENERATE_CYPHER = NEO_EDGE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___GENERATE_XQUERY = NEO_EDGE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___GENERATE_SPARQL = NEO_EDGE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___GET_CONTAINER = NEO_EDGE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___GET_ANCESTOR__CLASS = NEO_EDGE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___INITIALIZE_TRANSLATION = NEO_EDGE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___PREPARE_TRANSLATION = NEO_EDGE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___GET_OPERATOR_LIST = NEO_EDGE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___GET_ALL_OPERATORS = NEO_EDGE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___GET_PARAMETER_LIST = NEO_EDGE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___GET_ALL_PARAMETERS = NEO_EDGE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___PREPARE_PARAMETER_UPDATES = NEO_EDGE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = NEO_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___UPDATE_PARAMETERS__PARAMETERLIST = NEO_EDGE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = NEO_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___RECORD_VALUES__XMLDATADATABASE = NEO_EDGE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___RELATIONS_XML_ADAPTED = NEO_EDGE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___CREATE_XML_ADAPTION = NEO_EDGE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___CREATE_RDF_ADAPTION = NEO_EDGE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___CREATE_NEO4J_ADAPTION = NEO_EDGE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___CONTAINS_JAVA_OPERATOR = NEO_EDGE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___GENERATE_QUERY_FILTER_PART = NEO_EDGE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___GENERATE_XQUERY_JAVA = NEO_EDGE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___GENERATE_XQUERY_JAVA_RETURN = NEO_EDGE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___GENERATE_XQUERY_JAVA_WHERE = NEO_EDGE___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___CREATE_PARAMETERS = NEO_EDGE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = NEO_EDGE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___SET_GRAPH_SIMPLE__GRAPH = NEO_EDGE___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Is Cross Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___IS_CROSS_GRAPH = NEO_EDGE___IS_CROSS_GRAPH;

	/**
	 * The operation id for the '<em>Adapt As Xml Element Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___ADAPT_AS_XML_ELEMENT_NAVIGATION = NEO_EDGE___ADAPT_AS_XML_ELEMENT_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Property Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___ADAPT_AS_XML_PROPERTY_NAVIGATION = NEO_EDGE___ADAPT_AS_XML_PROPERTY_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___ADAPT_AS_XML_REFERENCE = NEO_EDGE___ADAPT_AS_XML_REFERENCE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Predicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___ADAPT_AS_RDF_PREDICATE = NEO_EDGE___ADAPT_AS_RDF_PREDICATE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___ADAPT_AS_NEO_ELEMENT_EDGE = NEO_EDGE___ADAPT_AS_NEO_ELEMENT_EDGE;

	/**
	 * The operation id for the '<em>Adapt As Property Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___ADAPT_AS_PROPERTY_EDGE = NEO_EDGE___ADAPT_AS_PROPERTY_EDGE;

	/**
	 * The operation id for the '<em>In Java Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___IN_JAVA_RETURN_REQUIRED = NEO_EDGE___IN_JAVA_RETURN_REQUIRED;

	/**
	 * The operation id for the '<em>Get Cypher Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___GET_CYPHER_RETURN = NEO_EDGE___GET_CYPHER_RETURN;

	/**
	 * The operation id for the '<em>Set Is Return Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___SET_IS_RETURN_ELEMENT__BOOLEAN = NEO_EDGE___SET_IS_RETURN_ELEMENT__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Return Inner Edge Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE___GET_RETURN_INNER_EDGE_NODES = NEO_EDGE___GET_RETURN_INNER_EDGE_NODES;

	/**
	 * The number of operations of the '<em>Neo Element Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_EDGE_OPERATION_COUNT = NEO_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoPathPartImpl <em>Neo Path Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.impl.NeoPathPartImpl
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoPathPart()
	 * @generated
	 */
	int NEO_PATH_PART = 5;

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
	 * The feature id for the '<em><b>Neo Path Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART__NEO_PATH_PARAM = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neo Complex Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART__NEO_COMPLEX_EDGE = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Neo Path Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

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
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GET_ALL_OPERATORS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_OPERATORS;

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
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___CONTAINS_JAVA_OPERATOR = PatternstructurePackage.PATTERN_ELEMENT___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GENERATE_QUERY_FILTER_PART = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GENERATE_XQUERY_JAVA = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GENERATE_XQUERY_JAVA_RETURN = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GENERATE_XQUERY_JAVA_WHERE = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Get Neo Path Part Edge Leafs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GET_NEO_PATH_PART_EDGE_LEAFS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Cypher Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GET_CYPHER_VARIABLE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Cypher Inner Edge Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GET_CYPHER_INNER_EDGE_NODES__BOOLEAN = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Neo Last Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART___GET_NEO_LAST_EDGE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Neo Path Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PART_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoComplexEdgeImpl <em>Neo Complex Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.impl.NeoComplexEdgeImpl
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoComplexEdge()
	 * @generated
	 */
	int NEO_COMPLEX_EDGE = 3;

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
	 * The feature id for the '<em><b>Neo Path Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE__NEO_PATH_PARAM = NEO_PATH_PART__NEO_PATH_PARAM;

	/**
	 * The feature id for the '<em><b>Neo Complex Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE__NEO_COMPLEX_EDGE = NEO_PATH_PART__NEO_COMPLEX_EDGE;

	/**
	 * The feature id for the '<em><b>Neo Path Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE__NEO_PATH_PARTS = NEO_PATH_PART_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GET_ALL_OPERATORS = NEO_PATH_PART___GET_ALL_OPERATORS;

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
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___CONTAINS_JAVA_OPERATOR = NEO_PATH_PART___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GENERATE_QUERY_FILTER_PART = NEO_PATH_PART___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GENERATE_XQUERY_JAVA = NEO_PATH_PART___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GENERATE_XQUERY_JAVA_RETURN = NEO_PATH_PART___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GENERATE_XQUERY_JAVA_WHERE = NEO_PATH_PART___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Get Neo Path Part Edge Leafs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GET_NEO_PATH_PART_EDGE_LEAFS = NEO_PATH_PART___GET_NEO_PATH_PART_EDGE_LEAFS;

	/**
	 * The operation id for the '<em>Get Cypher Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GET_CYPHER_VARIABLE = NEO_PATH_PART___GET_CYPHER_VARIABLE;

	/**
	 * The operation id for the '<em>Get Cypher Inner Edge Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GET_CYPHER_INNER_EDGE_NODES__BOOLEAN = NEO_PATH_PART___GET_CYPHER_INNER_EDGE_NODES__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Neo Last Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___GET_NEO_LAST_EDGE = NEO_PATH_PART___GET_NEO_LAST_EDGE;

	/**
	 * The operation id for the '<em>Add Neo Path Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___ADD_NEO_PATH_PART__NEOPATHPART = NEO_PATH_PART_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Neo Path Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE___REMOVE_NEO_PATH_PART__NEOPATHPART = NEO_PATH_PART_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Neo Complex Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_COMPLEX_EDGE_OPERATION_COUNT = NEO_PATH_PART_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl <em>Neo Simple Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoSimpleEdge()
	 * @generated
	 */
	int NEO_SIMPLE_EDGE = 4;

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
	 * The feature id for the '<em><b>Neo Path Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE__NEO_PATH_PARAM = NEO_PATH_PART__NEO_PATH_PARAM;

	/**
	 * The feature id for the '<em><b>Neo Complex Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE__NEO_COMPLEX_EDGE = NEO_PATH_PART__NEO_COMPLEX_EDGE;

	/**
	 * The feature id for the '<em><b>Key Value Param</b></em>' containment reference.
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
	 * The feature id for the '<em><b>Neo Target Node Labels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS = NEO_PATH_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Neo Edge Label</b></em>' containment reference.
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
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GET_ALL_OPERATORS = NEO_PATH_PART___GET_ALL_OPERATORS;

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
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___CONTAINS_JAVA_OPERATOR = NEO_PATH_PART___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GENERATE_QUERY_FILTER_PART = NEO_PATH_PART___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GENERATE_XQUERY_JAVA = NEO_PATH_PART___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GENERATE_XQUERY_JAVA_RETURN = NEO_PATH_PART___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GENERATE_XQUERY_JAVA_WHERE = NEO_PATH_PART___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Get Neo Path Part Edge Leafs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GET_NEO_PATH_PART_EDGE_LEAFS = NEO_PATH_PART___GET_NEO_PATH_PART_EDGE_LEAFS;

	/**
	 * The operation id for the '<em>Get Cypher Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GET_CYPHER_VARIABLE = NEO_PATH_PART___GET_CYPHER_VARIABLE;

	/**
	 * The operation id for the '<em>Get Cypher Inner Edge Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GET_CYPHER_INNER_EDGE_NODES__BOOLEAN = NEO_PATH_PART___GET_CYPHER_INNER_EDGE_NODES__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Neo Last Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___GET_NEO_LAST_EDGE = NEO_PATH_PART___GET_NEO_LAST_EDGE;

	/**
	 * The operation id for the '<em>Set Neo Direction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___SET_NEO_DIRECTION__NEODIRECTION = NEO_PATH_PART_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Neo Target Node Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_SIMPLE_EDGE___ADD_NEO_TARGET_NODE_LABEL__STRING = NEO_PATH_PART_OPERATION_COUNT + 1;

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
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoPropertyNodeImpl <em>Neo Property Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.impl.NeoPropertyNodeImpl
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoPropertyNode()
	 * @generated
	 */
	int NEO_PROPERTY_NODE = 6;

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
	 * The feature id for the '<em><b>String Length</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__STRING_LENGTH = GraphstructurePackage.PRIMITIVE_NODE__STRING_LENGTH;

	/**
	 * The feature id for the '<em><b>One Arg Java Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__ONE_ARG_JAVA_OPERATOR = GraphstructurePackage.PRIMITIVE_NODE__ONE_ARG_JAVA_OPERATOR;

	/**
	 * The feature id for the '<em><b>Two Arg Java Operator1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__TWO_ARG_JAVA_OPERATOR1 = GraphstructurePackage.PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR1;

	/**
	 * The feature id for the '<em><b>Two Arg Java Operator2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE__TWO_ARG_JAVA_OPERATOR2 = GraphstructurePackage.PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR2;

	/**
	 * The number of structural features of the '<em>Neo Property Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE_FEATURE_COUNT = GraphstructurePackage.PRIMITIVE_NODE_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_ALL_OPERATORS = GraphstructurePackage.PRIMITIVE_NODE___GET_ALL_OPERATORS;

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
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___CONTAINS_JAVA_OPERATOR = GraphstructurePackage.PRIMITIVE_NODE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GENERATE_QUERY_FILTER_PART = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GENERATE_XQUERY_JAVA = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GENERATE_XQUERY_JAVA_RETURN = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GENERATE_XQUERY_JAVA_WHERE = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_XQUERY_JAVA_WHERE;

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
	int NEO_PROPERTY_NODE___ADD_OUTGOING__GRAPH = GraphstructurePackage.PRIMITIVE_NODE___ADD_OUTGOING__GRAPH;

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
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_PRIMITIVE_STRING_LENGTH = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_STRING_LENGTH;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE;

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
	 * The operation id for the '<em>Add Primitive Validate Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADD_PRIMITIVE_VALIDATE_LINK = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_VALIDATE_LINK;

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
	 * The operation id for the '<em>Adapt As Neo Element Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADAPT_AS_NEO_ELEMENT_NODE = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_NEO_ELEMENT_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Property Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___ADAPT_AS_NEO_PROPERTY_NODE = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_NEO_PROPERTY_NODE;

	/**
	 * The operation id for the '<em>In Java Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___IN_JAVA_RETURN_REQUIRED = GraphstructurePackage.PRIMITIVE_NODE___IN_JAVA_RETURN_REQUIRED;

	/**
	 * The operation id for the '<em>In Java Graph Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___IN_JAVA_GRAPH_RETURN_REQUIRED = GraphstructurePackage.PRIMITIVE_NODE___IN_JAVA_GRAPH_RETURN_REQUIRED;

	/**
	 * The operation id for the '<em>In Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___IN_JAVA_WHERE = GraphstructurePackage.PRIMITIVE_NODE___IN_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___CHECK_COMPARISON_CONSISTENCY__PARAMETERVALUE = GraphstructurePackage.PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Get Cypher Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_CYPHER_RETURN = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Cypher Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GET_CYPHER_VARIABLE = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Cypher Property Addressing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE___GENERATE_CYPHER_PROPERTY_ADDRESSING = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Neo Property Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NODE_OPERATION_COUNT = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoPathParamImpl <em>Neo Path Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.impl.NeoPathParamImpl
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoPathParam()
	 * @generated
	 */
	int NEO_PATH_PARAM = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM__ID = ParametersPackage.PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM__INTERNAL_ID = ParametersPackage.PARAMETER__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM__PARAMETER_LIST = ParametersPackage.PARAMETER__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM__PREDEFINED = ParametersPackage.PARAMETER__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM__PARAMETER_REFERENCES = ParametersPackage.PARAMETER__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM__DESCRIPTION = ParametersPackage.PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Neo Path Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM__NEO_PATH_PART = ParametersPackage.PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neo Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM_FEATURE_COUNT = ParametersPackage.PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___IS_VALID__ABSTRACTIONLEVEL = ParametersPackage.PARAMETER___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = ParametersPackage.PARAMETER___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___MY_TO_STRING = ParametersPackage.PARAMETER___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GENERATE_CYPHER = ParametersPackage.PARAMETER___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GENERATE_XQUERY = ParametersPackage.PARAMETER___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GENERATE_SPARQL = ParametersPackage.PARAMETER___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_CONTAINER = ParametersPackage.PARAMETER___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_ANCESTOR__CLASS = ParametersPackage.PARAMETER___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___INITIALIZE_TRANSLATION = ParametersPackage.PARAMETER___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___PREPARE_TRANSLATION = ParametersPackage.PARAMETER___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_OPERATOR_LIST = ParametersPackage.PARAMETER___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_ALL_OPERATORS = ParametersPackage.PARAMETER___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_PARAMETER_LIST = ParametersPackage.PARAMETER___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_ALL_PARAMETERS = ParametersPackage.PARAMETER___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___PREPARE_PARAMETER_UPDATES = ParametersPackage.PARAMETER___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = ParametersPackage.PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = ParametersPackage.PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = ParametersPackage.PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___RECORD_VALUES__XMLDATADATABASE = ParametersPackage.PARAMETER___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___RELATIONS_XML_ADAPTED = ParametersPackage.PARAMETER___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___CREATE_XML_ADAPTION = ParametersPackage.PARAMETER___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___CREATE_RDF_ADAPTION = ParametersPackage.PARAMETER___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___CREATE_NEO4J_ADAPTION = ParametersPackage.PARAMETER___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___CONTAINS_JAVA_OPERATOR = ParametersPackage.PARAMETER___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GENERATE_QUERY_FILTER_PART = ParametersPackage.PARAMETER___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GENERATE_XQUERY_JAVA = ParametersPackage.PARAMETER___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GENERATE_XQUERY_JAVA_RETURN = ParametersPackage.PARAMETER___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GENERATE_XQUERY_JAVA_WHERE = ParametersPackage.PARAMETER___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = ParametersPackage.PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___VALIDATE_AGAINST_SCHEMA = ParametersPackage.PARAMETER___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = ParametersPackage.PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___INPUT_IS_VALID = ParametersPackage.PARAMETER___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___IS_USED = ParametersPackage.PARAMETER___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___SET_VALUE_FROM_STRING__STRING = ParametersPackage.PARAMETER___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_VALUE_AS_STRING = ParametersPackage.PARAMETER___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY = ParametersPackage.PARAMETER___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_OPTIONS_AS_STRING_LIST = ParametersPackage.PARAMETER___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GENERATE_DESCRIPTION = ParametersPackage.PARAMETER___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___CREATE_PARAMETERS = ParametersPackage.PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = ParametersPackage.PARAMETER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Return Inner Edge Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_RETURN_INNER_EDGE_NODES = ParametersPackage.PARAMETER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Cypher Return Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM___GET_CYPHER_RETURN_VARIABLE = ParametersPackage.PARAMETER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Neo Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PATH_PARAM_OPERATION_COUNT = ParametersPackage.PARAMETER_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoElementPathParamImpl <em>Neo Element Path Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.impl.NeoElementPathParamImpl
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoElementPathParam()
	 * @generated
	 */
	int NEO_ELEMENT_PATH_PARAM = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM__ID = NEO_PATH_PARAM__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM__INTERNAL_ID = NEO_PATH_PARAM__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM__PARAMETER_LIST = NEO_PATH_PARAM__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM__PREDEFINED = NEO_PATH_PARAM__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM__PARAMETER_REFERENCES = NEO_PATH_PARAM__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM__DESCRIPTION = NEO_PATH_PARAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Neo Path Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM__NEO_PATH_PART = NEO_PATH_PARAM__NEO_PATH_PART;

	/**
	 * The feature id for the '<em><b>Neo Element Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM__NEO_ELEMENT_EDGE = NEO_PATH_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neo Element Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM_FEATURE_COUNT = NEO_PATH_PARAM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___IS_VALID__ABSTRACTIONLEVEL = NEO_PATH_PARAM___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = NEO_PATH_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___MY_TO_STRING = NEO_PATH_PARAM___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GENERATE_CYPHER = NEO_PATH_PARAM___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GENERATE_XQUERY = NEO_PATH_PARAM___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GENERATE_SPARQL = NEO_PATH_PARAM___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GET_CONTAINER = NEO_PATH_PARAM___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GET_ANCESTOR__CLASS = NEO_PATH_PARAM___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___INITIALIZE_TRANSLATION = NEO_PATH_PARAM___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___PREPARE_TRANSLATION = NEO_PATH_PARAM___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GET_OPERATOR_LIST = NEO_PATH_PARAM___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GET_ALL_OPERATORS = NEO_PATH_PARAM___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GET_PARAMETER_LIST = NEO_PATH_PARAM___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GET_ALL_PARAMETERS = NEO_PATH_PARAM___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___PREPARE_PARAMETER_UPDATES = NEO_PATH_PARAM___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = NEO_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = NEO_PATH_PARAM___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = NEO_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___RECORD_VALUES__XMLDATADATABASE = NEO_PATH_PARAM___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___RELATIONS_XML_ADAPTED = NEO_PATH_PARAM___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___CREATE_XML_ADAPTION = NEO_PATH_PARAM___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___CREATE_RDF_ADAPTION = NEO_PATH_PARAM___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___CREATE_NEO4J_ADAPTION = NEO_PATH_PARAM___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___CONTAINS_JAVA_OPERATOR = NEO_PATH_PARAM___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GENERATE_QUERY_FILTER_PART = NEO_PATH_PARAM___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GENERATE_XQUERY_JAVA = NEO_PATH_PARAM___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GENERATE_XQUERY_JAVA_RETURN = NEO_PATH_PARAM___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GENERATE_XQUERY_JAVA_WHERE = NEO_PATH_PARAM___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = NEO_PATH_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___VALIDATE_AGAINST_SCHEMA = NEO_PATH_PARAM___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = NEO_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___INPUT_IS_VALID = NEO_PATH_PARAM___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___IS_USED = NEO_PATH_PARAM___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___SET_VALUE_FROM_STRING__STRING = NEO_PATH_PARAM___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GET_VALUE_AS_STRING = NEO_PATH_PARAM___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY = NEO_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GET_OPTIONS_AS_STRING_LIST = NEO_PATH_PARAM___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GENERATE_DESCRIPTION = NEO_PATH_PARAM___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___CREATE_PARAMETERS = NEO_PATH_PARAM___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = NEO_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Return Inner Edge Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GET_RETURN_INNER_EDGE_NODES = NEO_PATH_PARAM___GET_RETURN_INNER_EDGE_NODES;

	/**
	 * The operation id for the '<em>Get Cypher Return Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM___GET_CYPHER_RETURN_VARIABLE = NEO_PATH_PARAM___GET_CYPHER_RETURN_VARIABLE;

	/**
	 * The number of operations of the '<em>Neo Element Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_ELEMENT_PATH_PARAM_OPERATION_COUNT = NEO_PATH_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoPropertyPathParamImpl <em>Neo Property Path Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.impl.NeoPropertyPathParamImpl
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoPropertyPathParam()
	 * @generated
	 */
	int NEO_PROPERTY_PATH_PARAM = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__ID = NEO_PATH_PARAM__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__INTERNAL_ID = NEO_PATH_PARAM__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__PARAMETER_LIST = NEO_PATH_PARAM__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__PREDEFINED = NEO_PATH_PARAM__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__PARAMETER_REFERENCES = NEO_PATH_PARAM__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__DESCRIPTION = NEO_PATH_PARAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Neo Path Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__NEO_PATH_PART = NEO_PATH_PARAM__NEO_PATH_PART;

	/**
	 * The feature id for the '<em><b>Neo Property Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE = NEO_PATH_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neo Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME = NEO_PATH_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Neo Property Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM_FEATURE_COUNT = NEO_PATH_PARAM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___IS_VALID__ABSTRACTIONLEVEL = NEO_PATH_PARAM___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = NEO_PATH_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___MY_TO_STRING = NEO_PATH_PARAM___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GENERATE_CYPHER = NEO_PATH_PARAM___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GENERATE_XQUERY = NEO_PATH_PARAM___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GENERATE_SPARQL = NEO_PATH_PARAM___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_CONTAINER = NEO_PATH_PARAM___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_ANCESTOR__CLASS = NEO_PATH_PARAM___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___INITIALIZE_TRANSLATION = NEO_PATH_PARAM___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___PREPARE_TRANSLATION = NEO_PATH_PARAM___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_OPERATOR_LIST = NEO_PATH_PARAM___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_ALL_OPERATORS = NEO_PATH_PARAM___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_PARAMETER_LIST = NEO_PATH_PARAM___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_ALL_PARAMETERS = NEO_PATH_PARAM___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___PREPARE_PARAMETER_UPDATES = NEO_PATH_PARAM___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = NEO_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = NEO_PATH_PARAM___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = NEO_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___RECORD_VALUES__XMLDATADATABASE = NEO_PATH_PARAM___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___RELATIONS_XML_ADAPTED = NEO_PATH_PARAM___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___CREATE_XML_ADAPTION = NEO_PATH_PARAM___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___CREATE_RDF_ADAPTION = NEO_PATH_PARAM___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___CREATE_NEO4J_ADAPTION = NEO_PATH_PARAM___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___CONTAINS_JAVA_OPERATOR = NEO_PATH_PARAM___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GENERATE_QUERY_FILTER_PART = NEO_PATH_PARAM___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GENERATE_XQUERY_JAVA = NEO_PATH_PARAM___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GENERATE_XQUERY_JAVA_RETURN = NEO_PATH_PARAM___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GENERATE_XQUERY_JAVA_WHERE = NEO_PATH_PARAM___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = NEO_PATH_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___VALIDATE_AGAINST_SCHEMA = NEO_PATH_PARAM___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = NEO_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___INPUT_IS_VALID = NEO_PATH_PARAM___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___IS_USED = NEO_PATH_PARAM___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___SET_VALUE_FROM_STRING__STRING = NEO_PATH_PARAM___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_VALUE_AS_STRING = NEO_PATH_PARAM___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY = NEO_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_OPTIONS_AS_STRING_LIST = NEO_PATH_PARAM___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GENERATE_DESCRIPTION = NEO_PATH_PARAM___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___CREATE_PARAMETERS = NEO_PATH_PARAM___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = NEO_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Return Inner Edge Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_RETURN_INNER_EDGE_NODES = NEO_PATH_PARAM___GET_RETURN_INNER_EDGE_NODES;

	/**
	 * The operation id for the '<em>Get Cypher Return Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___GET_CYPHER_RETURN_VARIABLE = NEO_PATH_PARAM___GET_CYPHER_RETURN_VARIABLE;

	/**
	 * The operation id for the '<em>Set Neo Property Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM___SET_NEO_PROPERTY_NAME__STRING = NEO_PATH_PARAM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Neo Property Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_PATH_PARAM_OPERATION_COUNT = NEO_PATH_PARAM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoPropertyEdgeImpl <em>Neo Property Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.impl.NeoPropertyEdgeImpl
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoPropertyEdge()
	 * @generated
	 */
	int NEO_PROPERTY_EDGE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__ID = NEO_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__INTERNAL_ID = NEO_EDGE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__GRAPH = NEO_EDGE__GRAPH;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__SOURCE = NEO_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__TARGET = NEO_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__NAME = NEO_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__TRANSLATED = NEO_EDGE__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__PREDICATES_ARE_BEING_TRANSLATED = NEO_EDGE__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Return Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__RETURN_ELEMENT = NEO_EDGE__RETURN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Neo Property Path Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM = NEO_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neo Property Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE_FEATURE_COUNT = NEO_EDGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___VALIDATE__DIAGNOSTICCHAIN_MAP = NEO_EDGE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___IS_VALID__ABSTRACTIONLEVEL = NEO_EDGE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = NEO_EDGE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___MY_TO_STRING = NEO_EDGE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GENERATE_CYPHER = NEO_EDGE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GENERATE_XQUERY = NEO_EDGE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GENERATE_SPARQL = NEO_EDGE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_CONTAINER = NEO_EDGE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_ANCESTOR__CLASS = NEO_EDGE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___INITIALIZE_TRANSLATION = NEO_EDGE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___PREPARE_TRANSLATION = NEO_EDGE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_OPERATOR_LIST = NEO_EDGE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_ALL_OPERATORS = NEO_EDGE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_PARAMETER_LIST = NEO_EDGE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_ALL_PARAMETERS = NEO_EDGE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___PREPARE_PARAMETER_UPDATES = NEO_EDGE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = NEO_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___UPDATE_PARAMETERS__PARAMETERLIST = NEO_EDGE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = NEO_EDGE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___RECORD_VALUES__XMLDATADATABASE = NEO_EDGE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___RELATIONS_XML_ADAPTED = NEO_EDGE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___CREATE_XML_ADAPTION = NEO_EDGE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___CREATE_RDF_ADAPTION = NEO_EDGE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___CREATE_NEO4J_ADAPTION = NEO_EDGE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___CONTAINS_JAVA_OPERATOR = NEO_EDGE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GENERATE_QUERY_FILTER_PART = NEO_EDGE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GENERATE_XQUERY_JAVA = NEO_EDGE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GENERATE_XQUERY_JAVA_RETURN = NEO_EDGE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GENERATE_XQUERY_JAVA_WHERE = NEO_EDGE___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___CREATE_PARAMETERS = NEO_EDGE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = NEO_EDGE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___SET_GRAPH_SIMPLE__GRAPH = NEO_EDGE___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Is Cross Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___IS_CROSS_GRAPH = NEO_EDGE___IS_CROSS_GRAPH;

	/**
	 * The operation id for the '<em>Adapt As Xml Element Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___ADAPT_AS_XML_ELEMENT_NAVIGATION = NEO_EDGE___ADAPT_AS_XML_ELEMENT_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Property Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___ADAPT_AS_XML_PROPERTY_NAVIGATION = NEO_EDGE___ADAPT_AS_XML_PROPERTY_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___ADAPT_AS_XML_REFERENCE = NEO_EDGE___ADAPT_AS_XML_REFERENCE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Predicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___ADAPT_AS_RDF_PREDICATE = NEO_EDGE___ADAPT_AS_RDF_PREDICATE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___ADAPT_AS_NEO_ELEMENT_EDGE = NEO_EDGE___ADAPT_AS_NEO_ELEMENT_EDGE;

	/**
	 * The operation id for the '<em>Adapt As Property Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___ADAPT_AS_PROPERTY_EDGE = NEO_EDGE___ADAPT_AS_PROPERTY_EDGE;

	/**
	 * The operation id for the '<em>In Java Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___IN_JAVA_RETURN_REQUIRED = NEO_EDGE___IN_JAVA_RETURN_REQUIRED;

	/**
	 * The operation id for the '<em>Get Cypher Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_CYPHER_RETURN = NEO_EDGE___GET_CYPHER_RETURN;

	/**
	 * The operation id for the '<em>Set Is Return Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___SET_IS_RETURN_ELEMENT__BOOLEAN = NEO_EDGE___SET_IS_RETURN_ELEMENT__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Return Inner Edge Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_RETURN_INNER_EDGE_NODES = NEO_EDGE___GET_RETURN_INNER_EDGE_NODES;

	/**
	 * The operation id for the '<em>Generate Cypher Property Addressing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GENERATE_CYPHER_PROPERTY_ADDRESSING = NEO_EDGE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Cypher Node Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE___GET_CYPHER_NODE_VARIABLE = NEO_EDGE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Neo Property Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_EDGE_OPERATION_COUNT = NEO_EDGE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoNodeLabelsParamImpl <em>Neo Node Labels Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.impl.NeoNodeLabelsParamImpl
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoNodeLabelsParam()
	 * @generated
	 */
	int NEO_NODE_LABELS_PARAM = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM__ID = ParametersPackage.TEXT_LIST_PARAM__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM__INTERNAL_ID = ParametersPackage.TEXT_LIST_PARAM__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM__PARAMETER_LIST = ParametersPackage.TEXT_LIST_PARAM__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM__PREDEFINED = ParametersPackage.TEXT_LIST_PARAM__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM__PARAMETER_REFERENCES = ParametersPackage.TEXT_LIST_PARAM__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM__DESCRIPTION = ParametersPackage.TEXT_LIST_PARAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM__COMPARISON1 = ParametersPackage.TEXT_LIST_PARAM__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM__COMPARISON2 = ParametersPackage.TEXT_LIST_PARAM__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM__TYPE_MODIFIABLE = ParametersPackage.TEXT_LIST_PARAM__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM__VALUES = ParametersPackage.TEXT_LIST_PARAM__VALUES;

	/**
	 * The number of structural features of the '<em>Neo Node Labels Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM_FEATURE_COUNT = ParametersPackage.TEXT_LIST_PARAM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___IS_VALID__ABSTRACTIONLEVEL = ParametersPackage.TEXT_LIST_PARAM___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = ParametersPackage.TEXT_LIST_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___MY_TO_STRING = ParametersPackage.TEXT_LIST_PARAM___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GENERATE_CYPHER = ParametersPackage.TEXT_LIST_PARAM___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GENERATE_XQUERY = ParametersPackage.TEXT_LIST_PARAM___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GENERATE_SPARQL = ParametersPackage.TEXT_LIST_PARAM___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_CONTAINER = ParametersPackage.TEXT_LIST_PARAM___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_ANCESTOR__CLASS = ParametersPackage.TEXT_LIST_PARAM___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___INITIALIZE_TRANSLATION = ParametersPackage.TEXT_LIST_PARAM___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___PREPARE_TRANSLATION = ParametersPackage.TEXT_LIST_PARAM___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_OPERATOR_LIST = ParametersPackage.TEXT_LIST_PARAM___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_ALL_OPERATORS = ParametersPackage.TEXT_LIST_PARAM___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_PARAMETER_LIST = ParametersPackage.TEXT_LIST_PARAM___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_ALL_PARAMETERS = ParametersPackage.TEXT_LIST_PARAM___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___PREPARE_PARAMETER_UPDATES = ParametersPackage.TEXT_LIST_PARAM___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = ParametersPackage.TEXT_LIST_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = ParametersPackage.TEXT_LIST_PARAM___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = ParametersPackage.TEXT_LIST_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___RECORD_VALUES__XMLDATADATABASE = ParametersPackage.TEXT_LIST_PARAM___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___RELATIONS_XML_ADAPTED = ParametersPackage.TEXT_LIST_PARAM___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___CREATE_XML_ADAPTION = ParametersPackage.TEXT_LIST_PARAM___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___CREATE_RDF_ADAPTION = ParametersPackage.TEXT_LIST_PARAM___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___CREATE_NEO4J_ADAPTION = ParametersPackage.TEXT_LIST_PARAM___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___CONTAINS_JAVA_OPERATOR = ParametersPackage.TEXT_LIST_PARAM___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GENERATE_QUERY_FILTER_PART = ParametersPackage.TEXT_LIST_PARAM___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GENERATE_XQUERY_JAVA = ParametersPackage.TEXT_LIST_PARAM___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GENERATE_XQUERY_JAVA_RETURN = ParametersPackage.TEXT_LIST_PARAM___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GENERATE_XQUERY_JAVA_WHERE = ParametersPackage.TEXT_LIST_PARAM___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___VALIDATE_AGAINST_SCHEMA = ParametersPackage.TEXT_LIST_PARAM___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = ParametersPackage.TEXT_LIST_PARAM___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___INPUT_IS_VALID = ParametersPackage.TEXT_LIST_PARAM___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___IS_USED = ParametersPackage.TEXT_LIST_PARAM___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___SET_VALUE_FROM_STRING__STRING = ParametersPackage.TEXT_LIST_PARAM___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_VALUE_AS_STRING = ParametersPackage.TEXT_LIST_PARAM___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___CHECK_COMPARISON_CONSISTENCY = ParametersPackage.TEXT_LIST_PARAM___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_OPTIONS_AS_STRING_LIST = ParametersPackage.TEXT_LIST_PARAM___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GENERATE_DESCRIPTION = ParametersPackage.TEXT_LIST_PARAM___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = ParametersPackage.TEXT_LIST_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_RETURN_TYPE = ParametersPackage.TEXT_LIST_PARAM___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___IS_TRANSLATABLE = ParametersPackage.TEXT_LIST_PARAM___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_ALL_ARGUMENT_ELEMENTS = ParametersPackage.TEXT_LIST_PARAM___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___IS_OPERATOR_ARGUMENT = ParametersPackage.TEXT_LIST_PARAM___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___REPLACE__PARAMETERVALUE = ParametersPackage.TEXT_LIST_PARAM___REPLACE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___REPLACE_VIA_VALUE__STRING_STRING = ParametersPackage.TEXT_LIST_PARAM___REPLACE_VIA_VALUE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_ELEMENT_TAGS = ParametersPackage.TEXT_LIST_PARAM___GET_ELEMENT_TAGS;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_DATA_VALUES = ParametersPackage.TEXT_LIST_PARAM___GET_DATA_VALUES;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___IS_IN_DATA_COMPARISON = ParametersPackage.TEXT_LIST_PARAM___IS_IN_DATA_COMPARISON;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___IS_IN_TAG_COMPARISON = ParametersPackage.TEXT_LIST_PARAM___IS_IN_TAG_COMPARISON;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_ATTRIBUTE_NAMES = ParametersPackage.TEXT_LIST_PARAM___GET_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_ATTRIBUTE_VALUES = ParametersPackage.TEXT_LIST_PARAM___GET_ATTRIBUTE_VALUES;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___IS_IN_ATTRIBUTE_COMPARISON = ParametersPackage.TEXT_LIST_PARAM___IS_IN_ATTRIBUTE_COMPARISON;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_SUGGESTIONS = ParametersPackage.TEXT_LIST_PARAM___GET_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___INFER_SUGGESTIONS = ParametersPackage.TEXT_LIST_PARAM___INFER_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Set Value If Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___SET_VALUE_IF_VALID__ELIST = ParametersPackage.TEXT_LIST_PARAM___SET_VALUE_IF_VALID__ELIST;

	/**
	 * The operation id for the '<em>Get List Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_LIST_VAR = ParametersPackage.TEXT_LIST_PARAM___GET_LIST_VAR;

	/**
	 * The operation id for the '<em>Get List Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___GET_LIST_DECLARATION = ParametersPackage.TEXT_LIST_PARAM___GET_LIST_DECLARATION;

	/**
	 * The operation id for the '<em>Add String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM___ADD_STRING_VALUE__STRING = ParametersPackage.TEXT_LIST_PARAM___ADD_STRING_VALUE__STRING;

	/**
	 * The number of operations of the '<em>Neo Node Labels Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_NODE_LABELS_PARAM_OPERATION_COUNT = ParametersPackage.TEXT_LIST_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoEdgeLabelParamImpl <em>Neo Edge Label Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.impl.NeoEdgeLabelParamImpl
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoEdgeLabelParam()
	 * @generated
	 */
	int NEO_EDGE_LABEL_PARAM = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM__ID = ParametersPackage.TEXT_LITERAL_PARAM__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM__INTERNAL_ID = ParametersPackage.TEXT_LITERAL_PARAM__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM__PARAMETER_LIST = ParametersPackage.TEXT_LITERAL_PARAM__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM__PREDEFINED = ParametersPackage.TEXT_LITERAL_PARAM__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM__PARAMETER_REFERENCES = ParametersPackage.TEXT_LITERAL_PARAM__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM__DESCRIPTION = ParametersPackage.TEXT_LITERAL_PARAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM__COMPARISON1 = ParametersPackage.TEXT_LITERAL_PARAM__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM__COMPARISON2 = ParametersPackage.TEXT_LITERAL_PARAM__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM__TYPE_MODIFIABLE = ParametersPackage.TEXT_LITERAL_PARAM__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM__VALUE = ParametersPackage.TEXT_LITERAL_PARAM__VALUE;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM__MATCHES = ParametersPackage.TEXT_LITERAL_PARAM__MATCHES;

	/**
	 * The feature id for the '<em><b>Xml Property Option Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM__XML_PROPERTY_OPTION_PARAM = ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM;

	/**
	 * The feature id for the '<em><b>Xml Axis Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM__XML_AXIS_PART = ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM__CONTAINS = ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS;

	/**
	 * The number of structural features of the '<em>Neo Edge Label Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM_FEATURE_COUNT = ParametersPackage.TEXT_LITERAL_PARAM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___IS_VALID__ABSTRACTIONLEVEL = ParametersPackage.TEXT_LITERAL_PARAM___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = ParametersPackage.TEXT_LITERAL_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___MY_TO_STRING = ParametersPackage.TEXT_LITERAL_PARAM___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GENERATE_CYPHER = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GENERATE_XQUERY = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GENERATE_SPARQL = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GET_CONTAINER = ParametersPackage.TEXT_LITERAL_PARAM___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GET_ANCESTOR__CLASS = ParametersPackage.TEXT_LITERAL_PARAM___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___INITIALIZE_TRANSLATION = ParametersPackage.TEXT_LITERAL_PARAM___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___PREPARE_TRANSLATION = ParametersPackage.TEXT_LITERAL_PARAM___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GET_OPERATOR_LIST = ParametersPackage.TEXT_LITERAL_PARAM___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GET_ALL_OPERATORS = ParametersPackage.TEXT_LITERAL_PARAM___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GET_PARAMETER_LIST = ParametersPackage.TEXT_LITERAL_PARAM___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GET_ALL_PARAMETERS = ParametersPackage.TEXT_LITERAL_PARAM___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___PREPARE_PARAMETER_UPDATES = ParametersPackage.TEXT_LITERAL_PARAM___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = ParametersPackage.TEXT_LITERAL_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = ParametersPackage.TEXT_LITERAL_PARAM___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = ParametersPackage.TEXT_LITERAL_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___RECORD_VALUES__XMLDATADATABASE = ParametersPackage.TEXT_LITERAL_PARAM___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___RELATIONS_XML_ADAPTED = ParametersPackage.TEXT_LITERAL_PARAM___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___CREATE_XML_ADAPTION = ParametersPackage.TEXT_LITERAL_PARAM___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___CREATE_RDF_ADAPTION = ParametersPackage.TEXT_LITERAL_PARAM___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___CREATE_NEO4J_ADAPTION = ParametersPackage.TEXT_LITERAL_PARAM___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___CONTAINS_JAVA_OPERATOR = ParametersPackage.TEXT_LITERAL_PARAM___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GENERATE_QUERY_FILTER_PART = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GENERATE_XQUERY_JAVA = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GENERATE_XQUERY_JAVA_RETURN = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GENERATE_XQUERY_JAVA_WHERE = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___VALIDATE_AGAINST_SCHEMA = ParametersPackage.TEXT_LITERAL_PARAM___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = ParametersPackage.TEXT_LITERAL_PARAM___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___INPUT_IS_VALID = ParametersPackage.TEXT_LITERAL_PARAM___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___IS_USED = ParametersPackage.TEXT_LITERAL_PARAM___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___SET_VALUE_FROM_STRING__STRING = ParametersPackage.TEXT_LITERAL_PARAM___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GET_VALUE_AS_STRING = ParametersPackage.TEXT_LITERAL_PARAM___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___CHECK_COMPARISON_CONSISTENCY = ParametersPackage.TEXT_LITERAL_PARAM___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GET_OPTIONS_AS_STRING_LIST = ParametersPackage.TEXT_LITERAL_PARAM___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GENERATE_DESCRIPTION = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = ParametersPackage.TEXT_LITERAL_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GET_RETURN_TYPE = ParametersPackage.TEXT_LITERAL_PARAM___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___IS_TRANSLATABLE = ParametersPackage.TEXT_LITERAL_PARAM___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GET_ALL_ARGUMENT_ELEMENTS = ParametersPackage.TEXT_LITERAL_PARAM___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___IS_OPERATOR_ARGUMENT = ParametersPackage.TEXT_LITERAL_PARAM___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___REPLACE__PARAMETERVALUE = ParametersPackage.TEXT_LITERAL_PARAM___REPLACE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___REPLACE_VIA_VALUE__STRING_STRING = ParametersPackage.TEXT_LITERAL_PARAM___REPLACE_VIA_VALUE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GET_ELEMENT_TAGS = ParametersPackage.TEXT_LITERAL_PARAM___GET_ELEMENT_TAGS;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GET_DATA_VALUES = ParametersPackage.TEXT_LITERAL_PARAM___GET_DATA_VALUES;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___IS_IN_DATA_COMPARISON = ParametersPackage.TEXT_LITERAL_PARAM___IS_IN_DATA_COMPARISON;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___IS_IN_TAG_COMPARISON = ParametersPackage.TEXT_LITERAL_PARAM___IS_IN_TAG_COMPARISON;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GET_ATTRIBUTE_NAMES = ParametersPackage.TEXT_LITERAL_PARAM___GET_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GET_ATTRIBUTE_VALUES = ParametersPackage.TEXT_LITERAL_PARAM___GET_ATTRIBUTE_VALUES;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___IS_IN_ATTRIBUTE_COMPARISON = ParametersPackage.TEXT_LITERAL_PARAM___IS_IN_ATTRIBUTE_COMPARISON;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___GET_SUGGESTIONS = ParametersPackage.TEXT_LITERAL_PARAM___GET_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___INFER_SUGGESTIONS = ParametersPackage.TEXT_LITERAL_PARAM___INFER_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Set Value If Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM___SET_VALUE_IF_VALID__STRING = ParametersPackage.TEXT_LITERAL_PARAM___SET_VALUE_IF_VALID__STRING;

	/**
	 * The number of operations of the '<em>Neo Edge Label Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_EDGE_LABEL_PARAM_OPERATION_COUNT = ParametersPackage.TEXT_LITERAL_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.NeoLabel <em>Neo Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.NeoLabel
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoLabel()
	 * @generated
	 */
	int NEO_LABEL = 15;

	/**
	 * The number of structural features of the '<em>Neo Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_LABEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Neo Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoPropertyNameParamImpl <em>Neo Property Name Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.impl.NeoPropertyNameParamImpl
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoPropertyNameParam()
	 * @generated
	 */
	int NEO_PROPERTY_NAME_PARAM = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM__ID = ParametersPackage.TEXT_LITERAL_PARAM__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM__INTERNAL_ID = ParametersPackage.TEXT_LITERAL_PARAM__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM__PARAMETER_LIST = ParametersPackage.TEXT_LITERAL_PARAM__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM__PREDEFINED = ParametersPackage.TEXT_LITERAL_PARAM__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM__PARAMETER_REFERENCES = ParametersPackage.TEXT_LITERAL_PARAM__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM__DESCRIPTION = ParametersPackage.TEXT_LITERAL_PARAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM__COMPARISON1 = ParametersPackage.TEXT_LITERAL_PARAM__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM__COMPARISON2 = ParametersPackage.TEXT_LITERAL_PARAM__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM__TYPE_MODIFIABLE = ParametersPackage.TEXT_LITERAL_PARAM__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM__VALUE = ParametersPackage.TEXT_LITERAL_PARAM__VALUE;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM__MATCHES = ParametersPackage.TEXT_LITERAL_PARAM__MATCHES;

	/**
	 * The feature id for the '<em><b>Xml Property Option Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM__XML_PROPERTY_OPTION_PARAM = ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM;

	/**
	 * The feature id for the '<em><b>Xml Axis Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM__XML_AXIS_PART = ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM__CONTAINS = ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS;

	/**
	 * The number of structural features of the '<em>Neo Property Name Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM_FEATURE_COUNT = ParametersPackage.TEXT_LITERAL_PARAM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___IS_VALID__ABSTRACTIONLEVEL = ParametersPackage.TEXT_LITERAL_PARAM___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = ParametersPackage.TEXT_LITERAL_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___MY_TO_STRING = ParametersPackage.TEXT_LITERAL_PARAM___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GENERATE_CYPHER = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GENERATE_XQUERY = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GENERATE_SPARQL = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GET_CONTAINER = ParametersPackage.TEXT_LITERAL_PARAM___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GET_ANCESTOR__CLASS = ParametersPackage.TEXT_LITERAL_PARAM___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___INITIALIZE_TRANSLATION = ParametersPackage.TEXT_LITERAL_PARAM___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___PREPARE_TRANSLATION = ParametersPackage.TEXT_LITERAL_PARAM___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GET_OPERATOR_LIST = ParametersPackage.TEXT_LITERAL_PARAM___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GET_ALL_OPERATORS = ParametersPackage.TEXT_LITERAL_PARAM___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GET_PARAMETER_LIST = ParametersPackage.TEXT_LITERAL_PARAM___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GET_ALL_PARAMETERS = ParametersPackage.TEXT_LITERAL_PARAM___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___PREPARE_PARAMETER_UPDATES = ParametersPackage.TEXT_LITERAL_PARAM___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = ParametersPackage.TEXT_LITERAL_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = ParametersPackage.TEXT_LITERAL_PARAM___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = ParametersPackage.TEXT_LITERAL_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___RECORD_VALUES__XMLDATADATABASE = ParametersPackage.TEXT_LITERAL_PARAM___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___RELATIONS_XML_ADAPTED = ParametersPackage.TEXT_LITERAL_PARAM___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___CREATE_XML_ADAPTION = ParametersPackage.TEXT_LITERAL_PARAM___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___CREATE_RDF_ADAPTION = ParametersPackage.TEXT_LITERAL_PARAM___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___CREATE_NEO4J_ADAPTION = ParametersPackage.TEXT_LITERAL_PARAM___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___CONTAINS_JAVA_OPERATOR = ParametersPackage.TEXT_LITERAL_PARAM___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GENERATE_QUERY_FILTER_PART = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GENERATE_XQUERY_JAVA = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GENERATE_XQUERY_JAVA_RETURN = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate XQuery Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GENERATE_XQUERY_JAVA_WHERE = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_XQUERY_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___VALIDATE_AGAINST_SCHEMA = ParametersPackage.TEXT_LITERAL_PARAM___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = ParametersPackage.TEXT_LITERAL_PARAM___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___INPUT_IS_VALID = ParametersPackage.TEXT_LITERAL_PARAM___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___IS_USED = ParametersPackage.TEXT_LITERAL_PARAM___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___SET_VALUE_FROM_STRING__STRING = ParametersPackage.TEXT_LITERAL_PARAM___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GET_VALUE_AS_STRING = ParametersPackage.TEXT_LITERAL_PARAM___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___CHECK_COMPARISON_CONSISTENCY = ParametersPackage.TEXT_LITERAL_PARAM___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GET_OPTIONS_AS_STRING_LIST = ParametersPackage.TEXT_LITERAL_PARAM___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GENERATE_DESCRIPTION = ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = ParametersPackage.TEXT_LITERAL_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GET_RETURN_TYPE = ParametersPackage.TEXT_LITERAL_PARAM___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___IS_TRANSLATABLE = ParametersPackage.TEXT_LITERAL_PARAM___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GET_ALL_ARGUMENT_ELEMENTS = ParametersPackage.TEXT_LITERAL_PARAM___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___IS_OPERATOR_ARGUMENT = ParametersPackage.TEXT_LITERAL_PARAM___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___REPLACE__PARAMETERVALUE = ParametersPackage.TEXT_LITERAL_PARAM___REPLACE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___REPLACE_VIA_VALUE__STRING_STRING = ParametersPackage.TEXT_LITERAL_PARAM___REPLACE_VIA_VALUE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GET_ELEMENT_TAGS = ParametersPackage.TEXT_LITERAL_PARAM___GET_ELEMENT_TAGS;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GET_DATA_VALUES = ParametersPackage.TEXT_LITERAL_PARAM___GET_DATA_VALUES;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___IS_IN_DATA_COMPARISON = ParametersPackage.TEXT_LITERAL_PARAM___IS_IN_DATA_COMPARISON;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___IS_IN_TAG_COMPARISON = ParametersPackage.TEXT_LITERAL_PARAM___IS_IN_TAG_COMPARISON;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GET_ATTRIBUTE_NAMES = ParametersPackage.TEXT_LITERAL_PARAM___GET_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GET_ATTRIBUTE_VALUES = ParametersPackage.TEXT_LITERAL_PARAM___GET_ATTRIBUTE_VALUES;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___IS_IN_ATTRIBUTE_COMPARISON = ParametersPackage.TEXT_LITERAL_PARAM___IS_IN_ATTRIBUTE_COMPARISON;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___GET_SUGGESTIONS = ParametersPackage.TEXT_LITERAL_PARAM___GET_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___INFER_SUGGESTIONS = ParametersPackage.TEXT_LITERAL_PARAM___INFER_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Set Value If Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM___SET_VALUE_IF_VALID__STRING = ParametersPackage.TEXT_LITERAL_PARAM___SET_VALUE_IF_VALID__STRING;

	/**
	 * The number of operations of the '<em>Neo Property Name Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO_PROPERTY_NAME_PARAM_OPERATION_COUNT = ParametersPackage.TEXT_LITERAL_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.NeoDirection <em>Neo Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.NeoDirection
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoDirection()
	 * @generated
	 */
	int NEO_DIRECTION = 17;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionneo4j.NeoPlace <em>Neo Place</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionneo4j.NeoPlace
	 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoPlace()
	 * @generated
	 */
	int NEO_PLACE = 18;


	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoNode <em>Neo Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Node</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoNode
	 * @generated
	 */
	EClass getNeoNode();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoNode#getCypherVariable() <em>Get Cypher Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cypher Variable</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoNode#getCypherVariable()
	 * @generated
	 */
	EOperation getNeoNode__GetCypherVariable();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoElementNode <em>Neo Element Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Element Node</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoElementNode
	 * @generated
	 */
	EClass getNeoElementNode();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.adaptionneo4j.NeoElementNode#getNeoNodeLabels <em>Neo Node Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Neo Node Labels</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoElementNode#getNeoNodeLabels()
	 * @see #getNeoElementNode()
	 * @generated
	 */
	EReference getNeoElementNode_NeoNodeLabels();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionneo4j.NeoElementNode#getNeoPlace <em>Neo Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neo Place</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoElementNode#getNeoPlace()
	 * @see #getNeoElementNode()
	 * @generated
	 */
	EAttribute getNeoElementNode_NeoPlace();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionneo4j.NeoElementNode#isIsVariableDistinctInUse <em>Is Variable Distinct In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Variable Distinct In Use</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoElementNode#isIsVariableDistinctInUse()
	 * @see #getNeoElementNode()
	 * @generated
	 */
	EAttribute getNeoElementNode_IsVariableDistinctInUse();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoElementNode#addNeoLabel(java.lang.String) <em>Add Neo Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Neo Label</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoElementNode#addNeoLabel(java.lang.String)
	 * @generated
	 */
	EOperation getNeoElementNode__AddNeoLabel__String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoElementEdge <em>Neo Element Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Element Edge</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoElementEdge
	 * @generated
	 */
	EClass getNeoElementEdge();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionneo4j.NeoElementEdge#getNeoElementPathParam <em>Neo Element Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neo Element Path Param</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoElementEdge#getNeoElementPathParam()
	 * @see #getNeoElementEdge()
	 * @generated
	 */
	EReference getNeoElementEdge_NeoElementPathParam();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoComplexEdge <em>Neo Complex Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Complex Edge</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoComplexEdge
	 * @generated
	 */
	EClass getNeoComplexEdge();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.adaptionneo4j.NeoComplexEdge#getNeoPathParts <em>Neo Path Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Neo Path Parts</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoComplexEdge#getNeoPathParts()
	 * @see #getNeoComplexEdge()
	 * @generated
	 */
	EReference getNeoComplexEdge_NeoPathParts();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoComplexEdge#addNeoPathPart(qualitypatternmodel.adaptionneo4j.NeoPathPart) <em>Add Neo Path Part</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Neo Path Part</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoComplexEdge#addNeoPathPart(qualitypatternmodel.adaptionneo4j.NeoPathPart)
	 * @generated
	 */
	EOperation getNeoComplexEdge__AddNeoPathPart__NeoPathPart();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoComplexEdge#removeNeoPathPart(qualitypatternmodel.adaptionneo4j.NeoPathPart) <em>Remove Neo Path Part</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Neo Path Part</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoComplexEdge#removeNeoPathPart(qualitypatternmodel.adaptionneo4j.NeoPathPart)
	 * @generated
	 */
	EOperation getNeoComplexEdge__RemoveNeoPathPart__NeoPathPart();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge <em>Neo Simple Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Simple Edge</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoSimpleEdge
	 * @generated
	 */
	EClass getNeoSimpleEdge();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getKeyValueParam <em>Key Value Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Value Param</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getKeyValueParam()
	 * @see #getNeoSimpleEdge()
	 * @generated
	 */
	EReference getNeoSimpleEdge_KeyValueParam();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getNeoDirection <em>Neo Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neo Direction</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getNeoDirection()
	 * @see #getNeoSimpleEdge()
	 * @generated
	 */
	EAttribute getNeoSimpleEdge_NeoDirection();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getNeoTargetNodeLabels <em>Neo Target Node Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Neo Target Node Labels</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getNeoTargetNodeLabels()
	 * @see #getNeoSimpleEdge()
	 * @generated
	 */
	EReference getNeoSimpleEdge_NeoTargetNodeLabels();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getNeoEdgeLabel <em>Neo Edge Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Neo Edge Label</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getNeoEdgeLabel()
	 * @see #getNeoSimpleEdge()
	 * @generated
	 */
	EReference getNeoSimpleEdge_NeoEdgeLabel();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getEdgeNumber <em>Edge Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Number</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getEdgeNumber()
	 * @see #getNeoSimpleEdge()
	 * @generated
	 */
	EAttribute getNeoSimpleEdge_EdgeNumber();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#setNeoDirection(qualitypatternmodel.adaptionneo4j.NeoDirection) <em>Set Neo Direction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Neo Direction</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#setNeoDirection(qualitypatternmodel.adaptionneo4j.NeoDirection)
	 * @generated
	 */
	EOperation getNeoSimpleEdge__SetNeoDirection__NeoDirection();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#addNeoTargetNodeLabel(java.lang.String) <em>Add Neo Target Node Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Neo Target Node Label</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#addNeoTargetNodeLabel(java.lang.String)
	 * @generated
	 */
	EOperation getNeoSimpleEdge__AddNeoTargetNodeLabel__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#addNeoEdgeLabel(java.lang.String) <em>Add Neo Edge Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Neo Edge Label</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#addNeoEdgeLabel(java.lang.String)
	 * @generated
	 */
	EOperation getNeoSimpleEdge__AddNeoEdgeLabel__String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoPathPart <em>Neo Path Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Path Part</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathPart
	 * @generated
	 */
	EClass getNeoPathPart();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoPathParam <em>Neo Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Neo Path Param</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoPathParam()
	 * @see #getNeoPathPart()
	 * @generated
	 */
	EReference getNeoPathPart_NeoPathParam();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoComplexEdge <em>Neo Complex Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Neo Complex Edge</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoComplexEdge()
	 * @see #getNeoPathPart()
	 * @generated
	 */
	EReference getNeoPathPart_NeoComplexEdge();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoPathPartEdgeLeafs() <em>Get Neo Path Part Edge Leafs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Neo Path Part Edge Leafs</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoPathPartEdgeLeafs()
	 * @generated
	 */
	EOperation getNeoPathPart__GetNeoPathPartEdgeLeafs();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoPathPart#getCypherVariable() <em>Get Cypher Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cypher Variable</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathPart#getCypherVariable()
	 * @generated
	 */
	EOperation getNeoPathPart__GetCypherVariable();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoPathPart#getCypherInnerEdgeNodes(boolean) <em>Get Cypher Inner Edge Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cypher Inner Edge Nodes</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathPart#getCypherInnerEdgeNodes(boolean)
	 * @generated
	 */
	EOperation getNeoPathPart__GetCypherInnerEdgeNodes__boolean();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoLastEdge() <em>Get Neo Last Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Neo Last Edge</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoLastEdge()
	 * @generated
	 */
	EOperation getNeoPathPart__GetNeoLastEdge();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyNode <em>Neo Property Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Property Node</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyNode
	 * @generated
	 */
	EClass getNeoPropertyNode();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyNode#generateCypherPropertyAddressing() <em>Generate Cypher Property Addressing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Cypher Property Addressing</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyNode#generateCypherPropertyAddressing()
	 * @generated
	 */
	EOperation getNeoPropertyNode__GenerateCypherPropertyAddressing();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoElementPathParam <em>Neo Element Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Element Path Param</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoElementPathParam
	 * @generated
	 */
	EClass getNeoElementPathParam();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionneo4j.NeoElementPathParam#getNeoElementEdge <em>Neo Element Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neo Element Edge</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoElementPathParam#getNeoElementEdge()
	 * @see #getNeoElementPathParam()
	 * @generated
	 */
	EReference getNeoElementPathParam_NeoElementEdge();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam <em>Neo Property Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Property Path Param</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam
	 * @generated
	 */
	EClass getNeoPropertyPathParam();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPropertyEdge <em>Neo Property Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neo Property Edge</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPropertyEdge()
	 * @see #getNeoPropertyPathParam()
	 * @generated
	 */
	EReference getNeoPropertyPathParam_NeoPropertyEdge();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPropertyName <em>Neo Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Neo Property Name</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPropertyName()
	 * @see #getNeoPropertyPathParam()
	 * @generated
	 */
	EReference getNeoPropertyPathParam_NeoPropertyName();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#setNeoPropertyName(java.lang.String) <em>Set Neo Property Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Neo Property Name</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#setNeoPropertyName(java.lang.String)
	 * @generated
	 */
	EOperation getNeoPropertyPathParam__SetNeoPropertyName__String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyEdge <em>Neo Property Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Property Edge</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyEdge
	 * @generated
	 */
	EClass getNeoPropertyEdge();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyEdge#getNeoPropertyPathParam <em>Neo Property Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neo Property Path Param</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyEdge#getNeoPropertyPathParam()
	 * @see #getNeoPropertyEdge()
	 * @generated
	 */
	EReference getNeoPropertyEdge_NeoPropertyPathParam();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyEdge#generateCypherPropertyAddressing() <em>Generate Cypher Property Addressing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Cypher Property Addressing</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyEdge#generateCypherPropertyAddressing()
	 * @generated
	 */
	EOperation getNeoPropertyEdge__GenerateCypherPropertyAddressing();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyEdge#getCypherNodeVariable() <em>Get Cypher Node Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cypher Node Variable</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyEdge#getCypherNodeVariable()
	 * @generated
	 */
	EOperation getNeoPropertyEdge__GetCypherNodeVariable();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoEdge <em>Neo Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Edge</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoEdge
	 * @generated
	 */
	EClass getNeoEdge();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionneo4j.NeoEdge#isReturnElement <em>Return Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Element</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoEdge#isReturnElement()
	 * @see #getNeoEdge()
	 * @generated
	 */
	EAttribute getNeoEdge_ReturnElement();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoEdge#setIsReturnElement(boolean) <em>Set Is Return Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Is Return Element</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoEdge#setIsReturnElement(boolean)
	 * @generated
	 */
	EOperation getNeoEdge__SetIsReturnElement__boolean();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoEdge#getReturnInnerEdgeNodes() <em>Get Return Inner Edge Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Return Inner Edge Nodes</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoEdge#getReturnInnerEdgeNodes()
	 * @generated
	 */
	EOperation getNeoEdge__GetReturnInnerEdgeNodes();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoPathParam <em>Neo Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Path Param</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathParam
	 * @generated
	 */
	EClass getNeoPathParam();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.adaptionneo4j.NeoPathParam#getNeoPathPart <em>Neo Path Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Neo Path Part</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathParam#getNeoPathPart()
	 * @see #getNeoPathParam()
	 * @generated
	 */
	EReference getNeoPathParam_NeoPathPart();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoPathParam#getReturnInnerEdgeNodes() <em>Get Return Inner Edge Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Return Inner Edge Nodes</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathParam#getReturnInnerEdgeNodes()
	 * @generated
	 */
	EOperation getNeoPathParam__GetReturnInnerEdgeNodes();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoPathParam#getCypherReturnVariable() <em>Get Cypher Return Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cypher Return Variable</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathParam#getCypherReturnVariable()
	 * @generated
	 */
	EOperation getNeoPathParam__GetCypherReturnVariable();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoElement <em>Neo Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Element</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoElement
	 * @generated
	 */
	EClass getNeoElement();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionneo4j.NeoElement#getCypherReturn() <em>Get Cypher Return</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cypher Return</em>' operation.
	 * @see qualitypatternmodel.adaptionneo4j.NeoElement#getCypherReturn()
	 * @generated
	 */
	EOperation getNeoElement__GetCypherReturn();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam <em>Neo Node Labels Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Node Labels Param</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam
	 * @generated
	 */
	EClass getNeoNodeLabelsParam();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoEdgeLabelParam <em>Neo Edge Label Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Edge Label Param</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoEdgeLabelParam
	 * @generated
	 */
	EClass getNeoEdgeLabelParam();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoLabel <em>Neo Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Label</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoLabel
	 * @generated
	 */
	EClass getNeoLabel();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyNameParam <em>Neo Property Name Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo Property Name Param</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyNameParam
	 * @generated
	 */
	EClass getNeoPropertyNameParam();

	/**
	 * Returns the meta object for enum '{@link qualitypatternmodel.adaptionneo4j.NeoDirection <em>Neo Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Neo Direction</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoDirection
	 * @generated
	 */
	EEnum getNeoDirection();

	/**
	 * Returns the meta object for enum '{@link qualitypatternmodel.adaptionneo4j.NeoPlace <em>Neo Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Neo Place</em>'.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPlace
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
	Adaptionneo4jFactory getAdaptionneo4jFactory();

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
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.NeoNode <em>Neo Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.NeoNode
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoNode()
		 * @generated
		 */
		EClass NEO_NODE = eINSTANCE.getNeoNode();

		/**
		 * The meta object literal for the '<em><b>Get Cypher Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_NODE___GET_CYPHER_VARIABLE = eINSTANCE.getNeoNode__GetCypherVariable();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoElementNodeImpl <em>Neo Element Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.impl.NeoElementNodeImpl
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoElementNode()
		 * @generated
		 */
		EClass NEO_ELEMENT_NODE = eINSTANCE.getNeoElementNode();

		/**
		 * The meta object literal for the '<em><b>Neo Node Labels</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_ELEMENT_NODE__NEO_NODE_LABELS = eINSTANCE.getNeoElementNode_NeoNodeLabels();

		/**
		 * The meta object literal for the '<em><b>Neo Place</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEO_ELEMENT_NODE__NEO_PLACE = eINSTANCE.getNeoElementNode_NeoPlace();

		/**
		 * The meta object literal for the '<em><b>Is Variable Distinct In Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEO_ELEMENT_NODE__IS_VARIABLE_DISTINCT_IN_USE = eINSTANCE.getNeoElementNode_IsVariableDistinctInUse();

		/**
		 * The meta object literal for the '<em><b>Add Neo Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_ELEMENT_NODE___ADD_NEO_LABEL__STRING = eINSTANCE.getNeoElementNode__AddNeoLabel__String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoElementEdgeImpl <em>Neo Element Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.impl.NeoElementEdgeImpl
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoElementEdge()
		 * @generated
		 */
		EClass NEO_ELEMENT_EDGE = eINSTANCE.getNeoElementEdge();

		/**
		 * The meta object literal for the '<em><b>Neo Element Path Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_ELEMENT_EDGE__NEO_ELEMENT_PATH_PARAM = eINSTANCE.getNeoElementEdge_NeoElementPathParam();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoComplexEdgeImpl <em>Neo Complex Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.impl.NeoComplexEdgeImpl
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoComplexEdge()
		 * @generated
		 */
		EClass NEO_COMPLEX_EDGE = eINSTANCE.getNeoComplexEdge();

		/**
		 * The meta object literal for the '<em><b>Neo Path Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_COMPLEX_EDGE__NEO_PATH_PARTS = eINSTANCE.getNeoComplexEdge_NeoPathParts();

		/**
		 * The meta object literal for the '<em><b>Add Neo Path Part</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_COMPLEX_EDGE___ADD_NEO_PATH_PART__NEOPATHPART = eINSTANCE.getNeoComplexEdge__AddNeoPathPart__NeoPathPart();

		/**
		 * The meta object literal for the '<em><b>Remove Neo Path Part</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_COMPLEX_EDGE___REMOVE_NEO_PATH_PART__NEOPATHPART = eINSTANCE.getNeoComplexEdge__RemoveNeoPathPart__NeoPathPart();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl <em>Neo Simple Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoSimpleEdge()
		 * @generated
		 */
		EClass NEO_SIMPLE_EDGE = eINSTANCE.getNeoSimpleEdge();

		/**
		 * The meta object literal for the '<em><b>Key Value Param</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Neo Target Node Labels</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS = eINSTANCE.getNeoSimpleEdge_NeoTargetNodeLabels();

		/**
		 * The meta object literal for the '<em><b>Neo Edge Label</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Add Neo Target Node Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_SIMPLE_EDGE___ADD_NEO_TARGET_NODE_LABEL__STRING = eINSTANCE.getNeoSimpleEdge__AddNeoTargetNodeLabel__String();

		/**
		 * The meta object literal for the '<em><b>Add Neo Edge Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_SIMPLE_EDGE___ADD_NEO_EDGE_LABEL__STRING = eINSTANCE.getNeoSimpleEdge__AddNeoEdgeLabel__String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoPathPartImpl <em>Neo Path Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.impl.NeoPathPartImpl
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoPathPart()
		 * @generated
		 */
		EClass NEO_PATH_PART = eINSTANCE.getNeoPathPart();

		/**
		 * The meta object literal for the '<em><b>Neo Path Param</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_PATH_PART__NEO_PATH_PARAM = eINSTANCE.getNeoPathPart_NeoPathParam();

		/**
		 * The meta object literal for the '<em><b>Neo Complex Edge</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_PATH_PART__NEO_COMPLEX_EDGE = eINSTANCE.getNeoPathPart_NeoComplexEdge();

		/**
		 * The meta object literal for the '<em><b>Get Neo Path Part Edge Leafs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PATH_PART___GET_NEO_PATH_PART_EDGE_LEAFS = eINSTANCE.getNeoPathPart__GetNeoPathPartEdgeLeafs();

		/**
		 * The meta object literal for the '<em><b>Get Cypher Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PATH_PART___GET_CYPHER_VARIABLE = eINSTANCE.getNeoPathPart__GetCypherVariable();

		/**
		 * The meta object literal for the '<em><b>Get Cypher Inner Edge Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PATH_PART___GET_CYPHER_INNER_EDGE_NODES__BOOLEAN = eINSTANCE.getNeoPathPart__GetCypherInnerEdgeNodes__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Neo Last Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PATH_PART___GET_NEO_LAST_EDGE = eINSTANCE.getNeoPathPart__GetNeoLastEdge();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoPropertyNodeImpl <em>Neo Property Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.impl.NeoPropertyNodeImpl
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoPropertyNode()
		 * @generated
		 */
		EClass NEO_PROPERTY_NODE = eINSTANCE.getNeoPropertyNode();

		/**
		 * The meta object literal for the '<em><b>Generate Cypher Property Addressing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PROPERTY_NODE___GENERATE_CYPHER_PROPERTY_ADDRESSING = eINSTANCE.getNeoPropertyNode__GenerateCypherPropertyAddressing();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoElementPathParamImpl <em>Neo Element Path Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.impl.NeoElementPathParamImpl
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoElementPathParam()
		 * @generated
		 */
		EClass NEO_ELEMENT_PATH_PARAM = eINSTANCE.getNeoElementPathParam();

		/**
		 * The meta object literal for the '<em><b>Neo Element Edge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_ELEMENT_PATH_PARAM__NEO_ELEMENT_EDGE = eINSTANCE.getNeoElementPathParam_NeoElementEdge();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoPropertyPathParamImpl <em>Neo Property Path Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.impl.NeoPropertyPathParamImpl
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoPropertyPathParam()
		 * @generated
		 */
		EClass NEO_PROPERTY_PATH_PARAM = eINSTANCE.getNeoPropertyPathParam();

		/**
		 * The meta object literal for the '<em><b>Neo Property Edge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE = eINSTANCE.getNeoPropertyPathParam_NeoPropertyEdge();

		/**
		 * The meta object literal for the '<em><b>Neo Property Name</b></em>' containment reference feature.
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
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoPropertyEdgeImpl <em>Neo Property Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.impl.NeoPropertyEdgeImpl
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoPropertyEdge()
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
		 * The meta object literal for the '<em><b>Get Cypher Node Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PROPERTY_EDGE___GET_CYPHER_NODE_VARIABLE = eINSTANCE.getNeoPropertyEdge__GetCypherNodeVariable();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoEdgeImpl <em>Neo Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.impl.NeoEdgeImpl
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoEdge()
		 * @generated
		 */
		EClass NEO_EDGE = eINSTANCE.getNeoEdge();

		/**
		 * The meta object literal for the '<em><b>Return Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEO_EDGE__RETURN_ELEMENT = eINSTANCE.getNeoEdge_ReturnElement();

		/**
		 * The meta object literal for the '<em><b>Set Is Return Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_EDGE___SET_IS_RETURN_ELEMENT__BOOLEAN = eINSTANCE.getNeoEdge__SetIsReturnElement__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Return Inner Edge Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_EDGE___GET_RETURN_INNER_EDGE_NODES = eINSTANCE.getNeoEdge__GetReturnInnerEdgeNodes();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoPathParamImpl <em>Neo Path Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.impl.NeoPathParamImpl
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoPathParam()
		 * @generated
		 */
		EClass NEO_PATH_PARAM = eINSTANCE.getNeoPathParam();

		/**
		 * The meta object literal for the '<em><b>Neo Path Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEO_PATH_PARAM__NEO_PATH_PART = eINSTANCE.getNeoPathParam_NeoPathPart();

		/**
		 * The meta object literal for the '<em><b>Get Return Inner Edge Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PATH_PARAM___GET_RETURN_INNER_EDGE_NODES = eINSTANCE.getNeoPathParam__GetReturnInnerEdgeNodes();

		/**
		 * The meta object literal for the '<em><b>Get Cypher Return Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_PATH_PARAM___GET_CYPHER_RETURN_VARIABLE = eINSTANCE.getNeoPathParam__GetCypherReturnVariable();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.NeoElement <em>Neo Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.NeoElement
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoElement()
		 * @generated
		 */
		EClass NEO_ELEMENT = eINSTANCE.getNeoElement();

		/**
		 * The meta object literal for the '<em><b>Get Cypher Return</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEO_ELEMENT___GET_CYPHER_RETURN = eINSTANCE.getNeoElement__GetCypherReturn();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoNodeLabelsParamImpl <em>Neo Node Labels Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.impl.NeoNodeLabelsParamImpl
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoNodeLabelsParam()
		 * @generated
		 */
		EClass NEO_NODE_LABELS_PARAM = eINSTANCE.getNeoNodeLabelsParam();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoEdgeLabelParamImpl <em>Neo Edge Label Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.impl.NeoEdgeLabelParamImpl
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoEdgeLabelParam()
		 * @generated
		 */
		EClass NEO_EDGE_LABEL_PARAM = eINSTANCE.getNeoEdgeLabelParam();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.NeoLabel <em>Neo Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.NeoLabel
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoLabel()
		 * @generated
		 */
		EClass NEO_LABEL = eINSTANCE.getNeoLabel();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.impl.NeoPropertyNameParamImpl <em>Neo Property Name Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.impl.NeoPropertyNameParamImpl
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoPropertyNameParam()
		 * @generated
		 */
		EClass NEO_PROPERTY_NAME_PARAM = eINSTANCE.getNeoPropertyNameParam();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.NeoDirection <em>Neo Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.NeoDirection
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoDirection()
		 * @generated
		 */
		EEnum NEO_DIRECTION = eINSTANCE.getNeoDirection();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionneo4j.NeoPlace <em>Neo Place</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionneo4j.NeoPlace
		 * @see qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl#getNeoPlace()
		 * @generated
		 */
		EEnum NEO_PLACE = eINSTANCE.getNeoPlace();

	}

} //Adaptionneo4jPackage

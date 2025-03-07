/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see qualitypatternmodel.graphstructure.GraphstructureFactory
 * @model kind="package"
 * @generated
 */
public interface GraphstructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphstructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "graphstructure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graphstructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphstructurePackage eINSTANCE = qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.impl.RelationImpl
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ID = PatternstructurePackage.PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__INTERNAL_ID = PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__GRAPH = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SOURCE = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TRANSLATED = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__PREDICATES_ARE_BEING_TRANSLATED = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___IS_VALID__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GENERATE_QUERY__LANGUAGE = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY__LANGUAGE;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GENERATE_XQUERY = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GENERATE_SPARQL = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GENERATE_CYPHER = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GENERATE_XQUERY_JAVA = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GENERATE_XQUERY_JAVA_RETURN = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GENERATE_QUERY_FILTER_PART = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___CONTAINS_JAVA_OPERATOR = PatternstructurePackage.PATTERN_ELEMENT___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Create Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___CREATE_ADAPTION__LANGUAGE = PatternstructurePackage.PATTERN_ELEMENT___CREATE_ADAPTION__LANGUAGE;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___CREATE_XML_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___CREATE_RDF_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___CREATE_NEO4J_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___RELATIONS_XML_ADAPTED = PatternstructurePackage.PATTERN_ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___INITIALIZE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___PREPARE_PARAMETER_UPDATES = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___UPDATE_PARAMETERS__PARAMETERLIST = PatternstructurePackage.PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_CONTAINER = PatternstructurePackage.PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_ANCESTOR__CLASS = PatternstructurePackage.PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_OPERATOR_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_ALL_OPERATORS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_PARAMETER_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_ALL_PARAMETERS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___MY_TO_STRING = PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___CREATE_PARAMETERS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___SET_GRAPH_SIMPLE__GRAPH = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Cross Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___IS_CROSS_GRAPH = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Adapt As Xml Element Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___ADAPT_AS_XML_ELEMENT_NAVIGATION = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Adapt As Xml Property Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___ADAPT_AS_XML_PROPERTY_NAVIGATION = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Adapt As Xml Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___ADAPT_AS_XML_REFERENCE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Adapt As Rdf Predicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___ADAPT_AS_RDF_PREDICATE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___ADAPT_AS_NEO_ELEMENT_EDGE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Adapt As Property Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___ADAPT_AS_PROPERTY_EDGE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>In Java Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___IN_JAVA_RETURN_REQUIRED = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.Comparable <em>Comparable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Comparable
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getComparable()
	 * @generated
	 */
	int COMPARABLE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE__ID = PatternstructurePackage.PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE__INTERNAL_ID = PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE__COMPARISON1 = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE__COMPARISON2 = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___IS_VALID__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GENERATE_QUERY__LANGUAGE = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY__LANGUAGE;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GENERATE_XQUERY = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GENERATE_SPARQL = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GENERATE_CYPHER = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GENERATE_XQUERY_JAVA = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GENERATE_XQUERY_JAVA_RETURN = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GENERATE_QUERY_FILTER_PART = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___CONTAINS_JAVA_OPERATOR = PatternstructurePackage.PATTERN_ELEMENT___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Create Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___CREATE_ADAPTION__LANGUAGE = PatternstructurePackage.PATTERN_ELEMENT___CREATE_ADAPTION__LANGUAGE;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___CREATE_XML_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___CREATE_RDF_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___CREATE_NEO4J_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___RELATIONS_XML_ADAPTED = PatternstructurePackage.PATTERN_ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___INITIALIZE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___PREPARE_PARAMETER_UPDATES = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___UPDATE_PARAMETERS__PARAMETERLIST = PatternstructurePackage.PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GET_CONTAINER = PatternstructurePackage.PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GET_ANCESTOR__CLASS = PatternstructurePackage.PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GET_OPERATOR_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GET_ALL_OPERATORS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GET_PARAMETER_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GET_ALL_PARAMETERS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___MY_TO_STRING = PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GET_RETURN_TYPE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___IS_TRANSLATABLE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GET_ALL_ARGUMENT_ELEMENTS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___IS_OPERATOR_ARGUMENT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___ADD_COMPARISON__COMPARABLE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.impl.NodeImpl
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = COMPARABLE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INTERNAL_ID = COMPARABLE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COMPARISON1 = COMPARABLE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COMPARISON2 = COMPARABLE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GRAPH = COMPARABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = COMPARABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PREDICATES = COMPARABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING = COMPARABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__RETURN_NODE = COMPARABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE_MODIFIABLE = COMPARABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TRANSLATED = COMPARABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PREDICATES_ARE_BEING_TRANSLATED = COMPARABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = COMPARABLE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___IS_VALID__ABSTRACTIONLEVEL = COMPARABLE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = COMPARABLE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GENERATE_QUERY__LANGUAGE = COMPARABLE___GENERATE_QUERY__LANGUAGE;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GENERATE_XQUERY = COMPARABLE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GENERATE_SPARQL = COMPARABLE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GENERATE_CYPHER = COMPARABLE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GENERATE_XQUERY_JAVA = COMPARABLE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GENERATE_XQUERY_JAVA_RETURN = COMPARABLE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GENERATE_QUERY_FILTER_PART = COMPARABLE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CONTAINS_JAVA_OPERATOR = COMPARABLE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Create Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CREATE_ADAPTION__LANGUAGE = COMPARABLE___CREATE_ADAPTION__LANGUAGE;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CREATE_XML_ADAPTION = COMPARABLE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CREATE_RDF_ADAPTION = COMPARABLE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CREATE_NEO4J_ADAPTION = COMPARABLE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___RELATIONS_XML_ADAPTED = COMPARABLE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___PREPARE_TRANSLATION = COMPARABLE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___INITIALIZE_TRANSLATION = COMPARABLE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___PREPARE_PARAMETER_UPDATES = COMPARABLE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = COMPARABLE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___UPDATE_PARAMETERS__PARAMETERLIST = COMPARABLE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = COMPARABLE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_CONTAINER = COMPARABLE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ANCESTOR__CLASS = COMPARABLE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_OPERATOR_LIST = COMPARABLE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ALL_OPERATORS = COMPARABLE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_PARAMETER_LIST = COMPARABLE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ALL_PARAMETERS = COMPARABLE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___MY_TO_STRING = COMPARABLE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___VALIDATE__DIAGNOSTICCHAIN_MAP = COMPARABLE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_RETURN_TYPE = COMPARABLE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___IS_TRANSLATABLE = COMPARABLE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ALL_ARGUMENT_ELEMENTS = COMPARABLE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___IS_OPERATOR_ARGUMENT = COMPARABLE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Add Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_COMPARISON__COMPARABLE = COMPARABLE___ADD_COMPARISON__COMPARABLE;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CREATE_PARAMETERS = COMPARABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = COMPARABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___SET_GRAPH_SIMPLE__GRAPH = COMPARABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Relations To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_RELATIONS_TO__NODE = COMPARABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_OUTGOING = COMPARABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_OUTGOING__GRAPH = COMPARABLE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_OUTGOING__NODE = COMPARABLE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Add Incomming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_INCOMMING__COMPLEXNODE = COMPARABLE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_PRIMITIVE_COMPARISON = COMPARABLE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_PRIMITIVE_COMPARISON__STRING = COMPARABLE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE = COMPARABLE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE = COMPARABLE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_PRIMITIVE_MATCH = COMPARABLE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_PRIMITIVE_MATCH__STRING = COMPARABLE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_PRIMITIVE_CONTAINS = COMPARABLE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_PRIMITIVE_CONTAINS__STRING = COMPARABLE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_PRIMITIVE_STRING_LENGTH = COMPARABLE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE = COMPARABLE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_PRIMITIVE_NULL_CHECK = COMPARABLE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN = COMPARABLE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Add Primitive Validate Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_PRIMITIVE_VALIDATE_LINK = COMPARABLE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CHECK_COMPARISON_CONSISTENCY = COMPARABLE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON = COMPARABLE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CHECK_GENERIC = COMPARABLE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Make Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___MAKE_GENERIC = COMPARABLE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Check Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CHECK_COMPLEX = COMPARABLE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Make Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___MAKE_COMPLEX = COMPARABLE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CHECK_PRIMITIVE = COMPARABLE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Make Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___MAKE_PRIMITIVE = COMPARABLE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Adapt As Xml Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADAPT_AS_XML_ELEMENT = COMPARABLE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Adapt As Xml Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADAPT_AS_XML_PROPERTY = COMPARABLE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Adapt As Rdf Iri Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADAPT_AS_RDF_IRI_NODE = COMPARABLE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Adapt As Rdf Literal Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADAPT_AS_RDF_LITERAL_NODE = COMPARABLE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADAPT_AS_NEO_ELEMENT_NODE = COMPARABLE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Adapt As Neo Property Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADAPT_AS_NEO_PROPERTY_NODE = COMPARABLE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>In Java Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___IN_JAVA_RETURN_REQUIRED = COMPARABLE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>In Java Graph Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___IN_JAVA_GRAPH_RETURN_REQUIRED = COMPARABLE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>In Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___IN_JAVA_WHERE = COMPARABLE_OPERATION_COUNT + 37;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = COMPARABLE_OPERATION_COUNT + 38;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl <em>Primitive Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getPrimitiveNode()
	 * @generated
	 */
	int PRIMITIVE_NODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__INTERNAL_ID = NODE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__COMPARISON1 = NODE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__COMPARISON2 = NODE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__GRAPH = NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__PREDICATES = NODE__PREDICATES;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Return Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__RETURN_NODE = NODE__RETURN_NODE;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__TYPE_MODIFIABLE = NODE__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__TRANSLATED = NODE__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__PREDICATES_ARE_BEING_TRANSLATED = NODE__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Match</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__MATCH = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__CONTAINS = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Null Check</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__NULL_CHECK = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>String Length</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__STRING_LENGTH = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>One Arg Java Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__ONE_ARG_JAVA_OPERATOR = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Two Arg Java Operator1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR1 = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Two Arg Java Operator2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR2 = NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Primitive Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___IS_VALID__ABSTRACTIONLEVEL = NODE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GENERATE_QUERY__LANGUAGE = NODE___GENERATE_QUERY__LANGUAGE;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GENERATE_XQUERY = NODE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GENERATE_SPARQL = NODE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GENERATE_CYPHER = NODE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GENERATE_XQUERY_JAVA = NODE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GENERATE_XQUERY_JAVA_RETURN = NODE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GENERATE_QUERY_FILTER_PART = NODE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___CONTAINS_JAVA_OPERATOR = NODE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Create Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___CREATE_ADAPTION__LANGUAGE = NODE___CREATE_ADAPTION__LANGUAGE;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___CREATE_XML_ADAPTION = NODE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___CREATE_RDF_ADAPTION = NODE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___CREATE_NEO4J_ADAPTION = NODE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___RELATIONS_XML_ADAPTED = NODE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___PREPARE_TRANSLATION = NODE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___INITIALIZE_TRANSLATION = NODE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___PREPARE_PARAMETER_UPDATES = NODE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___UPDATE_PARAMETERS__PARAMETERLIST = NODE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GET_CONTAINER = NODE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GET_ANCESTOR__CLASS = NODE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GET_OPERATOR_LIST = NODE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GET_ALL_OPERATORS = NODE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GET_PARAMETER_LIST = NODE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GET_ALL_PARAMETERS = NODE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___MY_TO_STRING = NODE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP = NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GET_RETURN_TYPE = NODE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___IS_TRANSLATABLE = NODE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GET_ALL_ARGUMENT_ELEMENTS = NODE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___IS_OPERATOR_ARGUMENT = NODE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Add Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_COMPARISON__COMPARABLE = NODE___ADD_COMPARISON__COMPARABLE;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___CREATE_PARAMETERS = NODE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___SET_GRAPH_SIMPLE__GRAPH = NODE___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Get Relations To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___GET_RELATIONS_TO__NODE = NODE___GET_RELATIONS_TO__NODE;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_OUTGOING = NODE___ADD_OUTGOING;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_OUTGOING__GRAPH = NODE___ADD_OUTGOING__GRAPH;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_OUTGOING__NODE = NODE___ADD_OUTGOING__NODE;

	/**
	 * The operation id for the '<em>Add Incomming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_INCOMMING__COMPLEXNODE = NODE___ADD_INCOMMING__COMPLEXNODE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON = NODE___ADD_PRIMITIVE_COMPARISON;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON__STRING = NODE___ADD_PRIMITIVE_COMPARISON__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE = NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE = NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_PRIMITIVE_MATCH = NODE___ADD_PRIMITIVE_MATCH;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_PRIMITIVE_MATCH__STRING = NODE___ADD_PRIMITIVE_MATCH__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_PRIMITIVE_CONTAINS = NODE___ADD_PRIMITIVE_CONTAINS;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_PRIMITIVE_CONTAINS__STRING = NODE___ADD_PRIMITIVE_CONTAINS__STRING;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_PRIMITIVE_STRING_LENGTH = NODE___ADD_PRIMITIVE_STRING_LENGTH;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE = NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_PRIMITIVE_NULL_CHECK = NODE___ADD_PRIMITIVE_NULL_CHECK;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN = NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN;

	/**
	 * The operation id for the '<em>Add Primitive Validate Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADD_PRIMITIVE_VALIDATE_LINK = NODE___ADD_PRIMITIVE_VALIDATE_LINK;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY = NODE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON = NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON;

	/**
	 * The operation id for the '<em>Check Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___CHECK_GENERIC = NODE___CHECK_GENERIC;

	/**
	 * The operation id for the '<em>Make Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___MAKE_GENERIC = NODE___MAKE_GENERIC;

	/**
	 * The operation id for the '<em>Check Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___CHECK_COMPLEX = NODE___CHECK_COMPLEX;

	/**
	 * The operation id for the '<em>Make Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___MAKE_COMPLEX = NODE___MAKE_COMPLEX;

	/**
	 * The operation id for the '<em>Check Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___CHECK_PRIMITIVE = NODE___CHECK_PRIMITIVE;

	/**
	 * The operation id for the '<em>Make Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___MAKE_PRIMITIVE = NODE___MAKE_PRIMITIVE;

	/**
	 * The operation id for the '<em>Adapt As Xml Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADAPT_AS_XML_ELEMENT = NODE___ADAPT_AS_XML_ELEMENT;

	/**
	 * The operation id for the '<em>Adapt As Xml Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADAPT_AS_XML_PROPERTY = NODE___ADAPT_AS_XML_PROPERTY;

	/**
	 * The operation id for the '<em>Adapt As Rdf Iri Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADAPT_AS_RDF_IRI_NODE = NODE___ADAPT_AS_RDF_IRI_NODE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Literal Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADAPT_AS_RDF_LITERAL_NODE = NODE___ADAPT_AS_RDF_LITERAL_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADAPT_AS_NEO_ELEMENT_NODE = NODE___ADAPT_AS_NEO_ELEMENT_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Property Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___ADAPT_AS_NEO_PROPERTY_NODE = NODE___ADAPT_AS_NEO_PROPERTY_NODE;

	/**
	 * The operation id for the '<em>In Java Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___IN_JAVA_RETURN_REQUIRED = NODE___IN_JAVA_RETURN_REQUIRED;

	/**
	 * The operation id for the '<em>In Java Graph Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___IN_JAVA_GRAPH_RETURN_REQUIRED = NODE___IN_JAVA_GRAPH_RETURN_REQUIRED;

	/**
	 * The operation id for the '<em>In Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___IN_JAVA_WHERE = NODE___IN_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY__PARAMETERVALUE = NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.impl.GraphImpl
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ID = PatternstructurePackage.PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__INTERNAL_ID = PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NODES = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__OPERATOR_LIST = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantified Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__QUANTIFIED_CONDITION = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__PATTERN = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outgoing Morphisms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__OUTGOING_MORPHISMS = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Incoming Morphism</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__INCOMING_MORPHISM = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__RELATIONS = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___IS_VALID__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GENERATE_QUERY__LANGUAGE = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY__LANGUAGE;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GENERATE_XQUERY = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GENERATE_SPARQL = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GENERATE_CYPHER = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GENERATE_XQUERY_JAVA = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GENERATE_XQUERY_JAVA_RETURN = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GENERATE_QUERY_FILTER_PART = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___CONTAINS_JAVA_OPERATOR = PatternstructurePackage.PATTERN_ELEMENT___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Create Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___CREATE_ADAPTION__LANGUAGE = PatternstructurePackage.PATTERN_ELEMENT___CREATE_ADAPTION__LANGUAGE;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___CREATE_XML_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___CREATE_RDF_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___CREATE_NEO4J_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___RELATIONS_XML_ADAPTED = PatternstructurePackage.PATTERN_ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___INITIALIZE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___PREPARE_PARAMETER_UPDATES = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___UPDATE_PARAMETERS__PARAMETERLIST = PatternstructurePackage.PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_CONTAINER = PatternstructurePackage.PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ANCESTOR__CLASS = PatternstructurePackage.PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_OPERATOR_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ALL_OPERATORS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_PARAMETER_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ALL_PARAMETERS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___MY_TO_STRING = PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Is Return Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___IS_RETURN_GRAPH = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Return Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_RETURN_NODES = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Relation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_RELATION__COMPLEXNODE_NODE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_NODE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Complex Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_COMPLEX_NODE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Primitive Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_PRIMITIVE_NODE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Generate Cypher Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GENERATE_CYPHER_WHERE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get All Sub Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ALL_SUB_GRAPHS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___IS_BEFORE__GRAPH = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Nodes From All Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_NODES_FROM_ALL_PREVIOUS_GRAPHS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Relations From All Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_RELATIONS_FROM_ALL_PREVIOUS_GRAPHS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.Adaptable <em>Adaptable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Adaptable
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getAdaptable()
	 * @generated
	 */
	int ADAPTABLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE__ID = PatternstructurePackage.PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE__INTERNAL_ID = PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The number of structural features of the '<em>Adaptable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___IS_VALID__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___GENERATE_QUERY__LANGUAGE = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY__LANGUAGE;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___GENERATE_XQUERY = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___GENERATE_SPARQL = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___GENERATE_CYPHER = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___GENERATE_XQUERY_JAVA = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___GENERATE_XQUERY_JAVA_RETURN = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___GENERATE_QUERY_FILTER_PART = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___CONTAINS_JAVA_OPERATOR = PatternstructurePackage.PATTERN_ELEMENT___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Create Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___CREATE_ADAPTION__LANGUAGE = PatternstructurePackage.PATTERN_ELEMENT___CREATE_ADAPTION__LANGUAGE;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___CREATE_XML_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___CREATE_RDF_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___CREATE_NEO4J_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___RELATIONS_XML_ADAPTED = PatternstructurePackage.PATTERN_ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___INITIALIZE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___PREPARE_PARAMETER_UPDATES = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___UPDATE_PARAMETERS__PARAMETERLIST = PatternstructurePackage.PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___GET_CONTAINER = PatternstructurePackage.PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___GET_ANCESTOR__CLASS = PatternstructurePackage.PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___GET_OPERATOR_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___GET_ALL_OPERATORS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___GET_PARAMETER_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___GET_ALL_PARAMETERS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___MY_TO_STRING = PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___CREATE_PARAMETERS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Adaptable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.impl.ComplexNodeImpl <em>Complex Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.impl.ComplexNodeImpl
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getComplexNode()
	 * @generated
	 */
	int COMPLEX_NODE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__INTERNAL_ID = NODE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__COMPARISON1 = NODE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__COMPARISON2 = NODE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__GRAPH = NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__PREDICATES = NODE__PREDICATES;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Return Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__RETURN_NODE = NODE__RETURN_NODE;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__TYPE_MODIFIABLE = NODE__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__TRANSLATED = NODE__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__PREDICATES_ARE_BEING_TRANSLATED = NODE__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__OUTGOING = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___IS_VALID__ABSTRACTIONLEVEL = NODE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GENERATE_QUERY__LANGUAGE = NODE___GENERATE_QUERY__LANGUAGE;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GENERATE_XQUERY = NODE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GENERATE_SPARQL = NODE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GENERATE_CYPHER = NODE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GENERATE_XQUERY_JAVA = NODE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GENERATE_XQUERY_JAVA_RETURN = NODE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GENERATE_QUERY_FILTER_PART = NODE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___CONTAINS_JAVA_OPERATOR = NODE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Create Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___CREATE_ADAPTION__LANGUAGE = NODE___CREATE_ADAPTION__LANGUAGE;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___CREATE_XML_ADAPTION = NODE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___CREATE_RDF_ADAPTION = NODE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___CREATE_NEO4J_ADAPTION = NODE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___RELATIONS_XML_ADAPTED = NODE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___PREPARE_TRANSLATION = NODE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___INITIALIZE_TRANSLATION = NODE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___PREPARE_PARAMETER_UPDATES = NODE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___UPDATE_PARAMETERS__PARAMETERLIST = NODE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GET_CONTAINER = NODE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GET_ANCESTOR__CLASS = NODE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GET_OPERATOR_LIST = NODE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GET_ALL_OPERATORS = NODE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GET_PARAMETER_LIST = NODE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GET_ALL_PARAMETERS = NODE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___MY_TO_STRING = NODE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP = NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GET_RETURN_TYPE = NODE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___IS_TRANSLATABLE = NODE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GET_ALL_ARGUMENT_ELEMENTS = NODE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___IS_OPERATOR_ARGUMENT = NODE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Add Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_COMPARISON__COMPARABLE = NODE___ADD_COMPARISON__COMPARABLE;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___CREATE_PARAMETERS = NODE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___SET_GRAPH_SIMPLE__GRAPH = NODE___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Get Relations To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GET_RELATIONS_TO__NODE = NODE___GET_RELATIONS_TO__NODE;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_OUTGOING = NODE___ADD_OUTGOING;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_OUTGOING__GRAPH = NODE___ADD_OUTGOING__GRAPH;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_OUTGOING__NODE = NODE___ADD_OUTGOING__NODE;

	/**
	 * The operation id for the '<em>Add Incomming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_INCOMMING__COMPLEXNODE = NODE___ADD_INCOMMING__COMPLEXNODE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON = NODE___ADD_PRIMITIVE_COMPARISON;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__STRING = NODE___ADD_PRIMITIVE_COMPARISON__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE = NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE = NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_PRIMITIVE_MATCH = NODE___ADD_PRIMITIVE_MATCH;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_PRIMITIVE_MATCH__STRING = NODE___ADD_PRIMITIVE_MATCH__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_PRIMITIVE_CONTAINS = NODE___ADD_PRIMITIVE_CONTAINS;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_PRIMITIVE_CONTAINS__STRING = NODE___ADD_PRIMITIVE_CONTAINS__STRING;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_PRIMITIVE_STRING_LENGTH = NODE___ADD_PRIMITIVE_STRING_LENGTH;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE = NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_PRIMITIVE_NULL_CHECK = NODE___ADD_PRIMITIVE_NULL_CHECK;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN = NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN;

	/**
	 * The operation id for the '<em>Add Primitive Validate Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADD_PRIMITIVE_VALIDATE_LINK = NODE___ADD_PRIMITIVE_VALIDATE_LINK;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___CHECK_COMPARISON_CONSISTENCY = NODE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON = NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON;

	/**
	 * The operation id for the '<em>Check Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___CHECK_GENERIC = NODE___CHECK_GENERIC;

	/**
	 * The operation id for the '<em>Make Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___MAKE_GENERIC = NODE___MAKE_GENERIC;

	/**
	 * The operation id for the '<em>Check Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___CHECK_COMPLEX = NODE___CHECK_COMPLEX;

	/**
	 * The operation id for the '<em>Make Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___MAKE_COMPLEX = NODE___MAKE_COMPLEX;

	/**
	 * The operation id for the '<em>Check Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___CHECK_PRIMITIVE = NODE___CHECK_PRIMITIVE;

	/**
	 * The operation id for the '<em>Make Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___MAKE_PRIMITIVE = NODE___MAKE_PRIMITIVE;

	/**
	 * The operation id for the '<em>Adapt As Xml Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADAPT_AS_XML_ELEMENT = NODE___ADAPT_AS_XML_ELEMENT;

	/**
	 * The operation id for the '<em>Adapt As Xml Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADAPT_AS_XML_PROPERTY = NODE___ADAPT_AS_XML_PROPERTY;

	/**
	 * The operation id for the '<em>Adapt As Rdf Iri Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADAPT_AS_RDF_IRI_NODE = NODE___ADAPT_AS_RDF_IRI_NODE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Literal Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADAPT_AS_RDF_LITERAL_NODE = NODE___ADAPT_AS_RDF_LITERAL_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADAPT_AS_NEO_ELEMENT_NODE = NODE___ADAPT_AS_NEO_ELEMENT_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Property Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ADAPT_AS_NEO_PROPERTY_NODE = NODE___ADAPT_AS_NEO_PROPERTY_NODE;

	/**
	 * The operation id for the '<em>In Java Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___IN_JAVA_RETURN_REQUIRED = NODE___IN_JAVA_RETURN_REQUIRED;

	/**
	 * The operation id for the '<em>In Java Graph Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___IN_JAVA_GRAPH_RETURN_REQUIRED = NODE___IN_JAVA_GRAPH_RETURN_REQUIRED;

	/**
	 * The operation id for the '<em>In Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___IN_JAVA_WHERE = NODE___IN_JAVA_WHERE;

	/**
	 * The number of operations of the '<em>Complex Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.ReturnType <em>Return Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.ReturnType
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.graphstructure.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see qualitypatternmodel.graphstructure.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.graphstructure.Relation#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see qualitypatternmodel.graphstructure.Relation#getGraph()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Graph();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see qualitypatternmodel.graphstructure.Relation#getSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see qualitypatternmodel.graphstructure.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qualitypatternmodel.graphstructure.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Relation#isTranslated <em>Translated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translated</em>'.
	 * @see qualitypatternmodel.graphstructure.Relation#isTranslated()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Translated();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Relation#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicates Are Being Translated</em>'.
	 * @see qualitypatternmodel.graphstructure.Relation#isPredicatesAreBeingTranslated()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_PredicatesAreBeingTranslated();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Relation#adaptAsXmlElementNavigation() <em>Adapt As Xml Element Navigation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adapt As Xml Element Navigation</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Relation#adaptAsXmlElementNavigation()
	 * @generated
	 */
	EOperation getRelation__AdaptAsXmlElementNavigation();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Relation#adaptAsXmlPropertyNavigation() <em>Adapt As Xml Property Navigation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adapt As Xml Property Navigation</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Relation#adaptAsXmlPropertyNavigation()
	 * @generated
	 */
	EOperation getRelation__AdaptAsXmlPropertyNavigation();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Relation#adaptAsXmlReference() <em>Adapt As Xml Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adapt As Xml Reference</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Relation#adaptAsXmlReference()
	 * @generated
	 */
	EOperation getRelation__AdaptAsXmlReference();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Relation#adaptAsRdfPredicate() <em>Adapt As Rdf Predicate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adapt As Rdf Predicate</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Relation#adaptAsRdfPredicate()
	 * @generated
	 */
	EOperation getRelation__AdaptAsRdfPredicate();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Relation#adaptAsNeoElementEdge() <em>Adapt As Neo Element Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adapt As Neo Element Edge</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Relation#adaptAsNeoElementEdge()
	 * @generated
	 */
	EOperation getRelation__AdaptAsNeoElementEdge();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Relation#adaptAsPropertyEdge() <em>Adapt As Property Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adapt As Property Edge</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Relation#adaptAsPropertyEdge()
	 * @generated
	 */
	EOperation getRelation__AdaptAsPropertyEdge();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Relation#inJavaReturnRequired() <em>In Java Return Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>In Java Return Required</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Relation#inJavaReturnRequired()
	 * @generated
	 */
	EOperation getRelation__InJavaReturnRequired();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Relation#setGraphSimple(qualitypatternmodel.graphstructure.Graph) <em>Set Graph Simple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Graph Simple</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Relation#setGraphSimple(qualitypatternmodel.graphstructure.Graph)
	 * @generated
	 */
	EOperation getRelation__SetGraphSimple__Graph();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Relation#isCrossGraph() <em>Is Cross Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Cross Graph</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Relation#isCrossGraph()
	 * @generated
	 */
	EOperation getRelation__IsCrossGraph();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.graphstructure.PrimitiveNode <em>Primitive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Node</em>'.
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode
	 * @generated
	 */
	EClass getPrimitiveNode();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Match</em>'.
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#getMatch()
	 * @see #getPrimitiveNode()
	 * @generated
	 */
	EReference getPrimitiveNode_Match();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#getContains()
	 * @see #getPrimitiveNode()
	 * @generated
	 */
	EReference getPrimitiveNode_Contains();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getNullCheck <em>Null Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Null Check</em>'.
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#getNullCheck()
	 * @see #getPrimitiveNode()
	 * @generated
	 */
	EReference getPrimitiveNode_NullCheck();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getStringLength <em>String Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>String Length</em>'.
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#getStringLength()
	 * @see #getPrimitiveNode()
	 * @generated
	 */
	EReference getPrimitiveNode_StringLength();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getOneArgJavaOperator <em>One Arg Java Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>One Arg Java Operator</em>'.
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#getOneArgJavaOperator()
	 * @see #getPrimitiveNode()
	 * @generated
	 */
	EReference getPrimitiveNode_OneArgJavaOperator();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getTwoArgJavaOperator1 <em>Two Arg Java Operator1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Two Arg Java Operator1</em>'.
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#getTwoArgJavaOperator1()
	 * @see #getPrimitiveNode()
	 * @generated
	 */
	EReference getPrimitiveNode_TwoArgJavaOperator1();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getTwoArgJavaOperator2 <em>Two Arg Java Operator2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Two Arg Java Operator2</em>'.
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#getTwoArgJavaOperator2()
	 * @see #getPrimitiveNode()
	 * @generated
	 */
	EReference getPrimitiveNode_TwoArgJavaOperator2();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.PrimitiveNode#checkComparisonConsistency(qualitypatternmodel.parameters.ParameterValue) <em>Check Comparison Consistency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Comparison Consistency</em>' operation.
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#checkComparisonConsistency(qualitypatternmodel.parameters.ParameterValue)
	 * @generated
	 */
	EOperation getPrimitiveNode__CheckComparisonConsistency__ParameterValue();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.graphstructure.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see qualitypatternmodel.graphstructure.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.graphstructure.Node#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see qualitypatternmodel.graphstructure.Node#getGraph()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Graph();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qualitypatternmodel.graphstructure.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Node#isTranslated <em>Translated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translated</em>'.
	 * @see qualitypatternmodel.graphstructure.Node#isTranslated()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Translated();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Node#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicates Are Being Translated</em>'.
	 * @see qualitypatternmodel.graphstructure.Node#isPredicatesAreBeingTranslated()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_PredicatesAreBeingTranslated();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.Node#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predicates</em>'.
	 * @see qualitypatternmodel.graphstructure.Node#getPredicates()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Predicates();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see qualitypatternmodel.graphstructure.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Incoming();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Node#isTypeModifiable <em>Type Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Modifiable</em>'.
	 * @see qualitypatternmodel.graphstructure.Node#isTypeModifiable()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_TypeModifiable();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Node#isReturnNode <em>Return Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Node</em>'.
	 * @see qualitypatternmodel.graphstructure.Node#isReturnNode()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_ReturnNode();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveMatch(java.lang.String) <em>Add Primitive Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Match</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveMatch(java.lang.String)
	 * @generated
	 */
	EOperation getNode__AddPrimitiveMatch__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveContains() <em>Add Primitive Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Contains</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveContains()
	 * @generated
	 */
	EOperation getNode__AddPrimitiveContains();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveContains(java.lang.String) <em>Add Primitive Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Contains</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveContains(java.lang.String)
	 * @generated
	 */
	EOperation getNode__AddPrimitiveContains__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(java.lang.String) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Comparison</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(java.lang.String)
	 * @generated
	 */
	EOperation getNode__AddPrimitiveComparison__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveMatch() <em>Add Primitive Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Match</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveMatch()
	 * @generated
	 */
	EOperation getNode__AddPrimitiveMatch();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison() <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Comparison</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveComparison()
	 * @generated
	 */
	EOperation getNode__AddPrimitiveComparison();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.operators.ComparisonOperator, qualitypatternmodel.parameters.ParameterValue) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Comparison</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.operators.ComparisonOperator, qualitypatternmodel.parameters.ParameterValue)
	 * @generated
	 */
	EOperation getNode__AddPrimitiveComparison__ComparisonOperator_ParameterValue();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.parameters.ParameterValue) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Comparison</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.parameters.ParameterValue)
	 * @generated
	 */
	EOperation getNode__AddPrimitiveComparison__ParameterValue();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#setGraphSimple(qualitypatternmodel.graphstructure.Graph) <em>Set Graph Simple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Graph Simple</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#setGraphSimple(qualitypatternmodel.graphstructure.Graph)
	 * @generated
	 */
	EOperation getNode__SetGraphSimple__Graph();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#checkComparisonConsistency(qualitypatternmodel.operators.Comparison) <em>Check Comparison Consistency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Comparison Consistency</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#checkComparisonConsistency(qualitypatternmodel.operators.Comparison)
	 * @generated
	 */
	EOperation getNode__CheckComparisonConsistency__Comparison();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#makePrimitive() <em>Make Primitive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Primitive</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#makePrimitive()
	 * @generated
	 */
	EOperation getNode__MakePrimitive();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#makeComplex() <em>Make Complex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Complex</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#makeComplex()
	 * @generated
	 */
	EOperation getNode__MakeComplex();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addOutgoing() <em>Add Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Outgoing</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addOutgoing()
	 * @generated
	 */
	EOperation getNode__AddOutgoing();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addOutgoing(qualitypatternmodel.graphstructure.Graph) <em>Add Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Outgoing</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addOutgoing(qualitypatternmodel.graphstructure.Graph)
	 * @generated
	 */
	EOperation getNode__AddOutgoing__Graph();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addOutgoing(qualitypatternmodel.graphstructure.Node) <em>Add Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Outgoing</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addOutgoing(qualitypatternmodel.graphstructure.Node)
	 * @generated
	 */
	EOperation getNode__AddOutgoing__Node();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#makeGeneric() <em>Make Generic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Generic</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#makeGeneric()
	 * @generated
	 */
	EOperation getNode__MakeGeneric();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#checkGeneric() <em>Check Generic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Generic</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#checkGeneric()
	 * @generated
	 */
	EOperation getNode__CheckGeneric();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#checkPrimitive() <em>Check Primitive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Primitive</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#checkPrimitive()
	 * @generated
	 */
	EOperation getNode__CheckPrimitive();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#checkComplex() <em>Check Complex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Complex</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#checkComplex()
	 * @generated
	 */
	EOperation getNode__CheckComplex();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addIncomming(qualitypatternmodel.graphstructure.ComplexNode) <em>Add Incomming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Incomming</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addIncomming(qualitypatternmodel.graphstructure.ComplexNode)
	 * @generated
	 */
	EOperation getNode__AddIncomming__ComplexNode();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#adaptAsXmlElement() <em>Adapt As Xml Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adapt As Xml Element</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#adaptAsXmlElement()
	 * @generated
	 */
	EOperation getNode__AdaptAsXmlElement();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#adaptAsXmlProperty() <em>Adapt As Xml Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adapt As Xml Property</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#adaptAsXmlProperty()
	 * @generated
	 */
	EOperation getNode__AdaptAsXmlProperty();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#adaptAsRdfIriNode() <em>Adapt As Rdf Iri Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adapt As Rdf Iri Node</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#adaptAsRdfIriNode()
	 * @generated
	 */
	EOperation getNode__AdaptAsRdfIriNode();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#adaptAsRdfLiteralNode() <em>Adapt As Rdf Literal Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adapt As Rdf Literal Node</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#adaptAsRdfLiteralNode()
	 * @generated
	 */
	EOperation getNode__AdaptAsRdfLiteralNode();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#adaptAsNeoElementNode() <em>Adapt As Neo Element Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adapt As Neo Element Node</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#adaptAsNeoElementNode()
	 * @generated
	 */
	EOperation getNode__AdaptAsNeoElementNode();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#adaptAsNeoPropertyNode() <em>Adapt As Neo Property Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adapt As Neo Property Node</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#adaptAsNeoPropertyNode()
	 * @generated
	 */
	EOperation getNode__AdaptAsNeoPropertyNode();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#inJavaReturnRequired() <em>In Java Return Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>In Java Return Required</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#inJavaReturnRequired()
	 * @generated
	 */
	EOperation getNode__InJavaReturnRequired();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#inJavaGraphReturnRequired() <em>In Java Graph Return Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>In Java Graph Return Required</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#inJavaGraphReturnRequired()
	 * @generated
	 */
	EOperation getNode__InJavaGraphReturnRequired();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#inJavaWhere() <em>In Java Where</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>In Java Where</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#inJavaWhere()
	 * @generated
	 */
	EOperation getNode__InJavaWhere();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveNullCheck() <em>Add Primitive Null Check</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Null Check</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveNullCheck()
	 * @generated
	 */
	EOperation getNode__AddPrimitiveNullCheck();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveNullCheck(java.lang.Boolean) <em>Add Primitive Null Check</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Null Check</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveNullCheck(java.lang.Boolean)
	 * @generated
	 */
	EOperation getNode__AddPrimitiveNullCheck__Boolean();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveValidateLink() <em>Add Primitive Validate Link</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Validate Link</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveValidateLink()
	 * @generated
	 */
	EOperation getNode__AddPrimitiveValidateLink();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveStringLength() <em>Add Primitive String Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive String Length</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveStringLength()
	 * @generated
	 */
	EOperation getNode__AddPrimitiveStringLength();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveStringLength(qualitypatternmodel.operators.ComparisonOperator, java.lang.Double) <em>Add Primitive String Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive String Length</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveStringLength(qualitypatternmodel.operators.ComparisonOperator, java.lang.Double)
	 * @generated
	 */
	EOperation getNode__AddPrimitiveStringLength__ComparisonOperator_Double();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#checkComparisonConsistency() <em>Check Comparison Consistency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Comparison Consistency</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#checkComparisonConsistency()
	 * @generated
	 */
	EOperation getNode__CheckComparisonConsistency();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Node#getRelationsTo(qualitypatternmodel.graphstructure.Node) <em>Get Relations To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Relations To</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Node#getRelationsTo(qualitypatternmodel.graphstructure.Node)
	 * @generated
	 */
	EOperation getNode__GetRelationsTo__Node();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.graphstructure.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.graphstructure.Graph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph#getNodes()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Nodes();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.Graph#getOutgoingMorphisms <em>Outgoing Morphisms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Morphisms</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph#getOutgoingMorphisms()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_OutgoingMorphisms();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.Graph#getIncomingMorphism <em>Incoming Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming Morphism</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph#getIncomingMorphism()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_IncomingMorphism();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.graphstructure.Graph#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph#getRelations()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Relations();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.graphstructure.Graph#getOperatorList <em>Operator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator List</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph#getOperatorList()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_OperatorList();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.graphstructure.Graph#getQuantifiedCondition <em>Quantified Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Quantified Condition</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph#getQuantifiedCondition()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_QuantifiedCondition();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.graphstructure.Graph#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph#getPattern()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Pattern();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#isReturnGraph() <em>Is Return Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Return Graph</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#isReturnGraph()
	 * @generated
	 */
	EOperation getGraph__IsReturnGraph();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#addRelation(qualitypatternmodel.graphstructure.ComplexNode, qualitypatternmodel.graphstructure.Node) <em>Add Relation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Relation</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#addRelation(qualitypatternmodel.graphstructure.ComplexNode, qualitypatternmodel.graphstructure.Node)
	 * @generated
	 */
	EOperation getGraph__AddRelation__ComplexNode_Node();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#addNode() <em>Add Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Node</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#addNode()
	 * @generated
	 */
	EOperation getGraph__AddNode();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#addComplexNode() <em>Add Complex Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Complex Node</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#addComplexNode()
	 * @generated
	 */
	EOperation getGraph__AddComplexNode();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#addPrimitiveNode() <em>Add Primitive Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Node</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#addPrimitiveNode()
	 * @generated
	 */
	EOperation getGraph__AddPrimitiveNode();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#generateCypherWhere() <em>Generate Cypher Where</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Cypher Where</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#generateCypherWhere()
	 * @generated
	 */
	EOperation getGraph__GenerateCypherWhere();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#getAllSubGraphs() <em>Get All Sub Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Sub Graphs</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#getAllSubGraphs()
	 * @generated
	 */
	EOperation getGraph__GetAllSubGraphs();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#isBefore(qualitypatternmodel.graphstructure.Graph) <em>Is Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Before</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#isBefore(qualitypatternmodel.graphstructure.Graph)
	 * @generated
	 */
	EOperation getGraph__IsBefore__Graph();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#getNodesFromAllPreviousGraphs() <em>Get Nodes From All Previous Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes From All Previous Graphs</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#getNodesFromAllPreviousGraphs()
	 * @generated
	 */
	EOperation getGraph__GetNodesFromAllPreviousGraphs();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#getRelationsFromAllPreviousGraphs() <em>Get Relations From All Previous Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Relations From All Previous Graphs</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#getRelationsFromAllPreviousGraphs()
	 * @generated
	 */
	EOperation getGraph__GetRelationsFromAllPreviousGraphs();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#getReturnNodes() <em>Get Return Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Return Nodes</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#getReturnNodes()
	 * @generated
	 */
	EOperation getGraph__GetReturnNodes();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.graphstructure.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable</em>'.
	 * @see qualitypatternmodel.graphstructure.Comparable
	 * @generated
	 */
	EClass getComparable();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.Comparable#getComparison1 <em>Comparison1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comparison1</em>'.
	 * @see qualitypatternmodel.graphstructure.Comparable#getComparison1()
	 * @see #getComparable()
	 * @generated
	 */
	EReference getComparable_Comparison1();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.Comparable#getComparison2 <em>Comparison2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comparison2</em>'.
	 * @see qualitypatternmodel.graphstructure.Comparable#getComparison2()
	 * @see #getComparable()
	 * @generated
	 */
	EReference getComparable_Comparison2();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Comparable#getReturnType() <em>Get Return Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Return Type</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Comparable#getReturnType()
	 * @generated
	 */
	EOperation getComparable__GetReturnType();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Comparable#isTranslatable() <em>Is Translatable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Translatable</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Comparable#isTranslatable()
	 * @generated
	 */
	EOperation getComparable__IsTranslatable();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Comparable#getAllArgumentElements() <em>Get All Argument Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Argument Elements</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Comparable#getAllArgumentElements()
	 * @generated
	 */
	EOperation getComparable__GetAllArgumentElements();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Comparable#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Comparable#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComparable__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Comparable#isOperatorArgument() <em>Is Operator Argument</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Operator Argument</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Comparable#isOperatorArgument()
	 * @generated
	 */
	EOperation getComparable__IsOperatorArgument();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Comparable#addComparison(qualitypatternmodel.graphstructure.Comparable) <em>Add Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Comparison</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Comparable#addComparison(qualitypatternmodel.graphstructure.Comparable)
	 * @generated
	 */
	EOperation getComparable__AddComparison__Comparable();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.graphstructure.Adaptable <em>Adaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptable</em>'.
	 * @see qualitypatternmodel.graphstructure.Adaptable
	 * @generated
	 */
	EClass getAdaptable();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Adaptable#removeParametersFromParameterList() <em>Remove Parameters From Parameter List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Adaptable#removeParametersFromParameterList()
	 * @generated
	 */
	EOperation getAdaptable__RemoveParametersFromParameterList();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Adaptable#createParameters() <em>Create Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Parameters</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Adaptable#createParameters()
	 * @generated
	 */
	EOperation getAdaptable__CreateParameters();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.graphstructure.ComplexNode <em>Complex Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Node</em>'.
	 * @see qualitypatternmodel.graphstructure.ComplexNode
	 * @generated
	 */
	EClass getComplexNode();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.ComplexNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see qualitypatternmodel.graphstructure.ComplexNode#getOutgoing()
	 * @see #getComplexNode()
	 * @generated
	 */
	EReference getComplexNode_Outgoing();

	/**
	 * Returns the meta object for enum '{@link qualitypatternmodel.graphstructure.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Return Type</em>'.
	 * @see qualitypatternmodel.graphstructure.ReturnType
	 * @generated
	 */
	EEnum getReturnType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphstructureFactory getGraphstructureFactory();

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
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.impl.RelationImpl
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__GRAPH = eINSTANCE.getRelation_Graph();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SOURCE = eINSTANCE.getRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TARGET = eINSTANCE.getRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__TRANSLATED = eINSTANCE.getRelation_Translated();

		/**
		 * The meta object literal for the '<em><b>Predicates Are Being Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__PREDICATES_ARE_BEING_TRANSLATED = eINSTANCE.getRelation_PredicatesAreBeingTranslated();

		/**
		 * The meta object literal for the '<em><b>Adapt As Xml Element Navigation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___ADAPT_AS_XML_ELEMENT_NAVIGATION = eINSTANCE.getRelation__AdaptAsXmlElementNavigation();

		/**
		 * The meta object literal for the '<em><b>Adapt As Xml Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___ADAPT_AS_XML_REFERENCE = eINSTANCE.getRelation__AdaptAsXmlReference();

		/**
		 * The meta object literal for the '<em><b>Adapt As Rdf Predicate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___ADAPT_AS_RDF_PREDICATE = eINSTANCE.getRelation__AdaptAsRdfPredicate();

		/**
		 * The meta object literal for the '<em><b>Adapt As Neo Element Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___ADAPT_AS_NEO_ELEMENT_EDGE = eINSTANCE.getRelation__AdaptAsNeoElementEdge();

		/**
		 * The meta object literal for the '<em><b>Adapt As Property Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___ADAPT_AS_PROPERTY_EDGE = eINSTANCE.getRelation__AdaptAsPropertyEdge();

		/**
		 * The meta object literal for the '<em><b>In Java Return Required</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___IN_JAVA_RETURN_REQUIRED = eINSTANCE.getRelation__InJavaReturnRequired();

		/**
		 * The meta object literal for the '<em><b>Set Graph Simple</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___SET_GRAPH_SIMPLE__GRAPH = eINSTANCE.getRelation__SetGraphSimple__Graph();

		/**
		 * The meta object literal for the '<em><b>Is Cross Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___IS_CROSS_GRAPH = eINSTANCE.getRelation__IsCrossGraph();

		/**
		 * The meta object literal for the '<em><b>Adapt As Xml Property Navigation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___ADAPT_AS_XML_PROPERTY_NAVIGATION = eINSTANCE.getRelation__AdaptAsXmlPropertyNavigation();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl <em>Primitive Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getPrimitiveNode()
		 * @generated
		 */
		EClass PRIMITIVE_NODE = eINSTANCE.getPrimitiveNode();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_NODE__MATCH = eINSTANCE.getPrimitiveNode_Match();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_NODE__CONTAINS = eINSTANCE.getPrimitiveNode_Contains();

		/**
		 * The meta object literal for the '<em><b>Null Check</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_NODE__NULL_CHECK = eINSTANCE.getPrimitiveNode_NullCheck();

		/**
		 * The meta object literal for the '<em><b>String Length</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_NODE__STRING_LENGTH = eINSTANCE.getPrimitiveNode_StringLength();

		/**
		 * The meta object literal for the '<em><b>One Arg Java Operator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_NODE__ONE_ARG_JAVA_OPERATOR = eINSTANCE.getPrimitiveNode_OneArgJavaOperator();

		/**
		 * The meta object literal for the '<em><b>Two Arg Java Operator1</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR1 = eINSTANCE.getPrimitiveNode_TwoArgJavaOperator1();

		/**
		 * The meta object literal for the '<em><b>Two Arg Java Operator2</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR2 = eINSTANCE.getPrimitiveNode_TwoArgJavaOperator2();

		/**
		 * The meta object literal for the '<em><b>Check Comparison Consistency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY__PARAMETERVALUE = eINSTANCE.getPrimitiveNode__CheckComparisonConsistency__ParameterValue();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.impl.NodeImpl
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__GRAPH = eINSTANCE.getNode_Graph();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__TRANSLATED = eINSTANCE.getNode_Translated();

		/**
		 * The meta object literal for the '<em><b>Predicates Are Being Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PREDICATES_ARE_BEING_TRANSLATED = eINSTANCE.getNode_PredicatesAreBeingTranslated();

		/**
		 * The meta object literal for the '<em><b>Predicates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PREDICATES = eINSTANCE.getNode_Predicates();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Type Modifiable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__TYPE_MODIFIABLE = eINSTANCE.getNode_TypeModifiable();

		/**
		 * The meta object literal for the '<em><b>Return Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__RETURN_NODE = eINSTANCE.getNode_ReturnNode();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Match</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_PRIMITIVE_MATCH__STRING = eINSTANCE.getNode__AddPrimitiveMatch__String();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_PRIMITIVE_CONTAINS = eINSTANCE.getNode__AddPrimitiveContains();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_PRIMITIVE_CONTAINS__STRING = eINSTANCE.getNode__AddPrimitiveContains__String();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Comparison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_PRIMITIVE_COMPARISON__STRING = eINSTANCE.getNode__AddPrimitiveComparison__String();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Match</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_PRIMITIVE_MATCH = eINSTANCE.getNode__AddPrimitiveMatch();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Comparison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_PRIMITIVE_COMPARISON = eINSTANCE.getNode__AddPrimitiveComparison();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Comparison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE = eINSTANCE.getNode__AddPrimitiveComparison__ComparisonOperator_ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Comparison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE = eINSTANCE.getNode__AddPrimitiveComparison__ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Set Graph Simple</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___SET_GRAPH_SIMPLE__GRAPH = eINSTANCE.getNode__SetGraphSimple__Graph();

		/**
		 * The meta object literal for the '<em><b>Check Comparison Consistency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON = eINSTANCE.getNode__CheckComparisonConsistency__Comparison();

		/**
		 * The meta object literal for the '<em><b>Make Primitive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___MAKE_PRIMITIVE = eINSTANCE.getNode__MakePrimitive();

		/**
		 * The meta object literal for the '<em><b>Make Complex</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___MAKE_COMPLEX = eINSTANCE.getNode__MakeComplex();

		/**
		 * The meta object literal for the '<em><b>Add Outgoing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_OUTGOING = eINSTANCE.getNode__AddOutgoing();

		/**
		 * The meta object literal for the '<em><b>Add Outgoing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_OUTGOING__GRAPH = eINSTANCE.getNode__AddOutgoing__Graph();

		/**
		 * The meta object literal for the '<em><b>Add Outgoing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_OUTGOING__NODE = eINSTANCE.getNode__AddOutgoing__Node();

		/**
		 * The meta object literal for the '<em><b>Make Generic</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___MAKE_GENERIC = eINSTANCE.getNode__MakeGeneric();

		/**
		 * The meta object literal for the '<em><b>Check Generic</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___CHECK_GENERIC = eINSTANCE.getNode__CheckGeneric();

		/**
		 * The meta object literal for the '<em><b>Check Primitive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___CHECK_PRIMITIVE = eINSTANCE.getNode__CheckPrimitive();

		/**
		 * The meta object literal for the '<em><b>Check Complex</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___CHECK_COMPLEX = eINSTANCE.getNode__CheckComplex();

		/**
		 * The meta object literal for the '<em><b>Add Incomming</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_INCOMMING__COMPLEXNODE = eINSTANCE.getNode__AddIncomming__ComplexNode();

		/**
		 * The meta object literal for the '<em><b>Adapt As Xml Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADAPT_AS_XML_ELEMENT = eINSTANCE.getNode__AdaptAsXmlElement();

		/**
		 * The meta object literal for the '<em><b>Adapt As Xml Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADAPT_AS_XML_PROPERTY = eINSTANCE.getNode__AdaptAsXmlProperty();

		/**
		 * The meta object literal for the '<em><b>Adapt As Rdf Iri Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADAPT_AS_RDF_IRI_NODE = eINSTANCE.getNode__AdaptAsRdfIriNode();

		/**
		 * The meta object literal for the '<em><b>Adapt As Rdf Literal Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADAPT_AS_RDF_LITERAL_NODE = eINSTANCE.getNode__AdaptAsRdfLiteralNode();

		/**
		 * The meta object literal for the '<em><b>Adapt As Neo Element Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADAPT_AS_NEO_ELEMENT_NODE = eINSTANCE.getNode__AdaptAsNeoElementNode();

		/**
		 * The meta object literal for the '<em><b>Adapt As Neo Property Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADAPT_AS_NEO_PROPERTY_NODE = eINSTANCE.getNode__AdaptAsNeoPropertyNode();

		/**
		 * The meta object literal for the '<em><b>In Java Return Required</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___IN_JAVA_RETURN_REQUIRED = eINSTANCE.getNode__InJavaReturnRequired();

		/**
		 * The meta object literal for the '<em><b>In Java Graph Return Required</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___IN_JAVA_GRAPH_RETURN_REQUIRED = eINSTANCE.getNode__InJavaGraphReturnRequired();

		/**
		 * The meta object literal for the '<em><b>In Java Where</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___IN_JAVA_WHERE = eINSTANCE.getNode__InJavaWhere();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Null Check</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_PRIMITIVE_NULL_CHECK = eINSTANCE.getNode__AddPrimitiveNullCheck();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Null Check</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN = eINSTANCE.getNode__AddPrimitiveNullCheck__Boolean();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Validate Link</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_PRIMITIVE_VALIDATE_LINK = eINSTANCE.getNode__AddPrimitiveValidateLink();

		/**
		 * The meta object literal for the '<em><b>Add Primitive String Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_PRIMITIVE_STRING_LENGTH = eINSTANCE.getNode__AddPrimitiveStringLength();

		/**
		 * The meta object literal for the '<em><b>Add Primitive String Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE = eINSTANCE.getNode__AddPrimitiveStringLength__ComparisonOperator_Double();

		/**
		 * The meta object literal for the '<em><b>Check Comparison Consistency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___CHECK_COMPARISON_CONSISTENCY = eINSTANCE.getNode__CheckComparisonConsistency();

		/**
		 * The meta object literal for the '<em><b>Get Relations To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_RELATIONS_TO__NODE = eINSTANCE.getNode__GetRelationsTo__Node();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.impl.GraphImpl
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__NODES = eINSTANCE.getGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>Outgoing Morphisms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__OUTGOING_MORPHISMS = eINSTANCE.getGraph_OutgoingMorphisms();

		/**
		 * The meta object literal for the '<em><b>Incoming Morphism</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__INCOMING_MORPHISM = eINSTANCE.getGraph_IncomingMorphism();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__RELATIONS = eINSTANCE.getGraph_Relations();

		/**
		 * The meta object literal for the '<em><b>Operator List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__OPERATOR_LIST = eINSTANCE.getGraph_OperatorList();

		/**
		 * The meta object literal for the '<em><b>Quantified Condition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__QUANTIFIED_CONDITION = eINSTANCE.getGraph_QuantifiedCondition();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__PATTERN = eINSTANCE.getGraph_Pattern();

		/**
		 * The meta object literal for the '<em><b>Is Return Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___IS_RETURN_GRAPH = eINSTANCE.getGraph__IsReturnGraph();

		/**
		 * The meta object literal for the '<em><b>Add Relation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ADD_RELATION__COMPLEXNODE_NODE = eINSTANCE.getGraph__AddRelation__ComplexNode_Node();

		/**
		 * The meta object literal for the '<em><b>Add Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ADD_NODE = eINSTANCE.getGraph__AddNode();

		/**
		 * The meta object literal for the '<em><b>Add Complex Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ADD_COMPLEX_NODE = eINSTANCE.getGraph__AddComplexNode();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ADD_PRIMITIVE_NODE = eINSTANCE.getGraph__AddPrimitiveNode();

		/**
		 * The meta object literal for the '<em><b>Generate Cypher Where</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GENERATE_CYPHER_WHERE = eINSTANCE.getGraph__GenerateCypherWhere();

		/**
		 * The meta object literal for the '<em><b>Get All Sub Graphs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_ALL_SUB_GRAPHS = eINSTANCE.getGraph__GetAllSubGraphs();

		/**
		 * The meta object literal for the '<em><b>Is Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___IS_BEFORE__GRAPH = eINSTANCE.getGraph__IsBefore__Graph();

		/**
		 * The meta object literal for the '<em><b>Get Nodes From All Previous Graphs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_NODES_FROM_ALL_PREVIOUS_GRAPHS = eINSTANCE.getGraph__GetNodesFromAllPreviousGraphs();

		/**
		 * The meta object literal for the '<em><b>Get Relations From All Previous Graphs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_RELATIONS_FROM_ALL_PREVIOUS_GRAPHS = eINSTANCE.getGraph__GetRelationsFromAllPreviousGraphs();

		/**
		 * The meta object literal for the '<em><b>Get Return Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_RETURN_NODES = eINSTANCE.getGraph__GetReturnNodes();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.Comparable <em>Comparable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.Comparable
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getComparable()
		 * @generated
		 */
		EClass COMPARABLE = eINSTANCE.getComparable();

		/**
		 * The meta object literal for the '<em><b>Comparison1</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARABLE__COMPARISON1 = eINSTANCE.getComparable_Comparison1();

		/**
		 * The meta object literal for the '<em><b>Comparison2</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARABLE__COMPARISON2 = eINSTANCE.getComparable_Comparison2();

		/**
		 * The meta object literal for the '<em><b>Get Return Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARABLE___GET_RETURN_TYPE = eINSTANCE.getComparable__GetReturnType();

		/**
		 * The meta object literal for the '<em><b>Is Translatable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARABLE___IS_TRANSLATABLE = eINSTANCE.getComparable__IsTranslatable();

		/**
		 * The meta object literal for the '<em><b>Get All Argument Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARABLE___GET_ALL_ARGUMENT_ELEMENTS = eINSTANCE.getComparable__GetAllArgumentElements();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARABLE___VALIDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComparable__Validate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Is Operator Argument</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARABLE___IS_OPERATOR_ARGUMENT = eINSTANCE.getComparable__IsOperatorArgument();

		/**
		 * The meta object literal for the '<em><b>Add Comparison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARABLE___ADD_COMPARISON__COMPARABLE = eINSTANCE.getComparable__AddComparison__Comparable();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.Adaptable <em>Adaptable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.Adaptable
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getAdaptable()
		 * @generated
		 */
		EClass ADAPTABLE = eINSTANCE.getAdaptable();

		/**
		 * The meta object literal for the '<em><b>Remove Parameters From Parameter List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = eINSTANCE.getAdaptable__RemoveParametersFromParameterList();

		/**
		 * The meta object literal for the '<em><b>Create Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADAPTABLE___CREATE_PARAMETERS = eINSTANCE.getAdaptable__CreateParameters();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.impl.ComplexNodeImpl <em>Complex Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.impl.ComplexNodeImpl
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getComplexNode()
		 * @generated
		 */
		EClass COMPLEX_NODE = eINSTANCE.getComplexNode();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_NODE__OUTGOING = eINSTANCE.getComplexNode_Outgoing();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.ReturnType <em>Return Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.ReturnType
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getReturnType()
		 * @generated
		 */
		EEnum RETURN_TYPE = eINSTANCE.getReturnType();

	}

} //GraphstructurePackage

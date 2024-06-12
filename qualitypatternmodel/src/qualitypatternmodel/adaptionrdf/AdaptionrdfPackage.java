/**
 */
package qualitypatternmodel.adaptionrdf;

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
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfFactory
 * @model kind="package"
 * @generated
 */
public interface AdaptionrdfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adaptionrdf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "adaptionrdf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adaptionrdf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptionrdfPackage eINSTANCE = qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfPredicateImpl <em>Rdf Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionrdf.impl.RdfPredicateImpl
	 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfPredicate()
	 * @generated
	 */
	int RDF_PREDICATE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE__ID = GraphstructurePackage.RELATION__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE__INTERNAL_ID = GraphstructurePackage.RELATION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE__GRAPH = GraphstructurePackage.RELATION__GRAPH;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE__SOURCE = GraphstructurePackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE__TARGET = GraphstructurePackage.RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE__NAME = GraphstructurePackage.RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE__TRANSLATED = GraphstructurePackage.RELATION__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE__PREDICATES_ARE_BEING_TRANSLATED = GraphstructurePackage.RELATION__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Rdf Path Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE__RDF_PATH_PARAM = GraphstructurePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rdf Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE_FEATURE_COUNT = GraphstructurePackage.RELATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.RELATION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.RELATION___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.RELATION___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___MY_TO_STRING = GraphstructurePackage.RELATION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___GENERATE_CYPHER = GraphstructurePackage.RELATION___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___GENERATE_XQUERY = GraphstructurePackage.RELATION___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___GENERATE_SPARQL = GraphstructurePackage.RELATION___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___GET_CONTAINER = GraphstructurePackage.RELATION___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___GET_ANCESTOR__CLASS = GraphstructurePackage.RELATION___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___INITIALIZE_TRANSLATION = GraphstructurePackage.RELATION___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___PREPARE_TRANSLATION = GraphstructurePackage.RELATION___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___GET_OPERATOR_LIST = GraphstructurePackage.RELATION___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___GET_ALL_OPERATORS = GraphstructurePackage.RELATION___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___GET_PARAMETER_LIST = GraphstructurePackage.RELATION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___GET_ALL_PARAMETERS = GraphstructurePackage.RELATION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.RELATION___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.RELATION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___RECORD_VALUES__XMLDATADATABASE = GraphstructurePackage.RELATION___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___RELATIONS_XML_ADAPTED = GraphstructurePackage.RELATION___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___CREATE_XML_ADAPTION = GraphstructurePackage.RELATION___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___CREATE_RDF_ADAPTION = GraphstructurePackage.RELATION___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___CREATE_NEO4J_ADAPTION = GraphstructurePackage.RELATION___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___CONTAINS_JAVA_OPERATOR = GraphstructurePackage.RELATION___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___GENERATE_QUERY_FILTER_PART = GraphstructurePackage.RELATION___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___GENERATE_XQUERY_JAVA = GraphstructurePackage.RELATION___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___GENERATE_XQUERY_JAVA_RETURN = GraphstructurePackage.RELATION___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___CREATE_PARAMETERS = GraphstructurePackage.RELATION___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.RELATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.RELATION___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Is Cross Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___IS_CROSS_GRAPH = GraphstructurePackage.RELATION___IS_CROSS_GRAPH;

	/**
	 * The operation id for the '<em>Adapt As Xml Element Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___ADAPT_AS_XML_ELEMENT_NAVIGATION = GraphstructurePackage.RELATION___ADAPT_AS_XML_ELEMENT_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Property Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___ADAPT_AS_XML_PROPERTY_NAVIGATION = GraphstructurePackage.RELATION___ADAPT_AS_XML_PROPERTY_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___ADAPT_AS_XML_REFERENCE = GraphstructurePackage.RELATION___ADAPT_AS_XML_REFERENCE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Predicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___ADAPT_AS_RDF_PREDICATE = GraphstructurePackage.RELATION___ADAPT_AS_RDF_PREDICATE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___ADAPT_AS_NEO_ELEMENT_EDGE = GraphstructurePackage.RELATION___ADAPT_AS_NEO_ELEMENT_EDGE;

	/**
	 * The operation id for the '<em>Adapt As Property Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___ADAPT_AS_PROPERTY_EDGE = GraphstructurePackage.RELATION___ADAPT_AS_PROPERTY_EDGE;

	/**
	 * The operation id for the '<em>In Java Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE___IN_JAVA_RETURN_REQUIRED = GraphstructurePackage.RELATION___IN_JAVA_RETURN_REQUIRED;

	/**
	 * The number of operations of the '<em>Rdf Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE_OPERATION_COUNT = GraphstructurePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfIriNodeImpl <em>Rdf Iri Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionrdf.impl.RdfIriNodeImpl
	 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfIriNode()
	 * @generated
	 */
	int RDF_IRI_NODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE__ID = GraphstructurePackage.COMPLEX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE__INTERNAL_ID = GraphstructurePackage.COMPLEX_NODE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE__COMPARISON1 = GraphstructurePackage.COMPLEX_NODE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE__COMPARISON2 = GraphstructurePackage.COMPLEX_NODE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE__GRAPH = GraphstructurePackage.COMPLEX_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE__NAME = GraphstructurePackage.COMPLEX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE__PREDICATES = GraphstructurePackage.COMPLEX_NODE__PREDICATES;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE__INCOMING = GraphstructurePackage.COMPLEX_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Return Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE__RETURN_NODE = GraphstructurePackage.COMPLEX_NODE__RETURN_NODE;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE__TYPE_MODIFIABLE = GraphstructurePackage.COMPLEX_NODE__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE__TRANSLATED = GraphstructurePackage.COMPLEX_NODE__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE__PREDICATES_ARE_BEING_TRANSLATED = GraphstructurePackage.COMPLEX_NODE__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE__OUTGOING = GraphstructurePackage.COMPLEX_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Rdf Iri Node Types</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE__RDF_IRI_NODE_TYPES = GraphstructurePackage.COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rdf Iri Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE_FEATURE_COUNT = GraphstructurePackage.COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.COMPLEX_NODE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.COMPLEX_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___MY_TO_STRING = GraphstructurePackage.COMPLEX_NODE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GENERATE_CYPHER = GraphstructurePackage.COMPLEX_NODE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GENERATE_XQUERY = GraphstructurePackage.COMPLEX_NODE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GENERATE_SPARQL = GraphstructurePackage.COMPLEX_NODE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GET_CONTAINER = GraphstructurePackage.COMPLEX_NODE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GET_ANCESTOR__CLASS = GraphstructurePackage.COMPLEX_NODE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___INITIALIZE_TRANSLATION = GraphstructurePackage.COMPLEX_NODE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___PREPARE_TRANSLATION = GraphstructurePackage.COMPLEX_NODE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GET_OPERATOR_LIST = GraphstructurePackage.COMPLEX_NODE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GET_ALL_OPERATORS = GraphstructurePackage.COMPLEX_NODE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GET_PARAMETER_LIST = GraphstructurePackage.COMPLEX_NODE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GET_ALL_PARAMETERS = GraphstructurePackage.COMPLEX_NODE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.COMPLEX_NODE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.COMPLEX_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.COMPLEX_NODE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.COMPLEX_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___RECORD_VALUES__XMLDATADATABASE = GraphstructurePackage.COMPLEX_NODE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___RELATIONS_XML_ADAPTED = GraphstructurePackage.COMPLEX_NODE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___CREATE_XML_ADAPTION = GraphstructurePackage.COMPLEX_NODE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___CREATE_RDF_ADAPTION = GraphstructurePackage.COMPLEX_NODE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___CREATE_NEO4J_ADAPTION = GraphstructurePackage.COMPLEX_NODE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___CONTAINS_JAVA_OPERATOR = GraphstructurePackage.COMPLEX_NODE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GENERATE_QUERY_FILTER_PART = GraphstructurePackage.COMPLEX_NODE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GENERATE_XQUERY_JAVA = GraphstructurePackage.COMPLEX_NODE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GENERATE_XQUERY_JAVA_RETURN = GraphstructurePackage.COMPLEX_NODE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.COMPLEX_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GET_RETURN_TYPE = GraphstructurePackage.COMPLEX_NODE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___IS_TRANSLATABLE = GraphstructurePackage.COMPLEX_NODE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GET_ALL_ARGUMENT_ELEMENTS = GraphstructurePackage.COMPLEX_NODE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___IS_OPERATOR_ARGUMENT = GraphstructurePackage.COMPLEX_NODE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___CREATE_PARAMETERS = GraphstructurePackage.COMPLEX_NODE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.COMPLEX_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.COMPLEX_NODE___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Get Relations To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GET_RELATIONS_TO__NODE = GraphstructurePackage.COMPLEX_NODE___GET_RELATIONS_TO__NODE;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_OUTGOING = GraphstructurePackage.COMPLEX_NODE___ADD_OUTGOING;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_OUTGOING__GRAPH = GraphstructurePackage.COMPLEX_NODE___ADD_OUTGOING__GRAPH;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_OUTGOING__NODE = GraphstructurePackage.COMPLEX_NODE___ADD_OUTGOING__NODE;

	/**
	 * The operation id for the '<em>Add Incomming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_INCOMMING__COMPLEXNODE = GraphstructurePackage.COMPLEX_NODE___ADD_INCOMMING__COMPLEXNODE;

	/**
	 * The operation id for the '<em>Add Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_COMPARISON__NODE = GraphstructurePackage.COMPLEX_NODE___ADD_COMPARISON__NODE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_PRIMITIVE_COMPARISON = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_PRIMITIVE_COMPARISON__STRING = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_PRIMITIVE_MATCH = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_MATCH;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_PRIMITIVE_MATCH__STRING = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_MATCH__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_PRIMITIVE_CONTAINS = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_CONTAINS;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_PRIMITIVE_CONTAINS__STRING = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_CONTAINS__STRING;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_PRIMITIVE_STRING_LENGTH = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_STRING_LENGTH;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_PRIMITIVE_NULL_CHECK = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_NULL_CHECK;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN;

	/**
	 * The operation id for the '<em>Add Primitive Validate Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADD_PRIMITIVE_VALIDATE_LINK = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_VALIDATE_LINK;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___CHECK_COMPARISON_CONSISTENCY = GraphstructurePackage.COMPLEX_NODE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON = GraphstructurePackage.COMPLEX_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON;

	/**
	 * The operation id for the '<em>Check Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___CHECK_GENERIC = GraphstructurePackage.COMPLEX_NODE___CHECK_GENERIC;

	/**
	 * The operation id for the '<em>Make Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___MAKE_GENERIC = GraphstructurePackage.COMPLEX_NODE___MAKE_GENERIC;

	/**
	 * The operation id for the '<em>Check Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___CHECK_COMPLEX = GraphstructurePackage.COMPLEX_NODE___CHECK_COMPLEX;

	/**
	 * The operation id for the '<em>Make Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___MAKE_COMPLEX = GraphstructurePackage.COMPLEX_NODE___MAKE_COMPLEX;

	/**
	 * The operation id for the '<em>Check Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___CHECK_PRIMITIVE = GraphstructurePackage.COMPLEX_NODE___CHECK_PRIMITIVE;

	/**
	 * The operation id for the '<em>Make Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___MAKE_PRIMITIVE = GraphstructurePackage.COMPLEX_NODE___MAKE_PRIMITIVE;

	/**
	 * The operation id for the '<em>Adapt As Xml Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADAPT_AS_XML_ELEMENT = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_XML_ELEMENT;

	/**
	 * The operation id for the '<em>Adapt As Xml Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADAPT_AS_XML_PROPERTY = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_XML_PROPERTY;

	/**
	 * The operation id for the '<em>Adapt As Rdf Iri Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADAPT_AS_RDF_IRI_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_RDF_IRI_NODE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Literal Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADAPT_AS_RDF_LITERAL_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_RDF_LITERAL_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADAPT_AS_NEO_ELEMENT_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_NEO_ELEMENT_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Property Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___ADAPT_AS_NEO_PROPERTY_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_NEO_PROPERTY_NODE;

	/**
	 * The operation id for the '<em>In Java Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___IN_JAVA_RETURN_REQUIRED = GraphstructurePackage.COMPLEX_NODE___IN_JAVA_RETURN_REQUIRED;

	/**
	 * The operation id for the '<em>In Java Graph Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___IN_JAVA_GRAPH_RETURN_REQUIRED = GraphstructurePackage.COMPLEX_NODE___IN_JAVA_GRAPH_RETURN_REQUIRED;

	/**
	 * The operation id for the '<em>In Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___IN_JAVA_WHERE = GraphstructurePackage.COMPLEX_NODE___IN_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Generate Rdf Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE___GENERATE_RDF_TYPES = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rdf Iri Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_IRI_NODE_OPERATION_COUNT = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfPathComponentImpl <em>Rdf Path Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionrdf.impl.RdfPathComponentImpl
	 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfPathComponent()
	 * @generated
	 */
	int RDF_PATH_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT__ID = PatternstructurePackage.PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT__INTERNAL_ID = PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Invert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT__INVERT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT__QUANTIFIER = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rdf Path Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___IS_VALID__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___MY_TO_STRING = PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___GENERATE_CYPHER = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___GENERATE_XQUERY = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___GENERATE_SPARQL = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___GET_CONTAINER = PatternstructurePackage.PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___GET_ANCESTOR__CLASS = PatternstructurePackage.PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___INITIALIZE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___GET_OPERATOR_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___GET_ALL_OPERATORS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___GET_PARAMETER_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___GET_ALL_PARAMETERS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___PREPARE_PARAMETER_UPDATES = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___UPDATE_PARAMETERS__PARAMETERLIST = PatternstructurePackage.PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___RECORD_VALUES__XMLDATADATABASE = PatternstructurePackage.PATTERN_ELEMENT___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___RELATIONS_XML_ADAPTED = PatternstructurePackage.PATTERN_ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___CREATE_XML_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___CREATE_RDF_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___CREATE_NEO4J_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___CONTAINS_JAVA_OPERATOR = PatternstructurePackage.PATTERN_ELEMENT___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___GENERATE_QUERY_FILTER_PART = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___GENERATE_XQUERY_JAVA = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___GENERATE_XQUERY_JAVA_RETURN = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Get Rdf Single Predicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___GET_RDF_SINGLE_PREDICATES = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___GET_VALUE_AS_STRING = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT___SET_VALUE_FROM_STRING__STRING = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rdf Path Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_COMPONENT_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfPathParamImpl <em>Rdf Path Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionrdf.impl.RdfPathParamImpl
	 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfPathParam()
	 * @generated
	 */
	int RDF_PATH_PARAM = 10;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfSinglePredicateImpl <em>Rdf Single Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionrdf.impl.RdfSinglePredicateImpl
	 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfSinglePredicate()
	 * @generated
	 */
	int RDF_SINGLE_PREDICATE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE__ID = RDF_PATH_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE__INTERNAL_ID = RDF_PATH_COMPONENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Invert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE__INVERT = RDF_PATH_COMPONENT__INVERT;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE__QUANTIFIER = RDF_PATH_COMPONENT__QUANTIFIER;

	/**
	 * The feature id for the '<em><b>Iri Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE__IRI_PARAM = RDF_PATH_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rdf Single Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE_FEATURE_COUNT = RDF_PATH_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___VALIDATE__DIAGNOSTICCHAIN_MAP = RDF_PATH_COMPONENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___IS_VALID__ABSTRACTIONLEVEL = RDF_PATH_COMPONENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = RDF_PATH_COMPONENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___MY_TO_STRING = RDF_PATH_COMPONENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___GENERATE_CYPHER = RDF_PATH_COMPONENT___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___GENERATE_XQUERY = RDF_PATH_COMPONENT___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___GENERATE_SPARQL = RDF_PATH_COMPONENT___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___GET_CONTAINER = RDF_PATH_COMPONENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___GET_ANCESTOR__CLASS = RDF_PATH_COMPONENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___INITIALIZE_TRANSLATION = RDF_PATH_COMPONENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___PREPARE_TRANSLATION = RDF_PATH_COMPONENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___GET_OPERATOR_LIST = RDF_PATH_COMPONENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___GET_ALL_OPERATORS = RDF_PATH_COMPONENT___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___GET_PARAMETER_LIST = RDF_PATH_COMPONENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___GET_ALL_PARAMETERS = RDF_PATH_COMPONENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___PREPARE_PARAMETER_UPDATES = RDF_PATH_COMPONENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = RDF_PATH_COMPONENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___UPDATE_PARAMETERS__PARAMETERLIST = RDF_PATH_COMPONENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = RDF_PATH_COMPONENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___RECORD_VALUES__XMLDATADATABASE = RDF_PATH_COMPONENT___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___RELATIONS_XML_ADAPTED = RDF_PATH_COMPONENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___CREATE_XML_ADAPTION = RDF_PATH_COMPONENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___CREATE_RDF_ADAPTION = RDF_PATH_COMPONENT___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___CREATE_NEO4J_ADAPTION = RDF_PATH_COMPONENT___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___CONTAINS_JAVA_OPERATOR = RDF_PATH_COMPONENT___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___GENERATE_QUERY_FILTER_PART = RDF_PATH_COMPONENT___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___GENERATE_XQUERY_JAVA = RDF_PATH_COMPONENT___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___GENERATE_XQUERY_JAVA_RETURN = RDF_PATH_COMPONENT___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Get Rdf Single Predicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___GET_RDF_SINGLE_PREDICATES = RDF_PATH_COMPONENT___GET_RDF_SINGLE_PREDICATES;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___GET_VALUE_AS_STRING = RDF_PATH_COMPONENT___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE___SET_VALUE_FROM_STRING__STRING = RDF_PATH_COMPONENT___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The number of operations of the '<em>Rdf Single Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SINGLE_PREDICATE_OPERATION_COUNT = RDF_PATH_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionrdf.RdfNode <em>Rdf Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionrdf.RdfNode
	 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfNode()
	 * @generated
	 */
	int RDF_NODE = 4;

	/**
	 * The number of structural features of the '<em>Rdf Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_NODE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Generate Rdf Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_NODE___GENERATE_RDF_TYPES = 0;

	/**
	 * The number of operations of the '<em>Rdf Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_NODE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfLiteralNodeImpl <em>Rdf Literal Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionrdf.impl.RdfLiteralNodeImpl
	 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfLiteralNode()
	 * @generated
	 */
	int RDF_LITERAL_NODE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__ID = GraphstructurePackage.PRIMITIVE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__INTERNAL_ID = GraphstructurePackage.PRIMITIVE_NODE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__COMPARISON1 = GraphstructurePackage.PRIMITIVE_NODE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__COMPARISON2 = GraphstructurePackage.PRIMITIVE_NODE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__GRAPH = GraphstructurePackage.PRIMITIVE_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__NAME = GraphstructurePackage.PRIMITIVE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__PREDICATES = GraphstructurePackage.PRIMITIVE_NODE__PREDICATES;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__INCOMING = GraphstructurePackage.PRIMITIVE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Return Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__RETURN_NODE = GraphstructurePackage.PRIMITIVE_NODE__RETURN_NODE;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__TYPE_MODIFIABLE = GraphstructurePackage.PRIMITIVE_NODE__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__TRANSLATED = GraphstructurePackage.PRIMITIVE_NODE__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__PREDICATES_ARE_BEING_TRANSLATED = GraphstructurePackage.PRIMITIVE_NODE__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Match</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__MATCH = GraphstructurePackage.PRIMITIVE_NODE__MATCH;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__CONTAINS = GraphstructurePackage.PRIMITIVE_NODE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Null Check</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__NULL_CHECK = GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK;

	/**
	 * The feature id for the '<em><b>String Length</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__STRING_LENGTH = GraphstructurePackage.PRIMITIVE_NODE__STRING_LENGTH;

	/**
	 * The feature id for the '<em><b>One Arg Java Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__ONE_ARG_JAVA_OPERATOR = GraphstructurePackage.PRIMITIVE_NODE__ONE_ARG_JAVA_OPERATOR;

	/**
	 * The feature id for the '<em><b>Two Arg Java Operator1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__TWO_ARG_JAVA_OPERATOR1 = GraphstructurePackage.PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR1;

	/**
	 * The feature id for the '<em><b>Two Arg Java Operator2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE__TWO_ARG_JAVA_OPERATOR2 = GraphstructurePackage.PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR2;

	/**
	 * The number of structural features of the '<em>Rdf Literal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE_FEATURE_COUNT = GraphstructurePackage.PRIMITIVE_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.PRIMITIVE_NODE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.PRIMITIVE_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___MY_TO_STRING = GraphstructurePackage.PRIMITIVE_NODE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GENERATE_CYPHER = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GENERATE_XQUERY = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GENERATE_SPARQL = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GET_CONTAINER = GraphstructurePackage.PRIMITIVE_NODE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GET_ANCESTOR__CLASS = GraphstructurePackage.PRIMITIVE_NODE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___INITIALIZE_TRANSLATION = GraphstructurePackage.PRIMITIVE_NODE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___PREPARE_TRANSLATION = GraphstructurePackage.PRIMITIVE_NODE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GET_OPERATOR_LIST = GraphstructurePackage.PRIMITIVE_NODE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GET_ALL_OPERATORS = GraphstructurePackage.PRIMITIVE_NODE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GET_PARAMETER_LIST = GraphstructurePackage.PRIMITIVE_NODE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GET_ALL_PARAMETERS = GraphstructurePackage.PRIMITIVE_NODE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.PRIMITIVE_NODE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.PRIMITIVE_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.PRIMITIVE_NODE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.PRIMITIVE_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___RECORD_VALUES__XMLDATADATABASE = GraphstructurePackage.PRIMITIVE_NODE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___RELATIONS_XML_ADAPTED = GraphstructurePackage.PRIMITIVE_NODE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___CREATE_XML_ADAPTION = GraphstructurePackage.PRIMITIVE_NODE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___CREATE_RDF_ADAPTION = GraphstructurePackage.PRIMITIVE_NODE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___CREATE_NEO4J_ADAPTION = GraphstructurePackage.PRIMITIVE_NODE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___CONTAINS_JAVA_OPERATOR = GraphstructurePackage.PRIMITIVE_NODE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GENERATE_QUERY_FILTER_PART = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GENERATE_XQUERY_JAVA = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GENERATE_XQUERY_JAVA_RETURN = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.PRIMITIVE_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GET_RETURN_TYPE = GraphstructurePackage.PRIMITIVE_NODE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___IS_TRANSLATABLE = GraphstructurePackage.PRIMITIVE_NODE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GET_ALL_ARGUMENT_ELEMENTS = GraphstructurePackage.PRIMITIVE_NODE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___IS_OPERATOR_ARGUMENT = GraphstructurePackage.PRIMITIVE_NODE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___CREATE_PARAMETERS = GraphstructurePackage.PRIMITIVE_NODE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.PRIMITIVE_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.PRIMITIVE_NODE___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Get Relations To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GET_RELATIONS_TO__NODE = GraphstructurePackage.PRIMITIVE_NODE___GET_RELATIONS_TO__NODE;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_OUTGOING = GraphstructurePackage.PRIMITIVE_NODE___ADD_OUTGOING;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_OUTGOING__GRAPH = GraphstructurePackage.PRIMITIVE_NODE___ADD_OUTGOING__GRAPH;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_OUTGOING__NODE = GraphstructurePackage.PRIMITIVE_NODE___ADD_OUTGOING__NODE;

	/**
	 * The operation id for the '<em>Add Incomming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_INCOMMING__COMPLEXNODE = GraphstructurePackage.PRIMITIVE_NODE___ADD_INCOMMING__COMPLEXNODE;

	/**
	 * The operation id for the '<em>Add Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_COMPARISON__NODE = GraphstructurePackage.PRIMITIVE_NODE___ADD_COMPARISON__NODE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_PRIMITIVE_COMPARISON = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_PRIMITIVE_COMPARISON__STRING = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_PRIMITIVE_MATCH = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_MATCH;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_PRIMITIVE_MATCH__STRING = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_MATCH__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_PRIMITIVE_CONTAINS = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_CONTAINS;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_PRIMITIVE_CONTAINS__STRING = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_CONTAINS__STRING;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_PRIMITIVE_STRING_LENGTH = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_STRING_LENGTH;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_PRIMITIVE_NULL_CHECK = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_NULL_CHECK;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN;

	/**
	 * The operation id for the '<em>Add Primitive Validate Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADD_PRIMITIVE_VALIDATE_LINK = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_VALIDATE_LINK;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___CHECK_COMPARISON_CONSISTENCY = GraphstructurePackage.PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON = GraphstructurePackage.PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON;

	/**
	 * The operation id for the '<em>Check Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___CHECK_GENERIC = GraphstructurePackage.PRIMITIVE_NODE___CHECK_GENERIC;

	/**
	 * The operation id for the '<em>Make Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___MAKE_GENERIC = GraphstructurePackage.PRIMITIVE_NODE___MAKE_GENERIC;

	/**
	 * The operation id for the '<em>Check Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___CHECK_COMPLEX = GraphstructurePackage.PRIMITIVE_NODE___CHECK_COMPLEX;

	/**
	 * The operation id for the '<em>Make Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___MAKE_COMPLEX = GraphstructurePackage.PRIMITIVE_NODE___MAKE_COMPLEX;

	/**
	 * The operation id for the '<em>Check Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___CHECK_PRIMITIVE = GraphstructurePackage.PRIMITIVE_NODE___CHECK_PRIMITIVE;

	/**
	 * The operation id for the '<em>Make Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___MAKE_PRIMITIVE = GraphstructurePackage.PRIMITIVE_NODE___MAKE_PRIMITIVE;

	/**
	 * The operation id for the '<em>Adapt As Xml Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADAPT_AS_XML_ELEMENT = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_XML_ELEMENT;

	/**
	 * The operation id for the '<em>Adapt As Xml Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADAPT_AS_XML_PROPERTY = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_XML_PROPERTY;

	/**
	 * The operation id for the '<em>Adapt As Rdf Iri Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADAPT_AS_RDF_IRI_NODE = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_RDF_IRI_NODE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Literal Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADAPT_AS_RDF_LITERAL_NODE = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_RDF_LITERAL_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADAPT_AS_NEO_ELEMENT_NODE = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_NEO_ELEMENT_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Property Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___ADAPT_AS_NEO_PROPERTY_NODE = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_NEO_PROPERTY_NODE;

	/**
	 * The operation id for the '<em>In Java Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___IN_JAVA_RETURN_REQUIRED = GraphstructurePackage.PRIMITIVE_NODE___IN_JAVA_RETURN_REQUIRED;

	/**
	 * The operation id for the '<em>In Java Graph Return Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___IN_JAVA_GRAPH_RETURN_REQUIRED = GraphstructurePackage.PRIMITIVE_NODE___IN_JAVA_GRAPH_RETURN_REQUIRED;

	/**
	 * The operation id for the '<em>In Java Where</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___IN_JAVA_WHERE = GraphstructurePackage.PRIMITIVE_NODE___IN_JAVA_WHERE;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___CHECK_COMPARISON_CONSISTENCY__PARAMETERVALUE = GraphstructurePackage.PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Generate Rdf Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE___GENERATE_RDF_TYPES = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rdf Literal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_NODE_OPERATION_COUNT = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionrdf.impl.IriParamImpl <em>Iri Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionrdf.impl.IriParamImpl
	 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getIriParam()
	 * @generated
	 */
	int IRI_PARAM = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM__ID = ParametersPackage.PARAMETER_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM__INTERNAL_ID = ParametersPackage.PARAMETER_VALUE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM__PARAMETER_LIST = ParametersPackage.PARAMETER_VALUE__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM__PREDEFINED = ParametersPackage.PARAMETER_VALUE__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM__PARAMETER_REFERENCES = ParametersPackage.PARAMETER_VALUE__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM__DESCRIPTION = ParametersPackage.PARAMETER_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM__COMPARISON1 = ParametersPackage.PARAMETER_VALUE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM__COMPARISON2 = ParametersPackage.PARAMETER_VALUE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM__TYPE_MODIFIABLE = ParametersPackage.PARAMETER_VALUE__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Rdf Single Predicate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM__RDF_SINGLE_PREDICATE = ParametersPackage.PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM__PREFIX = ParametersPackage.PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM__URI = ParametersPackage.PARAMETER_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM__SUFFIX = ParametersPackage.PARAMETER_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Iri List Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM__IRI_LIST_PARAM = ParametersPackage.PARAMETER_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Iri Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM_FEATURE_COUNT = ParametersPackage.PARAMETER_VALUE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___IS_VALID__ABSTRACTIONLEVEL = ParametersPackage.PARAMETER_VALUE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = ParametersPackage.PARAMETER_VALUE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___MY_TO_STRING = ParametersPackage.PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GENERATE_CYPHER = ParametersPackage.PARAMETER_VALUE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GENERATE_XQUERY = ParametersPackage.PARAMETER_VALUE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GENERATE_SPARQL = ParametersPackage.PARAMETER_VALUE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_CONTAINER = ParametersPackage.PARAMETER_VALUE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_ANCESTOR__CLASS = ParametersPackage.PARAMETER_VALUE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___INITIALIZE_TRANSLATION = ParametersPackage.PARAMETER_VALUE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___PREPARE_TRANSLATION = ParametersPackage.PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_OPERATOR_LIST = ParametersPackage.PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_ALL_OPERATORS = ParametersPackage.PARAMETER_VALUE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_PARAMETER_LIST = ParametersPackage.PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_ALL_PARAMETERS = ParametersPackage.PARAMETER_VALUE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___PREPARE_PARAMETER_UPDATES = ParametersPackage.PARAMETER_VALUE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = ParametersPackage.PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = ParametersPackage.PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = ParametersPackage.PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___RECORD_VALUES__XMLDATADATABASE = ParametersPackage.PARAMETER_VALUE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___RELATIONS_XML_ADAPTED = ParametersPackage.PARAMETER_VALUE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___CREATE_XML_ADAPTION = ParametersPackage.PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___CREATE_RDF_ADAPTION = ParametersPackage.PARAMETER_VALUE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___CREATE_NEO4J_ADAPTION = ParametersPackage.PARAMETER_VALUE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___CONTAINS_JAVA_OPERATOR = ParametersPackage.PARAMETER_VALUE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GENERATE_QUERY_FILTER_PART = ParametersPackage.PARAMETER_VALUE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GENERATE_XQUERY_JAVA = ParametersPackage.PARAMETER_VALUE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GENERATE_XQUERY_JAVA_RETURN = ParametersPackage.PARAMETER_VALUE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___VALIDATE_AGAINST_SCHEMA = ParametersPackage.PARAMETER_VALUE___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = ParametersPackage.PARAMETER_VALUE___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___INPUT_IS_VALID = ParametersPackage.PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___IS_USED = ParametersPackage.PARAMETER_VALUE___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___SET_VALUE_FROM_STRING__STRING = ParametersPackage.PARAMETER_VALUE___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_VALUE_AS_STRING = ParametersPackage.PARAMETER_VALUE___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___CHECK_COMPARISON_CONSISTENCY = ParametersPackage.PARAMETER_VALUE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As Json Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_OPTIONS_AS_JSON_ARRAY = ParametersPackage.PARAMETER_VALUE___GET_OPTIONS_AS_JSON_ARRAY;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GENERATE_DESCRIPTION = ParametersPackage.PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = ParametersPackage.PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_RETURN_TYPE = ParametersPackage.PARAMETER_VALUE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___IS_TRANSLATABLE = ParametersPackage.PARAMETER_VALUE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_ALL_ARGUMENT_ELEMENTS = ParametersPackage.PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___IS_OPERATOR_ARGUMENT = ParametersPackage.PARAMETER_VALUE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___REPLACE__PARAMETERVALUE = ParametersPackage.PARAMETER_VALUE___REPLACE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___REPLACE_VIA_VALUE__STRING_STRING = ParametersPackage.PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_ELEMENT_TAGS = ParametersPackage.PARAMETER_VALUE___GET_ELEMENT_TAGS;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_DATA_VALUES = ParametersPackage.PARAMETER_VALUE___GET_DATA_VALUES;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___IS_IN_DATA_COMPARISON = ParametersPackage.PARAMETER_VALUE___IS_IN_DATA_COMPARISON;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___IS_IN_TAG_COMPARISON = ParametersPackage.PARAMETER_VALUE___IS_IN_TAG_COMPARISON;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_ATTRIBUTE_NAMES = ParametersPackage.PARAMETER_VALUE___GET_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_ATTRIBUTE_VALUES = ParametersPackage.PARAMETER_VALUE___GET_ATTRIBUTE_VALUES;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___IS_IN_ATTRIBUTE_COMPARISON = ParametersPackage.PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_SUGGESTIONS = ParametersPackage.PARAMETER_VALUE___GET_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___INFER_SUGGESTIONS = ParametersPackage.PARAMETER_VALUE___INFER_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Get Standard Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM___GET_STANDARD_IRI = ParametersPackage.PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iri Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PARAM_OPERATION_COUNT = ParametersPackage.PARAMETER_VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfXorImpl <em>Rdf Xor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionrdf.impl.RdfXorImpl
	 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfXor()
	 * @generated
	 */
	int RDF_XOR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR__ID = RDF_PATH_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR__INTERNAL_ID = RDF_PATH_COMPONENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Invert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR__INVERT = RDF_PATH_COMPONENT__INVERT;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR__QUANTIFIER = RDF_PATH_COMPONENT__QUANTIFIER;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR__ITEMS = RDF_PATH_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rdf Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR_FEATURE_COUNT = RDF_PATH_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___VALIDATE__DIAGNOSTICCHAIN_MAP = RDF_PATH_COMPONENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___IS_VALID__ABSTRACTIONLEVEL = RDF_PATH_COMPONENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___IS_VALID_LOCAL__ABSTRACTIONLEVEL = RDF_PATH_COMPONENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___MY_TO_STRING = RDF_PATH_COMPONENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___GENERATE_CYPHER = RDF_PATH_COMPONENT___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___GENERATE_XQUERY = RDF_PATH_COMPONENT___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___GENERATE_SPARQL = RDF_PATH_COMPONENT___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___GET_CONTAINER = RDF_PATH_COMPONENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___GET_ANCESTOR__CLASS = RDF_PATH_COMPONENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___INITIALIZE_TRANSLATION = RDF_PATH_COMPONENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___PREPARE_TRANSLATION = RDF_PATH_COMPONENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___GET_OPERATOR_LIST = RDF_PATH_COMPONENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___GET_ALL_OPERATORS = RDF_PATH_COMPONENT___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___GET_PARAMETER_LIST = RDF_PATH_COMPONENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___GET_ALL_PARAMETERS = RDF_PATH_COMPONENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___PREPARE_PARAMETER_UPDATES = RDF_PATH_COMPONENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = RDF_PATH_COMPONENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___UPDATE_PARAMETERS__PARAMETERLIST = RDF_PATH_COMPONENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = RDF_PATH_COMPONENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___RECORD_VALUES__XMLDATADATABASE = RDF_PATH_COMPONENT___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___RELATIONS_XML_ADAPTED = RDF_PATH_COMPONENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___CREATE_XML_ADAPTION = RDF_PATH_COMPONENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___CREATE_RDF_ADAPTION = RDF_PATH_COMPONENT___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___CREATE_NEO4J_ADAPTION = RDF_PATH_COMPONENT___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___CONTAINS_JAVA_OPERATOR = RDF_PATH_COMPONENT___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___GENERATE_QUERY_FILTER_PART = RDF_PATH_COMPONENT___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___GENERATE_XQUERY_JAVA = RDF_PATH_COMPONENT___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___GENERATE_XQUERY_JAVA_RETURN = RDF_PATH_COMPONENT___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Get Rdf Single Predicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___GET_RDF_SINGLE_PREDICATES = RDF_PATH_COMPONENT___GET_RDF_SINGLE_PREDICATES;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___GET_VALUE_AS_STRING = RDF_PATH_COMPONENT___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR___SET_VALUE_FROM_STRING__STRING = RDF_PATH_COMPONENT___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The number of operations of the '<em>Rdf Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_XOR_OPERATION_COUNT = RDF_PATH_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfSequenceImpl <em>Rdf Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionrdf.impl.RdfSequenceImpl
	 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfSequence()
	 * @generated
	 */
	int RDF_SEQUENCE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE__ID = RDF_PATH_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE__INTERNAL_ID = RDF_PATH_COMPONENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Invert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE__INVERT = RDF_PATH_COMPONENT__INVERT;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE__QUANTIFIER = RDF_PATH_COMPONENT__QUANTIFIER;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE__ITEMS = RDF_PATH_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rdf Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE_FEATURE_COUNT = RDF_PATH_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___VALIDATE__DIAGNOSTICCHAIN_MAP = RDF_PATH_COMPONENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___IS_VALID__ABSTRACTIONLEVEL = RDF_PATH_COMPONENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = RDF_PATH_COMPONENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___MY_TO_STRING = RDF_PATH_COMPONENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___GENERATE_CYPHER = RDF_PATH_COMPONENT___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___GENERATE_XQUERY = RDF_PATH_COMPONENT___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___GENERATE_SPARQL = RDF_PATH_COMPONENT___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___GET_CONTAINER = RDF_PATH_COMPONENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___GET_ANCESTOR__CLASS = RDF_PATH_COMPONENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___INITIALIZE_TRANSLATION = RDF_PATH_COMPONENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___PREPARE_TRANSLATION = RDF_PATH_COMPONENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___GET_OPERATOR_LIST = RDF_PATH_COMPONENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___GET_ALL_OPERATORS = RDF_PATH_COMPONENT___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___GET_PARAMETER_LIST = RDF_PATH_COMPONENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___GET_ALL_PARAMETERS = RDF_PATH_COMPONENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___PREPARE_PARAMETER_UPDATES = RDF_PATH_COMPONENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = RDF_PATH_COMPONENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___UPDATE_PARAMETERS__PARAMETERLIST = RDF_PATH_COMPONENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = RDF_PATH_COMPONENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___RECORD_VALUES__XMLDATADATABASE = RDF_PATH_COMPONENT___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___RELATIONS_XML_ADAPTED = RDF_PATH_COMPONENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___CREATE_XML_ADAPTION = RDF_PATH_COMPONENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___CREATE_RDF_ADAPTION = RDF_PATH_COMPONENT___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___CREATE_NEO4J_ADAPTION = RDF_PATH_COMPONENT___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___CONTAINS_JAVA_OPERATOR = RDF_PATH_COMPONENT___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___GENERATE_QUERY_FILTER_PART = RDF_PATH_COMPONENT___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___GENERATE_XQUERY_JAVA = RDF_PATH_COMPONENT___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___GENERATE_XQUERY_JAVA_RETURN = RDF_PATH_COMPONENT___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Get Rdf Single Predicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___GET_RDF_SINGLE_PREDICATES = RDF_PATH_COMPONENT___GET_RDF_SINGLE_PREDICATES;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___GET_VALUE_AS_STRING = RDF_PATH_COMPONENT___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE___SET_VALUE_FROM_STRING__STRING = RDF_PATH_COMPONENT___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The number of operations of the '<em>Rdf Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQUENCE_OPERATION_COUNT = RDF_PATH_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionrdf.impl.IriListParamImpl <em>Iri List Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionrdf.impl.IriListParamImpl
	 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getIriListParam()
	 * @generated
	 */
	int IRI_LIST_PARAM = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM__ID = ParametersPackage.PARAMETER_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM__INTERNAL_ID = ParametersPackage.PARAMETER_VALUE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM__PARAMETER_LIST = ParametersPackage.PARAMETER_VALUE__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM__PREDEFINED = ParametersPackage.PARAMETER_VALUE__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM__PARAMETER_REFERENCES = ParametersPackage.PARAMETER_VALUE__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM__DESCRIPTION = ParametersPackage.PARAMETER_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM__COMPARISON1 = ParametersPackage.PARAMETER_VALUE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM__COMPARISON2 = ParametersPackage.PARAMETER_VALUE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM__TYPE_MODIFIABLE = ParametersPackage.PARAMETER_VALUE__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Iri Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM__IRI_PARAMS = ParametersPackage.PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rdf Iri Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM__RDF_IRI_NODE = ParametersPackage.PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rdf Path Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM__RDF_PATH_PART = ParametersPackage.PARAMETER_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Iri List Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM_FEATURE_COUNT = ParametersPackage.PARAMETER_VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___IS_VALID__ABSTRACTIONLEVEL = ParametersPackage.PARAMETER_VALUE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = ParametersPackage.PARAMETER_VALUE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___MY_TO_STRING = ParametersPackage.PARAMETER_VALUE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GENERATE_CYPHER = ParametersPackage.PARAMETER_VALUE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GENERATE_XQUERY = ParametersPackage.PARAMETER_VALUE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GENERATE_SPARQL = ParametersPackage.PARAMETER_VALUE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GET_CONTAINER = ParametersPackage.PARAMETER_VALUE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GET_ANCESTOR__CLASS = ParametersPackage.PARAMETER_VALUE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___INITIALIZE_TRANSLATION = ParametersPackage.PARAMETER_VALUE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___PREPARE_TRANSLATION = ParametersPackage.PARAMETER_VALUE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GET_OPERATOR_LIST = ParametersPackage.PARAMETER_VALUE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GET_ALL_OPERATORS = ParametersPackage.PARAMETER_VALUE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GET_PARAMETER_LIST = ParametersPackage.PARAMETER_VALUE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GET_ALL_PARAMETERS = ParametersPackage.PARAMETER_VALUE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___PREPARE_PARAMETER_UPDATES = ParametersPackage.PARAMETER_VALUE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = ParametersPackage.PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = ParametersPackage.PARAMETER_VALUE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = ParametersPackage.PARAMETER_VALUE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___RECORD_VALUES__XMLDATADATABASE = ParametersPackage.PARAMETER_VALUE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___RELATIONS_XML_ADAPTED = ParametersPackage.PARAMETER_VALUE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___CREATE_XML_ADAPTION = ParametersPackage.PARAMETER_VALUE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___CREATE_RDF_ADAPTION = ParametersPackage.PARAMETER_VALUE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___CREATE_NEO4J_ADAPTION = ParametersPackage.PARAMETER_VALUE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___CONTAINS_JAVA_OPERATOR = ParametersPackage.PARAMETER_VALUE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GENERATE_QUERY_FILTER_PART = ParametersPackage.PARAMETER_VALUE___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GENERATE_XQUERY_JAVA = ParametersPackage.PARAMETER_VALUE___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GENERATE_XQUERY_JAVA_RETURN = ParametersPackage.PARAMETER_VALUE___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___VALIDATE_AGAINST_SCHEMA = ParametersPackage.PARAMETER_VALUE___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = ParametersPackage.PARAMETER_VALUE___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___INPUT_IS_VALID = ParametersPackage.PARAMETER_VALUE___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___IS_USED = ParametersPackage.PARAMETER_VALUE___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___SET_VALUE_FROM_STRING__STRING = ParametersPackage.PARAMETER_VALUE___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GET_VALUE_AS_STRING = ParametersPackage.PARAMETER_VALUE___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___CHECK_COMPARISON_CONSISTENCY = ParametersPackage.PARAMETER_VALUE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As Json Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GET_OPTIONS_AS_JSON_ARRAY = ParametersPackage.PARAMETER_VALUE___GET_OPTIONS_AS_JSON_ARRAY;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GENERATE_DESCRIPTION = ParametersPackage.PARAMETER_VALUE___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = ParametersPackage.PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GET_RETURN_TYPE = ParametersPackage.PARAMETER_VALUE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___IS_TRANSLATABLE = ParametersPackage.PARAMETER_VALUE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GET_ALL_ARGUMENT_ELEMENTS = ParametersPackage.PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___IS_OPERATOR_ARGUMENT = ParametersPackage.PARAMETER_VALUE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___REPLACE__PARAMETERVALUE = ParametersPackage.PARAMETER_VALUE___REPLACE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Replace Via Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___REPLACE_VIA_VALUE__STRING_STRING = ParametersPackage.PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Element Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GET_ELEMENT_TAGS = ParametersPackage.PARAMETER_VALUE___GET_ELEMENT_TAGS;

	/**
	 * The operation id for the '<em>Get Data Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GET_DATA_VALUES = ParametersPackage.PARAMETER_VALUE___GET_DATA_VALUES;

	/**
	 * The operation id for the '<em>Is In Data Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___IS_IN_DATA_COMPARISON = ParametersPackage.PARAMETER_VALUE___IS_IN_DATA_COMPARISON;

	/**
	 * The operation id for the '<em>Is In Tag Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___IS_IN_TAG_COMPARISON = ParametersPackage.PARAMETER_VALUE___IS_IN_TAG_COMPARISON;

	/**
	 * The operation id for the '<em>Get Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GET_ATTRIBUTE_NAMES = ParametersPackage.PARAMETER_VALUE___GET_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GET_ATTRIBUTE_VALUES = ParametersPackage.PARAMETER_VALUE___GET_ATTRIBUTE_VALUES;

	/**
	 * The operation id for the '<em>Is In Attribute Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___IS_IN_ATTRIBUTE_COMPARISON = ParametersPackage.PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON;

	/**
	 * The operation id for the '<em>Get Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___GET_SUGGESTIONS = ParametersPackage.PARAMETER_VALUE___GET_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM___INFER_SUGGESTIONS = ParametersPackage.PARAMETER_VALUE___INFER_SUGGESTIONS;

	/**
	 * The number of operations of the '<em>Iri List Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_LIST_PARAM_OPERATION_COUNT = ParametersPackage.PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM__ID = ParametersPackage.PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM__INTERNAL_ID = ParametersPackage.PARAMETER__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM__PARAMETER_LIST = ParametersPackage.PARAMETER__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM__PREDEFINED = ParametersPackage.PARAMETER__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM__PARAMETER_REFERENCES = ParametersPackage.PARAMETER__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM__DESCRIPTION = ParametersPackage.PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM__RDF_PREDICATE = ParametersPackage.PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rdf Path Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM__RDF_PATH_PARTS = ParametersPackage.PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rdf Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM_FEATURE_COUNT = ParametersPackage.PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___IS_VALID__ABSTRACTIONLEVEL = ParametersPackage.PARAMETER___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = ParametersPackage.PARAMETER___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___MY_TO_STRING = ParametersPackage.PARAMETER___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___GENERATE_CYPHER = ParametersPackage.PARAMETER___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___GENERATE_XQUERY = ParametersPackage.PARAMETER___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___GENERATE_SPARQL = ParametersPackage.PARAMETER___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___GET_CONTAINER = ParametersPackage.PARAMETER___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___GET_ANCESTOR__CLASS = ParametersPackage.PARAMETER___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___INITIALIZE_TRANSLATION = ParametersPackage.PARAMETER___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___PREPARE_TRANSLATION = ParametersPackage.PARAMETER___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___GET_OPERATOR_LIST = ParametersPackage.PARAMETER___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___GET_ALL_OPERATORS = ParametersPackage.PARAMETER___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___GET_PARAMETER_LIST = ParametersPackage.PARAMETER___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___GET_ALL_PARAMETERS = ParametersPackage.PARAMETER___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___PREPARE_PARAMETER_UPDATES = ParametersPackage.PARAMETER___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = ParametersPackage.PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = ParametersPackage.PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = ParametersPackage.PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___RECORD_VALUES__XMLDATADATABASE = ParametersPackage.PARAMETER___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___RELATIONS_XML_ADAPTED = ParametersPackage.PARAMETER___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___CREATE_XML_ADAPTION = ParametersPackage.PARAMETER___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___CREATE_RDF_ADAPTION = ParametersPackage.PARAMETER___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___CREATE_NEO4J_ADAPTION = ParametersPackage.PARAMETER___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___CONTAINS_JAVA_OPERATOR = ParametersPackage.PARAMETER___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___GENERATE_QUERY_FILTER_PART = ParametersPackage.PARAMETER___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___GENERATE_XQUERY_JAVA = ParametersPackage.PARAMETER___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___GENERATE_XQUERY_JAVA_RETURN = ParametersPackage.PARAMETER___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = ParametersPackage.PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___VALIDATE_AGAINST_SCHEMA = ParametersPackage.PARAMETER___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = ParametersPackage.PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___INPUT_IS_VALID = ParametersPackage.PARAMETER___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___IS_USED = ParametersPackage.PARAMETER___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___SET_VALUE_FROM_STRING__STRING = ParametersPackage.PARAMETER___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___GET_VALUE_AS_STRING = ParametersPackage.PARAMETER___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY = ParametersPackage.PARAMETER___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As Json Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___GET_OPTIONS_AS_JSON_ARRAY = ParametersPackage.PARAMETER___GET_OPTIONS_AS_JSON_ARRAY;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___GENERATE_DESCRIPTION = ParametersPackage.PARAMETER___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___CREATE_PARAMETERS = ParametersPackage.PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = ParametersPackage.PARAMETER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Rdf Path Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___SET_RDF_PATH_PART__RDFPATHPART = ParametersPackage.PARAMETER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Rdf Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM___ADD_RDF_PART__RDFPATHPART = ParametersPackage.PARAMETER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rdf Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PARAM_OPERATION_COUNT = ParametersPackage.PARAMETER_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfPathPartImpl <em>Rdf Path Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionrdf.impl.RdfPathPartImpl
	 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfPathPart()
	 * @generated
	 */
	int RDF_PATH_PART = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART__ID = PatternstructurePackage.PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART__INTERNAL_ID = PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Rdf Path Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART__RDF_PATH_PARAM = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rdf Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART__RDF_PATH = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Node Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART__TARGET_NODE_TYPES = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rdf Path Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___IS_VALID__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___MY_TO_STRING = PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___GENERATE_CYPHER = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___GENERATE_XQUERY = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___GENERATE_SPARQL = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___GET_CONTAINER = PatternstructurePackage.PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___GET_ANCESTOR__CLASS = PatternstructurePackage.PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___INITIALIZE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___GET_OPERATOR_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___GET_ALL_OPERATORS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___GET_PARAMETER_LIST = PatternstructurePackage.PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___GET_ALL_PARAMETERS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___PREPARE_PARAMETER_UPDATES = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___UPDATE_PARAMETERS__PARAMETERLIST = PatternstructurePackage.PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___RECORD_VALUES__XMLDATADATABASE = PatternstructurePackage.PATTERN_ELEMENT___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___RELATIONS_XML_ADAPTED = PatternstructurePackage.PATTERN_ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___CREATE_XML_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___CREATE_RDF_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___CREATE_NEO4J_ADAPTION = PatternstructurePackage.PATTERN_ELEMENT___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___CONTAINS_JAVA_OPERATOR = PatternstructurePackage.PATTERN_ELEMENT___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Generate Query Filter Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___GENERATE_QUERY_FILTER_PART = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY_FILTER_PART;

	/**
	 * The operation id for the '<em>Generate XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___GENERATE_XQUERY_JAVA = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA;

	/**
	 * The operation id for the '<em>Generate XQuery Java Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___GENERATE_XQUERY_JAVA_RETURN = PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA_RETURN;

	/**
	 * The operation id for the '<em>Generate Rdf Part Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___GENERATE_RDF_PART_TYPES__STRING = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___GET_VALUE_AS_STRING = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART___SET_VALUE_FROM_STRING__STRING = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rdf Path Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PATH_PART_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionrdf.RdfQuantifier <em>Rdf Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionrdf.RdfQuantifier
	 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfQuantifier()
	 * @generated
	 */
	int RDF_QUANTIFIER = 12;

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionrdf.RdfPredicate <em>Rdf Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdf Predicate</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfPredicate
	 * @generated
	 */
	EClass getRdfPredicate();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionrdf.RdfPredicate#getRdfPathParam <em>Rdf Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rdf Path Param</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfPredicate#getRdfPathParam()
	 * @see #getRdfPredicate()
	 * @generated
	 */
	EReference getRdfPredicate_RdfPathParam();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionrdf.RdfIriNode <em>Rdf Iri Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdf Iri Node</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfIriNode
	 * @generated
	 */
	EClass getRdfIriNode();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionrdf.RdfIriNode#getRdfIriNodeTypes <em>Rdf Iri Node Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rdf Iri Node Types</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfIriNode#getRdfIriNodeTypes()
	 * @see #getRdfIriNode()
	 * @generated
	 */
	EReference getRdfIriNode_RdfIriNodeTypes();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionrdf.RdfPathComponent <em>Rdf Path Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdf Path Component</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathComponent
	 * @generated
	 */
	EClass getRdfPathComponent();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionrdf.RdfPathComponent#isInvert <em>Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invert</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathComponent#isInvert()
	 * @see #getRdfPathComponent()
	 * @generated
	 */
	EAttribute getRdfPathComponent_Invert();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionrdf.RdfPathComponent#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathComponent#getQuantifier()
	 * @see #getRdfPathComponent()
	 * @generated
	 */
	EAttribute getRdfPathComponent_Quantifier();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionrdf.RdfPathComponent#getRdfSinglePredicates() <em>Get Rdf Single Predicates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rdf Single Predicates</em>' operation.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathComponent#getRdfSinglePredicates()
	 * @generated
	 */
	EOperation getRdfPathComponent__GetRdfSinglePredicates();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionrdf.RdfPathComponent#getValueAsString() <em>Get Value As String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value As String</em>' operation.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathComponent#getValueAsString()
	 * @generated
	 */
	EOperation getRdfPathComponent__GetValueAsString();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionrdf.RdfPathComponent#setValueFromString(java.lang.String) <em>Set Value From String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value From String</em>' operation.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathComponent#setValueFromString(java.lang.String)
	 * @generated
	 */
	EOperation getRdfPathComponent__SetValueFromString__String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionrdf.RdfPathParam <em>Rdf Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdf Path Param</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathParam
	 * @generated
	 */
	EClass getRdfPathParam();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfPredicate <em>Rdf Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rdf Predicate</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfPredicate()
	 * @see #getRdfPathParam()
	 * @generated
	 */
	EReference getRdfPathParam_RdfPredicate();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfPathParts <em>Rdf Path Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rdf Path Parts</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfPathParts()
	 * @see #getRdfPathParam()
	 * @generated
	 */
	EReference getRdfPathParam_RdfPathParts();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#setRdfPathPart(qualitypatternmodel.adaptionrdf.RdfPathPart) <em>Set Rdf Path Part</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Rdf Path Part</em>' operation.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathParam#setRdfPathPart(qualitypatternmodel.adaptionrdf.RdfPathPart)
	 * @generated
	 */
	EOperation getRdfPathParam__SetRdfPathPart__RdfPathPart();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#addRdfPart(qualitypatternmodel.adaptionrdf.RdfPathPart) <em>Add Rdf Part</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Rdf Part</em>' operation.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathParam#addRdfPart(qualitypatternmodel.adaptionrdf.RdfPathPart)
	 * @generated
	 */
	EOperation getRdfPathParam__AddRdfPart__RdfPathPart();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionrdf.RdfPathPart <em>Rdf Path Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdf Path Part</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathPart
	 * @generated
	 */
	EClass getRdfPathPart();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.adaptionrdf.RdfPathPart#getRdfPathParam <em>Rdf Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rdf Path Param</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathPart#getRdfPathParam()
	 * @see #getRdfPathPart()
	 * @generated
	 */
	EReference getRdfPathPart_RdfPathParam();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.adaptionrdf.RdfPathPart#getRdfPath <em>Rdf Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rdf Path</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathPart#getRdfPath()
	 * @see #getRdfPathPart()
	 * @generated
	 */
	EReference getRdfPathPart_RdfPath();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.adaptionrdf.RdfPathPart#getTargetNodeTypes <em>Target Node Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Node Types</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathPart#getTargetNodeTypes()
	 * @see #getRdfPathPart()
	 * @generated
	 */
	EReference getRdfPathPart_TargetNodeTypes();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionrdf.RdfPathPart#generateRdfPartTypes(java.lang.String) <em>Generate Rdf Part Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Rdf Part Types</em>' operation.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathPart#generateRdfPartTypes(java.lang.String)
	 * @generated
	 */
	EOperation getRdfPathPart__GenerateRdfPartTypes__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionrdf.RdfPathPart#getValueAsString() <em>Get Value As String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value As String</em>' operation.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathPart#getValueAsString()
	 * @generated
	 */
	EOperation getRdfPathPart__GetValueAsString();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionrdf.RdfPathPart#setValueFromString(java.lang.String) <em>Set Value From String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value From String</em>' operation.
	 * @see qualitypatternmodel.adaptionrdf.RdfPathPart#setValueFromString(java.lang.String)
	 * @generated
	 */
	EOperation getRdfPathPart__SetValueFromString__String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionrdf.RdfSinglePredicate <em>Rdf Single Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdf Single Predicate</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfSinglePredicate
	 * @generated
	 */
	EClass getRdfSinglePredicate();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.adaptionrdf.RdfSinglePredicate#getIriParam <em>Iri Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iri Param</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfSinglePredicate#getIriParam()
	 * @see #getRdfSinglePredicate()
	 * @generated
	 */
	EReference getRdfSinglePredicate_IriParam();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionrdf.RdfNode <em>Rdf Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdf Node</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfNode
	 * @generated
	 */
	EClass getRdfNode();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionrdf.RdfNode#generateRdfTypes() <em>Generate Rdf Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Rdf Types</em>' operation.
	 * @see qualitypatternmodel.adaptionrdf.RdfNode#generateRdfTypes()
	 * @generated
	 */
	EOperation getRdfNode__GenerateRdfTypes();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionrdf.RdfLiteralNode <em>Rdf Literal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdf Literal Node</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfLiteralNode
	 * @generated
	 */
	EClass getRdfLiteralNode();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionrdf.IriParam <em>Iri Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iri Param</em>'.
	 * @see qualitypatternmodel.adaptionrdf.IriParam
	 * @generated
	 */
	EClass getIriParam();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.adaptionrdf.IriParam#getRdfSinglePredicate <em>Rdf Single Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rdf Single Predicate</em>'.
	 * @see qualitypatternmodel.adaptionrdf.IriParam#getRdfSinglePredicate()
	 * @see #getIriParam()
	 * @generated
	 */
	EReference getIriParam_RdfSinglePredicate();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionrdf.IriParam#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see qualitypatternmodel.adaptionrdf.IriParam#getPrefix()
	 * @see #getIriParam()
	 * @generated
	 */
	EAttribute getIriParam_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionrdf.IriParam#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see qualitypatternmodel.adaptionrdf.IriParam#getUri()
	 * @see #getIriParam()
	 * @generated
	 */
	EAttribute getIriParam_Uri();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionrdf.IriParam#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see qualitypatternmodel.adaptionrdf.IriParam#getSuffix()
	 * @see #getIriParam()
	 * @generated
	 */
	EAttribute getIriParam_Suffix();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.adaptionrdf.IriParam#getIriListParam <em>Iri List Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Iri List Param</em>'.
	 * @see qualitypatternmodel.adaptionrdf.IriParam#getIriListParam()
	 * @see #getIriParam()
	 * @generated
	 */
	EReference getIriParam_IriListParam();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionrdf.IriParam#getStandardIri() <em>Get Standard Iri</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Standard Iri</em>' operation.
	 * @see qualitypatternmodel.adaptionrdf.IriParam#getStandardIri()
	 * @generated
	 */
	EOperation getIriParam__GetStandardIri();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionrdf.RdfXor <em>Rdf Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdf Xor</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfXor
	 * @generated
	 */
	EClass getRdfXor();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.adaptionrdf.RdfXor#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfXor#getItems()
	 * @see #getRdfXor()
	 * @generated
	 */
	EReference getRdfXor_Items();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionrdf.RdfSequence <em>Rdf Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdf Sequence</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfSequence
	 * @generated
	 */
	EClass getRdfSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.adaptionrdf.RdfSequence#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfSequence#getItems()
	 * @see #getRdfSequence()
	 * @generated
	 */
	EReference getRdfSequence_Items();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionrdf.IriListParam <em>Iri List Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iri List Param</em>'.
	 * @see qualitypatternmodel.adaptionrdf.IriListParam
	 * @generated
	 */
	EClass getIriListParam();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.adaptionrdf.IriListParam#getIriParams <em>Iri Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iri Params</em>'.
	 * @see qualitypatternmodel.adaptionrdf.IriListParam#getIriParams()
	 * @see #getIriListParam()
	 * @generated
	 */
	EReference getIriListParam_IriParams();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionrdf.IriListParam#getRdfIriNode <em>Rdf Iri Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rdf Iri Node</em>'.
	 * @see qualitypatternmodel.adaptionrdf.IriListParam#getRdfIriNode()
	 * @see #getIriListParam()
	 * @generated
	 */
	EReference getIriListParam_RdfIriNode();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.adaptionrdf.IriListParam#getRdfPathPart <em>Rdf Path Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rdf Path Part</em>'.
	 * @see qualitypatternmodel.adaptionrdf.IriListParam#getRdfPathPart()
	 * @see #getIriListParam()
	 * @generated
	 */
	EReference getIriListParam_RdfPathPart();

	/**
	 * Returns the meta object for enum '{@link qualitypatternmodel.adaptionrdf.RdfQuantifier <em>Rdf Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rdf Quantifier</em>'.
	 * @see qualitypatternmodel.adaptionrdf.RdfQuantifier
	 * @generated
	 */
	EEnum getRdfQuantifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdaptionrdfFactory getAdaptionrdfFactory();

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
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfPredicateImpl <em>Rdf Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionrdf.impl.RdfPredicateImpl
		 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfPredicate()
		 * @generated
		 */
		EClass RDF_PREDICATE = eINSTANCE.getRdfPredicate();

		/**
		 * The meta object literal for the '<em><b>Rdf Path Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_PREDICATE__RDF_PATH_PARAM = eINSTANCE.getRdfPredicate_RdfPathParam();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfIriNodeImpl <em>Rdf Iri Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionrdf.impl.RdfIriNodeImpl
		 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfIriNode()
		 * @generated
		 */
		EClass RDF_IRI_NODE = eINSTANCE.getRdfIriNode();

		/**
		 * The meta object literal for the '<em><b>Rdf Iri Node Types</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_IRI_NODE__RDF_IRI_NODE_TYPES = eINSTANCE.getRdfIriNode_RdfIriNodeTypes();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfPathComponentImpl <em>Rdf Path Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionrdf.impl.RdfPathComponentImpl
		 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfPathComponent()
		 * @generated
		 */
		EClass RDF_PATH_COMPONENT = eINSTANCE.getRdfPathComponent();

		/**
		 * The meta object literal for the '<em><b>Invert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_PATH_COMPONENT__INVERT = eINSTANCE.getRdfPathComponent_Invert();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_PATH_COMPONENT__QUANTIFIER = eINSTANCE.getRdfPathComponent_Quantifier();

		/**
		 * The meta object literal for the '<em><b>Get Rdf Single Predicates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RDF_PATH_COMPONENT___GET_RDF_SINGLE_PREDICATES = eINSTANCE.getRdfPathComponent__GetRdfSinglePredicates();

		/**
		 * The meta object literal for the '<em><b>Get Value As String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RDF_PATH_COMPONENT___GET_VALUE_AS_STRING = eINSTANCE.getRdfPathComponent__GetValueAsString();

		/**
		 * The meta object literal for the '<em><b>Set Value From String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RDF_PATH_COMPONENT___SET_VALUE_FROM_STRING__STRING = eINSTANCE.getRdfPathComponent__SetValueFromString__String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfPathParamImpl <em>Rdf Path Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionrdf.impl.RdfPathParamImpl
		 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfPathParam()
		 * @generated
		 */
		EClass RDF_PATH_PARAM = eINSTANCE.getRdfPathParam();

		/**
		 * The meta object literal for the '<em><b>Rdf Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_PATH_PARAM__RDF_PREDICATE = eINSTANCE.getRdfPathParam_RdfPredicate();

		/**
		 * The meta object literal for the '<em><b>Rdf Path Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_PATH_PARAM__RDF_PATH_PARTS = eINSTANCE.getRdfPathParam_RdfPathParts();

		/**
		 * The meta object literal for the '<em><b>Set Rdf Path Part</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RDF_PATH_PARAM___SET_RDF_PATH_PART__RDFPATHPART = eINSTANCE.getRdfPathParam__SetRdfPathPart__RdfPathPart();

		/**
		 * The meta object literal for the '<em><b>Add Rdf Part</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RDF_PATH_PARAM___ADD_RDF_PART__RDFPATHPART = eINSTANCE.getRdfPathParam__AddRdfPart__RdfPathPart();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfPathPartImpl <em>Rdf Path Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionrdf.impl.RdfPathPartImpl
		 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfPathPart()
		 * @generated
		 */
		EClass RDF_PATH_PART = eINSTANCE.getRdfPathPart();

		/**
		 * The meta object literal for the '<em><b>Rdf Path Param</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_PATH_PART__RDF_PATH_PARAM = eINSTANCE.getRdfPathPart_RdfPathParam();

		/**
		 * The meta object literal for the '<em><b>Rdf Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_PATH_PART__RDF_PATH = eINSTANCE.getRdfPathPart_RdfPath();

		/**
		 * The meta object literal for the '<em><b>Target Node Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_PATH_PART__TARGET_NODE_TYPES = eINSTANCE.getRdfPathPart_TargetNodeTypes();

		/**
		 * The meta object literal for the '<em><b>Generate Rdf Part Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RDF_PATH_PART___GENERATE_RDF_PART_TYPES__STRING = eINSTANCE.getRdfPathPart__GenerateRdfPartTypes__String();

		/**
		 * The meta object literal for the '<em><b>Get Value As String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RDF_PATH_PART___GET_VALUE_AS_STRING = eINSTANCE.getRdfPathPart__GetValueAsString();

		/**
		 * The meta object literal for the '<em><b>Set Value From String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RDF_PATH_PART___SET_VALUE_FROM_STRING__STRING = eINSTANCE.getRdfPathPart__SetValueFromString__String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfSinglePredicateImpl <em>Rdf Single Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionrdf.impl.RdfSinglePredicateImpl
		 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfSinglePredicate()
		 * @generated
		 */
		EClass RDF_SINGLE_PREDICATE = eINSTANCE.getRdfSinglePredicate();

		/**
		 * The meta object literal for the '<em><b>Iri Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_SINGLE_PREDICATE__IRI_PARAM = eINSTANCE.getRdfSinglePredicate_IriParam();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionrdf.RdfNode <em>Rdf Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionrdf.RdfNode
		 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfNode()
		 * @generated
		 */
		EClass RDF_NODE = eINSTANCE.getRdfNode();

		/**
		 * The meta object literal for the '<em><b>Generate Rdf Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RDF_NODE___GENERATE_RDF_TYPES = eINSTANCE.getRdfNode__GenerateRdfTypes();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfLiteralNodeImpl <em>Rdf Literal Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionrdf.impl.RdfLiteralNodeImpl
		 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfLiteralNode()
		 * @generated
		 */
		EClass RDF_LITERAL_NODE = eINSTANCE.getRdfLiteralNode();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionrdf.impl.IriParamImpl <em>Iri Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionrdf.impl.IriParamImpl
		 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getIriParam()
		 * @generated
		 */
		EClass IRI_PARAM = eINSTANCE.getIriParam();

		/**
		 * The meta object literal for the '<em><b>Rdf Single Predicate</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRI_PARAM__RDF_SINGLE_PREDICATE = eINSTANCE.getIriParam_RdfSinglePredicate();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IRI_PARAM__PREFIX = eINSTANCE.getIriParam_Prefix();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IRI_PARAM__URI = eINSTANCE.getIriParam_Uri();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IRI_PARAM__SUFFIX = eINSTANCE.getIriParam_Suffix();

		/**
		 * The meta object literal for the '<em><b>Iri List Param</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRI_PARAM__IRI_LIST_PARAM = eINSTANCE.getIriParam_IriListParam();

		/**
		 * The meta object literal for the '<em><b>Get Standard Iri</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRI_PARAM___GET_STANDARD_IRI = eINSTANCE.getIriParam__GetStandardIri();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfXorImpl <em>Rdf Xor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionrdf.impl.RdfXorImpl
		 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfXor()
		 * @generated
		 */
		EClass RDF_XOR = eINSTANCE.getRdfXor();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_XOR__ITEMS = eINSTANCE.getRdfXor_Items();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionrdf.impl.RdfSequenceImpl <em>Rdf Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionrdf.impl.RdfSequenceImpl
		 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfSequence()
		 * @generated
		 */
		EClass RDF_SEQUENCE = eINSTANCE.getRdfSequence();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_SEQUENCE__ITEMS = eINSTANCE.getRdfSequence_Items();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionrdf.impl.IriListParamImpl <em>Iri List Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionrdf.impl.IriListParamImpl
		 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getIriListParam()
		 * @generated
		 */
		EClass IRI_LIST_PARAM = eINSTANCE.getIriListParam();

		/**
		 * The meta object literal for the '<em><b>Iri Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRI_LIST_PARAM__IRI_PARAMS = eINSTANCE.getIriListParam_IriParams();

		/**
		 * The meta object literal for the '<em><b>Rdf Iri Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRI_LIST_PARAM__RDF_IRI_NODE = eINSTANCE.getIriListParam_RdfIriNode();

		/**
		 * The meta object literal for the '<em><b>Rdf Path Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRI_LIST_PARAM__RDF_PATH_PART = eINSTANCE.getIriListParam_RdfPathPart();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionrdf.RdfQuantifier <em>Rdf Quantifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionrdf.RdfQuantifier
		 * @see qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl#getRdfQuantifier()
		 * @generated
		 */
		EEnum RDF_QUANTIFIER = eINSTANCE.getRdfQuantifier();

	}

} //AdaptionrdfPackage

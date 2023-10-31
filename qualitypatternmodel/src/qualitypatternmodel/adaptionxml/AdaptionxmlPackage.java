/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.parameters.ParametersPackage;

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
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlFactory
 * @model kind="package"
 * @generated
 */
public interface AdaptionxmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adaptionxml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "adaptionxml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adaptionxml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptionxmlPackage eINSTANCE = qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XmlElementImpl <em>Xml Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XmlElementImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlElement()
	 * @generated
	 */
	int XML_ELEMENT = 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl <em>Xml Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlNavigation()
	 * @generated
	 */
	int XML_NAVIGATION = 10;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XmlElementNavigationImpl <em>Xml Element Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XmlElementNavigationImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlElementNavigation()
	 * @generated
	 */
	int XML_ELEMENT_NAVIGATION = 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XmlReferenceImpl <em>Xml Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XmlReferenceImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlReference()
	 * @generated
	 */
	int XML_REFERENCE = 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl <em>Xml Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlProperty()
	 * @generated
	 */
	int XML_PROPERTY = 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XmlRootImpl <em>Xml Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XmlRootImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlRoot()
	 * @generated
	 */
	int XML_ROOT = 4;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyNavigationImpl <em>Xml Property Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XmlPropertyNavigationImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlPropertyNavigation()
	 * @generated
	 */
	int XML_PROPERTY_NAVIGATION = 5;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl <em>Xml Path Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlPathParam()
	 * @generated
	 */
	int XML_PATH_PARAM = 8;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.XmlNode <em>Xml Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.XmlNode
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlNode()
	 * @generated
	 */
	int XML_NODE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__ID = GraphstructurePackage.COMPLEX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__INTERNAL_ID = GraphstructurePackage.COMPLEX_NODE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__COMPARISON1 = GraphstructurePackage.COMPLEX_NODE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__COMPARISON2 = GraphstructurePackage.COMPLEX_NODE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__GRAPH = GraphstructurePackage.COMPLEX_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__NAME = GraphstructurePackage.COMPLEX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__PREDICATES = GraphstructurePackage.COMPLEX_NODE__PREDICATES;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__INCOMING = GraphstructurePackage.COMPLEX_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Return Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__RETURN_NODE = GraphstructurePackage.COMPLEX_NODE__RETURN_NODE;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__TYPE_MODIFIABLE = GraphstructurePackage.COMPLEX_NODE__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__TRANSLATED = GraphstructurePackage.COMPLEX_NODE__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__PREDICATES_ARE_BEING_TRANSLATED = GraphstructurePackage.COMPLEX_NODE__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__OUTGOING = GraphstructurePackage.COMPLEX_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__VARIABLES = GraphstructurePackage.COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XQuery Deep Equal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__XQUERY_DEEP_EQUAL = GraphstructurePackage.COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_FEATURE_COUNT = GraphstructurePackage.COMPLEX_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.COMPLEX_NODE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.COMPLEX_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___MY_TO_STRING = GraphstructurePackage.COMPLEX_NODE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GENERATE_CYPHER = GraphstructurePackage.COMPLEX_NODE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GENERATE_XQUERY = GraphstructurePackage.COMPLEX_NODE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GENERATE_SPARQL = GraphstructurePackage.COMPLEX_NODE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_CONTAINER = GraphstructurePackage.COMPLEX_NODE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_ANCESTOR__CLASS = GraphstructurePackage.COMPLEX_NODE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___INITIALIZE_TRANSLATION = GraphstructurePackage.COMPLEX_NODE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___PREPARE_TRANSLATION = GraphstructurePackage.COMPLEX_NODE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_OPERATOR_LIST = GraphstructurePackage.COMPLEX_NODE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_ALL_OPERATORS = GraphstructurePackage.COMPLEX_NODE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_PARAMETER_LIST = GraphstructurePackage.COMPLEX_NODE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_ALL_PARAMETERS = GraphstructurePackage.COMPLEX_NODE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.COMPLEX_NODE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.COMPLEX_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.COMPLEX_NODE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.COMPLEX_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___RECORD_VALUES__XMLDATADATABASE = GraphstructurePackage.COMPLEX_NODE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___RELATIONS_XML_ADAPTED = GraphstructurePackage.COMPLEX_NODE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CREATE_XML_ADAPTION = GraphstructurePackage.COMPLEX_NODE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CREATE_RDF_ADAPTION = GraphstructurePackage.COMPLEX_NODE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CREATE_NEO4J_ADAPTION = GraphstructurePackage.COMPLEX_NODE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CONTAINS_JAVA_OPERATOR = GraphstructurePackage.COMPLEX_NODE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.COMPLEX_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_RETURN_TYPE = GraphstructurePackage.COMPLEX_NODE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___IS_TRANSLATABLE = GraphstructurePackage.COMPLEX_NODE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_ALL_ARGUMENT_ELEMENTS = GraphstructurePackage.COMPLEX_NODE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___IS_OPERATOR_ARGUMENT = GraphstructurePackage.COMPLEX_NODE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CREATE_PARAMETERS = GraphstructurePackage.COMPLEX_NODE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.COMPLEX_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.COMPLEX_NODE___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Get Relations To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_RELATIONS_TO__NODE = GraphstructurePackage.COMPLEX_NODE___GET_RELATIONS_TO__NODE;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_OUTGOING = GraphstructurePackage.COMPLEX_NODE___ADD_OUTGOING;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_OUTGOING__GRAPH = GraphstructurePackage.COMPLEX_NODE___ADD_OUTGOING__GRAPH;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_OUTGOING__NODE = GraphstructurePackage.COMPLEX_NODE___ADD_OUTGOING__NODE;

	/**
	 * The operation id for the '<em>Add Incomming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_INCOMMING__COMPLEXNODE = GraphstructurePackage.COMPLEX_NODE___ADD_INCOMMING__COMPLEXNODE;

	/**
	 * The operation id for the '<em>Add Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_COMPARISON__NODE = GraphstructurePackage.COMPLEX_NODE___ADD_COMPARISON__NODE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_COMPARISON = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_COMPARISON__STRING = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_MATCH = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_MATCH;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_MATCH__STRING = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_MATCH__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_CONTAINS = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_CONTAINS;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_CONTAINS__STRING = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_CONTAINS__STRING;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_STRING_LENGTH = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_STRING_LENGTH;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_NULL_CHECK = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_NULL_CHECK;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN;

	/**
	 * The operation id for the '<em>Add Primitive Validate Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_VALIDATE_LINK = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_VALIDATE_LINK;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CHECK_COMPARISON_CONSISTENCY = GraphstructurePackage.COMPLEX_NODE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CHECK_COMPARISON_CONSISTENCY__COMPARISON = GraphstructurePackage.COMPLEX_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON;

	/**
	 * The operation id for the '<em>Check Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CHECK_GENERIC = GraphstructurePackage.COMPLEX_NODE___CHECK_GENERIC;

	/**
	 * The operation id for the '<em>Make Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___MAKE_GENERIC = GraphstructurePackage.COMPLEX_NODE___MAKE_GENERIC;

	/**
	 * The operation id for the '<em>Check Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CHECK_COMPLEX = GraphstructurePackage.COMPLEX_NODE___CHECK_COMPLEX;

	/**
	 * The operation id for the '<em>Make Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___MAKE_COMPLEX = GraphstructurePackage.COMPLEX_NODE___MAKE_COMPLEX;

	/**
	 * The operation id for the '<em>Check Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CHECK_PRIMITIVE = GraphstructurePackage.COMPLEX_NODE___CHECK_PRIMITIVE;

	/**
	 * The operation id for the '<em>Make Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___MAKE_PRIMITIVE = GraphstructurePackage.COMPLEX_NODE___MAKE_PRIMITIVE;

	/**
	 * The operation id for the '<em>Adapt As Xml Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADAPT_AS_XML_ELEMENT = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_XML_ELEMENT;

	/**
	 * The operation id for the '<em>Adapt As Xml Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADAPT_AS_XML_PROPERTY = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_XML_PROPERTY;

	/**
	 * The operation id for the '<em>Adapt As Rdf Iri Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADAPT_AS_RDF_IRI_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_RDF_IRI_NODE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Literal Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADAPT_AS_RDF_LITERAL_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_RDF_LITERAL_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADAPT_AS_NEO_ELEMENT_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_NEO_ELEMENT_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Property Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADAPT_AS_NEO_PROPERTY_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_NEO_PROPERTY_NODE;

	/**
	 * The operation id for the '<em>Translate Predicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___TRANSLATE_PREDICATES = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get XQuery Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_XQUERY_REPRESENTATION = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Translate Multiple Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___TRANSLATE_MULTIPLE_INCOMING = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Tag From Comparisons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_TAG_FROM_COMPARISONS = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Xml Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_OPERATION_COUNT = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__ID = GraphstructurePackage.RELATION__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__INTERNAL_ID = GraphstructurePackage.RELATION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__GRAPH = GraphstructurePackage.RELATION__GRAPH;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__SOURCE = GraphstructurePackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__TARGET = GraphstructurePackage.RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__NAME = GraphstructurePackage.RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__TRANSLATED = GraphstructurePackage.RELATION__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__PREDICATES_ARE_BEING_TRANSLATED = GraphstructurePackage.RELATION__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Xml Path Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__XML_PATH_PARAM = GraphstructurePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__SOURCE_VARIABLE = GraphstructurePackage.RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__VARIABLE_COUNTER = GraphstructurePackage.RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xml Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION_FEATURE_COUNT = GraphstructurePackage.RELATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.RELATION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.RELATION___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.RELATION___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___MY_TO_STRING = GraphstructurePackage.RELATION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GENERATE_CYPHER = GraphstructurePackage.RELATION___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GENERATE_XQUERY = GraphstructurePackage.RELATION___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GENERATE_SPARQL = GraphstructurePackage.RELATION___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GET_CONTAINER = GraphstructurePackage.RELATION___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GET_ANCESTOR__CLASS = GraphstructurePackage.RELATION___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___INITIALIZE_TRANSLATION = GraphstructurePackage.RELATION___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___PREPARE_TRANSLATION = GraphstructurePackage.RELATION___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GET_OPERATOR_LIST = GraphstructurePackage.RELATION___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GET_ALL_OPERATORS = GraphstructurePackage.RELATION___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GET_PARAMETER_LIST = GraphstructurePackage.RELATION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GET_ALL_PARAMETERS = GraphstructurePackage.RELATION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.RELATION___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.RELATION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___RECORD_VALUES__XMLDATADATABASE = GraphstructurePackage.RELATION___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___RELATIONS_XML_ADAPTED = GraphstructurePackage.RELATION___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___CREATE_XML_ADAPTION = GraphstructurePackage.RELATION___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___CREATE_RDF_ADAPTION = GraphstructurePackage.RELATION___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___CREATE_NEO4J_ADAPTION = GraphstructurePackage.RELATION___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___CONTAINS_JAVA_OPERATOR = GraphstructurePackage.RELATION___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___CREATE_PARAMETERS = GraphstructurePackage.RELATION___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.RELATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.RELATION___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Is Cross Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___IS_CROSS_GRAPH = GraphstructurePackage.RELATION___IS_CROSS_GRAPH;

	/**
	 * The operation id for the '<em>Adapt As Xml Element Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___ADAPT_AS_XML_ELEMENT_NAVIGATION = GraphstructurePackage.RELATION___ADAPT_AS_XML_ELEMENT_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Property Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___ADAPT_AS_XML_PROPERTY_NAVIGATION = GraphstructurePackage.RELATION___ADAPT_AS_XML_PROPERTY_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___ADAPT_AS_XML_REFERENCE = GraphstructurePackage.RELATION___ADAPT_AS_XML_REFERENCE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Predicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___ADAPT_AS_RDF_PREDICATE = GraphstructurePackage.RELATION___ADAPT_AS_RDF_PREDICATE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___ADAPT_AS_NEO_ELEMENT_EDGE = GraphstructurePackage.RELATION___ADAPT_AS_NEO_ELEMENT_EDGE;

	/**
	 * The operation id for the '<em>Adapt As Property Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___ADAPT_AS_PROPERTY_EDGE = GraphstructurePackage.RELATION___ADAPT_AS_PROPERTY_EDGE;

	/**
	 * The number of operations of the '<em>Xml Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION_OPERATION_COUNT = GraphstructurePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION__ID = XML_NAVIGATION__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION__INTERNAL_ID = XML_NAVIGATION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION__GRAPH = XML_NAVIGATION__GRAPH;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION__SOURCE = XML_NAVIGATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION__TARGET = XML_NAVIGATION__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION__NAME = XML_NAVIGATION__NAME;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION__TRANSLATED = XML_NAVIGATION__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION__PREDICATES_ARE_BEING_TRANSLATED = XML_NAVIGATION__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Xml Path Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION__XML_PATH_PARAM = XML_NAVIGATION__XML_PATH_PARAM;

	/**
	 * The feature id for the '<em><b>Source Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION__SOURCE_VARIABLE = XML_NAVIGATION__SOURCE_VARIABLE;

	/**
	 * The feature id for the '<em><b>Variable Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION__VARIABLE_COUNTER = XML_NAVIGATION__VARIABLE_COUNTER;

	/**
	 * The number of structural features of the '<em>Xml Element Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION_FEATURE_COUNT = XML_NAVIGATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___VALIDATE__DIAGNOSTICCHAIN_MAP = XML_NAVIGATION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___IS_VALID__ABSTRACTIONLEVEL = XML_NAVIGATION___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___IS_VALID_LOCAL__ABSTRACTIONLEVEL = XML_NAVIGATION___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___MY_TO_STRING = XML_NAVIGATION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___GENERATE_CYPHER = XML_NAVIGATION___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___GENERATE_XQUERY = XML_NAVIGATION___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___GENERATE_SPARQL = XML_NAVIGATION___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___GET_CONTAINER = XML_NAVIGATION___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___GET_ANCESTOR__CLASS = XML_NAVIGATION___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___INITIALIZE_TRANSLATION = XML_NAVIGATION___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___PREPARE_TRANSLATION = XML_NAVIGATION___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___GET_OPERATOR_LIST = XML_NAVIGATION___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___GET_ALL_OPERATORS = XML_NAVIGATION___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___GET_PARAMETER_LIST = XML_NAVIGATION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___GET_ALL_PARAMETERS = XML_NAVIGATION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___PREPARE_PARAMETER_UPDATES = XML_NAVIGATION___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = XML_NAVIGATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___UPDATE_PARAMETERS__PARAMETERLIST = XML_NAVIGATION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = XML_NAVIGATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___RECORD_VALUES__XMLDATADATABASE = XML_NAVIGATION___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___RELATIONS_XML_ADAPTED = XML_NAVIGATION___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___CREATE_XML_ADAPTION = XML_NAVIGATION___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___CREATE_RDF_ADAPTION = XML_NAVIGATION___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___CREATE_NEO4J_ADAPTION = XML_NAVIGATION___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___CONTAINS_JAVA_OPERATOR = XML_NAVIGATION___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___CREATE_PARAMETERS = XML_NAVIGATION___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = XML_NAVIGATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___SET_GRAPH_SIMPLE__GRAPH = XML_NAVIGATION___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Is Cross Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___IS_CROSS_GRAPH = XML_NAVIGATION___IS_CROSS_GRAPH;

	/**
	 * The operation id for the '<em>Adapt As Xml Element Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___ADAPT_AS_XML_ELEMENT_NAVIGATION = XML_NAVIGATION___ADAPT_AS_XML_ELEMENT_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Property Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___ADAPT_AS_XML_PROPERTY_NAVIGATION = XML_NAVIGATION___ADAPT_AS_XML_PROPERTY_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___ADAPT_AS_XML_REFERENCE = XML_NAVIGATION___ADAPT_AS_XML_REFERENCE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Predicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___ADAPT_AS_RDF_PREDICATE = XML_NAVIGATION___ADAPT_AS_RDF_PREDICATE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___ADAPT_AS_NEO_ELEMENT_EDGE = XML_NAVIGATION___ADAPT_AS_NEO_ELEMENT_EDGE;

	/**
	 * The operation id for the '<em>Adapt As Property Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION___ADAPT_AS_PROPERTY_EDGE = XML_NAVIGATION___ADAPT_AS_PROPERTY_EDGE;

	/**
	 * The number of operations of the '<em>Xml Element Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_NAVIGATION_OPERATION_COUNT = XML_NAVIGATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__ID = GraphstructurePackage.RELATION__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__INTERNAL_ID = GraphstructurePackage.RELATION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__GRAPH = GraphstructurePackage.RELATION__GRAPH;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__SOURCE = GraphstructurePackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__TARGET = GraphstructurePackage.RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__NAME = GraphstructurePackage.RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__TRANSLATED = GraphstructurePackage.RELATION__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__PREDICATES_ARE_BEING_TRANSLATED = GraphstructurePackage.RELATION__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__TYPE = GraphstructurePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__PROPERTY = GraphstructurePackage.RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE_FEATURE_COUNT = GraphstructurePackage.RELATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.RELATION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.RELATION___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.RELATION___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___MY_TO_STRING = GraphstructurePackage.RELATION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GENERATE_CYPHER = GraphstructurePackage.RELATION___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GENERATE_XQUERY = GraphstructurePackage.RELATION___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GENERATE_SPARQL = GraphstructurePackage.RELATION___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GET_CONTAINER = GraphstructurePackage.RELATION___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GET_ANCESTOR__CLASS = GraphstructurePackage.RELATION___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___INITIALIZE_TRANSLATION = GraphstructurePackage.RELATION___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___PREPARE_TRANSLATION = GraphstructurePackage.RELATION___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GET_OPERATOR_LIST = GraphstructurePackage.RELATION___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GET_ALL_OPERATORS = GraphstructurePackage.RELATION___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GET_PARAMETER_LIST = GraphstructurePackage.RELATION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GET_ALL_PARAMETERS = GraphstructurePackage.RELATION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.RELATION___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.RELATION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___RECORD_VALUES__XMLDATADATABASE = GraphstructurePackage.RELATION___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___RELATIONS_XML_ADAPTED = GraphstructurePackage.RELATION___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___CREATE_XML_ADAPTION = GraphstructurePackage.RELATION___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___CREATE_RDF_ADAPTION = GraphstructurePackage.RELATION___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___CREATE_NEO4J_ADAPTION = GraphstructurePackage.RELATION___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___CONTAINS_JAVA_OPERATOR = GraphstructurePackage.RELATION___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___CREATE_PARAMETERS = GraphstructurePackage.RELATION___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.RELATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.RELATION___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Is Cross Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___IS_CROSS_GRAPH = GraphstructurePackage.RELATION___IS_CROSS_GRAPH;

	/**
	 * The operation id for the '<em>Adapt As Xml Element Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___ADAPT_AS_XML_ELEMENT_NAVIGATION = GraphstructurePackage.RELATION___ADAPT_AS_XML_ELEMENT_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Property Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___ADAPT_AS_XML_PROPERTY_NAVIGATION = GraphstructurePackage.RELATION___ADAPT_AS_XML_PROPERTY_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___ADAPT_AS_XML_REFERENCE = GraphstructurePackage.RELATION___ADAPT_AS_XML_REFERENCE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Predicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___ADAPT_AS_RDF_PREDICATE = GraphstructurePackage.RELATION___ADAPT_AS_RDF_PREDICATE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___ADAPT_AS_NEO_ELEMENT_EDGE = GraphstructurePackage.RELATION___ADAPT_AS_NEO_ELEMENT_EDGE;

	/**
	 * The operation id for the '<em>Adapt As Property Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___ADAPT_AS_PROPERTY_EDGE = GraphstructurePackage.RELATION___ADAPT_AS_PROPERTY_EDGE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___IS_TRANSLATABLE = GraphstructurePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source Property Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GET_SOURCE_PROPERTY_PATH = GraphstructurePackage.RELATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Target Property Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GET_TARGET_PROPERTY_PATH = GraphstructurePackage.RELATION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Xml Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE_OPERATION_COUNT = GraphstructurePackage.RELATION_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__ID = GraphstructurePackage.PRIMITIVE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__INTERNAL_ID = GraphstructurePackage.PRIMITIVE_NODE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__COMPARISON1 = GraphstructurePackage.PRIMITIVE_NODE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__COMPARISON2 = GraphstructurePackage.PRIMITIVE_NODE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__GRAPH = GraphstructurePackage.PRIMITIVE_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__NAME = GraphstructurePackage.PRIMITIVE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__PREDICATES = GraphstructurePackage.PRIMITIVE_NODE__PREDICATES;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__INCOMING = GraphstructurePackage.PRIMITIVE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Return Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__RETURN_NODE = GraphstructurePackage.PRIMITIVE_NODE__RETURN_NODE;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__TYPE_MODIFIABLE = GraphstructurePackage.PRIMITIVE_NODE__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__TRANSLATED = GraphstructurePackage.PRIMITIVE_NODE__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__PREDICATES_ARE_BEING_TRANSLATED = GraphstructurePackage.PRIMITIVE_NODE__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Match</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__MATCH = GraphstructurePackage.PRIMITIVE_NODE__MATCH;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__CONTAINS = GraphstructurePackage.PRIMITIVE_NODE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Null Check</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__NULL_CHECK = GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK;

	/**
	 * The feature id for the '<em><b>String Length</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__STRING_LENGTH = GraphstructurePackage.PRIMITIVE_NODE__STRING_LENGTH;

	/**
	 * The feature id for the '<em><b>One Arg Java Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__ONE_ARG_JAVA_OPERATOR = GraphstructurePackage.PRIMITIVE_NODE__ONE_ARG_JAVA_OPERATOR;

	/**
	 * The feature id for the '<em><b>Two Arg Java Operator1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__TWO_ARG_JAVA_OPERATOR1 = GraphstructurePackage.PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR1;

	/**
	 * The feature id for the '<em><b>Two Arg Java Operator2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__TWO_ARG_JAVA_OPERATOR2 = GraphstructurePackage.PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__VARIABLES = GraphstructurePackage.PRIMITIVE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__REFERENCES = GraphstructurePackage.PRIMITIVE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_FEATURE_COUNT = GraphstructurePackage.PRIMITIVE_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.PRIMITIVE_NODE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.PRIMITIVE_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___MY_TO_STRING = GraphstructurePackage.PRIMITIVE_NODE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GENERATE_CYPHER = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GENERATE_XQUERY = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GENERATE_SPARQL = GraphstructurePackage.PRIMITIVE_NODE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_CONTAINER = GraphstructurePackage.PRIMITIVE_NODE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_ANCESTOR__CLASS = GraphstructurePackage.PRIMITIVE_NODE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___INITIALIZE_TRANSLATION = GraphstructurePackage.PRIMITIVE_NODE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___PREPARE_TRANSLATION = GraphstructurePackage.PRIMITIVE_NODE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_OPERATOR_LIST = GraphstructurePackage.PRIMITIVE_NODE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_ALL_OPERATORS = GraphstructurePackage.PRIMITIVE_NODE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_PARAMETER_LIST = GraphstructurePackage.PRIMITIVE_NODE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_ALL_PARAMETERS = GraphstructurePackage.PRIMITIVE_NODE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.PRIMITIVE_NODE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.PRIMITIVE_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.PRIMITIVE_NODE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.PRIMITIVE_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___RECORD_VALUES__XMLDATADATABASE = GraphstructurePackage.PRIMITIVE_NODE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___RELATIONS_XML_ADAPTED = GraphstructurePackage.PRIMITIVE_NODE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___CREATE_XML_ADAPTION = GraphstructurePackage.PRIMITIVE_NODE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___CREATE_RDF_ADAPTION = GraphstructurePackage.PRIMITIVE_NODE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___CREATE_NEO4J_ADAPTION = GraphstructurePackage.PRIMITIVE_NODE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___CONTAINS_JAVA_OPERATOR = GraphstructurePackage.PRIMITIVE_NODE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.PRIMITIVE_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_RETURN_TYPE = GraphstructurePackage.PRIMITIVE_NODE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___IS_TRANSLATABLE = GraphstructurePackage.PRIMITIVE_NODE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_ALL_ARGUMENT_ELEMENTS = GraphstructurePackage.PRIMITIVE_NODE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___IS_OPERATOR_ARGUMENT = GraphstructurePackage.PRIMITIVE_NODE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___CREATE_PARAMETERS = GraphstructurePackage.PRIMITIVE_NODE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.PRIMITIVE_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.PRIMITIVE_NODE___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Get Relations To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_RELATIONS_TO__NODE = GraphstructurePackage.PRIMITIVE_NODE___GET_RELATIONS_TO__NODE;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_OUTGOING = GraphstructurePackage.PRIMITIVE_NODE___ADD_OUTGOING;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_OUTGOING__GRAPH = GraphstructurePackage.PRIMITIVE_NODE___ADD_OUTGOING__GRAPH;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_OUTGOING__NODE = GraphstructurePackage.PRIMITIVE_NODE___ADD_OUTGOING__NODE;

	/**
	 * The operation id for the '<em>Add Incomming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_INCOMMING__COMPLEXNODE = GraphstructurePackage.PRIMITIVE_NODE___ADD_INCOMMING__COMPLEXNODE;

	/**
	 * The operation id for the '<em>Add Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_COMPARISON__NODE = GraphstructurePackage.PRIMITIVE_NODE___ADD_COMPARISON__NODE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_PRIMITIVE_COMPARISON = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_PRIMITIVE_COMPARISON__STRING = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_PRIMITIVE_MATCH = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_MATCH;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_PRIMITIVE_MATCH__STRING = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_MATCH__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_PRIMITIVE_CONTAINS = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_CONTAINS;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_PRIMITIVE_CONTAINS__STRING = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_CONTAINS__STRING;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_PRIMITIVE_STRING_LENGTH = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_STRING_LENGTH;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_PRIMITIVE_NULL_CHECK = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_NULL_CHECK;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN;

	/**
	 * The operation id for the '<em>Add Primitive Validate Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_PRIMITIVE_VALIDATE_LINK = GraphstructurePackage.PRIMITIVE_NODE___ADD_PRIMITIVE_VALIDATE_LINK;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___CHECK_COMPARISON_CONSISTENCY = GraphstructurePackage.PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___CHECK_COMPARISON_CONSISTENCY__COMPARISON = GraphstructurePackage.PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON;

	/**
	 * The operation id for the '<em>Check Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___CHECK_GENERIC = GraphstructurePackage.PRIMITIVE_NODE___CHECK_GENERIC;

	/**
	 * The operation id for the '<em>Make Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___MAKE_GENERIC = GraphstructurePackage.PRIMITIVE_NODE___MAKE_GENERIC;

	/**
	 * The operation id for the '<em>Check Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___CHECK_COMPLEX = GraphstructurePackage.PRIMITIVE_NODE___CHECK_COMPLEX;

	/**
	 * The operation id for the '<em>Make Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___MAKE_COMPLEX = GraphstructurePackage.PRIMITIVE_NODE___MAKE_COMPLEX;

	/**
	 * The operation id for the '<em>Check Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___CHECK_PRIMITIVE = GraphstructurePackage.PRIMITIVE_NODE___CHECK_PRIMITIVE;

	/**
	 * The operation id for the '<em>Make Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___MAKE_PRIMITIVE = GraphstructurePackage.PRIMITIVE_NODE___MAKE_PRIMITIVE;

	/**
	 * The operation id for the '<em>Adapt As Xml Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADAPT_AS_XML_ELEMENT = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_XML_ELEMENT;

	/**
	 * The operation id for the '<em>Adapt As Xml Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADAPT_AS_XML_PROPERTY = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_XML_PROPERTY;

	/**
	 * The operation id for the '<em>Adapt As Rdf Iri Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADAPT_AS_RDF_IRI_NODE = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_RDF_IRI_NODE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Literal Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADAPT_AS_RDF_LITERAL_NODE = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_RDF_LITERAL_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADAPT_AS_NEO_ELEMENT_NODE = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_NEO_ELEMENT_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Property Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADAPT_AS_NEO_PROPERTY_NODE = GraphstructurePackage.PRIMITIVE_NODE___ADAPT_AS_NEO_PROPERTY_NODE;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___CHECK_COMPARISON_CONSISTENCY__PARAMETERVALUE = GraphstructurePackage.PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Translate Predicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___TRANSLATE_PREDICATES = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get XQuery Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_XQUERY_REPRESENTATION = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Translate Multiple Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___TRANSLATE_MULTIPLE_INCOMING = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Xml Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPERATION_COUNT = GraphstructurePackage.PRIMITIVE_NODE_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__ID = GraphstructurePackage.COMPLEX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__INTERNAL_ID = GraphstructurePackage.COMPLEX_NODE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__COMPARISON1 = GraphstructurePackage.COMPLEX_NODE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__COMPARISON2 = GraphstructurePackage.COMPLEX_NODE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__GRAPH = GraphstructurePackage.COMPLEX_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__NAME = GraphstructurePackage.COMPLEX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__PREDICATES = GraphstructurePackage.COMPLEX_NODE__PREDICATES;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__INCOMING = GraphstructurePackage.COMPLEX_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Return Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__RETURN_NODE = GraphstructurePackage.COMPLEX_NODE__RETURN_NODE;

	/**
	 * The feature id for the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__TYPE_MODIFIABLE = GraphstructurePackage.COMPLEX_NODE__TYPE_MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__TRANSLATED = GraphstructurePackage.COMPLEX_NODE__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__PREDICATES_ARE_BEING_TRANSLATED = GraphstructurePackage.COMPLEX_NODE__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__OUTGOING = GraphstructurePackage.COMPLEX_NODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>Xml Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT_FEATURE_COUNT = GraphstructurePackage.COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.COMPLEX_NODE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.COMPLEX_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___MY_TO_STRING = GraphstructurePackage.COMPLEX_NODE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GENERATE_CYPHER = GraphstructurePackage.COMPLEX_NODE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GENERATE_XQUERY = GraphstructurePackage.COMPLEX_NODE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GENERATE_SPARQL = GraphstructurePackage.COMPLEX_NODE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_CONTAINER = GraphstructurePackage.COMPLEX_NODE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_ANCESTOR__CLASS = GraphstructurePackage.COMPLEX_NODE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___INITIALIZE_TRANSLATION = GraphstructurePackage.COMPLEX_NODE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___PREPARE_TRANSLATION = GraphstructurePackage.COMPLEX_NODE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_OPERATOR_LIST = GraphstructurePackage.COMPLEX_NODE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_ALL_OPERATORS = GraphstructurePackage.COMPLEX_NODE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_PARAMETER_LIST = GraphstructurePackage.COMPLEX_NODE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_ALL_PARAMETERS = GraphstructurePackage.COMPLEX_NODE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.COMPLEX_NODE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.COMPLEX_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.COMPLEX_NODE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.COMPLEX_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___RECORD_VALUES__XMLDATADATABASE = GraphstructurePackage.COMPLEX_NODE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___RELATIONS_XML_ADAPTED = GraphstructurePackage.COMPLEX_NODE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CREATE_XML_ADAPTION = GraphstructurePackage.COMPLEX_NODE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CREATE_RDF_ADAPTION = GraphstructurePackage.COMPLEX_NODE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CREATE_NEO4J_ADAPTION = GraphstructurePackage.COMPLEX_NODE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CONTAINS_JAVA_OPERATOR = GraphstructurePackage.COMPLEX_NODE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.COMPLEX_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_RETURN_TYPE = GraphstructurePackage.COMPLEX_NODE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___IS_TRANSLATABLE = GraphstructurePackage.COMPLEX_NODE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_ALL_ARGUMENT_ELEMENTS = GraphstructurePackage.COMPLEX_NODE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___IS_OPERATOR_ARGUMENT = GraphstructurePackage.COMPLEX_NODE___IS_OPERATOR_ARGUMENT;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CREATE_PARAMETERS = GraphstructurePackage.COMPLEX_NODE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.COMPLEX_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.COMPLEX_NODE___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Get Relations To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_RELATIONS_TO__NODE = GraphstructurePackage.COMPLEX_NODE___GET_RELATIONS_TO__NODE;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_OUTGOING = GraphstructurePackage.COMPLEX_NODE___ADD_OUTGOING;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_OUTGOING__GRAPH = GraphstructurePackage.COMPLEX_NODE___ADD_OUTGOING__GRAPH;

	/**
	 * The operation id for the '<em>Add Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_OUTGOING__NODE = GraphstructurePackage.COMPLEX_NODE___ADD_OUTGOING__NODE;

	/**
	 * The operation id for the '<em>Add Incomming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_INCOMMING__COMPLEXNODE = GraphstructurePackage.COMPLEX_NODE___ADD_INCOMMING__COMPLEXNODE;

	/**
	 * The operation id for the '<em>Add Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_COMPARISON__NODE = GraphstructurePackage.COMPLEX_NODE___ADD_COMPARISON__NODE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_COMPARISON = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_COMPARISON__STRING = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_MATCH = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_MATCH;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_MATCH__STRING = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_MATCH__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_CONTAINS = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_CONTAINS;

	/**
	 * The operation id for the '<em>Add Primitive Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_CONTAINS__STRING = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_CONTAINS__STRING;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_STRING_LENGTH = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_STRING_LENGTH;

	/**
	 * The operation id for the '<em>Add Primitive String Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_NULL_CHECK = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_NULL_CHECK;

	/**
	 * The operation id for the '<em>Add Primitive Null Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN;

	/**
	 * The operation id for the '<em>Add Primitive Validate Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_VALIDATE_LINK = GraphstructurePackage.COMPLEX_NODE___ADD_PRIMITIVE_VALIDATE_LINK;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CHECK_COMPARISON_CONSISTENCY = GraphstructurePackage.COMPLEX_NODE___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CHECK_COMPARISON_CONSISTENCY__COMPARISON = GraphstructurePackage.COMPLEX_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON;

	/**
	 * The operation id for the '<em>Check Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CHECK_GENERIC = GraphstructurePackage.COMPLEX_NODE___CHECK_GENERIC;

	/**
	 * The operation id for the '<em>Make Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___MAKE_GENERIC = GraphstructurePackage.COMPLEX_NODE___MAKE_GENERIC;

	/**
	 * The operation id for the '<em>Check Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CHECK_COMPLEX = GraphstructurePackage.COMPLEX_NODE___CHECK_COMPLEX;

	/**
	 * The operation id for the '<em>Make Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___MAKE_COMPLEX = GraphstructurePackage.COMPLEX_NODE___MAKE_COMPLEX;

	/**
	 * The operation id for the '<em>Check Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CHECK_PRIMITIVE = GraphstructurePackage.COMPLEX_NODE___CHECK_PRIMITIVE;

	/**
	 * The operation id for the '<em>Make Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___MAKE_PRIMITIVE = GraphstructurePackage.COMPLEX_NODE___MAKE_PRIMITIVE;

	/**
	 * The operation id for the '<em>Adapt As Xml Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADAPT_AS_XML_ELEMENT = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_XML_ELEMENT;

	/**
	 * The operation id for the '<em>Adapt As Xml Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADAPT_AS_XML_PROPERTY = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_XML_PROPERTY;

	/**
	 * The operation id for the '<em>Adapt As Rdf Iri Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADAPT_AS_RDF_IRI_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_RDF_IRI_NODE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Literal Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADAPT_AS_RDF_LITERAL_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_RDF_LITERAL_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADAPT_AS_NEO_ELEMENT_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_NEO_ELEMENT_NODE;

	/**
	 * The operation id for the '<em>Adapt As Neo Property Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADAPT_AS_NEO_PROPERTY_NODE = GraphstructurePackage.COMPLEX_NODE___ADAPT_AS_NEO_PROPERTY_NODE;

	/**
	 * The number of operations of the '<em>Xml Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT_OPERATION_COUNT = GraphstructurePackage.COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION__ID = XML_NAVIGATION__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION__INTERNAL_ID = XML_NAVIGATION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION__GRAPH = XML_NAVIGATION__GRAPH;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION__SOURCE = XML_NAVIGATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION__TARGET = XML_NAVIGATION__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION__NAME = XML_NAVIGATION__NAME;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION__TRANSLATED = XML_NAVIGATION__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION__PREDICATES_ARE_BEING_TRANSLATED = XML_NAVIGATION__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Xml Path Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION__XML_PATH_PARAM = XML_NAVIGATION__XML_PATH_PARAM;

	/**
	 * The feature id for the '<em><b>Source Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION__SOURCE_VARIABLE = XML_NAVIGATION__SOURCE_VARIABLE;

	/**
	 * The feature id for the '<em><b>Variable Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION__VARIABLE_COUNTER = XML_NAVIGATION__VARIABLE_COUNTER;

	/**
	 * The number of structural features of the '<em>Xml Property Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION_FEATURE_COUNT = XML_NAVIGATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___VALIDATE__DIAGNOSTICCHAIN_MAP = XML_NAVIGATION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___IS_VALID__ABSTRACTIONLEVEL = XML_NAVIGATION___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___IS_VALID_LOCAL__ABSTRACTIONLEVEL = XML_NAVIGATION___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___MY_TO_STRING = XML_NAVIGATION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___GENERATE_CYPHER = XML_NAVIGATION___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___GENERATE_XQUERY = XML_NAVIGATION___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___GENERATE_SPARQL = XML_NAVIGATION___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___GET_CONTAINER = XML_NAVIGATION___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___GET_ANCESTOR__CLASS = XML_NAVIGATION___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___INITIALIZE_TRANSLATION = XML_NAVIGATION___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___PREPARE_TRANSLATION = XML_NAVIGATION___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___GET_OPERATOR_LIST = XML_NAVIGATION___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___GET_ALL_OPERATORS = XML_NAVIGATION___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___GET_PARAMETER_LIST = XML_NAVIGATION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___GET_ALL_PARAMETERS = XML_NAVIGATION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___PREPARE_PARAMETER_UPDATES = XML_NAVIGATION___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = XML_NAVIGATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___UPDATE_PARAMETERS__PARAMETERLIST = XML_NAVIGATION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = XML_NAVIGATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___RECORD_VALUES__XMLDATADATABASE = XML_NAVIGATION___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___RELATIONS_XML_ADAPTED = XML_NAVIGATION___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___CREATE_XML_ADAPTION = XML_NAVIGATION___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___CREATE_RDF_ADAPTION = XML_NAVIGATION___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___CREATE_NEO4J_ADAPTION = XML_NAVIGATION___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___CONTAINS_JAVA_OPERATOR = XML_NAVIGATION___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___CREATE_PARAMETERS = XML_NAVIGATION___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = XML_NAVIGATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___SET_GRAPH_SIMPLE__GRAPH = XML_NAVIGATION___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Is Cross Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___IS_CROSS_GRAPH = XML_NAVIGATION___IS_CROSS_GRAPH;

	/**
	 * The operation id for the '<em>Adapt As Xml Element Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___ADAPT_AS_XML_ELEMENT_NAVIGATION = XML_NAVIGATION___ADAPT_AS_XML_ELEMENT_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Property Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___ADAPT_AS_XML_PROPERTY_NAVIGATION = XML_NAVIGATION___ADAPT_AS_XML_PROPERTY_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As Xml Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___ADAPT_AS_XML_REFERENCE = XML_NAVIGATION___ADAPT_AS_XML_REFERENCE;

	/**
	 * The operation id for the '<em>Adapt As Rdf Predicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___ADAPT_AS_RDF_PREDICATE = XML_NAVIGATION___ADAPT_AS_RDF_PREDICATE;

	/**
	 * The operation id for the '<em>Adapt As Neo Element Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___ADAPT_AS_NEO_ELEMENT_EDGE = XML_NAVIGATION___ADAPT_AS_NEO_ELEMENT_EDGE;

	/**
	 * The operation id for the '<em>Adapt As Property Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION___ADAPT_AS_PROPERTY_EDGE = XML_NAVIGATION___ADAPT_AS_PROPERTY_EDGE;

	/**
	 * The number of operations of the '<em>Xml Property Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_NAVIGATION_OPERATION_COUNT = XML_NAVIGATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XmlAxisOptionParamImpl <em>Xml Axis Option Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XmlAxisOptionParamImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlAxisOptionParam()
	 * @generated
	 */
	int XML_AXIS_OPTION_PARAM = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM__ID = ParametersPackage.PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM__INTERNAL_ID = ParametersPackage.PARAMETER__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM__PARAMETER_LIST = ParametersPackage.PARAMETER__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM__PREDEFINED = ParametersPackage.PARAMETER__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM__PARAMETER_REFERENCES = ParametersPackage.PARAMETER__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM__DESCRIPTION = ParametersPackage.PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM__OPTIONS = ParametersPackage.PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM__VALUE = ParametersPackage.PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xml Axis Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM__XML_AXIS_PART = ParametersPackage.PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xml Axis Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM_FEATURE_COUNT = ParametersPackage.PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___IS_VALID__ABSTRACTIONLEVEL = ParametersPackage.PARAMETER___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = ParametersPackage.PARAMETER___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___MY_TO_STRING = ParametersPackage.PARAMETER___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___GENERATE_CYPHER = ParametersPackage.PARAMETER___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___GENERATE_XQUERY = ParametersPackage.PARAMETER___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___GENERATE_SPARQL = ParametersPackage.PARAMETER___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___GET_CONTAINER = ParametersPackage.PARAMETER___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___GET_ANCESTOR__CLASS = ParametersPackage.PARAMETER___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___INITIALIZE_TRANSLATION = ParametersPackage.PARAMETER___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___PREPARE_TRANSLATION = ParametersPackage.PARAMETER___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___GET_OPERATOR_LIST = ParametersPackage.PARAMETER___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___GET_ALL_OPERATORS = ParametersPackage.PARAMETER___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___GET_PARAMETER_LIST = ParametersPackage.PARAMETER___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___GET_ALL_PARAMETERS = ParametersPackage.PARAMETER___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___PREPARE_PARAMETER_UPDATES = ParametersPackage.PARAMETER___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = ParametersPackage.PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = ParametersPackage.PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = ParametersPackage.PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___RECORD_VALUES__XMLDATADATABASE = ParametersPackage.PARAMETER___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___RELATIONS_XML_ADAPTED = ParametersPackage.PARAMETER___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___CREATE_XML_ADAPTION = ParametersPackage.PARAMETER___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___CREATE_RDF_ADAPTION = ParametersPackage.PARAMETER___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___CREATE_NEO4J_ADAPTION = ParametersPackage.PARAMETER___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___CONTAINS_JAVA_OPERATOR = ParametersPackage.PARAMETER___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = ParametersPackage.PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___VALIDATE_AGAINST_SCHEMA = ParametersPackage.PARAMETER___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = ParametersPackage.PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___INPUT_IS_VALID = ParametersPackage.PARAMETER___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___IS_USED = ParametersPackage.PARAMETER___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___SET_VALUE_FROM_STRING__STRING = ParametersPackage.PARAMETER___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___GET_VALUE_AS_STRING = ParametersPackage.PARAMETER___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___CHECK_COMPARISON_CONSISTENCY = ParametersPackage.PARAMETER___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___GET_OPTIONS_AS_STRING_LIST = ParametersPackage.PARAMETER___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___GENERATE_DESCRIPTION = ParametersPackage.PARAMETER___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Set Value If Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___SET_VALUE_IF_VALID__XMLAXISKIND = ParametersPackage.PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Infer Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM___INFER_SUGGESTIONS = ParametersPackage.PARAMETER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Xml Axis Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_OPTION_PARAM_OPERATION_COUNT = ParametersPackage.PARAMETER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl <em>Xml Property Option Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlPropertyOptionParam()
	 * @generated
	 */
	int XML_PROPERTY_OPTION_PARAM = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM__ID = ParametersPackage.PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM__INTERNAL_ID = ParametersPackage.PARAMETER__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM__PARAMETER_LIST = ParametersPackage.PARAMETER__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM__PREDEFINED = ParametersPackage.PARAMETER__PREDEFINED;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM__PARAMETER_REFERENCES = ParametersPackage.PARAMETER__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM__DESCRIPTION = ParametersPackage.PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM__OPTIONS = ParametersPackage.PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM__VALUE = ParametersPackage.PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xml Path Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM = ParametersPackage.PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME = ParametersPackage.PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Xml Axis Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART = ParametersPackage.PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Xml Property Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM_FEATURE_COUNT = ParametersPackage.PARAMETER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___IS_VALID__ABSTRACTIONLEVEL = ParametersPackage.PARAMETER___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = ParametersPackage.PARAMETER___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___MY_TO_STRING = ParametersPackage.PARAMETER___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___GENERATE_CYPHER = ParametersPackage.PARAMETER___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___GENERATE_XQUERY = ParametersPackage.PARAMETER___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___GENERATE_SPARQL = ParametersPackage.PARAMETER___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___GET_CONTAINER = ParametersPackage.PARAMETER___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___GET_ANCESTOR__CLASS = ParametersPackage.PARAMETER___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___INITIALIZE_TRANSLATION = ParametersPackage.PARAMETER___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___PREPARE_TRANSLATION = ParametersPackage.PARAMETER___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___GET_OPERATOR_LIST = ParametersPackage.PARAMETER___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___GET_ALL_OPERATORS = ParametersPackage.PARAMETER___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___GET_PARAMETER_LIST = ParametersPackage.PARAMETER___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___GET_ALL_PARAMETERS = ParametersPackage.PARAMETER___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___PREPARE_PARAMETER_UPDATES = ParametersPackage.PARAMETER___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = ParametersPackage.PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = ParametersPackage.PARAMETER___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = ParametersPackage.PARAMETER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___RECORD_VALUES__XMLDATADATABASE = ParametersPackage.PARAMETER___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___RELATIONS_XML_ADAPTED = ParametersPackage.PARAMETER___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___CREATE_XML_ADAPTION = ParametersPackage.PARAMETER___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___CREATE_RDF_ADAPTION = ParametersPackage.PARAMETER___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___CREATE_NEO4J_ADAPTION = ParametersPackage.PARAMETER___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___CONTAINS_JAVA_OPERATOR = ParametersPackage.PARAMETER___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = ParametersPackage.PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___VALIDATE_AGAINST_SCHEMA = ParametersPackage.PARAMETER___VALIDATE_AGAINST_SCHEMA;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = ParametersPackage.PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___INPUT_IS_VALID = ParametersPackage.PARAMETER___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___IS_USED = ParametersPackage.PARAMETER___IS_USED;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___SET_VALUE_FROM_STRING__STRING = ParametersPackage.PARAMETER___SET_VALUE_FROM_STRING__STRING;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___GET_VALUE_AS_STRING = ParametersPackage.PARAMETER___GET_VALUE_AS_STRING;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___CHECK_COMPARISON_CONSISTENCY = ParametersPackage.PARAMETER___CHECK_COMPARISON_CONSISTENCY;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___GET_OPTIONS_AS_STRING_LIST = ParametersPackage.PARAMETER___GET_OPTIONS_AS_STRING_LIST;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___GENERATE_DESCRIPTION = ParametersPackage.PARAMETER___GENERATE_DESCRIPTION;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___CREATE_PARAMETERS = ParametersPackage.PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = ParametersPackage.PARAMETER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Value If Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM___SET_VALUE_IF_VALID__XMLPROPERTYKIND = ParametersPackage.PARAMETER_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Xml Property Option Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPTION_PARAM_OPERATION_COUNT = ParametersPackage.PARAMETER_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM__ID = GraphstructurePackage.ADAPTABLE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM__INTERNAL_ID = GraphstructurePackage.ADAPTABLE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM__PARAMETER_LIST = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM__PREDEFINED = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM__PARAMETER_REFERENCES = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM__DESCRIPTION = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Xml Property Option Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM__XML_PROPERTY_OPTION_PARAM = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Xml Axis Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM__XML_AXIS_PARTS = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Xml Navigation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM__XML_NAVIGATION = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Xml Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM_FEATURE_COUNT = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.ADAPTABLE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.ADAPTABLE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___MY_TO_STRING = GraphstructurePackage.ADAPTABLE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___GENERATE_CYPHER = GraphstructurePackage.ADAPTABLE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___GENERATE_XQUERY = GraphstructurePackage.ADAPTABLE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___GENERATE_SPARQL = GraphstructurePackage.ADAPTABLE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___GET_CONTAINER = GraphstructurePackage.ADAPTABLE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___GET_ANCESTOR__CLASS = GraphstructurePackage.ADAPTABLE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___INITIALIZE_TRANSLATION = GraphstructurePackage.ADAPTABLE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___PREPARE_TRANSLATION = GraphstructurePackage.ADAPTABLE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___GET_OPERATOR_LIST = GraphstructurePackage.ADAPTABLE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___GET_ALL_OPERATORS = GraphstructurePackage.ADAPTABLE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___GET_PARAMETER_LIST = GraphstructurePackage.ADAPTABLE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___GET_ALL_PARAMETERS = GraphstructurePackage.ADAPTABLE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.ADAPTABLE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.ADAPTABLE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.ADAPTABLE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.ADAPTABLE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___RECORD_VALUES__XMLDATADATABASE = GraphstructurePackage.ADAPTABLE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___RELATIONS_XML_ADAPTED = GraphstructurePackage.ADAPTABLE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___CREATE_XML_ADAPTION = GraphstructurePackage.ADAPTABLE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___CREATE_RDF_ADAPTION = GraphstructurePackage.ADAPTABLE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___CREATE_NEO4J_ADAPTION = GraphstructurePackage.ADAPTABLE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___CONTAINS_JAVA_OPERATOR = GraphstructurePackage.ADAPTABLE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___CREATE_PARAMETERS = GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___VALIDATE_AGAINST_SCHEMA = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___INPUT_IS_VALID = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___IS_USED = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___SET_VALUE_FROM_STRING__STRING = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___GET_VALUE_AS_STRING = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___GET_OPTIONS_AS_STRING_LIST = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___GENERATE_DESCRIPTION = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Set Xml Axis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___SET_XML_AXIS__XMLAXISKIND_STRING = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Add Xml Axis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___ADD_XML_AXIS__XMLAXISKIND_STRING = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Set Xml Axis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___SET_XML_AXIS__XMLAXISKIND = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Set Xml Axis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___SET_XML_AXIS__XMLAXISKIND_STRING_1 = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Specify Axis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM___SPECIFY_AXIS__XMLAXISKIND_XMLPROPERTYKIND_STRING_STRING = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Xml Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PATH_PARAM_OPERATION_COUNT = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl <em>Xml Axis Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlAxisPart()
	 * @generated
	 */
	int XML_AXIS_PART = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART__ID = GraphstructurePackage.ADAPTABLE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART__INTERNAL_ID = GraphstructurePackage.ADAPTABLE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART__PARAMETER_LIST = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART__PREDEFINED = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART__PARAMETER_REFERENCES = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART__DESCRIPTION = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Text Literal Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART__TEXT_LITERAL_PARAM = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Xml Axis Option Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART__XML_AXIS_OPTION_PARAM = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Xml Path Param</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART__XML_PATH_PARAM = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Xml Property Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART__XML_PROPERTY_OPTION = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Xml Axis Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART_FEATURE_COUNT = GraphstructurePackage.ADAPTABLE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.ADAPTABLE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.ADAPTABLE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___MY_TO_STRING = GraphstructurePackage.ADAPTABLE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Generate Cypher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___GENERATE_CYPHER = GraphstructurePackage.ADAPTABLE___GENERATE_CYPHER;

	/**
	 * The operation id for the '<em>Generate XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___GENERATE_XQUERY = GraphstructurePackage.ADAPTABLE___GENERATE_XQUERY;

	/**
	 * The operation id for the '<em>Generate Sparql</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___GENERATE_SPARQL = GraphstructurePackage.ADAPTABLE___GENERATE_SPARQL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___GET_CONTAINER = GraphstructurePackage.ADAPTABLE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___GET_ANCESTOR__CLASS = GraphstructurePackage.ADAPTABLE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___INITIALIZE_TRANSLATION = GraphstructurePackage.ADAPTABLE___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___PREPARE_TRANSLATION = GraphstructurePackage.ADAPTABLE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___GET_OPERATOR_LIST = GraphstructurePackage.ADAPTABLE___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___GET_ALL_OPERATORS = GraphstructurePackage.ADAPTABLE___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___GET_PARAMETER_LIST = GraphstructurePackage.ADAPTABLE___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___GET_ALL_PARAMETERS = GraphstructurePackage.ADAPTABLE___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.ADAPTABLE___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.ADAPTABLE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.ADAPTABLE___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.ADAPTABLE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___RECORD_VALUES__XMLDATADATABASE = GraphstructurePackage.ADAPTABLE___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___RELATIONS_XML_ADAPTED = GraphstructurePackage.ADAPTABLE___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Create Xml Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___CREATE_XML_ADAPTION = GraphstructurePackage.ADAPTABLE___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Create Rdf Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___CREATE_RDF_ADAPTION = GraphstructurePackage.ADAPTABLE___CREATE_RDF_ADAPTION;

	/**
	 * The operation id for the '<em>Create Neo4j Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___CREATE_NEO4J_ADAPTION = GraphstructurePackage.ADAPTABLE___CREATE_NEO4J_ADAPTION;

	/**
	 * The operation id for the '<em>Contains Java Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___CONTAINS_JAVA_OPERATOR = GraphstructurePackage.ADAPTABLE___CONTAINS_JAVA_OPERATOR;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___CREATE_PARAMETERS = GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___VALIDATE_AGAINST_SCHEMA = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Example Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___VALIDATE_EXAMPLE_VALUE__STRING = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___INPUT_IS_VALID = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___IS_USED = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___SET_VALUE_FROM_STRING__STRING = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Value As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___GET_VALUE_AS_STRING = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Check Comparison Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___CHECK_COMPARISON_CONSISTENCY = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Options As String List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___GET_OPTIONS_AS_STRING_LIST = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___GENERATE_DESCRIPTION = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Next Xml Axis Pairs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___GET_NEXT_XML_AXIS_PAIRS = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Previous Xml Axis Pairs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___GET_PREVIOUS_XML_AXIS_PAIRS = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Infer Axis Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___INFER_AXIS_SUGGESTIONS = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Infer Element Tag Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___INFER_ELEMENT_TAG_SUGGESTIONS = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Infer Element Tag Suggestions From Incoming Relations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___INFER_ELEMENT_TAG_SUGGESTIONS_FROM_INCOMING_RELATIONS = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Infer Element Tag Suggestions From Outgoing Relations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART___INFER_ELEMENT_TAG_SUGGESTIONS_FROM_OUTGOING_RELATIONS = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 15;

	/**
	 * The number of operations of the '<em>Xml Axis Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_AXIS_PART_OPERATION_COUNT = GraphstructurePackage.ADAPTABLE_OPERATION_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NODE__VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Xml Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NODE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Translate Predicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NODE___TRANSLATE_PREDICATES = 0;

	/**
	 * The operation id for the '<em>Get XQuery Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NODE___GET_XQUERY_REPRESENTATION = 1;

	/**
	 * The operation id for the '<em>Translate Multiple Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NODE___TRANSLATE_MULTIPLE_INCOMING = 2;

	/**
	 * The number of operations of the '<em>Xml Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NODE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.XmlPropertyKind <em>Xml Property Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyKind
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlPropertyKind()
	 * @generated
	 */
	int XML_PROPERTY_KIND = 12;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.XmlAxisKind <em>Xml Axis Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.XmlAxisKind
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlAxisKind()
	 * @generated
	 */
	int XML_AXIS_KIND = 13;

	/**
	 * The meta object id for the '<em>Xml Axis Kind Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlAxisKindArray()
	 * @generated
	 */
	int XML_AXIS_KIND_ARRAY = 14;

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XmlElement <em>Xml Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Element</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlElement
	 * @generated
	 */
	EClass getXmlElement();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionxml.XmlElement#isXQueryDeepEqual <em>XQuery Deep Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XQuery Deep Equal</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlElement#isXQueryDeepEqual()
	 * @see #getXmlElement()
	 * @generated
	 */
	EAttribute getXmlElement_XQueryDeepEqual();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlElement#getTagFromComparisons() <em>Get Tag From Comparisons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tag From Comparisons</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlElement#getTagFromComparisons()
	 * @generated
	 */
	EOperation getXmlElement__GetTagFromComparisons();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XmlElementNavigation <em>Xml Element Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Element Navigation</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlElementNavigation
	 * @generated
	 */
	EClass getXmlElementNavigation();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XmlReference <em>Xml Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Reference</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlReference
	 * @generated
	 */
	EClass getXmlReference();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionxml.XmlReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlReference#getType()
	 * @see #getXmlReference()
	 * @generated
	 */
	EAttribute getXmlReference_Type();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XmlReference#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlReference#getProperty()
	 * @see #getXmlReference()
	 * @generated
	 */
	EReference getXmlReference_Property();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlReference#isTranslatable() <em>Is Translatable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Translatable</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlReference#isTranslatable()
	 * @generated
	 */
	EOperation getXmlReference__IsTranslatable();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlReference#getSourcePropertyPath() <em>Get Source Property Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Property Path</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlReference#getSourcePropertyPath()
	 * @generated
	 */
	EOperation getXmlReference__GetSourcePropertyPath();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlReference#getTargetPropertyPath() <em>Get Target Property Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target Property Path</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlReference#getTargetPropertyPath()
	 * @generated
	 */
	EOperation getXmlReference__GetTargetPropertyPath();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XmlProperty <em>Xml Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Property</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlProperty
	 * @generated
	 */
	EClass getXmlProperty();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.adaptionxml.XmlProperty#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlProperty#getReferences()
	 * @see #getXmlProperty()
	 * @generated
	 */
	EReference getXmlProperty_References();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XmlRoot <em>Xml Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Root</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlRoot
	 * @generated
	 */
	EClass getXmlRoot();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XmlPropertyNavigation <em>Xml Property Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Property Navigation</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyNavigation
	 * @generated
	 */
	EClass getXmlPropertyNavigation();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XmlAxisOptionParam <em>Xml Axis Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Axis Option Param</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisOptionParam
	 * @generated
	 */
	EClass getXmlAxisOptionParam();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.adaptionxml.XmlAxisOptionParam#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Options</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisOptionParam#getOptions()
	 * @see #getXmlAxisOptionParam()
	 * @generated
	 */
	EAttribute getXmlAxisOptionParam_Options();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionxml.XmlAxisOptionParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisOptionParam#getValue()
	 * @see #getXmlAxisOptionParam()
	 * @generated
	 */
	EAttribute getXmlAxisOptionParam_Value();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.adaptionxml.XmlAxisOptionParam#getXmlAxisPart <em>Xml Axis Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Xml Axis Part</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisOptionParam#getXmlAxisPart()
	 * @see #getXmlAxisOptionParam()
	 * @generated
	 */
	EReference getXmlAxisOptionParam_XmlAxisPart();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlAxisOptionParam#setValueIfValid(qualitypatternmodel.adaptionxml.XmlAxisKind) <em>Set Value If Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value If Valid</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisOptionParam#setValueIfValid(qualitypatternmodel.adaptionxml.XmlAxisKind)
	 * @generated
	 */
	EOperation getXmlAxisOptionParam__SetValueIfValid__XmlAxisKind();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlAxisOptionParam#inferSuggestions() <em>Infer Suggestions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Infer Suggestions</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisOptionParam#inferSuggestions()
	 * @generated
	 */
	EOperation getXmlAxisOptionParam__InferSuggestions();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam <em>Xml Property Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Property Option Param</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyOptionParam
	 * @generated
	 */
	EClass getXmlPropertyOptionParam();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Options</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getOptions()
	 * @see #getXmlPropertyOptionParam()
	 * @generated
	 */
	EAttribute getXmlPropertyOptionParam_Options();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getValue()
	 * @see #getXmlPropertyOptionParam()
	 * @generated
	 */
	EAttribute getXmlPropertyOptionParam_Value();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getXmlPathParam <em>Xml Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Xml Path Param</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getXmlPathParam()
	 * @see #getXmlPropertyOptionParam()
	 * @generated
	 */
	EReference getXmlPropertyOptionParam_XmlPathParam();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Name</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getAttributeName()
	 * @see #getXmlPropertyOptionParam()
	 * @generated
	 */
	EReference getXmlPropertyOptionParam_AttributeName();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getXmlAxisPart <em>Xml Axis Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xml Axis Part</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getXmlAxisPart()
	 * @see #getXmlPropertyOptionParam()
	 * @generated
	 */
	EReference getXmlPropertyOptionParam_XmlAxisPart();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#setValueIfValid(qualitypatternmodel.adaptionxml.XmlPropertyKind) <em>Set Value If Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value If Valid</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#setValueIfValid(qualitypatternmodel.adaptionxml.XmlPropertyKind)
	 * @generated
	 */
	EOperation getXmlPropertyOptionParam__SetValueIfValid__XmlPropertyKind();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XmlPathParam <em>Xml Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Path Param</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam
	 * @generated
	 */
	EClass getXmlPathParam();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.adaptionxml.XmlPathParam#getXmlPropertyOptionParam <em>Xml Property Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml Property Option Param</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam#getXmlPropertyOptionParam()
	 * @see #getXmlPathParam()
	 * @generated
	 */
	EReference getXmlPathParam_XmlPropertyOptionParam();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.adaptionxml.XmlPathParam#getXmlAxisParts <em>Xml Axis Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xml Axis Parts</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam#getXmlAxisParts()
	 * @see #getXmlPathParam()
	 * @generated
	 */
	EReference getXmlPathParam_XmlAxisParts();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XmlPathParam#getXmlNavigation <em>Xml Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xml Navigation</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam#getXmlNavigation()
	 * @see #getXmlPathParam()
	 * @generated
	 */
	EReference getXmlPathParam_XmlNavigation();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlPathParam#setXmlAxis(qualitypatternmodel.adaptionxml.XmlAxisKind, java.lang.String) <em>Set Xml Axis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Xml Axis</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam#setXmlAxis(qualitypatternmodel.adaptionxml.XmlAxisKind, java.lang.String)
	 * @generated
	 */
	EOperation getXmlPathParam__SetXmlAxis__XmlAxisKind_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlPathParam#addXmlAxis(qualitypatternmodel.adaptionxml.XmlAxisKind, java.lang.String) <em>Add Xml Axis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Xml Axis</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam#addXmlAxis(qualitypatternmodel.adaptionxml.XmlAxisKind, java.lang.String)
	 * @generated
	 */
	EOperation getXmlPathParam__AddXmlAxis__XmlAxisKind_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlPathParam#setXmlAxis(qualitypatternmodel.adaptionxml.XmlAxisKind[]) <em>Set Xml Axis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Xml Axis</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam#setXmlAxis(qualitypatternmodel.adaptionxml.XmlAxisKind[])
	 * @generated
	 */
	EOperation getXmlPathParam__SetXmlAxis__XmlAxisKind();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlPathParam#setXmlAxis(qualitypatternmodel.adaptionxml.XmlAxisKind[], java.lang.String) <em>Set Xml Axis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Xml Axis</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam#setXmlAxis(qualitypatternmodel.adaptionxml.XmlAxisKind[], java.lang.String)
	 * @generated
	 */
	EOperation getXmlPathParam__SetXmlAxis__XmlAxisKind_String_1();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlPathParam#specifyAxis(qualitypatternmodel.adaptionxml.XmlAxisKind[], qualitypatternmodel.adaptionxml.XmlPropertyKind, java.lang.String, java.lang.String) <em>Specify Axis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Specify Axis</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam#specifyAxis(qualitypatternmodel.adaptionxml.XmlAxisKind[], qualitypatternmodel.adaptionxml.XmlPropertyKind, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getXmlPathParam__SpecifyAxis__XmlAxisKind_XmlPropertyKind_String_String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XmlAxisPart <em>Xml Axis Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Axis Part</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPart
	 * @generated
	 */
	EClass getXmlAxisPart();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#getTextLiteralParam <em>Text Literal Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Literal Param</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPart#getTextLiteralParam()
	 * @see #getXmlAxisPart()
	 * @generated
	 */
	EReference getXmlAxisPart_TextLiteralParam();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlAxisOptionParam <em>Xml Axis Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml Axis Option Param</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlAxisOptionParam()
	 * @see #getXmlAxisPart()
	 * @generated
	 */
	EReference getXmlAxisPart_XmlAxisOptionParam();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlPathParam <em>Xml Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Xml Path Param</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlPathParam()
	 * @see #getXmlAxisPart()
	 * @generated
	 */
	EReference getXmlAxisPart_XmlPathParam();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlPropertyOption <em>Xml Property Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xml Property Option</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlPropertyOption()
	 * @see #getXmlAxisPart()
	 * @generated
	 */
	EReference getXmlAxisPart_XmlPropertyOption();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#getNextXmlAxisPairs() <em>Get Next Xml Axis Pairs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next Xml Axis Pairs</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPart#getNextXmlAxisPairs()
	 * @generated
	 */
	EOperation getXmlAxisPart__GetNextXmlAxisPairs();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#getPreviousXmlAxisPairs() <em>Get Previous Xml Axis Pairs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Previous Xml Axis Pairs</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPart#getPreviousXmlAxisPairs()
	 * @generated
	 */
	EOperation getXmlAxisPart__GetPreviousXmlAxisPairs();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#inferAxisSuggestions() <em>Infer Axis Suggestions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Infer Axis Suggestions</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPart#inferAxisSuggestions()
	 * @generated
	 */
	EOperation getXmlAxisPart__InferAxisSuggestions();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#inferElementTagSuggestions() <em>Infer Element Tag Suggestions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Infer Element Tag Suggestions</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPart#inferElementTagSuggestions()
	 * @generated
	 */
	EOperation getXmlAxisPart__InferElementTagSuggestions();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#inferElementTagSuggestionsFromIncomingRelations() <em>Infer Element Tag Suggestions From Incoming Relations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Infer Element Tag Suggestions From Incoming Relations</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPart#inferElementTagSuggestionsFromIncomingRelations()
	 * @generated
	 */
	EOperation getXmlAxisPart__InferElementTagSuggestionsFromIncomingRelations();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#inferElementTagSuggestionsFromOutgoingRelations() <em>Infer Element Tag Suggestions From Outgoing Relations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Infer Element Tag Suggestions From Outgoing Relations</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPart#inferElementTagSuggestionsFromOutgoingRelations()
	 * @generated
	 */
	EOperation getXmlAxisPart__InferElementTagSuggestionsFromOutgoingRelations();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XmlNavigation <em>Xml Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Navigation</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlNavigation
	 * @generated
	 */
	EClass getXmlNavigation();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XmlNavigation#getXmlPathParam <em>Xml Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xml Path Param</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlNavigation#getXmlPathParam()
	 * @see #getXmlNavigation()
	 * @generated
	 */
	EReference getXmlNavigation_XmlPathParam();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionxml.XmlNavigation#getSourceVariable <em>Source Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Variable</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlNavigation#getSourceVariable()
	 * @see #getXmlNavigation()
	 * @generated
	 */
	EAttribute getXmlNavigation_SourceVariable();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionxml.XmlNavigation#getVariableCounter <em>Variable Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Counter</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlNavigation#getVariableCounter()
	 * @see #getXmlNavigation()
	 * @generated
	 */
	EAttribute getXmlNavigation_VariableCounter();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XmlNode <em>Xml Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Node</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlNode
	 * @generated
	 */
	EClass getXmlNode();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.adaptionxml.XmlNode#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Variables</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlNode#getVariables()
	 * @see #getXmlNode()
	 * @generated
	 */
	EAttribute getXmlNode_Variables();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlNode#translatePredicates() <em>Translate Predicates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Translate Predicates</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlNode#translatePredicates()
	 * @generated
	 */
	EOperation getXmlNode__TranslatePredicates();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlNode#getXQueryRepresentation() <em>Get XQuery Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get XQuery Representation</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlNode#getXQueryRepresentation()
	 * @generated
	 */
	EOperation getXmlNode__GetXQueryRepresentation();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlNode#translateMultipleIncoming() <em>Translate Multiple Incoming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Translate Multiple Incoming</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlNode#translateMultipleIncoming()
	 * @generated
	 */
	EOperation getXmlNode__TranslateMultipleIncoming();

	/**
	 * Returns the meta object for enum '{@link qualitypatternmodel.adaptionxml.XmlPropertyKind <em>Xml Property Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Xml Property Kind</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyKind
	 * @generated
	 */
	EEnum getXmlPropertyKind();

	/**
	 * Returns the meta object for enum '{@link qualitypatternmodel.adaptionxml.XmlAxisKind <em>Xml Axis Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Xml Axis Kind</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisKind
	 * @generated
	 */
	EEnum getXmlAxisKind();

	/**
	 * Returns the meta object for data type '<em>Xml Axis Kind Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Xml Axis Kind Array</em>'.
	 * @model instanceClass="qualitypatternmodel.adaptionxml.XmlAxisKind[]"
	 * @generated
	 */
	EDataType getXmlAxisKindArray();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdaptionxmlFactory getAdaptionxmlFactory();

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
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XmlElementImpl <em>Xml Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XmlElementImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlElement()
		 * @generated
		 */
		EClass XML_ELEMENT = eINSTANCE.getXmlElement();

		/**
		 * The meta object literal for the '<em><b>XQuery Deep Equal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ELEMENT__XQUERY_DEEP_EQUAL = eINSTANCE.getXmlElement_XQueryDeepEqual();

		/**
		 * The meta object literal for the '<em><b>Get Tag From Comparisons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_ELEMENT___GET_TAG_FROM_COMPARISONS = eINSTANCE.getXmlElement__GetTagFromComparisons();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XmlElementNavigationImpl <em>Xml Element Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XmlElementNavigationImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlElementNavigation()
		 * @generated
		 */
		EClass XML_ELEMENT_NAVIGATION = eINSTANCE.getXmlElementNavigation();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XmlReferenceImpl <em>Xml Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XmlReferenceImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlReference()
		 * @generated
		 */
		EClass XML_REFERENCE = eINSTANCE.getXmlReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_REFERENCE__TYPE = eINSTANCE.getXmlReference_Type();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_REFERENCE__PROPERTY = eINSTANCE.getXmlReference_Property();

		/**
		 * The meta object literal for the '<em><b>Is Translatable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_REFERENCE___IS_TRANSLATABLE = eINSTANCE.getXmlReference__IsTranslatable();

		/**
		 * The meta object literal for the '<em><b>Get Source Property Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_REFERENCE___GET_SOURCE_PROPERTY_PATH = eINSTANCE.getXmlReference__GetSourcePropertyPath();

		/**
		 * The meta object literal for the '<em><b>Get Target Property Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_REFERENCE___GET_TARGET_PROPERTY_PATH = eINSTANCE.getXmlReference__GetTargetPropertyPath();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl <em>Xml Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlProperty()
		 * @generated
		 */
		EClass XML_PROPERTY = eINSTANCE.getXmlProperty();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_PROPERTY__REFERENCES = eINSTANCE.getXmlProperty_References();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XmlRootImpl <em>Xml Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XmlRootImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlRoot()
		 * @generated
		 */
		EClass XML_ROOT = eINSTANCE.getXmlRoot();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyNavigationImpl <em>Xml Property Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XmlPropertyNavigationImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlPropertyNavigation()
		 * @generated
		 */
		EClass XML_PROPERTY_NAVIGATION = eINSTANCE.getXmlPropertyNavigation();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XmlAxisOptionParamImpl <em>Xml Axis Option Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XmlAxisOptionParamImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlAxisOptionParam()
		 * @generated
		 */
		EClass XML_AXIS_OPTION_PARAM = eINSTANCE.getXmlAxisOptionParam();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_AXIS_OPTION_PARAM__OPTIONS = eINSTANCE.getXmlAxisOptionParam_Options();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_AXIS_OPTION_PARAM__VALUE = eINSTANCE.getXmlAxisOptionParam_Value();

		/**
		 * The meta object literal for the '<em><b>Xml Axis Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_AXIS_OPTION_PARAM__XML_AXIS_PART = eINSTANCE.getXmlAxisOptionParam_XmlAxisPart();

		/**
		 * The meta object literal for the '<em><b>Set Value If Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_AXIS_OPTION_PARAM___SET_VALUE_IF_VALID__XMLAXISKIND = eINSTANCE.getXmlAxisOptionParam__SetValueIfValid__XmlAxisKind();

		/**
		 * The meta object literal for the '<em><b>Infer Suggestions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_AXIS_OPTION_PARAM___INFER_SUGGESTIONS = eINSTANCE.getXmlAxisOptionParam__InferSuggestions();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl <em>Xml Property Option Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlPropertyOptionParam()
		 * @generated
		 */
		EClass XML_PROPERTY_OPTION_PARAM = eINSTANCE.getXmlPropertyOptionParam();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_PROPERTY_OPTION_PARAM__OPTIONS = eINSTANCE.getXmlPropertyOptionParam_Options();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_PROPERTY_OPTION_PARAM__VALUE = eINSTANCE.getXmlPropertyOptionParam_Value();

		/**
		 * The meta object literal for the '<em><b>Xml Path Param</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM = eINSTANCE.getXmlPropertyOptionParam_XmlPathParam();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME = eINSTANCE.getXmlPropertyOptionParam_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Xml Axis Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART = eINSTANCE.getXmlPropertyOptionParam_XmlAxisPart();

		/**
		 * The meta object literal for the '<em><b>Set Value If Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_PROPERTY_OPTION_PARAM___SET_VALUE_IF_VALID__XMLPROPERTYKIND = eINSTANCE.getXmlPropertyOptionParam__SetValueIfValid__XmlPropertyKind();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl <em>Xml Path Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlPathParam()
		 * @generated
		 */
		EClass XML_PATH_PARAM = eINSTANCE.getXmlPathParam();

		/**
		 * The meta object literal for the '<em><b>Xml Property Option Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_PATH_PARAM__XML_PROPERTY_OPTION_PARAM = eINSTANCE.getXmlPathParam_XmlPropertyOptionParam();

		/**
		 * The meta object literal for the '<em><b>Xml Axis Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_PATH_PARAM__XML_AXIS_PARTS = eINSTANCE.getXmlPathParam_XmlAxisParts();

		/**
		 * The meta object literal for the '<em><b>Xml Navigation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_PATH_PARAM__XML_NAVIGATION = eINSTANCE.getXmlPathParam_XmlNavigation();

		/**
		 * The meta object literal for the '<em><b>Set Xml Axis</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_PATH_PARAM___SET_XML_AXIS__XMLAXISKIND_STRING = eINSTANCE.getXmlPathParam__SetXmlAxis__XmlAxisKind_String();

		/**
		 * The meta object literal for the '<em><b>Add Xml Axis</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_PATH_PARAM___ADD_XML_AXIS__XMLAXISKIND_STRING = eINSTANCE.getXmlPathParam__AddXmlAxis__XmlAxisKind_String();

		/**
		 * The meta object literal for the '<em><b>Set Xml Axis</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_PATH_PARAM___SET_XML_AXIS__XMLAXISKIND = eINSTANCE.getXmlPathParam__SetXmlAxis__XmlAxisKind();

		/**
		 * The meta object literal for the '<em><b>Set Xml Axis</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_PATH_PARAM___SET_XML_AXIS__XMLAXISKIND_STRING_1 = eINSTANCE.getXmlPathParam__SetXmlAxis__XmlAxisKind_String_1();

		/**
		 * The meta object literal for the '<em><b>Specify Axis</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_PATH_PARAM___SPECIFY_AXIS__XMLAXISKIND_XMLPROPERTYKIND_STRING_STRING = eINSTANCE.getXmlPathParam__SpecifyAxis__XmlAxisKind_XmlPropertyKind_String_String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl <em>Xml Axis Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlAxisPart()
		 * @generated
		 */
		EClass XML_AXIS_PART = eINSTANCE.getXmlAxisPart();

		/**
		 * The meta object literal for the '<em><b>Text Literal Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_AXIS_PART__TEXT_LITERAL_PARAM = eINSTANCE.getXmlAxisPart_TextLiteralParam();

		/**
		 * The meta object literal for the '<em><b>Xml Axis Option Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_AXIS_PART__XML_AXIS_OPTION_PARAM = eINSTANCE.getXmlAxisPart_XmlAxisOptionParam();

		/**
		 * The meta object literal for the '<em><b>Xml Path Param</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_AXIS_PART__XML_PATH_PARAM = eINSTANCE.getXmlAxisPart_XmlPathParam();

		/**
		 * The meta object literal for the '<em><b>Xml Property Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_AXIS_PART__XML_PROPERTY_OPTION = eINSTANCE.getXmlAxisPart_XmlPropertyOption();

		/**
		 * The meta object literal for the '<em><b>Get Next Xml Axis Pairs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_AXIS_PART___GET_NEXT_XML_AXIS_PAIRS = eINSTANCE.getXmlAxisPart__GetNextXmlAxisPairs();

		/**
		 * The meta object literal for the '<em><b>Get Previous Xml Axis Pairs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_AXIS_PART___GET_PREVIOUS_XML_AXIS_PAIRS = eINSTANCE.getXmlAxisPart__GetPreviousXmlAxisPairs();

		/**
		 * The meta object literal for the '<em><b>Infer Axis Suggestions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_AXIS_PART___INFER_AXIS_SUGGESTIONS = eINSTANCE.getXmlAxisPart__InferAxisSuggestions();

		/**
		 * The meta object literal for the '<em><b>Infer Element Tag Suggestions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_AXIS_PART___INFER_ELEMENT_TAG_SUGGESTIONS = eINSTANCE.getXmlAxisPart__InferElementTagSuggestions();

		/**
		 * The meta object literal for the '<em><b>Infer Element Tag Suggestions From Incoming Relations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_AXIS_PART___INFER_ELEMENT_TAG_SUGGESTIONS_FROM_INCOMING_RELATIONS = eINSTANCE.getXmlAxisPart__InferElementTagSuggestionsFromIncomingRelations();

		/**
		 * The meta object literal for the '<em><b>Infer Element Tag Suggestions From Outgoing Relations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_AXIS_PART___INFER_ELEMENT_TAG_SUGGESTIONS_FROM_OUTGOING_RELATIONS = eINSTANCE.getXmlAxisPart__InferElementTagSuggestionsFromOutgoingRelations();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl <em>Xml Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlNavigation()
		 * @generated
		 */
		EClass XML_NAVIGATION = eINSTANCE.getXmlNavigation();

		/**
		 * The meta object literal for the '<em><b>Xml Path Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_NAVIGATION__XML_PATH_PARAM = eINSTANCE.getXmlNavigation_XmlPathParam();

		/**
		 * The meta object literal for the '<em><b>Source Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_NAVIGATION__SOURCE_VARIABLE = eINSTANCE.getXmlNavigation_SourceVariable();

		/**
		 * The meta object literal for the '<em><b>Variable Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_NAVIGATION__VARIABLE_COUNTER = eINSTANCE.getXmlNavigation_VariableCounter();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.XmlNode <em>Xml Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.XmlNode
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlNode()
		 * @generated
		 */
		EClass XML_NODE = eINSTANCE.getXmlNode();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_NODE__VARIABLES = eINSTANCE.getXmlNode_Variables();

		/**
		 * The meta object literal for the '<em><b>Translate Predicates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_NODE___TRANSLATE_PREDICATES = eINSTANCE.getXmlNode__TranslatePredicates();

		/**
		 * The meta object literal for the '<em><b>Get XQuery Representation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_NODE___GET_XQUERY_REPRESENTATION = eINSTANCE.getXmlNode__GetXQueryRepresentation();

		/**
		 * The meta object literal for the '<em><b>Translate Multiple Incoming</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_NODE___TRANSLATE_MULTIPLE_INCOMING = eINSTANCE.getXmlNode__TranslateMultipleIncoming();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.XmlPropertyKind <em>Xml Property Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.XmlPropertyKind
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlPropertyKind()
		 * @generated
		 */
		EEnum XML_PROPERTY_KIND = eINSTANCE.getXmlPropertyKind();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.XmlAxisKind <em>Xml Axis Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.XmlAxisKind
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlAxisKind()
		 * @generated
		 */
		EEnum XML_AXIS_KIND = eINSTANCE.getXmlAxisKind();

		/**
		 * The meta object literal for the '<em>Xml Axis Kind Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlAxisKindArray()
		 * @generated
		 */
		EDataType XML_AXIS_KIND_ARRAY = eINSTANCE.getXmlAxisKindArray();

	}

} //AdaptionxmlPackage

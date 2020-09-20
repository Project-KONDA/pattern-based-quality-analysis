/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.ecore.EAttribute;
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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__ID = GraphstructurePackage.ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__INTERNAL_ID = GraphstructurePackage.ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__COMPARISON1 = GraphstructurePackage.ELEMENT__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__COMPARISON2 = GraphstructurePackage.ELEMENT__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Outgoing Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__OUTGOING_MAPPINGS = GraphstructurePackage.ELEMENT__OUTGOING_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Incoming Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__INCOMING_MAPPING = GraphstructurePackage.ELEMENT__INCOMING_MAPPING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__GRAPH = GraphstructurePackage.ELEMENT__GRAPH;

	/**
	 * The feature id for the '<em><b>Result Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__RESULT_OF = GraphstructurePackage.ELEMENT__RESULT_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__NAME = GraphstructurePackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__TRANSLATED = GraphstructurePackage.ELEMENT__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__PREDICATES_ARE_BEING_TRANSLATED = GraphstructurePackage.ELEMENT__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__PROPERTIES = GraphstructurePackage.ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__PREDICATES = GraphstructurePackage.ELEMENT__PREDICATES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__OUTGOING = GraphstructurePackage.ELEMENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__INCOMING = GraphstructurePackage.ELEMENT__INCOMING;

	/**
	 * The number of structural features of the '<em>Xml Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_FEATURE_COUNT = GraphstructurePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GENERATE_QUERY = GraphstructurePackage.ELEMENT___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_ALL_PARAMETERS = GraphstructurePackage.ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___PREPARE_TRANSLATION = GraphstructurePackage.ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_CONTAINER = GraphstructurePackage.ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_ANCESTOR__CLASS = GraphstructurePackage.ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___MY_TO_STRING = GraphstructurePackage.ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_PARAMETER_LIST = GraphstructurePackage.ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_OPERATOR_LIST = GraphstructurePackage.ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CREATE_XML_ADAPTION = GraphstructurePackage.ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___FINALIZE_XML_ADAPTION = GraphstructurePackage.ELEMENT___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___RECORD_VALUES__XMLDATABASE = GraphstructurePackage.ELEMENT___RECORD_VALUES__XMLDATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___RELATIONS_XML_ADAPTED = GraphstructurePackage.ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_RETURN_TYPE = GraphstructurePackage.ELEMENT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___IS_TRANSLATABLE = GraphstructurePackage.ELEMENT___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_ALL_ARGUMENT_ELEMENTS = GraphstructurePackage.ELEMENT___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.ELEMENT___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CREATE_PARAMETERS = GraphstructurePackage.ELEMENT___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Get Original ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_ORIGINAL_ID = GraphstructurePackage.ELEMENT___GET_ORIGINAL_ID;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_MATCH__STRING = GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_MATCH__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_COMPARISON__STRING = GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_MATCH = GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_MATCH;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_COMPARISON = GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_ALL_OPERATORS = GraphstructurePackage.ELEMENT___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE = GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE = GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Copy Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___COPY_PROPERTY__PROPERTY = GraphstructurePackage.ELEMENT___COPY_PROPERTY__PROPERTY;

	/**
	 * The operation id for the '<em>Copy Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___COPY_PRIMITIVE_COMPARISON__COMPARISON = GraphstructurePackage.ELEMENT___COPY_PRIMITIVE_COMPARISON__COMPARISON;

	/**
	 * The operation id for the '<em>Copy Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___COPY_MATCH__MATCH = GraphstructurePackage.ELEMENT___COPY_MATCH__MATCH;

	/**
	 * The operation id for the '<em>Add New Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___ADD_NEW_PROPERTY = GraphstructurePackage.ELEMENT___ADD_NEW_PROPERTY;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.ELEMENT___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Get XQuery Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_XQUERY_REPRESENTATION = GraphstructurePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get XQuery Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_XQUERY_VARIABLE = GraphstructurePackage.ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Translate Predicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___TRANSLATE_PREDICATES = GraphstructurePackage.ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Tag Comparisons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_TAG_COMPARISONS = GraphstructurePackage.ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Xml Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_OPERATION_COUNT = GraphstructurePackage.ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl <em>Xml Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXmlNavigation()
	 * @generated
	 */
	int XML_NAVIGATION = 1;

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
	 * The feature id for the '<em><b>Incoming Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__INCOMING_MAPPING = GraphstructurePackage.RELATION__INCOMING_MAPPING;

	/**
	 * The feature id for the '<em><b>Outgoing Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__OUTGOING_MAPPINGS = GraphstructurePackage.RELATION__OUTGOING_MAPPINGS;

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
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__OPTION = GraphstructurePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION_FEATURE_COUNT = GraphstructurePackage.RELATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GENERATE_QUERY = GraphstructurePackage.RELATION___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GET_ALL_PARAMETERS = GraphstructurePackage.RELATION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___PREPARE_TRANSLATION = GraphstructurePackage.RELATION___PREPARE_TRANSLATION;

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
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___MY_TO_STRING = GraphstructurePackage.RELATION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.RELATION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.RELATION___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GET_PARAMETER_LIST = GraphstructurePackage.RELATION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GET_OPERATOR_LIST = GraphstructurePackage.RELATION___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___CREATE_XML_ADAPTION = GraphstructurePackage.RELATION___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___FINALIZE_XML_ADAPTION = GraphstructurePackage.RELATION___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___RECORD_VALUES__XMLDATABASE = GraphstructurePackage.RELATION___RECORD_VALUES__XMLDATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___RELATIONS_XML_ADAPTED = GraphstructurePackage.RELATION___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.RELATION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.RELATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___CREATE_PARAMETERS = GraphstructurePackage.RELATION___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Relation From Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS = GraphstructurePackage.RELATION___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS;

	/**
	 * The operation id for the '<em>Remove Mappings To Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___REMOVE_MAPPINGS_TO_NEXT = GraphstructurePackage.RELATION___REMOVE_MAPPINGS_TO_NEXT;

	/**
	 * The operation id for the '<em>Adapt As XML Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___ADAPT_AS_XML_NAVIGATION = GraphstructurePackage.RELATION___ADAPT_AS_XML_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As XML Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___ADAPT_AS_XML_REFERENCE = GraphstructurePackage.RELATION___ADAPT_AS_XML_REFERENCE;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.RELATION___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Get Original ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GET_ORIGINAL_ID = GraphstructurePackage.RELATION___GET_ORIGINAL_ID;

	/**
	 * The number of operations of the '<em>Xml Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION_OPERATION_COUNT = GraphstructurePackage.RELATION_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Incoming Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__INCOMING_MAPPING = GraphstructurePackage.RELATION__INCOMING_MAPPING;

	/**
	 * The feature id for the '<em><b>Outgoing Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__OUTGOING_MAPPINGS = GraphstructurePackage.RELATION__OUTGOING_MAPPINGS;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__TYPE = GraphstructurePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__TARGET_PROPERTY = GraphstructurePackage.RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__SOURCE_PROPERTY = GraphstructurePackage.RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xml Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE_FEATURE_COUNT = GraphstructurePackage.RELATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GENERATE_QUERY = GraphstructurePackage.RELATION___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GET_ALL_PARAMETERS = GraphstructurePackage.RELATION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___PREPARE_TRANSLATION = GraphstructurePackage.RELATION___PREPARE_TRANSLATION;

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
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___MY_TO_STRING = GraphstructurePackage.RELATION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.RELATION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.RELATION___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GET_PARAMETER_LIST = GraphstructurePackage.RELATION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GET_OPERATOR_LIST = GraphstructurePackage.RELATION___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___CREATE_XML_ADAPTION = GraphstructurePackage.RELATION___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___FINALIZE_XML_ADAPTION = GraphstructurePackage.RELATION___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___RECORD_VALUES__XMLDATABASE = GraphstructurePackage.RELATION___RECORD_VALUES__XMLDATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___RELATIONS_XML_ADAPTED = GraphstructurePackage.RELATION___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.RELATION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.RELATION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.RELATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___CREATE_PARAMETERS = GraphstructurePackage.RELATION___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Remove Relation From Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS = GraphstructurePackage.RELATION___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS;

	/**
	 * The operation id for the '<em>Remove Mappings To Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___REMOVE_MAPPINGS_TO_NEXT = GraphstructurePackage.RELATION___REMOVE_MAPPINGS_TO_NEXT;

	/**
	 * The operation id for the '<em>Adapt As XML Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___ADAPT_AS_XML_NAVIGATION = GraphstructurePackage.RELATION___ADAPT_AS_XML_NAVIGATION;

	/**
	 * The operation id for the '<em>Adapt As XML Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___ADAPT_AS_XML_REFERENCE = GraphstructurePackage.RELATION___ADAPT_AS_XML_REFERENCE;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.RELATION___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The operation id for the '<em>Get Original ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GET_ORIGINAL_ID = GraphstructurePackage.RELATION___GET_ORIGINAL_ID;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___IS_TRANSLATABLE = GraphstructurePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Xml Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE_OPERATION_COUNT = GraphstructurePackage.RELATION_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__ID = GraphstructurePackage.PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__INTERNAL_ID = GraphstructurePackage.PROPERTY__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__COMPARISON1 = GraphstructurePackage.PROPERTY__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__COMPARISON2 = GraphstructurePackage.PROPERTY__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__ELEMENT = GraphstructurePackage.PROPERTY__ELEMENT;

	/**
	 * The feature id for the '<em><b>Match</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__MATCH = GraphstructurePackage.PROPERTY__MATCH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__NAME = GraphstructurePackage.PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__OPTION = GraphstructurePackage.PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__ATTRIBUTE_NAME = GraphstructurePackage.PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__INCOMING_REFERENCES = GraphstructurePackage.PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outgoing References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__OUTGOING_REFERENCES = GraphstructurePackage.PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xml Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_FEATURE_COUNT = GraphstructurePackage.PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GENERATE_QUERY = GraphstructurePackage.PROPERTY___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_ALL_PARAMETERS = GraphstructurePackage.PROPERTY___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___PREPARE_TRANSLATION = GraphstructurePackage.PROPERTY___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.PROPERTY___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.PROPERTY___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_CONTAINER = GraphstructurePackage.PROPERTY___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_ANCESTOR__CLASS = GraphstructurePackage.PROPERTY___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___MY_TO_STRING = GraphstructurePackage.PROPERTY___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.PROPERTY___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_PARAMETER_LIST = GraphstructurePackage.PROPERTY___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_OPERATOR_LIST = GraphstructurePackage.PROPERTY___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___CREATE_XML_ADAPTION = GraphstructurePackage.PROPERTY___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___FINALIZE_XML_ADAPTION = GraphstructurePackage.PROPERTY___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___RECORD_VALUES__XMLDATABASE = GraphstructurePackage.PROPERTY___RECORD_VALUES__XMLDATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___RELATIONS_XML_ADAPTED = GraphstructurePackage.PROPERTY___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.PROPERTY___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.PROPERTY___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.PROPERTY___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_RETURN_TYPE = GraphstructurePackage.PROPERTY___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___IS_TRANSLATABLE = GraphstructurePackage.PROPERTY___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_ALL_ARGUMENT_ELEMENTS = GraphstructurePackage.PROPERTY___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.PROPERTY___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.PROPERTY___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___CREATE_PARAMETERS = GraphstructurePackage.PROPERTY___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___COPY = GraphstructurePackage.PROPERTY___COPY;

	/**
	 * The operation id for the '<em>Add Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___ADD_COMPARISON = GraphstructurePackage.PROPERTY___ADD_COMPARISON;

	/**
	 * The operation id for the '<em>Is Operator Argument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___IS_OPERATOR_ARGUMENT = GraphstructurePackage.PROPERTY___IS_OPERATOR_ARGUMENT;

	/**
	 * The number of operations of the '<em>Xml Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPERATION_COUNT = GraphstructurePackage.PROPERTY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__ID = GraphstructurePackage.ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__INTERNAL_ID = GraphstructurePackage.ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__COMPARISON1 = GraphstructurePackage.ELEMENT__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__COMPARISON2 = GraphstructurePackage.ELEMENT__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Outgoing Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__OUTGOING_MAPPINGS = GraphstructurePackage.ELEMENT__OUTGOING_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Incoming Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__INCOMING_MAPPING = GraphstructurePackage.ELEMENT__INCOMING_MAPPING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__GRAPH = GraphstructurePackage.ELEMENT__GRAPH;

	/**
	 * The feature id for the '<em><b>Result Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__RESULT_OF = GraphstructurePackage.ELEMENT__RESULT_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__NAME = GraphstructurePackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__TRANSLATED = GraphstructurePackage.ELEMENT__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__PREDICATES_ARE_BEING_TRANSLATED = GraphstructurePackage.ELEMENT__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__PROPERTIES = GraphstructurePackage.ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__PREDICATES = GraphstructurePackage.ELEMENT__PREDICATES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__OUTGOING = GraphstructurePackage.ELEMENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__INCOMING = GraphstructurePackage.ELEMENT__INCOMING;

	/**
	 * The number of structural features of the '<em>Xml Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT_FEATURE_COUNT = GraphstructurePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GENERATE_QUERY = GraphstructurePackage.ELEMENT___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_ALL_PARAMETERS = GraphstructurePackage.ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___PREPARE_TRANSLATION = GraphstructurePackage.ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___IS_VALID__ABSTRACTIONLEVEL = GraphstructurePackage.ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___IS_VALID_LOCAL__ABSTRACTIONLEVEL = GraphstructurePackage.ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_CONTAINER = GraphstructurePackage.ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_ANCESTOR__CLASS = GraphstructurePackage.ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___MY_TO_STRING = GraphstructurePackage.ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___PREPARE_PARAMETER_UPDATES = GraphstructurePackage.ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_PARAMETER_LIST = GraphstructurePackage.ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_OPERATOR_LIST = GraphstructurePackage.ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CREATE_XML_ADAPTION = GraphstructurePackage.ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___FINALIZE_XML_ADAPTION = GraphstructurePackage.ELEMENT___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___RECORD_VALUES__XMLDATABASE = GraphstructurePackage.ELEMENT___RECORD_VALUES__XMLDATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___RELATIONS_XML_ADAPTED = GraphstructurePackage.ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = GraphstructurePackage.ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = GraphstructurePackage.ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_RETURN_TYPE = GraphstructurePackage.ELEMENT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___IS_TRANSLATABLE = GraphstructurePackage.ELEMENT___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_ALL_ARGUMENT_ELEMENTS = GraphstructurePackage.ELEMENT___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___VALIDATE__DIAGNOSTICCHAIN_MAP = GraphstructurePackage.ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Remove Parameters From Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___REMOVE_PARAMETERS_FROM_PARAMETER_LIST = GraphstructurePackage.ELEMENT___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CREATE_PARAMETERS = GraphstructurePackage.ELEMENT___CREATE_PARAMETERS;

	/**
	 * The operation id for the '<em>Get Original ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_ORIGINAL_ID = GraphstructurePackage.ELEMENT___GET_ORIGINAL_ID;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_MATCH__STRING = GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_MATCH__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_COMPARISON__STRING = GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON__STRING;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_MATCH = GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_MATCH;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_COMPARISON = GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_ALL_OPERATORS = GraphstructurePackage.ELEMENT___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE = GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE = GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Copy Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___COPY_PROPERTY__PROPERTY = GraphstructurePackage.ELEMENT___COPY_PROPERTY__PROPERTY;

	/**
	 * The operation id for the '<em>Copy Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___COPY_PRIMITIVE_COMPARISON__COMPARISON = GraphstructurePackage.ELEMENT___COPY_PRIMITIVE_COMPARISON__COMPARISON;

	/**
	 * The operation id for the '<em>Copy Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___COPY_MATCH__MATCH = GraphstructurePackage.ELEMENT___COPY_MATCH__MATCH;

	/**
	 * The operation id for the '<em>Add New Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___ADD_NEW_PROPERTY = GraphstructurePackage.ELEMENT___ADD_NEW_PROPERTY;

	/**
	 * The operation id for the '<em>Set Graph Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___SET_GRAPH_SIMPLE__GRAPH = GraphstructurePackage.ELEMENT___SET_GRAPH_SIMPLE__GRAPH;

	/**
	 * The number of operations of the '<em>Xml Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT_OPERATION_COUNT = GraphstructurePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.PropertyKind <em>Property Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.PropertyKind
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getPropertyKind()
	 * @generated
	 */
	int PROPERTY_KIND = 5;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.RelationKind <em>Relation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.RelationKind
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getRelationKind()
	 * @generated
	 */
	int RELATION_KIND = 6;

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
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlElement#getXQueryRepresentation() <em>Get XQuery Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get XQuery Representation</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlElement#getXQueryRepresentation()
	 * @generated
	 */
	EOperation getXmlElement__GetXQueryRepresentation();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlElement#getXQueryVariable() <em>Get XQuery Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get XQuery Variable</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlElement#getXQueryVariable()
	 * @generated
	 */
	EOperation getXmlElement__GetXQueryVariable();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlElement#translatePredicates() <em>Translate Predicates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Translate Predicates</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlElement#translatePredicates()
	 * @generated
	 */
	EOperation getXmlElement__TranslatePredicates();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlElement#getTagComparisons() <em>Get Tag Comparisons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tag Comparisons</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlElement#getTagComparisons()
	 * @generated
	 */
	EOperation getXmlElement__GetTagComparisons();

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
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XmlNavigation#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlNavigation#getOption()
	 * @see #getXmlNavigation()
	 * @generated
	 */
	EReference getXmlNavigation_Option();

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
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XmlReference#getSourceProperty <em>Source Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Property</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlReference#getSourceProperty()
	 * @see #getXmlReference()
	 * @generated
	 */
	EReference getXmlReference_SourceProperty();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XmlReference#getTargetProperty <em>Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Property</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlReference#getTargetProperty()
	 * @see #getXmlReference()
	 * @generated
	 */
	EReference getXmlReference_TargetProperty();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XmlReference#isTranslatable() <em>Is Translatable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Translatable</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XmlReference#isTranslatable()
	 * @generated
	 */
	EOperation getXmlReference__IsTranslatable();

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
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XmlProperty#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlProperty#getOption()
	 * @see #getXmlProperty()
	 * @generated
	 */
	EReference getXmlProperty_Option();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XmlProperty#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Name</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlProperty#getAttributeName()
	 * @see #getXmlProperty()
	 * @generated
	 */
	EReference getXmlProperty_AttributeName();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.adaptionxml.XmlProperty#getIncomingReferences <em>Incoming References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming References</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlProperty#getIncomingReferences()
	 * @see #getXmlProperty()
	 * @generated
	 */
	EReference getXmlProperty_IncomingReferences();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.adaptionxml.XmlProperty#getOutgoingReferences <em>Outgoing References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing References</em>'.
	 * @see qualitypatternmodel.adaptionxml.XmlProperty#getOutgoingReferences()
	 * @see #getXmlProperty()
	 * @generated
	 */
	EReference getXmlProperty_OutgoingReferences();

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
	 * Returns the meta object for enum '{@link qualitypatternmodel.adaptionxml.PropertyKind <em>Property Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Kind</em>'.
	 * @see qualitypatternmodel.adaptionxml.PropertyKind
	 * @generated
	 */
	EEnum getPropertyKind();

	/**
	 * Returns the meta object for enum '{@link qualitypatternmodel.adaptionxml.RelationKind <em>Relation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Kind</em>'.
	 * @see qualitypatternmodel.adaptionxml.RelationKind
	 * @generated
	 */
	EEnum getRelationKind();

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
		 * The meta object literal for the '<em><b>Get XQuery Representation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_ELEMENT___GET_XQUERY_REPRESENTATION = eINSTANCE.getXmlElement__GetXQueryRepresentation();

		/**
		 * The meta object literal for the '<em><b>Get XQuery Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_ELEMENT___GET_XQUERY_VARIABLE = eINSTANCE.getXmlElement__GetXQueryVariable();

		/**
		 * The meta object literal for the '<em><b>Translate Predicates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_ELEMENT___TRANSLATE_PREDICATES = eINSTANCE.getXmlElement__TranslatePredicates();

		/**
		 * The meta object literal for the '<em><b>Get Tag Comparisons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_ELEMENT___GET_TAG_COMPARISONS = eINSTANCE.getXmlElement__GetTagComparisons();

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
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_NAVIGATION__OPTION = eINSTANCE.getXmlNavigation_Option();

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
		 * The meta object literal for the '<em><b>Source Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_REFERENCE__SOURCE_PROPERTY = eINSTANCE.getXmlReference_SourceProperty();

		/**
		 * The meta object literal for the '<em><b>Target Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_REFERENCE__TARGET_PROPERTY = eINSTANCE.getXmlReference_TargetProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_REFERENCE__TYPE = eINSTANCE.getXmlReference_Type();

		/**
		 * The meta object literal for the '<em><b>Is Translatable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_REFERENCE___IS_TRANSLATABLE = eINSTANCE.getXmlReference__IsTranslatable();

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
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_PROPERTY__OPTION = eINSTANCE.getXmlProperty_Option();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_PROPERTY__ATTRIBUTE_NAME = eINSTANCE.getXmlProperty_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Incoming References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_PROPERTY__INCOMING_REFERENCES = eINSTANCE.getXmlProperty_IncomingReferences();

		/**
		 * The meta object literal for the '<em><b>Outgoing References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_PROPERTY__OUTGOING_REFERENCES = eINSTANCE.getXmlProperty_OutgoingReferences();

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
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.PropertyKind <em>Property Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.PropertyKind
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getPropertyKind()
		 * @generated
		 */
		EEnum PROPERTY_KIND = eINSTANCE.getPropertyKind();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.RelationKind <em>Relation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.RelationKind
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getRelationKind()
		 * @generated
		 */
		EEnum RELATION_KIND = eINSTANCE.getRelationKind();

	}

} //AdaptionxmlPackage

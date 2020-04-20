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
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XMLElementImpl <em>XML Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XMLElementImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXMLElement()
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
	 * The feature id for the '<em><b>Mapping To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__MAPPING_TO = GraphstructurePackage.ELEMENT__MAPPING_TO;

	/**
	 * The feature id for the '<em><b>Mapping From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__MAPPING_FROM = GraphstructurePackage.ELEMENT__MAPPING_FROM;

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
	 * The number of structural features of the '<em>XML Element</em>' class.
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
	int XML_ELEMENT___GENERATE_QUERY__LOCATION = GraphstructurePackage.ELEMENT___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_ALL_INPUTS = GraphstructurePackage.ELEMENT___GET_ALL_INPUTS;

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
	int XML_ELEMENT___IS_VALID__BOOLEAN = GraphstructurePackage.ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___IS_VALID_LOCAL__BOOLEAN = GraphstructurePackage.ELEMENT___IS_VALID_LOCAL__BOOLEAN;

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
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___GET_PARAMETER_LIST = GraphstructurePackage.ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___UPDATE_OPERATORS__OPERATORLIST = GraphstructurePackage.ELEMENT___UPDATE_OPERATORS__OPERATORLIST;

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
	 * The operation id for the '<em>Copy Next Elements To Next Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___COPY_NEXT_ELEMENTS_TO_NEXT_GRAPHS = GraphstructurePackage.ELEMENT___COPY_NEXT_ELEMENTS_TO_NEXT_GRAPHS;

	/**
	 * The operation id for the '<em>Copy Next Element To Next Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___COPY_NEXT_ELEMENT_TO_NEXT_GRAPHS__ELEMENT = GraphstructurePackage.ELEMENT___COPY_NEXT_ELEMENT_TO_NEXT_GRAPHS__ELEMENT;

	/**
	 * The operation id for the '<em>Copy Next Element To Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___COPY_NEXT_ELEMENT_TO_PREVIOUS_GRAPHS__ELEMENT_BOOLEAN = GraphstructurePackage.ELEMENT___COPY_NEXT_ELEMENT_TO_PREVIOUS_GRAPHS__ELEMENT_BOOLEAN;

	/**
	 * The operation id for the '<em>Copy Next Elements To Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___COPY_NEXT_ELEMENTS_TO_PREVIOUS_GRAPHS__BOOLEAN = GraphstructurePackage.ELEMENT___COPY_NEXT_ELEMENTS_TO_PREVIOUS_GRAPHS__BOOLEAN;

	/**
	 * The operation id for the '<em>Clear Match Recursively</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CLEAR_MATCH_RECURSIVELY = GraphstructurePackage.ELEMENT___CLEAR_MATCH_RECURSIVELY;

	/**
	 * The operation id for the '<em>Clear Predicates Recursively</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CLEAR_PREDICATES_RECURSIVELY = GraphstructurePackage.ELEMENT___CLEAR_PREDICATES_RECURSIVELY;

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
	 * The operation id for the '<em>Clear Comparison Recursively</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CLEAR_COMPARISON_RECURSIVELY = GraphstructurePackage.ELEMENT___CLEAR_COMPARISON_RECURSIVELY;

	/**
	 * The operation id for the '<em>Clear Property Recursively</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT___CLEAR_PROPERTY_RECURSIVELY = GraphstructurePackage.ELEMENT___CLEAR_PROPERTY_RECURSIVELY;

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
	int XML_ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION = GraphstructurePackage.ELEMENT_OPERATION_COUNT + 0;

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
	int XML_ELEMENT___TRANSLATE_PREDICATES__LOCATION = GraphstructurePackage.ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>XML Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_OPERATION_COUNT = GraphstructurePackage.ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XMLNavigationImpl <em>XML Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XMLNavigationImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXMLNavigation()
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
	 * The feature id for the '<em><b>Mapping From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__MAPPING_FROM = GraphstructurePackage.RELATION__MAPPING_FROM;

	/**
	 * The feature id for the '<em><b>Mapping To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__MAPPING_TO = GraphstructurePackage.RELATION__MAPPING_TO;

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
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__OPTION = GraphstructurePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Option Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION__OPTION_PARAM = GraphstructurePackage.RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XML Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION_FEATURE_COUNT = GraphstructurePackage.RELATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GENERATE_QUERY__LOCATION = GraphstructurePackage.RELATION___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GET_ALL_INPUTS = GraphstructurePackage.RELATION___GET_ALL_INPUTS;

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
	int XML_NAVIGATION___IS_VALID__BOOLEAN = GraphstructurePackage.RELATION___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___IS_VALID_LOCAL__BOOLEAN = GraphstructurePackage.RELATION___IS_VALID_LOCAL__BOOLEAN;

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
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.RELATION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___GET_PARAMETER_LIST = GraphstructurePackage.RELATION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___UPDATE_OPERATORS__OPERATORLIST = GraphstructurePackage.RELATION___UPDATE_OPERATORS__OPERATORLIST;

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
	 * The operation id for the '<em>Copy To New Next Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION___COPY_TO_NEW_NEXT_GRAPHS__ELEMENT = GraphstructurePackage.RELATION___COPY_TO_NEW_NEXT_GRAPHS__ELEMENT;

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
	 * The number of operations of the '<em>XML Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAVIGATION_OPERATION_COUNT = GraphstructurePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XMLReferenceImpl <em>XML Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XMLReferenceImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXMLReference()
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
	 * The feature id for the '<em><b>Mapping From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__MAPPING_FROM = GraphstructurePackage.RELATION__MAPPING_FROM;

	/**
	 * The feature id for the '<em><b>Mapping To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__MAPPING_TO = GraphstructurePackage.RELATION__MAPPING_TO;

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
	 * The feature id for the '<em><b>Source Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__SOURCE_PROPERTY = GraphstructurePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__TARGET_PROPERTY = GraphstructurePackage.RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__TYPE = GraphstructurePackage.RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XML Reference</em>' class.
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
	int XML_REFERENCE___GENERATE_QUERY__LOCATION = GraphstructurePackage.RELATION___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GET_ALL_INPUTS = GraphstructurePackage.RELATION___GET_ALL_INPUTS;

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
	int XML_REFERENCE___IS_VALID__BOOLEAN = GraphstructurePackage.RELATION___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___IS_VALID_LOCAL__BOOLEAN = GraphstructurePackage.RELATION___IS_VALID_LOCAL__BOOLEAN;

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
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.RELATION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___GET_PARAMETER_LIST = GraphstructurePackage.RELATION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___UPDATE_OPERATORS__OPERATORLIST = GraphstructurePackage.RELATION___UPDATE_OPERATORS__OPERATORLIST;

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
	 * The operation id for the '<em>Copy To New Next Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___COPY_TO_NEW_NEXT_GRAPHS__ELEMENT = GraphstructurePackage.RELATION___COPY_TO_NEW_NEXT_GRAPHS__ELEMENT;

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
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE___IS_TRANSLATABLE = GraphstructurePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>XML Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE_OPERATION_COUNT = GraphstructurePackage.RELATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XMLPropertyImpl <em>XML Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XMLPropertyImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXMLProperty()
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
	 * The feature id for the '<em><b>Option Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__OPTION_PARAM = GraphstructurePackage.PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__OPTION = GraphstructurePackage.PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY__ATTRIBUTE_NAME = GraphstructurePackage.PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XML Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_FEATURE_COUNT = GraphstructurePackage.PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GENERATE_QUERY__LOCATION = GraphstructurePackage.PROPERTY___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_ALL_INPUTS = GraphstructurePackage.PROPERTY___GET_ALL_INPUTS;

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
	int XML_PROPERTY___IS_VALID__BOOLEAN = GraphstructurePackage.PROPERTY___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___IS_VALID_LOCAL__BOOLEAN = GraphstructurePackage.PROPERTY___IS_VALID_LOCAL__BOOLEAN;

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
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.PROPERTY___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___GET_PARAMETER_LIST = GraphstructurePackage.PROPERTY___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY___UPDATE_OPERATORS__OPERATORLIST = GraphstructurePackage.PROPERTY___UPDATE_OPERATORS__OPERATORLIST;

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
	 * The number of operations of the '<em>XML Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PROPERTY_OPERATION_COUNT = GraphstructurePackage.PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.adaptionxml.impl.XMLRootImpl <em>XML Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.impl.XMLRootImpl
	 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXMLRoot()
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
	 * The feature id for the '<em><b>Mapping To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__MAPPING_TO = GraphstructurePackage.ELEMENT__MAPPING_TO;

	/**
	 * The feature id for the '<em><b>Mapping From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT__MAPPING_FROM = GraphstructurePackage.ELEMENT__MAPPING_FROM;

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
	 * The number of structural features of the '<em>XML Root</em>' class.
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
	int XML_ROOT___GENERATE_QUERY__LOCATION = GraphstructurePackage.ELEMENT___GENERATE_QUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_ALL_INPUTS = GraphstructurePackage.ELEMENT___GET_ALL_INPUTS;

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
	int XML_ROOT___IS_VALID__BOOLEAN = GraphstructurePackage.ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___IS_VALID_LOCAL__BOOLEAN = GraphstructurePackage.ELEMENT___IS_VALID_LOCAL__BOOLEAN;

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
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___UPDATE_PARAMETERS__PARAMETERLIST = GraphstructurePackage.ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___GET_PARAMETER_LIST = GraphstructurePackage.ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Update Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___UPDATE_OPERATORS__OPERATORLIST = GraphstructurePackage.ELEMENT___UPDATE_OPERATORS__OPERATORLIST;

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
	 * The operation id for the '<em>Copy Next Elements To Next Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___COPY_NEXT_ELEMENTS_TO_NEXT_GRAPHS = GraphstructurePackage.ELEMENT___COPY_NEXT_ELEMENTS_TO_NEXT_GRAPHS;

	/**
	 * The operation id for the '<em>Copy Next Element To Next Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___COPY_NEXT_ELEMENT_TO_NEXT_GRAPHS__ELEMENT = GraphstructurePackage.ELEMENT___COPY_NEXT_ELEMENT_TO_NEXT_GRAPHS__ELEMENT;

	/**
	 * The operation id for the '<em>Copy Next Element To Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___COPY_NEXT_ELEMENT_TO_PREVIOUS_GRAPHS__ELEMENT_BOOLEAN = GraphstructurePackage.ELEMENT___COPY_NEXT_ELEMENT_TO_PREVIOUS_GRAPHS__ELEMENT_BOOLEAN;

	/**
	 * The operation id for the '<em>Copy Next Elements To Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___COPY_NEXT_ELEMENTS_TO_PREVIOUS_GRAPHS__BOOLEAN = GraphstructurePackage.ELEMENT___COPY_NEXT_ELEMENTS_TO_PREVIOUS_GRAPHS__BOOLEAN;

	/**
	 * The operation id for the '<em>Clear Match Recursively</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CLEAR_MATCH_RECURSIVELY = GraphstructurePackage.ELEMENT___CLEAR_MATCH_RECURSIVELY;

	/**
	 * The operation id for the '<em>Clear Predicates Recursively</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CLEAR_PREDICATES_RECURSIVELY = GraphstructurePackage.ELEMENT___CLEAR_PREDICATES_RECURSIVELY;

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
	 * The operation id for the '<em>Clear Comparison Recursively</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CLEAR_COMPARISON_RECURSIVELY = GraphstructurePackage.ELEMENT___CLEAR_COMPARISON_RECURSIVELY;

	/**
	 * The operation id for the '<em>Clear Property Recursively</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ROOT___CLEAR_PROPERTY_RECURSIVELY = GraphstructurePackage.ELEMENT___CLEAR_PROPERTY_RECURSIVELY;

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
	 * The number of operations of the '<em>XML Root</em>' class.
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
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XMLElement <em>XML Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Element</em>'.
	 * @see qualitypatternmodel.adaptionxml.XMLElement
	 * @generated
	 */
	EClass getXMLElement();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XMLElement#getXQueryRepresentation(qualitypatternmodel.patternstructure.Location) <em>Get XQuery Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get XQuery Representation</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XMLElement#getXQueryRepresentation(qualitypatternmodel.patternstructure.Location)
	 * @generated
	 */
	EOperation getXMLElement__GetXQueryRepresentation__Location();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XMLElement#getXQueryVariable() <em>Get XQuery Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get XQuery Variable</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XMLElement#getXQueryVariable()
	 * @generated
	 */
	EOperation getXMLElement__GetXQueryVariable();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XMLElement#translatePredicates(qualitypatternmodel.patternstructure.Location) <em>Translate Predicates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Translate Predicates</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XMLElement#translatePredicates(qualitypatternmodel.patternstructure.Location)
	 * @generated
	 */
	EOperation getXMLElement__TranslatePredicates__Location();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XMLNavigation <em>XML Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Navigation</em>'.
	 * @see qualitypatternmodel.adaptionxml.XMLNavigation
	 * @generated
	 */
	EClass getXMLNavigation();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XMLNavigation#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see qualitypatternmodel.adaptionxml.XMLNavigation#getOption()
	 * @see #getXMLNavigation()
	 * @generated
	 */
	EReference getXMLNavigation_Option();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XMLNavigation#getOptionParam <em>Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option Param</em>'.
	 * @see qualitypatternmodel.adaptionxml.XMLNavigation#getOptionParam()
	 * @see #getXMLNavigation()
	 * @generated
	 */
	EReference getXMLNavigation_OptionParam();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XMLReference <em>XML Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Reference</em>'.
	 * @see qualitypatternmodel.adaptionxml.XMLReference
	 * @generated
	 */
	EClass getXMLReference();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XMLReference#getSourceProperty <em>Source Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Property</em>'.
	 * @see qualitypatternmodel.adaptionxml.XMLReference#getSourceProperty()
	 * @see #getXMLReference()
	 * @generated
	 */
	EReference getXMLReference_SourceProperty();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XMLReference#getTargetProperty <em>Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Property</em>'.
	 * @see qualitypatternmodel.adaptionxml.XMLReference#getTargetProperty()
	 * @see #getXMLReference()
	 * @generated
	 */
	EReference getXMLReference_TargetProperty();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.adaptionxml.XMLReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see qualitypatternmodel.adaptionxml.XMLReference#getType()
	 * @see #getXMLReference()
	 * @generated
	 */
	EAttribute getXMLReference_Type();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.adaptionxml.XMLReference#isTranslatable() <em>Is Translatable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Translatable</em>' operation.
	 * @see qualitypatternmodel.adaptionxml.XMLReference#isTranslatable()
	 * @generated
	 */
	EOperation getXMLReference__IsTranslatable();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XMLProperty <em>XML Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Property</em>'.
	 * @see qualitypatternmodel.adaptionxml.XMLProperty
	 * @generated
	 */
	EClass getXMLProperty();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XMLProperty#getOptionParam <em>Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option Param</em>'.
	 * @see qualitypatternmodel.adaptionxml.XMLProperty#getOptionParam()
	 * @see #getXMLProperty()
	 * @generated
	 */
	EReference getXMLProperty_OptionParam();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XMLProperty#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see qualitypatternmodel.adaptionxml.XMLProperty#getOption()
	 * @see #getXMLProperty()
	 * @generated
	 */
	EReference getXMLProperty_Option();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.adaptionxml.XMLProperty#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Name</em>'.
	 * @see qualitypatternmodel.adaptionxml.XMLProperty#getAttributeName()
	 * @see #getXMLProperty()
	 * @generated
	 */
	EReference getXMLProperty_AttributeName();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.adaptionxml.XMLRoot <em>XML Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Root</em>'.
	 * @see qualitypatternmodel.adaptionxml.XMLRoot
	 * @generated
	 */
	EClass getXMLRoot();

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
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XMLElementImpl <em>XML Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XMLElementImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXMLElement()
		 * @generated
		 */
		EClass XML_ELEMENT = eINSTANCE.getXMLElement();

		/**
		 * The meta object literal for the '<em><b>Get XQuery Representation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION = eINSTANCE.getXMLElement__GetXQueryRepresentation__Location();

		/**
		 * The meta object literal for the '<em><b>Get XQuery Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_ELEMENT___GET_XQUERY_VARIABLE = eINSTANCE.getXMLElement__GetXQueryVariable();

		/**
		 * The meta object literal for the '<em><b>Translate Predicates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_ELEMENT___TRANSLATE_PREDICATES__LOCATION = eINSTANCE.getXMLElement__TranslatePredicates__Location();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XMLNavigationImpl <em>XML Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XMLNavigationImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXMLNavigation()
		 * @generated
		 */
		EClass XML_NAVIGATION = eINSTANCE.getXMLNavigation();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_NAVIGATION__OPTION = eINSTANCE.getXMLNavigation_Option();

		/**
		 * The meta object literal for the '<em><b>Option Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_NAVIGATION__OPTION_PARAM = eINSTANCE.getXMLNavigation_OptionParam();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XMLReferenceImpl <em>XML Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XMLReferenceImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXMLReference()
		 * @generated
		 */
		EClass XML_REFERENCE = eINSTANCE.getXMLReference();

		/**
		 * The meta object literal for the '<em><b>Source Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_REFERENCE__SOURCE_PROPERTY = eINSTANCE.getXMLReference_SourceProperty();

		/**
		 * The meta object literal for the '<em><b>Target Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_REFERENCE__TARGET_PROPERTY = eINSTANCE.getXMLReference_TargetProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_REFERENCE__TYPE = eINSTANCE.getXMLReference_Type();

		/**
		 * The meta object literal for the '<em><b>Is Translatable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_REFERENCE___IS_TRANSLATABLE = eINSTANCE.getXMLReference__IsTranslatable();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XMLPropertyImpl <em>XML Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XMLPropertyImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXMLProperty()
		 * @generated
		 */
		EClass XML_PROPERTY = eINSTANCE.getXMLProperty();

		/**
		 * The meta object literal for the '<em><b>Option Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_PROPERTY__OPTION_PARAM = eINSTANCE.getXMLProperty_OptionParam();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_PROPERTY__OPTION = eINSTANCE.getXMLProperty_Option();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_PROPERTY__ATTRIBUTE_NAME = eINSTANCE.getXMLProperty_AttributeName();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.adaptionxml.impl.XMLRootImpl <em>XML Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.adaptionxml.impl.XMLRootImpl
		 * @see qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl#getXMLRoot()
		 * @generated
		 */
		EClass XML_ROOT = eINSTANCE.getXMLRoot();

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

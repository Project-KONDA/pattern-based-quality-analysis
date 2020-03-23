/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The feature id for the '<em><b>Mapping From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MAPPING_FROM = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MAPPING_TO = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ELEMENT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OPTION = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___TO_XQUERY__LOCATION = PatternstructurePackage.PATTERN_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_ALL_INPUTS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___IS_VALID__BOOLEAN = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___IS_VALID_LOCAL__BOOLEAN = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN;

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
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___MY_TO_STRING = PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Graph Depth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_GRAPH_DEPTH = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Relation From Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Mappings To Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___REMOVE_MAPPINGS_TO_NEXT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Copy To New Next Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___COPY_TO_NEW_NEXT_GRAPHS__ELEMENT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Create Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___CREATE_INPUTS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Remove Inputs From Variable List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___REMOVE_INPUTS_FROM_VARIABLE_LIST = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 6;

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
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___TO_XQUERY__LOCATION = PatternstructurePackage.PATTERN_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GET_ALL_INPUTS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___IS_VALID__BOOLEAN = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___IS_VALID_LOCAL__BOOLEAN = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN;

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
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___MY_TO_STRING = PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GET_RETURN_TYPE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___IS_TRANSLATABLE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___GET_ALL_ARGUMENT_ELEMENTS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.impl.PropertyImpl
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = COMPARABLE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INTERNAL_ID = COMPARABLE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COMPARISON1 = COMPARABLE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COMPARISON2 = COMPARABLE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ELEMENT = COMPARABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Match</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MATCH = COMPARABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ATTRIBUTE_NAME = COMPARABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OPTION = COMPARABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference Operator2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REFERENCE_OPERATOR2 = COMPARABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reference Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REFERENCE_OPERATOR = COMPARABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = COMPARABLE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___TO_XQUERY__LOCATION = COMPARABLE___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_ALL_INPUTS = COMPARABLE___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___PREPARE_TRANSLATION = COMPARABLE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_VALID__BOOLEAN = COMPARABLE___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_VALID_LOCAL__BOOLEAN = COMPARABLE___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_CONTAINER = COMPARABLE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_ANCESTOR__CLASS = COMPARABLE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___MY_TO_STRING = COMPARABLE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_RETURN_TYPE = COMPARABLE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_TRANSLATABLE = COMPARABLE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_ALL_ARGUMENT_ELEMENTS = COMPARABLE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE__DIAGNOSTICCHAIN_MAP = COMPARABLE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___CREATE_INPUTS = COMPARABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Inputs From Variable List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___REMOVE_INPUTS_FROM_VARIABLE_LIST = COMPARABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = COMPARABLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.impl.ElementImpl
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = COMPARABLE__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__INTERNAL_ID = COMPARABLE__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMPARISON1 = COMPARABLE__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMPARISON2 = COMPARABLE__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Mapping To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MAPPING_TO = COMPARABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MAPPING_FROM = COMPARABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ROOT = COMPARABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NEXT_ELEMENTS = COMPARABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Previous Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PREVIOUS_ELEMENT = COMPARABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__GRAPH = COMPARABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = COMPARABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TRANSLATED = COMPARABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PREDICATES_ARE_BEING_TRANSLATED = COMPARABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Relation From Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RELATION_FROM_PREVIOUS = COMPARABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PROPERTIES = COMPARABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PREDICATES = COMPARABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = COMPARABLE_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___TO_XQUERY__LOCATION = COMPARABLE___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ALL_INPUTS = COMPARABLE___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___PREPARE_TRANSLATION = COMPARABLE___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___IS_VALID__BOOLEAN = COMPARABLE___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___IS_VALID_LOCAL__BOOLEAN = COMPARABLE___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_CONTAINER = COMPARABLE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ANCESTOR__CLASS = COMPARABLE___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___MY_TO_STRING = COMPARABLE___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_RETURN_TYPE = COMPARABLE___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___IS_TRANSLATABLE = COMPARABLE___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ALL_ARGUMENT_ELEMENTS = COMPARABLE___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = COMPARABLE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Copy Next Elements To Next Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___COPY_NEXT_ELEMENTS_TO_NEXT_GRAPHS = COMPARABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Copy Next Element To Next Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___COPY_NEXT_ELEMENT_TO_NEXT_GRAPHS__ELEMENT = COMPARABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Element From Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___REMOVE_ELEMENT_FROM_PREVIOUS_GRAPHS = COMPARABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Copy Next Element To Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___COPY_NEXT_ELEMENT_TO_PREVIOUS_GRAPHS__ELEMENT_BOOLEAN = COMPARABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Copy Next Elements To Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___COPY_NEXT_ELEMENTS_TO_PREVIOUS_GRAPHS__BOOLEAN = COMPARABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>To XQuery No Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___TO_XQUERY_NO_COUNT__LOCATION = COMPARABLE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___IS_ROOT_ELEMENT = COMPARABLE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Remove Mappings To Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___REMOVE_MAPPINGS_TO_NEXT = COMPARABLE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Remove From Return Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___REMOVE_FROM_RETURN_ELEMENTS = COMPARABLE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Clear Match Recursively</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___CLEAR_MATCH_RECURSIVELY = COMPARABLE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get All Relations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ALL_RELATIONS = COMPARABLE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Translate Predicates Via And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___TRANSLATE_PREDICATES_VIA_AND__LOCATION = COMPARABLE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Clear Predicates Recursively</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___CLEAR_PREDICATES_RECURSIVELY = COMPARABLE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Translate Predicates Via Brackets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___TRANSLATE_PREDICATES_VIA_BRACKETS__LOCATION = COMPARABLE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get All Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ALL_ELEMENTS = COMPARABLE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Original ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ORIGINAL_ID = COMPARABLE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get XQuery Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION = COMPARABLE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___ADD_PRIMITIVE_MATCH__STRING = COMPARABLE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___ADD_PRIMITIVE_COMPARISON__STRING = COMPARABLE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get XQuery Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_XQUERY_VARIABLE = COMPARABLE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Add Primitive Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___ADD_PRIMITIVE_MATCH = COMPARABLE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___ADD_PRIMITIVE_COMPARISON = COMPARABLE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Graph Depth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_GRAPH_DEPTH = COMPARABLE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Translate Path From Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___TRANSLATE_PATH_FROM_PREVIOUS = COMPARABLE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ALL_OPERATORS = COMPARABLE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___ADD_PRIMITIVE_COMPARISON__PROPERTYLOCATION_STRING_COMPARISONOPERATOR_PARAMETER = COMPARABLE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Add Primitive Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___ADD_PRIMITIVE_COMPARISON__PARAMETER = COMPARABLE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Clear Comparison Recursively</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___CLEAR_COMPARISON_RECURSIVELY = COMPARABLE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Clear Property Recursively</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___CLEAR_PROPERTY_RECURSIVELY = COMPARABLE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = COMPARABLE_OPERATION_COUNT + 29;

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
	 * The feature id for the '<em><b>Root Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ROOT_ELEMENT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__OPERATOR_LIST = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Graph Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__GRAPH_DEPTH = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__RETURN_GRAPH = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quantified Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__QUANTIFIED_CONDITION = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__PATTERN = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Return Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__RETURN_ELEMENTS = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Morphism To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__MORPHISM_TO = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Morphism From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__MORPHISM_FROM = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___TO_XQUERY__LOCATION = PatternstructurePackage.PATTERN_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ALL_INPUTS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___IS_VALID__BOOLEAN = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___IS_VALID_LOCAL__BOOLEAN = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN;

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
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___MY_TO_STRING = PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ALL_OPERATORS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Copy Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___COPY_GRAPH__GRAPH = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ALL_ELEMENTS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Relations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ALL_RELATIONS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.PropertyLocation <em>Property Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.PropertyLocation
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getPropertyLocation()
	 * @generated
	 */
	int PROPERTY_LOCATION = 5;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.Axis <em>Axis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Axis
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 6;

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
	 * The meta object id for the '<em>List Of Elements</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.ListOfElements
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getListOfElements()
	 * @generated
	 */
	int LIST_OF_ELEMENTS = 8;


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
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.Relation#getMappingTo <em>Mapping To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mapping To</em>'.
	 * @see qualitypatternmodel.graphstructure.Relation#getMappingTo()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_MappingTo();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.graphstructure.Relation#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Element</em>'.
	 * @see qualitypatternmodel.graphstructure.Relation#getElement()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Element();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.Relation#getMappingFrom <em>Mapping From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping From</em>'.
	 * @see qualitypatternmodel.graphstructure.Relation#getMappingFrom()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_MappingFrom();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.Relation#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see qualitypatternmodel.graphstructure.Relation#getOption()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Option();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Relation#getGraphDepth() <em>Get Graph Depth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Graph Depth</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Relation#getGraphDepth()
	 * @generated
	 */
	EOperation getRelation__GetGraphDepth();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Relation#removeRelationFromPreviousGraphs() <em>Remove Relation From Previous Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Relation From Previous Graphs</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Relation#removeRelationFromPreviousGraphs()
	 * @generated
	 */
	EOperation getRelation__RemoveRelationFromPreviousGraphs();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Relation#removeMappingsToNext() <em>Remove Mappings To Next</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Mappings To Next</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Relation#removeMappingsToNext()
	 * @generated
	 */
	EOperation getRelation__RemoveMappingsToNext();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Relation#copyToNewNextGraphs(qualitypatternmodel.graphstructure.Element) <em>Copy To New Next Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy To New Next Graphs</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Relation#copyToNewNextGraphs(qualitypatternmodel.graphstructure.Element)
	 * @generated
	 */
	EOperation getRelation__CopyToNewNextGraphs__Element();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Relation#createInputs() <em>Create Inputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Inputs</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Relation#createInputs()
	 * @generated
	 */
	EOperation getRelation__CreateInputs();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Relation#removeInputsFromVariableList() <em>Remove Inputs From Variable List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Inputs From Variable List</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Relation#removeInputsFromVariableList()
	 * @generated
	 */
	EOperation getRelation__RemoveInputsFromVariableList();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.graphstructure.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see qualitypatternmodel.graphstructure.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.graphstructure.Property#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Element</em>'.
	 * @see qualitypatternmodel.graphstructure.Property#getElement()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Element();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.Property#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Name</em>'.
	 * @see qualitypatternmodel.graphstructure.Property#getAttributeName()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_AttributeName();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.Property#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see qualitypatternmodel.graphstructure.Property#getOption()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Option();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.Property#getReferenceOperator2 <em>Reference Operator2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Operator2</em>'.
	 * @see qualitypatternmodel.graphstructure.Property#getReferenceOperator2()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_ReferenceOperator2();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.Property#getReferenceOperator <em>Reference Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Operator</em>'.
	 * @see qualitypatternmodel.graphstructure.Property#getReferenceOperator()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_ReferenceOperator();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.Property#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Match</em>'.
	 * @see qualitypatternmodel.graphstructure.Property#getMatch()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Match();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Property#createInputs() <em>Create Inputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Inputs</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Property#createInputs()
	 * @generated
	 */
	EOperation getProperty__CreateInputs();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Property#removeInputsFromVariableList() <em>Remove Inputs From Variable List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Inputs From Variable List</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Property#removeInputsFromVariableList()
	 * @generated
	 */
	EOperation getProperty__RemoveInputsFromVariableList();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.graphstructure.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see qualitypatternmodel.graphstructure.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.Element#getMappingTo <em>Mapping To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mapping To</em>'.
	 * @see qualitypatternmodel.graphstructure.Element#getMappingTo()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_MappingTo();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.Element#getMappingFrom <em>Mapping From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping From</em>'.
	 * @see qualitypatternmodel.graphstructure.Element#getMappingFrom()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_MappingFrom();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.graphstructure.Element#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see qualitypatternmodel.graphstructure.Element#getRoot()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.graphstructure.Element#getNextElements <em>Next Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next Elements</em>'.
	 * @see qualitypatternmodel.graphstructure.Element#getNextElements()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_NextElements();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.graphstructure.Element#getPreviousElement <em>Previous Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Previous Element</em>'.
	 * @see qualitypatternmodel.graphstructure.Element#getPreviousElement()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_PreviousElement();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.Element#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see qualitypatternmodel.graphstructure.Element#getGraph()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Graph();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qualitypatternmodel.graphstructure.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Element#isTranslated <em>Translated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translated</em>'.
	 * @see qualitypatternmodel.graphstructure.Element#isTranslated()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Translated();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Element#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicates Are Being Translated</em>'.
	 * @see qualitypatternmodel.graphstructure.Element#isPredicatesAreBeingTranslated()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_PredicatesAreBeingTranslated();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.graphstructure.Element#getRelationFromPrevious <em>Relation From Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relation From Previous</em>'.
	 * @see qualitypatternmodel.graphstructure.Element#getRelationFromPrevious()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_RelationFromPrevious();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.graphstructure.Element#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see qualitypatternmodel.graphstructure.Element#getProperties()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Properties();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.Element#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predicates</em>'.
	 * @see qualitypatternmodel.graphstructure.Element#getPredicates()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Predicates();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#copyNextElementsToNextGraphs() <em>Copy Next Elements To Next Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Next Elements To Next Graphs</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#copyNextElementsToNextGraphs()
	 * @generated
	 */
	EOperation getElement__CopyNextElementsToNextGraphs();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#copyNextElementToNextGraphs(qualitypatternmodel.graphstructure.Element) <em>Copy Next Element To Next Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Next Element To Next Graphs</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#copyNextElementToNextGraphs(qualitypatternmodel.graphstructure.Element)
	 * @generated
	 */
	EOperation getElement__CopyNextElementToNextGraphs__Element();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#removeElementFromPreviousGraphs() <em>Remove Element From Previous Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Element From Previous Graphs</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#removeElementFromPreviousGraphs()
	 * @generated
	 */
	EOperation getElement__RemoveElementFromPreviousGraphs();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#copyNextElementToPreviousGraphs(qualitypatternmodel.graphstructure.Element, boolean) <em>Copy Next Element To Previous Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Next Element To Previous Graphs</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#copyNextElementToPreviousGraphs(qualitypatternmodel.graphstructure.Element, boolean)
	 * @generated
	 */
	EOperation getElement__CopyNextElementToPreviousGraphs__Element_boolean();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#copyNextElementsToPreviousGraphs(boolean) <em>Copy Next Elements To Previous Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Next Elements To Previous Graphs</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#copyNextElementsToPreviousGraphs(boolean)
	 * @generated
	 */
	EOperation getElement__CopyNextElementsToPreviousGraphs__boolean();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#toXQueryNoCount(qualitypatternmodel.patternstructure.Location) <em>To XQuery No Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To XQuery No Count</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#toXQueryNoCount(qualitypatternmodel.patternstructure.Location)
	 * @generated
	 */
	EOperation getElement__ToXQueryNoCount__Location();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#isRootElement() <em>Is Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Root Element</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#isRootElement()
	 * @generated
	 */
	EOperation getElement__IsRootElement();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#removeMappingsToNext() <em>Remove Mappings To Next</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Mappings To Next</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#removeMappingsToNext()
	 * @generated
	 */
	EOperation getElement__RemoveMappingsToNext();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#removeFromReturnElements() <em>Remove From Return Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove From Return Elements</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#removeFromReturnElements()
	 * @generated
	 */
	EOperation getElement__RemoveFromReturnElements();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#clearMatchRecursively() <em>Clear Match Recursively</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Match Recursively</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#clearMatchRecursively()
	 * @generated
	 */
	EOperation getElement__ClearMatchRecursively();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#getAllRelations() <em>Get All Relations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Relations</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#getAllRelations()
	 * @generated
	 */
	EOperation getElement__GetAllRelations();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#translatePredicatesViaAnd(qualitypatternmodel.patternstructure.Location) <em>Translate Predicates Via And</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Translate Predicates Via And</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#translatePredicatesViaAnd(qualitypatternmodel.patternstructure.Location)
	 * @generated
	 */
	EOperation getElement__TranslatePredicatesViaAnd__Location();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#clearPredicatesRecursively() <em>Clear Predicates Recursively</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Predicates Recursively</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#clearPredicatesRecursively()
	 * @generated
	 */
	EOperation getElement__ClearPredicatesRecursively();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#translatePredicatesViaBrackets(qualitypatternmodel.patternstructure.Location) <em>Translate Predicates Via Brackets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Translate Predicates Via Brackets</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#translatePredicatesViaBrackets(qualitypatternmodel.patternstructure.Location)
	 * @generated
	 */
	EOperation getElement__TranslatePredicatesViaBrackets__Location();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#getAllElements() <em>Get All Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Elements</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#getAllElements()
	 * @generated
	 */
	EOperation getElement__GetAllElements();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#getOriginalID() <em>Get Original ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Original ID</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#getOriginalID()
	 * @generated
	 */
	EOperation getElement__GetOriginalID();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#getXQueryRepresentation(qualitypatternmodel.patternstructure.Location) <em>Get XQuery Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get XQuery Representation</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#getXQueryRepresentation(qualitypatternmodel.patternstructure.Location)
	 * @generated
	 */
	EOperation getElement__GetXQueryRepresentation__Location();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#addPrimitiveMatch(java.lang.String) <em>Add Primitive Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Match</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#addPrimitiveMatch(java.lang.String)
	 * @generated
	 */
	EOperation getElement__AddPrimitiveMatch__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#addPrimitiveComparison(java.lang.String) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Comparison</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#addPrimitiveComparison(java.lang.String)
	 * @generated
	 */
	EOperation getElement__AddPrimitiveComparison__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#getXQueryVariable() <em>Get XQuery Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get XQuery Variable</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#getXQueryVariable()
	 * @generated
	 */
	EOperation getElement__GetXQueryVariable();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#addPrimitiveMatch() <em>Add Primitive Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Match</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#addPrimitiveMatch()
	 * @generated
	 */
	EOperation getElement__AddPrimitiveMatch();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#addPrimitiveComparison() <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Comparison</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#addPrimitiveComparison()
	 * @generated
	 */
	EOperation getElement__AddPrimitiveComparison();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#getGraphDepth() <em>Get Graph Depth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Graph Depth</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#getGraphDepth()
	 * @generated
	 */
	EOperation getElement__GetGraphDepth();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#translatePathFromPrevious() <em>Translate Path From Previous</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Translate Path From Previous</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#translatePathFromPrevious()
	 * @generated
	 */
	EOperation getElement__TranslatePathFromPrevious();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#getAllOperators() <em>Get All Operators</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Operators</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#getAllOperators()
	 * @generated
	 */
	EOperation getElement__GetAllOperators();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#addPrimitiveComparison(qualitypatternmodel.graphstructure.PropertyLocation, java.lang.String, qualitypatternmodel.functions.ComparisonOperator, qualitypatternmodel.parameters.Parameter) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Comparison</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#addPrimitiveComparison(qualitypatternmodel.graphstructure.PropertyLocation, java.lang.String, qualitypatternmodel.functions.ComparisonOperator, qualitypatternmodel.parameters.Parameter)
	 * @generated
	 */
	EOperation getElement__AddPrimitiveComparison__PropertyLocation_String_ComparisonOperator_Parameter();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#addPrimitiveComparison(qualitypatternmodel.parameters.Parameter) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Primitive Comparison</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#addPrimitiveComparison(qualitypatternmodel.parameters.Parameter)
	 * @generated
	 */
	EOperation getElement__AddPrimitiveComparison__Parameter();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#clearComparisonRecursively() <em>Clear Comparison Recursively</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Comparison Recursively</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#clearComparisonRecursively()
	 * @generated
	 */
	EOperation getElement__ClearComparisonRecursively();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#clearPropertyRecursively() <em>Clear Property Recursively</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Property Recursively</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#clearPropertyRecursively()
	 * @generated
	 */
	EOperation getElement__ClearPropertyRecursively();

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
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.graphstructure.Graph#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Element</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph#getRootElement()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_RootElement();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.Graph#getReturnElements <em>Return Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Return Elements</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph#getReturnElements()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_ReturnElements();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.Graph#getMorphismTo <em>Morphism To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Morphism To</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph#getMorphismTo()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_MorphismTo();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.Graph#getMorphismFrom <em>Morphism From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Morphism From</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph#getMorphismFrom()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_MorphismFrom();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Graph#getGraphDepth <em>Graph Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Depth</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph#getGraphDepth()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_GraphDepth();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Graph#isReturnGraph <em>Return Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Graph</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph#isReturnGraph()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_ReturnGraph();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#getAllOperators() <em>Get All Operators</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Operators</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#getAllOperators()
	 * @generated
	 */
	EOperation getGraph__GetAllOperators();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#copyGraph(qualitypatternmodel.graphstructure.Graph) <em>Copy Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Graph</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#copyGraph(qualitypatternmodel.graphstructure.Graph)
	 * @generated
	 */
	EOperation getGraph__CopyGraph__Graph();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#getAllElements() <em>Get All Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Elements</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#getAllElements()
	 * @generated
	 */
	EOperation getGraph__GetAllElements();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#getAllRelations() <em>Get All Relations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Relations</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#getAllRelations()
	 * @generated
	 */
	EOperation getGraph__GetAllRelations();

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
	 * Returns the meta object for enum '{@link qualitypatternmodel.graphstructure.PropertyLocation <em>Property Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Location</em>'.
	 * @see qualitypatternmodel.graphstructure.PropertyLocation
	 * @generated
	 */
	EEnum getPropertyLocation();

	/**
	 * Returns the meta object for enum '{@link qualitypatternmodel.graphstructure.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Axis</em>'.
	 * @see qualitypatternmodel.graphstructure.Axis
	 * @generated
	 */
	EEnum getAxis();

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
	 * Returns the meta object for data type '{@link qualitypatternmodel.graphstructure.ListOfElements <em>List Of Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List Of Elements</em>'.
	 * @see qualitypatternmodel.graphstructure.ListOfElements
	 * @model instanceClass="qualitypatternmodel.graphstructure.ListOfElements"
	 * @generated
	 */
	EDataType getListOfElements();

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
		 * The meta object literal for the '<em><b>Mapping To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__MAPPING_TO = eINSTANCE.getRelation_MappingTo();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ELEMENT = eINSTANCE.getRelation_Element();

		/**
		 * The meta object literal for the '<em><b>Mapping From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__MAPPING_FROM = eINSTANCE.getRelation_MappingFrom();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__OPTION = eINSTANCE.getRelation_Option();

		/**
		 * The meta object literal for the '<em><b>Get Graph Depth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___GET_GRAPH_DEPTH = eINSTANCE.getRelation__GetGraphDepth();

		/**
		 * The meta object literal for the '<em><b>Remove Relation From Previous Graphs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS = eINSTANCE.getRelation__RemoveRelationFromPreviousGraphs();

		/**
		 * The meta object literal for the '<em><b>Remove Mappings To Next</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___REMOVE_MAPPINGS_TO_NEXT = eINSTANCE.getRelation__RemoveMappingsToNext();

		/**
		 * The meta object literal for the '<em><b>Copy To New Next Graphs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___COPY_TO_NEW_NEXT_GRAPHS__ELEMENT = eINSTANCE.getRelation__CopyToNewNextGraphs__Element();

		/**
		 * The meta object literal for the '<em><b>Create Inputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___CREATE_INPUTS = eINSTANCE.getRelation__CreateInputs();

		/**
		 * The meta object literal for the '<em><b>Remove Inputs From Variable List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___REMOVE_INPUTS_FROM_VARIABLE_LIST = eINSTANCE.getRelation__RemoveInputsFromVariableList();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.impl.PropertyImpl
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ELEMENT = eINSTANCE.getProperty_Element();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ATTRIBUTE_NAME = eINSTANCE.getProperty_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OPTION = eINSTANCE.getProperty_Option();

		/**
		 * The meta object literal for the '<em><b>Reference Operator2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__REFERENCE_OPERATOR2 = eINSTANCE.getProperty_ReferenceOperator2();

		/**
		 * The meta object literal for the '<em><b>Reference Operator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__REFERENCE_OPERATOR = eINSTANCE.getProperty_ReferenceOperator();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__MATCH = eINSTANCE.getProperty_Match();

		/**
		 * The meta object literal for the '<em><b>Create Inputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___CREATE_INPUTS = eINSTANCE.getProperty__CreateInputs();

		/**
		 * The meta object literal for the '<em><b>Remove Inputs From Variable List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___REMOVE_INPUTS_FROM_VARIABLE_LIST = eINSTANCE.getProperty__RemoveInputsFromVariableList();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.impl.ElementImpl
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Mapping To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__MAPPING_TO = eINSTANCE.getElement_MappingTo();

		/**
		 * The meta object literal for the '<em><b>Mapping From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__MAPPING_FROM = eINSTANCE.getElement_MappingFrom();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ROOT = eINSTANCE.getElement_Root();

		/**
		 * The meta object literal for the '<em><b>Next Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__NEXT_ELEMENTS = eINSTANCE.getElement_NextElements();

		/**
		 * The meta object literal for the '<em><b>Previous Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PREVIOUS_ELEMENT = eINSTANCE.getElement_PreviousElement();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__GRAPH = eINSTANCE.getElement_Graph();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TRANSLATED = eINSTANCE.getElement_Translated();

		/**
		 * The meta object literal for the '<em><b>Predicates Are Being Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__PREDICATES_ARE_BEING_TRANSLATED = eINSTANCE.getElement_PredicatesAreBeingTranslated();

		/**
		 * The meta object literal for the '<em><b>Relation From Previous</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__RELATION_FROM_PREVIOUS = eINSTANCE.getElement_RelationFromPrevious();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PROPERTIES = eINSTANCE.getElement_Properties();

		/**
		 * The meta object literal for the '<em><b>Predicates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PREDICATES = eINSTANCE.getElement_Predicates();

		/**
		 * The meta object literal for the '<em><b>Copy Next Elements To Next Graphs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___COPY_NEXT_ELEMENTS_TO_NEXT_GRAPHS = eINSTANCE.getElement__CopyNextElementsToNextGraphs();

		/**
		 * The meta object literal for the '<em><b>Copy Next Element To Next Graphs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___COPY_NEXT_ELEMENT_TO_NEXT_GRAPHS__ELEMENT = eINSTANCE.getElement__CopyNextElementToNextGraphs__Element();

		/**
		 * The meta object literal for the '<em><b>Remove Element From Previous Graphs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___REMOVE_ELEMENT_FROM_PREVIOUS_GRAPHS = eINSTANCE.getElement__RemoveElementFromPreviousGraphs();

		/**
		 * The meta object literal for the '<em><b>Copy Next Element To Previous Graphs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___COPY_NEXT_ELEMENT_TO_PREVIOUS_GRAPHS__ELEMENT_BOOLEAN = eINSTANCE.getElement__CopyNextElementToPreviousGraphs__Element_boolean();

		/**
		 * The meta object literal for the '<em><b>Copy Next Elements To Previous Graphs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___COPY_NEXT_ELEMENTS_TO_PREVIOUS_GRAPHS__BOOLEAN = eINSTANCE.getElement__CopyNextElementsToPreviousGraphs__boolean();

		/**
		 * The meta object literal for the '<em><b>To XQuery No Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___TO_XQUERY_NO_COUNT__LOCATION = eINSTANCE.getElement__ToXQueryNoCount__Location();

		/**
		 * The meta object literal for the '<em><b>Is Root Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___IS_ROOT_ELEMENT = eINSTANCE.getElement__IsRootElement();

		/**
		 * The meta object literal for the '<em><b>Remove Mappings To Next</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___REMOVE_MAPPINGS_TO_NEXT = eINSTANCE.getElement__RemoveMappingsToNext();

		/**
		 * The meta object literal for the '<em><b>Remove From Return Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___REMOVE_FROM_RETURN_ELEMENTS = eINSTANCE.getElement__RemoveFromReturnElements();

		/**
		 * The meta object literal for the '<em><b>Clear Match Recursively</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___CLEAR_MATCH_RECURSIVELY = eINSTANCE.getElement__ClearMatchRecursively();

		/**
		 * The meta object literal for the '<em><b>Get All Relations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_ALL_RELATIONS = eINSTANCE.getElement__GetAllRelations();

		/**
		 * The meta object literal for the '<em><b>Translate Predicates Via And</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___TRANSLATE_PREDICATES_VIA_AND__LOCATION = eINSTANCE.getElement__TranslatePredicatesViaAnd__Location();

		/**
		 * The meta object literal for the '<em><b>Clear Predicates Recursively</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___CLEAR_PREDICATES_RECURSIVELY = eINSTANCE.getElement__ClearPredicatesRecursively();

		/**
		 * The meta object literal for the '<em><b>Translate Predicates Via Brackets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___TRANSLATE_PREDICATES_VIA_BRACKETS__LOCATION = eINSTANCE.getElement__TranslatePredicatesViaBrackets__Location();

		/**
		 * The meta object literal for the '<em><b>Get All Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_ALL_ELEMENTS = eINSTANCE.getElement__GetAllElements();

		/**
		 * The meta object literal for the '<em><b>Get Original ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_ORIGINAL_ID = eINSTANCE.getElement__GetOriginalID();

		/**
		 * The meta object literal for the '<em><b>Get XQuery Representation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION = eINSTANCE.getElement__GetXQueryRepresentation__Location();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Match</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___ADD_PRIMITIVE_MATCH__STRING = eINSTANCE.getElement__AddPrimitiveMatch__String();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Comparison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___ADD_PRIMITIVE_COMPARISON__STRING = eINSTANCE.getElement__AddPrimitiveComparison__String();

		/**
		 * The meta object literal for the '<em><b>Get XQuery Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_XQUERY_VARIABLE = eINSTANCE.getElement__GetXQueryVariable();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Match</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___ADD_PRIMITIVE_MATCH = eINSTANCE.getElement__AddPrimitiveMatch();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Comparison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___ADD_PRIMITIVE_COMPARISON = eINSTANCE.getElement__AddPrimitiveComparison();

		/**
		 * The meta object literal for the '<em><b>Get Graph Depth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_GRAPH_DEPTH = eINSTANCE.getElement__GetGraphDepth();

		/**
		 * The meta object literal for the '<em><b>Translate Path From Previous</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___TRANSLATE_PATH_FROM_PREVIOUS = eINSTANCE.getElement__TranslatePathFromPrevious();

		/**
		 * The meta object literal for the '<em><b>Get All Operators</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_ALL_OPERATORS = eINSTANCE.getElement__GetAllOperators();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Comparison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___ADD_PRIMITIVE_COMPARISON__PROPERTYLOCATION_STRING_COMPARISONOPERATOR_PARAMETER = eINSTANCE.getElement__AddPrimitiveComparison__PropertyLocation_String_ComparisonOperator_Parameter();

		/**
		 * The meta object literal for the '<em><b>Add Primitive Comparison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___ADD_PRIMITIVE_COMPARISON__PARAMETER = eINSTANCE.getElement__AddPrimitiveComparison__Parameter();

		/**
		 * The meta object literal for the '<em><b>Clear Comparison Recursively</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___CLEAR_COMPARISON_RECURSIVELY = eINSTANCE.getElement__ClearComparisonRecursively();

		/**
		 * The meta object literal for the '<em><b>Clear Property Recursively</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___CLEAR_PROPERTY_RECURSIVELY = eINSTANCE.getElement__ClearPropertyRecursively();

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
		 * The meta object literal for the '<em><b>Root Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__ROOT_ELEMENT = eINSTANCE.getGraph_RootElement();

		/**
		 * The meta object literal for the '<em><b>Return Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__RETURN_ELEMENTS = eINSTANCE.getGraph_ReturnElements();

		/**
		 * The meta object literal for the '<em><b>Morphism To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__MORPHISM_TO = eINSTANCE.getGraph_MorphismTo();

		/**
		 * The meta object literal for the '<em><b>Morphism From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__MORPHISM_FROM = eINSTANCE.getGraph_MorphismFrom();

		/**
		 * The meta object literal for the '<em><b>Operator List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__OPERATOR_LIST = eINSTANCE.getGraph_OperatorList();

		/**
		 * The meta object literal for the '<em><b>Graph Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__GRAPH_DEPTH = eINSTANCE.getGraph_GraphDepth();

		/**
		 * The meta object literal for the '<em><b>Return Graph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__RETURN_GRAPH = eINSTANCE.getGraph_ReturnGraph();

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
		 * The meta object literal for the '<em><b>Get All Operators</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_ALL_OPERATORS = eINSTANCE.getGraph__GetAllOperators();

		/**
		 * The meta object literal for the '<em><b>Copy Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___COPY_GRAPH__GRAPH = eINSTANCE.getGraph__CopyGraph__Graph();

		/**
		 * The meta object literal for the '<em><b>Get All Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_ALL_ELEMENTS = eINSTANCE.getGraph__GetAllElements();

		/**
		 * The meta object literal for the '<em><b>Get All Relations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_ALL_RELATIONS = eINSTANCE.getGraph__GetAllRelations();

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
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.PropertyLocation <em>Property Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.PropertyLocation
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getPropertyLocation()
		 * @generated
		 */
		EEnum PROPERTY_LOCATION = eINSTANCE.getPropertyLocation();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.Axis <em>Axis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.Axis
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getAxis()
		 * @generated
		 */
		EEnum AXIS = eINSTANCE.getAxis();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.ReturnType <em>Return Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.ReturnType
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getReturnType()
		 * @generated
		 */
		EEnum RETURN_TYPE = eINSTANCE.getReturnType();

		/**
		 * The meta object literal for the '<em>List Of Elements</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.ListOfElements
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getListOfElements()
		 * @generated
		 */
		EDataType LIST_OF_ELEMENTS = eINSTANCE.getListOfElements();

	}

} //GraphstructurePackage

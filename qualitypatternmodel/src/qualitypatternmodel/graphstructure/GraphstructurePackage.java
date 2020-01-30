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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
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
	 * The feature id for the '<em><b>Ref No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__REF_NO = PatternstructurePackage.PATTERN_ELEMENT__REF_NO;

	/**
	 * The feature id for the '<em><b>Mapping From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MAPPING_FROM = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MAPPING_TO = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__AXIS = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relation To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__RELATION_TO = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 3;

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
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.impl.GraphElementImpl <em>Graph Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.impl.GraphElementImpl
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getGraphElement()
	 * @generated
	 */
	int GRAPH_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__ID = PatternstructurePackage.PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Ref No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__REF_NO = PatternstructurePackage.PATTERN_ELEMENT__REF_NO;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__COMPARISON1 = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__COMPARISON2 = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___TO_XQUERY__LOCATION = PatternstructurePackage.PATTERN_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___GET_ALL_INPUTS = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___IS_VALID__BOOLEAN = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___IS_VALID_LOCAL__BOOLEAN = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___GET_CONTAINER = PatternstructurePackage.PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___GET_ANCESTOR__CLASS = PatternstructurePackage.PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___GET_RETURN_TYPE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___IS_TRANSLATABLE = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___TO_XQUERY__LOCATION_INT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___GET_ALL_ARGUMENT_ELEMENTS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 5;

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
	int PROPERTY__ID = GRAPH_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Ref No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REF_NO = GRAPH_ELEMENT__REF_NO;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COMPARISON1 = GRAPH_ELEMENT__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COMPARISON2 = GRAPH_ELEMENT__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Property Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY_OPTION = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ELEMENT = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ATTRIBUTE_NAME = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___TO_XQUERY__LOCATION = GRAPH_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_ALL_INPUTS = GRAPH_ELEMENT___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___PREPARE_TRANSLATION = GRAPH_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_VALID__BOOLEAN = GRAPH_ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_VALID_LOCAL__BOOLEAN = GRAPH_ELEMENT___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_CONTAINER = GRAPH_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_ANCESTOR__CLASS = GRAPH_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_RETURN_TYPE = GRAPH_ELEMENT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_TRANSLATABLE = GRAPH_ELEMENT___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___TO_XQUERY__LOCATION_INT = GRAPH_ELEMENT___TO_XQUERY__LOCATION_INT;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_ALL_ARGUMENT_ELEMENTS = GRAPH_ELEMENT___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE__DIAGNOSTICCHAIN_MAP = GRAPH_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.impl.ElementImpl
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = GRAPH_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Ref No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__REF_NO = GRAPH_ELEMENT__REF_NO;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMPARISON1 = GRAPH_ELEMENT__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMPARISON2 = GRAPH_ELEMENT__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Relation From Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RELATION_FROM_PREVIOUS = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TRANSLATED = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PROPERTIES = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PREDICATES_ARE_BEING_TRANSLATED = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Get All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__GET_ALL_ELEMENTS = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Get All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__GET_ALL_RELATIONS = GRAPH_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PREDICATES = GRAPH_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___TO_XQUERY__LOCATION = GRAPH_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ALL_INPUTS = GRAPH_ELEMENT___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___PREPARE_TRANSLATION = GRAPH_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___IS_VALID__BOOLEAN = GRAPH_ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___IS_VALID_LOCAL__BOOLEAN = GRAPH_ELEMENT___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_CONTAINER = GRAPH_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ANCESTOR__CLASS = GRAPH_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_RETURN_TYPE = GRAPH_ELEMENT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___IS_TRANSLATABLE = GRAPH_ELEMENT___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___TO_XQUERY__LOCATION_INT = GRAPH_ELEMENT___TO_XQUERY__LOCATION_INT;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ALL_ARGUMENT_ELEMENTS = GRAPH_ELEMENT___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = GRAPH_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Next Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_NEXT_ELEMENTS = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Previous Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_PREVIOUS_ELEMENT = GRAPH_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ALL_OPERATORS = GRAPH_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ALL_VARIABLES = GRAPH_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get XQuery Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION_INT = GRAPH_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Context Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_CONTEXT_REPRESENTATION__INT = GRAPH_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Graph Depth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_GRAPH_DEPTH = GRAPH_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Translate Element Existence Predicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___TRANSLATE_ELEMENT_EXISTENCE_PREDICATES__LOCATION_INT = GRAPH_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl <em>Single Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.impl.SingleElementImpl
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getSingleElement()
	 * @generated
	 */
	int SINGLE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Ref No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__REF_NO = ELEMENT__REF_NO;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__COMPARISON1 = ELEMENT__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__COMPARISON2 = ELEMENT__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Relation From Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__RELATION_FROM_PREVIOUS = ELEMENT__RELATION_FROM_PREVIOUS;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__TRANSLATED = ELEMENT__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__PROPERTIES = ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__PREDICATES_ARE_BEING_TRANSLATED = ELEMENT__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Get All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__GET_ALL_ELEMENTS = ELEMENT__GET_ALL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Get All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__GET_ALL_RELATIONS = ELEMENT__GET_ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__PREDICATES = ELEMENT__PREDICATES;

	/**
	 * The feature id for the '<em><b>Mapping To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__MAPPING_TO = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__MAPPING_FROM = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__ROOT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Single</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__NEXT_SINGLE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__PREVIOUS = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Next Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__NEXT_SET = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Single Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___TO_XQUERY__LOCATION = ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_ALL_INPUTS = ELEMENT___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___PREPARE_TRANSLATION = ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___IS_VALID__BOOLEAN = ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___IS_VALID_LOCAL__BOOLEAN = ELEMENT___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_CONTAINER = ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_ANCESTOR__CLASS = ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_RETURN_TYPE = ELEMENT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___IS_TRANSLATABLE = ELEMENT___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___TO_XQUERY__LOCATION_INT = ELEMENT___TO_XQUERY__LOCATION_INT;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_ALL_ARGUMENT_ELEMENTS = ELEMENT___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Next Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_NEXT_ELEMENTS = ELEMENT___GET_NEXT_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Previous Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_PREVIOUS_ELEMENT = ELEMENT___GET_PREVIOUS_ELEMENT;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_ALL_OPERATORS = ELEMENT___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_ALL_VARIABLES = ELEMENT___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Get XQuery Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION_INT = ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION_INT;

	/**
	 * The operation id for the '<em>Get Context Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_CONTEXT_REPRESENTATION__INT = ELEMENT___GET_CONTEXT_REPRESENTATION__INT;

	/**
	 * The operation id for the '<em>Get Graph Depth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_GRAPH_DEPTH = ELEMENT___GET_GRAPH_DEPTH;

	/**
	 * The operation id for the '<em>Translate Element Existence Predicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___TRANSLATE_ELEMENT_EXISTENCE_PREDICATES__LOCATION_INT = ELEMENT___TRANSLATE_ELEMENT_EXISTENCE_PREDICATES__LOCATION_INT;

	/**
	 * The operation id for the '<em>Get Original ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_ORIGINAL_ID = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get XQuery Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_XQUERY_VARIABLE = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Translate Predicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___TRANSLATE_PREDICATES__LOCATION = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Translate Path From Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___TRANSLATE_PATH_FROM_PREVIOUS = ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Copy Next Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___COPY_NEXT_ELEMENTS = ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Copy Next Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___COPY_NEXT_ELEMENT__SINGLEELEMENT = ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Remove Element From Previous Graphs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___REMOVE_ELEMENT_FROM_PREVIOUS_GRAPHS = ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Single Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.impl.SetElementImpl <em>Set Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.impl.SetElementImpl
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getSetElement()
	 * @generated
	 */
	int SET_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Ref No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__REF_NO = ELEMENT__REF_NO;

	/**
	 * The feature id for the '<em><b>Comparison1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__COMPARISON1 = ELEMENT__COMPARISON1;

	/**
	 * The feature id for the '<em><b>Comparison2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__COMPARISON2 = ELEMENT__COMPARISON2;

	/**
	 * The feature id for the '<em><b>Relation From Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__RELATION_FROM_PREVIOUS = ELEMENT__RELATION_FROM_PREVIOUS;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__TRANSLATED = ELEMENT__TRANSLATED;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__PROPERTIES = ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__PREDICATES_ARE_BEING_TRANSLATED = ELEMENT__PREDICATES_ARE_BEING_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Get All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__GET_ALL_ELEMENTS = ELEMENT__GET_ALL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Get All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__GET_ALL_RELATIONS = ELEMENT__GET_ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__PREDICATES = ELEMENT__PREDICATES;

	/**
	 * The feature id for the '<em><b>Nesting Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__NESTING_DEPTH = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__NEXT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__PREVIOUS_SET = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Previous Single</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__PREVIOUS_SINGLE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__BEING_TRANSLATED = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Count</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Set Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___TO_XQUERY__LOCATION = ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_ALL_INPUTS = ELEMENT___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___PREPARE_TRANSLATION = ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___IS_VALID__BOOLEAN = ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___IS_VALID_LOCAL__BOOLEAN = ELEMENT___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_CONTAINER = ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_ANCESTOR__CLASS = ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_RETURN_TYPE = ELEMENT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___IS_TRANSLATABLE = ELEMENT___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___TO_XQUERY__LOCATION_INT = ELEMENT___TO_XQUERY__LOCATION_INT;

	/**
	 * The operation id for the '<em>Get All Argument Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_ALL_ARGUMENT_ELEMENTS = ELEMENT___GET_ALL_ARGUMENT_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Next Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_NEXT_ELEMENTS = ELEMENT___GET_NEXT_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Previous Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_PREVIOUS_ELEMENT = ELEMENT___GET_PREVIOUS_ELEMENT;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_ALL_OPERATORS = ELEMENT___GET_ALL_OPERATORS;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_ALL_VARIABLES = ELEMENT___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Get XQuery Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION_INT = ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION_INT;

	/**
	 * The operation id for the '<em>Get Context Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_CONTEXT_REPRESENTATION__INT = ELEMENT___GET_CONTEXT_REPRESENTATION__INT;

	/**
	 * The operation id for the '<em>Get Graph Depth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_GRAPH_DEPTH = ELEMENT___GET_GRAPH_DEPTH;

	/**
	 * The operation id for the '<em>Translate Element Existence Predicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___TRANSLATE_ELEMENT_EXISTENCE_PREDICATES__LOCATION_INT = ELEMENT___TRANSLATE_ELEMENT_EXISTENCE_PREDICATES__LOCATION_INT;

	/**
	 * The operation id for the '<em>Translate Path From Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___TRANSLATE_PATH_FROM_PREVIOUS__INT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Translate Predicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___TRANSLATE_PREDICATES__LOCATION_INT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path To Previous Single Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_PATH_TO_PREVIOUS_SINGLE_ELEMENT = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Argument Elements Set Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_ALL_ARGUMENT_ELEMENTS_SET_OPERATION = ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Set Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.impl.GraphImpl
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ID = PatternstructurePackage.PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Ref No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__REF_NO = PatternstructurePackage.PATTERN_ELEMENT__REF_NO;

	/**
	 * The feature id for the '<em><b>Return Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__RETURN_ELEMENTS = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ROOT_ELEMENT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__OPERATOR_LIST = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__GRAPH_DEPTH = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__RETURN_GRAPH = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Get All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__GET_ALL_ELEMENTS = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Get All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__GET_ALL_RELATIONS = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Quantified Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__QUANTIFIED_CONDITION = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__PATTERN = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 8;

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
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.PropertyLocation <em>Property Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.PropertyLocation
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getPropertyLocation()
	 * @generated
	 */
	int PROPERTY_LOCATION = 7;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.Axis <em>Axis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Axis
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 8;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.ReturnType <em>Return Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.ReturnType
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 9;


	/**
	 * The meta object id for the '<em>List Of Elements</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.ListOfElements
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getListOfElements()
	 * @generated
	 */
	int LIST_OF_ELEMENTS = 10;


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
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.Relation#getMappingTo <em>Mapping To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping To</em>'.
	 * @see qualitypatternmodel.graphstructure.Relation#getMappingTo()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_MappingTo();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Relation#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see qualitypatternmodel.graphstructure.Relation#getAxis()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Axis();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.graphstructure.Relation#getRelationTo <em>Relation To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Relation To</em>'.
	 * @see qualitypatternmodel.graphstructure.Relation#getRelationTo()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_RelationTo();

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
	 * Returns the meta object for class '{@link qualitypatternmodel.graphstructure.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see qualitypatternmodel.graphstructure.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.Property#getPropertyOption <em>Property Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Option</em>'.
	 * @see qualitypatternmodel.graphstructure.Property#getPropertyOption()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_PropertyOption();

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
	 * Returns the meta object for class '{@link qualitypatternmodel.graphstructure.SingleElement <em>Single Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Element</em>'.
	 * @see qualitypatternmodel.graphstructure.SingleElement
	 * @generated
	 */
	EClass getSingleElement();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.SingleElement#getMappingFrom <em>Mapping From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping From</em>'.
	 * @see qualitypatternmodel.graphstructure.SingleElement#getMappingFrom()
	 * @see #getSingleElement()
	 * @generated
	 */
	EReference getSingleElement_MappingFrom();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.SingleElement#getMappingTo <em>Mapping To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mapping To</em>'.
	 * @see qualitypatternmodel.graphstructure.SingleElement#getMappingTo()
	 * @see #getSingleElement()
	 * @generated
	 */
	EReference getSingleElement_MappingTo();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.graphstructure.SingleElement#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see qualitypatternmodel.graphstructure.SingleElement#getRoot()
	 * @see #getSingleElement()
	 * @generated
	 */
	EReference getSingleElement_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.graphstructure.SingleElement#getNextSingle <em>Next Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next Single</em>'.
	 * @see qualitypatternmodel.graphstructure.SingleElement#getNextSingle()
	 * @see #getSingleElement()
	 * @generated
	 */
	EReference getSingleElement_NextSingle();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.graphstructure.SingleElement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Previous</em>'.
	 * @see qualitypatternmodel.graphstructure.SingleElement#getPrevious()
	 * @see #getSingleElement()
	 * @generated
	 */
	EReference getSingleElement_Previous();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.graphstructure.SingleElement#getNextSet <em>Next Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next Set</em>'.
	 * @see qualitypatternmodel.graphstructure.SingleElement#getNextSet()
	 * @see #getSingleElement()
	 * @generated
	 */
	EReference getSingleElement_NextSet();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.SingleElement#getOriginalID() <em>Get Original ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Original ID</em>' operation.
	 * @see qualitypatternmodel.graphstructure.SingleElement#getOriginalID()
	 * @generated
	 */
	EOperation getSingleElement__GetOriginalID();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.SingleElement#getXQueryVariable() <em>Get XQuery Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get XQuery Variable</em>' operation.
	 * @see qualitypatternmodel.graphstructure.SingleElement#getXQueryVariable()
	 * @generated
	 */
	EOperation getSingleElement__GetXQueryVariable();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.SingleElement#translatePredicates(qualitypatternmodel.patternstructure.Location) <em>Translate Predicates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Translate Predicates</em>' operation.
	 * @see qualitypatternmodel.graphstructure.SingleElement#translatePredicates(qualitypatternmodel.patternstructure.Location)
	 * @generated
	 */
	EOperation getSingleElement__TranslatePredicates__Location();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.SingleElement#translatePathFromPrevious() <em>Translate Path From Previous</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Translate Path From Previous</em>' operation.
	 * @see qualitypatternmodel.graphstructure.SingleElement#translatePathFromPrevious()
	 * @generated
	 */
	EOperation getSingleElement__TranslatePathFromPrevious();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.SingleElement#copyNextElements() <em>Copy Next Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Next Elements</em>' operation.
	 * @see qualitypatternmodel.graphstructure.SingleElement#copyNextElements()
	 * @generated
	 */
	EOperation getSingleElement__CopyNextElements();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.SingleElement#copyNextElement(qualitypatternmodel.graphstructure.SingleElement) <em>Copy Next Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Next Element</em>' operation.
	 * @see qualitypatternmodel.graphstructure.SingleElement#copyNextElement(qualitypatternmodel.graphstructure.SingleElement)
	 * @generated
	 */
	EOperation getSingleElement__CopyNextElement__SingleElement();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.SingleElement#removeElementFromPreviousGraphs() <em>Remove Element From Previous Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Element From Previous Graphs</em>' operation.
	 * @see qualitypatternmodel.graphstructure.SingleElement#removeElementFromPreviousGraphs()
	 * @generated
	 */
	EOperation getSingleElement__RemoveElementFromPreviousGraphs();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.graphstructure.SetElement <em>Set Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Element</em>'.
	 * @see qualitypatternmodel.graphstructure.SetElement
	 * @generated
	 */
	EClass getSetElement();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.SetElement#getNestingDepth <em>Nesting Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nesting Depth</em>'.
	 * @see qualitypatternmodel.graphstructure.SetElement#getNestingDepth()
	 * @see #getSetElement()
	 * @generated
	 */
	EAttribute getSetElement_NestingDepth();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.graphstructure.SetElement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next</em>'.
	 * @see qualitypatternmodel.graphstructure.SetElement#getNext()
	 * @see #getSetElement()
	 * @generated
	 */
	EReference getSetElement_Next();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.graphstructure.SetElement#getPreviousSet <em>Previous Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Previous Set</em>'.
	 * @see qualitypatternmodel.graphstructure.SetElement#getPreviousSet()
	 * @see #getSetElement()
	 * @generated
	 */
	EReference getSetElement_PreviousSet();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.graphstructure.SetElement#getPreviousSingle <em>Previous Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Previous Single</em>'.
	 * @see qualitypatternmodel.graphstructure.SetElement#getPreviousSingle()
	 * @see #getSetElement()
	 * @generated
	 */
	EReference getSetElement_PreviousSingle();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.SetElement#isBeingTranslated <em>Being Translated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Being Translated</em>'.
	 * @see qualitypatternmodel.graphstructure.SetElement#isBeingTranslated()
	 * @see #getSetElement()
	 * @generated
	 */
	EAttribute getSetElement_BeingTranslated();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.SetElement#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Count</em>'.
	 * @see qualitypatternmodel.graphstructure.SetElement#getCount()
	 * @see #getSetElement()
	 * @generated
	 */
	EReference getSetElement_Count();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.SetElement#translatePathFromPrevious(int) <em>Translate Path From Previous</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Translate Path From Previous</em>' operation.
	 * @see qualitypatternmodel.graphstructure.SetElement#translatePathFromPrevious(int)
	 * @generated
	 */
	EOperation getSetElement__TranslatePathFromPrevious__int();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.SetElement#translatePredicates(qualitypatternmodel.patternstructure.Location, int) <em>Translate Predicates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Translate Predicates</em>' operation.
	 * @see qualitypatternmodel.graphstructure.SetElement#translatePredicates(qualitypatternmodel.patternstructure.Location, int)
	 * @generated
	 */
	EOperation getSetElement__TranslatePredicates__Location_int();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.SetElement#getPathToPreviousSingleElement() <em>Get Path To Previous Single Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Path To Previous Single Element</em>' operation.
	 * @see qualitypatternmodel.graphstructure.SetElement#getPathToPreviousSingleElement()
	 * @generated
	 */
	EOperation getSetElement__GetPathToPreviousSingleElement();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.SetElement#getAllArgumentElementsSetOperation() <em>Get All Argument Elements Set Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Argument Elements Set Operation</em>' operation.
	 * @see qualitypatternmodel.graphstructure.SetElement#getAllArgumentElementsSetOperation()
	 * @generated
	 */
	EOperation getSetElement__GetAllArgumentElementsSetOperation();

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
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.Element#getGetAllElements <em>Get All Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Get All Elements</em>'.
	 * @see qualitypatternmodel.graphstructure.Element#getGetAllElements()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_GetAllElements();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.Element#getGetAllRelations <em>Get All Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Get All Relations</em>'.
	 * @see qualitypatternmodel.graphstructure.Element#getGetAllRelations()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_GetAllRelations();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#getNextElements() <em>Get Next Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next Elements</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#getNextElements()
	 * @generated
	 */
	EOperation getElement__GetNextElements();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#getPreviousElement() <em>Get Previous Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Previous Element</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#getPreviousElement()
	 * @generated
	 */
	EOperation getElement__GetPreviousElement();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#getAllVariables() <em>Get All Variables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Variables</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#getAllVariables()
	 * @generated
	 */
	EOperation getElement__GetAllVariables();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#getXQueryRepresentation(qualitypatternmodel.patternstructure.Location, int) <em>Get XQuery Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get XQuery Representation</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#getXQueryRepresentation(qualitypatternmodel.patternstructure.Location, int)
	 * @generated
	 */
	EOperation getElement__GetXQueryRepresentation__Location_int();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#getContextRepresentation(int) <em>Get Context Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Context Representation</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#getContextRepresentation(int)
	 * @generated
	 */
	EOperation getElement__GetContextRepresentation__int();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Element#translateElementExistencePredicates(qualitypatternmodel.patternstructure.Location, int) <em>Translate Element Existence Predicates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Translate Element Existence Predicates</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Element#translateElementExistencePredicates(qualitypatternmodel.patternstructure.Location, int)
	 * @generated
	 */
	EOperation getElement__TranslateElementExistencePredicates__Location_int();

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
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.Graph#getGetAllElements <em>Get All Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Get All Elements</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph#getGetAllElements()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_GetAllElements();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.Graph#getGetAllRelations <em>Get All Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Get All Relations</em>'.
	 * @see qualitypatternmodel.graphstructure.Graph#getGetAllRelations()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_GetAllRelations();

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
	 * Returns the meta object for class '{@link qualitypatternmodel.graphstructure.GraphElement <em>Graph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Element</em>'.
	 * @see qualitypatternmodel.graphstructure.GraphElement
	 * @generated
	 */
	EClass getGraphElement();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.GraphElement#getComparison1 <em>Comparison1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comparison1</em>'.
	 * @see qualitypatternmodel.graphstructure.GraphElement#getComparison1()
	 * @see #getGraphElement()
	 * @generated
	 */
	EReference getGraphElement_Comparison1();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.graphstructure.GraphElement#getComparison2 <em>Comparison2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comparison2</em>'.
	 * @see qualitypatternmodel.graphstructure.GraphElement#getComparison2()
	 * @see #getGraphElement()
	 * @generated
	 */
	EReference getGraphElement_Comparison2();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.GraphElement#getReturnType() <em>Get Return Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Return Type</em>' operation.
	 * @see qualitypatternmodel.graphstructure.GraphElement#getReturnType()
	 * @generated
	 */
	EOperation getGraphElement__GetReturnType();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.GraphElement#isTranslatable() <em>Is Translatable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Translatable</em>' operation.
	 * @see qualitypatternmodel.graphstructure.GraphElement#isTranslatable()
	 * @generated
	 */
	EOperation getGraphElement__IsTranslatable();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.GraphElement#toXQuery(qualitypatternmodel.patternstructure.Location, int) <em>To XQuery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To XQuery</em>' operation.
	 * @see qualitypatternmodel.graphstructure.GraphElement#toXQuery(qualitypatternmodel.patternstructure.Location, int)
	 * @generated
	 */
	EOperation getGraphElement__ToXQuery__Location_int();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.GraphElement#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qualitypatternmodel.graphstructure.GraphElement#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGraphElement__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.GraphElement#getAllArgumentElements() <em>Get All Argument Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Argument Elements</em>' operation.
	 * @see qualitypatternmodel.graphstructure.GraphElement#getAllArgumentElements()
	 * @generated
	 */
	EOperation getGraphElement__GetAllArgumentElements();

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
		 * The meta object literal for the '<em><b>Mapping To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__MAPPING_TO = eINSTANCE.getRelation_MappingTo();

		/**
		 * The meta object literal for the '<em><b>Mapping From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__MAPPING_FROM = eINSTANCE.getRelation_MappingFrom();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__AXIS = eINSTANCE.getRelation_Axis();

		/**
		 * The meta object literal for the '<em><b>Relation To</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__RELATION_TO = eINSTANCE.getRelation_RelationTo();

		/**
		 * The meta object literal for the '<em><b>Get Graph Depth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___GET_GRAPH_DEPTH = eINSTANCE.getRelation__GetGraphDepth();

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
		 * The meta object literal for the '<em><b>Property Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PROPERTY_OPTION = eINSTANCE.getProperty_PropertyOption();

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
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl <em>Single Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.impl.SingleElementImpl
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getSingleElement()
		 * @generated
		 */
		EClass SINGLE_ELEMENT = eINSTANCE.getSingleElement();

		/**
		 * The meta object literal for the '<em><b>Mapping From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT__MAPPING_FROM = eINSTANCE.getSingleElement_MappingFrom();

		/**
		 * The meta object literal for the '<em><b>Mapping To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT__MAPPING_TO = eINSTANCE.getSingleElement_MappingTo();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT__ROOT = eINSTANCE.getSingleElement_Root();

		/**
		 * The meta object literal for the '<em><b>Next Single</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT__NEXT_SINGLE = eINSTANCE.getSingleElement_NextSingle();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT__PREVIOUS = eINSTANCE.getSingleElement_Previous();

		/**
		 * The meta object literal for the '<em><b>Next Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT__NEXT_SET = eINSTANCE.getSingleElement_NextSet();

		/**
		 * The meta object literal for the '<em><b>Get Original ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_ELEMENT___GET_ORIGINAL_ID = eINSTANCE.getSingleElement__GetOriginalID();

		/**
		 * The meta object literal for the '<em><b>Get XQuery Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_ELEMENT___GET_XQUERY_VARIABLE = eINSTANCE.getSingleElement__GetXQueryVariable();

		/**
		 * The meta object literal for the '<em><b>Translate Predicates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_ELEMENT___TRANSLATE_PREDICATES__LOCATION = eINSTANCE.getSingleElement__TranslatePredicates__Location();

		/**
		 * The meta object literal for the '<em><b>Translate Path From Previous</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_ELEMENT___TRANSLATE_PATH_FROM_PREVIOUS = eINSTANCE.getSingleElement__TranslatePathFromPrevious();

		/**
		 * The meta object literal for the '<em><b>Copy Next Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_ELEMENT___COPY_NEXT_ELEMENTS = eINSTANCE.getSingleElement__CopyNextElements();

		/**
		 * The meta object literal for the '<em><b>Copy Next Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_ELEMENT___COPY_NEXT_ELEMENT__SINGLEELEMENT = eINSTANCE.getSingleElement__CopyNextElement__SingleElement();

		/**
		 * The meta object literal for the '<em><b>Remove Element From Previous Graphs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_ELEMENT___REMOVE_ELEMENT_FROM_PREVIOUS_GRAPHS = eINSTANCE.getSingleElement__RemoveElementFromPreviousGraphs();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.impl.SetElementImpl <em>Set Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.impl.SetElementImpl
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getSetElement()
		 * @generated
		 */
		EClass SET_ELEMENT = eINSTANCE.getSetElement();

		/**
		 * The meta object literal for the '<em><b>Nesting Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ELEMENT__NESTING_DEPTH = eINSTANCE.getSetElement_NestingDepth();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_ELEMENT__NEXT = eINSTANCE.getSetElement_Next();

		/**
		 * The meta object literal for the '<em><b>Previous Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_ELEMENT__PREVIOUS_SET = eINSTANCE.getSetElement_PreviousSet();

		/**
		 * The meta object literal for the '<em><b>Previous Single</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_ELEMENT__PREVIOUS_SINGLE = eINSTANCE.getSetElement_PreviousSingle();

		/**
		 * The meta object literal for the '<em><b>Being Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ELEMENT__BEING_TRANSLATED = eINSTANCE.getSetElement_BeingTranslated();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_ELEMENT__COUNT = eINSTANCE.getSetElement_Count();

		/**
		 * The meta object literal for the '<em><b>Translate Path From Previous</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SET_ELEMENT___TRANSLATE_PATH_FROM_PREVIOUS__INT = eINSTANCE.getSetElement__TranslatePathFromPrevious__int();

		/**
		 * The meta object literal for the '<em><b>Translate Predicates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SET_ELEMENT___TRANSLATE_PREDICATES__LOCATION_INT = eINSTANCE.getSetElement__TranslatePredicates__Location_int();

		/**
		 * The meta object literal for the '<em><b>Get Path To Previous Single Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SET_ELEMENT___GET_PATH_TO_PREVIOUS_SINGLE_ELEMENT = eINSTANCE.getSetElement__GetPathToPreviousSingleElement();

		/**
		 * The meta object literal for the '<em><b>Get All Argument Elements Set Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SET_ELEMENT___GET_ALL_ARGUMENT_ELEMENTS_SET_OPERATION = eINSTANCE.getSetElement__GetAllArgumentElementsSetOperation();

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
		 * The meta object literal for the '<em><b>Predicates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PREDICATES = eINSTANCE.getElement_Predicates();

		/**
		 * The meta object literal for the '<em><b>Relation From Previous</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__RELATION_FROM_PREVIOUS = eINSTANCE.getElement_RelationFromPrevious();

		/**
		 * The meta object literal for the '<em><b>Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TRANSLATED = eINSTANCE.getElement_Translated();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PROPERTIES = eINSTANCE.getElement_Properties();

		/**
		 * The meta object literal for the '<em><b>Predicates Are Being Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__PREDICATES_ARE_BEING_TRANSLATED = eINSTANCE.getElement_PredicatesAreBeingTranslated();

		/**
		 * The meta object literal for the '<em><b>Get All Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__GET_ALL_ELEMENTS = eINSTANCE.getElement_GetAllElements();

		/**
		 * The meta object literal for the '<em><b>Get All Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__GET_ALL_RELATIONS = eINSTANCE.getElement_GetAllRelations();

		/**
		 * The meta object literal for the '<em><b>Get Next Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_NEXT_ELEMENTS = eINSTANCE.getElement__GetNextElements();

		/**
		 * The meta object literal for the '<em><b>Get Previous Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_PREVIOUS_ELEMENT = eINSTANCE.getElement__GetPreviousElement();

		/**
		 * The meta object literal for the '<em><b>Get All Operators</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_ALL_OPERATORS = eINSTANCE.getElement__GetAllOperators();

		/**
		 * The meta object literal for the '<em><b>Get All Variables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_ALL_VARIABLES = eINSTANCE.getElement__GetAllVariables();

		/**
		 * The meta object literal for the '<em><b>Get XQuery Representation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION_INT = eINSTANCE.getElement__GetXQueryRepresentation__Location_int();

		/**
		 * The meta object literal for the '<em><b>Get Context Representation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_CONTEXT_REPRESENTATION__INT = eINSTANCE.getElement__GetContextRepresentation__int();

		/**
		 * The meta object literal for the '<em><b>Get Graph Depth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_GRAPH_DEPTH = eINSTANCE.getElement__GetGraphDepth();

		/**
		 * The meta object literal for the '<em><b>Translate Element Existence Predicates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___TRANSLATE_ELEMENT_EXISTENCE_PREDICATES__LOCATION_INT = eINSTANCE.getElement__TranslateElementExistencePredicates__Location_int();

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
		 * The meta object literal for the '<em><b>Return Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__RETURN_ELEMENTS = eINSTANCE.getGraph_ReturnElements();

		/**
		 * The meta object literal for the '<em><b>Root Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__ROOT_ELEMENT = eINSTANCE.getGraph_RootElement();

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
		 * The meta object literal for the '<em><b>Get All Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__GET_ALL_ELEMENTS = eINSTANCE.getGraph_GetAllElements();

		/**
		 * The meta object literal for the '<em><b>Get All Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__GET_ALL_RELATIONS = eINSTANCE.getGraph_GetAllRelations();

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
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.impl.GraphElementImpl <em>Graph Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.impl.GraphElementImpl
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getGraphElement()
		 * @generated
		 */
		EClass GRAPH_ELEMENT = eINSTANCE.getGraphElement();

		/**
		 * The meta object literal for the '<em><b>Comparison1</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_ELEMENT__COMPARISON1 = eINSTANCE.getGraphElement_Comparison1();

		/**
		 * The meta object literal for the '<em><b>Comparison2</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_ELEMENT__COMPARISON2 = eINSTANCE.getGraphElement_Comparison2();

		/**
		 * The meta object literal for the '<em><b>Get Return Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH_ELEMENT___GET_RETURN_TYPE = eINSTANCE.getGraphElement__GetReturnType();

		/**
		 * The meta object literal for the '<em><b>Is Translatable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH_ELEMENT___IS_TRANSLATABLE = eINSTANCE.getGraphElement__IsTranslatable();

		/**
		 * The meta object literal for the '<em><b>To XQuery</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH_ELEMENT___TO_XQUERY__LOCATION_INT = eINSTANCE.getGraphElement__ToXQuery__Location_int();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGraphElement__Validate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Get All Argument Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH_ELEMENT___GET_ALL_ARGUMENT_ELEMENTS = eINSTANCE.getGraphElement__GetAllArgumentElements();

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

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
	 * The feature id for the '<em><b>Graph Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__GRAPH_DEPTH = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 3;

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
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_ALL_VARIABLES = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___IS_VALID__BOOLEAN_INT = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get New Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_NEW_ID = PatternstructurePackage.PATTERN_ELEMENT___GET_NEW_ID;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

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
	 * The number of structural features of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___TO_XQUERY__LOCATION = PatternstructurePackage.PATTERN_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___GET_ALL_VARIABLES = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___IS_VALID__BOOLEAN_INT = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get New Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___GET_NEW_ID = PatternstructurePackage.PATTERN_ELEMENT___GET_NEW_ID;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

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
	 * The number of operations of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 3;

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
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_ALL_VARIABLES = GRAPH_ELEMENT___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_VALID__BOOLEAN_INT = GRAPH_ELEMENT___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get New Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_NEW_ID = GRAPH_ELEMENT___GET_NEW_ID;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___PREPARE_TRANSLATION = GRAPH_ELEMENT___PREPARE_TRANSLATION;

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
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PREDICATES = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation From Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RELATION_FROM_PREVIOUS = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TRANSLATED = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ROOT = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PROPERTIES = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PREDICATES_ARE_BEING_TRANSLATED = GRAPH_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___TO_XQUERY__LOCATION = GRAPH_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___IS_VALID__BOOLEAN_INT = GRAPH_ELEMENT___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get New Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_NEW_ID = GRAPH_ELEMENT___GET_NEW_ID;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___PREPARE_TRANSLATION = GRAPH_ELEMENT___PREPARE_TRANSLATION;

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
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 6;

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
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__PREDICATES = ELEMENT__PREDICATES;

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
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__ROOT = ELEMENT__ROOT;

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
	 * The feature id for the '<em><b>Mapping To</b></em>' reference.
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
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__PREVIOUS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__NEXT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__GRAPH_DEPTH = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Single Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___TO_XQUERY__LOCATION = ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___IS_VALID__BOOLEAN_INT = ELEMENT___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get New Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_NEW_ID = ELEMENT___GET_NEW_ID;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___PREPARE_TRANSLATION = ELEMENT___PREPARE_TRANSLATION;

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
	 * The number of operations of the '<em>Single Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 4;

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
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__PREDICATES = ELEMENT__PREDICATES;

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
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__ROOT = ELEMENT__ROOT;

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
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__NEXT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__PREVIOUS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nesting Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__NESTING_DEPTH = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Set Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___TO_XQUERY__LOCATION = ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___IS_VALID__BOOLEAN_INT = ELEMENT___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get New Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_NEW_ID = ELEMENT___GET_NEW_ID;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___PREPARE_TRANSLATION = ELEMENT___PREPARE_TRANSLATION;

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
	 * The operation id for the '<em>Translate Element Existence Predicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___TRANSLATE_ELEMENT_EXISTENCE_PREDICATES__LOCATION_INT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Translate Path From Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___TRANSLATE_PATH_FROM_PREVIOUS__INT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Translate Predicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___TRANSLATE_PREDICATES__LOCATION_INT = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 3;

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
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___TO_XQUERY__LOCATION = PatternstructurePackage.PATTERN_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ALL_VARIABLES = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___IS_VALID__BOOLEAN_INT = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get New Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_NEW_ID = PatternstructurePackage.PATTERN_ELEMENT___GET_NEW_ID;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get All Operators</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ALL_OPERATORS = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.impl.OperatorListImpl <em>Operator List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.impl.OperatorListImpl
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getOperatorList()
	 * @generated
	 */
	int OPERATOR_LIST = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST__ID = PatternstructurePackage.PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST__OPERATORS = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST__GRAPH = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operator List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST_FEATURE_COUNT = PatternstructurePackage.PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST___TO_XQUERY__LOCATION = PatternstructurePackage.PATTERN_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST___GET_ALL_VARIABLES = PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST___IS_VALID__BOOLEAN_INT = PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get New Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST___GET_NEW_ID = PatternstructurePackage.PATTERN_ELEMENT___GET_NEW_ID;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST___PREPARE_TRANSLATION = PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The number of operations of the '<em>Operator List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST_OPERATION_COUNT = PatternstructurePackage.PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.PropertyLocation <em>Property Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.PropertyLocation
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getPropertyLocation()
	 * @generated
	 */
	int PROPERTY_LOCATION = 8;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.Axis <em>Axis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Axis
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 9;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.graphstructure.ReturnType <em>Return Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.ReturnType
	 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 10;


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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Relation#getGraphDepth <em>Graph Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Depth</em>'.
	 * @see qualitypatternmodel.graphstructure.Relation#getGraphDepth()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_GraphDepth();

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
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.SingleElement#getMappingTo <em>Mapping To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping To</em>'.
	 * @see qualitypatternmodel.graphstructure.SingleElement#getMappingTo()
	 * @see #getSingleElement()
	 * @generated
	 */
	EReference getSingleElement_MappingTo();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.SingleElement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see qualitypatternmodel.graphstructure.SingleElement#getPrevious()
	 * @see #getSingleElement()
	 * @generated
	 */
	EReference getSingleElement_Previous();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.graphstructure.SingleElement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next</em>'.
	 * @see qualitypatternmodel.graphstructure.SingleElement#getNext()
	 * @see #getSingleElement()
	 * @generated
	 */
	EReference getSingleElement_Next();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.SingleElement#getGraphDepth <em>Graph Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Depth</em>'.
	 * @see qualitypatternmodel.graphstructure.SingleElement#getGraphDepth()
	 * @see #getSingleElement()
	 * @generated
	 */
	EAttribute getSingleElement_GraphDepth();

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
	 * Returns the meta object for class '{@link qualitypatternmodel.graphstructure.SetElement <em>Set Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Element</em>'.
	 * @see qualitypatternmodel.graphstructure.SetElement
	 * @generated
	 */
	EClass getSetElement();

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
	 * Returns the meta object for the reference '{@link qualitypatternmodel.graphstructure.SetElement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see qualitypatternmodel.graphstructure.SetElement#getPrevious()
	 * @see #getSetElement()
	 * @generated
	 */
	EReference getSetElement_Previous();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.SetElement#translateElementExistencePredicates(qualitypatternmodel.patternstructure.Location, int) <em>Translate Element Existence Predicates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Translate Element Existence Predicates</em>' operation.
	 * @see qualitypatternmodel.graphstructure.SetElement#translateElementExistencePredicates(qualitypatternmodel.patternstructure.Location, int)
	 * @generated
	 */
	EOperation getSetElement__TranslateElementExistencePredicates__Location_int();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.graphstructure.Element#isRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see qualitypatternmodel.graphstructure.Element#isRoot()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Root();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.graphstructure.Graph#getAllOperators() <em>Get All Operators</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Operators</em>' operation.
	 * @see qualitypatternmodel.graphstructure.Graph#getAllOperators()
	 * @generated
	 */
	EOperation getGraph__GetAllOperators();

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
	 * Returns the meta object for class '{@link qualitypatternmodel.graphstructure.OperatorList <em>Operator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator List</em>'.
	 * @see qualitypatternmodel.graphstructure.OperatorList
	 * @generated
	 */
	EClass getOperatorList();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.graphstructure.OperatorList#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operators</em>'.
	 * @see qualitypatternmodel.graphstructure.OperatorList#getOperators()
	 * @see #getOperatorList()
	 * @generated
	 */
	EReference getOperatorList_Operators();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.graphstructure.OperatorList#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see qualitypatternmodel.graphstructure.OperatorList#getGraph()
	 * @see #getOperatorList()
	 * @generated
	 */
	EReference getOperatorList_Graph();

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
		 * The meta object literal for the '<em><b>Graph Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__GRAPH_DEPTH = eINSTANCE.getRelation_GraphDepth();

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
		 * The meta object literal for the '<em><b>Mapping To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT__MAPPING_TO = eINSTANCE.getSingleElement_MappingTo();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT__PREVIOUS = eINSTANCE.getSingleElement_Previous();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT__NEXT = eINSTANCE.getSingleElement_Next();

		/**
		 * The meta object literal for the '<em><b>Graph Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_ELEMENT__GRAPH_DEPTH = eINSTANCE.getSingleElement_GraphDepth();

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
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.impl.SetElementImpl <em>Set Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.impl.SetElementImpl
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getSetElement()
		 * @generated
		 */
		EClass SET_ELEMENT = eINSTANCE.getSetElement();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_ELEMENT__NEXT = eINSTANCE.getSetElement_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_ELEMENT__PREVIOUS = eINSTANCE.getSetElement_Previous();

		/**
		 * The meta object literal for the '<em><b>Nesting Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ELEMENT__NESTING_DEPTH = eINSTANCE.getSetElement_NestingDepth();

		/**
		 * The meta object literal for the '<em><b>Translate Element Existence Predicates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SET_ELEMENT___TRANSLATE_ELEMENT_EXISTENCE_PREDICATES__LOCATION_INT = eINSTANCE.getSetElement__TranslateElementExistencePredicates__Location_int();

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
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ROOT = eINSTANCE.getElement_Root();

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
		 * The meta object literal for the '<em><b>Get All Operators</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_ALL_OPERATORS = eINSTANCE.getGraph__GetAllOperators();

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
		 * The meta object literal for the '{@link qualitypatternmodel.graphstructure.impl.OperatorListImpl <em>Operator List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.graphstructure.impl.OperatorListImpl
		 * @see qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl#getOperatorList()
		 * @generated
		 */
		EClass OPERATOR_LIST = eINSTANCE.getOperatorList();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_LIST__OPERATORS = eINSTANCE.getOperatorList_Operators();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_LIST__GRAPH = eINSTANCE.getOperatorList_Graph();

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

	}

} //GraphstructurePackage

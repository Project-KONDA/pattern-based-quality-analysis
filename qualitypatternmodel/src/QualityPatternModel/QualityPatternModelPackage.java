/**
 */
package QualityPatternModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see QualityPatternModel.QualityPatternModelFactory
 * @model kind="package"
 * @generated
 */
public interface QualityPatternModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "QualityPatternModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "qualitypatternmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qualitypatternmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QualityPatternModelPackage eINSTANCE = QualityPatternModel.impl.QualityPatternModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.PatternImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__RETURN = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.ConditionImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.QuantifiedConditionImpl <em>Quantified Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.QuantifiedConditionImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getQuantifiedCondition()
	 * @generated
	 */
	int QUANTIFIED_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__CONDITION = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__GRAPH = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Morphism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__MORPHISM = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__QUANTIFIER = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Quantified Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Quantified Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.FormulaImpl <em>Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.FormulaImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getFormula()
	 * @generated
	 */
	int FORMULA = 3;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__ARGUMENTS = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__OPERATOR = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.TrueImpl <em>True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.TrueImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getTrue()
	 * @generated
	 */
	int TRUE = 4;

	/**
	 * The number of structural features of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.GraphImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 5;

	/**
	 * The feature id for the '<em><b>Return</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__RETURN = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ROOT = 1;

	/**
	 * The feature id for the '<em><b>Variablelist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__VARIABLELIST = 2;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.GraphElementImpl <em>Graph Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.GraphElementImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getGraphElement()
	 * @generated
	 */
	int GRAPH_ELEMENT = 17;

	/**
	 * The number of structural features of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.ElementImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Element Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENT_CONDITIONS = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RELATION_TO = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.SetElementImpl <em>Set Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.SetElementImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getSetElement()
	 * @generated
	 */
	int SET_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Element Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__ELEMENT_CONDITIONS = ELEMENT__ELEMENT_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Relation To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__RELATION_TO = ELEMENT__RELATION_TO;

	/**
	 * The number of structural features of the '<em>Set Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Set Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.SingleElementImpl <em>Single Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.SingleElementImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getSingleElement()
	 * @generated
	 */
	int SINGLE_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Element Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__ELEMENT_CONDITIONS = ELEMENT__ELEMENT_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Relation To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__RELATION_TO = ELEMENT__RELATION_TO;

	/**
	 * The feature id for the '<em><b>Relation From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__RELATION_FROM = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__MAPPING_FROM = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Single Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.PropertyImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ELEMENT = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ATTRIBUTE_NAME = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOCATION = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY_OPTIONS = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.OperatorImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 10;

	/**
	 * The feature id for the '<em><b>Operator Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OPERATOR_OPTIONS = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.BooleanOperatorImpl <em>Boolean Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.BooleanOperatorImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 11;

	/**
	 * The feature id for the '<em><b>Operator Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__OPERATOR_OPTIONS = OPERATOR__OPERATOR_OPTIONS;

	/**
	 * The number of structural features of the '<em>Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.InputImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 12;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.TextImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 13;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.NumberImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 14;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.BooleanImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 15;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.OptionImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 16;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.MappingImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 18;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.MorphismImpl <em>Morphism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.MorphismImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getMorphism()
	 * @generated
	 */
	int MORPHISM = 19;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__MAPPING = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__TO = 2;

	/**
	 * The number of structural features of the '<em>Morphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Morphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.VariableListImpl <em>Variable List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.VariableListImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getVariableList()
	 * @generated
	 */
	int VARIABLE_LIST = 20;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LIST__VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Variable List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Variable List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.RelationImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 21;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__AXIS = 0;

	/**
	 * The feature id for the '<em><b>Element From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ELEMENT_FROM = 1;

	/**
	 * The feature id for the '<em><b>Element To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ELEMENT_TO = 2;

	/**
	 * The feature id for the '<em><b>Relation Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__RELATION_OPTIONS = 3;

	/**
	 * The feature id for the '<em><b>Mapping To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MAPPING_TO = 4;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.ComparisonImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 22;

	/**
	 * The feature id for the '<em><b>Operator Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__OPERATOR_OPTIONS = BOOLEAN_OPERATOR__OPERATOR_OPTIONS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__OPERATOR = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__ARGUMENTS = BOOLEAN_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.MatchImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 23;

	/**
	 * The feature id for the '<em><b>Operator Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__OPERATOR_OPTIONS = BOOLEAN_OPERATOR__OPERATOR_OPTIONS;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__PROPERTY = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__INPUT = BOOLEAN_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.OtterOperatorsImpl <em>Otter Operators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.OtterOperatorsImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getOtterOperators()
	 * @generated
	 */
	int OTTER_OPERATORS = 24;

	/**
	 * The feature id for the '<em><b>Operator Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTTER_OPERATORS__OPERATOR_OPTIONS = OPERATOR__OPERATOR_OPTIONS;

	/**
	 * The number of structural features of the '<em>Otter Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTTER_OPERATORS_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Otter Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTTER_OPERATORS_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.SingleElementMappingImpl <em>Single Element Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.SingleElementMappingImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getSingleElementMapping()
	 * @generated
	 */
	int SINGLE_ELEMENT_MAPPING = 25;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING__FROM = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.RelationMappingImpl <em>Relation Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.RelationMappingImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getRelationMapping()
	 * @generated
	 */
	int RELATION_MAPPING = 26;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING__TO = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.Axis <em>Axis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.Axis
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 27;

	/**
	 * The meta object id for the '{@link QualityPatternModel.Location <em>Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.Location
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 28;

	/**
	 * The meta object id for the '{@link QualityPatternModel.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.LogicalOperator
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 29;

	/**
	 * The meta object id for the '{@link QualityPatternModel.Quantifier <em>Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.Quantifier
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getQuantifier()
	 * @generated
	 */
	int QUANTIFIER = 30;

	/**
	 * The meta object id for the '{@link QualityPatternModel.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.ComparisonOperator
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 31;


	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see QualityPatternModel.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the containment reference '{@link QualityPatternModel.Pattern#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see QualityPatternModel.Pattern#getReturn()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Return();

	/**
	 * Returns the meta object for the containment reference '{@link QualityPatternModel.Pattern#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see QualityPatternModel.Pattern#getCondition()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Condition();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see QualityPatternModel.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.QuantifiedCondition <em>Quantified Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantified Condition</em>'.
	 * @see QualityPatternModel.QuantifiedCondition
	 * @generated
	 */
	EClass getQuantifiedCondition();

	/**
	 * Returns the meta object for the containment reference '{@link QualityPatternModel.QuantifiedCondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see QualityPatternModel.QuantifiedCondition#getCondition()
	 * @see #getQuantifiedCondition()
	 * @generated
	 */
	EReference getQuantifiedCondition_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link QualityPatternModel.QuantifiedCondition#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graph</em>'.
	 * @see QualityPatternModel.QuantifiedCondition#getGraph()
	 * @see #getQuantifiedCondition()
	 * @generated
	 */
	EReference getQuantifiedCondition_Graph();

	/**
	 * Returns the meta object for the containment reference '{@link QualityPatternModel.QuantifiedCondition#getMorphism <em>Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Morphism</em>'.
	 * @see QualityPatternModel.QuantifiedCondition#getMorphism()
	 * @see #getQuantifiedCondition()
	 * @generated
	 */
	EReference getQuantifiedCondition_Morphism();

	/**
	 * Returns the meta object for the attribute '{@link QualityPatternModel.QuantifiedCondition#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier</em>'.
	 * @see QualityPatternModel.QuantifiedCondition#getQuantifier()
	 * @see #getQuantifiedCondition()
	 * @generated
	 */
	EAttribute getQuantifiedCondition_Quantifier();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see QualityPatternModel.Formula
	 * @generated
	 */
	EClass getFormula();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityPatternModel.Formula#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see QualityPatternModel.Formula#getArguments()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link QualityPatternModel.Formula#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see QualityPatternModel.Formula#getOperator()
	 * @see #getFormula()
	 * @generated
	 */
	EAttribute getFormula_Operator();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True</em>'.
	 * @see QualityPatternModel.True
	 * @generated
	 */
	EClass getTrue();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see QualityPatternModel.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the reference list '{@link QualityPatternModel.Graph#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Return</em>'.
	 * @see QualityPatternModel.Graph#getReturn()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Return();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Graph#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see QualityPatternModel.Graph#getRoot()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Root();

	/**
	 * Returns the meta object for the containment reference '{@link QualityPatternModel.Graph#getVariablelist <em>Variablelist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variablelist</em>'.
	 * @see QualityPatternModel.Graph#getVariablelist()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Variablelist();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see QualityPatternModel.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference list '{@link QualityPatternModel.Element#getElementConditions <em>Element Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Conditions</em>'.
	 * @see QualityPatternModel.Element#getElementConditions()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ElementConditions();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Element#getRelationTo <em>Relation To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation To</em>'.
	 * @see QualityPatternModel.Element#getRelationTo()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_RelationTo();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.SetElement <em>Set Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Element</em>'.
	 * @see QualityPatternModel.SetElement
	 * @generated
	 */
	EClass getSetElement();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.SingleElement <em>Single Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Element</em>'.
	 * @see QualityPatternModel.SingleElement
	 * @generated
	 */
	EClass getSingleElement();

	/**
	 * Returns the meta object for the reference list '{@link QualityPatternModel.SingleElement#getRelationFrom <em>Relation From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relation From</em>'.
	 * @see QualityPatternModel.SingleElement#getRelationFrom()
	 * @see #getSingleElement()
	 * @generated
	 */
	EReference getSingleElement_RelationFrom();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.SingleElement#getMappingFrom <em>Mapping From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping From</em>'.
	 * @see QualityPatternModel.SingleElement#getMappingFrom()
	 * @see #getSingleElement()
	 * @generated
	 */
	EReference getSingleElement_MappingFrom();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see QualityPatternModel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Property#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see QualityPatternModel.Property#getElement()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Element();

	/**
	 * Returns the meta object for the attribute '{@link QualityPatternModel.Property#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see QualityPatternModel.Property#getAttributeName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link QualityPatternModel.Property#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see QualityPatternModel.Property#getLocation()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Location();

	/**
	 * Returns the meta object for the reference list '{@link QualityPatternModel.Property#getPropertyOptions <em>Property Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property Options</em>'.
	 * @see QualityPatternModel.Property#getPropertyOptions()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_PropertyOptions();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see QualityPatternModel.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the reference list '{@link QualityPatternModel.Operator#getOperatorOptions <em>Operator Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operator Options</em>'.
	 * @see QualityPatternModel.Operator#getOperatorOptions()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_OperatorOptions();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operator</em>'.
	 * @see QualityPatternModel.BooleanOperator
	 * @generated
	 */
	EClass getBooleanOperator();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see QualityPatternModel.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see QualityPatternModel.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see QualityPatternModel.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see QualityPatternModel.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see QualityPatternModel.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.GraphElement <em>Graph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Element</em>'.
	 * @see QualityPatternModel.GraphElement
	 * @generated
	 */
	EClass getGraphElement();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see QualityPatternModel.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Morphism <em>Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Morphism</em>'.
	 * @see QualityPatternModel.Morphism
	 * @generated
	 */
	EClass getMorphism();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityPatternModel.Morphism#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping</em>'.
	 * @see QualityPatternModel.Morphism#getMapping()
	 * @see #getMorphism()
	 * @generated
	 */
	EReference getMorphism_Mapping();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Morphism#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see QualityPatternModel.Morphism#getFrom()
	 * @see #getMorphism()
	 * @generated
	 */
	EReference getMorphism_From();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Morphism#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see QualityPatternModel.Morphism#getTo()
	 * @see #getMorphism()
	 * @generated
	 */
	EReference getMorphism_To();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.VariableList <em>Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable List</em>'.
	 * @see QualityPatternModel.VariableList
	 * @generated
	 */
	EClass getVariableList();

	/**
	 * Returns the meta object for the reference list '{@link QualityPatternModel.VariableList#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see QualityPatternModel.VariableList#getVariables()
	 * @see #getVariableList()
	 * @generated
	 */
	EReference getVariableList_Variables();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see QualityPatternModel.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link QualityPatternModel.Relation#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see QualityPatternModel.Relation#getAxis()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Axis();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Relation#getElementFrom <em>Element From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element From</em>'.
	 * @see QualityPatternModel.Relation#getElementFrom()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_ElementFrom();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Relation#getElementTo <em>Element To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element To</em>'.
	 * @see QualityPatternModel.Relation#getElementTo()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_ElementTo();

	/**
	 * Returns the meta object for the reference list '{@link QualityPatternModel.Relation#getRelationOptions <em>Relation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relation Options</em>'.
	 * @see QualityPatternModel.Relation#getRelationOptions()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_RelationOptions();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Relation#getMappingTo <em>Mapping To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping To</em>'.
	 * @see QualityPatternModel.Relation#getMappingTo()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_MappingTo();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see QualityPatternModel.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for the attribute '{@link QualityPatternModel.Comparison#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see QualityPatternModel.Comparison#getOperator()
	 * @see #getComparison()
	 * @generated
	 */
	EAttribute getComparison_Operator();

	/**
	 * Returns the meta object for the reference list '{@link QualityPatternModel.Comparison#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arguments</em>'.
	 * @see QualityPatternModel.Comparison#getArguments()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_Arguments();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see QualityPatternModel.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Match#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see QualityPatternModel.Match#getProperty()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Property();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Match#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see QualityPatternModel.Match#getInput()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Input();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.OtterOperators <em>Otter Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Otter Operators</em>'.
	 * @see QualityPatternModel.OtterOperators
	 * @generated
	 */
	EClass getOtterOperators();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.SingleElementMapping <em>Single Element Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Element Mapping</em>'.
	 * @see QualityPatternModel.SingleElementMapping
	 * @generated
	 */
	EClass getSingleElementMapping();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.SingleElementMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see QualityPatternModel.SingleElementMapping#getFrom()
	 * @see #getSingleElementMapping()
	 * @generated
	 */
	EReference getSingleElementMapping_From();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.RelationMapping <em>Relation Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Mapping</em>'.
	 * @see QualityPatternModel.RelationMapping
	 * @generated
	 */
	EClass getRelationMapping();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.RelationMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see QualityPatternModel.RelationMapping#getTo()
	 * @see #getRelationMapping()
	 * @generated
	 */
	EReference getRelationMapping_To();

	/**
	 * Returns the meta object for enum '{@link QualityPatternModel.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Axis</em>'.
	 * @see QualityPatternModel.Axis
	 * @generated
	 */
	EEnum getAxis();

	/**
	 * Returns the meta object for enum '{@link QualityPatternModel.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location</em>'.
	 * @see QualityPatternModel.Location
	 * @generated
	 */
	EEnum getLocation();

	/**
	 * Returns the meta object for enum '{@link QualityPatternModel.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see QualityPatternModel.LogicalOperator
	 * @generated
	 */
	EEnum getLogicalOperator();

	/**
	 * Returns the meta object for enum '{@link QualityPatternModel.Quantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantifier</em>'.
	 * @see QualityPatternModel.Quantifier
	 * @generated
	 */
	EEnum getQuantifier();

	/**
	 * Returns the meta object for enum '{@link QualityPatternModel.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see QualityPatternModel.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QualityPatternModelFactory getQualityPatternModelFactory();

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
		 * The meta object literal for the '{@link QualityPatternModel.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.PatternImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__RETURN = eINSTANCE.getPattern_Return();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__CONDITION = eINSTANCE.getPattern_Condition();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.ConditionImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.QuantifiedConditionImpl <em>Quantified Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.QuantifiedConditionImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getQuantifiedCondition()
		 * @generated
		 */
		EClass QUANTIFIED_CONDITION = eINSTANCE.getQuantifiedCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIED_CONDITION__CONDITION = eINSTANCE.getQuantifiedCondition_Condition();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIED_CONDITION__GRAPH = eINSTANCE.getQuantifiedCondition_Graph();

		/**
		 * The meta object literal for the '<em><b>Morphism</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIED_CONDITION__MORPHISM = eINSTANCE.getQuantifiedCondition_Morphism();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIED_CONDITION__QUANTIFIER = eINSTANCE.getQuantifiedCondition_Quantifier();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.FormulaImpl <em>Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.FormulaImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getFormula()
		 * @generated
		 */
		EClass FORMULA = eINSTANCE.getFormula();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__ARGUMENTS = eINSTANCE.getFormula_Arguments();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULA__OPERATOR = eINSTANCE.getFormula_Operator();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.TrueImpl <em>True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.TrueImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getTrue()
		 * @generated
		 */
		EClass TRUE = eINSTANCE.getTrue();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.GraphImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__RETURN = eINSTANCE.getGraph_Return();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__ROOT = eINSTANCE.getGraph_Root();

		/**
		 * The meta object literal for the '<em><b>Variablelist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__VARIABLELIST = eINSTANCE.getGraph_Variablelist();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.ElementImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Element Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ELEMENT_CONDITIONS = eINSTANCE.getElement_ElementConditions();

		/**
		 * The meta object literal for the '<em><b>Relation To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__RELATION_TO = eINSTANCE.getElement_RelationTo();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.SetElementImpl <em>Set Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.SetElementImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getSetElement()
		 * @generated
		 */
		EClass SET_ELEMENT = eINSTANCE.getSetElement();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.SingleElementImpl <em>Single Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.SingleElementImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getSingleElement()
		 * @generated
		 */
		EClass SINGLE_ELEMENT = eINSTANCE.getSingleElement();

		/**
		 * The meta object literal for the '<em><b>Relation From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT__RELATION_FROM = eINSTANCE.getSingleElement_RelationFrom();

		/**
		 * The meta object literal for the '<em><b>Mapping From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT__MAPPING_FROM = eINSTANCE.getSingleElement_MappingFrom();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.PropertyImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ELEMENT = eINSTANCE.getProperty_Element();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__ATTRIBUTE_NAME = eINSTANCE.getProperty_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__LOCATION = eINSTANCE.getProperty_Location();

		/**
		 * The meta object literal for the '<em><b>Property Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PROPERTY_OPTIONS = eINSTANCE.getProperty_PropertyOptions();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.OperatorImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Operator Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__OPERATOR_OPTIONS = eINSTANCE.getOperator_OperatorOptions();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.BooleanOperatorImpl <em>Boolean Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.BooleanOperatorImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EClass BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.InputImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.TextImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.NumberImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.BooleanImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.OptionImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.GraphElementImpl <em>Graph Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.GraphElementImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getGraphElement()
		 * @generated
		 */
		EClass GRAPH_ELEMENT = eINSTANCE.getGraphElement();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.MappingImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.MorphismImpl <em>Morphism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.MorphismImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getMorphism()
		 * @generated
		 */
		EClass MORPHISM = eINSTANCE.getMorphism();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MORPHISM__MAPPING = eINSTANCE.getMorphism_Mapping();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MORPHISM__FROM = eINSTANCE.getMorphism_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MORPHISM__TO = eINSTANCE.getMorphism_To();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.VariableListImpl <em>Variable List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.VariableListImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getVariableList()
		 * @generated
		 */
		EClass VARIABLE_LIST = eINSTANCE.getVariableList();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_LIST__VARIABLES = eINSTANCE.getVariableList_Variables();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.RelationImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__AXIS = eINSTANCE.getRelation_Axis();

		/**
		 * The meta object literal for the '<em><b>Element From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ELEMENT_FROM = eINSTANCE.getRelation_ElementFrom();

		/**
		 * The meta object literal for the '<em><b>Element To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ELEMENT_TO = eINSTANCE.getRelation_ElementTo();

		/**
		 * The meta object literal for the '<em><b>Relation Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__RELATION_OPTIONS = eINSTANCE.getRelation_RelationOptions();

		/**
		 * The meta object literal for the '<em><b>Mapping To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__MAPPING_TO = eINSTANCE.getRelation_MappingTo();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.ComparisonImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__OPERATOR = eINSTANCE.getComparison_Operator();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__ARGUMENTS = eINSTANCE.getComparison_Arguments();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.MatchImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__PROPERTY = eINSTANCE.getMatch_Property();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__INPUT = eINSTANCE.getMatch_Input();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.OtterOperatorsImpl <em>Otter Operators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.OtterOperatorsImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getOtterOperators()
		 * @generated
		 */
		EClass OTTER_OPERATORS = eINSTANCE.getOtterOperators();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.SingleElementMappingImpl <em>Single Element Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.SingleElementMappingImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getSingleElementMapping()
		 * @generated
		 */
		EClass SINGLE_ELEMENT_MAPPING = eINSTANCE.getSingleElementMapping();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT_MAPPING__FROM = eINSTANCE.getSingleElementMapping_From();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.RelationMappingImpl <em>Relation Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.RelationMappingImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getRelationMapping()
		 * @generated
		 */
		EClass RELATION_MAPPING = eINSTANCE.getRelationMapping();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_MAPPING__TO = eINSTANCE.getRelationMapping_To();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.Axis <em>Axis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.Axis
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getAxis()
		 * @generated
		 */
		EEnum AXIS = eINSTANCE.getAxis();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.Location <em>Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.Location
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getLocation()
		 * @generated
		 */
		EEnum LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.LogicalOperator
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.Quantifier <em>Quantifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.Quantifier
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getQuantifier()
		 * @generated
		 */
		EEnum QUANTIFIER = eINSTANCE.getQuantifier();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.ComparisonOperator
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

	}

} //QualityPatternModelPackage

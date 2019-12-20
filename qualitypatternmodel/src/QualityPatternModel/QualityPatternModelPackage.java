/**
 */
package QualityPatternModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
	 * The meta object id for the '{@link QualityPatternModel.impl.PatternElementImpl <em>Pattern Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.PatternElementImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getPatternElement()
	 * @generated
	 */
	int PATTERN_ELEMENT = 27;

	/**
	 * The number of structural features of the '<em>Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___IS_VALID = 0;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION = 1;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = 2;

	/**
	 * The number of operations of the '<em>Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT_OPERATION_COUNT = 3;

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
	 * The feature id for the '<em><b>Return Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__RETURN_GRAPH = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__CONDITION = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___IS_VALID = PATTERN_ELEMENT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___TO_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 0;

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
	int CONDITION_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___IS_VALID = PATTERN_ELEMENT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___TO_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 0;

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
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___IS_VALID = CONDITION___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___TO_XQUERY__TRANSLATIONLOCATION = CONDITION___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = CONDITION___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

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
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___IS_VALID = CONDITION___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___TO_XQUERY__TRANSLATIONLOCATION = CONDITION___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = CONDITION___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

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
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE___IS_VALID = CONDITION___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE___TO_XQUERY__TRANSLATIONLOCATION = CONDITION___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = CONDITION___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

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
	 * The feature id for the '<em><b>Return Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__RETURN_ELEMENT = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ROOT_ELEMENT = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__VARIABLE_LIST = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___IS_VALID = PATTERN_ELEMENT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___TO_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 0;

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
	int GRAPH_ELEMENT_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___IS_VALID = PATTERN_ELEMENT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT___GET_RETURN_TYPE = PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PREDICATES = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation From Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RELATION_FROM_PREVIOUS = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_TRANSLATED = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___IS_VALID = GRAPH_ELEMENT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___TO_XQUERY__TRANSLATIONLOCATION = GRAPH_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = GRAPH_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_RETURN_TYPE = GRAPH_ELEMENT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Generate XPredicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GENERATE_XPREDICATES = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate XPath Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GENERATE_XPATH_EXPRESSION = GRAPH_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Next Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_NEXT_ELEMENTS = GRAPH_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Previous Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_PREVIOUS_ELEMENT = GRAPH_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 4;

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
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__PREDICATES = ELEMENT__PREDICATES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Relation From Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__RELATION_FROM_PREVIOUS = ELEMENT__RELATION_FROM_PREVIOUS;

	/**
	 * The feature id for the '<em><b>Is Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__IS_TRANSLATED = ELEMENT__IS_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
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
	 * The number of structural features of the '<em>Set Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___IS_VALID = ELEMENT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION = ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GET_RETURN_TYPE = ELEMENT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Generate XPredicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GENERATE_XPREDICATES = ELEMENT___GENERATE_XPREDICATES;

	/**
	 * The operation id for the '<em>Generate XPath Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT___GENERATE_XPATH_EXPRESSION = ELEMENT___GENERATE_XPATH_EXPRESSION;

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
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__PREDICATES = ELEMENT__PREDICATES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Relation From Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__RELATION_FROM_PREVIOUS = ELEMENT__RELATION_FROM_PREVIOUS;

	/**
	 * The feature id for the '<em><b>Is Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__IS_TRANSLATED = ELEMENT__IS_TRANSLATED;

	/**
	 * The feature id for the '<em><b>Mapping From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__MAPPING_FROM = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__MAPPING_TO = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__PREVIOUS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT__NEXT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Single Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___IS_VALID = ELEMENT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION = ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GET_RETURN_TYPE = ELEMENT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Generate XPredicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GENERATE_XPREDICATES = ELEMENT___GENERATE_XPREDICATES;

	/**
	 * The operation id for the '<em>Generate XPath Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT___GENERATE_XPATH_EXPRESSION = ELEMENT___GENERATE_XPATH_EXPRESSION;

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
	 * The feature id for the '<em><b>Property Options</b></em>' reference.
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
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_VALID = GRAPH_ELEMENT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___TO_XQUERY__TRANSLATIONLOCATION = GRAPH_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = GRAPH_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_RETURN_TYPE = GRAPH_ELEMENT___GET_RETURN_TYPE;

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
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___IS_VALID = GRAPH_ELEMENT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___TO_XQUERY__TRANSLATIONLOCATION = GRAPH_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = GRAPH_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_RETURN_TYPE = GRAPH_ELEMENT___GET_RETURN_TYPE;

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
	 * The number of structural features of the '<em>Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___IS_VALID = OPERATOR___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___TO_XQUERY__TRANSLATIONLOCATION = OPERATOR___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = OPERATOR___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___GET_RETURN_TYPE = OPERATOR___GET_RETURN_TYPE;

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
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___IS_VALID = GRAPH_ELEMENT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___TO_XQUERY__TRANSLATIONLOCATION = GRAPH_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = GRAPH_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___GET_RETURN_TYPE = GRAPH_ELEMENT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___INPUT_IS_VALID = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___IS_VALID = INPUT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___TO_XQUERY__TRANSLATIONLOCATION = INPUT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = INPUT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___GET_RETURN_TYPE = INPUT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___INPUT_IS_VALID = INPUT___INPUT_IS_VALID;

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
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__NUMBER = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER___IS_VALID = INPUT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER___TO_XQUERY__TRANSLATIONLOCATION = INPUT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = INPUT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER___GET_RETURN_TYPE = INPUT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER___INPUT_IS_VALID = INPUT___INPUT_IS_VALID;

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
	 * The feature id for the '<em><b>Bool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__BOOL = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___IS_VALID = INPUT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___TO_XQUERY__TRANSLATIONLOCATION = INPUT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = INPUT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___GET_RETURN_TYPE = INPUT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___INPUT_IS_VALID = INPUT___INPUT_IS_VALID;

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
	 * The feature id for the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__OPTIONS = INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__SELECTION = INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = INPUT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___IS_VALID = INPUT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___TO_XQUERY__TRANSLATIONLOCATION = INPUT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = INPUT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___GET_RETURN_TYPE = INPUT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___INPUT_IS_VALID = INPUT___INPUT_IS_VALID;

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
	int MAPPING_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___IS_VALID = PATTERN_ELEMENT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___TO_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 0;

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
	int MORPHISM__MAPPING = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__FROM = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__TO = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Morphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___IS_VALID = PATTERN_ELEMENT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___TO_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The number of operations of the '<em>Morphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 0;

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
	int RELATION__AXIS = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation Options</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__RELATION_OPTIONS = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mapping To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MAPPING_TO = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mapping From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MAPPING_FROM = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___IS_VALID = PATTERN_ELEMENT___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___TO_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__OPERATOR = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__ARGUMENT1 = BOOLEAN_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__OPTIONS = BOOLEAN_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Argument2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__ARGUMENT2 = BOOLEAN_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___IS_VALID = BOOLEAN_OPERATOR___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___TO_XQUERY__TRANSLATIONLOCATION = BOOLEAN_OPERATOR___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = BOOLEAN_OPERATOR___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___GET_RETURN_TYPE = BOOLEAN_OPERATOR___GET_RETURN_TYPE;

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
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__PROPERTY = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regular Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__REGULAR_EXPRESSION = BOOLEAN_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Negate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__NEGATE = BOOLEAN_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__OPTIONS = BOOLEAN_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___IS_VALID = BOOLEAN_OPERATOR___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___TO_XQUERY__TRANSLATIONLOCATION = BOOLEAN_OPERATOR___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = BOOLEAN_OPERATOR___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH___GET_RETURN_TYPE = BOOLEAN_OPERATOR___GET_RETURN_TYPE;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.NumberOperatorsImpl <em>Number Operators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.NumberOperatorsImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getNumberOperators()
	 * @generated
	 */
	int NUMBER_OPERATORS = 24;

	/**
	 * The number of structural features of the '<em>Number Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATORS_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATORS___IS_VALID = OPERATOR___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATORS___TO_XQUERY__TRANSLATIONLOCATION = OPERATOR___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATORS___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = OPERATOR___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATORS___GET_RETURN_TYPE = OPERATOR___GET_RETURN_TYPE;

	/**
	 * The number of operations of the '<em>Number Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATORS_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.OtherOperatorsImpl <em>Other Operators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.OtherOperatorsImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getOtherOperators()
	 * @generated
	 */
	int OTHER_OPERATORS = 29;

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
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING__TO = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING___IS_VALID = MAPPING___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING___TO_XQUERY__TRANSLATIONLOCATION = MAPPING___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = MAPPING___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

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
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING__FROM = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___IS_VALID = MAPPING___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___TO_XQUERY__TRANSLATIONLOCATION = MAPPING___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = MAPPING___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The number of operations of the '<em>Relation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.CountImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 28;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ARGUMENT = NUMBER_OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = NUMBER_OPERATORS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT___IS_VALID = NUMBER_OPERATORS___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT___TO_XQUERY__TRANSLATIONLOCATION = NUMBER_OPERATORS___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = NUMBER_OPERATORS___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT___GET_RETURN_TYPE = NUMBER_OPERATORS___GET_RETURN_TYPE;

	/**
	 * The number of operations of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OPERATION_COUNT = NUMBER_OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Other Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATORS_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATORS___IS_VALID = OPERATOR___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATORS___TO_XQUERY__TRANSLATIONLOCATION = OPERATOR___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATORS___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = OPERATOR___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATORS___GET_RETURN_TYPE = OPERATOR___GET_RETURN_TYPE;

	/**
	 * The number of operations of the '<em>Other Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATORS_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.impl.ToNumberImpl <em>To Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.ToNumberImpl
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getToNumber()
	 * @generated
	 */
	int TO_NUMBER = 30;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER__PROPERTY = NUMBER_OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER_FEATURE_COUNT = NUMBER_OPERATORS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER___IS_VALID = NUMBER_OPERATORS___IS_VALID;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER___TO_XQUERY__TRANSLATIONLOCATION = NUMBER_OPERATORS___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>To Local XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = NUMBER_OPERATORS___TO_LOCAL_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER___GET_RETURN_TYPE = NUMBER_OPERATORS___GET_RETURN_TYPE;

	/**
	 * The number of operations of the '<em>To Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_NUMBER_OPERATION_COUNT = NUMBER_OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityPatternModel.Axis <em>Axis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.Axis
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 31;

	/**
	 * The meta object id for the '{@link QualityPatternModel.PropertyLocation <em>Property Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.PropertyLocation
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getPropertyLocation()
	 * @generated
	 */
	int PROPERTY_LOCATION = 32;

	/**
	 * The meta object id for the '{@link QualityPatternModel.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.LogicalOperator
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 33;

	/**
	 * The meta object id for the '{@link QualityPatternModel.Quantifier <em>Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.Quantifier
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getQuantifier()
	 * @generated
	 */
	int QUANTIFIER = 34;

	/**
	 * The meta object id for the '{@link QualityPatternModel.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.ComparisonOperator
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 35;


	/**
	 * The meta object id for the '{@link QualityPatternModel.ReturnType <em>Return Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.ReturnType
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 36;


	/**
	 * The meta object id for the '{@link QualityPatternModel.TranslationLocation <em>Translation Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.TranslationLocation
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getTranslationLocation()
	 * @generated
	 */
	int TRANSLATION_LOCATION = 37;

	/**
	 * The meta object id for the '<em>Invalid Translation Exception Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityPatternModel.impl.InvalidTranslationException
	 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getInvalidTranslationExceptionWrapper()
	 * @generated
	 */
	int INVALID_TRANSLATION_EXCEPTION_WRAPPER = 38;

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
	 * Returns the meta object for the containment reference '{@link QualityPatternModel.Pattern#getReturnGraph <em>Return Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Graph</em>'.
	 * @see QualityPatternModel.Pattern#getReturnGraph()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_ReturnGraph();

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
	 * Returns the meta object for the reference list '{@link QualityPatternModel.Graph#getReturnElement <em>Return Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Return Element</em>'.
	 * @see QualityPatternModel.Graph#getReturnElement()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_ReturnElement();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Graph#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Element</em>'.
	 * @see QualityPatternModel.Graph#getRootElement()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_RootElement();

	/**
	 * Returns the meta object for the containment reference '{@link QualityPatternModel.Graph#getVariableList <em>Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable List</em>'.
	 * @see QualityPatternModel.Graph#getVariableList()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_VariableList();

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
	 * Returns the meta object for the reference list '{@link QualityPatternModel.Element#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predicates</em>'.
	 * @see QualityPatternModel.Element#getPredicates()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Predicates();

	/**
	 * Returns the meta object for the attribute '{@link QualityPatternModel.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see QualityPatternModel.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Element#getRelationFromPrevious <em>Relation From Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation From Previous</em>'.
	 * @see QualityPatternModel.Element#getRelationFromPrevious()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_RelationFromPrevious();

	/**
	 * Returns the meta object for the attribute '{@link QualityPatternModel.Element#isIsTranslated <em>Is Translated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Translated</em>'.
	 * @see QualityPatternModel.Element#isIsTranslated()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsTranslated();

	/**
	 * Returns the meta object for the '{@link QualityPatternModel.Element#generateXPredicates() <em>Generate XPredicates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate XPredicates</em>' operation.
	 * @see QualityPatternModel.Element#generateXPredicates()
	 * @generated
	 */
	EOperation getElement__GenerateXPredicates();

	/**
	 * Returns the meta object for the '{@link QualityPatternModel.Element#generateXPathExpression() <em>Generate XPath Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate XPath Expression</em>' operation.
	 * @see QualityPatternModel.Element#generateXPathExpression()
	 * @generated
	 */
	EOperation getElement__GenerateXPathExpression();

	/**
	 * Returns the meta object for the '{@link QualityPatternModel.Element#getNextElements() <em>Get Next Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next Elements</em>' operation.
	 * @see QualityPatternModel.Element#getNextElements()
	 * @generated
	 */
	EOperation getElement__GetNextElements();

	/**
	 * Returns the meta object for the '{@link QualityPatternModel.Element#getPreviousElement() <em>Get Previous Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Previous Element</em>' operation.
	 * @see QualityPatternModel.Element#getPreviousElement()
	 * @generated
	 */
	EOperation getElement__GetPreviousElement();

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
	 * Returns the meta object for the reference list '{@link QualityPatternModel.SetElement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see QualityPatternModel.SetElement#getNext()
	 * @see #getSetElement()
	 * @generated
	 */
	EReference getSetElement_Next();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.SetElement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see QualityPatternModel.SetElement#getPrevious()
	 * @see #getSetElement()
	 * @generated
	 */
	EReference getSetElement_Previous();

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
	 * Returns the meta object for the reference '{@link QualityPatternModel.SingleElement#getMappingTo <em>Mapping To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping To</em>'.
	 * @see QualityPatternModel.SingleElement#getMappingTo()
	 * @see #getSingleElement()
	 * @generated
	 */
	EReference getSingleElement_MappingTo();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.SingleElement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see QualityPatternModel.SingleElement#getPrevious()
	 * @see #getSingleElement()
	 * @generated
	 */
	EReference getSingleElement_Previous();

	/**
	 * Returns the meta object for the reference list '{@link QualityPatternModel.SingleElement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see QualityPatternModel.SingleElement#getNext()
	 * @see #getSingleElement()
	 * @generated
	 */
	EReference getSingleElement_Next();

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
	 * Returns the meta object for the reference '{@link QualityPatternModel.Property#getPropertyOptions <em>Property Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Options</em>'.
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
	 * Returns the meta object for the '{@link QualityPatternModel.Input#inputIsValid() <em>Input Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Is Valid</em>' operation.
	 * @see QualityPatternModel.Input#inputIsValid()
	 * @generated
	 */
	EOperation getInput__InputIsValid();

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
	 * Returns the meta object for the attribute '{@link QualityPatternModel.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see QualityPatternModel.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

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
	 * Returns the meta object for the attribute '{@link QualityPatternModel.Number#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see QualityPatternModel.Number#getNumber()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Number();

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
	 * Returns the meta object for the attribute '{@link QualityPatternModel.Boolean#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool</em>'.
	 * @see QualityPatternModel.Boolean#getBool()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Bool();

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
	 * Returns the meta object for the attribute '{@link QualityPatternModel.Option#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see QualityPatternModel.Option#getSelection()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Selection();

	/**
	 * Returns the meta object for the attribute list '{@link QualityPatternModel.Option#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Options</em>'.
	 * @see QualityPatternModel.Option#getOptions()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Options();

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
	 * Returns the meta object for the '{@link QualityPatternModel.GraphElement#getReturnType() <em>Get Return Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Return Type</em>' operation.
	 * @see QualityPatternModel.GraphElement#getReturnType()
	 * @generated
	 */
	EOperation getGraphElement__GetReturnType();

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
	 * Returns the meta object for the reference '{@link QualityPatternModel.Relation#getRelationOptions <em>Relation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation Options</em>'.
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
	 * Returns the meta object for the reference '{@link QualityPatternModel.Relation#getMappingFrom <em>Mapping From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping From</em>'.
	 * @see QualityPatternModel.Relation#getMappingFrom()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_MappingFrom();

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
	 * Returns the meta object for the reference '{@link QualityPatternModel.Comparison#getArgument1 <em>Argument1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument1</em>'.
	 * @see QualityPatternModel.Comparison#getArgument1()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_Argument1();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Comparison#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Options</em>'.
	 * @see QualityPatternModel.Comparison#getOptions()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_Options();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Comparison#getArgument2 <em>Argument2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument2</em>'.
	 * @see QualityPatternModel.Comparison#getArgument2()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_Argument2();

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
	 * Returns the meta object for the reference '{@link QualityPatternModel.Match#getRegularExpression <em>Regular Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regular Expression</em>'.
	 * @see QualityPatternModel.Match#getRegularExpression()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_RegularExpression();

	/**
	 * Returns the meta object for the attribute '{@link QualityPatternModel.Match#isNegate <em>Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negate</em>'.
	 * @see QualityPatternModel.Match#isNegate()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Negate();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Match#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Options</em>'.
	 * @see QualityPatternModel.Match#getOptions()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Options();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.NumberOperators <em>Number Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Operators</em>'.
	 * @see QualityPatternModel.NumberOperators
	 * @generated
	 */
	EClass getNumberOperators();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.OtherOperators <em>Other Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Operators</em>'.
	 * @see QualityPatternModel.OtherOperators
	 * @generated
	 */
	EClass getOtherOperators();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.ToNumber <em>To Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Number</em>'.
	 * @see QualityPatternModel.ToNumber
	 * @generated
	 */
	EClass getToNumber();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.ToNumber#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see QualityPatternModel.ToNumber#getProperty()
	 * @see #getToNumber()
	 * @generated
	 */
	EReference getToNumber_Property();

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
	 * Returns the meta object for the reference '{@link QualityPatternModel.SingleElementMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see QualityPatternModel.SingleElementMapping#getTo()
	 * @see #getSingleElementMapping()
	 * @generated
	 */
	EReference getSingleElementMapping_To();

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
	 * Returns the meta object for the reference '{@link QualityPatternModel.RelationMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see QualityPatternModel.RelationMapping#getFrom()
	 * @see #getRelationMapping()
	 * @generated
	 */
	EReference getRelationMapping_From();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.PatternElement <em>Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Element</em>'.
	 * @see QualityPatternModel.PatternElement
	 * @generated
	 */
	EClass getPatternElement();

	/**
	 * Returns the meta object for the '{@link QualityPatternModel.PatternElement#isValid() <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see QualityPatternModel.PatternElement#isValid()
	 * @generated
	 */
	EOperation getPatternElement__IsValid();

	/**
	 * Returns the meta object for the '{@link QualityPatternModel.PatternElement#toXQuery(QualityPatternModel.TranslationLocation) <em>To XQuery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To XQuery</em>' operation.
	 * @see QualityPatternModel.PatternElement#toXQuery(QualityPatternModel.TranslationLocation)
	 * @generated
	 */
	EOperation getPatternElement__ToXQuery__TranslationLocation();

	/**
	 * Returns the meta object for the '{@link QualityPatternModel.PatternElement#toLocalXQuery(QualityPatternModel.TranslationLocation) <em>To Local XQuery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Local XQuery</em>' operation.
	 * @see QualityPatternModel.PatternElement#toLocalXQuery(QualityPatternModel.TranslationLocation)
	 * @generated
	 */
	EOperation getPatternElement__ToLocalXQuery__TranslationLocation();

	/**
	 * Returns the meta object for class '{@link QualityPatternModel.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see QualityPatternModel.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for the reference '{@link QualityPatternModel.Count#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument</em>'.
	 * @see QualityPatternModel.Count#getArgument()
	 * @see #getCount()
	 * @generated
	 */
	EReference getCount_Argument();

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
	 * Returns the meta object for enum '{@link QualityPatternModel.PropertyLocation <em>Property Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Location</em>'.
	 * @see QualityPatternModel.PropertyLocation
	 * @generated
	 */
	EEnum getPropertyLocation();

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
	 * Returns the meta object for enum '{@link QualityPatternModel.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Return Type</em>'.
	 * @see QualityPatternModel.ReturnType
	 * @generated
	 */
	EEnum getReturnType();

	/**
	 * Returns the meta object for enum '{@link QualityPatternModel.TranslationLocation <em>Translation Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Translation Location</em>'.
	 * @see QualityPatternModel.TranslationLocation
	 * @generated
	 */
	EEnum getTranslationLocation();

	/**
	 * Returns the meta object for data type '{@link QualityPatternModel.impl.InvalidTranslationException <em>Invalid Translation Exception Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Translation Exception Wrapper</em>'.
	 * @see QualityPatternModel.impl.InvalidTranslationException
	 * @model instanceClass="QualityPatternModel.impl.InvalidTranslationException"
	 * @generated
	 */
	EDataType getInvalidTranslationExceptionWrapper();

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
		 * The meta object literal for the '<em><b>Return Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__RETURN_GRAPH = eINSTANCE.getPattern_ReturnGraph();

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
		 * The meta object literal for the '<em><b>Return Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__RETURN_ELEMENT = eINSTANCE.getGraph_ReturnElement();

		/**
		 * The meta object literal for the '<em><b>Root Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__ROOT_ELEMENT = eINSTANCE.getGraph_RootElement();

		/**
		 * The meta object literal for the '<em><b>Variable List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__VARIABLE_LIST = eINSTANCE.getGraph_VariableList();

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
		 * The meta object literal for the '<em><b>Predicates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PREDICATES = eINSTANCE.getElement_Predicates();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Relation From Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__RELATION_FROM_PREVIOUS = eINSTANCE.getElement_RelationFromPrevious();

		/**
		 * The meta object literal for the '<em><b>Is Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_TRANSLATED = eINSTANCE.getElement_IsTranslated();

		/**
		 * The meta object literal for the '<em><b>Generate XPredicates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GENERATE_XPREDICATES = eINSTANCE.getElement__GenerateXPredicates();

		/**
		 * The meta object literal for the '<em><b>Generate XPath Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GENERATE_XPATH_EXPRESSION = eINSTANCE.getElement__GenerateXPathExpression();

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
		 * The meta object literal for the '{@link QualityPatternModel.impl.SetElementImpl <em>Set Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.SetElementImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getSetElement()
		 * @generated
		 */
		EClass SET_ELEMENT = eINSTANCE.getSetElement();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link QualityPatternModel.impl.SingleElementImpl <em>Single Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.SingleElementImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getSingleElement()
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
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT__NEXT = eINSTANCE.getSingleElement_Next();

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
		 * The meta object literal for the '<em><b>Property Options</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Input Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT___INPUT_IS_VALID = eINSTANCE.getInput__InputIsValid();

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
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

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
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__NUMBER = eINSTANCE.getNumber_Number();

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
		 * The meta object literal for the '<em><b>Bool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__BOOL = eINSTANCE.getBoolean_Bool();

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
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__SELECTION = eINSTANCE.getOption_Selection();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__OPTIONS = eINSTANCE.getOption_Options();

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
		 * The meta object literal for the '<em><b>Get Return Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH_ELEMENT___GET_RETURN_TYPE = eINSTANCE.getGraphElement__GetReturnType();

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
		 * The meta object literal for the '<em><b>Relation Options</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Mapping From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__MAPPING_FROM = eINSTANCE.getRelation_MappingFrom();

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
		 * The meta object literal for the '<em><b>Argument1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__ARGUMENT1 = eINSTANCE.getComparison_Argument1();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__OPTIONS = eINSTANCE.getComparison_Options();

		/**
		 * The meta object literal for the '<em><b>Argument2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__ARGUMENT2 = eINSTANCE.getComparison_Argument2();

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
		 * The meta object literal for the '<em><b>Regular Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__REGULAR_EXPRESSION = eINSTANCE.getMatch_RegularExpression();

		/**
		 * The meta object literal for the '<em><b>Negate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__NEGATE = eINSTANCE.getMatch_Negate();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__OPTIONS = eINSTANCE.getMatch_Options();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.NumberOperatorsImpl <em>Number Operators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.NumberOperatorsImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getNumberOperators()
		 * @generated
		 */
		EClass NUMBER_OPERATORS = eINSTANCE.getNumberOperators();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.OtherOperatorsImpl <em>Other Operators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.OtherOperatorsImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getOtherOperators()
		 * @generated
		 */
		EClass OTHER_OPERATORS = eINSTANCE.getOtherOperators();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.ToNumberImpl <em>To Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.ToNumberImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getToNumber()
		 * @generated
		 */
		EClass TO_NUMBER = eINSTANCE.getToNumber();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_NUMBER__PROPERTY = eINSTANCE.getToNumber_Property();

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
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT_MAPPING__TO = eINSTANCE.getSingleElementMapping_To();

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
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_MAPPING__FROM = eINSTANCE.getRelationMapping_From();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.PatternElementImpl <em>Pattern Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.PatternElementImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getPatternElement()
		 * @generated
		 */
		EClass PATTERN_ELEMENT = eINSTANCE.getPatternElement();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___IS_VALID = eINSTANCE.getPatternElement__IsValid();

		/**
		 * The meta object literal for the '<em><b>To XQuery</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION = eINSTANCE.getPatternElement__ToXQuery__TranslationLocation();

		/**
		 * The meta object literal for the '<em><b>To Local XQuery</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION = eINSTANCE.getPatternElement__ToLocalXQuery__TranslationLocation();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.CountImpl
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getCount()
		 * @generated
		 */
		EClass COUNT = eINSTANCE.getCount();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT__ARGUMENT = eINSTANCE.getCount_Argument();

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
		 * The meta object literal for the '{@link QualityPatternModel.PropertyLocation <em>Property Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.PropertyLocation
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getPropertyLocation()
		 * @generated
		 */
		EEnum PROPERTY_LOCATION = eINSTANCE.getPropertyLocation();

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

		/**
		 * The meta object literal for the '{@link QualityPatternModel.ReturnType <em>Return Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.ReturnType
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getReturnType()
		 * @generated
		 */
		EEnum RETURN_TYPE = eINSTANCE.getReturnType();

		/**
		 * The meta object literal for the '{@link QualityPatternModel.TranslationLocation <em>Translation Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.TranslationLocation
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getTranslationLocation()
		 * @generated
		 */
		EEnum TRANSLATION_LOCATION = eINSTANCE.getTranslationLocation();

		/**
		 * The meta object literal for the '<em>Invalid Translation Exception Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityPatternModel.impl.InvalidTranslationException
		 * @see QualityPatternModel.impl.QualityPatternModelPackageImpl#getInvalidTranslationExceptionWrapper()
		 * @generated
		 */
		EDataType INVALID_TRANSLATION_EXCEPTION_WRAPPER = eINSTANCE.getInvalidTranslationExceptionWrapper();

	}

} //QualityPatternModelPackage

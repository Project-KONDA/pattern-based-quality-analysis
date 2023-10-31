/**
 */
package qualitypatternmodel.javaquery;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see qualitypatternmodel.javaquery.JavaqueryFactory
 * @model kind="package"
 * @generated
 */
public interface JavaqueryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "javaquery";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "javaquery";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "javaquery";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaqueryPackage eINSTANCE = qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.JavaFilterImpl <em>Java Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.JavaFilterImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getJavaFilter()
	 * @generated
	 */
	int JAVA_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__FILTER = 0;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__STRUCTURE = 1;

	/**
	 * The number of structural features of the '<em>Java Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Java Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.JavaFilterPartImpl <em>Java Filter Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.JavaFilterPartImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getJavaFilterPart()
	 * @generated
	 */
	int JAVA_FILTER_PART = 1;

	/**
	 * The number of structural features of the '<em>Java Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER_PART_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER_PART___APPLY = 0;

	/**
	 * The number of operations of the '<em>Java Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER_PART_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.FormulaFilterPartImpl <em>Formula Filter Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.FormulaFilterPartImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getFormulaFilterPart()
	 * @generated
	 */
	int FORMULA_FILTER_PART = 2;

	/**
	 * The feature id for the '<em><b>Subfilter1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FILTER_PART__SUBFILTER1 = JAVA_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subfilter2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FILTER_PART__SUBFILTER2 = JAVA_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Formula Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FILTER_PART_FEATURE_COUNT = JAVA_FILTER_PART_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FILTER_PART___APPLY = JAVA_FILTER_PART___APPLY;

	/**
	 * The number of operations of the '<em>Formula Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FILTER_PART_OPERATION_COUNT = JAVA_FILTER_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.BooleanFilterPartImpl <em>Boolean Filter Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.BooleanFilterPartImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getBooleanFilterPart()
	 * @generated
	 */
	int BOOLEAN_FILTER_PART = 3;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_PART__ARGUMENT = JAVA_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_PART_FEATURE_COUNT = JAVA_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_PART___APPLY = JAVA_FILTER_PART___APPLY;

	/**
	 * The number of operations of the '<em>Boolean Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_PART_OPERATION_COUNT = JAVA_FILTER_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.OneArgFunctionFilterPartImpl <em>One Arg Function Filter Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.OneArgFunctionFilterPartImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getOneArgFunctionFilterPart()
	 * @generated
	 */
	int ONE_ARG_FUNCTION_FILTER_PART = 4;

	/**
	 * The feature id for the '<em><b>Combinator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_FUNCTION_FILTER_PART__COMBINATOR = JAVA_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT = JAVA_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>One Arg Function Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_FUNCTION_FILTER_PART_FEATURE_COUNT = JAVA_FILTER_PART_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_FUNCTION_FILTER_PART___APPLY = JAVA_FILTER_PART___APPLY;

	/**
	 * The number of operations of the '<em>One Arg Function Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_FUNCTION_FILTER_PART_OPERATION_COUNT = JAVA_FILTER_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.ListFilterPartImpl <em>List Filter Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.ListFilterPartImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getListFilterPart()
	 * @generated
	 */
	int LIST_FILTER_PART = 5;

	/**
	 * The feature id for the '<em><b>Combinator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FILTER_PART__COMBINATOR = JAVA_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subfilter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FILTER_PART__SUBFILTER = JAVA_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FILTER_PART__ARGUMENT = JAVA_FILTER_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>List Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FILTER_PART_FEATURE_COUNT = JAVA_FILTER_PART_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FILTER_PART___APPLY = JAVA_FILTER_PART___APPLY;

	/**
	 * The number of operations of the '<em>List Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FILTER_PART_OPERATION_COUNT = JAVA_FILTER_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.TwoArgFunctionFilterPartImpl <em>Two Arg Function Filter Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.TwoArgFunctionFilterPartImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getTwoArgFunctionFilterPart()
	 * @generated
	 */
	int TWO_ARG_FUNCTION_FILTER_PART = 6;

	/**
	 * The feature id for the '<em><b>Combinator2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2 = JAVA_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Combinator1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1 = JAVA_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1 = JAVA_FILTER_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Argument2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2 = JAVA_FILTER_PART_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Two Arg Function Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART_FEATURE_COUNT = JAVA_FILTER_PART_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART___APPLY = JAVA_FILTER_PART___APPLY;

	/**
	 * The number of operations of the '<em>Two Arg Function Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART_OPERATION_COUNT = JAVA_FILTER_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.CombinatorImpl <em>Combinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.CombinatorImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getCombinator()
	 * @generated
	 */
	int COMBINATOR = 7;

	/**
	 * The number of structural features of the '<em>Combinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Combinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.EveryCombinatorImpl <em>Every Combinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.EveryCombinatorImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getEveryCombinator()
	 * @generated
	 */
	int EVERY_COMBINATOR = 8;

	/**
	 * The number of structural features of the '<em>Every Combinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVERY_COMBINATOR_FEATURE_COUNT = COMBINATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Every Combinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVERY_COMBINATOR_OPERATION_COUNT = COMBINATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.AnyCombinatorImpl <em>Any Combinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.AnyCombinatorImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getAnyCombinator()
	 * @generated
	 */
	int ANY_COMBINATOR = 9;

	/**
	 * The number of structural features of the '<em>Any Combinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_COMBINATOR_FEATURE_COUNT = COMBINATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Any Combinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_COMBINATOR_OPERATION_COUNT = COMBINATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.NoneCombinatorImpl <em>None Combinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.NoneCombinatorImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getNoneCombinator()
	 * @generated
	 */
	int NONE_COMBINATOR = 10;

	/**
	 * The number of structural features of the '<em>None Combinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_COMBINATOR_FEATURE_COUNT = COMBINATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>None Combinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_COMBINATOR_OPERATION_COUNT = COMBINATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.CountCombinatorImpl <em>Count Combinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.CountCombinatorImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getCountCombinator()
	 * @generated
	 */
	int COUNT_COMBINATOR = 11;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMBINATOR__OPERATOR = COMBINATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMBINATOR__NUMBER = COMBINATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Count Combinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMBINATOR_FEATURE_COUNT = COMBINATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Count Combinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMBINATOR_OPERATION_COUNT = COMBINATOR_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.NotFilterPartImpl <em>Not Filter Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.NotFilterPartImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getNotFilterPart()
	 * @generated
	 */
	int NOT_FILTER_PART = 12;

	/**
	 * The feature id for the '<em><b>Subfilter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FILTER_PART__SUBFILTER = JAVA_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FILTER_PART_FEATURE_COUNT = JAVA_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FILTER_PART___APPLY = JAVA_FILTER_PART___APPLY;

	/**
	 * The number of operations of the '<em>Not Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FILTER_PART_OPERATION_COUNT = JAVA_FILTER_PART_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.JavaFilter <em>Java Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Filter</em>'.
	 * @see qualitypatternmodel.javaquery.JavaFilter
	 * @generated
	 */
	EClass getJavaFilter();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaquery.JavaFilter#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see qualitypatternmodel.javaquery.JavaFilter#getFilter()
	 * @see #getJavaFilter()
	 * @generated
	 */
	EReference getJavaFilter_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaquery.JavaFilter#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see qualitypatternmodel.javaquery.JavaFilter#getStructure()
	 * @see #getJavaFilter()
	 * @generated
	 */
	EReference getJavaFilter_Structure();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.JavaFilterPart <em>Java Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Filter Part</em>'.
	 * @see qualitypatternmodel.javaquery.JavaFilterPart
	 * @generated
	 */
	EClass getJavaFilterPart();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaquery.JavaFilterPart#apply() <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see qualitypatternmodel.javaquery.JavaFilterPart#apply()
	 * @generated
	 */
	EOperation getJavaFilterPart__Apply();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.FormulaFilterPart <em>Formula Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula Filter Part</em>'.
	 * @see qualitypatternmodel.javaquery.FormulaFilterPart
	 * @generated
	 */
	EClass getFormulaFilterPart();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaquery.FormulaFilterPart#getSubfilter1 <em>Subfilter1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subfilter1</em>'.
	 * @see qualitypatternmodel.javaquery.FormulaFilterPart#getSubfilter1()
	 * @see #getFormulaFilterPart()
	 * @generated
	 */
	EReference getFormulaFilterPart_Subfilter1();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaquery.FormulaFilterPart#getSubfilter2 <em>Subfilter2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subfilter2</em>'.
	 * @see qualitypatternmodel.javaquery.FormulaFilterPart#getSubfilter2()
	 * @see #getFormulaFilterPart()
	 * @generated
	 */
	EReference getFormulaFilterPart_Subfilter2();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.BooleanFilterPart <em>Boolean Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Filter Part</em>'.
	 * @see qualitypatternmodel.javaquery.BooleanFilterPart
	 * @generated
	 */
	EClass getBooleanFilterPart();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaquery.BooleanFilterPart#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument</em>'.
	 * @see qualitypatternmodel.javaquery.BooleanFilterPart#getArgument()
	 * @see #getBooleanFilterPart()
	 * @generated
	 */
	EReference getBooleanFilterPart_Argument();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart <em>One Arg Function Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Arg Function Filter Part</em>'.
	 * @see qualitypatternmodel.javaquery.OneArgFunctionFilterPart
	 * @generated
	 */
	EClass getOneArgFunctionFilterPart();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#getCombinator <em>Combinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Combinator</em>'.
	 * @see qualitypatternmodel.javaquery.OneArgFunctionFilterPart#getCombinator()
	 * @see #getOneArgFunctionFilterPart()
	 * @generated
	 */
	EReference getOneArgFunctionFilterPart_Combinator();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument</em>'.
	 * @see qualitypatternmodel.javaquery.OneArgFunctionFilterPart#getArgument()
	 * @see #getOneArgFunctionFilterPart()
	 * @generated
	 */
	EReference getOneArgFunctionFilterPart_Argument();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.ListFilterPart <em>List Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Filter Part</em>'.
	 * @see qualitypatternmodel.javaquery.ListFilterPart
	 * @generated
	 */
	EClass getListFilterPart();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaquery.ListFilterPart#getCombinator <em>Combinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Combinator</em>'.
	 * @see qualitypatternmodel.javaquery.ListFilterPart#getCombinator()
	 * @see #getListFilterPart()
	 * @generated
	 */
	EReference getListFilterPart_Combinator();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaquery.ListFilterPart#getSubfilter <em>Subfilter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subfilter</em>'.
	 * @see qualitypatternmodel.javaquery.ListFilterPart#getSubfilter()
	 * @see #getListFilterPart()
	 * @generated
	 */
	EReference getListFilterPart_Subfilter();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaquery.ListFilterPart#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument</em>'.
	 * @see qualitypatternmodel.javaquery.ListFilterPart#getArgument()
	 * @see #getListFilterPart()
	 * @generated
	 */
	EReference getListFilterPart_Argument();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart <em>Two Arg Function Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two Arg Function Filter Part</em>'.
	 * @see qualitypatternmodel.javaquery.TwoArgFunctionFilterPart
	 * @generated
	 */
	EClass getTwoArgFunctionFilterPart();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getCombinator2 <em>Combinator2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Combinator2</em>'.
	 * @see qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getCombinator2()
	 * @see #getTwoArgFunctionFilterPart()
	 * @generated
	 */
	EReference getTwoArgFunctionFilterPart_Combinator2();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getCombinator1 <em>Combinator1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Combinator1</em>'.
	 * @see qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getCombinator1()
	 * @see #getTwoArgFunctionFilterPart()
	 * @generated
	 */
	EReference getTwoArgFunctionFilterPart_Combinator1();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getArgument1 <em>Argument1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument1</em>'.
	 * @see qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getArgument1()
	 * @see #getTwoArgFunctionFilterPart()
	 * @generated
	 */
	EReference getTwoArgFunctionFilterPart_Argument1();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getArgument2 <em>Argument2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument2</em>'.
	 * @see qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getArgument2()
	 * @see #getTwoArgFunctionFilterPart()
	 * @generated
	 */
	EReference getTwoArgFunctionFilterPart_Argument2();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.Combinator <em>Combinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combinator</em>'.
	 * @see qualitypatternmodel.javaquery.Combinator
	 * @generated
	 */
	EClass getCombinator();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.EveryCombinator <em>Every Combinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Every Combinator</em>'.
	 * @see qualitypatternmodel.javaquery.EveryCombinator
	 * @generated
	 */
	EClass getEveryCombinator();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.AnyCombinator <em>Any Combinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Combinator</em>'.
	 * @see qualitypatternmodel.javaquery.AnyCombinator
	 * @generated
	 */
	EClass getAnyCombinator();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.NoneCombinator <em>None Combinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>None Combinator</em>'.
	 * @see qualitypatternmodel.javaquery.NoneCombinator
	 * @generated
	 */
	EClass getNoneCombinator();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.CountCombinator <em>Count Combinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Combinator</em>'.
	 * @see qualitypatternmodel.javaquery.CountCombinator
	 * @generated
	 */
	EClass getCountCombinator();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaquery.CountCombinator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see qualitypatternmodel.javaquery.CountCombinator#getOperator()
	 * @see #getCountCombinator()
	 * @generated
	 */
	EAttribute getCountCombinator_Operator();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaquery.CountCombinator#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see qualitypatternmodel.javaquery.CountCombinator#getNumber()
	 * @see #getCountCombinator()
	 * @generated
	 */
	EAttribute getCountCombinator_Number();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.NotFilterPart <em>Not Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Filter Part</em>'.
	 * @see qualitypatternmodel.javaquery.NotFilterPart
	 * @generated
	 */
	EClass getNotFilterPart();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaquery.NotFilterPart#getSubfilter <em>Subfilter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subfilter</em>'.
	 * @see qualitypatternmodel.javaquery.NotFilterPart#getSubfilter()
	 * @see #getNotFilterPart()
	 * @generated
	 */
	EReference getNotFilterPart_Subfilter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaqueryFactory getJavaqueryFactory();

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
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.JavaFilterImpl <em>Java Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.JavaFilterImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getJavaFilter()
		 * @generated
		 */
		EClass JAVA_FILTER = eINSTANCE.getJavaFilter();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_FILTER__FILTER = eINSTANCE.getJavaFilter_Filter();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_FILTER__STRUCTURE = eINSTANCE.getJavaFilter_Structure();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.JavaFilterPartImpl <em>Java Filter Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.JavaFilterPartImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getJavaFilterPart()
		 * @generated
		 */
		EClass JAVA_FILTER_PART = eINSTANCE.getJavaFilterPart();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA_FILTER_PART___APPLY = eINSTANCE.getJavaFilterPart__Apply();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.FormulaFilterPartImpl <em>Formula Filter Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.FormulaFilterPartImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getFormulaFilterPart()
		 * @generated
		 */
		EClass FORMULA_FILTER_PART = eINSTANCE.getFormulaFilterPart();

		/**
		 * The meta object literal for the '<em><b>Subfilter1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA_FILTER_PART__SUBFILTER1 = eINSTANCE.getFormulaFilterPart_Subfilter1();

		/**
		 * The meta object literal for the '<em><b>Subfilter2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA_FILTER_PART__SUBFILTER2 = eINSTANCE.getFormulaFilterPart_Subfilter2();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.BooleanFilterPartImpl <em>Boolean Filter Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.BooleanFilterPartImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getBooleanFilterPart()
		 * @generated
		 */
		EClass BOOLEAN_FILTER_PART = eINSTANCE.getBooleanFilterPart();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_FILTER_PART__ARGUMENT = eINSTANCE.getBooleanFilterPart_Argument();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.OneArgFunctionFilterPartImpl <em>One Arg Function Filter Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.OneArgFunctionFilterPartImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getOneArgFunctionFilterPart()
		 * @generated
		 */
		EClass ONE_ARG_FUNCTION_FILTER_PART = eINSTANCE.getOneArgFunctionFilterPart();

		/**
		 * The meta object literal for the '<em><b>Combinator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_ARG_FUNCTION_FILTER_PART__COMBINATOR = eINSTANCE.getOneArgFunctionFilterPart_Combinator();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT = eINSTANCE.getOneArgFunctionFilterPart_Argument();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.ListFilterPartImpl <em>List Filter Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.ListFilterPartImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getListFilterPart()
		 * @generated
		 */
		EClass LIST_FILTER_PART = eINSTANCE.getListFilterPart();

		/**
		 * The meta object literal for the '<em><b>Combinator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_FILTER_PART__COMBINATOR = eINSTANCE.getListFilterPart_Combinator();

		/**
		 * The meta object literal for the '<em><b>Subfilter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_FILTER_PART__SUBFILTER = eINSTANCE.getListFilterPart_Subfilter();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_FILTER_PART__ARGUMENT = eINSTANCE.getListFilterPart_Argument();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.TwoArgFunctionFilterPartImpl <em>Two Arg Function Filter Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.TwoArgFunctionFilterPartImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getTwoArgFunctionFilterPart()
		 * @generated
		 */
		EClass TWO_ARG_FUNCTION_FILTER_PART = eINSTANCE.getTwoArgFunctionFilterPart();

		/**
		 * The meta object literal for the '<em><b>Combinator2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2 = eINSTANCE.getTwoArgFunctionFilterPart_Combinator2();

		/**
		 * The meta object literal for the '<em><b>Combinator1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1 = eINSTANCE.getTwoArgFunctionFilterPart_Combinator1();

		/**
		 * The meta object literal for the '<em><b>Argument1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1 = eINSTANCE.getTwoArgFunctionFilterPart_Argument1();

		/**
		 * The meta object literal for the '<em><b>Argument2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2 = eINSTANCE.getTwoArgFunctionFilterPart_Argument2();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.CombinatorImpl <em>Combinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.CombinatorImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getCombinator()
		 * @generated
		 */
		EClass COMBINATOR = eINSTANCE.getCombinator();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.EveryCombinatorImpl <em>Every Combinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.EveryCombinatorImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getEveryCombinator()
		 * @generated
		 */
		EClass EVERY_COMBINATOR = eINSTANCE.getEveryCombinator();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.AnyCombinatorImpl <em>Any Combinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.AnyCombinatorImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getAnyCombinator()
		 * @generated
		 */
		EClass ANY_COMBINATOR = eINSTANCE.getAnyCombinator();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.NoneCombinatorImpl <em>None Combinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.NoneCombinatorImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getNoneCombinator()
		 * @generated
		 */
		EClass NONE_COMBINATOR = eINSTANCE.getNoneCombinator();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.CountCombinatorImpl <em>Count Combinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.CountCombinatorImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getCountCombinator()
		 * @generated
		 */
		EClass COUNT_COMBINATOR = eINSTANCE.getCountCombinator();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNT_COMBINATOR__OPERATOR = eINSTANCE.getCountCombinator_Operator();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNT_COMBINATOR__NUMBER = eINSTANCE.getCountCombinator_Number();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.NotFilterPartImpl <em>Not Filter Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.NotFilterPartImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getNotFilterPart()
		 * @generated
		 */
		EClass NOT_FILTER_PART = eINSTANCE.getNotFilterPart();

		/**
		 * The meta object literal for the '<em><b>Subfilter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_FILTER_PART__SUBFILTER = eINSTANCE.getNotFilterPart_Subfilter();

	}

} //JavaqueryPackage

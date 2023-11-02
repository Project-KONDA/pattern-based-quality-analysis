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
	int JAVA_FILTER_PART = 12;

	/**
	 * The number of structural features of the '<em>Java Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER_PART_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER_PART___GET_ARGUMENTS = 0;

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
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.BooleanFilterElementImpl <em>Boolean Filter Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.BooleanFilterElementImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getBooleanFilterElement()
	 * @generated
	 */
	int BOOLEAN_FILTER_ELEMENT = 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.BooleanFilterPartImpl <em>Boolean Filter Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.BooleanFilterPartImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getBooleanFilterPart()
	 * @generated
	 */
	int BOOLEAN_FILTER_PART = 1;

	/**
	 * The number of structural features of the '<em>Boolean Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_PART_FEATURE_COUNT = JAVA_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_PART___GET_ARGUMENTS = JAVA_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_PART___APPLY = JAVA_FILTER_PART_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_PART_OPERATION_COUNT = JAVA_FILTER_PART_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subfilter1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FILTER_PART__SUBFILTER1 = BOOLEAN_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subfilter2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FILTER_PART__SUBFILTER2 = BOOLEAN_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FILTER_PART__OPERATOR = BOOLEAN_FILTER_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FILTER_PART__ARGUMENT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Formula Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FILTER_PART_FEATURE_COUNT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FILTER_PART___GET_ARGUMENTS = BOOLEAN_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FILTER_PART___APPLY = BOOLEAN_FILTER_PART___APPLY;

	/**
	 * The number of operations of the '<em>Formula Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FILTER_PART_OPERATION_COUNT = BOOLEAN_FILTER_PART_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_ELEMENT__ARGUMENT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Filter Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_ELEMENT_FEATURE_COUNT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_ELEMENT___GET_ARGUMENTS = BOOLEAN_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_ELEMENT___APPLY = BOOLEAN_FILTER_PART___APPLY;

	/**
	 * The number of operations of the '<em>Boolean Filter Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_ELEMENT_OPERATION_COUNT = BOOLEAN_FILTER_PART_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_FUNCTION_FILTER_PART__QUANTIFIER = BOOLEAN_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>One Arg Function Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_FUNCTION_FILTER_PART_FEATURE_COUNT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_FUNCTION_FILTER_PART___GET_ARGUMENTS = BOOLEAN_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_FUNCTION_FILTER_PART___APPLY = BOOLEAN_FILTER_PART___APPLY;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_FUNCTION_FILTER_PART___APPLY__STRING = BOOLEAN_FILTER_PART_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>One Arg Function Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_FUNCTION_FILTER_PART_OPERATION_COUNT = BOOLEAN_FILTER_PART_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Subfilter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FILTER_PART__SUBFILTER = BOOLEAN_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FILTER_PART__ARGUMENT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FILTER_PART__QUANTIFIER = BOOLEAN_FILTER_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>List Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FILTER_PART_FEATURE_COUNT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FILTER_PART___GET_ARGUMENTS = BOOLEAN_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FILTER_PART___APPLY = BOOLEAN_FILTER_PART___APPLY;

	/**
	 * The number of operations of the '<em>List Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FILTER_PART_OPERATION_COUNT = BOOLEAN_FILTER_PART_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Argument1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1 = BOOLEAN_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2 = BOOLEAN_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantifier1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART__QUANTIFIER1 = BOOLEAN_FILTER_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quantifier2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART__QUANTIFIER2 = BOOLEAN_FILTER_PART_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Two Arg Function Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART_FEATURE_COUNT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART___GET_ARGUMENTS = BOOLEAN_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART___APPLY = BOOLEAN_FILTER_PART___APPLY;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART___APPLY__STRING_STRING = BOOLEAN_FILTER_PART_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Two Arg Function Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART_OPERATION_COUNT = BOOLEAN_FILTER_PART_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.NotFilterPartImpl <em>Not Filter Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.NotFilterPartImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getNotFilterPart()
	 * @generated
	 */
	int NOT_FILTER_PART = 7;

	/**
	 * The feature id for the '<em><b>Subfilter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FILTER_PART__SUBFILTER = BOOLEAN_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FILTER_PART_FEATURE_COUNT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FILTER_PART___GET_ARGUMENTS = BOOLEAN_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FILTER_PART___APPLY = BOOLEAN_FILTER_PART___APPLY;

	/**
	 * The number of operations of the '<em>Not Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FILTER_PART_OPERATION_COUNT = BOOLEAN_FILTER_PART_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.CountFilterPartImpl <em>Count Filter Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.CountFilterPartImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getCountFilterPart()
	 * @generated
	 */
	int COUNT_FILTER_PART = 8;

	/**
	 * The feature id for the '<em><b>Argument1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_PART__ARGUMENT1 = BOOLEAN_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_PART__ARGUMENT2 = BOOLEAN_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_PART__OPERATOR = BOOLEAN_FILTER_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Count Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_PART_FEATURE_COUNT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_PART___GET_ARGUMENTS = BOOLEAN_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_PART___APPLY = BOOLEAN_FILTER_PART___APPLY;

	/**
	 * The number of operations of the '<em>Count Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_PART_OPERATION_COUNT = BOOLEAN_FILTER_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.NumberFilterPartImpl <em>Number Filter Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.NumberFilterPartImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getNumberFilterPart()
	 * @generated
	 */
	int NUMBER_FILTER_PART = 9;

	/**
	 * The number of structural features of the '<em>Number Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_PART_FEATURE_COUNT = JAVA_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_PART___GET_ARGUMENTS = JAVA_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_PART___APPLY = JAVA_FILTER_PART_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_PART_OPERATION_COUNT = JAVA_FILTER_PART_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.CountFilterElementImpl <em>Count Filter Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.CountFilterElementImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getCountFilterElement()
	 * @generated
	 */
	int COUNT_FILTER_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Subfilter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_ELEMENT__SUBFILTER = NUMBER_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_ELEMENT__ARGUMENT = NUMBER_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Count Filter Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_ELEMENT_FEATURE_COUNT = NUMBER_FILTER_PART_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_ELEMENT___GET_ARGUMENTS = NUMBER_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_ELEMENT___APPLY = NUMBER_FILTER_PART___APPLY;

	/**
	 * The number of operations of the '<em>Count Filter Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_ELEMENT_OPERATION_COUNT = NUMBER_FILTER_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.NumberFilterElementImpl <em>Number Filter Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.NumberFilterElementImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getNumberFilterElement()
	 * @generated
	 */
	int NUMBER_FILTER_ELEMENT = 11;

	/**
	 * The number of structural features of the '<em>Number Filter Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_ELEMENT_FEATURE_COUNT = NUMBER_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_ELEMENT___GET_ARGUMENTS = NUMBER_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_ELEMENT___APPLY = NUMBER_FILTER_PART___APPLY;

	/**
	 * The number of operations of the '<em>Number Filter Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_ELEMENT_OPERATION_COUNT = NUMBER_FILTER_PART_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the '{@link qualitypatternmodel.javaquery.JavaFilterPart#getArguments() <em>Get Arguments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arguments</em>' operation.
	 * @see qualitypatternmodel.javaquery.JavaFilterPart#getArguments()
	 * @generated
	 */
	EOperation getJavaFilterPart__GetArguments();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaquery.FormulaFilterPart#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see qualitypatternmodel.javaquery.FormulaFilterPart#getOperator()
	 * @see #getFormulaFilterPart()
	 * @generated
	 */
	EAttribute getFormulaFilterPart_Operator();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaquery.FormulaFilterPart#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument</em>'.
	 * @see qualitypatternmodel.javaquery.FormulaFilterPart#getArgument()
	 * @see #getFormulaFilterPart()
	 * @generated
	 */
	EReference getFormulaFilterPart_Argument();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.BooleanFilterElement <em>Boolean Filter Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Filter Element</em>'.
	 * @see qualitypatternmodel.javaquery.BooleanFilterElement
	 * @generated
	 */
	EClass getBooleanFilterElement();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaquery.BooleanFilterElement#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument</em>'.
	 * @see qualitypatternmodel.javaquery.BooleanFilterElement#getArgument()
	 * @see #getBooleanFilterElement()
	 * @generated
	 */
	EReference getBooleanFilterElement_Argument();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.javaquery.BooleanFilterPart#apply() <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see qualitypatternmodel.javaquery.BooleanFilterPart#apply()
	 * @generated
	 */
	EOperation getBooleanFilterPart__Apply();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier</em>'.
	 * @see qualitypatternmodel.javaquery.OneArgFunctionFilterPart#getQuantifier()
	 * @see #getOneArgFunctionFilterPart()
	 * @generated
	 */
	EAttribute getOneArgFunctionFilterPart_Quantifier();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#apply(java.lang.String) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see qualitypatternmodel.javaquery.OneArgFunctionFilterPart#apply(java.lang.String)
	 * @generated
	 */
	EOperation getOneArgFunctionFilterPart__Apply__String();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaquery.ListFilterPart#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier</em>'.
	 * @see qualitypatternmodel.javaquery.ListFilterPart#getQuantifier()
	 * @see #getListFilterPart()
	 * @generated
	 */
	EAttribute getListFilterPart_Quantifier();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getQuantifier1 <em>Quantifier1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier1</em>'.
	 * @see qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getQuantifier1()
	 * @see #getTwoArgFunctionFilterPart()
	 * @generated
	 */
	EAttribute getTwoArgFunctionFilterPart_Quantifier1();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getQuantifier2 <em>Quantifier2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier2</em>'.
	 * @see qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getQuantifier2()
	 * @see #getTwoArgFunctionFilterPart()
	 * @generated
	 */
	EAttribute getTwoArgFunctionFilterPart_Quantifier2();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#apply(java.lang.String, java.lang.String) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#apply(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getTwoArgFunctionFilterPart__Apply__String_String();

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
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.CountFilterPart <em>Count Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Filter Part</em>'.
	 * @see qualitypatternmodel.javaquery.CountFilterPart
	 * @generated
	 */
	EClass getCountFilterPart();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaquery.CountFilterPart#getArgument1 <em>Argument1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument1</em>'.
	 * @see qualitypatternmodel.javaquery.CountFilterPart#getArgument1()
	 * @see #getCountFilterPart()
	 * @generated
	 */
	EReference getCountFilterPart_Argument1();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaquery.CountFilterPart#getArgument2 <em>Argument2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument2</em>'.
	 * @see qualitypatternmodel.javaquery.CountFilterPart#getArgument2()
	 * @see #getCountFilterPart()
	 * @generated
	 */
	EReference getCountFilterPart_Argument2();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaquery.CountFilterPart#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see qualitypatternmodel.javaquery.CountFilterPart#getOperator()
	 * @see #getCountFilterPart()
	 * @generated
	 */
	EAttribute getCountFilterPart_Operator();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.NumberFilterPart <em>Number Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Filter Part</em>'.
	 * @see qualitypatternmodel.javaquery.NumberFilterPart
	 * @generated
	 */
	EClass getNumberFilterPart();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaquery.NumberFilterPart#apply() <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see qualitypatternmodel.javaquery.NumberFilterPart#apply()
	 * @generated
	 */
	EOperation getNumberFilterPart__Apply();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.CountFilterElement <em>Count Filter Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Filter Element</em>'.
	 * @see qualitypatternmodel.javaquery.CountFilterElement
	 * @generated
	 */
	EClass getCountFilterElement();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaquery.CountFilterElement#getSubfilter <em>Subfilter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subfilter</em>'.
	 * @see qualitypatternmodel.javaquery.CountFilterElement#getSubfilter()
	 * @see #getCountFilterElement()
	 * @generated
	 */
	EReference getCountFilterElement_Subfilter();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaquery.CountFilterElement#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument</em>'.
	 * @see qualitypatternmodel.javaquery.CountFilterElement#getArgument()
	 * @see #getCountFilterElement()
	 * @generated
	 */
	EReference getCountFilterElement_Argument();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.NumberFilterElement <em>Number Filter Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Filter Element</em>'.
	 * @see qualitypatternmodel.javaquery.NumberFilterElement
	 * @generated
	 */
	EClass getNumberFilterElement();

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
		 * The meta object literal for the '<em><b>Get Arguments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA_FILTER_PART___GET_ARGUMENTS = eINSTANCE.getJavaFilterPart__GetArguments();

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
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULA_FILTER_PART__OPERATOR = eINSTANCE.getFormulaFilterPart_Operator();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA_FILTER_PART__ARGUMENT = eINSTANCE.getFormulaFilterPart_Argument();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.BooleanFilterElementImpl <em>Boolean Filter Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.BooleanFilterElementImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getBooleanFilterElement()
		 * @generated
		 */
		EClass BOOLEAN_FILTER_ELEMENT = eINSTANCE.getBooleanFilterElement();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_FILTER_ELEMENT__ARGUMENT = eINSTANCE.getBooleanFilterElement_Argument();

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
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_FILTER_PART___APPLY = eINSTANCE.getBooleanFilterPart__Apply();

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
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT = eINSTANCE.getOneArgFunctionFilterPart_Argument();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_ARG_FUNCTION_FILTER_PART__QUANTIFIER = eINSTANCE.getOneArgFunctionFilterPart_Quantifier();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONE_ARG_FUNCTION_FILTER_PART___APPLY__STRING = eINSTANCE.getOneArgFunctionFilterPart__Apply__String();

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
		 * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_FILTER_PART__QUANTIFIER = eINSTANCE.getListFilterPart_Quantifier();

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
		 * The meta object literal for the '<em><b>Quantifier1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWO_ARG_FUNCTION_FILTER_PART__QUANTIFIER1 = eINSTANCE.getTwoArgFunctionFilterPart_Quantifier1();

		/**
		 * The meta object literal for the '<em><b>Quantifier2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWO_ARG_FUNCTION_FILTER_PART__QUANTIFIER2 = eINSTANCE.getTwoArgFunctionFilterPart_Quantifier2();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWO_ARG_FUNCTION_FILTER_PART___APPLY__STRING_STRING = eINSTANCE.getTwoArgFunctionFilterPart__Apply__String_String();

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

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.CountFilterPartImpl <em>Count Filter Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.CountFilterPartImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getCountFilterPart()
		 * @generated
		 */
		EClass COUNT_FILTER_PART = eINSTANCE.getCountFilterPart();

		/**
		 * The meta object literal for the '<em><b>Argument1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_FILTER_PART__ARGUMENT1 = eINSTANCE.getCountFilterPart_Argument1();

		/**
		 * The meta object literal for the '<em><b>Argument2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_FILTER_PART__ARGUMENT2 = eINSTANCE.getCountFilterPart_Argument2();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNT_FILTER_PART__OPERATOR = eINSTANCE.getCountFilterPart_Operator();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.NumberFilterPartImpl <em>Number Filter Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.NumberFilterPartImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getNumberFilterPart()
		 * @generated
		 */
		EClass NUMBER_FILTER_PART = eINSTANCE.getNumberFilterPart();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NUMBER_FILTER_PART___APPLY = eINSTANCE.getNumberFilterPart__Apply();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.CountFilterElementImpl <em>Count Filter Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.CountFilterElementImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getCountFilterElement()
		 * @generated
		 */
		EClass COUNT_FILTER_ELEMENT = eINSTANCE.getCountFilterElement();

		/**
		 * The meta object literal for the '<em><b>Subfilter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_FILTER_ELEMENT__SUBFILTER = eINSTANCE.getCountFilterElement_Subfilter();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_FILTER_ELEMENT__ARGUMENT = eINSTANCE.getCountFilterElement_Argument();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.NumberFilterElementImpl <em>Number Filter Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.NumberFilterElementImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getNumberFilterElement()
		 * @generated
		 */
		EClass NUMBER_FILTER_ELEMENT = eINSTANCE.getNumberFilterElement();

	}

} //JavaqueryPackage

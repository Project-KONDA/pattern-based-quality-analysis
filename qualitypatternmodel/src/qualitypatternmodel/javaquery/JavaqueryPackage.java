/**
 */
package qualitypatternmodel.javaquery;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The feature id for the '<em><b>Interim Results</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__INTERIM_RESULTS = 2;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__QUERY = 3;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__LANGUAGE = 4;

	/**
	 * The feature id for the '<em><b>Pattern Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__PATTERN_NAME = 5;

	/**
	 * The feature id for the '<em><b>Pattern Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__PATTERN_ID = 6;

	/**
	 * The number of structural features of the '<em>Java Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Filter Query Results</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER___FILTER_QUERY_RESULTS = 0;

	/**
	 * The operation id for the '<em>Create Interim Result Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER___CREATE_INTERIM_RESULT_CONTAINER__LIST = 1;

	/**
	 * The operation id for the '<em>Execute XQuery Java</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER___EXECUTE_XQUERY_JAVA__STRING = 2;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER___EXECUTE__STRING = 3;

	/**
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER___TO_JSON = 4;

	/**
	 * The number of operations of the '<em>Java Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER_OPERATION_COUNT = 5;

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
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER_PART___TO_JSON = 1;

	/**
	 * The number of operations of the '<em>Java Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER_PART_OPERATION_COUNT = 2;

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
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_PART___TO_JSON = JAVA_FILTER_PART___TO_JSON;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_PART___APPLY__INTERIMRESULT = JAVA_FILTER_PART_OPERATION_COUNT + 0;

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
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FILTER_PART___TO_JSON = BOOLEAN_FILTER_PART___TO_JSON;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FILTER_PART___APPLY__INTERIMRESULT = BOOLEAN_FILTER_PART___APPLY__INTERIMRESULT;

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
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_ELEMENT___TO_JSON = BOOLEAN_FILTER_PART___TO_JSON;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_ELEMENT___APPLY__INTERIMRESULT = BOOLEAN_FILTER_PART___APPLY__INTERIMRESULT;

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
	 * The feature id for the '<em><b>Negate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_FUNCTION_FILTER_PART__NEGATE = BOOLEAN_FILTER_PART_FEATURE_COUNT + 1;

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
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_FUNCTION_FILTER_PART___TO_JSON = BOOLEAN_FILTER_PART___TO_JSON;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ARG_FUNCTION_FILTER_PART___APPLY__INTERIMRESULT = BOOLEAN_FILTER_PART___APPLY__INTERIMRESULT;

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
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FILTER_PART___TO_JSON = BOOLEAN_FILTER_PART___TO_JSON;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FILTER_PART___APPLY__INTERIMRESULT = BOOLEAN_FILTER_PART___APPLY__INTERIMRESULT;

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
	 * The number of structural features of the '<em>Two Arg Function Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART_FEATURE_COUNT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART___GET_ARGUMENTS = BOOLEAN_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART___TO_JSON = BOOLEAN_FILTER_PART___TO_JSON;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_ARG_FUNCTION_FILTER_PART___APPLY__INTERIMRESULT = BOOLEAN_FILTER_PART___APPLY__INTERIMRESULT;

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
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FILTER_PART___TO_JSON = BOOLEAN_FILTER_PART___TO_JSON;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FILTER_PART___APPLY__INTERIMRESULT = BOOLEAN_FILTER_PART___APPLY__INTERIMRESULT;

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
	 * The feature id for the '<em><b>Subfilter1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_PART__SUBFILTER1 = BOOLEAN_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subfilter2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_PART__SUBFILTER2 = BOOLEAN_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_PART__OPERATOR = BOOLEAN_FILTER_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_PART__ARGUMENT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Count Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_PART_FEATURE_COUNT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_PART___GET_ARGUMENTS = BOOLEAN_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_PART___TO_JSON = BOOLEAN_FILTER_PART___TO_JSON;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_PART___APPLY__INTERIMRESULT = BOOLEAN_FILTER_PART___APPLY__INTERIMRESULT;

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
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_PART___TO_JSON = JAVA_FILTER_PART___TO_JSON;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_PART___APPLY__INTERIMRESULT = JAVA_FILTER_PART_OPERATION_COUNT + 0;

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
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_ELEMENT___TO_JSON = NUMBER_FILTER_PART___TO_JSON;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_ELEMENT___APPLY__INTERIMRESULT = NUMBER_FILTER_PART___APPLY__INTERIMRESULT;

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
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_ELEMENT__ARGUMENT = NUMBER_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Filter Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_ELEMENT_FEATURE_COUNT = NUMBER_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_ELEMENT___GET_ARGUMENTS = NUMBER_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_ELEMENT___TO_JSON = NUMBER_FILTER_PART___TO_JSON;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_ELEMENT___APPLY__INTERIMRESULT = NUMBER_FILTER_PART___APPLY__INTERIMRESULT;

	/**
	 * The number of operations of the '<em>Number Filter Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FILTER_ELEMENT_OPERATION_COUNT = NUMBER_FILTER_PART_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.NumberValueFilterElementImpl <em>Number Value Filter Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.NumberValueFilterElementImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getNumberValueFilterElement()
	 * @generated
	 */
	int NUMBER_VALUE_FILTER_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FILTER_ELEMENT__NUMBER = NUMBER_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Value Filter Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FILTER_ELEMENT_FEATURE_COUNT = NUMBER_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FILTER_ELEMENT___GET_ARGUMENTS = NUMBER_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FILTER_ELEMENT___TO_JSON = NUMBER_FILTER_PART___TO_JSON;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FILTER_ELEMENT___APPLY__INTERIMRESULT = NUMBER_FILTER_PART___APPLY__INTERIMRESULT;

	/**
	 * The number of operations of the '<em>Number Value Filter Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FILTER_ELEMENT_OPERATION_COUNT = NUMBER_FILTER_PART_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaquery.impl.QuantifierFilterPartImpl <em>Quantifier Filter Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaquery.impl.QuantifierFilterPartImpl
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getQuantifierFilterPart()
	 * @generated
	 */
	int QUANTIFIER_FILTER_PART = 14;

	/**
	 * The feature id for the '<em><b>Subfilter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_FILTER_PART__SUBFILTER = BOOLEAN_FILTER_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_FILTER_PART__ARGUMENT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_FILTER_PART__QUANTIFIER = BOOLEAN_FILTER_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quantifier Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_FILTER_PART_FEATURE_COUNT = BOOLEAN_FILTER_PART_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_FILTER_PART___GET_ARGUMENTS = BOOLEAN_FILTER_PART___GET_ARGUMENTS;

	/**
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_FILTER_PART___TO_JSON = BOOLEAN_FILTER_PART___TO_JSON;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_FILTER_PART___APPLY__INTERIMRESULT = BOOLEAN_FILTER_PART___APPLY__INTERIMRESULT;

	/**
	 * The number of operations of the '<em>Quantifier Filter Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_FILTER_PART_OPERATION_COUNT = BOOLEAN_FILTER_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>String List Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getStringListWrapper()
	 * @generated
	 */
	int STRING_LIST_WRAPPER = 15;


	/**
	 * The meta object id for the '<em>Object List Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getObjectListWrapper()
	 * @generated
	 */
	int OBJECT_LIST_WRAPPER = 16;

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
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.javaquery.JavaFilter#getInterimResults <em>Interim Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interim Results</em>'.
	 * @see qualitypatternmodel.javaquery.JavaFilter#getInterimResults()
	 * @see #getJavaFilter()
	 * @generated
	 */
	EReference getJavaFilter_InterimResults();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaquery.JavaFilter#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see qualitypatternmodel.javaquery.JavaFilter#getQuery()
	 * @see #getJavaFilter()
	 * @generated
	 */
	EAttribute getJavaFilter_Query();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaquery.JavaFilter#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see qualitypatternmodel.javaquery.JavaFilter#getLanguage()
	 * @see #getJavaFilter()
	 * @generated
	 */
	EAttribute getJavaFilter_Language();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaquery.JavaFilter#getPatternName <em>Pattern Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Name</em>'.
	 * @see qualitypatternmodel.javaquery.JavaFilter#getPatternName()
	 * @see #getJavaFilter()
	 * @generated
	 */
	EAttribute getJavaFilter_PatternName();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaquery.JavaFilter#getPatternId <em>Pattern Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Id</em>'.
	 * @see qualitypatternmodel.javaquery.JavaFilter#getPatternId()
	 * @see #getJavaFilter()
	 * @generated
	 */
	EAttribute getJavaFilter_PatternId();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaquery.JavaFilter#filterQueryResults() <em>Filter Query Results</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter Query Results</em>' operation.
	 * @see qualitypatternmodel.javaquery.JavaFilter#filterQueryResults()
	 * @generated
	 */
	EOperation getJavaFilter__FilterQueryResults();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaquery.JavaFilter#createInterimResultContainer(java.util.List) <em>Create Interim Result Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Interim Result Container</em>' operation.
	 * @see qualitypatternmodel.javaquery.JavaFilter#createInterimResultContainer(java.util.List)
	 * @generated
	 */
	EOperation getJavaFilter__CreateInterimResultContainer__List();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaquery.JavaFilter#executeXQueryJava(java.lang.String) <em>Execute XQuery Java</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute XQuery Java</em>' operation.
	 * @see qualitypatternmodel.javaquery.JavaFilter#executeXQueryJava(java.lang.String)
	 * @generated
	 */
	EOperation getJavaFilter__ExecuteXQueryJava__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaquery.JavaFilter#execute(java.lang.String) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see qualitypatternmodel.javaquery.JavaFilter#execute(java.lang.String)
	 * @generated
	 */
	EOperation getJavaFilter__Execute__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaquery.JavaFilter#toJson() <em>To Json</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Json</em>' operation.
	 * @see qualitypatternmodel.javaquery.JavaFilter#toJson()
	 * @generated
	 */
	EOperation getJavaFilter__ToJson();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.javaquery.JavaFilterPart#toJson() <em>To Json</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Json</em>' operation.
	 * @see qualitypatternmodel.javaquery.JavaFilterPart#toJson()
	 * @generated
	 */
	EOperation getJavaFilterPart__ToJson();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.NumberValueFilterElement <em>Number Value Filter Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Value Filter Element</em>'.
	 * @see qualitypatternmodel.javaquery.NumberValueFilterElement
	 * @generated
	 */
	EClass getNumberValueFilterElement();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaquery.NumberValueFilterElement#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see qualitypatternmodel.javaquery.NumberValueFilterElement#getNumber()
	 * @see #getNumberValueFilterElement()
	 * @generated
	 */
	EAttribute getNumberValueFilterElement_Number();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaquery.QuantifierFilterPart <em>Quantifier Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantifier Filter Part</em>'.
	 * @see qualitypatternmodel.javaquery.QuantifierFilterPart
	 * @generated
	 */
	EClass getQuantifierFilterPart();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.javaquery.QuantifierFilterPart#getSubfilter <em>Subfilter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subfilter</em>'.
	 * @see qualitypatternmodel.javaquery.QuantifierFilterPart#getSubfilter()
	 * @see #getQuantifierFilterPart()
	 * @generated
	 */
	EReference getQuantifierFilterPart_Subfilter();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaquery.QuantifierFilterPart#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument</em>'.
	 * @see qualitypatternmodel.javaquery.QuantifierFilterPart#getArgument()
	 * @see #getQuantifierFilterPart()
	 * @generated
	 */
	EReference getQuantifierFilterPart_Argument();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaquery.QuantifierFilterPart#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier</em>'.
	 * @see qualitypatternmodel.javaquery.QuantifierFilterPart#getQuantifier()
	 * @see #getQuantifierFilterPart()
	 * @generated
	 */
	EAttribute getQuantifierFilterPart_Quantifier();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>String List Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String List Wrapper</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List&lt;java.lang.Object&gt;"
	 * @generated
	 */
	EDataType getStringListWrapper();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Object List Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object List Wrapper</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List&lt;java.lang.Object&gt;"
	 * @generated
	 */
	EDataType getObjectListWrapper();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.javaquery.BooleanFilterPart#apply(qualitypatternmodel.javaqueryoutput.InterimResult) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see qualitypatternmodel.javaquery.BooleanFilterPart#apply(qualitypatternmodel.javaqueryoutput.InterimResult)
	 * @generated
	 */
	EOperation getBooleanFilterPart__Apply__InterimResult();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#isNegate <em>Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negate</em>'.
	 * @see qualitypatternmodel.javaquery.OneArgFunctionFilterPart#isNegate()
	 * @see #getOneArgFunctionFilterPart()
	 * @generated
	 */
	EAttribute getOneArgFunctionFilterPart_Negate();

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
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaquery.CountFilterPart#getSubfilter1 <em>Subfilter1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subfilter1</em>'.
	 * @see qualitypatternmodel.javaquery.CountFilterPart#getSubfilter1()
	 * @see #getCountFilterPart()
	 * @generated
	 */
	EReference getCountFilterPart_Subfilter1();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaquery.CountFilterPart#getSubfilter2 <em>Subfilter2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subfilter2</em>'.
	 * @see qualitypatternmodel.javaquery.CountFilterPart#getSubfilter2()
	 * @see #getCountFilterPart()
	 * @generated
	 */
	EReference getCountFilterPart_Subfilter2();

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
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaquery.CountFilterPart#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument</em>'.
	 * @see qualitypatternmodel.javaquery.CountFilterPart#getArgument()
	 * @see #getCountFilterPart()
	 * @generated
	 */
	EReference getCountFilterPart_Argument();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.javaquery.NumberFilterPart#apply(qualitypatternmodel.javaqueryoutput.InterimResult) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see qualitypatternmodel.javaquery.NumberFilterPart#apply(qualitypatternmodel.javaqueryoutput.InterimResult)
	 * @generated
	 */
	EOperation getNumberFilterPart__Apply__InterimResult();

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
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaquery.NumberFilterElement#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument</em>'.
	 * @see qualitypatternmodel.javaquery.NumberFilterElement#getArgument()
	 * @see #getNumberFilterElement()
	 * @generated
	 */
	EReference getNumberFilterElement_Argument();

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
		 * The meta object literal for the '<em><b>Interim Results</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_FILTER__INTERIM_RESULTS = eINSTANCE.getJavaFilter_InterimResults();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_FILTER__QUERY = eINSTANCE.getJavaFilter_Query();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_FILTER__LANGUAGE = eINSTANCE.getJavaFilter_Language();

		/**
		 * The meta object literal for the '<em><b>Pattern Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_FILTER__PATTERN_NAME = eINSTANCE.getJavaFilter_PatternName();

		/**
		 * The meta object literal for the '<em><b>Pattern Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_FILTER__PATTERN_ID = eINSTANCE.getJavaFilter_PatternId();

		/**
		 * The meta object literal for the '<em><b>Filter Query Results</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA_FILTER___FILTER_QUERY_RESULTS = eINSTANCE.getJavaFilter__FilterQueryResults();

		/**
		 * The meta object literal for the '<em><b>Create Interim Result Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA_FILTER___CREATE_INTERIM_RESULT_CONTAINER__LIST = eINSTANCE.getJavaFilter__CreateInterimResultContainer__List();

		/**
		 * The meta object literal for the '<em><b>Execute XQuery Java</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA_FILTER___EXECUTE_XQUERY_JAVA__STRING = eINSTANCE.getJavaFilter__ExecuteXQueryJava__String();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA_FILTER___EXECUTE__STRING = eINSTANCE.getJavaFilter__Execute__String();

		/**
		 * The meta object literal for the '<em><b>To Json</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA_FILTER___TO_JSON = eINSTANCE.getJavaFilter__ToJson();

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
		 * The meta object literal for the '<em><b>To Json</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA_FILTER_PART___TO_JSON = eINSTANCE.getJavaFilterPart__ToJson();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.NumberValueFilterElementImpl <em>Number Value Filter Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.NumberValueFilterElementImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getNumberValueFilterElement()
		 * @generated
		 */
		EClass NUMBER_VALUE_FILTER_ELEMENT = eINSTANCE.getNumberValueFilterElement();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VALUE_FILTER_ELEMENT__NUMBER = eINSTANCE.getNumberValueFilterElement_Number();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaquery.impl.QuantifierFilterPartImpl <em>Quantifier Filter Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaquery.impl.QuantifierFilterPartImpl
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getQuantifierFilterPart()
		 * @generated
		 */
		EClass QUANTIFIER_FILTER_PART = eINSTANCE.getQuantifierFilterPart();

		/**
		 * The meta object literal for the '<em><b>Subfilter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIER_FILTER_PART__SUBFILTER = eINSTANCE.getQuantifierFilterPart_Subfilter();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIER_FILTER_PART__ARGUMENT = eINSTANCE.getQuantifierFilterPart_Argument();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIER_FILTER_PART__QUANTIFIER = eINSTANCE.getQuantifierFilterPart_Quantifier();

		/**
		 * The meta object literal for the '<em>String List Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getStringListWrapper()
		 * @generated
		 */
		EDataType STRING_LIST_WRAPPER = eINSTANCE.getStringListWrapper();

		/**
		 * The meta object literal for the '<em>Object List Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl#getObjectListWrapper()
		 * @generated
		 */
		EDataType OBJECT_LIST_WRAPPER = eINSTANCE.getObjectListWrapper();

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
		EOperation BOOLEAN_FILTER_PART___APPLY__INTERIMRESULT = eINSTANCE.getBooleanFilterPart__Apply__InterimResult();

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
		 * The meta object literal for the '<em><b>Negate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_ARG_FUNCTION_FILTER_PART__NEGATE = eINSTANCE.getOneArgFunctionFilterPart_Negate();

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
		 * The meta object literal for the '<em><b>Subfilter1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_FILTER_PART__SUBFILTER1 = eINSTANCE.getCountFilterPart_Subfilter1();

		/**
		 * The meta object literal for the '<em><b>Subfilter2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_FILTER_PART__SUBFILTER2 = eINSTANCE.getCountFilterPart_Subfilter2();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNT_FILTER_PART__OPERATOR = eINSTANCE.getCountFilterPart_Operator();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_FILTER_PART__ARGUMENT = eINSTANCE.getCountFilterPart_Argument();

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
		EOperation NUMBER_FILTER_PART___APPLY__INTERIMRESULT = eINSTANCE.getNumberFilterPart__Apply__InterimResult();

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

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_FILTER_ELEMENT__ARGUMENT = eINSTANCE.getNumberFilterElement_Argument();

	}

} //JavaqueryPackage

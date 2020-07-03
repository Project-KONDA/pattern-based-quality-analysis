/**
 */
package qualitypatternmodel.execution;

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
 * @see qualitypatternmodel.execution.ExecutionFactory
 * @model kind="package"
 * @generated
 */
public interface ExecutionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "execution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "execution";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "execution";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExecutionPackage eINSTANCE = qualitypatternmodel.execution.impl.ExecutionPackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.DatabaseImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__RESULTS = 0;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PATTERNS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Count Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE___COUNT_MATCHES__COMPLETEPATTERN = 1;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.ResultImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 1;

	/**
	 * The feature id for the '<em><b>Database</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PERSON = 2;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__START_DATE = 3;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__RUNTIME = 4;

	/**
	 * The feature id for the '<em><b>Problem Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PROBLEM_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__END_DATE = 6;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PATTERN = 7;

	/**
	 * The feature id for the '<em><b>Match Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__MATCH_NUMBER = 8;

	/**
	 * The feature id for the '<em><b>Split Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__SPLIT_RESULT = 9;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Export</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___EXPORT__STRING = 0;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.XmlResultImpl <em>Xml Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.XmlResultImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getXmlResult()
	 * @generated
	 */
	int XML_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Database</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_RESULT__DATABASE = RESULT__DATABASE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_RESULT__NAME = RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_RESULT__PERSON = RESULT__PERSON;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_RESULT__START_DATE = RESULT__START_DATE;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_RESULT__RUNTIME = RESULT__RUNTIME;

	/**
	 * The feature id for the '<em><b>Problem Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_RESULT__PROBLEM_NUMBER = RESULT__PROBLEM_NUMBER;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_RESULT__END_DATE = RESULT__END_DATE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_RESULT__PATTERN = RESULT__PATTERN;

	/**
	 * The feature id for the '<em><b>Match Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_RESULT__MATCH_NUMBER = RESULT__MATCH_NUMBER;

	/**
	 * The feature id for the '<em><b>Split Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_RESULT__SPLIT_RESULT = RESULT__SPLIT_RESULT;

	/**
	 * The number of structural features of the '<em>Xml Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_RESULT_FEATURE_COUNT = RESULT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Export</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_RESULT___EXPORT__STRING = RESULT___EXPORT__STRING;

	/**
	 * The number of operations of the '<em>Xml Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_RESULT_OPERATION_COUNT = RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.XmlDatabaseImpl <em>Xml Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.XmlDatabaseImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getXmlDatabase()
	 * @generated
	 */
	int XML_DATABASE = 3;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE__RESULTS = DATABASE__RESULTS;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE__PATTERNS = DATABASE__PATTERNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE__NAME = DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE__CONTEXT = DATABASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE__ELEMENT_NAMES = DATABASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE__ATTRIBUTE_NAMES = DATABASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Recorded Attribute Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE__RECORDED_ATTRIBUTE_VALUES = DATABASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Recorded Data Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE__RECORDED_DATA_VALUES = DATABASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Xml Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE_FEATURE_COUNT = DATABASE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING = DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING;

	/**
	 * The operation id for the '<em>Count Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___COUNT_MATCHES__COMPLETEPATTERN = DATABASE___COUNT_MATCHES__COMPLETEPATTERN;

	/**
	 * The operation id for the '<em>Analyse Database</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___ANALYSE_DATABASE = DATABASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Analyse Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___ANALYSE_SCHEMA = DATABASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Record Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING = DATABASE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Record Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___RECORD_DATA_VALUE__STRING = DATABASE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING = DATABASE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Remove Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___REMOVE_DATA_VALUE__STRING = DATABASE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___INIT = DATABASE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___OPEN = DATABASE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Record Element Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___RECORD_ELEMENT_NAME__STRING = DATABASE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Record Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___RECORD_ATTRIBUTE_NAME__STRING = DATABASE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Remove Element Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___REMOVE_ELEMENT_NAME__STRING = DATABASE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Remove Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING = DATABASE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Check Key Ref In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING = DATABASE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check Child In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING = DATABASE_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Xml Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE_OPERATION_COUNT = DATABASE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.LocalXmlDatabaseImpl <em>Local Xml Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.LocalXmlDatabaseImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getLocalXmlDatabase()
	 * @generated
	 */
	int LOCAL_XML_DATABASE = 4;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE__RESULTS = XML_DATABASE__RESULTS;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE__PATTERNS = XML_DATABASE__PATTERNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE__NAME = XML_DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE__CONTEXT = XML_DATABASE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Element Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE__ELEMENT_NAMES = XML_DATABASE__ELEMENT_NAMES;

	/**
	 * The feature id for the '<em><b>Attribute Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE__ATTRIBUTE_NAMES = XML_DATABASE__ATTRIBUTE_NAMES;

	/**
	 * The feature id for the '<em><b>Recorded Attribute Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE__RECORDED_ATTRIBUTE_VALUES = XML_DATABASE__RECORDED_ATTRIBUTE_VALUES;

	/**
	 * The feature id for the '<em><b>Recorded Data Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE__RECORDED_DATA_VALUES = XML_DATABASE__RECORDED_DATA_VALUES;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE__DATA_PATH = XML_DATABASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE__SCHEMA_PATH = XML_DATABASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Local Xml Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE_FEATURE_COUNT = XML_DATABASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING = XML_DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING;

	/**
	 * The operation id for the '<em>Count Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___COUNT_MATCHES__COMPLETEPATTERN = XML_DATABASE___COUNT_MATCHES__COMPLETEPATTERN;

	/**
	 * The operation id for the '<em>Analyse Database</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___ANALYSE_DATABASE = XML_DATABASE___ANALYSE_DATABASE;

	/**
	 * The operation id for the '<em>Analyse Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___ANALYSE_SCHEMA = XML_DATABASE___ANALYSE_SCHEMA;

	/**
	 * The operation id for the '<em>Record Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING = XML_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Record Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___RECORD_DATA_VALUE__STRING = XML_DATABASE___RECORD_DATA_VALUE__STRING;

	/**
	 * The operation id for the '<em>Remove Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING = XML_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Remove Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___REMOVE_DATA_VALUE__STRING = XML_DATABASE___REMOVE_DATA_VALUE__STRING;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___INIT = XML_DATABASE___INIT;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___OPEN = XML_DATABASE___OPEN;

	/**
	 * The operation id for the '<em>Record Element Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___RECORD_ELEMENT_NAME__STRING = XML_DATABASE___RECORD_ELEMENT_NAME__STRING;

	/**
	 * The operation id for the '<em>Record Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___RECORD_ATTRIBUTE_NAME__STRING = XML_DATABASE___RECORD_ATTRIBUTE_NAME__STRING;

	/**
	 * The operation id for the '<em>Remove Element Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___REMOVE_ELEMENT_NAME__STRING = XML_DATABASE___REMOVE_ELEMENT_NAME__STRING;

	/**
	 * The operation id for the '<em>Remove Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING = XML_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING;

	/**
	 * The operation id for the '<em>Check Key Ref In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING = XML_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Child In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING = XML_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE___CREATE = XML_DATABASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Xml Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATABASE_OPERATION_COUNT = XML_DATABASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.ServerXmlDatabaseImpl <em>Server Xml Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.ServerXmlDatabaseImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getServerXmlDatabase()
	 * @generated
	 */
	int SERVER_XML_DATABASE = 5;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE__RESULTS = XML_DATABASE__RESULTS;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE__PATTERNS = XML_DATABASE__PATTERNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE__NAME = XML_DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE__CONTEXT = XML_DATABASE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Element Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE__ELEMENT_NAMES = XML_DATABASE__ELEMENT_NAMES;

	/**
	 * The feature id for the '<em><b>Attribute Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE__ATTRIBUTE_NAMES = XML_DATABASE__ATTRIBUTE_NAMES;

	/**
	 * The feature id for the '<em><b>Recorded Attribute Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE__RECORDED_ATTRIBUTE_VALUES = XML_DATABASE__RECORDED_ATTRIBUTE_VALUES;

	/**
	 * The feature id for the '<em><b>Recorded Data Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE__RECORDED_DATA_VALUES = XML_DATABASE__RECORDED_DATA_VALUES;

	/**
	 * The number of structural features of the '<em>Server Xml Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE_FEATURE_COUNT = XML_DATABASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING = XML_DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING;

	/**
	 * The operation id for the '<em>Count Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___COUNT_MATCHES__COMPLETEPATTERN = XML_DATABASE___COUNT_MATCHES__COMPLETEPATTERN;

	/**
	 * The operation id for the '<em>Analyse Database</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___ANALYSE_DATABASE = XML_DATABASE___ANALYSE_DATABASE;

	/**
	 * The operation id for the '<em>Analyse Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___ANALYSE_SCHEMA = XML_DATABASE___ANALYSE_SCHEMA;

	/**
	 * The operation id for the '<em>Record Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING = XML_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Record Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___RECORD_DATA_VALUE__STRING = XML_DATABASE___RECORD_DATA_VALUE__STRING;

	/**
	 * The operation id for the '<em>Remove Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING = XML_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Remove Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___REMOVE_DATA_VALUE__STRING = XML_DATABASE___REMOVE_DATA_VALUE__STRING;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___INIT = XML_DATABASE___INIT;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___OPEN = XML_DATABASE___OPEN;

	/**
	 * The operation id for the '<em>Record Element Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___RECORD_ELEMENT_NAME__STRING = XML_DATABASE___RECORD_ELEMENT_NAME__STRING;

	/**
	 * The operation id for the '<em>Record Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___RECORD_ATTRIBUTE_NAME__STRING = XML_DATABASE___RECORD_ATTRIBUTE_NAME__STRING;

	/**
	 * The operation id for the '<em>Remove Element Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___REMOVE_ELEMENT_NAME__STRING = XML_DATABASE___REMOVE_ELEMENT_NAME__STRING;

	/**
	 * The operation id for the '<em>Remove Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING = XML_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING;

	/**
	 * The operation id for the '<em>Check Key Ref In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING = XML_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Child In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING = XML_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING;

	/**
	 * The number of operations of the '<em>Server Xml Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATABASE_OPERATION_COUNT = XML_DATABASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.DatabasesImpl <em>Databases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.DatabasesImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getDatabases()
	 * @generated
	 */
	int DATABASES = 6;

	/**
	 * The feature id for the '<em><b>Xml Databases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASES__XML_DATABASES = 0;

	/**
	 * The number of structural features of the '<em>Databases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Databases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.StringToIntMapImpl <em>String To Int Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.StringToIntMapImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getStringToIntMap()
	 * @generated
	 */
	int STRING_TO_INT_MAP = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_INT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_INT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Int Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_INT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Int Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_INT_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Base XException Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.basex.core.BaseXException
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getBaseXExceptionWrapper()
	 * @generated
	 */
	int BASE_XEXCEPTION_WRAPPER = 8;

	/**
	 * The meta object id for the '<em>Base XContext Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.basex.core.Context
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getBaseXContextWrapper()
	 * @generated
	 */
	int BASE_XCONTEXT_WRAPPER = 9;


	/**
	 * The meta object id for the '<em>Query Exception Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.basex.query.QueryException
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getQueryExceptionWrapper()
	 * @generated
	 */
	int QUERY_EXCEPTION_WRAPPER = 10;


	/**
	 * The meta object id for the '<em>Query IO Exception Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.basex.query.QueryIOException
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getQueryIOExceptionWrapper()
	 * @generated
	 */
	int QUERY_IO_EXCEPTION_WRAPPER = 11;


	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.execution.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see qualitypatternmodel.execution.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.execution.Database#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see qualitypatternmodel.execution.Database#getResults()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Results();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.execution.Database#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Patterns</em>'.
	 * @see qualitypatternmodel.execution.Database#getPatterns()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Patterns();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.Database#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qualitypatternmodel.execution.Database#getName()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Name();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.Database#execute(qualitypatternmodel.patternstructure.CompletePattern, java.lang.String, java.lang.String) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see qualitypatternmodel.execution.Database#execute(qualitypatternmodel.patternstructure.CompletePattern, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDatabase__Execute__CompletePattern_String_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.Database#countMatches(qualitypatternmodel.patternstructure.CompletePattern) <em>Count Matches</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count Matches</em>' operation.
	 * @see qualitypatternmodel.execution.Database#countMatches(qualitypatternmodel.patternstructure.CompletePattern)
	 * @generated
	 */
	EOperation getDatabase__CountMatches__CompletePattern();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.execution.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see qualitypatternmodel.execution.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.execution.Result#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Database</em>'.
	 * @see qualitypatternmodel.execution.Result#getDatabase()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Database();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.Result#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qualitypatternmodel.execution.Result#getName()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Name();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.Result#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person</em>'.
	 * @see qualitypatternmodel.execution.Result#getPerson()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Person();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.Result#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see qualitypatternmodel.execution.Result#getStartDate()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.Result#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime</em>'.
	 * @see qualitypatternmodel.execution.Result#getRuntime()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Runtime();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.Result#getProblemNumber <em>Problem Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Problem Number</em>'.
	 * @see qualitypatternmodel.execution.Result#getProblemNumber()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_ProblemNumber();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.Result#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see qualitypatternmodel.execution.Result#getEndDate()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_EndDate();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.execution.Result#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pattern</em>'.
	 * @see qualitypatternmodel.execution.Result#getPattern()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.Result#getMatchNumber <em>Match Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Number</em>'.
	 * @see qualitypatternmodel.execution.Result#getMatchNumber()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_MatchNumber();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.execution.Result#getSplitResult <em>Split Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Split Result</em>'.
	 * @see qualitypatternmodel.execution.Result#getSplitResult()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_SplitResult();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.Result#export(java.lang.String) <em>Export</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Export</em>' operation.
	 * @see qualitypatternmodel.execution.Result#export(java.lang.String)
	 * @generated
	 */
	EOperation getResult__Export__String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.execution.XmlResult <em>Xml Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Result</em>'.
	 * @see qualitypatternmodel.execution.XmlResult
	 * @generated
	 */
	EClass getXmlResult();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.execution.XmlDatabase <em>Xml Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Database</em>'.
	 * @see qualitypatternmodel.execution.XmlDatabase
	 * @generated
	 */
	EClass getXmlDatabase();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.XmlDatabase#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see qualitypatternmodel.execution.XmlDatabase#getContext()
	 * @see #getXmlDatabase()
	 * @generated
	 */
	EAttribute getXmlDatabase_Context();

	/**
	 * Returns the meta object for the map '{@link qualitypatternmodel.execution.XmlDatabase#getElementNames <em>Element Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Element Names</em>'.
	 * @see qualitypatternmodel.execution.XmlDatabase#getElementNames()
	 * @see #getXmlDatabase()
	 * @generated
	 */
	EReference getXmlDatabase_ElementNames();

	/**
	 * Returns the meta object for the map '{@link qualitypatternmodel.execution.XmlDatabase#getAttributeNames <em>Attribute Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Attribute Names</em>'.
	 * @see qualitypatternmodel.execution.XmlDatabase#getAttributeNames()
	 * @see #getXmlDatabase()
	 * @generated
	 */
	EReference getXmlDatabase_AttributeNames();

	/**
	 * Returns the meta object for the map '{@link qualitypatternmodel.execution.XmlDatabase#getRecordedAttributeValues <em>Recorded Attribute Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Recorded Attribute Values</em>'.
	 * @see qualitypatternmodel.execution.XmlDatabase#getRecordedAttributeValues()
	 * @see #getXmlDatabase()
	 * @generated
	 */
	EReference getXmlDatabase_RecordedAttributeValues();

	/**
	 * Returns the meta object for the map '{@link qualitypatternmodel.execution.XmlDatabase#getRecordedDataValues <em>Recorded Data Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Recorded Data Values</em>'.
	 * @see qualitypatternmodel.execution.XmlDatabase#getRecordedDataValues()
	 * @see #getXmlDatabase()
	 * @generated
	 */
	EReference getXmlDatabase_RecordedDataValues();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#analyseDatabase() <em>Analyse Database</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Analyse Database</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#analyseDatabase()
	 * @generated
	 */
	EOperation getXmlDatabase__AnalyseDatabase();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#analyseSchema() <em>Analyse Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Analyse Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#analyseSchema()
	 * @generated
	 */
	EOperation getXmlDatabase__AnalyseSchema();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#recordAttributeValue(java.lang.String) <em>Record Attribute Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Record Attribute Value</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#recordAttributeValue(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDatabase__RecordAttributeValue__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#recordDataValue(java.lang.String) <em>Record Data Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Record Data Value</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#recordDataValue(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDatabase__RecordDataValue__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#removeAttributeValue(java.lang.String) <em>Remove Attribute Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Attribute Value</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#removeAttributeValue(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDatabase__RemoveAttributeValue__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#removeDataValue(java.lang.String) <em>Remove Data Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Data Value</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#removeDataValue(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDatabase__RemoveDataValue__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#init()
	 * @generated
	 */
	EOperation getXmlDatabase__Init();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#open() <em>Open</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#open()
	 * @generated
	 */
	EOperation getXmlDatabase__Open();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#recordElementName(java.lang.String) <em>Record Element Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Record Element Name</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#recordElementName(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDatabase__RecordElementName__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#recordAttributeName(java.lang.String) <em>Record Attribute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Record Attribute Name</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#recordAttributeName(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDatabase__RecordAttributeName__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#removeElementName(java.lang.String) <em>Remove Element Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Element Name</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#removeElementName(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDatabase__RemoveElementName__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#removeAttributeName(java.lang.String) <em>Remove Attribute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Attribute Name</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#removeAttributeName(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDatabase__RemoveAttributeName__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#checkKeyRefInSchema(java.lang.String, java.lang.String) <em>Check Key Ref In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Key Ref In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#checkKeyRefInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getXmlDatabase__CheckKeyRefInSchema__String_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#checkChildInSchema(java.lang.String, java.lang.String) <em>Check Child In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Child In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#checkChildInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getXmlDatabase__CheckChildInSchema__String_String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.execution.LocalXmlDatabase <em>Local Xml Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Xml Database</em>'.
	 * @see qualitypatternmodel.execution.LocalXmlDatabase
	 * @generated
	 */
	EClass getLocalXmlDatabase();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.LocalXmlDatabase#getDataPath <em>Data Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Path</em>'.
	 * @see qualitypatternmodel.execution.LocalXmlDatabase#getDataPath()
	 * @see #getLocalXmlDatabase()
	 * @generated
	 */
	EAttribute getLocalXmlDatabase_DataPath();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.LocalXmlDatabase#getSchemaPath <em>Schema Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Path</em>'.
	 * @see qualitypatternmodel.execution.LocalXmlDatabase#getSchemaPath()
	 * @see #getLocalXmlDatabase()
	 * @generated
	 */
	EAttribute getLocalXmlDatabase_SchemaPath();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.LocalXmlDatabase#create() <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see qualitypatternmodel.execution.LocalXmlDatabase#create()
	 * @generated
	 */
	EOperation getLocalXmlDatabase__Create();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.execution.ServerXmlDatabase <em>Server Xml Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Xml Database</em>'.
	 * @see qualitypatternmodel.execution.ServerXmlDatabase
	 * @generated
	 */
	EClass getServerXmlDatabase();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.execution.Databases <em>Databases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Databases</em>'.
	 * @see qualitypatternmodel.execution.Databases
	 * @generated
	 */
	EClass getDatabases();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.execution.Databases#getXmlDatabases <em>Xml Databases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xml Databases</em>'.
	 * @see qualitypatternmodel.execution.Databases#getXmlDatabases()
	 * @see #getDatabases()
	 * @generated
	 */
	EReference getDatabases_XmlDatabases();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Int Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Int Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EIntegerObject"
	 * @generated
	 */
	EClass getStringToIntMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToIntMap()
	 * @generated
	 */
	EAttribute getStringToIntMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToIntMap()
	 * @generated
	 */
	EAttribute getStringToIntMap_Value();

	/**
	 * Returns the meta object for data type '{@link org.basex.core.BaseXException <em>Base XException Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Base XException Wrapper</em>'.
	 * @see org.basex.core.BaseXException
	 * @model instanceClass="org.basex.core.BaseXException"
	 * @generated
	 */
	EDataType getBaseXExceptionWrapper();

	/**
	 * Returns the meta object for data type '{@link org.basex.core.Context <em>Base XContext Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Base XContext Wrapper</em>'.
	 * @see org.basex.core.Context
	 * @model instanceClass="org.basex.core.Context"
	 * @generated
	 */
	EDataType getBaseXContextWrapper();

	/**
	 * Returns the meta object for data type '{@link org.basex.query.QueryException <em>Query Exception Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Query Exception Wrapper</em>'.
	 * @see org.basex.query.QueryException
	 * @model instanceClass="org.basex.query.QueryException"
	 * @generated
	 */
	EDataType getQueryExceptionWrapper();

	/**
	 * Returns the meta object for data type '{@link org.basex.query.QueryIOException <em>Query IO Exception Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Query IO Exception Wrapper</em>'.
	 * @see org.basex.query.QueryIOException
	 * @model instanceClass="org.basex.query.QueryIOException"
	 * @generated
	 */
	EDataType getQueryIOExceptionWrapper();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExecutionFactory getExecutionFactory();

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
		 * The meta object literal for the '{@link qualitypatternmodel.execution.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.DatabaseImpl
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__RESULTS = eINSTANCE.getDatabase_Results();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__PATTERNS = eINSTANCE.getDatabase_Patterns();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__NAME = eINSTANCE.getDatabase_Name();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING = eINSTANCE.getDatabase__Execute__CompletePattern_String_String();

		/**
		 * The meta object literal for the '<em><b>Count Matches</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE___COUNT_MATCHES__COMPLETEPATTERN = eINSTANCE.getDatabase__CountMatches__CompletePattern();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.execution.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.ResultImpl
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__DATABASE = eINSTANCE.getResult_Database();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__NAME = eINSTANCE.getResult_Name();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__PERSON = eINSTANCE.getResult_Person();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__START_DATE = eINSTANCE.getResult_StartDate();

		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__RUNTIME = eINSTANCE.getResult_Runtime();

		/**
		 * The meta object literal for the '<em><b>Problem Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__PROBLEM_NUMBER = eINSTANCE.getResult_ProblemNumber();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__END_DATE = eINSTANCE.getResult_EndDate();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__PATTERN = eINSTANCE.getResult_Pattern();

		/**
		 * The meta object literal for the '<em><b>Match Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__MATCH_NUMBER = eINSTANCE.getResult_MatchNumber();

		/**
		 * The meta object literal for the '<em><b>Split Result</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__SPLIT_RESULT = eINSTANCE.getResult_SplitResult();

		/**
		 * The meta object literal for the '<em><b>Export</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___EXPORT__STRING = eINSTANCE.getResult__Export__String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.execution.impl.XmlResultImpl <em>Xml Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.XmlResultImpl
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getXmlResult()
		 * @generated
		 */
		EClass XML_RESULT = eINSTANCE.getXmlResult();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.execution.impl.XmlDatabaseImpl <em>Xml Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.XmlDatabaseImpl
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getXmlDatabase()
		 * @generated
		 */
		EClass XML_DATABASE = eINSTANCE.getXmlDatabase();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_DATABASE__CONTEXT = eINSTANCE.getXmlDatabase_Context();

		/**
		 * The meta object literal for the '<em><b>Element Names</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_DATABASE__ELEMENT_NAMES = eINSTANCE.getXmlDatabase_ElementNames();

		/**
		 * The meta object literal for the '<em><b>Attribute Names</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_DATABASE__ATTRIBUTE_NAMES = eINSTANCE.getXmlDatabase_AttributeNames();

		/**
		 * The meta object literal for the '<em><b>Recorded Attribute Values</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_DATABASE__RECORDED_ATTRIBUTE_VALUES = eINSTANCE.getXmlDatabase_RecordedAttributeValues();

		/**
		 * The meta object literal for the '<em><b>Recorded Data Values</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_DATABASE__RECORDED_DATA_VALUES = eINSTANCE.getXmlDatabase_RecordedDataValues();

		/**
		 * The meta object literal for the '<em><b>Analyse Database</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___ANALYSE_DATABASE = eINSTANCE.getXmlDatabase__AnalyseDatabase();

		/**
		 * The meta object literal for the '<em><b>Analyse Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___ANALYSE_SCHEMA = eINSTANCE.getXmlDatabase__AnalyseSchema();

		/**
		 * The meta object literal for the '<em><b>Record Attribute Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING = eINSTANCE.getXmlDatabase__RecordAttributeValue__String();

		/**
		 * The meta object literal for the '<em><b>Record Data Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___RECORD_DATA_VALUE__STRING = eINSTANCE.getXmlDatabase__RecordDataValue__String();

		/**
		 * The meta object literal for the '<em><b>Remove Attribute Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING = eINSTANCE.getXmlDatabase__RemoveAttributeValue__String();

		/**
		 * The meta object literal for the '<em><b>Remove Data Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___REMOVE_DATA_VALUE__STRING = eINSTANCE.getXmlDatabase__RemoveDataValue__String();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___INIT = eINSTANCE.getXmlDatabase__Init();

		/**
		 * The meta object literal for the '<em><b>Open</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___OPEN = eINSTANCE.getXmlDatabase__Open();

		/**
		 * The meta object literal for the '<em><b>Record Element Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___RECORD_ELEMENT_NAME__STRING = eINSTANCE.getXmlDatabase__RecordElementName__String();

		/**
		 * The meta object literal for the '<em><b>Record Attribute Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___RECORD_ATTRIBUTE_NAME__STRING = eINSTANCE.getXmlDatabase__RecordAttributeName__String();

		/**
		 * The meta object literal for the '<em><b>Remove Element Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___REMOVE_ELEMENT_NAME__STRING = eINSTANCE.getXmlDatabase__RemoveElementName__String();

		/**
		 * The meta object literal for the '<em><b>Remove Attribute Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING = eINSTANCE.getXmlDatabase__RemoveAttributeName__String();

		/**
		 * The meta object literal for the '<em><b>Check Key Ref In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING = eINSTANCE.getXmlDatabase__CheckKeyRefInSchema__String_String();

		/**
		 * The meta object literal for the '<em><b>Check Child In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING = eINSTANCE.getXmlDatabase__CheckChildInSchema__String_String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.execution.impl.LocalXmlDatabaseImpl <em>Local Xml Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.LocalXmlDatabaseImpl
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getLocalXmlDatabase()
		 * @generated
		 */
		EClass LOCAL_XML_DATABASE = eINSTANCE.getLocalXmlDatabase();

		/**
		 * The meta object literal for the '<em><b>Data Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_XML_DATABASE__DATA_PATH = eINSTANCE.getLocalXmlDatabase_DataPath();

		/**
		 * The meta object literal for the '<em><b>Schema Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_XML_DATABASE__SCHEMA_PATH = eINSTANCE.getLocalXmlDatabase_SchemaPath();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCAL_XML_DATABASE___CREATE = eINSTANCE.getLocalXmlDatabase__Create();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.execution.impl.ServerXmlDatabaseImpl <em>Server Xml Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.ServerXmlDatabaseImpl
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getServerXmlDatabase()
		 * @generated
		 */
		EClass SERVER_XML_DATABASE = eINSTANCE.getServerXmlDatabase();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.execution.impl.DatabasesImpl <em>Databases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.DatabasesImpl
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getDatabases()
		 * @generated
		 */
		EClass DATABASES = eINSTANCE.getDatabases();

		/**
		 * The meta object literal for the '<em><b>Xml Databases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASES__XML_DATABASES = eINSTANCE.getDatabases_XmlDatabases();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.execution.impl.StringToIntMapImpl <em>String To Int Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.StringToIntMapImpl
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getStringToIntMap()
		 * @generated
		 */
		EClass STRING_TO_INT_MAP = eINSTANCE.getStringToIntMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_INT_MAP__KEY = eINSTANCE.getStringToIntMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_INT_MAP__VALUE = eINSTANCE.getStringToIntMap_Value();

		/**
		 * The meta object literal for the '<em>Base XException Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.basex.core.BaseXException
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getBaseXExceptionWrapper()
		 * @generated
		 */
		EDataType BASE_XEXCEPTION_WRAPPER = eINSTANCE.getBaseXExceptionWrapper();

		/**
		 * The meta object literal for the '<em>Base XContext Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.basex.core.Context
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getBaseXContextWrapper()
		 * @generated
		 */
		EDataType BASE_XCONTEXT_WRAPPER = eINSTANCE.getBaseXContextWrapper();

		/**
		 * The meta object literal for the '<em>Query Exception Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.basex.query.QueryException
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getQueryExceptionWrapper()
		 * @generated
		 */
		EDataType QUERY_EXCEPTION_WRAPPER = eINSTANCE.getQueryExceptionWrapper();

		/**
		 * The meta object literal for the '<em>Query IO Exception Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.basex.query.QueryIOException
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getQueryIOExceptionWrapper()
		 * @generated
		 */
		EDataType QUERY_IO_EXCEPTION_WRAPPER = eINSTANCE.getQueryIOExceptionWrapper();

	}

} //ExecutionPackage

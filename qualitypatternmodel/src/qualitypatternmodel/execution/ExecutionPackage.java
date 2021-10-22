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
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.ResultImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 0;

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
	int XML_RESULT = 1;

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
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.XmlDataDatabaseImpl <em>Xml Data Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.XmlDataDatabaseImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getXmlDataDatabase()
	 * @generated
	 */
	int XML_DATA_DATABASE = 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.DatabasesImpl <em>Databases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.DatabasesImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getDatabases()
	 * @generated
	 */
	int DATABASES = 5;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.StringToIntMapImpl <em>String To Int Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.StringToIntMapImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getStringToIntMap()
	 * @generated
	 */
	int STRING_TO_INT_MAP = 6;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.XmlSchemaDatabaseImpl <em>Xml Schema Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.XmlSchemaDatabaseImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getXmlSchemaDatabase()
	 * @generated
	 */
	int XML_SCHEMA_DATABASE = 7;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.XmlDatabaseImpl <em>Xml Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.XmlDatabaseImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getXmlDatabase()
	 * @generated
	 */
	int XML_DATABASE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE__NAMESPACE = 1;

	/**
	 * The number of structural features of the '<em>Xml Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Analyse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___ANALYSE = 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___INIT = 1;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___OPEN = 2;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___CREATE = 3;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___EXECUTE__STRING = 4;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___CLOSE = 5;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE___DELETE = 6;

	/**
	 * The number of operations of the '<em>Xml Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATABASE_OPERATION_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE__NAME = XML_DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE__NAMESPACE = XML_DATABASE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE__RESULTS = XML_DATABASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE__PATTERNS = XML_DATABASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Recorded Attribute Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES = XML_DATABASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Recorded Data Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE__RECORDED_DATA_VALUES = XML_DATABASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Xml Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE__XML_SCHEMA = XML_DATABASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Element Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE__ELEMENT_NAMES = XML_DATABASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attribute Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE__ATTRIBUTE_NAMES = XML_DATABASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Xml Data Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE_FEATURE_COUNT = XML_DATABASE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Analyse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___ANALYSE = XML_DATABASE___ANALYSE;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___INIT = XML_DATABASE___INIT;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___OPEN = XML_DATABASE___OPEN;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___CREATE = XML_DATABASE___CREATE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___EXECUTE__STRING = XML_DATABASE___EXECUTE__STRING;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___CLOSE = XML_DATABASE___CLOSE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___DELETE = XML_DATABASE___DELETE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING = XML_DATABASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Count Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___COUNT_MATCHES__COMPLETEPATTERN = XML_DATABASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Record Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING = XML_DATABASE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Record Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___RECORD_DATA_VALUE__STRING = XML_DATABASE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING = XML_DATABASE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Remove Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___REMOVE_DATA_VALUE__STRING = XML_DATABASE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Record Element Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___RECORD_ELEMENT_NAME__STRING = XML_DATABASE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Record Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___RECORD_ATTRIBUTE_NAME__STRING = XML_DATABASE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Remove Element Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___REMOVE_ELEMENT_NAME__STRING = XML_DATABASE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Remove Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING = XML_DATABASE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Add Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___ADD_ATTRIBUTE_NAMES__ELIST = XML_DATABASE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Add Element Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___ADD_ELEMENT_NAMES__ELIST = XML_DATABASE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Create Schema Database From Referenced Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___CREATE_SCHEMA_DATABASE_FROM_REFERENCED_SCHEMA = XML_DATABASE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Find XSDURL</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE___FIND_XSDURL = XML_DATABASE_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Xml Data Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DATA_DATABASE_OPERATION_COUNT = XML_DATABASE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.LocalXmlDataDatabaseImpl <em>Local Xml Data Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.LocalXmlDataDatabaseImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getLocalXmlDataDatabase()
	 * @generated
	 */
	int LOCAL_XML_DATA_DATABASE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE__NAME = XML_DATA_DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE__NAMESPACE = XML_DATA_DATABASE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE__RESULTS = XML_DATA_DATABASE__RESULTS;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE__PATTERNS = XML_DATA_DATABASE__PATTERNS;

	/**
	 * The feature id for the '<em><b>Recorded Attribute Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES = XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES;

	/**
	 * The feature id for the '<em><b>Recorded Data Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE__RECORDED_DATA_VALUES = XML_DATA_DATABASE__RECORDED_DATA_VALUES;

	/**
	 * The feature id for the '<em><b>Xml Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE__XML_SCHEMA = XML_DATA_DATABASE__XML_SCHEMA;

	/**
	 * The feature id for the '<em><b>Element Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE__ELEMENT_NAMES = XML_DATA_DATABASE__ELEMENT_NAMES;

	/**
	 * The feature id for the '<em><b>Attribute Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE__ATTRIBUTE_NAMES = XML_DATA_DATABASE__ATTRIBUTE_NAMES;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE__DATA_PATH = XML_DATA_DATABASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Xml Data Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE_FEATURE_COUNT = XML_DATA_DATABASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Analyse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___ANALYSE = XML_DATA_DATABASE___ANALYSE;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___INIT = XML_DATA_DATABASE___INIT;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___OPEN = XML_DATA_DATABASE___OPEN;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___CREATE = XML_DATA_DATABASE___CREATE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___EXECUTE__STRING = XML_DATA_DATABASE___EXECUTE__STRING;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___CLOSE = XML_DATA_DATABASE___CLOSE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___DELETE = XML_DATA_DATABASE___DELETE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING = XML_DATA_DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING;

	/**
	 * The operation id for the '<em>Count Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___COUNT_MATCHES__COMPLETEPATTERN = XML_DATA_DATABASE___COUNT_MATCHES__COMPLETEPATTERN;

	/**
	 * The operation id for the '<em>Record Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING = XML_DATA_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Record Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___RECORD_DATA_VALUE__STRING = XML_DATA_DATABASE___RECORD_DATA_VALUE__STRING;

	/**
	 * The operation id for the '<em>Remove Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING = XML_DATA_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Remove Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___REMOVE_DATA_VALUE__STRING = XML_DATA_DATABASE___REMOVE_DATA_VALUE__STRING;

	/**
	 * The operation id for the '<em>Record Element Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___RECORD_ELEMENT_NAME__STRING = XML_DATA_DATABASE___RECORD_ELEMENT_NAME__STRING;

	/**
	 * The operation id for the '<em>Record Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___RECORD_ATTRIBUTE_NAME__STRING = XML_DATA_DATABASE___RECORD_ATTRIBUTE_NAME__STRING;

	/**
	 * The operation id for the '<em>Remove Element Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___REMOVE_ELEMENT_NAME__STRING = XML_DATA_DATABASE___REMOVE_ELEMENT_NAME__STRING;

	/**
	 * The operation id for the '<em>Remove Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING = XML_DATA_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING;

	/**
	 * The operation id for the '<em>Add Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___ADD_ATTRIBUTE_NAMES__ELIST = XML_DATA_DATABASE___ADD_ATTRIBUTE_NAMES__ELIST;

	/**
	 * The operation id for the '<em>Add Element Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___ADD_ELEMENT_NAMES__ELIST = XML_DATA_DATABASE___ADD_ELEMENT_NAMES__ELIST;

	/**
	 * The operation id for the '<em>Create Schema Database From Referenced Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___CREATE_SCHEMA_DATABASE_FROM_REFERENCED_SCHEMA = XML_DATA_DATABASE___CREATE_SCHEMA_DATABASE_FROM_REFERENCED_SCHEMA;

	/**
	 * The operation id for the '<em>Find XSDURL</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE___FIND_XSDURL = XML_DATA_DATABASE___FIND_XSDURL;

	/**
	 * The number of operations of the '<em>Local Xml Data Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_DATA_DATABASE_OPERATION_COUNT = XML_DATA_DATABASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.ServerXmlDataDatabaseImpl <em>Server Xml Data Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.ServerXmlDataDatabaseImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getServerXmlDataDatabase()
	 * @generated
	 */
	int SERVER_XML_DATA_DATABASE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE__NAME = XML_DATA_DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE__NAMESPACE = XML_DATA_DATABASE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE__RESULTS = XML_DATA_DATABASE__RESULTS;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE__PATTERNS = XML_DATA_DATABASE__PATTERNS;

	/**
	 * The feature id for the '<em><b>Recorded Attribute Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES = XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES;

	/**
	 * The feature id for the '<em><b>Recorded Data Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE__RECORDED_DATA_VALUES = XML_DATA_DATABASE__RECORDED_DATA_VALUES;

	/**
	 * The feature id for the '<em><b>Xml Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE__XML_SCHEMA = XML_DATA_DATABASE__XML_SCHEMA;

	/**
	 * The feature id for the '<em><b>Element Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE__ELEMENT_NAMES = XML_DATA_DATABASE__ELEMENT_NAMES;

	/**
	 * The feature id for the '<em><b>Attribute Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE__ATTRIBUTE_NAMES = XML_DATA_DATABASE__ATTRIBUTE_NAMES;

	/**
	 * The feature id for the '<em><b>Base XClient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE__BASE_XCLIENT = XML_DATA_DATABASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE__LOCAL_NAME = XML_DATA_DATABASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Server Xml Data Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE_FEATURE_COUNT = XML_DATA_DATABASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Analyse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___ANALYSE = XML_DATA_DATABASE___ANALYSE;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___INIT = XML_DATA_DATABASE___INIT;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___OPEN = XML_DATA_DATABASE___OPEN;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___CREATE = XML_DATA_DATABASE___CREATE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___EXECUTE__STRING = XML_DATA_DATABASE___EXECUTE__STRING;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___CLOSE = XML_DATA_DATABASE___CLOSE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___DELETE = XML_DATA_DATABASE___DELETE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING = XML_DATA_DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING;

	/**
	 * The operation id for the '<em>Count Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___COUNT_MATCHES__COMPLETEPATTERN = XML_DATA_DATABASE___COUNT_MATCHES__COMPLETEPATTERN;

	/**
	 * The operation id for the '<em>Record Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING = XML_DATA_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Record Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___RECORD_DATA_VALUE__STRING = XML_DATA_DATABASE___RECORD_DATA_VALUE__STRING;

	/**
	 * The operation id for the '<em>Remove Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING = XML_DATA_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Remove Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___REMOVE_DATA_VALUE__STRING = XML_DATA_DATABASE___REMOVE_DATA_VALUE__STRING;

	/**
	 * The operation id for the '<em>Record Element Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___RECORD_ELEMENT_NAME__STRING = XML_DATA_DATABASE___RECORD_ELEMENT_NAME__STRING;

	/**
	 * The operation id for the '<em>Record Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___RECORD_ATTRIBUTE_NAME__STRING = XML_DATA_DATABASE___RECORD_ATTRIBUTE_NAME__STRING;

	/**
	 * The operation id for the '<em>Remove Element Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___REMOVE_ELEMENT_NAME__STRING = XML_DATA_DATABASE___REMOVE_ELEMENT_NAME__STRING;

	/**
	 * The operation id for the '<em>Remove Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING = XML_DATA_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING;

	/**
	 * The operation id for the '<em>Add Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___ADD_ATTRIBUTE_NAMES__ELIST = XML_DATA_DATABASE___ADD_ATTRIBUTE_NAMES__ELIST;

	/**
	 * The operation id for the '<em>Add Element Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___ADD_ELEMENT_NAMES__ELIST = XML_DATA_DATABASE___ADD_ELEMENT_NAMES__ELIST;

	/**
	 * The operation id for the '<em>Create Schema Database From Referenced Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___CREATE_SCHEMA_DATABASE_FROM_REFERENCED_SCHEMA = XML_DATA_DATABASE___CREATE_SCHEMA_DATABASE_FROM_REFERENCED_SCHEMA;

	/**
	 * The operation id for the '<em>Find XSDURL</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE___FIND_XSDURL = XML_DATA_DATABASE___FIND_XSDURL;

	/**
	 * The number of operations of the '<em>Server Xml Data Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_DATA_DATABASE_OPERATION_COUNT = XML_DATA_DATABASE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xml Databases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASES__XML_DATABASES = 0;

	/**
	 * The feature id for the '<em><b>Xml Schemata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASES__XML_SCHEMATA = 1;

	/**
	 * The number of structural features of the '<em>Databases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Databases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASES_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE__NAME = XML_DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE__NAMESPACE = XML_DATABASE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Xml Databases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE__XML_DATABASES = XML_DATABASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE__ELEMENT_NAMES = XML_DATABASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES = XML_DATABASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root Element Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE__ROOT_ELEMENT_NAMES = XML_DATABASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE__PREFIX = XML_DATABASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Xml Schema Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE_FEATURE_COUNT = XML_DATABASE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Analyse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___ANALYSE = XML_DATABASE___ANALYSE;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___INIT = XML_DATABASE___INIT;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___OPEN = XML_DATABASE___OPEN;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___CREATE = XML_DATABASE___CREATE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___EXECUTE__STRING = XML_DATABASE___EXECUTE__STRING;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___CLOSE = XML_DATABASE___CLOSE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___DELETE = XML_DATABASE___DELETE;

	/**
	 * The operation id for the '<em>Check Following In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___CHECK_FOLLOWING_IN_SCHEMA__STRING_STRING = XML_DATABASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Parent In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___CHECK_PARENT_IN_SCHEMA__STRING_STRING = XML_DATABASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Ancestor In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___CHECK_ANCESTOR_IN_SCHEMA__STRING_STRING = XML_DATABASE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Check Preceding Sibling In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___CHECK_PRECEDING_SIBLING_IN_SCHEMA__STRING_STRING = XML_DATABASE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Check Descendant In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___CHECK_DESCENDANT_IN_SCHEMA__STRING_STRING = XML_DATABASE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Check Child In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING = XML_DATABASE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Check Attribute In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___CHECK_ATTRIBUTE_IN_SCHEMA__STRING_STRING = XML_DATABASE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Check Key Ref In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING = XML_DATABASE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Check Preceding In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___CHECK_PRECEDING_IN_SCHEMA__STRING_STRING = XML_DATABASE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Following Sibling In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___CHECK_FOLLOWING_SIBLING_IN_SCHEMA__STRING_STRING = XML_DATABASE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Ancestors In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___GET_ANCESTORS_IN_SCHEMA__STRING = XML_DATABASE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Descendants In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___GET_DESCENDANTS_IN_SCHEMA__STRING = XML_DATABASE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Children In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___GET_CHILDREN_IN_SCHEMA__STRING = XML_DATABASE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Following In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___GET_FOLLOWING_IN_SCHEMA__STRING = XML_DATABASE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Preceding In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___GET_PRECEDING_IN_SCHEMA__STRING = XML_DATABASE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Parents In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___GET_PARENTS_IN_SCHEMA__STRING = XML_DATABASE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Attributes In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___GET_ATTRIBUTES_IN_SCHEMA__STRING = XML_DATABASE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Following Siblings In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___GET_FOLLOWING_SIBLINGS_IN_SCHEMA__STRING = XML_DATABASE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Preceding Siblings In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE___GET_PRECEDING_SIBLINGS_IN_SCHEMA__STRING = XML_DATABASE_OPERATION_COUNT + 18;

	/**
	 * The number of operations of the '<em>Xml Schema Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_DATABASE_OPERATION_COUNT = XML_DATABASE_OPERATION_COUNT + 19;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.LocalXmlSchemaDatabaseImpl <em>Local Xml Schema Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.LocalXmlSchemaDatabaseImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getLocalXmlSchemaDatabase()
	 * @generated
	 */
	int LOCAL_XML_SCHEMA_DATABASE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE__NAME = XML_SCHEMA_DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE__NAMESPACE = XML_SCHEMA_DATABASE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Xml Databases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE__XML_DATABASES = XML_SCHEMA_DATABASE__XML_DATABASES;

	/**
	 * The feature id for the '<em><b>Element Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE__ELEMENT_NAMES = XML_SCHEMA_DATABASE__ELEMENT_NAMES;

	/**
	 * The feature id for the '<em><b>Attribute Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES = XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES;

	/**
	 * The feature id for the '<em><b>Root Element Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE__ROOT_ELEMENT_NAMES = XML_SCHEMA_DATABASE__ROOT_ELEMENT_NAMES;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE__PREFIX = XML_SCHEMA_DATABASE__PREFIX;

	/**
	 * The feature id for the '<em><b>Schema Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE__SCHEMA_PATH = XML_SCHEMA_DATABASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Xml Schema Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE_FEATURE_COUNT = XML_SCHEMA_DATABASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Analyse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___ANALYSE = XML_SCHEMA_DATABASE___ANALYSE;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___INIT = XML_SCHEMA_DATABASE___INIT;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___OPEN = XML_SCHEMA_DATABASE___OPEN;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___CREATE = XML_SCHEMA_DATABASE___CREATE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___EXECUTE__STRING = XML_SCHEMA_DATABASE___EXECUTE__STRING;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___CLOSE = XML_SCHEMA_DATABASE___CLOSE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___DELETE = XML_SCHEMA_DATABASE___DELETE;

	/**
	 * The operation id for the '<em>Check Following In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___CHECK_FOLLOWING_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_FOLLOWING_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Parent In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___CHECK_PARENT_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_PARENT_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Ancestor In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___CHECK_ANCESTOR_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_ANCESTOR_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Preceding Sibling In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___CHECK_PRECEDING_SIBLING_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_PRECEDING_SIBLING_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Descendant In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___CHECK_DESCENDANT_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_DESCENDANT_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Child In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Attribute In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___CHECK_ATTRIBUTE_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_ATTRIBUTE_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Key Ref In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Preceding In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___CHECK_PRECEDING_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_PRECEDING_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Following Sibling In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___CHECK_FOLLOWING_SIBLING_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_FOLLOWING_SIBLING_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Ancestors In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___GET_ANCESTORS_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_ANCESTORS_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Descendants In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___GET_DESCENDANTS_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_DESCENDANTS_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Children In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___GET_CHILDREN_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_CHILDREN_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Following In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___GET_FOLLOWING_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_FOLLOWING_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Preceding In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___GET_PRECEDING_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_PRECEDING_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Parents In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___GET_PARENTS_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_PARENTS_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Attributes In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___GET_ATTRIBUTES_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_ATTRIBUTES_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Following Siblings In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___GET_FOLLOWING_SIBLINGS_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_FOLLOWING_SIBLINGS_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Preceding Siblings In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE___GET_PRECEDING_SIBLINGS_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_PRECEDING_SIBLINGS_IN_SCHEMA__STRING;

	/**
	 * The number of operations of the '<em>Local Xml Schema Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_XML_SCHEMA_DATABASE_OPERATION_COUNT = XML_SCHEMA_DATABASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.ServerXmlSchemaDatabaseImpl <em>Server Xml Schema Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.ServerXmlSchemaDatabaseImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getServerXmlSchemaDatabase()
	 * @generated
	 */
	int SERVER_XML_SCHEMA_DATABASE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE__NAME = XML_SCHEMA_DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE__NAMESPACE = XML_SCHEMA_DATABASE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Xml Databases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE__XML_DATABASES = XML_SCHEMA_DATABASE__XML_DATABASES;

	/**
	 * The feature id for the '<em><b>Element Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE__ELEMENT_NAMES = XML_SCHEMA_DATABASE__ELEMENT_NAMES;

	/**
	 * The feature id for the '<em><b>Attribute Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES = XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES;

	/**
	 * The feature id for the '<em><b>Root Element Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE__ROOT_ELEMENT_NAMES = XML_SCHEMA_DATABASE__ROOT_ELEMENT_NAMES;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE__PREFIX = XML_SCHEMA_DATABASE__PREFIX;

	/**
	 * The number of structural features of the '<em>Server Xml Schema Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE_FEATURE_COUNT = XML_SCHEMA_DATABASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Analyse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___ANALYSE = XML_SCHEMA_DATABASE___ANALYSE;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___INIT = XML_SCHEMA_DATABASE___INIT;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___OPEN = XML_SCHEMA_DATABASE___OPEN;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___CREATE = XML_SCHEMA_DATABASE___CREATE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___EXECUTE__STRING = XML_SCHEMA_DATABASE___EXECUTE__STRING;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___CLOSE = XML_SCHEMA_DATABASE___CLOSE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___DELETE = XML_SCHEMA_DATABASE___DELETE;

	/**
	 * The operation id for the '<em>Check Following In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___CHECK_FOLLOWING_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_FOLLOWING_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Parent In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___CHECK_PARENT_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_PARENT_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Ancestor In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___CHECK_ANCESTOR_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_ANCESTOR_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Preceding Sibling In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___CHECK_PRECEDING_SIBLING_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_PRECEDING_SIBLING_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Descendant In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___CHECK_DESCENDANT_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_DESCENDANT_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Child In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Attribute In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___CHECK_ATTRIBUTE_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_ATTRIBUTE_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Key Ref In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Preceding In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___CHECK_PRECEDING_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_PRECEDING_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Following Sibling In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___CHECK_FOLLOWING_SIBLING_IN_SCHEMA__STRING_STRING = XML_SCHEMA_DATABASE___CHECK_FOLLOWING_SIBLING_IN_SCHEMA__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Ancestors In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___GET_ANCESTORS_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_ANCESTORS_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Descendants In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___GET_DESCENDANTS_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_DESCENDANTS_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Children In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___GET_CHILDREN_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_CHILDREN_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Following In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___GET_FOLLOWING_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_FOLLOWING_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Preceding In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___GET_PRECEDING_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_PRECEDING_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Parents In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___GET_PARENTS_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_PARENTS_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Attributes In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___GET_ATTRIBUTES_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_ATTRIBUTES_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Following Siblings In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___GET_FOLLOWING_SIBLINGS_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_FOLLOWING_SIBLINGS_IN_SCHEMA__STRING;

	/**
	 * The operation id for the '<em>Get Preceding Siblings In Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE___GET_PRECEDING_SIBLINGS_IN_SCHEMA__STRING = XML_SCHEMA_DATABASE___GET_PRECEDING_SIBLINGS_IN_SCHEMA__STRING;

	/**
	 * The number of operations of the '<em>Server Xml Schema Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_XML_SCHEMA_DATABASE_OPERATION_COUNT = XML_SCHEMA_DATABASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.Database <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.Database
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 11;

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
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 2;

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
	 * The meta object id for the '{@link qualitypatternmodel.execution.Databaseformat <em>Databaseformat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.Databaseformat
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getDatabaseformat()
	 * @generated
	 */
	int DATABASEFORMAT = 12;

	/**
	 * The number of structural features of the '<em>Databaseformat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASEFORMAT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Databaseformat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASEFORMAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.execution.impl.BaseXClientImpl <em>Base XClient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.BaseXClientImpl
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getBaseXClient()
	 * @generated
	 */
	int BASE_XCLIENT = 13;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_XCLIENT__HOST = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_XCLIENT__PORT = 1;

	/**
	 * The number of structural features of the '<em>Base XClient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_XCLIENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_XCLIENT___CLOSE = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_XCLIENT___EXECUTE__STRING = 1;

	/**
	 * The operation id for the '<em>Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_XCLIENT___QUERY__STRING = 2;

	/**
	 * The number of operations of the '<em>Base XClient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_XCLIENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '<em>Base XException Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.basex.core.BaseXException
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getBaseXExceptionWrapper()
	 * @generated
	 */
	int BASE_XEXCEPTION_WRAPPER = 14;

	/**
	 * The meta object id for the '<em>Query Exception Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.basex.query.QueryException
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getQueryExceptionWrapper()
	 * @generated
	 */
	int QUERY_EXCEPTION_WRAPPER = 15;


	/**
	 * The meta object id for the '<em>Query IO Exception Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.basex.query.QueryIOException
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getQueryIOExceptionWrapper()
	 * @generated
	 */
	int QUERY_IO_EXCEPTION_WRAPPER = 16;


	/**
	 * The meta object id for the '<em>Io Exception Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.IOException
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getIoExceptionWrapper()
	 * @generated
	 */
	int IO_EXCEPTION_WRAPPER = 17;


	/**
	 * The meta object id for the '<em>Query Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.impl.BaseXClientImpl.Query
	 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getQueryWrapper()
	 * @generated
	 */
	int QUERY_WRAPPER = 18;


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
	 * Returns the meta object for class '{@link qualitypatternmodel.execution.XmlDataDatabase <em>Xml Data Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Data Database</em>'.
	 * @see qualitypatternmodel.execution.XmlDataDatabase
	 * @generated
	 */
	EClass getXmlDataDatabase();

	/**
	 * Returns the meta object for the map '{@link qualitypatternmodel.execution.XmlDataDatabase#getRecordedAttributeValues <em>Recorded Attribute Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Recorded Attribute Values</em>'.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#getRecordedAttributeValues()
	 * @see #getXmlDataDatabase()
	 * @generated
	 */
	EReference getXmlDataDatabase_RecordedAttributeValues();

	/**
	 * Returns the meta object for the map '{@link qualitypatternmodel.execution.XmlDataDatabase#getRecordedDataValues <em>Recorded Data Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Recorded Data Values</em>'.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#getRecordedDataValues()
	 * @see #getXmlDataDatabase()
	 * @generated
	 */
	EReference getXmlDataDatabase_RecordedDataValues();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.execution.XmlDataDatabase#getXmlSchema <em>Xml Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xml Schema</em>'.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#getXmlSchema()
	 * @see #getXmlDataDatabase()
	 * @generated
	 */
	EReference getXmlDataDatabase_XmlSchema();

	/**
	 * Returns the meta object for the map '{@link qualitypatternmodel.execution.XmlDataDatabase#getElementNames <em>Element Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Element Names</em>'.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#getElementNames()
	 * @see #getXmlDataDatabase()
	 * @generated
	 */
	EReference getXmlDataDatabase_ElementNames();

	/**
	 * Returns the meta object for the map '{@link qualitypatternmodel.execution.XmlDataDatabase#getAttributeNames <em>Attribute Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Attribute Names</em>'.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#getAttributeNames()
	 * @see #getXmlDataDatabase()
	 * @generated
	 */
	EReference getXmlDataDatabase_AttributeNames();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDataDatabase#recordAttributeValue(java.lang.String) <em>Record Attribute Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Record Attribute Value</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#recordAttributeValue(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDataDatabase__RecordAttributeValue__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDataDatabase#recordDataValue(java.lang.String) <em>Record Data Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Record Data Value</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#recordDataValue(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDataDatabase__RecordDataValue__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDataDatabase#removeAttributeValue(java.lang.String) <em>Remove Attribute Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Attribute Value</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#removeAttributeValue(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDataDatabase__RemoveAttributeValue__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDataDatabase#removeDataValue(java.lang.String) <em>Remove Data Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Data Value</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#removeDataValue(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDataDatabase__RemoveDataValue__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDataDatabase#recordElementName(java.lang.String) <em>Record Element Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Record Element Name</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#recordElementName(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDataDatabase__RecordElementName__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDataDatabase#recordAttributeName(java.lang.String) <em>Record Attribute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Record Attribute Name</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#recordAttributeName(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDataDatabase__RecordAttributeName__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDataDatabase#removeElementName(java.lang.String) <em>Remove Element Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Element Name</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#removeElementName(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDataDatabase__RemoveElementName__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDataDatabase#removeAttributeName(java.lang.String) <em>Remove Attribute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Attribute Name</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#removeAttributeName(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDataDatabase__RemoveAttributeName__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDataDatabase#addAttributeNames(org.eclipse.emf.common.util.EList) <em>Add Attribute Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Attribute Names</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#addAttributeNames(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getXmlDataDatabase__AddAttributeNames__EList();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDataDatabase#addElementNames(org.eclipse.emf.common.util.EList) <em>Add Element Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element Names</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#addElementNames(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getXmlDataDatabase__AddElementNames__EList();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDataDatabase#createSchemaDatabaseFromReferencedSchema() <em>Create Schema Database From Referenced Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Schema Database From Referenced Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#createSchemaDatabaseFromReferencedSchema()
	 * @generated
	 */
	EOperation getXmlDataDatabase__CreateSchemaDatabaseFromReferencedSchema();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDataDatabase#findXSDURL() <em>Find XSDURL</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find XSDURL</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDataDatabase#findXSDURL()
	 * @generated
	 */
	EOperation getXmlDataDatabase__FindXSDURL();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.execution.LocalXmlDataDatabase <em>Local Xml Data Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Xml Data Database</em>'.
	 * @see qualitypatternmodel.execution.LocalXmlDataDatabase
	 * @generated
	 */
	EClass getLocalXmlDataDatabase();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.LocalXmlDataDatabase#getDataPath <em>Data Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Path</em>'.
	 * @see qualitypatternmodel.execution.LocalXmlDataDatabase#getDataPath()
	 * @see #getLocalXmlDataDatabase()
	 * @generated
	 */
	EAttribute getLocalXmlDataDatabase_DataPath();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.execution.ServerXmlDataDatabase <em>Server Xml Data Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Xml Data Database</em>'.
	 * @see qualitypatternmodel.execution.ServerXmlDataDatabase
	 * @generated
	 */
	EClass getServerXmlDataDatabase();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.execution.ServerXmlDataDatabase#getBaseXClient <em>Base XClient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base XClient</em>'.
	 * @see qualitypatternmodel.execution.ServerXmlDataDatabase#getBaseXClient()
	 * @see #getServerXmlDataDatabase()
	 * @generated
	 */
	EReference getServerXmlDataDatabase_BaseXClient();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.ServerXmlDataDatabase#getLocalName <em>Local Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Name</em>'.
	 * @see qualitypatternmodel.execution.ServerXmlDataDatabase#getLocalName()
	 * @see #getServerXmlDataDatabase()
	 * @generated
	 */
	EAttribute getServerXmlDataDatabase_LocalName();

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
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.execution.Databases#getXmlSchemata <em>Xml Schemata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xml Schemata</em>'.
	 * @see qualitypatternmodel.execution.Databases#getXmlSchemata()
	 * @see #getDatabases()
	 * @generated
	 */
	EReference getDatabases_XmlSchemata();

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
	 * Returns the meta object for class '{@link qualitypatternmodel.execution.XmlSchemaDatabase <em>Xml Schema Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Schema Database</em>'.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase
	 * @generated
	 */
	EClass getXmlSchemaDatabase();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getXmlDatabases <em>Xml Databases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Xml Databases</em>'.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#getXmlDatabases()
	 * @see #getXmlSchemaDatabase()
	 * @generated
	 */
	EReference getXmlSchemaDatabase_XmlDatabases();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getElementNames <em>Element Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Element Names</em>'.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#getElementNames()
	 * @see #getXmlSchemaDatabase()
	 * @generated
	 */
	EAttribute getXmlSchemaDatabase_ElementNames();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getAttributeNames <em>Attribute Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attribute Names</em>'.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#getAttributeNames()
	 * @see #getXmlSchemaDatabase()
	 * @generated
	 */
	EAttribute getXmlSchemaDatabase_AttributeNames();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getRootElementNames <em>Root Element Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Root Element Names</em>'.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#getRootElementNames()
	 * @see #getXmlSchemaDatabase()
	 * @generated
	 */
	EAttribute getXmlSchemaDatabase_RootElementNames();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#getPrefix()
	 * @see #getXmlSchemaDatabase()
	 * @generated
	 */
	EAttribute getXmlSchemaDatabase_Prefix();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#checkFollowingInSchema(java.lang.String, java.lang.String) <em>Check Following In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Following In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#checkFollowingInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__CheckFollowingInSchema__String_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#checkParentInSchema(java.lang.String, java.lang.String) <em>Check Parent In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Parent In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#checkParentInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__CheckParentInSchema__String_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#checkAncestorInSchema(java.lang.String, java.lang.String) <em>Check Ancestor In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Ancestor In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#checkAncestorInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__CheckAncestorInSchema__String_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#checkPrecedingSiblingInSchema(java.lang.String, java.lang.String) <em>Check Preceding Sibling In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Preceding Sibling In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#checkPrecedingSiblingInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__CheckPrecedingSiblingInSchema__String_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#checkDescendantInSchema(java.lang.String, java.lang.String) <em>Check Descendant In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Descendant In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#checkDescendantInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__CheckDescendantInSchema__String_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#checkChildInSchema(java.lang.String, java.lang.String) <em>Check Child In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Child In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#checkChildInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__CheckChildInSchema__String_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#checkAttributeInSchema(java.lang.String, java.lang.String) <em>Check Attribute In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attribute In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#checkAttributeInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__CheckAttributeInSchema__String_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#checkKeyRefInSchema(java.lang.String, java.lang.String) <em>Check Key Ref In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Key Ref In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#checkKeyRefInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__CheckKeyRefInSchema__String_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#checkPrecedingInSchema(java.lang.String, java.lang.String) <em>Check Preceding In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Preceding In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#checkPrecedingInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__CheckPrecedingInSchema__String_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#checkFollowingSiblingInSchema(java.lang.String, java.lang.String) <em>Check Following Sibling In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Following Sibling In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#checkFollowingSiblingInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__CheckFollowingSiblingInSchema__String_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getAncestorsInSchema(java.lang.String) <em>Get Ancestors In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ancestors In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#getAncestorsInSchema(java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__GetAncestorsInSchema__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getDescendantsInSchema(java.lang.String) <em>Get Descendants In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Descendants In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#getDescendantsInSchema(java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__GetDescendantsInSchema__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getChildrenInSchema(java.lang.String) <em>Get Children In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Children In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#getChildrenInSchema(java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__GetChildrenInSchema__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getFollowingInSchema(java.lang.String) <em>Get Following In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Following In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#getFollowingInSchema(java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__GetFollowingInSchema__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getPrecedingInSchema(java.lang.String) <em>Get Preceding In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Preceding In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#getPrecedingInSchema(java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__GetPrecedingInSchema__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getParentsInSchema(java.lang.String) <em>Get Parents In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parents In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#getParentsInSchema(java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__GetParentsInSchema__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getAttributesInSchema(java.lang.String) <em>Get Attributes In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attributes In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#getAttributesInSchema(java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__GetAttributesInSchema__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getFollowingSiblingsInSchema(java.lang.String) <em>Get Following Siblings In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Following Siblings In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#getFollowingSiblingsInSchema(java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__GetFollowingSiblingsInSchema__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getPrecedingSiblingsInSchema(java.lang.String) <em>Get Preceding Siblings In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Preceding Siblings In Schema</em>' operation.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#getPrecedingSiblingsInSchema(java.lang.String)
	 * @generated
	 */
	EOperation getXmlSchemaDatabase__GetPrecedingSiblingsInSchema__String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.execution.LocalXmlSchemaDatabase <em>Local Xml Schema Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Xml Schema Database</em>'.
	 * @see qualitypatternmodel.execution.LocalXmlSchemaDatabase
	 * @generated
	 */
	EClass getLocalXmlSchemaDatabase();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.LocalXmlSchemaDatabase#getSchemaPath <em>Schema Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Path</em>'.
	 * @see qualitypatternmodel.execution.LocalXmlSchemaDatabase#getSchemaPath()
	 * @see #getLocalXmlSchemaDatabase()
	 * @generated
	 */
	EAttribute getLocalXmlSchemaDatabase_SchemaPath();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.execution.ServerXmlSchemaDatabase <em>Server Xml Schema Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Xml Schema Database</em>'.
	 * @see qualitypatternmodel.execution.ServerXmlSchemaDatabase
	 * @generated
	 */
	EClass getServerXmlSchemaDatabase();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.XmlDatabase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qualitypatternmodel.execution.XmlDatabase#getName()
	 * @see #getXmlDatabase()
	 * @generated
	 */
	EAttribute getXmlDatabase_Name();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.XmlDatabase#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see qualitypatternmodel.execution.XmlDatabase#getNamespace()
	 * @see #getXmlDatabase()
	 * @generated
	 */
	EAttribute getXmlDatabase_Namespace();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#analyse() <em>Analyse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Analyse</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#analyse()
	 * @generated
	 */
	EOperation getXmlDatabase__Analyse();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#create() <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#create()
	 * @generated
	 */
	EOperation getXmlDatabase__Create();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#execute(java.lang.String) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#execute(java.lang.String)
	 * @generated
	 */
	EOperation getXmlDatabase__Execute__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#close() <em>Close</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#close()
	 * @generated
	 */
	EOperation getXmlDatabase__Close();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.XmlDatabase#delete() <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see qualitypatternmodel.execution.XmlDatabase#delete()
	 * @generated
	 */
	EOperation getXmlDatabase__Delete();

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
	 * Returns the meta object for class '{@link qualitypatternmodel.execution.Databaseformat <em>Databaseformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Databaseformat</em>'.
	 * @see qualitypatternmodel.execution.Databaseformat
	 * @generated
	 */
	EClass getDatabaseformat();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.execution.BaseXClient <em>Base XClient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base XClient</em>'.
	 * @see qualitypatternmodel.execution.BaseXClient
	 * @generated
	 */
	EClass getBaseXClient();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.BaseXClient#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see qualitypatternmodel.execution.BaseXClient#getHost()
	 * @see #getBaseXClient()
	 * @generated
	 */
	EAttribute getBaseXClient_Host();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.execution.BaseXClient#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see qualitypatternmodel.execution.BaseXClient#getPort()
	 * @see #getBaseXClient()
	 * @generated
	 */
	EAttribute getBaseXClient_Port();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.BaseXClient#close() <em>Close</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close</em>' operation.
	 * @see qualitypatternmodel.execution.BaseXClient#close()
	 * @generated
	 */
	EOperation getBaseXClient__Close();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.BaseXClient#execute(java.lang.String) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see qualitypatternmodel.execution.BaseXClient#execute(java.lang.String)
	 * @generated
	 */
	EOperation getBaseXClient__Execute__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.execution.BaseXClient#query(java.lang.String) <em>Query</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query</em>' operation.
	 * @see qualitypatternmodel.execution.BaseXClient#query(java.lang.String)
	 * @generated
	 */
	EOperation getBaseXClient__Query__String();

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
	 * Returns the meta object for data type '{@link java.io.IOException <em>Io Exception Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Io Exception Wrapper</em>'.
	 * @see java.io.IOException
	 * @model instanceClass="java.io.IOException"
	 * @generated
	 */
	EDataType getIoExceptionWrapper();

	/**
	 * Returns the meta object for data type '{@link qualitypatternmodel.execution.impl.BaseXClientImpl.Query <em>Query Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Query Wrapper</em>'.
	 * @see qualitypatternmodel.execution.impl.BaseXClientImpl.Query
	 * @model instanceClass="qualitypatternmodel.execution.impl.BaseXClientImpl.Query"
	 * @generated
	 */
	EDataType getQueryWrapper();

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
		 * The meta object literal for the '{@link qualitypatternmodel.execution.impl.XmlDataDatabaseImpl <em>Xml Data Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.XmlDataDatabaseImpl
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getXmlDataDatabase()
		 * @generated
		 */
		EClass XML_DATA_DATABASE = eINSTANCE.getXmlDataDatabase();

		/**
		 * The meta object literal for the '<em><b>Recorded Attribute Values</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES = eINSTANCE.getXmlDataDatabase_RecordedAttributeValues();

		/**
		 * The meta object literal for the '<em><b>Recorded Data Values</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_DATA_DATABASE__RECORDED_DATA_VALUES = eINSTANCE.getXmlDataDatabase_RecordedDataValues();

		/**
		 * The meta object literal for the '<em><b>Xml Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_DATA_DATABASE__XML_SCHEMA = eINSTANCE.getXmlDataDatabase_XmlSchema();

		/**
		 * The meta object literal for the '<em><b>Element Names</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_DATA_DATABASE__ELEMENT_NAMES = eINSTANCE.getXmlDataDatabase_ElementNames();

		/**
		 * The meta object literal for the '<em><b>Attribute Names</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_DATA_DATABASE__ATTRIBUTE_NAMES = eINSTANCE.getXmlDataDatabase_AttributeNames();

		/**
		 * The meta object literal for the '<em><b>Record Attribute Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATA_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING = eINSTANCE.getXmlDataDatabase__RecordAttributeValue__String();

		/**
		 * The meta object literal for the '<em><b>Record Data Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATA_DATABASE___RECORD_DATA_VALUE__STRING = eINSTANCE.getXmlDataDatabase__RecordDataValue__String();

		/**
		 * The meta object literal for the '<em><b>Remove Attribute Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATA_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING = eINSTANCE.getXmlDataDatabase__RemoveAttributeValue__String();

		/**
		 * The meta object literal for the '<em><b>Remove Data Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATA_DATABASE___REMOVE_DATA_VALUE__STRING = eINSTANCE.getXmlDataDatabase__RemoveDataValue__String();

		/**
		 * The meta object literal for the '<em><b>Record Element Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATA_DATABASE___RECORD_ELEMENT_NAME__STRING = eINSTANCE.getXmlDataDatabase__RecordElementName__String();

		/**
		 * The meta object literal for the '<em><b>Record Attribute Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATA_DATABASE___RECORD_ATTRIBUTE_NAME__STRING = eINSTANCE.getXmlDataDatabase__RecordAttributeName__String();

		/**
		 * The meta object literal for the '<em><b>Remove Element Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATA_DATABASE___REMOVE_ELEMENT_NAME__STRING = eINSTANCE.getXmlDataDatabase__RemoveElementName__String();

		/**
		 * The meta object literal for the '<em><b>Remove Attribute Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATA_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING = eINSTANCE.getXmlDataDatabase__RemoveAttributeName__String();

		/**
		 * The meta object literal for the '<em><b>Add Attribute Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATA_DATABASE___ADD_ATTRIBUTE_NAMES__ELIST = eINSTANCE.getXmlDataDatabase__AddAttributeNames__EList();

		/**
		 * The meta object literal for the '<em><b>Add Element Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATA_DATABASE___ADD_ELEMENT_NAMES__ELIST = eINSTANCE.getXmlDataDatabase__AddElementNames__EList();

		/**
		 * The meta object literal for the '<em><b>Create Schema Database From Referenced Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATA_DATABASE___CREATE_SCHEMA_DATABASE_FROM_REFERENCED_SCHEMA = eINSTANCE.getXmlDataDatabase__CreateSchemaDatabaseFromReferencedSchema();

		/**
		 * The meta object literal for the '<em><b>Find XSDURL</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATA_DATABASE___FIND_XSDURL = eINSTANCE.getXmlDataDatabase__FindXSDURL();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.execution.impl.LocalXmlDataDatabaseImpl <em>Local Xml Data Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.LocalXmlDataDatabaseImpl
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getLocalXmlDataDatabase()
		 * @generated
		 */
		EClass LOCAL_XML_DATA_DATABASE = eINSTANCE.getLocalXmlDataDatabase();

		/**
		 * The meta object literal for the '<em><b>Data Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_XML_DATA_DATABASE__DATA_PATH = eINSTANCE.getLocalXmlDataDatabase_DataPath();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.execution.impl.ServerXmlDataDatabaseImpl <em>Server Xml Data Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.ServerXmlDataDatabaseImpl
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getServerXmlDataDatabase()
		 * @generated
		 */
		EClass SERVER_XML_DATA_DATABASE = eINSTANCE.getServerXmlDataDatabase();

		/**
		 * The meta object literal for the '<em><b>Base XClient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_XML_DATA_DATABASE__BASE_XCLIENT = eINSTANCE.getServerXmlDataDatabase_BaseXClient();

		/**
		 * The meta object literal for the '<em><b>Local Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_XML_DATA_DATABASE__LOCAL_NAME = eINSTANCE.getServerXmlDataDatabase_LocalName();

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
		 * The meta object literal for the '<em><b>Xml Schemata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASES__XML_SCHEMATA = eINSTANCE.getDatabases_XmlSchemata();

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
		 * The meta object literal for the '{@link qualitypatternmodel.execution.impl.XmlSchemaDatabaseImpl <em>Xml Schema Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.XmlSchemaDatabaseImpl
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getXmlSchemaDatabase()
		 * @generated
		 */
		EClass XML_SCHEMA_DATABASE = eINSTANCE.getXmlSchemaDatabase();

		/**
		 * The meta object literal for the '<em><b>Xml Databases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_SCHEMA_DATABASE__XML_DATABASES = eINSTANCE.getXmlSchemaDatabase_XmlDatabases();

		/**
		 * The meta object literal for the '<em><b>Element Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_SCHEMA_DATABASE__ELEMENT_NAMES = eINSTANCE.getXmlSchemaDatabase_ElementNames();

		/**
		 * The meta object literal for the '<em><b>Attribute Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES = eINSTANCE.getXmlSchemaDatabase_AttributeNames();

		/**
		 * The meta object literal for the '<em><b>Root Element Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_SCHEMA_DATABASE__ROOT_ELEMENT_NAMES = eINSTANCE.getXmlSchemaDatabase_RootElementNames();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_SCHEMA_DATABASE__PREFIX = eINSTANCE.getXmlSchemaDatabase_Prefix();

		/**
		 * The meta object literal for the '<em><b>Check Following In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___CHECK_FOLLOWING_IN_SCHEMA__STRING_STRING = eINSTANCE.getXmlSchemaDatabase__CheckFollowingInSchema__String_String();

		/**
		 * The meta object literal for the '<em><b>Check Parent In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___CHECK_PARENT_IN_SCHEMA__STRING_STRING = eINSTANCE.getXmlSchemaDatabase__CheckParentInSchema__String_String();

		/**
		 * The meta object literal for the '<em><b>Check Ancestor In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___CHECK_ANCESTOR_IN_SCHEMA__STRING_STRING = eINSTANCE.getXmlSchemaDatabase__CheckAncestorInSchema__String_String();

		/**
		 * The meta object literal for the '<em><b>Check Preceding Sibling In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___CHECK_PRECEDING_SIBLING_IN_SCHEMA__STRING_STRING = eINSTANCE.getXmlSchemaDatabase__CheckPrecedingSiblingInSchema__String_String();

		/**
		 * The meta object literal for the '<em><b>Check Descendant In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___CHECK_DESCENDANT_IN_SCHEMA__STRING_STRING = eINSTANCE.getXmlSchemaDatabase__CheckDescendantInSchema__String_String();

		/**
		 * The meta object literal for the '<em><b>Check Child In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING = eINSTANCE.getXmlSchemaDatabase__CheckChildInSchema__String_String();

		/**
		 * The meta object literal for the '<em><b>Check Attribute In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___CHECK_ATTRIBUTE_IN_SCHEMA__STRING_STRING = eINSTANCE.getXmlSchemaDatabase__CheckAttributeInSchema__String_String();

		/**
		 * The meta object literal for the '<em><b>Check Key Ref In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING = eINSTANCE.getXmlSchemaDatabase__CheckKeyRefInSchema__String_String();

		/**
		 * The meta object literal for the '<em><b>Check Preceding In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___CHECK_PRECEDING_IN_SCHEMA__STRING_STRING = eINSTANCE.getXmlSchemaDatabase__CheckPrecedingInSchema__String_String();

		/**
		 * The meta object literal for the '<em><b>Check Following Sibling In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___CHECK_FOLLOWING_SIBLING_IN_SCHEMA__STRING_STRING = eINSTANCE.getXmlSchemaDatabase__CheckFollowingSiblingInSchema__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Ancestors In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___GET_ANCESTORS_IN_SCHEMA__STRING = eINSTANCE.getXmlSchemaDatabase__GetAncestorsInSchema__String();

		/**
		 * The meta object literal for the '<em><b>Get Descendants In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___GET_DESCENDANTS_IN_SCHEMA__STRING = eINSTANCE.getXmlSchemaDatabase__GetDescendantsInSchema__String();

		/**
		 * The meta object literal for the '<em><b>Get Children In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___GET_CHILDREN_IN_SCHEMA__STRING = eINSTANCE.getXmlSchemaDatabase__GetChildrenInSchema__String();

		/**
		 * The meta object literal for the '<em><b>Get Following In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___GET_FOLLOWING_IN_SCHEMA__STRING = eINSTANCE.getXmlSchemaDatabase__GetFollowingInSchema__String();

		/**
		 * The meta object literal for the '<em><b>Get Preceding In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___GET_PRECEDING_IN_SCHEMA__STRING = eINSTANCE.getXmlSchemaDatabase__GetPrecedingInSchema__String();

		/**
		 * The meta object literal for the '<em><b>Get Parents In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___GET_PARENTS_IN_SCHEMA__STRING = eINSTANCE.getXmlSchemaDatabase__GetParentsInSchema__String();

		/**
		 * The meta object literal for the '<em><b>Get Attributes In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___GET_ATTRIBUTES_IN_SCHEMA__STRING = eINSTANCE.getXmlSchemaDatabase__GetAttributesInSchema__String();

		/**
		 * The meta object literal for the '<em><b>Get Following Siblings In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___GET_FOLLOWING_SIBLINGS_IN_SCHEMA__STRING = eINSTANCE.getXmlSchemaDatabase__GetFollowingSiblingsInSchema__String();

		/**
		 * The meta object literal for the '<em><b>Get Preceding Siblings In Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_SCHEMA_DATABASE___GET_PRECEDING_SIBLINGS_IN_SCHEMA__STRING = eINSTANCE.getXmlSchemaDatabase__GetPrecedingSiblingsInSchema__String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.execution.impl.LocalXmlSchemaDatabaseImpl <em>Local Xml Schema Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.LocalXmlSchemaDatabaseImpl
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getLocalXmlSchemaDatabase()
		 * @generated
		 */
		EClass LOCAL_XML_SCHEMA_DATABASE = eINSTANCE.getLocalXmlSchemaDatabase();

		/**
		 * The meta object literal for the '<em><b>Schema Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_XML_SCHEMA_DATABASE__SCHEMA_PATH = eINSTANCE.getLocalXmlSchemaDatabase_SchemaPath();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.execution.impl.ServerXmlSchemaDatabaseImpl <em>Server Xml Schema Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.ServerXmlSchemaDatabaseImpl
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getServerXmlSchemaDatabase()
		 * @generated
		 */
		EClass SERVER_XML_SCHEMA_DATABASE = eINSTANCE.getServerXmlSchemaDatabase();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_DATABASE__NAME = eINSTANCE.getXmlDatabase_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_DATABASE__NAMESPACE = eINSTANCE.getXmlDatabase_Namespace();

		/**
		 * The meta object literal for the '<em><b>Analyse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___ANALYSE = eINSTANCE.getXmlDatabase__Analyse();

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
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___CREATE = eINSTANCE.getXmlDatabase__Create();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___EXECUTE__STRING = eINSTANCE.getXmlDatabase__Execute__String();

		/**
		 * The meta object literal for the '<em><b>Close</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___CLOSE = eINSTANCE.getXmlDatabase__Close();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_DATABASE___DELETE = eINSTANCE.getXmlDatabase__Delete();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.execution.Database <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.Database
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
		 * The meta object literal for the '{@link qualitypatternmodel.execution.Databaseformat <em>Databaseformat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.Databaseformat
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getDatabaseformat()
		 * @generated
		 */
		EClass DATABASEFORMAT = eINSTANCE.getDatabaseformat();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.execution.impl.BaseXClientImpl <em>Base XClient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.BaseXClientImpl
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getBaseXClient()
		 * @generated
		 */
		EClass BASE_XCLIENT = eINSTANCE.getBaseXClient();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_XCLIENT__HOST = eINSTANCE.getBaseXClient_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_XCLIENT__PORT = eINSTANCE.getBaseXClient_Port();

		/**
		 * The meta object literal for the '<em><b>Close</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BASE_XCLIENT___CLOSE = eINSTANCE.getBaseXClient__Close();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BASE_XCLIENT___EXECUTE__STRING = eINSTANCE.getBaseXClient__Execute__String();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BASE_XCLIENT___QUERY__STRING = eINSTANCE.getBaseXClient__Query__String();

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

		/**
		 * The meta object literal for the '<em>Io Exception Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getIoExceptionWrapper()
		 * @generated
		 */
		EDataType IO_EXCEPTION_WRAPPER = eINSTANCE.getIoExceptionWrapper();

		/**
		 * The meta object literal for the '<em>Query Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.execution.impl.BaseXClientImpl.Query
		 * @see qualitypatternmodel.execution.impl.ExecutionPackageImpl#getQueryWrapper()
		 * @generated
		 */
		EDataType QUERY_WRAPPER = eINSTANCE.getQueryWrapper();

	}

} //ExecutionPackage

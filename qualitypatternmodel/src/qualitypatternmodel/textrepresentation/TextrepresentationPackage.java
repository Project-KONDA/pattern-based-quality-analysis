/**
 */
package qualitypatternmodel.textrepresentation;

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
 * @see qualitypatternmodel.textrepresentation.TextrepresentationFactory
 * @model kind="package"
 * @generated
 */
public interface TextrepresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "textrepresentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "textrepresentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "textrepresentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TextrepresentationPackage eINSTANCE = qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.textrepresentation.impl.PatternTextImpl <em>Pattern Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.textrepresentation.impl.PatternTextImpl
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getPatternText()
	 * @generated
	 */
	int PATTERN_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT__PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT__FRAGMENTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Parameter Predefinitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT__PARAMETER_PREDEFINITIONS = 3;

	/**
	 * The feature id for the '<em><b>Fragments Ordered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT__FRAGMENTS_ORDERED = 4;

	/**
	 * The feature id for the '<em><b>Type Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT__TYPE_CONSTRAINT = 5;

	/**
	 * The number of structural features of the '<em>Pattern Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT___IS_VALID__ABSTRACTIONLEVEL = 0;

	/**
	 * The operation id for the '<em>Add Fragment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT___ADD_FRAGMENT__FRAGMENT = 1;

	/**
	 * The operation id for the '<em>Generate JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT___GENERATE_JSON = 2;

	/**
	 * The operation id for the '<em>Get Preview</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT___GET_PREVIEW = 3;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT___DELETE = 4;

	/**
	 * The operation id for the '<em>Instantiate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT___INSTANTIATE = 5;

	/**
	 * The operation id for the '<em>Generate Sparql Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT___GENERATE_SPARQL_TEMPLATE = 6;

	/**
	 * The operation id for the '<em>Generate JSON Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT___GENERATE_JSON_OBJECT = 7;

	/**
	 * The operation id for the '<em>Generate Variant JSON Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT___GENERATE_VARIANT_JSON_OBJECT = 8;

	/**
	 * The number of operations of the '<em>Pattern Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.textrepresentation.impl.FragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.textrepresentation.impl.FragmentImpl
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getFragment()
	 * @generated
	 */
	int FRAGMENT = 2;

	/**
	 * The feature id for the '<em><b>Pattern Text</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__PATTERN_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Generate JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT___GENERATE_JSON = 0;

	/**
	 * The operation id for the '<em>Get Preview</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT___GET_PREVIEW = 1;

	/**
	 * The operation id for the '<em>Generate Sparql Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT___GENERATE_SPARQL_TEMPLATE = 2;

	/**
	 * The operation id for the '<em>Generate JSON Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT___GENERATE_JSON_OBJECT = 3;

	/**
	 * The operation id for the '<em>Generate Variant JSON Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT___GENERATE_VARIANT_JSON_OBJECT = 4;

	/**
	 * The number of operations of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl <em>Parameter Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getParameterFragment()
	 * @generated
	 */
	int PARAMETER_FRAGMENT = 1;

	/**
	 * The feature id for the '<em><b>Pattern Text</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT__PATTERN_TEXT = FRAGMENT__PATTERN_TEXT;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT__PARAMETER = FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Example Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT__EXAMPLE_VALUE = FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT__NAME = FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT__VALUE_MAP = FRAGMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT__ID = FRAGMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>User Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT__USER_VALUE = FRAGMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT__DESCRIPTION = FRAGMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Plural</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT__PLURAL = FRAGMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attribute Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT__ATTRIBUTE_MAP = FRAGMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Parameter Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Generate JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___GENERATE_JSON = FRAGMENT___GENERATE_JSON;

	/**
	 * The operation id for the '<em>Get Preview</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___GET_PREVIEW = FRAGMENT___GET_PREVIEW;

	/**
	 * The operation id for the '<em>Generate Sparql Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___GENERATE_SPARQL_TEMPLATE = FRAGMENT___GENERATE_SPARQL_TEMPLATE;

	/**
	 * The operation id for the '<em>Generate JSON Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___GENERATE_JSON_OBJECT = FRAGMENT___GENERATE_JSON_OBJECT;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___IS_VALID__ABSTRACTIONLEVEL = FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Variant JSON Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___GENERATE_VARIANT_JSON_OBJECT = FRAGMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___GET_TYPE = FRAGMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___GET_ROLE = FRAGMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___SET_VALUE__STRING = FRAGMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___GET_VALUE = FRAGMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Set Default Value Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___SET_DEFAULT_VALUE_MAP__STRING = FRAGMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___SET_ATTRIBUTE_VALUE__STRING_STRING = FRAGMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___GET_ATTRIBUTE_VALUE__STRING = FRAGMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Clear Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___CLEAR_VALUE = FRAGMENT_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Parameter Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT_OPERATION_COUNT = FRAGMENT_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.textrepresentation.impl.TextFragmentImpl <em>Text Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.textrepresentation.impl.TextFragmentImpl
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getTextFragment()
	 * @generated
	 */
	int TEXT_FRAGMENT = 3;

	/**
	 * The feature id for the '<em><b>Pattern Text</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT__PATTERN_TEXT = FRAGMENT__PATTERN_TEXT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT__TEXT = FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT___GENERATE_JSON = FRAGMENT___GENERATE_JSON;

	/**
	 * The operation id for the '<em>Get Preview</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT___GET_PREVIEW = FRAGMENT___GET_PREVIEW;

	/**
	 * The operation id for the '<em>Generate Sparql Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT___GENERATE_SPARQL_TEMPLATE = FRAGMENT___GENERATE_SPARQL_TEMPLATE;

	/**
	 * The operation id for the '<em>Generate JSON Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT___GENERATE_JSON_OBJECT = FRAGMENT___GENERATE_JSON_OBJECT;

	/**
	 * The operation id for the '<em>Generate Variant JSON Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT___GENERATE_VARIANT_JSON_OBJECT = FRAGMENT___GENERATE_VARIANT_JSON_OBJECT;

	/**
	 * The number of operations of the '<em>Text Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT_OPERATION_COUNT = FRAGMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link qualitypatternmodel.textrepresentation.ParameterReference <em>Parameter Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.textrepresentation.ParameterReference
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getParameterReference()
	 * @generated
	 */
	int PARAMETER_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE___IS_VALID__ABSTRACTIONLEVEL = 0;

	/**
	 * The operation id for the '<em>Generate Variant JSON Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE___GENERATE_VARIANT_JSON_OBJECT = 1;

	/**
	 * The number of operations of the '<em>Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.textrepresentation.impl.ParameterPredefinitionImpl <em>Parameter Predefinition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.textrepresentation.impl.ParameterPredefinitionImpl
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getParameterPredefinition()
	 * @generated
	 */
	int PARAMETER_PREDEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PREDEFINITION__PARAMETER = PARAMETER_REFERENCE__PARAMETER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PREDEFINITION__VALUE = PARAMETER_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Patterntext</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PREDEFINITION__PATTERNTEXT = PARAMETER_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Predefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PREDEFINITION_FEATURE_COUNT = PARAMETER_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PREDEFINITION___IS_VALID__ABSTRACTIONLEVEL = PARAMETER_REFERENCE___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Generate Variant JSON Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PREDEFINITION___GENERATE_VARIANT_JSON_OBJECT = PARAMETER_REFERENCE___GENERATE_VARIANT_JSON_OBJECT;

	/**
	 * The number of operations of the '<em>Parameter Predefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PREDEFINITION_OPERATION_COUNT = PARAMETER_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.textrepresentation.impl.ValueMapImpl <em>Value Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.textrepresentation.impl.ValueMapImpl
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getValueMap()
	 * @generated
	 */
	int VALUE_MAP = 6;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MAP__KEYS = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MAP__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Value Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MAP_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Put</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MAP___PUT__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Get Values As Json Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MAP___GET_VALUES_AS_JSON_ARRAY = 1;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MAP___GET__STRING = 2;

	/**
	 * The operation id for the '<em>Get Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MAP___GET_KEY__STRING = 3;

	/**
	 * The operation id for the '<em>Add All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MAP___ADD_ALL__MAP = 4;

	/**
	 * The operation id for the '<em>Generate JSON Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MAP___GENERATE_JSON_OBJECT = 5;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MAP___CLEAR = 6;

	/**
	 * The operation id for the '<em>Is Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MAP___IS_EMPTY = 7;

	/**
	 * The operation id for the '<em>As Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MAP___AS_MAP = 8;

	/**
	 * The operation id for the '<em>Set Values From JSON Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MAP___SET_VALUES_FROM_JSON_OBJECT__JSONOBJECT = 9;

	/**
	 * The number of operations of the '<em>Value Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MAP_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '<em>Object Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getObjectWrapper()
	 * @generated
	 */
	int OBJECT_WRAPPER = 7;


	/**
	 * The meta object id for the '<em>JSON Object Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.json.JSONObject
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getJSONObjectWrapper()
	 * @generated
	 */
	int JSON_OBJECT_WRAPPER = 8;


	/**
	 * The meta object id for the '<em>JSON Array Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.json.JSONArray
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getJSONArrayWrapper()
	 * @generated
	 */
	int JSON_ARRAY_WRAPPER = 9;


	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.textrepresentation.PatternText <em>Pattern Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Text</em>'.
	 * @see qualitypatternmodel.textrepresentation.PatternText
	 * @generated
	 */
	EClass getPatternText();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.textrepresentation.PatternText#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see qualitypatternmodel.textrepresentation.PatternText#getPattern()
	 * @see #getPatternText()
	 * @generated
	 */
	EReference getPatternText_Pattern();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.textrepresentation.PatternText#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see qualitypatternmodel.textrepresentation.PatternText#getFragments()
	 * @see #getPatternText()
	 * @generated
	 */
	EReference getPatternText_Fragments();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.textrepresentation.PatternText#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qualitypatternmodel.textrepresentation.PatternText#getName()
	 * @see #getPatternText()
	 * @generated
	 */
	EAttribute getPatternText_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.textrepresentation.PatternText#getParameterPredefinitions <em>Parameter Predefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Predefinitions</em>'.
	 * @see qualitypatternmodel.textrepresentation.PatternText#getParameterPredefinitions()
	 * @see #getPatternText()
	 * @generated
	 */
	EReference getPatternText_ParameterPredefinitions();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.textrepresentation.PatternText#getFragmentsOrdered <em>Fragments Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fragments Ordered</em>'.
	 * @see qualitypatternmodel.textrepresentation.PatternText#getFragmentsOrdered()
	 * @see #getPatternText()
	 * @generated
	 */
	EReference getPatternText_FragmentsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.textrepresentation.PatternText#isTypeConstraint <em>Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Constraint</em>'.
	 * @see qualitypatternmodel.textrepresentation.PatternText#isTypeConstraint()
	 * @see #getPatternText()
	 * @generated
	 */
	EAttribute getPatternText_TypeConstraint();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.PatternText#generateJSON() <em>Generate JSON</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate JSON</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.PatternText#generateJSON()
	 * @generated
	 */
	EOperation getPatternText__GenerateJSON();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.PatternText#isValid(qualitypatternmodel.patternstructure.AbstractionLevel) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.PatternText#isValid(qualitypatternmodel.patternstructure.AbstractionLevel)
	 * @generated
	 */
	EOperation getPatternText__IsValid__AbstractionLevel();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.PatternText#instantiate() <em>Instantiate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instantiate</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.PatternText#instantiate()
	 * @generated
	 */
	EOperation getPatternText__Instantiate();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.PatternText#generateSparqlTemplate() <em>Generate Sparql Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Sparql Template</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.PatternText#generateSparqlTemplate()
	 * @generated
	 */
	EOperation getPatternText__GenerateSparqlTemplate();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.PatternText#generateJSONObject() <em>Generate JSON Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate JSON Object</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.PatternText#generateJSONObject()
	 * @generated
	 */
	EOperation getPatternText__GenerateJSONObject();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.PatternText#generateVariantJSONObject() <em>Generate Variant JSON Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Variant JSON Object</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.PatternText#generateVariantJSONObject()
	 * @generated
	 */
	EOperation getPatternText__GenerateVariantJSONObject();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.PatternText#delete() <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.PatternText#delete()
	 * @generated
	 */
	EOperation getPatternText__Delete();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.PatternText#getPreview() <em>Get Preview</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Preview</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.PatternText#getPreview()
	 * @generated
	 */
	EOperation getPatternText__GetPreview();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.PatternText#addFragment(qualitypatternmodel.textrepresentation.Fragment) <em>Add Fragment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Fragment</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.PatternText#addFragment(qualitypatternmodel.textrepresentation.Fragment)
	 * @generated
	 */
	EOperation getPatternText__AddFragment__Fragment();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.textrepresentation.ParameterFragment <em>Parameter Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Fragment</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment
	 * @generated
	 */
	EClass getParameterFragment();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getExampleValue <em>Example Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Example Value</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#getExampleValue()
	 * @see #getParameterFragment()
	 * @generated
	 */
	EAttribute getParameterFragment_ExampleValue();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#getName()
	 * @see #getParameterFragment()
	 * @generated
	 */
	EAttribute getParameterFragment_Name();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getValueMap <em>Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Map</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#getValueMap()
	 * @see #getParameterFragment()
	 * @generated
	 */
	EReference getParameterFragment_ValueMap();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#getId()
	 * @see #getParameterFragment()
	 * @generated
	 */
	EAttribute getParameterFragment_Id();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getUserValue <em>User Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Value</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#getUserValue()
	 * @see #getParameterFragment()
	 * @generated
	 */
	EAttribute getParameterFragment_UserValue();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#getDescription()
	 * @see #getParameterFragment()
	 * @generated
	 */
	EAttribute getParameterFragment_Description();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.textrepresentation.ParameterFragment#isPlural <em>Plural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plural</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#isPlural()
	 * @see #getParameterFragment()
	 * @generated
	 */
	EAttribute getParameterFragment_Plural();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getAttributeMap <em>Attribute Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Map</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#getAttributeMap()
	 * @see #getParameterFragment()
	 * @generated
	 */
	EReference getParameterFragment_AttributeMap();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#getType()
	 * @generated
	 */
	EOperation getParameterFragment__GetType();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getRole() <em>Get Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Role</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#getRole()
	 * @generated
	 */
	EOperation getParameterFragment__GetRole();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ParameterFragment#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getParameterFragment__SetValue__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#getValue()
	 * @generated
	 */
	EOperation getParameterFragment__GetValue();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ParameterFragment#setDefaultValueMap(java.lang.String) <em>Set Default Value Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Default Value Map</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#setDefaultValueMap(java.lang.String)
	 * @generated
	 */
	EOperation getParameterFragment__SetDefaultValueMap__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ParameterFragment#setAttributeValue(java.lang.String, java.lang.String) <em>Set Attribute Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Attribute Value</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#setAttributeValue(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getParameterFragment__SetAttributeValue__String_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getAttributeValue(java.lang.String) <em>Get Attribute Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute Value</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#getAttributeValue(java.lang.String)
	 * @generated
	 */
	EOperation getParameterFragment__GetAttributeValue__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ParameterFragment#clearValue() <em>Clear Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Value</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#clearValue()
	 * @generated
	 */
	EOperation getParameterFragment__ClearValue();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.textrepresentation.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see qualitypatternmodel.textrepresentation.Fragment
	 * @generated
	 */
	EClass getFragment();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.textrepresentation.Fragment#getPatternText <em>Pattern Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern Text</em>'.
	 * @see qualitypatternmodel.textrepresentation.Fragment#getPatternText()
	 * @see #getFragment()
	 * @generated
	 */
	EReference getFragment_PatternText();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.Fragment#generateJSON() <em>Generate JSON</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate JSON</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.Fragment#generateJSON()
	 * @generated
	 */
	EOperation getFragment__GenerateJSON();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.Fragment#getPreview() <em>Get Preview</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Preview</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.Fragment#getPreview()
	 * @generated
	 */
	EOperation getFragment__GetPreview();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.Fragment#generateSparqlTemplate() <em>Generate Sparql Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Sparql Template</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.Fragment#generateSparqlTemplate()
	 * @generated
	 */
	EOperation getFragment__GenerateSparqlTemplate();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.Fragment#generateJSONObject() <em>Generate JSON Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate JSON Object</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.Fragment#generateJSONObject()
	 * @generated
	 */
	EOperation getFragment__GenerateJSONObject();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.Fragment#generateVariantJSONObject() <em>Generate Variant JSON Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Variant JSON Object</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.Fragment#generateVariantJSONObject()
	 * @generated
	 */
	EOperation getFragment__GenerateVariantJSONObject();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.textrepresentation.TextFragment <em>Text Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Fragment</em>'.
	 * @see qualitypatternmodel.textrepresentation.TextFragment
	 * @generated
	 */
	EClass getTextFragment();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.textrepresentation.TextFragment#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see qualitypatternmodel.textrepresentation.TextFragment#getText()
	 * @see #getTextFragment()
	 * @generated
	 */
	EAttribute getTextFragment_Text();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.textrepresentation.ParameterPredefinition <em>Parameter Predefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Predefinition</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterPredefinition
	 * @generated
	 */
	EClass getParameterPredefinition();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.textrepresentation.ParameterPredefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterPredefinition#getValue()
	 * @see #getParameterPredefinition()
	 * @generated
	 */
	EAttribute getParameterPredefinition_Value();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.textrepresentation.ParameterPredefinition#getPatterntext <em>Patterntext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Patterntext</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterPredefinition#getPatterntext()
	 * @see #getParameterPredefinition()
	 * @generated
	 */
	EReference getParameterPredefinition_Patterntext();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.textrepresentation.ParameterReference <em>Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Reference</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterReference
	 * @generated
	 */
	EClass getParameterReference();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.textrepresentation.ParameterReference#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterReference#getParameter()
	 * @see #getParameterReference()
	 * @generated
	 */
	EReference getParameterReference_Parameter();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ParameterReference#isValid(qualitypatternmodel.patternstructure.AbstractionLevel) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ParameterReference#isValid(qualitypatternmodel.patternstructure.AbstractionLevel)
	 * @generated
	 */
	EOperation getParameterReference__IsValid__AbstractionLevel();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ParameterReference#generateVariantJSONObject() <em>Generate Variant JSON Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Variant JSON Object</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ParameterReference#generateVariantJSONObject()
	 * @generated
	 */
	EOperation getParameterReference__GenerateVariantJSONObject();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.textrepresentation.ValueMap <em>Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Map</em>'.
	 * @see qualitypatternmodel.textrepresentation.ValueMap
	 * @generated
	 */
	EClass getValueMap();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.textrepresentation.ValueMap#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keys</em>'.
	 * @see qualitypatternmodel.textrepresentation.ValueMap#getKeys()
	 * @see #getValueMap()
	 * @generated
	 */
	EAttribute getValueMap_Keys();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.textrepresentation.ValueMap#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see qualitypatternmodel.textrepresentation.ValueMap#getValues()
	 * @see #getValueMap()
	 * @generated
	 */
	EAttribute getValueMap_Values();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ValueMap#put(java.lang.String, java.lang.String) <em>Put</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Put</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ValueMap#put(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getValueMap__Put__String_String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ValueMap#getValuesAsJsonArray() <em>Get Values As Json Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Values As Json Array</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ValueMap#getValuesAsJsonArray()
	 * @generated
	 */
	EOperation getValueMap__GetValuesAsJsonArray();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ValueMap#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ValueMap#get(java.lang.String)
	 * @generated
	 */
	EOperation getValueMap__Get__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ValueMap#getKey(java.lang.String) <em>Get Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Key</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ValueMap#getKey(java.lang.String)
	 * @generated
	 */
	EOperation getValueMap__GetKey__String();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ValueMap#addAll(java.util.Map) <em>Add All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add All</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ValueMap#addAll(java.util.Map)
	 * @generated
	 */
	EOperation getValueMap__AddAll__Map();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ValueMap#generateJSONObject() <em>Generate JSON Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate JSON Object</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ValueMap#generateJSONObject()
	 * @generated
	 */
	EOperation getValueMap__GenerateJSONObject();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ValueMap#clear() <em>Clear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ValueMap#clear()
	 * @generated
	 */
	EOperation getValueMap__Clear();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ValueMap#isEmpty() <em>Is Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Empty</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ValueMap#isEmpty()
	 * @generated
	 */
	EOperation getValueMap__IsEmpty();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ValueMap#asMap() <em>As Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Map</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ValueMap#asMap()
	 * @generated
	 */
	EOperation getValueMap__AsMap();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ValueMap#setValuesFromJSONObject(org.json.JSONObject) <em>Set Values From JSON Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Values From JSON Object</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ValueMap#setValuesFromJSONObject(org.json.JSONObject)
	 * @generated
	 */
	EOperation getValueMap__SetValuesFromJSONObject__JSONObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object Wrapper</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObjectWrapper();

	/**
	 * Returns the meta object for data type '{@link org.json.JSONObject <em>JSON Object Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JSON Object Wrapper</em>'.
	 * @see org.json.JSONObject
	 * @model instanceClass="org.json.JSONObject"
	 * @generated
	 */
	EDataType getJSONObjectWrapper();

	/**
	 * Returns the meta object for data type '{@link org.json.JSONArray <em>JSON Array Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JSON Array Wrapper</em>'.
	 * @see org.json.JSONArray
	 * @model instanceClass="org.json.JSONArray"
	 * @generated
	 */
	EDataType getJSONArrayWrapper();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TextrepresentationFactory getTextrepresentationFactory();

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
		 * The meta object literal for the '{@link qualitypatternmodel.textrepresentation.impl.PatternTextImpl <em>Pattern Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.textrepresentation.impl.PatternTextImpl
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getPatternText()
		 * @generated
		 */
		EClass PATTERN_TEXT = eINSTANCE.getPatternText();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TEXT__PATTERN = eINSTANCE.getPatternText_Pattern();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TEXT__FRAGMENTS = eINSTANCE.getPatternText_Fragments();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TEXT__NAME = eINSTANCE.getPatternText_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter Predefinitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TEXT__PARAMETER_PREDEFINITIONS = eINSTANCE.getPatternText_ParameterPredefinitions();

		/**
		 * The meta object literal for the '<em><b>Fragments Ordered</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TEXT__FRAGMENTS_ORDERED = eINSTANCE.getPatternText_FragmentsOrdered();

		/**
		 * The meta object literal for the '<em><b>Type Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TEXT__TYPE_CONSTRAINT = eINSTANCE.getPatternText_TypeConstraint();

		/**
		 * The meta object literal for the '<em><b>Generate JSON</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_TEXT___GENERATE_JSON = eINSTANCE.getPatternText__GenerateJSON();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_TEXT___IS_VALID__ABSTRACTIONLEVEL = eINSTANCE.getPatternText__IsValid__AbstractionLevel();

		/**
		 * The meta object literal for the '<em><b>Instantiate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_TEXT___INSTANTIATE = eINSTANCE.getPatternText__Instantiate();

		/**
		 * The meta object literal for the '<em><b>Generate Sparql Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_TEXT___GENERATE_SPARQL_TEMPLATE = eINSTANCE.getPatternText__GenerateSparqlTemplate();

		/**
		 * The meta object literal for the '<em><b>Generate JSON Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_TEXT___GENERATE_JSON_OBJECT = eINSTANCE.getPatternText__GenerateJSONObject();

		/**
		 * The meta object literal for the '<em><b>Generate Variant JSON Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_TEXT___GENERATE_VARIANT_JSON_OBJECT = eINSTANCE.getPatternText__GenerateVariantJSONObject();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_TEXT___DELETE = eINSTANCE.getPatternText__Delete();

		/**
		 * The meta object literal for the '<em><b>Get Preview</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_TEXT___GET_PREVIEW = eINSTANCE.getPatternText__GetPreview();

		/**
		 * The meta object literal for the '<em><b>Add Fragment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_TEXT___ADD_FRAGMENT__FRAGMENT = eINSTANCE.getPatternText__AddFragment__Fragment();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl <em>Parameter Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getParameterFragment()
		 * @generated
		 */
		EClass PARAMETER_FRAGMENT = eINSTANCE.getParameterFragment();

		/**
		 * The meta object literal for the '<em><b>Example Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_FRAGMENT__EXAMPLE_VALUE = eINSTANCE.getParameterFragment_ExampleValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_FRAGMENT__NAME = eINSTANCE.getParameterFragment_Name();

		/**
		 * The meta object literal for the '<em><b>Value Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_FRAGMENT__VALUE_MAP = eINSTANCE.getParameterFragment_ValueMap();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_FRAGMENT__ID = eINSTANCE.getParameterFragment_Id();

		/**
		 * The meta object literal for the '<em><b>User Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_FRAGMENT__USER_VALUE = eINSTANCE.getParameterFragment_UserValue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_FRAGMENT__DESCRIPTION = eINSTANCE.getParameterFragment_Description();

		/**
		 * The meta object literal for the '<em><b>Plural</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_FRAGMENT__PLURAL = eINSTANCE.getParameterFragment_Plural();

		/**
		 * The meta object literal for the '<em><b>Attribute Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_FRAGMENT__ATTRIBUTE_MAP = eINSTANCE.getParameterFragment_AttributeMap();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_FRAGMENT___GET_TYPE = eINSTANCE.getParameterFragment__GetType();

		/**
		 * The meta object literal for the '<em><b>Get Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_FRAGMENT___GET_ROLE = eINSTANCE.getParameterFragment__GetRole();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_FRAGMENT___SET_VALUE__STRING = eINSTANCE.getParameterFragment__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_FRAGMENT___GET_VALUE = eINSTANCE.getParameterFragment__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Default Value Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_FRAGMENT___SET_DEFAULT_VALUE_MAP__STRING = eINSTANCE.getParameterFragment__SetDefaultValueMap__String();

		/**
		 * The meta object literal for the '<em><b>Set Attribute Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_FRAGMENT___SET_ATTRIBUTE_VALUE__STRING_STRING = eINSTANCE.getParameterFragment__SetAttributeValue__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Attribute Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_FRAGMENT___GET_ATTRIBUTE_VALUE__STRING = eINSTANCE.getParameterFragment__GetAttributeValue__String();

		/**
		 * The meta object literal for the '<em><b>Clear Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_FRAGMENT___CLEAR_VALUE = eINSTANCE.getParameterFragment__ClearValue();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.textrepresentation.impl.FragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.textrepresentation.impl.FragmentImpl
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getFragment()
		 * @generated
		 */
		EClass FRAGMENT = eINSTANCE.getFragment();

		/**
		 * The meta object literal for the '<em><b>Pattern Text</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT__PATTERN_TEXT = eINSTANCE.getFragment_PatternText();

		/**
		 * The meta object literal for the '<em><b>Generate JSON</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAGMENT___GENERATE_JSON = eINSTANCE.getFragment__GenerateJSON();

		/**
		 * The meta object literal for the '<em><b>Get Preview</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAGMENT___GET_PREVIEW = eINSTANCE.getFragment__GetPreview();

		/**
		 * The meta object literal for the '<em><b>Generate Sparql Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAGMENT___GENERATE_SPARQL_TEMPLATE = eINSTANCE.getFragment__GenerateSparqlTemplate();

		/**
		 * The meta object literal for the '<em><b>Generate JSON Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAGMENT___GENERATE_JSON_OBJECT = eINSTANCE.getFragment__GenerateJSONObject();

		/**
		 * The meta object literal for the '<em><b>Generate Variant JSON Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAGMENT___GENERATE_VARIANT_JSON_OBJECT = eINSTANCE.getFragment__GenerateVariantJSONObject();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.textrepresentation.impl.TextFragmentImpl <em>Text Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.textrepresentation.impl.TextFragmentImpl
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getTextFragment()
		 * @generated
		 */
		EClass TEXT_FRAGMENT = eINSTANCE.getTextFragment();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FRAGMENT__TEXT = eINSTANCE.getTextFragment_Text();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.textrepresentation.impl.ParameterPredefinitionImpl <em>Parameter Predefinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.textrepresentation.impl.ParameterPredefinitionImpl
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getParameterPredefinition()
		 * @generated
		 */
		EClass PARAMETER_PREDEFINITION = eINSTANCE.getParameterPredefinition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_PREDEFINITION__VALUE = eINSTANCE.getParameterPredefinition_Value();

		/**
		 * The meta object literal for the '<em><b>Patterntext</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_PREDEFINITION__PATTERNTEXT = eINSTANCE.getParameterPredefinition_Patterntext();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.textrepresentation.ParameterReference <em>Parameter Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.textrepresentation.ParameterReference
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getParameterReference()
		 * @generated
		 */
		EClass PARAMETER_REFERENCE = eINSTANCE.getParameterReference();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_REFERENCE__PARAMETER = eINSTANCE.getParameterReference_Parameter();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_REFERENCE___IS_VALID__ABSTRACTIONLEVEL = eINSTANCE.getParameterReference__IsValid__AbstractionLevel();

		/**
		 * The meta object literal for the '<em><b>Generate Variant JSON Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_REFERENCE___GENERATE_VARIANT_JSON_OBJECT = eINSTANCE.getParameterReference__GenerateVariantJSONObject();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.textrepresentation.impl.ValueMapImpl <em>Value Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.textrepresentation.impl.ValueMapImpl
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getValueMap()
		 * @generated
		 */
		EClass VALUE_MAP = eINSTANCE.getValueMap();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_MAP__KEYS = eINSTANCE.getValueMap_Keys();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_MAP__VALUES = eINSTANCE.getValueMap_Values();

		/**
		 * The meta object literal for the '<em><b>Put</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_MAP___PUT__STRING_STRING = eINSTANCE.getValueMap__Put__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Values As Json Array</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_MAP___GET_VALUES_AS_JSON_ARRAY = eINSTANCE.getValueMap__GetValuesAsJsonArray();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_MAP___GET__STRING = eINSTANCE.getValueMap__Get__String();

		/**
		 * The meta object literal for the '<em><b>Get Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_MAP___GET_KEY__STRING = eINSTANCE.getValueMap__GetKey__String();

		/**
		 * The meta object literal for the '<em><b>Add All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_MAP___ADD_ALL__MAP = eINSTANCE.getValueMap__AddAll__Map();

		/**
		 * The meta object literal for the '<em><b>Generate JSON Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_MAP___GENERATE_JSON_OBJECT = eINSTANCE.getValueMap__GenerateJSONObject();

		/**
		 * The meta object literal for the '<em><b>Clear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_MAP___CLEAR = eINSTANCE.getValueMap__Clear();

		/**
		 * The meta object literal for the '<em><b>Is Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_MAP___IS_EMPTY = eINSTANCE.getValueMap__IsEmpty();

		/**
		 * The meta object literal for the '<em><b>As Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_MAP___AS_MAP = eINSTANCE.getValueMap__AsMap();

		/**
		 * The meta object literal for the '<em><b>Set Values From JSON Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_MAP___SET_VALUES_FROM_JSON_OBJECT__JSONOBJECT = eINSTANCE.getValueMap__SetValuesFromJSONObject__JSONObject();

		/**
		 * The meta object literal for the '<em>Object Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getObjectWrapper()
		 * @generated
		 */
		EDataType OBJECT_WRAPPER = eINSTANCE.getObjectWrapper();

		/**
		 * The meta object literal for the '<em>JSON Object Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.json.JSONObject
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getJSONObjectWrapper()
		 * @generated
		 */
		EDataType JSON_OBJECT_WRAPPER = eINSTANCE.getJSONObjectWrapper();

		/**
		 * The meta object literal for the '<em>JSON Array Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.json.JSONArray
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getJSONArrayWrapper()
		 * @generated
		 */
		EDataType JSON_ARRAY_WRAPPER = eINSTANCE.getJSONArrayWrapper();

	}

} //TextrepresentationPackage

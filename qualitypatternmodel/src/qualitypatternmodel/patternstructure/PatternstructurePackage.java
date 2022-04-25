/**
 */
package qualitypatternmodel.patternstructure;

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
 * @see qualitypatternmodel.patternstructure.PatternstructureFactory
 * @model kind="package"
 * @generated
 */
public interface PatternstructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "patternstructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "patternstructure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "patternstructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternstructurePackage eINSTANCE = qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.PatternElementImpl <em>Pattern Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.PatternElementImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getPatternElement()
	 * @generated
	 */
	int PATTERN_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__INTERNAL_ID = 1;

	/**
	 * The number of structural features of the '<em>Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___GENERATE_QUERY = 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___GET_ALL_PARAMETERS = 1;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___PREPARE_TRANSLATION = 2;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL = 3;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL = 4;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___GET_CONTAINER = 5;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___GET_ANCESTOR__CLASS = 6;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___MY_TO_STRING = 7;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = 8;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES = 9;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___GET_PARAMETER_LIST = 10;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___GET_OPERATOR_LIST = 11;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___CREATE_XML_ADAPTION = 12;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___FINALIZE_XML_ADAPTION = 13;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___RECORD_VALUES__XMLDATADATABASE = 14;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___RELATIONS_XML_ADAPTED = 15;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = 16;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = 17;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST = 18;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___INITIALIZE_TRANSLATION = 19;

	/**
	 * The number of operations of the '<em>Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT_OPERATION_COUNT = 20;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.MappingImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ID = PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__INTERNAL_ID = PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Morphism</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MORPHISM = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GENERATE_QUERY = PATTERN_ELEMENT___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GET_ALL_PARAMETERS = PATTERN_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___PREPARE_TRANSLATION = PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___IS_VALID__ABSTRACTIONLEVEL = PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GET_CONTAINER = PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GET_ANCESTOR__CLASS = PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___MY_TO_STRING = PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP = PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___PREPARE_PARAMETER_UPDATES = PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GET_PARAMETER_LIST = PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GET_OPERATOR_LIST = PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___CREATE_XML_ADAPTION = PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___FINALIZE_XML_ADAPTION = PATTERN_ELEMENT___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___RECORD_VALUES__XMLDATADATABASE = PATTERN_ELEMENT___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___RELATIONS_XML_ADAPTED = PATTERN_ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___UPDATE_PARAMETERS__PARAMETERLIST = PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___INITIALIZE_TRANSLATION = PATTERN_ELEMENT___INITIALIZE_TRANSLATION;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.RelationMappingImpl <em>Relation Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.RelationMappingImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getRelationMapping()
	 * @generated
	 */
	int RELATION_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING__ID = MAPPING__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING__INTERNAL_ID = MAPPING__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Morphism</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING__MORPHISM = MAPPING__MORPHISM;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING__TARGET = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING__SOURCE = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___GENERATE_QUERY = MAPPING___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___GET_ALL_PARAMETERS = MAPPING___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___PREPARE_TRANSLATION = MAPPING___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___IS_VALID__ABSTRACTIONLEVEL = MAPPING___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___IS_VALID_LOCAL__ABSTRACTIONLEVEL = MAPPING___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___GET_CONTAINER = MAPPING___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___GET_ANCESTOR__CLASS = MAPPING___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___MY_TO_STRING = MAPPING___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP = MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___PREPARE_PARAMETER_UPDATES = MAPPING___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___GET_PARAMETER_LIST = MAPPING___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___GET_OPERATOR_LIST = MAPPING___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___CREATE_XML_ADAPTION = MAPPING___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___FINALIZE_XML_ADAPTION = MAPPING___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___RECORD_VALUES__XMLDATADATABASE = MAPPING___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___RELATIONS_XML_ADAPTED = MAPPING___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = MAPPING___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = MAPPING___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___UPDATE_PARAMETERS__PARAMETERLIST = MAPPING___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___INITIALIZE_TRANSLATION = MAPPING___INITIALIZE_TRANSLATION;

	/**
	 * The number of operations of the '<em>Relation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.ConditionImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ID = PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__INTERNAL_ID = PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PATTERN = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantified Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__QUANTIFIED_CONDITION = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__FORMULA1 = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formula2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__FORMULA2 = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Not Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NOT_CONDITION = PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___GENERATE_QUERY = PATTERN_ELEMENT___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___GET_ALL_PARAMETERS = PATTERN_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___PREPARE_TRANSLATION = PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___IS_VALID__ABSTRACTIONLEVEL = PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___GET_CONTAINER = PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___GET_ANCESTOR__CLASS = PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___MY_TO_STRING = PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP = PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___PREPARE_PARAMETER_UPDATES = PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___GET_PARAMETER_LIST = PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___GET_OPERATOR_LIST = PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___CREATE_XML_ADAPTION = PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___FINALIZE_XML_ADAPTION = PATTERN_ELEMENT___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___RECORD_VALUES__XMLDATADATABASE = PATTERN_ELEMENT___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___RELATIONS_XML_ADAPTED = PATTERN_ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___UPDATE_PARAMETERS__PARAMETERLIST = PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___INITIALIZE_TRANSLATION = PATTERN_ELEMENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Next Morphism Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___GET_NEXT_MORPHISM_CONTAINERS = PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl <em>Quantified Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getQuantifiedCondition()
	 * @generated
	 */
	int QUANTIFIED_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__ID = CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__INTERNAL_ID = CONDITION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__PATTERN = CONDITION__PATTERN;

	/**
	 * The feature id for the '<em><b>Quantified Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__QUANTIFIED_CONDITION = CONDITION__QUANTIFIED_CONDITION;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__FORMULA1 = CONDITION__FORMULA1;

	/**
	 * The feature id for the '<em><b>Formula2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__FORMULA2 = CONDITION__FORMULA2;

	/**
	 * The feature id for the '<em><b>Not Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__NOT_CONDITION = CONDITION__NOT_CONDITION;

	/**
	 * The feature id for the '<em><b>Morphism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__MORPHISM = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__QUANTIFIER = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__GRAPH = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__CONDITION = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Quantified Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___GENERATE_QUERY = CONDITION___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___GET_ALL_PARAMETERS = CONDITION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___PREPARE_TRANSLATION = CONDITION___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___IS_VALID__ABSTRACTIONLEVEL = CONDITION___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___IS_VALID_LOCAL__ABSTRACTIONLEVEL = CONDITION___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___GET_CONTAINER = CONDITION___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___GET_ANCESTOR__CLASS = CONDITION___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___MY_TO_STRING = CONDITION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP = CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___PREPARE_PARAMETER_UPDATES = CONDITION___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___GET_PARAMETER_LIST = CONDITION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___GET_OPERATOR_LIST = CONDITION___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___CREATE_XML_ADAPTION = CONDITION___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___FINALIZE_XML_ADAPTION = CONDITION___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___RECORD_VALUES__XMLDATADATABASE = CONDITION___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___RELATIONS_XML_ADAPTED = CONDITION___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___UPDATE_PARAMETERS__PARAMETERLIST = CONDITION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___INITIALIZE_TRANSLATION = CONDITION___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Next Morphism Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___GET_NEXT_MORPHISM_CONTAINERS = CONDITION___GET_NEXT_MORPHISM_CONTAINERS;

	/**
	 * The operation id for the '<em>Get Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___GET_GRAPH = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Copy Previous Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___COPY_PREVIOUS_GRAPH = CONDITION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Morphism Of Next Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___CHECK_MORPHISM_OF_NEXT_GRAPH = CONDITION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quantified Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.MorphismImpl <em>Morphism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.MorphismImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getMorphism()
	 * @generated
	 */
	int MORPHISM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__ID = PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__INTERNAL_ID = PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__MAPPINGS = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__SOURCE = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__TARGET = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Morphism Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__MORPHISM_CONTAINER = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Morphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___GENERATE_QUERY = PATTERN_ELEMENT___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___GET_ALL_PARAMETERS = PATTERN_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___PREPARE_TRANSLATION = PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___IS_VALID__ABSTRACTIONLEVEL = PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___GET_CONTAINER = PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___GET_ANCESTOR__CLASS = PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___MY_TO_STRING = PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___VALIDATE__DIAGNOSTICCHAIN_MAP = PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___PREPARE_PARAMETER_UPDATES = PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___GET_PARAMETER_LIST = PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___GET_OPERATOR_LIST = PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___CREATE_XML_ADAPTION = PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___FINALIZE_XML_ADAPTION = PATTERN_ELEMENT___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___RECORD_VALUES__XMLDATADATABASE = PATTERN_ELEMENT___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___RELATIONS_XML_ADAPTED = PATTERN_ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___UPDATE_PARAMETERS__PARAMETERLIST = PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___INITIALIZE_TRANSLATION = PATTERN_ELEMENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Check Element Mappings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___CHECK_ELEMENT_MAPPINGS = PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Relation Mappings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___CHECK_RELATION_MAPPINGS = PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Relation Mappings Uniqueness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___CHECK_RELATION_MAPPINGS_UNIQUENESS = PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Check Element Mappings Uniqueness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___CHECK_ELEMENT_MAPPINGS_UNIQUENESS = PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___ADD_MAPPING__NODE_NODE = PATTERN_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___ADD_MAPPING__RELATION_RELATION = PATTERN_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Remove Inconsistent Mappings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___REMOVE_INCONSISTENT_MAPPINGS = PATTERN_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Morphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.ElementMappingImpl <em>Element Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.ElementMappingImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getElementMapping()
	 * @generated
	 */
	int ELEMENT_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING__ID = MAPPING__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING__INTERNAL_ID = MAPPING__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Morphism</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING__MORPHISM = MAPPING__MORPHISM;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING__SOURCE = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING__TARGET = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___GENERATE_QUERY = MAPPING___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___GET_ALL_PARAMETERS = MAPPING___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___PREPARE_TRANSLATION = MAPPING___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___IS_VALID__ABSTRACTIONLEVEL = MAPPING___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___IS_VALID_LOCAL__ABSTRACTIONLEVEL = MAPPING___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___GET_CONTAINER = MAPPING___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___GET_ANCESTOR__CLASS = MAPPING___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___MY_TO_STRING = MAPPING___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP = MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___PREPARE_PARAMETER_UPDATES = MAPPING___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___GET_PARAMETER_LIST = MAPPING___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___GET_OPERATOR_LIST = MAPPING___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___CREATE_XML_ADAPTION = MAPPING___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___FINALIZE_XML_ADAPTION = MAPPING___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___RECORD_VALUES__XMLDATADATABASE = MAPPING___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___RELATIONS_XML_ADAPTED = MAPPING___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = MAPPING___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = MAPPING___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___UPDATE_PARAMETERS__PARAMETERLIST = MAPPING___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING___INITIALIZE_TRANSLATION = MAPPING___INITIALIZE_TRANSLATION;

	/**
	 * The number of operations of the '<em>Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.FormulaImpl <em>Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.FormulaImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getFormula()
	 * @generated
	 */
	int FORMULA = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__ID = CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__INTERNAL_ID = CONDITION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__PATTERN = CONDITION__PATTERN;

	/**
	 * The feature id for the '<em><b>Quantified Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__QUANTIFIED_CONDITION = CONDITION__QUANTIFIED_CONDITION;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__FORMULA1 = CONDITION__FORMULA1;

	/**
	 * The feature id for the '<em><b>Formula2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__FORMULA2 = CONDITION__FORMULA2;

	/**
	 * The feature id for the '<em><b>Not Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__NOT_CONDITION = CONDITION__NOT_CONDITION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__OPERATOR = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__CONDITION1 = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__CONDITION2 = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___GENERATE_QUERY = CONDITION___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___GET_ALL_PARAMETERS = CONDITION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___PREPARE_TRANSLATION = CONDITION___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___IS_VALID__ABSTRACTIONLEVEL = CONDITION___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___IS_VALID_LOCAL__ABSTRACTIONLEVEL = CONDITION___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___GET_CONTAINER = CONDITION___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___GET_ANCESTOR__CLASS = CONDITION___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___MY_TO_STRING = CONDITION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___VALIDATE__DIAGNOSTICCHAIN_MAP = CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___PREPARE_PARAMETER_UPDATES = CONDITION___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___GET_PARAMETER_LIST = CONDITION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___GET_OPERATOR_LIST = CONDITION___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___CREATE_XML_ADAPTION = CONDITION___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___FINALIZE_XML_ADAPTION = CONDITION___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___RECORD_VALUES__XMLDATADATABASE = CONDITION___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___RELATIONS_XML_ADAPTED = CONDITION___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___UPDATE_PARAMETERS__PARAMETERLIST = CONDITION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___INITIALIZE_TRANSLATION = CONDITION___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Next Morphism Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___GET_NEXT_MORPHISM_CONTAINERS = CONDITION___GET_NEXT_MORPHISM_CONTAINERS;

	/**
	 * The number of operations of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.TrueElementImpl <em>True Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.TrueElementImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getTrueElement()
	 * @generated
	 */
	int TRUE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT__ID = CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT__INTERNAL_ID = CONDITION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT__PATTERN = CONDITION__PATTERN;

	/**
	 * The feature id for the '<em><b>Quantified Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT__QUANTIFIED_CONDITION = CONDITION__QUANTIFIED_CONDITION;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT__FORMULA1 = CONDITION__FORMULA1;

	/**
	 * The feature id for the '<em><b>Formula2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT__FORMULA2 = CONDITION__FORMULA2;

	/**
	 * The feature id for the '<em><b>Not Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT__NOT_CONDITION = CONDITION__NOT_CONDITION;

	/**
	 * The number of structural features of the '<em>True Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___GENERATE_QUERY = CONDITION___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___GET_ALL_PARAMETERS = CONDITION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___PREPARE_TRANSLATION = CONDITION___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___IS_VALID__ABSTRACTIONLEVEL = CONDITION___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL = CONDITION___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___GET_CONTAINER = CONDITION___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___GET_ANCESTOR__CLASS = CONDITION___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___MY_TO_STRING = CONDITION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___PREPARE_PARAMETER_UPDATES = CONDITION___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___GET_PARAMETER_LIST = CONDITION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___GET_OPERATOR_LIST = CONDITION___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___CREATE_XML_ADAPTION = CONDITION___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___FINALIZE_XML_ADAPTION = CONDITION___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___RECORD_VALUES__XMLDATADATABASE = CONDITION___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___RELATIONS_XML_ADAPTED = CONDITION___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST = CONDITION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___INITIALIZE_TRANSLATION = CONDITION___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Next Morphism Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___GET_NEXT_MORPHISM_CONTAINERS = CONDITION___GET_NEXT_MORPHISM_CONTAINERS;

	/**
	 * The number of operations of the '<em>True Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.PatternImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ID = PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__INTERNAL_ID = PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__GRAPH = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__CONDITION = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Partial Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PARTIAL_QUERY = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__QUERY = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___GENERATE_QUERY = PATTERN_ELEMENT___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___GET_ALL_PARAMETERS = PATTERN_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___PREPARE_TRANSLATION = PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___IS_VALID__ABSTRACTIONLEVEL = PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___GET_CONTAINER = PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___GET_ANCESTOR__CLASS = PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___MY_TO_STRING = PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___VALIDATE__DIAGNOSTICCHAIN_MAP = PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___PREPARE_PARAMETER_UPDATES = PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___GET_PARAMETER_LIST = PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___GET_OPERATOR_LIST = PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___CREATE_XML_ADAPTION = PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___FINALIZE_XML_ADAPTION = PATTERN_ELEMENT___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___RECORD_VALUES__XMLDATADATABASE = PATTERN_ELEMENT___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___RELATIONS_XML_ADAPTED = PATTERN_ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___UPDATE_PARAMETERS__PARAMETERLIST = PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___INITIALIZE_TRANSLATION = PATTERN_ELEMENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Check Morphism Of Next Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___CHECK_MORPHISM_OF_NEXT_GRAPH = PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl <em>Complete Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.CompletePatternImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getCompletePattern()
	 * @generated
	 */
	int COMPLETE_PATTERN = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__ID = PATTERN__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__INTERNAL_ID = PATTERN__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__GRAPH = PATTERN__GRAPH;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__CONDITION = PATTERN__CONDITION;

	/**
	 * The feature id for the '<em><b>Partial Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__PARTIAL_QUERY = PATTERN__PARTIAL_QUERY;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__QUERY = PATTERN__QUERY;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__PARAMETER_LIST = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__NAME = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__DATABASE = PATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Adaption Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__ADAPTION_STARTED = PATTERN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Adaption Finalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__ADAPTION_FINALIZED = PATTERN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Element Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__ELEMENT_COUNTER = PATTERN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Property Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__PROPERTY_COUNTER = PATTERN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Relation Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__RELATION_COUNTER = PATTERN_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameter Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__PARAMETER_COUNTER = PATTERN_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operator Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__OPERATOR_COUNTER = PATTERN_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__COUNTER = PATTERN_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__TEXT = PATTERN_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__DESCRIPTION = PATTERN_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Abstract Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN__ABSTRACT_NAME = PATTERN_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Complete Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___GENERATE_QUERY = PATTERN___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___GET_ALL_PARAMETERS = PATTERN___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___PREPARE_TRANSLATION = PATTERN___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___IS_VALID__ABSTRACTIONLEVEL = PATTERN___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PATTERN___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___GET_CONTAINER = PATTERN___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___GET_ANCESTOR__CLASS = PATTERN___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___MY_TO_STRING = PATTERN___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___VALIDATE__DIAGNOSTICCHAIN_MAP = PATTERN___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___PREPARE_PARAMETER_UPDATES = PATTERN___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___GET_PARAMETER_LIST = PATTERN___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___GET_OPERATOR_LIST = PATTERN___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___CREATE_XML_ADAPTION = PATTERN___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___FINALIZE_XML_ADAPTION = PATTERN___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___RECORD_VALUES__XMLDATADATABASE = PATTERN___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___RELATIONS_XML_ADAPTED = PATTERN___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PATTERN___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PATTERN___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___UPDATE_PARAMETERS__PARAMETERLIST = PATTERN___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___INITIALIZE_TRANSLATION = PATTERN___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Check Morphism Of Next Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___CHECK_MORPHISM_OF_NEXT_GRAPH = PATTERN___CHECK_MORPHISM_OF_NEXT_GRAPH;

	/**
	 * The operation id for the '<em>Get New Ref No</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___GET_NEW_REF_NO__CLASS = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___RECORD_VALUES = PATTERN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Abstraction Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___GET_ABSTRACTION_LEVEL = PATTERN_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate Against Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___VALIDATE_AGAINST_SCHEMA = PATTERN_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Reset Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN___RESET_QUERY = PATTERN_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Complete Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_PATTERN_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.NotConditionImpl <em>Not Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.NotConditionImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getNotCondition()
	 * @generated
	 */
	int NOT_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION__ID = CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION__INTERNAL_ID = CONDITION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION__PATTERN = CONDITION__PATTERN;

	/**
	 * The feature id for the '<em><b>Quantified Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION__QUANTIFIED_CONDITION = CONDITION__QUANTIFIED_CONDITION;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION__FORMULA1 = CONDITION__FORMULA1;

	/**
	 * The feature id for the '<em><b>Formula2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION__FORMULA2 = CONDITION__FORMULA2;

	/**
	 * The feature id for the '<em><b>Not Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION__NOT_CONDITION = CONDITION__NOT_CONDITION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION__CONDITION = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___GENERATE_QUERY = CONDITION___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___GET_ALL_PARAMETERS = CONDITION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___PREPARE_TRANSLATION = CONDITION___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___IS_VALID__ABSTRACTIONLEVEL = CONDITION___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___IS_VALID_LOCAL__ABSTRACTIONLEVEL = CONDITION___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___GET_CONTAINER = CONDITION___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___GET_ANCESTOR__CLASS = CONDITION___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___MY_TO_STRING = CONDITION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP = CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___PREPARE_PARAMETER_UPDATES = CONDITION___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___GET_PARAMETER_LIST = CONDITION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___GET_OPERATOR_LIST = CONDITION___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___CREATE_XML_ADAPTION = CONDITION___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___FINALIZE_XML_ADAPTION = CONDITION___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___RECORD_VALUES__XMLDATADATABASE = CONDITION___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___RELATIONS_XML_ADAPTED = CONDITION___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___UPDATE_PARAMETERS__PARAMETERLIST = CONDITION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___INITIALIZE_TRANSLATION = CONDITION___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Next Morphism Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION___GET_NEXT_MORPHISM_CONTAINERS = CONDITION___GET_NEXT_MORPHISM_CONTAINERS;

	/**
	 * The number of operations of the '<em>Not Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.CountConditionImpl <em>Count Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.CountConditionImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getCountCondition()
	 * @generated
	 */
	int COUNT_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION__ID = CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION__INTERNAL_ID = CONDITION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION__PATTERN = CONDITION__PATTERN;

	/**
	 * The feature id for the '<em><b>Quantified Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION__QUANTIFIED_CONDITION = CONDITION__QUANTIFIED_CONDITION;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION__FORMULA1 = CONDITION__FORMULA1;

	/**
	 * The feature id for the '<em><b>Formula2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION__FORMULA2 = CONDITION__FORMULA2;

	/**
	 * The feature id for the '<em><b>Not Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION__NOT_CONDITION = CONDITION__NOT_CONDITION;

	/**
	 * The feature id for the '<em><b>Count Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION__COUNT_PATTERN = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION__OPTION = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION__ARGUMENT2 = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Count Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___GENERATE_QUERY = CONDITION___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___GET_ALL_PARAMETERS = CONDITION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___PREPARE_TRANSLATION = CONDITION___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___IS_VALID__ABSTRACTIONLEVEL = CONDITION___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___IS_VALID_LOCAL__ABSTRACTIONLEVEL = CONDITION___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___GET_CONTAINER = CONDITION___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___GET_ANCESTOR__CLASS = CONDITION___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___MY_TO_STRING = CONDITION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP = CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___PREPARE_PARAMETER_UPDATES = CONDITION___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___GET_PARAMETER_LIST = CONDITION___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___GET_OPERATOR_LIST = CONDITION___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___CREATE_XML_ADAPTION = CONDITION___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___FINALIZE_XML_ADAPTION = CONDITION___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___RECORD_VALUES__XMLDATADATABASE = CONDITION___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___RELATIONS_XML_ADAPTED = CONDITION___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = CONDITION___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___UPDATE_PARAMETERS__PARAMETERLIST = CONDITION___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___INITIALIZE_TRANSLATION = CONDITION___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Next Morphism Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___GET_NEXT_MORPHISM_CONTAINERS = CONDITION___GET_NEXT_MORPHISM_CONTAINERS;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___CREATE_PARAMETERS = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Count Pattern</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION___CREATE_COUNT_PATTERN = CONDITION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Count Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.CountConditionArgument <em>Count Condition Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.CountConditionArgument
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getCountConditionArgument()
	 * @generated
	 */
	int COUNT_CONDITION_ARGUMENT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT__ID = PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT__INTERNAL_ID = PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Count Condition2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT__COUNT_CONDITION2 = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Count Condition Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___GENERATE_QUERY = PATTERN_ELEMENT___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___GET_ALL_PARAMETERS = PATTERN_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___PREPARE_TRANSLATION = PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___IS_VALID__ABSTRACTIONLEVEL = PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___GET_CONTAINER = PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___GET_ANCESTOR__CLASS = PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___MY_TO_STRING = PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___PREPARE_PARAMETER_UPDATES = PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___GET_PARAMETER_LIST = PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___GET_OPERATOR_LIST = PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___CREATE_XML_ADAPTION = PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___FINALIZE_XML_ADAPTION = PATTERN_ELEMENT___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___RECORD_VALUES__XMLDATADATABASE = PATTERN_ELEMENT___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___RELATIONS_XML_ADAPTED = PATTERN_ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___UPDATE_PARAMETERS__PARAMETERLIST = PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT___INITIALIZE_TRANSLATION = PATTERN_ELEMENT___INITIALIZE_TRANSLATION;

	/**
	 * The number of operations of the '<em>Count Condition Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONDITION_ARGUMENT_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.MorphismContainer <em>Morphism Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.MorphismContainer
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getMorphismContainer()
	 * @generated
	 */
	int MORPHISM_CONTAINER = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER__ID = PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER__INTERNAL_ID = PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Morphism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER__MORPHISM = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Morphism Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___GENERATE_QUERY = PATTERN_ELEMENT___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___GET_ALL_PARAMETERS = PATTERN_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___PREPARE_TRANSLATION = PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___IS_VALID__ABSTRACTIONLEVEL = PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___GET_CONTAINER = PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___GET_ANCESTOR__CLASS = PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___MY_TO_STRING = PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___VALIDATE__DIAGNOSTICCHAIN_MAP = PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___PREPARE_PARAMETER_UPDATES = PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___GET_PARAMETER_LIST = PATTERN_ELEMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___GET_OPERATOR_LIST = PATTERN_ELEMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___CREATE_XML_ADAPTION = PATTERN_ELEMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___FINALIZE_XML_ADAPTION = PATTERN_ELEMENT___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___RECORD_VALUES__XMLDATADATABASE = PATTERN_ELEMENT___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___RELATIONS_XML_ADAPTED = PATTERN_ELEMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___UPDATE_PARAMETERS__PARAMETERLIST = PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___INITIALIZE_TRANSLATION = PATTERN_ELEMENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___GET_GRAPH = PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Copy Previous Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER___COPY_PREVIOUS_GRAPH = PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Morphism Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CONTAINER_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.CountPatternImpl <em>Count Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.CountPatternImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getCountPattern()
	 * @generated
	 */
	int COUNT_PATTERN = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN__ID = PATTERN__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN__INTERNAL_ID = PATTERN__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN__GRAPH = PATTERN__GRAPH;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN__CONDITION = PATTERN__CONDITION;

	/**
	 * The feature id for the '<em><b>Partial Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN__PARTIAL_QUERY = PATTERN__PARTIAL_QUERY;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN__QUERY = PATTERN__QUERY;

	/**
	 * The feature id for the '<em><b>Morphism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN__MORPHISM = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count Condition2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN__COUNT_CONDITION2 = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN__COUNT_CONDITION = PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Count Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___GENERATE_QUERY = PATTERN___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___GET_ALL_PARAMETERS = PATTERN___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___PREPARE_TRANSLATION = PATTERN___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___IS_VALID__ABSTRACTIONLEVEL = PATTERN___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___IS_VALID_LOCAL__ABSTRACTIONLEVEL = PATTERN___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___GET_CONTAINER = PATTERN___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___GET_ANCESTOR__CLASS = PATTERN___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___MY_TO_STRING = PATTERN___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___VALIDATE__DIAGNOSTICCHAIN_MAP = PATTERN___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___PREPARE_PARAMETER_UPDATES = PATTERN___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___GET_PARAMETER_LIST = PATTERN___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___GET_OPERATOR_LIST = PATTERN___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___CREATE_XML_ADAPTION = PATTERN___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___FINALIZE_XML_ADAPTION = PATTERN___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___RECORD_VALUES__XMLDATADATABASE = PATTERN___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___RELATIONS_XML_ADAPTED = PATTERN___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = PATTERN___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = PATTERN___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___UPDATE_PARAMETERS__PARAMETERLIST = PATTERN___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___INITIALIZE_TRANSLATION = PATTERN___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Check Morphism Of Next Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___CHECK_MORPHISM_OF_NEXT_GRAPH = PATTERN___CHECK_MORPHISM_OF_NEXT_GRAPH;

	/**
	 * The operation id for the '<em>Get Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___GET_GRAPH = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Copy Previous Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___COPY_PREVIOUS_GRAPH = PATTERN_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Count Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.NumberElementImpl <em>Number Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.NumberElementImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getNumberElement()
	 * @generated
	 */
	int NUMBER_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT__ID = COUNT_CONDITION_ARGUMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT__INTERNAL_ID = COUNT_CONDITION_ARGUMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Count Condition2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT__COUNT_CONDITION2 = COUNT_CONDITION_ARGUMENT__COUNT_CONDITION2;

	/**
	 * The feature id for the '<em><b>Number Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT__NUMBER_PARAM = COUNT_CONDITION_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT_FEATURE_COUNT = COUNT_CONDITION_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___GENERATE_QUERY = COUNT_CONDITION_ARGUMENT___GENERATE_QUERY;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___GET_ALL_PARAMETERS = COUNT_CONDITION_ARGUMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___PREPARE_TRANSLATION = COUNT_CONDITION_ARGUMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___IS_VALID__ABSTRACTIONLEVEL = COUNT_CONDITION_ARGUMENT___IS_VALID__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL = COUNT_CONDITION_ARGUMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___GET_CONTAINER = COUNT_CONDITION_ARGUMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___GET_ANCESTOR__CLASS = COUNT_CONDITION_ARGUMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___MY_TO_STRING = COUNT_CONDITION_ARGUMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = COUNT_CONDITION_ARGUMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Prepare Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___PREPARE_PARAMETER_UPDATES = COUNT_CONDITION_ARGUMENT___PREPARE_PARAMETER_UPDATES;

	/**
	 * The operation id for the '<em>Get Parameter List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___GET_PARAMETER_LIST = COUNT_CONDITION_ARGUMENT___GET_PARAMETER_LIST;

	/**
	 * The operation id for the '<em>Get Operator List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___GET_OPERATOR_LIST = COUNT_CONDITION_ARGUMENT___GET_OPERATOR_LIST;

	/**
	 * The operation id for the '<em>Create XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___CREATE_XML_ADAPTION = COUNT_CONDITION_ARGUMENT___CREATE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Finalize XML Adaption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___FINALIZE_XML_ADAPTION = COUNT_CONDITION_ARGUMENT___FINALIZE_XML_ADAPTION;

	/**
	 * The operation id for the '<em>Record Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___RECORD_VALUES__XMLDATADATABASE = COUNT_CONDITION_ARGUMENT___RECORD_VALUES__XMLDATADATABASE;

	/**
	 * The operation id for the '<em>Relations Xml Adapted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___RELATIONS_XML_ADAPTED = COUNT_CONDITION_ARGUMENT___RELATIONS_XML_ADAPTED;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = COUNT_CONDITION_ARGUMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Trigger Parameter Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = COUNT_CONDITION_ARGUMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;

	/**
	 * The operation id for the '<em>Update Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST = COUNT_CONDITION_ARGUMENT___UPDATE_PARAMETERS__PARAMETERLIST;

	/**
	 * The operation id for the '<em>Initialize Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___INITIALIZE_TRANSLATION = COUNT_CONDITION_ARGUMENT___INITIALIZE_TRANSLATION;

	/**
	 * The operation id for the '<em>Create Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT___CREATE_PARAMETERS = COUNT_CONDITION_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ELEMENT_OPERATION_COUNT = COUNT_CONDITION_ARGUMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.LogicalOperator
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 17;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.Quantifier <em>Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getQuantifier()
	 * @generated
	 */
	int QUANTIFIER = 18;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.AbstractionLevel <em>Abstraction Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.AbstractionLevel
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getAbstractionLevel()
	 * @generated
	 */
	int ABSTRACTION_LEVEL = 19;

	/**
	 * The meta object id for the '<em>Invalidity Exception Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.exceptions.InvalidityException
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getInvalidityExceptionWrapper()
	 * @generated
	 */
	int INVALIDITY_EXCEPTION_WRAPPER = 20;

	/**
	 * The meta object id for the '<em>Class Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getClassWrapper()
	 * @generated
	 */
	int CLASS_WRAPPER = 21;

	/**
	 * The meta object id for the '<em>Missing Pattern Container Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.exceptions.MissingPatternContainerException
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getMissingPatternContainerException()
	 * @generated
	 */
	int MISSING_PATTERN_CONTAINER_EXCEPTION = 22;

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.RelationMapping <em>Relation Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Mapping</em>'.
	 * @see qualitypatternmodel.patternstructure.RelationMapping
	 * @generated
	 */
	EClass getRelationMapping();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.RelationMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see qualitypatternmodel.patternstructure.RelationMapping#getTarget()
	 * @see #getRelationMapping()
	 * @generated
	 */
	EReference getRelationMapping_Target();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.RelationMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see qualitypatternmodel.patternstructure.RelationMapping#getSource()
	 * @see #getRelationMapping()
	 * @generated
	 */
	EReference getRelationMapping_Source();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.QuantifiedCondition <em>Quantified Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantified Condition</em>'.
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition
	 * @generated
	 */
	EClass getQuantifiedCondition();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition#getCondition()
	 * @see #getQuantifiedCondition()
	 * @generated
	 */
	EReference getQuantifiedCondition_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graph</em>'.
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition#getGraph()
	 * @see #getQuantifiedCondition()
	 * @generated
	 */
	EReference getQuantifiedCondition_Graph();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#checkMorphismOfNextGraph() <em>Check Morphism Of Next Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Morphism Of Next Graph</em>' operation.
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition#checkMorphismOfNextGraph()
	 * @generated
	 */
	EOperation getQuantifiedCondition__CheckMorphismOfNextGraph();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier</em>'.
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition#getQuantifier()
	 * @see #getQuantifiedCondition()
	 * @generated
	 */
	EAttribute getQuantifiedCondition_Quantifier();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see qualitypatternmodel.patternstructure.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.patternstructure.Condition#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see qualitypatternmodel.patternstructure.Condition#getPattern()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Pattern();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.patternstructure.Condition#getQuantifiedCondition <em>Quantified Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Quantified Condition</em>'.
	 * @see qualitypatternmodel.patternstructure.Condition#getQuantifiedCondition()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_QuantifiedCondition();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.patternstructure.Condition#getFormula1 <em>Formula1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Formula1</em>'.
	 * @see qualitypatternmodel.patternstructure.Condition#getFormula1()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Formula1();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.patternstructure.Condition#getFormula2 <em>Formula2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Formula2</em>'.
	 * @see qualitypatternmodel.patternstructure.Condition#getFormula2()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Formula2();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.patternstructure.Condition#getNotCondition <em>Not Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Not Condition</em>'.
	 * @see qualitypatternmodel.patternstructure.Condition#getNotCondition()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_NotCondition();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.Condition#getNextMorphismContainers() <em>Get Next Morphism Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next Morphism Containers</em>' operation.
	 * @see qualitypatternmodel.patternstructure.Condition#getNextMorphismContainers()
	 * @generated
	 */
	EOperation getCondition__GetNextMorphismContainers();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.Morphism <em>Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Morphism</em>'.
	 * @see qualitypatternmodel.patternstructure.Morphism
	 * @generated
	 */
	EClass getMorphism();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.patternstructure.Morphism#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see qualitypatternmodel.patternstructure.Morphism#getMappings()
	 * @see #getMorphism()
	 * @generated
	 */
	EReference getMorphism_Mappings();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.Morphism#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see qualitypatternmodel.patternstructure.Morphism#getSource()
	 * @see #getMorphism()
	 * @generated
	 */
	EReference getMorphism_Source();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.Morphism#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see qualitypatternmodel.patternstructure.Morphism#getTarget()
	 * @see #getMorphism()
	 * @generated
	 */
	EReference getMorphism_Target();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.patternstructure.Morphism#getMorphismContainer <em>Morphism Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Morphism Container</em>'.
	 * @see qualitypatternmodel.patternstructure.Morphism#getMorphismContainer()
	 * @see #getMorphism()
	 * @generated
	 */
	EReference getMorphism_MorphismContainer();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.Morphism#checkElementMappings() <em>Check Element Mappings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Element Mappings</em>' operation.
	 * @see qualitypatternmodel.patternstructure.Morphism#checkElementMappings()
	 * @generated
	 */
	EOperation getMorphism__CheckElementMappings();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.Morphism#checkRelationMappings() <em>Check Relation Mappings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Relation Mappings</em>' operation.
	 * @see qualitypatternmodel.patternstructure.Morphism#checkRelationMappings()
	 * @generated
	 */
	EOperation getMorphism__CheckRelationMappings();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.Morphism#checkRelationMappingsUniqueness() <em>Check Relation Mappings Uniqueness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Relation Mappings Uniqueness</em>' operation.
	 * @see qualitypatternmodel.patternstructure.Morphism#checkRelationMappingsUniqueness()
	 * @generated
	 */
	EOperation getMorphism__CheckRelationMappingsUniqueness();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.Morphism#checkElementMappingsUniqueness() <em>Check Element Mappings Uniqueness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Element Mappings Uniqueness</em>' operation.
	 * @see qualitypatternmodel.patternstructure.Morphism#checkElementMappingsUniqueness()
	 * @generated
	 */
	EOperation getMorphism__CheckElementMappingsUniqueness();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.Morphism#addMapping(qualitypatternmodel.graphstructure.Node, qualitypatternmodel.graphstructure.Node) <em>Add Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Mapping</em>' operation.
	 * @see qualitypatternmodel.patternstructure.Morphism#addMapping(qualitypatternmodel.graphstructure.Node, qualitypatternmodel.graphstructure.Node)
	 * @generated
	 */
	EOperation getMorphism__AddMapping__Node_Node();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.Morphism#addMapping(qualitypatternmodel.graphstructure.Relation, qualitypatternmodel.graphstructure.Relation) <em>Add Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Mapping</em>' operation.
	 * @see qualitypatternmodel.patternstructure.Morphism#addMapping(qualitypatternmodel.graphstructure.Relation, qualitypatternmodel.graphstructure.Relation)
	 * @generated
	 */
	EOperation getMorphism__AddMapping__Relation_Relation();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.Morphism#removeInconsistentMappings() <em>Remove Inconsistent Mappings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Inconsistent Mappings</em>' operation.
	 * @see qualitypatternmodel.patternstructure.Morphism#removeInconsistentMappings()
	 * @generated
	 */
	EOperation getMorphism__RemoveInconsistentMappings();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.ElementMapping <em>Element Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Mapping</em>'.
	 * @see qualitypatternmodel.patternstructure.ElementMapping
	 * @generated
	 */
	EClass getElementMapping();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.ElementMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see qualitypatternmodel.patternstructure.ElementMapping#getSource()
	 * @see #getElementMapping()
	 * @generated
	 */
	EReference getElementMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.ElementMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see qualitypatternmodel.patternstructure.ElementMapping#getTarget()
	 * @see #getElementMapping()
	 * @generated
	 */
	EReference getElementMapping_Target();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see qualitypatternmodel.patternstructure.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.patternstructure.Mapping#getMorphism <em>Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Morphism</em>'.
	 * @see qualitypatternmodel.patternstructure.Mapping#getMorphism()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Morphism();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see qualitypatternmodel.patternstructure.Formula
	 * @generated
	 */
	EClass getFormula();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.Formula#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see qualitypatternmodel.patternstructure.Formula#getOperator()
	 * @see #getFormula()
	 * @generated
	 */
	EAttribute getFormula_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.Formula#getCondition1 <em>Condition1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition1</em>'.
	 * @see qualitypatternmodel.patternstructure.Formula#getCondition1()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_Condition1();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.Formula#getCondition2 <em>Condition2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition2</em>'.
	 * @see qualitypatternmodel.patternstructure.Formula#getCondition2()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_Condition2();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.TrueElement <em>True Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True Element</em>'.
	 * @see qualitypatternmodel.patternstructure.TrueElement
	 * @generated
	 */
	EClass getTrueElement();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.CompletePattern <em>Complete Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complete Pattern</em>'.
	 * @see qualitypatternmodel.patternstructure.CompletePattern
	 * @generated
	 */
	EClass getCompletePattern();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.CompletePattern#getParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter List</em>'.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getParameterList()
	 * @see #getCompletePattern()
	 * @generated
	 */
	EReference getCompletePattern_ParameterList();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.CompletePattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getName()
	 * @see #getCompletePattern()
	 * @generated
	 */
	EAttribute getCompletePattern_Name();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.CompletePattern#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getDatabase()
	 * @see #getCompletePattern()
	 * @generated
	 */
	EReference getCompletePattern_Database();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.CompletePattern#isAdaptionStarted <em>Adaption Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adaption Started</em>'.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#isAdaptionStarted()
	 * @see #getCompletePattern()
	 * @generated
	 */
	EAttribute getCompletePattern_AdaptionStarted();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.CompletePattern#isAdaptionFinalized <em>Adaption Finalized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adaption Finalized</em>'.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#isAdaptionFinalized()
	 * @see #getCompletePattern()
	 * @generated
	 */
	EAttribute getCompletePattern_AdaptionFinalized();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.CompletePattern#getElementCounter <em>Element Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Counter</em>'.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getElementCounter()
	 * @see #getCompletePattern()
	 * @generated
	 */
	EAttribute getCompletePattern_ElementCounter();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.CompletePattern#getPropertyCounter <em>Property Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Counter</em>'.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getPropertyCounter()
	 * @see #getCompletePattern()
	 * @generated
	 */
	EAttribute getCompletePattern_PropertyCounter();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.CompletePattern#getRelationCounter <em>Relation Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Counter</em>'.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getRelationCounter()
	 * @see #getCompletePattern()
	 * @generated
	 */
	EAttribute getCompletePattern_RelationCounter();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.CompletePattern#getParameterCounter <em>Parameter Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Counter</em>'.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getParameterCounter()
	 * @see #getCompletePattern()
	 * @generated
	 */
	EAttribute getCompletePattern_ParameterCounter();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.CompletePattern#getOperatorCounter <em>Operator Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator Counter</em>'.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getOperatorCounter()
	 * @see #getCompletePattern()
	 * @generated
	 */
	EAttribute getCompletePattern_OperatorCounter();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.CompletePattern#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getCounter()
	 * @see #getCompletePattern()
	 * @generated
	 */
	EAttribute getCompletePattern_Counter();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.patternstructure.CompletePattern#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getText()
	 * @see #getCompletePattern()
	 * @generated
	 */
	EReference getCompletePattern_Text();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.CompletePattern#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getDescription()
	 * @see #getCompletePattern()
	 * @generated
	 */
	EAttribute getCompletePattern_Description();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.CompletePattern#getAbstractName <em>Abstract Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Name</em>'.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getAbstractName()
	 * @see #getCompletePattern()
	 * @generated
	 */
	EAttribute getCompletePattern_AbstractName();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.CompletePattern#getNewRefNo(java.lang.Class) <em>Get New Ref No</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Ref No</em>' operation.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getNewRefNo(java.lang.Class)
	 * @generated
	 */
	EOperation getCompletePattern__GetNewRefNo__Class();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.CompletePattern#recordValues() <em>Record Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Record Values</em>' operation.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#recordValues()
	 * @generated
	 */
	EOperation getCompletePattern__RecordValues();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.CompletePattern#getAbstractionLevel() <em>Get Abstraction Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Abstraction Level</em>' operation.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getAbstractionLevel()
	 * @generated
	 */
	EOperation getCompletePattern__GetAbstractionLevel();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.CompletePattern#validateAgainstSchema() <em>Validate Against Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Against Schema</em>' operation.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#validateAgainstSchema()
	 * @generated
	 */
	EOperation getCompletePattern__ValidateAgainstSchema();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.CompletePattern#resetQuery() <em>Reset Query</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Query</em>' operation.
	 * @see qualitypatternmodel.patternstructure.CompletePattern#resetQuery()
	 * @generated
	 */
	EOperation getCompletePattern__ResetQuery();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.PatternElement <em>Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Element</em>'.
	 * @see qualitypatternmodel.patternstructure.PatternElement
	 * @generated
	 */
	EClass getPatternElement();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.PatternElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see qualitypatternmodel.patternstructure.PatternElement#getId()
	 * @see #getPatternElement()
	 * @generated
	 */
	EAttribute getPatternElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.PatternElement#getInternalId <em>Internal Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Id</em>'.
	 * @see qualitypatternmodel.patternstructure.PatternElement#getInternalId()
	 * @see #getPatternElement()
	 * @generated
	 */
	EAttribute getPatternElement_InternalId();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#generateQuery() <em>Generate Query</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Query</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#generateQuery()
	 * @generated
	 */
	EOperation getPatternElement__GenerateQuery();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#getAllParameters()
	 * @generated
	 */
	EOperation getPatternElement__GetAllParameters();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#prepareTranslation() <em>Prepare Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare Translation</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#prepareTranslation()
	 * @generated
	 */
	EOperation getPatternElement__PrepareTranslation();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#isValid(qualitypatternmodel.patternstructure.AbstractionLevel) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#isValid(qualitypatternmodel.patternstructure.AbstractionLevel)
	 * @generated
	 */
	EOperation getPatternElement__IsValid__AbstractionLevel();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#isValidLocal(qualitypatternmodel.patternstructure.AbstractionLevel) <em>Is Valid Local</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Local</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#isValidLocal(qualitypatternmodel.patternstructure.AbstractionLevel)
	 * @generated
	 */
	EOperation getPatternElement__IsValidLocal__AbstractionLevel();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPatternElement__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#prepareParameterUpdates() <em>Prepare Parameter Updates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare Parameter Updates</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#prepareParameterUpdates()
	 * @generated
	 */
	EOperation getPatternElement__PrepareParameterUpdates();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#getParameterList() <em>Get Parameter List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parameter List</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#getParameterList()
	 * @generated
	 */
	EOperation getPatternElement__GetParameterList();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#getOperatorList() <em>Get Operator List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operator List</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#getOperatorList()
	 * @generated
	 */
	EOperation getPatternElement__GetOperatorList();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#createXMLAdaption() <em>Create XML Adaption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create XML Adaption</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#createXMLAdaption()
	 * @generated
	 */
	EOperation getPatternElement__CreateXMLAdaption();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#finalizeXMLAdaption() <em>Finalize XML Adaption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Finalize XML Adaption</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#finalizeXMLAdaption()
	 * @generated
	 */
	EOperation getPatternElement__FinalizeXMLAdaption();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#recordValues(qualitypatternmodel.execution.XmlDataDatabase) <em>Record Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Record Values</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#recordValues(qualitypatternmodel.execution.XmlDataDatabase)
	 * @generated
	 */
	EOperation getPatternElement__RecordValues__XmlDataDatabase();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#relationsXmlAdapted() <em>Relations Xml Adapted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Relations Xml Adapted</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#relationsXmlAdapted()
	 * @generated
	 */
	EOperation getPatternElement__RelationsXmlAdapted();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#triggerParameterUpdates(qualitypatternmodel.patternstructure.PatternElement, org.eclipse.emf.common.util.EList) <em>Trigger Parameter Updates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Trigger Parameter Updates</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#triggerParameterUpdates(qualitypatternmodel.patternstructure.PatternElement, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getPatternElement__TriggerParameterUpdates__PatternElement_EList();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#triggerParameterUpdates(qualitypatternmodel.patternstructure.PatternElement) <em>Trigger Parameter Updates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Trigger Parameter Updates</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#triggerParameterUpdates(qualitypatternmodel.patternstructure.PatternElement)
	 * @generated
	 */
	EOperation getPatternElement__TriggerParameterUpdates__PatternElement();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#updateParameters(qualitypatternmodel.parameters.ParameterList) <em>Update Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Parameters</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#updateParameters(qualitypatternmodel.parameters.ParameterList)
	 * @generated
	 */
	EOperation getPatternElement__UpdateParameters__ParameterList();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#initializeTranslation() <em>Initialize Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize Translation</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#initializeTranslation()
	 * @generated
	 */
	EOperation getPatternElement__InitializeTranslation();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.NotCondition <em>Not Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Condition</em>'.
	 * @see qualitypatternmodel.patternstructure.NotCondition
	 * @generated
	 */
	EClass getNotCondition();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.NotCondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see qualitypatternmodel.patternstructure.NotCondition#getCondition()
	 * @see #getNotCondition()
	 * @generated
	 */
	EReference getNotCondition_Condition();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.CountCondition <em>Count Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Condition</em>'.
	 * @see qualitypatternmodel.patternstructure.CountCondition
	 * @generated
	 */
	EClass getCountCondition();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.CountCondition#getCountPattern <em>Count Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count Pattern</em>'.
	 * @see qualitypatternmodel.patternstructure.CountCondition#getCountPattern()
	 * @see #getCountCondition()
	 * @generated
	 */
	EReference getCountCondition_CountPattern();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.CountCondition#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see qualitypatternmodel.patternstructure.CountCondition#getOption()
	 * @see #getCountCondition()
	 * @generated
	 */
	EReference getCountCondition_Option();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.CountCondition#getArgument2 <em>Argument2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument2</em>'.
	 * @see qualitypatternmodel.patternstructure.CountCondition#getArgument2()
	 * @see #getCountCondition()
	 * @generated
	 */
	EReference getCountCondition_Argument2();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.CountCondition#createParameters() <em>Create Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Parameters</em>' operation.
	 * @see qualitypatternmodel.patternstructure.CountCondition#createParameters()
	 * @generated
	 */
	EOperation getCountCondition__CreateParameters();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.CountCondition#createCountPattern() <em>Create Count Pattern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Count Pattern</em>' operation.
	 * @see qualitypatternmodel.patternstructure.CountCondition#createCountPattern()
	 * @generated
	 */
	EOperation getCountCondition__CreateCountPattern();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.CountConditionArgument <em>Count Condition Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Condition Argument</em>'.
	 * @see qualitypatternmodel.patternstructure.CountConditionArgument
	 * @generated
	 */
	EClass getCountConditionArgument();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.patternstructure.CountConditionArgument#getCountCondition2 <em>Count Condition2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Count Condition2</em>'.
	 * @see qualitypatternmodel.patternstructure.CountConditionArgument#getCountCondition2()
	 * @see #getCountConditionArgument()
	 * @generated
	 */
	EReference getCountConditionArgument_CountCondition2();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.MorphismContainer <em>Morphism Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Morphism Container</em>'.
	 * @see qualitypatternmodel.patternstructure.MorphismContainer
	 * @generated
	 */
	EClass getMorphismContainer();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.MorphismContainer#getMorphism <em>Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Morphism</em>'.
	 * @see qualitypatternmodel.patternstructure.MorphismContainer#getMorphism()
	 * @see #getMorphismContainer()
	 * @generated
	 */
	EReference getMorphismContainer_Morphism();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.MorphismContainer#getGraph() <em>Get Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Graph</em>' operation.
	 * @see qualitypatternmodel.patternstructure.MorphismContainer#getGraph()
	 * @generated
	 */
	EOperation getMorphismContainer__GetGraph();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.MorphismContainer#copyPreviousGraph() <em>Copy Previous Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Previous Graph</em>' operation.
	 * @see qualitypatternmodel.patternstructure.MorphismContainer#copyPreviousGraph()
	 * @generated
	 */
	EOperation getMorphismContainer__CopyPreviousGraph();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.CountPattern <em>Count Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Pattern</em>'.
	 * @see qualitypatternmodel.patternstructure.CountPattern
	 * @generated
	 */
	EClass getCountPattern();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.patternstructure.CountPattern#getCountCondition <em>Count Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Count Condition</em>'.
	 * @see qualitypatternmodel.patternstructure.CountPattern#getCountCondition()
	 * @see #getCountPattern()
	 * @generated
	 */
	EReference getCountPattern_CountCondition();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see qualitypatternmodel.patternstructure.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.Pattern#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graph</em>'.
	 * @see qualitypatternmodel.patternstructure.Pattern#getGraph()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Graph();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.Pattern#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see qualitypatternmodel.patternstructure.Pattern#getCondition()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Condition();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.Pattern#getPartialQuery <em>Partial Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partial Query</em>'.
	 * @see qualitypatternmodel.patternstructure.Pattern#getPartialQuery()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_PartialQuery();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.Pattern#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see qualitypatternmodel.patternstructure.Pattern#getQuery()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Query();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.Pattern#checkMorphismOfNextGraph() <em>Check Morphism Of Next Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Morphism Of Next Graph</em>' operation.
	 * @see qualitypatternmodel.patternstructure.Pattern#checkMorphismOfNextGraph()
	 * @generated
	 */
	EOperation getPattern__CheckMorphismOfNextGraph();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.NumberElement <em>Number Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Element</em>'.
	 * @see qualitypatternmodel.patternstructure.NumberElement
	 * @generated
	 */
	EClass getNumberElement();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.NumberElement#getNumberParam <em>Number Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Number Param</em>'.
	 * @see qualitypatternmodel.patternstructure.NumberElement#getNumberParam()
	 * @see #getNumberElement()
	 * @generated
	 */
	EReference getNumberElement_NumberParam();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.NumberElement#createParameters() <em>Create Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Parameters</em>' operation.
	 * @see qualitypatternmodel.patternstructure.NumberElement#createParameters()
	 * @generated
	 */
	EOperation getNumberElement__CreateParameters();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#getContainer()
	 * @generated
	 */
	EOperation getPatternElement__GetContainer();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#getAncestor(java.lang.Class) <em>Get Ancestor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ancestor</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#getAncestor(java.lang.Class)
	 * @generated
	 */
	EOperation getPatternElement__GetAncestor__Class();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#myToString() <em>My To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>My To String</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#myToString()
	 * @generated
	 */
	EOperation getPatternElement__MyToString();

	/**
	 * Returns the meta object for enum '{@link qualitypatternmodel.patternstructure.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see qualitypatternmodel.patternstructure.LogicalOperator
	 * @generated
	 */
	EEnum getLogicalOperator();

	/**
	 * Returns the meta object for enum '{@link qualitypatternmodel.patternstructure.Quantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantifier</em>'.
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @generated
	 */
	EEnum getQuantifier();

	/**
	 * Returns the meta object for enum '{@link qualitypatternmodel.patternstructure.AbstractionLevel <em>Abstraction Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Abstraction Level</em>'.
	 * @see qualitypatternmodel.patternstructure.AbstractionLevel
	 * @generated
	 */
	EEnum getAbstractionLevel();

	/**
	 * Returns the meta object for data type '{@link qualitypatternmodel.exceptions.InvalidityException <em>Invalidity Exception Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalidity Exception Wrapper</em>'.
	 * @see qualitypatternmodel.exceptions.InvalidityException
	 * @model instanceClass="qualitypatternmodel.exceptions.InvalidityException"
	 * @generated
	 */
	EDataType getInvalidityExceptionWrapper();

	/**
	 * Returns the meta object for data type '{@link java.lang.Class <em>Class Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Wrapper</em>'.
	 * @see java.lang.Class
	 * @model instanceClass="java.lang.Class"
	 * @generated
	 */
	EDataType getClassWrapper();

	/**
	 * Returns the meta object for data type '{@link qualitypatternmodel.exceptions.MissingPatternContainerException <em>Missing Pattern Container Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Missing Pattern Container Exception</em>'.
	 * @see qualitypatternmodel.exceptions.MissingPatternContainerException
	 * @model instanceClass="qualitypatternmodel.exceptions.MissingPatternContainerException"
	 * @generated
	 */
	EDataType getMissingPatternContainerException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternstructureFactory getPatternstructureFactory();

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
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.RelationMappingImpl <em>Relation Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.RelationMappingImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getRelationMapping()
		 * @generated
		 */
		EClass RELATION_MAPPING = eINSTANCE.getRelationMapping();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_MAPPING__TARGET = eINSTANCE.getRelationMapping_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_MAPPING__SOURCE = eINSTANCE.getRelationMapping_Source();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl <em>Quantified Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getQuantifiedCondition()
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
		 * The meta object literal for the '<em><b>Check Morphism Of Next Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUANTIFIED_CONDITION___CHECK_MORPHISM_OF_NEXT_GRAPH = eINSTANCE.getQuantifiedCondition__CheckMorphismOfNextGraph();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIED_CONDITION__QUANTIFIER = eINSTANCE.getQuantifiedCondition_Quantifier();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.ConditionImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__PATTERN = eINSTANCE.getCondition_Pattern();

		/**
		 * The meta object literal for the '<em><b>Quantified Condition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__QUANTIFIED_CONDITION = eINSTANCE.getCondition_QuantifiedCondition();

		/**
		 * The meta object literal for the '<em><b>Formula1</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__FORMULA1 = eINSTANCE.getCondition_Formula1();

		/**
		 * The meta object literal for the '<em><b>Formula2</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__FORMULA2 = eINSTANCE.getCondition_Formula2();

		/**
		 * The meta object literal for the '<em><b>Not Condition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__NOT_CONDITION = eINSTANCE.getCondition_NotCondition();

		/**
		 * The meta object literal for the '<em><b>Get Next Morphism Containers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITION___GET_NEXT_MORPHISM_CONTAINERS = eINSTANCE.getCondition__GetNextMorphismContainers();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.MorphismImpl <em>Morphism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.MorphismImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getMorphism()
		 * @generated
		 */
		EClass MORPHISM = eINSTANCE.getMorphism();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MORPHISM__MAPPINGS = eINSTANCE.getMorphism_Mappings();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MORPHISM__SOURCE = eINSTANCE.getMorphism_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MORPHISM__TARGET = eINSTANCE.getMorphism_Target();

		/**
		 * The meta object literal for the '<em><b>Morphism Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MORPHISM__MORPHISM_CONTAINER = eINSTANCE.getMorphism_MorphismContainer();

		/**
		 * The meta object literal for the '<em><b>Check Element Mappings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MORPHISM___CHECK_ELEMENT_MAPPINGS = eINSTANCE.getMorphism__CheckElementMappings();

		/**
		 * The meta object literal for the '<em><b>Check Relation Mappings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MORPHISM___CHECK_RELATION_MAPPINGS = eINSTANCE.getMorphism__CheckRelationMappings();

		/**
		 * The meta object literal for the '<em><b>Check Relation Mappings Uniqueness</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MORPHISM___CHECK_RELATION_MAPPINGS_UNIQUENESS = eINSTANCE.getMorphism__CheckRelationMappingsUniqueness();

		/**
		 * The meta object literal for the '<em><b>Check Element Mappings Uniqueness</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MORPHISM___CHECK_ELEMENT_MAPPINGS_UNIQUENESS = eINSTANCE.getMorphism__CheckElementMappingsUniqueness();

		/**
		 * The meta object literal for the '<em><b>Add Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MORPHISM___ADD_MAPPING__NODE_NODE = eINSTANCE.getMorphism__AddMapping__Node_Node();

		/**
		 * The meta object literal for the '<em><b>Add Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MORPHISM___ADD_MAPPING__RELATION_RELATION = eINSTANCE.getMorphism__AddMapping__Relation_Relation();

		/**
		 * The meta object literal for the '<em><b>Remove Inconsistent Mappings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MORPHISM___REMOVE_INCONSISTENT_MAPPINGS = eINSTANCE.getMorphism__RemoveInconsistentMappings();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.ElementMappingImpl <em>Element Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.ElementMappingImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getElementMapping()
		 * @generated
		 */
		EClass ELEMENT_MAPPING = eINSTANCE.getElementMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_MAPPING__SOURCE = eINSTANCE.getElementMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_MAPPING__TARGET = eINSTANCE.getElementMapping_Target();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.MappingImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Morphism</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__MORPHISM = eINSTANCE.getMapping_Morphism();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.FormulaImpl <em>Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.FormulaImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getFormula()
		 * @generated
		 */
		EClass FORMULA = eINSTANCE.getFormula();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULA__OPERATOR = eINSTANCE.getFormula_Operator();

		/**
		 * The meta object literal for the '<em><b>Condition1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__CONDITION1 = eINSTANCE.getFormula_Condition1();

		/**
		 * The meta object literal for the '<em><b>Condition2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__CONDITION2 = eINSTANCE.getFormula_Condition2();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.TrueElementImpl <em>True Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.TrueElementImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getTrueElement()
		 * @generated
		 */
		EClass TRUE_ELEMENT = eINSTANCE.getTrueElement();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl <em>Complete Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.CompletePatternImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getCompletePattern()
		 * @generated
		 */
		EClass COMPLETE_PATTERN = eINSTANCE.getCompletePattern();

		/**
		 * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETE_PATTERN__PARAMETER_LIST = eINSTANCE.getCompletePattern_ParameterList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETE_PATTERN__NAME = eINSTANCE.getCompletePattern_Name();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETE_PATTERN__DATABASE = eINSTANCE.getCompletePattern_Database();

		/**
		 * The meta object literal for the '<em><b>Adaption Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETE_PATTERN__ADAPTION_STARTED = eINSTANCE.getCompletePattern_AdaptionStarted();

		/**
		 * The meta object literal for the '<em><b>Adaption Finalized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETE_PATTERN__ADAPTION_FINALIZED = eINSTANCE.getCompletePattern_AdaptionFinalized();

		/**
		 * The meta object literal for the '<em><b>Element Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETE_PATTERN__ELEMENT_COUNTER = eINSTANCE.getCompletePattern_ElementCounter();

		/**
		 * The meta object literal for the '<em><b>Property Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETE_PATTERN__PROPERTY_COUNTER = eINSTANCE.getCompletePattern_PropertyCounter();

		/**
		 * The meta object literal for the '<em><b>Relation Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETE_PATTERN__RELATION_COUNTER = eINSTANCE.getCompletePattern_RelationCounter();

		/**
		 * The meta object literal for the '<em><b>Parameter Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETE_PATTERN__PARAMETER_COUNTER = eINSTANCE.getCompletePattern_ParameterCounter();

		/**
		 * The meta object literal for the '<em><b>Operator Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETE_PATTERN__OPERATOR_COUNTER = eINSTANCE.getCompletePattern_OperatorCounter();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETE_PATTERN__COUNTER = eINSTANCE.getCompletePattern_Counter();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETE_PATTERN__TEXT = eINSTANCE.getCompletePattern_Text();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETE_PATTERN__DESCRIPTION = eINSTANCE.getCompletePattern_Description();

		/**
		 * The meta object literal for the '<em><b>Abstract Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETE_PATTERN__ABSTRACT_NAME = eINSTANCE.getCompletePattern_AbstractName();

		/**
		 * The meta object literal for the '<em><b>Get New Ref No</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLETE_PATTERN___GET_NEW_REF_NO__CLASS = eINSTANCE.getCompletePattern__GetNewRefNo__Class();

		/**
		 * The meta object literal for the '<em><b>Record Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLETE_PATTERN___RECORD_VALUES = eINSTANCE.getCompletePattern__RecordValues();

		/**
		 * The meta object literal for the '<em><b>Get Abstraction Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLETE_PATTERN___GET_ABSTRACTION_LEVEL = eINSTANCE.getCompletePattern__GetAbstractionLevel();

		/**
		 * The meta object literal for the '<em><b>Validate Against Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLETE_PATTERN___VALIDATE_AGAINST_SCHEMA = eINSTANCE.getCompletePattern__ValidateAgainstSchema();

		/**
		 * The meta object literal for the '<em><b>Reset Query</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLETE_PATTERN___RESET_QUERY = eINSTANCE.getCompletePattern__ResetQuery();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.PatternElementImpl <em>Pattern Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.PatternElementImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getPatternElement()
		 * @generated
		 */
		EClass PATTERN_ELEMENT = eINSTANCE.getPatternElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ELEMENT__ID = eINSTANCE.getPatternElement_Id();

		/**
		 * The meta object literal for the '<em><b>Internal Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ELEMENT__INTERNAL_ID = eINSTANCE.getPatternElement_InternalId();

		/**
		 * The meta object literal for the '<em><b>Generate Query</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___GENERATE_QUERY = eINSTANCE.getPatternElement__GenerateQuery();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___GET_ALL_PARAMETERS = eINSTANCE.getPatternElement__GetAllParameters();

		/**
		 * The meta object literal for the '<em><b>Prepare Translation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___PREPARE_TRANSLATION = eINSTANCE.getPatternElement__PrepareTranslation();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL = eINSTANCE.getPatternElement__IsValid__AbstractionLevel();

		/**
		 * The meta object literal for the '<em><b>Is Valid Local</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL = eINSTANCE.getPatternElement__IsValidLocal__AbstractionLevel();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPatternElement__Validate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Prepare Parameter Updates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES = eINSTANCE.getPatternElement__PrepareParameterUpdates();

		/**
		 * The meta object literal for the '<em><b>Get Parameter List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___GET_PARAMETER_LIST = eINSTANCE.getPatternElement__GetParameterList();

		/**
		 * The meta object literal for the '<em><b>Get Operator List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___GET_OPERATOR_LIST = eINSTANCE.getPatternElement__GetOperatorList();

		/**
		 * The meta object literal for the '<em><b>Create XML Adaption</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___CREATE_XML_ADAPTION = eINSTANCE.getPatternElement__CreateXMLAdaption();

		/**
		 * The meta object literal for the '<em><b>Finalize XML Adaption</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___FINALIZE_XML_ADAPTION = eINSTANCE.getPatternElement__FinalizeXMLAdaption();

		/**
		 * The meta object literal for the '<em><b>Record Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___RECORD_VALUES__XMLDATADATABASE = eINSTANCE.getPatternElement__RecordValues__XmlDataDatabase();

		/**
		 * The meta object literal for the '<em><b>Relations Xml Adapted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___RELATIONS_XML_ADAPTED = eINSTANCE.getPatternElement__RelationsXmlAdapted();

		/**
		 * The meta object literal for the '<em><b>Trigger Parameter Updates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST = eINSTANCE.getPatternElement__TriggerParameterUpdates__PatternElement_EList();

		/**
		 * The meta object literal for the '<em><b>Trigger Parameter Updates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT = eINSTANCE.getPatternElement__TriggerParameterUpdates__PatternElement();

		/**
		 * The meta object literal for the '<em><b>Update Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST = eINSTANCE.getPatternElement__UpdateParameters__ParameterList();

		/**
		 * The meta object literal for the '<em><b>Initialize Translation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___INITIALIZE_TRANSLATION = eINSTANCE.getPatternElement__InitializeTranslation();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.NotConditionImpl <em>Not Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.NotConditionImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getNotCondition()
		 * @generated
		 */
		EClass NOT_CONDITION = eINSTANCE.getNotCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_CONDITION__CONDITION = eINSTANCE.getNotCondition_Condition();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.CountConditionImpl <em>Count Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.CountConditionImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getCountCondition()
		 * @generated
		 */
		EClass COUNT_CONDITION = eINSTANCE.getCountCondition();

		/**
		 * The meta object literal for the '<em><b>Count Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_CONDITION__COUNT_PATTERN = eINSTANCE.getCountCondition_CountPattern();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_CONDITION__OPTION = eINSTANCE.getCountCondition_Option();

		/**
		 * The meta object literal for the '<em><b>Argument2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_CONDITION__ARGUMENT2 = eINSTANCE.getCountCondition_Argument2();

		/**
		 * The meta object literal for the '<em><b>Create Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUNT_CONDITION___CREATE_PARAMETERS = eINSTANCE.getCountCondition__CreateParameters();

		/**
		 * The meta object literal for the '<em><b>Create Count Pattern</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUNT_CONDITION___CREATE_COUNT_PATTERN = eINSTANCE.getCountCondition__CreateCountPattern();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.CountConditionArgument <em>Count Condition Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.CountConditionArgument
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getCountConditionArgument()
		 * @generated
		 */
		EClass COUNT_CONDITION_ARGUMENT = eINSTANCE.getCountConditionArgument();

		/**
		 * The meta object literal for the '<em><b>Count Condition2</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_CONDITION_ARGUMENT__COUNT_CONDITION2 = eINSTANCE.getCountConditionArgument_CountCondition2();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.MorphismContainer <em>Morphism Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.MorphismContainer
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getMorphismContainer()
		 * @generated
		 */
		EClass MORPHISM_CONTAINER = eINSTANCE.getMorphismContainer();

		/**
		 * The meta object literal for the '<em><b>Morphism</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MORPHISM_CONTAINER__MORPHISM = eINSTANCE.getMorphismContainer_Morphism();

		/**
		 * The meta object literal for the '<em><b>Get Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MORPHISM_CONTAINER___GET_GRAPH = eINSTANCE.getMorphismContainer__GetGraph();

		/**
		 * The meta object literal for the '<em><b>Copy Previous Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MORPHISM_CONTAINER___COPY_PREVIOUS_GRAPH = eINSTANCE.getMorphismContainer__CopyPreviousGraph();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.CountPatternImpl <em>Count Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.CountPatternImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getCountPattern()
		 * @generated
		 */
		EClass COUNT_PATTERN = eINSTANCE.getCountPattern();

		/**
		 * The meta object literal for the '<em><b>Count Condition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_PATTERN__COUNT_CONDITION = eINSTANCE.getCountPattern_CountCondition();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.PatternImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__GRAPH = eINSTANCE.getPattern_Graph();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__CONDITION = eINSTANCE.getPattern_Condition();

		/**
		 * The meta object literal for the '<em><b>Partial Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__PARTIAL_QUERY = eINSTANCE.getPattern_PartialQuery();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__QUERY = eINSTANCE.getPattern_Query();

		/**
		 * The meta object literal for the '<em><b>Check Morphism Of Next Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN___CHECK_MORPHISM_OF_NEXT_GRAPH = eINSTANCE.getPattern__CheckMorphismOfNextGraph();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.NumberElementImpl <em>Number Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.NumberElementImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getNumberElement()
		 * @generated
		 */
		EClass NUMBER_ELEMENT = eINSTANCE.getNumberElement();

		/**
		 * The meta object literal for the '<em><b>Number Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_ELEMENT__NUMBER_PARAM = eINSTANCE.getNumberElement_NumberParam();

		/**
		 * The meta object literal for the '<em><b>Create Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NUMBER_ELEMENT___CREATE_PARAMETERS = eINSTANCE.getNumberElement__CreateParameters();

		/**
		 * The meta object literal for the '<em><b>Get Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___GET_CONTAINER = eINSTANCE.getPatternElement__GetContainer();

		/**
		 * The meta object literal for the '<em><b>Get Ancestor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___GET_ANCESTOR__CLASS = eINSTANCE.getPatternElement__GetAncestor__Class();

		/**
		 * The meta object literal for the '<em><b>My To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___MY_TO_STRING = eINSTANCE.getPatternElement__MyToString();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.LogicalOperator
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.Quantifier <em>Quantifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.Quantifier
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getQuantifier()
		 * @generated
		 */
		EEnum QUANTIFIER = eINSTANCE.getQuantifier();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.AbstractionLevel <em>Abstraction Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.AbstractionLevel
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getAbstractionLevel()
		 * @generated
		 */
		EEnum ABSTRACTION_LEVEL = eINSTANCE.getAbstractionLevel();

		/**
		 * The meta object literal for the '<em>Invalidity Exception Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.exceptions.InvalidityException
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getInvalidityExceptionWrapper()
		 * @generated
		 */
		EDataType INVALIDITY_EXCEPTION_WRAPPER = eINSTANCE.getInvalidityExceptionWrapper();

		/**
		 * The meta object literal for the '<em>Class Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Class
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getClassWrapper()
		 * @generated
		 */
		EDataType CLASS_WRAPPER = eINSTANCE.getClassWrapper();

		/**
		 * The meta object literal for the '<em>Missing Pattern Container Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.exceptions.MissingPatternContainerException
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getMissingPatternContainerException()
		 * @generated
		 */
		EDataType MISSING_PATTERN_CONTAINER_EXCEPTION = eINSTANCE.getMissingPatternContainerException();

	}

} //PatternstructurePackage

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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
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
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___TO_XQUERY__LOCATION = 0;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___GET_ALL_INPUTS = 1;

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
	int PATTERN_ELEMENT___IS_VALID__BOOLEAN = 3;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN = 4;

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
	 * The number of operations of the '<em>Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT_OPERATION_COUNT = 9;

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
	 * The feature id for the '<em><b>Mapping Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MAPPING_DEPTH = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Morphism</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MORPHISM = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___TO_XQUERY__LOCATION = PATTERN_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GET_ALL_INPUTS = PATTERN_ELEMENT___GET_ALL_INPUTS;

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
	int MAPPING___IS_VALID__BOOLEAN = PATTERN_ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___IS_VALID_LOCAL__BOOLEAN = PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN;

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
	 * The feature id for the '<em><b>Mapping Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING__MAPPING_DEPTH = MAPPING__MAPPING_DEPTH;

	/**
	 * The feature id for the '<em><b>Morphism</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING__MORPHISM = MAPPING__MORPHISM;

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
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___TO_XQUERY__LOCATION = MAPPING___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___GET_ALL_INPUTS = MAPPING___GET_ALL_INPUTS;

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
	int RELATION_MAPPING___IS_VALID__BOOLEAN = MAPPING___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___IS_VALID_LOCAL__BOOLEAN = MAPPING___IS_VALID_LOCAL__BOOLEAN;

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
	 * The feature id for the '<em><b>Cond Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__COND_DEPTH = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Get Next Quantified Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__GET_NEXT_QUANTIFIED_CONDITIONS = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PATTERN = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quantifiedcondition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__QUANTIFIEDCONDITION = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__FORMULA1 = PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Formula2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__FORMULA2 = PATTERN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Not</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NOT = PATTERN_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___TO_XQUERY__LOCATION = PATTERN_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___GET_ALL_INPUTS = PATTERN_ELEMENT___GET_ALL_INPUTS;

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
	int CONDITION___IS_VALID__BOOLEAN = PATTERN_ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___IS_VALID_LOCAL__BOOLEAN = PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN;

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
	 * The operation id for the '<em>Get Next Quantified Conditions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___GET_NEXT_QUANTIFIED_CONDITIONS = PATTERN_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Cond Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__COND_DEPTH = CONDITION__COND_DEPTH;

	/**
	 * The feature id for the '<em><b>Get Next Quantified Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__GET_NEXT_QUANTIFIED_CONDITIONS = CONDITION__GET_NEXT_QUANTIFIED_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__PATTERN = CONDITION__PATTERN;

	/**
	 * The feature id for the '<em><b>Quantifiedcondition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__QUANTIFIEDCONDITION = CONDITION__QUANTIFIEDCONDITION;

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
	 * The feature id for the '<em><b>Not</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__NOT = CONDITION__NOT;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__QUANTIFIER = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__GRAPH = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__CONDITION = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Morphism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__MORPHISM = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Count Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__COUNT_COMPARISON = CONDITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Quantified Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___TO_XQUERY__LOCATION = CONDITION___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___GET_ALL_INPUTS = CONDITION___GET_ALL_INPUTS;

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
	int QUANTIFIED_CONDITION___IS_VALID__BOOLEAN = CONDITION___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___IS_VALID_LOCAL__BOOLEAN = CONDITION___IS_VALID_LOCAL__BOOLEAN;

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
	 * The operation id for the '<em>Get Next Quantified Conditions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___GET_NEXT_QUANTIFIED_CONDITIONS = CONDITION___GET_NEXT_QUANTIFIED_CONDITIONS;

	/**
	 * The operation id for the '<em>Get Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___GET_GRAPH = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Morphism</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___GET_MORPHISM = CONDITION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Copy Previous Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___COPY_PREVIOUS_GRAPH = CONDITION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Check Morphism Of Next Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___CHECK_MORPHISM_OF_NEXT_GRAPH = CONDITION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Quantified Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 4;

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
	 * The feature id for the '<em><b>Morph Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__MORPH_DEPTH = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__MAPPINGS = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__FROM = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__TO = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Count Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__COUNT_PATTERN = PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Morphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___TO_XQUERY__LOCATION = PATTERN_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___GET_ALL_INPUTS = PATTERN_ELEMENT___GET_ALL_INPUTS;

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
	int MORPHISM___IS_VALID__BOOLEAN = PATTERN_ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___IS_VALID_LOCAL__BOOLEAN = PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN;

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
	 * The operation id for the '<em>Check Single Element Mappings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___CHECK_SINGLE_ELEMENT_MAPPINGS = PATTERN_ELEMENT_OPERATION_COUNT + 0;

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
	 * The operation id for the '<em>Check Single Element Mappings Uniqueness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___CHECK_SINGLE_ELEMENT_MAPPINGS_UNIQUENESS = PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Morphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.SingleElementMappingImpl <em>Single Element Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.SingleElementMappingImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getSingleElementMapping()
	 * @generated
	 */
	int SINGLE_ELEMENT_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING__ID = MAPPING__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING__INTERNAL_ID = MAPPING__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Mapping Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING__MAPPING_DEPTH = MAPPING__MAPPING_DEPTH;

	/**
	 * The feature id for the '<em><b>Morphism</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING__MORPHISM = MAPPING__MORPHISM;

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
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING___TO_XQUERY__LOCATION = MAPPING___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING___GET_ALL_INPUTS = MAPPING___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING___PREPARE_TRANSLATION = MAPPING___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING___IS_VALID__BOOLEAN = MAPPING___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING___IS_VALID_LOCAL__BOOLEAN = MAPPING___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING___GET_CONTAINER = MAPPING___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING___GET_ANCESTOR__CLASS = MAPPING___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING___MY_TO_STRING = MAPPING___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP = MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Single Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Cond Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__COND_DEPTH = CONDITION__COND_DEPTH;

	/**
	 * The feature id for the '<em><b>Get Next Quantified Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__GET_NEXT_QUANTIFIED_CONDITIONS = CONDITION__GET_NEXT_QUANTIFIED_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__PATTERN = CONDITION__PATTERN;

	/**
	 * The feature id for the '<em><b>Quantifiedcondition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__QUANTIFIEDCONDITION = CONDITION__QUANTIFIEDCONDITION;

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
	 * The feature id for the '<em><b>Not</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__NOT = CONDITION__NOT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__OPERATOR = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__CONDITION = CONDITION_FEATURE_COUNT + 1;

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
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___TO_XQUERY__LOCATION = CONDITION___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___GET_ALL_INPUTS = CONDITION___GET_ALL_INPUTS;

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
	int FORMULA___IS_VALID__BOOLEAN = CONDITION___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___IS_VALID_LOCAL__BOOLEAN = CONDITION___IS_VALID_LOCAL__BOOLEAN;

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
	 * The operation id for the '<em>Get Next Quantified Conditions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___GET_NEXT_QUANTIFIED_CONDITIONS = CONDITION___GET_NEXT_QUANTIFIED_CONDITIONS;

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
	 * The feature id for the '<em><b>Cond Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT__COND_DEPTH = CONDITION__COND_DEPTH;

	/**
	 * The feature id for the '<em><b>Get Next Quantified Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT__GET_NEXT_QUANTIFIED_CONDITIONS = CONDITION__GET_NEXT_QUANTIFIED_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT__PATTERN = CONDITION__PATTERN;

	/**
	 * The feature id for the '<em><b>Quantifiedcondition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT__QUANTIFIEDCONDITION = CONDITION__QUANTIFIEDCONDITION;

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
	 * The feature id for the '<em><b>Not</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT__NOT = CONDITION__NOT;

	/**
	 * The number of structural features of the '<em>True Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___TO_XQUERY__LOCATION = CONDITION___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___GET_ALL_INPUTS = CONDITION___GET_ALL_INPUTS;

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
	int TRUE_ELEMENT___IS_VALID__BOOLEAN = CONDITION___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___IS_VALID_LOCAL__BOOLEAN = CONDITION___IS_VALID_LOCAL__BOOLEAN;

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
	 * The operation id for the '<em>Get Next Quantified Conditions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_ELEMENT___GET_NEXT_QUANTIFIED_CONDITIONS = CONDITION___GET_NEXT_QUANTIFIED_CONDITIONS;

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
	int PATTERN = 8;

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
	 * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PARAMETER_LIST = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Morphism Of Next Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__CHECK_MORPHISM_OF_NEXT_GRAPH = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__GRAPH = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__CONDITION = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Element Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ELEMENT_COUNTER = PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__NAME = PATTERN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Count Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__COUNT_PATTERN = PATTERN_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___TO_XQUERY__LOCATION = PATTERN_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___GET_ALL_INPUTS = PATTERN_ELEMENT___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___PREPARE_TRANSLATION = PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___IS_VALID_LOCAL__BOOLEAN = PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN;

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
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___IS_VALID__BOOLEAN = PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___TO_XQUERY = PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get New Ref No</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___GET_NEW_REF_NO = PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Check Morphism Of Next Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___CHECK_MORPHISM_OF_NEXT_GRAPH = PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.NotElementImpl <em>Not Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.NotElementImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getNotElement()
	 * @generated
	 */
	int NOT_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT__ID = CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT__INTERNAL_ID = CONDITION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Cond Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT__COND_DEPTH = CONDITION__COND_DEPTH;

	/**
	 * The feature id for the '<em><b>Get Next Quantified Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT__GET_NEXT_QUANTIFIED_CONDITIONS = CONDITION__GET_NEXT_QUANTIFIED_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT__PATTERN = CONDITION__PATTERN;

	/**
	 * The feature id for the '<em><b>Quantifiedcondition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT__QUANTIFIEDCONDITION = CONDITION__QUANTIFIEDCONDITION;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT__FORMULA1 = CONDITION__FORMULA1;

	/**
	 * The feature id for the '<em><b>Formula2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT__FORMULA2 = CONDITION__FORMULA2;

	/**
	 * The feature id for the '<em><b>Not</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT__NOT = CONDITION__NOT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT__CONDITION = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT___TO_XQUERY__LOCATION = CONDITION___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT___GET_ALL_INPUTS = CONDITION___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT___PREPARE_TRANSLATION = CONDITION___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT___IS_VALID__BOOLEAN = CONDITION___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT___IS_VALID_LOCAL__BOOLEAN = CONDITION___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT___GET_CONTAINER = CONDITION___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT___GET_ANCESTOR__CLASS = CONDITION___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT___MY_TO_STRING = CONDITION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Next Quantified Conditions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT___GET_NEXT_QUANTIFIED_CONDITIONS = CONDITION___GET_NEXT_QUANTIFIED_CONDITIONS;

	/**
	 * The number of operations of the '<em>Not Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ELEMENT_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.CountComparisonImpl <em>Count Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.CountComparisonImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getCountComparison()
	 * @generated
	 */
	int COUNT_COMPARISON = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON__ID = CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON__INTERNAL_ID = CONDITION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Cond Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON__COND_DEPTH = CONDITION__COND_DEPTH;

	/**
	 * The feature id for the '<em><b>Get Next Quantified Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON__GET_NEXT_QUANTIFIED_CONDITIONS = CONDITION__GET_NEXT_QUANTIFIED_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON__PATTERN = CONDITION__PATTERN;

	/**
	 * The feature id for the '<em><b>Quantifiedcondition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON__QUANTIFIEDCONDITION = CONDITION__QUANTIFIEDCONDITION;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON__FORMULA1 = CONDITION__FORMULA1;

	/**
	 * The feature id for the '<em><b>Formula2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON__FORMULA2 = CONDITION__FORMULA2;

	/**
	 * The feature id for the '<em><b>Not</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON__NOT = CONDITION__NOT;

	/**
	 * The feature id for the '<em><b>Count Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON__COUNT_PATTERN = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON__NUMBER_PARAM = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantified Condition Count</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON__OPERATOR = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Count Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON___TO_XQUERY__LOCATION = CONDITION___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON___GET_ALL_INPUTS = CONDITION___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON___PREPARE_TRANSLATION = CONDITION___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON___IS_VALID__BOOLEAN = CONDITION___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON___IS_VALID_LOCAL__BOOLEAN = CONDITION___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON___GET_CONTAINER = CONDITION___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON___GET_ANCESTOR__CLASS = CONDITION___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON___MY_TO_STRING = CONDITION___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON___VALIDATE__DIAGNOSTICCHAIN_MAP = CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Next Quantified Conditions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON___GET_NEXT_QUANTIFIED_CONDITIONS = CONDITION___GET_NEXT_QUANTIFIED_CONDITIONS;

	/**
	 * The operation id for the '<em>Get Argument1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON___GET_ARGUMENT1 = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Argument2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON___GET_ARGUMENT2 = CONDITION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Count Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.CountPatternImpl <em>Count Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.CountPatternImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getCountPattern()
	 * @generated
	 */
	int COUNT_PATTERN = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN__ID = PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN__INTERNAL_ID = PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Count Comparison</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN__COUNT_COMPARISON = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN__PATTERN = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Morphism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN__MORPHISM = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Count Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___TO_XQUERY__LOCATION = PATTERN_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___GET_ALL_INPUTS = PATTERN_ELEMENT___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___PREPARE_TRANSLATION = PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___IS_VALID__BOOLEAN = PATTERN_ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___IS_VALID_LOCAL__BOOLEAN = PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___GET_CONTAINER = PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___GET_ANCESTOR__CLASS = PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___MY_TO_STRING = PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___VALIDATE__DIAGNOSTICCHAIN_MAP = PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___GET_GRAPH = PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Morphism</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN___GET_MORPHISM = PATTERN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Count Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_PATTERN_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.CountComparisonArgument <em>Count Comparison Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.CountComparisonArgument
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getCountComparisonArgument()
	 * @generated
	 */
	int COUNT_COMPARISON_ARGUMENT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON_ARGUMENT__ID = PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON_ARGUMENT__INTERNAL_ID = PATTERN_ELEMENT__INTERNAL_ID;

	/**
	 * The number of structural features of the '<em>Count Comparison Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON_ARGUMENT_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON_ARGUMENT___TO_XQUERY__LOCATION = PATTERN_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON_ARGUMENT___GET_ALL_INPUTS = PATTERN_ELEMENT___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON_ARGUMENT___PREPARE_TRANSLATION = PATTERN_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON_ARGUMENT___IS_VALID__BOOLEAN = PATTERN_ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON_ARGUMENT___IS_VALID_LOCAL__BOOLEAN = PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON_ARGUMENT___GET_CONTAINER = PATTERN_ELEMENT___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON_ARGUMENT___GET_ANCESTOR__CLASS = PATTERN_ELEMENT___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>My To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON_ARGUMENT___MY_TO_STRING = PATTERN_ELEMENT___MY_TO_STRING;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON_ARGUMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Count Comparison Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_COMPARISON_ARGUMENT_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.GraphContainer <em>Graph Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.GraphContainer
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getGraphContainer()
	 * @generated
	 */
	int GRAPH_CONTAINER = 14;

	/**
	 * The number of structural features of the '<em>Graph Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_CONTAINER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_CONTAINER___GET_GRAPH = 0;

	/**
	 * The operation id for the '<em>Get Morphism</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_CONTAINER___GET_MORPHISM = 1;

	/**
	 * The number of operations of the '<em>Graph Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_CONTAINER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.LogicalOperator
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 15;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.Quantifier <em>Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getQuantifier()
	 * @generated
	 */
	int QUANTIFIER = 16;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.Location <em>Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.Location
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 17;

	/**
	 * The meta object id for the '<em>Invalidity Exception Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.exceptions.InvalidityException
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getInvalidityExceptionWrapper()
	 * @generated
	 */
	int INVALIDITY_EXCEPTION_WRAPPER = 18;

	/**
	 * The meta object id for the '<em>Class Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getClassWrapper()
	 * @generated
	 */
	int CLASS_WRAPPER = 19;

	/**
	 * The meta object id for the '<em>Missing Pattern Container Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.exceptions.MissingPatternContainerException
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getMissingPatternContainerException()
	 * @generated
	 */
	int MISSING_PATTERN_CONTAINER_EXCEPTION = 20;

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
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.RelationMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see qualitypatternmodel.patternstructure.RelationMapping#getTo()
	 * @see #getRelationMapping()
	 * @generated
	 */
	EReference getRelationMapping_To();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.RelationMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see qualitypatternmodel.patternstructure.RelationMapping#getFrom()
	 * @see #getRelationMapping()
	 * @generated
	 */
	EReference getRelationMapping_From();

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
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getMorphism <em>Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Morphism</em>'.
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition#getMorphism()
	 * @see #getQuantifiedCondition()
	 * @generated
	 */
	EReference getQuantifiedCondition_Morphism();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getCountComparison <em>Count Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count Comparison</em>'.
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition#getCountComparison()
	 * @see #getQuantifiedCondition()
	 * @generated
	 */
	EReference getQuantifiedCondition_CountComparison();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#copyPreviousGraph() <em>Copy Previous Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Previous Graph</em>' operation.
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition#copyPreviousGraph()
	 * @generated
	 */
	EOperation getQuantifiedCondition__CopyPreviousGraph();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.Condition#getCondDepth <em>Cond Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cond Depth</em>'.
	 * @see qualitypatternmodel.patternstructure.Condition#getCondDepth()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_CondDepth();

	/**
	 * Returns the meta object for the reference list '{@link qualitypatternmodel.patternstructure.Condition#getGetNextQuantifiedConditions <em>Get Next Quantified Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Get Next Quantified Conditions</em>'.
	 * @see qualitypatternmodel.patternstructure.Condition#getGetNextQuantifiedConditions()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_GetNextQuantifiedConditions();

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
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.patternstructure.Condition#getQuantifiedcondition <em>Quantifiedcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Quantifiedcondition</em>'.
	 * @see qualitypatternmodel.patternstructure.Condition#getQuantifiedcondition()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Quantifiedcondition();

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
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.patternstructure.Condition#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Not</em>'.
	 * @see qualitypatternmodel.patternstructure.Condition#getNot()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Not();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.Condition#getNextQuantifiedConditions() <em>Get Next Quantified Conditions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next Quantified Conditions</em>' operation.
	 * @see qualitypatternmodel.patternstructure.Condition#getNextQuantifiedConditions()
	 * @generated
	 */
	EOperation getCondition__GetNextQuantifiedConditions();

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
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.Morphism#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see qualitypatternmodel.patternstructure.Morphism#getFrom()
	 * @see #getMorphism()
	 * @generated
	 */
	EReference getMorphism_From();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.Morphism#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see qualitypatternmodel.patternstructure.Morphism#getTo()
	 * @see #getMorphism()
	 * @generated
	 */
	EReference getMorphism_To();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.patternstructure.Morphism#getCountPattern <em>Count Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Count Pattern</em>'.
	 * @see qualitypatternmodel.patternstructure.Morphism#getCountPattern()
	 * @see #getMorphism()
	 * @generated
	 */
	EReference getMorphism_CountPattern();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.Morphism#checkSingleElementMappings() <em>Check Single Element Mappings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Single Element Mappings</em>' operation.
	 * @see qualitypatternmodel.patternstructure.Morphism#checkSingleElementMappings()
	 * @generated
	 */
	EOperation getMorphism__CheckSingleElementMappings();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.Morphism#checkSingleElementMappingsUniqueness() <em>Check Single Element Mappings Uniqueness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Single Element Mappings Uniqueness</em>' operation.
	 * @see qualitypatternmodel.patternstructure.Morphism#checkSingleElementMappingsUniqueness()
	 * @generated
	 */
	EOperation getMorphism__CheckSingleElementMappingsUniqueness();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.Morphism#getMorphDepth <em>Morph Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Morph Depth</em>'.
	 * @see qualitypatternmodel.patternstructure.Morphism#getMorphDepth()
	 * @see #getMorphism()
	 * @generated
	 */
	EAttribute getMorphism_MorphDepth();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.SingleElementMapping <em>Single Element Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Element Mapping</em>'.
	 * @see qualitypatternmodel.patternstructure.SingleElementMapping
	 * @generated
	 */
	EClass getSingleElementMapping();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.SingleElementMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see qualitypatternmodel.patternstructure.SingleElementMapping#getFrom()
	 * @see #getSingleElementMapping()
	 * @generated
	 */
	EReference getSingleElementMapping_From();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.SingleElementMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see qualitypatternmodel.patternstructure.SingleElementMapping#getTo()
	 * @see #getSingleElementMapping()
	 * @generated
	 */
	EReference getSingleElementMapping_To();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.Mapping#getMappingDepth <em>Mapping Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping Depth</em>'.
	 * @see qualitypatternmodel.patternstructure.Mapping#getMappingDepth()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_MappingDepth();

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
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.Formula#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see qualitypatternmodel.patternstructure.Formula#getCondition()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_Condition();

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
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see qualitypatternmodel.patternstructure.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.Pattern#getParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter List</em>'.
	 * @see qualitypatternmodel.patternstructure.Pattern#getParameterList()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_ParameterList();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.Pattern#getElementCounter <em>Element Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Counter</em>'.
	 * @see qualitypatternmodel.patternstructure.Pattern#getElementCounter()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_ElementCounter();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.Pattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qualitypatternmodel.patternstructure.Pattern#getName()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Name();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.patternstructure.Pattern#getCountPattern <em>Count Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Count Pattern</em>'.
	 * @see qualitypatternmodel.patternstructure.Pattern#getCountPattern()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_CountPattern();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.Pattern#isCheckMorphismOfNextGraph <em>Check Morphism Of Next Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Morphism Of Next Graph</em>'.
	 * @see qualitypatternmodel.patternstructure.Pattern#isCheckMorphismOfNextGraph()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_CheckMorphismOfNextGraph();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.Pattern#isValid(boolean) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see qualitypatternmodel.patternstructure.Pattern#isValid(boolean)
	 * @generated
	 */
	EOperation getPattern__IsValid__boolean();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.Pattern#toXQuery() <em>To XQuery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To XQuery</em>' operation.
	 * @see qualitypatternmodel.patternstructure.Pattern#toXQuery()
	 * @generated
	 */
	EOperation getPattern__ToXQuery();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.Pattern#getNewRefNo() <em>Get New Ref No</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Ref No</em>' operation.
	 * @see qualitypatternmodel.patternstructure.Pattern#getNewRefNo()
	 * @generated
	 */
	EOperation getPattern__GetNewRefNo();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#toXQuery(qualitypatternmodel.patternstructure.Location) <em>To XQuery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To XQuery</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#toXQuery(qualitypatternmodel.patternstructure.Location)
	 * @generated
	 */
	EOperation getPatternElement__ToXQuery__Location();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#getAllInputs() <em>Get All Inputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Inputs</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#getAllInputs()
	 * @generated
	 */
	EOperation getPatternElement__GetAllInputs();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPatternElement__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.NotElement <em>Not Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Element</em>'.
	 * @see qualitypatternmodel.patternstructure.NotElement
	 * @generated
	 */
	EClass getNotElement();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.NotElement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see qualitypatternmodel.patternstructure.NotElement#getCondition()
	 * @see #getNotElement()
	 * @generated
	 */
	EReference getNotElement_Condition();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.CountComparison <em>Count Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Comparison</em>'.
	 * @see qualitypatternmodel.patternstructure.CountComparison
	 * @generated
	 */
	EClass getCountComparison();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.patternstructure.CountComparison#getCountPattern <em>Count Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Count Pattern</em>'.
	 * @see qualitypatternmodel.patternstructure.CountComparison#getCountPattern()
	 * @see #getCountComparison()
	 * @generated
	 */
	EReference getCountComparison_CountPattern();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.patternstructure.CountComparison#getNumberParam <em>Number Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Number Param</em>'.
	 * @see qualitypatternmodel.patternstructure.CountComparison#getNumberParam()
	 * @see #getCountComparison()
	 * @generated
	 */
	EReference getCountComparison_NumberParam();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.patternstructure.CountComparison#getQuantifiedConditionCount <em>Quantified Condition Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Quantified Condition Count</em>'.
	 * @see qualitypatternmodel.patternstructure.CountComparison#getQuantifiedConditionCount()
	 * @see #getCountComparison()
	 * @generated
	 */
	EReference getCountComparison_QuantifiedConditionCount();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.CountComparison#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see qualitypatternmodel.patternstructure.CountComparison#getOperator()
	 * @see #getCountComparison()
	 * @generated
	 */
	EAttribute getCountComparison_Operator();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.CountComparison#getArgument1() <em>Get Argument1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Argument1</em>' operation.
	 * @see qualitypatternmodel.patternstructure.CountComparison#getArgument1()
	 * @generated
	 */
	EOperation getCountComparison__GetArgument1();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.CountComparison#getArgument2() <em>Get Argument2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Argument2</em>' operation.
	 * @see qualitypatternmodel.patternstructure.CountComparison#getArgument2()
	 * @generated
	 */
	EOperation getCountComparison__GetArgument2();

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
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.patternstructure.CountPattern#getCountComparison <em>Count Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Count Comparison</em>'.
	 * @see qualitypatternmodel.patternstructure.CountPattern#getCountComparison()
	 * @see #getCountPattern()
	 * @generated
	 */
	EReference getCountPattern_CountComparison();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.CountPattern#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see qualitypatternmodel.patternstructure.CountPattern#getPattern()
	 * @see #getCountPattern()
	 * @generated
	 */
	EReference getCountPattern_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.CountPattern#getMorphism <em>Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Morphism</em>'.
	 * @see qualitypatternmodel.patternstructure.CountPattern#getMorphism()
	 * @see #getCountPattern()
	 * @generated
	 */
	EReference getCountPattern_Morphism();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.CountComparisonArgument <em>Count Comparison Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Comparison Argument</em>'.
	 * @see qualitypatternmodel.patternstructure.CountComparisonArgument
	 * @generated
	 */
	EClass getCountComparisonArgument();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.GraphContainer <em>Graph Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Container</em>'.
	 * @see qualitypatternmodel.patternstructure.GraphContainer
	 * @generated
	 */
	EClass getGraphContainer();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.GraphContainer#getGraph() <em>Get Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Graph</em>' operation.
	 * @see qualitypatternmodel.patternstructure.GraphContainer#getGraph()
	 * @generated
	 */
	EOperation getGraphContainer__GetGraph();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.GraphContainer#getMorphism() <em>Get Morphism</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Morphism</em>' operation.
	 * @see qualitypatternmodel.patternstructure.GraphContainer#getMorphism()
	 * @generated
	 */
	EOperation getGraphContainer__GetMorphism();

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
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#isValid(boolean) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#isValid(boolean)
	 * @generated
	 */
	EOperation getPatternElement__IsValid__boolean();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#isValidLocal(boolean) <em>Is Valid Local</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Local</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#isValidLocal(boolean)
	 * @generated
	 */
	EOperation getPatternElement__IsValidLocal__boolean();

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
	 * Returns the meta object for enum '{@link qualitypatternmodel.patternstructure.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location</em>'.
	 * @see qualitypatternmodel.patternstructure.Location
	 * @generated
	 */
	EEnum getLocation();

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
		 * The meta object literal for the '<em><b>Morphism</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIED_CONDITION__MORPHISM = eINSTANCE.getQuantifiedCondition_Morphism();

		/**
		 * The meta object literal for the '<em><b>Count Comparison</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIED_CONDITION__COUNT_COMPARISON = eINSTANCE.getQuantifiedCondition_CountComparison();

		/**
		 * The meta object literal for the '<em><b>Copy Previous Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUANTIFIED_CONDITION___COPY_PREVIOUS_GRAPH = eINSTANCE.getQuantifiedCondition__CopyPreviousGraph();

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
		 * The meta object literal for the '<em><b>Cond Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__COND_DEPTH = eINSTANCE.getCondition_CondDepth();

		/**
		 * The meta object literal for the '<em><b>Get Next Quantified Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__GET_NEXT_QUANTIFIED_CONDITIONS = eINSTANCE.getCondition_GetNextQuantifiedConditions();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__PATTERN = eINSTANCE.getCondition_Pattern();

		/**
		 * The meta object literal for the '<em><b>Quantifiedcondition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__QUANTIFIEDCONDITION = eINSTANCE.getCondition_Quantifiedcondition();

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
		 * The meta object literal for the '<em><b>Not</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__NOT = eINSTANCE.getCondition_Not();

		/**
		 * The meta object literal for the '<em><b>Get Next Quantified Conditions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITION___GET_NEXT_QUANTIFIED_CONDITIONS = eINSTANCE.getCondition__GetNextQuantifiedConditions();

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
		 * The meta object literal for the '<em><b>Count Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MORPHISM__COUNT_PATTERN = eINSTANCE.getMorphism_CountPattern();

		/**
		 * The meta object literal for the '<em><b>Check Single Element Mappings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MORPHISM___CHECK_SINGLE_ELEMENT_MAPPINGS = eINSTANCE.getMorphism__CheckSingleElementMappings();

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
		 * The meta object literal for the '<em><b>Check Single Element Mappings Uniqueness</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MORPHISM___CHECK_SINGLE_ELEMENT_MAPPINGS_UNIQUENESS = eINSTANCE.getMorphism__CheckSingleElementMappingsUniqueness();

		/**
		 * The meta object literal for the '<em><b>Morph Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MORPHISM__MORPH_DEPTH = eINSTANCE.getMorphism_MorphDepth();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.SingleElementMappingImpl <em>Single Element Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.SingleElementMappingImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getSingleElementMapping()
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
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.MappingImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Mapping Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__MAPPING_DEPTH = eINSTANCE.getMapping_MappingDepth();

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
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__CONDITION = eINSTANCE.getFormula_Condition();

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
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.PatternImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__PARAMETER_LIST = eINSTANCE.getPattern_ParameterList();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__CONDITION = eINSTANCE.getPattern_Condition();

		/**
		 * The meta object literal for the '<em><b>Element Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__ELEMENT_COUNTER = eINSTANCE.getPattern_ElementCounter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__NAME = eINSTANCE.getPattern_Name();

		/**
		 * The meta object literal for the '<em><b>Count Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__COUNT_PATTERN = eINSTANCE.getPattern_CountPattern();

		/**
		 * The meta object literal for the '<em><b>Check Morphism Of Next Graph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__CHECK_MORPHISM_OF_NEXT_GRAPH = eINSTANCE.getPattern_CheckMorphismOfNextGraph();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__GRAPH = eINSTANCE.getPattern_Graph();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN___IS_VALID__BOOLEAN = eINSTANCE.getPattern__IsValid__boolean();

		/**
		 * The meta object literal for the '<em><b>To XQuery</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN___TO_XQUERY = eINSTANCE.getPattern__ToXQuery();

		/**
		 * The meta object literal for the '<em><b>Get New Ref No</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN___GET_NEW_REF_NO = eINSTANCE.getPattern__GetNewRefNo();

		/**
		 * The meta object literal for the '<em><b>Check Morphism Of Next Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN___CHECK_MORPHISM_OF_NEXT_GRAPH = eINSTANCE.getPattern__CheckMorphismOfNextGraph();

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
		 * The meta object literal for the '<em><b>To XQuery</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___TO_XQUERY__LOCATION = eINSTANCE.getPatternElement__ToXQuery__Location();

		/**
		 * The meta object literal for the '<em><b>Get All Inputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___GET_ALL_INPUTS = eINSTANCE.getPatternElement__GetAllInputs();

		/**
		 * The meta object literal for the '<em><b>Prepare Translation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___PREPARE_TRANSLATION = eINSTANCE.getPatternElement__PrepareTranslation();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPatternElement__Validate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.NotElementImpl <em>Not Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.NotElementImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getNotElement()
		 * @generated
		 */
		EClass NOT_ELEMENT = eINSTANCE.getNotElement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_ELEMENT__CONDITION = eINSTANCE.getNotElement_Condition();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.CountComparisonImpl <em>Count Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.CountComparisonImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getCountComparison()
		 * @generated
		 */
		EClass COUNT_COMPARISON = eINSTANCE.getCountComparison();

		/**
		 * The meta object literal for the '<em><b>Count Pattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_COMPARISON__COUNT_PATTERN = eINSTANCE.getCountComparison_CountPattern();

		/**
		 * The meta object literal for the '<em><b>Number Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_COMPARISON__NUMBER_PARAM = eINSTANCE.getCountComparison_NumberParam();

		/**
		 * The meta object literal for the '<em><b>Quantified Condition Count</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT = eINSTANCE.getCountComparison_QuantifiedConditionCount();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNT_COMPARISON__OPERATOR = eINSTANCE.getCountComparison_Operator();

		/**
		 * The meta object literal for the '<em><b>Get Argument1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUNT_COMPARISON___GET_ARGUMENT1 = eINSTANCE.getCountComparison__GetArgument1();

		/**
		 * The meta object literal for the '<em><b>Get Argument2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUNT_COMPARISON___GET_ARGUMENT2 = eINSTANCE.getCountComparison__GetArgument2();

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
		 * The meta object literal for the '<em><b>Count Comparison</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_PATTERN__COUNT_COMPARISON = eINSTANCE.getCountPattern_CountComparison();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_PATTERN__PATTERN = eINSTANCE.getCountPattern_Pattern();

		/**
		 * The meta object literal for the '<em><b>Morphism</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_PATTERN__MORPHISM = eINSTANCE.getCountPattern_Morphism();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.CountComparisonArgument <em>Count Comparison Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.CountComparisonArgument
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getCountComparisonArgument()
		 * @generated
		 */
		EClass COUNT_COMPARISON_ARGUMENT = eINSTANCE.getCountComparisonArgument();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.GraphContainer <em>Graph Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.GraphContainer
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getGraphContainer()
		 * @generated
		 */
		EClass GRAPH_CONTAINER = eINSTANCE.getGraphContainer();

		/**
		 * The meta object literal for the '<em><b>Get Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH_CONTAINER___GET_GRAPH = eINSTANCE.getGraphContainer__GetGraph();

		/**
		 * The meta object literal for the '<em><b>Get Morphism</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH_CONTAINER___GET_MORPHISM = eINSTANCE.getGraphContainer__GetMorphism();

		/**
		 * The meta object literal for the '<em><b>My To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___MY_TO_STRING = eINSTANCE.getPatternElement__MyToString();

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
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___IS_VALID__BOOLEAN = eINSTANCE.getPatternElement__IsValid__boolean();

		/**
		 * The meta object literal for the '<em><b>Is Valid Local</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN = eINSTANCE.getPatternElement__IsValidLocal__boolean();

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
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.Location <em>Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.Location
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getLocation()
		 * @generated
		 */
		EEnum LOCATION = eINSTANCE.getLocation();

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

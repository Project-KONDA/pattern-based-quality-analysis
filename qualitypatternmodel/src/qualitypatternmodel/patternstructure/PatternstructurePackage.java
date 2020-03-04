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
	 * The feature id for the '<em><b>Short Pattern Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__SHORT_PATTERN_INTERNAL_ID = 1;

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
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = 7;

	/**
	 * The number of operations of the '<em>Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT_OPERATION_COUNT = 8;

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
	 * The feature id for the '<em><b>Short Pattern Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SHORT_PATTERN_INTERNAL_ID = PATTERN_ELEMENT__SHORT_PATTERN_INTERNAL_ID;

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
	 * The feature id for the '<em><b>Short Pattern Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING__SHORT_PATTERN_INTERNAL_ID = MAPPING__SHORT_PATTERN_INTERNAL_ID;

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
	 * The feature id for the '<em><b>Short Pattern Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SHORT_PATTERN_INTERNAL_ID = PATTERN_ELEMENT__SHORT_PATTERN_INTERNAL_ID;

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
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 6;

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
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP = PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Short Pattern Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__SHORT_PATTERN_INTERNAL_ID = CONDITION__SHORT_PATTERN_INTERNAL_ID;

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
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__QUANTIFIER = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Morphism Of Next Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__CHECK_MORPHISM_OF_NEXT_GRAPH = CONDITION_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Morphism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION__MORPHISM = CONDITION_FEATURE_COUNT + 4;

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
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP = CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Copy Previous Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___COPY_PREVIOUS_GRAPH = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quantified Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Short Pattern Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__SHORT_PATTERN_INTERNAL_ID = PATTERN_ELEMENT__SHORT_PATTERN_INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Morph Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__MORPH_DEPTH = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Single Element Mappings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__CHECK_SINGLE_ELEMENT_MAPPINGS = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Check Relation Mappings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__CHECK_RELATION_MAPPINGS = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Check Single Element Mappings Uniqueness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__CHECK_SINGLE_ELEMENT_MAPPINGS_UNIQUENESS = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Check Relation Mappings Uniqueness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__CHECK_RELATION_MAPPINGS_UNIQUENESS = PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__MAPPINGS = PATTERN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__FROM = PATTERN_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__TO = PATTERN_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Morphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 8;

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
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___VALIDATE__DIAGNOSTICCHAIN_MAP = PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Morphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Short Pattern Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING__SHORT_PATTERN_INTERNAL_ID = MAPPING__SHORT_PATTERN_INTERNAL_ID;

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
	 * The feature id for the '<em><b>Short Pattern Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__SHORT_PATTERN_INTERNAL_ID = CONDITION__SHORT_PATTERN_INTERNAL_ID;

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
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__OPERATOR = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__ARGUMENT1 = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__ARGUMENT2 = CONDITION_FEATURE_COUNT + 2;

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
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___VALIDATE__DIAGNOSTICCHAIN_MAP = CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.impl.TrueImpl <em>True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.impl.TrueImpl
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getTrue()
	 * @generated
	 */
	int TRUE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__ID = CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Short Pattern Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__SHORT_PATTERN_INTERNAL_ID = CONDITION__SHORT_PATTERN_INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Cond Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__COND_DEPTH = CONDITION__COND_DEPTH;

	/**
	 * The feature id for the '<em><b>Get Next Quantified Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__GET_NEXT_QUANTIFIED_CONDITIONS = CONDITION__GET_NEXT_QUANTIFIED_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__PATTERN = CONDITION__PATTERN;

	/**
	 * The feature id for the '<em><b>Quantifiedcondition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__QUANTIFIEDCONDITION = CONDITION__QUANTIFIEDCONDITION;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__FORMULA1 = CONDITION__FORMULA1;

	/**
	 * The feature id for the '<em><b>Formula2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__FORMULA2 = CONDITION__FORMULA2;

	/**
	 * The number of structural features of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE___TO_XQUERY__LOCATION = CONDITION___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE___GET_ALL_INPUTS = CONDITION___GET_ALL_INPUTS;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE___PREPARE_TRANSLATION = CONDITION___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE___IS_VALID__BOOLEAN = CONDITION___IS_VALID__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Valid Local</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE___IS_VALID_LOCAL__BOOLEAN = CONDITION___IS_VALID_LOCAL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE___GET_CONTAINER = CONDITION___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Get Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE___GET_ANCESTOR__CLASS = CONDITION___GET_ANCESTOR__CLASS;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE___VALIDATE__DIAGNOSTICCHAIN_MAP = CONDITION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Short Pattern Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__SHORT_PATTERN_INTERNAL_ID = PATTERN_ELEMENT__SHORT_PATTERN_INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Variable List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__VARIABLE_LIST = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Morphism Of Next Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__CHECK_MORPHISM_OF_NEXT_GRAPH = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__RETURN_GRAPH = PATTERN_ELEMENT_FEATURE_COUNT + 2;

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
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 6;

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
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.LogicalOperator
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 10;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.Quantifier <em>Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getQuantifier()
	 * @generated
	 */
	int QUANTIFIER = 11;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.Location <em>Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.Location
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 12;

	/**
	 * The meta object id for the '<em>Invalidity Exception Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.exceptions.InvalidityException
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getInvalidityExceptionWrapper()
	 * @generated
	 */
	int INVALIDITY_EXCEPTION_WRAPPER = 13;

	/**
	 * The meta object id for the '<em>Class Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getClassWrapper()
	 * @generated
	 */
	int CLASS_WRAPPER = 14;

	/**
	 * The meta object id for the '<em>Missing Pattern Container Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.exceptions.MissingPatternContainerException
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getMissingPatternContainerException()
	 * @generated
	 */
	int MISSING_PATTERN_CONTAINER_EXCEPTION = 15;

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
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#copyPreviousGraph() <em>Copy Previous Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Previous Graph</em>' operation.
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition#copyPreviousGraph()
	 * @generated
	 */
	EOperation getQuantifiedCondition__CopyPreviousGraph();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#isCheckMorphismOfNextGraph <em>Check Morphism Of Next Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Morphism Of Next Graph</em>'.
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition#isCheckMorphismOfNextGraph()
	 * @see #getQuantifiedCondition()
	 * @generated
	 */
	EAttribute getQuantifiedCondition_CheckMorphismOfNextGraph();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.Morphism#getCheckSingleElementMappings <em>Check Single Element Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Single Element Mappings</em>'.
	 * @see qualitypatternmodel.patternstructure.Morphism#getCheckSingleElementMappings()
	 * @see #getMorphism()
	 * @generated
	 */
	EAttribute getMorphism_CheckSingleElementMappings();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.Morphism#getCheckRelationMappings <em>Check Relation Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Relation Mappings</em>'.
	 * @see qualitypatternmodel.patternstructure.Morphism#getCheckRelationMappings()
	 * @see #getMorphism()
	 * @generated
	 */
	EAttribute getMorphism_CheckRelationMappings();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.Morphism#getCheckSingleElementMappingsUniqueness <em>Check Single Element Mappings Uniqueness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Single Element Mappings Uniqueness</em>'.
	 * @see qualitypatternmodel.patternstructure.Morphism#getCheckSingleElementMappingsUniqueness()
	 * @see #getMorphism()
	 * @generated
	 */
	EAttribute getMorphism_CheckSingleElementMappingsUniqueness();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.Morphism#getCheckRelationMappingsUniqueness <em>Check Relation Mappings Uniqueness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Relation Mappings Uniqueness</em>'.
	 * @see qualitypatternmodel.patternstructure.Morphism#getCheckRelationMappingsUniqueness()
	 * @see #getMorphism()
	 * @generated
	 */
	EAttribute getMorphism_CheckRelationMappingsUniqueness();

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
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.Formula#getArgument1 <em>Argument1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument1</em>'.
	 * @see qualitypatternmodel.patternstructure.Formula#getArgument1()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_Argument1();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.Formula#getArgument2 <em>Argument2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument2</em>'.
	 * @see qualitypatternmodel.patternstructure.Formula#getArgument2()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_Argument2();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True</em>'.
	 * @see qualitypatternmodel.patternstructure.True
	 * @generated
	 */
	EClass getTrue();

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
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.Pattern#getReturnGraph <em>Return Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Graph</em>'.
	 * @see qualitypatternmodel.patternstructure.Pattern#getReturnGraph()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_ReturnGraph();

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
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.patternstructure.Pattern#getVariableList <em>Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable List</em>'.
	 * @see qualitypatternmodel.patternstructure.Pattern#getVariableList()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_VariableList();

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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.patternstructure.PatternElement#getShortPatternInternalId <em>Short Pattern Internal Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Pattern Internal Id</em>'.
	 * @see qualitypatternmodel.patternstructure.PatternElement#getShortPatternInternalId()
	 * @see #getPatternElement()
	 * @generated
	 */
	EAttribute getPatternElement_ShortPatternInternalId();

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
		 * The meta object literal for the '<em><b>Copy Previous Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUANTIFIED_CONDITION___COPY_PREVIOUS_GRAPH = eINSTANCE.getQuantifiedCondition__CopyPreviousGraph();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIED_CONDITION__QUANTIFIER = eINSTANCE.getQuantifiedCondition_Quantifier();

		/**
		 * The meta object literal for the '<em><b>Check Morphism Of Next Graph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIED_CONDITION__CHECK_MORPHISM_OF_NEXT_GRAPH = eINSTANCE.getQuantifiedCondition_CheckMorphismOfNextGraph();

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
		 * The meta object literal for the '<em><b>Morph Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MORPHISM__MORPH_DEPTH = eINSTANCE.getMorphism_MorphDepth();

		/**
		 * The meta object literal for the '<em><b>Check Single Element Mappings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MORPHISM__CHECK_SINGLE_ELEMENT_MAPPINGS = eINSTANCE.getMorphism_CheckSingleElementMappings();

		/**
		 * The meta object literal for the '<em><b>Check Relation Mappings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MORPHISM__CHECK_RELATION_MAPPINGS = eINSTANCE.getMorphism_CheckRelationMappings();

		/**
		 * The meta object literal for the '<em><b>Check Single Element Mappings Uniqueness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MORPHISM__CHECK_SINGLE_ELEMENT_MAPPINGS_UNIQUENESS = eINSTANCE.getMorphism_CheckSingleElementMappingsUniqueness();

		/**
		 * The meta object literal for the '<em><b>Check Relation Mappings Uniqueness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MORPHISM__CHECK_RELATION_MAPPINGS_UNIQUENESS = eINSTANCE.getMorphism_CheckRelationMappingsUniqueness();

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
		 * The meta object literal for the '<em><b>Argument1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__ARGUMENT1 = eINSTANCE.getFormula_Argument1();

		/**
		 * The meta object literal for the '<em><b>Argument2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__ARGUMENT2 = eINSTANCE.getFormula_Argument2();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.TrueImpl <em>True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.TrueImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getTrue()
		 * @generated
		 */
		EClass TRUE = eINSTANCE.getTrue();

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
		 * The meta object literal for the '<em><b>Variable List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__VARIABLE_LIST = eINSTANCE.getPattern_VariableList();

		/**
		 * The meta object literal for the '<em><b>Check Morphism Of Next Graph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__CHECK_MORPHISM_OF_NEXT_GRAPH = eINSTANCE.getPattern_CheckMorphismOfNextGraph();

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
		 * The meta object literal for the '<em><b>Short Pattern Internal Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ELEMENT__SHORT_PATTERN_INTERNAL_ID = eINSTANCE.getPatternElement_ShortPatternInternalId();

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

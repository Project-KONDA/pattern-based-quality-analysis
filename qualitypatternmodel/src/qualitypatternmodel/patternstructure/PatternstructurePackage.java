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
	 * The number of structural features of the '<em>Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION = 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT___IS_VALID__BOOLEAN = 1;

	/**
	 * The number of operations of the '<em>Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT_OPERATION_COUNT = 2;

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
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___TO_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___IS_VALID__BOOLEAN = PATTERN_ELEMENT___IS_VALID__BOOLEAN;

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
	int RELATION_MAPPING___TO_XQUERY__TRANSLATIONLOCATION = MAPPING___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING___IS_VALID__BOOLEAN = MAPPING___IS_VALID__BOOLEAN;

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
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___TO_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___IS_VALID__BOOLEAN = PATTERN_ELEMENT___IS_VALID__BOOLEAN;

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
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___TO_XQUERY__TRANSLATIONLOCATION = CONDITION___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION___IS_VALID__BOOLEAN = CONDITION___IS_VALID__BOOLEAN;

	/**
	 * The number of operations of the '<em>Quantified Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

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
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___TO_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM___IS_VALID__BOOLEAN = PATTERN_ELEMENT___IS_VALID__BOOLEAN;

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
	int SINGLE_ELEMENT_MAPPING___TO_XQUERY__TRANSLATIONLOCATION = MAPPING___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_MAPPING___IS_VALID__BOOLEAN = MAPPING___IS_VALID__BOOLEAN;

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
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___TO_XQUERY__TRANSLATIONLOCATION = CONDITION___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___IS_VALID__BOOLEAN = CONDITION___IS_VALID__BOOLEAN;

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
	int TRUE___TO_XQUERY__TRANSLATIONLOCATION = CONDITION___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE___IS_VALID__BOOLEAN = CONDITION___IS_VALID__BOOLEAN;

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
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___TO_XQUERY__TRANSLATIONLOCATION = PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN___IS_VALID__BOOLEAN = PATTERN_ELEMENT___IS_VALID__BOOLEAN;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link qualitypatternmodel.patternstructure.TranslationLocation <em>Translation Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.TranslationLocation
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getTranslationLocation()
	 * @generated
	 */
	int TRANSLATION_LOCATION = 12;

	/**
	 * The meta object id for the '<em>Invalid Translation Exception Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.InvalidTranslationException
	 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getInvalidTranslationExceptionWrapper()
	 * @generated
	 */
	int INVALID_TRANSLATION_EXCEPTION_WRAPPER = 13;


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
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.Morphism <em>Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Morphism</em>'.
	 * @see qualitypatternmodel.patternstructure.Morphism
	 * @generated
	 */
	EClass getMorphism();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.patternstructure.Morphism#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping</em>'.
	 * @see qualitypatternmodel.patternstructure.Morphism#getMapping()
	 * @see #getMorphism()
	 * @generated
	 */
	EReference getMorphism_Mapping();

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
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see qualitypatternmodel.patternstructure.Formula
	 * @generated
	 */
	EClass getFormula();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.patternstructure.Formula#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see qualitypatternmodel.patternstructure.Formula#getArguments()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_Arguments();

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
	 * Returns the meta object for class '{@link qualitypatternmodel.patternstructure.PatternElement <em>Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Element</em>'.
	 * @see qualitypatternmodel.patternstructure.PatternElement
	 * @generated
	 */
	EClass getPatternElement();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.patternstructure.PatternElement#toXQuery(qualitypatternmodel.patternstructure.TranslationLocation) <em>To XQuery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To XQuery</em>' operation.
	 * @see qualitypatternmodel.patternstructure.PatternElement#toXQuery(qualitypatternmodel.patternstructure.TranslationLocation)
	 * @generated
	 */
	EOperation getPatternElement__ToXQuery__TranslationLocation();

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
	 * Returns the meta object for enum '{@link qualitypatternmodel.patternstructure.TranslationLocation <em>Translation Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Translation Location</em>'.
	 * @see qualitypatternmodel.patternstructure.TranslationLocation
	 * @generated
	 */
	EEnum getTranslationLocation();

	/**
	 * Returns the meta object for data type '{@link qualitypatternmodel.patternstructure.InvalidTranslationException <em>Invalid Translation Exception Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Translation Exception Wrapper</em>'.
	 * @see qualitypatternmodel.patternstructure.InvalidTranslationException
	 * @model instanceClass="qualitypatternmodel.patternstructure.InvalidTranslationException"
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
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.MorphismImpl <em>Morphism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.MorphismImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getMorphism()
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
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.FormulaImpl <em>Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.FormulaImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getFormula()
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
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.impl.PatternElementImpl <em>Pattern Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.impl.PatternElementImpl
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getPatternElement()
		 * @generated
		 */
		EClass PATTERN_ELEMENT = eINSTANCE.getPatternElement();

		/**
		 * The meta object literal for the '<em><b>To XQuery</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION = eINSTANCE.getPatternElement__ToXQuery__TranslationLocation();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_ELEMENT___IS_VALID__BOOLEAN = eINSTANCE.getPatternElement__IsValid__boolean();

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
		 * The meta object literal for the '{@link qualitypatternmodel.patternstructure.TranslationLocation <em>Translation Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.TranslationLocation
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getTranslationLocation()
		 * @generated
		 */
		EEnum TRANSLATION_LOCATION = eINSTANCE.getTranslationLocation();

		/**
		 * The meta object literal for the '<em>Invalid Translation Exception Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.patternstructure.InvalidTranslationException
		 * @see qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl#getInvalidTranslationExceptionWrapper()
		 * @generated
		 */
		EDataType INVALID_TRANSLATION_EXCEPTION_WRAPPER = eINSTANCE.getInvalidTranslationExceptionWrapper();

	}

} //PatternstructurePackage

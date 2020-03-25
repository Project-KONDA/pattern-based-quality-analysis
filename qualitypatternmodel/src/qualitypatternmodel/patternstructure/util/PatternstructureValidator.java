/**
 */
package qualitypatternmodel.patternstructure.util;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.patternstructure.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage
 * @generated
 */
public class PatternstructureValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PatternstructureValidator INSTANCE = new PatternstructureValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "qualitypatternmodel.patternstructure";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Pattern Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATTERN_ELEMENT__VALIDATE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternstructureValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PatternstructurePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PatternstructurePackage.RELATION_MAPPING:
				return validateRelationMapping((RelationMapping)value, diagnostics, context);
			case PatternstructurePackage.QUANTIFIED_CONDITION:
				return validateQuantifiedCondition((QuantifiedCondition)value, diagnostics, context);
			case PatternstructurePackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case PatternstructurePackage.MORPHISM:
				return validateMorphism((Morphism)value, diagnostics, context);
			case PatternstructurePackage.ELEMENT_MAPPING:
				return validateElementMapping((ElementMapping)value, diagnostics, context);
			case PatternstructurePackage.MAPPING:
				return validateMapping((Mapping)value, diagnostics, context);
			case PatternstructurePackage.FORMULA:
				return validateFormula((Formula)value, diagnostics, context);
			case PatternstructurePackage.TRUE_ELEMENT:
				return validateTrueElement((TrueElement)value, diagnostics, context);
			case PatternstructurePackage.PATTERN:
				return validatePattern((Pattern)value, diagnostics, context);
			case PatternstructurePackage.PATTERN_ELEMENT:
				return validatePatternElement((PatternElement)value, diagnostics, context);
			case PatternstructurePackage.NOT_CONDITION:
				return validateNotCondition((NotCondition)value, diagnostics, context);
			case PatternstructurePackage.COUNT_CONDITION:
				return validateCountCondition((CountCondition)value, diagnostics, context);
			case PatternstructurePackage.COUNT:
				return validateCount((Count)value, diagnostics, context);
			case PatternstructurePackage.COUNT_CONDITION_ARGUMENT:
				return validateCountConditionArgument((CountConditionArgument)value, diagnostics, context);
			case PatternstructurePackage.GRAPH_CONTAINER:
				return validateGraphContainer((GraphContainer)value, diagnostics, context);
			case PatternstructurePackage.LOGICAL_OPERATOR:
				return validateLogicalOperator((LogicalOperator)value, diagnostics, context);
			case PatternstructurePackage.QUANTIFIER:
				return validateQuantifier((Quantifier)value, diagnostics, context);
			case PatternstructurePackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case PatternstructurePackage.INVALIDITY_EXCEPTION_WRAPPER:
				return validateInvalidityExceptionWrapper((InvalidityException)value, diagnostics, context);
			case PatternstructurePackage.CLASS_WRAPPER:
				return validateClassWrapper((Class)value, diagnostics, context);
			case PatternstructurePackage.MISSING_PATTERN_CONTAINER_EXCEPTION:
				return validateMissingPatternContainerException((MissingPatternContainerException)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationMapping(RelationMapping relationMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(relationMapping, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantifiedCondition(QuantifiedCondition quantifiedCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(quantifiedCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(quantifiedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(quantifiedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(quantifiedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(quantifiedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(quantifiedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(quantifiedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(quantifiedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(quantifiedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(quantifiedCondition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(condition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(condition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMorphism(Morphism morphism, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(morphism, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(morphism, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(morphism, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(morphism, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(morphism, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(morphism, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(morphism, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(morphism, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(morphism, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(morphism, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementMapping(ElementMapping elementMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elementMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(elementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(elementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(elementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(elementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(elementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(elementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(elementMapping, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping(Mapping mapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(mapping, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormula(Formula formula, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(formula, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(formula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(formula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(formula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(formula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(formula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(formula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(formula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(formula, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(formula, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrueElement(TrueElement trueElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trueElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(trueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(trueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(trueElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePattern(Pattern pattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pattern, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(pattern, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternElement(PatternElement patternElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patternElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(patternElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(patternElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(patternElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(patternElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(patternElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(patternElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(patternElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(patternElement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(patternElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternElement_validate(PatternElement patternElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patternElement.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotCondition(NotCondition notCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(notCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(notCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(notCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(notCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(notCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(notCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(notCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(notCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(notCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(notCondition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountCondition(CountCondition countCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(countCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(countCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(countCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(countCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(countCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(countCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(countCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(countCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(countCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(countCondition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCount(Count count, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(count, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(count, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(count, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(count, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(count, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(count, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(count, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(count, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(count, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(count, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountConditionArgument(CountConditionArgument countConditionArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(countConditionArgument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(countConditionArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(countConditionArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(countConditionArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(countConditionArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(countConditionArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(countConditionArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(countConditionArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(countConditionArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(countConditionArgument, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphContainer(GraphContainer graphContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalOperator(LogicalOperator logicalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantifier(Quantifier quantifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvalidityExceptionWrapper(InvalidityException invalidityExceptionWrapper, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassWrapper(Class classWrapper, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMissingPatternContainerException(MissingPatternContainerException missingPatternContainerException, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PatternstructureValidator

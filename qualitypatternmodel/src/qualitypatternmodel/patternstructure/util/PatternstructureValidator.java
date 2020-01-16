/**
 */
package qualitypatternmodel.patternstructure.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

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
			case PatternstructurePackage.SINGLE_ELEMENT_MAPPING:
				return validateSingleElementMapping((SingleElementMapping)value, diagnostics, context);
			case PatternstructurePackage.MAPPING:
				return validateMapping((Mapping)value, diagnostics, context);
			case PatternstructurePackage.FORMULA:
				return validateFormula((Formula)value, diagnostics, context);
			case PatternstructurePackage.TRUE:
				return validateTrue((True)value, diagnostics, context);
			case PatternstructurePackage.PATTERN:
				return validatePattern((Pattern)value, diagnostics, context);
			case PatternstructurePackage.PATTERN_ELEMENT:
				return validatePatternElement((PatternElement)value, diagnostics, context);
			case PatternstructurePackage.VARIABLE_LIST:
				return validateVariableList((VariableList)value, diagnostics, context);
			case PatternstructurePackage.LOGICAL_OPERATOR:
				return validateLogicalOperator((LogicalOperator)value, diagnostics, context);
			case PatternstructurePackage.QUANTIFIER:
				return validateQuantifier((Quantifier)value, diagnostics, context);
			case PatternstructurePackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case PatternstructurePackage.INVALIDITY_EXCEPTION_WRAPPER:
				return validateInvalidityExceptionWrapper((InvalidityException)value, diagnostics, context);
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
	public boolean validateSingleElementMapping(SingleElementMapping singleElementMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(singleElementMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(singleElementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singleElementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singleElementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(singleElementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singleElementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singleElementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singleElementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singleElementMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(singleElementMapping, diagnostics, context);
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
	public boolean validateTrue(True true_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(true_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(true_, diagnostics, context);
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
	public boolean validateVariableList(VariableList variableList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variableList, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variableList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variableList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variableList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variableList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variableList, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternElement_validate(variableList, diagnostics, context);
		return result;
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

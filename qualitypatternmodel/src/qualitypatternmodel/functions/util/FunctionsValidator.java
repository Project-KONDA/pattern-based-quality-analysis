/**
 */
package qualitypatternmodel.functions.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import qualitypatternmodel.functions.*;

import qualitypatternmodel.graphstructure.util.GraphstructureValidator;
import qualitypatternmodel.patternstructure.util.PatternstructureValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.functions.FunctionsPackage
 * @generated
 */
public class FunctionsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FunctionsValidator INSTANCE = new FunctionsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "qualitypatternmodel.functions";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Operator'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATOR__VALIDATE = 1;

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternstructureValidator patternstructureValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphstructureValidator graphstructureValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsValidator() {
		super();
		patternstructureValidator = PatternstructureValidator.INSTANCE;
		graphstructureValidator = GraphstructureValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FunctionsPackage.eINSTANCE;
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
			case FunctionsPackage.BOOLEAN_OPERATOR:
				return validateBooleanOperator((BooleanOperator)value, diagnostics, context);
			case FunctionsPackage.OPERATOR:
				return validateOperator((Operator)value, diagnostics, context);
			case FunctionsPackage.COUNT:
				return validateCount((Count)value, diagnostics, context);
			case FunctionsPackage.OTHER_OPERATORS:
				return validateOtherOperators((OtherOperators)value, diagnostics, context);
			case FunctionsPackage.NUMBER_OPERATORS:
				return validateNumberOperators((NumberOperators)value, diagnostics, context);
			case FunctionsPackage.MATCH:
				return validateMatch((Match)value, diagnostics, context);
			case FunctionsPackage.COMPARISON:
				return validateComparison((Comparison)value, diagnostics, context);
			case FunctionsPackage.TO_NUMBER:
				return validateToNumber((ToNumber)value, diagnostics, context);
			case FunctionsPackage.COMPARISON_OPERATOR:
				return validateComparisonOperator((ComparisonOperator)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanOperator(BooleanOperator booleanOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booleanOperator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(booleanOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(booleanOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(booleanOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(booleanOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(booleanOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(booleanOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(booleanOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(booleanOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperator_validate(booleanOperator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperator_validate(operator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator_validate(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return operator.validate(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateOperator_validate(count, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherOperators(OtherOperators otherOperators, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(otherOperators, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(otherOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(otherOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(otherOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(otherOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(otherOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(otherOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(otherOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(otherOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperator_validate(otherOperators, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOperators(NumberOperators numberOperators, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numberOperators, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(numberOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(numberOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(numberOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(numberOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(numberOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(numberOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(numberOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(numberOperators, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperator_validate(numberOperators, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatch(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(match, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(match, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperator_validate(match, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparison(Comparison comparison, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(comparison, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(comparison, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(comparison, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(comparison, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(comparison, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(comparison, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(comparison, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(comparison, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(comparison, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperator_validate(comparison, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToNumber(ToNumber toNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(toNumber, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(toNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(toNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(toNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(toNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(toNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(toNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(toNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(toNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperator_validate(toNumber, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonOperator(ComparisonOperator comparisonOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //FunctionsValidator

/**
 */
package qualitypatternmodel.operators.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import qualitypatternmodel.exceptions.OperatorCycleException;

import qualitypatternmodel.graphstructure.util.GraphstructureValidator;

import qualitypatternmodel.operators.*;

import qualitypatternmodel.patternstructure.util.PatternstructureValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.operators.OperatorsPackage
 * @generated
 */
public class OperatorsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OperatorsValidator INSTANCE = new OperatorsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "qualitypatternmodel.operators";

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
	public OperatorsValidator() {
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
	  return OperatorsPackage.eINSTANCE;
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
			case OperatorsPackage.BOOLEAN_OPERATOR:
				return validateBooleanOperator((BooleanOperator)value, diagnostics, context);
			case OperatorsPackage.OPERATOR:
				return validateOperator((Operator)value, diagnostics, context);
			case OperatorsPackage.NUMBER_OPERATOR:
				return validateNumberOperator((NumberOperator)value, diagnostics, context);
			case OperatorsPackage.MATCH:
				return validateMatch((Match)value, diagnostics, context);
			case OperatorsPackage.COMPARISON:
				return validateComparison((Comparison)value, diagnostics, context);
			case OperatorsPackage.OPERATOR_LIST:
				return validateOperatorList((OperatorList)value, diagnostics, context);
			case OperatorsPackage.CONTAINS:
				return validateContains((Contains)value, diagnostics, context);
			case OperatorsPackage.NULL_CHECK:
				return validateNullCheck((NullCheck)value, diagnostics, context);
			case OperatorsPackage.STRING_LENGTH:
				return validateStringLength((StringLength)value, diagnostics, context);
			case OperatorsPackage.COMPARISON_OPERATOR:
				return validateComparisonOperator((ComparisonOperator)value, diagnostics, context);
			case OperatorsPackage.OPERATOR_CYCLE_EXCEPTION_WRAPPER:
				return validateOperatorCycleExceptionWrapper((OperatorCycleException)value, diagnostics, context);
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
	public boolean validateNumberOperator(NumberOperator numberOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numberOperator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(numberOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(numberOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(numberOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(numberOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(numberOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(numberOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(numberOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(numberOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperator_validate(numberOperator, diagnostics, context);
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
	public boolean validateOperatorList(OperatorList operatorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operatorList, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operatorList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operatorList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operatorList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operatorList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operatorList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operatorList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operatorList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operatorList, diagnostics, context);
		if (result || diagnostics != null) result &= patternstructureValidator.validatePatternElement_validate(operatorList, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContains(Contains contains, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contains, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(contains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(contains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(contains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(contains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(contains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(contains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(contains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(contains, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperator_validate(contains, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullCheck(NullCheck nullCheck, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nullCheck, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nullCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nullCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nullCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nullCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nullCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nullCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nullCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nullCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperator_validate(nullCheck, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringLength(StringLength stringLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stringLength, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stringLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stringLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stringLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stringLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stringLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stringLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stringLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stringLength, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperator_validate(stringLength, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperatorCycleExceptionWrapper(OperatorCycleException operatorCycleExceptionWrapper, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //OperatorsValidator

/**
 */
package qualitypatternmodel.parameters.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import qualitypatternmodel.graphstructure.util.GraphstructureValidator;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.patternstructure.util.PatternstructureValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.parameters.ParametersPackage
 * @generated
 */
public class ParametersValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ParametersValidator INSTANCE = new ParametersValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "qualitypatternmodel.parameters";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER__VALIDATE = 1;

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
	public ParametersValidator() {
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
	  return ParametersPackage.eINSTANCE;
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
			case ParametersPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case ParametersPackage.COMPARISON_OPTION_PARAM:
				return validateComparisonOptionParam((ComparisonOptionParam)value, diagnostics, context);
			case ParametersPackage.PROPERTY_OPTION_PARAM:
				return validatePropertyOptionParam((PropertyOptionParam)value, diagnostics, context);
			case ParametersPackage.PARAMETER_LIST:
				return validateParameterList((ParameterList)value, diagnostics, context);
			case ParametersPackage.BOOLEAN_PARAM:
				return validateBooleanParam((BooleanParam)value, diagnostics, context);
			case ParametersPackage.TEXT_LIST_PARAM:
				return validateTextListParam((TextListParam)value, diagnostics, context);
			case ParametersPackage.TEXT_LITERAL_PARAM:
				return validateTextLiteralParam((TextLiteralParam)value, diagnostics, context);
			case ParametersPackage.NUMBER_PARAM:
				return validateNumberParam((NumberParam)value, diagnostics, context);
			case ParametersPackage.PARAMETER_VALUE:
				return validateParameterValue((ParameterValue)value, diagnostics, context);
			case ParametersPackage.DATE_PARAM:
				return validateDateParam((DateParam)value, diagnostics, context);
			case ParametersPackage.TIME_PARAM:
				return validateTimeParam((TimeParam)value, diagnostics, context);
			case ParametersPackage.UNKNOWN_PARAMETER_VALUE:
				return validateUnknownParameterValue((UnknownParameterValue)value, diagnostics, context);
			case ParametersPackage.DATE_TIME_PARAM:
				return validateDateTimeParam((DateTimeParam)value, diagnostics, context);
			case ParametersPackage.RELATION_OPTION_PARAM:
				return validateRelationOptionParam((RelationOptionParam)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(parameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_validate(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonOptionParam(ComparisonOptionParam comparisonOptionParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(comparisonOptionParam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(comparisonOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(comparisonOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(comparisonOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(comparisonOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(comparisonOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(comparisonOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(comparisonOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(comparisonOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(comparisonOptionParam, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyOptionParam(PropertyOptionParam propertyOptionParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(propertyOptionParam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(propertyOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propertyOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propertyOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(propertyOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propertyOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propertyOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(propertyOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propertyOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(propertyOptionParam, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterList(ParameterList parameterList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterList, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterList, diagnostics, context);
		if (result || diagnostics != null) result &= patternstructureValidator.validatePatternElement_validate(parameterList, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanParam(BooleanParam booleanParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booleanParam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(booleanParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(booleanParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(booleanParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(booleanParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(booleanParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(booleanParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(booleanParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(booleanParam, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(booleanParam, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextListParam(TextListParam textListParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textListParam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textListParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textListParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textListParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textListParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textListParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textListParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textListParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textListParam, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(textListParam, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextLiteralParam(TextLiteralParam textLiteralParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textLiteralParam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textLiteralParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textLiteralParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textLiteralParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textLiteralParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textLiteralParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textLiteralParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textLiteralParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textLiteralParam, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(textLiteralParam, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberParam(NumberParam numberParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numberParam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(numberParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(numberParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(numberParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(numberParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(numberParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(numberParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(numberParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(numberParam, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(numberParam, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterValue(ParameterValue parameterValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(parameterValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateParam(DateParam dateParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateParam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateParam, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(dateParam, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeParam(TimeParam timeParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeParam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(timeParam, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownParameterValue(UnknownParameterValue unknownParameterValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unknownParameterValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unknownParameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unknownParameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unknownParameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unknownParameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unknownParameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unknownParameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unknownParameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unknownParameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(unknownParameterValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeParam(DateTimeParam dateTimeParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateTimeParam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateTimeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateTimeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateTimeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateTimeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateTimeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateTimeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateTimeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateTimeParam, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(dateTimeParam, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationOptionParam(RelationOptionParam relationOptionParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationOptionParam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationOptionParam, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(relationOptionParam, diagnostics, context);
		return result;
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

} //InputfieldsValidator

/**
 */
package qualitypatternmodel.parameters.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import qualitypatternmodel.graphstructure.util.GraphstructureValidator;
import qualitypatternmodel.parameters.AxisOption;
import qualitypatternmodel.parameters.ComparisonOption;
import qualitypatternmodel.parameters.Date;
import qualitypatternmodel.parameters.DateTime;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.PropertyOption;
import qualitypatternmodel.parameters.Text;
import qualitypatternmodel.parameters.TextList;
import qualitypatternmodel.parameters.TextLiteral;
import qualitypatternmodel.parameters.Time;
import qualitypatternmodel.parameters.UnknownParameterValue;
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
			case ParametersPackage.COMPARISON_OPTION:
				return validateComparisonOption((ComparisonOption)value, diagnostics, context);
			case ParametersPackage.PROPERTY_OPTION:
				return validatePropertyOption((PropertyOption)value, diagnostics, context);
			case ParametersPackage.PARAMETER_LIST:
				return validateParameterList((ParameterList)value, diagnostics, context);
			case ParametersPackage.BOOLEAN:
				return validateBoolean((qualitypatternmodel.parameters.Boolean)value, diagnostics, context);
			case ParametersPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case ParametersPackage.TEXT_LIST:
				return validateTextList((TextList)value, diagnostics, context);
			case ParametersPackage.TEXT_LITERAL:
				return validateTextLiteral((TextLiteral)value, diagnostics, context);
			case ParametersPackage.NUMBER:
				return validateNumber((qualitypatternmodel.parameters.Number)value, diagnostics, context);
			case ParametersPackage.PARAMETER_VALUE:
				return validateParameterValue((ParameterValue)value, diagnostics, context);
			case ParametersPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			case ParametersPackage.TIME:
				return validateTime((Time)value, diagnostics, context);
			case ParametersPackage.UNKNOWN_PARAMETER_VALUE:
				return validateUnknownParameterValue((UnknownParameterValue)value, diagnostics, context);
			case ParametersPackage.DATE_TIME:
				return validateDateTime((DateTime)value, diagnostics, context);
			case ParametersPackage.AXIS_OPTION:
				return validateAxisOption((AxisOption)value, diagnostics, context);
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
	public boolean validateComparisonOption(ComparisonOption comparisonOption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(comparisonOption, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(comparisonOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(comparisonOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(comparisonOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(comparisonOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(comparisonOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(comparisonOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(comparisonOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(comparisonOption, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(comparisonOption, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyOption(PropertyOption propertyOption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(propertyOption, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(propertyOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propertyOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propertyOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(propertyOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propertyOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propertyOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(propertyOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propertyOption, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(propertyOption, diagnostics, context);
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
	public boolean validateBoolean(qualitypatternmodel.parameters.Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boolean_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(boolean_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(boolean_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(boolean_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(boolean_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(boolean_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(boolean_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(boolean_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(boolean_, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(boolean_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(text, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(text, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextList(TextList textList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textList, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textList, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(textList, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextLiteral(TextLiteral textLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textLiteral, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(textLiteral, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber(qualitypatternmodel.parameters.Number number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(number, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(number, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(number, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(number, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(number, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(number, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(number, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(number, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(number, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(number, diagnostics, context);
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
	public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(date, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(date, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(date, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(date, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(date, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(date, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(date, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(date, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(date, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(date, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(time, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(time, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(time, diagnostics, context);
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
	public boolean validateDateTime(DateTime dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateTime, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(dateTime, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxisOption(AxisOption axisOption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(axisOption, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(axisOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(axisOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(axisOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(axisOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(axisOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(axisOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(axisOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(axisOption, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(axisOption, diagnostics, context);
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

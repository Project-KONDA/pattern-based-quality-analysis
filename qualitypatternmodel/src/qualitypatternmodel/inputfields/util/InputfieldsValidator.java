/**
 */
package qualitypatternmodel.inputfields.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import qualitypatternmodel.graphstructure.util.GraphstructureValidator;
import qualitypatternmodel.inputfields.AxisOption;
import qualitypatternmodel.inputfields.CompOption;
import qualitypatternmodel.inputfields.Date;
import qualitypatternmodel.inputfields.DateTime;
import qualitypatternmodel.inputfields.Parameter;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.PropertyOption;
import qualitypatternmodel.inputfields.Text;
import qualitypatternmodel.inputfields.TextList;
import qualitypatternmodel.inputfields.TextLiteral;
import qualitypatternmodel.inputfields.Time;
import qualitypatternmodel.inputfields.UnknownInputValue;
import qualitypatternmodel.inputfields.ParameterList;
import qualitypatternmodel.inputfields.InputValue;
import qualitypatternmodel.patternstructure.util.PatternstructureValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.inputfields.InputfieldsPackage
 * @generated
 */
public class InputfieldsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InputfieldsValidator INSTANCE = new InputfieldsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "qualitypatternmodel.inputfields";

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
	public InputfieldsValidator() {
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
	  return InputfieldsPackage.eINSTANCE;
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
			case InputfieldsPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case InputfieldsPackage.COMP_OPTION:
				return validateCompOption((CompOption)value, diagnostics, context);
			case InputfieldsPackage.PROPERTY_OPTION:
				return validatePropertyOption((PropertyOption)value, diagnostics, context);
			case InputfieldsPackage.PARAMETER_LIST:
				return validateParameterList((ParameterList)value, diagnostics, context);
			case InputfieldsPackage.BOOLEAN:
				return validateBoolean((qualitypatternmodel.inputfields.Boolean)value, diagnostics, context);
			case InputfieldsPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case InputfieldsPackage.TEXT_LIST:
				return validateTextList((TextList)value, diagnostics, context);
			case InputfieldsPackage.TEXT_LITERAL:
				return validateTextLiteral((TextLiteral)value, diagnostics, context);
			case InputfieldsPackage.NUMBER:
				return validateNumber((qualitypatternmodel.inputfields.Number)value, diagnostics, context);
			case InputfieldsPackage.INPUT_VALUE:
				return validateInputValue((InputValue)value, diagnostics, context);
			case InputfieldsPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			case InputfieldsPackage.TIME:
				return validateTime((Time)value, diagnostics, context);
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE:
				return validateUnknownInputValue((UnknownInputValue)value, diagnostics, context);
			case InputfieldsPackage.DATE_TIME:
				return validateDateTime((DateTime)value, diagnostics, context);
			case InputfieldsPackage.AXIS_OPTION:
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
	public boolean validateCompOption(CompOption compOption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compOption, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compOption, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(compOption, diagnostics, context);
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
	public boolean validateBoolean(qualitypatternmodel.inputfields.Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateNumber(qualitypatternmodel.inputfields.Number number, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateInputValue(InputValue inputValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inputValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(inputValue, diagnostics, context);
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
	public boolean validateUnknownInputValue(UnknownInputValue unknownInputValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unknownInputValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unknownInputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unknownInputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unknownInputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unknownInputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unknownInputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unknownInputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unknownInputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unknownInputValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_validate(unknownInputValue, diagnostics, context);
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

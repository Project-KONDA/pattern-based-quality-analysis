/**
 */
package qualitypatternmodel.inputfields.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import qualitypatternmodel.graphstructure.util.GraphstructureValidator;
import qualitypatternmodel.inputfields.CompOption;
import qualitypatternmodel.inputfields.Date;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.PropertyOption;
import qualitypatternmodel.inputfields.Text;
import qualitypatternmodel.inputfields.TextList;
import qualitypatternmodel.inputfields.TextLiteral;
import qualitypatternmodel.inputfields.Time;
import qualitypatternmodel.inputfields.VariableList;
import qualitypatternmodel.inputfields.XSType;
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Input'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INPUT__VALIDATE = 1;

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
			case InputfieldsPackage.INPUT:
				return validateInput((Input)value, diagnostics, context);
			case InputfieldsPackage.COMP_OPTION:
				return validateCompOption((CompOption)value, diagnostics, context);
			case InputfieldsPackage.PROPERTY_OPTION:
				return validatePropertyOption((PropertyOption)value, diagnostics, context);
			case InputfieldsPackage.VARIABLE_LIST:
				return validateVariableList((VariableList)value, diagnostics, context);
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
			case InputfieldsPackage.XS_TYPE:
				return validateXSType((XSType)value, diagnostics, context);
			case InputfieldsPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			case InputfieldsPackage.TIME:
				return validateTime((Time)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInput(Input input, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(input, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(input, diagnostics, context);
		if (result || diagnostics != null) result &= validateInput_validate(input, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInput_validate(Input input, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return input.validate(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateInput_validate(compOption, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateInput_validate(propertyOption, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= patternstructureValidator.validatePatternElement_validate(variableList, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateInput_validate(boolean_, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateInput_validate(text, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateInput_validate(textList, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateInput_validate(textLiteral, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateInput_validate(number, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXSType(XSType xsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(xsType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(xsType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(xsType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(xsType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(xsType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(xsType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(xsType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(xsType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(xsType, diagnostics, context);
		if (result || diagnostics != null) result &= validateInput_validate(xsType, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateInput_validate(date, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateInput_validate(time, diagnostics, context);
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

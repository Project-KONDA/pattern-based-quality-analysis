/**
 */
package qualitypatternmodel.inputfields.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.inputfields.CompOption;
import qualitypatternmodel.inputfields.Date;
import qualitypatternmodel.inputfields.DateTime;
import qualitypatternmodel.inputfields.InputfieldsFactory;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.PropertyOption;
import qualitypatternmodel.inputfields.TextList;
import qualitypatternmodel.inputfields.TextLiteral;
import qualitypatternmodel.inputfields.Time;
import qualitypatternmodel.inputfields.UnknownInputValue;
import qualitypatternmodel.inputfields.VariableList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputfieldsFactoryImpl extends EFactoryImpl implements InputfieldsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InputfieldsFactory init() {
		try {
			InputfieldsFactory theInputfieldsFactory = (InputfieldsFactory)EPackage.Registry.INSTANCE.getEFactory(InputfieldsPackage.eNS_URI);
			if (theInputfieldsFactory != null) {
				return theInputfieldsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InputfieldsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputfieldsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InputfieldsPackage.COMP_OPTION: return createCompOption();
			case InputfieldsPackage.PROPERTY_OPTION: return createPropertyOption();
			case InputfieldsPackage.VARIABLE_LIST: return createVariableList();
			case InputfieldsPackage.BOOLEAN: return createBoolean();
			case InputfieldsPackage.TEXT_LIST: return createTextList();
			case InputfieldsPackage.TEXT_LITERAL: return createTextLiteral();
			case InputfieldsPackage.NUMBER: return createNumber();
			case InputfieldsPackage.DATE: return createDate();
			case InputfieldsPackage.TIME: return createTime();
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE: return createUnknownInputValue();
			case InputfieldsPackage.DATE_TIME: return createDateTime();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompOption createCompOption() {
		CompOptionImpl compOption = new CompOptionImpl();
		return compOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyOption createPropertyOption() {
		PropertyOptionImpl propertyOption = new PropertyOptionImpl();
		return propertyOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableList createVariableList() {
		VariableListImpl variableList = new VariableListImpl();
		return variableList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public qualitypatternmodel.inputfields.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextList createTextList() {
		TextListImpl textList = new TextListImpl();
		return textList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteral createTextLiteral() {
		TextLiteralImpl textLiteral = new TextLiteralImpl();
		return textLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public qualitypatternmodel.inputfields.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownInputValue createUnknownInputValue() {
		UnknownInputValueImpl unknownInputValue = new UnknownInputValueImpl();
		return unknownInputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputfieldsPackage getInputfieldsPackage() {
		return (InputfieldsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InputfieldsPackage getPackage() {
		return InputfieldsPackage.eINSTANCE;
	}

} //InputfieldsFactoryImpl

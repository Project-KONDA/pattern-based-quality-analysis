/**
 */
package qualitypatternmodel.parameters.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.parameters.AxisOption;
import qualitypatternmodel.parameters.ComparisonOption;
import qualitypatternmodel.parameters.Date;
import qualitypatternmodel.parameters.DateTime;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.PropertyOption;
import qualitypatternmodel.parameters.TextList;
import qualitypatternmodel.parameters.TextLiteral;
import qualitypatternmodel.parameters.Time;
import qualitypatternmodel.parameters.UnknownParameterValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParametersFactoryImpl extends EFactoryImpl implements ParametersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParametersFactory init() {
		try {
			ParametersFactory theParametersFactory = (ParametersFactory)EPackage.Registry.INSTANCE.getEFactory(ParametersPackage.eNS_URI);
			if (theParametersFactory != null) {
				return theParametersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ParametersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersFactoryImpl() {
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
			case ParametersPackage.COMPARISON_OPTION: return createComparisonOption();
			case ParametersPackage.PROPERTY_OPTION: return createPropertyOption();
			case ParametersPackage.PARAMETER_LIST: return createParameterList();
			case ParametersPackage.BOOLEAN: return createBoolean();
			case ParametersPackage.TEXT_LIST: return createTextList();
			case ParametersPackage.TEXT_LITERAL: return createTextLiteral();
			case ParametersPackage.NUMBER: return createNumber();
			case ParametersPackage.DATE: return createDate();
			case ParametersPackage.TIME: return createTime();
			case ParametersPackage.UNKNOWN_PARAMETER_VALUE: return createUnknownParameterValue();
			case ParametersPackage.DATE_TIME: return createDateTime();
			case ParametersPackage.AXIS_OPTION: return createAxisOption();
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
	public ComparisonOption createComparisonOption() {
		ComparisonOptionImpl comparisonOption = new ComparisonOptionImpl();
		return comparisonOption;
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
	public ParameterList createParameterList() {
		ParameterListImpl parameterList = new ParameterListImpl();
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public qualitypatternmodel.parameters.Boolean createBoolean() {
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
	public qualitypatternmodel.parameters.Number createNumber() {
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
	public UnknownParameterValue createUnknownParameterValue() {
		UnknownParameterValueImpl unknownParameterValue = new UnknownParameterValueImpl();
		return unknownParameterValue;
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
	public AxisOption createAxisOption() {
		AxisOptionImpl axisOption = new AxisOptionImpl();
		return axisOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParametersPackage getParametersPackage() {
		return (ParametersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ParametersPackage getPackage() {
		return ParametersPackage.eINSTANCE;
	}

} //InputfieldsFactoryImpl

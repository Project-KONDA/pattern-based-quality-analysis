/**
 */
package qualitypatternmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.QualitypatternmodelFactory;
import qualitypatternmodel.QualitypatternmodelPackage;
import qualitypatternmodel.TextList;
import qualitypatternmodel.TextLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualitypatternmodelFactoryImpl extends EFactoryImpl implements QualitypatternmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualitypatternmodelFactory init() {
		try {
			QualitypatternmodelFactory theQualitypatternmodelFactory = (QualitypatternmodelFactory)EPackage.Registry.INSTANCE.getEFactory(QualitypatternmodelPackage.eNS_URI);
			if (theQualitypatternmodelFactory != null) {
				return theQualitypatternmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QualitypatternmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitypatternmodelFactoryImpl() {
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
			case QualitypatternmodelPackage.NUMBER: return createNumber();
			case QualitypatternmodelPackage.BOOLEAN: return createBoolean();
			case QualitypatternmodelPackage.TEXT_LITERAL: return createTextLiteral();
			case QualitypatternmodelPackage.TEXT_LIST: return createTextList();
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
	public qualitypatternmodel.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public qualitypatternmodel.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
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
	public QualitypatternmodelPackage getQualitypatternmodelPackage() {
		return (QualitypatternmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QualitypatternmodelPackage getPackage() {
		return QualitypatternmodelPackage.eINSTANCE;
	}

} //QualitypatternmodelFactoryImpl

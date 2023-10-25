/**
 */
package qualitypatternmodel.javaoperators.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.javaoperators.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaoperatorsFactoryImpl extends EFactoryImpl implements JavaoperatorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaoperatorsFactory init() {
		try {
			JavaoperatorsFactory theJavaoperatorsFactory = (JavaoperatorsFactory)EPackage.Registry.INSTANCE.getEFactory(JavaoperatorsPackage.eNS_URI);
			if (theJavaoperatorsFactory != null) {
				return theJavaoperatorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JavaoperatorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaoperatorsFactoryImpl() {
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
			case JavaoperatorsPackage.VALIDATE_LINK_OPERATOR: return createValidateLinkOperator();
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
	public ValidateLinkOperator createValidateLinkOperator() {
		ValidateLinkOperatorImpl validateLinkOperator = new ValidateLinkOperatorImpl();
		return validateLinkOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaoperatorsPackage getJavaoperatorsPackage() {
		return (JavaoperatorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JavaoperatorsPackage getPackage() {
		return JavaoperatorsPackage.eINSTANCE;
	}

} //JavaoperatorsFactoryImpl

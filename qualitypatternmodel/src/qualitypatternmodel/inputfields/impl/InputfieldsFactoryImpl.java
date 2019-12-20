/**
 */
package qualitypatternmodel.inputfields.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.inputfields.InputfieldsFactory;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.Option;
import qualitypatternmodel.inputfields.Text;

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
			case InputfieldsPackage.NUMBER: return createNumber();
			case InputfieldsPackage.BOOLEAN: return createBoolean();
			case InputfieldsPackage.OPTION: return createOption();
			case InputfieldsPackage.TEXT: return createText();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public qualitypatternmodel.inputfields.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public qualitypatternmodel.inputfields.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> Option<T> createOption() {
		OptionImpl<T> option = new OptionImpl<T>();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.javaqueryoutput.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaqueryoutputFactoryImpl extends EFactoryImpl implements JavaqueryoutputFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaqueryoutputFactory init() {
		try {
			JavaqueryoutputFactory theJavaqueryoutputFactory = (JavaqueryoutputFactory)EPackage.Registry.INSTANCE.getEFactory(JavaqueryoutputPackage.eNS_URI);
			if (theJavaqueryoutputFactory != null) {
				return theJavaqueryoutputFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JavaqueryoutputFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaqueryoutputFactoryImpl() {
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
			case JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE: return createInterimResultStructure();
			case JavaqueryoutputPackage.RECORD_INTERIM: return createRecordInterim();
			case JavaqueryoutputPackage.BOOLEAN_VALUE_INTERIM: return createBooleanValueInterim();
			case JavaqueryoutputPackage.CONTAINER_INTERIM: return createContainerInterim();
			case JavaqueryoutputPackage.VALUE_LIST_INTERIM: return createValueListInterim();
			case JavaqueryoutputPackage.NUMBER_VALUE_INTERIM: return createNumberValueInterim();
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
	public InterimResultStructure createInterimResultStructure() {
		InterimResultStructureImpl interimResultStructure = new InterimResultStructureImpl();
		return interimResultStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordInterim createRecordInterim() {
		RecordInterimImpl recordInterim = new RecordInterimImpl();
		return recordInterim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanValueInterim createBooleanValueInterim() {
		BooleanValueInterimImpl booleanValueInterim = new BooleanValueInterimImpl();
		return booleanValueInterim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerInterim createContainerInterim() {
		ContainerInterimImpl containerInterim = new ContainerInterimImpl();
		return containerInterim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueListInterim createValueListInterim() {
		ValueListInterimImpl valueListInterim = new ValueListInterimImpl();
		return valueListInterim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberValueInterim createNumberValueInterim() {
		NumberValueInterimImpl numberValueInterim = new NumberValueInterimImpl();
		return numberValueInterim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaqueryoutputPackage getJavaqueryoutputPackage() {
		return (JavaqueryoutputPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JavaqueryoutputPackage getPackage() {
		return JavaqueryoutputPackage.eINSTANCE;
	}

} //JavaqueryoutputFactoryImpl

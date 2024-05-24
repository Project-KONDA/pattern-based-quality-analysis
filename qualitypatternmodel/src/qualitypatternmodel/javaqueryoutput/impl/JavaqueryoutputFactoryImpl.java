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
			case JavaqueryoutputPackage.VALUE_INTERIM: return createValueInterim();
			case JavaqueryoutputPackage.VARIABLE_CONTAINER_INTERIM: return createVariableContainerInterim();
			case JavaqueryoutputPackage.FIXED_CONTAINER_INTERIM: return createFixedContainerInterim();
			case JavaqueryoutputPackage.CONTAINER_RESULT: return createContainerResult();
			case JavaqueryoutputPackage.VALUE_RESULT: return createValueResult();
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER: return createInterimResultContainer();
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
	public ValueInterim createValueInterim() {
		ValueInterimImpl valueInterim = new ValueInterimImpl();
		return valueInterim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableContainerInterim createVariableContainerInterim() {
		VariableContainerInterimImpl variableContainerInterim = new VariableContainerInterimImpl();
		return variableContainerInterim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedContainerInterim createFixedContainerInterim() {
		FixedContainerInterimImpl fixedContainerInterim = new FixedContainerInterimImpl();
		return fixedContainerInterim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerResult createContainerResult() {
		ContainerResultImpl containerResult = new ContainerResultImpl();
		return containerResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueResult createValueResult() {
		ValueResultImpl valueResult = new ValueResultImpl();
		return valueResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterimResultContainer createInterimResultContainer() {
		InterimResultContainerImpl interimResultContainer = new InterimResultContainerImpl();
		return interimResultContainer;
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

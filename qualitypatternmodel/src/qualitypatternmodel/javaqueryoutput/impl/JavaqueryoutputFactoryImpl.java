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
			case JavaqueryoutputPackage.RECORD_INTERIM_RESULT: return createRecordInterimResult();
			case JavaqueryoutputPackage.BOOLEAN_INTERIM_RESULT_PARAM: return createBooleanInterimResultParam();
			case JavaqueryoutputPackage.CONTAINER_INTERIM_RESULT_PART: return createContainerInterimResultPart();
			case JavaqueryoutputPackage.VALUE_LIST_INTERIM_RESULT_PART: return createValueListInterimResultPart();
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
	public RecordInterimResult createRecordInterimResult() {
		RecordInterimResultImpl recordInterimResult = new RecordInterimResultImpl();
		return recordInterimResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanInterimResultParam createBooleanInterimResultParam() {
		BooleanInterimResultParamImpl booleanInterimResultParam = new BooleanInterimResultParamImpl();
		return booleanInterimResultParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerInterimResultPart createContainerInterimResultPart() {
		ContainerInterimResultPartImpl containerInterimResultPart = new ContainerInterimResultPartImpl();
		return containerInterimResultPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueListInterimResultPart createValueListInterimResultPart() {
		ValueListInterimResultPartImpl valueListInterimResultPart = new ValueListInterimResultPartImpl();
		return valueListInterimResultPart;
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

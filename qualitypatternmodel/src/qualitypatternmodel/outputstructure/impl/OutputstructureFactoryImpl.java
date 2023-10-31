/**
 */
package qualitypatternmodel.outputstructure.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.outputstructure.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputstructureFactoryImpl extends EFactoryImpl implements OutputstructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OutputstructureFactory init() {
		try {
			OutputstructureFactory theOutputstructureFactory = (OutputstructureFactory)EPackage.Registry.INSTANCE.getEFactory(OutputstructurePackage.eNS_URI);
			if (theOutputstructureFactory != null) {
				return theOutputstructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OutputstructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputstructureFactoryImpl() {
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
			case OutputstructurePackage.INTERIM_RESULTS_STRUCTURE: return createInterimResultsStructure();
			case OutputstructurePackage.RECORD_INTERIM_RESULT: return createRecordInterimResult();
			case OutputstructurePackage.BOOLEAN_INTERIM_RESULT_PARAM: return createBooleanInterimResultParam();
			case OutputstructurePackage.CONTAINER_INTERIM_RESULT_PART: return createContainerInterimResultPart();
			case OutputstructurePackage.VALUE_LIST_INTERIM_RESULT_PART: return createValueListInterimResultPart();
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
	public InterimResultsStructure createInterimResultsStructure() {
		InterimResultsStructureImpl interimResultsStructure = new InterimResultsStructureImpl();
		return interimResultsStructure;
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
	public OutputstructurePackage getOutputstructurePackage() {
		return (OutputstructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OutputstructurePackage getPackage() {
		return OutputstructurePackage.eINSTANCE;
	}

} //OutputstructureFactoryImpl

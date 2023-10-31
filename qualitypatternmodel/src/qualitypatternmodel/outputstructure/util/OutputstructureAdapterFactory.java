/**
 */
package qualitypatternmodel.outputstructure.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.outputstructure.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.outputstructure.OutputstructurePackage
 * @generated
 */
public class OutputstructureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OutputstructurePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputstructureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OutputstructurePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputstructureSwitch<Adapter> modelSwitch =
		new OutputstructureSwitch<Adapter>() {
			@Override
			public Adapter caseInterimResultsStructure(InterimResultsStructure object) {
				return createInterimResultsStructureAdapter();
			}
			@Override
			public Adapter caseRecordInterimResult(RecordInterimResult object) {
				return createRecordInterimResultAdapter();
			}
			@Override
			public Adapter caseInterimResultPart(InterimResultPart object) {
				return createInterimResultPartAdapter();
			}
			@Override
			public Adapter caseInterimResultParam(InterimResultParam object) {
				return createInterimResultParamAdapter();
			}
			@Override
			public Adapter caseBooleanInterimResultParam(BooleanInterimResultParam object) {
				return createBooleanInterimResultParamAdapter();
			}
			@Override
			public Adapter caseContainerInterimResultPart(ContainerInterimResultPart object) {
				return createContainerInterimResultPartAdapter();
			}
			@Override
			public Adapter caseValueListInterimResultPart(ValueListInterimResultPart object) {
				return createValueListInterimResultPartAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.outputstructure.InterimResultsStructure <em>Interim Results Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.outputstructure.InterimResultsStructure
	 * @generated
	 */
	public Adapter createInterimResultsStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.outputstructure.RecordInterimResult <em>Record Interim Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.outputstructure.RecordInterimResult
	 * @generated
	 */
	public Adapter createRecordInterimResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.outputstructure.InterimResultPart <em>Interim Result Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.outputstructure.InterimResultPart
	 * @generated
	 */
	public Adapter createInterimResultPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.outputstructure.InterimResultParam <em>Interim Result Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.outputstructure.InterimResultParam
	 * @generated
	 */
	public Adapter createInterimResultParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.outputstructure.BooleanInterimResultParam <em>Boolean Interim Result Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.outputstructure.BooleanInterimResultParam
	 * @generated
	 */
	public Adapter createBooleanInterimResultParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.outputstructure.ContainerInterimResultPart <em>Container Interim Result Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.outputstructure.ContainerInterimResultPart
	 * @generated
	 */
	public Adapter createContainerInterimResultPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.outputstructure.ValueListInterimResultPart <em>Value List Interim Result Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.outputstructure.ValueListInterimResultPart
	 * @generated
	 */
	public Adapter createValueListInterimResultPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OutputstructureAdapterFactory

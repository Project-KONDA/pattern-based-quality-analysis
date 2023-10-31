/**
 */
package qualitypatternmodel.outputstructure.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import qualitypatternmodel.outputstructure.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.outputstructure.OutputstructurePackage
 * @generated
 */
public class OutputstructureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OutputstructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputstructureSwitch() {
		if (modelPackage == null) {
			modelPackage = OutputstructurePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OutputstructurePackage.INTERIM_RESULTS_STRUCTURE: {
				InterimResultsStructure interimResultsStructure = (InterimResultsStructure)theEObject;
				T result = caseInterimResultsStructure(interimResultsStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputstructurePackage.RECORD_INTERIM_RESULT: {
				RecordInterimResult recordInterimResult = (RecordInterimResult)theEObject;
				T result = caseRecordInterimResult(recordInterimResult);
				if (result == null) result = caseInterimResultPart(recordInterimResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputstructurePackage.INTERIM_RESULT_PART: {
				InterimResultPart interimResultPart = (InterimResultPart)theEObject;
				T result = caseInterimResultPart(interimResultPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputstructurePackage.INTERIM_RESULT_PARAM: {
				InterimResultParam interimResultParam = (InterimResultParam)theEObject;
				T result = caseInterimResultParam(interimResultParam);
				if (result == null) result = caseInterimResultPart(interimResultParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputstructurePackage.BOOLEAN_INTERIM_RESULT_PARAM: {
				BooleanInterimResultParam booleanInterimResultParam = (BooleanInterimResultParam)theEObject;
				T result = caseBooleanInterimResultParam(booleanInterimResultParam);
				if (result == null) result = caseInterimResultParam(booleanInterimResultParam);
				if (result == null) result = caseInterimResultPart(booleanInterimResultParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputstructurePackage.CONTAINER_INTERIM_RESULT_PART: {
				ContainerInterimResultPart containerInterimResultPart = (ContainerInterimResultPart)theEObject;
				T result = caseContainerInterimResultPart(containerInterimResultPart);
				if (result == null) result = caseInterimResultParam(containerInterimResultPart);
				if (result == null) result = caseInterimResultPart(containerInterimResultPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputstructurePackage.VALUE_LIST_INTERIM_RESULT_PART: {
				ValueListInterimResultPart valueListInterimResultPart = (ValueListInterimResultPart)theEObject;
				T result = caseValueListInterimResultPart(valueListInterimResultPart);
				if (result == null) result = caseInterimResultParam(valueListInterimResultPart);
				if (result == null) result = caseInterimResultPart(valueListInterimResultPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interim Results Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interim Results Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterimResultsStructure(InterimResultsStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Interim Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Interim Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordInterimResult(RecordInterimResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interim Result Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interim Result Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterimResultPart(InterimResultPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interim Result Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interim Result Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterimResultParam(InterimResultParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Interim Result Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Interim Result Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanInterimResultParam(BooleanInterimResultParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Interim Result Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Interim Result Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerInterimResultPart(ContainerInterimResultPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value List Interim Result Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value List Interim Result Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueListInterimResultPart(ValueListInterimResultPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OutputstructureSwitch

/**
 */
package qualitypatternmodel.javaqueryoutput.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import qualitypatternmodel.javaqueryoutput.ContainerInterim;
import qualitypatternmodel.javaqueryoutput.ContainerResult;
import qualitypatternmodel.javaqueryoutput.FixedContainerInterim;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultContainer;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.InterimResultStructure;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.ValueInterim;
import qualitypatternmodel.javaqueryoutput.ValueResult;
import qualitypatternmodel.javaqueryoutput.VariableContainerInterim;

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
 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage
 * @generated
 */
public class JavaqueryoutputSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaqueryoutputPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaqueryoutputSwitch() {
		if (modelPackage == null) {
			modelPackage = JavaqueryoutputPackage.eINSTANCE;
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
			case JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE: {
				InterimResultStructure interimResultStructure = (InterimResultStructure)theEObject;
				T result = caseInterimResultStructure(interimResultStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryoutputPackage.INTERIM_RESULT_PART: {
				InterimResultPart interimResultPart = (InterimResultPart)theEObject;
				T result = caseInterimResultPart(interimResultPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryoutputPackage.CONTAINER_INTERIM: {
				ContainerInterim containerInterim = (ContainerInterim)theEObject;
				T result = caseContainerInterim(containerInterim);
				if (result == null) result = caseInterimResultPart(containerInterim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryoutputPackage.VALUE_INTERIM: {
				ValueInterim valueInterim = (ValueInterim)theEObject;
				T result = caseValueInterim(valueInterim);
				if (result == null) result = caseInterimResultPart(valueInterim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryoutputPackage.VARIABLE_CONTAINER_INTERIM: {
				VariableContainerInterim variableContainerInterim = (VariableContainerInterim)theEObject;
				T result = caseVariableContainerInterim(variableContainerInterim);
				if (result == null) result = caseContainerInterim(variableContainerInterim);
				if (result == null) result = caseInterimResultPart(variableContainerInterim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryoutputPackage.FIXED_CONTAINER_INTERIM: {
				FixedContainerInterim fixedContainerInterim = (FixedContainerInterim)theEObject;
				T result = caseFixedContainerInterim(fixedContainerInterim);
				if (result == null) result = caseContainerInterim(fixedContainerInterim);
				if (result == null) result = caseInterimResultPart(fixedContainerInterim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryoutputPackage.INTERIM_RESULT: {
				InterimResult interimResult = (InterimResult)theEObject;
				T result = caseInterimResult(interimResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryoutputPackage.CONTAINER_RESULT: {
				ContainerResult containerResult = (ContainerResult)theEObject;
				T result = caseContainerResult(containerResult);
				if (result == null) result = caseInterimResult(containerResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryoutputPackage.VALUE_RESULT: {
				ValueResult valueResult = (ValueResult)theEObject;
				T result = caseValueResult(valueResult);
				if (result == null) result = caseInterimResult(valueResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER: {
				InterimResultContainer interimResultContainer = (InterimResultContainer)theEObject;
				T result = caseInterimResultContainer(interimResultContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interim Result Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interim Result Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterimResultStructure(InterimResultStructure object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Container Interim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Interim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerInterim(ContainerInterim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Interim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Interim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueInterim(ValueInterim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Container Interim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Container Interim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableContainerInterim(VariableContainerInterim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Container Interim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Container Interim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedContainerInterim(FixedContainerInterim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interim Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interim Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterimResult(InterimResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerResult(ContainerResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueResult(ValueResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interim Result Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interim Result Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterimResultContainer(InterimResultContainer object) {
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

} //JavaqueryoutputSwitch

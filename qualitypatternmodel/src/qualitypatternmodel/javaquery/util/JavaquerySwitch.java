/**
 */
package qualitypatternmodel.javaquery.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import qualitypatternmodel.javaquery.*;

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
 * @see qualitypatternmodel.javaquery.JavaqueryPackage
 * @generated
 */
public class JavaquerySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaqueryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaquerySwitch() {
		if (modelPackage == null) {
			modelPackage = JavaqueryPackage.eINSTANCE;
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
			case JavaqueryPackage.JAVA_FILTER: {
				JavaFilter javaFilter = (JavaFilter)theEObject;
				T result = caseJavaFilter(javaFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.BOOLEAN_FILTER_PART: {
				BooleanFilterPart booleanFilterPart = (BooleanFilterPart)theEObject;
				T result = caseBooleanFilterPart(booleanFilterPart);
				if (result == null) result = caseJavaFilterPart(booleanFilterPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.FORMULA_FILTER_PART: {
				FormulaFilterPart formulaFilterPart = (FormulaFilterPart)theEObject;
				T result = caseFormulaFilterPart(formulaFilterPart);
				if (result == null) result = caseBooleanFilterPart(formulaFilterPart);
				if (result == null) result = caseJavaFilterPart(formulaFilterPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.BOOLEAN_FILTER_ELEMENT: {
				BooleanFilterElement booleanFilterElement = (BooleanFilterElement)theEObject;
				T result = caseBooleanFilterElement(booleanFilterElement);
				if (result == null) result = caseBooleanFilterPart(booleanFilterElement);
				if (result == null) result = caseJavaFilterPart(booleanFilterElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART: {
				OneArgFunctionFilterPart oneArgFunctionFilterPart = (OneArgFunctionFilterPart)theEObject;
				T result = caseOneArgFunctionFilterPart(oneArgFunctionFilterPart);
				if (result == null) result = caseBooleanFilterPart(oneArgFunctionFilterPart);
				if (result == null) result = caseJavaFilterPart(oneArgFunctionFilterPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.LIST_FILTER_PART: {
				ListFilterPart listFilterPart = (ListFilterPart)theEObject;
				T result = caseListFilterPart(listFilterPart);
				if (result == null) result = caseBooleanFilterPart(listFilterPart);
				if (result == null) result = caseJavaFilterPart(listFilterPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART: {
				TwoArgFunctionFilterPart twoArgFunctionFilterPart = (TwoArgFunctionFilterPart)theEObject;
				T result = caseTwoArgFunctionFilterPart(twoArgFunctionFilterPart);
				if (result == null) result = caseBooleanFilterPart(twoArgFunctionFilterPart);
				if (result == null) result = caseJavaFilterPart(twoArgFunctionFilterPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.NOT_FILTER_PART: {
				NotFilterPart notFilterPart = (NotFilterPart)theEObject;
				T result = caseNotFilterPart(notFilterPart);
				if (result == null) result = caseBooleanFilterPart(notFilterPart);
				if (result == null) result = caseJavaFilterPart(notFilterPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.COUNT_FILTER_PART: {
				CountFilterPart countFilterPart = (CountFilterPart)theEObject;
				T result = caseCountFilterPart(countFilterPart);
				if (result == null) result = caseBooleanFilterPart(countFilterPart);
				if (result == null) result = caseJavaFilterPart(countFilterPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.NUMBER_FILTER_PART: {
				NumberFilterPart numberFilterPart = (NumberFilterPart)theEObject;
				T result = caseNumberFilterPart(numberFilterPart);
				if (result == null) result = caseJavaFilterPart(numberFilterPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.COUNT_FILTER_ELEMENT: {
				CountFilterElement countFilterElement = (CountFilterElement)theEObject;
				T result = caseCountFilterElement(countFilterElement);
				if (result == null) result = caseNumberFilterPart(countFilterElement);
				if (result == null) result = caseJavaFilterPart(countFilterElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.NUMBER_FILTER_ELEMENT: {
				NumberFilterElement numberFilterElement = (NumberFilterElement)theEObject;
				T result = caseNumberFilterElement(numberFilterElement);
				if (result == null) result = caseNumberFilterPart(numberFilterElement);
				if (result == null) result = caseJavaFilterPart(numberFilterElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.JAVA_FILTER_PART: {
				JavaFilterPart javaFilterPart = (JavaFilterPart)theEObject;
				T result = caseJavaFilterPart(javaFilterPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.NUMBER_VALUE_FILTER_ELEMENT: {
				NumberValueFilterElement numberValueFilterElement = (NumberValueFilterElement)theEObject;
				T result = caseNumberValueFilterElement(numberValueFilterElement);
				if (result == null) result = caseNumberFilterPart(numberValueFilterElement);
				if (result == null) result = caseJavaFilterPart(numberValueFilterElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.QUANTIFIER_FILTER_PART: {
				QuantifierFilterPart quantifierFilterPart = (QuantifierFilterPart)theEObject;
				T result = caseQuantifierFilterPart(quantifierFilterPart);
				if (result == null) result = caseBooleanFilterPart(quantifierFilterPart);
				if (result == null) result = caseJavaFilterPart(quantifierFilterPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaFilter(JavaFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Filter Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaFilterPart(JavaFilterPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Value Filter Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Value Filter Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberValueFilterElement(NumberValueFilterElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantifier Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantifier Filter Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifierFilterPart(QuantifierFilterPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula Filter Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormulaFilterPart(FormulaFilterPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Filter Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Filter Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanFilterElement(BooleanFilterElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Filter Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanFilterPart(BooleanFilterPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Arg Function Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Arg Function Filter Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneArgFunctionFilterPart(OneArgFunctionFilterPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Filter Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListFilterPart(ListFilterPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Two Arg Function Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Two Arg Function Filter Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwoArgFunctionFilterPart(TwoArgFunctionFilterPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Filter Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotFilterPart(NotFilterPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Filter Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountFilterPart(CountFilterPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Filter Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberFilterPart(NumberFilterPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Filter Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Filter Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountFilterElement(CountFilterElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Filter Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Filter Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberFilterElement(NumberFilterElement object) {
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

} //JavaquerySwitch

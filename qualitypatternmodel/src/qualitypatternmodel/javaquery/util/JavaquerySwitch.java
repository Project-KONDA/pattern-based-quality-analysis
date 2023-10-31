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
			case JavaqueryPackage.JAVA_FILTER_PART: {
				JavaFilterPart javaFilterPart = (JavaFilterPart)theEObject;
				T result = caseJavaFilterPart(javaFilterPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.FORMULA_FILTER_PART: {
				FormulaFilterPart formulaFilterPart = (FormulaFilterPart)theEObject;
				T result = caseFormulaFilterPart(formulaFilterPart);
				if (result == null) result = caseJavaFilterPart(formulaFilterPart);
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
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART: {
				OneArgFunctionFilterPart oneArgFunctionFilterPart = (OneArgFunctionFilterPart)theEObject;
				T result = caseOneArgFunctionFilterPart(oneArgFunctionFilterPart);
				if (result == null) result = caseJavaFilterPart(oneArgFunctionFilterPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.LIST_FILTER_PART: {
				ListFilterPart listFilterPart = (ListFilterPart)theEObject;
				T result = caseListFilterPart(listFilterPart);
				if (result == null) result = caseJavaFilterPart(listFilterPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART: {
				TwoArgFunctionFilterPart twoArgFunctionFilterPart = (TwoArgFunctionFilterPart)theEObject;
				T result = caseTwoArgFunctionFilterPart(twoArgFunctionFilterPart);
				if (result == null) result = caseJavaFilterPart(twoArgFunctionFilterPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.COMBINATOR: {
				Combinator combinator = (Combinator)theEObject;
				T result = caseCombinator(combinator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.EVERY_COMBINATOR: {
				EveryCombinator everyCombinator = (EveryCombinator)theEObject;
				T result = caseEveryCombinator(everyCombinator);
				if (result == null) result = caseCombinator(everyCombinator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.ANY_COMBINATOR: {
				AnyCombinator anyCombinator = (AnyCombinator)theEObject;
				T result = caseAnyCombinator(anyCombinator);
				if (result == null) result = caseCombinator(anyCombinator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.NONE_COMBINATOR: {
				NoneCombinator noneCombinator = (NoneCombinator)theEObject;
				T result = caseNoneCombinator(noneCombinator);
				if (result == null) result = caseCombinator(noneCombinator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaqueryPackage.COUNT_COMBINATOR: {
				CountCombinator countCombinator = (CountCombinator)theEObject;
				T result = caseCountCombinator(countCombinator);
				if (result == null) result = caseCombinator(countCombinator);
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
	 * Returns the result of interpreting the object as an instance of '<em>Combinator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combinator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinator(Combinator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Every Combinator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Every Combinator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveryCombinator(EveryCombinator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Combinator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Combinator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyCombinator(AnyCombinator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>None Combinator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>None Combinator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoneCombinator(NoneCombinator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Combinator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Combinator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountCombinator(CountCombinator object) {
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

/**
 */
package qualitypatternmodel.javaoperators.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import qualitypatternmodel.javaoperators.*;

import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Operator;

import qualitypatternmodel.patternstructure.PatternElement;

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
 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage
 * @generated
 */
public class JavaoperatorsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaoperatorsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaoperatorsSwitch() {
		if (modelPackage == null) {
			modelPackage = JavaoperatorsPackage.eINSTANCE;
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
			case JavaoperatorsPackage.JAVA_OPERATOR: {
				JavaOperator javaOperator = (JavaOperator)theEObject;
				T result = caseJavaOperator(javaOperator);
				if (result == null) result = caseBooleanOperator(javaOperator);
				if (result == null) result = caseOperator(javaOperator);
				if (result == null) result = caseComparable(javaOperator);
				if (result == null) result = casePatternElement(javaOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR: {
				OneArgJavaOperator oneArgJavaOperator = (OneArgJavaOperator)theEObject;
				T result = caseOneArgJavaOperator(oneArgJavaOperator);
				if (result == null) result = caseJavaOperator(oneArgJavaOperator);
				if (result == null) result = caseBooleanOperator(oneArgJavaOperator);
				if (result == null) result = caseOperator(oneArgJavaOperator);
				if (result == null) result = caseComparable(oneArgJavaOperator);
				if (result == null) result = casePatternElement(oneArgJavaOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR: {
				TwoArgJavaOperator twoArgJavaOperator = (TwoArgJavaOperator)theEObject;
				T result = caseTwoArgJavaOperator(twoArgJavaOperator);
				if (result == null) result = caseJavaOperator(twoArgJavaOperator);
				if (result == null) result = caseBooleanOperator(twoArgJavaOperator);
				if (result == null) result = caseOperator(twoArgJavaOperator);
				if (result == null) result = caseComparable(twoArgJavaOperator);
				if (result == null) result = casePatternElement(twoArgJavaOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaoperatorsPackage.VALIDATE_LINK_OPERATOR: {
				ValidateLinkOperator validateLinkOperator = (ValidateLinkOperator)theEObject;
				T result = caseValidateLinkOperator(validateLinkOperator);
				if (result == null) result = caseOneArgJavaOperator(validateLinkOperator);
				if (result == null) result = caseJavaOperator(validateLinkOperator);
				if (result == null) result = caseBooleanOperator(validateLinkOperator);
				if (result == null) result = caseOperator(validateLinkOperator);
				if (result == null) result = caseComparable(validateLinkOperator);
				if (result == null) result = casePatternElement(validateLinkOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaOperator(JavaOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Arg Java Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Arg Java Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneArgJavaOperator(OneArgJavaOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Two Arg Java Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Two Arg Java Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwoArgJavaOperator(TwoArgJavaOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validate Link Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validate Link Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidateLinkOperator(ValidateLinkOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternElement(PatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparable(qualitypatternmodel.graphstructure.Comparable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOperator(BooleanOperator object) {
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

} //JavaoperatorsSwitch

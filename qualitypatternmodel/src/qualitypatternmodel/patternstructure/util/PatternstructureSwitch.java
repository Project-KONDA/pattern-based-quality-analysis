/**
 */
package qualitypatternmodel.patternstructure.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import qualitypatternmodel.patternstructure.*;

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
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage
 * @generated
 */
public class PatternstructureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PatternstructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternstructureSwitch() {
		if (modelPackage == null) {
			modelPackage = PatternstructurePackage.eINSTANCE;
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
			case PatternstructurePackage.RELATION_MAPPING: {
				RelationMapping relationMapping = (RelationMapping)theEObject;
				T result = caseRelationMapping(relationMapping);
				if (result == null) result = caseMapping(relationMapping);
				if (result == null) result = casePatternElement(relationMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.QUANTIFIED_CONDITION: {
				QuantifiedCondition quantifiedCondition = (QuantifiedCondition)theEObject;
				T result = caseQuantifiedCondition(quantifiedCondition);
				if (result == null) result = caseCondition(quantifiedCondition);
				if (result == null) result = caseMorphismContainer(quantifiedCondition);
				if (result == null) result = casePatternElement(quantifiedCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = casePatternElement(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.MORPHISM: {
				Morphism morphism = (Morphism)theEObject;
				T result = caseMorphism(morphism);
				if (result == null) result = casePatternElement(morphism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.ELEMENT_MAPPING: {
				ElementMapping elementMapping = (ElementMapping)theEObject;
				T result = caseElementMapping(elementMapping);
				if (result == null) result = caseMapping(elementMapping);
				if (result == null) result = casePatternElement(elementMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = casePatternElement(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.FORMULA: {
				Formula formula = (Formula)theEObject;
				T result = caseFormula(formula);
				if (result == null) result = caseCondition(formula);
				if (result == null) result = casePatternElement(formula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.TRUE_ELEMENT: {
				TrueElement trueElement = (TrueElement)theEObject;
				T result = caseTrueElement(trueElement);
				if (result == null) result = caseCondition(trueElement);
				if (result == null) result = casePatternElement(trueElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.COMPLETE_PATTERN: {
				CompletePattern completePattern = (CompletePattern)theEObject;
				T result = caseCompletePattern(completePattern);
				if (result == null) result = casePattern(completePattern);
				if (result == null) result = casePatternElement(completePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.PATTERN_ELEMENT: {
				PatternElement patternElement = (PatternElement)theEObject;
				T result = casePatternElement(patternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.NOT_CONDITION: {
				NotCondition notCondition = (NotCondition)theEObject;
				T result = caseNotCondition(notCondition);
				if (result == null) result = caseCondition(notCondition);
				if (result == null) result = casePatternElement(notCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.COUNT_CONDITION: {
				CountCondition countCondition = (CountCondition)theEObject;
				T result = caseCountCondition(countCondition);
				if (result == null) result = caseCondition(countCondition);
				if (result == null) result = casePatternElement(countCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.COUNT_CONDITION_ARGUMENT: {
				CountConditionArgument countConditionArgument = (CountConditionArgument)theEObject;
				T result = caseCountConditionArgument(countConditionArgument);
				if (result == null) result = casePatternElement(countConditionArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.MORPHISM_CONTAINER: {
				MorphismContainer morphismContainer = (MorphismContainer)theEObject;
				T result = caseMorphismContainer(morphismContainer);
				if (result == null) result = casePatternElement(morphismContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.COUNT_PATTERN: {
				CountPattern countPattern = (CountPattern)theEObject;
				T result = caseCountPattern(countPattern);
				if (result == null) result = casePattern(countPattern);
				if (result == null) result = caseMorphismContainer(countPattern);
				if (result == null) result = caseCountConditionArgument(countPattern);
				if (result == null) result = casePatternElement(countPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T result = casePattern(pattern);
				if (result == null) result = casePatternElement(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternstructurePackage.NUMBER_ELEMENT: {
				NumberElement numberElement = (NumberElement)theEObject;
				T result = caseNumberElement(numberElement);
				if (result == null) result = caseCountConditionArgument(numberElement);
				if (result == null) result = casePatternElement(numberElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationMapping(RelationMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantified Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantified Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifiedCondition(QuantifiedCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Morphism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Morphism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMorphism(Morphism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementMapping(ElementMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormula(Formula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrueElement(TrueElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complete Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompletePattern(CompletePattern object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Not Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotCondition(NotCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountCondition(CountCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Condition Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Condition Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountConditionArgument(CountConditionArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Morphism Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Morphism Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMorphismContainer(MorphismContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountPattern(CountPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberElement(NumberElement object) {
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

} //PatternstructureSwitch

/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.adaptionneo4j.NeoInterfaceNode;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CountPattern</b></em>'.
 * This model object is used to model a sup pattern, where only the number of findings is of further interest.
 * In the contained Graph object the type of counted elements are specified.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.CountPattern#getCountCondition <em>Count Condition</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountPattern()
 * @model
 * @generated
 */
public interface CountPattern extends Pattern, MorphismContainer, CountConditionArgument {
	/**
	 * Returns the value of the '<em><b>Count Condition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountCondition#getCountPattern <em>Count Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Condition</em>' container reference.
	 * @see #setCountCondition(CountCondition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountPattern_CountCondition()
	 * @see qualitypatternmodel.patternstructure.CountCondition#getCountPattern
	 * @model opposite="countPattern" transient="false"
	 * @generated
	 */
	CountCondition getCountCondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountPattern#getCountCondition <em>Count Condition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Condition</em>' container reference.
	 * @see #getCountCondition()
	 * @generated
	 */
	void setCountCondition(CountCondition value);

	String generateXQuery() throws InvalidityException;

	void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException;

	void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

	public void addNeoCountElementNode(NeoInterfaceNode countElements);
} // CountPattern

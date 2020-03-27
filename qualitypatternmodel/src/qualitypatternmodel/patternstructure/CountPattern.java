/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subpattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.CountPattern#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountPattern()
 * @model
 * @generated
 */
public interface CountPattern extends Pattern {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Count#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' container reference.
	 * @see #setCount(Count)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountPattern_Count()
	 * @see qualitypatternmodel.patternstructure.Count#getPattern
	 * @model opposite="pattern" transient="false"
	 * @generated
	 */
	Count getCount();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountPattern#getCount <em>Count</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' container reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(Count value);

	String generateQuery(Location location) throws InvalidityException;

	void isValidLocal(boolean isDefinedPattern) throws InvalidityException;

	void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

} // Subpattern

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
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountPattern()
 * @model
 * @generated
 */
public interface CountPattern extends Pattern, MorphismContainer, CountConditionArgument {
	String generateQuery(Location location) throws InvalidityException;

	void isValidLocal(boolean isDefinedPattern) throws InvalidityException;

	void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

} // Subpattern

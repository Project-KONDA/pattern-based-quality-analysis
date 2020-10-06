/**
 */
package qualitypatternmodel.graphstructure;

import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptable</b></em>'.
 * A pattern component that can be adapted to a specific database technology.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getAdaptable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Adaptable extends PatternElement {
	/**
	 * <!-- begin-user-doc -->
	 * Removes any associations to <code>Parameters</code> and removes these <code>Parameters</code> from 
	 * the pattern's <code>ParameterList</code> if they are not referenced elsewhere.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeParametersFromParameterList();

	/**
	 * <!-- begin-user-doc -->
	 * Creates associated <code>Parameters</code> if non-existent and adds them to the
	 * pattern's <code>ParameterList</code>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createParameters();

} // Adaptable

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
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeParametersFromParameterList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createParameters();

} // Adaptable

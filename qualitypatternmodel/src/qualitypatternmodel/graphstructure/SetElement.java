/**
 */
package qualitypatternmodel.graphstructure;

import qualitypatternmodel.patternstructure.InvalidityException;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.SetElement#getNestingDepth <em>Nesting Depth</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSetElement()
 * @model
 * @generated
 */
public interface SetElement extends Element {
	/**
	 * Returns the value of the '<em><b>Nesting Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Depth</em>' attribute.
	 * @see #setNestingDepth(int)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSetElement_NestingDepth()
	 * @model
	 * @generated
	 */
	int getNestingDepth();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.SetElement#getNestingDepth <em>Nesting Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Depth</em>' attribute.
	 * @see #getNestingDepth()
	 * @generated
	 */
	void setNestingDepth(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String translateElementExistencePredicates(Location location, int depth) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String translatePathFromPrevious(int depth);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String translatePredicates(Location location, int depth) throws InvalidityException;
	

} // SetElement

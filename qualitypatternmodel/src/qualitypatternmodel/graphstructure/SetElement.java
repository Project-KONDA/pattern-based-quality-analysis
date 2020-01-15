/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link qualitypatternmodel.graphstructure.SetElement#getNext <em>Next</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SetElement#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSetElement()
 * @model
 * @generated
 */
public interface SetElement extends Element {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.SetElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSetElement_Next()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetElement> getNext();

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Element)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSetElement_Previous()
	 * @model required="true"
	 * @generated
	 */
	Element getPrevious();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.SetElement#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Element value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String translateElementExistencePredicates(Location location) throws InvalidityException;
	

} // SetElement

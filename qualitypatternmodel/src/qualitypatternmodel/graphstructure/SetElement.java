/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.functions.Count;
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
 *   <li>{@link qualitypatternmodel.graphstructure.SetElement#getPreviousSet <em>Previous Set</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SetElement#getPreviousSingle <em>Previous Single</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SetElement#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSetElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasPrevious'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot hasPrevious='self.previousSet-&gt;notEmpty() or self.previousSingle-&gt;notEmpty()'"
 * @generated
 */
public interface SetElement extends Element {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.SetElement}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.SetElement#getPreviousSet <em>Previous Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSetElement_Next()
	 * @see qualitypatternmodel.graphstructure.SetElement#getPreviousSet
	 * @model opposite="previousSet" containment="true"
	 * @generated
	 */
	EList<SetElement> getNext();

	/**
	 * Returns the value of the '<em><b>Previous Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.SetElement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Set</em>' container reference.
	 * @see #setPreviousSet(SetElement)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSetElement_PreviousSet()
	 * @see qualitypatternmodel.graphstructure.SetElement#getNext
	 * @model opposite="next" transient="false"
	 * @generated
	 */
	SetElement getPreviousSet();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.SetElement#getPreviousSet <em>Previous Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Set</em>' container reference.
	 * @see #getPreviousSet()
	 * @generated
	 */
	void setPreviousSet(SetElement value);

	/**
	 * Returns the value of the '<em><b>Previous Single</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.SingleElement#getNextSet <em>Next Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Single</em>' container reference.
	 * @see #setPreviousSingle(SingleElement)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSetElement_PreviousSingle()
	 * @see qualitypatternmodel.graphstructure.SingleElement#getNextSet
	 * @model opposite="nextSet" transient="false"
	 * @generated
	 */
	SingleElement getPreviousSingle();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.SetElement#getPreviousSingle <em>Previous Single</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Single</em>' container reference.
	 * @see #getPreviousSingle()
	 * @generated
	 */
	void setPreviousSingle(SingleElement value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.Count#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' reference.
	 * @see #setCount(Count)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSetElement_Count()
	 * @see qualitypatternmodel.functions.Count#getArgument
	 * @model opposite="argument"
	 * @generated
	 */
	Count getCount();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.SetElement#getCount <em>Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(Count value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of all elements on the path between <code>this</code> and the preceding <code>SingleElement</code>.
	 * @return the list of all elements on the path between <code>this</code> and the preceding <code>SingleElement</code>.
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="qualitypatternmodel.graphstructure.ListOfElements" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	ListOfElements getPathToPreviousSingleElement() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list containing the list of all elements on the path between <code>this</code> and the preceding <code>SingleElement</code>.
	 * @return the list containing the list of all elements on the path between <code>this</code> and the preceding <code>SingleElement</code>.
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="qualitypatternmodel.graphstructure.ListOfElements" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	EList<ListOfElements> getAllArgumentElementsSetOperation() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateWhereClause(Location location) throws InvalidityException;
	

} // SetElement

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
 *   <li>{@link qualitypatternmodel.graphstructure.SetElement#getNestingDepth <em>Nesting Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SetElement#getNext <em>Next</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SetElement#getPreviousSet <em>Previous Set</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SetElement#getPreviousSingle <em>Previous Single</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SetElement#isBeingTranslated <em>Being Translated</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSetElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasPrevious'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot hasPrevious='self.previousSet-&gt;notEmpty() or self.previousSingle-&gt;notEmpty()'"
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
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Being Translated</em>' attribute.
	 * @see #setBeingTranslated(boolean)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSetElement_BeingTranslated()
	 * @model
	 * @generated
	 */
	boolean isBeingTranslated();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.SetElement#isBeingTranslated <em>Being Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Being Translated</em>' attribute.
	 * @see #isBeingTranslated()
	 * @generated
	 */
	void setBeingTranslated(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper" depthRequired="true"
	 * @generated
	 */
	String translateElementExistencePredicates(Location location, int depth) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model depthRequired="true"
	 * @generated
	 */
	String translatePathFromPrevious(int depth);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper" depthRequired="true"
	 * @generated
	 */
	String translatePredicates(Location location, int depth) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="qualitypatternmodel.graphstructure.ListOfElements" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	ListOfElements getPathToPreviousSingleElement() throws InvalidityException;
	

} // SetElement

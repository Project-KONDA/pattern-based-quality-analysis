/**
 */
package QualityPatternModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.SetElement#getNext <em>Next</em>}</li>
 *   <li>{@link QualityPatternModel.SetElement#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getSetElement()
 * @model
 * @generated
 */
public interface SetElement extends Element {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link QualityPatternModel.SetElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see QualityPatternModel.QualityPatternModelPackage#getSetElement_Next()
	 * @model
	 * @generated
	 */
	EList<SetElement> getNext();

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Element)
	 * @see QualityPatternModel.QualityPatternModelPackage#getSetElement_Previous()
	 * @model required="true"
	 * @generated
	 */
	Element getPrevious();

	/**
	 * Sets the value of the '{@link QualityPatternModel.SetElement#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Element value);

} // SetElement

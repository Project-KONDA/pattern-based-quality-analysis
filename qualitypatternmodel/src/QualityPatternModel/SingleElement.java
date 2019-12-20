/**
 */
package QualityPatternModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.SingleElement#getMappingFrom <em>Mapping From</em>}</li>
 *   <li>{@link QualityPatternModel.SingleElement#getMappingTo <em>Mapping To</em>}</li>
 *   <li>{@link QualityPatternModel.SingleElement#getPrevious <em>Previous</em>}</li>
 *   <li>{@link QualityPatternModel.SingleElement#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getSingleElement()
 * @model
 * @generated
 */
public interface SingleElement extends Element {
	/**
	 * Returns the value of the '<em><b>Mapping From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QualityPatternModel.SingleElementMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping From</em>' reference.
	 * @see #setMappingFrom(SingleElementMapping)
	 * @see QualityPatternModel.QualityPatternModelPackage#getSingleElement_MappingFrom()
	 * @see QualityPatternModel.SingleElementMapping#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	SingleElementMapping getMappingFrom();

	/**
	 * Sets the value of the '{@link QualityPatternModel.SingleElement#getMappingFrom <em>Mapping From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping From</em>' reference.
	 * @see #getMappingFrom()
	 * @generated
	 */
	void setMappingFrom(SingleElementMapping value);

	/**
	 * Returns the value of the '<em><b>Mapping To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QualityPatternModel.SingleElementMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping To</em>' reference.
	 * @see #setMappingTo(SingleElementMapping)
	 * @see QualityPatternModel.QualityPatternModelPackage#getSingleElement_MappingTo()
	 * @see QualityPatternModel.SingleElementMapping#getTo
	 * @model opposite="to"
	 * @generated
	 */
	SingleElementMapping getMappingTo();

	/**
	 * Sets the value of the '{@link QualityPatternModel.SingleElement#getMappingTo <em>Mapping To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping To</em>' reference.
	 * @see #getMappingTo()
	 * @generated
	 */
	void setMappingTo(SingleElementMapping value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(SingleElement)
	 * @see QualityPatternModel.QualityPatternModelPackage#getSingleElement_Previous()
	 * @model
	 * @generated
	 */
	SingleElement getPrevious();

	/**
	 * Sets the value of the '{@link QualityPatternModel.SingleElement#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(SingleElement value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link QualityPatternModel.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see QualityPatternModel.QualityPatternModelPackage#getSingleElement_Next()
	 * @model
	 * @generated
	 */
	EList<Element> getNext();

} // SingleElement

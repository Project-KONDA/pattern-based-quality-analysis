/**
 */
package QualityPatternModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Element Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.SingleElementMapping#getFrom <em>From</em>}</li>
 *   <li>{@link QualityPatternModel.SingleElementMapping#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getSingleElementMapping()
 * @model
 * @generated
 */
public interface SingleElementMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QualityPatternModel.SingleElement#getMappingFrom <em>Mapping From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(SingleElement)
	 * @see QualityPatternModel.QualityPatternModelPackage#getSingleElementMapping_From()
	 * @see QualityPatternModel.SingleElement#getMappingFrom
	 * @model opposite="mappingFrom"
	 * @generated
	 */
	SingleElement getFrom();

	/**
	 * Sets the value of the '{@link QualityPatternModel.SingleElementMapping#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(SingleElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QualityPatternModel.SingleElement#getMappingTo <em>Mapping To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(SingleElement)
	 * @see QualityPatternModel.QualityPatternModelPackage#getSingleElementMapping_To()
	 * @see QualityPatternModel.SingleElement#getMappingTo
	 * @model opposite="mappingTo"
	 * @generated
	 */
	SingleElement getTo();

	/**
	 * Sets the value of the '{@link QualityPatternModel.SingleElementMapping#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(SingleElement value);

} // SingleElementMapping

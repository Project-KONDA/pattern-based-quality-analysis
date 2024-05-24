/**
 */
package qualitypatternmodel.javaquery;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.NotFilterPart#getSubfilter <em>Subfilter</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getNotFilterPart()
 * @model
 * @generated
 */
public interface NotFilterPart extends BooleanFilterPart {
	/**
	 * Returns the value of the '<em><b>Subfilter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfilter</em>' containment reference.
	 * @see #setSubfilter(BooleanFilterPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getNotFilterPart_Subfilter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanFilterPart getSubfilter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.NotFilterPart#getSubfilter <em>Subfilter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subfilter</em>' containment reference.
	 * @see #getSubfilter()
	 * @generated
	 */
	void setSubfilter(BooleanFilterPart value);

} // NotFilterPart

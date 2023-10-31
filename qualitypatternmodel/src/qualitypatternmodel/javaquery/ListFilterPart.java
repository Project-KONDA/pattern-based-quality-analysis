/**
 */
package qualitypatternmodel.javaquery;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.ListFilterPart#getCombinator <em>Combinator</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.ListFilterPart#getSubfilter <em>Subfilter</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.ListFilterPart#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getListFilterPart()
 * @model
 * @generated
 */
public interface ListFilterPart extends JavaFilterPart {
	/**
	 * Returns the value of the '<em><b>Combinator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combinator</em>' containment reference.
	 * @see #setCombinator(Combinator)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getListFilterPart_Combinator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Combinator getCombinator();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.ListFilterPart#getCombinator <em>Combinator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combinator</em>' containment reference.
	 * @see #getCombinator()
	 * @generated
	 */
	void setCombinator(Combinator value);

	/**
	 * Returns the value of the '<em><b>Subfilter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfilter</em>' containment reference.
	 * @see #setSubfilter(JavaFilterPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getListFilterPart_Subfilter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JavaFilterPart getSubfilter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.ListFilterPart#getSubfilter <em>Subfilter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subfilter</em>' containment reference.
	 * @see #getSubfilter()
	 * @generated
	 */
	void setSubfilter(JavaFilterPart value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference.
	 * @see #setArgument(qualitypatternmodel.javaqueryoutput.ContainerInterimResultPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getListFilterPart_Argument()
	 * @model required="true"
	 * @generated
	 */
	qualitypatternmodel.javaqueryoutput.ContainerInterimResultPart getArgument();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.ListFilterPart#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(qualitypatternmodel.javaqueryoutput.ContainerInterimResultPart value);

} // ListFilterPart

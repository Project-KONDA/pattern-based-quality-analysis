/**
 */
package qualitypatternmodel.javaquery;

import qualitypatternmodel.javaqueryoutput.ContainerInterimResultPart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count Filter Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.CountFilterElement#getSubfilter <em>Subfilter</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.CountFilterElement#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getCountFilterElement()
 * @model
 * @generated
 */
public interface CountFilterElement extends NumberFilterPart {
	/**
	 * Returns the value of the '<em><b>Subfilter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfilter</em>' containment reference.
	 * @see #setSubfilter(BooleanFilterPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getCountFilterElement_Subfilter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanFilterPart getSubfilter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.CountFilterElement#getSubfilter <em>Subfilter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subfilter</em>' containment reference.
	 * @see #getSubfilter()
	 * @generated
	 */
	void setSubfilter(BooleanFilterPart value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference.
	 * @see #setArgument(ContainerInterimResultPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getCountFilterElement_Argument()
	 * @model required="true"
	 * @generated
	 */
	ContainerInterimResultPart getArgument();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.CountFilterElement#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(ContainerInterimResultPart value);

} // CountFilterElement

/**
 */
package qualitypatternmodel.javaquery;

import qualitypatternmodel.javaqueryoutput.ValueInterim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Filter Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.NumberFilterElement#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getNumberFilterElement()
 * @model
 * @generated
 */
public interface NumberFilterElement extends NumberFilterPart {

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference.
	 * @see #setArgument(ValueInterim)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getNumberFilterElement_Argument()
	 * @model required="true"
	 * @generated
	 */
	ValueInterim getArgument();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.NumberFilterElement#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(ValueInterim value);
} // NumberFilterElement

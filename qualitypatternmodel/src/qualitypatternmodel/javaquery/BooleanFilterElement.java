/**
 */
package qualitypatternmodel.javaquery;

import qualitypatternmodel.javaqueryoutput.BooleanInterimResultParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Filter Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.BooleanFilterElement#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getBooleanFilterElement()
 * @model abstract="true"
 * @generated
 */
public interface BooleanFilterElement extends BooleanFilterPart {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference.
	 * @see #setArgument(BooleanInterimResultParam)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getBooleanFilterElement_Argument()
	 * @model required="true"
	 * @generated
	 */
	BooleanInterimResultParam getArgument();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.BooleanFilterElement#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(BooleanInterimResultParam value);

} // BooleanFilterElement

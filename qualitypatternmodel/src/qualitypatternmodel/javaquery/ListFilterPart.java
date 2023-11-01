/**
 */
package qualitypatternmodel.javaquery;

import qualitypatternmodel.javaqueryoutput.ContainerInterimResultPart;
import qualitypatternmodel.patternstructure.Quantifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.ListFilterPart#getSubfilter <em>Subfilter</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.ListFilterPart#getArgument <em>Argument</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.ListFilterPart#getQuantifier <em>Quantifier</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getListFilterPart()
 * @model
 * @generated
 */
public interface ListFilterPart extends BooleanFilterPart {
	/**
	 * Returns the value of the '<em><b>Subfilter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfilter</em>' containment reference.
	 * @see #setSubfilter(BooleanFilterPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getListFilterPart_Subfilter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanFilterPart getSubfilter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.ListFilterPart#getSubfilter <em>Subfilter</em>}' containment reference.
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
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getListFilterPart_Argument()
	 * @model required="true"
	 * @generated
	 */
	ContainerInterimResultPart getArgument();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.ListFilterPart#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(ContainerInterimResultPart value);

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.patternstructure.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see #setQuantifier(Quantifier)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getListFilterPart_Quantifier()
	 * @model
	 * @generated
	 */
	Quantifier getQuantifier();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.ListFilterPart#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(Quantifier value);

} // ListFilterPart

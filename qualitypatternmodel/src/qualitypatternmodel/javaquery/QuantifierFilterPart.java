/**
 */
package qualitypatternmodel.javaquery;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.javaqueryoutput.FixedContainerInterim;
import qualitypatternmodel.patternstructure.Quantifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantifier Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.QuantifierFilterPart#getSubfilter <em>Subfilter</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.QuantifierFilterPart#getArgument <em>Argument</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.QuantifierFilterPart#getQuantifier <em>Quantifier</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getQuantifierFilterPart()
 * @model
 * @generated
 */
public interface QuantifierFilterPart extends BooleanFilterPart {
	/**
	 * Returns the value of the '<em><b>Subfilter</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.javaquery.BooleanFilterPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfilter</em>' containment reference list.
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getQuantifierFilterPart_Subfilter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BooleanFilterPart> getSubfilter();

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference.
	 * @see #setArgument(FixedContainerInterim)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getQuantifierFilterPart_Argument()
	 * @model required="true"
	 * @generated
	 */
	FixedContainerInterim getArgument();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.QuantifierFilterPart#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(FixedContainerInterim value);

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.patternstructure.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see #setQuantifier(Quantifier)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getQuantifierFilterPart_Quantifier()
	 * @model
	 * @generated
	 */
	Quantifier getQuantifier();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.QuantifierFilterPart#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(Quantifier value);

} // QuantifierFilterPart

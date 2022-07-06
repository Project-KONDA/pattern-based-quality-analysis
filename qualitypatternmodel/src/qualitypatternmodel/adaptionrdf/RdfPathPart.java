/**
 */
package qualitypatternmodel.adaptionrdf;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rdf Path Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfPathPart#isInvert <em>Invert</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfPathPart#getQuantifier <em>Quantifier</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathPart()
 * @model abstract="true"
 * @generated
 */
public interface RdfPathPart extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Invert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invert</em>' attribute.
	 * @see #setInvert(boolean)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathPart_Invert()
	 * @model
	 * @generated
	 */
	boolean isInvert();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfPathPart#isInvert <em>Invert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invert</em>' attribute.
	 * @see #isInvert()
	 * @generated
	 */
	void setInvert(boolean value);

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionrdf.RdfQuantifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.adaptionrdf.RdfQuantifier
	 * @see #setQuantifier(RdfQuantifier)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathPart_Quantifier()
	 * @model
	 * @generated
	 */
	RdfQuantifier getQuantifier();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfPathPart#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.adaptionrdf.RdfQuantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(RdfQuantifier value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<RdfSinglePredicate> getRdfSinglePredicates();

} // RdfPathParam

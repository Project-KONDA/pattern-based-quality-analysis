/**
 */
package qualitypatternmodel.adaptionrdf;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.parameters.TextLiteralParam;

import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rdf Axis Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfAxisPair#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfAxisPair#getTextliteralparam <em>Textliteralparam</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfAxisPair()
 * @model
 * @generated
 */
public interface RdfAxisPair extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionrdf.RegexQuantifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.adaptionrdf.RegexQuantifier
	 * @see #setQuantifier(RegexQuantifier)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfAxisPair_Quantifier()
	 * @model
	 * @generated
	 */
	RegexQuantifier getQuantifier();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfAxisPair#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.adaptionrdf.RegexQuantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(RegexQuantifier value);

	/**
	 * Returns the value of the '<em><b>Textliteralparam</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.parameters.TextLiteralParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textliteralparam</em>' containment reference list.
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfAxisPair_Textliteralparam()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextLiteralParam> getTextliteralparam();

} // RdfAxisPair

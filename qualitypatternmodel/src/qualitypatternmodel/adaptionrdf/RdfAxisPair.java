/**
 */
package qualitypatternmodel.adaptionrdf;

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
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfAxisPair#getRdfpathparam <em>Rdfpathparam</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfAxisPair()
 * @model
 * @generated
 */
public interface RdfAxisPair extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionrdf.RdfQuantifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.adaptionrdf.RdfQuantifier
	 * @see #setQuantifier(RdfQuantifier)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfAxisPair_Quantifier()
	 * @model
	 * @generated
	 */
	RdfQuantifier getQuantifier();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfAxisPair#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.adaptionrdf.RdfQuantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(RdfQuantifier value);

	/**
	 * Returns the value of the '<em><b>Textliteralparam</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.TextLiteralParam#getRdfaxispair <em>Rdfaxispair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textliteralparam</em>' containment reference.
	 * @see #setTextliteralparam(TextLiteralParam)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfAxisPair_Textliteralparam()
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getRdfaxispair
	 * @model opposite="rdfaxispair" containment="true"
	 * @generated
	 */
	TextLiteralParam getTextliteralparam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfAxisPair#getTextliteralparam <em>Textliteralparam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textliteralparam</em>' containment reference.
	 * @see #getTextliteralparam()
	 * @generated
	 */
	void setTextliteralparam(TextLiteralParam value);

	/**
	 * Returns the value of the '<em><b>Rdfpathparam</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfaxispair <em>Rdfaxispair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdfpathparam</em>' container reference.
	 * @see #setRdfpathparam(RdfPathParam)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfAxisPair_Rdfpathparam()
	 * @see qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfaxispair
	 * @model opposite="rdfaxispair" transient="false"
	 * @generated
	 */
	RdfPathParam getRdfpathparam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfAxisPair#getRdfpathparam <em>Rdfpathparam</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdfpathparam</em>' container reference.
	 * @see #getRdfpathparam()
	 * @generated
	 */
	void setRdfpathparam(RdfPathParam value);

} // RdfAxisPair

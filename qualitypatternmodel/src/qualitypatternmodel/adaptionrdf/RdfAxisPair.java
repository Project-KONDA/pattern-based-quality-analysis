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
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfAxisPair#getTextLiteralParam <em>Text Literal Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfAxisPair#getRdfPathParam <em>Rdf Path Param</em>}</li>
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
	 * Returns the value of the '<em><b>Text Literal Param</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.TextLiteralParam#getRdfAxisPair <em>Rdf Axis Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Literal Param</em>' containment reference.
	 * @see #setTextLiteralParam(TextLiteralParam)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfAxisPair_TextLiteralParam()
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getRdfAxisPair
	 * @model opposite="rdfAxisPair" containment="true"
	 * @generated
	 */
	TextLiteralParam getTextLiteralParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfAxisPair#getTextLiteralParam <em>Text Literal Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Literal Param</em>' containment reference.
	 * @see #getTextLiteralParam()
	 * @generated
	 */
	void setTextLiteralParam(TextLiteralParam value);

	/**
	 * Returns the value of the '<em><b>Rdf Path Param</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfAxisPair <em>Rdf Axis Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Path Param</em>' container reference.
	 * @see #setRdfPathParam(RdfPathParam)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfAxisPair_RdfPathParam()
	 * @see qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfAxisPair
	 * @model opposite="rdfAxisPair" transient="false"
	 * @generated
	 */
	RdfPathParam getRdfPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfAxisPair#getRdfPathParam <em>Rdf Path Param</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Path Param</em>' container reference.
	 * @see #getRdfPathParam()
	 * @generated
	 */
	void setRdfPathParam(RdfPathParam value);

} // RdfAxisPair

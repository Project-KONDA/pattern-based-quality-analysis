/**
 */
package qualitypatternmodel.adaptionrdf;

import qualitypatternmodel.parameters.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iri Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.IriParam#getRdfAxisPair <em>Rdf Axis Pair</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.IriParam#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.IriParam#getUri <em>Uri</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.IriParam#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getIriParam()
 * @model
 * @generated
 */
public interface IriParam extends Parameter {

	/**
	 * Returns the value of the '<em><b>Rdf Axis Pair</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfAxisPair#getIriParam <em>Iri Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Axis Pair</em>' container reference.
	 * @see #setRdfAxisPair(RdfAxisPair)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getIriParam_RdfAxisPair()
	 * @see qualitypatternmodel.adaptionrdf.RdfAxisPair#getIriParam
	 * @model opposite="iriParam" required="true" transient="false"
	 * @generated
	 */
	RdfAxisPair getRdfAxisPair();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.IriParam#getRdfAxisPair <em>Rdf Axis Pair</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Axis Pair</em>' container reference.
	 * @see #getRdfAxisPair()
	 * @generated
	 */
	void setRdfAxisPair(RdfAxisPair value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getIriParam_Prefix()
	 * @model
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.IriParam#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getIriParam_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.IriParam#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' attribute.
	 * @see #setSuffix(String)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getIriParam_Suffix()
	 * @model
	 * @generated
	 */
	String getSuffix();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.IriParam#getSuffix <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' attribute.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(String value);
} // IriParam

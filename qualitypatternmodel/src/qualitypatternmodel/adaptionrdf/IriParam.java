/**
 */
package qualitypatternmodel.adaptionrdf;

import qualitypatternmodel.parameters.ParameterValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iri Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.IriParam#getRdfSinglePredicate <em>Rdf Single Predicate</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.IriParam#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.IriParam#getUri <em>Uri</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.IriParam#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.IriParam#getIriListParam <em>Iri List Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getIriParam()
 * @model
 * @generated
 */
public interface IriParam extends ParameterValue {

	/**
	 * Returns the value of the '<em><b>Rdf Single Predicate</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfSinglePredicate#getIriParam <em>Iri Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Single Predicate</em>' container reference.
	 * @see #setRdfSinglePredicate(RdfSinglePredicate)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getIriParam_RdfSinglePredicate()
	 * @see qualitypatternmodel.adaptionrdf.RdfSinglePredicate#getIriParam
	 * @model opposite="iriParam" transient="false"
	 * @generated
	 */
	RdfSinglePredicate getRdfSinglePredicate();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.IriParam#getRdfSinglePredicate <em>Rdf Single Predicate</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Single Predicate</em>' container reference.
	 * @see #getRdfSinglePredicate()
	 * @generated
	 */
	void setRdfSinglePredicate(RdfSinglePredicate value);

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

	/**
	 * Returns the value of the '<em><b>Iri List Param</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.IriListParam#getIriParam <em>Iri Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iri List Param</em>' container reference.
	 * @see #setIriListParam(IriListParam)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getIriParam_IriListParam()
	 * @see qualitypatternmodel.adaptionrdf.IriListParam#getIriParam
	 * @model opposite="iriParam" transient="false"
	 * @generated
	 */
	IriListParam getIriListParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.IriParam#getIriListParam <em>Iri List Param</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iri List Param</em>' container reference.
	 * @see #getIriListParam()
	 * @generated
	 */
	void setIriListParam(IriListParam value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getStandardIri();
} // IriParam

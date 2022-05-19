/**
 */
package qualitypatternmodel.adaptionrdf;

import qualitypatternmodel.parameters.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rdf Path Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfaxispair <em>Rdfaxispair</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfreference <em>Rdfreference</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathParam()
 * @model
 * @generated
 */
public interface RdfPathParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>Rdfaxispair</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfAxisPair#getRdfpathparam <em>Rdfpathparam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdfaxispair</em>' containment reference.
	 * @see #setRdfaxispair(RdfAxisPair)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathParam_Rdfaxispair()
	 * @see qualitypatternmodel.adaptionrdf.RdfAxisPair#getRdfpathparam
	 * @model opposite="rdfpathparam" containment="true"
	 * @generated
	 */
	RdfAxisPair getRdfaxispair();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfaxispair <em>Rdfaxispair</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdfaxispair</em>' containment reference.
	 * @see #getRdfaxispair()
	 * @generated
	 */
	void setRdfaxispair(RdfAxisPair value);

	/**
	 * Returns the value of the '<em><b>Rdfreference</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfPredicate#getRdfpathparam <em>Rdfpathparam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdfreference</em>' container reference.
	 * @see #setRdfreference(RdfPredicate)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathParam_Rdfreference()
	 * @see qualitypatternmodel.adaptionrdf.RdfPredicate#getRdfpathparam
	 * @model opposite="rdfpathparam" transient="false"
	 * @generated
	 */
	RdfPredicate getRdfreference();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfreference <em>Rdfreference</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdfreference</em>' container reference.
	 * @see #getRdfreference()
	 * @generated
	 */
	void setRdfreference(RdfPredicate value);

} // RdfPathParam

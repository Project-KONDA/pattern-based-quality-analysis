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
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfAxisPair <em>Rdf Axis Pair</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfPredicate <em>Rdf Predicate</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathParam()
 * @model
 * @generated
 */
public interface RdfPathParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>Rdf Axis Pair</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfAxisPair#getRdfPathParam <em>Rdf Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Axis Pair</em>' containment reference.
	 * @see #setRdfAxisPair(RdfAxisPair)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathParam_RdfAxisPair()
	 * @see qualitypatternmodel.adaptionrdf.RdfAxisPair#getRdfPathParam
	 * @model opposite="rdfPathParam" containment="true"
	 * @generated
	 */
	RdfAxisPair getRdfAxisPair();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfAxisPair <em>Rdf Axis Pair</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Axis Pair</em>' containment reference.
	 * @see #getRdfAxisPair()
	 * @generated
	 */
	void setRdfAxisPair(RdfAxisPair value);

	/**
	 * Returns the value of the '<em><b>Rdf Predicate</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfPredicate#getRdfPathParam <em>Rdf Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Predicate</em>' container reference.
	 * @see #setRdfPredicate(RdfPredicate)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathParam_RdfPredicate()
	 * @see qualitypatternmodel.adaptionrdf.RdfPredicate#getRdfPathParam
	 * @model opposite="rdfPathParam" transient="false"
	 * @generated
	 */
	RdfPredicate getRdfPredicate();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfPredicate <em>Rdf Predicate</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Predicate</em>' container reference.
	 * @see #getRdfPredicate()
	 * @generated
	 */
	void setRdfPredicate(RdfPredicate value);

} // RdfPathParam

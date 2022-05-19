/**
 */
package qualitypatternmodel.adaptionrdf;

import qualitypatternmodel.graphstructure.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rdf Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfPredicate#getRdfPathParam <em>Rdf Path Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPredicate()
 * @model
 * @generated
 */
public interface RdfPredicate extends Relation {
	/**
	 * Returns the value of the '<em><b>Rdf Path Param</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfPredicate <em>Rdf Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Path Param</em>' containment reference.
	 * @see #setRdfPathParam(RdfPathParam)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPredicate_RdfPathParam()
	 * @see qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfPredicate
	 * @model opposite="rdfPredicate" containment="true"
	 * @generated
	 */
	RdfPathParam getRdfPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfPredicate#getRdfPathParam <em>Rdf Path Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Path Param</em>' containment reference.
	 * @see #getRdfPathParam()
	 * @generated
	 */
	void setRdfPathParam(RdfPathParam value);

} // RdfPredicate

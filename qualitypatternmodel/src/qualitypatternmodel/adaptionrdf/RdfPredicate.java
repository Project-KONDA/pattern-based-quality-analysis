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
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfPredicate#getRdfpathparam <em>Rdfpathparam</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPredicate()
 * @model
 * @generated
 */
public interface RdfPredicate extends Relation {
	/**
	 * Returns the value of the '<em><b>Rdfpathparam</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfreference <em>Rdfreference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdfpathparam</em>' containment reference.
	 * @see #setRdfpathparam(RdfPathParam)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPredicate_Rdfpathparam()
	 * @see qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfreference
	 * @model opposite="rdfreference" containment="true"
	 * @generated
	 */
	RdfPathParam getRdfpathparam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfPredicate#getRdfpathparam <em>Rdfpathparam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdfpathparam</em>' containment reference.
	 * @see #getRdfpathparam()
	 * @generated
	 */
	void setRdfpathparam(RdfPathParam value);

} // RdfPredicate

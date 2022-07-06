/**
 */
package qualitypatternmodel.adaptionrdf;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rdf Axis Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfSinglePredicate#getIriParam <em>Iri Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfSinglePredicate()
 * @model
 * @generated
 */
public interface RdfSinglePredicate extends RdfPathPart {
	/**
	 * Returns the value of the '<em><b>Iri Param</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.IriParam#getRdfSinglePredicate <em>Rdf Single Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iri Param</em>' containment reference.
	 * @see #setIriParam(IriParam)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfSinglePredicate_IriParam()
	 * @see qualitypatternmodel.adaptionrdf.IriParam#getRdfSinglePredicate
	 * @model opposite="rdfSinglePredicate" containment="true"
	 * @generated
	 */
	IriParam getIriParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfSinglePredicate#getIriParam <em>Iri Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iri Param</em>' containment reference.
	 * @see #getIriParam()
	 * @generated
	 */
	void setIriParam(IriParam value);

} // RdfAxisPair

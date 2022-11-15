/**
 */
package qualitypatternmodel.adaptionrdf;

import qualitypatternmodel.graphstructure.Adaptable;
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
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfPredicate <em>Rdf Predicate</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfPathPart <em>Rdf Path Part</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathParam()
 * @model
 * @generated
 */
public interface RdfPathParam extends Parameter, Adaptable {
	/**
	 * Returns the value of the '<em><b>Rdf Predicate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfPredicate#getRdfPathParam <em>Rdf Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Predicate</em>' reference.
	 * @see #setRdfPredicate(RdfPredicate)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathParam_RdfPredicate()
	 * @see qualitypatternmodel.adaptionrdf.RdfPredicate#getRdfPathParam
	 * @model opposite="rdfPathParam"
	 * @generated
	 */
	RdfPredicate getRdfPredicate();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfPredicate <em>Rdf Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Predicate</em>' reference.
	 * @see #getRdfPredicate()
	 * @generated
	 */
	void setRdfPredicate(RdfPredicate value);

	/**
	 * Returns the value of the '<em><b>Rdf Path Part</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfPathPart#getRdfPathParam <em>Rdf Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Path Part</em>' containment reference.
	 * @see #setRdfPathPart(RdfPathPart)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathParam_RdfPathPart()
	 * @see qualitypatternmodel.adaptionrdf.RdfPathPart#getRdfPathParam
	 * @model opposite="rdfPathParam" containment="true"
	 * @generated
	 */
	RdfPathPart getRdfPathPart();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfPathPart <em>Rdf Path Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Path Part</em>' containment reference.
	 * @see #getRdfPathPart()
	 * @generated
	 */
	void setRdfPathPart(RdfPathPart value);

} // RdfPathParam

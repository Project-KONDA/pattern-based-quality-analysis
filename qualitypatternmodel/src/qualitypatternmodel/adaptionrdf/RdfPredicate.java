/**
 */
package qualitypatternmodel.adaptionrdf;

import org.eclipse.emf.common.util.EList;

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
	 * Returns the value of the '<em><b>Rdfpathparam</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionrdf.RdfPathParam}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfreference <em>Rdfreference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdfpathparam</em>' containment reference list.
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPredicate_Rdfpathparam()
	 * @see qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfreference
	 * @model opposite="rdfreference" containment="true"
	 * @generated
	 */
	EList<RdfPathParam> getRdfpathparam();

} // RdfPredicate

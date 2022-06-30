/**
 */
package qualitypatternmodel.adaptionrdf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rdf Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfSequence#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfSequence()
 * @model
 * @generated
 */
public interface RdfSequence extends RdfPathParam {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionrdf.RdfPathParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfSequence_Items()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<RdfPathParam> getItems();

} // RdfSequence

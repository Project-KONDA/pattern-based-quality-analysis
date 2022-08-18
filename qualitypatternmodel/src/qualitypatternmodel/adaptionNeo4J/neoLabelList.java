/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>neo Label List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.neoLabelList#getNeoLabels <em>Neo Labels</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getneoLabelList()
 * @model
 * @generated
 */
public interface neoLabelList extends EObject {
	/**
	 * Returns the value of the '<em><b>Neo Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Labels</em>' reference.
	 * @see #setNeoLabels(NeoLabel)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getneoLabelList_NeoLabels()
	 * @model
	 * @generated
	 */
	NeoLabel getNeoLabels();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.neoLabelList#getNeoLabels <em>Neo Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Labels</em>' reference.
	 * @see #getNeoLabels()
	 * @generated
	 */
	void setNeoLabels(NeoLabel value);

} // neoLabelList

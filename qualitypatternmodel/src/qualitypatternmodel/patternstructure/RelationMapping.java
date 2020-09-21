/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.graphstructure.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Mapping</b></em>'.
 * A correspondence between two <code>Relationss</code> contained in different <code>Graphs</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.RelationMapping#getTarget <em>Target</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.RelationMapping#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getRelationMapping()
 * @model
 * @generated
 */
public interface RelationMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Relation#getIncomingMapping <em>Incoming Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Relation)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getRelationMapping_Target()
	 * @see qualitypatternmodel.graphstructure.Relation#getIncomingMapping
	 * @model opposite="incomingMapping" required="true"
	 * @generated
	 */
	Relation getTarget();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.RelationMapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Relation value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Relation#getOutgoingMappings <em>Outgoing Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Relation)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getRelationMapping_Source()
	 * @see qualitypatternmodel.graphstructure.Relation#getOutgoingMappings
	 * @model opposite="outgoingMappings" required="true"
	 * @generated
	 */
	Relation getSource();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.RelationMapping#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Relation value);

} // RelationMapping

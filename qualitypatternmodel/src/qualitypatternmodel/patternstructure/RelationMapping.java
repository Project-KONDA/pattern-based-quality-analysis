/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.graphstructure.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.RelationMapping#getTo <em>To</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.RelationMapping#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getRelationMapping()
 * @model
 * @generated
 */
public interface RelationMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Relation#getMappingFrom <em>Mapping From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Relation)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getRelationMapping_To()
	 * @see qualitypatternmodel.graphstructure.Relation#getMappingFrom
	 * @model opposite="mappingFrom" required="true"
	 * @generated
	 */
	Relation getTo();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.RelationMapping#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Relation value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Relation#getMappingTo <em>Mapping To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Relation)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getRelationMapping_From()
	 * @see qualitypatternmodel.graphstructure.Relation#getMappingTo
	 * @model opposite="mappingTo" required="true"
	 * @generated
	 */
	Relation getFrom();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.RelationMapping#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Relation value);

} // RelationMapping

/**
 */
package QualityPatternModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.Relation#getAxis <em>Axis</em>}</li>
 *   <li>{@link QualityPatternModel.Relation#getRelationOptions <em>Relation Options</em>}</li>
 *   <li>{@link QualityPatternModel.Relation#getMappingTo <em>Mapping To</em>}</li>
 *   <li>{@link QualityPatternModel.Relation#getMappingFrom <em>Mapping From</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Axis</b></em>' attribute.
	 * The literals are from the enumeration {@link QualityPatternModel.Axis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' attribute.
	 * @see QualityPatternModel.Axis
	 * @see #setAxis(Axis)
	 * @see QualityPatternModel.QualityPatternModelPackage#getRelation_Axis()
	 * @model
	 * @generated
	 */
	Axis getAxis();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Relation#getAxis <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' attribute.
	 * @see QualityPatternModel.Axis
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(Axis value);

	/**
	 * Returns the value of the '<em><b>Relation Options</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Options</em>' reference.
	 * @see #setRelationOptions(Option)
	 * @see QualityPatternModel.QualityPatternModelPackage#getRelation_RelationOptions()
	 * @model
	 * @generated
	 */
	Option<Axis> getRelationOptions();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Relation#getRelationOptions <em>Relation Options</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Options</em>' reference.
	 * @see #getRelationOptions()
	 * @generated
	 */
	void setRelationOptions(Option<Axis> value);

	/**
	 * Returns the value of the '<em><b>Mapping To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QualityPatternModel.RelationMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping To</em>' reference.
	 * @see #setMappingTo(RelationMapping)
	 * @see QualityPatternModel.QualityPatternModelPackage#getRelation_MappingTo()
	 * @see QualityPatternModel.RelationMapping#getTo
	 * @model opposite="to"
	 * @generated
	 */
	RelationMapping getMappingTo();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Relation#getMappingTo <em>Mapping To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping To</em>' reference.
	 * @see #getMappingTo()
	 * @generated
	 */
	void setMappingTo(RelationMapping value);

	/**
	 * Returns the value of the '<em><b>Mapping From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QualityPatternModel.RelationMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping From</em>' reference.
	 * @see #setMappingFrom(RelationMapping)
	 * @see QualityPatternModel.QualityPatternModelPackage#getRelation_MappingFrom()
	 * @see QualityPatternModel.RelationMapping#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	RelationMapping getMappingFrom();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Relation#getMappingFrom <em>Mapping From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping From</em>' reference.
	 * @see #getMappingFrom()
	 * @generated
	 */
	void setMappingFrom(RelationMapping value);

} // Relation

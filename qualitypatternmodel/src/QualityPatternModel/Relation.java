/**
 */
package QualityPatternModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link QualityPatternModel.Relation#getElementFrom <em>Element From</em>}</li>
 *   <li>{@link QualityPatternModel.Relation#getElementTo <em>Element To</em>}</li>
 *   <li>{@link QualityPatternModel.Relation#getRelationOptions <em>Relation Options</em>}</li>
 *   <li>{@link QualityPatternModel.Relation#getMappingTo <em>Mapping To</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
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
	 * Returns the value of the '<em><b>Element From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QualityPatternModel.SingleElement#getRelationFrom <em>Relation From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element From</em>' reference.
	 * @see #setElementFrom(SingleElement)
	 * @see QualityPatternModel.QualityPatternModelPackage#getRelation_ElementFrom()
	 * @see QualityPatternModel.SingleElement#getRelationFrom
	 * @model opposite="relationFrom"
	 * @generated
	 */
	SingleElement getElementFrom();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Relation#getElementFrom <em>Element From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element From</em>' reference.
	 * @see #getElementFrom()
	 * @generated
	 */
	void setElementFrom(SingleElement value);

	/**
	 * Returns the value of the '<em><b>Element To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QualityPatternModel.Element#getRelationTo <em>Relation To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element To</em>' reference.
	 * @see #setElementTo(Element)
	 * @see QualityPatternModel.QualityPatternModelPackage#getRelation_ElementTo()
	 * @see QualityPatternModel.Element#getRelationTo
	 * @model opposite="relationTo" required="true"
	 * @generated
	 */
	Element getElementTo();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Relation#getElementTo <em>Element To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element To</em>' reference.
	 * @see #getElementTo()
	 * @generated
	 */
	void setElementTo(Element value);

	/**
	 * Returns the value of the '<em><b>Relation Options</b></em>' reference list.
	 * The list contents are of type {@link QualityPatternModel.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Options</em>' reference list.
	 * @see QualityPatternModel.QualityPatternModelPackage#getRelation_RelationOptions()
	 * @model
	 * @generated
	 */
	EList<Option> getRelationOptions();

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

} // Relation

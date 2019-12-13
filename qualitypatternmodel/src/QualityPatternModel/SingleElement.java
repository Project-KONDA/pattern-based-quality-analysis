/**
 */
package QualityPatternModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.SingleElement#getRelationFrom <em>Relation From</em>}</li>
 *   <li>{@link QualityPatternModel.SingleElement#getMappingFrom <em>Mapping From</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getSingleElement()
 * @model
 * @generated
 */
public interface SingleElement extends Element {
	/**
	 * Returns the value of the '<em><b>Relation From</b></em>' reference list.
	 * The list contents are of type {@link QualityPatternModel.Relation}.
	 * It is bidirectional and its opposite is '{@link QualityPatternModel.Relation#getElementFrom <em>Element From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation From</em>' reference list.
	 * @see QualityPatternModel.QualityPatternModelPackage#getSingleElement_RelationFrom()
	 * @see QualityPatternModel.Relation#getElementFrom
	 * @model opposite="elementFrom"
	 * @generated
	 */
	EList<Relation> getRelationFrom();

	/**
	 * Returns the value of the '<em><b>Mapping From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QualityPatternModel.SingleElementMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping From</em>' reference.
	 * @see #setMappingFrom(SingleElementMapping)
	 * @see QualityPatternModel.QualityPatternModelPackage#getSingleElement_MappingFrom()
	 * @see QualityPatternModel.SingleElementMapping#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	SingleElementMapping getMappingFrom();

	/**
	 * Sets the value of the '{@link QualityPatternModel.SingleElement#getMappingFrom <em>Mapping From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping From</em>' reference.
	 * @see #getMappingFrom()
	 * @generated
	 */
	void setMappingFrom(SingleElementMapping value);

} // SingleElement

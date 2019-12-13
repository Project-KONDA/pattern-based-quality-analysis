/**
 */
package QualityPatternModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.Element#getElementConditions <em>Element Conditions</em>}</li>
 *   <li>{@link QualityPatternModel.Element#getRelationTo <em>Relation To</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Element Conditions</b></em>' reference list.
	 * The list contents are of type {@link QualityPatternModel.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Conditions</em>' reference list.
	 * @see QualityPatternModel.QualityPatternModelPackage#getElement_ElementConditions()
	 * @model
	 * @generated
	 */
	EList<BooleanOperator> getElementConditions();

	/**
	 * Returns the value of the '<em><b>Relation To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QualityPatternModel.Relation#getElementTo <em>Element To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation To</em>' reference.
	 * @see #setRelationTo(Relation)
	 * @see QualityPatternModel.QualityPatternModelPackage#getElement_RelationTo()
	 * @see QualityPatternModel.Relation#getElementTo
	 * @model opposite="elementTo"
	 * @generated
	 */
	Relation getRelationTo();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Element#getRelationTo <em>Relation To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation To</em>' reference.
	 * @see #getRelationTo()
	 * @generated
	 */
	void setRelationTo(Relation value);

} // Element

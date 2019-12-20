/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.functions.BooleanOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getId <em>Id</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getRelationFromPrevious <em>Relation From Previous</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#isIsTranslated <em>Is Translated</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Predicates</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.functions.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_Predicates()
	 * @model
	 * @generated
	 */
	EList<BooleanOperator> getPredicates();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Relation From Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation From Previous</em>' reference.
	 * @see #setRelationFromPrevious(Relation)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_RelationFromPrevious()
	 * @model
	 * @generated
	 */
	Relation getRelationFromPrevious();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Element#getRelationFromPrevious <em>Relation From Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation From Previous</em>' reference.
	 * @see #getRelationFromPrevious()
	 * @generated
	 */
	void setRelationFromPrevious(Relation value);

	/**
	 * Returns the value of the '<em><b>Is Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Translated</em>' attribute.
	 * @see #setIsTranslated(boolean)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_IsTranslated()
	 * @model
	 * @generated
	 */
	boolean isIsTranslated();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Element#isIsTranslated <em>Is Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Translated</em>' attribute.
	 * @see #isIsTranslated()
	 * @generated
	 */
	void setIsTranslated(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String generateXPredicates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String generateXPathExpression();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Element> getNextElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Element getPreviousElement();

} // Element

/**
 */
package QualityPatternModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.Graph#getReturn <em>Return</em>}</li>
 *   <li>{@link QualityPatternModel.Graph#getRoot <em>Root</em>}</li>
 *   <li>{@link QualityPatternModel.Graph#getVariablelist <em>Variablelist</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' reference list.
	 * The list contents are of type {@link QualityPatternModel.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' reference list.
	 * @see QualityPatternModel.QualityPatternModelPackage#getGraph_Return()
	 * @model required="true"
	 * @generated
	 */
	EList<Element> getReturn();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(Element)
	 * @see QualityPatternModel.QualityPatternModelPackage#getGraph_Root()
	 * @model required="true"
	 * @generated
	 */
	Element getRoot();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Graph#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Element value);

	/**
	 * Returns the value of the '<em><b>Variablelist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variablelist</em>' containment reference.
	 * @see #setVariablelist(VariableList)
	 * @see QualityPatternModel.QualityPatternModelPackage#getGraph_Variablelist()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VariableList getVariablelist();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Graph#getVariablelist <em>Variablelist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variablelist</em>' containment reference.
	 * @see #getVariablelist()
	 * @generated
	 */
	void setVariablelist(VariableList value);

} // Graph

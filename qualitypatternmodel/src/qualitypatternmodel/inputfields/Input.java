/**
 */
package qualitypatternmodel.inputfields;

import qualitypatternmodel.graphstructure.GraphElement;
import qualitypatternmodel.graphstructure.VariableList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.Input#getVariableList <em>Variable List</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.Input#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getInput()
 * @model abstract="true"
 * @generated
 */
public interface Input extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Variable List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.VariableList#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable List</em>' container reference.
	 * @see #setVariableList(VariableList)
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getInput_VariableList()
	 * @see qualitypatternmodel.graphstructure.VariableList#getVariables
	 * @model opposite="variables" required="true" transient="false"
	 * @generated
	 */
	VariableList getVariableList();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.inputfields.Input#getVariableList <em>Variable List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable List</em>' container reference.
	 * @see #getVariableList()
	 * @generated
	 */
	void setVariableList(VariableList value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getInput_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.inputfields.Input#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean inputIsValid();

} // Input

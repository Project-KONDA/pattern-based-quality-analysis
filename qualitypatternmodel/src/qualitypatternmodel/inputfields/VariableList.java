/**
 */
package qualitypatternmodel.inputfields;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.VariableList#getVariables <em>Variables</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.VariableList#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getVariableList()
 * @model
 * @generated
 */
public interface VariableList extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.inputfields.Input}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.inputfields.Input#getVariableList <em>Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getVariableList_Variables()
	 * @see qualitypatternmodel.inputfields.Input#getVariableList
	 * @model opposite="variableList" containment="true"
	 * @generated
	 */
	EList<Input> getVariables();

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Pattern#getVariableList <em>Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' container reference.
	 * @see #setPattern(Pattern)
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getVariableList_Pattern()
	 * @see qualitypatternmodel.patternstructure.Pattern#getVariableList
	 * @model opposite="variableList" required="true" transient="false"
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.inputfields.VariableList#getPattern <em>Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' container reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

} // VariableList

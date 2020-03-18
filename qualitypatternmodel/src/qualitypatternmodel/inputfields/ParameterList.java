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
 *   <li>{@link qualitypatternmodel.inputfields.ParameterList#getParameters <em>Parameters</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.ParameterList#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getParameterList()
 * @model
 * @generated
 */
public interface ParameterList extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.inputfields.Parameter}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.inputfields.Parameter#getParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getParameterList_Parameters()
	 * @see qualitypatternmodel.inputfields.Parameter#getParameterList
	 * @model opposite="parameterList" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Pattern#getParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' container reference.
	 * @see #setPattern(Pattern)
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getParameterList_Pattern()
	 * @see qualitypatternmodel.patternstructure.Pattern#getParameterList
	 * @model opposite="parameterList" required="true" transient="false"
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.inputfields.ParameterList#getPattern <em>Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' container reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void add(Parameter Input);

} // VariableList

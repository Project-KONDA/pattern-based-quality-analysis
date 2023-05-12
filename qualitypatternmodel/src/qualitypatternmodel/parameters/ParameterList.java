/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter List</b></em>'.
 * The container for all <code>Parameters</code> in a <code>CompletePattern</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.ParameterList#getParameters <em>Parameters</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.ParameterList#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getParameterList()
 * @model
 * @generated
 */
public interface ParameterList extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.parameters.Parameter}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.Parameter#getParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getParameterList_Parameters()
	 * @see qualitypatternmodel.parameters.Parameter#getParameterList
	 * @model opposite="parameterList" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CompletePattern#getParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' container reference.
	 * @see #setPattern(CompletePattern)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getParameterList_Pattern()
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getParameterList
	 * @model opposite="parameterList" required="true" transient="false"
	 * @generated
	 */
	CompletePattern getPattern();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.ParameterList#getPattern <em>Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' container reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(CompletePattern value);

	/**
	 * <!-- begin-user-doc -->
	 * Adds <code>parameter</code> if it is not contained yet and is not null.
	 * 
	 * @param parameter the <code>Parameter</code> to be added
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void add(Parameter parameter);

	/**
	 * <!-- begin-user-doc -->
	 * Removes <code>parameter</code> if it is contained and not referenced by components of the <code>CompletePattern</code>.
	 * 
	 * @param parameter the <code>Parameter</code> to be removed
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void remove(Parameter parameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Parameter> validateAgainstSchema();

	void printCodeToConsole();

} // ParameterList

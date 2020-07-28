/**
 */
package qualitypatternmodel.parameters;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.Parameter#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.Parameter#getDescription <em>Description</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.Parameter#isIsPredefined <em>Is Predefined</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getParameter()
 * @model abstract="true"
 * @generated
 */
public interface Parameter extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Parameter List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.ParameterList#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter List</em>' container reference.
	 * @see #setParameterList(ParameterList)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getParameter_ParameterList()
	 * @see qualitypatternmodel.parameters.ParameterList#getParameters
	 * @model opposite="parameters" required="true" transient="false"
	 * @generated
	 */
	ParameterList getParameterList();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.Parameter#getParameterList <em>Parameter List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter List</em>' container reference.
	 * @see #getParameterList()
	 * @generated
	 */
	void setParameterList(ParameterList value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getParameter_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.Parameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Predefined</em>' attribute.
	 * @see #setIsPredefined(boolean)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getParameter_IsPredefined()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPredefined();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.Parameter#isIsPredefined <em>Is Predefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Predefined</em>' attribute.
	 * @see #isIsPredefined()
	 * @generated
	 */
	void setIsPredefined(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean inputIsValid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isUsed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String generateDescription();

} // Input

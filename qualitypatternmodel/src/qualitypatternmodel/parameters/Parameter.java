/**
 */
package qualitypatternmodel.parameters;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.textrepresentation.ParameterReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * A parameter of a <code>CompletePattern</code>.
 * Its value is not further specified in generic and abstract patterns, but in concrete patterns.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.Parameter#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.Parameter#getDescription <em>Description</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.Parameter#isPredefined <em>Predefined</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.Parameter#getParameterReferences <em>Parameter References</em>}</li>
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
	 * Returns the value of the '<em><b>Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined</em>' attribute.
	 * @see #setPredefined(boolean)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getParameter_Predefined()
	 * @model required="true"
	 * @generated
	 */
	boolean isPredefined();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.Parameter#isPredefined <em>Predefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined</em>' attribute.
	 * @see #isPredefined()
	 * @generated
	 */
	void setPredefined(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameter References</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.textrepresentation.ParameterReference}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.textrepresentation.ParameterReference#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter References</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getParameter_ParameterReferences()
	 * @see qualitypatternmodel.textrepresentation.ParameterReference#getParameter
	 * @model opposite="parameter"
	 * @generated
	 */
	EList<ParameterReference> getParameterReferences();

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if the parameter value is valid.
	 * 
	 * @return true if the parameter value is valid
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean inputIsValid();

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if <code>this</code> is valid.
	 * 
	 * @return true if <code>this</code> is valid
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if <code>this</code> is referenced somewhere within the pattern.
	 * 
	 * @return true if <code>this</code> is referenced somewhere within the pattern
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isUsed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getValueAsString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValueFromString(String value) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getOptionsAsStringList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Parameter> validateAgainstSchema();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void checkComparisonConsistency() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void validateExampleValue(String val) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a simple textual description for <code>this</code>.
	 * 
	 * @return a simple textual description for <code>this</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String generateDescription();

} // Input

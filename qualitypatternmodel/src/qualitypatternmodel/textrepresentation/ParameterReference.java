/**
 */
package qualitypatternmodel.textrepresentation;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.parameters.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.textrepresentation.ParameterReference#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getParameterReference()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ParameterReference extends EObject {

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.Parameter#getParameterFragments <em>Parameter Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getParameterReference_Parameter()
	 * @see qualitypatternmodel.parameters.Parameter#getParameterFragments
	 * @model opposite="parameterFragments"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.textrepresentation.ParameterReference#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);
} // ParameterReference

/**
 */
package qualitypatternmodel.textrepresentation;

import org.eclipse.emf.common.util.EList;
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
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.parameters.Parameter}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.Parameter#getParameterReferences <em>Parameter References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getParameterReference_Parameter()
	 * @see qualitypatternmodel.parameters.Parameter#getParameterReferences
	 * @model opposite="parameterReferences" required="true"
	 * @generated
	 */
	EList<Parameter> getParameter();
} // ParameterReference

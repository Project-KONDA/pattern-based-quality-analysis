/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text List</b></em>'.
 * Defines input parameter of type List<String>.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getTextListParam()
 * @model
 * @generated
 */
public interface TextListParam extends ListParam {

	void setValueIfValid(EList<String> newValue) throws InvalidityException;
} // TextList

/**
 */
package qualitypatternmodel.parameters;

import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unknown Input Value</b></em>'.
 * Used to describe an abstract Type of Parameter to be specified during the concretisation.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getUntypedParameterValue()
 * @model
 * @generated
 */
public interface UntypedParameterValue extends ParameterValue {

	/**
	 * <!-- begin-user-doc --> 
	 * Replaces <code>this</code> with a new <code>TextLiteralParam</code> with value <code>val</code>.
	 * 
	 * @param val the value of the new <code>TextLiteralParam</code> that replaces <code>this</code>
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValue(String val) throws InvalidityException;
} // UnknownInputValue

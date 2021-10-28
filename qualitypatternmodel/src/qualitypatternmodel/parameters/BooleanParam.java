/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.operators.Match;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean</b></em>'.
 * Defines input parameter of type Boolean.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.BooleanParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.BooleanParam#getMatches <em>Matches</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getBooleanParam()
 * @model
 * @generated
 */
public interface BooleanParam extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Boolean)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getBooleanParam_Value()
	 * @model default="true" required="true"
	 * @generated
	 */
	Boolean getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.BooleanParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.Match}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.Match#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getBooleanParam_Matches()
	 * @see qualitypatternmodel.operators.Match#getOption
	 * @model opposite="option"
	 * @generated
	 */
	EList<Match> getMatches();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValueIfValid(Boolean newValue) throws InvalidityException;

} // Boolean

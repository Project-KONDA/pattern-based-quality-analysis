/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract List Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.ListParam#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getListParam()
 * @model abstract="true"
 * @generated
 */
public interface ListParam extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getListParam_Values()
	 * @model default=""
	 * @generated
	 */
	EList<String> getValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper" newValueMany="true"
	 * @generated
	 */
	void setValueIfValid(EList<String> newValue) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getListVar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getListDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addStringValue(String value);

} // AbstractListParam

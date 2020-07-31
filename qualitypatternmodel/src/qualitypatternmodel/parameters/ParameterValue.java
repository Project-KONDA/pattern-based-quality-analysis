/**
 */
package qualitypatternmodel.parameters;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getParameterValue()
 * @model abstract="true"
 * @generated
 */
public interface ParameterValue extends Parameter, qualitypatternmodel.graphstructure.Comparable {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInTagComparison();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInAttributeComparison();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInDataComparison();
} // XSType

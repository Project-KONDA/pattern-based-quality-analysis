/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.parameters.ParametersPackage
 * @generated
 */
public interface ParametersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParametersFactory eINSTANCE = qualitypatternmodel.parameters.impl.ParametersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Comparison Option Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Option Param</em>'.
	 * @generated
	 */
	ComparisonOptionParam createComparisonOptionParam();

	/**
	 * Returns a new object of class '<em>Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter List</em>'.
	 * @generated
	 */
	ParameterList createParameterList();

	/**
	 * Returns a new object of class '<em>Boolean Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Param</em>'.
	 * @generated
	 */
	BooleanParam createBooleanParam();

	/**
	 * Returns a new object of class '<em>Text List Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text List Param</em>'.
	 * @generated
	 */
	TextListParam createTextListParam();

	/**
	 * Returns a new object of class '<em>Text Literal Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Literal Param</em>'.
	 * @generated
	 */
	TextLiteralParam createTextLiteralParam();

	/**
	 * Returns a new object of class '<em>Number Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Param</em>'.
	 * @generated
	 */
	NumberParam createNumberParam();

	/**
	 * Returns a new object of class '<em>Date Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Param</em>'.
	 * @generated
	 */
	DateParam createDateParam();

	/**
	 * Returns a new object of class '<em>Time Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Param</em>'.
	 * @generated
	 */
	TimeParam createTimeParam();

	/**
	 * Returns a new object of class '<em>Untyped Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Untyped Parameter Value</em>'.
	 * @generated
	 */
	UntypedParameterValue createUntypedParameterValue();

	/**
	 * Returns a new object of class '<em>Date Time Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Param</em>'.
	 * @generated
	 */
	DateTimeParam createDateTimeParam();

	/**
	 * Returns a new object of class '<em>Type Option Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Option Param</em>'.
	 * @generated
	 */
	TypeOptionParam createTypeOptionParam();

	/**
	 * Returns a new object of class '<em>Key Value Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value Param</em>'.
	 * @generated
	 */
	KeyValueParam createKeyValueParam();

	/**
	 * Returns a new object of class '<em>Multi List Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi List Param</em>'.
	 * @generated
	 */
	MultiListParam createMultiListParam();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ParametersPackage getParametersPackage();

} //InputfieldsFactory

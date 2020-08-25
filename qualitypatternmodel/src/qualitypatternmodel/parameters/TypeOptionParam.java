/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.graphstructure.ReturnType;

import qualitypatternmodel.operators.Comparison;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Option Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.TypeOptionParam#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.TypeOptionParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.TypeOptionParam#getTypeComparisons <em>Type Comparisons</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getTypeOptionParam()
 * @model
 * @generated
 */
public interface TypeOptionParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.ReturnType}.
	 * The literals are from the enumeration {@link qualitypatternmodel.graphstructure.ReturnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.graphstructure.ReturnType
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTypeOptionParam_Options()
	 * @model
	 * @generated
	 */
	EList<ReturnType> getOptions();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.graphstructure.ReturnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.ReturnType
	 * @see #setValue(ReturnType)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTypeOptionParam_Value()
	 * @model required="true"
	 * @generated
	 */
	ReturnType getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.TypeOptionParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.ReturnType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ReturnType value);

	/**
	 * Returns the value of the '<em><b>Type Comparisons</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.Comparison}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.Comparison#getTypeOption <em>Type Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Comparisons</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTypeOptionParam_TypeComparisons()
	 * @see qualitypatternmodel.operators.Comparison#getTypeOption
	 * @model opposite="typeOption"
	 * @generated
	 */
	EList<Comparison> getTypeComparisons();

} // TypeOptionParam

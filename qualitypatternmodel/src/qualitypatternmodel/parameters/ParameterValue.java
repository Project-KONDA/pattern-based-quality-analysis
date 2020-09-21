/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import qualitypatternmodel.adaptionxml.XmlElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XS Type</b></em>'.
 * Does define a variable input parameter in a Pattern.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.ParameterValue#isTypeModifiable <em>Type Modifiable</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getParameterValue()
 * @model abstract="true"
 * @generated
 */
public interface ParameterValue extends Parameter, qualitypatternmodel.graphstructure.Comparable {

	/**
	 * Returns the value of the '<em><b>Type Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Modifiable</em>' attribute.
	 * @see #setTypeModifiable(boolean)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getParameterValue_TypeModifiable()
	 * @model
	 * @generated
	 */
	boolean isTypeModifiable();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.ParameterValue#isTypeModifiable <em>Type Modifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Modifiable</em>' attribute.
	 * @see #isTypeModifiable()
	 * @generated
	 */
	void setTypeModifiable(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns true, if <code>this</code> is used in a comparison to an <code>XMLProperty</code> with type TAG.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInTagComparison();

	/**
	 * <!-- begin-user-doc -->
	 * Returns true, if <code>this</code> is used in a comparison to an <code>XMLProperty</code> with type ATTRIBUTE.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInAttributeComparison();

	/**
	 * <!-- begin-user-doc -->
	 * Returns true, if <code>this</code> is used in a comparison to an <code>XMLProperty</code> with type DATA.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInDataComparison();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	
	EMap<String, Integer> getElementTags();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="qualitypatternmodel.parameters.StringToIntEMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<String, Integer> getAttributeNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="qualitypatternmodel.parameters.StringToIntEMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<String, Integer> getDataValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="qualitypatternmodel.parameters.StringToIntEMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<String, Integer> getAttributeValues();

	/**
	 * <!-- begin-user-doc -->
	 * Returns an ordered List of suggested Values to help during the Pattern concretisation.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getSuggestions();

	/**
	 * <!-- begin-user-doc -->
	 * Replace current <code>ParameterValue</code> with another instance of <code>ParameterValue</code>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void replace(ParameterValue concreteValue);

	EList<String> inferElementTagSuggestions();

	EList<XmlElement> getTagComparisonElements();
} // XSType

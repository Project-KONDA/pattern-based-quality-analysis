/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value</b></em>'.
 * Defines a parameter that has a primitive data type.
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
	 * Returns true if <code>this</code> is compared to an <code>XmlProperty</code> of type TAG.
	 *
	 * @return true if <code>this</code> is compared to an <code>XmlProperty</code> of type TAG
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInTagComparison();

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if <code>this</code> is compared to an <code>XmlProperty</code> of type ATTRIBUTE.
	 *
	 * @return true if <code>this</code> is compared to an <code>XmlProperty</code> of type ATTRIBUTE
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInAttributeComparison();

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if <code>this</code> is is compared to an <code>XmlProperty</code> of type DATA.
	 *
	 * @return true if <code>this</code> is is compared to an <code>XmlProperty</code> of type DATA
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInDataComparison();

	/**
	 * <!-- begin-user-doc -->
	 * Returns all XML element tag names of the database that is associated with the pattern
	 * together with the number of times this tag name was already used in patterns for this database.
	 *
	 * @return a map of all XML element tag names of the database that is associated with the pattern
	 * together with the number of times this tag name was already used in patterns for this database
	 * <!-- end-user-doc -->
	 */

	EMap<String, Integer> getElementTags();

	/**
	 * <!-- begin-user-doc -->
	 * Returns all XML attribute names of the database that is associated with the pattern
	 * together with the number of times this attribute name was already used in patterns for this database.
	 *
	 * @return all XML attribute names of the database that is associated with the pattern
	 * together with the number of times this attribute name was already used in patterns for this database
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="qualitypatternmodel.parameters.StringToIntEMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<String, Integer> getAttributeNames();

	/**
	 * <!-- begin-user-doc -->
	 * Returns all XML element content values already used in patterns for this database
	 * together with the number of times this content values was already used in patterns for this database.
	 *
	 * @return all XML element content values already used in patterns for this database
	 * together with the number of times this content value was already used in patterns for this database
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="qualitypatternmodel.parameters.StringToIntEMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<String, Integer> getDataValues();

	/**
	 * <!-- begin-user-doc -->
	 * Returns all XML attribute values already used in patterns for this database
	 * together with the number of times this attribute value was already used in patterns for this database.
	 *
	 * @return all XML attribute values already used in patterns for this database
	 * together with the number of times this attribute value was already used in patterns for this database
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="qualitypatternmodel.parameters.StringToIntEMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<String, Integer> getAttributeValues();

	/**
	 * <!-- begin-user-doc -->
	 * Returns an ordered list of suggested values for <code>this</code> Parameter to help during the pattern concretization.
	 *
	 * @return an ordered list of suggested values for <code>this</code> Parameter
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getSuggestions();

	/**
	 * <!-- begin-user-doc -->
	 * Replaces <code>this</code> with <code>concreteValue</code> if the type of <code>this</code> is allowed to be modified.
	 *
	 * @param concreteValue the <code>ParameterValue</code> that <code>this</code> gets replaced by
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void replace(ParameterValue concreteValue) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper" valuesDataType="qualitypatternmodel.parameters.StringArray"
	 * @generated
	 */
	void replaceViaValue(String[] values, String type) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of XML element tags that are suggested for the value of <code>this</code>
	 * based on specified incoming or outgoing <code>XmlNavigations</code> from or to <code>XmlElements</code>
	 * with a specified tag name.
	 *
	 * @return a list of XML element tags that are suggested for the value of <code>this</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> inferSuggestions();
} // XSType

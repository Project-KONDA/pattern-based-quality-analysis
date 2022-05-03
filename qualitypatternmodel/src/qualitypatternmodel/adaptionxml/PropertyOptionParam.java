/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Option</b></em>'.
 * Defines input parameter of type <code>PropertyKind</code> to define an <code>XmlProperty</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.PropertyOptionParam#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.PropertyOptionParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.PropertyOptionParam#getPathParam <em>Path Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getPropertyOptionParam()
 * @model
 * @generated
 */
public interface PropertyOptionParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.PropertyKind}.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionxml.PropertyKind}.
	 * <!-- begin-user-doc -->
	 * Returns all allowed choices of type <code>PropertyKind</code>.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.adaptionxml.PropertyKind
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getPropertyOptionParam_Options()
	 * @model
	 * @generated
	 */
	EList<PropertyKind> getOptions();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionxml.PropertyKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.adaptionxml.PropertyKind
	 * @see #setValue(PropertyKind)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getPropertyOptionParam_Value()
	 * @model required="true"
	 * @generated
	 */
	PropertyKind getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.PropertyOptionParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.adaptionxml.PropertyKind
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PropertyKind value);

	/**
	 * Returns the value of the '<em><b>Path Param</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.PathParam#getPropertyOptionParam <em>Property Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Param</em>' container reference.
	 * @see #setPathParam(PathParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getPropertyOptionParam_PathParam()
	 * @see qualitypatternmodel.adaptionxml.PathParam#getPropertyOptionParam
	 * @model opposite="propertyOptionParam" required="true" transient="false"
	 * @generated
	 */
	PathParam getPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.PropertyOptionParam#getPathParam <em>Path Param</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Param</em>' container reference.
	 * @see #getPathParam()
	 * @generated
	 */
	void setPathParam(PathParam value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValueIfValid(PropertyKind newValue) throws InvalidityException;

} // PropertyOption

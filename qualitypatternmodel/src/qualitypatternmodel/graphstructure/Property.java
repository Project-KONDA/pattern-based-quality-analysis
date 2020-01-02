/**
 */
package qualitypatternmodel.graphstructure;

import qualitypatternmodel.inputfields.Option;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getElement <em>Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getLocation <em>Location</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getPropertyOptions <em>Property Options</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(Element)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_Element()
	 * @model required="true"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_AttributeName()
	 * @model default=""
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.graphstructure.PropertyLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.PropertyLocation
	 * @see #setLocation(PropertyLocation)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_Location()
	 * @model
	 * @generated
	 */
	PropertyLocation getLocation();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.PropertyLocation
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(PropertyLocation value);

	/**
	 * Returns the value of the '<em><b>Property Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Options</em>' containment reference.
	 * @see #setPropertyOptions(Option)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_PropertyOptions()
	 * @model containment="true"
	 * @generated
	 */
	Option<PropertyLocation> getPropertyOptions();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getPropertyOptions <em>Property Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Options</em>' containment reference.
	 * @see #getPropertyOptions()
	 * @generated
	 */
	void setPropertyOptions(Option<PropertyLocation> value);

} // Property

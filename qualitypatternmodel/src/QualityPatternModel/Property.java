/**
 */
package QualityPatternModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.Property#getElement <em>Element</em>}</li>
 *   <li>{@link QualityPatternModel.Property#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link QualityPatternModel.Property#getLocation <em>Location</em>}</li>
 *   <li>{@link QualityPatternModel.Property#getPropertyOptions <em>Property Options</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getProperty()
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
	 * @see QualityPatternModel.QualityPatternModelPackage#getProperty_Element()
	 * @model required="true"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Property#getElement <em>Element</em>}' reference.
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
	 * @see QualityPatternModel.QualityPatternModelPackage#getProperty_AttributeName()
	 * @model default=""
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Property#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link QualityPatternModel.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see QualityPatternModel.Location
	 * @see #setLocation(Location)
	 * @see QualityPatternModel.QualityPatternModelPackage#getProperty_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Property#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see QualityPatternModel.Location
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Property Options</b></em>' reference list.
	 * The list contents are of type {@link QualityPatternModel.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Options</em>' reference list.
	 * @see QualityPatternModel.QualityPatternModelPackage#getProperty_PropertyOptions()
	 * @model
	 * @generated
	 */
	EList<Option> getPropertyOptions();

} // Property

/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.functions.Match;
import qualitypatternmodel.inputfields.PropertyOption;
import qualitypatternmodel.inputfields.TextLiteral;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getPropertyOption <em>Property Option</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getElement <em>Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends qualitypatternmodel.graphstructure.Comparable, PatternElement {
	/**
	 * Returns the value of the '<em><b>Property Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Option</em>' reference.
	 * @see #setPropertyOption(PropertyOption)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_PropertyOption()
	 * @model required="true"
	 * @generated
	 */
	PropertyOption getPropertyOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getPropertyOption <em>Property Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Option</em>' reference.
	 * @see #getPropertyOption()
	 * @generated
	 */
	void setPropertyOption(PropertyOption value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Element#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' container reference.
	 * @see #setElement(Element)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_Element()
	 * @see qualitypatternmodel.graphstructure.Element#getProperties
	 * @model opposite="properties" required="true" transient="false"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getElement <em>Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' container reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' reference.
	 * @see #setAttributeName(TextLiteral)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_AttributeName()
	 * @model required="true"
	 * @generated
	 */
	TextLiteral getAttributeName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getAttributeName <em>Attribute Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' reference.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(TextLiteral value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.functions.Match}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.Match#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_Match()
	 * @see qualitypatternmodel.functions.Match#getProperty
	 * @model opposite="property"
	 * @generated
	 */
	EList<Match> getMatch();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createInputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeInputsFromVariableList();

} // Property

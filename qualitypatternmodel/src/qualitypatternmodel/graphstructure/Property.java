/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.functions.Match;
import qualitypatternmodel.functions.ReferenceOperator;
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
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getElement <em>Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getMatch <em>Match</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getReferenceOperator2 <em>Reference Operator2</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getReferenceOperator <em>Reference Operator</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends qualitypatternmodel.graphstructure.Comparable, PatternElement {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.inputfields.PropertyOption#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(PropertyOption)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_Option()
	 * @see qualitypatternmodel.inputfields.PropertyOption#getProperty
	 * @model opposite="property" required="true"
	 * @generated
	 */
	PropertyOption getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(PropertyOption value);

	/**
	 * Returns the value of the '<em><b>Reference Operator2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.ReferenceOperator#getProperty2 <em>Property2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Operator2</em>' reference.
	 * @see #setReferenceOperator2(ReferenceOperator)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_ReferenceOperator2()
	 * @see qualitypatternmodel.functions.ReferenceOperator#getProperty2
	 * @model opposite="property2"
	 * @generated
	 */
	ReferenceOperator getReferenceOperator2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getReferenceOperator2 <em>Reference Operator2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Operator2</em>' reference.
	 * @see #getReferenceOperator2()
	 * @generated
	 */
	void setReferenceOperator2(ReferenceOperator value);

	/**
	 * Returns the value of the '<em><b>Reference Operator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.ReferenceOperator#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Operator</em>' reference.
	 * @see #setReferenceOperator(ReferenceOperator)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_ReferenceOperator()
	 * @see qualitypatternmodel.functions.ReferenceOperator#getProperty
	 * @model opposite="property"
	 * @generated
	 */
	ReferenceOperator getReferenceOperator();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getReferenceOperator <em>Reference Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Operator</em>' reference.
	 * @see #getReferenceOperator()
	 * @generated
	 */
	void setReferenceOperator(ReferenceOperator value);

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
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.inputfields.TextLiteral#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' reference.
	 * @see #setAttributeName(TextLiteral)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_AttributeName()
	 * @see qualitypatternmodel.inputfields.TextLiteral#getProperty
	 * @model opposite="property" required="true"
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

	void reset();

} // Property

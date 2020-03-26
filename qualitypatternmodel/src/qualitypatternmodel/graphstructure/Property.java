/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.functions.Match;
import qualitypatternmodel.functions.ReferenceOperator;
import qualitypatternmodel.parameters.OptionParam;
import qualitypatternmodel.parameters.PropertyOptionParam;
import qualitypatternmodel.parameters.TextLiteralParam;
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
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getReferenceOperator1 <em>Reference Operator1</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getOptionParam <em>Option Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends qualitypatternmodel.graphstructure.Comparable, PatternElement {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.PropertyOptionParam#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(PropertyOptionParam)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_Option()
	 * @see qualitypatternmodel.parameters.PropertyOptionParam#getProperties
	 * @model opposite="properties" required="true"
	 * @generated
	 */
	PropertyOptionParam getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(PropertyOptionParam value);

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
	 * Returns the value of the '<em><b>Reference Operator1</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.ReferenceOperator#getProperty1 <em>Property1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Operator1</em>' reference.
	 * @see #setReferenceOperator1(ReferenceOperator)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_ReferenceOperator1()
	 * @see qualitypatternmodel.functions.ReferenceOperator#getProperty1
	 * @model opposite="property1"
	 * @generated
	 */
	ReferenceOperator getReferenceOperator1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getReferenceOperator1 <em>Reference Operator1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Operator1</em>' reference.
	 * @see #getReferenceOperator1()
	 * @generated
	 */
	void setReferenceOperator1(ReferenceOperator value);

	/**
	 * Returns the value of the '<em><b>Option Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.OptionParam#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Param</em>' reference.
	 * @see #setOptionParam(OptionParam)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_OptionParam()
	 * @see qualitypatternmodel.parameters.OptionParam#getProperty
	 * @model opposite="property" required="true"
	 * @generated
	 */
	OptionParam<PropertyLocation> getOptionParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getOptionParam <em>Option Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Param</em>' reference.
	 * @see #getOptionParam()
	 * @generated
	 */
	void setOptionParam(OptionParam<PropertyLocation> value);

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
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.TextLiteralParam#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' reference.
	 * @see #setAttributeName(TextLiteralParam)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_AttributeName()
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getProperties
	 * @model opposite="properties" required="true"
	 * @generated
	 */
	TextLiteralParam getAttributeName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getAttributeName <em>Attribute Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' reference.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(TextLiteralParam value);

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

	void reset();

} // Property

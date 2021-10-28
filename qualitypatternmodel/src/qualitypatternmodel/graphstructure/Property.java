/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * The representation of primitive data values contained in data units (represented by <code>Elements</code>).
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getElement <em>Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getMatch <em>Match</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends qualitypatternmodel.graphstructure.Comparable, PatternElement, Adaptable {
	/**
	 * <!-- begin-user-doc -->
	 * Returns a copy of <code>this</code> that references the same <code>Parameters</code> as <code>this</code>.
	 * 
	 * @return the copy of <code>this</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Property copy();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new <code>Comparison</code> that has <code>this</code> as an argument and
	 * is added to the <code>predicates</code> of <code>element</code>.
	 * 
	 * @return the new <code>Comparison</code> that has <code>this</code> as an argument
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Comparison addComparison();

	/**
	 * <!-- begin-user-doc -->
	 * Returns <code>true</code> if <code>this</code> serves as an argument of a <code>Operator</code>.
	 * 
	 * @return <code>true</code> if <code>this</code> serves as an argument of a <code>Operator</code>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isOperatorArgument();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void checkComparisonConsistency(ParameterValue parameterValue) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void checkComparisonConsistency(Comparison comp) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Property> getEquivalentProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void checkComparisonConsistency() throws InvalidityException;

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
	 * Returns the value of the '<em><b>Match</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.Match}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.Match#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_Match()
	 * @see qualitypatternmodel.operators.Match#getProperty
	 * @model opposite="property"
	 * @generated
	 */
	EList<Match> getMatch();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Property

/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.graphstructure.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Element Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.ElementMapping#getFrom <em>From</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.ElementMapping#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getElementMapping()
 * @model
 * @generated
 */
public interface ElementMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Element#getMappingTo <em>Mapping To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Element)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getElementMapping_From()
	 * @see qualitypatternmodel.graphstructure.Element#getMappingTo
	 * @model opposite="mappingTo" required="true"
	 * @generated
	 */
	Element getFrom();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.ElementMapping#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Element value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Element#getMappingFrom <em>Mapping From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Element)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getElementMapping_To()
	 * @see qualitypatternmodel.graphstructure.Element#getMappingFrom
	 * @model opposite="mappingFrom" required="true"
	 * @generated
	 */
	Element getTo();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.ElementMapping#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Element value);

} // SingleElementMapping

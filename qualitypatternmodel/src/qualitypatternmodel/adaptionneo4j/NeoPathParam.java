/**
 */
package qualitypatternmodel.adaptionneo4j;

import qualitypatternmodel.exceptions.InvalidityException;

import qualitypatternmodel.graphstructure.Adaptable;

import qualitypatternmodel.parameters.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Abstract Path Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoPathParam#getNeoPathPart <em>Neo Path Part</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPathParam()
 * @model abstract="true"
 * @generated
 */
public interface NeoPathParam extends Parameter, Adaptable {
	/**
	 * Returns the value of the '<em><b>Neo Path Part</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoPathParam <em>Neo Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Path Part</em>' containment reference.
	 * @see #setNeoPathPart(NeoPathPart)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPathParam_NeoPathPart()
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoPathParam
	 * @model opposite="neoPathParam" containment="true"
	 * @generated
	 */
	NeoPathPart getNeoPathPart();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoPathParam#getNeoPathPart <em>Neo Path Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Path Part</em>' containment reference.
	 * @see #getNeoPathPart()
	 * @generated
	 */
	void setNeoPathPart(NeoPathPart value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getReturnInnerEdgeNodes() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getCypherReturnVariable() throws InvalidityException;

} // NeoAbstractPathParam
